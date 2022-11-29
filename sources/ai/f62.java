package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class f62 implements or, nc1 {

    /* renamed from: w  reason: collision with root package name */
    public jt f3955w;

    public final synchronized void a(jt jtVar) {
        this.f3955w = jtVar;
    }

    @Override // ai.or
    public final synchronized void onAdClicked() {
        jt jtVar = this.f3955w;
        if (jtVar != null) {
            try {
                jtVar.zzb();
            } catch (RemoteException e10) {
                uj0.g("Remote Exception at onAdClicked.", e10);
            }
        }
    }

    @Override // ai.nc1
    public final synchronized void zzb() {
        jt jtVar = this.f3955w;
        if (jtVar != null) {
            try {
                jtVar.zzb();
            } catch (RemoteException e10) {
                uj0.g("Remote Exception at onPhysicalClick.", e10);
            }
        }
    }
}
