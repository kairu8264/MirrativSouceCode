package nf;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.dena.mirrorman.net.api.response.Feature;
import com.dena.mirrorman.net.api.response.user.TimeMachine;
import nd.f1;
import org.greenrobot.eventbus.ThreadMode;
import pd.m;
import uo.r0;

/* loaded from: classes3.dex */
public final class k implements uo.q0 {
    public static final a U = new a(null);
    public static final int V = 8;
    public static k W;
    public final LiveData<String> A;
    public final androidx.lifecycle.e0<Boolean> B;
    public final LiveData<Boolean> C;
    public final androidx.lifecycle.e0<Boolean> D;
    public final androidx.lifecycle.e0<Boolean> E;
    public final androidx.lifecycle.e0<String> F;
    public final androidx.lifecycle.e0<String> G;
    public final androidx.lifecycle.e0<Boolean> H;
    public final androidx.lifecycle.e0<Integer> I;
    public final androidx.lifecycle.e0<Integer> J;
    public final androidx.lifecycle.e0<Integer> K;
    public final androidx.lifecycle.e0<Boolean> L;
    public final androidx.lifecycle.e0<String> M;
    public final androidx.lifecycle.e0<Integer> N;
    public final wn.f O;
    public final androidx.lifecycle.e0<String> P;
    public final LiveData<String> Q;
    public final androidx.lifecycle.e0<Boolean> R;
    public final androidx.lifecycle.e0<Boolean> S;
    public final wn.f T;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f42979w;

