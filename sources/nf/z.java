package nf;

import androidx.lifecycle.LiveData;
import ce.l;
import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestGachaTicket;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameStartResponse;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import com.dena.mirrorman.net.api.response.CollabInvitation;
import com.dena.mirrorman.net.api.response.EventNoticeResponse;
import com.dena.mirrorman.net.api.response.GiftPanelBanner;
import com.dena.mirrorman.net.api.response.Graph;
import com.dena.mirrorman.net.api.response.LiveStreamingUrlResponse;
import com.dena.mirrorman.net.api.response.UserLevel;
import com.dena.mirrorman.net.api.response.event.GiftRanking;
import com.dena.mirrorman.net.api.response.event.ShooterTeamStatus;
import com.dena.mirrorman.net.api.response.live.LinkedLive;
import com.dena.mirrorman.net.api.response.live.LiveCommentResponse;
import com.dena.mirrorman.net.api.response.live.LiveGamePlaying;
import com.dena.mirrorman.net.api.response.user.LiveViewingUser;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import com.dena.mirrorman.net.bcsvr.response.CollabInviteCanceledByStreamerBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.RankingUser;
import com.dena.mirrorman.net.bcsvr.response.ShooterMatchingStateChangedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.ShooterMemberStateChangedBcsvrResponse;
import com.dena.mirrorman.net.quiz.QuizMessage;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import pd.g;
import pd.i1;
import pd.q0;
import pd.s;
import ud.r2;
import ud.w1;
import uo.g1;
import uo.i2;
import uo.o2;

/* loaded from: classes3.dex */
public final class z implements uo.q0 {

    /* renamed from: k2  reason: collision with root package name */
    public static final a f43307k2 = new a(null);

    /* renamed from: l2  reason: collision with root package name */
    public static final int f43308l2 = 8;
    public final LiveData<String> A;
    public final wo.x<MRError> A0;
    public final wo.f<jf.h> A1;
    public final androidx.lifecycle.e0<te.c> B;
    public final wo.q<String> B0;
    public final wo.f<CollabInviteCanceledByStreamerBcsvrResponse> B1;
    public final LiveData<te.c> C;
    public final wo.f<wn.v> C0;
    public final wo.f<wn.v> C1;
    public final androidx.lifecycle.e0<te.c> D;
    public final wo.f<MRError> D0;
    public final wo.f<wn.v> D1;
    public final LiveData<te.c> E;
    public final androidx.lifecycle.e0<List<r2>> E0;
    public final androidx.lifecycle.e0<ShooterMemberStateChangedBcsvrResponse> E1;
    public final androidx.lifecycle.e0<Boolean> F;
    public final LiveData<List<r2>> F0;
    public final LiveData<ShooterMemberStateChangedBcsvrResponse> F1;
    public final LiveData<Boolean> G;
    public final wo.f<Integer> G0;
    public final xo.r<ShooterMatchingStateChangedBcsvrResponse> G1;
    public final androidx.lifecycle.e0<MRError> H;
    public final wo.f<List<r2>> H0;
    public final xo.w<ShooterMatchingStateChangedBcsvrResponse> H1;
    public final LiveData<MRError> I;
    public final wo.f<r2> I0;
    public final xo.s<ShooterMatchingStateChangedBcsvrResponse> I1;
    public final wo.f<LiveStreamingUrlResponse> J;
    public final wo.f<GiftItem> J0;
    public final xo.g0<ShooterMatchingStateChangedBcsvrResponse> J1;
    public final wo.f<MRError> K;
    public final androidx.lifecycle.e0<wn.k<Boolean, Boolean>> K0;
    public final nd.s0<String> K1;
    public final androidx.lifecycle.e0<Boolean> L;
    public final LiveData<wn.k<Boolean, Boolean>> L0;
    public final xo.r<wn.v> L1;
    public final LiveData<Boolean> M;
    public final wo.f<QuizMessage> M0;
    public final xo.w<wn.v> M1;
    public final androidx.lifecycle.e0<Boolean> N;
    public final wo.f<QuizMessage> N0;
    public final xo.r<wn.v> N1;
    public final LiveData<Boolean> O;
    public final wo.f<wn.v> O0;
    public final xo.w<wn.v> O1;
    public final wo.f<MRError> P;
    public final androidx.lifecycle.e0<List<jf.s>> P0;
    public final xo.r<wn.k<Integer, LiveCommentResponse>> P1;
    public final androidx.lifecycle.e0<jf.f> Q;
    public final LiveData<List<jf.s>> Q0;
    public final xo.w<wn.k<Integer, LiveCommentResponse>> Q1;
    public final LiveData<jf.f> R;
    public final wo.f<MRError> R0;
    public final androidx.lifecycle.e0<List<jf.u>> R1;
    public final androidx.lifecycle.e0<Integer> S;
    public final androidx.lifecycle.e0<List<RankingUser>> S0;
    public final LiveData<List<jf.u>> S1;
    public final LiveData<Integer> T;
    public final LiveData<List<RankingUser>> T0;
    public final xo.r<wn.k<Boolean, Integer>> T1;
    public final androidx.lifecycle.e0<String> U;
    public final xo.r<wn.v> U0;
    public final xo.w<wn.k<Boolean, Integer>> U1;
    public final LiveData<String> V;
    public final xo.w<wn.v> V0;
    public final xo.r<wn.v> V1;
    public final androidx.lifecycle.e0<wn.k<Boolean, Graph.Follow>> W;
    public final wo.f<String> W0;
    public final xo.w<wn.v> W1;
    public final LiveData<wn.k<Boolean, Graph.Follow>> X;
    public final wo.f<LinkedLive> X0;
    public final xo.r<wn.k<LiveGameStartResponse, Boolean>> X1;
    public final androidx.lifecycle.e0<Boolean> Y;
    public final nd.s0<wn.v> Y0;
    public final xo.w<wn.k<LiveGameStartResponse, Boolean>> Y1;
    public final LiveData<Boolean> Z;
    public final nd.s0<MRError> Z0;
    public final xo.r<EmomoQuestGachaTicket> Z1;

    /* renamed from: a0  reason: collision with root package name */
    public final androidx.lifecycle.e0<App.AppParams> f43309a0;

    /* renamed from: a1  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f43310a1;

    /* renamed from: a2  reason: collision with root package name */
    public final xo.w<EmomoQuestGachaTicket> f43311a2;

    /* renamed from: b0  reason: collision with root package name */
    public final LiveData<App.AppParams> f43312b0;

    /* renamed from: b1  reason: collision with root package name */
    public final LiveData<Boolean> f43313b1;

    /* renamed from: b2  reason: collision with root package name */
    public final xo.r<wn.v> f43314b2;

    /* renamed from: c0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f43315c0;

    /* renamed from: c1  reason: collision with root package name */
    public final wo.f<wn.v> f43316c1;

    /* renamed from: c2  reason: collision with root package name */
    public final xo.w<wn.v> f43317c2;

    /* renamed from: d0  reason: collision with root package name */
    public final LiveData<Boolean> f43318d0;

    /* renamed from: d1  reason: collision with root package name */
    public boolean f43319d1;

    /* renamed from: d2  reason: collision with root package name */
    public final xo.r<MRError> f43320d2;

    /* renamed from: e0  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<LiveViewingUser>> f43321e0;

    /* renamed from: e1  reason: collision with root package name */
    public long f43322e1;

    /* renamed from: e2  reason: collision with root package name */
    public final xo.w<MRError> f43323e2;

    /* renamed from: f0  reason: collision with root package name */
    public final LiveData<List<LiveViewingUser>> f43324f0;

    /* renamed from: f1  reason: collision with root package name */
    public final nd.s0<EventNoticeResponse> f43325f1;

    /* renamed from: f2  reason: collision with root package name */
    public final xo.r<wn.v> f43326f2;

    /* renamed from: g0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f43327g0;

    /* renamed from: g1  reason: collision with root package name */
    public final wo.f<wn.v> f43328g1;

    /* renamed from: g2  reason: collision with root package name */
    public final xo.w<wn.v> f43329g2;

    /* renamed from: h0  reason: collision with root package name */
    public final LiveData<Integer> f43330h0;

    /* renamed from: h1  reason: collision with root package name */
    public boolean f43331h1;

    /* renamed from: h2  reason: collision with root package name */
    public final androidx.lifecycle.e0<w1> f43332h2;

    /* renamed from: i0  reason: collision with root package name */
    public final wo.f<MRError> f43333i0;

    /* renamed from: i1  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f43334i1;

    /* renamed from: i2  reason: collision with root package name */
    public final LiveData<w1> f43335i2;

    /* renamed from: j0  reason: collision with root package name */
    public final androidx.lifecycle.e0<UserProfile> f43336j0;

    /* renamed from: j1  reason: collision with root package name */
    public final LiveData<Integer> f43337j1;

    /* renamed from: j2  reason: collision with root package name */
    public final wo.f<wn.v> f43338j2;

    /* renamed from: k0  reason: collision with root package name */
    public final LiveData<UserProfile> f43339k0;

    /* renamed from: k1  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<jf.q>> f43340k1;

    /* renamed from: l0  reason: collision with root package name */
    public final androidx.lifecycle.e0<i9.a> f43341l0;

    /* renamed from: l1  reason: collision with root package name */
    public final LiveData<List<jf.q>> f43342l1;

    /* renamed from: m0  reason: collision with root package name */
    public final LiveData<i9.a> f43343m0;

    /* renamed from: m1  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f43344m1;

    /* renamed from: n0  reason: collision with root package name */
    public final androidx.lifecycle.e0<AppUserDetailResponse> f43345n0;

    /* renamed from: n1  reason: collision with root package name */
    public final LiveData<String> f43346n1;

    /* renamed from: o0  reason: collision with root package name */
    public final LiveData<AppUserDetailResponse> f43347o0;

    /* renamed from: o1  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f43348o1;

    /* renamed from: p0  reason: collision with root package name */
    public final wo.f<wn.v> f43349p0;

    /* renamed from: p1  reason: collision with root package name */
    public final LiveData<Boolean> f43350p1;

    /* renamed from: q0  reason: collision with root package name */
    public final wo.f<MRError> f43351q0;

