package ai;

/* loaded from: classes3.dex */
public final /* synthetic */ class bm1 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final rp0 f2402w;

    public bm1(rp0 rp0Var) {
        this.f2402w = rp0Var;
    }

    public static Runnable a(rp0 rp0Var) {
        return new bm1(rp0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2402w.destroy();
    }
}
