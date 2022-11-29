package k0;

import c1.c0;
import l0.c2;
import l0.u1;
import u.b0;
import u.b1;
import v.x;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final b1<Float> f38339a = new b1<>(15, 0, b0.c(), 2, null);

    public static final u.i<Float> c(x.j jVar) {
        if (jVar instanceof x.g) {
            return f38339a;
        }
        if (!(jVar instanceof x.d) && !(jVar instanceof x.b)) {
            return f38339a;
        }
        return new b1(45, 0, b0.c(), 2, null);
    }

    public static final u.i<Float> d(x.j jVar) {
        if (!(jVar instanceof x.g) && !(jVar instanceof x.d)) {
            return jVar instanceof x.b ? new b1(150, 0, b0.c(), 2, null) : f38339a;
        }
        return f38339a;
    }

    public static final x e(boolean z10, float f10, long j10, l0.i iVar, int i10, int i11) {
        iVar.x(1635163520);
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            f10 = m2.g.f40516x.b();
        }
        if ((i11 & 4) != 0) {
            j10 = c0.f18634b.e();
        }
        c2 l10 = u1.l(c0.g(j10), iVar, (i10 >> 6) & 14);
        Boolean valueOf = Boolean.valueOf(z10);
        m2.g e10 = m2.g.e(f10);
        iVar.x(-3686552);
        boolean P = iVar.P(valueOf) | iVar.P(e10);
        Object y10 = iVar.y();
        if (P || y10 == l0.i.f39065a.a()) {
            y10 = new d(z10, f10, l10, null);
            iVar.q(y10);
        }
        iVar.O();
        d dVar = (d) y10;
        iVar.O();
        return dVar;
    }
}
