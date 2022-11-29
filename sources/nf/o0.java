package nf;

import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import pd.g0;
import pd.i1;
import ud.y4;
import uo.r0;

/* loaded from: classes3.dex */
public final class o0 extends androidx.lifecycle.q0 implements uo.q0 {
    public final Resources A;
    public final /* synthetic */ uo.q0 B;
    public final androidx.lifecycle.e0<String> C;
    public final LiveData<String> D;
    public final androidx.lifecycle.e0<UserProfile> E;
    public final LiveData<UserProfile> F;
    public final androidx.lifecycle.e0<List<App.AppParams>> G;
    public final LiveData<List<App.AppParams>> H;
    public final androidx.lifecycle.e0<String> I;
    public final LiveData<String> J;
    public final androidx.lifecycle.e0<Boolean> K;
    public final LiveData<Boolean> L;
    public final androidx.lifecycle.e0<Boolean> M;
    public final LiveData<Boolean> N;
    public final androidx.lifecycle.e0<MRError> O;
    public final LiveData<MRError> P;
    public final androidx.lifecycle.e0<Bitmap> Q;
    public final LiveData<Bitmap> R;
    public final androidx.lifecycle.e0<Bitmap> S;
    public final LiveData<Bitmap> T;
    public final androidx.lifecycle.e0<Bitmap> U;
    public final LiveData<Bitmap> V;
    public final androidx.lifecycle.e0<Bitmap> W;
    public final LiveData<Bitmap> X;
    public final androidx.lifecycle.e0<Boolean> Y;
    public final LiveData<Boolean> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f43122a0;

    /* renamed from: b0  reason: collision with root package name */
    public final LiveData<Integer> f43123b0;

    /* renamed from: c0  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<LiveBasicParams>> f43124c0;

    /* renamed from: d0  reason: collision with root package name */
    public final LiveData<List<LiveBasicParams>> f43125d0;

    /* renamed from: e0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f43126e0;

    /* renamed from: f0  reason: collision with root package name */
    public final LiveData<Integer> f43127f0;

    /* renamed from: g0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f43128g0;

    /* renamed from: h0  reason: collision with root package name */
    public final LiveData<Boolean> f43129h0;

    /* renamed from: i0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f43130i0;

    /* renamed from: j0  reason: collision with root package name */
    public final LiveData<Integer> f43131j0;

    /* renamed from: k0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f43132k0;

    /* renamed from: l0  reason: collision with root package name */
    public final LiveData<Boolean> f43133l0;

    /* renamed from: m0  reason: collision with root package name */
    public final androidx.lifecycle.e0<i9.a> f43134m0;

    /* renamed from: n0  reason: collision with root package name */
    public final LiveData<i9.a> f43135n0;

    /* renamed from: o0  reason: collision with root package name */
    public final androidx.lifecycle.e0<MRError> f43136o0;

    /* renamed from: p0  reason: collision with root package name */
    public final LiveData<MRError> f43137p0;

    /* renamed from: q0  reason: collision with root package name */
    public final androidx.lifecycle.e0<h9.a> f43138q0;

    /* renamed from: r0  reason: collision with root package name */
    public final LiveData<h9.a> f43139r0;

    /* renamed from: s0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Long> f43140s0;

    /* renamed from: t0  reason: collision with root package name */
    public final LiveData<Long> f43141t0;

    /* renamed from: u0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Long> f43142u0;

    /* renamed from: v0  reason: collision with root package name */
    public final wo.f<wn.v> f43143v0;

    /* renamed from: w0  reason: collision with root package name */
    public final xo.r<MRError> f43144w0;

    /* renamed from: x0  reason: collision with root package name */
    public final xo.w<MRError> f43145x0;

    /* renamed from: y  reason: collision with root package name */
    public final String f43146y;

    /* renamed from: y0  reason: collision with root package name */
    public final androidx.lifecycle.e0<y4> f43147y0;

    /* renamed from: z  reason: collision with root package name */
    public final q8.a f43148z;

    /* renamed from: z0  reason: collision with root package name */
    public final LiveData<y4> f43149z0;

