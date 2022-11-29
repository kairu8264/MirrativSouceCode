package ai;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class wk2 extends rf0 {
    public final Context A;
    public cm1 B;
    public boolean C = ((Boolean) ft.c().c(ox.f8093t0)).booleanValue();

    /* renamed from: w  reason: collision with root package name */
    public final sk2 f11656w;

    /* renamed from: x  reason: collision with root package name */
    public final ik2 f11657x;

    /* renamed from: y  reason: collision with root package name */
    public final String f11658y;

    /* renamed from: z  reason: collision with root package name */
    public final tl2 f11659z;

    public wk2(String str, sk2 sk2Var, Context context, ik2 ik2Var, tl2 tl2Var) {
        this.f11658y = str;
        this.f11656w = sk2Var;
        this.f11657x = ik2Var;
        this.f11659z = tl2Var;
        this.A = context;
    }

    @Override // ai.sf0
    public final synchronized void G0(boolean z10) {
        rh.p.d("setImmersiveMode must be called on the main UI thread.");
        this.C = z10;
    }

    @Override // ai.sf0
    public final synchronized void G5(as asVar, zf0 zf0Var) throws RemoteException {
        U5(asVar, zf0Var, 3);
    }

    @Override // ai.sf0
    public final synchronized void H1(yh.a aVar, boolean z10) throws RemoteException {
        rh.p.d("#008 Must be called on the main UI thread.");
        if (this.B == null) {
            uj0.f("Rewarded can not be shown before loaded");
            this.f11657x.n(tm2.d(9, null, null));
            return;
        }
        this.B.g(z10, (Activity) yh.b.z0(aVar));
    }

    @Override // ai.sf0
    public final synchronized void S(yh.a aVar) throws RemoteException {
        H1(aVar, this.C);
    }

    @Override // ai.sf0
    public final synchronized void U4(hg0 hg0Var) {
        rh.p.d("#008 Must be called on the main UI thread.");
        tl2 tl2Var = this.f11659z;
        tl2Var.f10349a = hg0Var.f4840w;
        tl2Var.f10350b = hg0Var.f4841x;
    }

    public final synchronized void U5(as asVar, zf0 zf0Var, int i10) throws RemoteException {
        rh.p.d("#008 Must be called on the main UI thread.");
        this.f11657x.u(zf0Var);
        wg.t.d();
        if (yg.d2.k(this.A) && asVar.O == null) {
            uj0.c("Failed to load the ad because app ID is missing.");
            this.f11657x.z(tm2.d(4, null, null));
            return;
        }
        if (this.B != null) {
            return;
        }
        kk2 kk2Var = new kk2(null);
        this.f11656w.h(i10);
        this.f11656w.a(asVar, this.f11658y, kk2Var, new vk2(this));
    }

    @Override // ai.sf0
    public final Bundle f() {
        rh.p.d("#008 Must be called on the main UI thread.");
        cm1 cm1Var = this.B;
        return cm1Var != null ? cm1Var.l() : new Bundle();
    }

    @Override // ai.sf0
    public final void f3(fv fvVar) {
        if (fvVar == null) {
            this.f11657x.A(null);
        } else {
            this.f11657x.A(new uk2(this, fvVar));
        }
    }

    @Override // ai.sf0
    public final synchronized String g() throws RemoteException {
        cm1 cm1Var = this.B;
        if (cm1Var == null || cm1Var.d() == null) {
            return null;
        }
        return this.B.d().c();
    }

    @Override // ai.sf0
    public final boolean h() {
        rh.p.d("#008 Must be called on the main UI thread.");
        cm1 cm1Var = this.B;
        return (cm1Var == null || cm1Var.h()) ? false : true;
    }

    @Override // ai.sf0
    public final pf0 j() {
        rh.p.d("#008 Must be called on the main UI thread.");
        cm1 cm1Var = this.B;
        if (cm1Var != null) {
            return cm1Var.i();
        }
        return null;
    }

    @Override // ai.sf0
    public final lv k() {
        cm1 cm1Var;
        if (((Boolean) ft.c().c(ox.f7952b5)).booleanValue() && (cm1Var = this.B) != null) {
            return cm1Var.d();
        }
        return null;
    }

    @Override // ai.sf0
    public final void o4(vf0 vf0Var) {
        rh.p.d("#008 Must be called on the main UI thread.");
        this.f11657x.y(vf0Var);
    }

    @Override // ai.sf0
    public final void r5(bg0 bg0Var) {
        rh.p.d("#008 Must be called on the main UI thread.");
        this.f11657x.N(bg0Var);
    }

    @Override // ai.sf0
    public final synchronized void t5(as asVar, zf0 zf0Var) throws RemoteException {
        U5(asVar, zf0Var, 2);
    }

    @Override // ai.sf0
    public final void u1(iv ivVar) {
        rh.p.d("setOnPaidEventListener must be called on the main UI thread.");
        this.f11657x.K(ivVar);
    }
}
