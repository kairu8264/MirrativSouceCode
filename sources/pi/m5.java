package pi;

/* loaded from: classes3.dex */
public final class m5 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ na f48040w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ u5 f48041x;

    public m5(u5 u5Var, na naVar) {
        this.f48041x = u5Var;
        this.f48040w = naVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ba baVar;
        ba baVar2;
        baVar = this.f48041x.f48261w;
        baVar.d();
        baVar2 = this.f48041x.f48261w;
        na naVar = this.f48040w;
        baVar2.a().f();
        baVar2.e();
        rh.p.e(naVar.f48080w);
        h b10 = h.b(naVar.R);
        h U = baVar2.U(naVar.f48080w);
        baVar2.r().u().c("Setting consent, package, consent", naVar.f48080w, b10);
        baVar2.x(naVar.f48080w, b10);
        if (b10.m(U)) {
            baVar2.t(naVar);
        }
    }
}