    /* renamed from: x  reason: collision with root package name */
    public final Context f42980x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ da.j f42981y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f42982z;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k a(q8.a aVar, kf.i iVar, Context context) {
            jo.p.h(aVar, "dispatcher");
            jo.p.h(iVar, "featurePreference");
            jo.p.h(context, "applicationContext");
            k kVar = k.W;
            if (kVar != null) {
                kVar.e();
            }
            k kVar2 = new k(aVar, iVar, context, null);
            k.W = kVar2;
            return kVar2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.a<androidx.lifecycle.e0<TimeMachine>> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.e0<TimeMachine> invoke() {
            return new androidx.lifecycle.e0<>(k.this.u());
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends jo.q implements io.a<TimeMachine> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kf.i f42984w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kf.i iVar) {
            super(0);
            this.f42984w = iVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final TimeMachine invoke() {
            String B3 = this.f42984w.B3();
            if (B3.length() == 0) {
                return null;
            }
            try {
                return (TimeMachine) new xm.e().i(B3, TimeMachine.class);
            } catch (Exception e10) {
                g9.a.c(e10);
                return null;
            }
        }
    }

    public k(q8.a aVar, kf.i iVar, Context context) {
        this.f42979w = aVar;
        this.f42980x = context;
        this.f42981y = new da.j();
        aVar.b(this);
        androidx.lifecycle.e0<String> e0Var = new androidx.lifecycle.e0<>(iVar.p0());
        this.f42982z = e0Var;
        this.A = e0Var;
        androidx.lifecycle.e0<Boolean> e0Var2 = new androidx.lifecycle.e0<>(Boolean.valueOf(iVar.P3()));
        this.B = e0Var2;
        this.C = e0Var2;
        this.D = new androidx.lifecycle.e0<>(Boolean.valueOf(iVar.n4()));
        this.E = new androidx.lifecycle.e0<>(Boolean.valueOf(iVar.d1()));
        this.F = new androidx.lifecycle.e0<>(iVar.T());
        this.G = new androidx.lifecycle.e0<>(iVar.K4());
        this.H = new androidx.lifecycle.e0<>(Boolean.valueOf(iVar.n4()));
        this.I = new androidx.lifecycle.e0<>(Integer.valueOf(iVar.j()));
        this.J = new androidx.lifecycle.e0<>(Integer.valueOf(iVar.y4()));
        this.K = new androidx.lifecycle.e0<>(Integer.valueOf(iVar.c()));
        this.L = new androidx.lifecycle.e0<>(Boolean.valueOf(iVar.P3()));
        this.M = new androidx.lifecycle.e0<>(iVar.V0());
        this.N = new androidx.lifecycle.e0<>(Integer.valueOf(iVar.g5()));
        this.O = wn.g.a(new b());
        androidx.lifecycle.e0<String> e0Var3 = new androidx.lifecycle.e0<>(iVar.K2());
        this.P = e0Var3;
        this.Q = e0Var3;
        this.R = new androidx.lifecycle.e0<>(Boolean.valueOf(iVar.I3()));
        this.S = new androidx.lifecycle.e0<>(Boolean.valueOf(iVar.o2()));
        this.T = wn.g.a(new c(iVar));
    }

    public /* synthetic */ k(q8.a aVar, kf.i iVar, Context context, jo.h hVar) {
        this(aVar, iVar, context);
    }

    public final void e() {
        this.f42979w.c(this);
        r0.d(this, null, 1, null);
    }

    public final LiveData<Boolean> f() {
        return this.C;
    }

    public final boolean g() {
        Boolean f10 = this.D.f();
        jo.p.e(f10);
        return f10.booleanValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f42981y.getCoroutineContext();
    }

    public final int h() {
        Integer f10 = this.K.f();
        jo.p.e(f10);
        return f10.intValue();
    }

    public final boolean i() {
        Boolean f10 = this.R.f();
        jo.p.e(f10);
        return f10.booleanValue();
    }

    public final boolean j() {
        Boolean f10 = this.H.f();
        jo.p.e(f10);
        return f10.booleanValue();
    }

    public final androidx.lifecycle.e0<TimeMachine> k() {
        return (androidx.lifecycle.e0) this.O.getValue();
    }

    public final int l() {
        Integer f10 = this.J.f();
        jo.p.e(f10);
        return f10.intValue();
    }

    public final String m() {
        String f10 = this.A.f();
        jo.p.e(f10);
        return f10;
    }

    public final LiveData<String> n() {
        return this.A;
    }

    public final boolean o() {
        Boolean f10 = this.S.f();
        jo.p.e(f10);
        return f10.booleanValue();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(m.a aVar) {
        jo.p.h(aVar, "event");
        androidx.lifecycle.e0<String> e0Var = this.f42982z;
        String offerWallUrl = aVar.a().getOfferWallUrl();
        if (offerWallUrl == null) {
            offerWallUrl = "";
        }
        e0Var.p(offerWallUrl);
        this.D.p(Boolean.valueOf(aVar.a().getCollaboEmomoEnabled()));
        androidx.lifecycle.e0<String> e0Var2 = this.F;
        Feature.Share share = aVar.a().getShare();
        e0Var2.p((share == null || (r1 = share.getPopupTitle()) == null) ? "" : "");
        androidx.lifecycle.e0<String> e0Var3 = this.G;
        Feature.Share share2 = aVar.a().getShare();
        e0Var3.p((share2 == null || (r1 = share2.getPopupDescription()) == null) ? "" : "");
        this.H.p(Boolean.valueOf(aVar.a().getMailSupportEnabled()));
        this.B.p(Boolean.valueOf(aVar.a().getCoinChallengeEnabled()));
        this.I.p(Integer.valueOf(aVar.a().getUserMeCacheExpire()));
        this.J.p(Integer.valueOf(aVar.a().getNoticeCountsCacheExpire()));
        this.E.p(Boolean.valueOf(aVar.a().getHomeRewardAdButtonEnabled()));
        this.K.p(Integer.valueOf(aVar.a().getDemographicLastShownTime()));
        this.L.p(Boolean.valueOf(aVar.a().isInviteCollabSupported()));
        androidx.lifecycle.e0<String> e0Var4 = this.M;
        String signature_verify_nonce = aVar.a().getSignature_verify_nonce();
        if (signature_verify_nonce == null) {
            signature_verify_nonce = "";
        }
        e0Var4.p(signature_verify_nonce);
        this.N.p(Integer.valueOf(aVar.a().getPackageUsageStatsInterval()));
        k().p(aVar.a().getTimeMachine());
        androidx.lifecycle.e0<String> e0Var5 = this.P;
        String seasonRatingInfoUrl = aVar.a().getSeasonRatingInfoUrl();
        e0Var5.p(seasonRatingInfoUrl != null ? seasonRatingInfoUrl : "");
        this.R.p(Boolean.valueOf(aVar.a().getLiveGameListingIconEnabled()));
        this.S.p(Boolean.valueOf(aVar.a().getOnboardingSurveyEnabled()));
    }

    public final int p() {
        Integer f10 = this.N.f();
        if (f10 != null) {
            return f10.intValue() * 1000;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final LiveData<String> q() {
        return this.Q;
    }

    public final String r() {
        if (TextUtils.isEmpty(this.G.f())) {
            String string = this.f42980x.getResources().getString(f1.text_q_friend_invite_desc);
            jo.p.g(string, "{\n            applicatio…nd_invite_desc)\n        }");
            return string;
        }
        String f10 = this.G.f();
        jo.p.e(f10);
        jo.p.g(f10, "{\n            mutableSha…ription.value!!\n        }");
        return f10;
    }

    public final String s() {
        if (TextUtils.isEmpty(this.F.f())) {
            String string = this.f42980x.getResources().getString(f1.text_q_friend_invite);
            jo.p.g(string, "{\n            applicatio…_friend_invite)\n        }");
            return string;
        }
        String f10 = this.F.f();
        jo.p.e(f10);
        jo.p.g(f10, "{\n            mutableSha…upTitle.value!!\n        }");
        return f10;
    }

    public final String t() {
        String f10 = this.M.f();
        jo.p.e(f10);
        return f10;
    }

    public final TimeMachine u() {
        return (TimeMachine) this.T.getValue();
    }

    public final int v() {
        Integer f10 = this.I.f();
        jo.p.e(f10);
        return f10.intValue();
    }

    public final boolean w() {
        Boolean f10 = this.L.f();
        jo.p.e(f10);
        return f10.booleanValue();
    }
}
