package ai;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.internal.ads.zzaha;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class uv3 {
    public static boolean a(hb hbVar, zv3 zv3Var, int i10, tv3 tv3Var) {
        int c10;
        int o10 = hbVar.o();
        long B = hbVar.B();
        long j10 = B >>> 16;
        if (j10 != i10) {
            return false;
        }
        boolean z10 = (j10 & 1) == 1;
        int i11 = (int) ((B >> 12) & 15);
        int i12 = (int) ((B >> 8) & 15);
        int i13 = (int) (15 & (B >> 4));
        int i14 = (int) ((B >> 1) & 7);
        long j11 = B & 1;
        if (i13 <= 7) {
            if (i13 != zv3Var.f13218g - 1) {
                return false;
            }
        } else if (i13 > 10 || zv3Var.f13218g != 2) {
            return false;
        }
        if (!(i14 == 0 || i14 == zv3Var.f13220i) || j11 == 1 || !d(hbVar, zv3Var, z10, tv3Var) || (c10 = c(hbVar, i11)) == -1 || c10 > zv3Var.f13213b) {
            return false;
        }
        int i15 = zv3Var.f13216e;
        if (i12 != 0) {
            if (i12 <= 11) {
                if (i12 != zv3Var.f13217f) {
                    return false;
                }
            } else if (i12 == 12) {
                if (hbVar.v() * 1000 != i15) {
                    return false;
                }
            } else if (i12 > 14) {
                return false;
            } else {
                int w10 = hbVar.w();
                if (i12 == 14) {
                    w10 *= 10;
                }
                if (w10 != i15) {
                    return false;
                }
            }
        }
        return hbVar.v() == sb.w(hbVar.q(), o10, hbVar.o() + (-1), 0);
    }

    public static long b(nv3 nv3Var, zv3 zv3Var) throws IOException {
        nv3Var.j();
        hv3 hv3Var = (hv3) nv3Var;
        hv3Var.r(1, false);
        byte[] bArr = new byte[1];
        hv3Var.c(bArr, 0, 1, false);
        int i10 = bArr[0] & 1;
        hv3Var.r(2, false);
        int i11 = 1 != i10 ? 6 : 7;
        hb hbVar = new hb(i11);
        hbVar.n(qv3.b(nv3Var, hbVar.q(), 0, i11));
        nv3Var.j();
        tv3 tv3Var = new tv3();
        if (d(hbVar, zv3Var, 1 == i10, tv3Var)) {
            return tv3Var.f10481a;
        }
        throw zzaha.b(null, null);
    }

    public static int c(hb hbVar, int i10) {
        switch (i10) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return hbVar.v() + 1;
            case 7:
                return hbVar.w() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static boolean d(hb hbVar, zv3 zv3Var, boolean z10, tv3 tv3Var) {
        try {
            long h10 = hbVar.h();
            if (!z10) {
                h10 *= zv3Var.f13213b;
            }
            tv3Var.f10481a = h10;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
