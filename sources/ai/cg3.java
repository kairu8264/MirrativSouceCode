package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class cg3 {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        long c10 = c(bArr, 0, 0);
        long c11 = c(bArr, 3, 2) & 67108611;
        long c12 = c(bArr, 6, 4) & 67092735;
        long c13 = c(bArr, 9, 6) & 66076671;
        long c14 = c(bArr, 12, 8) & 1048575;
        long j10 = c11 * 5;
        long j11 = c12 * 5;
        long j12 = c13 * 5;
        long j13 = c14 * 5;
        int i10 = 17;
        byte[] bArr3 = new byte[17];
        long j14 = 0;
        int i11 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        while (true) {
            int length = bArr2.length;
            if (i11 < length) {
                int min = Math.min(16, length - i11);
                System.arraycopy(bArr2, i11, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i10, (byte) 0);
                }
                long c15 = j18 + c(bArr3, 0, 0);
                long c16 = j15 + c(bArr3, 3, 2);
                long c17 = j14 + c(bArr3, 6, 4);
                long c18 = j16 + c(bArr3, 9, 6);
                long c19 = j17 + (c(bArr3, 12, 8) | (bArr3[16] << 24));
                long j19 = (c15 * c10) + (c16 * j13) + (c17 * j12) + (c18 * j11) + (c19 * j10);
                long j20 = (c15 * c11) + (c16 * c10) + (c17 * j13) + (c18 * j12) + (c19 * j11) + (j19 >> 26);
                long j21 = (c15 * c12) + (c16 * c11) + (c17 * c10) + (c18 * j13) + (c19 * j12) + (j20 >> 26);
                long j22 = (c15 * c13) + (c16 * c12) + (c17 * c11) + (c18 * c10) + (c19 * j13) + (j21 >> 26);
                long j23 = (c15 * c14) + (c16 * c13) + (c17 * c12) + (c18 * c11) + (c19 * c10) + (j22 >> 26);
                j17 = j23 & 67108863;
                long j24 = (j19 & 67108863) + ((j23 >> 26) * 5);
                j18 = j24 & 67108863;
                j15 = (j20 & 67108863) + (j24 >> 26);
                i11 += 16;
                j16 = j22 & 67108863;
                j14 = j21 & 67108863;
                i10 = 17;
            } else {
                long j25 = j14 + (j15 >> 26);
                long j26 = j25 & 67108863;
                long j27 = j16 + (j25 >> 26);
                long j28 = j27 & 67108863;
                long j29 = j17 + (j27 >> 26);
                long j30 = j29 & 67108863;
                long j31 = j18 + ((j29 >> 26) * 5);
                long j32 = j31 & 67108863;
                long j33 = (j15 & 67108863) + (j31 >> 26);
                long j34 = j32 + 5;
                long j35 = (j34 >> 26) + j33;
                long j36 = j26 + (j35 >> 26);
                long j37 = j28 + (j36 >> 26);
                long j38 = (j30 + (j37 >> 26)) - 67108864;
                long j39 = j38 >> 63;
                long j40 = ~j39;
                long j41 = (j33 & j39) | (j35 & 67108863 & j40);
                long j42 = (j26 & j39) | (j36 & 67108863 & j40);
                long j43 = (j28 & j39) | (j37 & 67108863 & j40);
                long b10 = (((j32 & j39) | (j34 & 67108863 & j40) | (j41 << 26)) & 4294967295L) + b(bArr, 16);
                long b11 = (((j41 >> 6) | (j42 << 20)) & 4294967295L) + b(bArr, 20) + (b10 >> 32);
                long b12 = (((j42 >> 12) | (j43 << 14)) & 4294967295L) + b(bArr, 24) + (b11 >> 32);
                long b13 = b(bArr, 28);
                byte[] bArr4 = new byte[16];
                d(bArr4, b10 & 4294967295L, 0);
                d(bArr4, b11 & 4294967295L, 4);
                d(bArr4, b12 & 4294967295L, 8);
                d(bArr4, ((((((j38 & j40) | (j30 & j39)) << 8) | (j43 >> 18)) & 4294967295L) + b13 + (b12 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
        }
    }

    public static long b(byte[] bArr, int i10) {
        return (((bArr[i10 + 3] & TagConstant.TAG_CAT_RESERVED) << 24) | (bArr[i10] & TagConstant.TAG_CAT_RESERVED) | ((bArr[i10 + 1] & TagConstant.TAG_CAT_RESERVED) << 8) | ((bArr[i10 + 2] & TagConstant.TAG_CAT_RESERVED) << 16)) & 4294967295L;
    }

    public static long c(byte[] bArr, int i10, int i11) {
        return (b(bArr, i10) >> i11) & 67108863;
    }

    public static void d(byte[] bArr, long j10, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j10);
            i11++;
            j10 >>= 8;
        }
    }
}
