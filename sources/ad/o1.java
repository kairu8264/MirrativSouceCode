package ad;

import ad.n1;
import androidx.lifecycle.LiveData;
import ha.a;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class o1 extends androidx.lifecycle.q0 {
    public final LiveData<Boolean> A;
    public final xo.r<String> B;
    public final xo.w<String> C;
    public final xo.r<String> D;
    public final xo.w<String> E;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f1237y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<ha.a> f1238z;

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.ContractRegisterIdentificationStore$on$1", f = "ContractRegisterIdentificationStore.kt", l = {38}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1239w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ n1.c f1241y;

        public a(n1.c cVar, ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f1241y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            int i10 = this.f1239w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r unused = o1.this.D;
                throw null;
            } else if (i10 == 1) {
                wn.m.b(obj);
                return wn.v.f59242a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<I, O> implements n.a {
        @Override // n.a
        public final Boolean apply(ha.a aVar) {
            return Boolean.valueOf(aVar.a());
        }
    }

    public o1(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f1237y = aVar;
        aVar.b(this);
        androidx.lifecycle.e0<ha.a> e0Var = new androidx.lifecycle.e0<>(a.d.f34697b);
        this.f1238z = e0Var;
        LiveData<Boolean> b10 = androidx.lifecycle.p0.b(e0Var, new b());
        jo.p.g(b10, "crossinline transform: (…p(this) { transform(it) }");
        this.A = b10;
        xo.r<String> b11 = xo.y.b(0, 0, null, 7, null);
        this.B = b11;
        this.C = b11;
        xo.r<String> b12 = xo.y.b(0, 0, null, 7, null);
        this.D = b12;
        this.E = b12;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f1237y.c(this);
        super.d();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(n1.c cVar) {
        jo.p.h(cVar, "event");
        this.f1238z.p(a.d.f34697b);
        uo.l.d(androidx.lifecycle.r0.a(this), null, null, new a(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(n1.b bVar) {
        jo.p.h(bVar, "event");
        this.f1238z.p(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(n1.a aVar) {
        jo.p.h(aVar, "event");
        throw null;
    }
}
