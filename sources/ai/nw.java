package ai;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class nw extends rf0 {
    public static void S5(final zf0 zf0Var) {
        uj0.c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        nj0.f7362b.post(new Runnable(zf0Var) { // from class: ai.mw

            /* renamed from: w  reason: collision with root package name */
            public final zf0 f7075w;

            {
                this.f7075w = zf0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zf0 zf0Var2 = this.f7075w;
                if (zf0Var2 != null) {
                    try {
                        zf0Var2.E(1);
                    } catch (RemoteException e10) {
                        uj0.i("#007 Could not call remote method.", e10);
                    }
                }
            }
        });
    }

    @Override // ai.sf0
    public final void G0(boolean z10) {
    }

    @Override // ai.sf0
    public final void G5(as asVar, zf0 zf0Var) throws RemoteException {
        S5(zf0Var);
    }

    @Override // ai.sf0
    public final void H1(yh.a aVar, boolean z10) {
    }

    @Override // ai.sf0
    public final void S(yh.a aVar) throws RemoteException {
    }

    @Override // ai.sf0
    public final void U4(hg0 hg0Var) {
    }

    @Override // ai.sf0
    public final Bundle f() throws RemoteException {
        return new Bundle();
    }

    @Override // ai.sf0
    public final void f3(fv fvVar) throws RemoteException {
    }

    @Override // ai.sf0
    public final String g() throws RemoteException {
        return "";
    }

    @Override // ai.sf0
    public final boolean h() throws RemoteException {
        return false;
    }

    @Override // ai.sf0
    public final pf0 j() {
        return null;
    }

    @Override // ai.sf0
    public final lv k() {
        return null;
    }

    @Override // ai.sf0
    public final void o4(vf0 vf0Var) throws RemoteException {
    }

    @Override // ai.sf0
    public final void r5(bg0 bg0Var) throws RemoteException {
    }

    @Override // ai.sf0
    public final void t5(as asVar, zf0 zf0Var) throws RemoteException {
        S5(zf0Var);
    }

    @Override // ai.sf0
    public final void u1(iv ivVar) {
    }
}
