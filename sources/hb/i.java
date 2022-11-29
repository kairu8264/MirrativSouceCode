package hb;

import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.core.StatusResponse;
import com.dena.mirrativ.mirrativapi.emomo.EmomoApi;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaTicketResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestGachaTicket;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameApi;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameStartResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.database.MirrorDatabase;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import com.dena.mirrorman.net.api.response.CollabRequestResponse;
import com.dena.mirrorman.net.api.response.CollabType;
import com.dena.mirrorman.net.api.response.EmomoRunState;
import com.dena.mirrorman.net.api.response.Gift;
import com.dena.mirrorman.net.api.response.GiftPanelsResponse;
import com.dena.mirrorman.net.api.response.Graph;
import com.dena.mirrorman.net.api.response.LiveStreamingUrlResponse;
import com.dena.mirrorman.net.api.response.UserCurrencyResponse;
import com.dena.mirrorman.net.api.response.event.RankingUserDetailResponse;
import com.dena.mirrorman.net.api.response.live.LinkedLive;
import com.dena.mirrorman.net.api.response.live.LiveCommentResponse;
import com.dena.mirrorman.net.api.response.live.LiveDetailResponse;
import com.dena.mirrorman.net.api.response.live.LiveOnlineUsersResponse;
import com.dena.mirrorman.net.api.response.live.LiveOwnedResponse;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import com.dena.mirrorman.net.bcsvr.response.CollabChangedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.EmomoQuestGameStateBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingChangedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.LiveChangedResponse;
import com.dena.mirrorman.net.bcsvr.response.RankingUser;
import com.dena.mirrorman.net.bcsvr.response.UserLevelUpdate;
import com.dena.mirrorman.net.quiz.QuizMessage;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.a;
import pd.i1;
import pd.q0;
import pd.s;
import ud.r2;
import ud.t2;
import uo.d2;
import uo.i2;

/* loaded from: classes2.dex */
public final class i implements oq.a {
    public final kf.x A;
    public final MRLogger B;
    public final hf.v0 C;
    public final hf.d0 D;
    public final q8.a E;
    public final nd.i1 F;
    public final MirrorDatabase G;
    public uo.d2 H;

    /* renamed from: w  reason: collision with root package name */
    public final MRRequest f34806w;

    /* renamed from: x  reason: collision with root package name */
    public final EmomoApi f34807x;

    /* renamed from: y  reason: collision with root package name */
    public final LiveGameApi f34808y;

    /* renamed from: z  reason: collision with root package name */
    public final hf.c f34809z;

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$acceptCollabInvitation$1", f = "PlayerActionCreator.kt", l = {544, 567}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ CollabType A;
        public final /* synthetic */ String B;
        public final /* synthetic */ String C;

