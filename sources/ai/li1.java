package ai;

/* loaded from: classes3.dex */
public final class li1 implements p51 {

    /* renamed from: w  reason: collision with root package name */
    public final og1 f6571w;

    /* renamed from: x  reason: collision with root package name */
    public final tg1 f6572x;

    public li1(og1 og1Var, tg1 tg1Var) {
        this.f6571w = og1Var;
        this.f6572x = tg1Var;
    }

    @Override // ai.p51
    public final void f() {
        if (this.f6571w.u() == null) {
            return;
        }
        rp0 t10 = this.f6571w.t();
        rp0 r10 = this.f6571w.r();
        if (t10 == null) {
            t10 = r10 != null ? r10 : null;
        }
        if (!this.f6572x.d() || t10 == null) {
            return;
        }
        t10.j0("onSdkImpression", new s.a());
    }
}
