package ib;

import androidx.lifecycle.q0;
import ib.b;
import nd.s0;
import org.greenrobot.eventbus.ThreadMode;
import uo.r0;

/* loaded from: classes2.dex */
public final class d extends q0 implements uo.q0 {
    public final s0<wn.v> A;
    public final wo.x<wn.v> B;
    public final s0<String> C;
    public final wo.x<String> D;
    public final s0<wn.v> E;
    public final wo.x<wn.v> F;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f36468y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f36469z;

    @co.f(c = "com.dena.mirrativ.player.afterplay.AfterPlayStore$on$1", f = "AfterPlayStore.kt", l = {39}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f36470w;

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
            int i10 = this.f36470w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = d.this.A;
                wn.v vVar = wn.v.f59242a;
                this.f36470w = 1;
                if (s0Var.d(vVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.player.afterplay.AfterPlayStore$on$2", f = "AfterPlayStore.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f36472w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.c f36474y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b.c cVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f36474y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f36474y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f36472w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = d.this.C;
                String a10 = this.f36474y.a();
                this.f36472w = 1;
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

    @co.f(c = "com.dena.mirrativ.player.afterplay.AfterPlayStore$on$3", f = "AfterPlayStore.kt", l = {54}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f36475w;

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
            int i10 = this.f36475w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = d.this.E;
                wn.v vVar = wn.v.f59242a;
                this.f36475w = 1;
                if (s0Var.d(vVar, this) == c10) {
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

    public d(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f36468y = aVar;
        this.f36469z = r0.b();
        aVar.b(this);
        s0<wn.v> s0Var = new s0<>();
        this.A = s0Var;
        this.B = s0Var.c();
        s0<String> s0Var2 = new s0<>();
        this.C = s0Var2;
        this.D = s0Var2.c();
        s0<wn.v> s0Var3 = new s0<>();
        this.E = s0Var3;
        this.F = s0Var3.c();
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f36468y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f36469z.getCoroutineContext();
    }

    public final wo.x<wn.v> i() {
        return this.B;
    }

    public final wo.x<wn.v> j() {
        return this.F;
    }

    public final wo.x<String> k() {
        return this.D;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(this, null, null, new b(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.C0471b c0471b) {
        jo.p.h(c0471b, "event");
        uo.l.d(this, null, null, new c(null), 3, null);
    }
}
