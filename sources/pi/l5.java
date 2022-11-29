package pi;

/* loaded from: classes3.dex */
public final class l5 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ na f48020w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ u5 f48021x;

    public l5(u5 u5Var, na naVar) {
        this.f48021x = u5Var;
        this.f48020w = naVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ba baVar;
        ba baVar2;
        baVar = this.f48021x.f48261w;
        baVar.d();
        baVar2 = this.f48021x.f48261w;
        na naVar = this.f48020w;
        baVar2.a().f();
        baVar2.e();
        rh.p.e(naVar.f48080w);
        baVar2.R(naVar);
    }
}
