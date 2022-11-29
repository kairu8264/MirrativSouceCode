package ai;

/* loaded from: classes3.dex */
public final class px3 implements pv3 {

    /* renamed from: w  reason: collision with root package name */
    public final long f8729w;

    /* renamed from: x  reason: collision with root package name */
    public final pv3 f8730x;

    public px3(long j10, pv3 pv3Var) {
        this.f8729w = j10;
        this.f8730x = pv3Var;
    }

    @Override // ai.pv3
    public final pw3 p(int i10, int i11) {
        return this.f8730x.p(i10, i11);
    }

    @Override // ai.pv3
    public final void s(lw3 lw3Var) {
        this.f8730x.s(new ox3(this, lw3Var));
    }

    @Override // ai.pv3
    public final void x() {
        this.f8730x.x();
    }
}
