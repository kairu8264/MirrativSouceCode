package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class H263Reader implements ElementaryStreamReader {
    private static final float[] PIXEL_WIDTH_HEIGHT_RATIO_BY_ASPECT_RATIO_INFO = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private static final int START_CODE_VALUE_GROUP_OF_VOP = 179;
    private static final int START_CODE_VALUE_MAX_VIDEO_OBJECT = 31;
    private static final int START_CODE_VALUE_UNSET = -1;
    private static final int START_CODE_VALUE_USER_DATA = 178;
    private static final int START_CODE_VALUE_VISUAL_OBJECT = 181;
    private static final int START_CODE_VALUE_VISUAL_OBJECT_SEQUENCE = 176;
    private static final int START_CODE_VALUE_VOP = 182;
    private static final String TAG = "H263Reader";
    private static final int VIDEO_OBJECT_LAYER_SHAPE_RECTANGULAR = 0;
    private final CsdBuffer csdBuffer;
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private final boolean[] prefixFlags;
    private SampleReader sampleReader;
    private long totalBytesWritten;
    private final NalUnitTargetBuffer userData;
    private final ParsableByteArray userDataParsable;
    private final UserDataReader userDataReader;

    /* loaded from: classes3.dex */
    public static final class CsdBuffer {
        private static final byte[] START_CODE = {0, 0, 1};
        private static final int STATE_EXPECT_VIDEO_OBJECT_LAYER_START = 3;
        private static final int STATE_EXPECT_VIDEO_OBJECT_START = 2;
        private static final int STATE_EXPECT_VISUAL_OBJECT_START = 1;
        private static final int STATE_SKIP_TO_VISUAL_OBJECT_SEQUENCE_START = 0;
        private static final int STATE_WAIT_FOR_VOP_START = 4;
        public byte[] data;
        private boolean isFilling;
        public int length;
        private int state;
        public int volStartPosition;

        public CsdBuffer(int i10) {
            this.data = new byte[i10];
        }

        public void onData(byte[] bArr, int i10, int i11) {
            if (this.isFilling) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.data;
                int length = bArr2.length;
                int i13 = this.length;
                if (length < i13 + i12) {
                    this.data = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.data, this.length, i12);
                this.length += i12;
            }
        }

        public boolean onStartCode(int i10, int i11) {
            int i12 = this.state;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == H263Reader.START_CODE_VALUE_GROUP_OF_VOP || i10 == H263Reader.START_CODE_VALUE_VISUAL_OBJECT) {
                                this.length -= i11;
                                this.isFilling = false;
                                return true;
                            }
                        } else if ((i10 & PsExtractor.VIDEO_STREAM_MASK) != 32) {
                            Log.w(H263Reader.TAG, "Unexpected start code value");
                            reset();
                        } else {
                            this.volStartPosition = this.length;
                            this.state = 4;
                        }
                    } else if (i10 > 31) {
                        Log.w(H263Reader.TAG, "Unexpected start code value");
                        reset();
                    } else {
                        this.state = 3;
                    }
                } else if (i10 != H263Reader.START_CODE_VALUE_VISUAL_OBJECT) {
                    Log.w(H263Reader.TAG, "Unexpected start code value");
                    reset();
                } else {
                    this.state = 2;
                }
            } else if (i10 == H263Reader.START_CODE_VALUE_VISUAL_OBJECT_SEQUENCE) {
                this.state = 1;
                this.isFilling = true;
            }
            byte[] bArr = START_CODE;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void reset() {
            this.isFilling = false;
            this.length = 0;
            this.state = 0;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SampleReader {
        private static final int OFFSET_VOP_CODING_TYPE = 1;
        private static final int VOP_CODING_TYPE_INTRA = 0;
        private boolean lookingForVopCodingType;
        private final TrackOutput output;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;
        private int startCodeValue;
        private int vopBytesRead;

        public SampleReader(TrackOutput trackOutput) {
            this.output = trackOutput;
        }

        public void onData(byte[] bArr, int i10, int i11) {
            if (this.lookingForVopCodingType) {
                int i12 = this.vopBytesRead;
                int i13 = (i10 + 1) - i12;
                if (i13 < i11) {
                    this.sampleIsKeyframe = ((bArr[i13] & 192) >> 6) == 0;
                    this.lookingForVopCodingType = false;
                    return;
                }
                this.vopBytesRead = i12 + (i11 - i10);
            }
        }

        public void onDataEnd(long j10, int i10, boolean z10) {
            if (this.startCodeValue == H263Reader.START_CODE_VALUE_VOP && z10 && this.readingSample) {
                boolean z11 = this.sampleIsKeyframe;
                this.output.sampleMetadata(this.sampleTimeUs, z11 ? 1 : 0, (int) (j10 - this.samplePosition), i10, null);
            }
            if (this.startCodeValue != H263Reader.START_CODE_VALUE_GROUP_OF_VOP) {
                this.samplePosition = j10;
            }
        }

        public void onStartCode(int i10, long j10) {
            this.startCodeValue = i10;
            this.sampleIsKeyframe = false;
            this.readingSample = i10 == H263Reader.START_CODE_VALUE_VOP || i10 == H263Reader.START_CODE_VALUE_GROUP_OF_VOP;
            this.lookingForVopCodingType = i10 == H263Reader.START_CODE_VALUE_VOP;
            this.vopBytesRead = 0;
            this.sampleTimeUs = j10;
        }

        public void reset() {
            this.readingSample = false;
            this.lookingForVopCodingType = false;
            this.sampleIsKeyframe = false;
            this.startCodeValue = -1;
        }
    }

    public H263Reader() {
        this(null);
    }

    private static Format parseCsdBuffer(CsdBuffer csdBuffer, int i10, String str) {
        byte[] copyOf = Arrays.copyOf(csdBuffer.data, csdBuffer.length);
        ParsableBitArray parsableBitArray = new ParsableBitArray(copyOf);
        parsableBitArray.skipBytes(i10);
        parsableBitArray.skipBytes(4);
        parsableBitArray.skipBit();
        parsableBitArray.skipBits(8);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(4);
            parsableBitArray.skipBits(3);
        }
        int readBits = parsableBitArray.readBits(4);
        float f10 = 1.0f;
        if (readBits == 15) {
            int readBits2 = parsableBitArray.readBits(8);
            int readBits3 = parsableBitArray.readBits(8);
            if (readBits3 == 0) {
                Log.w(TAG, "Invalid aspect ratio");
            } else {
                f10 = readBits2 / readBits3;
            }
        } else {
            float[] fArr = PIXEL_WIDTH_HEIGHT_RATIO_BY_ASPECT_RATIO_INFO;
            if (readBits < fArr.length) {
                f10 = fArr[readBits];
            } else {
                Log.w(TAG, "Invalid aspect ratio");
            }
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(2);
            parsableBitArray.skipBits(1);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(3);
                parsableBitArray.skipBits(11);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
            }
        }
        if (parsableBitArray.readBits(2) != 0) {
            Log.w(TAG, "Unhandled video object layer shape");
        }
        parsableBitArray.skipBit();
        int readBits4 = parsableBitArray.readBits(16);
        parsableBitArray.skipBit();
        if (parsableBitArray.readBit()) {
            if (readBits4 == 0) {
                Log.w(TAG, "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = readBits4 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                parsableBitArray.skipBits(i11);
            }
        }
        parsableBitArray.skipBit();
        int readBits5 = parsableBitArray.readBits(13);
        parsableBitArray.skipBit();
        int readBits6 = parsableBitArray.readBits(13);
        parsableBitArray.skipBit();
        parsableBitArray.skipBit();
        return new Format.Builder().setId(str).setSampleMimeType(MimeTypes.VIDEO_MP4V).setWidth(readBits5).setHeight(readBits6).setPixelWidthHeightRatio(f10).setInitializationData(Collections.singletonList(copyOf)).build();
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        Assertions.checkStateNotNull(this.sampleReader);
        Assertions.checkStateNotNull(this.output);
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int findNalUnit = NalUnitUtil.findNalUnit(data, position, limit, this.prefixFlags);
            if (findNalUnit == limit) {
                break;
            }
            int i10 = findNalUnit + 3;
            int i11 = parsableByteArray.getData()[i10] & TagConstant.TAG_CAT_RESERVED;
            int i12 = findNalUnit - position;
            int i13 = 0;
            if (!this.hasOutputFormat) {
                if (i12 > 0) {
                    this.csdBuffer.onData(data, position, findNalUnit);
                }
                if (this.csdBuffer.onStartCode(i11, i12 < 0 ? -i12 : 0)) {
                    TrackOutput trackOutput = this.output;
                    CsdBuffer csdBuffer = this.csdBuffer;
                    trackOutput.format(parseCsdBuffer(csdBuffer, csdBuffer.volStartPosition, (String) Assertions.checkNotNull(this.formatId)));
                    this.hasOutputFormat = true;
                }
            }
            this.sampleReader.onData(data, position, findNalUnit);
            NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
            if (nalUnitTargetBuffer != null) {
                if (i12 > 0) {
                    nalUnitTargetBuffer.appendToNalUnit(data, position, findNalUnit);
                } else {
                    i13 = -i12;
                }
                if (this.userData.endNalUnit(i13)) {
                    NalUnitTargetBuffer nalUnitTargetBuffer2 = this.userData;
                    ((ParsableByteArray) Util.castNonNull(this.userDataParsable)).reset(this.userData.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
                    ((UserDataReader) Util.castNonNull(this.userDataReader)).consume(this.pesTimeUs, this.userDataParsable);
                }
                if (i11 == START_CODE_VALUE_USER_DATA && parsableByteArray.getData()[findNalUnit + 2] == 1) {
                    this.userData.startNalUnit(i11);
                }
            }
            int i14 = limit - findNalUnit;
            this.sampleReader.onDataEnd(this.totalBytesWritten - i14, i14, this.hasOutputFormat);
            this.sampleReader.onStartCode(i11, this.pesTimeUs);
            position = i10;
        }
        if (!this.hasOutputFormat) {
            this.csdBuffer.onData(data, position, limit);
        }
        this.sampleReader.onData(data, position, limit);
        NalUnitTargetBuffer nalUnitTargetBuffer3 = this.userData;
        if (nalUnitTargetBuffer3 != null) {
            nalUnitTargetBuffer3.appendToNalUnit(data, position, limit);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.output = track;
        this.sampleReader = new SampleReader(track);
        UserDataReader userDataReader = this.userDataReader;
        if (userDataReader != null) {
            userDataReader.createTracks(extractorOutput, trackIdGenerator);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j10, int i10) {
        this.pesTimeUs = j10;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.reset();
        SampleReader sampleReader = this.sampleReader;
        if (sampleReader != null) {
            sampleReader.reset();
        }
        NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.reset();
        }
        this.totalBytesWritten = 0L;
    }

    public H263Reader(UserDataReader userDataReader) {
        this.userDataReader = userDataReader;
        this.prefixFlags = new boolean[4];
        this.csdBuffer = new CsdBuffer(128);
        if (userDataReader != null) {
            this.userData = new NalUnitTargetBuffer(START_CODE_VALUE_USER_DATA, 128);
            this.userDataParsable = new ParsableByteArray();
            return;
        }
        this.userData = null;
        this.userDataParsable = null;
    }
}