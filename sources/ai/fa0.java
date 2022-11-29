package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class fa0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ vf.a f3976w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ga0 f3977x;

    public fa0(ga0 ga0Var, vf.a aVar) {
        this.f3977x = ga0Var;
        this.f3976w = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f90 f90Var;
        try {
            f90Var = this.f3977x.f4370a;
            f90Var.Y(ha0.a(this.f3976w));
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }
}
