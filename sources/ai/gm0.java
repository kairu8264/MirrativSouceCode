package ai;

/* loaded from: classes3.dex */
public final class gm0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final rl0 f4514w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f4515x = false;

    public gm0(rl0 rl0Var) {
        this.f4514w = rl0Var;
    }

    public final void a() {
        this.f4515x = true;
        this.f4514w.n();
    }

    public final void b() {
        this.f4515x = false;
        c();
    }

    public final void c() {
        ow2 ow2Var = yg.d2.f61866i;
        ow2Var.removeCallbacks(this);
        ow2Var.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4515x) {
            return;
        }
        this.f4514w.n();
        c();
    }
}
