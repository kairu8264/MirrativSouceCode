package z9;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingEventDetailResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingEventResponse;
import org.greenrobot.eventbus.ThreadMode;
import pd.q;

/* loaded from: classes.dex */
public final class w extends q0 {
    public final LiveData<Integer> A;
    public final e0<GiftRankingEventResponse> B;
    public final LiveData<GiftRankingEventResponse> C;
    public final e0<GiftRankingEventDetailResponse> D;
    public final LiveData<GiftRankingEventDetailResponse> E;
    public final e0<MRError> F;
    public final LiveData<MRError> G;
    public final e0<MRError> H;
    public final LiveData<MRError> I;
    public final e0<Boolean> J;
    public final LiveData<Boolean> K;
    public final e0<Boolean> L;
    public final LiveData<Boolean> M;
    public final e0<Boolean> N;
    public final LiveData<Boolean> O;
    public final e0<Boolean> P;
    public final LiveData<Boolean> Q;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f62909y;

    /* renamed from: z  reason: collision with root package name */
    public final e0<Integer> f62910z;

    public w(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f62909y = aVar;
        aVar.b(this);
        e0<Integer> e0Var = new e0<>(0);
        this.f62910z = e0Var;
        this.A = e0Var;
        e0<GiftRankingEventResponse> e0Var2 = new e0<>(null);
        this.B = e0Var2;
        this.C = e0Var2;
        e0<GiftRankingEventDetailResponse> e0Var3 = new e0<>(null);
        this.D = e0Var3;
        this.E = e0Var3;
        e0<MRError> e0Var4 = new e0<>(null);
        this.F = e0Var4;
        this.G = e0Var4;
        e0<MRError> e0Var5 = new e0<>(null);
        this.H = e0Var5;
        this.I = e0Var5;
        Boolean bool = Boolean.FALSE;
        e0<Boolean> e0Var6 = new e0<>(bool);
        this.J = e0Var6;
        this.K = e0Var6;
        e0<Boolean> e0Var7 = new e0<>(bool);
        this.L = e0Var7;
        this.M = e0Var7;
        e0<Boolean> e0Var8 = new e0<>(bool);
        this.N = e0Var8;
        this.O = e0Var8;
        e0<Boolean> e0Var9 = new e0<>(bool);
        this.P = e0Var9;
        this.Q = e0Var9;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f62909y.c(this);
        super.d();
    }

    public final LiveData<Integer> f() {
        return this.A;
    }

    public final LiveData<GiftRankingEventResponse> g() {
        return this.C;
    }

    public final LiveData<GiftRankingEventDetailResponse> h() {
        return this.E;
    }

    public final LiveData<MRError> i() {
        return this.I;
    }

    public final LiveData<MRError> j() {
        return this.G;
    }

    public final LiveData<Boolean> k() {
        return this.Q;
    }

    public final LiveData<Boolean> l() {
        return this.K;
    }

    public final LiveData<Boolean> m() {
        return this.O;
    }

    public final LiveData<Boolean> n() {
        return this.M;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q.e eVar) {
        jo.p.h(eVar, "event");
        this.P.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q.d dVar) {
        jo.p.h(dVar, "event");
        this.P.p(Boolean.FALSE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q.a aVar) {
        jo.p.h(aVar, "event");
        Integer f10 = this.f62910z.f();
        int a10 = aVar.a();
        if (f10 != null && f10.intValue() == a10) {
            return;
        }
        this.f62910z.p(Integer.valueOf(aVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q.k kVar) {
        jo.p.h(kVar, "event");
        if (jo.p.c(this.J.f(), Boolean.valueOf(kVar.a()))) {
            return;
        }
        this.J.p(Boolean.valueOf(kVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q.j jVar) {
        jo.p.h(jVar, "event");
        if (jo.p.c(this.L.f(), Boolean.valueOf(jVar.a()))) {
            return;
        }
        this.L.p(Boolean.valueOf(jVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q.i iVar) {
        jo.p.h(iVar, "event");
        if (jo.p.c(this.N.f(), Boolean.valueOf(iVar.a()))) {
            return;
        }
        this.N.p(Boolean.valueOf(iVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q.b bVar) {
        jo.p.h(bVar, "event");
        this.B.p(bVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q.f fVar) {
        jo.p.h(fVar, "event");
        this.D.p(fVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q.c cVar) {
        jo.p.h(cVar, "event");
        this.F.p(cVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q.g gVar) {
        jo.p.h(gVar, "event");
        this.H.p(gVar.a());
    }
}
