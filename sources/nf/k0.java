package nf;

import android.graphics.Bitmap;
import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftSlot;
import ha.a;
import java.util.List;
import nd.s0;
import org.greenrobot.eventbus.ThreadMode;
import pd.d1;
import uo.r0;

/* loaded from: classes3.dex */
public final class k0 extends androidx.lifecycle.q0 implements uo.q0 {
    public final androidx.lifecycle.e0<ha.a> A;
    public final LiveData<ha.a> B;
    public final androidx.lifecycle.e0<Bitmap> C;
    public final LiveData<Bitmap> D;
    public final s0<List<UniqueEmomoGiftSlot>> E;
    public final wo.f<wn.v> F;
    public final wo.f<MRError> G;
    public final wo.f<wn.v> H;
    public final wo.f<MRError> I;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f42985y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f42986z;

    @co.f(c = "com.dena.mirrorman.store.UniqueEmomoGiftSlotsStore$on$1", f = "UniqueEmomoGiftSlotsStore.kt", l = {68}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42987w;

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
            int i10 = this.f42987w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = k0.this.E;
                List k10 = xn.s.k();
                this.f42987w = 1;
                if (s0Var.d(k10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.UniqueEmomoGiftSlotsStore$on$2", f = "UniqueEmomoGiftSlotsStore.kt", l = {76}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42989w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ d1.c f42991y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d1.c cVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f42991y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f42991y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42989w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = k0.this.E;
                List<UniqueEmomoGiftSlot> a10 = this.f42991y.a();
                this.f42989w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.UniqueEmomoGiftSlotsStore$on$3", f = "UniqueEmomoGiftSlotsStore.kt", l = {96}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42992w;

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
            int i10 = this.f42992w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = k0.this.F;
                wn.v vVar = wn.v.f59242a;
                this.f42992w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.UniqueEmomoGiftSlotsStore$on$4", f = "UniqueEmomoGiftSlotsStore.kt", l = {104}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42994w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ d1.h f42996y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d1.h hVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f42996y = hVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f42996y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42994w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = k0.this.G;
                MRError a10 = this.f42996y.a();
                this.f42994w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.UniqueEmomoGiftSlotsStore$on$5", f = "UniqueEmomoGiftSlotsStore.kt", l = {119}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42997w;

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
            int i10 = this.f42997w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = k0.this.H;
                wn.v vVar = wn.v.f59242a;
                this.f42997w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.UniqueEmomoGiftSlotsStore$on$6", f = "UniqueEmomoGiftSlotsStore.kt", l = {127}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42999w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ d1.e f43001y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d1.e eVar, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f43001y = eVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f43001y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42999w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = k0.this.I;
                MRError a10 = this.f43001y.a();
                this.f42999w = 1;
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

    public k0(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f42985y = aVar;
        this.f42986z = r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<ha.a> e0Var = new androidx.lifecycle.e0<>(a.d.f34697b);
        this.A = e0Var;
        this.B = e0Var;
        androidx.lifecycle.e0<Bitmap> e0Var2 = new androidx.lifecycle.e0<>();
        this.C = e0Var2;
        this.D = e0Var2;
        this.E = new s0<>();
        this.F = wo.g.a(-2);
        this.G = wo.g.a(-2);
        this.H = wo.g.a(-2);
        this.I = wo.g.a(-2);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f42985y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f42986z.getCoroutineContext();
    }

    public final LiveData<Bitmap> k() {
        return this.D;
    }

    public final xo.c<MRError> l() {
        return xo.e.a(this.I);
    }

    public final xo.c<wn.v> m() {
        return xo.e.a(this.H);
    }

    public final xo.c<MRError> n() {
        return xo.e.a(this.G);
    }

    public final xo.c<wn.v> o() {
        return xo.e.a(this.F);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d1.d dVar) {
        jo.p.h(dVar, "event");
        this.C.p(dVar.a());
    }

    public final List<UniqueEmomoGiftSlot> p() {
        List<UniqueEmomoGiftSlot> b10 = this.E.b();
        return b10 == null ? xn.s.k() : b10;
    }

    public final xo.c<List<UniqueEmomoGiftSlot>> q() {
        return this.E.a();
    }

    public final LiveData<ha.a> r() {
        return this.B;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d1.b bVar) {
        jo.p.h(bVar, "event");
        this.A.p(a.b.f34695b);
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d1.c cVar) {
        jo.p.h(cVar, "event");
        this.A.p(a.d.f34697b);
        uo.l.d(this, null, null, new b(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d1.a aVar) {
        jo.p.h(aVar, "event");
        this.A.p(new a.C0439a(aVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d1.i iVar) {
        jo.p.h(iVar, "event");
        this.A.p(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d1.j jVar) {
        jo.p.h(jVar, "event");
        this.A.p(a.d.f34697b);
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d1.h hVar) {
        jo.p.h(hVar, "event");
        this.A.p(a.d.f34697b);
        uo.l.d(this, null, null, new d(hVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d1.f fVar) {
        jo.p.h(fVar, "event");
        this.A.p(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d1.g gVar) {
        jo.p.h(gVar, "event");
        this.A.p(a.d.f34697b);
        uo.l.d(this, null, null, new e(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d1.e eVar) {
        jo.p.h(eVar, "event");
        this.A.p(a.d.f34697b);
        uo.l.d(this, null, null, new f(eVar, null), 3, null);
    }
}
