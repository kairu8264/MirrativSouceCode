package nf;

import org.greenrobot.eventbus.ThreadMode;
import pd.j1;
import uo.r0;

/* loaded from: classes3.dex */
public final class q0 extends androidx.lifecycle.q0 implements uo.q0 {
    public final xo.r<Long> A;
    public final xo.w<Long> B;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f43202y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f43203z;

    @co.f(c = "com.dena.mirrorman.store.WebViewStore$on$1", f = "WebViewStore.kt", l = {34}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43204w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ j1.a f43206y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j1.a aVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f43206y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f43206y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43204w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = q0.this.A;
                Long e10 = co.b.e(this.f43206y.a());
                this.f43204w = 1;
                if (rVar.emit(e10, this) == c10) {
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

    public q0(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f43202y = aVar;
        this.f43203z = r0.b();
        aVar.b(this);
        xo.r<Long> b10 = xo.y.b(0, 0, null, 7, null);
        this.A = b10;
        this.B = xo.e.b(b10);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f43202y.c(this);
        super.d();
    }

    public final xo.w<Long> g() {
        return this.B;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f43203z.getCoroutineContext();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j1.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(this, null, null, new a(aVar, null), 3, null);
    }
}
