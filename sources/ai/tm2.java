package ai;

import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.internal.ads.zzdym;
import com.google.android.gms.internal.ads.zzeeg;

/* loaded from: classes3.dex */
public final class tm2 {
    public static sr a(Throwable th2) {
        if (th2 instanceof zzeeg) {
            zzeeg zzeegVar = (zzeeg) th2;
            return c(zzeegVar.a(), zzeegVar.b());
        } else if (th2 instanceof zzdym) {
            if (th2.getMessage() == null) {
                return d(((zzdym) th2).a(), null, null);
            }
            return d(((zzdym) th2).a(), th2.getMessage(), null);
        } else if (th2 instanceof zzbb) {
            zzbb zzbbVar = (zzbb) th2;
            return new sr(zzbbVar.a(), xx2.a(zzbbVar.getMessage()), "com.google.android.gms.ads", null, null);
        } else {
            return d(1, null, null);
        }
    }

    public static sr b(Throwable th2, vy1 vy1Var) {
        sr srVar;
        sr a10 = a(th2);
        int i10 = a10.f9916w;
        if ((i10 == 3 || i10 == 0) && (srVar = a10.f9919z) != null && !srVar.f9918y.equals("com.google.android.gms.ads")) {
            a10.f9919z = null;
        }
        if (((Boolean) ft.c().c(ox.X5)).booleanValue() && vy1Var != null) {
            a10.A = vy1Var.d();
        }
        return a10;
    }

    public static sr c(int i10, sr srVar) {
        if (i10 != 0) {
            if (i10 == 8) {
                if (((Integer) ft.c().c(ox.U5)).intValue() > 0) {
                    return srVar;
                }
                i10 = 8;
            }
            return d(i10, null, srVar);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ai.sr d(int r8, java.lang.String r9, ai.sr r10) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.tm2.d(int, java.lang.String, ai.sr):ai.sr");
    }
}
