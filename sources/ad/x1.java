package ad;

import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class x1 extends androidx.lifecycle.q0 {
    public final xo.w<wn.v> A;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f1416y;

    /* renamed from: z  reason: collision with root package name */
    public final xo.r<wn.v> f1417z;

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.ContractStatusStore$on$1", f = "ContractStatusStore.kt", l = {28}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1418w;

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
            int i10 = this.f1418w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = x1.this.f1417z;
                wn.v vVar = wn.v.f59242a;
                this.f1418w = 1;
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

    public x1(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f1416y = aVar;
        aVar.b(this);
        xo.r<wn.v> b10 = xo.y.b(0, 0, null, 7, null);
        this.f1417z = b10;
        this.A = b10;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f1416y.c(this);
        super.d();
    }

    public final xo.w<wn.v> g() {
        return this.A;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(w1 w1Var) {
        jo.p.h(w1Var, "event");
        uo.l.d(androidx.lifecycle.r0.a(this), null, null, new a(null), 3, null);
    }
}
