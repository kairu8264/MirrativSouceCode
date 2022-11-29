package nf;

import com.dena.mirrativ.mirrativapi.core.MRError;
import org.greenrobot.eventbus.ThreadMode;
import pd.u0;
import uo.r0;

/* loaded from: classes3.dex */
public final class b0 extends androidx.lifecycle.q0 implements uo.q0 {
    public final xo.r<Boolean> A;
    public final xo.w<Boolean> B;
    public final xo.r<wn.v> C;
    public final xo.w<wn.v> D;
    public final xo.r<MRError> E;
    public final xo.w<MRError> F;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f42432y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f42433z;

    @co.f(c = "com.dena.mirrorman.store.RegistrationStore$on$1", f = "RegistrationStore.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42434w;

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
            int i10 = this.f42434w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = b0.this.A;
                Boolean a10 = co.b.a(true);
                this.f42434w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.RegistrationStore$on$2", f = "RegistrationStore.kt", l = {50, 51}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42436w;

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
            int i10 = this.f42436w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = b0.this.A;
                Boolean a10 = co.b.a(false);
                this.f42436w = 1;
                if (rVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                return wn.v.f59242a;
            } else {
                wn.m.b(obj);
            }
            xo.r rVar2 = b0.this.C;
            wn.v vVar = wn.v.f59242a;
            this.f42436w = 2;
            if (rVar2.emit(vVar, this) == c10) {
                return c10;
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.RegistrationStore$on$3", f = "RegistrationStore.kt", l = {58, 59}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42438w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ u0.a f42440y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(u0.a aVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f42440y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f42440y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42438w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = b0.this.A;
                Boolean a10 = co.b.a(false);
                this.f42438w = 1;
                if (rVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                return wn.v.f59242a;
            } else {
                wn.m.b(obj);
            }
            xo.r rVar2 = b0.this.E;
            MRError a11 = this.f42440y.a();
            this.f42438w = 2;
            if (rVar2.emit(a11, this) == c10) {
                return c10;
            }
            return wn.v.f59242a;
        }
    }

    public b0(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f42432y = aVar;
        this.f42433z = r0.b();
        aVar.b(this);
        xo.r<Boolean> b10 = xo.y.b(0, 0, null, 7, null);
        this.A = b10;
        this.B = b10;
        xo.r<wn.v> b11 = xo.y.b(0, 0, null, 7, null);
        this.C = b11;
        this.D = b11;
        xo.r<MRError> b12 = xo.y.b(0, 0, null, 7, null);
        this.E = b12;
        this.F = b12;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f42432y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f42433z.getCoroutineContext();
    }

    public final xo.w<Boolean> i() {
        return this.B;
    }

    public final xo.w<MRError> j() {
        return this.F;
    }

    public final xo.w<wn.v> k() {
        return this.D;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(u0.b bVar) {
        jo.p.h(bVar, "event");
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(u0.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(u0.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(this, null, null, new c(aVar, null), 3, null);
    }
}
