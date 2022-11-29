package ai;

/* loaded from: classes3.dex */
public final class nx3 extends aw3 {

    /* renamed from: b  reason: collision with root package name */
    public final long f7561b;

    public nx3(nv3 nv3Var, long j10) {
        super(nv3Var);
        u9.a(nv3Var.n() >= j10);
        this.f7561b = j10;
    }

    @Override // ai.aw3, ai.nv3
    public final long k() {
        return super.k() - this.f7561b;
    }

    @Override // ai.aw3, ai.nv3
    public final long n() {
        return super.n() - this.f7561b;
    }

    @Override // ai.aw3, ai.nv3
    public final long o() {
        return super.o() - this.f7561b;
    }
}
