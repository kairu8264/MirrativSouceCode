package ai;

/* loaded from: classes3.dex */
public final /* synthetic */ class eq0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final rp0 f3743w;

    public eq0(rp0 rp0Var) {
        this.f3743w = rp0Var;
    }

    public static Runnable a(rp0 rp0Var) {
        return new eq0(rp0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3743w.destroy();
    }
}
