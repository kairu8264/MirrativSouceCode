package pi;

/* loaded from: classes3.dex */
public final class a9 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ba f47594w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Runnable f47595x;

    public a9(c9 c9Var, ba baVar, Runnable runnable) {
        this.f47594w = baVar;
        this.f47595x = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47594w.d();
        this.f47594w.k0(this.f47595x);
        this.f47594w.z();
    }
}
