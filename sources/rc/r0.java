package rc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.ThumbnailUtils;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.user.ChatStatus;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.BroadcastSettings;
import com.dena.mirrorman.net.api.response.ChatThreadList;
import com.dena.mirrorman.net.api.response.EventNoticeResponse;
import com.dena.mirrorman.net.api.response.Graph;
import com.dena.mirrorman.net.api.response.UserCurrencyResponse;
import com.dena.mirrorman.net.api.response.live.LiveArchiveDownloadUrlResponse;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.net.api.response.live.LiveHistoriesResponse;
import com.dena.mirrorman.net.api.response.live.ViewHistoriesResponse;
import com.dena.mirrorman.net.api.response.user.PurchaseContinuousLiveHolidayResponse;
import com.dena.mirrorman.net.api.response.user.UserMe;
import com.dena.mirrorman.net.retrofit.MRRequest;
import hf.a0;
import pd.f0;
import pd.i1;
import pd.j0;
import pd.s;
import uo.i2;

/* loaded from: classes2.dex */
public final class r0 extends androidx.lifecycle.q0 implements uo.q0 {
    public static final a K = new a(null);
    public static final int L = 8;
    public final hf.v0 A;
    public final hf.r B;
    public final kf.i C;
    public final kf.t D;
    public final kf.x E;
    public final kf.v F;
    public final q8.a G;
    public final hf.a0 H;
    public final nd.i1 I;
    public final ao.g J;

    /* renamed from: y  reason: collision with root package name */
    public final MRRequest f50917y;

