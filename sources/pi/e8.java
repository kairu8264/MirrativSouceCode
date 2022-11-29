package pi;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class e8 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ na f47787w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Bundle f47788x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ w8 f47789y;

    public e8(w8 w8Var, na naVar, Bundle bundle) {
        this.f47789y = w8Var;
        this.f47787w = naVar;
        this.f47788x = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g3 g3Var;
        g3Var = this.f47789y.f48322d;
        if (g3Var == null) {
            this.f47789y.f48285a.r().p().a("Failed to send default event parameters to service");
            return;
        }
        try {
            rh.p.i(this.f47787w);
            g3Var.J2(this.f47788x, this.f47787w);
        } catch (RemoteException e10) {
            this.f47789y.f48285a.r().p().b("Failed to send default event parameters to service", e10);
        }
    }
}
