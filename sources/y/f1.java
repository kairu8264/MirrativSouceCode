package y;

import m2.g;
import q1.q0;

/* loaded from: classes.dex */
public final class f1 extends androidx.compose.ui.platform.d1 implements q1.x {
    public final float A;
    public final boolean B;

    /* renamed from: x  reason: collision with root package name */
    public final float f60794x;

    /* renamed from: y  reason: collision with root package name */
    public final float f60795y;

    /* renamed from: z  reason: collision with root package name */
    public final float f60796z;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q1.q0 f60797w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q1.q0 q0Var) {
            super(1);
            this.f60797w = q0Var;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            q0.a.n(aVar, this.f60797w, 0, 0, 0.0f, 4, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    public /* synthetic */ f1(float f10, float f11, float f12, float f13, boolean z10, io.l lVar, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? m2.g.f40516x.b() : f10, (i10 & 2) != 0 ? m2.g.f40516x.b() : f11, (i10 & 4) != 0 ? m2.g.f40516x.b() : f12, (i10 & 8) != 0 ? m2.g.f40516x.b() : f13, z10, lVar, null);
    }

    public /* synthetic */ f1(float f10, float f11, float f12, float f13, boolean z10, io.l lVar, jo.h hVar) {
        this(f10, f11, f12, f13, z10, lVar);
    }

    public final long b(m2.d dVar) {
        int i10;
        int d10;
        float f10 = this.f60796z;
        g.a aVar = m2.g.f40516x;
        int i11 = 0;
        int X = !m2.g.n(f10, aVar.b()) ? dVar.X(((m2.g) po.n.f(m2.g.e(this.f60796z), m2.g.e(m2.g.l(0)))).q()) : Integer.MAX_VALUE;
        int X2 = !m2.g.n(this.A, aVar.b()) ? dVar.X(((m2.g) po.n.f(m2.g.e(this.A), m2.g.e(m2.g.l(0)))).q()) : Integer.MAX_VALUE;
        if (m2.g.n(this.f60794x, aVar.b()) || (i10 = po.n.d(po.n.i(dVar.X(this.f60794x), X), 0)) == Integer.MAX_VALUE) {
            i10 = 0;
        }
        if (!m2.g.n(this.f60795y, aVar.b()) && (d10 = po.n.d(po.n.i(dVar.X(this.f60795y), X2), 0)) != Integer.MAX_VALUE) {
            i11 = d10;
        }
        return m2.c.a(i10, X, i11, X2);
    }

    @Override // q1.x
    public int d(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        long b10 = b(mVar);
        if (m2.b.l(b10)) {
            return m2.b.n(b10);
        }
        return m2.c.g(b10, lVar.G(i10));
    }

    public boolean equals(Object obj) {
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            return m2.g.n(this.f60794x, f1Var.f60794x) && m2.g.n(this.f60795y, f1Var.f60795y) && m2.g.n(this.f60796z, f1Var.f60796z) && m2.g.n(this.A, f1Var.A) && this.B == f1Var.B;
        }
        return false;
    }

    @Override // q1.x
    public int h(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        long b10 = b(mVar);
        if (m2.b.k(b10)) {
            return m2.b.m(b10);
        }
        return m2.c.f(b10, lVar.u(i10));
    }

    public int hashCode() {
        return ((((((m2.g.o(this.f60794x) * 31) + m2.g.o(this.f60795y)) * 31) + m2.g.o(this.f60796z)) * 31) + m2.g.o(this.A)) * 31;
    }

    @Override // q1.x
    public q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
        int i10;
        int d10;
        int i11;
        int d11;
        long a10;
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(b0Var, "measurable");
        long b10 = b(e0Var);
        if (this.B) {
            a10 = m2.c.e(j10, b10);
        } else {
            float f10 = this.f60794x;
            g.a aVar = m2.g.f40516x;
            if (!m2.g.n(f10, aVar.b())) {
                i10 = m2.b.p(b10);
            } else {
                i10 = po.n.i(m2.b.p(j10), m2.b.n(b10));
            }
            if (!m2.g.n(this.f60796z, aVar.b())) {
                d10 = m2.b.n(b10);
            } else {
                d10 = po.n.d(m2.b.n(j10), m2.b.p(b10));
            }
            if (!m2.g.n(this.f60795y, aVar.b())) {
                i11 = m2.b.o(b10);
            } else {
                i11 = po.n.i(m2.b.o(j10), m2.b.m(b10));
            }
            if (!m2.g.n(this.A, aVar.b())) {
                d11 = m2.b.m(b10);
            } else {
                d11 = po.n.d(m2.b.m(j10), m2.b.o(b10));
            }
            a10 = m2.c.a(i10, d10, i11, d11);
        }
        q1.q0 M = b0Var.M(a10);
        return q1.e0.O0(e0Var, M.r0(), M.f0(), null, new a(M), 4, null);
    }

    @Override // q1.x
    public int u(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        long b10 = b(mVar);
        if (m2.b.k(b10)) {
            return m2.b.m(b10);
        }
        return m2.c.f(b10, lVar.e(i10));
    }

    @Override // q1.x
    public int w(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        long b10 = b(mVar);
        if (m2.b.l(b10)) {
            return m2.b.n(b10);
        }
        return m2.c.g(b10, lVar.E(i10));
    }

    public f1(float f10, float f11, float f12, float f13, boolean z10, io.l<? super androidx.compose.ui.platform.c1, wn.v> lVar) {
        super(lVar);
        this.f60794x = f10;
        this.f60795y = f11;
        this.f60796z = f12;
        this.A = f13;
        this.B = z10;
    }
}
