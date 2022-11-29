package c1;

/* loaded from: classes.dex */
public final class c1 implements i0 {
    public float A;
    public float B;
    public float E;
    public float F;
    public float G;
    public boolean K;
    public b1 M;

    /* renamed from: z  reason: collision with root package name */
    public float f18652z;

    /* renamed from: w  reason: collision with root package name */
    public float f18649w = 1.0f;

    /* renamed from: x  reason: collision with root package name */
    public float f18650x = 1.0f;

    /* renamed from: y  reason: collision with root package name */
    public float f18651y = 1.0f;
    public long C = j0.a();
    public long D = j0.a();
    public float H = 8.0f;
    public long I = n1.f18729b.a();
    public g1 J = a1.a();
    public m2.d L = m2.f.b(1.0f, 0.0f, 2, null);

    @Override // c1.i0
    public void A0(g1 g1Var) {
        jo.p.h(g1Var, "<set-?>");
        this.J = g1Var;
    }

    public float C() {
        return this.f18650x;
    }

    public float E() {
        return this.B;
    }

    public g1 F() {
        return this.J;
    }

    public long G() {
        return this.D;
    }

    @Override // m2.d
    public float G0() {
        return this.L.G0();
    }

    public long L() {
        return this.I;
    }

    public float M() {
        return this.f18652z;
    }

    public float P() {
        return this.A;
    }

    @Override // c1.i0
    public void Q(long j10) {
        this.C = j10;
    }

    public final void R() {
        j(1.0f);
        r(1.0f);
        b(1.0f);
        v(0.0f);
        g(0.0f);
        n0(0.0f);
        Q(j0.a());
        Z(j0.a());
        m(0.0f);
        n(0.0f);
        p(0.0f);
        l(8.0f);
        Y(n1.f18729b.a());
        A0(a1.a());
        U(false);
        i(null);
    }

    public final void T(m2.d dVar) {
        jo.p.h(dVar, "<set-?>");
        this.L = dVar;
    }

    @Override // c1.i0
    public void U(boolean z10) {
        this.K = z10;
    }

    @Override // c1.i0
    public void Y(long j10) {
        this.I = j10;
    }

    @Override // c1.i0
    public void Z(long j10) {
        this.D = j10;
    }

    @Override // c1.i0
    public void b(float f10) {
        this.f18651y = f10;
    }

    public float d() {
        return this.f18651y;
    }

    public long e() {
        return this.C;
    }

    @Override // c1.i0
    public void g(float f10) {
        this.A = f10;
    }

    @Override // m2.d
    public float getDensity() {
        return this.L.getDensity();
    }

    public float h() {
        return this.H;
    }

    @Override // c1.i0
    public void i(b1 b1Var) {
    }

    @Override // c1.i0
    public void j(float f10) {
        this.f18649w = f10;
    }

    public boolean k() {
        return this.K;
    }

    @Override // c1.i0
    public void l(float f10) {
        this.H = f10;
    }

    @Override // c1.i0
    public void m(float f10) {
        this.E = f10;
    }

    @Override // c1.i0
    public void n(float f10) {
        this.F = f10;
    }

    @Override // c1.i0
    public void n0(float f10) {
        this.B = f10;
    }

    public b1 o() {
        return this.M;
    }

    @Override // c1.i0
    public void p(float f10) {
        this.G = f10;
    }

    public float q() {
        return this.E;
    }

    @Override // c1.i0
    public void r(float f10) {
        this.f18650x = f10;
    }

    public float u() {
        return this.F;
    }

    @Override // c1.i0
    public void v(float f10) {
        this.f18652z = f10;
    }

    public float w() {
        return this.G;
    }

    public float z() {
        return this.f18649w;
    }
}
