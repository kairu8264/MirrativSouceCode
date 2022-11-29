package od;

import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarResponse;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.core.StatusResponse;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import com.dena.mirrorman.net.api.response.CollabRequestResponse;
import com.dena.mirrorman.net.api.response.CollabType;
import com.dena.mirrorman.net.api.response.ConnectedStreamingCollabLive;
import com.dena.mirrorman.net.api.response.ConnectedStreamingCollabLivesResponse;
import com.dena.mirrorman.net.api.response.EmomoRunGameGift;
import com.dena.mirrorman.net.api.response.FeverValue;
import com.dena.mirrorman.net.api.response.GiftGachaOpenResponse;
import com.dena.mirrorman.net.api.response.MutualGiftReceiveRewardResponse;
import com.dena.mirrorman.net.api.response.SimpleGiftGachaStock;
import com.dena.mirrorman.net.api.response.event.RankingUserDetailResponse;
import com.dena.mirrorman.net.api.response.live.LiveEndResponse;
import com.dena.mirrorman.net.api.response.live.LiveHeartbeatResponse;
import com.dena.mirrorman.net.api.response.live.LiveOwnedResponse;
import com.dena.mirrorman.net.api.response.livegame.NewCountsResponse;
import com.dena.mirrorman.net.bcsvr.response.EventFeverState;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingChangedBcsvrResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.dena.mirrorman.unity.CollabAvatar;
import com.dena.mirrorman.unity.UnityManager;
import java.util.ArrayList;
import java.util.List;
import pd.c;
import pd.f;
import pd.g;
import pd.s;
import ud.d4;
import uo.g1;
import uo.i2;

/* loaded from: classes2.dex */
public final class b implements uo.q0 {
    public final hf.m0 A;
    public final hf.s B;
    public final kf.p C;
    public final ao.g D;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44660w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f44661x;

    /* renamed from: y  reason: collision with root package name */
    public final kf.t f44662y;

    /* renamed from: z  reason: collision with root package name */
    public final hf.d0 f44663z;

