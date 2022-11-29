package ai;

/* loaded from: classes3.dex */
public final class sp2 implements e43 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ hp2 f9901a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ tp2 f9902b;

    public sp2(tp2 tp2Var, hp2 hp2Var) {
        this.f9902b = tp2Var;
        this.f9901a = hp2Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        vp2 vp2Var;
        vp2Var = this.f9902b.f10374f.f10792c;
        vp2Var.e0(this.f9901a, th2);
    }

    @Override // ai.e43
    public final void b(Object obj) {
        vp2 vp2Var;
        vp2Var = this.f9902b.f10374f.f10792c;
        vp2Var.b0(this.f9901a);
    }
}
