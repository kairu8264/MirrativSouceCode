package ai;

/* loaded from: classes3.dex */
public final class n34 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final w34 f7174w;

    /* renamed from: x  reason: collision with root package name */
    public final c44 f7175x;

    /* renamed from: y  reason: collision with root package name */
    public final Runnable f7176y;

    public n34(w34 w34Var, c44 c44Var, Runnable runnable) {
        this.f7174w = w34Var;
        this.f7175x = c44Var;
        this.f7176y = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7174w.s();
        if (this.f7175x.c()) {
            this.f7174w.z(this.f7175x.f2709a);
        } else {
            this.f7174w.A(this.f7175x.f2711c);
        }
        if (this.f7175x.f2712d) {
            this.f7174w.h("intermediate-response");
        } else {
            this.f7174w.i("done");
        }
        Runnable runnable = this.f7176y;
        if (runnable != null) {
            runnable.run();
        }
    }
}
