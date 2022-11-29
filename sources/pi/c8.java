package pi;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class c8 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ na f47747w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ w8 f47748x;

    public c8(w8 w8Var, na naVar) {
        this.f47748x = w8Var;
        this.f47747w = naVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g3 g3Var;
        g3Var = this.f47748x.f48322d;
        if (g3Var == null) {
            this.f47748x.f48285a.r().p().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            rh.p.i(this.f47747w);
            g3Var.C5(this.f47747w);
            this.f47748x.f48285a.B().s();
            this.f47748x.p(g3Var, null, this.f47747w);
            this.f47748x.D();
        } catch (RemoteException e10) {
            this.f47748x.f48285a.r().p().b("Failed to send app launch to the service", e10);
        }
    }
}
