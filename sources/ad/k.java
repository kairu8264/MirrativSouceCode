package ad;

import ad.l;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.user.ContractBanksResponse;
import com.dena.mirrativ.mirrativapi.user.UserApi;

/* loaded from: classes2.dex */
public final class k implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f1146w;

    /* renamed from: x  reason: collision with root package name */
    public final UserApi f1147x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f1148y;

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.BankListActionCreator$fetchBankList$1", f = "BankListActionCreator.kt", l = {20}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1149w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f1151y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f1151y = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f1151y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f1149w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    UserApi userApi = k.this.f1147x;
                    int i11 = this.f1151y;
                    this.f1149w = 1;
                    obj = userApi.getContractBanks("bank_list", i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                k.this.f1146w.a(new l.c((ContractBanksResponse) obj));
            } catch (Throwable th2) {
                k.this.f1146w.a(new l.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public k(q8.a aVar, UserApi userApi) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(userApi, "userApi");
        this.f1146w = aVar;
        this.f1147x = userApi;
        this.f1148y = uo.r0.b();
    }

    public final void c(int i10) {
        this.f1146w.a(l.b.f1189a);
        uo.l.d(this, null, null, new a(i10, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f1148y.getCoroutineContext();
    }
}
