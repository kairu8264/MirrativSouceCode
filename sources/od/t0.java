package od;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingStatusResponse;
import com.dena.mirrativ.mirrativapi.user.UserApi;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.Graph;
import com.dena.mirrorman.net.api.response.live.LiveHistoriesResponse;
import com.dena.mirrorman.net.api.response.live.SeasonYellStatusResponse;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import hf.v0;
import nd.w0;
import pd.i1;
import pd.s;
import uo.b1;
import uo.d2;
import uo.g1;

/* loaded from: classes2.dex */
public final class t0 extends androidx.lifecycle.q0 implements uo.q0 {
    public static final a J = new a(null);
    public static final int K = 8;
    public final MRRequest A;
    public final Context B;
    public final kf.x C;
    public final q8.a D;
    public final v0 E;
    public final hf.w F;
    public final UserApi G;
    public final /* synthetic */ uo.q0 H;
    public d2 I;

    /* renamed from: y  reason: collision with root package name */
    public final String f45251y;

    /* renamed from: z  reason: collision with root package name */
    public final String f45252z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UserProfileActionCreator$block$1", f = "UserProfileActionCreator.kt", l = {207}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45253w;

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
            int i10 = this.f45253w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = t0.this.A;
                    String str = t0.this.f45252z;
                    String str2 = t0.this.f45251y;
                    this.f45253w = 1;
                    if (mRRequest.postBlock(str, str2, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                t0.this.D.a(new i1.c0(t0.this.f45251y, true));
            } catch (Throwable th2) {
                t0.this.D.a(new i1.j(t0.this.f45251y, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UserProfileActionCreator$fetchSeasonRatingStatus$1", f = "UserProfileActionCreator.kt", l = {287}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45255w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45257y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45258z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f45257y = str;
            this.f45258z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f45257y, this.f45258z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45255w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    UserApi userApi = t0.this.G;
                    String str = this.f45257y;
                    String str2 = this.f45258z;
                    this.f45255w = 1;
                    obj = userApi.getSeasonRatingStatus(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                SeasonRatingStatusResponse seasonRatingStatusResponse = (SeasonRatingStatusResponse) obj;
                if (seasonRatingStatusResponse.getStatus().isSuccess()) {
                    t0.this.D.a(new i1.l(this.f45258z, seasonRatingStatusResponse));
                }
            } catch (Throwable th2) {
                g9.a.c(th2);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UserProfileActionCreator$fetchSeasonYellStatus$1", f = "UserProfileActionCreator.kt", l = {300}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ String B;
        public final /* synthetic */ String C;
        public final /* synthetic */ boolean D;

        /* renamed from: w  reason: collision with root package name */
        public int f45259w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45261y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45262z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3, String str4, String str5, boolean z10, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f45261y = str;
            this.f45262z = str2;
            this.A = str3;
            this.B = str4;
            this.C = str5;
            this.D = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f45261y, this.f45262z, this.A, this.B, this.C, this.D, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45259w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = t0.this.A;
                    String str = this.f45261y;
                    String str2 = this.f45262z;
                    String str3 = this.A;
                    String str4 = this.B;
                    this.f45259w = 1;
                    obj = mRRequest.getSeasonYellStatus(str, str2, str3, str4, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                t0.this.D.a(new i1.m(this.A, (SeasonYellStatusResponse) obj, this.C, this.D));
            } catch (Throwable th2) {
                g9.a.c(th2);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UserProfileActionCreator$follow$1", f = "UserProfileActionCreator.kt", l = {183}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45263w;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45263w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = t0.this.A;
                    String str = t0.this.f45252z;
                    String str2 = t0.this.f45251y;
                    this.f45263w = 1;
                    obj = mRRequest.postGraphFollow(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                t0.this.D.a(new i1.o(t0.this.f45251y, (Graph.Follow) obj));
                t0.this.D.a(new s.C0720s(t0.this.f45251y));
            } catch (Throwable th2) {
                t0.this.D.a(new i1.n(t0.this.f45251y, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UserProfileActionCreator$kick$1", f = "UserProfileActionCreator.kt", l = {229}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45265w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45267y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f45267y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f45267y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45265w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = t0.this.A;
                    String str = t0.this.f45252z;
                    String str2 = this.f45267y;
                    String str3 = t0.this.f45251y;
                    this.f45265w = 1;
                    if (mRRequest.postLiveKickOut(str, str2, str3, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                t0.this.D.a(new i1.r(t0.this.f45251y));
            } catch (Throwable th2) {
                t0.this.D.a(new i1.q(t0.this.f45251y, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UserProfileActionCreator$loadImages$1", f = "UserProfileActionCreator.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45268w;

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f45268w == 0) {
                wn.m.b(obj);
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawColor(c3.a.d(t0.this.B, w0.f42229d));
                t0.this.D.a(new i1.a(t0.this.f45251y, createBitmap));
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UserProfileActionCreator$loadImages$2", f = "UserProfileActionCreator.kt", l = {92, 102}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ int B;
        public final /* synthetic */ int C;

        /* renamed from: w  reason: collision with root package name */
        public Object f45270w;

        /* renamed from: x  reason: collision with root package name */
        public int f45271x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45272y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ t0 f45273z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, t0 t0Var, String str2, int i10, int i11, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f45272y = str;
            this.f45273z = t0Var;
            this.A = str2;
            this.B = i10;
            this.C = i11;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f45272y, this.f45273z, this.A, this.B, this.C, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0063 A[Catch: all -> 0x0113, TryCatch #0 {all -> 0x0113, blocks: (B:7:0x0013, B:33:0x0089, B:34:0x008e, B:11:0x0020, B:23:0x0056, B:24:0x0058, B:28:0x0063, B:29:0x0074, B:14:0x0027, B:19:0x0034, B:20:0x0045), top: B:38:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[Catch: all -> 0x0113, TryCatch #0 {all -> 0x0113, blocks: (B:7:0x0013, B:33:0x0089, B:34:0x008e, B:11:0x0020, B:23:0x0056, B:24:0x0058, B:28:0x0063, B:29:0x0074, B:14:0x0027, B:19:0x0034, B:20:0x0045), top: B:38:0x0009 }] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 278
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: od.t0.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UserProfileActionCreator$loadNextApps$1", f = "UserProfileActionCreator.kt", l = {166}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45274w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45276y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f45276y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f45276y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45274w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    t0.this.D.a(new i1.d(t0.this.f45251y));
                    MRRequest mRRequest = t0.this.A;
                    String str = t0.this.f45251y;
                    String str2 = this.f45276y;
                    this.f45274w = 1;
                    obj = mRRequest.getAppUserApps(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                t0.this.D.a(new i1.e(t0.this.f45251y, (App.Apps) obj));
            } catch (Throwable th2) {
                t0.this.D.a(new i1.c(t0.this.f45251y, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UserProfileActionCreator$loadNextLiveHistories$1", f = "UserProfileActionCreator.kt", l = {253}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public int f45277w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45279y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45280z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2, int i10, ao.d<? super j> dVar) {
            super(2, dVar);
            this.f45279y = str;
            this.f45280z = str2;
            this.A = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(this.f45279y, this.f45280z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45277w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = t0.this.A;
                    String str = this.f45279y;
                    String str2 = this.f45280z;
                    Integer d10 = co.b.d(this.A);
                    this.f45277w = 1;
                    obj = mRRequest.getLiveHistories(str, str2, d10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                t0.this.D.a(new i1.s(this.f45280z, (LiveHistoriesResponse) obj));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UserProfileActionCreator$reloadApps$1", f = "UserProfileActionCreator.kt", l = {154}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45281w;

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
            int i10 = this.f45281w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    t0.this.D.a(new i1.f(t0.this.f45251y));
                    MRRequest mRRequest = t0.this.A;
                    String str = t0.this.f45251y;
                    this.f45281w = 1;
                    obj = mRRequest.getAppUserApps(str, null, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                t0.this.D.a(new i1.g(t0.this.f45251y, (App.Apps) obj));
            } catch (Throwable th2) {
                t0.this.D.a(new i1.c(t0.this.f45251y, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UserProfileActionCreator$reloadData$2", f = "UserProfileActionCreator.kt", l = {55}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45283w;

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
            int i10 = this.f45283w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = t0.this.A;
                    String str = t0.this.f45252z;
                    String str2 = t0.this.f45251y;
                    this.f45283w = 1;
                    obj = mRRequest.getUserProfile(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                t0.this.D.a(new i1.k(t0.this.f45251y, (UserProfile) obj));
            } catch (Throwable th2) {
                t0.this.D.a(new i1.p(t0.this.f45251y, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UserProfileActionCreator$reloadLiveHistories$1", f = "UserProfileActionCreator.kt", l = {241}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45285w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45287y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45288z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, String str2, ao.d<? super m> dVar) {
            super(2, dVar);
            this.f45287y = str;
            this.f45288z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new m(this.f45287y, this.f45288z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45285w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = t0.this.A;
                    String str = this.f45287y;
                    String str2 = this.f45288z;
                    this.f45285w = 1;
                    obj = MRRequest.DefaultImpls.getLiveHistories$default(mRRequest, str, str2, null, this, 4, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                LiveHistoriesResponse liveHistoriesResponse = (LiveHistoriesResponse) obj;
                t0.this.D.a(new i1.s(this.f45288z, liveHistoriesResponse));
                t0.this.D.a(new i1.w(this.f45288z, liveHistoriesResponse.getLivesNum()));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UserProfileActionCreator$sendLiveRequest$1", f = "UserProfileActionCreator.kt", l = {274, 279}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ long A;

        /* renamed from: w  reason: collision with root package name */
        public int f45289w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45291y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45292z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, String str2, long j10, ao.d<? super n> dVar) {
            super(2, dVar);
            this.f45291y = str;
            this.f45292z = str2;
            this.A = j10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new n(this.f45291y, this.f45292z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((n) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45289w;
            try {
            } catch (Throwable unused) {
                t0.this.D.a(new i1.b(this.f45292z, this.A));
            }
            if (i10 == 0) {
                wn.m.b(obj);
                g9.a.g("Start Send Requests");
                MRRequest mRRequest = t0.this.A;
                String str = this.f45291y;
                String str2 = this.f45292z;
                long j10 = this.A;
                this.f45289w = 1;
                if (mRRequest.postLiveRequest(str, str2, j10, Referer.PROFILE, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    wn.m.b(obj);
                    t0.this.I = null;
                    return wn.v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            g9.a.g("LiveRequest: " + this.A);
            this.f45289w = 2;
            if (b1.a(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS, this) == c10) {
                return c10;
            }
            t0.this.I = null;
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UserProfileActionCreator$unblock$1", f = "UserProfileActionCreator.kt", l = {218}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45293w;

        public o(ao.d<? super o> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new o(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((o) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45293w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = t0.this.A;
                    String str = t0.this.f45252z;
                    String str2 = t0.this.f45251y;
                    this.f45293w = 1;
                    if (mRRequest.postUnblock(str, str2, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                t0.this.D.a(new i1.c0(t0.this.f45251y, false));
            } catch (Throwable th2) {
                t0.this.D.a(new i1.j(t0.this.f45251y, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UserProfileActionCreator$unfollow$1", f = "UserProfileActionCreator.kt", l = {195}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45295w;

        public p(ao.d<? super p> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new p(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((p) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45295w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = t0.this.A;
                    String str = t0.this.f45252z;
                    String str2 = t0.this.f45251y;
                    this.f45295w = 1;
                    if (mRRequest.postGraphUnfollow(str, str2, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                t0.this.D.a(new i1.g0(t0.this.f45251y));
                t0.this.D.a(s.u.f47251a);
            } catch (Throwable th2) {
                t0.this.D.a(new i1.n(t0.this.f45251y, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public t0(String str, String str2, MRRequest mRRequest, Context context, kf.x xVar, q8.a aVar, v0 v0Var, hf.w wVar, UserApi userApi) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "referer");
        jo.p.h(mRRequest, "request");
        jo.p.h(context, "applicationContext");
        jo.p.h(xVar, "userPreference");
        jo.p.h(aVar, "dispatcher");
        jo.p.h(v0Var, "userHelper");
        jo.p.h(wVar, "getImageFromRemoteStorage");
        jo.p.h(userApi, "userApi");
        this.f45251y = str;
        this.f45252z = str2;
        this.A = mRRequest;
        this.B = context;
        this.C = xVar;
        this.D = aVar;
        this.E = v0Var;
        this.F = wVar;
        this.G = userApi;
        this.H = uo.r0.b();
    }

    public static /* synthetic */ void q(t0 t0Var, String str, String str2, String str3, String str4, boolean z10, String str5, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            str5 = null;
        }
        t0Var.p(str, str2, str3, str4, z10, str5);
    }

    public final void A() {
        uo.l.d(this, null, null, new o(null), 3, null);
    }

    public final void B() {
        uo.l.d(this, null, null, new p(null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.H.getCoroutineContext();
    }

    public final void n() {
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    public final void o(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "userId");
        uo.l.d(this, null, null, new c(str, str2, null), 3, null);
    }

    public final void p(String str, String str2, String str3, String str4, boolean z10, String str5) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "liveId");
        jo.p.h(str4, "liveOwnerName");
        uo.l.d(this, null, null, new d(str, str3, str2, str5, str4, z10, null), 3, null);
    }

    public final void r() {
        if (this.E.l()) {
            uo.l.d(this, null, null, new e(null), 3, null);
        } else {
            this.D.a(new i1.v(this.f45251y));
        }
    }

    public final void s(String str) {
        jo.p.h(str, "liveId");
        uo.l.d(this, null, null, new f(str, null), 3, null);
    }

    public final void t(String str, String str2, String str3, int i10, int i11) {
        jo.p.h(str, "profileImageUrl");
        jo.p.h(str2, "backgroundImageUrl");
        jo.p.h(str3, "avatarImageUrl");
        uo.l.d(this, null, null, new g(null), 3, null);
        uo.l.d(this, null, null, new h(str, this, str2, i11, i10, null), 3, null);
    }

    public final void u(String str) {
        jo.p.h(str, "nextCursor");
        uo.l.d(this, null, null, new i(str, null), 3, null);
    }

    public final void v(String str, String str2, int i10) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "referer");
        this.D.a(new i1.t(str));
        uo.l.d(this, null, null, new j(str2, str, i10, null), 3, null);
    }

    public final void w() {
        uo.l.d(this, null, null, new k(null), 3, null);
    }

    public final void x() {
        String T4 = this.C.T4();
        if (T4.length() > 0) {
            this.D.a(new i1.x(this.f45251y, T4));
        }
        uo.l.d(this, null, null, new l(null), 3, null);
    }

    public final void y(String str, String str2) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "referer");
        this.D.a(new i1.u(str));
        uo.l.d(this, null, null, new m(str2, str, null), 3, null);
    }

    public final void z(String str, String str2, long j10, long j11) {
        d2 d10;
        jo.p.h(str, "referer");
        jo.p.h(str2, "userId");
        this.D.a(new i1.d0(str2, j11));
        if (j10 == 0) {
            return;
        }
        if (this.I != null) {
            this.D.a(new i1.f0(str2, j10));
            return;
        }
        this.D.a(new i1.f0(str2, 0L));
        d10 = uo.l.d(uo.r0.a(g1.c()), null, null, new n(str, str2, j10, null), 3, null);
        this.I = d10;
    }
}
