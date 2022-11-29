package ai;

/* loaded from: classes3.dex */
public final class kx1 implements dq2 {

    /* renamed from: w  reason: collision with root package name */
    public final hx1 f6393w;

    public kx1(hx1 hx1Var) {
        this.f6393w = hx1Var;
    }

    @Override // ai.dq2
    public final void A(wp2 wp2Var, String str) {
    }

    @Override // ai.dq2
    public final void K(wp2 wp2Var, String str) {
        if (((Boolean) ft.c().c(ox.f8129x4)).booleanValue() && wp2.RENDERER == wp2Var) {
            this.f6393w.e(wg.t.k().elapsedRealtime());
        }
    }

    @Override // ai.dq2
    public final void c(wp2 wp2Var, String str) {
        if (((Boolean) ft.c().c(ox.f8129x4)).booleanValue() && wp2.RENDERER == wp2Var && this.f6393w.f() != 0) {
            this.f6393w.g(wg.t.k().elapsedRealtime() - this.f6393w.f());
        }
    }

    @Override // ai.dq2
    public final void n(wp2 wp2Var, String str, Throwable th2) {
        if (((Boolean) ft.c().c(ox.f8129x4)).booleanValue() && wp2.RENDERER == wp2Var && this.f6393w.f() != 0) {
            this.f6393w.g(wg.t.k().elapsedRealtime() - this.f6393w.f());
        }
    }
}
