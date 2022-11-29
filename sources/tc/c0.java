package tc;

import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.ChatThreadMessages;
import org.greenrobot.eventbus.ThreadMode;
import tc.b;

/* loaded from: classes2.dex */
public final class c0 extends androidx.lifecycle.q0 implements uo.q0 {
    public final androidx.lifecycle.e0<Boolean> A;
    public final LiveData<Boolean> B;
    public final xo.r<ChatThreadMessages> C;
    public final xo.w<ChatThreadMessages> D;
    public final xo.r<MRError> E;
    public final xo.w<MRError> F;
    public final xo.r<ChatThreadMessages> G;
    public final xo.w<ChatThreadMessages> H;
    public final xo.r<wn.v> I;
    public final xo.w<wn.v> J;
    public final xo.r<MRError> K;
    public final xo.w<MRError> L;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f53463y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f53464z;

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatStore$on$1", f = "ChatStore.kt", l = {51}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53465w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.e f53467y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b.e eVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f53467y = eVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f53467y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53465w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = c0.this.C;
                ChatThreadMessages a10 = this.f53467y.a();
                this.f53465w = 1;
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

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatStore$on$2", f = "ChatStore.kt", l = {59}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53468w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.d f53470y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b.d dVar, ao.d<? super b> dVar2) {
            super(2, dVar2);
            this.f53470y = dVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f53470y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53468w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = c0.this.E;
                MRError a10 = this.f53470y.a();
                this.f53468w = 1;
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

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatStore$on$3", f = "ChatStore.kt", l = {66}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53471w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.C0831b f53473y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b.C0831b c0831b, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f53473y = c0831b;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f53473y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53471w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = c0.this.G;
                ChatThreadMessages a10 = this.f53473y.a();
                this.f53471w = 1;
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

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatStore$on$4", f = "ChatStore.kt", l = {73}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53474w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.a f53476y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b.a aVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f53476y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f53476y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53474w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = c0.this.K;
                MRError a10 = this.f53476y.a();
                this.f53474w = 1;
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

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatStore$on$5", f = "ChatStore.kt", l = {81}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53477w;

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
            int i10 = this.f53477w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = c0.this.I;
                wn.v vVar = wn.v.f59242a;
                this.f53477w = 1;
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

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatStore$on$6", f = "ChatStore.kt", l = {88}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53479w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.f f53481y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b.f fVar, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f53481y = fVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f53481y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53479w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = c0.this.K;
                MRError a10 = this.f53481y.a();
                this.f53479w = 1;
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

    public c0(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f53463y = aVar;
        this.f53464z = uo.r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<Boolean> e0Var = new androidx.lifecycle.e0<>(Boolean.FALSE);
        this.A = e0Var;
        this.B = e0Var;
        xo.r<ChatThreadMessages> b10 = xo.y.b(0, 0, null, 7, null);
        this.C = b10;
        this.D = b10;
        xo.r<MRError> b11 = xo.y.b(0, 0, null, 7, null);
        this.E = b11;
        this.F = b11;
        xo.r<ChatThreadMessages> b12 = xo.y.b(0, 0, null, 7, null);
        this.G = b12;
        this.H = b12;
        xo.r<wn.v> b13 = xo.y.b(0, 0, null, 7, null);
        this.I = b13;
        this.J = b13;
        xo.r<MRError> b14 = xo.y.b(0, 0, null, 7, null);
        this.K = b14;
        this.L = b14;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        uo.r0.d(this, null, 1, null);
        this.f53463y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f53464z.getCoroutineContext();
    }

    public final xo.w<ChatThreadMessages> k() {
        return this.H;
    }

    public final xo.w<MRError> l() {
        return this.L;
    }

    public final LiveData<Boolean> m() {
        return this.B;
    }

    public final xo.w<MRError> n() {
        return this.F;
    }

    public final xo.w<ChatThreadMessages> o() {
        return this.D;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.e eVar) {
        jo.p.h(eVar, "event");
        uo.l.d(this, null, null, new a(eVar, null), 3, null);
    }

    public final xo.w<wn.v> p() {
        return this.J;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.d dVar) {
        jo.p.h(dVar, "event");
        this.A.p(Boolean.TRUE);
        uo.l.d(this, null, null, new b(dVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.C0831b c0831b) {
        jo.p.h(c0831b, "event");
        uo.l.d(this, null, null, new c(c0831b, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(this, null, null, new d(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.g gVar) {
        jo.p.h(gVar, "event");
        uo.l.d(this, null, null, new e(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.f fVar) {
        jo.p.h(fVar, "event");
        uo.l.d(this, null, null, new f(fVar, null), 3, null);
    }
}
