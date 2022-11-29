package ai;

/* loaded from: classes3.dex */
public final class ox3 implements lw3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ lw3 f8151a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ px3 f8152b;

    public ox3(px3 px3Var, lw3 lw3Var) {
        this.f8152b = px3Var;
        this.f8151a = lw3Var;
    }

    @Override // ai.lw3
    public final jw3 a(long j10) {
        long j11;
        long j12;
        jw3 a10 = this.f8151a.a(j10);
        mw3 mw3Var = a10.f5944a;
        long j13 = mw3Var.f7082a;
        long j14 = mw3Var.f7083b;
        j11 = this.f8152b.f8729w;
        mw3 mw3Var2 = new mw3(j13, j14 + j11);
        mw3 mw3Var3 = a10.f5945b;
        long j15 = mw3Var3.f7082a;
        long j16 = mw3Var3.f7083b;
        j12 = this.f8152b.f8729w;
        return new jw3(mw3Var2, new mw3(j15, j16 + j12));
    }

    @Override // ai.lw3
    public final boolean c() {
        return this.f8151a.c();
    }

    @Override // ai.lw3
    public final long f() {
        return this.f8151a.f();
    }
}
