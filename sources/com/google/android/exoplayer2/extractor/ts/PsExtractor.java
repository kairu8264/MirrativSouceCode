package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes3.dex */
public final class PsExtractor implements Extractor {
    public static final int AUDIO_STREAM = 192;
    public static final int AUDIO_STREAM_MASK = 224;
    public static final ExtractorsFactory FACTORY = d.f26863a;
    private static final long MAX_SEARCH_LENGTH = 1048576;
    private static final long MAX_SEARCH_LENGTH_AFTER_AUDIO_AND_VIDEO_FOUND = 8192;
    private static final int MAX_STREAM_ID_PLUS_ONE = 256;
    public static final int MPEG_PROGRAM_END_CODE = 441;
    public static final int PACKET_START_CODE_PREFIX = 1;
    public static final int PACK_START_CODE = 442;
    public static final int PRIVATE_STREAM_1 = 189;
    public static final int SYSTEM_HEADER_START_CODE = 443;
    public static final int VIDEO_STREAM = 224;
    public static final int VIDEO_STREAM_MASK = 240;
    private final PsDurationReader durationReader;
    private boolean foundAllTracks;
    private boolean foundAudioTrack;
    private boolean foundVideoTrack;
    private boolean hasOutputSeekMap;
    private long lastTrackPosition;
    private ExtractorOutput output;
    private PsBinarySearchSeeker psBinarySearchSeeker;
    private final ParsableByteArray psPacketBuffer;
    private final SparseArray<PesReader> psPayloadReaders;
    private final TimestampAdjuster timestampAdjuster;

    /* loaded from: classes3.dex */
    public static final class PesReader {
        private static final int PES_SCRATCH_SIZE = 64;
        private boolean dtsFlag;
        private int extendedHeaderLength;
        private final ElementaryStreamReader pesPayloadReader;
        private final ParsableBitArray pesScratch = new ParsableBitArray(new byte[64]);
        private boolean ptsFlag;
        private boolean seenFirstDts;
        private long timeUs;
        private final TimestampAdjuster timestampAdjuster;

        public PesReader(ElementaryStreamReader elementaryStreamReader, TimestampAdjuster timestampAdjuster) {
            this.pesPayloadReader = elementaryStreamReader;
            this.timestampAdjuster = timestampAdjuster;
        }

        private void parseHeader() {
            this.pesScratch.skipBits(8);
            this.ptsFlag = this.pesScratch.readBit();
            this.dtsFlag = this.pesScratch.readBit();
            this.pesScratch.skipBits(6);
            this.extendedHeaderLength = this.pesScratch.readBits(8);
        }

        private void parseHeaderExtension() {
            this.timeUs = 0L;
            if (this.ptsFlag) {
                this.pesScratch.skipBits(4);
                this.pesScratch.skipBits(1);
                this.pesScratch.skipBits(1);
                long readBits = (this.pesScratch.readBits(3) << 30) | (this.pesScratch.readBits(15) << 15) | this.pesScratch.readBits(15);
                this.pesScratch.skipBits(1);
                if (!this.seenFirstDts && this.dtsFlag) {
                    this.pesScratch.skipBits(4);
                    this.pesScratch.skipBits(1);
                    this.pesScratch.skipBits(1);
                    this.pesScratch.skipBits(1);
                    this.timestampAdjuster.adjustTsTimestamp((this.pesScratch.readBits(3) << 30) | (this.pesScratch.readBits(15) << 15) | this.pesScratch.readBits(15));
                    this.seenFirstDts = true;
                }
                this.timeUs = this.timestampAdjuster.adjustTsTimestamp(readBits);
            }
        }

        public void consume(ParsableByteArray parsableByteArray) throws ParserException {
            parsableByteArray.readBytes(this.pesScratch.data, 0, 3);
            this.pesScratch.setPosition(0);
            parseHeader();
            parsableByteArray.readBytes(this.pesScratch.data, 0, this.extendedHeaderLength);
            this.pesScratch.setPosition(0);
            parseHeaderExtension();
            this.pesPayloadReader.packetStarted(this.timeUs, 4);
            this.pesPayloadReader.consume(parsableByteArray);
            this.pesPayloadReader.packetFinished();
        }

        public void seek() {
            this.seenFirstDts = false;
            this.pesPayloadReader.seek();
        }
    }

