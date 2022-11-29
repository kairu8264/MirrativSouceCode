package pi;

/* loaded from: classes3.dex */
public final class a5 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ f6 f47583w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ b5 f47584x;

    public a5(b5 b5Var, f6 f6Var) {
        this.f47584x = b5Var;
        this.f47583w = f6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b5.d(this.f47584x, this.f47583w);
        this.f47584x.k(this.f47583w.f47810g);
    }
}
