package ai;

import com.google.android.gms.internal.ads.zzbye;

/* loaded from: classes3.dex */
public final class nb0 implements xg.q {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ zzbye f7251w;

    public nb0(zzbye zzbyeVar) {
        this.f7251w = zzbyeVar;
    }

    @Override // xg.q
    public final void B4() {
        uj0.a("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // xg.q
    public final void D5(int i10) {
        ah.n nVar;
        uj0.a("AdMobCustomTabsAdapter overlay is closed.");
        nVar = this.f7251w.f27268b;
        nVar.r(this.f7251w);
    }

    @Override // xg.q
    public final void c() {
    }

    @Override // xg.q
    public final void d() {
        uj0.a("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // xg.q
    public final void f4() {
        uj0.a("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // xg.q
    public final void s0() {
        ah.n nVar;
        uj0.a("Opening AdMobCustomTabsAdapter overlay.");
        nVar = this.f7251w.f27268b;
        nVar.s(this.f7251w);
    }
}
