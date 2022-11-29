package pi;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class z7 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ na f48409w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ w8 f48410x;

    public z7(w8 w8Var, na naVar) {
        this.f48410x = w8Var;
        this.f48409w = naVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g3 g3Var;
        g3Var = this.f48410x.f48322d;
        if (g3Var == null) {
            this.f48410x.f48285a.r().p().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            rh.p.i(this.f48409w);
            g3Var.i5(this.f48409w);
        } catch (RemoteException e10) {
            this.f48410x.f48285a.r().p().b("Failed to reset data on the service: remote exception", e10);
        }
        this.f48410x.D();
    }
}
