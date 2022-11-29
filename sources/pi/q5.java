package pi;

/* loaded from: classes3.dex */
public final class q5 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ea f48168w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ na f48169x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ u5 f48170y;

    public q5(u5 u5Var, ea eaVar, na naVar) {
        this.f48170y = u5Var;
        this.f48168w = eaVar;
        this.f48169x = naVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ba baVar;
        ba baVar2;
        ba baVar3;
        baVar = this.f48170y.f48261w;
        baVar.d();
        if (this.f48168w.p() == null) {
            baVar3 = this.f48170y.f48261w;
            baVar3.s(this.f48168w, this.f48169x);
            return;
        }
        baVar2 = this.f48170y.f48261w;
        baVar2.y(this.f48168w, this.f48169x);
    }
}
