package ad;

import ad.q1;
import android.content.res.Resources;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class r1 extends androidx.lifecycle.q0 {
    public final xo.r<wn.v> A;
    public final xo.w<wn.v> B;
    public final xo.r<String> C;
    public final xo.w<String> D;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f1292y;

    /* renamed from: z  reason: collision with root package name */
    public final Resources f1293z;

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.ContractRegisterMailAddressStore$on$1", f = "ContractRegisterMailAddressStore.kt", l = {36}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1294w;

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
            int i10 = this.f1294w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = r1.this.A;
                wn.v vVar = wn.v.f59242a;
                this.f1294w = 1;
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

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.ContractRegisterMailAddressStore$on$2", f = "ContractRegisterMailAddressStore.kt", l = {44}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1296w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q1.a f1298y;

        public b(q1.a aVar, ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f1298y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            int i10 = this.f1296w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r unused = r1.this.C;
                throw null;
            } else if (i10 == 1) {
                wn.m.b(obj);
                return wn.v.f59242a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public r1(q8.a aVar, Resources resources) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(resources, "resources");
        this.f1292y = aVar;
        this.f1293z = resources;
        aVar.b(this);
        xo.r<wn.v> b10 = xo.y.b(0, 0, null, 7, null);
        this.A = b10;
        this.B = b10;
        xo.r<String> b11 = xo.y.b(0, 0, null, 7, null);
        this.C = b11;
        this.D = b11;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f1292y.c(this);
        super.d();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q1.b bVar) {
        jo.p.h(bVar, "event");
        uo.l.d(androidx.lifecycle.r0.a(this), null, null, new a(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q1.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(androidx.lifecycle.r0.a(this), null, null, new b(aVar, null), 3, null);
    }
}
