package nf;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.r0;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.GiftboxGachaExecuteResponse;
import com.dena.mirrorman.net.api.response.GiftboxGachaResponse;
import nd.s0;
import org.greenrobot.eventbus.ThreadMode;
import pd.r;

/* loaded from: classes3.dex */
public final class n extends androidx.lifecycle.q0 {
    public final q8.a A;
    public final s0<GiftboxGachaResponse> B;
    public final s0<MRError> C;
    public final androidx.lifecycle.e0<Boolean> D;
    public final LiveData<Boolean> E;
    public final s0<GiftboxGachaExecuteResponse> F;
    public final s0<MRError> G;
    public final s0<wn.v> H;
    public final s0<MRError> I;

    /* renamed from: y  reason: collision with root package name */
    public final String f43051y;

    /* renamed from: z  reason: collision with root package name */
    public final String f43052z;

    @co.f(c = "com.dena.mirrorman.store.GiftboxGachaStore$on$1", f = "GiftboxGachaStore.kt", l = {63}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43053w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ r.f f43055y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r.f fVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f43055y = fVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f43055y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43053w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = n.this.B;
                GiftboxGachaResponse a10 = this.f43055y.a();
                this.f43053w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.GiftboxGachaStore$on$2", f = "GiftboxGachaStore.kt", l = {70}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43056w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ r.c f43058y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r.c cVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f43058y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f43058y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43056w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = n.this.C;
                MRError a10 = this.f43058y.a();
                this.f43056w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.GiftboxGachaStore$on$3", f = "GiftboxGachaStore.kt", l = {84}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43059w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ r.e f43061y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r.e eVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f43061y = eVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f43061y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43059w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = n.this.F;
                GiftboxGachaExecuteResponse a10 = this.f43061y.a();
                this.f43059w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.GiftboxGachaStore$on$4", f = "GiftboxGachaStore.kt", l = {92}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43062w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ r.b f43064y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(r.b bVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f43064y = bVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f43064y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43062w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = n.this.G;
                MRError a10 = this.f43064y.a();
                this.f43062w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.GiftboxGachaStore$on$5", f = "GiftboxGachaStore.kt", l = {100}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43065w;

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
            int i10 = this.f43065w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = n.this.H;
                wn.v vVar = wn.v.f59242a;
                this.f43065w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.GiftboxGachaStore$on$6", f = "GiftboxGachaStore.kt", l = {107}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43067w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ r.d f43069y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r.d dVar, ao.d<? super f> dVar2) {
            super(2, dVar2);
            this.f43069y = dVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f43069y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43067w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = n.this.I;
                MRError a10 = this.f43069y.a();
                this.f43067w = 1;
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

    public n(String str, String str2, q8.a aVar) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "userGiftboxGachaId");
        jo.p.h(aVar, "dispatcher");
        this.f43051y = str;
        this.f43052z = str2;
        this.A = aVar;
        aVar.b(this);
        this.B = new s0<>();
        this.C = new s0<>();
        androidx.lifecycle.e0<Boolean> e0Var = new androidx.lifecycle.e0<>(Boolean.FALSE);
        this.D = e0Var;
        this.E = e0Var;
        this.F = new s0<>();
        this.G = new s0<>();
        this.H = new s0<>();
        this.I = new s0<>();
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        super.d();
        this.A.c(this);
    }

    public final wo.x<MRError> l() {
        return this.G.c();
    }

    public final wo.x<MRError> m() {
        return this.C.c();
    }

    public final wo.x<MRError> n() {
        return this.I.c();
    }

    public final GiftboxGachaExecuteResponse o() {
        return this.F.b();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(r.f fVar) {
        jo.p.h(fVar, "event");
        uo.l.d(r0.a(this), null, null, new a(fVar, null), 3, null);
    }

    public final wo.x<GiftboxGachaExecuteResponse> p() {
        return this.F.c();
    }

    public final wo.x<GiftboxGachaResponse> q() {
        return this.B.c();
    }

    public final String r() {
        return this.f43051y;
    }

    public final wo.x<wn.v> s() {
        return this.H.c();
    }

    public final String t() {
        return this.f43052z;
    }

    public final LiveData<Boolean> u() {
        return this.E;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(r.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(r0.a(this), null, null, new b(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(r.a aVar) {
        jo.p.h(aVar, "event");
        this.D.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(r.e eVar) {
        jo.p.h(eVar, "event");
        this.D.p(Boolean.FALSE);
        uo.l.d(r0.a(this), null, null, new c(eVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(r.b bVar) {
        jo.p.h(bVar, "event");
        this.D.p(Boolean.FALSE);
        uo.l.d(r0.a(this), null, null, new d(bVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(r.g gVar) {
        jo.p.h(gVar, "event");
        uo.l.d(r0.a(this), null, null, new e(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(r.d dVar) {
        jo.p.h(dVar, "event");
        uo.l.d(r0.a(this), null, null, new f(dVar, null), 3, null);
    }
}
