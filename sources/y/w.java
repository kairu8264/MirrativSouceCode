package y;

import q1.q0;

/* loaded from: classes.dex */
public final class w extends androidx.compose.ui.platform.d1 implements q1.x {

    /* renamed from: x  reason: collision with root package name */
    public final t f61000x;

    /* renamed from: y  reason: collision with root package name */
    public final float f61001y;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q1.q0 f61002w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q1.q0 q0Var) {
            super(1);
            this.f61002w = q0Var;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            q0.a.n(aVar, this.f61002w, 0, 0, 0.0f, 4, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(t tVar, float f10, io.l<? super androidx.compose.ui.platform.c1, wn.v> lVar) {
        super(lVar);
        jo.p.h(tVar, "direction");
        jo.p.h(lVar, "inspectorInfo");
        this.f61000x = tVar;
        this.f61001y = f10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f61000x == wVar.f61000x) {
                if (this.f61001y == wVar.f61001y) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f61000x.hashCode() * 31) + Float.hashCode(this.f61001y);
    }

    @Override // q1.x
    public q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
        int p10;
        int n10;
        int m10;
        int i10;
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(b0Var, "measurable");
        if (m2.b.j(j10) && this.f61000x != t.Vertical) {
            p10 = po.n.m(lo.c.c(m2.b.n(j10) * this.f61001y), m2.b.p(j10), m2.b.n(j10));
            n10 = p10;
        } else {
            p10 = m2.b.p(j10);
            n10 = m2.b.n(j10);
        }
        if (m2.b.i(j10) && this.f61000x != t.Horizontal) {
            i10 = po.n.m(lo.c.c(m2.b.m(j10) * this.f61001y), m2.b.o(j10), m2.b.m(j10));
            m10 = i10;
        } else {
            int o10 = m2.b.o(j10);
            m10 = m2.b.m(j10);
            i10 = o10;
        }
        q1.q0 M = b0Var.M(m2.c.a(p10, n10, i10, m10));
        return q1.e0.O0(e0Var, M.r0(), M.f0(), null, new a(M), 4, null);
    }
}
