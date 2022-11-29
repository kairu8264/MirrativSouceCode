package ya;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import com.dena.mirrorman.net.api.response.campaign.CampaignDetailResponse;
import com.dena.mirrorman.net.api.response.campaign.CampaignMissionReceivePrizesResponse;
import com.dena.mirrorman.net.api.response.live.CampaignShareTweetResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import pd.b;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public final class a implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f61354w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f61355x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ q0 f61356y;

    @co.f(c = "com.dena.mirrativ.otherfeature.campaign.CampaignDetailActionCreator$postAppUserDetail$1", f = "CampaignDetailActionCreator.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: ya.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1047a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ boolean B;

        /* renamed from: w  reason: collision with root package name */
        public int f61357w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f61359y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ jf.a f61360z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1047a(String str, jf.a aVar, String str2, boolean z10, ao.d<? super C1047a> dVar) {
            super(2, dVar);
            this.f61359y = str;
            this.f61360z = aVar;
            this.A = str2;
            this.B = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C1047a(this.f61359y, this.f61360z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C1047a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f61357w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f61355x;
                    String str = this.f61359y;
                    int c11 = this.f61360z.c();
                    String str2 = this.A;
                    int i11 = this.B ? 1 : 0;
                    this.f61357w = 1;
                    obj = mRRequest.postAppUserDetail(Referer.Notice.CAMPAIGN, str, c11, str2, i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f61354w.a(new b.k((AppUserDetailResponse) obj));
            } catch (Throwable th2) {
                a.this.f61354w.a(new b.j(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.campaign.CampaignDetailActionCreator$postCampaignShareTweet$1", f = "CampaignDetailActionCreator.kt", l = {56}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f61361w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f61363y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f61364z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f61363y = str;
            this.f61364z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f61363y, this.f61364z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f61361w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f61355x;
                    String str = this.f61363y;
                    String str2 = this.f61364z;
                    this.f61361w = 1;
                    obj = mRRequest.postCampaignShareTweet(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f61354w.a(new b.h(this.f61363y, ((CampaignShareTweetResponse) obj).getSharingAward()));
            } catch (Throwable th2) {
                a.this.f61354w.a(new b.g(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.campaign.CampaignDetailActionCreator$receivePrizes$1", f = "CampaignDetailActionCreator.kt", l = {45}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f61365w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f61367y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f61368z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, int i10, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f61367y = str;
            this.f61368z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f61367y, this.f61368z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f61365w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f61355x;
                    String str = this.f61367y;
                    int i11 = this.f61368z;
                    this.f61365w = 1;
                    obj = mRRequest.postCampaignReceivePrizes(Referer.Notice.CAMPAIGN, str, i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f61354w.a(new b.d(this.f61368z, (CampaignMissionReceivePrizesResponse) obj));
            } catch (Throwable th2) {
                a.this.f61354w.a(new b.c(this.f61368z, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.campaign.CampaignDetailActionCreator$reload$1", f = "CampaignDetailActionCreator.kt", l = {21}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f61369w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f61371y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f61371y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f61371y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f61369w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f61355x;
                    String str = this.f61371y;
                    this.f61369w = 1;
                    obj = mRRequest.getCampaignDetail("", str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f61354w.a(new b.C0711b((CampaignDetailResponse) obj));
            } catch (Throwable th2) {
                a.this.f61354w.a(new b.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public a(q8.a aVar, MRRequest mRRequest) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f61354w = aVar;
        this.f61355x = mRRequest;
        this.f61356y = r0.b();
    }

    public final void c(String str, jf.a aVar, String str2, boolean z10) {
        jo.p.h(str, "appId");
        jo.p.h(aVar, "type");
        jo.p.h(str2, "appUserId");
        this.f61354w.a(b.i.f46602a);
        uo.l.d(this, null, null, new C1047a(str, aVar, str2, z10, null), 3, null);
    }

    public final void d(String str, String str2) {
        jo.p.h(str, "campaignId");
        jo.p.h(str2, "text");
        uo.l.d(this, null, null, new b(str, str2, null), 3, null);
    }

    public final void e(String str, int i10) {
        jo.p.h(str, "campaignId");
        this.f61354w.a(new b.e(i10));
        uo.l.d(this, null, null, new c(str, i10, null), 3, null);
    }

    public final void f(String str) {
        jo.p.h(str, "campaignId");
        this.f61354w.a(b.f.f46598a);
        uo.l.d(this, null, null, new d(str, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f61356y.getCoroutineContext();
    }
}
