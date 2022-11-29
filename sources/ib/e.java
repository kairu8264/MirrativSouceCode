package ib;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.core.StatusResponse;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.AvailableRewardAdIdsResponse;
import com.dena.mirrorman.net.api.response.Graph;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import pd.g0;
import pd.i1;
import uo.b1;
import uo.d2;
import uo.g1;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public final class e implements q0 {
    public static final a A = new a(null);
    public static final int B = 8;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f36511w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f36512x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ q0 f36513y;

    /* renamed from: z  reason: collision with root package name */
    public d2 f36514z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestActionCreator$follow$1", f = "LiveRequestActionCreator.kt", l = {149}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f36515w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f36517y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f36518z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f36517y = str;
            this.f36518z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f36517y, this.f36518z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            q8.a aVar;
            g0.m mVar;
            Object c10 = bo.c.c();
            int i10 = this.f36515w;
            try {
                try {
                    if (i10 == 0) {
                        wn.m.b(obj);
                        MRRequest mRRequest = e.this.f36512x;
                        String str = this.f36517y;
                        String str2 = this.f36518z;
                        this.f36515w = 1;
                        obj = mRRequest.postGraphFollow(str, str2, this);
                        if (obj == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    e.this.f36511w.a(new i1.o(this.f36518z, (Graph.Follow) obj));
                    aVar = e.this.f36511w;
                    mVar = new g0.m(false);
                } catch (Exception e10) {
                    e.this.f36511w.a(new g0.b(MRErrorKt.convertMRException(e10).getError()));
                    aVar = e.this.f36511w;
                    mVar = new g0.m(false);
                }
                aVar.a(mVar);
                return wn.v.f59242a;
            } catch (Throwable th2) {
                e.this.f36511w.a(new g0.m(false));
                throw th2;
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestActionCreator$loadApps$1", f = "LiveRequestActionCreator.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f36519w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f36521y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f36522z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f36521y = str;
            this.f36522z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f36521y, this.f36522z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f36519w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    e.this.f36511w.a(g0.c.f46875a);
                    MRRequest mRRequest = e.this.f36512x;
                    String str = this.f36521y;
                    String str2 = this.f36522z;
                    this.f36519w = 1;
                    obj = mRRequest.getAppUserApps(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                e.this.f36511w.a(new g0.f((App.Apps) obj));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestActionCreator$loadAvailableRewardAdIds$1", f = "LiveRequestActionCreator.kt", l = {136}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f36523w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f36525y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f36525y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f36525y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f36523w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = e.this.f36512x;
                    String str = this.f36525y;
                    this.f36523w = 1;
                    obj = mRRequest.getAvailableRewardAdIds(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                e.this.f36511w.a(new g0.d((AvailableRewardAdIdsResponse) obj));
            } catch (Throwable th2) {
                e.this.f36511w.a(new g0.b(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestActionCreator$loadRecommendLives$1", f = "LiveRequestActionCreator.kt", l = {38, 39}, m = "invokeSuspend")
    /* renamed from: ib.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0475e extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f36526w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ long f36527x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e f36528y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f36529z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0475e(long j10, e eVar, String str, String str2, ao.d<? super C0475e> dVar) {
            super(2, dVar);
            this.f36527x = j10;
            this.f36528y = eVar;
            this.f36529z = str;
            this.A = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C0475e(this.f36527x, this.f36528y, this.f36529z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C0475e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f36526w;
            if (i10 == 0) {
                wn.m.b(obj);
                long j10 = this.f36527x;
                this.f36526w = 1;
                if (b1.a(j10, this) == c10) {
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
            e eVar = this.f36528y;
            String str = this.f36529z;
            String str2 = this.A;
            this.f36526w = 2;
            if (eVar.l(str, str2, this) == c10) {
                return c10;
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestActionCreator$loadRecommendLives$2", f = "LiveRequestActionCreator.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f36530w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f36532y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f36533z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f36532y = str;
            this.f36533z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f36532y, this.f36533z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f36530w;
            if (i10 == 0) {
                wn.m.b(obj);
                e eVar = e.this;
                String str = this.f36532y;
                String str2 = this.f36533z;
                this.f36530w = 1;
                if (eVar.l(str, str2, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestActionCreator$loadStreamerInfo$1", f = "LiveRequestActionCreator.kt", l = {77}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f36534w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f36536y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f36537z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f36536y = str;
            this.f36537z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f36536y, this.f36537z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f36534w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = e.this.f36512x;
                    String str = this.f36536y;
                    String str2 = this.f36537z;
                    this.f36534w = 1;
                    obj = mRRequest.getUserProfile(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                UserProfile userProfile = (UserProfile) obj;
                e.this.f36511w.a(new g0.h(oe.b.J.a(userProfile, userProfile.isFollowing())));
            } catch (Throwable th2) {
                e.this.f36511w.a(new g0.b(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestActionCreator", f = "LiveRequestActionCreator.kt", l = {63}, m = "requestRecommendLives")
    /* loaded from: classes2.dex */
    public static final class h extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f36538w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f36539x;

        /* renamed from: z  reason: collision with root package name */
        public int f36541z;

        public h(ao.d<? super h> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f36539x = obj;
            this.f36541z |= Integer.MIN_VALUE;
            return e.this.l(null, null, this);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestActionCreator$selectLive$1", f = "LiveRequestActionCreator.kt", l = {53}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ LiveBasicParams A;

        /* renamed from: w  reason: collision with root package name */
        public int f36542w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f36544y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f36545z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2, LiveBasicParams liveBasicParams, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f36544y = str;
            this.f36545z = str2;
            this.A = liveBasicParams;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f36544y, this.f36545z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            q8.a aVar;
            g0.j jVar;
            Object c10 = bo.c.c();
            int i10 = this.f36542w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = e.this.f36512x;
                    String str = this.f36544y;
                    String str2 = this.f36545z;
                    String liveId = this.A.getLiveId();
                    this.f36542w = 1;
                    if (mRRequest.postSelectRecommendLive(str, str2, liveId, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                aVar = e.this.f36511w;
                jVar = new g0.j(this.A);
            } catch (Exception unused) {
                aVar = e.this.f36511w;
                jVar = new g0.j(this.A);
            } catch (Throwable th2) {
                e.this.f36511w.a(new g0.j(this.A));
                throw th2;
            }
            aVar.a(jVar);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestActionCreator$sendLiveRequest$1", f = "LiveRequestActionCreator.kt", l = {113, 128}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ long A;

        /* renamed from: w  reason: collision with root package name */
        public int f36546w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f36548y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f36549z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2, long j10, ao.d<? super j> dVar) {
            super(2, dVar);
            this.f36548y = str;
            this.f36549z = str2;
            this.A = j10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(this.f36548y, this.f36549z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f36546w;
            try {
            } catch (Throwable unused) {
                e.this.f36511w.a(new g0.a(this.A));
            }
            if (i10 == 0) {
                wn.m.b(obj);
                g9.a.g("Start Send Requests");
                MRRequest mRRequest = e.this.f36512x;
                String str = this.f36548y;
                String str2 = this.f36549z;
                long j10 = this.A;
                this.f36546w = 1;
                obj = mRRequest.postLiveRequest(str, str2, j10, "live_view_end", this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    wn.m.b(obj);
                    e.this.f36514z = null;
                    return wn.v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            StatusResponse statusResponse = (StatusResponse) obj;
            g9.a.g("LiveRequest: " + this.A);
            this.f36546w = 2;
            if (b1.a(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS, this) == c10) {
                return c10;
            }
            e.this.f36514z = null;
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestActionCreator$unfollow$1", f = "LiveRequestActionCreator.kt", l = {163}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f36550w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f36552y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f36553z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, String str2, ao.d<? super k> dVar) {
            super(2, dVar);
            this.f36552y = str;
            this.f36553z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(this.f36552y, this.f36553z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            q8.a aVar;
            g0.m mVar;
            Object c10 = bo.c.c();
            int i10 = this.f36550w;
            try {
                try {
                    if (i10 == 0) {
                        wn.m.b(obj);
                        MRRequest mRRequest = e.this.f36512x;
                        String str = this.f36552y;
                        String str2 = this.f36553z;
                        this.f36550w = 1;
                        if (mRRequest.postGraphUnfollow(str, str2, this) == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    e.this.f36511w.a(new i1.g0(this.f36553z));
                    aVar = e.this.f36511w;
                    mVar = new g0.m(false);
                } catch (Exception e10) {
                    e.this.f36511w.a(new g0.b(MRErrorKt.convertMRException(e10).getError()));
                    aVar = e.this.f36511w;
                    mVar = new g0.m(false);
                }
                aVar.a(mVar);
                return wn.v.f59242a;
            } catch (Throwable th2) {
                e.this.f36511w.a(new g0.m(false));
                throw th2;
            }
        }
    }

    public e(q8.a aVar, MRRequest mRRequest) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f36511w = aVar;
        this.f36512x = mRRequest;
        this.f36513y = r0.b();
    }

    public final void e(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "userId");
        this.f36511w.a(new g0.m(true));
        uo.l.d(this, null, null, new b(str, str2, null), 3, null);
    }

    public final void f(String str, String str2) {
        jo.p.h(str, "userId");
        uo.l.d(this, null, null, new c(str, str2, null), 3, null);
    }

    public final void g(String str) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new d(str, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f36513y.getCoroutineContext();
    }

    public final void h(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        this.f36511w.a(g0.i.f46881a);
        uo.l.d(this, null, null, new f(str, str2, null), 3, null);
    }

    public final void i(String str, String str2, long j10) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        this.f36511w.a(g0.i.f46881a);
        uo.l.d(this, null, null, new C0475e(j10, this, str, str2, null), 3, null);
    }

    public final void j(String str, String str2) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "referer");
        uo.l.d(this, null, null, new g(str2, str, null), 3, null);
    }

    public final void k(oe.b bVar) {
        jo.p.h(bVar, "streamerInfo");
        this.f36511w.a(new g0.h(bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(java.lang.String r5, java.lang.String r6, ao.d<? super wn.v> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ib.e.h
            if (r0 == 0) goto L13
            r0 = r7
            ib.e$h r0 = (ib.e.h) r0
            int r1 = r0.f36541z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36541z = r1
            goto L18
        L13:
            ib.e$h r0 = new ib.e$h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f36539x
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f36541z
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f36538w
            ib.e r5 = (ib.e) r5
            wn.m.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L48
        L2d:
            r6 = move-exception
            goto L57
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            wn.m.b(r7)
            com.dena.mirrorman.net.retrofit.MRRequest r7 = r4.f36512x     // Catch: java.lang.Throwable -> L55
            r0.f36538w = r4     // Catch: java.lang.Throwable -> L55
            r0.f36541z = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r7 = r7.getRecommendLives(r5, r6, r0)     // Catch: java.lang.Throwable -> L55
            if (r7 != r1) goto L47
            return r1
        L47:
            r5 = r4
        L48:
            com.dena.mirrorman.net.api.response.live.RecommendLivesResponse r7 = (com.dena.mirrorman.net.api.response.live.RecommendLivesResponse) r7     // Catch: java.lang.Throwable -> L2d
            q8.a r6 = r5.f36511w     // Catch: java.lang.Throwable -> L2d
            pd.g0$g r0 = new pd.g0$g     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L2d
            r6.a(r0)     // Catch: java.lang.Throwable -> L2d
            goto L69
        L55:
            r6 = move-exception
            r5 = r4
        L57:
            q8.a r5 = r5.f36511w
            pd.g0$e r7 = new pd.g0$e
            com.dena.mirrativ.mirrativapi.core.MRException r6 = com.dena.mirrativ.mirrativapi.core.MRErrorKt.convertMRException(r6)
            com.dena.mirrativ.mirrativapi.core.MRError r6 = r6.getError()
            r7.<init>(r6)
            r5.a(r7)
        L69:
            wn.v r5 = wn.v.f59242a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ib.e.l(java.lang.String, java.lang.String, ao.d):java.lang.Object");
    }

    public final void m(String str, String str2, LiveBasicParams liveBasicParams) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "fromLiveId");
        jo.p.h(liveBasicParams, "toLive");
        uo.l.d(this, null, null, new i(str, str2, liveBasicParams, null), 3, null);
    }

    public final void n(String str, String str2, long j10, long j11) {
        d2 d10;
        jo.p.h(str, "referer");
        jo.p.h(str2, "userId");
        if (j10 == 0) {
            return;
        }
        this.f36511w.a(new g0.k(str2, j11));
        if (this.f36514z != null) {
            this.f36511w.a(new g0.l(j10));
            return;
        }
        this.f36511w.a(new g0.l(0L));
        d10 = uo.l.d(r0.a(g1.c()), null, null, new j(str, str2, j10, null), 3, null);
        this.f36514z = d10;
    }

    public final void o(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "userId");
        this.f36511w.a(new g0.m(true));
        uo.l.d(this, null, null, new k(str, str2, null), 3, null);
    }
}
