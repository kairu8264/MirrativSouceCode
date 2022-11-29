package ai;

import android.util.Log;
import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class ev3 {
    public static void a(long j10, hb hbVar, pw3[] pw3VarArr) {
        int i10;
        while (true) {
            if (hbVar.l() <= 1) {
                return;
            }
            int c10 = c(hbVar);
            int c11 = c(hbVar);
            int o10 = hbVar.o() + c11;
            if (c11 == -1 || c11 > hbVar.l()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                o10 = hbVar.m();
            } else if (c10 == 4 && c11 >= 8) {
                int v10 = hbVar.v();
                int w10 = hbVar.w();
                if (w10 == 49) {
                    i10 = hbVar.D();
                    w10 = 49;
                } else {
                    i10 = 0;
                }
                int v11 = hbVar.v();
                if (w10 == 47) {
                    hbVar.s(1);
                    w10 = 47;
                }
                boolean z10 = v10 == 181 && (w10 == 49 || w10 == 47) && v11 == 3;
                if (w10 == 49) {
                    z10 &= i10 == 1195456820;
                }
                if (z10) {
                    b(j10, hbVar, pw3VarArr);
                }
            }
            hbVar.p(o10);
        }
    }

    public static void b(long j10, hb hbVar, pw3[] pw3VarArr) {
        int v10 = hbVar.v();
        if ((v10 & 64) != 0) {
            hbVar.s(1);
            int i10 = (v10 & 31) * 3;
            int o10 = hbVar.o();
            for (pw3 pw3Var : pw3VarArr) {
                hbVar.p(o10);
                pw3Var.a(hbVar, i10);
                if (j10 != C.TIME_UNSET) {
                    pw3Var.e(j10, 1, i10, 0, null);
                }
            }
        }
    }

    public static int c(hb hbVar) {
        int i10 = 0;
        while (hbVar.l() != 0) {
            int v10 = hbVar.v();
            i10 += v10;
            if (v10 != 255) {
                return i10;
            }
        }
        return -1;
    }
}
