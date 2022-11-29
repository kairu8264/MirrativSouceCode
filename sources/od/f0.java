package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.notice.NoticeYourResponse;
import com.dena.mirrorman.net.api.response.notice.YourNotice;
import com.dena.mirrorman.net.retrofit.MRRequest;
import java.util.List;
import java.util.UUID;
import pd.p0;
import uo.g1;
import uo.i2;

/* loaded from: classes2.dex */
public final class f0 implements uo.q0 {
    public final ao.g A;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44867w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f44868x;

    /* renamed from: y  reason: collision with root package name */
    public final kf.p f44869y;

    /* renamed from: z  reason: collision with root package name */
    public final hf.h0 f44870z;

    @co.f(c = "com.dena.mirrorman.actioncreator.NoticeYourActionCreator$loadNext$1", f = "NoticeYourActionCreator.kt", l = {48}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44871w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44873y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f44874z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, long j10, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f44873y = str;
            this.f44874z = j10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f44873y, this.f44874z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44871w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = f0.this.f44868x;
                    String str = this.f44873y;
                    this.f44871w = 1;
                    obj = mRRequest.getNoticeYour(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                NoticeYourResponse noticeYourResponse = (NoticeYourResponse) obj;
                List<YourNotice> yourNotices = noticeYourResponse.getYourNotices();
                long j10 = this.f44874z;
                for (YourNotice yourNotice : yourNotices) {
                    String uuid = UUID.randomUUID().toString();
                    jo.p.g(uuid, "randomUUID().toString()");
                    yourNotice.setId(uuid);
                    yourNotice.setNew(yourNotice.getCreatedAt() > j10);
                }
                f0.this.f44867w.a(new p0.b(noticeYourResponse));
            } catch (Throwable th2) {
                f0.this.f44867w.a(new p0.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.NoticeYourActionCreator$reload$1", f = "NoticeYourActionCreator.kt", l = {29}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44875w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ long f44877y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f44877y = j10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f44877y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44875w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = f0.this.f44868x;
                    this.f44875w = 1;
                    obj = MRRequest.DefaultImpls.getNoticeYour$default(mRRequest, null, this, 1, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                NoticeYourResponse noticeYourResponse = (NoticeYourResponse) obj;
                List<YourNotice> yourNotices = noticeYourResponse.getYourNotices();
                long j10 = this.f44877y;
                for (YourNotice yourNotice : yourNotices) {
                    String uuid = UUID.randomUUID().toString();
                    jo.p.g(uuid, "randomUUID().toString()");
                    yourNotice.setId(uuid);
                    yourNotice.setNew(yourNotice.getCreatedAt() > j10);
                }
                YourNotice yourNotice2 = (YourNotice) xn.a0.Z(noticeYourResponse.getYourNotices());
                if (yourNotice2 != null) {
                    f0.this.f44867w.a(new p0.e(yourNotice2.getCreatedAt()));
                }
                f0.this.f44867w.a(new p0.b(noticeYourResponse));
            } catch (Throwable th2) {
                f0.this.f44867w.a(new p0.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public f0(q8.a aVar, MRRequest mRRequest, kf.p pVar, hf.h0 h0Var) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(pVar, "noticePreference");
        jo.p.h(h0Var, "noticeRepository");
        this.f44867w = aVar;
        this.f44868x = mRRequest;
        this.f44869y = pVar;
        this.f44870z = h0Var;
        uo.k0 b11 = g1.b();
        b10 = i2.b(null, 1, null);
        this.A = b11.plus(b10);
    }

    public final void c(long j10) {
        this.f44870z.k(j10);
    }

    public final void d(String str, long j10) {
        jo.p.h(str, "nextCursor");
        this.f44867w.a(p0.c.f47108a);
        uo.l.d(this, null, null, new a(str, j10, null), 3, null);
    }

    public final void e() {
        long A = this.f44869y.A();
        this.f44867w.a(new p0.d(A));
        uo.l.d(this, null, null, new b(A, null), 3, null);
    }

    public final void f(String str) {
        jo.p.h(str, "noticeId");
        this.f44867w.a(new p0.f(str));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A;
    }
}