    @co.f(c = "com.dena.mirrorman.store.UserProfileStore$on$1", f = "UserProfileStore.kt", l = {120}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43150w;

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
            int i10 = this.f43150w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = o0.this.f43143v0;
                wn.v vVar = wn.v.f59242a;
                this.f43150w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.UserProfileStore$on$2", f = "UserProfileStore.kt", l = {273}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43152w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i1.p f43154y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i1.p pVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f43154y = pVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f43154y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43152w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = o0.this.f43144w0;
                MRError a10 = this.f43154y.a();
                this.f43152w = 1;
                if (rVar.emit(a10, this) == c10) {
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

    public o0(String str, q8.a aVar, Resources resources) {
        jo.p.h(str, "userId");
        jo.p.h(aVar, "dispatcher");
        jo.p.h(resources, "resources");
        this.f43146y = str;
        this.f43148z = aVar;
        this.A = resources;
        this.B = r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<String> e0Var = new androidx.lifecycle.e0<>(null);
        this.C = e0Var;
        this.D = e0Var;
        androidx.lifecycle.e0<UserProfile> e0Var2 = new androidx.lifecycle.e0<>(null);
        this.E = e0Var2;
        this.F = e0Var2;
        androidx.lifecycle.e0<List<App.AppParams>> e0Var3 = new androidx.lifecycle.e0<>(xn.s.k());
        this.G = e0Var3;
        this.H = e0Var3;
        androidx.lifecycle.e0<String> e0Var4 = new androidx.lifecycle.e0<>(null);
        this.I = e0Var4;
        this.J = e0Var4;
        Boolean bool = Boolean.FALSE;
        androidx.lifecycle.e0<Boolean> e0Var5 = new androidx.lifecycle.e0<>(bool);
        this.K = e0Var5;
        this.L = e0Var5;
        androidx.lifecycle.e0<Boolean> e0Var6 = new androidx.lifecycle.e0<>(bool);
        this.M = e0Var6;
        this.N = e0Var6;
        androidx.lifecycle.e0<MRError> e0Var7 = new androidx.lifecycle.e0<>(null);
        this.O = e0Var7;
        this.P = e0Var7;
        androidx.lifecycle.e0<Bitmap> e0Var8 = new androidx.lifecycle.e0<>(null);
        this.Q = e0Var8;
        this.R = e0Var8;
        androidx.lifecycle.e0<Bitmap> e0Var9 = new androidx.lifecycle.e0<>(null);
        this.S = e0Var9;
        this.T = e0Var9;
        androidx.lifecycle.e0<Bitmap> e0Var10 = new androidx.lifecycle.e0<>(null);
        this.U = e0Var10;
        this.V = e0Var10;
        androidx.lifecycle.e0<Bitmap> e0Var11 = new androidx.lifecycle.e0<>(null);
        this.W = e0Var11;
        this.X = e0Var11;
        androidx.lifecycle.e0<Boolean> e0Var12 = new androidx.lifecycle.e0<>(null);
        this.Y = e0Var12;
        this.Z = e0Var12;
        androidx.lifecycle.e0<Integer> e0Var13 = new androidx.lifecycle.e0<>(0);
        this.f43122a0 = e0Var13;
        this.f43123b0 = e0Var13;
        androidx.lifecycle.e0<List<LiveBasicParams>> e0Var14 = new androidx.lifecycle.e0<>(xn.s.k());
        this.f43124c0 = e0Var14;
        this.f43125d0 = e0Var14;
        androidx.lifecycle.e0<Integer> e0Var15 = new androidx.lifecycle.e0<>(null);
        this.f43126e0 = e0Var15;
        this.f43127f0 = e0Var15;
        androidx.lifecycle.e0<Boolean> e0Var16 = new androidx.lifecycle.e0<>(bool);
        this.f43128g0 = e0Var16;
        this.f43129h0 = e0Var16;
        androidx.lifecycle.e0<Integer> e0Var17 = new androidx.lifecycle.e0<>(0);
        this.f43130i0 = e0Var17;
        this.f43131j0 = e0Var17;
        androidx.lifecycle.e0<Boolean> e0Var18 = new androidx.lifecycle.e0<>(bool);
        this.f43132k0 = e0Var18;
        this.f43133l0 = e0Var18;
        androidx.lifecycle.e0<i9.a> e0Var19 = new androidx.lifecycle.e0<>();
        this.f43134m0 = e0Var19;
        this.f43135n0 = e0Var19;
        androidx.lifecycle.e0<MRError> e0Var20 = new androidx.lifecycle.e0<>(null);
        this.f43136o0 = e0Var20;
        this.f43137p0 = e0Var20;
        androidx.lifecycle.e0<h9.a> e0Var21 = new androidx.lifecycle.e0<>();
        this.f43138q0 = e0Var21;
        this.f43139r0 = e0Var21;
        androidx.lifecycle.e0<Long> e0Var22 = new androidx.lifecycle.e0<>(0L);
        this.f43140s0 = e0Var22;
        this.f43141t0 = e0Var22;
        this.f43142u0 = new androidx.lifecycle.e0<>(0L);
        this.f43143v0 = wo.g.a(-2);
        xo.r<MRError> b10 = xo.y.b(0, 0, null, 7, null);
        this.f43144w0 = b10;
        this.f43145x0 = b10;
        androidx.lifecycle.e0<y4> e0Var23 = new androidx.lifecycle.e0<>();
        this.f43147y0 = e0Var23;
        this.f43149z0 = e0Var23;
    }

    public final LiveData<y4> A() {
        return this.f43149z0;
    }

    public final LiveData<UserProfile> B() {
        return this.F;
    }

    public final LiveData<Boolean> C() {
        return this.N;
    }

    public final LiveData<Boolean> D() {
        return this.Z;
    }

    public final LiveData<Boolean> E() {
        return this.L;
    }

    public final LiveData<Boolean> F() {
        return this.f43129h0;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f43148z.c(this);
        r0.d(this, null, 1, null);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.B.getCoroutineContext();
    }

    public final LiveData<Bitmap> h() {
        return this.X;
    }

    public final LiveData<List<App.AppParams>> i() {
        return this.H;
    }

    public final LiveData<Bitmap> j() {
        return this.T;
    }

    public final LiveData<MRError> k() {
        return this.P;
    }

    public final wo.x<wn.v> l() {
        return this.f43143v0.g();
    }

    public final LiveData<MRError> m() {
        return this.f43137p0;
    }

    public final LiveData<Integer> n() {
        return this.f43131j0;
    }

    public final xo.w<MRError> o() {
        return this.f43145x0;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.x xVar) {
        jo.p.h(xVar, "event");
        this.C.p(xVar.a());
    }

    public final LiveData<List<LiveBasicParams>> p() {
        return this.f43125d0;
    }

    public final LiveData<Long> q() {
        return this.f43141t0;
    }

    public final LiveData<Boolean> r() {
        return this.f43133l0;
    }

    public final LiveData<String> s() {
        return this.J;
    }

    public final LiveData<Integer> t() {
        return this.f43127f0;
    }

    public final LiveData<Integer> u() {
        return this.f43123b0;
    }

    public final LiveData<String> v() {
        return this.D;
    }

    public final long w() {
        Long f10 = this.f43142u0.f();
        if (f10 == null) {
            f10 = 0L;
        }
        return f10.longValue();
    }

    public final LiveData<i9.a> x() {
        return this.f43135n0;
    }

    public final LiveData<Bitmap> y() {
        return this.R;
    }

    public final LiveData<h9.a> z() {
        return this.f43139r0;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.k kVar) {
        jo.p.h(kVar, "event");
        if (jo.p.c(this.f43146y, kVar.a())) {
            this.E.p(kVar.b());
            if (kVar.b().isBlocked()) {
                return;
            }
            this.Y.p(Boolean.valueOf(kVar.b().isFollowing()));
            this.f43130i0.p(Integer.valueOf(kVar.b().getFollowerNum()));
            this.f43140s0.p(Long.valueOf(kVar.b().getLiveRequestNum()));
            this.f43134m0.p(i9.a.B.a(kVar.b().getSeasonYell()));
            uo.l.d(this, null, null, new a(null), 3, null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.c0 c0Var) {
        jo.p.h(c0Var, "event");
        if (jo.p.c(this.f43146y, c0Var.a())) {
            this.M.p(Boolean.valueOf(c0Var.b()));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.j jVar) {
        jo.p.h(jVar, "event");
        if (jo.p.c(this.f43146y, jVar.b())) {
            this.O.p(jVar.a());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.f fVar) {
        jo.p.h(fVar, "event");
        if (jo.p.c(this.f43146y, fVar.a())) {
            this.K.p(Boolean.TRUE);
            this.I.p(null);
            this.G.p(xn.s.k());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.d dVar) {
        jo.p.h(dVar, "event");
        if (jo.p.c(this.f43146y, dVar.a())) {
            this.K.p(Boolean.TRUE);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.g gVar) {
        jo.p.h(gVar, "event");
        if (jo.p.c(this.f43146y, gVar.b())) {
            this.K.p(Boolean.FALSE);
            this.G.p(gVar.a().getApps());
            this.I.p(gVar.a().getNextCursor());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.e eVar) {
        jo.p.h(eVar, "event");
        if (jo.p.c(this.f43146y, eVar.b())) {
            androidx.lifecycle.e0<List<App.AppParams>> e0Var = this.G;
            List<App.AppParams> f10 = e0Var.f();
            if (f10 == null) {
                f10 = xn.s.k();
            }
            e0Var.p(xn.a0.o0(f10, eVar.a().getApps()));
            this.I.p(eVar.a().getNextCursor());
            this.K.p(Boolean.FALSE);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.c cVar) {
        jo.p.h(cVar, "event");
        if (jo.p.c(this.f43146y, cVar.a())) {
            this.K.p(Boolean.FALSE);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.y yVar) {
        jo.p.h(yVar, "event");
        if (jo.p.c(this.f43146y, yVar.b())) {
            this.Q.p(yVar.a());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.h hVar) {
        jo.p.h(hVar, "event");
        if (jo.p.c(this.f43146y, hVar.b())) {
            this.S.p(hVar.a());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.i iVar) {
        jo.p.h(iVar, "event");
        if (jo.p.c(this.f43146y, iVar.b())) {
            this.U.p(iVar.a());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.a aVar) {
        jo.p.h(aVar, "event");
        if (jo.p.c(this.f43146y, aVar.b())) {
            this.W.p(aVar.a());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.o oVar) {
        jo.p.h(oVar, "event");
        if (jo.p.c(this.f43146y, oVar.b())) {
            this.Y.p(Boolean.TRUE);
            androidx.lifecycle.e0<Integer> e0Var = this.f43130i0;
            Integer f10 = e0Var.f();
            if (f10 == null) {
                f10 = 0;
            }
            e0Var.p(Integer.valueOf(f10.intValue() + 1));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.g0 g0Var) {
        jo.p.h(g0Var, "event");
        if (jo.p.c(this.f43146y, g0Var.a())) {
            this.Y.p(Boolean.FALSE);
            androidx.lifecycle.e0<Integer> e0Var = this.f43130i0;
            Integer f10 = e0Var.f();
            if (f10 == null) {
                f10 = 0;
            }
            e0Var.p(Integer.valueOf(Math.max(f10.intValue() - 1, 0)));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.n nVar) {
        jo.p.h(nVar, "event");
        if (jo.p.c(this.f43146y, nVar.b())) {
            this.f43136o0.p(nVar.a());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.w wVar) {
        jo.p.h(wVar, "event");
        if (jo.p.c(this.f43146y, wVar.b())) {
            this.f43122a0.p(Integer.valueOf(wVar.a()));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.u uVar) {
        jo.p.h(uVar, "event");
        if (jo.p.c(this.f43146y, uVar.a())) {
            this.f43124c0.p(xn.s.k());
            this.f43128g0.p(Boolean.TRUE);
            this.f43126e0.p(null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.t tVar) {
        jo.p.h(tVar, "event");
        if (jo.p.c(this.f43146y, tVar.a())) {
            this.f43128g0.p(Boolean.TRUE);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.s sVar) {
        jo.p.h(sVar, "event");
        if (jo.p.c(this.f43146y, sVar.b())) {
            this.f43128g0.p(Boolean.FALSE);
            androidx.lifecycle.e0<List<LiveBasicParams>> e0Var = this.f43124c0;
            List<LiveBasicParams> f10 = e0Var.f();
            if (f10 == null) {
                f10 = xn.s.k();
            }
            e0Var.p(xn.a0.o0(f10, sVar.a().getLives()));
            this.f43126e0.p(Integer.valueOf(sVar.a().getNextPage()));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.v vVar) {
        jo.p.h(vVar, "event");
        if (jo.p.c(this.f43146y, vVar.a())) {
            this.f43132k0.p(Boolean.TRUE);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.d0 d0Var) {
        jo.p.h(d0Var, "event");
        if (jo.p.c(this.f43146y, d0Var.b())) {
            this.f43140s0.p(Long.valueOf(d0Var.a()));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.f0 f0Var) {
        jo.p.h(f0Var, "event");
        if (jo.p.c(this.f43146y, f0Var.b())) {
            this.f43142u0.p(Long.valueOf(f0Var.a()));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.b bVar) {
        jo.p.h(bVar, "event");
        if (jo.p.c(this.f43146y, bVar.b())) {
            Long f10 = this.f43142u0.f();
            if (f10 == null) {
                f10 = 0L;
            }
            this.f43142u0.p(Long.valueOf(f10.longValue() + bVar.a()));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.p pVar) {
        jo.p.h(pVar, "event");
        uo.l.d(this, null, null, new b(pVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g0.k kVar) {
        jo.p.h(kVar, "event");
        if (jo.p.c(this.f43146y, kVar.b())) {
            this.f43140s0.p(Long.valueOf(kVar.a()));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.l lVar) {
        jo.p.h(lVar, "event");
        if (jo.p.c(this.f43146y, lVar.b())) {
            df.c a10 = df.c.Companion.a(lVar.a().getSeason().getClassId());
            this.f43138q0.p(h9.a.f34594i.a(a10.h(), lVar.a().getSeason().getCurrent(), lVar.a().getSeason().getClassStart(), lVar.a().getSeason().getClassEnd(), a10.r(), a10.n(), this.A));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.m mVar) {
        jo.p.h(mVar, "event");
        if (jo.p.c(this.f43146y, mVar.c())) {
            this.f43147y0.p(y4.f55768x.a(mVar.b(), this.A, mVar.a(), mVar.d()));
        }
    }
}
