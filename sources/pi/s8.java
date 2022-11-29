package pi;

/* loaded from: classes3.dex */
public final class s8 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ g3 f48220w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ v8 f48221x;

    public s8(v8 v8Var, g3 g3Var) {
        this.f48221x = v8Var;
        this.f48220w = g3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48221x) {
            this.f48221x.f48288w = false;
            if (!this.f48221x.f48290y.y()) {
                this.f48221x.f48290y.f48285a.r().o().a("Connected to remote service");
                this.f48221x.f48290y.w(this.f48220w);
            }
        }
    }
}