    public PsExtractor() {
        this(new TimestampAdjuster(0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new PsExtractor()};
    }

    @RequiresNonNull({"output"})
    private void maybeOutputSeekMap(long j10) {
        if (this.hasOutputSeekMap) {
            return;
        }
        this.hasOutputSeekMap = true;
        if (this.durationReader.getDurationUs() != C.TIME_UNSET) {
            PsBinarySearchSeeker psBinarySearchSeeker = new PsBinarySearchSeeker(this.durationReader.getScrTimestampAdjuster(), this.durationReader.getDurationUs(), j10);
            this.psBinarySearchSeeker = psBinarySearchSeeker;
            this.output.seekMap(psBinarySearchSeeker.getSeekMap());
            return;
        }
        this.output.seekMap(new SeekMap.Unseekable(this.durationReader.getDurationUs()));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        Assertions.checkStateNotNull(this.output);
        long length = extractorInput.getLength();
        int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if ((i10 != 0) && !this.durationReader.isDurationReadFinished()) {
            return this.durationReader.readDuration(extractorInput, positionHolder);
        }
        maybeOutputSeekMap(length);
        PsBinarySearchSeeker psBinarySearchSeeker = this.psBinarySearchSeeker;
        if (psBinarySearchSeeker != null && psBinarySearchSeeker.isSeeking()) {
            return this.psBinarySearchSeeker.handlePendingSeek(extractorInput, positionHolder);
        }
        extractorInput.resetPeekPosition();
        long peekPosition = i10 != 0 ? length - extractorInput.getPeekPosition() : -1L;
        if ((peekPosition == -1 || peekPosition >= 4) && extractorInput.peekFully(this.psPacketBuffer.getData(), 0, 4, true)) {
            this.psPacketBuffer.setPosition(0);
            int readInt = this.psPacketBuffer.readInt();
            if (readInt == 441) {
                return -1;
            }
            if (readInt == 442) {
                extractorInput.peekFully(this.psPacketBuffer.getData(), 0, 10);
                this.psPacketBuffer.setPosition(9);
                extractorInput.skipFully((this.psPacketBuffer.readUnsignedByte() & 7) + 14);
                return 0;
            } else if (readInt == 443) {
                extractorInput.peekFully(this.psPacketBuffer.getData(), 0, 2);
                this.psPacketBuffer.setPosition(0);
                extractorInput.skipFully(this.psPacketBuffer.readUnsignedShort() + 6);
                return 0;
            } else if (((readInt & (-256)) >> 8) != 1) {
                extractorInput.skipFully(1);
                return 0;
            } else {
                int i11 = readInt & 255;
                PesReader pesReader = this.psPayloadReaders.get(i11);
                if (!this.foundAllTracks) {
                    if (pesReader == null) {
                        ElementaryStreamReader elementaryStreamReader = null;
                        if (i11 == 189) {
                            elementaryStreamReader = new Ac3Reader();
                            this.foundAudioTrack = true;
                            this.lastTrackPosition = extractorInput.getPosition();
                        } else if ((i11 & 224) == 192) {
                            elementaryStreamReader = new MpegAudioReader();
                            this.foundAudioTrack = true;
                            this.lastTrackPosition = extractorInput.getPosition();
                        } else if ((i11 & VIDEO_STREAM_MASK) == 224) {
                            elementaryStreamReader = new H262Reader();
                            this.foundVideoTrack = true;
                            this.lastTrackPosition = extractorInput.getPosition();
                        }
                        if (elementaryStreamReader != null) {
                            elementaryStreamReader.createTracks(this.output, new TsPayloadReader.TrackIdGenerator(i11, 256));
                            pesReader = new PesReader(elementaryStreamReader, this.timestampAdjuster);
                            this.psPayloadReaders.put(i11, pesReader);
                        }
                    }
                    if (extractorInput.getPosition() > ((this.foundAudioTrack && this.foundVideoTrack) ? this.lastTrackPosition + 8192 : 1048576L)) {
                        this.foundAllTracks = true;
                        this.output.endTracks();
                    }
                }
                extractorInput.peekFully(this.psPacketBuffer.getData(), 0, 2);
                this.psPacketBuffer.setPosition(0);
                int readUnsignedShort = this.psPacketBuffer.readUnsignedShort() + 6;
                if (pesReader == null) {
                    extractorInput.skipFully(readUnsignedShort);
                } else {
                    this.psPacketBuffer.reset(readUnsignedShort);
                    extractorInput.readFully(this.psPacketBuffer.getData(), 0, readUnsignedShort);
                    this.psPacketBuffer.setPosition(6);
                    pesReader.consume(this.psPacketBuffer);
                    ParsableByteArray parsableByteArray = this.psPacketBuffer;
                    parsableByteArray.setLimit(parsableByteArray.capacity());
                }
                return 0;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j10, long j11) {
        if ((this.timestampAdjuster.getTimestampOffsetUs() == C.TIME_UNSET) || (this.timestampAdjuster.getFirstSampleTimestampUs() != 0 && this.timestampAdjuster.getFirstSampleTimestampUs() != j11)) {
            this.timestampAdjuster.reset(j11);
        }
        PsBinarySearchSeeker psBinarySearchSeeker = this.psBinarySearchSeeker;
        if (psBinarySearchSeeker != null) {
            psBinarySearchSeeker.setSeekTargetUs(j11);
        }
        for (int i10 = 0; i10 < this.psPayloadReaders.size(); i10++) {
            this.psPayloadReaders.valueAt(i10).seek();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        byte[] bArr = new byte[14];
        extractorInput.peekFully(bArr, 0, 14);
        if (442 == (((bArr[0] & TagConstant.TAG_CAT_RESERVED) << 24) | ((bArr[1] & TagConstant.TAG_CAT_RESERVED) << 16) | ((bArr[2] & TagConstant.TAG_CAT_RESERVED) << 8) | (bArr[3] & TagConstant.TAG_CAT_RESERVED)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            extractorInput.advancePeekPosition(bArr[13] & 7);
            extractorInput.peekFully(bArr, 0, 3);
            return 1 == ((((bArr[0] & TagConstant.TAG_CAT_RESERVED) << 16) | ((bArr[1] & TagConstant.TAG_CAT_RESERVED) << 8)) | (bArr[2] & TagConstant.TAG_CAT_RESERVED));
        }
        return false;
    }

    public PsExtractor(TimestampAdjuster timestampAdjuster) {
        this.timestampAdjuster = timestampAdjuster;
        this.psPacketBuffer = new ParsableByteArray(4096);
        this.psPayloadReaders = new SparseArray<>();
        this.durationReader = new PsDurationReader();
    }
}
