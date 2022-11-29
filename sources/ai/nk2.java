package ai;

/* loaded from: classes3.dex */
public final /* synthetic */ class nk2 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final ik2 f7374w;

    public nk2(ik2 ik2Var) {
        this.f7374w = ik2Var;
    }

    public static Runnable a(ik2 ik2Var) {
        return new nk2(ik2Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7374w.a();
    }
}
