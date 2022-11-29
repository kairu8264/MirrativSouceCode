package ai;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class g52 extends zt implements m71 {
    public fs A;
    public final wl2 B;
    public ty0 C;

    /* renamed from: w  reason: collision with root package name */
    public final Context f4345w;

    /* renamed from: x  reason: collision with root package name */
    public final nh2 f4346x;

    /* renamed from: y  reason: collision with root package name */
    public final String f4347y;

    /* renamed from: z  reason: collision with root package name */
    public final b62 f4348z;

    public g52(Context context, fs fsVar, String str, nh2 nh2Var, b62 b62Var) {
        this.f4345w = context;
        this.f4346x = nh2Var;
        this.A = fsVar;
        this.f4347y = str;
        this.f4348z = b62Var;
        this.B = nh2Var.k();
        nh2Var.m(this);
    }

    @Override // ai.au
    public final synchronized pv B0() {
        rh.p.d("getVideoController must be called from the main thread.");
        ty0 ty0Var = this.C;
        if (ty0Var != null) {
            return ty0Var.i();
        }
        return null;
    }

    @Override // ai.au
    public final void E1(eu euVar) {
        rh.p.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // ai.au
    public final void E3(yh.a aVar) {
    }

    @Override // ai.au
    public final synchronized boolean G() {
        return this.f4346x.zzb();
    }

    @Override // ai.au
    public final void H2(zc0 zc0Var) {
    }

    @Override // ai.au
    public final nt K() {
        return this.f4348z.c();
    }

    @Override // ai.au
    public final void N1(pu puVar) {
    }

    @Override // ai.au
    public final synchronized String O() {
        return this.f4347y;
    }

    @Override // ai.au
    public final void O3(ls lsVar) {
    }

    @Override // ai.au
    public final void P1(String str) {
    }

    @Override // ai.au
    public final synchronized void T3(uw uwVar) {
        rh.p.d("setVideoOptions must be called on the main UI thread.");
        this.B.N(uwVar);
    }

    public final synchronized void T5(fs fsVar) {
        this.B.I(fsVar);
        this.B.J(this.A.J);
    }

    public final synchronized boolean U5(as asVar) throws RemoteException {
        rh.p.d("loadAd must be called on the main UI thread.");
        wg.t.d();
        if (yg.d2.k(this.f4345w) && asVar.O == null) {
            uj0.c("Failed to load the ad because app ID is missing.");
            b62 b62Var = this.f4348z;
            if (b62Var != null) {
                b62Var.z(tm2.d(4, null, null));
            }
            return false;
        }
        om2.b(this.f4345w, asVar.B);
        return this.f4346x.a(asVar, this.f4347y, null, new f52(this));
    }

    @Override // ai.au
    public final void V0(String str) {
    }

    @Override // ai.au
    public final void V1(jt jtVar) {
        rh.p.d("setAdListener must be called on the main UI thread.");
        this.f4346x.j(jtVar);
    }

    @Override // ai.au
    public final void V3(as asVar, qt qtVar) {
    }

    @Override // ai.au
    public final synchronized void X4(lu luVar) {
        rh.p.d("setCorrelationIdProvider must be called on the main UI thread");
        this.B.o(luVar);
    }

    @Override // ai.au
    public final synchronized void d1(ky kyVar) {
        rh.p.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f4346x.i(kyVar);
    }

    @Override // ai.au
    public final synchronized boolean e4(as asVar) throws RemoteException {
        T5(this.A);
        return U5(asVar);
    }

    @Override // ai.au
    public final synchronized void g() {
        rh.p.d("destroy must be called on the main UI thread.");
        ty0 ty0Var = this.C;
        if (ty0Var != null) {
            ty0Var.b();
        }
    }

    @Override // ai.au
    public final yh.a h() {
        rh.p.d("destroy must be called on the main UI thread.");
        return yh.b.h1(this.f4346x.h());
    }

    @Override // ai.au
    public final boolean i() {
        return false;
    }

    @Override // ai.au
    public final void i1(ff0 ff0Var) {
    }

    @Override // ai.au
    public final synchronized void k() {
        rh.p.d("pause must be called on the main UI thread.");
        ty0 ty0Var = this.C;
        if (ty0Var != null) {
            ty0Var.c().S0(null);
        }
    }

    @Override // ai.au
    public final void l5(iv ivVar) {
        rh.p.d("setPaidEventListener must be called on the main UI thread.");
        this.f4348z.K(ivVar);
    }

    @Override // ai.au
    public final synchronized void m() {
        rh.p.d("recordManualImpression must be called on the main UI thread.");
        ty0 ty0Var = this.C;
        if (ty0Var != null) {
            ty0Var.m();
        }
    }

    @Override // ai.au
    public final void m1(om omVar) {
    }

    @Override // ai.au
    public final synchronized void n() {
        rh.p.d("resume must be called on the main UI thread.");
        ty0 ty0Var = this.C;
        if (ty0Var != null) {
            ty0Var.c().T0(null);
        }
    }

    @Override // ai.au
    public final void n0(boolean z10) {
    }

    @Override // ai.au
    public final void q() {
    }

    @Override // ai.au
    public final void q1(nt ntVar) {
        rh.p.d("setAdListener must be called on the main UI thread.");
        this.f4348z.y(ntVar);
    }

    @Override // ai.au
    public final synchronized fs r() {
        rh.p.d("getAdSize must be called on the main UI thread.");
        ty0 ty0Var = this.C;
        if (ty0Var != null) {
            return cm2.b(this.f4345w, Collections.singletonList(ty0Var.j()));
        }
        return this.B.K();
    }

    @Override // ai.au
    public final void s1(tv tvVar) {
    }

    @Override // ai.au
    public final void s2(hu huVar) {
        rh.p.d("setAppEventListener must be called on the main UI thread.");
        this.f4348z.A(huVar);
    }

    @Override // ai.au
    public final synchronized void t2(boolean z10) {
        rh.p.d("setManualImpressionsEnabled must be called from the main thread.");
        this.B.a(z10);
    }

    @Override // ai.au
    public final synchronized String u() {
        ty0 ty0Var = this.C;
        if (ty0Var == null || ty0Var.d() == null) {
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
        return this.f4348z.t();
    }

    @Override // ai.au
    public final synchronized lv y() {
        if (((Boolean) ft.c().c(ox.f7952b5)).booleanValue()) {
            ty0 ty0Var = this.C;
            if (ty0Var == null) {
                return null;
            }
            return ty0Var.d();
        }
        return null;
    }

    @Override // ai.au
    public final synchronized String z() {
        ty0 ty0Var = this.C;
        if (ty0Var == null || ty0Var.d() == null) {
            return null;
        }
        return this.C.d().c();
    }

    @Override // ai.au
    public final synchronized void z3(fs fsVar) {
        rh.p.d("setAdSize must be called on the main UI thread.");
        this.B.I(fsVar);
        this.A = fsVar;
        ty0 ty0Var = this.C;
        if (ty0Var != null) {
            ty0Var.h(this.f4346x.h(), fsVar);
        }
    }

    @Override // ai.au
    public final void z5(ed0 ed0Var, String str) {
    }

    @Override // ai.m71
    public final synchronized void zza() {
        if (this.f4346x.l()) {
            fs K = this.B.K();
            ty0 ty0Var = this.C;
            if (ty0Var != null && ty0Var.k() != null && this.B.m()) {
                K = cm2.b(this.f4345w, Collections.singletonList(this.C.k()));
            }
            T5(K);
            try {
                U5(this.B.H());
                return;
            } catch (RemoteException unused) {
                uj0.f("Failed to refresh the banner ad.");
                return;
            }
        }
        this.f4346x.n();
    }
}