    @co.f(c = "com.dena.mirrorman.actioncreator.CastServiceActionCreator$addCollabAvatar$1", f = "CastServiceActionCreator.kt", l = {334}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44664w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44666y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f44666y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f44666y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44664w;
            if (i10 == 0) {
                wn.m.b(obj);
                MRRequest mRRequest = b.this.f44661x;
                String str = this.f44666y;
                this.f44664w = 1;
                obj = MRRequest.DefaultImpls.requestClosetAvatar$default(mRRequest, null, str, this, 1, null);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            UnityManager.Companion.getInstance().getCollabAvatarManager().add(new CollabAvatar(Integer.parseInt(this.f44666y), -1, jf.c.f37906y.a(((ClosetAvatarResponse) obj).getAvatar().clone())));
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CastServiceActionCreator$commentUrl$1", f = "CastServiceActionCreator.kt", l = {82}, m = "invokeSuspend")
    /* renamed from: od.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0676b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44667w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44669y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0676b(String str, ao.d<? super C0676b> dVar) {
            super(2, dVar);
            this.f44669y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C0676b(this.f44669y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C0676b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44667w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = b.this.f44661x;
                    String str = this.f44669y;
                    Integer d10 = co.b.d(49);
                    Integer d11 = co.b.d(2);
                    this.f44667w = 1;
                    if (MRRequest.DefaultImpls.commentRequestAsync$default(mRRequest, Referer.BROADCAST_AVATAR, str, null, d10, null, null, null, null, d11, this, 244, null) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                b.this.f44660w.a(c.f.f46637a);
            } catch (Throwable th2) {
                b.this.f44660w.a(new c.e(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CastServiceActionCreator$commentUserId$1", f = "CastServiceActionCreator.kt", l = {67}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44670w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44672y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f44672y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f44672y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44670w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = b.this.f44661x;
                    String str = this.f44672y;
                    Integer d10 = co.b.d(49);
                    Integer d11 = co.b.d(1);
                    this.f44670w = 1;
                    if (MRRequest.DefaultImpls.commentRequestAsync$default(mRRequest, Referer.BROADCAST_AVATAR, str, null, d10, null, null, null, null, d11, this, 244, null) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
            } catch (Throwable th2) {
                b.this.f44660w.a(new c.d(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CastServiceActionCreator$deleteAppDetailId$1", f = "CastServiceActionCreator.kt", l = {120}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44673w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44675y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f44675y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f44675y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44673w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = b.this.f44661x;
                    String str = this.f44675y;
                    this.f44673w = 1;
                    if (mRRequest.deleteAppUserDetail(Referer.BROADCAST_AVATAR, str, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                b.this.f44660w.a(c.h.f46641a);
            } catch (Throwable th2) {
                b.this.f44660w.a(new c.g(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CastServiceActionCreator$fetchConnectedCollabLives$1", f = "CastServiceActionCreator.kt", l = {356}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44676w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44678y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f44678y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f44678y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44676w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = b.this.f44661x;
                    String str = this.f44678y;
                    this.f44676w = 1;
                    obj = mRRequest.getConnectedStreamingCollabLives(Referer.BROADCAST, str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                g9.a.g("CastServiceActionCreator fetchConnectedCollabLives");
                b.this.f44660w.a(new c.s((ConnectedStreamingCollabLivesResponse) obj));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CastServiceActionCreator$fetchGiftRankingCurrentUserRank$1", f = "CastServiceActionCreator.kt", l = {464}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44679w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44681y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f44681y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f44681y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44679w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = b.this.f44661x;
                    String str = this.f44681y;
                    this.f44679w = 1;
                    obj = mRRequest.getRankingUserDetail(Referer.BROADCAST, str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                b.this.f44660w.a(new c.m((RankingUserDetailResponse) obj));
            } catch (Throwable th2) {
                b.this.f44660w.a(new c.l(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CastServiceActionCreator$follow$1", f = "CastServiceActionCreator.kt", l = {440}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44682w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44684y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44685z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f44684y = str;
            this.f44685z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f44684y, this.f44685z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44682w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = b.this.f44661x;
                    String str = this.f44684y;
                    String str2 = this.f44685z;
                    this.f44682w = 1;
                    obj = mRRequest.postFollow(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                StatusResponse statusResponse = (StatusResponse) obj;
                b.this.f44660w.a(new s.C0720s(this.f44685z));
            } catch (Exception unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CastServiceActionCreator$foregroundAppChanged$1", f = "CastServiceActionCreator.kt", l = {450}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44686w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44688y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44689z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f44688y = str;
            this.f44689z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f44688y, this.f44689z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44686w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = b.this.f44661x;
                    String str = this.f44688y;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = this.f44689z;
                    this.f44686w = 1;
                    if (mRRequest.postLiveAppIdentifierChanged(Referer.BROADCAST, str, str2, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
            } catch (Exception unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CastServiceActionCreator$liveEnd$1", f = "CastServiceActionCreator.kt", l = {374}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44690w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44692y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f44692y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f44692y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44690w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    int i11 = b.this.A.c() ? 1 : 0;
                    MRRequest mRRequest = b.this.f44661x;
                    String str = this.f44692y;
                    Integer d10 = co.b.d(0);
                    this.f44690w = 1;
                    obj = mRRequest.postLiveEnd(Referer.BROADCAST, str, d10, i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                b.this.f44663z.a();
                b.this.f44663z.f((LiveEndResponse) obj);
                b.this.f44660w.a(c.p.f46658a);
            } catch (Exception e10) {
                g9.a aVar = g9.a.f32826a;
                aVar.b("live_end failed " + this.f44692y + " : " + e10.getMessage(), new Object[0]);
                b.this.f44660w.a(new c.o(MRErrorKt.convertMRException(e10).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CastServiceActionCreator$loadLiveGameNewCounts$1", f = "CastServiceActionCreator.kt", l = {518}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44693w;

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
            int i10 = this.f44693w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    long d32 = b.this.C.d3();
                    MRRequest mRRequest = b.this.f44661x;
                    String valueOf = String.valueOf(d32);
                    this.f44693w = 1;
                    obj = mRRequest.getLiveGameNewCounts("", valueOf, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                b.this.f44660w.a(new c.u((NewCountsResponse) obj));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CastServiceActionCreator$loadViewerAppUserDetail$1", f = "CastServiceActionCreator.kt", l = {56}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44695w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44697y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, ao.d<? super k> dVar) {
            super(2, dVar);
            this.f44697y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(this.f44697y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44695w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = b.this.f44661x;
                    String str = this.f44697y;
                    this.f44695w = 1;
                    obj = mRRequest.getAppUserDetail(Referer.BROADCAST_AVATAR, str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                b.this.f44660w.a(new c.b((AppUserDetailResponse) obj));
            } catch (Throwable th2) {
                b.this.f44660w.a(new c.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CastServiceActionCreator$openGiftGacha$1", f = "CastServiceActionCreator.kt", l = {173}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44698w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44700y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ud.m0 f44701z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, ud.m0 m0Var, ao.d<? super l> dVar) {
            super(2, dVar);
            this.f44700y = str;
            this.f44701z = m0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new l(this.f44700y, this.f44701z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44698w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = b.this.f44661x;
                    String str = this.f44700y;
                    String h10 = this.f44701z.h();
                    int b10 = this.f44701z.b();
                    int c11 = this.f44701z.c();
                    int rawValue = this.f44701z.e().getRawValue();
                    int d10 = this.f44701z.d();
                    this.f44698w = 1;
                    obj = mRRequest.postGiftGachaOpen(Referer.BROADCAST_AVATAR, str, h10, b10, c11, rawValue, d10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                b.this.f44660w.a(new c.w((GiftGachaOpenResponse) obj, this.f44701z.e()));
            } catch (Exception unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CastServiceActionCreator$openMutualGift$1", f = "CastServiceActionCreator.kt", l = {197}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44702w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ud.o0 f44704y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ud.o0 o0Var, ao.d<? super m> dVar) {
            super(2, dVar);
            this.f44704y = o0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new m(this.f44704y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44702w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = b.this.f44661x;
                    int b10 = this.f44704y.b();
                    String d10 = this.f44704y.d();
                    this.f44702w = 1;
                    obj = mRRequest.postMutualGiftReceiveReward(b10, d10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                b.this.f44660w.a(new c.x((MutualGiftReceiveRewardResponse) obj, this.f44704y));
            } catch (Exception unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CastServiceActionCreator$postAppUserDetail$1", f = "CastServiceActionCreator.kt", l = {103}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ boolean B;

        /* renamed from: w  reason: collision with root package name */
        public int f44705w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44707y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ jf.a f44708z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, jf.a aVar, String str2, boolean z10, ao.d<? super n> dVar) {
            super(2, dVar);
            this.f44707y = str;
            this.f44708z = aVar;
            this.A = str2;
            this.B = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new n(this.f44707y, this.f44708z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((n) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44705w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = b.this.f44661x;
                    String str = this.f44707y;
                    int c11 = this.f44708z.c();
                    String str2 = this.A;
                    int i11 = this.B ? 1 : 0;
                    this.f44705w = 1;
                    obj = mRRequest.postAppUserDetail(Referer.BROADCAST_AVATAR, str, c11, str2, i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                b.this.f44660w.a(new c.b0((AppUserDetailResponse) obj));
            } catch (Throwable th2) {
                b.this.f44660w.a(new c.a0(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CastServiceActionCreator$postLiveComment$1", f = "CastServiceActionCreator.kt", l = {314}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44709w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44711y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, ao.d<? super o> dVar) {
            super(2, dVar);
            this.f44711y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new o(this.f44711y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((o) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            o oVar;
            Object c10 = bo.c.c();
            int i10 = this.f44709w;
            if (i10 == 0) {
                wn.m.b(obj);
                try {
                    MRRequest mRRequest = b.this.f44661x;
                    String c11 = b.this.f44663z.c();
                    String str = this.f44711y;
                    this.f44709w = 1;
                    if (MRRequest.DefaultImpls.postLiveComment$default(mRRequest, Referer.BROADCAST, c11, 1, str, null, null, null, null, null, null, null, this, 2032, null) == c10) {
                        return c10;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    oVar = this;
                    b.this.f44660w.a(new c.i(oVar.f44711y, MRErrorKt.convertMRException(th).getError()));
                    return wn.v.f59242a;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                try {
                    wn.m.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    oVar = this;
                    b.this.f44660w.a(new c.i(oVar.f44711y, MRErrorKt.convertMRException(th).getError()));
                    return wn.v.f59242a;
                }
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CastServiceActionCreator$reconnectCollab$1", f = "CastServiceActionCreator.kt", l = {388}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44712w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ConnectedStreamingCollabLive f44714y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ConnectedStreamingCollabLive connectedStreamingCollabLive, ao.d<? super p> dVar) {
            super(2, dVar);
            this.f44714y = connectedStreamingCollabLive;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new p(this.f44714y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((p) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44712w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = b.this.f44661x;
                    String liveId = this.f44714y.getLive().getLiveId();
                    int rawValue = CollabType.LIVE.getRawValue();
                    Integer d10 = co.b.d(1);
                    this.f44712w = 1;
                    obj = mRRequest.postCollabRequest(Referer.BROADCAST, liveId, rawValue, d10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                CollabRequestResponse collabRequestResponse = (CollabRequestResponse) obj;
                b.this.f44660w.a(new g.j(new jf.h(this.f44714y.getLive().getLiveId(), this.f44714y.getLive().getOwner().getUserId(), this.f44714y.getLive().getOwner().getName(), collabRequestResponse.getCollabUnicastHost(), collabRequestResponse.getCollabUnicastPort(), collabRequestResponse.getCollabUnicastKey(), collabRequestResponse.getStunServers(), collabRequestResponse.getTurnServers(), collabRequestResponse.getStreamingCollabLiveId(), CollabType.LIVE, "REQUEST_COLLAB")));
            } catch (Throwable th2) {
                b.this.f44660w.a(new c.j(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CastServiceActionCreator$updateEmomoVisible$1", f = "CastServiceActionCreator.kt", l = {528, 530}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class q extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44715w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44717y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f44718z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, boolean z10, ao.d<? super q> dVar) {
            super(2, dVar);
            this.f44717y = str;
            this.f44718z = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new q(this.f44717y, this.f44718z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((q) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44715w;
            if (i10 == 0) {
                wn.m.b(obj);
                MRRequest mRRequest = b.this.f44661x;
                String str = this.f44717y;
                boolean z10 = this.f44718z;
                this.f44715w = 1;
                if (mRRequest.postLiveUpdateEmomoVisible(str, z10, this) == c10) {
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
            MRRequest mRRequest2 = b.this.f44661x;
            String str2 = this.f44717y;
            int i11 = this.f44718z ? 0 : 1;
            this.f44715w = 2;
            if (mRRequest2.postLiveUpdateWipeEnabled(str2, i11, this) == c10) {
                return c10;
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CastServiceActionCreator$updateMatchingEnable$1", f = "CastServiceActionCreator.kt", l = {425}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class r extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ boolean A;

        /* renamed from: w  reason: collision with root package name */
        public int f44719w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44721y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44722z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, String str2, boolean z10, ao.d<? super r> dVar) {
            super(2, dVar);
            this.f44721y = str;
            this.f44722z = str2;
            this.A = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new r(this.f44721y, this.f44722z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((r) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44719w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = b.this.f44661x;
                    String str = this.f44721y;
                    String str2 = this.f44722z;
                    int i11 = this.A ? 1 : 0;
                    this.f44719w = 1;
                    if (mRRequest.postCollabMatchingEnable(str, str2, i11, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                b.this.f44660w.a(new c.c0(this.A));
            } catch (Exception unused) {
            }
            return wn.v.f59242a;
        }
    }

    public b(q8.a aVar, MRRequest mRRequest, kf.t tVar, hf.d0 d0Var, hf.m0 m0Var, hf.s sVar, kf.p pVar) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(tVar, "settingPreference");
        jo.p.h(d0Var, "liveHelper");
        jo.p.h(m0Var, "settingHelper");
        jo.p.h(sVar, "getCurrentTimeMillis");
        jo.p.h(pVar, "noticePreference");
        this.f44660w = aVar;
        this.f44661x = mRRequest;
        this.f44662y = tVar;
        this.f44663z = d0Var;
        this.A = m0Var;
        this.B = sVar;
        this.C = pVar;
        uo.k0 b11 = g1.b();
        b10 = i2.b(null, 1, null);
        this.D = b11.plus(b10);
    }

    public final void A() {
        uo.l.d(this, null, null, new j(null), 3, null);
    }

    public final void B(String str) {
        jo.p.h(str, "appId");
        uo.l.d(this, null, null, new k(str, null), 3, null);
    }

    public final void C(String str, ud.m0 m0Var) {
        jo.p.h(str, "liveId");
        jo.p.h(m0Var, "giftGachaStockBindModel");
        uo.l.d(this, null, null, new l(str, m0Var, null), 3, null);
    }

    public final void D(ud.o0 o0Var) {
        jo.p.h(o0Var, "mutualGift");
        uo.l.d(this, null, null, new m(o0Var, null), 3, null);
    }

    public final void E(String str, jf.a aVar, String str2, boolean z10) {
        jo.p.h(str, "appId");
        jo.p.h(aVar, "type");
        jo.p.h(str2, "value");
        uo.l.d(this, null, null, new n(str, aVar, str2, z10, null), 3, null);
    }

    public final void F(String str) {
        jo.p.h(str, "commentText");
        uo.l.d(this, null, null, new o(str, null), 3, null);
    }

    public final void G(EmomoRunGameGift emomoRunGameGift) {
        jo.p.h(emomoRunGameGift, "emomoRunGameGift");
        this.f44660w.a(new c.e0(emomoRunGameGift));
    }

    public final void H(SimpleGiftGachaStock simpleGiftGachaStock) {
        jo.p.h(simpleGiftGachaStock, "giftGachaStock");
        this.f44660w.a(new c.j0(3));
        this.f44660w.a(new c.f0(simpleGiftGachaStock));
    }

    public final void I(ConnectedStreamingCollabLive connectedStreamingCollabLive) {
        jo.p.h(connectedStreamingCollabLive, "connectedLive");
        uo.l.d(this, null, null, new p(connectedStreamingCollabLive, null), 3, null);
    }

    public final void J() {
        this.f44660w.a(new c.p0(this.f44662y.w1(), true));
    }

    public final void K() {
        this.f44660w.a(f.a.f46732a);
    }

    public final void L(String str) {
        jo.p.h(str, "userId");
        UnityManager.Companion.getInstance().getCollabAvatarManager().remove(Integer.parseInt(str));
        this.f44660w.a(new c.g0(str));
    }

    public final void M() {
        this.f44660w.a(c.h0.f46642a);
    }

    public final void N(String str) {
        jo.p.h(str, "liveId");
        this.f44660w.a(new g.n(str, false, 2, null));
    }

    public final void O(d4 d4Var) {
        jo.p.h(d4Var, "liveComment");
        this.f44660w.a(new c.d0(d4Var));
    }

    public final void P(String str) {
        jo.p.h(str, "message");
        this.f44660w.a(new c.k0(str));
    }

    public final void Q() {
        this.f44660w.a(c.m0.f46653a);
    }

    public final void R() {
        this.f44660w.a(c.l0.f46651a);
    }

    public final void S() {
        this.f44660w.a(c.n0.f46655a);
    }

    public final void T() {
        this.f44660w.a(c.o0.f46657a);
    }

    public final void U(boolean z10) {
        this.f44662y.e2(z10);
        this.f44660w.a(new c.p0(z10, false));
    }

    public final void V() {
        this.f44660w.a(new c.p0(true, true));
    }

    public final void W(String str, boolean z10) {
        jo.p.h(str, "liveId");
        uo.l.d(this, null, null, new q(str, z10, null), 3, null);
    }

    public final void X(FeverValue feverValue) {
        jo.p.h(feverValue, "feverValue");
        this.f44660w.a(new c.r0(feverValue));
        this.f44660w.a(new c.t(new EventFeverState(feverValue.getEndsAt() > System.currentTimeMillis() / 1000, feverValue.getEndsAt())));
    }

    public final void Y(GiftRankingChangedBcsvrResponse giftRankingChangedBcsvrResponse) {
        jo.p.h(giftRankingChangedBcsvrResponse, "giftRanking");
        this.f44660w.a(new c.n(giftRankingChangedBcsvrResponse));
    }

    public final void Z(boolean z10) {
        this.f44660w.a(new c.t0(z10));
    }

    public final void a0(String str, String str2, boolean z10) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        uo.l.d(this, null, null, new r(str, str2, z10, null), 3, null);
    }

    public final void f(String str) {
        jo.p.h(str, "userId");
        uo.l.d(this, null, null, new a(str, null), 3, null);
    }

    public final void g() {
        this.f44660w.a(c.C0712c.f46631a);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.D;
    }

    public final void h(String str, int i10) {
        jo.p.h(str, "userId");
        this.f44660w.a(new c.q0(str, i10));
    }

    public final void i(boolean z10) {
        this.f44660w.a(new c.s0(z10));
    }

    public final void j(List<? extends d4> list, String str) {
        jo.p.h(str, "acceptedUserId");
        if (list == null) {
            return;
        }
        q8.a aVar = this.f44660w;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            d4 d4Var = (d4) obj;
            if ((d4Var.d() == 10 && jo.p.c(d4Var.e(), str)) ? false : true) {
                arrayList.add(obj);
            }
        }
        aVar.a(new c.i0(arrayList));
    }

    public final void k(List<? extends d4> list, String str) {
        jo.p.h(str, "requestedUserId");
        if (list == null) {
            return;
        }
        q8.a aVar = this.f44660w;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            d4 d4Var = (d4) obj;
            if ((d4Var.d() == 10 && jo.p.c(d4Var.e(), str)) ? false : true) {
                arrayList.add(obj);
            }
        }
        aVar.a(new c.i0(arrayList));
    }

    public final void l(List<? extends d4> list, String str) {
        jo.p.h(str, "requestFailedUserId");
        if (list == null) {
            return;
        }
        q8.a aVar = this.f44660w;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            d4 d4Var = (d4) obj;
            if ((d4Var.d() == 10 && jo.p.c(d4Var.e(), str)) ? false : true) {
                arrayList.add(obj);
            }
        }
        aVar.a(new c.i0(arrayList));
    }

    public final void m(List<? extends d4> list, d4 d4Var) {
        jo.p.h(d4Var, "collabComment");
        if (list == null) {
            return;
        }
        q8.a aVar = this.f44660w;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!jo.p.c((d4) obj, d4Var)) {
                arrayList.add(obj);
            }
        }
        aVar.a(new c.i0(arrayList));
    }

    public final void n(List<? extends d4> list, String str) {
        jo.p.h(str, "requestUserId");
        if (list == null) {
            return;
        }
        q8.a aVar = this.f44660w;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            d4 d4Var = (d4) obj;
            if ((d4Var.d() == 10 && jo.p.c(d4Var.e(), str)) ? false : true) {
                arrayList.add(obj);
            }
        }
        aVar.a(new c.i0(arrayList));
    }

    public final void o(String str) {
        jo.p.h(str, "liveId");
        uo.l.d(this, null, null, new C0676b(str, null), 3, null);
    }

    public final void p(String str) {
        jo.p.h(str, "liveId");
        uo.l.d(this, null, null, new c(str, null), 3, null);
    }

    public final void q(String str) {
        jo.p.h(str, "appId");
        uo.l.d(this, null, null, new d(str, null), 3, null);
    }

    public final void r(String str) {
        jo.p.h(str, "liveId");
        uo.l.d(this, null, null, new e(str, null), 3, null);
    }

    public final void s(String str) {
        jo.p.h(str, "liveId");
        uo.l.d(this, null, null, new f(str, null), 3, null);
    }

    public final void t() {
        this.f44660w.a(c.y.f46677a);
    }

    public final void u() {
        this.f44660w.a(c.z.f46678a);
    }

    public final void v(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "userId");
        uo.l.d(this, null, null, new g(str, str2, null), 3, null);
    }

    public final void w(String str, String str2) {
        jo.p.h(str2, "liveId");
        uo.l.d(this, null, null, new h(str, str2, null), 3, null);
    }

    public final void x(String str) {
        jo.p.h(str, "liveId");
        uo.l.d(this, null, null, new i(str, null), 3, null);
    }

    public final void y(LiveHeartbeatResponse liveHeartbeatResponse) {
        jo.p.h(liveHeartbeatResponse, "response");
        this.f44660w.a(new c.q(liveHeartbeatResponse));
    }

    public final void z(LiveOwnedResponse liveOwnedResponse) {
        jo.p.h(liveOwnedResponse, "response");
        this.f44660w.a(new c.r(liveOwnedResponse));
    }
}
