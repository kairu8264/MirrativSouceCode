package ph;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import java.util.Set;

/* loaded from: classes3.dex */
public final class t0 extends ti.d implements c.a, c.b {
    public static final a.AbstractC0236a<? extends si.f, si.a> D = si.e.f52711c;
    public final rh.d A;
    public si.f B;
    public s0 C;

    /* renamed from: w  reason: collision with root package name */
    public final Context f47556w;

    /* renamed from: x  reason: collision with root package name */
    public final Handler f47557x;

    /* renamed from: y  reason: collision with root package name */
    public final a.AbstractC0236a<? extends si.f, si.a> f47558y;

    /* renamed from: z  reason: collision with root package name */
    public final Set<Scope> f47559z;

    public t0(Context context, Handler handler, rh.d dVar) {
        a.AbstractC0236a<? extends si.f, si.a> abstractC0236a = D;
        this.f47556w = context;
        this.f47557x = handler;
        this.A = (rh.d) rh.p.j(dVar, "ClientSettings must not be null");
        this.f47559z = dVar.e();
        this.f47558y = abstractC0236a;
    }

    public static /* bridge */ /* synthetic */ void f4(t0 t0Var, ti.l lVar) {
        ConnectionResult p10 = lVar.p();
        if (p10.k0()) {
            rh.p0 p0Var = (rh.p0) rh.p.i(lVar.P());
            ConnectionResult p11 = p0Var.p();
            if (!p11.k0()) {
                String valueOf = String.valueOf(p11);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                t0Var.C.c(p11);
                t0Var.B.disconnect();
                return;
            }
            t0Var.C.b(p0Var.P(), t0Var.f47559z);
        } else {
            t0Var.C.c(p10);
        }
        t0Var.B.disconnect();
    }

    public final void B4(s0 s0Var) {
        si.f fVar = this.B;
        if (fVar != null) {
            fVar.disconnect();
        }
        this.A.i(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0236a<? extends si.f, si.a> abstractC0236a = this.f47558y;
        Context context = this.f47556w;
        Looper looper = this.f47557x.getLooper();
        rh.d dVar = this.A;
        this.B = abstractC0236a.a(context, looper, dVar, dVar.f(), this, this);
        this.C = s0Var;
        Set<Scope> set = this.f47559z;
        if (set != null && !set.isEmpty()) {
            this.B.g();
        } else {
            this.f47557x.post(new q0(this));
        }
    }

    @Override // ph.d
    public final void i0(Bundle bundle) {
        this.B.i(this);
    }

    public final void k5() {
        si.f fVar = this.B;
        if (fVar != null) {
            fVar.disconnect();
        }
    }

    @Override // ti.f
    public final void o2(ti.l lVar) {
        this.f47557x.post(new r0(this, lVar));
    }

    @Override // ph.d
    public final void s0(int i10) {
        this.B.disconnect();
    }

    @Override // ph.j
    public final void z0(ConnectionResult connectionResult) {
        this.C.c(connectionResult);
    }
}
