package ai;

/* loaded from: classes3.dex */
public final class k02 implements e43<ty0> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l02 f6018a;

    public k02(l02 l02Var) {
        this.f6018a = l02Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        rz0 rz0Var;
        x41 x41Var;
        rz0Var = this.f6018a.f6433a;
        sr h10 = rz0Var.b().h(th2);
        x41Var = this.f6018a.f6436d;
        x41Var.z(h10);
        om2.a(h10.f9916w, th2, "DelayedBannerAd.onFailure");
    }

    @Override // ai.e43
    public final /* bridge */ /* synthetic */ void b(ty0 ty0Var) {
        ty0Var.a();
    }
}
