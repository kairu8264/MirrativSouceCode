package pi;

/* loaded from: classes3.dex */
public final class d5 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ c f47761w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ na f47762x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ u5 f47763y;

    public d5(u5 u5Var, c cVar, na naVar) {
        this.f47763y = u5Var;
        this.f47761w = cVar;
        this.f47762x = naVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ba baVar;
        ba baVar2;
        ba baVar3;
        baVar = this.f47763y.f48261w;
        baVar.d();
        if (this.f47761w.f47682y.p() == null) {
            baVar3 = this.f47763y.f48261w;
            baVar3.q(this.f47761w, this.f47762x);
            return;
        }
        baVar2 = this.f47763y.f48261w;
        baVar2.w(this.f47761w, this.f47762x);
    }
}
