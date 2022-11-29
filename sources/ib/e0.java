package ib;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.q0;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import java.util.List;
import nd.s0;
import org.greenrobot.eventbus.ThreadMode;
import pd.g0;
import pd.i1;
import uo.r0;

/* loaded from: classes2.dex */
public final class e0 extends q0 implements uo.q0 {
    public final String A;
    public final String B;
    public final boolean C;
    public final boolean D;
    public final long E;
    public final String F;
    public final s0<oe.b> G;
    public final wo.f<Long> H;
    public final androidx.lifecycle.e0<Long> I;
    public final LiveData<Long> J;
    public final androidx.lifecycle.e0<Long> K;
    public final androidx.lifecycle.e0<Boolean> L;
    public final wo.f<MRError> M;
    public final androidx.lifecycle.e0<Integer> N;
    public final LiveData<Integer> O;
    public final androidx.lifecycle.e0<Boolean> P;
    public final LiveData<Boolean> Q;
    public final androidx.lifecycle.e0<Integer> R;
    public final LiveData<Integer> S;
    public final androidx.lifecycle.e0<Boolean> T;
    public final LiveData<Boolean> U;
    public final wo.f<wn.v> V;
    public final androidx.lifecycle.e0<List<App.AppParams>> W;
    public final LiveData<List<App.AppParams>> X;
    public final androidx.lifecycle.e0<String> Y;
    public final LiveData<String> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f36554a0;

    /* renamed from: b0  reason: collision with root package name */
    public final LiveData<Boolean> f36555b0;

    /* renamed from: c0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f36556c0;

    /* renamed from: d0  reason: collision with root package name */
    public final LiveData<Boolean> f36557d0;

    /* renamed from: e0  reason: collision with root package name */
    public final wo.f<MRError> f36558e0;

    /* renamed from: f0  reason: collision with root package name */
    public final s0<List<LiveBasicParams>> f36559f0;

