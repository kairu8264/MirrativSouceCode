package nf;

import androidx.lifecycle.LiveData;
import com.dena.mirrorman.net.api.response.DashboardCatalog;
import org.greenrobot.eventbus.ThreadMode;
import pd.a0;

/* loaded from: classes3.dex */
public final class a extends androidx.lifecycle.q0 {
    public final androidx.lifecycle.e0<DashboardCatalog> A;
    public final LiveData<DashboardCatalog> B;
    public final androidx.lifecycle.e0<Boolean> C;
    public final LiveData<Boolean> D;

    /* renamed from: y  reason: collision with root package name */
    public final String f42387y;

    /* renamed from: z  reason: collision with root package name */
    public final q8.a f42388z;

    public a(String str, q8.a aVar) {
        jo.p.h(str, "actionId");
        jo.p.h(aVar, "dispatcher");
        this.f42387y = str;
        this.f42388z = aVar;
        aVar.b(this);
        androidx.lifecycle.e0<DashboardCatalog> e0Var = new androidx.lifecycle.e0<>(null);
        this.A = e0Var;
        this.B = e0Var;
        androidx.lifecycle.e0<Boolean> e0Var2 = new androidx.lifecycle.e0<>(Boolean.FALSE);
        this.C = e0Var2;
        this.D = e0Var2;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f42388z.c(this);
        super.d();
    }

    public final LiveData<Boolean> f() {
        return this.D;
    }

    public final LiveData<DashboardCatalog> g() {
        return this.B;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a0.f fVar) {
        jo.p.h(fVar, "event");
        if (jo.p.c(this.f42387y, fVar.a())) {
            this.A.p(null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a0.d dVar) {
        jo.p.h(dVar, "event");
        if (jo.p.c(this.f42387y, dVar.a())) {
            if (this.A.f() == null) {
                this.A.p(dVar.c());
            }
            this.C.p(Boolean.TRUE);
        }
    }
}
