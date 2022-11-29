package ai;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class j62 extends zt {
    public final b62 A;
    public final ik2 B;
    public id1 C;
    public boolean D = ((Boolean) ft.c().c(ox.f8093t0)).booleanValue();

    /* renamed from: w  reason: collision with root package name */
    public final fs f5632w;

    /* renamed from: x  reason: collision with root package name */
    public final Context f5633x;

    /* renamed from: y  reason: collision with root package name */
    public final hj2 f5634y;

    /* renamed from: z  reason: collision with root package name */
    public final String f5635z;

    public j62(Context context, fs fsVar, String str, hj2 hj2Var, b62 b62Var, ik2 ik2Var) {
        this.f5632w = fsVar;
        this.f5635z = str;
        this.f5633x = context;
        this.f5634y = hj2Var;
        this.A = b62Var;
        this.B = ik2Var;
    }

    @Override // ai.au
    public final pv B0() {
        return null;
    }

    @Override // ai.au
    public final void E1(eu euVar) {
        rh.p.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // ai.au
    public final synchronized void E3(yh.a aVar) {
        if (this.C == null) {
            uj0.f("Interstitial can not be shown before loaded.");
            this.A.n(tm2.d(9, null, null));
            return;
        }
        this.C.g(this.D, (Activity) yh.b.z0(aVar));
    }

    @Override // ai.au
    public final synchronized boolean G() {
        return this.f5634y.zzb();
    }

    @Override // ai.au
    public final void H2(zc0 zc0Var) {
    }

    @Override // ai.au
    public final nt K() {
        return this.A.c();
    }

    @Override // ai.au
    public final void N1(pu puVar) {
        this.A.N(puVar);
    }

    @Override // ai.au
    public final synchronized String O() {
        return this.f5635z;
    }

    @Override // ai.au
    public final void O3(ls lsVar) {
    }

    @Override // ai.au
    public final void P1(String str) {
    }

    @Override // ai.au
    public final void T3(uw uwVar) {
    }

    @Override // ai.au
    public final void V0(String str) {
    }

    @Override // ai.au
    public final void V1(jt jtVar) {
    }

    @Override // ai.au
    public final void V3(as asVar, qt qtVar) {
        this.A.M(qtVar);
        e4(asVar);
    }

    @Override // ai.au
    public final void X4(lu luVar) {
    }

    public final synchronized boolean d() {
        boolean z10;
        id1 id1Var = this.C;
        if (id1Var != null) {
            z10 = id1Var.h() ? false : true;
        }
        return z10;
    }

    @Override // ai.au
    public final synchronized void d1(ky kyVar) {
        rh.p.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f5634y.f(kyVar);
    }

    @Override // ai.au
    public final synchronized boolean e4(as asVar) {
        rh.p.d("loadAd must be called on the main UI thread.");
        wg.t.d();
        if (yg.d2.k(this.f5633x) && asVar.O == null) {
            uj0.c("Failed to load the ad because app ID is missing.");
            b62 b62Var = this.A;
            if (b62Var != null) {
                b62Var.z(tm2.d(4, null, null));
            }
            return false;
        } else if (d()) {
            return false;
        } else {
            om2.b(this.f5633x, asVar.B);
            this.C = null;
            return this.f5634y.a(asVar, this.f5635z, new aj2(this.f5632w), new i62(this));
        }
    }

    @Override // ai.au
    public final synchronized void g() {
        rh.p.d("destroy must be called on the main UI thread.");
        id1 id1Var = this.C;
        if (id1Var != null) {
            id1Var.c().U0(null);
        }
    }

    @Override // ai.au
    public final yh.a h() {
        return null;
    }

    @Override // ai.au
    public final synchronized boolean i() {
        rh.p.d("isLoaded must be called on the main UI thread.");
        return d();
    }

    @Override // ai.au
    public final void i1(ff0 ff0Var) {
        this.B.M(ff0Var);
    }

    @Override // ai.au
    public final synchronized void k() {
        rh.p.d("pause must be called on the main UI thread.");
        id1 id1Var = this.C;
        if (id1Var != null) {
            id1Var.c().S0(null);
        }
    }

    @Override // ai.au
    public final void l5(iv ivVar) {
        rh.p.d("setPaidEventListener must be called on the main UI thread.");
        this.A.K(ivVar);
    }

    @Override // ai.au
    public final void m() {
    }

    @Override // ai.au
    public final void m1(om omVar) {
    }

    @Override // ai.au
    public final synchronized void n() {
        rh.p.d("resume must be called on the main UI thread.");
        id1 id1Var = this.C;
        if (id1Var != null) {
            id1Var.c().T0(null);
        }
    }

    @Override // ai.au
    public final synchronized void n0(boolean z10) {
        rh.p.d("setImmersiveMode must be called on the main UI thread.");
        this.D = z10;
    }

    @Override // ai.au
    public final synchronized void q() {
        rh.p.d("showInterstitial must be called on the main UI thread.");
        id1 id1Var = this.C;
        if (id1Var == null) {
            uj0.f("Interstitial can not be shown before loaded.");
            this.A.n(tm2.d(9, null, null));
            return;
        }
        id1Var.g(this.D, null);
    }

    @Override // ai.au
    public final void q1(nt ntVar) {
        rh.p.d("setAdListener must be called on the main UI thread.");
        this.A.y(ntVar);
    }

    @Override // ai.au
    public final fs r() {
        return null;
    }

    @Override // ai.au
    public final void s1(tv tvVar) {
    }

    @Override // ai.au
    public final void s2(hu huVar) {
        rh.p.d("setAppEventListener must be called on the main UI thread.");
        this.A.A(huVar);
    }

    @Override // ai.au
    public final void t2(boolean z10) {
    }

    @Override // ai.au
    public final synchronized String u() {
        id1 id1Var = this.C;
        if (id1Var == null || id1Var.d() == null) {
            return null;
        }
        return this.C.d().c();
    }

    @Override // ai.au
    public final Bundle w() {
        rh.p.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // ai.au
    public final hu x() {
        return this.A.t();
    }

    @Override // ai.au
    public final synchronized lv y() {
        if (((Boolean) ft.c().c(ox.f7952b5)).booleanValue()) {
            id1 id1Var = this.C;
            if (id1Var == null) {
                return null;
            }
            return id1Var.d();
        }
        return null;
    }

    @Override // ai.au
    public final synchronized String z() {
        id1 id1Var = this.C;
        if (id1Var == null || id1Var.d() == null) {
            return null;
        }
        return this.C.d().c();
    }

    @Override // ai.au
    public final void z3(fs fsVar) {
    }

    @Override // ai.au
    public final void z5(ed0 ed0Var, String str) {
    }
}
