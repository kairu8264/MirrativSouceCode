package ai;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class cl2 extends bf0 {
    public boolean A = false;

    /* renamed from: w  reason: collision with root package name */
    public final sk2 f2862w;

    /* renamed from: x  reason: collision with root package name */
    public final ik2 f2863x;

    /* renamed from: y  reason: collision with root package name */
    public final tl2 f2864y;

    /* renamed from: z  reason: collision with root package name */
    public cm1 f2865z;

    public cl2(sk2 sk2Var, ik2 ik2Var, tl2 tl2Var) {
        this.f2862w = sk2Var;
        this.f2863x = ik2Var;
        this.f2864y = tl2Var;
    }

    @Override // ai.cf0
    public final synchronized void M3(gf0 gf0Var) throws RemoteException {
        rh.p.d("loadAd must be called on the main UI thread.");
        String str = gf0Var.f4408x;
        String str2 = (String) ft.c().c(ox.J3);
        if (str2 != null && str != null) {
            try {
                if (Pattern.matches(str2, str)) {
                    return;
                }
            } catch (RuntimeException e10) {
                wg.t.h().k(e10, "NonagonUtil.isPatternMatched");
            }
        }
        if (N()) {
            if (!((Boolean) ft.c().c(ox.L3)).booleanValue()) {
                return;
            }
        }
        kk2 kk2Var = new kk2(null);
        this.f2865z = null;
        this.f2862w.h(1);
        this.f2862w.a(gf0Var.f4407w, gf0Var.f4408x, kk2Var, new al2(this));
    }

    public final synchronized boolean N() {
        boolean z10;
        cm1 cm1Var = this.f2865z;
        if (cm1Var != null) {
            z10 = cm1Var.j() ? false : true;
        }
        return z10;
    }

    @Override // ai.cf0
    public final synchronized void V(String str) throws RemoteException {
        rh.p.d("setUserId must be called on the main UI thread.");
        this.f2864y.f10349a = str;
    }

    @Override // ai.cf0
    public final synchronized void X(yh.a aVar) {
        rh.p.d("pause must be called on the main UI thread.");
        if (this.f2865z != null) {
            this.f2865z.c().S0(aVar == null ? null : (Context) yh.b.z0(aVar));
        }
    }

    @Override // ai.cf0
    public final void X0(eu euVar) {
        rh.p.d("setAdMetadataListener can only be called from the UI thread.");
        if (euVar == null) {
            this.f2863x.A(null);
        } else {
            this.f2863x.A(new bl2(this, euVar));
        }
    }

    @Override // ai.cf0
    public final synchronized void Y2(String str) throws RemoteException {
        rh.p.d("#008 Must be called on the main UI thread.: setCustomData");
        this.f2864y.f10350b = str;
    }

    @Override // ai.cf0
    public final void a() {
        X(null);
    }

    @Override // ai.cf0
    public final synchronized void b() throws RemoteException {
        x5(null);
    }

    @Override // ai.cf0
    public final boolean c() throws RemoteException {
        rh.p.d("isLoaded must be called on the main UI thread.");
        return N();
    }

    @Override // ai.cf0
    public final void e() throws RemoteException {
        y0(null);
    }

    @Override // ai.cf0
    public final synchronized void e0(yh.a aVar) {
        rh.p.d("resume must be called on the main UI thread.");
        if (this.f2865z != null) {
            this.f2865z.c().T0(aVar == null ? null : (Context) yh.b.z0(aVar));
        }
    }

    @Override // ai.cf0
    public final void f() {
        e0(null);
    }

    @Override // ai.cf0
    public final synchronized void g5(boolean z10) {
        rh.p.d("setImmersiveMode must be called on the main UI thread.");
        this.A = z10;
    }

    @Override // ai.cf0
    public final synchronized String j() throws RemoteException {
        cm1 cm1Var = this.f2865z;
        if (cm1Var == null || cm1Var.d() == null) {
            return null;
        }
        return this.f2865z.d().c();
    }

    @Override // ai.cf0
    public final synchronized lv m() throws RemoteException {
        if (((Boolean) ft.c().c(ox.f7952b5)).booleanValue()) {
            cm1 cm1Var = this.f2865z;
            if (cm1Var != null) {
                return cm1Var.d();
            }
            return null;
        }
        return null;
    }

    @Override // ai.cf0
    public final Bundle o() {
        rh.p.d("getAdMetadata can only be called from the UI thread.");
        cm1 cm1Var = this.f2865z;
        return cm1Var != null ? cm1Var.l() : new Bundle();
    }

    @Override // ai.cf0
    public final boolean q() {
        cm1 cm1Var = this.f2865z;
        return cm1Var != null && cm1Var.k();
    }

    @Override // ai.cf0
    public final void q4(ff0 ff0Var) throws RemoteException {
        rh.p.d("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f2863x.M(ff0Var);
    }

    @Override // ai.cf0
    public final void r2(af0 af0Var) {
        rh.p.d("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f2863x.R(af0Var);
    }

    @Override // ai.cf0
    public final synchronized void x5(yh.a aVar) throws RemoteException {
        rh.p.d("showAd must be called on the main UI thread.");
        if (this.f2865z != null) {
            Activity activity = null;
            if (aVar != null) {
                Object z02 = yh.b.z0(aVar);
                if (z02 instanceof Activity) {
                    activity = (Activity) z02;
                }
            }
            this.f2865z.g(this.A, activity);
        }
    }

    @Override // ai.cf0
    public final synchronized void y0(yh.a aVar) {
        rh.p.d("destroy must be called on the main UI thread.");
        Context context = null;
        this.f2863x.A(null);
        if (this.f2865z != null) {
            if (aVar != null) {
                context = (Context) yh.b.z0(aVar);
            }
            this.f2865z.c().U0(context);
        }
    }
}
