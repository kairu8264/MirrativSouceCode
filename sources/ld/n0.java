package ld;

import com.dena.mirrativ.mirrativapi.user.ContractKycResponse;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import com.dena.mirrativ.mirrativapi.user.UserApi;
import com.dena.mirrorman.net.api.Referer;
import ld.o0;

/* loaded from: classes2.dex */
public final class n0 implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f40056w;

    /* renamed from: x  reason: collision with root package name */
    public final UserApi f40057x;

    /* renamed from: y  reason: collision with root package name */
    public final kf.x f40058y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f40059z;

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingRootActionCreator$fetchCashBonusHistoryParams$1", f = "SettingRootActionCreator.kt", l = {62}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40060w;

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
            int i10 = this.f40060w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    UserApi g10 = n0.this.g();
                    this.f40060w = 1;
                    obj = g10.getSummary(Referer.SETTINGS, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                ContractSummaryResponse contractSummaryResponse = (ContractSummaryResponse) obj;
                if (contractSummaryResponse.getStatus().isSuccess() & true) {
                    n0.this.f().a(new o0.f(contractSummaryResponse));
                }
            } catch (Throwable th2) {
                g9.a.c(th2);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingRootActionCreator$fetchEditIdentificationParams$1", f = "SettingRootActionCreator.kt", l = {36}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40062w;

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
            Object c10 = bo.c.c();
            int i10 = this.f40062w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    UserApi g10 = n0.this.g();
                    this.f40062w = 1;
                    obj = g10.getContractKyc(Referer.SETTINGS, this);
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
                    n0.this.f().a(new o0.e(contractKycResponse.getKycInfo()));
                }
            } catch (Throwable th2) {
                g9.a.c(th2);
            }
            return wn.v.f59242a;
        }
    }

    public n0(q8.a aVar, UserApi userApi, kf.x xVar) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(userApi, "userApi");
        jo.p.h(xVar, "userPreference");
        this.f40056w = aVar;
        this.f40057x = userApi;
        this.f40058y = xVar;
        this.f40059z = uo.r0.b();
    }

    public final void a() {
        this.f40058y.v3(true);
        this.f40056w.a(new o0.a(this.f40058y.n3()));
    }

    public final void b() {
        this.f40058y.F(true);
        this.f40056w.a(new o0.b(this.f40058y.u4()));
    }

    public final void c() {
        this.f40058y.i4(true);
        this.f40056w.a(new o0.c(this.f40058y.h3()));
    }

    public final void d() {
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    public final void e() {
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    public final q8.a f() {
        return this.f40056w;
    }

    public final UserApi g() {
        return this.f40057x;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f40059z.getCoroutineContext();
    }
}
