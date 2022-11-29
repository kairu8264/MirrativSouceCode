package hb;

import androidx.lifecycle.LiveData;
import ce.l;
import hb.c;
import org.greenrobot.eventbus.ThreadMode;
import pd.q0;

/* loaded from: classes2.dex */
public final class d extends androidx.lifecycle.q0 implements uo.q0 {
    public final androidx.lifecycle.e0<jf.c> A;
    public final LiveData<jf.c> B;
    public final xo.r<String> C;
    public final xo.w<String> D;
    public final androidx.lifecycle.e0<Boolean> E;
    public final androidx.lifecycle.e0<Boolean> F;
    public final LiveData<Boolean> G;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f34742y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f34743z;

    @co.f(c = "com.dena.mirrativ.player.EmomoWipeStore$on$1", f = "EmomoWipeStore.kt", l = {68}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34744w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.i0 f34746y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q0.i0 i0Var, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f34746y = i0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f34746y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34744w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = d.this.C;
                String g10 = this.f34746y.a().g();
                this.f34744w = 1;
                if (rVar.emit(g10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            d.this.E.p(co.b.a(!this.f34746y.a().isEmomoVisible()));
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> implements androidx.lifecycle.f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.c0 f34747a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f34748b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f34749c;

        public b(androidx.lifecycle.c0 c0Var, LiveData liveData, LiveData liveData2) {
            this.f34747a = c0Var;
            this.f34748b = liveData;
            this.f34749c = liveData2;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f34747a.f();
            Object f11 = this.f34748b.f();
            Object f12 = this.f34749c.f();
            if (f10 == null || f11 == null || f12 == null) {
                return;
            }
            androidx.lifecycle.c0 c0Var = this.f34747a;
            Boolean bool = (Boolean) f12;
            ((Boolean) f10).booleanValue();
            c0Var.p(Boolean.valueOf(((Boolean) f11).booleanValue() && bool.booleanValue()));
        }
    }

    public d(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f34742y = aVar;
        this.f34743z = uo.r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<jf.c> e0Var = new androidx.lifecycle.e0<>();
        this.A = e0Var;
        this.B = e0Var;
        xo.r<String> b10 = xo.y.b(0, 0, null, 7, null);
        this.C = b10;
        this.D = b10;
        Boolean bool = Boolean.FALSE;
        androidx.lifecycle.e0<Boolean> e0Var2 = new androidx.lifecycle.e0<>(bool);
        this.E = e0Var2;
        androidx.lifecycle.e0<Boolean> e0Var3 = new androidx.lifecycle.e0<>(bool);
        this.F = e0Var3;
        androidx.lifecycle.c0 c0Var = new androidx.lifecycle.c0();
        c0Var.p(bool);
        for (LiveData liveData : xn.s.m(e0Var2, e0Var3)) {
            c0Var.q(liveData, new b(c0Var, e0Var2, e0Var3));
        }
        LiveData<Boolean> a10 = androidx.lifecycle.p0.a(c0Var);
        jo.p.g(a10, "distinctUntilChanged(this)");
        this.G = a10;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        uo.r0.d(this, null, 1, null);
        this.f34742y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f34743z.getCoroutineContext();
    }

    public final LiveData<jf.c> h() {
        return this.B;
    }

    public final xo.w<String> i() {
        return this.D;
    }

    public final LiveData<Boolean> j() {
        return this.G;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.g0 g0Var) {
        jo.p.h(g0Var, "event");
        this.A.p(null);
        this.E.p(Boolean.FALSE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.i0 i0Var) {
        jo.p.h(i0Var, "event");
        uo.l.d(this, null, null, new a(i0Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.a aVar) {
        jo.p.h(aVar, "event");
        this.A.p(aVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.b bVar) {
        jo.p.h(bVar, "event");
        this.F.p(Boolean.valueOf(bVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.v vVar) {
        jo.p.h(vVar, "event");
        if (jo.p.c(vVar.a(), "PlayerService")) {
            this.E.p(Boolean.valueOf(!vVar.b().isVisible()));
        }
    }
}
