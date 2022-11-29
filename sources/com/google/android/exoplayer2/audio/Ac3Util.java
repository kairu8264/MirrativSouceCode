package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.mirrativ.llstream.encoder.AACEncoder;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class Ac3Util {
    public static final int AC3_MAX_RATE_BYTES_PER_SECOND = 80000;
    private static final int AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT = 1536;
    private static final int AUDIO_SAMPLES_PER_AUDIO_BLOCK = 256;
    public static final int E_AC3_MAX_RATE_BYTES_PER_SECOND = 768000;
    public static final int TRUEHD_MAX_RATE_BYTES_PER_SECOND = 3062500;
    public static final int TRUEHD_RECHUNK_SAMPLE_COUNT = 16;
    public static final int TRUEHD_SYNCFRAME_PREFIX_LENGTH = 10;
    private static final int[] BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD = {1, 2, 3, 6};
    private static final int[] SAMPLE_RATE_BY_FSCOD = {OpusUtil.SAMPLE_RATE, AACEncoder.SAMPLING_RATE, 32000};
    private static final int[] SAMPLE_RATE_BY_FSCOD2 = {24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] CHANNEL_COUNT_BY_ACMOD = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] BITRATE_BY_HALF_FRMSIZECOD = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1 = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* loaded from: classes3.dex */
    public static final class SyncFrameInfo {
        public static final int STREAM_TYPE_TYPE0 = 0;
        public static final int STREAM_TYPE_TYPE1 = 1;
        public static final int STREAM_TYPE_TYPE2 = 2;
        public static final int STREAM_TYPE_UNDEFINED = -1;
        public final int channelCount;
        public final int frameSize;
        public final String mimeType;
        public final int sampleCount;
        public final int sampleRate;
        public final int streamType;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface StreamType {
        }

        private SyncFrameInfo(String str, int i10, int i11, int i12, int i13, int i14) {
            this.mimeType = str;
            this.streamType = i10;
            this.channelCount = i11;
            this.sampleRate = i12;
            this.frameSize = i13;
            this.sampleCount = i14;
        }
    }

    private Ac3Util() {
    }

    public static int findTrueHdSyncframeOffset(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((Util.getBigEndianInt(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - position;
            }
        }
        return -1;
    }

    private static int getAc3SyncframeSize(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 >= 0) {
            int[] iArr = SAMPLE_RATE_BY_FSCOD;
            if (i10 >= iArr.length || i11 < 0) {
                return -1;
            }
            int[] iArr2 = SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1;
            if (i12 >= iArr2.length) {
                return -1;
            }
            int i13 = iArr[i10];
            if (i13 == 44100) {
                return (iArr2[i12] + (i11 % 2)) * 2;
            }
            int i14 = BITRATE_BY_HALF_FRMSIZECOD[i12];
            return i13 == 32000 ? i14 * 6 : i14 * 4;
        }
        return -1;
    }

    public static Format parseAc3AnnexFFormat(ParsableByteArray parsableByteArray, String str, String str2, DrmInitData drmInitData) {
        int i10 = SAMPLE_RATE_BY_FSCOD[(parsableByteArray.readUnsignedByte() & PsExtractor.AUDIO_STREAM) >> 6];
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i11 = CHANNEL_COUNT_BY_ACMOD[(readUnsignedByte & 56) >> 3];
        if ((readUnsignedByte & 4) != 0) {
            i11++;
        }
        return new Format.Builder().setId(str).setSampleMimeType(MimeTypes.AUDIO_AC3).setChannelCount(i11).setSampleRate(i10).setDrmInitData(drmInitData).setLanguage(str2).build();
    }

    public static int parseAc3SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT;
    }

    public static SyncFrameInfo parseAc3SyncframeInfo(ParsableBitArray parsableBitArray) {
        int ac3SyncframeSize;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int readBits;
        int i14;
        int i15;
        int i16;
        int i17;
        int position = parsableBitArray.getPosition();
        parsableBitArray.skipBits(40);
        boolean z10 = parsableBitArray.readBits(5) > 10;
        parsableBitArray.setPosition(position);
        int i18 = -1;
        if (z10) {
            parsableBitArray.skipBits(16);
            int readBits2 = parsableBitArray.readBits(2);
            if (readBits2 == 0) {
                i18 = 0;
            } else if (readBits2 == 1) {
                i18 = 1;
            } else if (readBits2 == 2) {
                i18 = 2;
            }
            parsableBitArray.skipBits(3);
            ac3SyncframeSize = (parsableBitArray.readBits(11) + 1) * 2;
            int readBits3 = parsableBitArray.readBits(2);
            if (readBits3 == 3) {
                i10 = SAMPLE_RATE_BY_FSCOD2[parsableBitArray.readBits(2)];
                i14 = 6;
                readBits = 3;
            } else {
                readBits = parsableBitArray.readBits(2);
                i14 = BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[readBits];
                i10 = SAMPLE_RATE_BY_FSCOD[readBits3];
            }
            i11 = i14 * 256;
            int readBits4 = parsableBitArray.readBits(3);
            boolean readBit = parsableBitArray.readBit();
            i12 = CHANNEL_COUNT_BY_ACMOD[readBits4] + (readBit ? 1 : 0);
            parsableBitArray.skipBits(10);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(8);
            }
            if (readBits4 == 0) {
                parsableBitArray.skipBits(5);
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
            }
            if (i18 == 1 && parsableBitArray.readBit()) {
                parsableBitArray.skipBits(16);
            }
            if (parsableBitArray.readBit()) {
                if (readBits4 > 2) {
                    parsableBitArray.skipBits(2);
                }
                if ((readBits4 & 1) == 0 || readBits4 <= 2) {
                    i16 = 6;
                } else {
                    i16 = 6;
                    parsableBitArray.skipBits(6);
                }
                if ((readBits4 & 4) != 0) {
                    parsableBitArray.skipBits(i16);
                }
                if (readBit && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(5);
                }
                if (i18 == 0) {
                    if (parsableBitArray.readBit()) {
                        i17 = 6;
                        parsableBitArray.skipBits(6);
                    } else {
                        i17 = 6;
                    }
                    if (readBits4 == 0 && parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(i17);
                    }
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(i17);
                    }
                    int readBits5 = parsableBitArray.readBits(2);
                    if (readBits5 == 1) {
                        parsableBitArray.skipBits(5);
                    } else if (readBits5 == 2) {
                        parsableBitArray.skipBits(12);
                    } else if (readBits5 == 3) {
                        int readBits6 = parsableBitArray.readBits(5);
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(5);
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(4);
                                }
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(4);
                                }
                            }
                        }
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(5);
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(7);
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(8);
                                }
                            }
                        }
                        parsableBitArray.skipBits((readBits6 + 2) * 8);
                        parsableBitArray.byteAlign();
                    }
                    if (readBits4 < 2) {
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(14);
                        }
                        if (readBits4 == 0 && parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(14);
                        }
                    }
                    if (parsableBitArray.readBit()) {
                        if (readBits == 0) {
                            parsableBitArray.skipBits(5);
                        } else {
                            for (int i19 = 0; i19 < i14; i19++) {
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(5);
                                }
                            }
                        }
                    }
                }
            }
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(5);
                if (readBits4 == 2) {
                    parsableBitArray.skipBits(4);
                }
                if (readBits4 >= 6) {
                    parsableBitArray.skipBits(2);
                }
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
                if (readBits4 == 0 && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
                if (readBits3 < 3) {
                    parsableBitArray.skipBit();
                }
            }
            if (i18 == 0 && readBits != 3) {
                parsableBitArray.skipBit();
            }
            if (i18 == 2 && (readBits == 3 || parsableBitArray.readBit())) {
                i15 = 6;
                parsableBitArray.skipBits(6);
            } else {
                i15 = 6;
            }
            str = (parsableBitArray.readBit() && parsableBitArray.readBits(i15) == 1 && parsableBitArray.readBits(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
            i13 = i18;
        } else {
            parsableBitArray.skipBits(32);
            int readBits7 = parsableBitArray.readBits(2);
            String str2 = readBits7 == 3 ? null : MimeTypes.AUDIO_AC3;
            ac3SyncframeSize = getAc3SyncframeSize(readBits7, parsableBitArray.readBits(6));
            parsableBitArray.skipBits(8);
            int readBits8 = parsableBitArray.readBits(3);
            if ((readBits8 & 1) != 0 && readBits8 != 1) {
                parsableBitArray.skipBits(2);
            }
            if ((readBits8 & 4) != 0) {
                parsableBitArray.skipBits(2);
            }
            if (readBits8 == 2) {
                parsableBitArray.skipBits(2);
            }
            int[] iArr = SAMPLE_RATE_BY_FSCOD;
            i10 = readBits7 < iArr.length ? iArr[readBits7] : -1;
            i11 = AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT;
            i12 = CHANNEL_COUNT_BY_ACMOD[readBits8] + (parsableBitArray.readBit() ? 1 : 0);
            i13 = -1;
            str = str2;
        }
        return new SyncFrameInfo(str, i13, i12, i10, ac3SyncframeSize, i11);
    }

    public static int parseAc3SyncframeSize(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & TagConstant.TAG_CAT_RESERVED) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        return getAc3SyncframeSize((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    public static Format parseEAc3AnnexFFormat(ParsableByteArray parsableByteArray, String str, String str2, DrmInitData drmInitData) {
        parsableByteArray.skipBytes(2);
        int i10 = SAMPLE_RATE_BY_FSCOD[(parsableByteArray.readUnsignedByte() & PsExtractor.AUDIO_STREAM) >> 6];
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i11 = CHANNEL_COUNT_BY_ACMOD[(readUnsignedByte & 14) >> 1];
        if ((readUnsignedByte & 1) != 0) {
            i11++;
        }
        if (((parsableByteArray.readUnsignedByte() & 30) >> 1) > 0 && (2 & parsableByteArray.readUnsignedByte()) != 0) {
            i11 += 2;
        }
        return new Format.Builder().setId(str).setSampleMimeType((parsableByteArray.bytesLeft() <= 0 || (parsableByteArray.readUnsignedByte() & 1) == 0) ? MimeTypes.AUDIO_E_AC3 : MimeTypes.AUDIO_E_AC3_JOC).setChannelCount(i11).setSampleRate(i10).setDrmInitData(drmInitData).setLanguage(str2).build();
    }

    public static int parseTrueHdSyncframeAudioSampleCount(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & TagConstant.TAG_CAT_RESERVED) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }

    public static int parseTrueHdSyncframeAudioSampleCount(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & TagConstant.TAG_CAT_RESERVED) == 187 ? 9 : 8)) >> 4) & 7);
    }
}
