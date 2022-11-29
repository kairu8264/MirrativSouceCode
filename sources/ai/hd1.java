package ai;

/* loaded from: classes3.dex */
public final /* synthetic */ class hd1 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final rp0 f4823w;

    public hd1(rp0 rp0Var) {
        this.f4823w = rp0Var;
    }

    public static Runnable a(rp0 rp0Var) {
        return new hd1(rp0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4823w.destroy();
    }
}
