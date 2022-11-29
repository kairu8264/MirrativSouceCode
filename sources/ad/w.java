package ad;

import ad.x;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.user.ContractLiveResultResponse;
import com.dena.mirrativ.mirrativapi.user.UserApi;

/* loaded from: classes2.dex */
public final class w implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f1386w;

    /* renamed from: x  reason: collision with root package name */
    public final UserApi f1387x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f1388y;

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.BroadcastResultExpActionCreator$fetchContractLiveResult$1", f = "BroadcastResultExpActionCreator.kt", l = {19}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1389w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f1391y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f1392z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f1391y = str;
            this.f1392z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f1391y, this.f1392z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f1389w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    w.this.f1386w.a(x.b.f1409a);
                    UserApi userApi = w.this.f1387x;
                    String str = this.f1391y;
                    String str2 = this.f1392z;
                    this.f1389w = 1;
                    obj = userApi.getContractLiveResult(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                w.this.f1386w.a(new x.c((ContractLiveResultResponse) obj));
            } catch (Throwable th2) {
                w.this.f1386w.a(new x.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public w(q8.a aVar, UserApi userApi) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(userApi, "userApi");
        this.f1386w = aVar;
        this.f1387x = userApi;
        this.f1388y = uo.r0.b();
    }

    public final void c(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        uo.l.d(this, null, null, new a(str, str2, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f1388y.getCoroutineContext();
    }
}
