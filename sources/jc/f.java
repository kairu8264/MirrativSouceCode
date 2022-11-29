package jc;

import android.content.res.Resources;
import androidx.lifecycle.q0;
import com.dena.mirrativ.mirrativapi.RankingFocusableResponse;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.BroadcastSettings;
import com.dena.mirrorman.net.api.response.EventNoticeResponse;
import com.dena.mirrorman.net.api.response.FavoriteLiveSetting;
import com.dena.mirrorman.net.api.response.live.LiveOwnedResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import hf.d0;
import hf.m0;
import hf.v0;
import io.p;
import jf.w;
import kf.m;
import kf.r;
import kf.t;
import kf.x;
import pd.f0;
import uo.b0;
import uo.d2;
import uo.g1;
import uo.i2;
import uo.r0;
import wn.v;

/* loaded from: classes2.dex */
public final class f extends q0 implements uo.q0 {
    public static final a M = new a(null);
    public static final int N = 8;
    public final m A;
    public final t B;
    public final v0 C;
    public final x D;
    public final hf.l E;
    public final Resources F;
    public final m0 G;
    public final d0 H;
    public final r I;
    public d2 J;
    public b0 K;
    public final ao.g L;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f37489y;

    /* renamed from: z  reason: collision with root package name */
    public final MRRequest f37490z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareActionCreator$createLive$1", f = "LivePrepareActionCreator.kt", l = {54}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37491w;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37491w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = f.this.f37490z;
                    this.f37491w = 1;
                    obj = mRRequest.postLiveCreate(Referer.Broadcast.SETTING, 0, 0, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                f.this.f37489y.a(new f0.q(f.this.E.a((LiveOwnedResponse) obj)));
            } catch (Throwable unused) {
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareActionCreator$createLiveForLiveStart$1", f = "LivePrepareActionCreator.kt", l = {100}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37493w;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37493w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = f.this.f37490z;
                    this.f37493w = 1;
                    obj = mRRequest.postLiveCreate(Referer.Broadcast.SETTING, 0, 0, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                f.this.f37489y.a(new f0.r(f.this.E.a((LiveOwnedResponse) obj)));
            } catch (Throwable th2) {
                f.this.f37489y.a(new f0.k(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareActionCreator$createLiveForThumbnail$1", f = "LivePrepareActionCreator.kt", l = {79}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37495w;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37495w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = f.this.f37490z;
                    this.f37495w = 1;
                    obj = mRRequest.postLiveCreate(Referer.Broadcast.SETTING, 0, 0, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                f.this.f37489y.a(new f0.s(f.this.E.a((LiveOwnedResponse) obj)));
            } catch (Throwable th2) {
                f.this.f37489y.a(new f0.l(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareActionCreator$editLive$1", f = "LivePrepareActionCreator.kt", l = {127}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements p<uo.q0, ao.d<? super v>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ String B;
        public final /* synthetic */ String C;

        /* renamed from: w  reason: collision with root package name */
        public int f37497w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f37499y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f37500z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, String str, String str2, String str3, String str4, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f37499y = i10;
            this.f37500z = str;
            this.A = str2;
            this.B = str3;
            this.C = str4;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f37499y, this.f37500z, this.A, this.B, this.C, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object postLiveEdit;
            Object c10 = bo.c.c();
            int i10 = this.f37497w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    int j10 = f.this.G.j(this.f37499y);
                    MRRequest mRRequest = f.this.f37490z;
                    String str2 = this.f37500z;
                    if (this.A.length() == 0) {
                        str = f.this.F.getString(xb.r.text_android_stream);
                    } else {
                        str = this.A;
                    }
                    String str3 = this.B;
                    String str4 = this.C;
                    Integer d10 = co.b.d(1);
                    Integer d11 = co.b.d(1);
                    Integer d12 = co.b.d(f.this.G.h());
                    Integer d13 = co.b.d(j10);
                    Integer d14 = co.b.d(f.this.B.i() ? 1 : 0);
                    this.f37497w = 1;
                    postLiveEdit = mRRequest.postLiveEdit(Referer.Broadcast.SETTING, str2, str, str3, str4, d10, d11, d12, d13, d14, this);
                    if (postLiveEdit == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                    postLiveEdit = obj;
                }
                LiveOwnedResponse liveOwnedResponse = (LiveOwnedResponse) postLiveEdit;
                f.this.H.d(liveOwnedResponse);
                f.this.f37489y.a(new f0.t(f.this.E.a(liveOwnedResponse), liveOwnedResponse.getRequestPackageUsageStats()));
            } catch (Throwable th2) {
                f.this.f37489y.a(new f0.m(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareActionCreator$fetchEventNotice$1", f = "LivePrepareActionCreator.kt", l = {369}, m = "invokeSuspend")
    /* renamed from: jc.f$f  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0507f extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37501w;

        public C0507f(ao.d<? super C0507f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0507f(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((C0507f) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37501w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = f.this.f37490z;
                    this.f37501w = 1;
                    obj = MRRequest.DefaultImpls.getEventNotice$default(mRRequest, 3, null, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                f.this.f37489y.a(new f0.n((EventNoticeResponse) obj));
            } catch (Throwable unused) {
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareActionCreator$fetchRankingFocusableEvents$1", f = "LivePrepareActionCreator.kt", l = {410}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37503w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f37505y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f37505y = str;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f37505y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37503w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = f.this.f37490z;
                    String str = this.f37505y;
                    this.f37503w = 1;
                    obj = mRRequest.getRankingFocusable(Referer.Broadcast.SETTING, str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                f.this.f37489y.a(new f0.p((RankingFocusableResponse) obj));
            } catch (Throwable unused) {
                f.this.f37489y.a(f0.o.f46824a);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareActionCreator$fetchUserBroadcastSettings$1", f = "LivePrepareActionCreator.kt", l = {176}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37506w;

        public h(ao.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new h(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37506w;
            boolean z10 = true;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = f.this.f37490z;
                    this.f37506w = 1;
                    obj = mRRequest.getUserBroadcastSettings(Referer.Broadcast.SETTING, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                BroadcastSettings broadcastSettings = (BroadcastSettings) obj;
                f.this.B.W2(broadcastSettings.getTwitterAutopost() == 1);
                t tVar = f.this.B;
                if (broadcastSettings.getTwitterAutopostLiveAnnouncement() != 1) {
                    z10 = false;
                }
                tVar.z0(z10);
                f.this.B.A0(broadcastSettings.getSelectedThumbnailFrameId());
                f.this.f37489y.a(new f0.c(broadcastSettings));
            } catch (Throwable unused) {
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareActionCreator$reloadApp$1", f = "LivePrepareActionCreator.kt", l = {296}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37508w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f37510y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f37510y = str;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f37510y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37508w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = f.this.f37490z;
                    String str = this.f37510y;
                    this.f37508w = 1;
                    obj = mRRequest.getAppRequest(Referer.Broadcast.SETTING, str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                App.AppParams appParams = (App.AppParams) obj;
                f.this.A.v0(appParams.getAppId());
                f.this.A.A4(appParams.getIconUrl());
                f.this.A.D3(appParams.getTitle());
                f.this.A.x2(appParams.getShortTitle());
                f.this.f37489y.a(new f0.e0(new w(appParams.getAppId(), appParams.getIconUrl(), appParams.getTitle(), appParams.getShortTitle())));
                f.this.G(appParams.getAppId());
            } catch (Throwable unused) {
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareActionCreator$setRankingFocusedEvent$1", f = "LivePrepareActionCreator.kt", l = {161}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37511w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Integer f37513y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f37514z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Integer num, String str, ao.d<? super j> dVar) {
            super(2, dVar);
            this.f37513y = num;
            this.f37514z = str;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new j(this.f37513y, this.f37514z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37511w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = f.this.f37490z;
                    Integer num = this.f37513y;
                    int intValue = num != null ? num.intValue() : 0;
                    String str = this.f37514z;
                    if (str == null) {
                        str = "";
                    }
                    this.f37511w = 1;
                    if (mRRequest.postRankingUpdateFocus(Referer.Broadcast.SETTING, intValue, str, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                f.this.f37489y.a(new f0.a0(this.f37513y, this.f37514z));
            } catch (Throwable th2) {
                f.this.f37489y.a(new f0.z(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareActionCreator$updateAutoTweet$1", f = "LivePrepareActionCreator.kt", l = {206}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37515w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f37516x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f f37517y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(boolean z10, f fVar, ao.d<? super k> dVar) {
            super(2, dVar);
            this.f37516x = z10;
            this.f37517y = fVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new k(this.f37516x, this.f37517y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37515w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    int i11 = this.f37516x ? 1 : 0;
                    MRRequest mRRequest = this.f37517y.f37490z;
                    Integer d10 = co.b.d(i11);
                    this.f37515w = 1;
                    obj = mRRequest.postUserBroadcastSettings(Referer.Broadcast.SETTING, d10, null, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                BroadcastSettings broadcastSettings = (BroadcastSettings) obj;
                this.f37517y.B.W2(this.f37516x);
                this.f37517y.f37489y.a(new f0.a(this.f37516x));
            } catch (Throwable th2) {
                this.f37517y.f37489y.a(new f0.b(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareActionCreator$useFavoriteSetting$1", f = "LivePrepareActionCreator.kt", l = {323, 334}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37518w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f37519x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f f37520y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ FavoriteLiveSetting f37521z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, f fVar, FavoriteLiveSetting favoriteLiveSetting, ao.d<? super l> dVar) {
            super(2, dVar);
            this.f37519x = str;
            this.f37520y = fVar;
            this.f37521z = favoriteLiveSetting;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new l(this.f37519x, this.f37520y, this.f37521z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((l) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006c A[RETURN] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r5.f37518w
                java.lang.String r2 = "broadcast.setting"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                wn.m.b(r6)     // Catch: java.lang.Throwable -> L20
                goto L6d
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                wn.m.b(r6)     // Catch: java.lang.Throwable -> L20
                goto L3a
            L20:
                r6 = move-exception
                goto Le3
            L23:
                wn.m.b(r6)
                java.lang.String r6 = r5.f37519x     // Catch: java.lang.Throwable -> L20
                if (r6 != 0) goto L58
                jc.f r6 = r5.f37520y     // Catch: java.lang.Throwable -> L20
                com.dena.mirrorman.net.retrofit.MRRequest r6 = jc.f.k(r6)     // Catch: java.lang.Throwable -> L20
                r5.f37518w = r4     // Catch: java.lang.Throwable -> L20
                r1 = 0
                java.lang.Object r6 = r6.postLiveCreate(r2, r1, r1, r5)     // Catch: java.lang.Throwable -> L20
                if (r6 != r0) goto L3a
                return r0
            L3a:
                com.dena.mirrorman.net.api.response.live.LiveOwnedResponse r6 = (com.dena.mirrorman.net.api.response.live.LiveOwnedResponse) r6     // Catch: java.lang.Throwable -> L20
                jc.f r1 = r5.f37520y     // Catch: java.lang.Throwable -> L20
                hf.l r1 = jc.f.g(r1)     // Catch: java.lang.Throwable -> L20
                ye.c r6 = r1.a(r6)     // Catch: java.lang.Throwable -> L20
                jc.f r1 = r5.f37520y     // Catch: java.lang.Throwable -> L20
                q8.a r1 = jc.f.h(r1)     // Catch: java.lang.Throwable -> L20
                pd.f0$q r4 = new pd.f0$q     // Catch: java.lang.Throwable -> L20
                r4.<init>(r6)     // Catch: java.lang.Throwable -> L20
                r1.a(r4)     // Catch: java.lang.Throwable -> L20
                java.lang.String r6 = r6.b()     // Catch: java.lang.Throwable -> L20
            L58:
                jc.f r1 = r5.f37520y     // Catch: java.lang.Throwable -> L20
                com.dena.mirrorman.net.retrofit.MRRequest r1 = jc.f.k(r1)     // Catch: java.lang.Throwable -> L20
                com.dena.mirrorman.net.api.response.FavoriteLiveSetting r4 = r5.f37521z     // Catch: java.lang.Throwable -> L20
                int r4 = r4.getId()     // Catch: java.lang.Throwable -> L20
                r5.f37518w = r3     // Catch: java.lang.Throwable -> L20
                java.lang.Object r6 = r1.postUseFavoriteLiveSetting(r2, r6, r4, r5)     // Catch: java.lang.Throwable -> L20
                if (r6 != r0) goto L6d
                return r0
            L6d:
                jc.f r6 = r5.f37520y     // Catch: java.lang.Throwable -> L20
                kf.x r6 = jc.f.o(r6)     // Catch: java.lang.Throwable -> L20
                com.dena.mirrorman.net.api.response.FavoriteLiveSetting r0 = r5.f37521z     // Catch: java.lang.Throwable -> L20
                java.lang.String r0 = r0.getLiveThumbnailImageUrl()     // Catch: java.lang.Throwable -> L20
                r6.R2(r0)     // Catch: java.lang.Throwable -> L20
                jc.f r6 = r5.f37520y     // Catch: java.lang.Throwable -> L20
                kf.m r6 = jc.f.j(r6)     // Catch: java.lang.Throwable -> L20
                com.dena.mirrorman.net.api.response.FavoriteLiveSetting r0 = r5.f37521z     // Catch: java.lang.Throwable -> L20
                java.lang.String r0 = r0.getAppId()     // Catch: java.lang.Throwable -> L20
                r6.v0(r0)     // Catch: java.lang.Throwable -> L20
                jc.f r6 = r5.f37520y     // Catch: java.lang.Throwable -> L20
                kf.m r6 = jc.f.j(r6)     // Catch: java.lang.Throwable -> L20
                com.dena.mirrorman.net.api.response.FavoriteLiveSetting r0 = r5.f37521z     // Catch: java.lang.Throwable -> L20
                java.lang.String r0 = r0.getAppIconUrl()     // Catch: java.lang.Throwable -> L20
                r6.A4(r0)     // Catch: java.lang.Throwable -> L20
                jc.f r6 = r5.f37520y     // Catch: java.lang.Throwable -> L20
                kf.m r6 = jc.f.j(r6)     // Catch: java.lang.Throwable -> L20
                com.dena.mirrorman.net.api.response.FavoriteLiveSetting r0 = r5.f37521z     // Catch: java.lang.Throwable -> L20
                java.lang.String r0 = r0.getAppTitle()     // Catch: java.lang.Throwable -> L20
                r6.D3(r0)     // Catch: java.lang.Throwable -> L20
                jc.f r6 = r5.f37520y     // Catch: java.lang.Throwable -> L20
                kf.m r6 = jc.f.j(r6)     // Catch: java.lang.Throwable -> L20
                com.dena.mirrorman.net.api.response.FavoriteLiveSetting r0 = r5.f37521z     // Catch: java.lang.Throwable -> L20
                java.lang.String r0 = r0.getTitle()     // Catch: java.lang.Throwable -> L20
                r6.z3(r0)     // Catch: java.lang.Throwable -> L20
                jc.f r6 = r5.f37520y     // Catch: java.lang.Throwable -> L20
                kf.m r6 = jc.f.j(r6)     // Catch: java.lang.Throwable -> L20
                com.dena.mirrorman.net.api.response.FavoriteLiveSetting r0 = r5.f37521z     // Catch: java.lang.Throwable -> L20
                java.lang.String r0 = r0.getMemo()     // Catch: java.lang.Throwable -> L20
                r6.L2(r0)     // Catch: java.lang.Throwable -> L20
                jc.f r6 = r5.f37520y     // Catch: java.lang.Throwable -> L20
                q8.a r6 = jc.f.h(r6)     // Catch: java.lang.Throwable -> L20
                pd.f0$c0 r0 = new pd.f0$c0     // Catch: java.lang.Throwable -> L20
                com.dena.mirrorman.net.api.response.FavoriteLiveSetting r1 = r5.f37521z     // Catch: java.lang.Throwable -> L20
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
                r6.a(r0)     // Catch: java.lang.Throwable -> L20
                jc.f r6 = r5.f37520y     // Catch: java.lang.Throwable -> L20
                com.dena.mirrorman.net.api.response.FavoriteLiveSetting r0 = r5.f37521z     // Catch: java.lang.Throwable -> L20
                java.lang.String r0 = r0.getAppId()     // Catch: java.lang.Throwable -> L20
                jc.f.f(r6, r0)     // Catch: java.lang.Throwable -> L20
                goto Lf9
            Le3:
                jc.f r0 = r5.f37520y
                q8.a r0 = jc.f.h(r0)
                pd.f0$b r1 = new pd.f0$b
                com.dena.mirrativ.mirrativapi.core.MRException r6 = com.dena.mirrativ.mirrativapi.core.MRErrorKt.convertMRException(r6)
                com.dena.mirrativ.mirrativapi.core.MRError r6 = r6.getError()
                r1.<init>(r6)
                r0.a(r1)
            Lf9:
                wn.v r6 = wn.v.f59242a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: jc.f.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public f(q8.a aVar, MRRequest mRRequest, m mVar, t tVar, v0 v0Var, x xVar, hf.l lVar, Resources resources, m0 m0Var, d0 d0Var, r rVar) {
        b0 b10;
        b0 b11;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(mVar, "livePreference");
        jo.p.h(tVar, "settingPreference");
        jo.p.h(v0Var, "userHelper");
        jo.p.h(xVar, "userPreference");
        jo.p.h(lVar, "createRecordRequestParams");
        jo.p.h(resources, "resources");
        jo.p.h(m0Var, "settingHelper");
        jo.p.h(d0Var, "liveHelper");
        jo.p.h(rVar, "resetNotificationGuardMode");
        this.f37489y = aVar;
        this.f37490z = mRRequest;
        this.A = mVar;
        this.B = tVar;
        this.C = v0Var;
        this.D = xVar;
        this.E = lVar;
        this.F = resources;
        this.G = m0Var;
        this.H = d0Var;
        this.I = rVar;
        b10 = i2.b(null, 1, null);
        this.J = b10;
        b11 = i2.b(null, 1, null);
        this.K = b11;
        this.L = g1.b().plus(this.K);
    }

    public final void A(String str) {
        jo.p.h(str, "collabLiveId");
        ye.c a10 = this.E.a(null);
        a10.o(str);
        this.f37489y.a(new f0.q(a10));
        d2.a.a(this.J, null, 1, null);
    }

    public final void B() {
        d2 d10;
        d2.a.a(this.J, null, 1, null);
        d10 = uo.l.d(r0.a(g1.b()), null, null, new b(null), 3, null);
        this.J = d10;
    }

    public final void C() {
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    public final void D() {
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    public final void E(String str, String str2, String str3, String str4, int i10) {
        jo.p.h(str, "liveId");
        jo.p.h(str2, "title");
        uo.l.d(this, null, null, new e(i10, str, str2, str3, str4, null), 3, null);
    }

    public final void F() {
        uo.l.d(this, null, null, new C0507f(null), 3, null);
    }

    public final void G(String str) {
        if (str == null) {
            if (this.A.h().length() > 0) {
                str = this.A.h();
                uo.l.d(this, null, null, new g(str, null), 3, null);
            }
        }
        if (str == null) {
            str = "";
        }
        uo.l.d(this, null, null, new g(str, null), 3, null);
    }

    public final void H() {
        uo.l.d(this, null, null, new h(null), 3, null);
    }

    public final void I(String str) {
        if (str == null) {
            if (this.A.h().length() > 0) {
                if (this.A.R().length() > 0) {
                    if (this.A.D1().length() > 0) {
                        this.f37489y.a(new f0.e0(new w(this.A.h(), this.A.R(), this.A.D1(), this.A.e5())));
                        G(this.A.h());
                        return;
                    }
                }
            }
        }
        if (str == null) {
            str = this.A.h();
        }
        if (!(str.length() == 0)) {
            uo.l.d(this, null, null, new i(str, null), 3, null);
        } else {
            G(null);
        }
    }

    public final void J() {
        this.f37489y.a(new f0.y(this.D.H3()));
    }

    public final void K() {
        this.I.d();
        this.f37489y.a(new f0.g(this.B.b0()));
    }

    public final void L(Integer num, String str) {
        uo.l.d(this, null, null, new j(num, str, null), 3, null);
    }

    public final void M(int i10) {
        this.B.A0(i10);
        this.f37489y.a(new f0.b0(i10));
    }

    public final void N(boolean z10) {
        if (this.C.p()) {
            uo.l.d(this, null, null, new k(z10, this, null), 3, null);
        } else {
            this.f37489y.a(f0.d0.f46813a);
        }
    }

    public final void O(String str, FavoriteLiveSetting favoriteLiveSetting) {
        jo.p.h(favoriteLiveSetting, MRLog.PAYLOAD_KEY_SETTING);
        uo.l.d(this, null, null, new l(str, this, favoriteLiveSetting, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.L;
    }

    public final void p(boolean z10) {
        this.B.I1(z10);
        this.f37489y.a(new f0.f(z10));
    }

    public final void q(boolean z10) {
        this.B.y5(z10);
        this.f37489y.a(new f0.i(z10));
    }

    public final void r(int i10) {
        this.B.S0(i10);
        this.f37489y.a(new f0.h(i10));
    }

    public final void s(boolean z10) {
        this.B.p3(z10);
        this.f37489y.a(new f0.u(z10));
    }

    public final void t(String str) {
        jo.p.h(str, "liveMemo");
        this.A.L2(str);
        this.f37489y.a(new f0.v(str));
    }

    public final void u(String str) {
        jo.p.h(str, "liveTitle");
        this.A.z3(str);
        this.f37489y.a(new f0.w(str));
    }

    public final void v(boolean z10) {
        this.f37489y.a(new f0.x(z10));
    }

    public final void w(boolean z10) {
        this.B.U2(z10);
        this.f37489y.a(new f0.d(z10));
    }

    public final void x(float f10) {
        this.B.c3(f10);
        this.f37489y.a(new f0.e(f10));
    }

    public final void y(w wVar) {
        this.A.v0((wVar == null || (r2 = wVar.b()) == null) ? "" : "");
        this.A.A4((wVar == null || (r2 = wVar.a()) == null) ? "" : "");
        this.A.D3((wVar == null || (r2 = wVar.c()) == null) ? "" : "");
        m mVar = this.A;
        String d10 = wVar != null ? wVar.d() : null;
        mVar.x2(d10 != null ? d10 : "");
        this.f37489y.a(new f0.e0(wVar));
        G(wVar != null ? wVar.b() : null);
    }

    public final void z(int i10) {
        this.B.I4(i10);
        this.f37489y.a(new f0.g(i10));
    }
}
