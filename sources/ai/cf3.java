package ai;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class cf3 {
    public static byte[] a(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i10 = 0; i10 < 16; i10++) {
                byte b10 = bArr[i10];
                byte b11 = (byte) ((b10 + b10) & 254);
                bArr2[i10] = b11;
                if (i10 < 15) {
                    bArr2[i10] = (byte) (((bArr[i10 + 1] >> 7) & 1) | b11);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & TsExtractor.TS_STREAM_TYPE_E_AC3)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    public static byte[] b(byte[] bArr) {
        int length = bArr.length;
        if (length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr, 16);
            copyOf[length] = Byte.MIN_VALUE;
            return copyOf;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }
}
