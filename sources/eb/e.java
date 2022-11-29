package eb;

import androidx.lifecycle.q0;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameApi;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameStartResponse;
import com.dena.mirrativ.mirrativapi.otherfeatures.OtherFeaturesApi;
import com.dena.mirrativ.mirrativapi.otherfeatures.live.NuuWelcomeLiveResponse;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import eb.f;
import ep.c0;
import io.p;
import kf.t;
import kf.v;
import kf.x;
import uo.g1;
import uo.r0;
import xn.r;

/* loaded from: classes2.dex */
public final class e extends q0 {
    public final x A;
    public final LiveGameApi B;
    public final MRRequest C;
    public final OtherFeaturesApi D;
    public final MRLogger E;
    public final q8.a F;

    /* renamed from: y  reason: collision with root package name */
    public final t f30357y;

    /* renamed from: z  reason: collision with root package name */
    public final v f30358z;

    @co.f(c = "com.dena.mirrativ.otherfeature.onboarding.OnboardingActionCreator$fetchNuuWelcomeLive$1", f = "OnboardingActionCreator.kt", l = {65}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f30359w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f30359w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    OtherFeaturesApi otherFeaturesApi = e.this.D;
                    this.f30359w = 1;
                    obj = otherFeaturesApi.getNuuWelcomeLive(Referer.TUTORIAL, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                e.this.F.a(new f.c(((NuuWelcomeLiveResponse) obj).getLiveId()));
            } catch (Throwable th2) {
                e.this.F.a(new f.b(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.onboarding.OnboardingActionCreator$startLiveGame$1", f = "OnboardingActionCreator.kt", l = {49, 50}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f30361w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f30363y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f30364z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f30363y = str;
            this.f30364z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f30363y, this.f30364z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f30361w;
            try {
            } catch (Throwable th2) {
                e.this.F.a(new f.a(MRErrorKt.convertMRException(th2).getError()));
            }
            if (i10 == 0) {
                wn.m.b(obj);
                MRRequest mRRequest = e.this.C;
                c0 appMyAppRequestBody = ApiUtil.INSTANCE.appMyAppRequestBody(r.d(this.f30363y));
                this.f30361w = 1;
                if (mRRequest.postAddMyApp(Referer.TUTORIAL, appMyAppRequestBody, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                e.this.F.a(new f.d((LiveGameStartResponse) obj));
                return wn.v.f59242a;
            } else {
                wn.m.b(obj);
            }
            LiveGameApi liveGameApi = e.this.B;
            String str = this.f30364z;
            this.f30361w = 2;
            obj = LiveGameApi.DefaultImpls.postLiveGameStart$default(liveGameApi, Referer.TUTORIAL, str, false, null, this, 8, null);
            if (obj == c10) {
                return c10;
            }
            e.this.F.a(new f.d((LiveGameStartResponse) obj));
            return wn.v.f59242a;
        }
    }

    public e(t tVar, v vVar, x xVar, LiveGameApi liveGameApi, MRRequest mRRequest, OtherFeaturesApi otherFeaturesApi, MRLogger mRLogger, q8.a aVar) {
        jo.p.h(tVar, "settingPreference");
        jo.p.h(vVar, "tutorialPreference");
        jo.p.h(xVar, "userPreference");
        jo.p.h(liveGameApi, "liveGameApi");
        jo.p.h(mRRequest, "request");
        jo.p.h(otherFeaturesApi, "otherFeaturesApi");
        jo.p.h(mRLogger, "logger");
        jo.p.h(aVar, "dispatcher");
        this.f30357y = tVar;
        this.f30358z = vVar;
        this.A = xVar;
        this.B = liveGameApi;
        this.C = mRRequest;
        this.D = otherFeaturesApi;
        this.E = mRLogger;
        this.F = aVar;
    }

    public final void j() {
        uo.l.d(r0.a(g1.b()), null, null, new a(null), 3, null);
    }

    public final void k() {
        this.f30357y.o1(true);
        this.f30358z.d(true);
    }

    public final void l(String str) {
        jo.p.h(str, "url");
        this.A.O0(str);
    }

    public final void m(m mVar) {
        jo.p.h(mVar, "onboardingSurveyItem");
        this.F.a(new f.e(mVar));
    }

    public final void n(int i10) {
        int t12 = this.f30357y.t1();
        g9.a.g("mirror clientlog : tutorial " + i10 + '/' + t12);
    }

    public final void o(String str, String str2) {
        jo.p.h(str, TtmlNode.ATTR_ID);
        jo.p.h(str2, "appId");
        uo.l.d(r0.a(g1.b()), null, null, new b(str2, str, null), 3, null);
    }
}
