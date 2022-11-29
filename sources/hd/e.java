package hd;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.user.ContractKycResponse;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import com.dena.mirrativ.mirrativapi.user.RewardHistoryResponse;
import com.dena.mirrativ.mirrativapi.user.UserApi;
import hd.f;
import uo.q0;
import uo.r0;
import wn.v;

/* loaded from: classes2.dex */
public final class e implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final UserApi f35362w;

    /* renamed from: x  reason: collision with root package name */
    public final q8.a f35363x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ q0 f35364y;

    @co.f(c = "com.dena.mirrativ.user.mypage.passbook.contract_member.ContractMemberPassBookActionCreator$fetchEditBankAccountParams$1", f = "ContractMemberPassBookActionCreator.kt", l = {55}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f35365w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f35365w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    UserApi userApi = e.this.f35362w;
                    this.f35365w = 1;
                    obj = userApi.getContractKyc("", this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                ContractKycResponse contractKycResponse = (ContractKycResponse) obj;
                if (contractKycResponse.getStatus().isSuccess()) {
                    e.this.f35363x.a(new f.a(contractKycResponse.getKycInfo()));
                }
            } catch (Throwable th2) {
                g9.a.c(th2);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.passbook.contract_member.ContractMemberPassBookActionCreator$getSummary$1", f = "ContractMemberPassBookActionCreator.kt", l = {20}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f35367w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f35369y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f35369y = str;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f35369y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f35367w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    UserApi userApi = e.this.f35362w;
                    String str = this.f35369y;
                    this.f35367w = 1;
                    obj = userApi.getSummary(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                e.this.f35363x.a(new f.d((ContractSummaryResponse) obj));
            } catch (Throwable th2) {
                e.this.f35363x.a(new f.b(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.passbook.contract_member.ContractMemberPassBookActionCreator$loadNext$1", f = "ContractMemberPassBookActionCreator.kt", l = {44}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f35370w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f35372y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f35373z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f35372y = str;
            this.f35373z = str2;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f35372y, this.f35373z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f35370w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    UserApi userApi = e.this.f35362w;
                    String str = this.f35372y;
                    String str2 = this.f35373z;
                    this.f35370w = 1;
                    obj = userApi.getRewardHistory(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                e.this.f35363x.a(new f.c((RewardHistoryResponse) obj));
            } catch (Exception e10) {
                e.this.f35363x.a(new f.b(MRErrorKt.convertMRException(e10).getError()));
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.passbook.contract_member.ContractMemberPassBookActionCreator$reload$1", f = "ContractMemberPassBookActionCreator.kt", l = {32}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f35374w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f35376y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f35376y = str;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f35376y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f35374w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    UserApi userApi = e.this.f35362w;
                    String str = this.f35376y;
                    this.f35374w = 1;
                    obj = UserApi.DefaultImpls.getRewardHistory$default(userApi, str, null, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                e.this.f35363x.a(new f.c((RewardHistoryResponse) obj));
            } catch (Exception e10) {
                e.this.f35363x.a(new f.b(MRErrorKt.convertMRException(e10).getError()));
            }
            return v.f59242a;
        }
    }

    public e(UserApi userApi, q8.a aVar) {
        jo.p.h(userApi, "userApi");
        jo.p.h(aVar, "dispatcher");
        this.f35362w = userApi;
        this.f35363x = aVar;
        this.f35364y = r0.b();
    }

    public final void c() {
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    public final void d(String str) {
        jo.p.h(str, "referer");
        this.f35363x.a(f.C0448f.f35382a);
        uo.l.d(this, null, null, new b(str, null), 3, null);
    }

    public final void e(String str, String str2) {
        jo.p.h(str, "cursor");
        jo.p.h(str2, "referer");
        this.f35363x.a(f.e.f35381a);
        uo.l.d(this, null, null, new c(str2, str, null), 3, null);
    }

    public final void f(String str) {
        jo.p.h(str, "referer");
        this.f35363x.a(f.g.f35383a);
        uo.l.d(this, null, null, new d(str, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f35364y.getCoroutineContext();
    }
}
