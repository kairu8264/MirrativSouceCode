package pi;

/* loaded from: classes3.dex */
public final class m implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ x5 f48034w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ n f48035x;

    public m(n nVar, x5 x5Var) {
        this.f48035x = nVar;
        this.f48034w = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48034w.b();
        if (b.a()) {
            this.f48034w.a().y(this);
            return;
        }
        boolean e10 = this.f48035x.e();
        this.f48035x.f48057c = 0L;
        if (e10) {
            this.f48035x.c();
        }
    }
}
