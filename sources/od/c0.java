package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.notice.CampaignNotice;
import com.dena.mirrorman.net.api.response.notice.NoticeCampaignResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import pd.k0;
import pd.l0;
import pd.m0;
import pd.s;
import uo.d2;

/* loaded from: classes2.dex */
public final class c0 implements uo.q0 {
    public static final a C = new a(null);
    public static final int D = 8;
    public final hf.h0 A;
    public final /* synthetic */ da.b B;

    /* renamed from: w  reason: collision with root package name */
    public final jf.g0 f44742w;

    /* renamed from: x  reason: collision with root package name */
    public final q8.a f44743x;

    /* renamed from: y  reason: collision with root package name */
    public final MRRequest f44744y;

    /* renamed from: z  reason: collision with root package name */
    public final kf.p f44745z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f44746a;

        static {
            int[] iArr = new int[jf.g0.values().length];
            iArr[jf.g0.RECOMMEND.ordinal()] = 1;
            iArr[jf.g0.EMOMO.ordinal()] = 2;
            iArr[jf.g0.APP.ordinal()] = 3;
            f44746a = iArr;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.NoticeCampaignPageActionCreator$loadHasReceivableRewardNotice$1", f = "NoticeCampaignPageActionCreator.kt", l = {116}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44747w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f44749y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f44749y = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f44749y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44747w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = c0.this.f44744y;
                    String id2 = c0.this.f44742w.c().getId();
                    String valueOf = String.valueOf(this.f44749y);
                    this.f44747w = 1;
                    obj = MRRequest.DefaultImpls.getNoticeCampaign$default(mRRequest, id2, null, valueOf, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                c0.this.f44743x.a(new m0.d(c0.this.f44742w, (NoticeCampaignResponse) obj));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.NoticeCampaignPageActionCreator$loadNext$1", f = "NoticeCampaignPageActionCreator.kt", l = {57}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44750w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44752y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f44753z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, long j10, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f44752y = str;
            this.f44753z = j10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f44752y, this.f44753z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44750w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = c0.this.f44744y;
                    String id2 = c0.this.f44742w.c().getId();
                    String str = this.f44752y;
                    this.f44750w = 1;
                    obj = MRRequest.DefaultImpls.getNoticeCampaign$default(mRRequest, id2, str, null, this, 4, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                NoticeCampaignResponse noticeCampaignResponse = (NoticeCampaignResponse) obj;
                List<CampaignNotice> campaignNotices = noticeCampaignResponse.getCampaignNotices();
                long j10 = this.f44753z;
                c0 c0Var = c0.this;
                for (CampaignNotice campaignNotice : campaignNotices) {
                    campaignNotice.setNew((campaignNotice.isUpcoming() || campaignNotice.isNow()) && campaignNotice.getCreatedAt() > j10);
                    campaignNotice.setCategory(c0Var.f44742w.c());
                }
                c0.this.f44743x.a(new m0.b(c0.this.f44742w, noticeCampaignResponse));
            } catch (Throwable th2) {
                c0.this.f44743x.a(new m0.a(c0.this.f44742w, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.NoticeCampaignPageActionCreator$reload$1", f = "NoticeCampaignPageActionCreator.kt", l = {40}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44754w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ long f44756y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j10, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f44756y = j10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f44756y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44754w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = c0.this.f44744y;
                    String id2 = c0.this.f44742w.c().getId();
                    this.f44754w = 1;
                    obj = MRRequest.DefaultImpls.getNoticeCampaign$default(mRRequest, id2, null, null, this, 6, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                NoticeCampaignResponse noticeCampaignResponse = (NoticeCampaignResponse) obj;
                List<CampaignNotice> campaignNotices = noticeCampaignResponse.getCampaignNotices();
                long j10 = this.f44756y;
                c0 c0Var = c0.this;
                for (CampaignNotice campaignNotice : campaignNotices) {
                    campaignNotice.setNew((campaignNotice.isUpcoming() || campaignNotice.isNow()) && campaignNotice.getCreatedAt() > j10);
                    campaignNotice.setCategory(c0Var.f44742w.c());
                }
                c0.this.f44743x.a(new m0.f(c0.this.f44742w, noticeCampaignResponse.getLatestCreatedAt(), noticeCampaignResponse.getHasCampaignRewards()));
                c0.this.f44743x.a(new m0.b(c0.this.f44742w, noticeCampaignResponse));
            } catch (Throwable th2) {
                c0.this.f44743x.a(new m0.a(c0.this.f44742w, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.NoticeCampaignPageActionCreator$updateNoticeCampaignNewBadges$1", f = "NoticeCampaignPageActionCreator.kt", l = {92}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44757w;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44757w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    hf.h0 h0Var = c0.this.A;
                    String h10 = c0.this.f44742w.h();
                    this.f44757w = 1;
                    obj = h0Var.g(h10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                jf.e0 e0Var = (jf.e0) obj;
                c0.this.f44743x.a(new l0.d(e0Var.i()));
                c0.this.f44743x.a(new l0.b(e0Var.d()));
                c0.this.f44743x.a(new l0.a(e0Var.a()));
                c0.this.f44743x.a(new k0.b(e0Var.b()));
                c0.this.f44743x.a(new s.x(e0Var.g()));
            } catch (Exception e10) {
                g9.a.c(e10);
            }
            return wn.v.f59242a;
        }
    }

    public c0(jf.g0 g0Var, q8.a aVar, MRRequest mRRequest, kf.p pVar, hf.h0 h0Var) {
        jo.p.h(g0Var, "page");
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(pVar, "noticePreference");
        jo.p.h(h0Var, "noticeRepository");
        this.f44742w = g0Var;
        this.f44743x = aVar;
        this.f44744y = mRRequest;
        this.f44745z = pVar;
        this.A = h0Var;
        this.B = new da.b();
    }

    public final void e(long j10, boolean z10) {
        int i10 = b.f44746a[this.f44742w.ordinal()];
        if (i10 == 1) {
            this.A.c(j10, z10);
        } else if (i10 == 2) {
            this.A.f(j10, z10);
        } else if (i10 != 3) {
        } else {
            this.A.e(j10, z10);
        }
    }

    public final d2 f(int i10) {
        d2 d10;
        d10 = uo.l.d(this, null, null, new c(i10, null), 3, null);
        return d10;
    }

    public final void g(String str, long j10) {
        jo.p.h(str, "nextCursor");
        this.f44743x.a(new m0.c(this.f44742w));
        uo.l.d(this, null, null, new d(str, j10, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.B.getCoroutineContext();
    }

    public final void h() {
        long H4;
        int i10 = b.f44746a[this.f44742w.ordinal()];
        if (i10 == 1) {
            H4 = this.f44745z.H4();
        } else if (i10 == 2) {
            H4 = this.f44745z.g4();
        } else if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            H4 = this.f44745z.U();
        }
        this.f44743x.a(new m0.e(this.f44742w, H4));
        uo.l.d(this, null, null, new e(H4, null), 3, null);
    }

    public final void i(boolean z10) {
        if (z10) {
            uo.l.d(this, null, null, new f(null), 3, null);
            return;
        }
        jf.e0 i10 = this.A.i();
        if (i10 != null) {
            this.f44743x.a(new l0.d(i10.i()));
            this.f44743x.a(new l0.b(i10.d()));
            this.f44743x.a(new l0.a(i10.a()));
            this.f44743x.a(new k0.b(i10.b()));
            this.f44743x.a(new s.x(i10.g()));
        }
    }

    public final void j(CampaignNotice campaignNotice) {
        jo.p.h(campaignNotice, "campaignNotice");
        this.f44743x.a(new m0.g(this.f44742w, campaignNotice));
    }
}
