package nf;

import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.GiftCodeSelectionResponse;
import org.greenrobot.eventbus.ThreadMode;
import pd.p;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.r0;

/* loaded from: classes3.dex */
public final class m extends androidx.lifecycle.q0 implements uo.q0 {
    public final androidx.lifecycle.e0<Boolean> A;
    public final LiveData<Boolean> B;
    public final androidx.lifecycle.e0<GiftCodeSelectionResponse> C;
    public final LiveData<GiftCodeSelectionResponse> D;
    public final wo.q<MRError> E;
    public final wo.q<se.l> F;
    public final wo.q<MRError> G;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f43012y;

    /* renamed from: z  reason: collision with root package name */
    public final ao.g f43013z;

    @co.f(c = "com.dena.mirrorman.store.GiftCodeSelectionStore$on$1", f = "GiftCodeSelectionStore.kt", l = {59}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43014w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ p.a f43016y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p.a aVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f43016y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f43016y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43014w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q<MRError> f10 = m.this.f();
                MRError a10 = this.f43016y.a();
                this.f43014w = 1;
                if (f10.r(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.GiftCodeSelectionStore$on$2", f = "GiftCodeSelectionStore.kt", l = {67}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43017w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ p.d f43019y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p.d dVar, ao.d<? super b> dVar2) {
            super(2, dVar2);
            this.f43019y = dVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f43019y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43017w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q<se.l> i11 = m.this.i();
                se.l a10 = this.f43019y.a();
                this.f43017w = 1;
                if (i11.r(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.GiftCodeSelectionStore$on$3", f = "GiftCodeSelectionStore.kt", l = {75}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43020w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ p.c f43022y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p.c cVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f43022y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f43022y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43020w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q<MRError> h10 = m.this.h();
                MRError a10 = this.f43022y.a();
                this.f43020w = 1;
                if (h10.r(a10, this) == c10) {
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

    public m(q8.a aVar) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        this.f43012y = aVar;
        aVar.b(this);
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.f43013z = c10.plus(b10);
        androidx.lifecycle.e0<Boolean> e0Var = new androidx.lifecycle.e0<>(Boolean.FALSE);
        this.A = e0Var;
        this.B = e0Var;
        androidx.lifecycle.e0<GiftCodeSelectionResponse> e0Var2 = new androidx.lifecycle.e0<>(null);
        this.C = e0Var2;
        this.D = e0Var2;
        this.E = new wo.q<>();
        this.F = new wo.q<>();
        this.G = new wo.q<>();
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f43012y.c(this);
        super.d();
    }

    public final wo.q<MRError> f() {
        return this.E;
    }

    public final LiveData<GiftCodeSelectionResponse> g() {
        return this.D;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f43013z;
    }

    public final wo.q<MRError> h() {
        return this.G;
    }

    public final wo.q<se.l> i() {
        return this.F;
    }

    public final LiveData<Boolean> j() {
        return this.B;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(p.e eVar) {
        jo.p.h(eVar, "event");
        this.A.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(p.b bVar) {
        jo.p.h(bVar, "event");
        this.A.p(Boolean.FALSE);
        this.C.p(bVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(p.a aVar) {
        jo.p.h(aVar, "event");
        this.A.p(Boolean.FALSE);
        uo.l.d(this, null, null, new a(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(p.d dVar) {
        jo.p.h(dVar, "event");
        this.A.p(Boolean.FALSE);
        uo.l.d(this, null, null, new b(dVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(p.c cVar) {
        jo.p.h(cVar, "event");
        this.A.p(Boolean.FALSE);
        uo.l.d(this, null, null, new c(cVar, null), 3, null);
    }
}
