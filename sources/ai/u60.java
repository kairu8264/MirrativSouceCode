package ai;

/* loaded from: classes3.dex */
public final /* synthetic */ class u60 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final e60 f10614w;

    public u60(e60 e60Var) {
        this.f10614w = e60Var;
    }

    public static Runnable a(e60 e60Var) {
        return new u60(e60Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10614w.h();
    }
}