    /* renamed from: q1  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f43352q1;

    /* renamed from: r0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f43353r0;

    /* renamed from: r1  reason: collision with root package name */
    public final LiveData<Boolean> f43354r1;

    /* renamed from: s0  reason: collision with root package name */
    public final LiveData<Boolean> f43355s0;

    /* renamed from: s1  reason: collision with root package name */
    public final androidx.lifecycle.e0<UserLevel> f43356s1;

    /* renamed from: t0  reason: collision with root package name */
    public final wo.f<wn.v> f43357t0;

    /* renamed from: t1  reason: collision with root package name */
    public final LiveData<UserLevel> f43358t1;

    /* renamed from: u0  reason: collision with root package name */
    public final wo.f<MRError> f43359u0;

    /* renamed from: u1  reason: collision with root package name */
    public final wo.f<List<LiveViewingUser>> f43360u1;

    /* renamed from: v0  reason: collision with root package name */
    public final wo.f<wn.v> f43361v0;

    /* renamed from: v1  reason: collision with root package name */
    public final androidx.lifecycle.e0<CollabInvitation> f43362v1;

    /* renamed from: w  reason: collision with root package name */
    public final hf.s f43363w;

    /* renamed from: w0  reason: collision with root package name */
    public final wo.f<MRError> f43364w0;

    /* renamed from: w1  reason: collision with root package name */
    public final LiveData<CollabInvitation> f43365w1;

    /* renamed from: x  reason: collision with root package name */
    public final kf.x f43366x;

    /* renamed from: x0  reason: collision with root package name */
    public final wo.f<wn.v> f43367x0;

    /* renamed from: x1  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f43368x1;

    /* renamed from: y  reason: collision with root package name */
    public final ao.g f43369y;

    /* renamed from: y0  reason: collision with root package name */
    public final wo.f<MRError> f43370y0;

    /* renamed from: y1  reason: collision with root package name */
    public final LiveData<Boolean> f43371y1;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f43372z;

    /* renamed from: z0  reason: collision with root package name */
    public final wo.f<MRError> f43373z0;

