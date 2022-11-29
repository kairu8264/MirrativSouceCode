package ai;

/* loaded from: classes3.dex */
public final class y60 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ j70 f12465w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ e60 f12466x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ k70 f12467y;

    public y60(k70 k70Var, j70 j70Var, e60 e60Var) {
        this.f12467y = k70Var;
        this.f12465w = j70Var;
        this.f12466x = e60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.f12467y.f6106a;
        synchronized (obj) {
            if (this.f12465w.e() != -1 && this.f12465w.e() != 1) {
                this.f12465w.d();
                hk0.f4882e.execute(x60.a(this.f12466x));
                yg.p1.k("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
