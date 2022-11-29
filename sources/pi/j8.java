package pi;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class j8 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ na f47976w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ w8 f47977x;

    public j8(w8 w8Var, na naVar) {
        this.f47977x = w8Var;
        this.f47976w = naVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g3 g3Var;
        g3Var = this.f47977x.f48322d;
        if (g3Var == null) {
            this.f47977x.f48285a.r().p().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            rh.p.i(this.f47976w);
            g3Var.p3(this.f47976w);
            this.f47977x.D();
        } catch (RemoteException e10) {
            this.f47977x.f48285a.r().p().b("Failed to send measurementEnabled to the service", e10);
        }
    }
}
