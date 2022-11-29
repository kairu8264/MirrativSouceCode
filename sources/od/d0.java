package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.notice.NewsNotice;
import com.dena.mirrorman.net.api.response.notice.NoticeNewsResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import java.util.List;
import java.util.UUID;
import pd.n0;
import uo.g1;
import uo.i2;

/* loaded from: classes2.dex */
public final class d0 implements uo.q0 {
    public final ao.g A;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44766w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f44767x;

    /* renamed from: y  reason: collision with root package name */
    public final kf.p f44768y;

    /* renamed from: z  reason: collision with root package name */
    public final hf.h0 f44769z;

    @co.f(c = "com.dena.mirrorman.actioncreator.NoticeNewsActionCreator$loadNext$1", f = "NoticeNewsActionCreator.kt", l = {48}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44770w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44772y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f44773z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, long j10, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f44772y = str;
            this.f44773z = j10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f44772y, this.f44773z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44770w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = d0.this.f44767x;
                    String str = this.f44772y;
                    this.f44770w = 1;
                    obj = mRRequest.getNoticeNews(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                NoticeNewsResponse noticeNewsResponse = (NoticeNewsResponse) obj;
                List<NewsNotice> newsNotices = noticeNewsResponse.getNewsNotices();
                long j10 = this.f44773z;
                for (NewsNotice newsNotice : newsNotices) {
                    String uuid = UUID.randomUUID().toString();
                    jo.p.g(uuid, "randomUUID().toString()");
                    newsNotice.setId(uuid);
                    newsNotice.setNew(newsNotice.getCreatedAt() > j10);
                }
                d0.this.f44766w.a(new n0.b(noticeNewsResponse));
            } catch (Throwable th2) {
                d0.this.f44766w.a(new n0.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.NoticeNewsActionCreator$reload$1", f = "NoticeNewsActionCreator.kt", l = {29}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44774w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ long f44776y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f44776y = j10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f44776y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44774w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = d0.this.f44767x;
                    this.f44774w = 1;
                    obj = MRRequest.DefaultImpls.getNoticeNews$default(mRRequest, null, this, 1, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                NoticeNewsResponse noticeNewsResponse = (NoticeNewsResponse) obj;
                List<NewsNotice> newsNotices = noticeNewsResponse.getNewsNotices();
                long j10 = this.f44776y;
                for (NewsNotice newsNotice : newsNotices) {
                    String uuid = UUID.randomUUID().toString();
                    jo.p.g(uuid, "randomUUID().toString()");
                    newsNotice.setId(uuid);
                    newsNotice.setNew(newsNotice.getCreatedAt() > j10);
                }
                NewsNotice newsNotice2 = (NewsNotice) xn.a0.Z(noticeNewsResponse.getNewsNotices());
                if (newsNotice2 != null) {
                    d0.this.f44766w.a(new n0.e(newsNotice2.getCreatedAt()));
                }
                d0.this.f44766w.a(new n0.b(noticeNewsResponse));
            } catch (Throwable th2) {
                d0.this.f44766w.a(new n0.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public d0(q8.a aVar, MRRequest mRRequest, kf.p pVar, hf.h0 h0Var) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(pVar, "noticePreference");
        jo.p.h(h0Var, "noticeRepository");
        this.f44766w = aVar;
        this.f44767x = mRRequest;
        this.f44768y = pVar;
        this.f44769z = h0Var;
        uo.k0 b11 = g1.b();
        b10 = i2.b(null, 1, null);
        this.A = b11.plus(b10);
    }

    public final void c(long j10) {
        this.f44769z.j(j10);
    }

    public final void d(String str, long j10) {
        jo.p.h(str, "nextCursor");
        this.f44766w.a(n0.c.f47082a);
        uo.l.d(this, null, null, new a(str, j10, null), 3, null);
    }

    public final void e() {
        long l12 = this.f44768y.l1();
        this.f44766w.a(new n0.d(l12));
        uo.l.d(this, null, null, new b(l12, null), 3, null);
    }

    public final void f(String str) {
        jo.p.h(str, "noticeId");
        this.f44766w.a(new n0.f(str));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A;
    }
}
