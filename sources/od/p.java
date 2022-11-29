package od;

import android.annotation.SuppressLint;
import android.content.Context;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.ToolTipStartLiveButtonResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import hf.v0;
import hf.w0;
import kotlin.NoWhenBranchMatchedException;
import pd.s;
import ri.d;
import uo.g1;
import uo.i2;

/* loaded from: classes2.dex */
public final class p implements uo.q0 {
    public final Context A;
    public final MRLogger B;
    public final w0 C;
    public final kf.p D;
    public uo.b0 E;
    public final ao.g F;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f45116w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f45117x;

    /* renamed from: y  reason: collision with root package name */
    public final hf.h0 f45118y;

    /* renamed from: z  reason: collision with root package name */
    public final v0 f45119z;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f45120a;

        static {
            int[] iArr = new int[jf.i0.values().length];
            iArr[jf.i0.HOME_CATALOG.ordinal()] = 1;
            iArr[jf.i0.FOLLOW_CATALOG.ordinal()] = 2;
            iArr[jf.i0.NOTICE.ordinal()] = 3;
            iArr[jf.i0.MY_PAGE.ordinal()] = 4;
            iArr[jf.i0.LIVE_GAME.ordinal()] = 5;
            iArr[jf.i0.PUSH_NOTIFICATION.ordinal()] = 6;
            f45120a = iArr;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.GlobalActionCreator$loadNextApps$1", f = "GlobalActionCreator.kt", l = {57}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45121w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45123y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f45123y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f45123y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45121w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    p.this.f45116w.a(s.f.f47235a);
                    MRRequest mRRequest = p.this.f45117x;
                    String x10 = p.this.f45119z.x();
                    String str = this.f45123y;
                    this.f45121w = 1;
                    obj = mRRequest.getAppUserApps(x10, str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                p.this.f45116w.a(new s.e((App.Apps) obj));
            } catch (Throwable th2) {
                p.this.f45116w.a(new s.d(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.GlobalActionCreator$registerSafetyNet$4$1", f = "GlobalActionCreator.kt", l = {207}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45124w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ d.a f45126y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d.a aVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f45126y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f45126y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45124w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = p.this.f45117x;
                    ApiUtil apiUtil = ApiUtil.INSTANCE;
                    String c11 = this.f45126y.c();
                    if (c11 == null) {
                        c11 = "";
                    }
                    ep.c0 signatureJwtRequestBody = apiUtil.signatureJwtRequestBody(c11);
                    this.f45124w = 1;
                    if (mRRequest.postFeatureRegisterSignatureJwt(Referer.HOME, signatureJwtRequestBody, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                g9.a.g("Safetynet called success " + this.f45126y.c());
                p.this.C.clear();
            } catch (Throwable th2) {
                g9.a.c(th2);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.GlobalActionCreator$reloadApps$1", f = "GlobalActionCreator.kt", l = {45}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45127w;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45127w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    p.this.f45116w.a(s.g.f47237a);
                    MRRequest mRRequest = p.this.f45117x;
                    String x10 = p.this.f45119z.x();
                    this.f45127w = 1;
                    obj = mRRequest.getAppUserApps(x10, null, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                p.this.f45116w.a(new s.e((App.Apps) obj));
            } catch (Throwable th2) {
                p.this.f45116w.a(new s.d(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.GlobalActionCreator$reloadToolTipStatus$1", f = "GlobalActionCreator.kt", l = {161}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45129w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45131y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f45131y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f45131y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45129w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = p.this.f45117x;
                    String str = this.f45131y;
                    this.f45129w = 1;
                    obj = mRRequest.getToolTipStartLiveButton(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                p.this.f45116w.a(new s.c0((ToolTipStartLiveButtonResponse) obj));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.GlobalActionCreator$sendNotificationPostSetting$1", f = "GlobalActionCreator.kt", l = {147}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45132w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45134y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f45134y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f45134y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45132w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = p.this.f45117x;
                    String str = this.f45134y;
                    this.f45132w = 1;
                    if (mRRequest.notificationPostSettingsRequest(str, 1, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
            } catch (Exception e10) {
                g9.a.c(e10);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.GlobalActionCreator$updateHasNotificationState$1", f = "GlobalActionCreator.kt", l = {100, 111}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45135w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45137y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f45137y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f45137y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r6.f45135w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                wn.m.b(r7)     // Catch: java.lang.Exception -> L13
                goto L93
            L13:
                r7 = move-exception
                goto Lb6
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                wn.m.b(r7)     // Catch: java.lang.Exception -> L22
                goto L38
            L22:
                r7 = move-exception
                goto L71
            L24:
                wn.m.b(r7)
                od.p r7 = od.p.this     // Catch: java.lang.Exception -> L22
                hf.h0 r7 = od.p.d(r7)     // Catch: java.lang.Exception -> L22
                java.lang.String r1 = r6.f45137y     // Catch: java.lang.Exception -> L22
                r6.f45135w = r3     // Catch: java.lang.Exception -> L22
                java.lang.Object r7 = r7.g(r1, r6)     // Catch: java.lang.Exception -> L22
                if (r7 != r0) goto L38
                return r0
            L38:
                jf.e0 r7 = (jf.e0) r7     // Catch: java.lang.Exception -> L22
                od.p r1 = od.p.this     // Catch: java.lang.Exception -> L22
                q8.a r1 = od.p.c(r1)     // Catch: java.lang.Exception -> L22
                pd.s$x r4 = new pd.s$x     // Catch: java.lang.Exception -> L22
                boolean r5 = r7.g()     // Catch: java.lang.Exception -> L22
                r4.<init>(r5)     // Catch: java.lang.Exception -> L22
                r1.a(r4)     // Catch: java.lang.Exception -> L22
                od.p r1 = od.p.this     // Catch: java.lang.Exception -> L22
                q8.a r1 = od.p.c(r1)     // Catch: java.lang.Exception -> L22
                pd.s$t r4 = new pd.s$t     // Catch: java.lang.Exception -> L22
                boolean r5 = r7.c()     // Catch: java.lang.Exception -> L22
                r4.<init>(r5)     // Catch: java.lang.Exception -> L22
                r1.a(r4)     // Catch: java.lang.Exception -> L22
                od.p r1 = od.p.this     // Catch: java.lang.Exception -> L22
                q8.a r1 = od.p.c(r1)     // Catch: java.lang.Exception -> L22
                pd.s$l r4 = new pd.s$l     // Catch: java.lang.Exception -> L22
                boolean r7 = r7.e()     // Catch: java.lang.Exception -> L22
                r4.<init>(r7)     // Catch: java.lang.Exception -> L22
                r1.a(r4)     // Catch: java.lang.Exception -> L22
                goto L74
            L71:
                g9.a.c(r7)
            L74:
                od.p r7 = od.p.this     // Catch: java.lang.Exception -> L13
                kf.p r7 = od.p.e(r7)     // Catch: java.lang.Exception -> L13
                long r4 = r7.d3()     // Catch: java.lang.Exception -> L13
                od.p r7 = od.p.this     // Catch: java.lang.Exception -> L13
                com.dena.mirrorman.net.retrofit.MRRequest r7 = od.p.f(r7)     // Catch: java.lang.Exception -> L13
                java.lang.String r1 = r6.f45137y     // Catch: java.lang.Exception -> L13
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L13
                r6.f45135w = r2     // Catch: java.lang.Exception -> L13
                java.lang.Object r7 = r7.getLiveGameNewCounts(r1, r4, r6)     // Catch: java.lang.Exception -> L13
                if (r7 != r0) goto L93
                return r0
            L93:
                com.dena.mirrorman.net.api.response.livegame.NewCountsResponse r7 = (com.dena.mirrorman.net.api.response.livegame.NewCountsResponse) r7     // Catch: java.lang.Exception -> L13
                od.p r0 = od.p.this     // Catch: java.lang.Exception -> L13
                q8.a r0 = od.p.c(r0)     // Catch: java.lang.Exception -> L13
                pd.s$n r1 = new pd.s$n     // Catch: java.lang.Exception -> L13
                com.dena.mirrorman.net.api.response.LiveGameListCounts r7 = r7.getCounts()     // Catch: java.lang.Exception -> L13
                java.lang.String r7 = r7.getLiveGames()     // Catch: java.lang.Exception -> L13
                java.lang.String r2 = "0"
                boolean r7 = jo.p.c(r7, r2)     // Catch: java.lang.Exception -> L13
                if (r7 != 0) goto Lae
                goto Laf
            Lae:
                r3 = 0
            Laf:
                r1.<init>(r3)     // Catch: java.lang.Exception -> L13
                r0.a(r1)     // Catch: java.lang.Exception -> L13
                goto Lb9
            Lb6:
                g9.a.c(r7)
            Lb9:
                wn.v r7 = wn.v.f59242a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: od.p.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public p(q8.a aVar, MRRequest mRRequest, hf.h0 h0Var, v0 v0Var, Context context, MRLogger mRLogger, w0 w0Var, kf.p pVar) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(h0Var, "newNoticeRepository");
        jo.p.h(v0Var, "userHelper");
        jo.p.h(context, "applicationContext");
        jo.p.h(mRLogger, "logger");
        jo.p.h(w0Var, "userMeCache");
        jo.p.h(pVar, "noticePreference");
        this.f45116w = aVar;
        this.f45117x = mRRequest;
        this.f45118y = h0Var;
        this.f45119z = v0Var;
        this.A = context;
        this.B = mRLogger;
        this.C = w0Var;
        this.D = pVar;
        b10 = i2.b(null, 1, null);
        this.E = b10;
        this.F = g1.b().plus(this.E);
    }

    public static final void t(p pVar, d.a aVar) {
        jo.p.h(pVar, "this$0");
        uo.l.d(pVar, null, null, new c(aVar, null), 3, null);
        MRLogger mRLogger = pVar.B;
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_SAFETY_NET);
        builder.setPageId("success");
        mRLogger.sendLog(builder.build());
    }

    public static final void u(p pVar, Exception exc) {
        jo.p.h(pVar, "this$0");
        jo.p.h(exc, "it");
        MRLogger mRLogger = pVar.B;
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_SAFETY_NET);
        builder.setPageId(MRLog.PAYLOAD_KEY_ERROR);
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, message)));
        mRLogger.sendLog(builder.build());
        g9.a.c(exc);
    }

    public final void A() {
        this.f45116w.a(s.o.f47245a);
    }

    public final void B(boolean z10) {
        this.f45116w.a(new s.e0(z10));
    }

    public final void C(jf.i0 i0Var) {
        String str;
        jo.p.h(i0Var, "notificationReferer");
        switch (a.f45120a[i0Var.ordinal()]) {
            case 1:
                str = Referer.HOME_SELECT;
                break;
            case 2:
                str = Referer.HOME_FOLLOW;
                break;
            case 3:
                str = Referer.NOTICE;
                break;
            case 4:
                str = Referer.MY_PAGE;
                break;
            case 5:
                str = Referer.LIVE_GAME;
                break;
            case 6:
                str = Referer.PUSH_NOTIFICATION;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        uo.l.d(this, null, null, new g(str, null), 3, null);
    }

    public final void D(int i10) {
        this.f45116w.a(new s.f0(i10));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.F;
    }

    public final void i() {
        this.f45116w.a(s.h.f47238a);
        this.C.clear();
    }

    public final void j(String str) {
        jo.p.h(str, "nextCursor");
        uo.l.d(this, null, null, new b(str, null), 3, null);
    }

    public final void k() {
        this.f45116w.a(s.q.f47247a);
    }

    public final void l(int i10) {
        this.f45116w.a(new s.m(i10));
    }

    public final void m() {
        this.f45116w.a(s.p.f47246a);
    }

    public final void n(int i10) {
        this.f45116w.a(new s.v(i10));
    }

    public final void o(int i10) {
        this.f45116w.a(new s.w(i10));
    }

    public final void p(boolean z10) {
        this.f45116w.a(new s.a0(z10));
    }

    public final void q() {
        this.f45116w.a(s.y.f47255a);
    }

    public final void r() {
        this.f45116w.a(new s.t(false));
        this.f45118y.a();
    }

    public final void s(String str, String str2) {
        jo.p.h(str, "signature");
        jo.p.h(str2, "safetyNetApiKey");
        MRLogger mRLogger = this.B;
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_SAFETY_NET);
        builder.setPageId(MRLog.TARGET_ID_IMP);
        mRLogger.sendLog(builder.build());
        if (nh.d.m().g(this.A) != 0) {
            MRLogger mRLogger2 = this.B;
            MRLog.Builder builder2 = new MRLog.Builder(MRLog.ACTION_TYPE_SAFETY_NET);
            builder2.setPageId("GooglePlayServices.error");
            mRLogger2.sendLog(builder2.build());
        } else if (nh.d.m().h(this.A, 13000000) != 0) {
            MRLogger mRLogger3 = this.B;
            MRLog.Builder builder3 = new MRLog.Builder(MRLog.ACTION_TYPE_SAFETY_NET);
            builder3.setPageId("GooglePlayServices13000000.error");
            mRLogger3.sendLog(builder3.build());
        } else {
            byte[] bytes = str.getBytes(so.c.f52772b);
            jo.p.g(bytes, "this as java.lang.String).getBytes(charset)");
            ri.e a10 = ri.c.a(this.A);
            jo.p.g(a10, "getClient(applicationContext)");
            a10.q(bytes, str2).i(new vi.e() { // from class: od.o
                @Override // vi.e
                public final void onSuccess(Object obj) {
                    p.t(p.this, (d.a) obj);
                }
            }).f(new vi.d() { // from class: od.n
                @Override // vi.d
                public final void a(Exception exc) {
                    p.u(p.this, exc);
                }
            });
        }
    }

    public final void v() {
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    public final void w(String str) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new e(str, null), 3, null);
    }

    public final void x() {
        this.f45116w.a(s.z.f47256a);
    }

    @SuppressLint({"CheckResult"})
    public final void y(String str) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new f(str, null), 3, null);
    }

    public final void z(String str) {
        jo.p.h(str, "liveId");
        this.f45116w.a(new s.i(str));
    }
}
