package y;

import m2.g;
import q1.q0;

/* loaded from: classes.dex */
public final class k1 extends androidx.compose.ui.platform.d1 implements q1.x {

    /* renamed from: x  reason: collision with root package name */
    public final float f60833x;

    /* renamed from: y  reason: collision with root package name */
    public final float f60834y;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q1.q0 f60835w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q1.q0 q0Var) {
            super(1);
            this.f60835w = q0Var;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            q0.a.n(aVar, this.f60835w, 0, 0, 0.0f, 4, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    public k1(float f10, float f11, io.l<? super androidx.compose.ui.platform.c1, wn.v> lVar) {
        super(lVar);
        this.f60833x = f10;
        this.f60834y = f11;
    }

    public /* synthetic */ k1(float f10, float f11, io.l lVar, jo.h hVar) {
        this(f10, f11, lVar);
    }

    @Override // q1.x
    public int d(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        return po.n.d(lVar.G(i10), !m2.g.n(this.f60833x, m2.g.f40516x.b()) ? mVar.X(this.f60833x) : 0);
    }

    public boolean equals(Object obj) {
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            return m2.g.n(this.f60833x, k1Var.f60833x) && m2.g.n(this.f60834y, k1Var.f60834y);
        }
        return false;
    }

    @Override // q1.x
    public int h(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        return po.n.d(lVar.u(i10), !m2.g.n(this.f60834y, m2.g.f40516x.b()) ? mVar.X(this.f60834y) : 0);
    }

    public int hashCode() {
        return (m2.g.o(this.f60833x) * 31) + m2.g.o(this.f60834y);
    }

    @Override // q1.x
    public q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
        int p10;
        int o10;
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(b0Var, "measurable");
        float f10 = this.f60833x;
        g.a aVar = m2.g.f40516x;
        if (!m2.g.n(f10, aVar.b()) && m2.b.p(j10) == 0) {
            p10 = po.n.d(po.n.i(e0Var.X(this.f60833x), m2.b.n(j10)), 0);
        } else {
            p10 = m2.b.p(j10);
        }
        int n10 = m2.b.n(j10);
        if (!m2.g.n(this.f60834y, aVar.b()) && m2.b.o(j10) == 0) {
            o10 = po.n.d(po.n.i(e0Var.X(this.f60834y), m2.b.m(j10)), 0);
        } else {
            o10 = m2.b.o(j10);
        }
        q1.q0 M = b0Var.M(m2.c.a(p10, n10, o10, m2.b.m(j10)));
        return q1.e0.O0(e0Var, M.r0(), M.f0(), null, new a(M), 4, null);
    }

    @Override // q1.x
    public int u(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        return po.n.d(lVar.e(i10), !m2.g.n(this.f60834y, m2.g.f40516x.b()) ? mVar.X(this.f60834y) : 0);
    }

    @Override // q1.x
    public int w(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        return po.n.d(lVar.E(i10), !m2.g.n(this.f60833x, m2.g.f40516x.b()) ? mVar.X(this.f60833x) : 0);
    }
}
