package nf;

import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.ToolTipStartLiveButtonResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jf.t0;
import org.greenrobot.eventbus.ThreadMode;
import pd.s;
import pd.w0;
import uo.r0;

/* loaded from: classes3.dex */
public final class o implements uo.q0 {

    /* renamed from: q0  reason: collision with root package name */
    public static final a f43084q0 = new a(null);

    /* renamed from: r0  reason: collision with root package name */
    public static final int f43085r0 = 8;

    /* renamed from: s0  reason: collision with root package name */
    public static o f43086s0;
    public final LiveData<jf.f> A;
    public final androidx.lifecycle.e0<Integer> B;
    public final LiveData<Integer> C;
    public final androidx.lifecycle.e0<List<App.AppParams>> D;
    public final LiveData<List<App.AppParams>> E;
    public final androidx.lifecycle.e0<String> F;
    public final LiveData<String> G;
    public final androidx.lifecycle.e0<Boolean> H;
    public final LiveData<Boolean> I;
    public final androidx.lifecycle.e0<Boolean> J;
    public final LiveData<Boolean> K;
    public final androidx.lifecycle.e0<String> L;
    public final LiveData<String> M;
    public final androidx.lifecycle.e0<Boolean> N;
    public final LiveData<Boolean> O;
    public final wo.f<wn.v> P;
    public final wo.f<wn.v> Q;
    public final wo.f<t0> R;
    public final wo.f<MRError> S;
    public final wo.f<wn.v> T;
    public final xo.r<Integer> U;
    public final xo.w<Integer> V;
    public final androidx.lifecycle.e0<Boolean> W;
    public final LiveData<Boolean> X;
    public final androidx.lifecycle.e0<Boolean> Y;
    public final LiveData<Boolean> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f43087a0;

    /* renamed from: b0  reason: collision with root package name */
    public final LiveData<Boolean> f43088b0;

    /* renamed from: c0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f43089c0;

    /* renamed from: d0  reason: collision with root package name */
    public final LiveData<Boolean> f43090d0;

    /* renamed from: e0  reason: collision with root package name */
    public final androidx.lifecycle.e0<ToolTipStartLiveButtonResponse> f43091e0;

    /* renamed from: f0  reason: collision with root package name */
    public final LiveData<ToolTipStartLiveButtonResponse> f43092f0;

    /* renamed from: g0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f43093g0;

    /* renamed from: h0  reason: collision with root package name */
    public final LiveData<Boolean> f43094h0;

    /* renamed from: i0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f43095i0;

    /* renamed from: j0  reason: collision with root package name */
    public final LiveData<Boolean> f43096j0;

    /* renamed from: k0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f43097k0;

    /* renamed from: l0  reason: collision with root package name */
    public final LiveData<Integer> f43098l0;

    /* renamed from: m0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f43099m0;

    /* renamed from: n0  reason: collision with root package name */
    public final LiveData<Integer> f43100n0;

    /* renamed from: o0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f43101o0;

    /* renamed from: p0  reason: collision with root package name */
    public final LiveData<Integer> f43102p0;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f43103w;

