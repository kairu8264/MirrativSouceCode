package pi;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class d8 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ p7 f47768w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ w8 f47769x;

    public d8(w8 w8Var, p7 p7Var) {
        this.f47769x = w8Var;
        this.f47768w = p7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g3 g3Var;
        g3Var = this.f47769x.f48322d;
        if (g3Var == null) {
            this.f47769x.f48285a.r().p().a("Failed to send current screen to service");
            return;
        }
        try {
            p7 p7Var = this.f47768w;
            if (p7Var == null) {
                g3Var.Z1(0L, null, null, this.f47769x.f48285a.F().getPackageName());
            } else {
                g3Var.Z1(p7Var.f48129c, p7Var.f48127a, p7Var.f48128b, this.f47769x.f48285a.F().getPackageName());
            }
            this.f47769x.D();
        } catch (RemoteException e10) {
            this.f47769x.f48285a.r().p().b("Failed to send current screen to the service", e10);
        }
    }
}
