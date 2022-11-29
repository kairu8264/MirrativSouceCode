package ad;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.core.StatusResponse;
import com.dena.mirrativ.mirrativapi.user.UserApi;

/* loaded from: classes2.dex */
public final class t1 implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f1333w;

    /* renamed from: x  reason: collision with root package name */
    public final UserApi f1334x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f1335y;

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.ContractStatusActionCreator$postContractStatus$1", f = "ContractStatusActionCreator.kt", l = {19}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1336w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f1338y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f1338y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f1338y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f1336w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    UserApi userApi = t1.this.f1334x;
                    String str = this.f1338y;
                    this.f1336w = 1;
                    obj = userApi.postContractStatus(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                StatusResponse statusResponse = (StatusResponse) obj;
                t1.this.f1333w.a(w1.f1399a);
            } catch (Throwable th2) {
                t1.this.f1333w.a(new u1(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public t1(q8.a aVar, UserApi userApi) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(userApi, "userApi");
        this.f1333w = aVar;
        this.f1334x = userApi;
        this.f1335y = uo.r0.b();
    }

    public final void c(String str) {
        jo.p.h(str, "referer");
        this.f1333w.a(v1.f1385a);
        uo.l.d(this, null, null, new a(str, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f1335y.getCoroutineContext();
    }
}
