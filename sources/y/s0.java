package y;

import q1.q0;

/* loaded from: classes.dex */
public final class s0 extends androidx.compose.ui.platform.d1 implements q1.x {
    public final float A;
    public final boolean B;

    /* renamed from: x  reason: collision with root package name */
    public final float f60967x;

    /* renamed from: y  reason: collision with root package name */
    public final float f60968y;

    /* renamed from: z  reason: collision with root package name */
    public final float f60969z;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ q1.q0 f60971x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q1.e0 f60972y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q1.q0 q0Var, q1.e0 e0Var) {
            super(1);
            this.f60971x = q0Var;
            this.f60972y = e0Var;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            if (s0.this.b()) {
                q0.a.n(aVar, this.f60971x, this.f60972y.X(s0.this.c()), this.f60972y.X(s0.this.f()), 0.0f, 4, null);
            } else {
                q0.a.j(aVar, this.f60971x, this.f60972y.X(s0.this.c()), this.f60972y.X(s0.this.f()), 0.0f, 4, null);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    public s0(float f10, float f11, float f12, float f13, boolean z10, io.l<? super androidx.compose.ui.platform.c1, wn.v> lVar) {
        super(lVar);
        this.f60967x = f10;
        this.f60968y = f11;
        this.f60969z = f12;
        this.A = f13;
        this.B = z10;
        if (!((f10 >= 0.0f || m2.g.n(f10, m2.g.f40516x.b())) && (f11 >= 0.0f || m2.g.n(f11, m2.g.f40516x.b())) && ((f12 >= 0.0f || m2.g.n(f12, m2.g.f40516x.b())) && (f13 >= 0.0f || m2.g.n(f13, m2.g.f40516x.b()))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    public /* synthetic */ s0(float f10, float f11, float f12, float f13, boolean z10, io.l lVar, jo.h hVar) {
        this(f10, f11, f12, f13, z10, lVar);
    }

    public final boolean b() {
        return this.B;
    }

    public final float c() {
        return this.f60967x;
    }

    public boolean equals(Object obj) {
        s0 s0Var = obj instanceof s0 ? (s0) obj : null;
        return s0Var != null && m2.g.n(this.f60967x, s0Var.f60967x) && m2.g.n(this.f60968y, s0Var.f60968y) && m2.g.n(this.f60969z, s0Var.f60969z) && m2.g.n(this.A, s0Var.A) && this.B == s0Var.B;
    }

    public final float f() {
        return this.f60968y;
    }

    public int hashCode() {
        return (((((((m2.g.o(this.f60967x) * 31) + m2.g.o(this.f60968y)) * 31) + m2.g.o(this.f60969z)) * 31) + m2.g.o(this.A)) * 31) + Boolean.hashCode(this.B);
    }

    @Override // q1.x
    public q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(b0Var, "measurable");
        int X = e0Var.X(this.f60967x) + e0Var.X(this.f60969z);
        int X2 = e0Var.X(this.f60968y) + e0Var.X(this.A);
        q1.q0 M = b0Var.M(m2.c.i(j10, -X, -X2));
        return q1.e0.O0(e0Var, m2.c.g(j10, M.r0() + X), m2.c.f(j10, M.f0() + X2), null, new a(M, e0Var), 4, null);
    }
}
