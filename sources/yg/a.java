package yg;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ b0 f61845w;

    public a(b0 b0Var) {
        this.f61845w = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f61845w.f61856b = Thread.currentThread();
        this.f61845w.a();
    }
}
