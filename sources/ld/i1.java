package ld;

import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import org.greenrobot.eventbus.ThreadMode;
import pd.w0;

/* loaded from: classes2.dex */
public final class i1 extends androidx.lifecycle.q0 implements uo.q0 {
    public final androidx.lifecycle.e0<String> A;
    public final LiveData<String> B;
    public final wo.f<wn.v> C;
    public final androidx.lifecycle.e0<wn.v> D;
    public final LiveData<wn.v> E;
    public final xo.r<wn.v> F;
    public final xo.w<wn.v> G;
    public final androidx.lifecycle.e0<MRError> H;
    public final LiveData<MRError> I;
    public final androidx.lifecycle.e0<wn.v> J;
    public final LiveData<wn.v> K;
    public final androidx.lifecycle.e0<String> L;
    public final LiveData<String> M;
    public final androidx.lifecycle.e0<MRError> N;
    public final LiveData<MRError> O;
    public final androidx.lifecycle.e0<wn.v> P;
    public final LiveData<wn.v> Q;
    public final androidx.lifecycle.e0<Boolean> R;
    public final LiveData<Boolean> S;
    public final androidx.lifecycle.e0<Boolean> T;
    public final LiveData<Boolean> U;
    public final wo.f<MRError> V;
    public final wo.f<wn.v> W;
    public final xo.r<wn.v> X;
    public final xo.w<wn.v> Y;
    public final xo.r<MRError> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final xo.w<MRError> f40012a0;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f40013y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f40014z;

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingStore$on$1", f = "SettingStore.kt", l = {80}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40015w;

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
            int i10 = this.f40015w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = i1.this.C;
                wn.v vVar = wn.v.f59242a;
                this.f40015w = 1;
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

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingStore$on$2", f = "SettingStore.kt", l = {87}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40017w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ w0.i f40019y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w0.i iVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f40019y = iVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f40019y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40017w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = i1.this.V;
                MRError a10 = this.f40019y.a();
                this.f40017w = 1;
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

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingStore$on$3", f = "SettingStore.kt", l = {96}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40020w;

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
            int i10 = this.f40020w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = i1.this.F;
                wn.v vVar = wn.v.f59242a;
                this.f40020w = 1;
                if (rVar.emit(vVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingStore$on$4", f = "SettingStore.kt", l = {140}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40022w;

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
            int i10 = this.f40022w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = i1.this.W;
                wn.v vVar = wn.v.f59242a;
                this.f40022w = 1;
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

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingStore$on$5", f = "SettingStore.kt", l = {147}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40024w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ w0.k f40026y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w0.k kVar, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f40026y = kVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f40026y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40024w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = i1.this.V;
                MRError a10 = this.f40026y.a();
                this.f40024w = 1;
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

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingStore$on$6", f = "SettingStore.kt", l = {155}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40027w;

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
            int i10 = this.f40027w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = i1.this.X;
                wn.v vVar = wn.v.f59242a;
                this.f40027w = 1;
                if (rVar.emit(vVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingStore$on$7", f = "SettingStore.kt", l = {162}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40029w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ w0.m f40031y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w0.m mVar, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f40031y = mVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f40031y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40029w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = i1.this.Z;
                MRError a10 = this.f40031y.a();
                this.f40029w = 1;
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

    public i1(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f40013y = aVar;
        this.f40014z = uo.r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<String> e0Var = new androidx.lifecycle.e0<>("");
        this.A = e0Var;
        this.B = e0Var;
        this.C = wo.g.a(-2);
        androidx.lifecycle.e0<wn.v> e0Var2 = new androidx.lifecycle.e0<>(null);
        this.D = e0Var2;
        this.E = e0Var2;
        xo.r<wn.v> b10 = xo.y.b(0, 0, null, 7, null);
        this.F = b10;
        this.G = b10;
        androidx.lifecycle.e0<MRError> e0Var3 = new androidx.lifecycle.e0<>(null);
        this.H = e0Var3;
        this.I = e0Var3;
        androidx.lifecycle.e0<wn.v> e0Var4 = new androidx.lifecycle.e0<>(null);
        this.J = e0Var4;
        this.K = e0Var4;
        androidx.lifecycle.e0<String> e0Var5 = new androidx.lifecycle.e0<>("");
        this.L = e0Var5;
        this.M = e0Var5;
        androidx.lifecycle.e0<MRError> e0Var6 = new androidx.lifecycle.e0<>(null);
        this.N = e0Var6;
        this.O = e0Var6;
        androidx.lifecycle.e0<wn.v> e0Var7 = new androidx.lifecycle.e0<>(null);
        this.P = e0Var7;
        this.Q = e0Var7;
        Boolean bool = Boolean.FALSE;
        androidx.lifecycle.e0<Boolean> e0Var8 = new androidx.lifecycle.e0<>(bool);
        this.R = e0Var8;
        this.S = e0Var8;
        androidx.lifecycle.e0<Boolean> e0Var9 = new androidx.lifecycle.e0<>(bool);
        this.T = e0Var9;
        this.U = e0Var9;
        this.V = wo.g.a(-2);
        this.W = wo.g.a(-2);
        xo.r<wn.v> b11 = xo.y.b(0, 0, null, 7, null);
        this.X = b11;
        this.Y = b11;
        xo.r<MRError> b12 = xo.y.b(0, 0, null, 7, null);
        this.Z = b12;
        this.f40012a0 = b12;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        super.d();
        this.f40013y.c(this);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f40014z.getCoroutineContext();
    }

    public final LiveData<wn.v> l() {
        return this.Q;
    }

    public final LiveData<String> m() {
        return this.M;
    }

    public final LiveData<MRError> n() {
        return this.O;
    }

    public final xo.w<MRError> o() {
        return this.f40012a0;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(w0.f fVar) {
        jo.p.h(fVar, "event");
        this.A.p(fVar.a());
    }

    public final xo.w<wn.v> p() {
        return this.Y;
    }

    public final wo.x<MRError> q() {
        return this.V.g();
    }

    public final LiveData<MRError> r() {
        return this.I;
    }

    public final LiveData<String> s() {
        return this.B;
    }

    public final LiveData<Boolean> t() {
        return this.S;
    }

    public final xo.w<wn.v> u() {
        return this.G;
    }

    public final LiveData<wn.v> v() {
        return this.K;
    }

    public final LiveData<wn.v> w() {
        return this.E;
    }

    public final wo.x<wn.v> x() {
        return this.C.g();
    }

    public final wo.x<wn.v> y() {
        return this.W.g();
    }

    public final LiveData<Boolean> z() {
        return this.U;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(w0.j jVar) {
        jo.p.h(jVar, "event");
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(w0.i iVar) {
        jo.p.h(iVar, "event");
        uo.l.d(this, null, null, new b(iVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(w0.h hVar) {
        jo.p.h(hVar, "event");
        this.D.p(wn.v.f59242a);
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(w0.g gVar) {
        jo.p.h(gVar, "event");
        this.H.p(gVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(w0.b bVar) {
        jo.p.h(bVar, "event");
        this.T.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(w0.e eVar) {
        jo.p.h(eVar, "event");
        this.J.p(wn.v.f59242a);
        this.T.p(Boolean.FALSE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(w0.a aVar) {
        jo.p.h(aVar, "event");
        this.L.p(aVar.a());
        this.R.p(Boolean.valueOf(aVar.b()));
        this.T.p(Boolean.FALSE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(w0.d dVar) {
        jo.p.h(dVar, "event");
        this.N.p(dVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(w0.c cVar) {
        jo.p.h(cVar, "event");
        this.P.p(wn.v.f59242a);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(w0.l lVar) {
        jo.p.h(lVar, "event");
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(w0.k kVar) {
        jo.p.h(kVar, "event");
        uo.l.d(this, null, null, new e(kVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(w0.n nVar) {
        jo.p.h(nVar, "event");
        uo.l.d(this, null, null, new f(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(w0.m mVar) {
        jo.p.h(mVar, "event");
        uo.l.d(this, null, null, new g(mVar, null), 3, null);
    }
}
