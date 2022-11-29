package ld;

import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.core.StatusResponse;
import com.dena.mirrativ.mirrativapi.user.UserApi;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.Social;
import com.dena.mirrorman.net.api.response.user.UserMe;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import com.dena.mirrorman.net.retrofit.MRRequest;
import pd.j0;
import pd.s;
import pd.w0;
import uo.i2;

/* loaded from: classes2.dex */
public final class t extends androidx.lifecycle.q0 implements uo.q0 {
    public final kf.x A;
    public final hf.v0 B;
    public final MRLogger C;
    public final hf.a0 D;
    public final UserApi E;
    public final hf.o0 F;
    public uo.b0 G;
    public final ao.g H;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f40097y;

    /* renamed from: z  reason: collision with root package name */
    public final MRRequest f40098z;

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingActionCreator$confirmHandoverCode$1", f = "SettingActionCreator.kt", l = {85, 104}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ String C;

        /* renamed from: w  reason: collision with root package name */
        public int f40099w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f40101y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f40102z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, boolean z10, String str4, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f40101y = str;
            this.f40102z = str2;
            this.A = str3;
            this.B = z10;
            this.C = str4;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f40101y, this.f40102z, this.A, this.B, this.C, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40099w;
            try {
            } catch (Throwable th2) {
                g9.a.c(th2);
                MRError error = MRErrorKt.convertMRException(th2).getError();
                if (error instanceof MRError.Maintenance ? true : jo.p.c(error, MRError.ForceUpdate.INSTANCE)) {
                    t.this.f40097y.a(new w0.d(error));
                } else {
                    t.this.f40097y.a(w0.c.f47307a);
                }
            }
            if (i10 == 0) {
                wn.m.b(obj);
                MRRequest mRRequest = t.this.f40098z;
                String str = this.f40101y;
                String str2 = this.f40102z;
                String str3 = this.A;
                Integer d10 = co.b.d(this.B ? 1 : 0);
                String str4 = this.C;
                String d11 = t.this.B.d();
                this.f40099w = 1;
                obj = mRRequest.twitterSignUpRequest(str, ApiUtil.TWITTER_SIGNUP_TYPE_LOGIN, str2, str3, d10, str4, d11, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                UserMe userMe = (UserMe) obj;
                t.this.B.v(userMe);
                t.this.f40097y.a(new j0.e0(userMe));
                t.this.f40097y.a(s.p.f47246a);
                dq.c.c().l(new nd.h0(userMe));
                t.this.A.E0(2);
                t.this.f40097y.a(w0.e.f47309a);
                return wn.v.f59242a;
            } else {
                wn.m.b(obj);
            }
            Social.SocialAccount socialAccount = (Social.SocialAccount) obj;
            if (socialAccount.getFailedHandoverCodeMessage() == null && !socialAccount.isLock()) {
                hf.a0 a0Var = t.this.D;
                String str5 = this.f40101y;
                this.f40099w = 2;
                obj = a0Var.a(str5, true, this);
                if (obj == c10) {
                    return c10;
                }
                UserMe userMe2 = (UserMe) obj;
                t.this.B.v(userMe2);
                t.this.f40097y.a(new j0.e0(userMe2));
                t.this.f40097y.a(s.p.f47246a);
                dq.c.c().l(new nd.h0(userMe2));
                t.this.A.E0(2);
                t.this.f40097y.a(w0.e.f47309a);
                return wn.v.f59242a;
            }
            t.this.f40097y.a(new w0.a(socialAccount.getFailedHandoverCodeMessage(), socialAccount.isLock()));
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingActionCreator$postUserWithdraw$1", f = "SettingActionCreator.kt", l = {149}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40103w;

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
            int i10 = this.f40103w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    UserApi userApi = t.this.E;
                    this.f40103w = 1;
                    obj = userApi.postUserWithdraw(Referer.SETTING_WITHDRAW, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                StatusResponse statusResponse = (StatusResponse) obj;
                t.this.f40097y.a(w0.n.f47318a);
                t.this.B.q();
                t.this.F.k();
            } catch (Throwable th2) {
                t.this.f40097y.a(new w0.m(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingActionCreator$saveHandoverCode$1", f = "SettingActionCreator.kt", l = {65}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40105w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f40107y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f40107y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f40107y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40105w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = t.this.f40098z;
                    String str = this.f40107y;
                    this.f40105w = 1;
                    if (mRRequest.updateHandoverCode(Referer.SETTINGS, str, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                t.this.A.J1(true);
                t.this.f40097y.a(w0.h.f47312a);
            } catch (Throwable th2) {
                t.this.f40097y.a(new w0.g(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingActionCreator$updateChatOnlyFollowings$1", f = "SettingActionCreator.kt", l = {51}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40108w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ep.c0 f40110y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ep.c0 c0Var, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f40110y = c0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f40110y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40108w;
            boolean z10 = true;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = t.this.f40098z;
                    ep.c0 c0Var = this.f40110y;
                    this.f40108w = 1;
                    obj = mRRequest.postUserProfileEdit(Referer.SETTINGS, c0Var, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                kf.x xVar = t.this.A;
                if (((UserProfile) obj).getChatOnlyFollowings() != 1) {
                    z10 = false;
                }
                xVar.n0(z10);
                t.this.f40097y.a(w0.j.f47314a);
            } catch (Throwable th2) {
                t.this.f40097y.a(new w0.i(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingActionCreator$updateRecordSettings$1", f = "SettingActionCreator.kt", l = {137}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40111w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f40113y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f40113y = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f40113y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40111w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = t.this.f40098z;
                    int i11 = this.f40113y ? 1 : 0;
                    this.f40111w = 1;
                    if (mRRequest.postUpdateRecordSettings(Referer.SETTINGS, i11, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                t.this.A.t(this.f40113y);
                t.this.f40097y.a(w0.l.f47316a);
            } catch (Throwable th2) {
                t.this.f40097y.a(new w0.k(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public t(q8.a aVar, MRRequest mRRequest, kf.x xVar, hf.v0 v0Var, MRLogger mRLogger, hf.a0 a0Var, UserApi userApi, hf.o0 o0Var) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(xVar, "userPreference");
        jo.p.h(v0Var, "userHelper");
        jo.p.h(mRLogger, "logger");
        jo.p.h(a0Var, "getUserMeRepository");
        jo.p.h(userApi, "userApi");
        jo.p.h(o0Var, "twitterHelper");
        this.f40097y = aVar;
        this.f40098z = mRRequest;
        this.A = xVar;
        this.B = v0Var;
        this.C = mRLogger;
        this.D = a0Var;
        this.E = userApi;
        this.F = o0Var;
        b10 = i2.b(null, 1, null);
        this.G = b10;
        this.H = uo.g1.b().plus(this.G);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.H;
    }

    public final void m(String str, String str2, String str3, boolean z10, String str4) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "token");
        jo.p.h(str3, "secretToken");
        jo.p.h(str4, "handoverCode");
        uo.l.d(this, null, null, new a(str, str2, str3, z10, str4, null), 3, null);
    }

    public final void n(String str) {
        jo.p.h(str, "handoverCode");
        this.f40097y.a(new w0.f(str));
    }

    public final void o() {
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    public final void p(String str) {
        jo.p.h(str, "handoverCode");
        uo.l.d(this, null, null, new c(str, null), 3, null);
    }

    public final void q() {
        MRLogger mRLogger = this.C;
        MRLog.Companion companion = MRLog.Companion;
        mRLogger.sendLog(new MRLog.Builder(MRLog.ACTION_TYPE_DATA_INHERIT_LOGIN_IMP).build());
    }

    public final void r(boolean z10) {
        uo.l.d(this, null, null, new d(ApiUtil.INSTANCE.userProfileEditRequestBody("chat_only_followings", z10), null), 3, null);
    }

    public final void s(boolean z10) {
        uo.l.d(this, null, null, new e(z10, null), 3, null);
    }
}
