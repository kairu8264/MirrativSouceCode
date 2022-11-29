package ai;

/* loaded from: classes3.dex */
public final /* synthetic */ class az1 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final cn1 f2175w;

    public az1(cn1 cn1Var) {
        this.f2175w = cn1Var;
    }

    public static Runnable a(cn1 cn1Var) {
        return new az1(cn1Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2175w.b();
    }
}