    /* renamed from: z1  reason: collision with root package name */
    public final wo.f<MRError> f43374z1;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$34", f = "PlayerStore.kt", l = {880}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43375w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.u f43377y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(q0.u uVar, ao.d<? super a0> dVar) {
            super(2, dVar);
            this.f43377y = uVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a0(this.f43377y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43375w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.f43374z1;
                MRError a10 = this.f43377y.a();
                this.f43375w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$onEvent$6", f = "PlayerStore.kt", l = {472}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43378w;

        public a1(ao.d<? super a1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43378w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.f43316c1;
                wn.v vVar = wn.v.f59242a;
                this.f43378w = 1;
                if (fVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$10", f = "PlayerStore.kt", l = {504, 505, 506}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43380w;

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

        /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[RETURN] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r6.f43380w
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L26
                if (r1 == r5) goto L22
                if (r1 == r4) goto L1e
                if (r1 != r3) goto L16
                wn.m.b(r7)
                goto L5a
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                wn.m.b(r7)
                goto L4b
            L22:
                wn.m.b(r7)
                goto L3c
            L26:
                wn.m.b(r7)
                nf.z r7 = nf.z.this
                wo.f r7 = nf.z.L(r7)
                java.util.List r1 = xn.s.k()
                r6.f43380w = r5
                java.lang.Object r7 = r7.r(r1, r6)
                if (r7 != r0) goto L3c
                return r0
            L3c:
                nf.z r7 = nf.z.this
                xo.s r7 = nf.z.O(r7)
                r6.f43380w = r4
                java.lang.Object r7 = r7.emit(r2, r6)
                if (r7 != r0) goto L4b
                return r0
            L4b:
                nf.z r7 = nf.z.this
                nd.s0 r7 = nf.z.I(r7)
                r6.f43380w = r3
                java.lang.Object r7 = r7.d(r2, r6)
                if (r7 != r0) goto L5a
                return r0
            L5a:
                wn.v r7 = wn.v.f59242a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: nf.z.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$35", f = "PlayerStore.kt", l = {888}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43382w;

        public b0(ao.d<? super b0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43382w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.C1;
                wn.v vVar = wn.v.f59242a;
                this.f43382w = 1;
                if (fVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            z.this.f43372z.p(null);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$onEvent$7", f = "PlayerStore.kt", l = {480}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43384w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.u1 f43386y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b1(q0.u1 u1Var, ao.d<? super b1> dVar) {
            super(2, dVar);
            this.f43386y = u1Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b1(this.f43386y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43384w;
            if (i10 == 0) {
                wn.m.b(obj);
                te.c cVar = (te.c) z.this.B.f();
                if (cVar != null) {
                    cVar.setLinkedLive(this.f43386y.a());
                }
                wo.f fVar = z.this.X0;
                LinkedLive a10 = this.f43386y.a();
                this.f43384w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$11", f = "PlayerStore.kt", l = {537}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43387w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.i0 f43389y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q0.i0 i0Var, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f43389y = i0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f43389y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43387w;
            if (i10 == 0) {
                wn.m.b(obj);
                nd.s0 s0Var = z.this.K1;
                String orientationV2 = this.f43389y.a().getOrientationV2();
                this.f43387w = 1;
                if (s0Var.d(orientationV2, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$36", f = "PlayerStore.kt", l = {898, 899}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43390w;

        public c0(ao.d<? super c0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43390w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.f43360u1;
                List k10 = xn.s.k();
                this.f43390w = 1;
                if (fVar.r(k10, this) == c10) {
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
            wo.f fVar2 = z.this.D1;
            wn.v vVar = wn.v.f59242a;
            this.f43390w = 2;
            if (fVar2.r(vVar, this) == c10) {
                return c10;
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$onEvent$8", f = "PlayerStore.kt", l = {772}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43392w;

        public c1(ao.d<? super c1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43392w;
            if (i10 == 0) {
                wn.m.b(obj);
                nd.s0 s0Var = z.this.Y0;
                wn.v vVar = wn.v.f59242a;
                this.f43392w = 1;
                if (s0Var.d(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$13", f = "PlayerStore.kt", l = {553}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43394w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.k0 f43396y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q0.k0 k0Var, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f43396y = k0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f43396y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43394w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.J;
                LiveStreamingUrlResponse a10 = this.f43396y.a();
                this.f43394w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$37", f = "PlayerStore.kt", l = {907}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43397w;

        public d0(ao.d<? super d0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43397w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.D1;
                wn.v vVar = wn.v.f59242a;
                this.f43397w = 1;
                if (fVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$onEvent$9", f = "PlayerStore.kt", l = {779}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43399w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.c f43401y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d1(q0.c cVar, ao.d<? super d1> dVar) {
            super(2, dVar);
            this.f43401y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d1(this.f43401y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43399w;
            if (i10 == 0) {
                wn.m.b(obj);
                nd.s0 s0Var = z.this.Z0;
                MRError a10 = this.f43401y.a();
                this.f43399w = 1;
                if (s0Var.d(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$14", f = "PlayerStore.kt", l = {561}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43402w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.j0 f43404y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(q0.j0 j0Var, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f43404y = j0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f43404y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43402w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.K;
                MRError a10 = this.f43404y.a();
                this.f43402w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$38", f = "PlayerStore.kt", l = {925}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43405w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l.h f43407y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(l.h hVar, ao.d<? super e0> dVar) {
            super(2, dVar);
            this.f43407y = hVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e0(this.f43407y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43405w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.B1;
                CollabInviteCanceledByStreamerBcsvrResponse b10 = this.f43407y.b();
                this.f43405w = 1;
                if (fVar.r(b10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$15", f = "PlayerStore.kt", l = {629}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43408w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.w1 f43410y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(q0.w1 w1Var, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f43410y = w1Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f43410y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43408w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.f43333i0;
                MRError a10 = this.f43410y.a();
                this.f43408w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$39", f = "PlayerStore.kt", l = {948}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43411w;

        public f0(ao.d<? super f0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43411w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.s sVar = z.this.I1;
                this.f43411w = 1;
                if (sVar.emit(null, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$16", f = "PlayerStore.kt", l = {665}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43413w;

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
            Object c10 = bo.c.c();
            int i10 = this.f43413w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.f43349p0;
                wn.v vVar = wn.v.f59242a;
                this.f43413w = 1;
                if (fVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$3", f = "PlayerStore.kt", l = {341}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class g0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43415w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.a1 f43417y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(q0.a1 a1Var, ao.d<? super g0> dVar) {
            super(2, dVar);
            this.f43417y = a1Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g0(this.f43417y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43415w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.I0;
                r2 a10 = this.f43417y.a();
                this.f43415w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$17", f = "PlayerStore.kt", l = {672}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43418w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.s0 f43420y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(q0.s0 s0Var, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f43420y = s0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f43420y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43418w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.f43351q0;
                MRError a10 = this.f43420y.a();
                this.f43418w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$40", f = "PlayerStore.kt", l = {962, 963}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class h0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43421w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l.h1 f43423y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(l.h1 h1Var, ao.d<? super h0> dVar) {
            super(2, dVar);
            this.f43423y = h1Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h0(this.f43423y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43421w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = z.this.G1;
                ShooterMatchingStateChangedBcsvrResponse b10 = this.f43423y.b();
                this.f43421w = 1;
                if (rVar.emit(b10, this) == c10) {
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
            xo.s sVar = z.this.I1;
            ShooterMatchingStateChangedBcsvrResponse b11 = this.f43423y.b();
            this.f43421w = 2;
            if (sVar.emit(b11, this) == c10) {
                return c10;
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$18", f = "PlayerStore.kt", l = {687}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43424w;

        public i(ao.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43424w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.f43357t0;
                wn.v vVar = wn.v.f59242a;
                this.f43424w = 1;
                if (fVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$41", f = "PlayerStore.kt", l = {974}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class i0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43426w;

        public i0(ao.d<? super i0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43426w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = z.this.L1;
                wn.v vVar = wn.v.f59242a;
                this.f43426w = 1;
                if (rVar.emit(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$19", f = "PlayerStore.kt", l = {695}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43428w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.u0 f43430y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(q0.u0 u0Var, ao.d<? super j> dVar) {
            super(2, dVar);
            this.f43430y = u0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(this.f43430y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43428w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.f43359u0;
                MRError a10 = this.f43430y.a();
                this.f43428w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$42", f = "PlayerStore.kt", l = {982}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class j0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43431w;

        public j0(ao.d<? super j0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43431w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = z.this.N1;
                wn.v vVar = wn.v.f59242a;
                this.f43431w = 1;
                if (rVar.emit(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$1", f = "PlayerStore.kt", l = {319}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43433w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.o f43435y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(q0.o oVar, ao.d<? super k> dVar) {
            super(2, dVar);
            this.f43435y = oVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(this.f43435y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43433w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.G0;
                Integer d10 = co.b.d(this.f43435y.a());
                this.f43433w = 1;
                if (fVar.r(d10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$43", f = "PlayerStore.kt", l = {989}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class k0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43436w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.w0 f43438y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(q0.w0 w0Var, ao.d<? super k0> dVar) {
            super(2, dVar);
            this.f43438y = w0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k0(this.f43438y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43436w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = z.this.P1;
                wn.k a10 = wn.q.a(co.b.d(this.f43438y.a()), this.f43438y.b());
                this.f43436w = 1;
                if (rVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$20", f = "PlayerStore.kt", l = {704}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class l extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43439w;

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
            int i10 = this.f43439w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.f43361v0;
                wn.v vVar = wn.v.f59242a;
                this.f43439w = 1;
                if (fVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$45", f = "PlayerStore.kt", l = {999}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class l0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43441w;

        public l0(ao.d<? super l0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new l0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43441w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = z.this.U0;
                wn.v vVar = wn.v.f59242a;
                this.f43441w = 1;
                if (rVar.emit(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$21", f = "PlayerStore.kt", l = {711}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class m extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43443w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.p f43445y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(q0.p pVar, ao.d<? super m> dVar) {
            super(2, dVar);
            this.f43445y = pVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new m(this.f43445y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43443w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.f43364w0;
                MRError a10 = this.f43445y.a();
                this.f43443w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$47", f = "PlayerStore.kt", l = {AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class m0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43446w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.z f43448y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(q0.z zVar, ao.d<? super m0> dVar) {
            super(2, dVar);
            this.f43448y = zVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new m0(this.f43448y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43446w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = z.this.T1;
                wn.k a10 = wn.q.a(co.b.a(this.f43448y.a().isAppEvent()), co.b.d(this.f43448y.a().getEventId()));
                this.f43446w = 1;
                if (rVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$22", f = "PlayerStore.kt", l = {718}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class n extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43449w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.l f43451y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(q0.l lVar, ao.d<? super n> dVar) {
            super(2, dVar);
            this.f43451y = lVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new n(this.f43451y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((n) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43449w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.f43373z0;
                MRError a10 = this.f43451y.a();
                this.f43449w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$48$2", f = "PlayerStore.kt", l = {1044}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class n0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43452w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ GiftRankingBcsvrResponse f43454y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(GiftRankingBcsvrResponse giftRankingBcsvrResponse, ao.d<? super n0> dVar) {
            super(2, dVar);
            this.f43454y = giftRankingBcsvrResponse;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new n0(this.f43454y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((n0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43452w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = z.this.T1;
                wn.k a10 = wn.q.a(co.b.a(this.f43454y.isAppEvent()), co.b.d(this.f43454y.getEventId()));
                this.f43452w = 1;
                if (rVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$23", f = "PlayerStore.kt", l = {726}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class o extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43455w;

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
            int i10 = this.f43455w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.f43367x0;
                wn.v vVar = wn.v.f59242a;
                this.f43455w = 1;
                if (fVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$49", f = "PlayerStore.kt", l = {1054}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class o0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43457w;

        public o0(ao.d<? super o0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new o0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((o0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43457w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = z.this.V1;
                wn.v vVar = wn.v.f59242a;
                this.f43457w = 1;
                if (rVar.emit(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$24", f = "PlayerStore.kt", l = {733}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class p extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43459w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.m f43461y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(q0.m mVar, ao.d<? super p> dVar) {
            super(2, dVar);
            this.f43461y = mVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new p(this.f43461y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((p) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43459w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.f43370y0;
                MRError a10 = this.f43461y.a();
                this.f43459w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$4", f = "PlayerStore.kt", l = {349}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class p0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43462w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ q0.b1 f43463x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ z f43464y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(q0.b1 b1Var, z zVar, ao.d<? super p0> dVar) {
            super(2, dVar);
            this.f43463x = b1Var;
            this.f43464y = zVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new p0(this.f43463x, this.f43464y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((p0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43462w;
            if (i10 == 0) {
                wn.m.b(obj);
                GiftItem a10 = this.f43463x.a();
                if (a10 != null) {
                    wo.f fVar = this.f43464y.J0;
                    this.f43462w = 1;
                    if (fVar.r(a10, this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$25", f = "PlayerStore.kt", l = {741}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class q extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43465w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ q0.l1 f43466x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ z f43467y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(q0.l1 l1Var, z zVar, ao.d<? super q> dVar) {
            super(2, dVar);
            this.f43466x = l1Var;
            this.f43467y = zVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new q(this.f43466x, this.f43467y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((q) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43465w;
            if (i10 == 0) {
                wn.m.b(obj);
                if (!jo.p.c(this.f43466x.a(), this.f43467y.Y0())) {
                    wo.q qVar = this.f43467y.B0;
                    String a10 = this.f43466x.a();
                    this.f43465w = 1;
                    if (qVar.r(a10, this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$50", f = "PlayerStore.kt", l = {1061}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class q0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43468w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.c0 f43470y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(q0.c0 c0Var, ao.d<? super q0> dVar) {
            super(2, dVar);
            this.f43470y = c0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new q0(this.f43470y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((q0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43468w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = z.this.X1;
                wn.k a10 = wn.q.a(this.f43470y.a(), co.b.a(this.f43470y.b()));
                this.f43468w = 1;
                if (rVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$26", f = "PlayerStore.kt", l = {749}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class r extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43471w;

        public r(ao.d<? super r> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new r(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((r) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43471w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.C0;
                wn.v vVar = wn.v.f59242a;
                this.f43471w = 1;
                if (fVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$53", f = "PlayerStore.kt", l = {1079}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class r0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43473w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.v f43475y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(q0.v vVar, ao.d<? super r0> dVar) {
            super(2, dVar);
            this.f43475y = vVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new r0(this.f43475y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((r0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43473w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = z.this.Z1;
                EmomoQuestGachaTicket a10 = this.f43475y.a();
                this.f43473w = 1;
                if (rVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$27", f = "PlayerStore.kt", l = {756}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class s extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43476w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i1.q f43478y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(i1.q qVar, ao.d<? super s> dVar) {
            super(2, dVar);
            this.f43478y = qVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new s(this.f43478y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((s) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43476w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.D0;
                MRError a10 = this.f43478y.a();
                this.f43476w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$54", f = "PlayerStore.kt", l = {1087}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class s0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43479w;

        public s0(ao.d<? super s0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new s0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((s0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43479w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = z.this.f43314b2;
                wn.v vVar = wn.v.f59242a;
                this.f43479w = 1;
                if (rVar.emit(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$28", f = "PlayerStore.kt", l = {764}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class t extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43481w;

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
            int i10 = this.f43481w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.f43338j2;
                wn.v vVar = wn.v.f59242a;
                this.f43481w = 1;
                if (fVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$55", f = "PlayerStore.kt", l = {1094}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class t0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43483w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.e f43485y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(q0.e eVar, ao.d<? super t0> dVar) {
            super(2, dVar);
            this.f43485y = eVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new t0(this.f43485y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((t0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43483w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = z.this.f43320d2;
                MRError a10 = this.f43485y.a();
                this.f43483w = 1;
                if (rVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$29", f = "PlayerStore.kt", l = {791}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class u extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43486w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.o0 f43488y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(q0.o0 o0Var, ao.d<? super u> dVar) {
            super(2, dVar);
            this.f43488y = o0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new u(this.f43488y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((u) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43486w;
            if (i10 == 0) {
                wn.m.b(obj);
                nd.s0 s0Var = z.this.f43325f1;
                EventNoticeResponse a10 = this.f43488y.a();
                this.f43486w = 1;
                if (s0Var.d(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$58", f = "PlayerStore.kt", l = {1126}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class u0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43489w;

        public u0(ao.d<? super u0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new u0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((u0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43489w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = z.this.f43326f2;
                wn.v vVar = wn.v.f59242a;
                this.f43489w = 1;
                if (rVar.emit(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$2", f = "PlayerStore.kt", l = {328}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class v extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43491w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.j1 f43493y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(q0.j1 j1Var, ao.d<? super v> dVar) {
            super(2, dVar);
            this.f43493y = j1Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new v(this.f43493y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((v) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43491w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.H0;
                List<r2> a10 = this.f43493y.a();
                this.f43491w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$onEvent$1", f = "PlayerStore.kt", l = {360}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class v0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43494w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.d0 f43496y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(q0.d0 d0Var, ao.d<? super v0> dVar) {
            super(2, dVar);
            this.f43496y = d0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new v0(this.f43496y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((v0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43494w;
            if (i10 == 0) {
                wn.m.b(obj);
                if (!jo.p.c(z.this.K1.b(), this.f43496y.a().getOrientationV2())) {
                    nd.s0 s0Var = z.this.K1;
                    String orientationV2 = this.f43496y.a().getOrientationV2();
                    this.f43494w = 1;
                    if (s0Var.d(orientationV2, this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$30", f = "PlayerStore.kt", l = {798}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class w extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43497w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.C0719q0 f43499y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(q0.C0719q0 c0719q0, ao.d<? super w> dVar) {
            super(2, dVar);
            this.f43499y = c0719q0;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new w(this.f43499y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((w) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43497w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.P;
                MRError a10 = this.f43499y.a();
                this.f43497w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$onEvent$2", f = "PlayerStore.kt", l = {368}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class w0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43500w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.z0 f43502y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(q0.z0 z0Var, ao.d<? super w0> dVar) {
            super(2, dVar);
            this.f43502y = z0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new w0(this.f43502y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((w0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43500w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.M0;
                QuizMessage a10 = this.f43502y.a();
                this.f43500w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$31", f = "PlayerStore.kt", l = {832}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class x extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43503w;

        public x(ao.d<? super x> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new x(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((x) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43503w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.f43328g1;
                wn.v vVar = wn.v.f59242a;
                this.f43503w = 1;
                if (fVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$onEvent$3", f = "PlayerStore.kt", l = {375}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class x0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43505w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.y0 f43507y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(q0.y0 y0Var, ao.d<? super x0> dVar) {
            super(2, dVar);
            this.f43507y = y0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new x0(this.f43507y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((x0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43505w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.N0;
                QuizMessage a10 = this.f43507y.a();
                this.f43505w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$32", f = "PlayerStore.kt", l = {856}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class y extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43508w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.m0 f43510y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(q0.m0 m0Var, ao.d<? super y> dVar) {
            super(2, dVar);
            this.f43510y = m0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new y(this.f43510y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((y) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43508w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.f43360u1;
                List<LiveViewingUser> a10 = this.f43510y.a();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : a10) {
                    if (jo.p.c(((LiveViewingUser) obj2).isStartedCollab(), co.b.a(true))) {
                        arrayList.add(obj2);
                    }
                }
                this.f43508w = 1;
                if (fVar.r(arrayList, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$onEvent$4", f = "PlayerStore.kt", l = {455}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class y0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43511w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.m1 f43513y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(q0.m1 m1Var, ao.d<? super y0> dVar) {
            super(2, dVar);
            this.f43513y = m1Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new y0(this.f43513y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((y0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43511w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.W0;
                String a10 = this.f43513y.a();
                this.f43511w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$on$33", f = "PlayerStore.kt", l = {872}, m = "invokeSuspend")
    /* renamed from: nf.z$z  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0636z extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43514w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q0.a f43516y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0636z(q0.a aVar, ao.d<? super C0636z> dVar) {
            super(2, dVar);
            this.f43516y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C0636z(this.f43516y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C0636z) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43514w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.A1;
                jf.h a10 = this.f43516y.a();
                this.f43514w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.PlayerStore$onEvent$5", f = "PlayerStore.kt", l = {463}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class z0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43517w;

        public z0(ao.d<? super z0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new z0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((z0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43517w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = z.this.O0;
                wn.v vVar = wn.v.f59242a;
                this.f43517w = 1;
                if (fVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    public z(q8.a aVar, hf.s sVar, kf.x xVar) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(sVar, "getCurrentTimeMillis");
        jo.p.h(xVar, "userPreference");
        this.f43363w = sVar;
        this.f43366x = xVar;
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.f43369y = c10.plus(b10);
        aVar.b(this);
        androidx.lifecycle.e0<String> e0Var = new androidx.lifecycle.e0<>(null);
        this.f43372z = e0Var;
        this.A = e0Var;
        androidx.lifecycle.e0<te.c> e0Var2 = new androidx.lifecycle.e0<>(null);
        this.B = e0Var2;
        this.C = e0Var2;
        androidx.lifecycle.e0<te.c> e0Var3 = new androidx.lifecycle.e0<>(null);
        this.D = e0Var3;
        this.E = e0Var3;
        Boolean bool = Boolean.FALSE;
        androidx.lifecycle.e0<Boolean> e0Var4 = new androidx.lifecycle.e0<>(bool);
        this.F = e0Var4;
        this.G = e0Var4;
        androidx.lifecycle.e0<MRError> e0Var5 = new androidx.lifecycle.e0<>(null);
        this.H = e0Var5;
        this.I = e0Var5;
        this.J = wo.g.a(-2);
        this.K = wo.g.a(-2);
        androidx.lifecycle.e0<Boolean> e0Var6 = new androidx.lifecycle.e0<>(bool);
        this.L = e0Var6;
        this.M = e0Var6;
        androidx.lifecycle.e0<Boolean> e0Var7 = new androidx.lifecycle.e0<>(null);
        this.N = e0Var7;
        this.O = e0Var7;
        this.P = wo.g.a(-2);
        androidx.lifecycle.e0<jf.f> e0Var8 = new androidx.lifecycle.e0<>(new jf.f(0, 0));
        this.Q = e0Var8;
        this.R = e0Var8;
        androidx.lifecycle.e0<Integer> e0Var9 = new androidx.lifecycle.e0<>(0);
        this.S = e0Var9;
        this.T = e0Var9;
        androidx.lifecycle.e0<String> e0Var10 = new androidx.lifecycle.e0<>("");
        this.U = e0Var10;
        this.V = e0Var10;
        androidx.lifecycle.e0<wn.k<Boolean, Graph.Follow>> e0Var11 = new androidx.lifecycle.e0<>(null);
        this.W = e0Var11;
        this.X = e0Var11;
        androidx.lifecycle.e0<Boolean> e0Var12 = new androidx.lifecycle.e0<>(bool);
        this.Y = e0Var12;
        this.Z = e0Var12;
        androidx.lifecycle.e0<App.AppParams> e0Var13 = new androidx.lifecycle.e0<>(null);
        this.f43309a0 = e0Var13;
        this.f43312b0 = e0Var13;
        androidx.lifecycle.e0<Boolean> e0Var14 = new androidx.lifecycle.e0<>(bool);
        this.f43315c0 = e0Var14;
        this.f43318d0 = e0Var14;
        androidx.lifecycle.e0<List<LiveViewingUser>> e0Var15 = new androidx.lifecycle.e0<>(xn.s.k());
        this.f43321e0 = e0Var15;
        this.f43324f0 = e0Var15;
        androidx.lifecycle.e0<Integer> e0Var16 = new androidx.lifecycle.e0<>(0);
        this.f43327g0 = e0Var16;
        this.f43330h0 = e0Var16;
        this.f43333i0 = wo.g.a(-2);
        androidx.lifecycle.e0<UserProfile> e0Var17 = new androidx.lifecycle.e0<>(null);
        this.f43336j0 = e0Var17;
        this.f43339k0 = e0Var17;
        androidx.lifecycle.e0<i9.a> e0Var18 = new androidx.lifecycle.e0<>();
        this.f43341l0 = e0Var18;
        this.f43343m0 = e0Var18;
        androidx.lifecycle.e0<AppUserDetailResponse> e0Var19 = new androidx.lifecycle.e0<>(null);
        this.f43345n0 = e0Var19;
        this.f43347o0 = e0Var19;
        this.f43349p0 = wo.g.a(-2);
        this.f43351q0 = wo.g.a(-2);
        androidx.lifecycle.e0<Boolean> e0Var20 = new androidx.lifecycle.e0<>(bool);
        this.f43353r0 = e0Var20;
        this.f43355s0 = e0Var20;
        this.f43357t0 = wo.g.a(-2);
        this.f43359u0 = wo.g.a(-2);
        this.f43361v0 = wo.g.a(-2);
        this.f43364w0 = wo.g.a(-2);
        this.f43367x0 = wo.g.a(-2);
        this.f43370y0 = wo.g.a(-2);
        wo.f<MRError> a10 = wo.g.a(-2);
        this.f43373z0 = a10;
        this.A0 = a10.g();
        this.B0 = new wo.q<>(null);
        this.C0 = wo.g.a(-2);
        this.D0 = wo.g.a(-2);
        androidx.lifecycle.e0<List<r2>> e0Var21 = new androidx.lifecycle.e0<>();
        this.E0 = e0Var21;
        this.F0 = e0Var21;
        this.G0 = wo.g.a(-2);
        this.H0 = wo.g.a(-2);
        this.I0 = wo.g.a(-2);
        this.J0 = wo.g.a(-2);
        androidx.lifecycle.e0<wn.k<Boolean, Boolean>> e0Var22 = new androidx.lifecycle.e0<>();
        this.K0 = e0Var22;
        this.L0 = e0Var22;
        this.M0 = wo.g.a(-2);
        this.N0 = wo.g.a(-2);
        this.O0 = wo.g.a(-2);
        androidx.lifecycle.e0<List<jf.s>> e0Var23 = new androidx.lifecycle.e0<>();
        this.P0 = e0Var23;
        this.Q0 = e0Var23;
        this.R0 = wo.g.a(-2);
        androidx.lifecycle.e0<List<RankingUser>> e0Var24 = new androidx.lifecycle.e0<>();
        this.S0 = e0Var24;
        this.T0 = e0Var24;
        xo.r<wn.v> b11 = xo.y.b(0, 0, null, 7, null);
        this.U0 = b11;
        this.V0 = b11;
        this.W0 = wo.g.a(-2);
        this.X0 = wo.g.a(-2);
        this.Y0 = new nd.s0<>();
        this.Z0 = new nd.s0<>();
        androidx.lifecycle.e0<Boolean> e0Var25 = new androidx.lifecycle.e0<>(bool);
        this.f43310a1 = e0Var25;
        this.f43313b1 = e0Var25;
        this.f43316c1 = wo.g.a(-2);
        this.f43325f1 = new nd.s0<>();
        this.f43328g1 = wo.g.a(-2);
        androidx.lifecycle.e0<Integer> e0Var26 = new androidx.lifecycle.e0<>(0);
        this.f43334i1 = e0Var26;
        this.f43337j1 = e0Var26;
        androidx.lifecycle.e0<List<jf.q>> e0Var27 = new androidx.lifecycle.e0<>();
        this.f43340k1 = e0Var27;
        this.f43342l1 = e0Var27;
        androidx.lifecycle.e0<String> e0Var28 = new androidx.lifecycle.e0<>();
        this.f43344m1 = e0Var28;
        this.f43346n1 = e0Var28;
        androidx.lifecycle.e0<Boolean> e0Var29 = new androidx.lifecycle.e0<>(bool);
        this.f43348o1 = e0Var29;
        this.f43350p1 = e0Var29;
        androidx.lifecycle.e0<Boolean> e0Var30 = new androidx.lifecycle.e0<>(bool);
        this.f43352q1 = e0Var30;
        this.f43354r1 = e0Var30;
        androidx.lifecycle.e0<UserLevel> e0Var31 = new androidx.lifecycle.e0<>(null);
        this.f43356s1 = e0Var31;
        this.f43358t1 = e0Var31;
        this.f43360u1 = wo.g.a(-2);
        androidx.lifecycle.e0<CollabInvitation> e0Var32 = new androidx.lifecycle.e0<>(null);
        this.f43362v1 = e0Var32;
        this.f43365w1 = e0Var32;
        androidx.lifecycle.e0<Boolean> e0Var33 = new androidx.lifecycle.e0<>(bool);
        this.f43368x1 = e0Var33;
        this.f43371y1 = e0Var33;
        this.f43374z1 = wo.g.a(-2);
        this.A1 = wo.g.a(-2);
        this.B1 = wo.g.a(-2);
        this.C1 = wo.g.a(-2);
        this.D1 = wo.g.a(-2);
        androidx.lifecycle.e0<ShooterMemberStateChangedBcsvrResponse> e0Var34 = new androidx.lifecycle.e0<>(null);
        this.E1 = e0Var34;
        this.F1 = e0Var34;
        xo.r<ShooterMatchingStateChangedBcsvrResponse> b12 = xo.y.b(0, 0, null, 7, null);
        this.G1 = b12;
        this.H1 = b12;
        xo.s<ShooterMatchingStateChangedBcsvrResponse> a11 = xo.i0.a(null);
        this.I1 = a11;
        this.J1 = a11;
        this.K1 = new nd.s0<>();
        xo.r<wn.v> b13 = xo.y.b(0, 0, null, 7, null);
        this.L1 = b13;
        this.M1 = b13;
        xo.r<wn.v> b14 = xo.y.b(0, 0, null, 7, null);
        this.N1 = b14;
        this.O1 = b14;
        xo.r<wn.k<Integer, LiveCommentResponse>> b15 = xo.y.b(0, 0, null, 7, null);
        this.P1 = b15;
        this.Q1 = b15;
        androidx.lifecycle.e0<List<jf.u>> e0Var35 = new androidx.lifecycle.e0<>(xn.s.k());
        this.R1 = e0Var35;
        this.S1 = e0Var35;
        xo.r<wn.k<Boolean, Integer>> b16 = xo.y.b(0, 0, null, 7, null);
        this.T1 = b16;
        this.U1 = b16;
        xo.r<wn.v> b17 = xo.y.b(0, 0, null, 7, null);
        this.V1 = b17;
        this.W1 = b17;
        xo.r<wn.k<LiveGameStartResponse, Boolean>> b18 = xo.y.b(0, 0, null, 7, null);
        this.X1 = b18;
        this.Y1 = b18;
        xo.r<EmomoQuestGachaTicket> b19 = xo.y.b(0, 0, null, 7, null);
        this.Z1 = b19;
        this.f43311a2 = xo.e.b(b19);
        xo.r<wn.v> b20 = xo.y.b(0, 0, null, 7, null);
        this.f43314b2 = b20;
        this.f43317c2 = xo.e.b(b20);
        xo.r<MRError> b21 = xo.y.b(0, 0, null, 7, null);
        this.f43320d2 = b21;
        this.f43323e2 = b21;
        xo.r<wn.v> b22 = xo.y.b(0, 0, null, 7, null);
        this.f43326f2 = b22;
        this.f43329g2 = b22;
        androidx.lifecycle.e0<w1> e0Var36 = new androidx.lifecycle.e0<>(null);
        this.f43332h2 = e0Var36;
        this.f43335i2 = e0Var36;
        this.f43338j2 = wo.g.a(-2);
    }

    public final xo.c<MRError> A0() {
        return xo.e.a(this.f43374z1);
    }

    public final wo.x<wn.v> A1() {
        return this.Y0.c();
    }

    public final wo.x<MRError> B0() {
        return this.A0;
    }

    public final LiveData<Integer> B1() {
        return this.T;
    }

    public final wo.x<MRError> C0() {
        return this.f43370y0.g();
    }

    public final wo.x<LinkedLive> C1() {
        return this.X0.g();
    }

    public final wo.x<MRError> D0() {
        return this.f43364w0.g();
    }

    public final LiveData<AppUserDetailResponse> D1() {
        return this.f43347o0;
    }

    public final wo.x<MRError> E0() {
        return this.f43351q0.g();
    }

    public final LiveData<List<LiveViewingUser>> E1() {
        return this.f43324f0;
    }

    public final wo.x<MRError> F0() {
        return this.R0.g();
    }

    public final wo.x<MRError> F1() {
        return this.f43333i0.g();
    }

    public final wo.x<MRError> G0() {
        return this.f43359u0.g();
    }

    public final LiveData<Boolean> G1() {
        return this.f43354r1;
    }

    public final wo.x<MRError> H0() {
        return this.Z0.c();
    }

    public final LiveData<Boolean> H1() {
        return this.f43350p1;
    }

    public final xo.w<EmomoQuestGachaTicket> I0() {
        return this.f43311a2;
    }

    public final LiveData<Boolean> I1() {
        return this.f43371y1;
    }

    public final xo.w<wn.v> J0() {
        return this.V0;
    }

    public final LiveData<Boolean> J1() {
        return this.G;
    }

    public final wo.x<MRError> K0() {
        return this.P.g();
    }

    public final LiveData<Boolean> K1() {
        return this.M;
    }

    public final LiveData<wn.k<Boolean, Graph.Follow>> L0() {
        return this.X;
    }

    public final LiveData<Boolean> L1() {
        return this.f43355s0;
    }

    public final wo.x<GiftItem> M0() {
        return this.J0.g();
    }

    public final LiveData<Boolean> M1() {
        return this.f43318d0;
    }

    public final LiveData<List<jf.s>> N0() {
        return this.Q0;
    }

    public final LiveData<Boolean> N1() {
        return this.Z;
    }

    public final LiveData<List<jf.u>> O0() {
        return this.S1;
    }

    public final LiveData<Boolean> O1() {
        return this.f43313b1;
    }

    public final LiveData<List<RankingUser>> P0() {
        return this.T0;
    }

    public final boolean P1() {
        Boolean f10 = this.f43350p1.f();
        if (f10 == null) {
            f10 = Boolean.FALSE;
        }
        boolean booleanValue = f10.booleanValue();
        Boolean f11 = this.f43354r1.f();
        if (f11 == null) {
            f11 = Boolean.FALSE;
        }
        return booleanValue | f11.booleanValue();
    }

    public final wo.x<MRError> Q0() {
        return this.D0.g();
    }

    public final wo.x<wn.v> R0() {
        return this.C0.g();
    }

    public final LiveData<te.c> S0() {
        return this.E;
    }

    public final LiveData<w1> T0() {
        return this.f43335i2;
    }

    public final wo.x<MRError> U0() {
        return this.K.g();
    }

    public final wo.x<LiveStreamingUrlResponse> V0() {
        return this.J.g();
    }

    public final LiveData<String> W0() {
        return this.V;
    }

    public final xo.c<wn.v> X0() {
        return xo.e.a(this.C1);
    }

    public final String Y0() {
        return this.B0.e();
    }

    public final wo.x<String> Z0() {
        return this.B0.g();
    }

    public final xo.w<wn.v> a1() {
        return this.W1;
    }

    public final xo.c<jf.h> b0() {
        return xo.e.a(this.A1);
    }

    public final boolean b1() {
        return this.f43331h1;
    }

    public final xo.w<wn.v> c0() {
        return this.M1;
    }

    public final wo.x<r2> c1() {
        return this.I0.g();
    }

    public final xo.w<MRError> d0() {
        return this.f43323e2;
    }

    public final LiveData<Integer> d1() {
        return this.f43330h0;
    }

    public final xo.w<wn.k<Boolean, Integer>> e0() {
        return this.U1;
    }

    public final String e1() {
        return this.K1.b();
    }

    public final List<EventBannerResponse> f0() {
        EventNoticeResponse b10 = this.f43325f1.b();
        if (b10 != null) {
            return b10.getBanners();
        }
        return null;
    }

    public final xo.c<String> f1() {
        return this.K1.a();
    }

    public final xo.w<wn.v> g0() {
        return this.f43329g2;
    }

    public final LiveData<Boolean> g1() {
        return this.O;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f43369y;
    }

    public final LiveData<jf.f> h0() {
        return this.R;
    }

    public final LiveData<UserProfile> h1() {
        return this.f43339k0;
    }

    public final wo.x<wn.v> i0() {
        return this.f43338j2.g();
    }

    public final LiveData<i9.a> i1() {
        return this.f43343m0;
    }

    public final xo.c<CollabInviteCanceledByStreamerBcsvrResponse> j0() {
        return xo.e.a(this.B1);
    }

    public final LiveData<te.c> j1() {
        return this.C;
    }

    public final wo.x<wn.v> k0() {
        return this.f43328g1.g();
    }

    public final xo.w<wn.k<Integer, LiveCommentResponse>> k1() {
        return this.Q1;
    }

    public final LiveData<CollabInvitation> l0() {
        return this.f43365w1;
    }

    public final wo.x<List<r2>> l1() {
        return this.H0.g();
    }

    public final LiveData<wn.k<Boolean, Boolean>> m0() {
        return this.L0;
    }

    public final long m1() {
        return this.f43322e1;
    }

    public final xo.c<wn.v> n0() {
        return xo.e.a(this.D1);
    }

    public final LiveData<ShooterMemberStateChangedBcsvrResponse> n1() {
        return this.F1;
    }

    public final wo.x<List<LiveViewingUser>> o0() {
        return this.f43360u1.g();
    }

    public final xo.w<ShooterMatchingStateChangedBcsvrResponse> o1() {
        return this.H1;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.c1 c1Var) {
        jo.p.h(c1Var, "event");
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.e1 e1Var) {
        jo.p.h(e1Var, "event");
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.o oVar) {
        jo.p.h(oVar, "event");
        uo.l.d(this, null, null, new k(oVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(q0.d0 d0Var) {
        jo.p.h(d0Var, "event");
        this.f43309a0.p(d0Var.a().getApp());
        this.K0.p(wn.q.a(Boolean.valueOf(d0Var.a().getCollabEnabled()), Boolean.valueOf(d0Var.a().getCollabHasVacancy())));
        uo.l.d(this, null, null, new v0(d0Var, null), 3, null);
    }

    public final wo.x<Integer> p0() {
        return this.G0.g();
    }

    public final xo.g0<ShooterMatchingStateChangedBcsvrResponse> p1() {
        return this.J1;
    }

    public final LiveData<List<r2>> q0() {
        return this.F0;
    }

    public final wo.x<String> q1() {
        return this.W0.g();
    }

    public final LiveData<App.AppParams> r0() {
        return this.f43312b0;
    }

    public final wo.x<EventNoticeResponse> r1() {
        return this.f43325f1.c();
    }

    public final LiveData<String> s0() {
        return this.A;
    }

    public final wo.x<QuizMessage> s1() {
        return this.N0.g();
    }

    public final xo.w<wn.v> t0() {
        return this.O1;
    }

    public final boolean t1() {
        return this.f43319d1;
    }

    public final wo.x<wn.v> u0() {
        return this.O0.g();
    }

    public final wo.x<QuizMessage> u1() {
        return this.M0.g();
    }

    public final LiveData<String> v0() {
        return this.f43346n1;
    }

    public final xo.w<wn.k<LiveGameStartResponse, Boolean>> v1() {
        return this.Y1;
    }

    public final LiveData<List<jf.q>> w0() {
        return this.f43342l1;
    }

    public final wo.x<wn.v> w1() {
        return this.f43367x0.g();
    }

    public final LiveData<Integer> x0() {
        return this.f43337j1;
    }

    public final wo.x<wn.v> x1() {
        return this.f43361v0.g();
    }

    public final wo.x<wn.v> y0() {
        return this.f43316c1.g();
    }

    public final wo.x<wn.v> y1() {
        return this.f43349p0.g();
    }

    public final LiveData<MRError> z0() {
        return this.I;
    }

    public final wo.x<wn.v> z1() {
        return this.f43357t0.g();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.j1 j1Var) {
        jo.p.h(j1Var, "event");
        this.E0.p(j1Var.a());
        uo.l.d(this, null, null, new v(j1Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.a1 a1Var) {
        jo.p.h(a1Var, "event");
        List d10 = xn.r.d(a1Var.a());
        List<r2> f10 = this.E0.f();
        if (f10 == null) {
            f10 = xn.s.k();
        }
        List<r2> o02 = xn.a0.o0(d10, f10);
        if (o02.size() > 1000) {
            this.E0.p(o02.subList(0, 1000));
        } else {
            this.E0.p(o02);
        }
        uo.l.d(this, null, null, new g0(a1Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(q0.z0 z0Var) {
        jo.p.h(z0Var, "event");
        uo.l.d(this, null, null, new w0(z0Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(q0.y0 y0Var) {
        jo.p.h(y0Var, "event");
        uo.l.d(this, null, null, new x0(y0Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(q0.y yVar) {
        jo.p.h(yVar, "event");
        this.S0.p(yVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(q0.m1 m1Var) {
        jo.p.h(m1Var, "event");
        uo.l.d(this, null, null, new y0(m1Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(q0.x0 x0Var) {
        jo.p.h(x0Var, "event");
        uo.l.d(this, null, null, new z0(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.b1 b1Var) {
        jo.p.h(b1Var, "event");
        uo.l.d(this, null, null, new p0(b1Var, this, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(q0.s sVar) {
        jo.p.h(sVar, "event");
        this.f43319d1 = true;
        this.f43322e1 = sVar.a();
        uo.l.d(this, null, null, new a1(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.t tVar) {
        ArrayList arrayList;
        jf.s a10;
        jo.p.h(tVar, "event");
        androidx.lifecycle.e0<List<jf.s>> e0Var = this.P0;
        List<jf.s> f10 = e0Var.f();
        if (f10 != null) {
            int i10 = 10;
            arrayList = new ArrayList(xn.t.u(f10, 10));
            for (jf.s sVar : f10) {
                List<jf.q> d10 = sVar.d();
                ArrayList arrayList2 = new ArrayList(xn.t.u(d10, i10));
                for (jf.q qVar : d10) {
                    if (jo.p.c(qVar.h(), tVar.a().h())) {
                        qVar = qVar.b((r37 & 1) != 0 ? qVar.f37968w : null, (r37 & 2) != 0 ? qVar.f37969x : null, (r37 & 4) != 0 ? qVar.f37970y : null, (r37 & 8) != 0 ? qVar.f37971z : 0, (r37 & 16) != 0 ? qVar.A : 0, (r37 & 32) != 0 ? qVar.B : null, (r37 & 64) != 0 ? qVar.C : null, (r37 & 128) != 0 ? qVar.D : false, (r37 & 256) != 0 ? qVar.E : 0L, (r37 & 512) != 0 ? qVar.F : 0L, (r37 & 1024) != 0 ? qVar.G : null, (r37 & 2048) != 0 ? qVar.H : null, (r37 & 4096) != 0 ? qVar.I : null, (r37 & 8192) != 0 ? qVar.J : false, (r37 & 16384) != 0 ? qVar.K : true, (r37 & 32768) != 0 ? qVar.L : null, (r37 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? qVar.M : null);
                    }
                    arrayList2.add(qVar);
                }
                a10 = sVar.a((r22 & 1) != 0 ? sVar.f37979a : null, (r22 & 2) != 0 ? sVar.f37980b : 0, (r22 & 4) != 0 ? sVar.f37981c : 0, (r22 & 8) != 0 ? sVar.f37982d : null, (r22 & 16) != 0 ? sVar.f37983e : null, (r22 & 32) != 0 ? sVar.f37984f : null, (r22 & 64) != 0 ? sVar.f37985g : false, (r22 & 128) != 0 ? sVar.f37986h : arrayList2, (r22 & 256) != 0 ? sVar.f37987i : null, (r22 & 512) != 0 ? sVar.f37988j : false);
                arrayList.add(a10);
                i10 = 10;
            }
        } else {
            arrayList = null;
        }
        e0Var.p(arrayList);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(q0.u1 u1Var) {
        jo.p.h(u1Var, "event");
        uo.l.d(this, null, null, new b1(u1Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(q0.d dVar) {
        jo.p.h(dVar, "event");
        uo.l.d(this, null, null, new c1(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(q0.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(this, null, null, new d1(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.a0 a0Var) {
        ArrayList arrayList;
        Iterator it;
        jo.p.h(a0Var, "event");
        if (a0Var.a().t()) {
            androidx.lifecycle.e0<List<jf.s>> e0Var = this.P0;
            List<jf.s> f10 = e0Var.f();
            if (f10 != null) {
                arrayList = new ArrayList(xn.t.u(f10, 10));
                Iterator it2 = f10.iterator();
                while (it2.hasNext()) {
                    jf.s sVar = (jf.s) it2.next();
                    if (ve.a.Companion.a(sVar.j()) == ve.a.HISTORY) {
                        String f11 = sVar.f();
                        int j10 = sVar.j();
                        int h10 = sVar.h();
                        String i10 = sVar.i();
                        String e10 = sVar.e();
                        GiftPanelBanner c10 = sVar.c();
                        boolean k10 = sVar.k();
                        List d10 = xn.r.d(a0Var.a());
                        List<jf.q> d11 = sVar.d();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = d11.iterator();
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            Iterator it4 = it2;
                            Iterator it5 = it3;
                            if (!jo.p.c(((jf.q) next).h(), a0Var.a().h())) {
                                arrayList2.add(next);
                            }
                            it3 = it5;
                            it2 = it4;
                        }
                        it = it2;
                        sVar = new jf.s(f11, j10, h10, i10, e10, c10, k10, xn.a0.o0(d10, arrayList2), sVar.g(), sVar.l());
                    } else {
                        it = it2;
                    }
                    arrayList.add(sVar);
                    it2 = it;
                }
            } else {
                arrayList = null;
            }
            e0Var.p(arrayList);
            androidx.lifecycle.e0<List<jf.s>> e0Var2 = this.P0;
            e0Var2.p(e0Var2.f());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.f1 f1Var) {
        jo.p.h(f1Var, "event");
        androidx.lifecycle.e0<List<jf.s>> e0Var = this.P0;
        List<jf.s> a10 = f1Var.a();
        ArrayList<jf.s> arrayList = new ArrayList();
        for (Object obj : a10) {
            if (((jf.s) obj).m()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(xn.t.u(arrayList, 10));
        for (jf.s sVar : arrayList) {
            String f10 = sVar.f();
            int j10 = sVar.j();
            int h10 = sVar.h();
            String i10 = sVar.i();
            String e10 = sVar.e();
            GiftPanelBanner c10 = sVar.c();
            boolean k10 = sVar.k();
            List<jf.q> d10 = sVar.d();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : d10) {
                if (((jf.q) obj2).v()) {
                    arrayList3.add(obj2);
                }
            }
            arrayList2.add(new jf.s(f10, j10, h10, i10, e10, c10, k10, arrayList3, sVar.g(), sVar.l()));
        }
        e0Var.p(arrayList2);
        this.f43331h1 = false;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.d1 d1Var) {
        jo.p.h(d1Var, "event");
        androidx.lifecycle.e0<List<jf.q>> e0Var = this.f43340k1;
        List<jf.q> a10 = d1Var.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a10) {
            if (((jf.q) obj).q().e()) {
                arrayList.add(obj);
            }
        }
        e0Var.p(arrayList);
        this.f43344m1.p(d1Var.b());
        this.f43331h1 = false;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.g0 g0Var) {
        jo.p.h(g0Var, "event");
        this.f43372z.p(g0Var.a());
        this.F.p(Boolean.TRUE);
        this.B.p(null);
        this.D.p(null);
        androidx.lifecycle.e0<Boolean> e0Var = this.N;
        Boolean bool = Boolean.FALSE;
        e0Var.p(bool);
        this.Y.p(bool);
        this.f43309a0.p(null);
        this.H.p(null);
        this.S0.p(null);
        this.P0.p(xn.s.k());
        this.f43331h1 = false;
        this.E0.p(xn.s.k());
        this.f43319d1 = false;
        this.f43322e1 = 0L;
        uo.l.d(this, null, null, new b(null), 3, null);
        this.f43348o1.p(bool);
        this.f43352q1.p(bool);
        this.E1.p(null);
        this.R1.p(xn.s.k());
        this.f43332h2.p(null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.f0 f0Var) {
        jo.p.h(f0Var, "event");
        this.F.p(Boolean.FALSE);
        this.H.p(f0Var.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.i0 i0Var) {
        jo.p.h(i0Var, "event");
        this.B.p(i0Var.a());
        this.D.p(i0Var.a());
        this.U.p(i0Var.a().getTitle());
        this.S.p(Integer.valueOf(i0Var.a().getTotalViewerNum()));
        this.N.p(Boolean.valueOf(i0Var.a().d()));
        this.Y.p(Boolean.valueOf(i0Var.b()));
        this.f43309a0.p(i0Var.a().getApp());
        androidx.lifecycle.e0<Boolean> e0Var = this.F;
        Boolean bool = Boolean.FALSE;
        e0Var.p(bool);
        this.K0.p(wn.q.a(Boolean.valueOf(i0Var.a().getCollabEnabled()), Boolean.valueOf(i0Var.a().getCollabHasVacancy())));
        this.f43356s1.p(i0Var.a().getUserLevel());
        this.f43348o1.p(bool);
        this.f43352q1.p(bool);
        this.f43362v1.p(i0Var.a().getCollabInvitation());
        uo.l.d(this, null, null, new c(i0Var, null), 3, null);
        androidx.lifecycle.e0<w1> e0Var2 = this.f43332h2;
        LiveGamePlaying liveGamePlaying = i0Var.a().getLiveGamePlaying();
        e0Var2.p(liveGamePlaying != null ? w1.f55632g.a(liveGamePlaying) : null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.l0 l0Var) {
        jo.p.h(l0Var, "event");
        this.L.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.k0 k0Var) {
        jo.p.h(k0Var, "event");
        uo.l.d(this, null, null, new d(k0Var, null), 3, null);
        this.L.p(Boolean.FALSE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.j0 j0Var) {
        jo.p.h(j0Var, "event");
        uo.l.d(this, null, null, new e(j0Var, null), 3, null);
        this.L.p(Boolean.FALSE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.h0 h0Var) {
        jo.p.h(h0Var, "event");
        this.f43309a0.p(h0Var.a().getApp());
        this.B.p(h0Var.a());
        this.U.p(h0Var.a().getTitle());
        this.S.p(Integer.valueOf(h0Var.a().getTotalViewerNum()));
        this.N.p(Boolean.valueOf(h0Var.a().d()));
        this.Y.p(Boolean.valueOf(h0Var.b()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.o oVar) {
        String g10;
        jo.p.h(oVar, "event");
        te.c f10 = this.B.f();
        if (f10 == null || (g10 = f10.g()) == null || !jo.p.c(g10, oVar.b())) {
            return;
        }
        androidx.lifecycle.e0<Boolean> e0Var = this.N;
        Boolean bool = Boolean.TRUE;
        e0Var.p(bool);
        this.W.p(wn.q.a(bool, oVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.g0 g0Var) {
        String g10;
        jo.p.h(g0Var, "event");
        te.c f10 = this.B.f();
        if (f10 == null || (g10 = f10.g()) == null || !jo.p.c(g10, g0Var.a())) {
            return;
        }
        androidx.lifecycle.e0<Boolean> e0Var = this.N;
        Boolean bool = Boolean.FALSE;
        e0Var.p(bool);
        this.W.p(wn.q.a(bool, null));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.p1 p1Var) {
        jo.p.h(p1Var, "event");
        this.S.p(Integer.valueOf(p1Var.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.z1 z1Var) {
        jo.p.h(z1Var, "event");
        this.f43315c0.p(Boolean.TRUE);
        this.f43327g0.p(0);
        this.f43321e0.p(xn.s.k());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.y1 y1Var) {
        jo.p.h(y1Var, "event");
        this.f43315c0.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.x1 x1Var) {
        jo.p.h(x1Var, "event");
        this.f43315c0.p(Boolean.FALSE);
        androidx.lifecycle.e0<List<LiveViewingUser>> e0Var = this.f43321e0;
        List<LiveViewingUser> f10 = e0Var.f();
        if (f10 == null) {
            f10 = xn.s.k();
        }
        e0Var.p(xn.a0.o0(f10, x1Var.a().getUsers()));
        this.f43327g0.p(Integer.valueOf(x1Var.a().getNextPage()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.a2 a2Var) {
        jo.p.h(a2Var, "event");
        this.f43315c0.p(Boolean.FALSE);
        this.f43321e0.p(a2Var.a().getUsers());
        this.f43327g0.p(Integer.valueOf(a2Var.a().getNextPage()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.w1 w1Var) {
        jo.p.h(w1Var, "event");
        this.f43315c0.p(Boolean.FALSE);
        uo.l.d(this, null, null, new f(w1Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.b0 b0Var) {
        jo.p.h(b0Var, "event");
        this.Y.p(Boolean.valueOf(b0Var.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.h hVar) {
        jo.p.h(hVar, "event");
        this.f43309a0.p(hVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.f fVar) {
        jo.p.h(fVar, "event");
        throw null;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.r0 r0Var) {
        jo.p.h(r0Var, "event");
        this.f43336j0.p(null);
        this.f43341l0.p(null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.p0 p0Var) {
        jo.p.h(p0Var, "event");
        this.f43336j0.p(p0Var.a());
        this.f43341l0.p(i9.a.B.a(p0Var.a().getSeasonYell()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.t0 t0Var) {
        jo.p.h(t0Var, "event");
        this.f43345n0.p(t0Var.a());
        uo.l.d(this, null, null, new g(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.s0 s0Var) {
        jo.p.h(s0Var, "event");
        uo.l.d(this, null, null, new h(s0Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.o1 o1Var) {
        jo.p.h(o1Var, "event");
        this.f43353r0.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.v0 v0Var) {
        jo.p.h(v0Var, "event");
        this.f43353r0.p(Boolean.FALSE);
        this.f43345n0.p(v0Var.a());
        uo.l.d(this, null, null, new i(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.u0 u0Var) {
        jo.p.h(u0Var, "event");
        this.f43353r0.p(Boolean.FALSE);
        uo.l.d(this, null, null, new j(u0Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.q qVar) {
        jo.p.h(qVar, "event");
        this.f43345n0.p(null);
        uo.l.d(this, null, null, new l(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.p pVar) {
        jo.p.h(pVar, "event");
        uo.l.d(this, null, null, new m(pVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.l lVar) {
        jo.p.h(lVar, "event");
        uo.l.d(this, null, null, new n(lVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.n nVar) {
        jo.p.h(nVar, "event");
        uo.l.d(this, null, null, new o(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.m mVar) {
        jo.p.h(mVar, "event");
        uo.l.d(this, null, null, new p(mVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.l1 l1Var) {
        jo.p.h(l1Var, "event");
        uo.l.d(this, null, null, new q(l1Var, this, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.r rVar) {
        jo.p.h(rVar, "event");
        uo.l.d(this, null, null, new r(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.q qVar) {
        jo.p.h(qVar, "event");
        uo.l.d(this, null, null, new s(qVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.g1 g1Var) {
        jo.p.h(g1Var, "event");
        uo.l.d(this, null, null, new t(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.k1 k1Var) {
        jo.p.h(k1Var, "event");
        throw null;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.o0 o0Var) {
        jo.p.h(o0Var, "event");
        uo.l.d(this, null, null, new u(o0Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.C0719q0 c0719q0) {
        jo.p.h(c0719q0, "event");
        uo.l.d(this, null, null, new w(c0719q0, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.q1 q1Var) {
        jo.p.h(q1Var, "event");
        this.Q.p(q1Var.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.r1 r1Var) {
        jo.p.h(r1Var, "event");
        this.f43334i1.p(Integer.valueOf(r1Var.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.n0 n0Var) {
        jo.p.h(n0Var, "event");
        this.f43334i1.p(Integer.valueOf(n0Var.a().getScoreReward().getScore()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.t1 t1Var) {
        jo.p.h(t1Var, "event");
        this.f43348o1.p(Boolean.valueOf(t1Var.a().isRunning()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.s1 s1Var) {
        jo.p.h(s1Var, "event");
        this.f43352q1.p(Boolean.valueOf(s1Var.a().isQuesting()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.h1 h1Var) {
        jo.p.h(h1Var, "event");
        this.f43331h1 = true;
        uo.l.d(this, null, null, new x(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.v1 v1Var) {
        jo.p.h(v1Var, "event");
        int level = v1Var.a().getLevel();
        int exPoint = v1Var.a().getExPoint();
        int nextLevelExPoint = v1Var.a().getNextLevelExPoint();
        int addExPoint = v1Var.a().getAddExPoint();
        String levelImageUrl = v1Var.a().getLevelImageUrl();
        String levelColorCode = v1Var.a().getLevelColorCode();
        String levelBorderColorCode = v1Var.a().getLevelBorderColorCode();
        List<String> levelGaugeColorCodes = v1Var.a().getLevelGaugeColorCodes();
        UserLevel f10 = this.f43358t1.f();
        this.f43356s1.p(new UserLevel(level, exPoint, nextLevelExPoint, addExPoint, levelImageUrl, levelColorCode, levelBorderColorCode, levelGaugeColorCodes, (f10 == null || (r1 = f10.getHelpPageUrl()) == null) ? "" : "", v1Var.a().getUserLevelGiftPanelText()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.m0 m0Var) {
        jo.p.h(m0Var, "event");
        uo.l.d(this, null, null, new y(m0Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.n1 n1Var) {
        jo.p.h(n1Var, "event");
        this.f43368x1.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.a aVar) {
        jo.p.h(aVar, "event");
        this.f43368x1.p(Boolean.FALSE);
        this.f43362v1.p(null);
        uo.l.d(this, null, null, new C0636z(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.u uVar) {
        jo.p.h(uVar, "event");
        this.f43368x1.p(Boolean.FALSE);
        uo.l.d(this, null, null, new a0(uVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.o oVar) {
        jo.p.h(oVar, "event");
        uo.l.d(this, null, null, new b0(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.j jVar) {
        jo.p.h(jVar, "event");
        te.c f10 = this.B.f();
        if (f10 != null) {
            f10.setConnectedStreamingCollab(false);
        }
        uo.l.d(this, null, null, new c0(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.k kVar) {
        jo.p.h(kVar, "event");
        te.c f10 = this.B.f();
        if (f10 != null) {
            f10.setConnectedStreamingCollab(kVar.a().isConnectedStreamingCollab());
        }
        uo.l.d(this, null, null, new d0(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.j jVar) {
        jo.p.h(jVar, "event");
        if (jo.p.c(jVar.b(), "PlayerService") && jo.p.c(this.f43366x.T4(), jVar.a().getInviteUserId())) {
            this.f43362v1.p(new CollabInvitation(jVar.a().getCollabType()));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.h hVar) {
        jo.p.h(hVar, "event");
        if (jo.p.c(hVar.a(), "PlayerService") && jo.p.c(this.f43366x.T4(), hVar.b().getInvitedUserId())) {
            this.f43368x1.p(Boolean.FALSE);
            this.f43362v1.p(null);
            uo.l.d(this, null, null, new e0(hVar, null), 3, null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.c cVar) {
        jo.p.h(cVar, "event");
        this.f43362v1.p(null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g.s sVar) {
        jo.p.h(sVar, "event");
        if (sVar.a().e()) {
            this.f43362v1.p(null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.i1 i1Var) {
        jo.p.h(i1Var, "event");
        if (jo.p.c(i1Var.a(), "PlayerService")) {
            ShooterMatchingStateChangedBcsvrResponse value = this.J1.getValue();
            boolean z10 = false;
            if (value != null && i1Var.b().getTeamId() == value.getTeamId()) {
                z10 = true;
            }
            if (!z10) {
                uo.l.d(this, null, null, new f0(null), 3, null);
            }
            if (jo.p.c(this.f43366x.T4(), i1Var.b().getUserId())) {
                this.E1.p(i1Var.b());
            }
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.h1 h1Var) {
        jo.p.h(h1Var, "event");
        if (jo.p.c(h1Var.a(), "PlayerService")) {
            ShooterMatchingStateChangedBcsvrResponse value = this.J1.getValue();
            if ((value != null ? value.getMatchingStatus() : null) == ShooterTeamStatus.MATCHED && xn.s.m(ShooterTeamStatus.MATCHING, ShooterTeamStatus.FORCE_MATCHING).contains(h1Var.b().getMatchingStatus())) {
                return;
            }
            uo.l.d(this, null, null, new h0(h1Var, null), 3, null);
            if (h1Var.b().getMatchingStatus() == ShooterTeamStatus.CANCELED) {
                this.E1.p(null);
            }
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.b bVar) {
        jo.p.h(bVar, "event");
        uo.l.d(this, null, null, new i0(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.r rVar) {
        jo.p.h(rVar, "event");
        uo.l.d(this, null, null, new j0(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.w0 w0Var) {
        jo.p.h(w0Var, "event");
        uo.l.d(this, null, null, new k0(w0Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.w wVar) {
        jo.p.h(wVar, "event");
        androidx.lifecycle.e0<List<jf.u>> e0Var = this.R1;
        List<GiftRanking> rankings = wVar.a().getRankings();
        ArrayList arrayList = new ArrayList(xn.t.u(rankings, 10));
        for (GiftRanking giftRanking : rankings) {
            arrayList.add(jf.u.f38000o.a(giftRanking));
        }
        e0Var.p(arrayList);
        uo.l.d(this, null, null, new l0(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.z zVar) {
        Object obj;
        jf.u a10;
        ArrayList arrayList;
        boolean z10;
        jo.p.h(zVar, "event");
        List<jf.u> f10 = this.S1.f();
        if (f10 != null) {
            Iterator<T> it = f10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                jf.u uVar = (jf.u) obj;
                if (uVar.e() == zVar.a().getEventId() && uVar.o() == zVar.a().isAppEvent()) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            jf.u uVar2 = (jf.u) obj;
            if (uVar2 != null && uVar2.g() <= zVar.a().getNanoTime()) {
                a10 = uVar2.a((r32 & 1) != 0 ? uVar2.f38001a : 0, (r32 & 2) != 0 ? uVar2.f38002b : zVar.a().getNanoTime(), (r32 & 4) != 0 ? uVar2.f38003c : null, (r32 & 8) != 0 ? uVar2.f38004d : zVar.a().getRankingPoint(), (r32 & 16) != 0 ? uVar2.f38005e : zVar.a().getRank(), (r32 & 32) != 0 ? uVar2.f38006f : zVar.a().getRankText(), (r32 & 64) != 0 ? uVar2.f38007g : null, (r32 & 128) != 0 ? uVar2.f38008h : null, (r32 & 256) != 0 ? uVar2.f38009i : 0, (r32 & 512) != 0 ? uVar2.f38010j : null, (r32 & 1024) != 0 ? uVar2.f38011k : 0, (r32 & 2048) != 0 ? uVar2.f38012l : 0, (r32 & 4096) != 0 ? uVar2.f38013m : false, (r32 & 8192) != 0 ? uVar2.f38014n : false);
                androidx.lifecycle.e0<List<jf.u>> e0Var = this.R1;
                List<jf.u> f11 = e0Var.f();
                if (f11 != null) {
                    arrayList = new ArrayList(xn.t.u(f11, 10));
                    for (jf.u uVar3 : f11) {
                        if (uVar3.e() == uVar2.e() && uVar3.o() == uVar2.o()) {
                            uVar3 = a10;
                        }
                        arrayList.add(uVar3);
                    }
                } else {
                    arrayList = null;
                }
                e0Var.p(arrayList);
                if (uVar2.h() > zVar.a().getRank()) {
                    uo.l.d(this, null, null, new m0(zVar, null), 3, null);
                }
            }
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.y yVar) {
        jf.u uVar;
        ArrayList arrayList;
        Object obj;
        boolean z10;
        jo.p.h(yVar, "event");
        if (jo.p.c(yVar.b(), "PlayerService") && !yVar.a().getRankings().isEmpty()) {
            for (GiftRankingBcsvrResponse giftRankingBcsvrResponse : yVar.a().getRankings()) {
                List<jf.u> f10 = this.R1.f();
                if (f10 != null) {
                    jo.p.g(f10, "value");
                    Iterator<T> it = f10.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        jf.u uVar2 = (jf.u) obj;
                        if (uVar2.e() == giftRankingBcsvrResponse.getEventId() && uVar2.o() == giftRankingBcsvrResponse.isAppEvent()) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (z10) {
                            break;
                        }
                    }
                    uVar = (jf.u) obj;
                } else {
                    uVar = null;
                }
                if ((uVar != null ? uVar.g() : 0L) <= giftRankingBcsvrResponse.getNanoTime()) {
                    jf.u b10 = jf.u.f38000o.b(giftRankingBcsvrResponse);
                    androidx.lifecycle.e0<List<jf.u>> e0Var = this.R1;
                    List<jf.u> f11 = e0Var.f();
                    if (f11 != null) {
                        jo.p.g(f11, "value");
                        arrayList = new ArrayList(xn.t.u(f11, 10));
                        for (jf.u uVar3 : f11) {
                            if (uVar3.e() == giftRankingBcsvrResponse.getEventId() && uVar3.o() == giftRankingBcsvrResponse.isAppEvent()) {
                                uVar3 = b10;
                            }
                            arrayList.add(uVar3);
                        }
                    } else {
                        arrayList = null;
                    }
                    e0Var.p(arrayList);
                    if (giftRankingBcsvrResponse.isStreamerRankUp()) {
                        uo.l.d(this, null, null, new n0(giftRankingBcsvrResponse, null), 3, null);
                    }
                }
            }
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.g gVar) {
        jo.p.h(gVar, "event");
        uo.l.d(this, null, null, new o0(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.c0 c0Var) {
        jo.p.h(c0Var, "event");
        ArrayList arrayList = null;
        uo.l.d(this, null, null, new q0(c0Var, null), 3, null);
        androidx.lifecycle.e0<List<r2>> e0Var = this.E0;
        List<r2> f10 = e0Var.f();
        if (f10 != null) {
            arrayList = new ArrayList();
            for (Object obj : f10) {
                if (((r2) obj).d() != 92) {
                    arrayList.add(obj);
                }
            }
        }
        e0Var.p(arrayList);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.e0 e0Var) {
        ArrayList arrayList;
        jo.p.h(e0Var, "event");
        androidx.lifecycle.e0<List<r2>> e0Var2 = this.E0;
        List<r2> f10 = e0Var2.f();
        if (f10 != null) {
            arrayList = new ArrayList();
            for (Object obj : f10) {
                if (((r2) obj).d() != 92) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        e0Var2.p(arrayList);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.v vVar) {
        jo.p.h(vVar, "event");
        uo.l.d(this, null, null, new r0(vVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.i1 i1Var) {
        jo.p.h(i1Var, "event");
        uo.l.d(this, null, null, new s0(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.e eVar) {
        jo.p.h(eVar, "event");
        uo.l.d(this, null, null, new t0(eVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.i0 i0Var) {
        ArrayList arrayList;
        jo.p.h(i0Var, "event");
        if (jo.p.c(i0Var.a(), "PlayerService") && i0Var.b().getUserIds().contains(this.f43366x.T4())) {
            androidx.lifecycle.e0<List<r2>> e0Var = this.E0;
            List<r2> f10 = e0Var.f();
            if (f10 != null) {
                arrayList = new ArrayList();
                for (Object obj : f10) {
                    if (((r2) obj).d() != 92) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            e0Var.p(arrayList);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.j0 j0Var) {
        ArrayList arrayList;
        jo.p.h(j0Var, "event");
        if (jo.p.c(j0Var.a(), "PlayerService")) {
            androidx.lifecycle.e0<List<r2>> e0Var = this.E0;
            List<r2> f10 = e0Var.f();
            if (f10 != null) {
                arrayList = new ArrayList();
                for (Object obj : f10) {
                    if (((r2) obj).d() != 92) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            e0Var.p(arrayList);
            this.f43332h2.p(null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.x xVar) {
        jo.p.h(xVar, "event");
        this.P0.p(xn.s.k());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q0.i iVar) {
        jo.p.h(iVar, "event");
        uo.l.d(this, null, null, new u0(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.l0 l0Var) {
        jo.p.h(l0Var, "event");
        if (jo.p.c(l0Var.a(), "PlayerService")) {
            this.f43332h2.p(w1.f55632g.b(l0Var.b()));
        }
    }
}
