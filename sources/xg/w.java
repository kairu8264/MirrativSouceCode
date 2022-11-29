package xg;

import ai.ft;
import ai.nc1;
import ai.or;
import ai.ox;
import ai.pc0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes3.dex */
public final class w extends pc0 {

    /* renamed from: w  reason: collision with root package name */
    public final AdOverlayInfoParcel f60288w;

    /* renamed from: x  reason: collision with root package name */
    public final Activity f60289x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f60290y = false;

    /* renamed from: z  reason: collision with root package name */
    public boolean f60291z = false;

    public w(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f60288w = adOverlayInfoParcel;
        this.f60289x = activity;
    }

    @Override // ai.qc0
    public final void a() throws RemoteException {
        q qVar = this.f60288w.f27152y;
        if (qVar != null) {
            qVar.c();
        }
    }

    @Override // ai.qc0
    public final void a0(Bundle bundle) {
        q qVar;
        if (((Boolean) ft.c().c(ox.f8051n6)).booleanValue()) {
            this.f60289x.requestWindowFeature(1);
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z10 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f60288w;
        if (adOverlayInfoParcel == null) {
            this.f60289x.finish();
        } else if (z10) {
            this.f60289x.finish();
        } else {
            if (bundle == null) {
                or orVar = adOverlayInfoParcel.f27151x;
                if (orVar != null) {
                    orVar.onAdClicked();
                }
                nc1 nc1Var = this.f60288w.U;
                if (nc1Var != null) {
                    nc1Var.zzb();
                }
                if (this.f60289x.getIntent() != null && this.f60289x.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (qVar = this.f60288w.f27152y) != null) {
                    qVar.s0();
                }
            }
            wg.t.b();
            Activity activity = this.f60289x;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f60288w;
            e eVar = adOverlayInfoParcel2.f27150w;
            if (a.b(activity, eVar, adOverlayInfoParcel2.E, eVar.E)) {
                return;
            }
            this.f60289x.finish();
        }
    }

    @Override // ai.qc0
    public final void c() throws RemoteException {
    }

    @Override // ai.qc0
    public final boolean f() throws RemoteException {
        return false;
    }

    @Override // ai.qc0
    public final void g() throws RemoteException {
    }

    @Override // ai.qc0
    public final void h() throws RemoteException {
    }

    @Override // ai.qc0
    public final void h0(yh.a aVar) throws RemoteException {
    }

    @Override // ai.qc0
    public final void i() throws RemoteException {
        if (this.f60290y) {
            this.f60289x.finish();
            return;
        }
        this.f60290y = true;
        q qVar = this.f60288w.f27152y;
        if (qVar != null) {
            qVar.B4();
        }
    }

    @Override // ai.qc0
    public final void j() throws RemoteException {
        q qVar = this.f60288w.f27152y;
        if (qVar != null) {
            qVar.f4();
        }
        if (this.f60289x.isFinishing()) {
            zzb();
        }
    }

    @Override // ai.qc0
    public final void l() throws RemoteException {
        if (this.f60289x.isFinishing()) {
            zzb();
        }
    }

    @Override // ai.qc0
    public final void l0(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f60290y);
    }

    @Override // ai.qc0
    public final void p() throws RemoteException {
        if (this.f60289x.isFinishing()) {
            zzb();
        }
    }

    @Override // ai.qc0
    public final void p1(int i10, int i11, Intent intent) throws RemoteException {
    }

    @Override // ai.qc0
    public final void q() throws RemoteException {
    }

    public final synchronized void zzb() {
        if (this.f60291z) {
            return;
        }
        q qVar = this.f60288w.f27152y;
        if (qVar != null) {
            qVar.D5(4);
        }
        this.f60291z = true;
    }
}
