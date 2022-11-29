package k0;

import l0.c2;
import uo.q0;
import v.y;

/* loaded from: classes.dex */
public abstract class m implements y {

    /* renamed from: w  reason: collision with root package name */
    public final q f38338w;

    public m(boolean z10, c2<f> c2Var) {
        jo.p.h(c2Var, "rippleAlpha");
        this.f38338w = new q(z10, c2Var);
    }

    public abstract void e(x.p pVar, q0 q0Var);

    public final void f(e1.e eVar, float f10, long j10) {
        jo.p.h(eVar, "$this$drawStateLayer");
        this.f38338w.b(eVar, f10, j10);
    }

    public abstract void g(x.p pVar);

    public final void h(x.j jVar, q0 q0Var) {
        jo.p.h(jVar, "interaction");
        jo.p.h(q0Var, "scope");
        this.f38338w.c(jVar, q0Var);
    }
}
