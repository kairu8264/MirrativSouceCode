package ai;

/* loaded from: classes3.dex */
public final /* synthetic */ class x60 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final e60 f11875w;

    public x60(e60 e60Var) {
        this.f11875w = e60Var;
    }

    public static Runnable a(e60 e60Var) {
        return new x60(e60Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11875w.h();
    }
}
