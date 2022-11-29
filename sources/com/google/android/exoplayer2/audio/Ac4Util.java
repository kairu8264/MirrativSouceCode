package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.mirrativ.llstream.encoder.AACEncoder;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class Ac4Util {
    public static final int AC40_SYNCWORD = 44096;
    public static final int AC41_SYNCWORD = 44097;
    private static final int CHANNEL_COUNT_2 = 2;
    public static final int HEADER_SIZE_FOR_PARSER = 16;
    public static final int MAX_RATE_BYTES_PER_SECOND = 336000;
    private static final int[] SAMPLE_COUNT = {2002, 2000, 1920, 1601, 1600, AnalyticsListener.EVENT_LOAD_COMPLETED, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final int SAMPLE_HEADER_SIZE = 7;

    /* loaded from: classes3.dex */
    public static final class SyncFrameInfo {
        public final int bitstreamVersion;
        public final int channelCount;
        public final int frameSize;
        public final int sampleCount;
        public final int sampleRate;

        private SyncFrameInfo(int i10, int i11, int i12, int i13, int i14) {
            this.bitstreamVersion = i10;
            this.channelCount = i11;
            this.sampleRate = i12;
            this.frameSize = i13;
            this.sampleCount = i14;
        }
    }

    private Ac4Util() {
    }

    public static void getAc4SampleHeader(int i10, ParsableByteArray parsableByteArray) {
        parsableByteArray.reset(7);
        byte[] data = parsableByteArray.getData();
        data[0] = -84;
        data[1] = 64;
        data[2] = -1;
        data[3] = -1;
        data[4] = (byte) ((i10 >> 16) & 255);
        data[5] = (byte) ((i10 >> 8) & 255);
        data[6] = (byte) (i10 & 255);
    }

    public static Format parseAc4AnnexEFormat(ParsableByteArray parsableByteArray, String str, String str2, DrmInitData drmInitData) {
        parsableByteArray.skipBytes(1);
        return new Format.Builder().setId(str).setSampleMimeType(MimeTypes.AUDIO_AC4).setChannelCount(2).setSampleRate(((parsableByteArray.readUnsignedByte() & 32) >> 5) == 1 ? OpusUtil.SAMPLE_RATE : AACEncoder.SAMPLING_RATE).setDrmInitData(drmInitData).setLanguage(str2).build();
    }

    public static int parseAc4SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return parseAc4SyncframeInfo(new ParsableBitArray(bArr)).sampleCount;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
        if (r10 != 11) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
        if (r10 != 11) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
        if (r10 != 8) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.audio.Ac4Util.SyncFrameInfo parseAc4SyncframeInfo(com.google.android.exoplayer2.util.ParsableBitArray r10) {
        /*
            r0 = 16
            int r1 = r10.readBits(r0)
            int r0 = r10.readBits(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r10.readBits(r0)
            r3 = 7
            goto L19
        L18:
            r3 = r2
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r7 = r0
            r0 = 2
            int r1 = r10.readBits(r0)
            r3 = 3
            if (r1 != r3) goto L2f
            int r4 = readVariableBits(r10, r0)
            int r1 = r1 + r4
        L2f:
            r4 = r1
            r1 = 10
            int r1 = r10.readBits(r1)
            boolean r5 = r10.readBit()
            if (r5 == 0) goto L45
            int r5 = r10.readBits(r3)
            if (r5 <= 0) goto L45
            r10.skipBits(r0)
        L45:
            boolean r5 = r10.readBit()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L53
            r9 = r6
            goto L54
        L53:
            r9 = r8
        L54:
            int r10 = r10.readBits(r2)
            r5 = 0
            if (r9 != r8) goto L65
            r8 = 13
            if (r10 != r8) goto L65
            int[] r0 = com.google.android.exoplayer2.audio.Ac4Util.SAMPLE_COUNT
            r10 = r0[r10]
            r8 = r10
            goto L91
        L65:
            if (r9 != r6) goto L90
            int[] r6 = com.google.android.exoplayer2.audio.Ac4Util.SAMPLE_COUNT
            int r8 = r6.length
            if (r10 >= r8) goto L90
            r5 = r6[r10]
            int r1 = r1 % 5
            r6 = 8
            r8 = 1
            if (r1 == r8) goto L8a
            r8 = 11
            if (r1 == r0) goto L85
            if (r1 == r3) goto L8a
            if (r1 == r2) goto L7e
            goto L90
        L7e:
            if (r10 == r3) goto L8e
            if (r10 == r6) goto L8e
            if (r10 != r8) goto L90
            goto L89
        L85:
            if (r10 == r6) goto L8e
            if (r10 != r8) goto L90
        L89:
            goto L8e
        L8a:
            if (r10 == r3) goto L8e
            if (r10 != r6) goto L90
        L8e:
            int r5 = r5 + 1
        L90:
            r8 = r5
        L91:
            com.google.android.exoplayer2.audio.Ac4Util$SyncFrameInfo r10 = new com.google.android.exoplayer2.audio.Ac4Util$SyncFrameInfo
            r5 = 2
            r0 = 0
            r3 = r10
            r6 = r9
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.Ac4Util.parseAc4SyncframeInfo(com.google.android.exoplayer2.util.ParsableBitArray):com.google.android.exoplayer2.audio.Ac4Util$SyncFrameInfo");
    }

    public static int parseAc4SyncframeSize(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & TagConstant.TAG_CAT_RESERVED) << 8) | (bArr[3] & TagConstant.TAG_CAT_RESERVED);
        if (i12 == 65535) {
            i12 = ((bArr[4] & TagConstant.TAG_CAT_RESERVED) << 16) | ((bArr[5] & TagConstant.TAG_CAT_RESERVED) << 8) | (bArr[6] & TagConstant.TAG_CAT_RESERVED);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    private static int readVariableBits(ParsableBitArray parsableBitArray, int i10) {
        int i11 = 0;
        while (true) {
            int readBits = i11 + parsableBitArray.readBits(i10);
            if (!parsableBitArray.readBit()) {
                return readBits;
            }
            i11 = (readBits + 1) << i10;
        }
    }
}
