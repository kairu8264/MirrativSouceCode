package od;

import com.cookpad.puree.Puree;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.clientlog.logs.RegDone;
import com.dena.mirrorman.net.api.response.user.UserMe;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.twitter.sdk.android.core.TwitterException;
import hf.v0;
import jf.s0;
import pd.j0;
import pd.s;
import pd.u0;
import uo.v1;

/* loaded from: classes2.dex */
public final class h0 implements uo.q0 {
    public final MRRequest A;
    public final v0 B;
    public final hf.r C;
    public final hf.a0 D;
    public final /* synthetic */ uo.q0 E;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44911w;

    /* renamed from: x  reason: collision with root package name */
    public final hf.s0 f44912x;

    /* renamed from: y  reason: collision with root package name */
    public final kf.v f44913y;

    /* renamed from: z  reason: collision with root package name */
    public final MRLogger f44914z;

    @co.f(c = "com.dena.mirrorman.actioncreator.RegistrationActionCreator$loginWithTwitter$1", f = "RegistrationActionCreator.kt", l = {44}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44915w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44917y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f44917y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f44917y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            String message;
            Object c10 = bo.c.c();
            int i10 = this.f44915w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    hf.s0 s0Var = h0.this.f44912x;
                    String str = this.f44917y;
                    this.f44915w = 1;
                    obj = s0Var.a(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                jf.s0 s0Var2 = (jf.s0) obj;
                if (!(s0Var2 instanceof s0.c)) {
                    if (s0Var2 instanceof s0.b) {
                        if (((s0.b) s0Var2).b().getSignedInAsConnectedUser()) {
                            h0.this.f44913y.N1(true);
                        } else {
                            Puree.d(new RegDone("twitter", this.f44917y));
                        }
                        h0.this.f44911w.a(new s.b0(((s0.b) s0Var2).a()));
                    } else if (s0Var2 instanceof s0.a) {
                        h0.this.f44911w.a(new s.d0(((s0.a) s0Var2).a()));
                    }
                }
            } catch (Throwable th2) {
                wn.v vVar = null;
                TwitterException twitterException = th2 instanceof TwitterException ? th2 : null;
                if (twitterException != null && (message = twitterException.getMessage()) != null) {
                    h0.this.f44911w.a(new s.d0(new MRError.Failure(message)));
                    vVar = wn.v.f59242a;
                }
                if (vVar == null) {
                    h0.this.f44911w.a(new s.d0(MRError.Network.INSTANCE));
                }
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.RegistrationActionCreator$updateUserMe$1", f = "RegistrationActionCreator.kt", l = {136}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44918w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44920y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f44920y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f44920y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44918w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    hf.a0 a0Var = h0.this.D;
                    String str = this.f44920y;
                    this.f44918w = 1;
                    obj = a0Var.a(str, true, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                UserMe userMe = (UserMe) obj;
                h0.this.B.v(userMe);
                h0.this.f44911w.a(new j0.e0(userMe));
                h0.this.C.t(userMe.getCapabilities());
                dq.c.c().l(new nd.h0(userMe));
                h0.this.f44911w.a(u0.c.f47290a);
            } catch (Throwable th2) {
                h0.this.f44911w.a(new u0.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.RegistrationActionCreator$updateUserProfile$1", f = "RegistrationActionCreator.kt", l = {122}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f44921w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44923y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f44924z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, boolean z10, String str2, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f44923y = str;
            this.f44924z = z10;
            this.A = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f44923y, this.f44924z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object postUserProfileEdit;
            Object c10 = bo.c.c();
            int i10 = this.f44921w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    ApiUtil apiUtil = ApiUtil.INSTANCE;
                    String x10 = h0.this.B.x();
                    String str = this.f44923y;
                    boolean z10 = this.f44924z;
                    ep.c0 userProfileEditRequestBody = apiUtil.userProfileEditRequestBody(x10, str, null, null, null, z10 ? 1 : 0, null, h0.this.B.d(), null, false, null, null);
                    h0.this.f44911w.a(u0.b.f47289a);
                    MRRequest mRRequest = h0.this.A;
                    String str2 = this.A;
                    this.f44921w = 1;
                    postUserProfileEdit = mRRequest.postUserProfileEdit(str2, userProfileEditRequestBody, this);
                    if (postUserProfileEdit == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                    postUserProfileEdit = obj;
                }
                UserProfile userProfile = (UserProfile) postUserProfileEdit;
                Puree.d(new RegDone("", this.A));
                h0.this.m(this.A);
            } catch (Throwable th2) {
                h0.this.f44911w.a(new u0.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public h0(q8.a aVar, hf.s0 s0Var, kf.v vVar, MRLogger mRLogger, MRRequest mRRequest, v0 v0Var, hf.r rVar, hf.a0 a0Var) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(s0Var, "twitterUseCase");
        jo.p.h(vVar, "tutorialPreference");
        jo.p.h(mRLogger, "logger");
        jo.p.h(mRRequest, "request");
        jo.p.h(v0Var, "userHelper");
        jo.p.h(rVar, "featureHelper");
        jo.p.h(a0Var, "getUserMeRepository");
        this.f44911w = aVar;
        this.f44912x = s0Var;
        this.f44913y = vVar;
        this.f44914z = mRLogger;
        this.A = mRRequest;
        this.B = v0Var;
        this.C = rVar;
        this.D = a0Var;
        this.E = uo.r0.b();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.E.getCoroutineContext();
    }

    public final void i(String str) {
        jo.p.h(str, "referer");
        uo.l.d(v1.f56093w, null, null, new a(str, null), 3, null);
    }

    public final void j() {
        MRLogger mRLogger = this.f44914z;
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_TUTORIAL_SELECT_LOGIN_CREATE);
        builder.setTargetId("create_account");
        mRLogger.sendLog(builder.build());
    }

    public final void k() {
        MRLogger mRLogger = this.f44914z;
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_TUTORIAL_SELECT_LOGIN_CREATE);
        builder.setTargetId(MRLog.TARGET_ID_IMP);
        mRLogger.sendLog(builder.build());
    }

    public final void l() {
        MRLogger mRLogger = this.f44914z;
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_TUTORIAL_SELECT_LOGIN_CREATE);
        builder.setTargetId("twitter_login");
        mRLogger.sendLog(builder.build());
    }

    public final void m(String str) {
        uo.l.d(this, null, null, new b(str, null), 3, null);
    }

    public final void n(String str, String str2, boolean z10) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "name");
        uo.l.d(this, null, null, new c(str2, z10, str, null), 3, null);
    }
}
