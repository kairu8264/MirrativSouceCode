package rc;

import android.graphics.Bitmap;
import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.ChatStatus;
import com.dena.mirrorman.net.api.response.Chat;
import com.dena.mirrorman.net.api.response.live.LiveAnnouncement;
import com.dena.mirrorman.net.api.response.live.LiveArchiveDownloadUrlResponse;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.net.api.response.live.ViewHistoryParams;
import com.dena.mirrorman.net.api.response.user.UserMe;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import pd.i1;
import pd.j0;
import pd.y;

/* loaded from: classes2.dex */
public final class u1 extends androidx.lifecycle.q0 implements uo.q0 {
    public final androidx.lifecycle.e0<UserMe> A;
    public final androidx.lifecycle.e0<LiveAnnouncement> A0;
    public final LiveData<UserMe> B;
    public final LiveData<LiveAnnouncement> B0;
    public final androidx.lifecycle.e0<Boolean> C;
    public final androidx.lifecycle.e0<ChatStatus> C0;
    public final LiveData<Boolean> D;
    public final LiveData<ChatStatus> D0;
    public final androidx.lifecycle.e0<List<EventBannerResponse>> E;
    public final wo.f<MRError> E0;
    public final LiveData<List<EventBannerResponse>> F;
    public final wo.f<wn.v> F0;
    public final androidx.lifecycle.e0<String> G;
    public final wo.f<Integer> G0;
    public final LiveData<String> H;
    public final wo.f<wn.k<MRError, String>> H0;
    public final androidx.lifecycle.e0<Boolean> I;
    public final LiveData<Boolean> J;
    public final androidx.lifecycle.e0<Bitmap> K;
    public final LiveData<Bitmap> L;
    public final androidx.lifecycle.e0<Bitmap> M;
    public final LiveData<Bitmap> N;
    public final androidx.lifecycle.e0<Integer> O;
    public final LiveData<Integer> P;
    public final androidx.lifecycle.e0<List<LiveBasicParams>> Q;
    public final LiveData<List<LiveBasicParams>> R;
    public final androidx.lifecycle.e0<Integer> S;
    public final LiveData<Integer> T;
    public final androidx.lifecycle.e0<Boolean> U;
    public final LiveData<Boolean> V;
    public final androidx.lifecycle.e0<List<ViewHistoryParams>> W;
    public final LiveData<List<ViewHistoryParams>> X;
    public final androidx.lifecycle.e0<String> Y;
    public final LiveData<String> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f51016a0;

    /* renamed from: b0  reason: collision with root package name */
    public final LiveData<Boolean> f51017b0;

    /* renamed from: c0  reason: collision with root package name */
    public final androidx.lifecycle.e0<MRError> f51018c0;

    /* renamed from: d0  reason: collision with root package name */
    public final LiveData<MRError> f51019d0;

    /* renamed from: e0  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<Chat.Thread>> f51020e0;

    /* renamed from: f0  reason: collision with root package name */
    public final LiveData<List<Chat.Thread>> f51021f0;

    /* renamed from: g0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f51022g0;

    /* renamed from: h0  reason: collision with root package name */
    public final LiveData<Integer> f51023h0;

    /* renamed from: i0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f51024i0;

    /* renamed from: j0  reason: collision with root package name */
    public final LiveData<Boolean> f51025j0;

    /* renamed from: k0  reason: collision with root package name */
    public final androidx.lifecycle.e0<MRError> f51026k0;

    /* renamed from: l0  reason: collision with root package name */
    public final LiveData<MRError> f51027l0;

    /* renamed from: m0  reason: collision with root package name */
    public final androidx.lifecycle.e0<wn.v> f51028m0;

    /* renamed from: n0  reason: collision with root package name */
    public final LiveData<wn.v> f51029n0;

    /* renamed from: o0  reason: collision with root package name */
    public final androidx.lifecycle.e0<MRError> f51030o0;

    /* renamed from: p0  reason: collision with root package name */
    public final LiveData<MRError> f51031p0;

    /* renamed from: q0  reason: collision with root package name */
    public final androidx.lifecycle.e0<LiveArchiveDownloadUrlResponse> f51032q0;

    /* renamed from: r0  reason: collision with root package name */
    public final LiveData<LiveArchiveDownloadUrlResponse> f51033r0;

