package pi;

/* loaded from: classes3.dex */
public final class q8 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ g3 f48177w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ v8 f48178x;

    public q8(v8 v8Var, g3 g3Var) {
        this.f48178x = v8Var;
        this.f48177w = g3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48178x) {
            this.f48178x.f48288w = false;
            if (!this.f48178x.f48290y.y()) {
                this.f48178x.f48290y.f48285a.r().u().a("Connected to service");
                this.f48178x.f48290y.w(this.f48177w);
            }
        }
    }
}
