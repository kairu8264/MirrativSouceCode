package q1;

/* loaded from: classes.dex */
public abstract class q0 implements f0 {

    /* renamed from: w  reason: collision with root package name */
    public int f48594w;

    /* renamed from: x  reason: collision with root package name */
    public int f48595x;

    /* renamed from: y  reason: collision with root package name */
    public long f48596y = m2.p.a(0, 0);

    /* renamed from: z  reason: collision with root package name */
    public long f48597z = r0.a();

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0733a f48598a = new C0733a(null);

        /* renamed from: b  reason: collision with root package name */
        public static m2.q f48599b = m2.q.Ltr;

        /* renamed from: c  reason: collision with root package name */
        public static int f48600c;

        /* renamed from: q1.q0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0733a extends a {
            public C0733a() {
            }

            public /* synthetic */ C0733a(jo.h hVar) {
                this();
            }

            @Override // q1.q0.a
            public m2.q g() {
                return a.f48599b;
            }

            @Override // q1.q0.a
            public int h() {
                return a.f48600c;
            }
        }

        public static /* synthetic */ void j(a aVar, q0 q0Var, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.i(q0Var, i10, i11, f10);
        }

        public static /* synthetic */ void l(a aVar, q0 q0Var, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.k(q0Var, j10, f10);
        }

        public static /* synthetic */ void n(a aVar, q0 q0Var, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.m(q0Var, i10, i11, f10);
        }

        public static /* synthetic */ void p(a aVar, q0 q0Var, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.o(q0Var, j10, f10);
        }

        public static /* synthetic */ void r(a aVar, q0 q0Var, int i10, int i11, float f10, io.l lVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            io.l lVar2 = lVar;
            if ((i12 & 8) != 0) {
                lVar2 = r0.b();
            }
            aVar.q(q0Var, i10, i11, f11, lVar2);
        }

        public static /* synthetic */ void t(a aVar, q0 q0Var, long j10, float f10, io.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            io.l lVar2 = lVar;
            if ((i10 & 4) != 0) {
                lVar2 = r0.b();
            }
            aVar.s(q0Var, j10, f11, lVar2);
        }

        public static /* synthetic */ void v(a aVar, q0 q0Var, int i10, int i11, float f10, io.l lVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            io.l lVar2 = lVar;
            if ((i12 & 8) != 0) {
                lVar2 = r0.b();
            }
            aVar.u(q0Var, i10, i11, f11, lVar2);
        }

        public static /* synthetic */ void x(a aVar, q0 q0Var, long j10, float f10, io.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            io.l lVar2 = lVar;
            if ((i10 & 4) != 0) {
                lVar2 = r0.b();
            }
            aVar.w(q0Var, j10, f11, lVar2);
        }

        public abstract m2.q g();

        public abstract int h();

        public final void i(q0 q0Var, int i10, int i11, float f10) {
            jo.p.h(q0Var, "<this>");
            long a10 = m2.l.a(i10, i11);
            long e02 = q0Var.e0();
            q0Var.v0(m2.l.a(m2.k.j(a10) + m2.k.j(e02), m2.k.k(a10) + m2.k.k(e02)), f10, null);
        }

        public final void k(q0 q0Var, long j10, float f10) {
            jo.p.h(q0Var, "$this$place");
            long e02 = q0Var.e0();
            q0Var.v0(m2.l.a(m2.k.j(j10) + m2.k.j(e02), m2.k.k(j10) + m2.k.k(e02)), f10, null);
        }

        public final void m(q0 q0Var, int i10, int i11, float f10) {
            jo.p.h(q0Var, "<this>");
            long a10 = m2.l.a(i10, i11);
            if (g() == m2.q.Ltr || h() == 0) {
                long e02 = q0Var.e0();
                q0Var.v0(m2.l.a(m2.k.j(a10) + m2.k.j(e02), m2.k.k(a10) + m2.k.k(e02)), f10, null);
                return;
            }
            long a11 = m2.l.a((h() - m2.o.g(q0Var.f48596y)) - m2.k.j(a10), m2.k.k(a10));
            long e03 = q0Var.e0();
            q0Var.v0(m2.l.a(m2.k.j(a11) + m2.k.j(e03), m2.k.k(a11) + m2.k.k(e03)), f10, null);
        }

        public final void o(q0 q0Var, long j10, float f10) {
            jo.p.h(q0Var, "$this$placeRelative");
            if (g() == m2.q.Ltr || h() == 0) {
                long e02 = q0Var.e0();
                q0Var.v0(m2.l.a(m2.k.j(j10) + m2.k.j(e02), m2.k.k(j10) + m2.k.k(e02)), f10, null);
                return;
            }
            long a10 = m2.l.a((h() - m2.o.g(q0Var.f48596y)) - m2.k.j(j10), m2.k.k(j10));
            long e03 = q0Var.e0();
            q0Var.v0(m2.l.a(m2.k.j(a10) + m2.k.j(e03), m2.k.k(a10) + m2.k.k(e03)), f10, null);
        }

        public final void q(q0 q0Var, int i10, int i11, float f10, io.l<? super c1.i0, wn.v> lVar) {
            jo.p.h(q0Var, "<this>");
            jo.p.h(lVar, "layerBlock");
            long a10 = m2.l.a(i10, i11);
            if (g() == m2.q.Ltr || h() == 0) {
                long e02 = q0Var.e0();
                q0Var.v0(m2.l.a(m2.k.j(a10) + m2.k.j(e02), m2.k.k(a10) + m2.k.k(e02)), f10, lVar);
                return;
            }
            long a11 = m2.l.a((h() - m2.o.g(q0Var.f48596y)) - m2.k.j(a10), m2.k.k(a10));
            long e03 = q0Var.e0();
            q0Var.v0(m2.l.a(m2.k.j(a11) + m2.k.j(e03), m2.k.k(a11) + m2.k.k(e03)), f10, lVar);
        }

        public final void s(q0 q0Var, long j10, float f10, io.l<? super c1.i0, wn.v> lVar) {
            jo.p.h(q0Var, "$this$placeRelativeWithLayer");
            jo.p.h(lVar, "layerBlock");
            if (g() == m2.q.Ltr || h() == 0) {
                long e02 = q0Var.e0();
                q0Var.v0(m2.l.a(m2.k.j(j10) + m2.k.j(e02), m2.k.k(j10) + m2.k.k(e02)), f10, lVar);
                return;
            }
            long a10 = m2.l.a((h() - m2.o.g(q0Var.f48596y)) - m2.k.j(j10), m2.k.k(j10));
            long e03 = q0Var.e0();
            q0Var.v0(m2.l.a(m2.k.j(a10) + m2.k.j(e03), m2.k.k(a10) + m2.k.k(e03)), f10, lVar);
        }

        public final void u(q0 q0Var, int i10, int i11, float f10, io.l<? super c1.i0, wn.v> lVar) {
            jo.p.h(q0Var, "<this>");
            jo.p.h(lVar, "layerBlock");
            long a10 = m2.l.a(i10, i11);
            long e02 = q0Var.e0();
            q0Var.v0(m2.l.a(m2.k.j(a10) + m2.k.j(e02), m2.k.k(a10) + m2.k.k(e02)), f10, lVar);
        }

        public final void w(q0 q0Var, long j10, float f10, io.l<? super c1.i0, wn.v> lVar) {
            jo.p.h(q0Var, "$this$placeWithLayer");
            jo.p.h(lVar, "layerBlock");
            long e02 = q0Var.e0();
            q0Var.v0(m2.l.a(m2.k.j(j10) + m2.k.j(e02), m2.k.k(j10) + m2.k.k(e02)), f10, lVar);
        }
    }

    public final void E0(long j10) {
        if (m2.b.g(this.f48597z, j10)) {
            return;
        }
        this.f48597z = j10;
        x0();
    }

    public final long e0() {
        return m2.l.a((this.f48594w - m2.o.g(this.f48596y)) / 2, (this.f48595x - m2.o.f(this.f48596y)) / 2);
    }

    public final int f0() {
        return this.f48595x;
    }

    public int g0() {
        return m2.o.f(this.f48596y);
    }

    public final long j0() {
        return this.f48596y;
    }

    public int l0() {
        return m2.o.g(this.f48596y);
    }

    public final long p0() {
        return this.f48597z;
    }

    public final int r0() {
        return this.f48594w;
    }

    public abstract void v0(long j10, float f10, io.l<? super c1.i0, wn.v> lVar);

    public final void x0() {
        this.f48594w = po.n.m(m2.o.g(this.f48596y), m2.b.p(this.f48597z), m2.b.n(this.f48597z));
        this.f48595x = po.n.m(m2.o.f(this.f48596y), m2.b.o(this.f48597z), m2.b.m(this.f48597z));
    }

    public final void z0(long j10) {
        if (m2.o.e(this.f48596y, j10)) {
            return;
        }
        this.f48596y = j10;
        x0();
    }
}
