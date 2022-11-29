package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes3.dex */
public final class TsUtil {
    private TsUtil() {
    }

    public static int findSyncBytePosition(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long readPcrFromPacket(ParsableByteArray parsableByteArray, int i10, int i11) {
        parsableByteArray.setPosition(i10);
        if (parsableByteArray.bytesLeft() < 5) {
            return C.TIME_UNSET;
        }
        int readInt = parsableByteArray.readInt();
        if ((8388608 & readInt) == 0 && ((2096896 & readInt) >> 8) == i11) {
            if (((readInt & 32) != 0) && parsableByteArray.readUnsignedByte() >= 7 && parsableByteArray.bytesLeft() >= 7) {
                if ((parsableByteArray.readUnsignedByte() & 16) == 16) {
                    byte[] bArr = new byte[6];
                    parsableByteArray.readBytes(bArr, 0, 6);
                    return readPcrValueFromPcrBytes(bArr);
                }
            }
            return C.TIME_UNSET;
        }
        return C.TIME_UNSET;
    }

    private static long readPcrValueFromPcrBytes(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