        /* renamed from: w  reason: collision with root package name */
        public int f34810w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34812y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f34813z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, CollabType collabType, String str3, String str4, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f34812y = str;
            this.f34813z = str2;
            this.A = collabType;
            this.B = str3;
            this.C = str4;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f34812y, this.f34813z, this.A, this.B, this.C, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object postCollabInviteAccept;
            Object postLiveEdit$default;
            Object c10 = bo.c.c();
            int i10 = this.f34810w;
            try {
            } catch (Throwable th2) {
                i.this.E.a(new q0.u(MRErrorKt.convertMRException(th2).getError()));
            }
            if (i10 == 0) {
                wn.m.b(obj);
                MRRequest mRRequest = i.this.f34806w;
                String str = this.f34812y;
                String str2 = this.f34813z;
                int rawValue = this.A.getRawValue();
                this.f34810w = 1;
                postCollabInviteAccept = mRRequest.postCollabInviteAccept(str, str2, rawValue, this);
                if (postCollabInviteAccept == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                postLiveEdit$default = obj;
                i.this.D.d((LiveOwnedResponse) postLiveEdit$default);
                return wn.v.f59242a;
            } else {
                wn.m.b(obj);
                postCollabInviteAccept = obj;
            }
            CollabRequestResponse collabRequestResponse = (CollabRequestResponse) postCollabInviteAccept;
            i.this.E.a(new q0.a(new jf.h(this.f34813z, this.B, this.C, collabRequestResponse.getCollabUnicastHost(), collabRequestResponse.getCollabUnicastPort(), collabRequestResponse.getCollabUnicastKey(), collabRequestResponse.getStunServers(), collabRequestResponse.getTurnServers(), collabRequestResponse.getStreamingCollabLiveId(), this.A, i.this.F.a().d() ? "INTENT_ACTION_INVITED_COLLAB_IN_STREAMING" : "INVITED_COLLAB")));
            if (this.A == CollabType.LIVE && !i.this.F.a().d()) {
                MRRequest mRRequest2 = i.this.f34806w;
                String str3 = this.f34812y;
                String streamingCollabLiveId = collabRequestResponse.getStreamingCollabLiveId();
                this.f34810w = 2;
                postLiveEdit$default = MRRequest.DefaultImpls.postLiveEdit$default(mRRequest2, str3, streamingCollabLiveId, null, null, null, null, null, null, null, null, this, AnalyticsListener.EVENT_VIDEO_ENABLED, null);
                if (postLiveEdit$default == c10) {
                    return c10;
                }
                i.this.D.d((LiveOwnedResponse) postLiveEdit$default);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$reloadViewerList$1", f = "PlayerActionCreator.kt", l = {178}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34814w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34816y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f34817z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(String str, String str2, ao.d<? super a0> dVar) {
            super(2, dVar);
            this.f34816y = str;
            this.f34817z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a0(this.f34816y, this.f34817z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34814w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    i.this.E.a(q0.z1.f47206a);
                    MRRequest mRRequest = i.this.f34806w;
                    String str = this.f34816y;
                    String str2 = this.f34817z;
                    Integer d10 = co.b.d(1);
                    this.f34814w = 1;
                    obj = mRRequest.getLiveOnlineUsers(str, str2, d10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                i.this.E.a(new q0.a2((LiveOnlineUsersResponse) obj));
            } catch (Throwable th2) {
                i.this.E.a(new q0.w1(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$blockUser$1", f = "PlayerActionCreator.kt", l = {746}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34818w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34820y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f34820y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f34820y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34818w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    String str = this.f34820y;
                    this.f34818w = 1;
                    if (mRRequest.postBlock(Referer.LIVE_VIEW, str, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                i.this.E.a(q0.i.f47150a);
            } catch (Throwable th2) {
                i.this.E.a(new q0.e(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$sendEmomoQuestGiftGacha$1", f = "PlayerActionCreator.kt", l = {731}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;

        /* renamed from: w  reason: collision with root package name */
        public int f34821w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34823y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f34824z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(String str, String str2, int i10, int i11, ao.d<? super b0> dVar) {
            super(2, dVar);
            this.f34823y = str;
            this.f34824z = str2;
            this.A = i10;
            this.B = i11;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b0(this.f34823y, this.f34824z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34821w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    EmomoApi emomoApi = i.this.f34807x;
                    String str = this.f34823y;
                    String str2 = this.f34824z;
                    int i11 = this.A;
                    int i12 = this.B;
                    this.f34821w = 1;
                    obj = emomoApi.postEmomoQuestSendGiftGacha(Referer.LIVE_VIEW, str, str2, i11, i12, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                i.this.E.a(new q0.i1(((GiftGachaTicketResponse) obj).getGachaTicketCount()));
            } catch (Throwable th2) {
                i.this.E.a(new q0.e(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$cancelLiveGame$1", f = "PlayerActionCreator.kt", l = {696}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34825w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34827y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f34828z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f34827y = str;
            this.f34828z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f34827y, this.f34828z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34825w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    String str = this.f34827y;
                    String str2 = this.f34828z;
                    this.f34825w = 1;
                    if (mRRequest.postLiveGameConnectCancel(Referer.LIVE_VIEW, str, str2, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
            } catch (Throwable th2) {
                g9.a.c(th2);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$startLiveGame$1", f = "PlayerActionCreator.kt", l = {684}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f34829w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34831y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f34832z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(String str, boolean z10, String str2, ao.d<? super c0> dVar) {
            super(2, dVar);
            this.f34831y = str;
            this.f34832z = z10;
            this.A = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c0(this.f34831y, this.f34832z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34829w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    LiveGameApi liveGameApi = i.this.f34808y;
                    String str = this.f34831y;
                    boolean z10 = this.f34832z;
                    String str2 = this.A;
                    this.f34829w = 1;
                    obj = liveGameApi.postLiveGameStart(Referer.LIVE_VIEW, str, z10, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                i.this.E.a(new q0.c0((LiveGameStartResponse) obj, this.f34832z));
            } catch (Throwable th2) {
                i.this.E.a(new q0.e(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$commentUrl$1", f = "PlayerActionCreator.kt", l = {237}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34833w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34835y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f34835y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f34835y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object commentRequestAsync$default;
            Object c10 = bo.c.c();
            int i10 = this.f34833w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    String str = this.f34835y;
                    Integer d10 = co.b.d(49);
                    Integer d11 = co.b.d(2);
                    this.f34833w = 1;
                    commentRequestAsync$default = MRRequest.DefaultImpls.commentRequestAsync$default(mRRequest, Referer.LIVE_VIEW, str, null, d10, null, null, null, null, d11, this, 244, null);
                    if (commentRequestAsync$default == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                    commentRequestAsync$default = obj;
                }
                StatusResponse statusResponse = (StatusResponse) commentRequestAsync$default;
                i.this.E.a(q0.n.f47166a);
            } catch (Throwable th2) {
                i.this.E.a(new q0.m(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$startNewLive$1", f = "PlayerActionCreator.kt", l = {91}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34836w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34838y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(String str, ao.d<? super d0> dVar) {
            super(2, dVar);
            this.f34838y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d0(this.f34838y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34836w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    String str = this.f34838y;
                    this.f34836w = 1;
                    obj = mRRequest.getLiveDetail(Referer.LIVE_VIEW, str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                LiveDetailResponse liveDetailResponse = (LiveDetailResponse) obj;
                te.c b10 = te.c.M.b(liveDetailResponse);
                q8.a aVar = i.this.E;
                hf.c cVar = i.this.f34809z;
                App.AppParams app = b10.getApp();
                aVar.a(new q0.i0(b10, cVar.d(app != null ? app.getAppId() : null), jo.p.c(i.this.A.T4(), liveDetailResponse.getOwner().getUserId())));
                i.this.E.a(new s.j(new jf.f(liveDetailResponse.getRemainingFreeCoins(), liveDetailResponse.getRemainingPaidCoins())));
                i.this.z(this.f34838y);
            } catch (Throwable th2) {
                i.this.E.a(new q0.f0(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$commentUserId$1", f = "PlayerActionCreator.kt", l = {227}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34839w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34841y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f34841y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f34841y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34839w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    String str = this.f34841y;
                    Integer d10 = co.b.d(49);
                    Integer d11 = co.b.d(1);
                    this.f34839w = 1;
                    if (MRRequest.DefaultImpls.commentRequestAsync$default(mRRequest, Referer.LIVE_VIEW, str, null, d10, null, null, null, null, d11, this, 244, null) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
            } catch (Throwable th2) {
                i.this.E.a(new q0.l(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$unfollowOwner$1", f = "PlayerActionCreator.kt", l = {165}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34842w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34844y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f34845z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(String str, String str2, ao.d<? super e0> dVar) {
            super(2, dVar);
            this.f34844y = str;
            this.f34845z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e0(this.f34844y, this.f34845z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34842w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    String str = this.f34844y;
                    String str2 = this.f34845z;
                    this.f34842w = 1;
                    if (mRRequest.postGraphUnfollow(str, str2, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                i.this.E.a(new i1.g0(this.f34845z));
            } catch (Throwable th2) {
                i.this.E.a(new i1.n(this.f34845z, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$deleteAppDetailId$1", f = "PlayerActionCreator.kt", l = {266}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34846w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34848y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f34848y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f34848y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34846w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    String str = this.f34848y;
                    this.f34846w = 1;
                    if (mRRequest.deleteAppUserDetail(Referer.LIVE_VIEW, str, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                i.this.E.a(q0.q.f47176a);
            } catch (Throwable th2) {
                i.this.E.a(new q0.p(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$fetchCollabUsers$1", f = "PlayerActionCreator.kt", l = {526}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34849w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34851y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f34851y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f34851y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34849w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    String str = this.f34851y;
                    this.f34849w = 1;
                    obj = mRRequest.getCollaboratingUsers(Referer.LIVE_VIEW, str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                i.this.E.a(new q0.m0(((LiveOnlineUsersResponse) obj).getUsers()));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$fetchEmomoQuestGiftGachaTicket$1", f = "PlayerActionCreator.kt", l = {707}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34852w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f34854y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f34855z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i10, String str, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f34854y = i10;
            this.f34855z = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f34854y, this.f34855z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34852w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    EmomoApi emomoApi = i.this.f34807x;
                    int i11 = this.f34854y;
                    this.f34852w = 1;
                    obj = emomoApi.getEmomoQuestGachaTicket(Referer.LIVE_VIEW, i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                i.this.E.a(new q0.v(new EmomoQuestGachaTicket(this.f34855z, ((GiftGachaTicketResponse) obj).getGachaTicketCount(), this.f34854y)));
            } catch (Throwable th2) {
                i.this.E.a(new q0.e(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$fetchGiftRankingCurrentUserRank$1", f = "PlayerActionCreator.kt", l = {665}, m = "invokeSuspend")
    /* renamed from: hb.i$i  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0442i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34856w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34858y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0442i(String str, ao.d<? super C0442i> dVar) {
            super(2, dVar);
            this.f34858y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C0442i(this.f34858y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C0442i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34856w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    String str = this.f34858y;
                    this.f34856w = 1;
                    obj = mRRequest.getRankingUserDetail(Referer.LIVE_VIEW, str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                i.this.E.a(new q0.w((RankingUserDetailResponse) obj));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$fetchRemainingCoins$1", f = "PlayerActionCreator.kt", l = {467}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34859w;

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
            int i10 = this.f34859w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    this.f34859w = 1;
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
                i.this.E.a(new s.j(new jf.f(userCurrencyResponse.getRemainingFreeCoins(), userCurrencyResponse.getRemainingPaidCoins())));
            } catch (Throwable th2) {
                i.this.E.a(new q0.C0719q0(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$followOwner$1", f = "PlayerActionCreator.kt", l = {144}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34861w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34863y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f34864z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, String str2, ao.d<? super k> dVar) {
            super(2, dVar);
            this.f34863y = str;
            this.f34864z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(this.f34863y, this.f34864z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34861w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    String str = this.f34863y;
                    String str2 = this.f34864z;
                    this.f34861w = 1;
                    obj = mRRequest.postGraphFollow(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                i.this.E.a(new i1.o(this.f34864z, (Graph.Follow) obj));
            } catch (Throwable th2) {
                i.this.E.a(new i1.n(this.f34864z, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$getEventBanner$1", f = "PlayerActionCreator.kt", l = {411, 414}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public Object f34865w;

        /* renamed from: x  reason: collision with root package name */
        public int f34866x;

        /* renamed from: y  reason: collision with root package name */
        public int f34867y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, ao.d<? super l> dVar) {
            super(2, dVar);
            this.A = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new l(this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0071 A[SYNTHETIC] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r10.f34867y
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L25
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                int r0 = r10.f34866x
                java.lang.Object r1 = r10.f34865w
                hb.i r1 = (hb.i) r1
                wn.m.b(r11)     // Catch: java.lang.Throwable -> Lab
                goto L9d
            L19:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L21:
                wn.m.b(r11)     // Catch: java.lang.Throwable -> Lab
                goto L39
            L25:
                wn.m.b(r11)
                hb.i r11 = hb.i.this     // Catch: java.lang.Throwable -> Lab
                com.dena.mirrorman.net.retrofit.MRRequest r11 = hb.i.h(r11)     // Catch: java.lang.Throwable -> Lab
                java.lang.String r1 = r10.A     // Catch: java.lang.Throwable -> Lab
                r10.f34867y = r3     // Catch: java.lang.Throwable -> Lab
                java.lang.Object r11 = r11.getEventNotice(r2, r1, r10)     // Catch: java.lang.Throwable -> Lab
                if (r11 != r0) goto L39
                return r0
            L39:
                com.dena.mirrorman.net.api.response.EventNoticeResponse r11 = (com.dena.mirrorman.net.api.response.EventNoticeResponse) r11     // Catch: java.lang.Throwable -> Lab
                hb.i r1 = hb.i.this     // Catch: java.lang.Throwable -> Lab
                q8.a r1 = hb.i.c(r1)     // Catch: java.lang.Throwable -> Lab
                pd.q0$o0 r4 = new pd.q0$o0     // Catch: java.lang.Throwable -> Lab
                r4.<init>(r11)     // Catch: java.lang.Throwable -> Lab
                r1.a(r4)     // Catch: java.lang.Throwable -> Lab
                java.util.List r11 = r11.getBanners()     // Catch: java.lang.Throwable -> Lab
                java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> Lab
            L51:
                boolean r1 = r11.hasNext()     // Catch: java.lang.Throwable -> Lab
                if (r1 == 0) goto L72
                java.lang.Object r1 = r11.next()     // Catch: java.lang.Throwable -> Lab
                r4 = r1
                com.dena.mirrativ.mirrativapi.common.EventBannerResponse r4 = (com.dena.mirrativ.mirrativapi.common.EventBannerResponse) r4     // Catch: java.lang.Throwable -> Lab
                java.lang.Integer r4 = r4.getEventType()     // Catch: java.lang.Throwable -> Lab
                r5 = 5
                if (r4 != 0) goto L66
                goto L6e
            L66:
                int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Lab
                if (r4 != r5) goto L6e
                r4 = r3
                goto L6f
            L6e:
                r4 = 0
            L6f:
                if (r4 == 0) goto L51
                goto L73
            L72:
                r1 = 0
            L73:
                com.dena.mirrativ.mirrativapi.common.EventBannerResponse r1 = (com.dena.mirrativ.mirrativapi.common.EventBannerResponse) r1     // Catch: java.lang.Throwable -> Lab
                if (r1 == 0) goto Lab
                java.lang.Integer r11 = r1.getEventId()     // Catch: java.lang.Throwable -> Lab
                if (r11 == 0) goto Lab
                hb.i r1 = hb.i.this     // Catch: java.lang.Throwable -> Lab
                int r11 = r11.intValue()     // Catch: java.lang.Throwable -> Lab
                com.dena.mirrativ.mirrativapi.emomo.EmomoApi r3 = hb.i.d(r1)     // Catch: java.lang.Throwable -> Lab
                java.lang.String r4 = "live_view"
                r6 = 0
                r8 = 4
                r9 = 0
                r10.f34865w = r1     // Catch: java.lang.Throwable -> Lab
                r10.f34866x = r11     // Catch: java.lang.Throwable -> Lab
                r10.f34867y = r2     // Catch: java.lang.Throwable -> Lab
                r5 = r11
                r7 = r10
                java.lang.Object r2 = com.dena.mirrativ.mirrativapi.emomo.EmomoApi.DefaultImpls.getEmomoRunScore$default(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lab
                if (r2 != r0) goto L9b
                return r0
            L9b:
                r0 = r11
                r11 = r2
            L9d:
                com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunScoreResponse r11 = (com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunScoreResponse) r11     // Catch: java.lang.Throwable -> Lab
                q8.a r1 = hb.i.c(r1)     // Catch: java.lang.Throwable -> Lab
                pd.q0$n0 r2 = new pd.q0$n0     // Catch: java.lang.Throwable -> Lab
                r2.<init>(r0, r11)     // Catch: java.lang.Throwable -> Lab
                r1.a(r2)     // Catch: java.lang.Throwable -> Lab
            Lab:
                wn.v r11 = wn.v.f59242a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: hb.i.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$loadLiveStreaming$1", f = "PlayerActionCreator.kt", l = {79}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34869w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34871y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, ao.d<? super m> dVar) {
            super(2, dVar);
            this.f34871y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new m(this.f34871y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34869w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    String str = this.f34871y;
                    this.f34869w = 1;
                    obj = mRRequest.getLiveStreamingUrl(Referer.LIVE_VIEW, str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                i.this.E.a(new q0.k0((LiveStreamingUrlResponse) obj));
            } catch (Throwable th2) {
                i.this.E.a(new q0.j0(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$loadNextViewerList$1", f = "PlayerActionCreator.kt", l = {191}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public int f34872w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34874y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f34875z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, String str2, int i10, ao.d<? super n> dVar) {
            super(2, dVar);
            this.f34874y = str;
            this.f34875z = str2;
            this.A = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new n(this.f34874y, this.f34875z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((n) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34872w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    i.this.E.a(q0.y1.f47203a);
                    MRRequest mRRequest = i.this.f34806w;
                    String str = this.f34874y;
                    String str2 = this.f34875z;
                    Integer d10 = co.b.d(this.A);
                    this.f34872w = 1;
                    obj = mRRequest.getLiveOnlineUsers(str, str2, d10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                i.this.E.a(new q0.x1((LiveOnlineUsersResponse) obj));
            } catch (CancellationException unused) {
            } catch (Throwable th2) {
                i.this.E.a(new q0.w1(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$loadProfile$1", f = "PlayerActionCreator.kt", l = {205}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34876w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34878y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f34879z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, String str2, ao.d<? super o> dVar) {
            super(2, dVar);
            this.f34878y = str;
            this.f34879z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new o(this.f34878y, this.f34879z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((o) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34876w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    String str = this.f34878y;
                    String str2 = this.f34879z;
                    this.f34876w = 1;
                    obj = mRRequest.getUserProfile(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                i.this.E.a(new q0.p0((UserProfile) obj));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$loadViewerAppUserDetail$1", f = "PlayerActionCreator.kt", l = {216}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34880w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34882y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f34883z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, String str2, ao.d<? super p> dVar) {
            super(2, dVar);
            this.f34882y = str;
            this.f34883z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new p(this.f34882y, this.f34883z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((p) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34880w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    String str = this.f34882y;
                    String str2 = this.f34883z;
                    this.f34880w = 1;
                    obj = mRRequest.getAppUserDetail(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                i.this.E.a(new q0.t0((AppUserDetailResponse) obj));
            } catch (Throwable th2) {
                i.this.E.a(new q0.s0(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$postAddMyApp$1", f = "PlayerActionCreator.kt", l = {605}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class q extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34884w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34886y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f34887z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, String str2, ao.d<? super q> dVar) {
            super(2, dVar);
            this.f34886y = str;
            this.f34887z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new q(this.f34886y, this.f34887z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((q) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34884w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    String str = this.f34886y;
                    ep.c0 appMyAppRequestBody = ApiUtil.INSTANCE.appMyAppRequestBody(this.f34887z);
                    this.f34884w = 1;
                    obj = mRRequest.postAddMyApp(str, appMyAppRequestBody, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                StatusResponse statusResponse = (StatusResponse) obj;
                i.this.E.a(q0.b.f47127a);
            } catch (Throwable th2) {
                i.this.E.a(new q0.e(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$postAnswer$1", f = "PlayerActionCreator.kt", l = {396}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class r extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;

        /* renamed from: w  reason: collision with root package name */
        public int f34888w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f34889x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i f34890y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f34891z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(boolean z10, i iVar, String str, int i10, int i11, ao.d<? super r> dVar) {
            super(2, dVar);
            this.f34889x = z10;
            this.f34890y = iVar;
            this.f34891z = str;
            this.A = i10;
            this.B = i11;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new r(this.f34889x, this.f34890y, this.f34891z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((r) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34888w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    int i11 = this.f34889x ? 1 : 0;
                    MRRequest mRRequest = this.f34890y.f34806w;
                    String str = this.f34891z;
                    int i12 = this.A;
                    int i13 = this.B;
                    this.f34888w = 1;
                    if (mRRequest.postQuizPostAnswer(Referer.LIVE_VIEW, str, i12, i13, i11, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                this.f34890y.E.a(q0.d.f47134a);
            } catch (Throwable th2) {
                if (this.B != 0) {
                    this.f34890y.E.a(new q0.c(MRErrorKt.convertMRException(th2).getError()));
                } else {
                    return wn.v.f59242a;
                }
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$postAppUserDetail$1", f = "PlayerActionCreator.kt", l = {249}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class s extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ boolean B;

        /* renamed from: w  reason: collision with root package name */
        public int f34892w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34894y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ jf.a f34895z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, jf.a aVar, String str2, boolean z10, ao.d<? super s> dVar) {
            super(2, dVar);
            this.f34894y = str;
            this.f34895z = aVar;
            this.A = str2;
            this.B = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new s(this.f34894y, this.f34895z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((s) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34892w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    String str = this.f34894y;
                    int c11 = this.f34895z.c();
                    String str2 = this.A;
                    int i11 = this.B ? 1 : 0;
                    this.f34892w = 1;
                    obj = mRRequest.postAppUserDetail(Referer.LIVE_VIEW, str, c11, str2, i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                i.this.E.a(new q0.v0((AppUserDetailResponse) obj));
            } catch (Throwable th2) {
                i.this.E.a(new q0.u0(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$postDeleteMyApp$1", f = "PlayerActionCreator.kt", l = {616}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class t extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34896w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34898y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f34899z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str, String str2, ao.d<? super t> dVar) {
            super(2, dVar);
            this.f34898y = str;
            this.f34899z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new t(this.f34898y, this.f34899z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((t) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34896w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    String str = this.f34898y;
                    ep.c0 appMyAppRequestBody = ApiUtil.INSTANCE.appMyAppRequestBody(this.f34899z);
                    this.f34896w = 1;
                    if (mRRequest.postDeleteMyApp(str, appMyAppRequestBody, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                i.this.E.a(q0.r.f47179a);
            } catch (Throwable th2) {
                i.this.E.a(new q0.e(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$postLiveComment$1", f = "PlayerActionCreator.kt", l = {642}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class u extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ String B;
        public final /* synthetic */ String C;
        public final /* synthetic */ String D;
        public final /* synthetic */ String E;
        public final /* synthetic */ String F;
        public final /* synthetic */ String G;
        public final /* synthetic */ String H;

        /* renamed from: w  reason: collision with root package name */
        public int f34900w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f34901x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i f34902y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f34903z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(boolean z10, i iVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ao.d<? super u> dVar) {
            super(2, dVar);
            this.f34901x = z10;
            this.f34902y = iVar;
            this.f34903z = str;
            this.A = i10;
            this.B = str2;
            this.C = str3;
            this.D = str4;
            this.E = str5;
            this.F = str6;
            this.G = str7;
            this.H = str8;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new u(this.f34901x, this.f34902y, this.f34903z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((u) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object postLiveComment;
            Object c10 = bo.c.c();
            int i10 = this.f34900w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    String str = this.f34901x ? "template_comment" : null;
                    MRRequest mRRequest = this.f34902y.f34806w;
                    String str2 = this.f34903z;
                    int i11 = this.A;
                    String str3 = this.B;
                    String str4 = this.C;
                    String str5 = this.D;
                    String str6 = this.E;
                    String str7 = this.F;
                    String str8 = this.G;
                    String str9 = this.H;
                    this.f34900w = 1;
                    postLiveComment = mRRequest.postLiveComment(Referer.LIVE_VIEW, str2, i11, str3, str4, str5, str, str6, str7, str8, str9, this);
                    if (postLiveComment == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                    postLiveComment = obj;
                }
                this.f34902y.E.a(new q0.w0(this.A, (LiveCommentResponse) postLiveComment));
            } catch (Throwable th2) {
                this.f34902y.E.a(new q0.e(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$postLiveLeave$1", f = "PlayerActionCreator.kt", l = {583}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class v extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34904w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34906y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str, ao.d<? super v> dVar) {
            super(2, dVar);
            this.f34906y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new v(this.f34906y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((v) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34904w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    String str = this.f34906y;
                    this.f34904w = 1;
                    if (mRRequest.postLiveLeave(Referer.LIVE_VIEW, str, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
            } catch (Throwable th2) {
                g9.a.c(th2);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$postPopupRead$1", f = "PlayerActionCreator.kt", l = {594}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class w extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34907w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f34909y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(int i10, ao.d<? super w> dVar) {
            super(2, dVar);
            this.f34909y = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new w(this.f34909y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((w) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34907w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    int i11 = this.f34909y;
                    this.f34907w = 1;
                    if (mRRequest.postPopupRead(Referer.LIVE_VIEW, i11, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
            } catch (Throwable th2) {
                g9.a.c(th2);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$reloadComments$1", f = "PlayerActionCreator.kt", l = {285}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class x extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f34910w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34912y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ te.c f34913z;

        /* loaded from: classes2.dex */
        public static final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return zn.a.c(Integer.valueOf(((t2) t11).f()), Integer.valueOf(((t2) t10).f()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(String str, te.c cVar, String str2, ao.d<? super x> dVar) {
            super(2, dVar);
            this.f34912y = str;
            this.f34913z = cVar;
            this.A = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new x(this.f34912y, this.f34913z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((x) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00c4 A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:5:0x000d, B:13:0x0035, B:14:0x004c, B:16:0x0053, B:20:0x0096, B:21:0x00a4, B:23:0x00b5, B:31:0x00c4, B:33:0x0101, B:10:0x001e), top: B:37:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0100  */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instructions count: 282
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: hb.i.x.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$reloadEmomoRunGifts$1", f = "PlayerActionCreator.kt", l = {451}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class y extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34914w;

        public y(ao.d<? super y> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new y(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((y) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34914w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    this.f34914w = 1;
                    obj = mRRequest.giftEmomoRunGifts(Referer.LIVE_VIEW, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                Gift.EmomoRunGifts emomoRunGifts = (Gift.EmomoRunGifts) obj;
                q8.a aVar = i.this.E;
                List<Gift.GiftParams> gifts = emomoRunGifts.getGifts();
                ArrayList arrayList = new ArrayList(xn.t.u(gifts, 10));
                for (Gift.GiftParams giftParams : gifts) {
                    arrayList.add(new jf.r().a(giftParams, Referer.SHORTCUT_GIFT));
                }
                aVar.a(new q0.d1(arrayList, emomoRunGifts.getHelpPageUrl()));
            } catch (Throwable th2) {
                i.this.E.a(new q0.c1(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActionCreator$reloadGiftPanels$1", f = "PlayerActionCreator.kt", l = {434}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class z extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34916w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34918y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(String str, ao.d<? super z> dVar) {
            super(2, dVar);
            this.f34918y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new z(this.f34918y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((z) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34916w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f34806w;
                    String str = this.f34918y;
                    this.f34916w = 1;
                    obj = mRRequest.getGiftPanels(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                GiftPanelsResponse giftPanelsResponse = (GiftPanelsResponse) obj;
                q8.a aVar = i.this.E;
                List<GiftPanelsResponse.PanelParams> panels = giftPanelsResponse.getPanels();
                ArrayList arrayList = new ArrayList(xn.t.u(panels, 10));
                int i11 = 0;
                for (Object obj2 : panels) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        xn.s.t();
                    }
                    arrayList.add(new jf.t().a((GiftPanelsResponse.PanelParams) obj2, i11 == giftPanelsResponse.getDefaultIndex(), Referer.LIVE_VIEW));
                    i11 = i12;
                }
                aVar.a(new q0.f1(arrayList));
            } catch (Throwable th2) {
                i.this.E.a(new q0.e1(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public i(MRRequest mRRequest, EmomoApi emomoApi, LiveGameApi liveGameApi, hf.c cVar, kf.x xVar, MRLogger mRLogger, hf.v0 v0Var, hf.d0 d0Var, q8.a aVar, nd.i1 i1Var, MirrorDatabase mirrorDatabase) {
        uo.b0 b10;
        jo.p.h(mRRequest, "request");
        jo.p.h(emomoApi, "emomoApi");
        jo.p.h(liveGameApi, "liveGameApi");
        jo.p.h(cVar, "appManagementHelper");
        jo.p.h(xVar, "userPreference");
        jo.p.h(mRLogger, "logger");
        jo.p.h(v0Var, "userHelper");
        jo.p.h(d0Var, "liveHelper");
        jo.p.h(aVar, "dispatcher");
        jo.p.h(i1Var, "sharedApplicationModel");
        jo.p.h(mirrorDatabase, "mirrorDatabase");
        this.f34806w = mRRequest;
        this.f34807x = emomoApi;
        this.f34808y = liveGameApi;
        this.f34809z = cVar;
        this.A = xVar;
        this.B = mRLogger;
        this.C = v0Var;
        this.D = d0Var;
        this.E = aVar;
        this.F = i1Var;
        this.G = mirrorDatabase;
        b10 = i2.b(null, 1, null);
        this.H = b10;
    }

    public final void A(int i10, String str) {
        jo.p.h(str, "giftId");
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new h(i10, str, null), 3, null);
    }

    public final void B(String str) {
        jo.p.h(str, "liveId");
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new C0442i(str, null), 3, null);
    }

    public final void C() {
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new j(null), 3, null);
    }

    public final void D(String str, String str2) {
        jo.p.h(str, "ownerUserId");
        jo.p.h(str2, "referer");
        uo.l.d(uo.r0.a(uo.g1.c()), null, null, new k(str2, str, null), 3, null);
    }

    public final void E(String str, String str2) {
        jo.p.h(str, "castUserId");
        jo.p.h(str2, "liveId");
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new l(str2, null), 3, null);
    }

    public final void F(LiveChangedResponse liveChangedResponse) {
        jo.p.h(liveChangedResponse, "response");
        this.E.a(new q0.d0(liveChangedResponse));
    }

    public final void G(String str) {
        jo.p.h(str, "liveId");
        this.E.a(q0.l0.f47161a);
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new m(str, null), 3, null);
    }

    public final void H(String str, String str2, int i10) {
        uo.d2 d10;
        jo.p.h(str, "liveId");
        jo.p.h(str2, "referer");
        d2.a.a(this.H, null, 1, null);
        d10 = uo.l.d(uo.r0.a(uo.g1.c()), null, null, new n(str2, str, i10, null), 3, null);
        this.H = d10;
    }

    public final void I(String str, String str2) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "referer");
        this.E.a(q0.r0.f47180a);
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new o(str2, str, null), 3, null);
    }

    public final void J(String str, String str2) {
        jo.p.h(str, "appId");
        jo.p.h(str2, "referer");
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new p(str2, str, null), 3, null);
    }

    public final void K() {
        this.E.a(q0.x.f47198a);
    }

    public final void L(te.c cVar) {
        jo.p.h(cVar, "params");
        q8.a aVar = this.E;
        hf.c cVar2 = this.f34809z;
        App.AppParams app = cVar.getApp();
        aVar.a(new q0.h0(cVar, cVar2.d(app != null ? app.getAppId() : null)));
        this.E.a(new q0.l1(cVar.getModeratorUserId()));
    }

    public final void M(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "appId");
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new q(str, str2, null), 3, null);
    }

    public final void N(String str, int i10, int i11, boolean z10) {
        jo.p.h(str, "quizId");
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new r(z10, this, str, i10, i11, null), 3, null);
    }

    public final void O(String str, jf.a aVar, String str2, boolean z10) {
        jo.p.h(str, "appId");
        jo.p.h(aVar, "type");
        jo.p.h(str2, "value");
        this.E.a(q0.o1.f47172a);
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new s(str, aVar, str2, z10, null), 3, null);
    }

    public final void P(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "appId");
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new t(str, str2, null), 3, null);
    }

    public final void Q(String str, int i10, String str2, String str3, String str4, boolean z10, String str5, String str6, String str7, String str8) {
        jo.p.h(str, "liveId");
        if (this.C.l()) {
            uo.l.d(uo.r0.a(uo.g1.b()), null, null, new u(z10, this, str, i10, str2, str3, str4, str5, str6, str7, str8, null), 3, null);
        }
    }

    public final void S(String str) {
        jo.p.h(str, "liveId");
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new v(str, null), 3, null);
    }

    public final void T(int i10) {
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new w(i10, null), 3, null);
    }

    public final void U(r2 r2Var) {
        jo.p.h(r2Var, "comment");
        this.E.a(new q0.a1(r2Var));
    }

    public final void V(GiftItem giftItem) {
        jo.p.h(giftItem, "giftItem");
        this.E.a(new q0.b1(giftItem));
    }

    public final void W(App.AppParams appParams) {
        jo.p.h(appParams, "app");
        this.E.a(new q0.h(appParams));
    }

    public final void X(te.c cVar, String str, String str2) {
        jo.p.h(cVar, "params");
        jo.p.h(str, "referer");
        jo.p.h(str2, "viewerName");
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new x(str, cVar, str2, null), 3, null);
    }

    public final void Y() {
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new y(null), 3, null);
    }

    public final void Z(String str) {
        jo.p.h(str, "liveId");
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new z(str, null), 3, null);
    }

    public final void a(String str, String str2, String str3, String str4, CollabType collabType) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        jo.p.h(str3, "liveOwnerId");
        jo.p.h(str4, "liveOwnerName");
        jo.p.h(collabType, "collabType");
        this.E.a(q0.n1.f47169a);
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new a(str, str2, collabType, str3, str4, null), 3, null);
    }

    public final void a0(String str, String str2) {
        uo.d2 d10;
        jo.p.h(str, "liveId");
        jo.p.h(str2, "referer");
        d2.a.a(this.H, null, 1, null);
        d10 = uo.l.d(uo.r0.a(uo.g1.c()), null, null, new a0(str2, str, null), 3, null);
        this.H = d10;
    }

    public final void b0() {
        this.E.a(q0.h1.f47149a);
    }

    public final void c0(String str, String str2, int i10, int i11) {
        jo.p.h(str, "liveId");
        jo.p.h(str2, "giftId");
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new b0(str, str2, i10, i11, null), 3, null);
    }

    public final void d0(boolean z10) {
        MRLogger mRLogger = this.B;
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_WIPE_END);
        builder.setTargetType(z10 ? MRLog.TARGET_TYPE_RETURN_VIEW : MRLog.TARGET_TYPE_WIPE_CLOSE);
        mRLogger.sendLog(builder.build());
    }

    public final void e0() {
        this.B.sendLog(new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_WIPE_START).build());
    }

    public final void f0(List<String> list) {
        Object obj;
        boolean z10;
        this.G.C();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (this.G.C().c((String) obj) == null) {
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
            String str = (String) obj;
            if (str != null) {
                this.G.C().b(new zd.a(str, null, 2, null));
                this.E.a(new q0.m1(str));
            }
        }
    }

    public final void g0(QuizMessage quizMessage) {
        jo.p.h(quizMessage, "quizMessage");
        this.E.a(new q0.y0(quizMessage));
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final void h0(String str, String str2, boolean z10) {
        jo.p.h(str, TtmlNode.ATTR_ID);
        jo.p.h(str2, "liveId");
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new c0(str, z10, str2, null), 3, null);
    }

    public final void i0(String str, boolean z10) {
        jo.p.h(str, "liveId");
        this.E.a(new q0.g0(str));
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new d0(str, null), 3, null);
    }

    public final void j0(QuizMessage quizMessage) {
        jo.p.h(quizMessage, "quizMessage");
        this.E.a(new q0.z0(quizMessage));
    }

    public final void k() {
        this.E.a(q0.g.f47143a);
    }

    public final void k0(String str, String str2) {
        jo.p.h(str, "ownerUserId");
        jo.p.h(str2, "referer");
        uo.l.d(uo.r0.a(uo.g1.c()), null, null, new e0(str2, str, null), 3, null);
    }

    public final void l(String str) {
        jo.p.h(str, "userId");
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new b(str, null), 3, null);
    }

    public final void l0(jf.f fVar) {
        jo.p.h(fVar, "coin");
        this.E.a(new q0.q1(fVar));
    }

    public final void m(String str, String str2) {
        jo.p.h(str, "liveId");
        jo.p.h(str2, "playId");
        this.E.a(q0.e0.f47139a);
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new c(str, str2, null), 3, null);
    }

    public final void m0(int i10) {
        this.E.a(new q0.r1(i10));
    }

    public final void n() {
        this.E.a(q0.g1.f47145a);
    }

    public final void n0(EmomoQuestGameStateBcsvrResponse emomoQuestGameStateBcsvrResponse) {
        jo.p.h(emomoQuestGameStateBcsvrResponse, "emomoQuestState");
        this.E.a(new q0.s1(emomoQuestGameStateBcsvrResponse));
    }

    public final void o(boolean z10) {
        this.E.a(new q0.b0(z10));
    }

    public final void o0(EmomoRunState emomoRunState) {
        jo.p.h(emomoRunState, "emomoRunState");
        this.E.a(new q0.t1(emomoRunState));
    }

    public final void p() {
        this.E.a(q0.j.f47155a);
    }

    public final void p0(GiftRankingChangedBcsvrResponse giftRankingChangedBcsvrResponse) {
        jo.p.h(giftRankingChangedBcsvrResponse, "giftRanking");
        this.E.a(new q0.z(giftRankingChangedBcsvrResponse));
    }

    public final void q(CollabChangedBcsvrResponse collabChangedBcsvrResponse) {
        jo.p.h(collabChangedBcsvrResponse, "collabChanged");
        this.E.a(new q0.k(collabChangedBcsvrResponse));
    }

    public final void q0(LinkedLive linkedLive) {
        this.E.a(new q0.u1(linkedLive));
    }

    public final void r(int i10) {
        this.E.a(new q0.o(i10));
    }

    public final void r0(String str) {
        this.E.a(new q0.l1(str));
    }

    public final void s(String str) {
        jo.p.h(str, "liveId");
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new d(str, null), 3, null);
    }

    public final void s0(List<RankingUser> list) {
        this.E.a(new q0.y(list));
    }

    public final void t(String str) {
        jo.p.h(str, "liveId");
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new e(str, null), 3, null);
    }

    public final void t0(jf.f fVar) {
        jo.p.h(fVar, "coin");
        this.E.a(new s.j(fVar));
    }

    public final void u(String str) {
        jo.p.h(str, "appId");
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new f(str, null), 3, null);
    }

    public final void u0(int i10) {
        this.E.a(new q0.p1(i10));
    }

    public final void v(jf.q qVar) {
        jo.p.h(qVar, "gift");
        this.E.a(new q0.a0(qVar));
    }

    public final void v0(UserLevelUpdate userLevelUpdate) {
        jo.p.h(userLevelUpdate, "userLevelUpdate");
        this.E.a(new q0.v1(userLevelUpdate));
    }

    public final void w() {
        this.E.a(q0.x0.f47199a);
    }

    public final void x(long j10) {
        this.E.a(new q0.s(j10));
    }

    public final void y(jf.q qVar) {
        jo.p.h(qVar, "gift");
        this.E.a(new q0.t(qVar));
    }

    public final void z(String str) {
        jo.p.h(str, "liveId");
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new g(str, null), 3, null);
    }
}
