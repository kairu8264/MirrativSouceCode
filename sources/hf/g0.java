package hf;

/* loaded from: classes2.dex */
public final class g0 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final s f35542a;

    /* renamed from: b  reason: collision with root package name */
    public final nf.k f35543b;

    /* renamed from: c  reason: collision with root package name */
    public long f35544c;

    /* renamed from: d  reason: collision with root package name */
    public jf.e0 f35545d;

    public g0(s sVar, nf.k kVar, long j10, jf.e0 e0Var) {
        jo.p.h(sVar, "getCurrentTimeMillis");
        jo.p.h(kVar, "featureStore");
        this.f35542a = sVar;
        this.f35543b = kVar;
        this.f35544c = j10;
        this.f35545d = e0Var;
    }

    @Override // hf.f0
    public void a() {
        jf.e0 e0Var = this.f35545d;
        if (e0Var == null) {
            return;
        }
        e0Var.l(false);
    }

    @Override // hf.f0
    public void b() {
        jf.e0 e0Var = this.f35545d;
        if (e0Var == null) {
            return;
        }
        e0Var.n(false);
    }

    @Override // hf.f0
    public void c() {
        jf.e0 e0Var = this.f35545d;
        if (e0Var == null) {
            return;
        }
        e0Var.m(false);
    }

    @Override // hf.f0
    public void clear() {
        this.f35544c = 0L;
        this.f35545d = null;
    }

    @Override // hf.f0
    public void d() {
        jf.e0 e0Var = this.f35545d;
        if (e0Var == null) {
            return;
        }
        e0Var.q(false);
    }

    @Override // hf.f0
    public void e() {
        jf.e0 e0Var = this.f35545d;
        if (e0Var == null) {
            return;
        }
        e0Var.r(false);
    }

    @Override // hf.f0
    public void f() {
        jf.e0 e0Var = this.f35545d;
        if (e0Var == null) {
            return;
        }
        e0Var.o(false);
    }

    @Override // hf.f0
    public void g(jf.e0 e0Var) {
        jo.p.h(e0Var, "newNotice");
        this.f35545d = e0Var;
        this.f35544c = this.f35542a.d();
    }

    @Override // hf.f0
    public jf.e0 get() {
        if (this.f35545d == null || this.f35542a.d() - this.f35544c > this.f35543b.l() * 1000) {
            return null;
        }
        return this.f35545d;
    }

    @Override // hf.f0
    public void h() {
        jf.e0 e0Var = this.f35545d;
        if (e0Var == null) {
            return;
        }
        e0Var.p(false);
    }

    @Override // hf.f0
    public void i() {
        jf.e0 e0Var = this.f35545d;
        if (e0Var == null) {
            return;
        }
        e0Var.k(false);
    }

    public /* synthetic */ g0(s sVar, nf.k kVar, long j10, jf.e0 e0Var, int i10, jo.h hVar) {
        this(sVar, kVar, (i10 & 4) != 0 ? 0L : j10, (i10 & 8) != 0 ? null : e0Var);
    }
}
