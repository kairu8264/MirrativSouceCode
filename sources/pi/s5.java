package pi;

/* loaded from: classes3.dex */
public final class s5 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ na f48215w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ u5 f48216x;

    public s5(u5 u5Var, na naVar) {
        this.f48216x = u5Var;
        this.f48215w = naVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ba baVar;
        ba baVar2;
        baVar = this.f48216x.f48261w;
        baVar.d();
        baVar2 = this.f48216x.f48261w;
        baVar2.n(this.f48215w);
    }
}
