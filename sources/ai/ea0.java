package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class ea0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ vf.a f3592w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ga0 f3593x;

    public ea0(ga0 ga0Var, vf.a aVar) {
        this.f3593x = ga0Var;
        this.f3592w = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f90 f90Var;
        try {
            f90Var = this.f3593x.f4370a;
            f90Var.Y(ha0.a(this.f3592w));
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }
}