    /* renamed from: x  reason: collision with root package name */
    public final jf.d0 f43104x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ da.j f43105y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<jf.f> f43106z;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final o a(q8.a aVar, jf.d0 d0Var) {
            jo.p.h(aVar, "dispatcher");
            jo.p.h(d0Var, "myAppRepository");
            o oVar = o.f43086s0;
            if (oVar != null) {
                oVar.j();
            }
            o oVar2 = new o(aVar, d0Var, null);
            o.f43086s0 = oVar2;
            return oVar2;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.GlobalStore$on$2", f = "GlobalStore.kt", l = {200}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43107w;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43107w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = o.this.P;
                wn.v vVar = wn.v.f59242a;
                this.f43107w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.GlobalStore$on$3", f = "GlobalStore.kt", l = {208}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43109w;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43109w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = o.this.Q;
                wn.v vVar = wn.v.f59242a;
                this.f43109w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.GlobalStore$on$4", f = "GlobalStore.kt", l = {215}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43111w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s.b0 f43113y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(s.b0 b0Var, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f43113y = b0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f43113y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43111w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = o.this.R;
                t0 a10 = this.f43113y.a();
                this.f43111w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.GlobalStore$on$5", f = "GlobalStore.kt", l = {222}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43114w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s.d0 f43116y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(s.d0 d0Var, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f43116y = d0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f43116y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43114w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = o.this.S;
                MRError a10 = this.f43116y.a();
                this.f43114w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.GlobalStore$on$6", f = "GlobalStore.kt", l = {230}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43117w;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43117w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = o.this.T;
                wn.v vVar = wn.v.f59242a;
                this.f43117w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.GlobalStore$on$7", f = "GlobalStore.kt", l = {299}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43119w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s.f0 f43121y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(s.f0 f0Var, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f43121y = f0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f43121y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43119w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = o.this.U;
                Integer d10 = co.b.d(this.f43121y.a());
                this.f43119w = 1;
                if (rVar.emit(d10, this) == c10) {
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

    public o(q8.a aVar, jf.d0 d0Var) {
        this.f43103w = aVar;
        this.f43104x = d0Var;
        this.f43105y = new da.j();
        aVar.b(this);
        androidx.lifecycle.e0<jf.f> e0Var = new androidx.lifecycle.e0<>(new jf.f(0, 0));
        this.f43106z = e0Var;
        this.A = e0Var;
        androidx.lifecycle.e0<Integer> e0Var2 = new androidx.lifecycle.e0<>(0);
        this.B = e0Var2;
        this.C = e0Var2;
        androidx.lifecycle.e0<List<App.AppParams>> e0Var3 = new androidx.lifecycle.e0<>(xn.s.k());
        this.D = e0Var3;
        this.E = e0Var3;
        androidx.lifecycle.e0<String> e0Var4 = new androidx.lifecycle.e0<>(null);
        this.F = e0Var4;
        this.G = e0Var4;
        Boolean bool = Boolean.FALSE;
        androidx.lifecycle.e0<Boolean> e0Var5 = new androidx.lifecycle.e0<>(bool);
        this.H = e0Var5;
        this.I = e0Var5;
        androidx.lifecycle.e0<Boolean> e0Var6 = new androidx.lifecycle.e0<>(bool);
        this.J = e0Var6;
        this.K = e0Var6;
        androidx.lifecycle.e0<String> e0Var7 = new androidx.lifecycle.e0<>(null);
        this.L = e0Var7;
        this.M = e0Var7;
        androidx.lifecycle.e0<Boolean> e0Var8 = new androidx.lifecycle.e0<>(bool);
        this.N = e0Var8;
        this.O = e0Var8;
        this.P = wo.g.a(-2);
        this.Q = wo.g.a(-2);
        this.R = wo.g.a(-2);
        this.S = wo.g.a(-2);
        this.T = wo.g.a(-2);
        xo.r<Integer> b10 = xo.y.b(0, 0, null, 7, null);
        this.U = b10;
        this.V = b10;
        androidx.lifecycle.e0<Boolean> e0Var9 = new androidx.lifecycle.e0<>(bool);
        this.W = e0Var9;
        this.X = e0Var9;
        androidx.lifecycle.e0<Boolean> e0Var10 = new androidx.lifecycle.e0<>(bool);
        this.Y = e0Var10;
        this.Z = e0Var10;
        androidx.lifecycle.e0<Boolean> e0Var11 = new androidx.lifecycle.e0<>(bool);
        this.f43087a0 = e0Var11;
        this.f43088b0 = e0Var11;
        androidx.lifecycle.e0<Boolean> e0Var12 = new androidx.lifecycle.e0<>(bool);
        this.f43089c0 = e0Var12;
        this.f43090d0 = e0Var12;
        androidx.lifecycle.e0<ToolTipStartLiveButtonResponse> e0Var13 = new androidx.lifecycle.e0<>();
        this.f43091e0 = e0Var13;
        this.f43092f0 = e0Var13;
        androidx.lifecycle.e0<Boolean> e0Var14 = new androidx.lifecycle.e0<>(bool);
        this.f43093g0 = e0Var14;
        this.f43094h0 = e0Var14;
        androidx.lifecycle.e0<Boolean> e0Var15 = new androidx.lifecycle.e0<>(Boolean.TRUE);
        this.f43095i0 = e0Var15;
        this.f43096j0 = e0Var15;
        androidx.lifecycle.e0<Integer> e0Var16 = new androidx.lifecycle.e0<>(Integer.valueOf(jf.h0.CAMPAIGN.c()));
        this.f43097k0 = e0Var16;
        this.f43098l0 = e0Var16;
        androidx.lifecycle.e0<Integer> e0Var17 = new androidx.lifecycle.e0<>(Integer.valueOf(jf.g0.RECOMMEND.e()));
        this.f43099m0 = e0Var17;
        this.f43100n0 = e0Var17;
        androidx.lifecycle.e0<Integer> e0Var18 = new androidx.lifecycle.e0<>(0);
        this.f43101o0 = e0Var18;
        this.f43102p0 = e0Var18;
    }

    public /* synthetic */ o(q8.a aVar, jf.d0 d0Var, jo.h hVar) {
        this(aVar, d0Var);
    }

    public final wo.x<wn.v> A() {
        return this.Q.g();
    }

    public final wo.x<wn.v> B() {
        return this.P.g();
    }

    public final LiveData<ToolTipStartLiveButtonResponse> C() {
        return this.f43092f0;
    }

    public final wo.x<MRError> D() {
        return this.S.g();
    }

    public final wo.x<t0> E() {
        return this.R.g();
    }

    public final LiveData<Boolean> F() {
        return this.f43096j0;
    }

    public final LiveData<Boolean> G() {
        return this.I;
    }

    public final LiveData<Boolean> H() {
        return this.O;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f43105y.getCoroutineContext();
    }

    public final void j() {
        this.f43103w.c(this);
        r0.d(this, null, 1, null);
    }

    public final LiveData<jf.f> k() {
        return this.A;
    }

    public final LiveData<Boolean> l() {
        return this.K;
    }

    public final LiveData<Boolean> m() {
        return this.f43094h0;
    }

    public final LiveData<Integer> n() {
        return this.f43102p0;
    }

    public final LiveData<Integer> o() {
        return this.f43100n0;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.j jVar) {
        jo.p.h(jVar, "event");
        this.f43106z.p(jVar.a());
    }

    public final LiveData<Integer> p() {
        return this.f43098l0;
    }

    public final LiveData<String> q() {
        return this.M;
    }

    public final LiveData<List<App.AppParams>> r() {
        return this.E;
    }

    public final LiveData<Integer> s() {
        return this.C;
    }

    public final LiveData<String> t() {
        return this.G;
    }

    public final xo.w<Integer> u() {
        return this.V;
    }

    public final wo.x<wn.v> v() {
        return this.T.g();
    }

    public final LiveData<Boolean> w() {
        return this.X;
    }

    public final LiveData<Boolean> x() {
        return this.f43090d0;
    }

    public final LiveData<Boolean> y() {
        return this.f43088b0;
    }

    public final LiveData<Boolean> z() {
        return this.Z;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.r rVar) {
        jo.p.h(rVar, "event");
        this.B.p(Integer.valueOf(rVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.C0720s c0720s) {
        jo.p.h(c0720s, "event");
        androidx.lifecycle.e0<Integer> e0Var = this.B;
        Integer f10 = e0Var.f();
        if (f10 == null) {
            f10 = 0;
        }
        e0Var.p(Integer.valueOf(f10.intValue() + 1));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.u uVar) {
        jo.p.h(uVar, "event");
        androidx.lifecycle.e0<Integer> e0Var = this.B;
        Integer f10 = e0Var.f();
        if (f10 == null) {
            f10 = 0;
        }
        e0Var.p(Integer.valueOf(Math.max(f10.intValue() - 1, 0)));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.g gVar) {
        jo.p.h(gVar, "event");
        this.H.p(Boolean.TRUE);
        this.F.p(null);
        this.D.p(xn.s.k());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.f fVar) {
        jo.p.h(fVar, "event");
        this.H.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.e eVar) {
        jo.p.h(eVar, "event");
        androidx.lifecycle.e0<List<App.AppParams>> e0Var = this.D;
        List<App.AppParams> f10 = e0Var.f();
        if (f10 == null) {
            f10 = xn.s.k();
        }
        e0Var.p(xn.a0.o0(f10, eVar.a().getApps()));
        this.F.p(eVar.a().getNextCursor());
        this.H.p(Boolean.FALSE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.d dVar) {
        jo.p.h(dVar, "event");
        this.H.p(Boolean.FALSE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.a aVar) {
        jo.p.h(aVar, "event");
        androidx.lifecycle.e0<List<App.AppParams>> e0Var = this.D;
        List<App.AppParams> f10 = e0Var.f();
        if (f10 == null) {
            f10 = xn.s.k();
        }
        e0Var.p(xn.a0.o0(f10, xn.r.d(aVar.a())));
        this.f43104x.a(aVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.c cVar) {
        Collection k10;
        jo.p.h(cVar, "event");
        LiveData liveData = this.D;
        List list = (List) liveData.f();
        if (list != null) {
            k10 = new ArrayList();
            for (Object obj : list) {
                if (!jo.p.c(((App.AppParams) obj).getAppId(), cVar.a().getAppId())) {
                    k10.add(obj);
                }
            }
        } else {
            k10 = xn.s.k();
        }
        liveData.p(k10);
        this.f43104x.c(cVar.a().getAppId());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.k kVar) {
        jo.p.h(kVar, "event");
        this.J.p(Boolean.valueOf(kVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.i iVar) {
        jo.p.h(iVar, "event");
        this.L.p(iVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.h hVar) {
        jo.p.h(hVar, "event");
        this.L.p(null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.a0 a0Var) {
        jo.p.h(a0Var, "event");
        this.N.p(Boolean.valueOf(a0Var.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.y yVar) {
        jo.p.h(yVar, "event");
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.p pVar) {
        jo.p.h(pVar, "event");
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.b0 b0Var) {
        jo.p.h(b0Var, "event");
        uo.l.d(this, null, null, new d(b0Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.d0 d0Var) {
        jo.p.h(d0Var, "event");
        uo.l.d(this, null, null, new e(d0Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.z zVar) {
        jo.p.h(zVar, "event");
        uo.l.d(this, null, null, new f(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.l lVar) {
        jo.p.h(lVar, "event");
        this.W.p(Boolean.valueOf(lVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.x xVar) {
        jo.p.h(xVar, "event");
        this.Y.p(Boolean.valueOf(xVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.t tVar) {
        jo.p.h(tVar, "event");
        this.f43087a0.p(Boolean.valueOf(tVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.n nVar) {
        jo.p.h(nVar, "event");
        this.f43089c0.p(Boolean.valueOf(nVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.w wVar) {
        jo.p.h(wVar, "event");
        this.f43097k0.p(Integer.valueOf(wVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.v vVar) {
        jo.p.h(vVar, "event");
        this.f43099m0.p(Integer.valueOf(vVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.m mVar) {
        jo.p.h(mVar, "event");
        this.f43101o0.p(Integer.valueOf(mVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.b bVar) {
        jo.p.h(bVar, "event");
        this.f43095i0.p(Boolean.valueOf(bVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.c0 c0Var) {
        jo.p.h(c0Var, "event");
        this.f43091e0.p(c0Var.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.e0 e0Var) {
        jo.p.h(e0Var, "event");
        this.f43093g0.p(Boolean.valueOf(e0Var.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.q qVar) {
        jo.p.h(qVar, "event");
        this.f43091e0.p(null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(w0.n nVar) {
        jo.p.h(nVar, "event");
        this.f43091e0.p(null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.f0 f0Var) {
        jo.p.h(f0Var, "event");
        uo.l.d(this, null, null, new g(f0Var, null), 3, null);
    }
}
