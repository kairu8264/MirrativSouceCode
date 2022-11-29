package ad;

import ad.i2;
import com.dena.mirrativ.mirrativapi.user.KycInfo;
import ha.a;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class j2 extends androidx.lifecycle.q0 {
    public final xo.w<wn.k<KycInfo, ub.a>> A;
    public final androidx.lifecycle.e0<ha.a> B;
    public final xo.r<wn.k<String, ub.a>> C;
    public final xo.w<wn.k<String, ub.a>> D;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f1141y;

    /* renamed from: z  reason: collision with root package name */
    public final xo.r<wn.k<KycInfo, ub.a>> f1142z;

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.KycInfoStore$on$1", f = "KycInfoStore.kt", l = {36}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1143w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i2.c f1145y;

        public a(i2.c cVar, ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f1145y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            int i10 = this.f1143w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r unused = j2.this.f1142z;
                throw null;
            } else if (i10 == 1) {
                wn.m.b(obj);
                return wn.v.f59242a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public j2(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f1141y = aVar;
        aVar.b(this);
        xo.r<wn.k<KycInfo, ub.a>> b10 = xo.y.b(0, 0, null, 7, null);
        this.f1142z = b10;
        this.A = b10;
        this.B = new androidx.lifecycle.e0<>(a.d.f34697b);
        xo.r<wn.k<String, ub.a>> b11 = xo.y.b(0, 0, null, 7, null);
        this.C = b11;
        this.D = b11;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f1141y.c(this);
        super.d();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i2.c cVar) {
        jo.p.h(cVar, "event");
        this.B.p(a.d.f34697b);
        uo.l.d(androidx.lifecycle.r0.a(this), null, null, new a(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i2.b bVar) {
        jo.p.h(bVar, "event");
        this.B.p(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i2.a aVar) {
        jo.p.h(aVar, "event");
        throw null;
    }
}
