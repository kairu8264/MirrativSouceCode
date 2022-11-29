package nf;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.event.ShooterMatchingResponse;
import ha.a;
import org.greenrobot.eventbus.ThreadMode;
import pd.a1;
import pd.z0;
import uo.r0;

/* loaded from: classes3.dex */
public final class g0 extends androidx.lifecycle.q0 implements uo.q0 {
    public final xo.s<ha.a> A;
    public final xo.g0<ha.a> B;
    public final xo.s<ShooterMatchingResponse> C;
    public final xo.g0<ShooterMatchingResponse> D;
    public final xo.r<String> E;
    public final xo.w<String> F;
    public final xo.r<wn.v> G;
    public final xo.w<wn.v> H;
    public final xo.r<wn.v> I;
    public final xo.w<wn.v> J;
    public final xo.r<MRError> K;
    public final xo.w<MRError> L;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f42838y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f42839z;

    @co.f(c = "com.dena.mirrorman.store.ShooterMatchingStore$on$1", f = "ShooterMatchingStore.kt", l = {87}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42840w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ a1.c f42842y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a1.c cVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f42842y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f42842y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42840w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = g0.this.E;
                String a10 = this.f42842y.a();
                this.f42840w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.ShooterMatchingStore$on$2", f = "ShooterMatchingStore.kt", l = {95}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42843w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ a1.a f42845y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a1.a aVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f42845y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f42845y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42843w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = g0.this.K;
                MRError a10 = this.f42845y.a();
                this.f42843w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.ShooterMatchingStore$on$3", f = "ShooterMatchingStore.kt", l = {110}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42846w;

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
            int i10 = this.f42846w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = g0.this.G;
                wn.v vVar = wn.v.f59242a;
                this.f42846w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.ShooterMatchingStore$on$4", f = "ShooterMatchingStore.kt", l = {118}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42848w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ a1.d f42850y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a1.d dVar, ao.d<? super d> dVar2) {
            super(2, dVar2);
            this.f42850y = dVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f42850y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42848w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = g0.this.K;
                MRError a10 = this.f42850y.a();
                this.f42848w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.ShooterMatchingStore$on$5", f = "ShooterMatchingStore.kt", l = {133}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42851w;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42851w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = g0.this.I;
                wn.v vVar = wn.v.f59242a;
                this.f42851w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.ShooterMatchingStore$on$6", f = "ShooterMatchingStore.kt", l = {141}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42853w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ a1.j f42855y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a1.j jVar, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f42855y = jVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f42855y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42853w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = g0.this.K;
                MRError a10 = this.f42855y.a();
                this.f42853w = 1;
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

    public g0(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f42838y = aVar;
        this.f42839z = r0.b();
        aVar.b(this);
        xo.s<ha.a> a10 = xo.i0.a(a.d.f34697b);
        this.A = a10;
        this.B = a10;
        xo.s<ShooterMatchingResponse> a11 = xo.i0.a(null);
        this.C = a11;
        this.D = a11;
        xo.r<String> b10 = xo.y.b(0, 0, null, 7, null);
        this.E = b10;
        this.F = b10;
        xo.r<wn.v> b11 = xo.y.b(0, 0, null, 7, null);
        this.G = b11;
        this.H = b11;
        xo.r<wn.v> b12 = xo.y.b(0, 0, null, 7, null);
        this.I = b12;
        this.J = b12;
        xo.r<MRError> b13 = xo.y.b(0, 0, null, 7, null);
        this.K = b13;
        this.L = b13;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f42838y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f42839z.getCoroutineContext();
    }

    public final xo.w<String> j() {
        return this.F;
    }

    public final xo.w<wn.v> k() {
        return this.H;
    }

    public final xo.w<MRError> l() {
        return this.L;
    }

    public final xo.g0<ShooterMatchingResponse> m() {
        return this.D;
    }

    public final xo.w<wn.v> n() {
        return this.J;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a1.h hVar) {
        jo.p.h(hVar, "event");
        this.A.setValue(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a1.i iVar) {
        jo.p.h(iVar, "event");
        this.A.setValue(a.d.f34697b);
        this.C.setValue(iVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z0.c cVar) {
        jo.p.h(cVar, "event");
        this.A.setValue(a.d.f34697b);
        this.C.setValue(cVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a1.g gVar) {
        jo.p.h(gVar, "event");
        this.A.setValue(a.d.f34697b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a1.b bVar) {
        jo.p.h(bVar, "event");
        this.A.setValue(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a1.c cVar) {
        jo.p.h(cVar, "event");
        this.A.setValue(a.d.f34697b);
        uo.l.d(this, null, null, new a(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a1.a aVar) {
        jo.p.h(aVar, "event");
        this.A.setValue(a.d.f34697b);
        uo.l.d(this, null, null, new b(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a1.e eVar) {
        jo.p.h(eVar, "event");
        this.A.setValue(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a1.f fVar) {
        jo.p.h(fVar, "event");
        this.A.setValue(a.d.f34697b);
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a1.d dVar) {
        jo.p.h(dVar, "event");
        this.A.setValue(a.d.f34697b);
        uo.l.d(this, null, null, new d(dVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a1.k kVar) {
        jo.p.h(kVar, "event");
        this.A.setValue(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a1.l lVar) {
        jo.p.h(lVar, "event");
        this.A.setValue(a.d.f34697b);
        uo.l.d(this, null, null, new e(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a1.j jVar) {
        jo.p.h(jVar, "event");
        this.A.setValue(a.d.f34697b);
        uo.l.d(this, null, null, new f(jVar, null), 3, null);
    }
}
