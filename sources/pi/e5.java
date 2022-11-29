package pi;

/* loaded from: classes3.dex */
public final class e5 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ c f47780w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ u5 f47781x;

    public e5(u5 u5Var, c cVar) {
        this.f47781x = u5Var;
        this.f47780w = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ba baVar;
        ba baVar2;
        ba baVar3;
        baVar = this.f47781x.f48261w;
        baVar.d();
        if (this.f47780w.f47682y.p() == null) {
            baVar3 = this.f47781x.f48261w;
            baVar3.p(this.f47780w);
            return;
        }
        baVar2 = this.f47781x.f48261w;
        baVar2.v(this.f47780w);
    }
}
