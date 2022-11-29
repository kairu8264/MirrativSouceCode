package pi;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class k8 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ na f48004w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ w8 f48005x;

    public k8(w8 w8Var, na naVar) {
        this.f48005x = w8Var;
        this.f48004w = naVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g3 g3Var;
        g3Var = this.f48005x.f48322d;
        if (g3Var == null) {
            this.f48005x.f48285a.r().p().a("Failed to send consent settings to service");
            return;
        }
        try {
            rh.p.i(this.f48004w);
            g3Var.n4(this.f48004w);
            this.f48005x.D();
        } catch (RemoteException e10) {
            this.f48005x.f48285a.r().p().b("Failed to send consent settings to the service", e10);
        }
    }
}
