package nf;

import androidx.lifecycle.LiveData;
import ce.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import org.greenrobot.eventbus.ThreadMode;
import pd.i;
import uo.r0;

/* loaded from: classes3.dex */
public final class g extends androidx.lifecycle.q0 implements uo.q0 {
    public final androidx.lifecycle.e0<Boolean> A;
    public final LiveData<Boolean> B;
    public final wo.f<MRError> C;
    public final wo.f<MRError> D;
    public final wo.f<wn.v> E;
    public final androidx.lifecycle.e0<Long> F;
    public final LiveData<Long> G;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f42828y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f42829z;

    @co.f(c = "com.dena.mirrorman.store.CollabMatchingStore$on$1", f = "CollabMatchingStore.kt", l = {64}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42830w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i.c f42832y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i.c cVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f42832y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f42832y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42830w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = g.this.C;
                MRError a10 = this.f42832y.a();
                this.f42830w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CollabMatchingStore$on$2", f = "CollabMatchingStore.kt", l = {77}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42833w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i.b f42835y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i.b bVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f42835y = bVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f42835y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42833w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = g.this.D;
                MRError a10 = this.f42835y.a();
                this.f42833w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CollabMatchingStore$on$3", f = "CollabMatchingStore.kt", l = {85}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42836w;

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
            int i10 = this.f42836w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = g.this.E;
                wn.v vVar = wn.v.f59242a;
                this.f42836w = 1;
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

    public g(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f42828y = aVar;
        this.f42829z = r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<Boolean> e0Var = new androidx.lifecycle.e0<>(Boolean.TRUE);
        this.A = e0Var;
        this.B = e0Var;
        this.C = wo.g.a(-2);
        this.D = wo.g.a(-2);
        this.E = wo.g.a(-2);
        androidx.lifecycle.e0<Long> e0Var2 = new androidx.lifecycle.e0<>(null);
        this.F = e0Var2;
        this.G = e0Var2;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f42828y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f42829z.getCoroutineContext();
    }

    public final LiveData<Long> i() {
        return this.G;
    }

    public final xo.c<MRError> j() {
        return xo.e.a(this.D);
    }

    public final xo.c<MRError> k() {
        return xo.e.a(this.C);
    }

    public final xo.c<wn.v> l() {
        return xo.e.a(this.E);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i.d dVar) {
        jo.p.h(dVar, "event");
        this.F.p(null);
        this.A.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i.f fVar) {
        jo.p.h(fVar, "event");
        this.A.p(Boolean.FALSE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(this, null, null, new a(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i.a aVar) {
        jo.p.h(aVar, "event");
        this.F.p(Long.valueOf(System.currentTimeMillis()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i.b bVar) {
        jo.p.h(bVar, "event");
        uo.l.d(this, null, null, new b(bVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.C0151l c0151l) {
        jo.p.h(c0151l, "event");
        uo.l.d(this, null, null, new c(null), 3, null);
    }
}
