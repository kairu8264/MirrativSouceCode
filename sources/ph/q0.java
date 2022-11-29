package ph;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes3.dex */
public final class q0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ t0 f47549w;

    public q0(t0 t0Var) {
        this.f47549w = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s0 s0Var;
        s0Var = this.f47549w.C;
        s0Var.c(new ConnectionResult(4));
    }
}
