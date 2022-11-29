package nf;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.Moderator;
import org.greenrobot.eventbus.ThreadMode;
import pd.c;
import pd.i1;
import uo.g1;
import uo.i2;
import uo.o2;

/* loaded from: classes3.dex */
public final class i0 implements uo.q0 {
    public final wo.q<MRError> A;
    public final wo.q<String> B;
    public final wo.q<wn.v> C;
    public final wo.q<MRError> D;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f42947w;

    /* renamed from: x  reason: collision with root package name */
    public final ao.g f42948x;

    /* renamed from: y  reason: collision with root package name */
    public final wo.q<Moderator> f42949y;

    /* renamed from: z  reason: collision with root package name */
    public final wo.q<MRError> f42950z;

    @co.f(c = "com.dena.mirrorman.store.StreamStore$on$1", f = "StreamStore.kt", l = {50}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42951w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i1.e0 f42953y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i1.e0 e0Var, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f42953y = e0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f42953y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42951w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = i0.this.f42949y;
                Moderator a10 = this.f42953y.a();
                this.f42951w = 1;
                if (qVar.r(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.StreamStore$on$2", f = "StreamStore.kt", l = {58}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42954w;

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
            int i10 = this.f42954w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = i0.this.f42949y;
                this.f42954w = 1;
                if (qVar.r(null, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.StreamStore$on$3", f = "StreamStore.kt", l = {65}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42956w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i1.z f42958y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i1.z zVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f42958y = zVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f42958y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42956w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = i0.this.f42950z;
                MRError a10 = this.f42958y.a();
                this.f42956w = 1;
                if (qVar.r(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.StreamStore$on$4", f = "StreamStore.kt", l = {72}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42959w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i1.a0 f42961y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i1.a0 a0Var, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f42961y = a0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f42961y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42959w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = i0.this.A;
                MRError a10 = this.f42961y.a();
                this.f42959w = 1;
                if (qVar.r(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.StreamStore$on$5", f = "StreamStore.kt", l = {79}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42962w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.v f42964y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c.v vVar, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f42964y = vVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f42964y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42962w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = i0.this.B;
                String a10 = this.f42964y.a();
                this.f42962w = 1;
                if (qVar.r(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.StreamStore$on$6", f = "StreamStore.kt", l = {87}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42965w;

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
            int i10 = this.f42965w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = i0.this.C;
                wn.v vVar = wn.v.f59242a;
                this.f42965w = 1;
                if (qVar.r(vVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.StreamStore$on$7", f = "StreamStore.kt", l = {94}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42967w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i1.q f42969y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(i1.q qVar, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f42969y = qVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f42969y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42967w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = i0.this.D;
                MRError a10 = this.f42969y.a();
                this.f42967w = 1;
                if (qVar.r(a10, this) == c10) {
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

    public i0(q8.a aVar) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        this.f42947w = aVar;
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.f42948x = c10.plus(b10);
        this.f42949y = new wo.q<>(null);
        this.f42950z = new wo.q<>();
        this.A = new wo.q<>();
        this.B = new wo.q<>();
        this.C = new wo.q<>();
        this.D = new wo.q<>();
    }

    public final void g() {
        this.f42947w.b(this);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f42948x;
    }

    public final void h() {
        this.f42947w.c(this);
    }

    public final wo.x<MRError> i() {
        return this.f42950z.g();
    }

    public final wo.x<String> j() {
        return this.B.g();
    }

    public final wo.x<MRError> k() {
        return this.A.g();
    }

    public final wo.x<MRError> l() {
        return this.D.g();
    }

    public final wo.x<wn.v> m() {
        return this.C.g();
    }

    public final String n() {
        return this.B.d();
    }

    public final wo.x<Moderator> o() {
        return this.f42949y.g();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.e0 e0Var) {
        jo.p.h(e0Var, "event");
        uo.l.d(this, null, null, new a(e0Var, null), 3, null);
    }

    public final String p() {
        Moderator e10 = this.f42949y.e();
        if (e10 != null) {
            return e10.getUserId();
        }
        return null;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.b0 b0Var) {
        jo.p.h(b0Var, "event");
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.z zVar) {
        jo.p.h(zVar, "event");
        uo.l.d(this, null, null, new c(zVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.a0 a0Var) {
        jo.p.h(a0Var, "event");
        uo.l.d(this, null, null, new d(a0Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.v vVar) {
        jo.p.h(vVar, "event");
        uo.l.d(this, null, null, new e(vVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.r rVar) {
        jo.p.h(rVar, "event");
        uo.l.d(this, null, null, new f(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.q qVar) {
        jo.p.h(qVar, "event");
        uo.l.d(this, null, null, new g(qVar, null), 3, null);
    }
}
