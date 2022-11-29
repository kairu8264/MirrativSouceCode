package ai;

/* loaded from: classes3.dex */
public final /* synthetic */ class r02 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final cn1 f9284w;

    public r02(cn1 cn1Var) {
        this.f9284w = cn1Var;
    }

    public static Runnable a(cn1 cn1Var) {
        return new r02(cn1Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9284w.b();
    }
}
