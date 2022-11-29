package ai;

/* loaded from: classes3.dex */
public final /* synthetic */ class x22 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final cn1 f11845w;

    public x22(cn1 cn1Var) {
        this.f11845w = cn1Var;
    }

    public static Runnable a(cn1 cn1Var) {
        return new x22(cn1Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11845w.b();
    }
}
