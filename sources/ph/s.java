package ph;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes3.dex */
public final class s extends g1 {
    public final s.b<b<?>> B;
    public final e C;

    public s(g gVar, e eVar, nh.d dVar) {
        super(gVar, dVar);
        this.B = new s.b<>();
        this.C = eVar;
        this.f27216w.l("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, e eVar, b<?> bVar) {
        g c10 = LifecycleCallback.c(activity);
        s sVar = (s) c10.s("ConnectionlessLifecycleHelper", s.class);
        if (sVar == null) {
            sVar = new s(c10, eVar, nh.d.m());
        }
        rh.p.j(bVar, "ApiKey cannot be null");
        sVar.B.add(bVar);
        eVar.c(sVar);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // ph.g1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // ph.g1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.C.d(this);
    }

    @Override // ph.g1
    public final void m(ConnectionResult connectionResult, int i10) {
        this.C.G(connectionResult, i10);
    }

    @Override // ph.g1
    public final void n() {
        this.C.a();
    }

    public final s.b<b<?>> t() {
        return this.B;
    }

    public final void v() {
        if (this.B.isEmpty()) {
            return;
        }
        this.C.c(this);
    }
}
