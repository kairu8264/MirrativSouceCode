package ai;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class b52 extends zt {
    public final ViewGroup A;

    /* renamed from: w  reason: collision with root package name */
    public final Context f2244w;

    /* renamed from: x  reason: collision with root package name */
    public final nt f2245x;

    /* renamed from: y  reason: collision with root package name */
    public final yl2 f2246y;

    /* renamed from: z  reason: collision with root package name */
    public final ty0 f2247z;

    public b52(Context context, nt ntVar, yl2 yl2Var, ty0 ty0Var) {
        this.f2244w = context;
        this.f2245x = ntVar;
        this.f2246y = yl2Var;
        this.f2247z = ty0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        frameLayout.addView(ty0Var.g(), wg.t.f().j());
        frameLayout.setMinimumHeight(r().f4175y);
        frameLayout.setMinimumWidth(r().B);
        this.A = frameLayout;
    }

    @Override // ai.au
    public final pv B0() throws RemoteException {
        return this.f2247z.i();
    }

    @Override // ai.au
    public final void E1(eu euVar) throws RemoteException {
        uj0.e("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // ai.au
    public final void E3(yh.a aVar) {
    }

    @Override // ai.au
    public final boolean G() throws RemoteException {
        return false;
    }

    @Override // ai.au
    public final void H2(zc0 zc0Var) throws RemoteException {
    }

    @Override // ai.au
    public final nt K() throws RemoteException {
        return this.f2245x;
    }

    @Override // ai.au
    public final void N1(pu puVar) {
    }

    @Override // ai.au
    public final String O() throws RemoteException {
        return this.f2246y.f12652f;
    }

    @Override // ai.au
    public final void O3(ls lsVar) throws RemoteException {
    }

    @Override // ai.au
    public final void P1(String str) throws RemoteException {
    }

    @Override // ai.au
    public final void T3(uw uwVar) throws RemoteException {
        uj0.e("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // ai.au
    public final void V0(String str) throws RemoteException {
    }

    @Override // ai.au
    public final void V1(jt jtVar) throws RemoteException {
        uj0.e("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // ai.au
    public final void V3(as asVar, qt qtVar) {
    }

    @Override // ai.au
    public final void X4(lu luVar) throws RemoteException {
        uj0.e("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // ai.au
    public final void d1(ky kyVar) throws RemoteException {
        uj0.e("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // ai.au
    public final boolean e4(as asVar) throws RemoteException {
        uj0.e("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // ai.au
    public final void g() throws RemoteException {
        rh.p.d("destroy must be called on the main UI thread.");
        this.f2247z.b();
    }

    @Override // ai.au
    public final yh.a h() throws RemoteException {
        return yh.b.h1(this.A);
    }

    @Override // ai.au
    public final boolean i() throws RemoteException {
        return false;
    }

    @Override // ai.au
    public final void i1(ff0 ff0Var) throws RemoteException {
    }

    @Override // ai.au
    public final void k() throws RemoteException {
        rh.p.d("destroy must be called on the main UI thread.");
        this.f2247z.c().S0(null);
    }

    @Override // ai.au
    public final void l5(iv ivVar) {
        uj0.e("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // ai.au
    public final void m() throws RemoteException {
        this.f2247z.m();
    }

    @Override // ai.au
    public final void m1(om omVar) throws RemoteException {
    }

    @Override // ai.au
    public final void n() throws RemoteException {
        rh.p.d("destroy must be called on the main UI thread.");
        this.f2247z.c().T0(null);
    }

    @Override // ai.au
    public final void n0(boolean z10) throws RemoteException {
    }

    @Override // ai.au
    public final void q() throws RemoteException {
    }

    @Override // ai.au
    public final void q1(nt ntVar) throws RemoteException {
        uj0.e("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // ai.au
    public final fs r() {
        rh.p.d("getAdSize must be called on the main UI thread.");
        return cm2.b(this.f2244w, Collections.singletonList(this.f2247z.j()));
    }

    @Override // ai.au
    public final void s1(tv tvVar) throws RemoteException {
    }

    @Override // ai.au
    public final void s2(hu huVar) throws RemoteException {
        b62 b62Var = this.f2246y.f12649c;
        if (b62Var != null) {
            b62Var.A(huVar);
        }
    }

    @Override // ai.au
    public final void t2(boolean z10) throws RemoteException {
        uj0.e("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // ai.au
    public final String u() throws RemoteException {
        if (this.f2247z.d() != null) {
            return this.f2247z.d().c();
        }
        return null;
    }

    @Override // ai.au
    public final Bundle w() throws RemoteException {
        uj0.e("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // ai.au
    public final hu x() throws RemoteException {
        return this.f2246y.f12660n;
    }

    @Override // ai.au
    public final lv y() {
        return this.f2247z.d();
    }

    @Override // ai.au
    public final String z() throws RemoteException {
        if (this.f2247z.d() != null) {
            return this.f2247z.d().c();
        }
        return null;
    }

    @Override // ai.au
    public final void z3(fs fsVar) throws RemoteException {
        rh.p.d("setAdSize must be called on the main UI thread.");
        ty0 ty0Var = this.f2247z;
        if (ty0Var != null) {
            ty0Var.h(this.A, fsVar);
        }
    }

    @Override // ai.au
    public final void z5(ed0 ed0Var, String str) throws RemoteException {
    }
}
