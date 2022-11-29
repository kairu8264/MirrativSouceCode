package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameApi;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameAppRankingResponse;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameDetailResponse;
import com.dena.mirrativ.mirrativapi.user.ContractKycResponse;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import com.dena.mirrativ.mirrativapi.user.UserApi;
import com.dena.mirrorman.net.api.response.CampaignShareInfoResponse;
import com.dena.mirrorman.net.api.response.live.LiveArchiveDownloadUrlResponse;
import com.dena.mirrorman.net.api.response.live.LiveDetailResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import pd.u;

/* loaded from: classes2.dex */
public final class r implements uo.q0 {
    public static final a C = new a(null);
    public static final int D = 8;
    public final kf.x A;
    public final /* synthetic */ uo.q0 B;

    /* renamed from: w  reason: collision with root package name */
    public final MRRequest f45173w;

    /* renamed from: x  reason: collision with root package name */
    public final UserApi f45174x;

    /* renamed from: y  reason: collision with root package name */
    public final LiveGameApi f45175y;

    /* renamed from: z  reason: collision with root package name */
    public final q8.a f45176z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.HandleUrlSchemeActionCreator$fetchCampaignShareInfo$1", f = "HandleUrlSchemeActionCreator.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45177w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45179y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f45179y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f45179y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45177w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = r.this.f45173w;
                    String str = this.f45179y;
                    this.f45177w = 1;
                    obj = mRRequest.getCampaignShareInfo(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r.this.f45176z.a(new u.i((CampaignShareInfoResponse) obj));
            } catch (Throwable th2) {
                r.this.f45176z.a(new u.g(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.HandleUrlSchemeActionCreator$fetchIsVisibleContractMemberPassBook$1", f = "HandleUrlSchemeActionCreator.kt", l = {96}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45180w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45182y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f45182y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f45182y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45180w;
            boolean z10 = true;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    UserApi userApi = r.this.f45174x;
                    String str = this.f45182y;
                    this.f45180w = 1;
                    obj = userApi.getSummary(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                ContractSummaryResponse contractSummaryResponse = (ContractSummaryResponse) obj;
                boolean z11 = contractSummaryResponse.getKycStatus() == 5 && contractSummaryResponse.getAccountStatus() != 0;
                q8.a aVar = r.this.f45176z;
                if (!z11) {
                    z10 = false;
                }
                aVar.a(new u.a(z10));
            } catch (Throwable th2) {
                r.this.f45176z.a(new u.g(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.HandleUrlSchemeActionCreator$fetchLiveArchiveDownloadUrl$1", f = "HandleUrlSchemeActionCreator.kt", l = {34}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45183w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45185y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45186z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f45185y = str;
            this.f45186z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f45185y, this.f45186z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45183w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = r.this.f45173w;
                    String str = this.f45185y;
                    String str2 = this.f45186z;
                    this.f45183w = 1;
                    obj = mRRequest.getLiveArchiveDownloadUrl(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r.this.f45176z.a(new u.h((LiveArchiveDownloadUrlResponse) obj));
            } catch (Throwable th2) {
                r.this.f45176z.a(new u.g(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.HandleUrlSchemeActionCreator$fetchLiveDetail$1", f = "HandleUrlSchemeActionCreator.kt", l = {58}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45187w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45189y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45190z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f45189y = str;
            this.f45190z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f45189y, this.f45190z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45187w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = r.this.f45173w;
                    String str = this.f45189y;
                    String str2 = this.f45190z;
                    this.f45187w = 1;
                    obj = mRRequest.getLiveDetail(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r.this.f45176z.a(new u.j((LiveDetailResponse) obj));
            } catch (Throwable th2) {
                r.this.f45176z.a(new u.g(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.HandleUrlSchemeActionCreator$fetchLiveGameAppRanking$1", f = "HandleUrlSchemeActionCreator.kt", l = {119}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f45191w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45193y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45194z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2, String str3, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f45193y = str;
            this.f45194z = str2;
            this.A = str3;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f45193y, this.f45194z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45191w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    LiveGameApi liveGameApi = r.this.f45175y;
                    String str = this.f45193y;
                    String str2 = this.f45194z;
                    String str3 = this.A;
                    this.f45191w = 1;
                    obj = liveGameApi.getLiveGameAppRanking(str, str2, str3, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r.this.f45176z.a(new u.b((LiveGameAppRankingResponse) obj));
            } catch (Throwable th2) {
                r.this.f45176z.a(new u.g(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.HandleUrlSchemeActionCreator$fetchLiveGameDetail$1", f = "HandleUrlSchemeActionCreator.kt", l = {108}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45195w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45197y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45198z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f45197y = str;
            this.f45198z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f45197y, this.f45198z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45195w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    LiveGameApi liveGameApi = r.this.f45175y;
                    String str = this.f45197y;
                    String str2 = this.f45198z;
                    this.f45195w = 1;
                    obj = liveGameApi.getLiveGameDetail(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r.this.f45176z.a(new u.c((LiveGameDetailResponse) obj));
            } catch (Throwable th2) {
                r.this.f45176z.a(new u.g(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.HandleUrlSchemeActionCreator$getSummary$1", f = "HandleUrlSchemeActionCreator.kt", l = {70, 76, 80}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f45199w;

        /* renamed from: x  reason: collision with root package name */
        public int f45200x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45202z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f45202z = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f45202z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            ContractSummaryResponse contractSummaryResponse;
            ContractSummaryResponse contractSummaryResponse2;
            Object c10 = bo.c.c();
            int i10 = this.f45200x;
            try {
            } catch (Throwable th2) {
                r.this.f45176z.a(new u.g(MRErrorKt.convertMRException(th2).getError()));
            }
            if (i10 == 0) {
                wn.m.b(obj);
                UserApi userApi = r.this.f45174x;
                String str = this.f45202z;
                this.f45200x = 1;
                obj = userApi.getSummary(str, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    contractSummaryResponse2 = (ContractSummaryResponse) this.f45199w;
                    wn.m.b(obj);
                    r.this.f45176z.a(new u.f(contractSummaryResponse2, (ContractKycResponse) obj));
                    return wn.v.f59242a;
                } else if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    contractSummaryResponse = (ContractSummaryResponse) this.f45199w;
                    wn.m.b(obj);
                    r.this.f45176z.a(new u.f(contractSummaryResponse, (ContractKycResponse) obj));
                    return wn.v.f59242a;
                }
            } else {
                wn.m.b(obj);
            }
            ContractSummaryResponse contractSummaryResponse3 = (ContractSummaryResponse) obj;
            if (contractSummaryResponse3.getContractStatus() == 1 && contractSummaryResponse3.getKycStatus() == 5) {
                r.this.f45176z.a(new u.m(contractSummaryResponse3, ub.a.COMPLETE));
            } else if (contractSummaryResponse3.getContractStatus() != 1 || contractSummaryResponse3.getKycStatus() != 4) {
                if (r.this.A.y2() != contractSummaryResponse3.getContractMonth() || contractSummaryResponse3.getKycStatus() != 4) {
                    r.this.f45176z.a(new u.m(contractSummaryResponse3, ub.a.DETAIL));
                } else {
                    UserApi userApi2 = r.this.f45174x;
                    String str2 = this.f45202z;
                    this.f45199w = contractSummaryResponse3;
                    this.f45200x = 3;
                    Object contractKyc = userApi2.getContractKyc(str2, this);
                    if (contractKyc == c10) {
                        return c10;
                    }
                    contractSummaryResponse = contractSummaryResponse3;
                    obj = contractKyc;
                    r.this.f45176z.a(new u.f(contractSummaryResponse, (ContractKycResponse) obj));
                }
            } else {
                UserApi userApi3 = r.this.f45174x;
                String str3 = this.f45202z;
                this.f45199w = contractSummaryResponse3;
                this.f45200x = 2;
                Object contractKyc2 = userApi3.getContractKyc(str3, this);
                if (contractKyc2 == c10) {
                    return c10;
                }
                contractSummaryResponse2 = contractSummaryResponse3;
                obj = contractKyc2;
                r.this.f45176z.a(new u.f(contractSummaryResponse2, (ContractKycResponse) obj));
            }
            return wn.v.f59242a;
        }
    }

    public r(MRRequest mRRequest, UserApi userApi, LiveGameApi liveGameApi, q8.a aVar, kf.x xVar) {
        jo.p.h(mRRequest, "request");
        jo.p.h(userApi, "userApi");
        jo.p.h(liveGameApi, "liveGameApi");
        jo.p.h(aVar, "dispatcher");
        jo.p.h(xVar, "userPreference");
        this.f45173w = mRRequest;
        this.f45174x = userApi;
        this.f45175y = liveGameApi;
        this.f45176z = aVar;
        this.A = xVar;
        this.B = uo.r0.b();
    }

    public final void f(String str) {
        jo.p.h(str, "campaignId");
        this.f45176z.a(u.e.f47277a);
        uo.l.d(this, null, null, new b(str, null), 3, null);
    }

    public final void g(String str) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new c(str, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.B.getCoroutineContext();
    }

    public final void h(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        this.f45176z.a(u.d.f47276a);
        uo.l.d(this, null, null, new d(str, str2, null), 3, null);
    }

    public final void i(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        this.f45176z.a(u.k.f47284a);
        uo.l.d(this, null, null, new e(str, str2, null), 3, null);
    }

    public final void j(String str, String str2, String str3) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveGameId");
        uo.l.d(this, null, null, new f(str, str2, str3, null), 3, null);
    }

    public final void k(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveGameId");
        uo.l.d(this, null, null, new g(str, str2, null), 3, null);
    }

    public final void l(String str) {
        jo.p.h(str, "referer");
        this.f45176z.a(u.l.f47285a);
        uo.l.d(this, null, null, new h(str, null), 3, null);
    }
}
