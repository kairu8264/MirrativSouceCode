package rh;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes3.dex */
public final class c1 extends s0 {

    /* renamed from: w  reason: collision with root package name */
    public c f51412w;

    /* renamed from: x  reason: collision with root package name */
    public final int f51413x;

    public c1(c cVar, int i10) {
        this.f51412w = cVar;
        this.f51413x = i10;
    }

    @Override // rh.k
    public final void A0(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // rh.k
    public final void N4(int i10, IBinder iBinder, g1 g1Var) {
        c cVar = this.f51412w;
        p.j(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        p.i(g1Var);
        c.a0(cVar, g1Var);
        U1(i10, iBinder, g1Var.f51449w);
    }

    @Override // rh.k
    public final void U1(int i10, IBinder iBinder, Bundle bundle) {
        p.j(this.f51412w, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f51412w.L(i10, iBinder, bundle, this.f51413x);
        this.f51412w = null;
    }
}
