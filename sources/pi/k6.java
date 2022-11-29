package pi;

/* loaded from: classes3.dex */
public final class k6 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f47998w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ i7 f47999x;

    public k6(i7 i7Var, boolean z10) {
        this.f47999x = i7Var;
        this.f47998w = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean m10 = this.f47999x.f48285a.m();
        boolean l10 = this.f47999x.f48285a.l();
        this.f47999x.f48285a.i(this.f47998w);
        if (l10 == this.f47998w) {
            this.f47999x.f48285a.r().u().b("Default data collection state already set to", Boolean.valueOf(this.f47998w));
        }
        if (this.f47999x.f48285a.m() == m10 || this.f47999x.f48285a.m() != this.f47999x.f48285a.l()) {
            this.f47999x.f48285a.r().w().c("Default data collection is different than actual status", Boolean.valueOf(this.f47998w), Boolean.valueOf(m10));
        }
        this.f47999x.R();
    }
}
