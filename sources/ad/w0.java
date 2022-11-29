package ad;

import ad.x0;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import com.dena.mirrativ.mirrativapi.user.UserApi;

/* loaded from: classes2.dex */
public final class w0 implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f1393w;

    /* renamed from: x  reason: collision with root package name */
    public final UserApi f1394x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f1395y;

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.ContractActionCreator$getSummary$1", f = "ContractActionCreator.kt", l = {19}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1396w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f1398y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f1398y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f1398y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f1396w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    w0.this.f1393w.a(x0.e.f1415a);
                    UserApi userApi = w0.this.f1394x;
                    String str = this.f1398y;
                    this.f1396w = 1;
                    obj = userApi.getSummary(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                w0.this.f1393w.a(new x0.b((ContractSummaryResponse) obj));
            } catch (Throwable th2) {
                w0.this.f1393w.a(new x0.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public w0(q8.a aVar, UserApi userApi) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(userApi, "userApi");
        this.f1393w = aVar;
        this.f1394x = userApi;
        this.f1395y = uo.r0.b();
    }

    public final void c(String str) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new a(str, null), 3, null);
    }

    public final void d() {
        this.f1393w.a(x0.c.f1413a);
    }

    public final void e() {
        this.f1393w.a(x0.d.f1414a);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f1395y.getCoroutineContext();
    }
}
