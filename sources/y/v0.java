package y;

import q1.q0;

/* loaded from: classes.dex */
public final class v0 extends androidx.compose.ui.platform.d1 implements q1.x {

    /* renamed from: x  reason: collision with root package name */
    public final t0 f60996x;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q1.q0 f60997w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ q1.e0 f60998x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ v0 f60999y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q1.q0 q0Var, q1.e0 e0Var, v0 v0Var) {
            super(1);
            this.f60997w = q0Var;
            this.f60998x = e0Var;
            this.f60999y = v0Var;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            q0.a.j(aVar, this.f60997w, this.f60998x.X(this.f60999y.b().b(this.f60998x.getLayoutDirection())), this.f60998x.X(this.f60999y.b().d()), 0.0f, 4, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(t0 t0Var, io.l<? super androidx.compose.ui.platform.c1, wn.v> lVar) {
        super(lVar);
        jo.p.h(t0Var, "paddingValues");
        jo.p.h(lVar, "inspectorInfo");
        this.f60996x = t0Var;
    }

    public final t0 b() {
        return this.f60996x;
    }

    public boolean equals(Object obj) {
        v0 v0Var = obj instanceof v0 ? (v0) obj : null;
        if (v0Var == null) {
            return false;
        }
        return jo.p.c(this.f60996x, v0Var.f60996x);
    }

    public int hashCode() {
        return this.f60996x.hashCode();
    }

    @Override // q1.x
    public q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(b0Var, "measurable");
        boolean z10 = false;
        float f10 = 0;
        if (m2.g.i(this.f60996x.b(e0Var.getLayoutDirection()), m2.g.l(f10)) >= 0 && m2.g.i(this.f60996x.d(), m2.g.l(f10)) >= 0 && m2.g.i(this.f60996x.c(e0Var.getLayoutDirection()), m2.g.l(f10)) >= 0 && m2.g.i(this.f60996x.a(), m2.g.l(f10)) >= 0) {
            z10 = true;
        }
        if (z10) {
            int X = e0Var.X(this.f60996x.b(e0Var.getLayoutDirection())) + e0Var.X(this.f60996x.c(e0Var.getLayoutDirection()));
            int X2 = e0Var.X(this.f60996x.d()) + e0Var.X(this.f60996x.a());
            q1.q0 M = b0Var.M(m2.c.i(j10, -X, -X2));
            return q1.e0.O0(e0Var, m2.c.g(j10, M.r0() + X), m2.c.f(j10, M.f0() + X2), null, new a(M, e0Var, this), 4, null);
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }
}