    /* renamed from: z  reason: collision with root package name */
    public final Context f50918z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageActionCreator$deleteLive$1", f = "MyPageActionCreator.kt", l = {369}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50919w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f50921y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f50921y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f50921y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50919w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = r0.this.f50917y;
                    String str = this.f50921y;
                    this.f50919w = 1;
                    if (mRRequest.postDeleteLiveHistory(Referer.MY_PAGE, str, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r0.this.G.a(new j0.z(this.f50921y));
            } catch (Throwable th2) {
                r0.this.G.a(new j0.a0(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageActionCreator$deleteNextAnnounce$1", f = "MyPageActionCreator.kt", l = {266, 268}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50922w;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50922w;
            try {
            } catch (Throwable th2) {
                r0.this.G.a(new j0.j(MRErrorKt.convertMRException(th2).getError()));
            }
            if (i10 == 0) {
                wn.m.b(obj);
                MRRequest mRRequest = r0.this.f50917y;
                this.f50922w = 1;
                if (mRRequest.postUserDeleteLiveAnnouncement(Referer.MY_PAGE, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                return wn.v.f59242a;
            } else {
                wn.m.b(obj);
            }
            r0.this.G.a(j0.k.f47011a);
            hf.a0 a0Var = r0.this.H;
            this.f50922w = 2;
            if (a0Var.a(Referer.MY_PAGE, true, this) == c10) {
                return c10;
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageActionCreator$followUser$1", f = "MyPageActionCreator.kt", l = {232}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50924w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f50926y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f50927z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f50926y = str;
            this.f50927z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f50926y, this.f50927z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50924w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = r0.this.f50917y;
                    String str = this.f50926y;
                    String str2 = this.f50927z;
                    this.f50924w = 1;
                    obj = mRRequest.postGraphFollow(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r0.this.G.a(new i1.o(this.f50927z, (Graph.Follow) obj));
                r0.this.G.a(new s.C0720s(this.f50927z));
            } catch (Throwable th2) {
                r0.this.G.a(new i1.n(this.f50927z, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageActionCreator$loadImages$1", f = "MyPageActionCreator.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public int f50928w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Bitmap f50930y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f50931z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Bitmap bitmap, int i10, int i11, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f50930y = bitmap;
            this.f50931z = i10;
            this.A = i11;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f50930y, this.f50931z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f50928w == 0) {
                wn.m.b(obj);
                try {
                    r0.this.G.a(new j0.e(this.f50930y));
                    Bitmap createBitmap = Bitmap.createBitmap(this.f50931z, this.A, Bitmap.Config.ARGB_8888);
                    Bitmap bitmap = this.f50930y;
                    int i10 = this.f50931z;
                    int i11 = this.A;
                    r0 r0Var = r0.this;
                    Canvas canvas = new Canvas(createBitmap);
                    Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(bitmap, i10, i11);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    wn.v vVar = wn.v.f59242a;
                    canvas.drawBitmap(extractThumbnail, 0.0f, 0.0f, paint);
                    canvas.drawColor(c3.a.d(r0Var.f50918z, nc.b.f41792c));
                    r0.this.G.a(new j0.a(createBitmap));
                } catch (Throwable unused) {
                }
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageActionCreator$loadLiveDownloadUrl$1", f = "MyPageActionCreator.kt", l = {358}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50932w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f50934y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f50934y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f50934y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50932w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = r0.this.f50917y;
                    String str = this.f50934y;
                    this.f50932w = 1;
                    obj = mRRequest.getLiveArchiveDownloadUrl(Referer.MY_PAGE, str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r0.this.G.a(new j0.w((LiveArchiveDownloadUrlResponse) obj));
            } catch (Throwable th2) {
                r0.this.G.a(new j0.v(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageActionCreator$loadNextChatThreads$1", f = "MyPageActionCreator.kt", l = {307}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50935w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f50937y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i10, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f50937y = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f50937y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50935w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = r0.this.f50917y;
                    Integer d10 = co.b.d(this.f50937y);
                    this.f50935w = 1;
                    obj = mRRequest.getChatThreads(Referer.MY_PAGE, d10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r0.this.G.a(new j0.b((ChatThreadList) obj));
            } catch (Throwable th2) {
                r0.this.G.a(new j0.f(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageActionCreator$loadNextLiveHistories$1", f = "MyPageActionCreator.kt", l = {194}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50938w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f50940y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f50941z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, int i10, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f50940y = str;
            this.f50941z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f50940y, this.f50941z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50938w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = r0.this.f50917y;
                    String str = this.f50940y;
                    Integer d10 = co.b.d(this.f50941z);
                    this.f50938w = 1;
                    obj = mRRequest.getLiveHistories(Referer.MY_PAGE, str, d10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r0.this.G.a(new j0.c((LiveHistoriesResponse) obj));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageActionCreator$loadNextViewHistories$1", f = "MyPageActionCreator.kt", l = {221}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50942w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f50944y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f50945z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f50944y = str;
            this.f50945z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f50944y, this.f50945z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50942w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = r0.this.f50917y;
                    String str = this.f50944y;
                    String str2 = this.f50945z;
                    this.f50942w = 1;
                    obj = mRRequest.getViewHistories(Referer.MY_PAGE, str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r0.this.G.a(new j0.d((ViewHistoriesResponse) obj));
            } catch (Throwable th2) {
                r0.this.G.a(new j0.p0(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageActionCreator$purchaseHoliday$1", f = "MyPageActionCreator.kt", l = {401}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50946w;

        public j(ao.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50946w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = r0.this.f50917y;
                    this.f50946w = 1;
                    obj = mRRequest.postPurchaseContinuousLiveHoliday(this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                PurchaseContinuousLiveHolidayResponse purchaseContinuousLiveHolidayResponse = (PurchaseContinuousLiveHolidayResponse) obj;
                r0.this.G.a(new s.j(new jf.f(purchaseContinuousLiveHolidayResponse.getRemainingFreeCoins(), purchaseContinuousLiveHolidayResponse.getRemainingPaidCoins())));
                r0.this.G.a(new j0.C0717j0(purchaseContinuousLiveHolidayResponse.getContinuousLiveHolidayNum()));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageActionCreator$reloadAutoTweetSettings$1", f = "MyPageActionCreator.kt", l = {119}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50948w;

        public k(ao.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50948w;
            boolean z10 = true;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    if (r0.this.A.p()) {
                        MRRequest mRRequest = r0.this.f50917y;
                        this.f50948w = 1;
                        obj = mRRequest.getUserBroadcastSettings(Referer.MY_PAGE, this);
                        if (obj == c10) {
                            return c10;
                        }
                    } else {
                        return wn.v.f59242a;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                BroadcastSettings broadcastSettings = (BroadcastSettings) obj;
                r0.this.D.W2(broadcastSettings.getTwitterAutopost() == 1);
                kf.t tVar = r0.this.D;
                if (broadcastSettings.getTwitterAutopostLiveAnnouncement() != 1) {
                    z10 = false;
                }
                tVar.z0(z10);
                r0.this.G.a(new f0.c(broadcastSettings));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageActionCreator$reloadChatThreads$1", f = "MyPageActionCreator.kt", l = {295}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50950w;

        public l(ao.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new l(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50950w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = r0.this.f50917y;
                    this.f50950w = 1;
                    obj = mRRequest.getChatThreads(Referer.MY_PAGE, null, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r0.this.G.a(new j0.p((ChatThreadList) obj));
            } catch (Throwable th2) {
                r0.this.G.a(new j0.f(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageActionCreator$reloadEventBanners$1", f = "MyPageActionCreator.kt", l = {170}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50952w;

        public m(ao.d<? super m> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new m(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50952w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = r0.this.f50917y;
                    this.f50952w = 1;
                    obj = MRRequest.DefaultImpls.getEventNotice$default(mRRequest, 4, null, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r0.this.G.a(new j0.m(((EventNoticeResponse) obj).getBanners()));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageActionCreator$reloadLiveHistories$1", f = "MyPageActionCreator.kt", l = {182}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50954w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f50956y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, ao.d<? super n> dVar) {
            super(2, dVar);
            this.f50956y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new n(this.f50956y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((n) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50954w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = r0.this.f50917y;
                    String str = this.f50956y;
                    this.f50954w = 1;
                    obj = MRRequest.DefaultImpls.getLiveHistories$default(mRRequest, Referer.MY_PAGE, str, null, this, 4, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                LiveHistoriesResponse liveHistoriesResponse = (LiveHistoriesResponse) obj;
                r0.this.G.a(new j0.q(liveHistoriesResponse));
                r0.this.G.a(new j0.h0(liveHistoriesResponse.getLivesNum()));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageActionCreator$reloadMeData$1", f = "MyPageActionCreator.kt", l = {72}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50957w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f50959y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f50960z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(int i10, int i11, ao.d<? super o> dVar) {
            super(2, dVar);
            this.f50959y = i10;
            this.f50960z = i11;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new o(this.f50959y, this.f50960z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((o) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            q8.a aVar;
            Object c10 = bo.c.c();
            int i10 = this.f50957w;
            boolean z10 = true;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    hf.a0 a0Var = r0.this.H;
                    this.f50957w = 1;
                    obj = a0.a.a(a0Var, Referer.MY_PAGE, false, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                UserMe userMe = (UserMe) obj;
                r0.this.G.a(new j0.e0(userMe));
                r0.this.G.a(new s.k(userMe.getUserAvatarPartsNum() > r0.this.E.s() && r0.this.A.h()));
                r0.this.G.a(new s.r(userMe.getFollowingNum()));
                if (userMe.getShouldShowDemographicForm() && this.f50959y > this.f50960z) {
                    r0.this.G.a(j0.n0.f47018a);
                }
                r0.this.B.t(userMe.getCapabilities());
                r0.this.A.v(userMe);
                aVar = r0.this.G;
            } catch (Throwable unused) {
            }
            if (r0.this.C.I() == 1 && r0.this.C.x5() == 1) {
                of.d dVar = of.d.f45388a;
                if (!dVar.d() && !dVar.c()) {
                    aVar.a(new j0.l(z10, r0.this.A.h()));
                    return wn.v.f59242a;
                }
            }
            z10 = false;
            aVar.a(new j0.l(z10, r0.this.A.h()));
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageActionCreator$reloadViewHistories$1", f = "MyPageActionCreator.kt", l = {209}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50961w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f50963y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, ao.d<? super p> dVar) {
            super(2, dVar);
            this.f50963y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new p(this.f50963y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((p) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50961w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = r0.this.f50917y;
                    String str = this.f50963y;
                    this.f50961w = 1;
                    obj = MRRequest.DefaultImpls.getViewHistories$default(mRRequest, Referer.MY_PAGE, str, null, this, 4, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r0.this.G.a(new j0.m0((ViewHistoriesResponse) obj));
            } catch (Throwable th2) {
                r0.this.G.a(new j0.p0(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageActionCreator$startLiveDownloadRequest$1", f = "MyPageActionCreator.kt", l = {345}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class q extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50964w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ LiveBasicParams f50966y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(LiveBasicParams liveBasicParams, ao.d<? super q> dVar) {
            super(2, dVar);
            this.f50966y = liveBasicParams;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new q(this.f50966y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((q) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50964w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = r0.this.f50917y;
                    String liveId = this.f50966y.getLiveId();
                    this.f50964w = 1;
                    if (mRRequest.postLiveRequestArchiveDownload(Referer.MY_PAGE, liveId, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                this.f50966y.setArchiveDownloadStatus(2);
                r0.this.G.a(new j0.b0(this.f50966y));
                r0.this.G.a(j0.u.f47029a);
            } catch (Throwable th2) {
                r0.this.G.a(new j0.t(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageActionCreator$unfollowUser$1", f = "MyPageActionCreator.kt", l = {249}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class r extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50967w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f50969y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f50970z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, String str2, ao.d<? super r> dVar) {
            super(2, dVar);
            this.f50969y = str;
            this.f50970z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new r(this.f50969y, this.f50970z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((r) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50967w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = r0.this.f50917y;
                    String str = this.f50969y;
                    String str2 = this.f50970z;
                    this.f50967w = 1;
                    if (mRRequest.postGraphUnfollow(str, str2, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r0.this.G.a(new i1.g0(this.f50970z));
                r0.this.G.a(s.u.f47251a);
            } catch (Throwable th2) {
                r0.this.G.a(new i1.n(this.f50970z, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageActionCreator$updateArchiveHidden$1", f = "MyPageActionCreator.kt", l = {333}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class s extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50971w;

        /* renamed from: x  reason: collision with root package name */
        public int f50972x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ LiveBasicParams f50973y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ r0 f50974z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(LiveBasicParams liveBasicParams, r0 r0Var, ao.d<? super s> dVar) {
            super(2, dVar);
            this.f50973y = liveBasicParams;
            this.f50974z = r0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new s(this.f50973y, this.f50974z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((s) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r5.f50972x
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                int r0 = r5.f50971w
                wn.m.b(r6)     // Catch: java.lang.Throwable -> L62
                goto L48
            L11:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L19:
                wn.m.b(r6)
                com.dena.mirrorman.net.api.response.live.LiveBasicParams r6 = r5.f50973y     // Catch: java.lang.Throwable -> L62
                java.lang.Integer r6 = r6.getArchiveHidden()     // Catch: java.lang.Throwable -> L62
                if (r6 != 0) goto L25
                goto L2d
            L25:
                int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L62
                if (r6 != 0) goto L2d
                r6 = r2
                goto L2e
            L2d:
                r6 = 0
            L2e:
                rc.r0 r1 = r5.f50974z     // Catch: java.lang.Throwable -> L62
                com.dena.mirrorman.net.retrofit.MRRequest r1 = rc.r0.k(r1)     // Catch: java.lang.Throwable -> L62
                java.lang.String r3 = "my_page"
                com.dena.mirrorman.net.api.response.live.LiveBasicParams r4 = r5.f50973y     // Catch: java.lang.Throwable -> L62
                java.lang.String r4 = r4.getLiveId()     // Catch: java.lang.Throwable -> L62
                r5.f50971w = r6     // Catch: java.lang.Throwable -> L62
                r5.f50972x = r2     // Catch: java.lang.Throwable -> L62
                java.lang.Object r1 = r1.postLiveUpdateArchiveSettings(r3, r4, r6, r5)     // Catch: java.lang.Throwable -> L62
                if (r1 != r0) goto L47
                return r0
            L47:
                r0 = r6
            L48:
                com.dena.mirrorman.net.api.response.live.LiveBasicParams r6 = r5.f50973y     // Catch: java.lang.Throwable -> L62
                java.lang.Integer r0 = co.b.d(r0)     // Catch: java.lang.Throwable -> L62
                r6.setArchiveHidden(r0)     // Catch: java.lang.Throwable -> L62
                rc.r0 r6 = r5.f50974z     // Catch: java.lang.Throwable -> L62
                q8.a r6 = rc.r0.g(r6)     // Catch: java.lang.Throwable -> L62
                pd.j0$b0 r0 = new pd.j0$b0     // Catch: java.lang.Throwable -> L62
                com.dena.mirrorman.net.api.response.live.LiveBasicParams r1 = r5.f50973y     // Catch: java.lang.Throwable -> L62
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L62
                r6.a(r0)     // Catch: java.lang.Throwable -> L62
                goto L79
            L62:
                r6 = move-exception
                rc.r0 r0 = r5.f50974z
                q8.a r0 = rc.r0.g(r0)
                pd.j0$d0 r1 = new pd.j0$d0
                com.dena.mirrativ.mirrativapi.core.MRException r6 = com.dena.mirrativ.mirrativapi.core.MRErrorKt.convertMRException(r6)
                com.dena.mirrativ.mirrativapi.core.MRError r6 = r6.getError()
                r1.<init>(r6)
                r0.a(r1)
            L79:
                wn.v r6 = wn.v.f59242a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: rc.r0.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageActionCreator$updateMeData$1", f = "MyPageActionCreator.kt", l = {105}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class t extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50975w;

        public t(ao.d<? super t> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new t(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((t) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50975w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    hf.a0 a0Var = r0.this.H;
                    this.f50975w = 1;
                    obj = a0Var.a(Referer.MY_PAGE, true, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r0.this.G.a(new j0.e0((UserMe) obj));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageActionCreator$updatePossessedCurrency$1", f = "MyPageActionCreator.kt", l = {380}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class u extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50977w;

        public u(ao.d<? super u> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new u(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((u) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50977w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = r0.this.f50917y;
                    this.f50977w = 1;
                    obj = mRRequest.getUserCurrency(this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                UserCurrencyResponse userCurrencyResponse = (UserCurrencyResponse) obj;
                r0.this.G.a(new s.j(new jf.f(userCurrencyResponse.getRemainingFreeCoins(), userCurrencyResponse.getRemainingPaidCoins())));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    public r0(MRRequest mRRequest, Context context, hf.v0 v0Var, hf.r rVar, kf.i iVar, kf.t tVar, kf.x xVar, kf.v vVar, q8.a aVar, hf.a0 a0Var, nd.i1 i1Var) {
        uo.b0 b10;
        jo.p.h(mRRequest, "request");
        jo.p.h(context, "applicationContext");
        jo.p.h(v0Var, "userHelper");
        jo.p.h(rVar, "featureHelper");
        jo.p.h(iVar, "featurePreference");
        jo.p.h(tVar, "settingPreference");
        jo.p.h(xVar, "userPreference");
        jo.p.h(vVar, "tutorialPreference");
        jo.p.h(aVar, "dispatcher");
        jo.p.h(a0Var, "getUserMeRepository");
        jo.p.h(i1Var, "sharedApplicationModel");
        this.f50917y = mRRequest;
        this.f50918z = context;
        this.A = v0Var;
        this.B = rVar;
        this.C = iVar;
        this.D = tVar;
        this.E = xVar;
        this.F = vVar;
        this.G = aVar;
        this.H = a0Var;
        this.I = i1Var;
        uo.k0 b11 = uo.g1.b();
        b10 = i2.b(null, 1, null);
        this.J = b11.plus(b10);
    }

    public final void A(ChatStatus chatStatus) {
        jo.p.h(chatStatus, "chatStatus");
        this.G.a(new j0.o0(chatStatus));
    }

    public final void B() {
        uo.l.d(this, null, null, new j(null), 3, null);
    }

    public final void C(String str, String str2) {
        if (str != null) {
            this.G.a(new j0.l0(str));
        } else if (str2 != null) {
            this.G.a(new j0.k0(str2));
        }
    }

    public final void D() {
        uo.l.d(this, null, null, new k(null), 3, null);
    }

    public final void E() {
        this.G.a(j0.h.f47005a);
        uo.l.d(this, null, null, new l(null), 3, null);
    }

    public final void F() {
        uo.l.d(this, null, null, new m(null), 3, null);
    }

    public final void G(String str) {
        jo.p.h(str, "userId");
        this.G.a(j0.y.f47033a);
        uo.l.d(this, null, null, new n(str, null), 3, null);
    }

    public final void H(int i10, int i11) {
        this.G.a(new j0.i0(this.A.x()));
        if (!this.A.l()) {
            this.G.a(new j0.o(false));
            return;
        }
        this.G.a(j0.f0.f47002a);
        this.G.a(new j0.o(true));
        uo.l.d(this, null, null, new o(i10, i11, null), 3, null);
    }

    public final void I(String str) {
        jo.p.h(str, "userId");
        this.G.a(j0.r0.f47026a);
        uo.l.d(this, null, null, new p(str, null), 3, null);
    }

    public final void J(LiveBasicParams liveBasicParams) {
        jo.p.h(liveBasicParams, MRLog.TARGET_TYPE_LIVE);
        uo.l.d(this, null, null, new q(liveBasicParams, null), 3, null);
    }

    public final void K(String str, String str2) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "referer");
        uo.l.d(this, null, null, new r(str2, str, null), 3, null);
    }

    public final void L(LiveBasicParams liveBasicParams) {
        jo.p.h(liveBasicParams, MRLog.TARGET_TYPE_LIVE);
        uo.l.d(this, null, null, new s(liveBasicParams, this, null), 3, null);
    }

    public final void M(jf.f fVar) {
        jo.p.h(fVar, "coin");
        this.G.a(new s.j(fVar));
    }

    public final void N() {
        uo.l.d(this, null, null, new t(null), 3, null);
    }

    public final void O(int i10) {
        this.G.a(new j0.g0(i10));
    }

    public final void P() {
        uo.l.d(this, null, null, new u(null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.J;
    }

    public final void o() {
        boolean z10 = true;
        this.G.a(new j0.c0((this.F.N3() == 0 && this.F.r0() % 5 == 1) ? false : false));
    }

    public final void p() {
        this.G.a(new j0.i(!this.I.a().d()));
    }

    public final void q(String str) {
        jo.p.h(str, "liveId");
        uo.l.d(this, null, null, new b(str, null), 3, null);
    }

    public final void r() {
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    public final void s(String str, String str2) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "referer");
        uo.l.d(this, null, null, new d(str2, str, null), 3, null);
    }

    public final void t() {
        this.G.a(j0.q0.f47024a);
    }

    public final void u(String str, String str2) {
        if (str != null) {
            this.G.a(new j0.s(str));
        } else if (str2 != null) {
            this.G.a(new j0.r(str2));
        }
    }

    public final void v(Bitmap bitmap, int i10, int i11) {
        jo.p.h(bitmap, "backgroundImage");
        uo.l.d(this, null, null, new e(bitmap, i11, i10, null), 3, null);
    }

    public final void w(String str) {
        jo.p.h(str, "liveId");
        uo.l.d(this, null, null, new f(str, null), 3, null);
    }

    public final void x(int i10) {
        this.G.a(j0.g.f47003a);
        uo.l.d(this, null, null, new g(i10, null), 3, null);
    }

    public final void y(String str, int i10) {
        jo.p.h(str, "userId");
        this.G.a(j0.x.f47032a);
        uo.l.d(this, null, null, new h(str, i10, null), 3, null);
    }

    public final void z(String str, String str2) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "nextCursor");
        this.G.a(j0.r0.f47026a);
        uo.l.d(this, null, null, new i(str, str2, null), 3, null);
    }
}
