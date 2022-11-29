package ad;

import ad.o2;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.user.ContractKycResponse;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryPaymentType;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import com.dena.mirrativ.mirrativapi.user.KycInfo;
import com.dena.mirrativ.mirrativapi.user.UserApi;

/* loaded from: classes2.dex */
public final class n2 implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final UserApi f1220w;

    /* renamed from: x  reason: collision with root package name */
    public final q8.a f1221x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f1222y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f1219z = new a(null);
    public static final int A = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.SelectReceiveCashBonusActionCreator$getSummary$1", f = "SelectReceiveCashBonusActionCreator.kt", l = {26, 27}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f1223w;

        /* renamed from: x  reason: collision with root package name */
        public int f1224x;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            ContractSummaryResponse contractSummaryResponse;
            Object c10 = bo.c.c();
            int i10 = this.f1224x;
            try {
            } catch (Throwable th2) {
                g9.a.c(th2);
            }
            if (i10 == 0) {
                wn.m.b(obj);
                UserApi c11 = n2.this.c();
                this.f1224x = 1;
                obj = c11.getSummary("select_receive_cash_bonus", this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                contractSummaryResponse = (ContractSummaryResponse) this.f1223w;
                wn.m.b(obj);
                n2.this.a().a(new o2.b(contractSummaryResponse, (ContractKycResponse) obj));
                return wn.v.f59242a;
            } else {
                wn.m.b(obj);
            }
            ContractSummaryResponse contractSummaryResponse2 = (ContractSummaryResponse) obj;
            UserApi c12 = n2.this.c();
            this.f1223w = contractSummaryResponse2;
            this.f1224x = 2;
            Object contractKyc = c12.getContractKyc("select_receive_cash_bonus", this);
            if (contractKyc == c10) {
                return c10;
            }
            contractSummaryResponse = contractSummaryResponse2;
            obj = contractKyc;
            n2.this.a().a(new o2.b(contractSummaryResponse, (ContractKycResponse) obj));
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.SelectReceiveCashBonusActionCreator$postPaymentType$1", f = "SelectReceiveCashBonusActionCreator.kt", l = {39}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1226w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ContractSummaryPaymentType f1228y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ContractSummaryPaymentType contractSummaryPaymentType, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f1228y = contractSummaryPaymentType;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f1228y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f1226w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    n2.this.a().a(o2.d.f1246a);
                    UserApi c11 = n2.this.c();
                    int rawValue = this.f1228y.getRawValue();
                    this.f1226w = 1;
                    if (c11.postContractPaymentType("select_receive_cash_bonus", rawValue, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                n2.this.a().a(new o2.e(this.f1228y));
            } catch (Throwable th2) {
                n2.this.a().a(new o2.c(MRErrorKt.convertMRException(th2)));
            }
            return wn.v.f59242a;
        }
    }

    public n2(UserApi userApi, q8.a aVar) {
        jo.p.h(userApi, "userApi");
        jo.p.h(aVar, "dispatcher");
        this.f1220w = userApi;
        this.f1221x = aVar;
        this.f1222y = uo.r0.b();
    }

    public final q8.a a() {
        return this.f1221x;
    }

    public final void b() {
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    public final UserApi c() {
        return this.f1220w;
    }

    public final void d(KycInfo kycInfo) {
        jo.p.h(kycInfo, "kycInfo");
        this.f1221x.a(new o2.a(kycInfo));
    }

    public final void e(ContractSummaryPaymentType contractSummaryPaymentType) {
        jo.p.h(contractSummaryPaymentType, "type");
        uo.l.d(this, null, null, new c(contractSummaryPaymentType, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f1222y.getCoroutineContext();
    }
}
