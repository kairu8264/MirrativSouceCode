package nf;

import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.DashboardCatalogItem;
import com.dena.mirrorman.net.api.response.user.UserMe;
import java.util.Collection;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import pd.a0;
import pd.i0;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.r0;

/* loaded from: classes3.dex */
public final class y extends androidx.lifecycle.q0 implements uo.q0 {
    public final androidx.lifecycle.e0<Boolean> A;
    public final LiveData<Boolean> B;
    public final androidx.lifecycle.e0<Boolean> C;
    public final LiveData<Boolean> D;
    public final androidx.lifecycle.e0<Boolean> E;
    public final LiveData<Boolean> F;
    public final androidx.lifecycle.e0<Boolean> G;
    public final LiveData<Boolean> H;
    public final androidx.lifecycle.e0<MRError> I;
    public final LiveData<MRError> J;
    public final androidx.lifecycle.e0<wn.v> K;
    public final LiveData<wn.v> L;
    public final androidx.lifecycle.e0<wn.v> M;
    public final LiveData<wn.v> N;
    public final androidx.lifecycle.e0<UserMe> O;
    public final LiveData<UserMe> P;
    public final androidx.lifecycle.e0<MRError> Q;
    public final LiveData<MRError> R;
    public final androidx.lifecycle.e0<String> S;
    public final LiveData<String> T;
    public final androidx.lifecycle.e0<String> U;
    public final LiveData<String> V;
    public final androidx.lifecycle.e0<Boolean> W;
    public final LiveData<Boolean> X;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f43305y;

    /* renamed from: z  reason: collision with root package name */
    public final ao.g f43306z;

    public y(q8.a aVar) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        this.f43305y = aVar;
        aVar.b(this);
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.f43306z = c10.plus(b10);
        androidx.lifecycle.e0<Boolean> e0Var = new androidx.lifecycle.e0<>(null);
        this.A = e0Var;
        this.B = e0Var;
        androidx.lifecycle.e0<Boolean> e0Var2 = new androidx.lifecycle.e0<>(null);
        this.C = e0Var2;
        this.D = e0Var2;
        androidx.lifecycle.e0<Boolean> e0Var3 = new androidx.lifecycle.e0<>(null);
        this.E = e0Var3;
        this.F = e0Var3;
        androidx.lifecycle.e0<Boolean> e0Var4 = new androidx.lifecycle.e0<>(null);
        this.G = e0Var4;
        this.H = e0Var4;
        androidx.lifecycle.e0<MRError> e0Var5 = new androidx.lifecycle.e0<>(null);
        this.I = e0Var5;
        this.J = e0Var5;
        androidx.lifecycle.e0<wn.v> e0Var6 = new androidx.lifecycle.e0<>(null);
        this.K = e0Var6;
        this.L = e0Var6;
        androidx.lifecycle.e0<wn.v> e0Var7 = new androidx.lifecycle.e0<>(null);
        this.M = e0Var7;
        this.N = e0Var7;
        androidx.lifecycle.e0<UserMe> e0Var8 = new androidx.lifecycle.e0<>(null);
        this.O = e0Var8;
        this.P = e0Var8;
        androidx.lifecycle.e0<MRError> e0Var9 = new androidx.lifecycle.e0<>(null);
        this.Q = e0Var9;
        this.R = e0Var9;
        androidx.lifecycle.e0<String> e0Var10 = new androidx.lifecycle.e0<>(null);
        this.S = e0Var10;
        this.T = e0Var10;
        androidx.lifecycle.e0<String> e0Var11 = new androidx.lifecycle.e0<>(null);
        this.U = e0Var11;
        this.V = e0Var11;
        androidx.lifecycle.e0<Boolean> e0Var12 = new androidx.lifecycle.e0<>(Boolean.TRUE);
        this.W = e0Var12;
        this.X = e0Var12;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f43305y.c(this);
        super.d();
    }

    public final LiveData<MRError> f() {
        return this.J;
    }

    public final LiveData<wn.v> g() {
        return this.N;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f43306z;
    }

    public final LiveData<wn.v> h() {
        return this.L;
    }

    public final LiveData<Boolean> i() {
        return this.B;
    }

    public final LiveData<Boolean> j() {
        return this.F;
    }

    public final LiveData<String> k() {
        return this.T;
    }

    public final LiveData<String> l() {
        return this.V;
    }

    public final LiveData<UserMe> m() {
        return this.P;
    }

    public final LiveData<MRError> n() {
        return this.R;
    }

    public final LiveData<Boolean> o() {
        return this.H;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i0.d dVar) {
        jo.p.h(dVar, "event");
        this.A.p(Boolean.valueOf(dVar.a()));
    }

    public final LiveData<Boolean> p() {
        return this.D;
    }

    public final LiveData<Boolean> q() {
        return this.X;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i0.h hVar) {
        jo.p.h(hVar, "event");
        this.C.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i0.e eVar) {
        jo.p.h(eVar, "event");
        this.E.p(Boolean.valueOf(eVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i0.i iVar) {
        jo.p.h(iVar, "event");
        this.G.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i0.c cVar) {
        jo.p.h(cVar, "event");
        this.K.p(wn.v.f59242a);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i0.b bVar) {
        jo.p.h(bVar, "event");
        this.M.p(wn.v.f59242a);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i0.a aVar) {
        jo.p.h(aVar, "event");
        this.I.p(aVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i0.k kVar) {
        jo.p.h(kVar, "event");
        this.O.p(kVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i0.j jVar) {
        jo.p.h(jVar, "event");
        this.Q.p(jVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i0.f fVar) {
        jo.p.h(fVar, "event");
        this.S.p(fVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i0.g gVar) {
        jo.p.h(gVar, "event");
        this.U.p(gVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a0.d dVar) {
        boolean z10;
        boolean z11;
        jo.p.h(dVar, "event");
        List<DashboardCatalogItem> list = dVar.c().getList();
        boolean z12 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (DashboardCatalogItem dashboardCatalogItem : list) {
                if (dashboardCatalogItem.getLive_large() == null && dashboardCatalogItem.getLive_small() == null) {
                    z10 = false;
                    continue;
                } else {
                    z10 = true;
                    continue;
                }
                if (z10) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        androidx.lifecycle.e0<Boolean> e0Var = this.W;
        if (!z11 && dVar.d()) {
            z12 = false;
        }
        e0Var.p(Boolean.valueOf(z12));
    }
}
