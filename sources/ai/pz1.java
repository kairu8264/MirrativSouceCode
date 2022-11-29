package ai;

/* loaded from: classes3.dex */
public final /* synthetic */ class pz1 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final rp0 f8746w;

    public pz1(rp0 rp0Var) {
        this.f8746w = rp0Var;
    }

    public static Runnable a(rp0 rp0Var) {
        return new pz1(rp0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8746w.F();
    }
}