    /* renamed from: g0  reason: collision with root package name */
    public final wo.f<LiveBasicParams> f36560g0;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f36561y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f36562z;

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestStore$on$1", f = "LiveRequestStore.kt", l = {105}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f36563w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g0.h f36565y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g0.h hVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f36565y = hVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f36565y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f36563w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = e0.this.G;
                oe.b a10 = this.f36565y.a();
                this.f36563w = 1;
                if (s0Var.d(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestStore$on$2", f = "LiveRequestStore.kt", l = {114}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f36566w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g0.k f36568y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g0.k kVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f36568y = kVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f36568y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f36566w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = e0.this.H;
                Long e10 = co.b.e(this.f36568y.a());
                this.f36566w = 1;
                if (fVar.r(e10, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestStore$on$3", f = "LiveRequestStore.kt", l = {132}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f36569w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g0.b f36571y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g0.b bVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f36571y = bVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f36571y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f36569w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = e0.this.M;
                MRError a10 = this.f36571y.a();
                this.f36569w = 1;
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

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestStore$on$4", f = "LiveRequestStore.kt", l = {152}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f36572w;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f36572w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = e0.this.V;
                wn.v vVar = wn.v.f59242a;
                this.f36572w = 1;
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

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestStore$on$5", f = "LiveRequestStore.kt", l = {187}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f36574w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g0.g f36576y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(g0.g gVar, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f36576y = gVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f36576y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f36574w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = e0.this.f36559f0;
                List<LiveBasicParams> lives = this.f36576y.a().getLives();
                this.f36574w = 1;
                if (s0Var.d(lives, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestStore$on$6", f = "LiveRequestStore.kt", l = {195}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f36577w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g0.e f36579y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(g0.e eVar, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f36579y = eVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f36579y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f36577w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = e0.this.f36558e0;
                MRError a10 = this.f36579y.a();
                this.f36577w = 1;
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

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestStore$on$7", f = "LiveRequestStore.kt", l = {202}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f36580w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g0.j f36582y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(g0.j jVar, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f36582y = jVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f36582y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f36580w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = e0.this.f36560g0;
                LiveBasicParams a10 = this.f36582y.a();
                this.f36580w = 1;
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

    public e0(oe.a aVar, q8.a aVar2) {
        jo.p.h(aVar, "liveRequest");
        jo.p.h(aVar2, "dispatcher");
        this.f36561y = aVar2;
        this.f36562z = r0.b();
        aVar2.b(this);
        this.A = aVar.c();
        this.B = aVar.f();
        this.C = aVar.e();
        this.D = aVar.a();
        this.E = aVar.d();
        this.F = aVar.b();
        this.G = new s0<>();
        this.H = wo.g.a(-2);
        androidx.lifecycle.e0<Long> e0Var = new androidx.lifecycle.e0<>(0L);
        this.I = e0Var;
        this.J = e0Var;
        this.K = new androidx.lifecycle.e0<>(0L);
        Boolean bool = Boolean.FALSE;
        this.L = new androidx.lifecycle.e0<>(bool);
        this.M = wo.g.a(-2);
        androidx.lifecycle.e0<Integer> e0Var2 = new androidx.lifecycle.e0<>(null);
        this.N = e0Var2;
        this.O = e0Var2;
        androidx.lifecycle.e0<Boolean> e0Var3 = new androidx.lifecycle.e0<>(bool);
        this.P = e0Var3;
        this.Q = e0Var3;
        androidx.lifecycle.e0<Integer> e0Var4 = new androidx.lifecycle.e0<>(0);
        this.R = e0Var4;
        this.S = e0Var4;
        androidx.lifecycle.e0<Boolean> e0Var5 = new androidx.lifecycle.e0<>(bool);
        this.T = e0Var5;
        this.U = e0Var5;
        this.V = wo.g.a(-2);
        androidx.lifecycle.e0<List<App.AppParams>> e0Var6 = new androidx.lifecycle.e0<>(xn.s.k());
        this.W = e0Var6;
        this.X = e0Var6;
        androidx.lifecycle.e0<String> e0Var7 = new androidx.lifecycle.e0<>(null);
        this.Y = e0Var7;
        this.Z = e0Var7;
        androidx.lifecycle.e0<Boolean> e0Var8 = new androidx.lifecycle.e0<>(bool);
        this.f36554a0 = e0Var8;
        this.f36555b0 = e0Var8;
        androidx.lifecycle.e0<Boolean> e0Var9 = new androidx.lifecycle.e0<>(bool);
        this.f36556c0 = e0Var9;
        this.f36557d0 = e0Var9;
        this.f36558e0 = wo.g.a(-2);
        this.f36559f0 = new s0<>();
        this.f36560g0 = wo.g.a(-2);
    }

    public final long A() {
        return this.E;
    }

    public final wo.x<LiveBasicParams> B() {
        return this.f36560g0.g();
    }

    public final boolean C() {
        return this.C;
    }

    public final oe.b D() {
        return this.G.b();
    }

    public final wo.x<oe.b> E() {
        return this.G.c();
    }

    public final wo.x<wn.v> F() {
        return this.V.g();
    }

    public final String G() {
        return this.B;
    }

    public final LiveData<Boolean> H() {
        return this.Q;
    }

    public final boolean I() {
        Boolean f10 = this.L.f();
        if (f10 == null) {
            f10 = Boolean.FALSE;
        }
        return f10.booleanValue();
    }

    public final LiveData<Boolean> J() {
        return this.f36555b0;
    }

    public final LiveData<Boolean> K() {
        return this.U;
    }

    public final LiveData<Boolean> L() {
        return this.f36557d0;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        super.d();
        this.f36561y.c(this);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f36562z.getCoroutineContext();
    }

    public final LiveData<List<App.AppParams>> m() {
        return this.X;
    }

    public final LiveData<Integer> n() {
        return this.O;
    }

    public final wo.x<MRError> o() {
        return this.f36558e0.g();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g0.h hVar) {
        jo.p.h(hVar, "event");
        this.I.p(Long.valueOf(hVar.a().f()));
        this.P.p(Boolean.valueOf(hVar.a().m()));
        this.R.p(Integer.valueOf(hVar.a().d()));
        uo.l.d(this, null, null, new a(hVar, null), 3, null);
    }

    public final wo.x<MRError> p() {
        return this.M.g();
    }

    public final wo.x<Long> q() {
        return this.H.g();
    }

    public final LiveData<Integer> r() {
        return this.S;
    }

    public final boolean s() {
        return this.D;
    }

    public final String t() {
        return this.F;
    }

    public final String u() {
        return this.A;
    }

    public final LiveData<Long> v() {
        return this.J;
    }

    public final LiveData<String> w() {
        return this.Z;
    }

    public final long x() {
        Long f10 = this.K.f();
        if (f10 == null) {
            f10 = 0L;
        }
        return f10.longValue();
    }

    public final List<LiveBasicParams> y() {
        return this.f36559f0.b();
    }

    public final wo.x<List<LiveBasicParams>> z() {
        return this.f36559f0.c();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g0.k kVar) {
        jo.p.h(kVar, "event");
        this.I.p(Long.valueOf(kVar.a()));
        this.L.p(Boolean.TRUE);
        uo.l.d(this, null, null, new b(kVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g0.l lVar) {
        jo.p.h(lVar, "event");
        this.K.p(Long.valueOf(lVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g0.a aVar) {
        jo.p.h(aVar, "event");
        Long f10 = this.K.f();
        if (f10 == null) {
            f10 = 0L;
        }
        this.K.p(Long.valueOf(f10.longValue() + aVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g0.b bVar) {
        jo.p.h(bVar, "event");
        uo.l.d(this, null, null, new c(bVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g0.d dVar) {
        jo.p.h(dVar, "event");
        this.N.p(xn.a0.Z(dVar.a().getRewardAdIds()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g0.m mVar) {
        jo.p.h(mVar, "event");
        this.T.p(Boolean.valueOf(mVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.o oVar) {
        jo.p.h(oVar, "event");
        androidx.lifecycle.e0<Integer> e0Var = this.R;
        Integer f10 = e0Var.f();
        if (f10 == null) {
            f10 = 0;
        }
        e0Var.p(Integer.valueOf(f10.intValue() + 1));
        this.P.p(Boolean.TRUE);
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.g0 g0Var) {
        jo.p.h(g0Var, "event");
        androidx.lifecycle.e0<Integer> e0Var = this.R;
        Integer f10 = e0Var.f();
        if (f10 == null) {
            f10 = 0;
        }
        e0Var.p(Integer.valueOf(Math.max(f10.intValue() - 1, 0)));
        this.P.p(Boolean.FALSE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g0.c cVar) {
        jo.p.h(cVar, "event");
        this.f36554a0.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g0.f fVar) {
        jo.p.h(fVar, "event");
        this.f36554a0.p(Boolean.FALSE);
        androidx.lifecycle.e0<List<App.AppParams>> e0Var = this.W;
        List<App.AppParams> f10 = e0Var.f();
        if (f10 == null) {
            f10 = xn.s.k();
        }
        e0Var.p(xn.a0.o0(f10, fVar.a().getApps()));
        this.Y.p(fVar.a().getNextCursor());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g0.i iVar) {
        jo.p.h(iVar, "event");
        this.f36556c0.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g0.g gVar) {
        jo.p.h(gVar, "event");
        this.f36556c0.p(Boolean.FALSE);
        uo.l.d(this, null, null, new e(gVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g0.e eVar) {
        jo.p.h(eVar, "event");
        this.f36556c0.p(Boolean.FALSE);
        uo.l.d(this, null, null, new f(eVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g0.j jVar) {
        jo.p.h(jVar, "event");
        uo.l.d(this, null, null, new g(jVar, null), 3, null);
    }
}
