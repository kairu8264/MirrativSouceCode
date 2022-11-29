package hc;

import com.dena.mirrativ.mirrativapi.core.MRError;
import hc.b;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class z0 extends androidx.lifecycle.q0 implements uo.q0 {
    public final xo.s<String> A;
    public final xo.g0<String> B;
    public final xo.c<Boolean> C;
    public final xo.s<Boolean> D;
    public final xo.g0<Boolean> E;
    public final xo.s<Boolean> F;
    public final xo.c<Boolean> G;
    public final xo.s<Boolean> H;
    public final xo.g0<Boolean> I;
    public final xo.s<Boolean> J;
    public final xo.g0<Boolean> K;
    public final xo.s<Boolean> L;
    public final xo.g0<Boolean> M;
    public final wo.f<wn.v> N;
    public final wo.f<MRError> O;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f35329y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f35330z;

    @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotStore$isShareTweetVisible$1", f = "GroupShotStore.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.q<Boolean, Boolean, ao.d<? super Boolean>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f35331w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ boolean f35332x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ boolean f35333y;

        public a(ao.d<? super a> dVar) {
            super(3, dVar);
        }

        public final Object a(boolean z10, boolean z11, ao.d<? super Boolean> dVar) {
            a aVar = new a(dVar);
            aVar.f35332x = z10;
            aVar.f35333y = z11;
            return aVar.invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f35331w == 0) {
                wn.m.b(obj);
                return co.b.a(this.f35332x && this.f35333y);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ Object s0(Boolean bool, Boolean bool2, ao.d<? super Boolean> dVar) {
            return a(bool.booleanValue(), bool2.booleanValue(), dVar);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotStore$on$1", f = "GroupShotStore.kt", l = {77}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f35334w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.C0444b f35336y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b.C0444b c0444b, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f35336y = c0444b;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f35336y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f35334w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z0.this.O;
                MRError a10 = this.f35336y.a();
                this.f35334w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotStore$on$2", f = "GroupShotStore.kt", l = {105}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f35337w;

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
            int i10 = this.f35337w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z0.this.N;
                wn.v vVar = wn.v.f59242a;
                this.f35337w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotStore$on$3", f = "GroupShotStore.kt", l = {114}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f35339w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.d f35341y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b.d dVar, ao.d<? super d> dVar2) {
            super(2, dVar2);
            this.f35341y = dVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f35341y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f35339w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z0.this.O;
                MRError a10 = this.f35341y.a();
                this.f35339w = 1;
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

    /* loaded from: classes2.dex */
    public static final class e implements xo.c<Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ xo.c f35342w;

        /* loaded from: classes2.dex */
        public static final class a<T> implements xo.d {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ xo.d f35343w;

            @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotStore$special$$inlined$map$1$2", f = "GroupShotStore.kt", l = {224}, m = "emit")
            /* renamed from: hc.z0$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0445a extends co.d {

                /* renamed from: w  reason: collision with root package name */
                public /* synthetic */ Object f35344w;

                /* renamed from: x  reason: collision with root package name */
                public int f35345x;

                public C0445a(ao.d dVar) {
                    super(dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f35344w = obj;
                    this.f35345x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(xo.d dVar) {
                this.f35343w = dVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // xo.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, ao.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof hc.z0.e.a.C0445a
                    if (r0 == 0) goto L13
                    r0 = r6
                    hc.z0$e$a$a r0 = (hc.z0.e.a.C0445a) r0
                    int r1 = r0.f35345x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f35345x = r1
                    goto L18
                L13:
                    hc.z0$e$a$a r0 = new hc.z0$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f35344w
                    java.lang.Object r1 = bo.c.c()
                    int r2 = r0.f35345x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    wn.m.b(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    wn.m.b(r6)
                    xo.d r6 = r4.f35343w
                    java.lang.String r5 = (java.lang.String) r5
                    boolean r5 = so.n.r(r5)
                    r5 = r5 ^ r3
                    java.lang.Boolean r5 = co.b.a(r5)
                    r0.f35345x = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    wn.v r5 = wn.v.f59242a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: hc.z0.e.a.emit(java.lang.Object, ao.d):java.lang.Object");
            }
        }

        public e(xo.c cVar) {
            this.f35342w = cVar;
        }

        @Override // xo.c
        public Object a(xo.d<? super Boolean> dVar, ao.d dVar2) {
            Object a10 = this.f35342w.a(new a(dVar), dVar2);
            return a10 == bo.c.c() ? a10 : wn.v.f59242a;
        }
    }

    public z0(q8.a aVar, hf.v0 v0Var) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(v0Var, "userHelper");
        this.f35329y = aVar;
        this.f35330z = uo.r0.b();
        aVar.b(this);
        xo.s<String> a10 = xo.i0.a("");
        this.A = a10;
        this.B = a10;
        this.C = new e(a10);
        Boolean bool = Boolean.FALSE;
        xo.s<Boolean> a11 = xo.i0.a(bool);
        this.D = a11;
        this.E = a11;
        xo.s<Boolean> a12 = xo.i0.a(Boolean.valueOf(v0Var.m()));
        this.F = a12;
        this.G = xo.e.h(a11, a12, new a(null));
        xo.s<Boolean> a13 = xo.i0.a(Boolean.valueOf(v0Var.m()));
        this.H = a13;
        this.I = xo.e.c(a13);
        xo.s<Boolean> a14 = xo.i0.a(bool);
        this.J = a14;
        this.K = a14;
        xo.s<Boolean> a15 = xo.i0.a(bool);
        this.L = a15;
        this.M = a15;
        this.N = wo.g.a(-2);
        this.O = wo.g.a(-2);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        uo.r0.d(this, null, 1, null);
        this.f35329y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f35330z.getCoroutineContext();
    }

    public final xo.c<MRError> h() {
        return xo.e.a(this.O);
    }

    public final xo.g0<String> i() {
        return this.B;
    }

    public final xo.c<wn.v> j() {
        return xo.e.a(this.N);
    }

    public final xo.g0<Boolean> k() {
        return this.M;
    }

    public final xo.g0<Boolean> l() {
        return this.E;
    }

    public final xo.c<Boolean> m() {
        return this.C;
    }

    public final xo.g0<Boolean> n() {
        return this.K;
    }

    public final xo.g0<Boolean> o() {
        return this.I;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.c cVar) {
        jo.p.h(cVar, "event");
        this.D.setValue(Boolean.valueOf(cVar.a().isContinuousStreamer()));
    }

    public final xo.c<Boolean> p() {
        return this.G;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.C0444b c0444b) {
        jo.p.h(c0444b, "event");
        this.D.setValue(Boolean.FALSE);
        uo.l.d(this, null, null, new b(c0444b, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.a aVar) {
        jo.p.h(aVar, "event");
        this.A.setValue(aVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.g gVar) {
        jo.p.h(gVar, "event");
        xo.s<Boolean> sVar = this.H;
        sVar.setValue(Boolean.valueOf(!sVar.getValue().booleanValue()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.e eVar) {
        jo.p.h(eVar, "event");
        this.J.setValue(Boolean.TRUE);
        this.L.setValue(Boolean.FALSE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.f fVar) {
        jo.p.h(fVar, "event");
        this.J.setValue(Boolean.FALSE);
        this.L.setValue(Boolean.TRUE);
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.d dVar) {
        jo.p.h(dVar, "event");
        xo.s<Boolean> sVar = this.J;
        Boolean bool = Boolean.FALSE;
        sVar.setValue(bool);
        this.L.setValue(bool);
        uo.l.d(this, null, null, new d(dVar, null), 3, null);
    }
}