    /* renamed from: s0  reason: collision with root package name */
    public final androidx.lifecycle.e0<MRError> f51034s0;

    /* renamed from: t0  reason: collision with root package name */
    public final LiveData<MRError> f51035t0;

    /* renamed from: u0  reason: collision with root package name */
    public final androidx.lifecycle.e0<MRError> f51036u0;

    /* renamed from: v0  reason: collision with root package name */
    public final LiveData<MRError> f51037v0;

    /* renamed from: w0  reason: collision with root package name */
    public final androidx.lifecycle.e0<wn.k<Boolean, Boolean>> f51038w0;

    /* renamed from: x0  reason: collision with root package name */
    public final LiveData<wn.k<Boolean, Boolean>> f51039x0;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f51040y;

    /* renamed from: y0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f51041y0;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f51042z;

    /* renamed from: z0  reason: collision with root package name */
    public final LiveData<Boolean> f51043z0;

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageStore$on$13", f = "MyPageStore.kt", l = {355}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f51044w;

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
            int i10 = this.f51044w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = u1.this.F0;
                wn.v vVar = wn.v.f59242a;
                this.f51044w = 1;
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

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageStore$on$14", f = "MyPageStore.kt", l = {362}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f51046w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ j0.C0717j0 f51048y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j0.C0717j0 c0717j0, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f51048y = c0717j0;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f51048y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f51046w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = u1.this.G0;
                Integer d10 = co.b.d(this.f51048y.a());
                this.f51046w = 1;
                if (fVar.r(d10, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageStore$on$1", f = "MyPageStore.kt", l = {191}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f51049w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ j0.n f51051y;

        public c(j0.n nVar, ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f51051y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            int i10 = this.f51049w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f unused = u1.this.E0;
                throw null;
            } else if (i10 == 1) {
                wn.m.b(obj);
                return wn.v.f59242a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageStore$on$6", f = "MyPageStore.kt", l = {247}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f51052w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i1.n f51054y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i1.n nVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f51054y = nVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f51054y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f51052w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = u1.this.H0;
                wn.k a10 = wn.q.a(this.f51054y.a(), this.f51054y.b());
                this.f51052w = 1;
                if (fVar.r(a10, this) == c10) {
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

    public u1(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f51040y = aVar;
        this.f51042z = uo.r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<UserMe> e0Var = new androidx.lifecycle.e0<>(null);
        this.A = e0Var;
        this.B = e0Var;
        Boolean bool = Boolean.FALSE;
        androidx.lifecycle.e0<Boolean> e0Var2 = new androidx.lifecycle.e0<>(bool);
        this.C = e0Var2;
        this.D = e0Var2;
        androidx.lifecycle.e0<List<EventBannerResponse>> e0Var3 = new androidx.lifecycle.e0<>(xn.s.k());
        this.E = e0Var3;
        this.F = e0Var3;
        androidx.lifecycle.e0<String> e0Var4 = new androidx.lifecycle.e0<>(null);
        this.G = e0Var4;
        this.H = e0Var4;
        androidx.lifecycle.e0<Boolean> e0Var5 = new androidx.lifecycle.e0<>(null);
        this.I = e0Var5;
        this.J = e0Var5;
        androidx.lifecycle.e0<Bitmap> e0Var6 = new androidx.lifecycle.e0<>(null);
        this.K = e0Var6;
        this.L = e0Var6;
        androidx.lifecycle.e0<Bitmap> e0Var7 = new androidx.lifecycle.e0<>(null);
        this.M = e0Var7;
        this.N = e0Var7;
        androidx.lifecycle.e0<Integer> e0Var8 = new androidx.lifecycle.e0<>(0);
        this.O = e0Var8;
        this.P = e0Var8;
        androidx.lifecycle.e0<List<LiveBasicParams>> e0Var9 = new androidx.lifecycle.e0<>(xn.s.k());
        this.Q = e0Var9;
        this.R = e0Var9;
        androidx.lifecycle.e0<Integer> e0Var10 = new androidx.lifecycle.e0<>(null);
        this.S = e0Var10;
        this.T = e0Var10;
        androidx.lifecycle.e0<Boolean> e0Var11 = new androidx.lifecycle.e0<>(bool);
        this.U = e0Var11;
        this.V = e0Var11;
        androidx.lifecycle.e0<List<ViewHistoryParams>> e0Var12 = new androidx.lifecycle.e0<>(xn.s.k());
        this.W = e0Var12;
        this.X = e0Var12;
        androidx.lifecycle.e0<String> e0Var13 = new androidx.lifecycle.e0<>(null);
        this.Y = e0Var13;
        this.Z = e0Var13;
        androidx.lifecycle.e0<Boolean> e0Var14 = new androidx.lifecycle.e0<>(bool);
        this.f51016a0 = e0Var14;
        this.f51017b0 = e0Var14;
        androidx.lifecycle.e0<MRError> e0Var15 = new androidx.lifecycle.e0<>(null);
        this.f51018c0 = e0Var15;
        this.f51019d0 = e0Var15;
        androidx.lifecycle.e0<List<Chat.Thread>> e0Var16 = new androidx.lifecycle.e0<>(xn.s.k());
        this.f51020e0 = e0Var16;
        this.f51021f0 = e0Var16;
        androidx.lifecycle.e0<Integer> e0Var17 = new androidx.lifecycle.e0<>(null);
        this.f51022g0 = e0Var17;
        this.f51023h0 = e0Var17;
        androidx.lifecycle.e0<Boolean> e0Var18 = new androidx.lifecycle.e0<>(bool);
        this.f51024i0 = e0Var18;
        this.f51025j0 = e0Var18;
        androidx.lifecycle.e0<MRError> e0Var19 = new androidx.lifecycle.e0<>(null);
        this.f51026k0 = e0Var19;
        this.f51027l0 = e0Var19;
        androidx.lifecycle.e0<wn.v> e0Var20 = new androidx.lifecycle.e0<>(null);
        this.f51028m0 = e0Var20;
        this.f51029n0 = e0Var20;
        androidx.lifecycle.e0<MRError> e0Var21 = new androidx.lifecycle.e0<>(null);
        this.f51030o0 = e0Var21;
        this.f51031p0 = e0Var21;
        androidx.lifecycle.e0<LiveArchiveDownloadUrlResponse> e0Var22 = new androidx.lifecycle.e0<>(null);
        this.f51032q0 = e0Var22;
        this.f51033r0 = e0Var22;
        androidx.lifecycle.e0<MRError> e0Var23 = new androidx.lifecycle.e0<>(null);
        this.f51034s0 = e0Var23;
        this.f51035t0 = e0Var23;
        androidx.lifecycle.e0<MRError> e0Var24 = new androidx.lifecycle.e0<>(null);
        this.f51036u0 = e0Var24;
        this.f51037v0 = e0Var24;
        androidx.lifecycle.e0<wn.k<Boolean, Boolean>> e0Var25 = new androidx.lifecycle.e0<>(wn.q.a(bool, bool));
        this.f51038w0 = e0Var25;
        this.f51039x0 = e0Var25;
        androidx.lifecycle.e0<Boolean> e0Var26 = new androidx.lifecycle.e0<>(bool);
        this.f51041y0 = e0Var26;
        this.f51043z0 = e0Var26;
        androidx.lifecycle.e0<LiveAnnouncement> e0Var27 = new androidx.lifecycle.e0<>(null);
        this.A0 = e0Var27;
        this.B0 = e0Var27;
        androidx.lifecycle.e0<ChatStatus> e0Var28 = new androidx.lifecycle.e0<>(null);
        this.C0 = e0Var28;
        this.D0 = e0Var28;
        this.E0 = wo.g.a(-2);
        this.F0 = wo.g.a(-2);
        this.G0 = wo.g.a(-2);
        this.H0 = wo.g.a(-2);
    }

    public final LiveData<List<LiveBasicParams>> A() {
        return this.R;
    }

    public final LiveData<UserMe> B() {
        return this.B;
    }

    public final LiveData<String> C() {
        return this.Z;
    }

    public final LiveData<Integer> D() {
        return this.f51023h0;
    }

    public final LiveData<Integer> E() {
        return this.T;
    }

    public final LiveData<Integer> F() {
        return this.P;
    }

    public final wo.x<wn.v> G() {
        return this.F0.g();
    }

    public final wo.x<Integer> H() {
        return this.G0.g();
    }

    public final LiveData<wn.v> I() {
        return this.f51029n0;
    }

    public final LiveData<String> J() {
        return this.H;
    }

    public final LiveData<List<ViewHistoryParams>> K() {
        return this.X;
    }

    public final LiveData<Boolean> L() {
        return this.D;
    }

    public final LiveData<Boolean> M() {
        return this.f51025j0;
    }

    public final LiveData<Boolean> N() {
        return this.V;
    }

    public final LiveData<Boolean> O() {
        return this.f51017b0;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f51040y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f51042z.getCoroutineContext();
    }

    public final LiveData<Bitmap> j() {
        return this.N;
    }

    public final LiveData<Bitmap> k() {
        return this.L;
    }

    public final LiveData<ChatStatus> l() {
        return this.D0;
    }

    public final LiveData<List<Chat.Thread>> m() {
        return this.f51021f0;
    }

    public final LiveData<Boolean> n() {
        return this.f51043z0;
    }

    public final LiveData<wn.k<Boolean, Boolean>> o() {
        return this.f51039x0;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.l lVar) {
        jo.p.h(lVar, "event");
        this.f51038w0.p(wn.q.a(Boolean.valueOf(lVar.a()), Boolean.valueOf(lVar.b())));
    }

    public final LiveData<MRError> p() {
        return this.f51037v0;
    }

    public final LiveData<MRError> q() {
        return this.f51019d0;
    }

    public final LiveData<MRError> r() {
        return this.f51035t0;
    }

    public final LiveData<MRError> s() {
        return this.f51027l0;
    }

    public final LiveData<MRError> t() {
        return this.f51031p0;
    }

    public final LiveData<List<EventBannerResponse>> u() {
        return this.F;
    }

    public final wo.x<MRError> v() {
        return this.E0.g();
    }

    public final xo.c<wn.k<MRError, String>> w() {
        return xo.e.a(this.H0);
    }

    public final LiveData<Boolean> x() {
        return this.J;
    }

    public final LiveData<LiveAnnouncement> y() {
        return this.B0;
    }

    public final LiveData<LiveArchiveDownloadUrlResponse> z() {
        return this.f51033r0;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.i iVar) {
        jo.p.h(iVar, "event");
        this.f51041y0.p(Boolean.valueOf(iVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.f0 f0Var) {
        jo.p.h(f0Var, "event");
        this.C.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.e0 e0Var) {
        jo.p.h(e0Var, "event");
        this.C.p(Boolean.FALSE);
        this.A.p(e0Var.a());
        androidx.lifecycle.e0<LiveAnnouncement> e0Var2 = this.A0;
        UserMe a10 = e0Var.a();
        e0Var2.p(a10 != null ? a10.getLiveAnnouncement() : null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.m mVar) {
        jo.p.h(mVar, "event");
        this.E.p(mVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.i0 i0Var) {
        jo.p.h(i0Var, "event");
        this.G.p(i0Var.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.o oVar) {
        jo.p.h(oVar, "event");
        this.I.p(Boolean.valueOf(oVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.e eVar) {
        jo.p.h(eVar, "event");
        this.K.p(eVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.a aVar) {
        jo.p.h(aVar, "event");
        this.M.p(aVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.h0 h0Var) {
        jo.p.h(h0Var, "event");
        this.O.p(Integer.valueOf(h0Var.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.y yVar) {
        jo.p.h(yVar, "event");
        this.U.p(Boolean.TRUE);
        this.Q.p(xn.s.k());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.x xVar) {
        jo.p.h(xVar, "event");
        this.U.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.q qVar) {
        jo.p.h(qVar, "event");
        this.U.p(Boolean.FALSE);
        this.Q.p(qVar.a().getLives());
        this.S.p(Integer.valueOf(qVar.a().getNextPage()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.c cVar) {
        jo.p.h(cVar, "event");
        this.U.p(Boolean.FALSE);
        androidx.lifecycle.e0<List<LiveBasicParams>> e0Var = this.Q;
        List<LiveBasicParams> f10 = e0Var.f();
        if (f10 == null) {
            f10 = xn.s.k();
        }
        e0Var.p(xn.a0.o0(f10, cVar.a().getLives()));
        this.S.p(Integer.valueOf(cVar.a().getNextPage()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.n nVar) {
        jo.p.h(nVar, "event");
        uo.l.d(this, null, null, new c(nVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.q0 q0Var) {
        jo.p.h(q0Var, "event");
        this.W.p(xn.s.k());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.r0 r0Var) {
        jo.p.h(r0Var, "event");
        this.f51016a0.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.m0 m0Var) {
        jo.p.h(m0Var, "event");
        this.f51016a0.p(Boolean.FALSE);
        androidx.lifecycle.e0<List<ViewHistoryParams>> e0Var = this.W;
        List<ViewHistoryParams> lives = m0Var.a().getLives();
        List<ViewHistoryParams> f10 = this.W.f();
        if (f10 == null) {
            f10 = xn.s.k();
        }
        List o02 = xn.a0.o0(lives, f10);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : o02) {
            if (hashSet.add(((ViewHistoryParams) obj).getLiveId())) {
                arrayList.add(obj);
            }
        }
        e0Var.p(arrayList);
        this.Y.p(m0Var.a().getNextCursor());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.d dVar) {
        jo.p.h(dVar, "event");
        this.f51016a0.p(Boolean.FALSE);
        androidx.lifecycle.e0<List<ViewHistoryParams>> e0Var = this.W;
        List<ViewHistoryParams> f10 = e0Var.f();
        if (f10 == null) {
            f10 = xn.s.k();
        }
        List o02 = xn.a0.o0(f10, dVar.a().getLives());
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : o02) {
            if (hashSet.add(((ViewHistoryParams) obj).getLiveId())) {
                arrayList.add(obj);
            }
        }
        e0Var.p(arrayList);
        this.Y.p(dVar.a().getNextCursor());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.p0 p0Var) {
        jo.p.h(p0Var, "event");
        this.f51018c0.p(p0Var.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.o oVar) {
        jo.p.h(oVar, "event");
        androidx.lifecycle.e0<List<ViewHistoryParams>> e0Var = this.W;
        List<ViewHistoryParams> f10 = e0Var.f();
        if (f10 != null) {
            for (ViewHistoryParams viewHistoryParams : f10) {
                if (jo.p.c(viewHistoryParams.getOwner().getUserId(), oVar.b())) {
                    viewHistoryParams.setFollow(true);
                }
            }
        } else {
            f10 = null;
        }
        e0Var.p(f10);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.g0 g0Var) {
        jo.p.h(g0Var, "event");
        androidx.lifecycle.e0<List<ViewHistoryParams>> e0Var = this.W;
        List<ViewHistoryParams> f10 = e0Var.f();
        if (f10 != null) {
            for (ViewHistoryParams viewHistoryParams : f10) {
                if (jo.p.c(viewHistoryParams.getOwner().getUserId(), g0Var.a())) {
                    viewHistoryParams.setFollow(false);
                }
            }
        } else {
            f10 = null;
        }
        e0Var.p(f10);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.n nVar) {
        jo.p.h(nVar, "event");
        uo.l.d(this, null, null, new d(nVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.h hVar) {
        jo.p.h(hVar, "event");
        this.f51024i0.p(Boolean.TRUE);
        this.f51020e0.p(xn.s.k());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.g gVar) {
        jo.p.h(gVar, "event");
        this.f51024i0.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.p pVar) {
        jo.p.h(pVar, "event");
        this.f51024i0.p(Boolean.FALSE);
        this.C0.p(pVar.a().getChatStatus());
        this.f51020e0.p(pVar.a().getThreads());
        this.f51022g0.p(Integer.valueOf(pVar.a().getNextPage()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.b bVar) {
        jo.p.h(bVar, "event");
        this.f51024i0.p(Boolean.FALSE);
        androidx.lifecycle.e0<List<Chat.Thread>> e0Var = this.f51020e0;
        List<Chat.Thread> f10 = e0Var.f();
        if (f10 == null) {
            f10 = xn.s.k();
        }
        e0Var.p(xn.a0.o0(f10, bVar.a().getThreads()));
        this.f51022g0.p(Integer.valueOf(bVar.a().getNextPage()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.f fVar) {
        jo.p.h(fVar, "event");
        this.f51026k0.p(fVar.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.l0 l0Var) {
        jo.p.h(l0Var, "event");
        androidx.lifecycle.e0<List<Chat.Thread>> e0Var = this.f51020e0;
        List<Chat.Thread> f10 = e0Var.f();
        Chat.Thread thread = null;
        if (f10 != null) {
            List<Chat.Thread> f11 = this.f51020e0.f();
            if (f11 != null) {
                jo.p.g(f11, "value");
                Iterator<T> it = f11.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (jo.p.c(((Chat.Thread) next).getUserId(), l0Var.a())) {
                        thread = next;
                        break;
                    }
                }
                thread = thread;
            }
            if (thread != null) {
                thread.setNew(0);
            }
        } else {
            f10 = null;
        }
        e0Var.p(f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.k0 k0Var) {
        jo.p.h(k0Var, "event");
        androidx.lifecycle.e0<List<Chat.Thread>> e0Var = this.f51020e0;
        List<Chat.Thread> f10 = e0Var.f();
        Chat.Thread thread = null;
        if (f10 != null) {
            List<Chat.Thread> f11 = this.f51020e0.f();
            if (f11 != null) {
                jo.p.g(f11, "value");
                Iterator<T> it = f11.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (jo.p.c(((Chat.Thread) next).getGroupId(), k0Var.a())) {
                        thread = next;
                        break;
                    }
                }
                thread = thread;
            }
            if (thread != null) {
                thread.setNew(0);
            }
        } else {
            f10 = null;
        }
        e0Var.p(f10);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.s sVar) {
        ArrayList arrayList;
        jo.p.h(sVar, "event");
        androidx.lifecycle.e0<List<Chat.Thread>> e0Var = this.f51020e0;
        List<Chat.Thread> f10 = e0Var.f();
        if (f10 != null) {
            arrayList = new ArrayList();
            for (Object obj : f10) {
                if (!jo.p.c(((Chat.Thread) obj).getUserId(), sVar.a())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        e0Var.p(arrayList);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.r rVar) {
        ArrayList arrayList;
        jo.p.h(rVar, "event");
        androidx.lifecycle.e0<List<Chat.Thread>> e0Var = this.f51020e0;
        List<Chat.Thread> f10 = e0Var.f();
        if (f10 != null) {
            arrayList = new ArrayList();
            for (Object obj : f10) {
                if (!jo.p.c(((Chat.Thread) obj).getGroupId(), rVar.a())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        e0Var.p(arrayList);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.b0 b0Var) {
        jo.p.h(b0Var, "event");
        List<LiveBasicParams> f10 = this.Q.f();
        if (f10 != null) {
            int i10 = 0;
            Iterator<LiveBasicParams> it = f10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                } else if (jo.p.c(it.next().getLiveId(), b0Var.a().getLiveId())) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 >= 0) {
                List<LiveBasicParams> D0 = xn.a0.D0(f10);
                D0.set(i10, b0Var.a());
                this.Q.p(D0);
            }
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.u uVar) {
        jo.p.h(uVar, "event");
        this.f51028m0.p(wn.v.f59242a);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.d0 d0Var) {
        jo.p.h(d0Var, "event");
        this.f51030o0.p(d0Var.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.w wVar) {
        jo.p.h(wVar, "event");
        this.f51032q0.p(wVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.v vVar) {
        jo.p.h(vVar, "event");
        this.f51034s0.p(vVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.z zVar) {
        ArrayList arrayList;
        jo.p.h(zVar, "event");
        androidx.lifecycle.e0<List<LiveBasicParams>> e0Var = this.Q;
        List<LiveBasicParams> f10 = e0Var.f();
        if (f10 != null) {
            arrayList = new ArrayList();
            for (Object obj : f10) {
                if (!jo.p.c(((LiveBasicParams) obj).getLiveId(), zVar.a())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        e0Var.p(arrayList);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.a0 a0Var) {
        jo.p.h(a0Var, "event");
        this.f51036u0.p(a0Var.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.n0 n0Var) {
        jo.p.h(n0Var, "event");
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.C0717j0 c0717j0) {
        jo.p.h(c0717j0, "event");
        uo.l.d(this, null, null, new b(c0717j0, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.k kVar) {
        jo.p.h(kVar, "event");
        this.A0.p(null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y.g gVar) {
        jo.p.h(gVar, "event");
        this.A0.p(gVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j0.o0 o0Var) {
        jo.p.h(o0Var, "event");
        this.C0.p(o0Var.a());
    }
}
