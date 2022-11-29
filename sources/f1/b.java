package f1;

import c1.f0;
import c1.k0;
import jo.p;
import m2.k;

/* loaded from: classes.dex */
public final class b {
    public static final a a(k0 k0Var, long j10, long j11, int i10) {
        p.h(k0Var, "image");
        a aVar = new a(k0Var, j10, j11, null);
        aVar.n(i10);
        return aVar;
    }

    public static /* synthetic */ a b(k0 k0Var, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = k.f40528b.a();
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            j11 = m2.p.a(k0Var.getWidth(), k0Var.getHeight());
        }
        long j13 = j11;
        if ((i11 & 8) != 0) {
            i10 = f0.f18658a.a();
        }
        return a(k0Var, j12, j13, i10);
    }
}
