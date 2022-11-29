package rc;

import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.AppCampaign;
import com.dena.mirrorman.net.api.response.live.LiveAnnouncement;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import pd.y;

/* loaded from: classes2.dex */
public final class u extends androidx.lifecycle.q0 implements uo.q0 {
    public final androidx.lifecycle.e0<Integer> A;
    public final LiveData<Integer> B;
    public final androidx.lifecycle.e0<String> C;
    public final LiveData<String> D;
    public final androidx.lifecycle.e0<Boolean> E;
    public final LiveData<Boolean> F;
    public final androidx.lifecycle.e0<MRError> G;
    public final LiveData<MRError> H;
    public final androidx.lifecycle.e0<Boolean> I;
    public final LiveData<Boolean> J;
    public final androidx.lifecycle.e0<Boolean> K;
    public final LiveData<Boolean> L;
    public final wo.f<wn.v> M;
    public final androidx.lifecycle.e0<Integer> N;
    public final LiveData<Integer> O;
    public final androidx.lifecycle.e0<Boolean> P;
    public final LiveData<Boolean> Q;
    public final androidx.lifecycle.e0<jf.w> R;
    public final LiveData<jf.w> S;
    public final androidx.lifecycle.e0<List<AppCampaign>> T;
    public final LiveData<List<AppCampaign>> U;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f51011y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f51012z;

    @co.f(c = "com.dena.mirrativ.user.mypage.LiveAnnouncementStore$on$2", f = "LiveAnnouncementStore.kt", l = {111}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f51013w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f51013w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = u.this.M;
                wn.v vVar = wn.v.f59242a;
                this.f51013w = 1;
                if (fVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    public u(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f51011y = aVar;
        this.f51012z = uo.r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<Integer> e0Var = new androidx.lifecycle.e0<>(0);
        this.A = e0Var;
        this.B = e0Var;
        androidx.lifecycle.e0<String> e0Var2 = new androidx.lifecycle.e0<>("");
        this.C = e0Var2;
        this.D = e0Var2;
        Boolean bool = Boolean.FALSE;
        androidx.lifecycle.e0<Boolean> e0Var3 = new androidx.lifecycle.e0<>(bool);
        this.E = e0Var3;
        this.F = e0Var3;
        androidx.lifecycle.e0<MRError> e0Var4 = new androidx.lifecycle.e0<>();
        this.G = e0Var4;
        this.H = e0Var4;
        androidx.lifecycle.e0<Boolean> e0Var5 = new androidx.lifecycle.e0<>(bool);
        this.I = e0Var5;
        this.J = e0Var5;
        androidx.lifecycle.e0<Boolean> e0Var6 = new androidx.lifecycle.e0<>(bool);
        this.K = e0Var6;
        this.L = e0Var6;
        this.M = wo.g.a(-2);
        androidx.lifecycle.e0<Integer> e0Var7 = new androidx.lifecycle.e0<>(null);
        this.N = e0Var7;
        this.O = e0Var7;
        androidx.lifecycle.e0<Boolean> e0Var8 = new androidx.lifecycle.e0<>(bool);
        this.P = e0Var8;
        this.Q = e0Var8;
        androidx.lifecycle.e0<jf.w> e0Var9 = new androidx.lifecycle.e0<>(null);
        this.R = e0Var9;
        this.S = e0Var9;
        androidx.lifecycle.e0<List<AppCampaign>> e0Var10 = new androidx.lifecycle.e0<>(xn.s.k());
        this.T = e0Var10;
        this.U = e0Var10;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f51011y.c(this);
    }

    public final LiveData<List<AppCampaign>> g() {
        return this.U;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f51012z.getCoroutineContext();
    }

    public final LiveData<jf.w> h() {
        return this.S;
    }

    public final LiveData<String> i() {
        return this.D;
    }

    public final LiveData<Integer> j() {
        return this.B;
    }

    public final LiveData<MRError> k() {
        return this.H;
    }

    public final LiveData<Boolean> l() {
        return this.L;
    }

    public final LiveData<Boolean> m() {
        return this.J;
    }

    public final LiveData<Boolean> n() {
        return this.Q;
    }

    public final wo.x<wn.v> o() {
        return this.M.g();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y.e eVar) {
        jo.p.h(eVar, "event");
        androidx.lifecycle.e0<Integer> e0Var = this.A;
        LiveAnnouncement liveAnnouncement = eVar.b().getLiveAnnouncement();
        e0Var.p(liveAnnouncement != null ? Integer.valueOf(liveAnnouncement.getStartAt()) : 0);
        androidx.lifecycle.e0<String> e0Var2 = this.C;
        LiveAnnouncement liveAnnouncement2 = eVar.b().getLiveAnnouncement();
        e0Var2.p((liveAnnouncement2 == null || (r1 = liveAnnouncement2.getBody()) == null) ? "" : "");
        this.E.p(Boolean.valueOf(eVar.a().getTwitterAutopostLiveAnnouncement() == 1));
        this.T.p(eVar.a().getAppCampaigns());
        this.K.p(Boolean.FALSE);
    }

    public final LiveData<Integer> p() {
        return this.O;
    }

    public final LiveData<Boolean> q() {
        return this.F;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y.a aVar) {
        jo.p.h(aVar, "event");
        this.G.p(aVar.a());
        this.K.p(Boolean.FALSE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y.m mVar) {
        jo.p.h(mVar, "event");
        this.A.p(Integer.valueOf(mVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y.l lVar) {
        jo.p.h(lVar, "event");
        this.C.p(lVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y.f fVar) {
        jo.p.h(fVar, "event");
        this.E.p(Boolean.valueOf(fVar.a().getTwitterAutopostLiveAnnouncement() == 1));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y.n nVar) {
        jo.p.h(nVar, "event");
        this.E.p(Boolean.valueOf(nVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y.i iVar) {
        jo.p.h(iVar, "event");
        this.I.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y.g gVar) {
        jo.p.h(gVar, "event");
        this.I.p(Boolean.FALSE);
        this.C.p(gVar.a().getBody());
        this.N.p(Integer.valueOf(gVar.a().getStartAt()));
        androidx.lifecycle.e0<jf.w> e0Var = this.R;
        App.AppParams app = gVar.a().getApp();
        e0Var.p(app != null ? new jf.w(app.getAppId(), app.getIconUrl(), app.getTitle(), app.getShortTitle()) : null);
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y.c cVar) {
        jo.p.h(cVar, "event");
        this.I.p(Boolean.FALSE);
        this.G.p(cVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y.h hVar) {
        jo.p.h(hVar, "event");
        this.K.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y.j jVar) {
        jo.p.h(jVar, "event");
        this.P.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y.d dVar) {
        jo.p.h(dVar, "event");
        this.P.p(Boolean.FALSE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y.k kVar) {
        jo.p.h(kVar, "event");
        this.R.p(kVar.a());
    }
}
