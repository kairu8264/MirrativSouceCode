package pi;

/* loaded from: classes3.dex */
public final class k5 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ na f47996w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ u5 f47997x;

    public k5(u5 u5Var, na naVar) {
        this.f47997x = u5Var;
        this.f47996w = naVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ba baVar;
        ba baVar2;
        baVar = this.f47997x.f48261w;
        baVar.d();
        baVar2 = this.f47997x.f48261w;
        baVar2.t(this.f47996w);
    }
}
