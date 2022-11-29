package ai;

import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class m24 {
    public static int a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long b(hb hbVar, int i10, int i11) {
        hbVar.p(i10);
        if (hbVar.l() < 5) {
            return C.TIME_UNSET;
        }
        int D = hbVar.D();
        if ((8388608 & D) == 0 && ((D >> 8) & 8191) == i11 && (D & 32) != 0 && hbVar.v() >= 7 && hbVar.l() >= 7 && (hbVar.v() & 16) == 16) {
            byte[] bArr = new byte[6];
            hbVar.u(bArr, 0, 6);
            byte b10 = bArr[0];
            byte b11 = bArr[1];
            byte b12 = bArr[2];
            long j10 = bArr[3] & 255;
            return ((b11 & 255) << 17) | ((b10 & 255) << 25) | ((b12 & 255) << 9) | (j10 + j10) | ((bArr[4] & 255) >> 7);
        }
        return C.TIME_UNSET;
    }
}
