package com.dena.mirrativ.streaming;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.usage.UsageStats;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import b3.j;
import ce.l;
import ce.t;
import ce.w;
import ce.y;
import cf.g;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.core.StatusResponse;
import com.dena.mirrativ.streaming.CastService;
import com.dena.mirrativ.streaming.emomo.StreamEmomoActivity;
import com.dena.mirrorman.activity.MainActivity;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.clientlog.logs.EventBannerActionType;
import com.dena.mirrorman.clientlog.logs.EventBannerLog;
import com.dena.mirrorman.clientlog.logs.EventBannerWhere;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.feature.live.LivePrepareLiveThumbnailActivity;
import com.dena.mirrorman.feature.player.emomo.SpeechAnalyzer;
import com.dena.mirrorman.net.MRUrl;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.CollabType;
import com.dena.mirrorman.net.api.response.EventNoticeResponse;
import com.dena.mirrorman.net.api.response.live.AcceptedMatchedCollabResponse;
import com.dena.mirrorman.net.api.response.live.LinkedLive;
import com.dena.mirrorman.net.api.response.live.LiveOwnedResponse;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingTopUser;
import com.dena.mirrorman.net.bcsvr.response.LiveViewerNum;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.dena.mirrorman.unity.UnityManager;
import com.dena.mirrorman.unity.UnityReceiverKt;
import com.dena.mirrorman.webrtc.RTCClient;
import com.dena.mirrorman.webrtc.RTCManager;
import com.dena.mirrorman.webrtc.entity.StunServer;
import com.dena.mirrorman.webrtc.entity.TurnServer;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.mirrativ.llstream.LLStreamKey;
import dc.d;
import dc.l;
import dc.x;
import hf.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import org.greenrobot.eventbus.ThreadMode;
import org.webrtc.PeerConnection;
import pd.h;
import pd.i;
import pd.t0;
import retrofit2.HttpException;
import tb.c;
import ud.c4;
import ud.d4;
import ud.e4;
import ud.f4;
import ud.g4;
import ud.i4;
import ud.l4;
import ud.m4;
import ud.o4;
import ud.q4;
import ud.r4;
import ud.s4;
import ud.t4;
import ud.u4;
import uo.d2;
import uo.l0;
import yd.t1;
import ye.n;
import ze.b;

/* loaded from: classes2.dex */
public final class CastService extends androidx.lifecycle.y implements d.e, x.c, l.e, y4.e, uo.q0 {
    public static final a X0 = new a(null);
    public static final int Y0 = 8;
    public int A0;
    public final wn.f B;
    public Handler B0;
    public final wn.f C;
    public Runnable C0;
    public final wn.f D;
    public boolean D0;
    public final wn.f E;
    public Map<String, String> E0;
    public final wn.f F;
    public BroadcastReceiver F0;
    public final wn.f G;
    public Runnable G0;
    public final wn.f H;
    public boolean H0;
    public final wn.f I;
    public int I0;
    public final wn.f J;
    public BroadcastReceiver J0;
    public final wn.f K;
    public ye.c K0;
    public final wn.f L;
    public ye.n L0;
    public final wn.f M;
    public Integer M0;
    public final wn.f N;
    public long N0;
    public final wn.f O;
    public long O0;
    public final wn.f P;
    public boolean P0;
    public final wn.f Q;
    public boolean Q0;
    public final wn.f R;
    public RTCManager R0;
    public final wn.f S;
    public SpeechAnalyzer S0;
    public final wn.f T;
    public LLStreamKey T0;
    public final wn.f U;
    public int U0;
    public final wn.f V;
    public xb.h0 V0;
    public final wn.f W;
    public final y4.c W0;
    public final wn.f X;
    public final wn.f Y;
    public final wn.f Z;

    /* renamed from: a0  reason: collision with root package name */
    public final wn.f f22704a0;

    /* renamed from: b0  reason: collision with root package name */
    public final wn.f f22705b0;

    /* renamed from: c0  reason: collision with root package name */
    public final wn.f f22706c0;

    /* renamed from: d0  reason: collision with root package name */
    public final wn.f f22707d0;

    /* renamed from: e0  reason: collision with root package name */
    public final wn.f f22708e0;

    /* renamed from: f0  reason: collision with root package name */
    public final wn.f f22709f0;

    /* renamed from: g0  reason: collision with root package name */
    public y4.d f22710g0;

    /* renamed from: h0  reason: collision with root package name */
    public final h f22711h0;

    /* renamed from: i0  reason: collision with root package name */
    public final m f22712i0;

    /* renamed from: j0  reason: collision with root package name */
    public final xo.s<LiveViewerNum> f22713j0;

    /* renamed from: k0  reason: collision with root package name */
    public final xo.g0<LiveViewerNum> f22714k0;

    /* renamed from: l0  reason: collision with root package name */
    public nd.f f22715l0;

    /* renamed from: m0  reason: collision with root package name */
    public cf.g f22716m0;

    /* renamed from: n0  reason: collision with root package name */
    public Handler f22717n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f22718o0;

    /* renamed from: p0  reason: collision with root package name */
    public te.b f22719p0;

    /* renamed from: q0  reason: collision with root package name */
    public uo.d2 f22720q0;

    /* renamed from: r0  reason: collision with root package name */
    public BroadcastReceiver f22721r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f22722s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f22723t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f22724u0;

    /* renamed from: v0  reason: collision with root package name */
    public GiftRankingTopUser f22725v0;

    /* renamed from: w0  reason: collision with root package name */
    public ec.z f22726w0;

    /* renamed from: x0  reason: collision with root package name */
    public dc.j f22728x0;

    /* renamed from: y0  reason: collision with root package name */
    public Bundle f22730y0;

    /* renamed from: z0  reason: collision with root package name */
    public dc.x f22732z0;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f22727x = uo.r0.b();

    /* renamed from: y  reason: collision with root package name */
    public final wn.f f22729y = wn.g.a(new d());

    /* renamed from: z  reason: collision with root package name */
    public final wn.f f22731z = wn.g.a(new k());
    public final wn.f A = wn.g.a(new o());

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, ye.c cVar, boolean z10) {
            jo.p.h(context, "context");
            jo.p.h(cVar, "recordRequestParams");
            Intent intent = new Intent(context, CastService.class);
            intent.putExtra("EXTRA_CASTSERVICE_PARAMS", cVar);
            intent.putExtra("EXTRA_CASTSERVICE_IS_CLOSED_LIVE", z10);
            intent.setAction("com.dena.mirrorman.castservice.action.PLAY");
            return intent;
        }

        public final boolean b(Context context) {
            jo.p.h(context, "context");
            Object systemService = context.getSystemService("appops");
            jo.p.f(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
            return ((AppOpsManager) systemService).checkOpNoThrow("android:picture_in_picture", Process.myUid(), context.getPackageName()) == 0 && context.getPackageManager().hasSystemFeature("android.software.picture_in_picture") && !context.getResources().getBoolean(xb.k.f59921a);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$21", f = "CastService.kt", l = {2019}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22733w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<AcceptedMatchedCollabResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ CastService f22735w;

            public a(CastService castService) {
                this.f22735w = castService;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(AcceptedMatchedCollabResponse acceptedMatchedCollabResponse, ao.d<? super wn.v> dVar) {
                this.f22735w.P0().l(new jf.h(acceptedMatchedCollabResponse.getMatchedLiveId(), acceptedMatchedCollabResponse.getMatchedUserId(), acceptedMatchedCollabResponse.getMatchedUserName(), acceptedMatchedCollabResponse.getCollabUnicastHost(), acceptedMatchedCollabResponse.getCollabUnicastPort(), acceptedMatchedCollabResponse.getCollabUnicastKey(), acceptedMatchedCollabResponse.getStunServers(), acceptedMatchedCollabResponse.getTurnServers(), this.f22735w.Y0(), CollabType.LIVE, "INTENT_ACTION_MATCHING_COLLAB"));
                return wn.v.f59242a;
            }
        }

        public a0(ao.d<? super a0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22733w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<AcceptedMatchedCollabResponse> M = CastService.this.O0().M();
                a aVar = new a(CastService.this);
                this.f22733w = 1;
                if (M.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$showFloatControlView$1", f = "CastService.kt", l = {2522}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22736w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ gc.q f22738y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a1(gc.q qVar, ao.d<? super a1> dVar) {
            super(2, dVar);
            this.f22738y = qVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a1(this.f22738y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22736w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest l12 = CastService.this.l1();
                    this.f22736w = 1;
                    obj = MRRequest.DefaultImpls.getAppSearch$default(l12, Referer.Broadcast.SETTING, "", null, null, this, 12, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                gc.q qVar = this.f22738y;
                List<App.AppParams> apps = ((App.Apps) obj).getApps();
                CastService castService = CastService.this;
                ArrayList arrayList = new ArrayList(xn.t.u(apps, 10));
                for (App.AppParams appParams : apps) {
                    c.a.C0456a c0456a = c.a.f35512h;
                    List<App.AppParams> f10 = castService.W0().r().f();
                    arrayList.add(c0456a.a(appParams, f10 != null ? f10.contains(appParams) : false));
                }
                qVar.setAppInfoList(arrayList);
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a2 extends jo.q implements io.a<od.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22739w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22740x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22741y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a2(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22739w = componentCallbacks;
            this.f22740x = aVar;
            this.f22741y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.f] */
        @Override // io.a
        public final od.f invoke() {
            ComponentCallbacks componentCallbacks = this.f22739w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.f.class), this.f22740x, this.f22741y);
        }
    }

    /* loaded from: classes2.dex */
    public final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            jo.p.h(context, "context");
            jo.p.h(intent, "intent");
            if (jo.p.c("android.intent.action.SCREEN_OFF", intent.getAction())) {
                CastService.this.f2();
            } else if (jo.p.c("android.intent.action.USER_PRESENT", intent.getAction())) {
                CastService.this.m2();
            } else if (jo.p.c("android.intent.action.SCREEN_ON", intent.getAction())) {
                CastService.this.m2();
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$22", f = "CastService.kt", l = {2038}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22743w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<LiveViewerNum> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ CastService f22745w;

            public a(CastService castService) {
                this.f22745w = castService;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(LiveViewerNum liveViewerNum, ao.d<? super wn.v> dVar) {
                ec.z zVar = this.f22745w.f22726w0;
                if (zVar != null) {
                    zVar.setViewCount(liveViewerNum.getOnlineViewerNum());
                }
                fa.b b10 = this.f22745w.S0().b("FloatControlView");
                gc.q qVar = b10 instanceof gc.q ? (gc.q) b10 : null;
                if (qVar != null) {
                    qVar.setTotalViewerNum(liveViewerNum.getTotalViewerNum());
                }
                this.f22745w.g1().i(liveViewerNum.getOnlineViewerNum(), liveViewerNum.getTotalViewerNum());
                return wn.v.f59242a;
            }
        }

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
            int i10 = this.f22743w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.g0 g0Var = CastService.this.f22714k0;
                a aVar = new a(CastService.this);
                this.f22743w = 1;
                if (g0Var.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b1 extends jo.q implements io.a<od.p> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22746w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22747x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22748y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22746w = componentCallbacks;
            this.f22747x = aVar;
            this.f22748y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.p, java.lang.Object] */
        @Override // io.a
        public final od.p invoke() {
            ComponentCallbacks componentCallbacks = this.f22746w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.p.class), this.f22747x, this.f22748y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b2 extends jo.q implements io.a<nf.h> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22749w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22750x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22751y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b2(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22749w = componentCallbacks;
            this.f22750x = aVar;
            this.f22751y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.h, java.lang.Object] */
        @Override // io.a
        public final nf.h invoke() {
            ComponentCallbacks componentCallbacks = this.f22749w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.h.class), this.f22750x, this.f22751y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$acceptCollab$1", f = "CastService.kt", l = {1589}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ CollabType A;

        /* renamed from: w  reason: collision with root package name */
        public int f22752w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f22754y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f22755z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, boolean z10, CollabType collabType, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f22754y = str;
            this.f22755z = z10;
            this.A = collabType;
        }

        public static final void g(CastService castService, String str, boolean z10, CollabType collabType) {
            jf.k kVar;
            RTCManager rTCManager = castService.R0;
            if (rTCManager == null || !rTCManager.hasClient(str)) {
                return;
            }
            od.f P0 = castService.P0();
            String Y0 = castService.Y0();
            List<jf.g> d10 = xn.r.d(new jf.g(str, rTCManager.isConnected(str)));
            if (z10) {
                kVar = jf.k.RECONNECT_TIMEOUT;
            } else {
                kVar = jf.k.TIMEOUT;
            }
            P0.h(Referer.BROADCAST, Y0, d10, kVar);
            if (collabType == CollabType.LIVE) {
                fa.c S0 = castService.S0();
                String string = castService.getString(xb.r.text_ios_collab_timeout_for_caster, new Object[]{"60"});
                String string2 = castService.getString(xb.r.text_solve_the_problem);
                jo.p.g(string2, "getString(R.string.text_solve_the_problem)");
                String string3 = castService.getString(xb.r.O);
                jo.p.g(string3, "getString(R.string.text_close)");
                S0.f(new dc.d(castService, string, null, string2, string3, "DIALOG_TAG_COLLAB_LIVE_TIMEOUT", 4, null));
            } else {
                castService.b2(xb.r.text_ios_collab_timeout, false);
            }
            castService.N0().l(castService.O0().S().f(), str);
            dq.c.c().l(new ce.p());
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f22754y, this.f22755z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22752w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest l12 = CastService.this.l1();
                    String Y0 = CastService.this.Y0();
                    String str = this.f22754y;
                    int i11 = this.f22755z ? 1 : 0;
                    this.f22752w = 1;
                    obj = l12.postCollabAccept(Referer.BROADCAST, Y0, str, i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                StatusResponse statusResponse = (StatusResponse) obj;
                CastService.this.N0().j(CastService.this.O0().S().f(), this.f22754y);
                CastService.this.P0().j(CastService.this.Y0(), false);
                Handler handler = CastService.this.f22717n0;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                CastService.this.f22717n0 = new Handler(Looper.getMainLooper());
                Handler handler2 = CastService.this.f22717n0;
                if (handler2 != null) {
                    final CastService castService = CastService.this;
                    final String str2 = this.f22754y;
                    final boolean z10 = this.f22755z;
                    final CollabType collabType = this.A;
                    co.b.a(handler2.postDelayed(new Runnable() { // from class: xb.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            CastService.c.g(CastService.this, str2, z10, collabType);
                        }
                    }, DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS));
                }
            } catch (Exception e10) {
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.Maintenance ? true : jo.p.c(error, MRError.ForceUpdate.INSTANCE)) {
                    of.n.f45411a.l(CastService.this.getApplicationContext(), error);
                } else {
                    CastService.this.Q1(error);
                }
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$23", f = "CastService.kt", l = {2046}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22756w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ CastService f22758w;

            public a(CastService castService) {
                this.f22758w = castService;
            }

            public final Object a(int i10, ao.d<? super wn.v> dVar) {
                HashMap<String, RTCClient> clients;
                if (i10 == 1 && this.f22758w.o1().a().d()) {
                    RTCManager rTCManager = this.f22758w.R0;
                    Collection<RTCClient> values = (rTCManager == null || (clients = rTCManager.getClients()) == null) ? null : clients.values();
                    if (values == null) {
                        values = xn.s.k();
                    }
                    od.f P0 = this.f22758w.P0();
                    String Y0 = this.f22758w.Y0();
                    ArrayList arrayList = new ArrayList(xn.t.u(values, 10));
                    for (RTCClient rTCClient : values) {
                        arrayList.add(new jf.g(rTCClient.getUserId(), rTCClient.isConnected()));
                    }
                    P0.h(Referer.BROADCAST, Y0, arrayList, jf.k.PHONE_CALL);
                    this.f22758w.u2(true);
                    this.f22758w.p2(true);
                    this.f22758w.b2(xb.r.text_stop_sharing_screen_by_calling, false);
                }
                return wn.v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Integer num, ao.d dVar) {
                return a(num.intValue(), dVar);
            }
        }

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
            int i10 = this.f22756w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<Integer> u10 = CastService.this.W0().u();
                a aVar = new a(CastService.this);
                this.f22756w = 1;
                if (u10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c1 extends jo.q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22759w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22760x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22761y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22759w = componentCallbacks;
            this.f22760x = aVar;
            this.f22761y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            ComponentCallbacks componentCallbacks = this.f22759w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.o.class), this.f22760x, this.f22761y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c2 extends jo.q implements io.a<nf.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22762w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22763x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22764y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c2(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22762w = componentCallbacks;
            this.f22763x = aVar;
            this.f22764y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.k, java.lang.Object] */
        @Override // io.a
        public final nf.k invoke() {
            ComponentCallbacks componentCallbacks = this.f22762w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.k.class), this.f22763x, this.f22764y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<AudioManager> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final AudioManager invoke() {
            Object systemService = CastService.this.getApplicationContext().getSystemService("audio");
            jo.p.f(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return (AudioManager) systemService;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$24", f = "CastService.kt", l = {2072}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22766w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ CastService f22768w;

            public a(CastService castService) {
                this.f22768w = castService;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f22768w.E0();
                return wn.v.f59242a;
            }
        }

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
            int i10 = this.f22766w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> w02 = CastService.this.O0().w0();
                a aVar = new a(CastService.this);
                this.f22766w = 1;
                if (w02.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d1 extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22769w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22770x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22771y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22769w = componentCallbacks;
            this.f22770x = aVar;
            this.f22771y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f22769w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f22770x, this.f22771y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d2 extends jo.q implements io.a<hf.s> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22772w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22773x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22774y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d2(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22772w = componentCallbacks;
            this.f22773x = aVar;
            this.f22774y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.s, java.lang.Object] */
        @Override // io.a
        public final hf.s invoke() {
            ComponentCallbacks componentCallbacks = this.f22772w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.s.class), this.f22773x, this.f22774y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends ao.a implements uo.l0 {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ CastService f22775w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l0.a aVar, CastService castService) {
            super(aVar);
            this.f22775w = castService;
        }

        @Override // uo.l0
        public void handleException(ao.g gVar, Throwable th2) {
            fa.b b10 = this.f22775w.S0().b("FloatGiftView");
            dc.e eVar = b10 instanceof dc.e ? (dc.e) b10 : null;
            if (eVar != null) {
                eVar.b();
            }
            g9.a.c(th2);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$25", f = "CastService.kt", l = {2078}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22776w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ CastService f22778w;

            public a(CastService castService) {
                this.f22778w = castService;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                CastService.j2(this.f22778w, false, 1, null);
                return wn.v.f59242a;
            }
        }

        public e0(ao.d<? super e0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22776w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> A0 = CastService.this.O0().A0();
                a aVar = new a(CastService.this);
                this.f22776w = 1;
                if (A0.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e1 extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22779w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22780x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22781y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22779w = componentCallbacks;
            this.f22780x = aVar;
            this.f22781y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f22779w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.m.class), this.f22780x, this.f22781y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e2 extends jo.q implements io.a<hf.w> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22782w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22783x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22784y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e2(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22782w = componentCallbacks;
            this.f22783x = aVar;
            this.f22784y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.w, java.lang.Object] */
        @Override // io.a
        public final hf.w invoke() {
            ComponentCallbacks componentCallbacks = this.f22782w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.w.class), this.f22783x, this.f22784y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$consumeGift$2", f = "CastService.kt", l = {1669, 1676, 1670}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ GiftItem B;

        /* renamed from: w  reason: collision with root package name */
        public Object f22785w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22786x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22787y;

        /* renamed from: z  reason: collision with root package name */
        public int f22788z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(GiftItem giftItem, ao.d<? super f> dVar) {
            super(2, dVar);
            this.B = giftItem;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00db A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x013e  */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 347
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$2", f = "CastService.kt", l = {3157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22789w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22790x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22791y;

        /* renamed from: z  reason: collision with root package name */
        public int f22792z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:17:0x0054, B:19:0x005c, B:22:0x0065), top: B:33:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r10.f22792z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f22791y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f22790x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f22789w
                com.dena.mirrativ.streaming.CastService r4 = (com.dena.mirrativ.streaming.CastService) r4
                wn.m.b(r11)     // Catch: java.lang.Throwable -> L88
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto L53
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                wn.m.b(r11)
                com.dena.mirrativ.streaming.CastService r11 = com.dena.mirrativ.streaming.CastService.this
                nf.i0 r11 = com.dena.mirrativ.streaming.CastService.c0(r11)
                wo.x r3 = r11.o()
                com.dena.mirrativ.streaming.CastService r11 = com.dena.mirrativ.streaming.CastService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L88
                r4 = r11
                r11 = r10
            L3d:
                r11.f22789w = r4     // Catch: java.lang.Throwable -> L88
                r11.f22790x = r3     // Catch: java.lang.Throwable -> L88
                r11.f22791y = r1     // Catch: java.lang.Throwable -> L88
                r11.f22792z = r2     // Catch: java.lang.Throwable -> L88
                java.lang.Object r5 = r1.a(r11)     // Catch: java.lang.Throwable -> L88
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r9 = r0
                r0 = r11
                r11 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r9
            L53:
                r6 = 0
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L85
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L85
                if (r11 == 0) goto L7f
                java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> L85
                com.dena.mirrorman.net.api.response.Moderator r11 = (com.dena.mirrorman.net.api.response.Moderator) r11     // Catch: java.lang.Throwable -> L85
                if (r11 != 0) goto L65
                goto L79
            L65:
                fa.c r6 = com.dena.mirrativ.streaming.CastService.H(r5)     // Catch: java.lang.Throwable -> L85
                dc.a r7 = new dc.a     // Catch: java.lang.Throwable -> L85
                java.lang.String r8 = r11.getName()     // Catch: java.lang.Throwable -> L85
                java.lang.String r11 = r11.getProfileImageUrl()     // Catch: java.lang.Throwable -> L85
                r7.<init>(r5, r8, r11)     // Catch: java.lang.Throwable -> L85
                r6.f(r7)     // Catch: java.lang.Throwable -> L85
            L79:
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L7f:
                wo.n.a(r4, r6)
                wn.v r11 = wn.v.f59242a
                return r11
            L85:
                r11 = move-exception
                r3 = r4
                goto L89
            L88:
                r11 = move-exception
            L89:
                throw r11     // Catch: java.lang.Throwable -> L8a
            L8a:
                r0 = move-exception
                wo.n.a(r3, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.f0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class f1 extends jo.q implements io.a<nf.w> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22793w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22794x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22795y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22793w = componentCallbacks;
            this.f22794x = aVar;
            this.f22795y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.w, java.lang.Object] */
        @Override // io.a
        public final nf.w invoke() {
            ComponentCallbacks componentCallbacks = this.f22793w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.w.class), this.f22794x, this.f22795y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f2 extends jo.q implements io.a<cc.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22796w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22797x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22798y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f2(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22796w = componentCallbacks;
            this.f22797x = aVar;
            this.f22798y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [cc.f, java.lang.Object] */
        @Override // io.a
        public final cc.f invoke() {
            ComponentCallbacks componentCallbacks = this.f22796w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(cc.f.class), this.f22797x, this.f22798y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$editLiveTitle$1", f = "CastService.kt", l = {1730}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ jf.w A;
        public final /* synthetic */ String B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;
        public final /* synthetic */ int E;
        public final /* synthetic */ boolean F;

        /* renamed from: w  reason: collision with root package name */
        public int f22799w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f22801y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f22802z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, jf.w wVar, String str3, int i10, int i11, int i12, boolean z10, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f22801y = str;
            this.f22802z = str2;
            this.A = wVar;
            this.B = str3;
            this.C = i10;
            this.D = i11;
            this.E = i12;
            this.F = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f22801y, this.f22802z, this.A, this.B, this.C, this.D, this.E, this.F, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            dq.c c10;
            nd.l lVar;
            Object postLiveEdit;
            Object c11 = bo.c.c();
            int i10 = this.f22799w;
            boolean z10 = true;
            try {
                try {
                    if (i10 == 0) {
                        wn.m.b(obj);
                        MRRequest l12 = CastService.this.l1();
                        String str = this.f22801y;
                        String str2 = this.f22802z;
                        String b10 = this.A.b();
                        String str3 = this.B;
                        Integer d10 = co.b.d(this.C);
                        Integer d11 = co.b.d(this.C == 1 ? 1 : 6);
                        Integer d12 = co.b.d(this.D);
                        Integer d13 = co.b.d(this.E);
                        Integer d14 = co.b.d(CastService.this.n1().i() ? 1 : 0);
                        this.f22799w = 1;
                        postLiveEdit = l12.postLiveEdit(Referer.BROADCAST, str, str2, b10, str3, d10, d11, d12, d13, d14, this);
                        if (postLiveEdit == c11) {
                            return c11;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                        postLiveEdit = obj;
                    }
                    LiveOwnedResponse liveOwnedResponse = (LiveOwnedResponse) postLiveEdit;
                    if (this.F) {
                        CastService.this.N0().s(CastService.this.Y0());
                    }
                    CastService.this.g1().d(liveOwnedResponse);
                    CastService.this.Z0().D3(this.A.c());
                    CastService.this.Z0().A4(this.A.a());
                    CastService.this.Z0().v0(this.A.b());
                    CastService.this.S0().d("FloatLoadingView");
                    c10 = dq.c.c();
                    lVar = new nd.l();
                } catch (Exception e10) {
                    fa.b b11 = CastService.this.S0().b("FloatControlView");
                    gc.q qVar = b11 instanceof gc.q ? (gc.q) b11 : null;
                    if (qVar != null) {
                        CastService castService = CastService.this;
                        qVar.setTitle(castService.Z0().getTitle());
                        qVar.setSelectedApp(new jf.w(castService.Z0().h(), castService.Z0().R(), castService.Z0().D1(), castService.Z0().e5()));
                    }
                    if (!(e10 instanceof IOException)) {
                        z10 = e10 instanceof HttpException;
                    }
                    if (z10) {
                        of.n.z(CastService.this.getApplicationContext());
                        CastService.this.S0().d("FloatLoadingView");
                        c10 = dq.c.c();
                        lVar = new nd.l();
                    } else {
                        throw e10;
                    }
                }
                c10.l(lVar);
                return wn.v.f59242a;
            } catch (Throwable th2) {
                CastService.this.S0().d("FloatLoadingView");
                dq.c.c().l(new nd.l());
                throw th2;
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$3", f = "CastService.kt", l = {3157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22803w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22804x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22805y;

        /* renamed from: z  reason: collision with root package name */
        public int f22806z;

        public g0(ao.d<? super g0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f22806z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f22805y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f22804x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f22803w
                com.dena.mirrativ.streaming.CastService r4 = (com.dena.mirrativ.streaming.CastService) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L7d
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                com.dena.mirrativ.streaming.CastService r10 = com.dena.mirrativ.streaming.CastService.this
                nf.i0 r10 = com.dena.mirrativ.streaming.CastService.c0(r10)
                wo.x r3 = r10.i()
                com.dena.mirrativ.streaming.CastService r10 = com.dena.mirrativ.streaming.CastService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7d
                r4 = r10
                r10 = r9
            L3d:
                r10.f22803w = r4     // Catch: java.lang.Throwable -> L7d
                r10.f22804x = r3     // Catch: java.lang.Throwable -> L7d
                r10.f22805y = r1     // Catch: java.lang.Throwable -> L7d
                r10.f22806z = r2     // Catch: java.lang.Throwable -> L7d
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L7d
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L7a
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L7a
                if (r10 == 0) goto L74
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L7a
                com.dena.mirrativ.mirrativapi.core.MRError r10 = (com.dena.mirrativ.mirrativapi.core.MRError) r10     // Catch: java.lang.Throwable -> L7a
                fa.c r6 = com.dena.mirrativ.streaming.CastService.H(r5)     // Catch: java.lang.Throwable -> L7a
                java.lang.String r7 = "FloatConfirmModeratorDialog"
                r6.d(r7)     // Catch: java.lang.Throwable -> L7a
                com.dena.mirrativ.streaming.CastService.q0(r5, r10)     // Catch: java.lang.Throwable -> L7a
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L74:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L7a:
                r10 = move-exception
                r3 = r4
                goto L7e
            L7d:
                r10 = move-exception
            L7e:
                throw r10     // Catch: java.lang.Throwable -> L7f
            L7f:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.g0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class g1 extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22807w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22808x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22809y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22807w = componentCallbacks;
            this.f22808x = aVar;
            this.f22809y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f22807w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f22808x, this.f22809y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$startCast$2$1", f = "CastService.kt", l = {2683}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g2 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22810w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ye.c f22812y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g2(ye.c cVar, ao.d<? super g2> dVar) {
            super(2, dVar);
            this.f22812y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g2(this.f22812y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g2) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v4 */
        /* JADX WARN: Type inference failed for: r14v5 */
        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            String str;
            boolean z10;
            fa.c cVar;
            String str2;
            Object postLiveStart;
            Object c10 = bo.c.c();
            int i10 = this.f22810w;
            String str3 = "FloatLoadingView";
            boolean z11 = true;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest l12 = CastService.this.l1();
                    String b10 = this.f22812y.b();
                    Integer d10 = co.b.d(CastService.this.h1().m());
                    String h10 = this.f22812y.h();
                    int h52 = CastService.this.n1().h5();
                    int i11 = CastService.this.v1() ? 1 : 0;
                    int i12 = CastService.this.h1().c() ? 1 : 0;
                    Integer d11 = co.b.d(CastService.this.h1().q());
                    int i13 = CastService.this.Z0().V() ? 1 : 0;
                    this.f22810w = 1;
                    z10 = true;
                    z11 = false;
                    str2 = "FloatLoadingView";
                    g2 g2Var = this;
                    try {
                        postLiveStart = l12.postLiveStart(Referer.BROADCAST, b10, "", d10, h10, h52, i11, i12, d11, "", 0, i13, g2Var);
                        str3 = g2Var;
                        if (postLiveStart == c10) {
                            return c10;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        str = str2;
                        try {
                            MRError error = MRErrorKt.convertMRException(e).getError();
                            if (error instanceof MRError.Maintenance ? z10 : jo.p.c(error, MRError.ForceUpdate.INSTANCE)) {
                                of.n.f45411a.l(CastService.this.getApplicationContext(), error);
                                CastService.this.n2("");
                            } else {
                                CastService castService = CastService.this;
                                String message = error.getMessage();
                                if (message == null) {
                                    message = CastService.this.getString(xb.r.f60070c);
                                    jo.p.g(message, "getString(R.string.error_access)");
                                }
                                castService.c2(message, false);
                                CastService.this.n2("StartCast Failed (API error):" + error.getMessage());
                            }
                            cVar = CastService.this.S0();
                            cVar.d(str);
                            return wn.v.f59242a;
                        } catch (Throwable th2) {
                            th = th2;
                            CastService.this.S0().d(str);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str = str2;
                        CastService.this.S0().d(str);
                        throw th;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                    postLiveStart = obj;
                    z10 = true;
                    str2 = "FloatLoadingView";
                    str3 = str3;
                }
                LiveOwnedResponse liveOwnedResponse = (LiveOwnedResponse) postLiveStart;
                CastService.this.V0().z(liveOwnedResponse.getLiveId());
                CastService.this.N0().z(liveOwnedResponse);
                CastService.this.Z0().q5(liveOwnedResponse.isOmotenashi());
                CastService.this.N0 = liveOwnedResponse.getStartedAt();
                CastService.this.o2(liveOwnedResponse);
                if (CastService.this.R0().t().length() > 0 ? z10 : false) {
                    od.p V0 = CastService.this.V0();
                    String t10 = CastService.this.R0().t();
                    String string = CastService.this.getResources().getString(xb.r.f60080k);
                    jo.p.g(string, "resources.getString(R.string.safety_net_api_key)");
                    V0.s(t10, string);
                }
                if (CastService.this.s1().a()) {
                    MRLogger d12 = CastService.this.d1();
                    MRLog.Companion companion = MRLog.Companion;
                    ye.c cVar2 = this.f22812y;
                    MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_FOREGROUND_PERMISSION_GOT);
                    builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, cVar2.b())));
                    d12.sendLog(builder.build());
                    CastService.this.K0();
                }
                cVar = CastService.this.S0();
                str = str2;
            } catch (Exception e11) {
                e = e11;
                z10 = z11;
                str = str3;
            } catch (Throwable th4) {
                th = th4;
                str = str3;
            }
            cVar.d(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h implements g.b {
        public h() {
        }

        @Override // cf.g.b
        public void onError(Throwable th2) {
            jo.p.h(th2, "cause");
            g9.a.c(th2);
            t1.a aVar = yd.t1.f61795x;
            Context applicationContext = CastService.this.getApplicationContext();
            jo.p.g(applicationContext, "applicationContext");
            String string = CastService.this.getString(xb.r.f60072d);
            jo.p.g(string, "getString(R.string.error_others)");
            aVar.a(applicationContext, string);
            CastService.j2(CastService.this, false, 1, null);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$4", f = "CastService.kt", l = {3157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22814w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22815x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22816y;

        /* renamed from: z  reason: collision with root package name */
        public int f22817z;

        public h0(ao.d<? super h0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f22817z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f22816y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f22815x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f22814w
                com.dena.mirrativ.streaming.CastService r4 = (com.dena.mirrativ.streaming.CastService) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L7d
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                com.dena.mirrativ.streaming.CastService r10 = com.dena.mirrativ.streaming.CastService.this
                nf.i0 r10 = com.dena.mirrativ.streaming.CastService.c0(r10)
                wo.x r3 = r10.k()
                com.dena.mirrativ.streaming.CastService r10 = com.dena.mirrativ.streaming.CastService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7d
                r4 = r10
                r10 = r9
            L3d:
                r10.f22814w = r4     // Catch: java.lang.Throwable -> L7d
                r10.f22815x = r3     // Catch: java.lang.Throwable -> L7d
                r10.f22816y = r1     // Catch: java.lang.Throwable -> L7d
                r10.f22817z = r2     // Catch: java.lang.Throwable -> L7d
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L7d
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L7a
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L7a
                if (r10 == 0) goto L74
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L7a
                com.dena.mirrativ.mirrativapi.core.MRError r10 = (com.dena.mirrativ.mirrativapi.core.MRError) r10     // Catch: java.lang.Throwable -> L7a
                fa.c r6 = com.dena.mirrativ.streaming.CastService.H(r5)     // Catch: java.lang.Throwable -> L7a
                java.lang.String r7 = "FloatConfirmModeratorDialog"
                r6.d(r7)     // Catch: java.lang.Throwable -> L7a
                com.dena.mirrativ.streaming.CastService.q0(r5, r10)     // Catch: java.lang.Throwable -> L7a
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L74:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L7a:
                r10 = move-exception
                r3 = r4
                goto L7e
            L7d:
                r10 = move-exception
            L7e:
                throw r10     // Catch: java.lang.Throwable -> L7f
            L7f:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.h0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class h1 extends jo.q implements io.a<hf.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22818w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22819x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22820y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22818w = componentCallbacks;
            this.f22819x = aVar;
            this.f22820y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.e, java.lang.Object] */
        @Override // io.a
        public final hf.e invoke() {
            ComponentCallbacks componentCallbacks = this.f22818w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.e.class), this.f22819x, this.f22820y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h2 implements Runnable {
        public h2() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CastService.this.D0) {
                CastService.this.A1(this);
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$foregroundAppChanged$1", f = "CastService.kt", l = {1816}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22822w;

        /* renamed from: x  reason: collision with root package name */
        public int f22823x;

        /* loaded from: classes2.dex */
        public static final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return zn.a.c(Long.valueOf(((UsageStats) t11).getLastTimeUsed()), Long.valueOf(((UsageStats) t10).getLastTimeUsed()));
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends jo.q implements io.l<UsageStats, CharSequence> {

            /* renamed from: w  reason: collision with root package name */
            public static final b f22825w = new b();

            public b() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final CharSequence invoke(UsageStats usageStats) {
                jo.p.h(usageStats, "it");
                String packageName = usageStats.getPackageName();
                jo.p.g(packageName, "it.packageName");
                return packageName;
            }
        }

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

        /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0119 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006b A[EDGE_INSN: B:31:0x006b->B:18:0x006b ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x011a -> B:30:0x011c). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 287
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$5", f = "CastService.kt", l = {3157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22826w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22827x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22828y;

        /* renamed from: z  reason: collision with root package name */
        public int f22829z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #0 {all -> 0x0098, blocks: (B:6:0x0019, B:15:0x0050, B:17:0x0059, B:12:0x0041, B:11:0x0037), top: B:27:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:15:0x0050). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r1 = r19
                java.lang.Object r0 = bo.c.c()
                int r2 = r1.f22829z
                r3 = 1
                if (r2 == 0) goto L28
                if (r2 != r3) goto L20
                java.lang.Object r2 = r1.f22828y
                wo.k r2 = (wo.k) r2
                java.lang.Object r4 = r1.f22827x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r1.f22826w
                com.dena.mirrativ.streaming.CastService r5 = (com.dena.mirrativ.streaming.CastService) r5
                wn.m.b(r20)     // Catch: java.lang.Throwable -> L98
                r7 = r20
                r6 = r1
                goto L50
            L20:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L28:
                wn.m.b(r20)
                com.dena.mirrativ.streaming.CastService r2 = com.dena.mirrativ.streaming.CastService.this
                nf.i0 r2 = com.dena.mirrativ.streaming.CastService.c0(r2)
                wo.x r4 = r2.j()
                com.dena.mirrativ.streaming.CastService r2 = com.dena.mirrativ.streaming.CastService.this
                wo.k r5 = r4.iterator()     // Catch: java.lang.Throwable -> L98
                r6 = r1
                r18 = r5
                r5 = r2
                r2 = r18
            L41:
                r6.f22826w = r5     // Catch: java.lang.Throwable -> L98
                r6.f22827x = r4     // Catch: java.lang.Throwable -> L98
                r6.f22828y = r2     // Catch: java.lang.Throwable -> L98
                r6.f22829z = r3     // Catch: java.lang.Throwable -> L98
                java.lang.Object r7 = r2.a(r6)     // Catch: java.lang.Throwable -> L98
                if (r7 != r0) goto L50
                return r0
            L50:
                r8 = 0
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L98
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L98
                if (r7 == 0) goto L92
                java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L98
                java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L98
                fa.c r7 = com.dena.mirrativ.streaming.CastService.H(r5)     // Catch: java.lang.Throwable -> L98
                dc.d r15 = new dc.d     // Catch: java.lang.Throwable -> L98
                int r8 = xb.r.f60084m0     // Catch: java.lang.Throwable -> L98
                java.lang.String r10 = r5.getString(r8)     // Catch: java.lang.Throwable -> L98
                int r8 = xb.r.f60091w1     // Catch: java.lang.Throwable -> L98
                java.lang.String r11 = r5.getString(r8)     // Catch: java.lang.Throwable -> L98
                int r8 = xb.r.f60090v1     // Catch: java.lang.Throwable -> L98
                java.lang.String r12 = r5.getString(r8)     // Catch: java.lang.Throwable -> L98
                java.lang.String r8 = "getString(R.string.text_kick_ja)"
                jo.p.g(r12, r8)     // Catch: java.lang.Throwable -> L98
                r13 = 0
                java.lang.String r14 = "DIALOG_TAG_KICK_CONFIRM"
                r16 = 16
                r17 = 0
                r8 = r15
                r9 = r5
                r3 = r15
                r15 = r16
                r16 = r17
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L98
                r7.f(r3)     // Catch: java.lang.Throwable -> L98
                r3 = 1
                goto L41
            L92:
                wo.n.a(r4, r8)
                wn.v r0 = wn.v.f59242a
                return r0
            L98:
                r0 = move-exception
                r2 = r0
                throw r2     // Catch: java.lang.Throwable -> L9b
            L9b:
                r0 = move-exception
                r3 = r0
                wo.n.a(r4, r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.i0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class i1 extends jo.q implements io.a<hf.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22830w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22831x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22832y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22830w = componentCallbacks;
            this.f22831x = aVar;
            this.f22832y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.r, java.lang.Object] */
        @Override // io.a
        public final hf.r invoke() {
            ComponentCallbacks componentCallbacks = this.f22830w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.r.class), this.f22831x, this.f22832y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i2 implements af.b {
        public i2() {
        }

        @Override // af.b
        public void onAudioLoaded(byte[] bArr) {
            SpeechAnalyzer speechAnalyzer;
            if (CastService.this.n1().r4() || !CastService.this.o1().a().e() || bArr == null || (speechAnalyzer = CastService.this.S0) == null) {
                return;
            }
            speechAnalyzer.k(bArr, 2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends BroadcastReceiver {
        public j() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            jo.p.h(intent, "intent");
            int intExtra = intent.getIntExtra("state", -1);
            if (intExtra == 0) {
                CastService.this.N0().Z(false);
            } else if (intExtra != 1) {
            } else {
                CastService.this.N0().Z(true);
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$6", f = "CastService.kt", l = {3157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22835w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22836x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22837y;

        /* renamed from: z  reason: collision with root package name */
        public int f22838z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #2 {all -> 0x007d, blocks: (B:17:0x0054, B:19:0x005c), top: B:34:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22838z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22837y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22836x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22835w
                com.dena.mirrativ.streaming.CastService r4 = (com.dena.mirrativ.streaming.CastService) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L80
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L53
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                wn.m.b(r9)
                com.dena.mirrativ.streaming.CastService r9 = com.dena.mirrativ.streaming.CastService.this
                nf.i0 r9 = com.dena.mirrativ.streaming.CastService.c0(r9)
                wo.x r3 = r9.m()
                com.dena.mirrativ.streaming.CastService r9 = com.dena.mirrativ.streaming.CastService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L80
                r4 = r9
                r9 = r8
            L3d:
                r9.f22835w = r4     // Catch: java.lang.Throwable -> L80
                r9.f22836x = r3     // Catch: java.lang.Throwable -> L80
                r9.f22837y = r1     // Catch: java.lang.Throwable -> L80
                r9.f22838z = r2     // Catch: java.lang.Throwable -> L80
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L80
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L53:
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L7d
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L7d
                if (r9 == 0) goto L77
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L7d
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L7d
                int r9 = xb.r.f60076g0     // Catch: java.lang.Throwable -> L7d
                java.lang.String r9 = r5.getString(r9)     // Catch: java.lang.Throwable -> L7d
                java.lang.String r6 = "getString(R.string.text_completed)"
                jo.p.g(r9, r6)     // Catch: java.lang.Throwable -> L7d
                r6 = 0
                com.dena.mirrativ.streaming.CastService.u0(r5, r9, r6)     // Catch: java.lang.Throwable -> L7d
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L77:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L7d:
                r9 = move-exception
                r3 = r4
                goto L81
            L80:
                r9 = move-exception
            L81:
                throw r9     // Catch: java.lang.Throwable -> L82
            L82:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.j0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class j1 extends jo.q implements io.a<hf.d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22839w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22840x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22841y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22839w = componentCallbacks;
            this.f22840x = aVar;
            this.f22841y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d0, java.lang.Object] */
        @Override // io.a
        public final hf.d0 invoke() {
            ComponentCallbacks componentCallbacks = this.f22839w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.d0.class), this.f22840x, this.f22841y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j2 implements n.a {
        public j2() {
        }

        @Override // ye.n.a
        public void onAudioLoaded(byte[] bArr) {
            SpeechAnalyzer speechAnalyzer;
            if (!CastService.this.o1().a().e() || bArr == null || (speechAnalyzer = CastService.this.S0) == null) {
                return;
            }
            speechAnalyzer.k(bArr, 2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<b> {
        public k() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final b invoke() {
            return new b();
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$7", f = "CastService.kt", l = {3157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22844w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22845x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22846y;

        /* renamed from: z  reason: collision with root package name */
        public int f22847z;

        public k0(ao.d<? super k0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22847z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22846y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22845x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22844w
                com.dena.mirrativ.streaming.CastService r4 = (com.dena.mirrativ.streaming.CastService) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L74
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L53
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                wn.m.b(r9)
                com.dena.mirrativ.streaming.CastService r9 = com.dena.mirrativ.streaming.CastService.this
                nf.i0 r9 = com.dena.mirrativ.streaming.CastService.c0(r9)
                wo.x r3 = r9.l()
                com.dena.mirrativ.streaming.CastService r9 = com.dena.mirrativ.streaming.CastService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f22844w = r4     // Catch: java.lang.Throwable -> L74
                r9.f22845x = r3     // Catch: java.lang.Throwable -> L74
                r9.f22846y = r1     // Catch: java.lang.Throwable -> L74
                r9.f22847z = r2     // Catch: java.lang.Throwable -> L74
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L74
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L53:
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
                if (r9 == 0) goto L6b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.mirrativapi.core.MRError r9 = (com.dena.mirrativ.mirrativapi.core.MRError) r9     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.streaming.CastService.q0(r5, r9)     // Catch: java.lang.Throwable -> L71
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L71:
                r9 = move-exception
                r3 = r4
                goto L75
            L74:
                r9 = move-exception
            L75:
                throw r9     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.k0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class k1 extends jo.q implements io.a<hf.m0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22848w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22849x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22850y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22848w = componentCallbacks;
            this.f22849x = aVar;
            this.f22850y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hf.m0] */
        @Override // io.a
        public final hf.m0 invoke() {
            ComponentCallbacks componentCallbacks = this.f22848w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.m0.class), this.f22849x, this.f22850y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends BroadcastReceiver {
        public l() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            jo.p.h(intent, "intent");
            CastService.j2(CastService.this, false, 1, null);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$8", f = "CastService.kt", l = {3157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22852w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22853x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22854y;

        /* renamed from: z  reason: collision with root package name */
        public int f22855z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00af, TryCatch #2 {all -> 0x00af, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x007b, B:23:0x0087), top: B:38:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r10.f22855z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f22854y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f22853x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f22852w
                com.dena.mirrativ.streaming.CastService r4 = (com.dena.mirrativ.streaming.CastService) r4
                wn.m.b(r11)     // Catch: java.lang.Throwable -> Lb2
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto L53
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                wn.m.b(r11)
                com.dena.mirrativ.streaming.CastService r11 = com.dena.mirrativ.streaming.CastService.this
                nf.c r11 = com.dena.mirrativ.streaming.CastService.B(r11)
                wo.x r3 = r11.M0()
                com.dena.mirrativ.streaming.CastService r11 = com.dena.mirrativ.streaming.CastService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lb2
                r4 = r11
                r11 = r10
            L3d:
                r11.f22852w = r4     // Catch: java.lang.Throwable -> Lb2
                r11.f22853x = r3     // Catch: java.lang.Throwable -> Lb2
                r11.f22854y = r1     // Catch: java.lang.Throwable -> Lb2
                r11.f22855z = r2     // Catch: java.lang.Throwable -> Lb2
                java.lang.Object r5 = r1.a(r11)     // Catch: java.lang.Throwable -> Lb2
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r9 = r0
                r0 = r11
                r11 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r9
            L53:
                r6 = 0
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> Laf
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> Laf
                if (r11 == 0) goto La9
                java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> Laf
                wn.k r11 = (wn.k) r11     // Catch: java.lang.Throwable -> Laf
                java.lang.Object r6 = r11.c()     // Catch: java.lang.Throwable -> Laf
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> Laf
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> Laf
                com.dena.mirrativ.streaming.CastService.C0(r5, r6)     // Catch: java.lang.Throwable -> Laf
                java.lang.Object r6 = r11.c()     // Catch: java.lang.Throwable -> Laf
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> Laf
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> Laf
                if (r6 != 0) goto La3
                java.lang.Object r11 = r11.d()     // Catch: java.lang.Throwable -> Laf
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> Laf
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> Laf
                if (r11 == 0) goto La3
                fa.c r11 = com.dena.mirrativ.streaming.CastService.H(r5)     // Catch: java.lang.Throwable -> Laf
                fa.a r6 = new fa.a     // Catch: java.lang.Throwable -> Laf
                android.content.res.Resources r7 = r5.getResources()     // Catch: java.lang.Throwable -> Laf
                int r8 = xb.r.text_restart_screen_share     // Catch: java.lang.Throwable -> Laf
                java.lang.String r7 = r7.getString(r8)     // Catch: java.lang.Throwable -> Laf
                java.lang.String r8 = "resources.getString(R.st…ext_restart_screen_share)"
                jo.p.g(r7, r8)     // Catch: java.lang.Throwable -> Laf
                r8 = 0
                r6.<init>(r5, r7, r8)     // Catch: java.lang.Throwable -> Laf
                r11.a(r6)     // Catch: java.lang.Throwable -> Laf
            La3:
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            La9:
                wo.n.a(r4, r6)
                wn.v r11 = wn.v.f59242a
                return r11
            Laf:
                r11 = move-exception
                r3 = r4
                goto Lb3
            Lb2:
                r11 = move-exception
            Lb3:
                throw r11     // Catch: java.lang.Throwable -> Lb4
            Lb4:
                r0 = move-exception
                wo.n.a(r3, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.l0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class l1 extends jo.q implements io.a<od.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22856w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22857x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22858y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22856w = componentCallbacks;
            this.f22857x = aVar;
            this.f22858y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.a] */
        @Override // io.a
        public final od.a invoke() {
            ComponentCallbacks componentCallbacks = this.f22856w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.a.class), this.f22857x, this.f22858y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m implements n.d {
        public m() {
        }

        @Override // ye.n.d
        public void a() {
            if (512000 < ze.b.f63104j.a().e()) {
                t1.a aVar = yd.t1.f61795x;
                Context applicationContext = CastService.this.getApplicationContext();
                jo.p.g(applicationContext, "applicationContext");
                String string = CastService.this.getString(xb.r.I1);
                jo.p.g(string, "getString(R.string.text_network_error)");
                aVar.a(applicationContext, string);
                return;
            }
            t1.a aVar2 = yd.t1.f61795x;
            Context applicationContext2 = CastService.this.getApplicationContext();
            jo.p.g(applicationContext2, "applicationContext");
            String string2 = CastService.this.getString(xb.r.text_network_error_low_resolution);
            jo.p.g(string2, "getString(R.string.text_…ork_error_low_resolution)");
            aVar2.a(applicationContext2, string2);
        }

        @Override // ye.n.d
        public void onError(Throwable th2) {
            jo.p.h(th2, "cause");
            g9.a.c(th2);
            t1.a aVar = yd.t1.f61795x;
            Context applicationContext = CastService.this.getApplicationContext();
            jo.p.g(applicationContext, "applicationContext");
            String string = CastService.this.getString(xb.r.f60072d);
            jo.p.g(string, "getString(R.string.error_others)");
            aVar.a(applicationContext, string);
            CastService.j2(CastService.this, false, 1, null);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$9", f = "CastService.kt", l = {3157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22860w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22861x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22862y;

        /* renamed from: z  reason: collision with root package name */
        public int f22863z;

        public m0(ao.d<? super m0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new m0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0078, B:23:0x007e, B:25:0x0086), top: B:36:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f22863z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f22862y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f22861x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f22860w
                com.dena.mirrativ.streaming.CastService r4 = (com.dena.mirrativ.streaming.CastService) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L98
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                com.dena.mirrativ.streaming.CastService r10 = com.dena.mirrativ.streaming.CastService.this
                nf.c r10 = com.dena.mirrativ.streaming.CastService.B(r10)
                wo.x r3 = r10.G0()
                com.dena.mirrativ.streaming.CastService r10 = com.dena.mirrativ.streaming.CastService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L98
                r4 = r10
                r10 = r9
            L3d:
                r10.f22860w = r4     // Catch: java.lang.Throwable -> L98
                r10.f22861x = r3     // Catch: java.lang.Throwable -> L98
                r10.f22862y = r1     // Catch: java.lang.Throwable -> L98
                r10.f22863z = r2     // Catch: java.lang.Throwable -> L98
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L98
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L95
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L95
                if (r10 == 0) goto L8f
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L95
                wn.k r10 = (wn.k) r10     // Catch: java.lang.Throwable -> L95
                java.lang.Object r6 = r10.a()     // Catch: java.lang.Throwable -> L95
                java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L95
                java.lang.Object r10 = r10.b()     // Catch: java.lang.Throwable -> L95
                java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Throwable -> L95
                int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L95
                com.dena.mirrorman.webrtc.RTCManager r7 = com.dena.mirrativ.streaming.CastService.X(r5)     // Catch: java.lang.Throwable -> L95
                if (r7 == 0) goto L89
                java.util.HashMap r7 = r7.getClients()     // Catch: java.lang.Throwable -> L95
                if (r7 == 0) goto L89
                java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Throwable -> L95
                com.dena.mirrorman.webrtc.RTCClient r6 = (com.dena.mirrorman.webrtc.RTCClient) r6     // Catch: java.lang.Throwable -> L95
                if (r6 == 0) goto L89
                r6.changeVolume(r10)     // Catch: java.lang.Throwable -> L95
            L89:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L8f:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L95:
                r10 = move-exception
                r3 = r4
                goto L99
            L98:
                r10 = move-exception
            L99:
                throw r10     // Catch: java.lang.Throwable -> L9a
            L9a:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.m0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class m1 extends jo.q implements io.a<hf.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22864w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22865x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22866y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22864w = componentCallbacks;
            this.f22865x = aVar;
            this.f22866y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final hf.v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f22864w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.v0.class), this.f22865x, this.f22866y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends BroadcastReceiver {
        public n() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            jo.p.h(context, "context");
            jo.p.h(intent, "intent");
            if (of.n.f45411a.m(context)) {
                CastService.this.b2(xb.r.C2, true);
                CastService.j2(CastService.this, false, 1, null);
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$on$6", f = "CastService.kt", l = {847}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22868w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l.p f22870y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(l.p pVar, ao.d<? super n0> dVar) {
            super(2, dVar);
            this.f22870y = pVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new n0(this.f22870y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((n0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22868w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f22868w = 1;
                if (uo.b1.a(1500L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            CastService.this.u(this.f22870y.a().getUserId(), CollabType.LIVE, true);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n1 extends jo.q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22871w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22872x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22873y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22871w = componentCallbacks;
            this.f22872x = aVar;
            this.f22873y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f22871w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRRequest.class), this.f22872x, this.f22873y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<MediaProjectionManager> {
        public o() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final MediaProjectionManager invoke() {
            Object systemService = CastService.this.getApplicationContext().getSystemService("media_projection");
            jo.p.f(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
            return (MediaProjectionManager) systemService;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o0 extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f22876x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(String str) {
            super(0);
            this.f22876x = str;
        }

        public final void a() {
            od.a M0 = CastService.this.M0();
            String Y0 = CastService.this.Y0();
            String str = this.f22876x;
            String p10 = CastService.this.q1().p();
            jo.p.e(p10);
            M0.e(Y0, str, p10, Referer.BROADCAST);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o1 extends jo.q implements io.a<nf.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22877w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22878x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22879y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22877w = componentCallbacks;
            this.f22878x = aVar;
            this.f22879y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.z, java.lang.Object] */
        @Override // io.a
        public final nf.z invoke() {
            ComponentCallbacks componentCallbacks = this.f22877w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.z.class), this.f22878x, this.f22879y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$10", f = "CastService.kt", l = {3157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22880w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22881x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22882y;

        /* renamed from: z  reason: collision with root package name */
        public int f22883z;

        public p(ao.d<? super p> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new p(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((p) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x0176, TryCatch #0 {all -> 0x0176, blocks: (B:16:0x0053, B:18:0x005c, B:20:0x0069, B:25:0x0074, B:26:0x007c, B:28:0x0082, B:32:0x0091, B:34:0x0095, B:35:0x009e, B:37:0x00b8, B:38:0x00ce, B:40:0x00d4, B:41:0x00ea, B:42:0x00f3, B:44:0x00f9, B:46:0x010f, B:47:0x0113, B:48:0x0117, B:50:0x011d, B:52:0x0129, B:53:0x012d, B:55:0x0137), top: B:66:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0170  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:66:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 384
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$onCreate$2", f = "CastService.kt", l = {446}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public Object A;
        public int B;
        public final /* synthetic */ NotificationManager C;
        public final /* synthetic */ jo.a0 D;
        public final /* synthetic */ CastService E;

        /* renamed from: w  reason: collision with root package name */
        public int f22884w;

        /* renamed from: x  reason: collision with root package name */
        public int f22885x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22886y;

        /* renamed from: z  reason: collision with root package name */
        public Object f22887z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(NotificationManager notificationManager, jo.a0 a0Var, CastService castService, ao.d<? super p0> dVar) {
            super(2, dVar);
            this.C = notificationManager;
            this.D = a0Var;
            this.E = castService;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new p0(this.C, this.D, this.E, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((p0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:19:0x007c). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r10.B
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                int r1 = r10.f22885x
                int r3 = r10.f22884w
                java.lang.Object r4 = r10.A
                com.dena.mirrativ.streaming.CastService r4 = (com.dena.mirrativ.streaming.CastService) r4
                java.lang.Object r5 = r10.f22887z
                jo.a0 r5 = (jo.a0) r5
                java.lang.Object r6 = r10.f22886y
                android.app.NotificationManager r6 = (android.app.NotificationManager) r6
                wn.m.b(r11)
                r11 = r10
                goto L7c
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                wn.m.b(r11)
                r11 = 2147483647(0x7fffffff, float:NaN)
                android.app.NotificationManager r1 = r10.C
                jo.a0 r3 = r10.D
                com.dena.mirrativ.streaming.CastService r4 = r10.E
                r5 = 0
                r6 = r1
                r1 = r5
                r5 = r3
                r3 = r11
                r11 = r10
            L3a:
                if (r1 >= r3) goto L7e
                boolean r7 = r6.isNotificationPolicyAccessGranted()
                boolean r8 = r5.f38125w
                if (r8 == r7) goto L65
                if (r7 == 0) goto L52
                kf.t r8 = com.dena.mirrativ.streaming.CastService.Y(r4)
                int r9 = com.dena.mirrativ.streaming.CastService.d0(r4)
                r8.I4(r9)
                goto L59
            L52:
                kf.r r8 = com.dena.mirrativ.streaming.CastService.W(r4)
                r8.d()
            L59:
                dq.c r8 = dq.c.c()
                nd.l r9 = new nd.l
                r9.<init>()
                r8.l(r9)
            L65:
                r5.f38125w = r7
                r7 = 1000(0x3e8, double:4.94E-321)
                r11.f22886y = r6
                r11.f22887z = r5
                r11.A = r4
                r11.f22884w = r3
                r11.f22885x = r1
                r11.B = r2
                java.lang.Object r7 = uo.b1.a(r7, r11)
                if (r7 != r0) goto L7c
                return r0
            L7c:
                int r1 = r1 + r2
                goto L3a
            L7e:
                wn.v r11 = wn.v.f59242a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.p0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class p1 extends jo.q implements io.a<kf.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22888w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22889x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22890y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22888w = componentCallbacks;
            this.f22889x = aVar;
            this.f22890y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kf.r] */
        @Override // io.a
        public final kf.r invoke() {
            ComponentCallbacks componentCallbacks = this.f22888w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.r.class), this.f22889x, this.f22890y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$11", f = "CastService.kt", l = {3157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class q extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22891w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22892x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22893y;

        /* renamed from: z  reason: collision with root package name */
        public int f22894z;

        public q(ao.d<? super q> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new q(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((q) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x009b, TryCatch #1 {all -> 0x009b, blocks: (B:17:0x0054, B:19:0x005c, B:22:0x0065, B:24:0x006c, B:28:0x0075), top: B:41:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r11.f22894z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r11.f22893y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r11.f22892x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r11.f22891w
                com.dena.mirrativ.streaming.CastService r4 = (com.dena.mirrativ.streaming.CastService) r4
                wn.m.b(r12)     // Catch: java.lang.Throwable -> L9e
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r11
                goto L53
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                wn.m.b(r12)
                com.dena.mirrativ.streaming.CastService r12 = com.dena.mirrativ.streaming.CastService.this
                nf.h r12 = com.dena.mirrativ.streaming.CastService.D(r12)
                wo.x r3 = r12.r()
                com.dena.mirrativ.streaming.CastService r12 = com.dena.mirrativ.streaming.CastService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L9e
                r4 = r12
                r12 = r11
            L3d:
                r12.f22891w = r4     // Catch: java.lang.Throwable -> L9e
                r12.f22892x = r3     // Catch: java.lang.Throwable -> L9e
                r12.f22893y = r1     // Catch: java.lang.Throwable -> L9e
                r12.f22894z = r2     // Catch: java.lang.Throwable -> L9e
                java.lang.Object r5 = r1.a(r12)     // Catch: java.lang.Throwable -> L9e
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r10 = r0
                r0 = r12
                r12 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r10
            L53:
                r6 = 0
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L9b
                boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L9b
                if (r12 == 0) goto L95
                java.lang.Object r12 = r3.next()     // Catch: java.lang.Throwable -> L9b
                jf.h r12 = (jf.h) r12     // Catch: java.lang.Throwable -> L9b
                if (r12 != 0) goto L65
                goto L8f
            L65:
                com.dena.mirrorman.webrtc.RTCManager r6 = com.dena.mirrativ.streaming.CastService.X(r5)     // Catch: java.lang.Throwable -> L9b
                r7 = 0
                if (r6 == 0) goto L73
                boolean r6 = r6.hasClients()     // Catch: java.lang.Throwable -> L9b
                if (r6 != r2) goto L73
                r7 = r2
            L73:
                if (r7 != 0) goto L8f
                android.content.Context r6 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L9b
                com.dena.mirrorman.service.CollabService$a r7 = com.dena.mirrorman.service.CollabService.G     // Catch: java.lang.Throwable -> L9b
                android.content.Context r8 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L9b
                java.lang.String r9 = "applicationContext"
                jo.p.g(r8, r9)     // Catch: java.lang.Throwable -> L9b
                java.lang.String r12 = r12.b()     // Catch: java.lang.Throwable -> L9b
                android.content.Intent r12 = r7.a(r8, r12)     // Catch: java.lang.Throwable -> L9b
                c3.a.n(r6, r12)     // Catch: java.lang.Throwable -> L9b
            L8f:
                r12 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L95:
                wo.n.a(r4, r6)
                wn.v r12 = wn.v.f59242a
                return r12
            L9b:
                r12 = move-exception
                r3 = r4
                goto L9f
            L9e:
                r12 = move-exception
            L9f:
                throw r12     // Catch: java.lang.Throwable -> La0
            La0:
                r0 = move-exception
                wo.n.a(r3, r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class q0 extends jo.q implements io.l<LinkedLive, wn.v> {
        public q0() {
            super(1);
        }

        public final void a(LinkedLive linkedLive) {
            CastService.this.r2(linkedLive);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(LinkedLive linkedLive) {
            a(linkedLive);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class q1 extends jo.q implements io.a<kf.t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22896w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22897x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22898y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22896w = componentCallbacks;
            this.f22897x = aVar;
            this.f22898y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.t, java.lang.Object] */
        @Override // io.a
        public final kf.t invoke() {
            ComponentCallbacks componentCallbacks = this.f22896w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.t.class), this.f22897x, this.f22898y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$12", f = "CastService.kt", l = {3157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class r extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22899w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22900x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22901y;

        /* renamed from: z  reason: collision with root package name */
        public int f22902z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #0 {all -> 0x0079, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22902z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22901y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22900x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22899w
                com.dena.mirrativ.streaming.CastService r4 = (com.dena.mirrativ.streaming.CastService) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L7c
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L53
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                wn.m.b(r9)
                com.dena.mirrativ.streaming.CastService r9 = com.dena.mirrativ.streaming.CastService.this
                nf.c r9 = com.dena.mirrativ.streaming.CastService.B(r9)
                wo.x r3 = r9.r0()
                com.dena.mirrativ.streaming.CastService r9 = com.dena.mirrativ.streaming.CastService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7c
                r4 = r9
                r9 = r8
            L3d:
                r9.f22899w = r4     // Catch: java.lang.Throwable -> L7c
                r9.f22900x = r3     // Catch: java.lang.Throwable -> L7c
                r9.f22901y = r1     // Catch: java.lang.Throwable -> L7c
                r9.f22902z = r2     // Catch: java.lang.Throwable -> L7c
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L7c
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L53:
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L79
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L79
                if (r9 == 0) goto L73
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L79
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L79
                java.lang.String r9 = com.dena.mirrativ.streaming.CastService.L(r5)     // Catch: java.lang.Throwable -> L79
                r6 = 0
                com.dena.mirrativ.streaming.CastService.x(r5, r9, r6)     // Catch: java.lang.Throwable -> L79
                r5.stopSelf()     // Catch: java.lang.Throwable -> L79
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L73:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L79:
                r9 = move-exception
                r3 = r4
                goto L7d
            L7c:
                r9 = move-exception
            L7d:
                throw r9     // Catch: java.lang.Throwable -> L7e
            L7e:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class r0 extends jo.q implements io.a<wn.v> {
        public r0() {
            super(0);
        }

        public final void a() {
            CastService.this.W1();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class r1 extends jo.q implements io.a<nd.i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22904w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22905x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22906y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22904w = componentCallbacks;
            this.f22905x = aVar;
            this.f22906y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final nd.i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f22904w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nd.i1.class), this.f22905x, this.f22906y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$13", f = "CastService.kt", l = {3157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class s extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22907w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22908x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22909y;

        /* renamed from: z  reason: collision with root package name */
        public int f22910z;

        public s(ao.d<? super s> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new s(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((s) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22910z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22909y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22908x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22907w
                com.dena.mirrativ.streaming.CastService r4 = (com.dena.mirrativ.streaming.CastService) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L74
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L53
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                wn.m.b(r9)
                com.dena.mirrativ.streaming.CastService r9 = com.dena.mirrativ.streaming.CastService.this
                nf.c r9 = com.dena.mirrativ.streaming.CastService.B(r9)
                wo.x r3 = r9.v0()
                com.dena.mirrativ.streaming.CastService r9 = com.dena.mirrativ.streaming.CastService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f22907w = r4     // Catch: java.lang.Throwable -> L74
                r9.f22908x = r3     // Catch: java.lang.Throwable -> L74
                r9.f22909y = r1     // Catch: java.lang.Throwable -> L74
                r9.f22910z = r2     // Catch: java.lang.Throwable -> L74
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L74
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L53:
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
                if (r9 == 0) goto L6b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L71
                java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.streaming.CastService.w0(r5, r9)     // Catch: java.lang.Throwable -> L71
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L71:
                r9 = move-exception
                r3 = r4
                goto L75
            L74:
                r9 = move-exception
            L75:
                throw r9     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$onEvent$3", f = "CastService.kt", l = {1440}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class s0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22911w;

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
            int i10 = this.f22911w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f22911w = 1;
                if (uo.b1.a(100L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            xb.h0 h0Var = CastService.this.V0;
            if (h0Var != null) {
                h0Var.i();
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class s1 extends jo.q implements io.a<nd.j1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22913w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22914x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22915y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22913w = componentCallbacks;
            this.f22914x = aVar;
            this.f22915y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nd.j1, java.lang.Object] */
        @Override // io.a
        public final nd.j1 invoke() {
            ComponentCallbacks componentCallbacks = this.f22913w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nd.j1.class), this.f22914x, this.f22915y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$14", f = "CastService.kt", l = {3157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class t extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22916w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22917x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22918y;

        /* renamed from: z  reason: collision with root package name */
        public int f22919z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #1 {all -> 0x007c, blocks: (B:17:0x0054, B:19:0x005c), top: B:32:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22919z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22918y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22917x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22916w
                com.dena.mirrativ.streaming.CastService r4 = (com.dena.mirrativ.streaming.CastService) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L7f
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L53
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                wn.m.b(r9)
                com.dena.mirrativ.streaming.CastService r9 = com.dena.mirrativ.streaming.CastService.this
                nf.c r9 = com.dena.mirrativ.streaming.CastService.B(r9)
                wo.x r3 = r9.q0()
                com.dena.mirrativ.streaming.CastService r9 = com.dena.mirrativ.streaming.CastService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7f
                r4 = r9
                r9 = r8
            L3d:
                r9.f22916w = r4     // Catch: java.lang.Throwable -> L7f
                r9.f22917x = r3     // Catch: java.lang.Throwable -> L7f
                r9.f22918y = r1     // Catch: java.lang.Throwable -> L7f
                r9.f22919z = r2     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L7f
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L53:
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L7c
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L7c
                if (r9 == 0) goto L76
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L7c
                com.dena.mirrativ.mirrativapi.core.MRError r9 = (com.dena.mirrativ.mirrativapi.core.MRError) r9     // Catch: java.lang.Throwable -> L7c
                com.dena.mirrativ.streaming.CastService.q0(r5, r9)     // Catch: java.lang.Throwable -> L7c
                java.lang.String r9 = com.dena.mirrativ.streaming.CastService.L(r5)     // Catch: java.lang.Throwable -> L7c
                r6 = 0
                com.dena.mirrativ.streaming.CastService.x(r5, r9, r6)     // Catch: java.lang.Throwable -> L7c
                r5.stopSelf()     // Catch: java.lang.Throwable -> L7c
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L76:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L7c:
                r9 = move-exception
                r3 = r4
                goto L80
            L7f:
                r9 = move-exception
            L80:
                throw r9     // Catch: java.lang.Throwable -> L81
            L81:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.t.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$postHeartbeat$3", f = "CastService.kt", l = {2113}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class t0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ jo.e0<Integer> A;
        public final /* synthetic */ jo.e0<Integer> B;
        public final /* synthetic */ jo.e0<Integer> C;
        public final /* synthetic */ Runnable D;
        public final /* synthetic */ long E;

        /* renamed from: w  reason: collision with root package name */
        public Object f22920w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22921x;

        /* renamed from: y  reason: collision with root package name */
        public int f22922y;

        /* loaded from: classes2.dex */
        public static final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return zn.a.c(Long.valueOf(((UsageStats) t11).getLastTimeUsed()), Long.valueOf(((UsageStats) t10).getLastTimeUsed()));
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends jo.q implements io.l<UsageStats, CharSequence> {

            /* renamed from: w  reason: collision with root package name */
            public static final b f22924w = new b();

            public b() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final CharSequence invoke(UsageStats usageStats) {
                jo.p.h(usageStats, "it");
                String packageName = usageStats.getPackageName();
                jo.p.g(packageName, "it.packageName");
                return packageName;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(jo.e0<Integer> e0Var, jo.e0<Integer> e0Var2, jo.e0<Integer> e0Var3, Runnable runnable, long j10, ao.d<? super t0> dVar) {
            super(2, dVar);
            this.A = e0Var;
            this.B = e0Var2;
            this.C = e0Var3;
            this.D = runnable;
            this.E = j10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new t0(this.A, this.B, this.C, this.D, this.E, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((t0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x025f  */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0270  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0255  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0257  */
        /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v8, types: [com.dena.mirrorman.net.retrofit.MRRequest] */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v2, types: [com.dena.mirrativ.streaming.CastService$t0] */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v6 */
        /* JADX WARN: Type inference failed for: r5v7, types: [int] */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Type inference failed for: r5v9 */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 646
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.t0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class t1 extends jo.q implements io.a<nf.i0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22925w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22926x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22927y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22925w = componentCallbacks;
            this.f22926x = aVar;
            this.f22927y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.i0, java.lang.Object] */
        @Override // io.a
        public final nf.i0 invoke() {
            ComponentCallbacks componentCallbacks = this.f22925w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.i0.class), this.f22926x, this.f22927y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$15", f = "CastService.kt", l = {3157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class u extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22928w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22929x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22930y;

        /* renamed from: z  reason: collision with root package name */
        public int f22931z;

        public u(ao.d<? super u> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new u(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((u) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:17:0x0053, B:19:0x005b, B:21:0x0063, B:23:0x0071, B:25:0x0077), top: B:36:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0052). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r14.f22931z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r14.f22930y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r14.f22929x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r14.f22928w
                com.dena.mirrativ.streaming.CastService r4 = (com.dena.mirrativ.streaming.CastService) r4
                wn.m.b(r15)     // Catch: java.lang.Throwable -> La8
                r12 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r14
                goto L52
            L20:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L28:
                wn.m.b(r15)
                com.dena.mirrativ.streaming.CastService r15 = com.dena.mirrativ.streaming.CastService.this
                nf.h r15 = com.dena.mirrativ.streaming.CastService.D(r15)
                wo.x r3 = r15.z()
                com.dena.mirrativ.streaming.CastService r15 = com.dena.mirrativ.streaming.CastService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> La8
                r4 = r15
                r15 = r14
            L3d:
                r15.f22928w = r4     // Catch: java.lang.Throwable -> La8
                r15.f22929x = r3     // Catch: java.lang.Throwable -> La8
                r15.f22930y = r1     // Catch: java.lang.Throwable -> La8
                r15.f22931z = r2     // Catch: java.lang.Throwable -> La8
                java.lang.Object r5 = r1.a(r15)     // Catch: java.lang.Throwable -> La8
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r12 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r15
                r15 = r5
            L52:
                r5 = 0
                java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.lang.Throwable -> La5
                boolean r15 = r15.booleanValue()     // Catch: java.lang.Throwable -> La5
                if (r15 == 0) goto L9f
                java.lang.Object r15 = r3.next()     // Catch: java.lang.Throwable -> La5
                jf.p0 r15 = (jf.p0) r15     // Catch: java.lang.Throwable -> La5
                if (r15 == 0) goto L99
                nd.i1 r5 = com.dena.mirrativ.streaming.CastService.Z(r12)     // Catch: java.lang.Throwable -> La5
                ye.a r5 = r5.a()     // Catch: java.lang.Throwable -> La5
                boolean r5 = r5.e()     // Catch: java.lang.Throwable -> La5
                if (r5 == 0) goto L99
                ec.z r13 = com.dena.mirrativ.streaming.CastService.P(r12)     // Catch: java.lang.Throwable -> La5
                if (r13 == 0) goto L99
                ud.g4$a r5 = ud.g4.f54968j     // Catch: java.lang.Throwable -> La5
                java.lang.String r7 = com.dena.mirrativ.streaming.CastService.L(r12)     // Catch: java.lang.Throwable -> La5
                int r6 = xb.r.S     // Catch: java.lang.Throwable -> La5
                java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La5
                r9 = 0
                r8[r9] = r15     // Catch: java.lang.Throwable -> La5
                java.lang.String r8 = r12.getString(r6, r8)     // Catch: java.lang.Throwable -> La5
                java.lang.String r15 = "getString(R.string.text_…b_disconnected_title, it)"
                jo.p.g(r8, r15)     // Catch: java.lang.Throwable -> La5
                r9 = 0
                r10 = 8
                r11 = 0
                r6 = r12
                ud.g4 r15 = ud.g4.a.b(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> La5
                r13.k0(r15)     // Catch: java.lang.Throwable -> La5
            L99:
                r15 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r12
                goto L3d
            L9f:
                wo.n.a(r4, r5)
                wn.v r15 = wn.v.f59242a
                return r15
            La5:
                r15 = move-exception
                r3 = r4
                goto La9
            La8:
                r15 = move-exception
            La9:
                throw r15     // Catch: java.lang.Throwable -> Laa
            Laa:
                r0 = move-exception
                wo.n.a(r3, r15)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.u.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class u0 extends jo.q implements io.l<fa.b, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final u0 f22932w = new u0();

        public u0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(fa.b bVar) {
            jo.p.h(bVar, "it");
            return Boolean.valueOf(!(bVar instanceof fa.a));
        }
    }

    /* loaded from: classes2.dex */
    public static final class u1 extends jo.q implements io.a<ef.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22933w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22934x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22935y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22933w = componentCallbacks;
            this.f22934x = aVar;
            this.f22935y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ef.a] */
        @Override // io.a
        public final ef.a invoke() {
            ComponentCallbacks componentCallbacks = this.f22933w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(ef.a.class), this.f22934x, this.f22935y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$16", f = "CastService.kt", l = {3157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class v extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22936w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22937x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22938y;

        /* renamed from: z  reason: collision with root package name */
        public int f22939z;

        public v(ao.d<? super v> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new v(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((v) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {all -> 0x0075, blocks: (B:16:0x0053, B:18:0x005c), top: B:29:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:29:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22939z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22938y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22937x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22936w
                com.dena.mirrativ.streaming.CastService r4 = (com.dena.mirrativ.streaming.CastService) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L78
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L53
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                wn.m.b(r9)
                com.dena.mirrativ.streaming.CastService r9 = com.dena.mirrativ.streaming.CastService.this
                nf.h r9 = com.dena.mirrativ.streaming.CastService.D(r9)
                wo.x r3 = r9.A()
                com.dena.mirrativ.streaming.CastService r9 = com.dena.mirrativ.streaming.CastService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L78
                r4 = r9
                r9 = r8
            L3d:
                r9.f22936w = r4     // Catch: java.lang.Throwable -> L78
                r9.f22937x = r3     // Catch: java.lang.Throwable -> L78
                r9.f22938y = r1     // Catch: java.lang.Throwable -> L78
                r9.f22939z = r2     // Catch: java.lang.Throwable -> L78
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L78
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L53:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L75
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L75
                r6 = 0
                if (r9 == 0) goto L6f
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L75
                com.dena.mirrativ.mirrativapi.core.MRError r9 = (com.dena.mirrativ.mirrativapi.core.MRError) r9     // Catch: java.lang.Throwable -> L75
                com.dena.mirrativ.streaming.CastService.p0(r5, r9)     // Catch: java.lang.Throwable -> L75
                r9 = 0
                com.dena.mirrativ.streaming.CastService.j2(r5, r9, r2, r6)     // Catch: java.lang.Throwable -> L75
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6f:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L75:
                r9 = move-exception
                r3 = r4
                goto L79
            L78:
                r9 = move-exception
            L79:
                throw r9     // Catch: java.lang.Throwable -> L7a
            L7a:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$sendStartCollab$1", f = "CastService.kt", l = {2333, 2340}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class v0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22940w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f22942y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f22943z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(String str, boolean z10, ao.d<? super v0> dVar) {
            super(2, dVar);
            this.f22942y = str;
            this.f22943z = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new v0(this.f22942y, this.f22943z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((v0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22940w;
            try {
            } catch (Exception e10) {
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.Maintenance ? true : jo.p.c(error, MRError.ForceUpdate.INSTANCE)) {
                    of.n.f45411a.l(CastService.this.getApplicationContext(), error);
                } else {
                    CastService.this.Q1(error);
                }
            }
            if (i10 == 0) {
                wn.m.b(obj);
                MRRequest l12 = CastService.this.l1();
                String Y0 = CastService.this.Y0();
                String str = this.f22942y;
                int i11 = this.f22943z ? 1 : 0;
                this.f22940w = 1;
                if (l12.postCollabStart(Referer.BROADCAST, Y0, str, i11, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    wn.m.b(obj);
                    CastService.this.P0().j(CastService.this.Y0(), false);
                    return wn.v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            this.f22940w = 2;
            if (uo.b1.a(1000L, this) == c10) {
                return c10;
            }
            CastService.this.P0().j(CastService.this.Y0(), false);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class v1 extends jo.q implements io.a<hf.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22944w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22945x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22946y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22944w = componentCallbacks;
            this.f22945x = aVar;
            this.f22946y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.u0, java.lang.Object] */
        @Override // io.a
        public final hf.u0 invoke() {
            ComponentCallbacks componentCallbacks = this.f22944w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.u0.class), this.f22945x, this.f22946y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$17", f = "CastService.kt", l = {3157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class w extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22947w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22948x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22949y;

        /* renamed from: z  reason: collision with root package name */
        public int f22950z;

        public w(ao.d<? super w> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new w(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((w) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {all -> 0x0075, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22950z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22949y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22948x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22947w
                com.dena.mirrativ.streaming.CastService r4 = (com.dena.mirrativ.streaming.CastService) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L78
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L53
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                wn.m.b(r9)
                com.dena.mirrativ.streaming.CastService r9 = com.dena.mirrativ.streaming.CastService.this
                nf.h r9 = com.dena.mirrativ.streaming.CastService.D(r9)
                wo.x r3 = r9.v()
                com.dena.mirrativ.streaming.CastService r9 = com.dena.mirrativ.streaming.CastService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L78
                r4 = r9
                r9 = r8
            L3d:
                r9.f22947w = r4     // Catch: java.lang.Throwable -> L78
                r9.f22948x = r3     // Catch: java.lang.Throwable -> L78
                r9.f22949y = r1     // Catch: java.lang.Throwable -> L78
                r9.f22950z = r2     // Catch: java.lang.Throwable -> L78
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L78
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L53:
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L75
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L75
                if (r9 == 0) goto L6f
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L75
                java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L75
                od.b r6 = com.dena.mirrativ.streaming.CastService.A(r5)     // Catch: java.lang.Throwable -> L75
                r6.f(r9)     // Catch: java.lang.Throwable -> L75
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6f:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L75:
                r9 = move-exception
                r3 = r4
                goto L79
            L78:
                r9 = move-exception
            L79:
                throw r9     // Catch: java.lang.Throwable -> L7a
            L7a:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.w.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$setEventBanner$1", f = "CastService.kt", l = {2362}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class w0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22951w;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.l<Integer, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EventNoticeResponse f22953w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ CastService f22954x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EventNoticeResponse eventNoticeResponse, CastService castService) {
                super(1);
                this.f22953w = eventNoticeResponse;
                this.f22954x = castService;
            }

            public final void a(int i10) {
                EventBannerResponse eventBannerResponse = this.f22953w.getBanners().get(i10);
                o4 a10 = o4.f55293o.a(this.f22954x.Y0(), eventBannerResponse);
                Puree.d(new EventBannerLog(EventBannerActionType.EVENT_BANNER_IMP, nd.c.Companion.a(eventBannerResponse.getType()).e(), eventBannerResponse.getTitle(), EventBannerWhere.CAST_COMMENT_LIST, this.f22954x.Y0(), null, 32, null));
                this.f22954x.X1(a10);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
                a(num.intValue());
                return wn.v.f59242a;
            }
        }

        public w0(ao.d<? super w0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new w0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((w0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            EventNoticeResponse eventNoticeResponse;
            Object c10 = bo.c.c();
            int i10 = this.f22951w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest l12 = CastService.this.l1();
                    this.f22951w = 1;
                    obj = MRRequest.DefaultImpls.getEventNotice$default(l12, 3, null, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                eventNoticeResponse = (EventNoticeResponse) obj;
            } catch (Throwable unused) {
            }
            if (eventNoticeResponse.getBanners().isEmpty()) {
                return wn.v.f59242a;
            }
            CastService.this.f22719p0 = new te.b(eventNoticeResponse.getBanners().size(), eventNoticeResponse.getDisplayTiming(), new a(eventNoticeResponse, CastService.this));
            te.b bVar = CastService.this.f22719p0;
            if (bVar != null) {
                bVar.i();
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class w1 extends jo.q implements io.a<od.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22955w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22956x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22957y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22955w = componentCallbacks;
            this.f22956x = aVar;
            this.f22957y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.b] */
        @Override // io.a
        public final od.b invoke() {
            ComponentCallbacks componentCallbacks = this.f22955w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.b.class), this.f22956x, this.f22957y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$18", f = "CastService.kt", l = {3157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class x extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22958w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22959x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22960y;

        /* renamed from: z  reason: collision with root package name */
        public int f22961z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {all -> 0x0075, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22961z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22960y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22959x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22958w
                com.dena.mirrativ.streaming.CastService r4 = (com.dena.mirrativ.streaming.CastService) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L78
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L53
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                wn.m.b(r9)
                com.dena.mirrativ.streaming.CastService r9 = com.dena.mirrativ.streaming.CastService.this
                nf.h r9 = com.dena.mirrativ.streaming.CastService.D(r9)
                wo.x r3 = r9.x()
                com.dena.mirrativ.streaming.CastService r9 = com.dena.mirrativ.streaming.CastService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L78
                r4 = r9
                r9 = r8
            L3d:
                r9.f22958w = r4     // Catch: java.lang.Throwable -> L78
                r9.f22959x = r3     // Catch: java.lang.Throwable -> L78
                r9.f22960y = r1     // Catch: java.lang.Throwable -> L78
                r9.f22961z = r2     // Catch: java.lang.Throwable -> L78
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L78
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L53:
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L75
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L75
                if (r9 == 0) goto L6f
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L75
                java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L75
                od.b r6 = com.dena.mirrativ.streaming.CastService.A(r5)     // Catch: java.lang.Throwable -> L75
                r6.L(r9)     // Catch: java.lang.Throwable -> L75
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6f:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L75:
                r9 = move-exception
                r3 = r4
                goto L79
            L78:
                r9 = move-exception
            L79:
                throw r9     // Catch: java.lang.Throwable -> L7a
            L7a:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.x.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$showErrorMessage$1", f = "CastService.kt", l = {3157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class x0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22962w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22963x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22964y;

        /* renamed from: z  reason: collision with root package name */
        public int f22965z;

        public x0(ao.d<? super x0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new x0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((x0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00af, TryCatch #2 {all -> 0x00af, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x007b, B:23:0x0087), top: B:38:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r10.f22965z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f22964y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f22963x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f22962w
                com.dena.mirrativ.streaming.CastService r4 = (com.dena.mirrativ.streaming.CastService) r4
                wn.m.b(r11)     // Catch: java.lang.Throwable -> Lb2
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto L53
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                wn.m.b(r11)
                com.dena.mirrativ.streaming.CastService r11 = com.dena.mirrativ.streaming.CastService.this
                nf.c r11 = com.dena.mirrativ.streaming.CastService.B(r11)
                wo.x r3 = r11.M0()
                com.dena.mirrativ.streaming.CastService r11 = com.dena.mirrativ.streaming.CastService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lb2
                r4 = r11
                r11 = r10
            L3d:
                r11.f22962w = r4     // Catch: java.lang.Throwable -> Lb2
                r11.f22963x = r3     // Catch: java.lang.Throwable -> Lb2
                r11.f22964y = r1     // Catch: java.lang.Throwable -> Lb2
                r11.f22965z = r2     // Catch: java.lang.Throwable -> Lb2
                java.lang.Object r5 = r1.a(r11)     // Catch: java.lang.Throwable -> Lb2
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r9 = r0
                r0 = r11
                r11 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r9
            L53:
                r6 = 0
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> Laf
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> Laf
                if (r11 == 0) goto La9
                java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> Laf
                wn.k r11 = (wn.k) r11     // Catch: java.lang.Throwable -> Laf
                java.lang.Object r6 = r11.c()     // Catch: java.lang.Throwable -> Laf
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> Laf
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> Laf
                com.dena.mirrativ.streaming.CastService.C0(r5, r6)     // Catch: java.lang.Throwable -> Laf
                java.lang.Object r6 = r11.c()     // Catch: java.lang.Throwable -> Laf
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> Laf
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> Laf
                if (r6 != 0) goto La3
                java.lang.Object r11 = r11.d()     // Catch: java.lang.Throwable -> Laf
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> Laf
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> Laf
                if (r11 == 0) goto La3
                fa.c r11 = com.dena.mirrativ.streaming.CastService.H(r5)     // Catch: java.lang.Throwable -> Laf
                fa.a r6 = new fa.a     // Catch: java.lang.Throwable -> Laf
                android.content.res.Resources r7 = r5.getResources()     // Catch: java.lang.Throwable -> Laf
                int r8 = xb.r.text_restart_screen_share     // Catch: java.lang.Throwable -> Laf
                java.lang.String r7 = r7.getString(r8)     // Catch: java.lang.Throwable -> Laf
                java.lang.String r8 = "resources.getString(R.st…ext_restart_screen_share)"
                jo.p.g(r7, r8)     // Catch: java.lang.Throwable -> Laf
                r8 = 0
                r6.<init>(r5, r7, r8)     // Catch: java.lang.Throwable -> Laf
                r11.a(r6)     // Catch: java.lang.Throwable -> Laf
            La3:
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            La9:
                wo.n.a(r4, r6)
                wn.v r11 = wn.v.f59242a
                return r11
            Laf:
                r11 = move-exception
                r3 = r4
                goto Lb3
            Lb2:
                r11 = move-exception
            Lb3:
                throw r11     // Catch: java.lang.Throwable -> Lb4
            Lb4:
                r0 = move-exception
                wo.n.a(r3, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.x0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class x1 extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22966w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22967x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22968y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22966w = componentCallbacks;
            this.f22967x = aVar;
            this.f22968y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f22966w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f22967x, this.f22968y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$19", f = "CastService.kt", l = {2007}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class y extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22969w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ CastService f22971w;

            public a(CastService castService) {
                this.f22971w = castService;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                this.f22971w.Q1(mRError);
                return wn.v.f59242a;
            }
        }

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
            int i10 = this.f22969w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<MRError> X = CastService.this.O0().X();
                a aVar = new a(CastService.this);
                this.f22969w = 1;
                if (X.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.CastService$showErrorMessage$2", f = "CastService.kt", l = {3157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class y0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22972w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22973x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22974y;

        /* renamed from: z  reason: collision with root package name */
        public int f22975z;

        public y0(ao.d<? super y0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new y0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((y0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0078, B:23:0x007e, B:25:0x0086), top: B:36:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f22975z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f22974y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f22973x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f22972w
                com.dena.mirrativ.streaming.CastService r4 = (com.dena.mirrativ.streaming.CastService) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L98
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                com.dena.mirrativ.streaming.CastService r10 = com.dena.mirrativ.streaming.CastService.this
                nf.c r10 = com.dena.mirrativ.streaming.CastService.B(r10)
                wo.x r3 = r10.G0()
                com.dena.mirrativ.streaming.CastService r10 = com.dena.mirrativ.streaming.CastService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L98
                r4 = r10
                r10 = r9
            L3d:
                r10.f22972w = r4     // Catch: java.lang.Throwable -> L98
                r10.f22973x = r3     // Catch: java.lang.Throwable -> L98
                r10.f22974y = r1     // Catch: java.lang.Throwable -> L98
                r10.f22975z = r2     // Catch: java.lang.Throwable -> L98
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L98
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L95
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L95
                if (r10 == 0) goto L8f
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L95
                wn.k r10 = (wn.k) r10     // Catch: java.lang.Throwable -> L95
                java.lang.Object r6 = r10.a()     // Catch: java.lang.Throwable -> L95
                java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L95
                java.lang.Object r10 = r10.b()     // Catch: java.lang.Throwable -> L95
                java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Throwable -> L95
                int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L95
                com.dena.mirrorman.webrtc.RTCManager r7 = com.dena.mirrativ.streaming.CastService.X(r5)     // Catch: java.lang.Throwable -> L95
                if (r7 == 0) goto L89
                java.util.HashMap r7 = r7.getClients()     // Catch: java.lang.Throwable -> L95
                if (r7 == 0) goto L89
                java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Throwable -> L95
                com.dena.mirrorman.webrtc.RTCClient r6 = (com.dena.mirrorman.webrtc.RTCClient) r6     // Catch: java.lang.Throwable -> L95
                if (r6 == 0) goto L89
                r6.changeVolume(r10)     // Catch: java.lang.Throwable -> L95
            L89:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L8f:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L95:
                r10 = move-exception
                r3 = r4
                goto L99
            L98:
                r10 = move-exception
            L99:
                throw r10     // Catch: java.lang.Throwable -> L9a
            L9a:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.y0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class y1 extends jo.q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22976w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22977x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22978y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22976w = componentCallbacks;
            this.f22977x = aVar;
            this.f22978y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            ComponentCallbacks componentCallbacks = this.f22976w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(fa.c.class), this.f22977x, this.f22978y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.CastService$observeStoreValues$20", f = "CastService.kt", l = {2013}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class z extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22979w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<String> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ CastService f22981w;

            public a(CastService castService) {
                this.f22981w = castService;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(String str, ao.d<? super wn.v> dVar) {
                this.f22981w.c2(str, false);
                return wn.v.f59242a;
            }
        }

        public z(ao.d<? super z> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new z(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((z) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22979w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<String> x02 = CastService.this.O0().x0();
                a aVar = new a(CastService.this);
                this.f22979w = 1;
                if (x02.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.CastService$showErrorMessage$3", f = "CastService.kt", l = {3157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class z0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22982w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22983x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22984y;

        /* renamed from: z  reason: collision with root package name */
        public int f22985z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0078, B:23:0x007e, B:25:0x0086), top: B:36:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f22985z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f22984y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f22983x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f22982w
                com.dena.mirrativ.streaming.CastService r4 = (com.dena.mirrativ.streaming.CastService) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L98
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                com.dena.mirrativ.streaming.CastService r10 = com.dena.mirrativ.streaming.CastService.this
                nf.c r10 = com.dena.mirrativ.streaming.CastService.B(r10)
                wo.x r3 = r10.G0()
                com.dena.mirrativ.streaming.CastService r10 = com.dena.mirrativ.streaming.CastService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L98
                r4 = r10
                r10 = r9
            L3d:
                r10.f22982w = r4     // Catch: java.lang.Throwable -> L98
                r10.f22983x = r3     // Catch: java.lang.Throwable -> L98
                r10.f22984y = r1     // Catch: java.lang.Throwable -> L98
                r10.f22985z = r2     // Catch: java.lang.Throwable -> L98
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L98
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L95
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L95
                if (r10 == 0) goto L8f
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L95
                wn.k r10 = (wn.k) r10     // Catch: java.lang.Throwable -> L95
                java.lang.Object r6 = r10.a()     // Catch: java.lang.Throwable -> L95
                java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L95
                java.lang.Object r10 = r10.b()     // Catch: java.lang.Throwable -> L95
                java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Throwable -> L95
                int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L95
                com.dena.mirrorman.webrtc.RTCManager r7 = com.dena.mirrativ.streaming.CastService.X(r5)     // Catch: java.lang.Throwable -> L95
                if (r7 == 0) goto L89
                java.util.HashMap r7 = r7.getClients()     // Catch: java.lang.Throwable -> L95
                if (r7 == 0) goto L89
                java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Throwable -> L95
                com.dena.mirrorman.webrtc.RTCClient r6 = (com.dena.mirrorman.webrtc.RTCClient) r6     // Catch: java.lang.Throwable -> L95
                if (r6 == 0) goto L89
                r6.changeVolume(r10)     // Catch: java.lang.Throwable -> L95
            L89:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L8f:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L95:
                r10 = move-exception
                r3 = r4
                goto L99
            L98:
                r10 = move-exception
            L99:
                throw r10     // Catch: java.lang.Throwable -> L9a
            L9a:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.z0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class z1 extends jo.q implements io.a<nf.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22986w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22987x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22988y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22986w = componentCallbacks;
            this.f22987x = aVar;
            this.f22988y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.c] */
        @Override // io.a
        public final nf.c invoke() {
            ComponentCallbacks componentCallbacks = this.f22986w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.c.class), this.f22987x, this.f22988y);
        }
    }

    public CastService() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.B = wn.g.b(iVar, new l1(this, null, null));
        this.C = wn.g.b(iVar, new w1(this, null, null));
        this.D = wn.g.b(iVar, new z1(this, null, null));
        this.E = wn.g.b(iVar, new a2(this, null, null));
        this.F = wn.g.b(iVar, new b2(this, null, null));
        this.G = wn.g.b(iVar, new c2(this, null, null));
        this.H = wn.g.b(iVar, new d2(this, null, null));
        this.I = wn.g.b(iVar, new e2(this, null, null));
        this.J = wn.g.b(iVar, new f2(this, null, null));
        this.K = wn.g.b(iVar, new b1(this, null, null));
        this.L = wn.g.b(iVar, new c1(this, null, null));
        this.M = wn.g.b(iVar, new d1(this, null, null));
        this.N = wn.g.b(iVar, new e1(this, null, null));
        this.O = wn.g.b(iVar, new f1(this, null, null));
        this.P = wn.g.b(iVar, new g1(this, null, null));
        this.Q = wn.g.b(iVar, new h1(this, null, null));
        this.R = wn.g.b(iVar, new i1(this, null, null));
        this.S = wn.g.b(iVar, new j1(this, null, null));
        this.T = wn.g.b(iVar, new k1(this, null, null));
        this.U = wn.g.b(iVar, new m1(this, null, null));
        this.V = wn.g.b(iVar, new n1(this, null, null));
        this.W = wn.g.b(iVar, new o1(this, null, null));
        this.X = wn.g.b(iVar, new p1(this, null, null));
        this.Y = wn.g.b(iVar, new q1(this, null, null));
        this.Z = wn.g.b(iVar, new r1(this, null, null));
        this.f22704a0 = wn.g.b(iVar, new s1(this, null, null));
        this.f22705b0 = wn.g.b(iVar, new t1(this, null, null));
        this.f22706c0 = wn.g.b(iVar, new u1(this, null, null));
        this.f22707d0 = wn.g.b(iVar, new v1(this, null, null));
        this.f22708e0 = wn.g.b(iVar, new x1(this, null, null));
        this.f22709f0 = wn.g.b(iVar, new y1(this, null, null));
        this.f22710g0 = y4.d.f61238d.a(this);
        this.f22711h0 = new h();
        this.f22712i0 = new m();
        xo.s<LiveViewerNum> a10 = xo.i0.a(new LiveViewerNum(0, 0));
        this.f22713j0 = a10;
        this.f22714k0 = a10;
        this.f22721r0 = new j();
        this.E0 = new LinkedHashMap();
        this.F0 = new l();
        this.J0 = new n();
        this.U0 = -1;
        this.W0 = this.f22710g0.b();
    }

    public static /* synthetic */ void I0(CastService castService, String str, String str2, String str3, jf.w wVar, int i10, int i11, int i12, boolean z10, int i13, Object obj) {
        castService.H0(str, str2, str3, wVar, i10, i11, i12, (i13 & 128) != 0 ? false : z10);
    }

    public static final void U1(CastService castService, t4 t4Var) {
        jo.p.h(castService, "this$0");
        jo.p.h(t4Var, "$lc");
        RTCManager rTCManager = castService.R0;
        if (rTCManager != null) {
            boolean z10 = true;
            if (rTCManager == null || !rTCManager.hasClients()) {
                z10 = false;
            }
            if (z10) {
                castService.X1(t4Var);
            }
        }
    }

    public static final void a2(ArrayList arrayList, CastService castService) {
        jo.p.h(arrayList, "$comments");
        jo.p.h(castService, "this$0");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d4 d4Var = (d4) it.next();
            jo.p.g(d4Var, "comment");
            castService.X1(d4Var);
        }
    }

    public static final void g2(CastService castService) {
        jo.p.h(castService, "this$0");
        j2(castService, false, 1, null);
    }

    public static /* synthetic */ void j2(CastService castService, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        castService.i2(z10);
    }

    public static final void y1(CastService castService, Boolean bool) {
        jo.p.h(castService, "this$0");
        if (castService.o1().a().d()) {
            od.b N0 = castService.N0();
            String Y02 = castService.Y0();
            jo.p.g(bool, "it");
            N0.W(Y02, bool.booleanValue());
        }
    }

    public static final void z1(CastService castService) {
        jo.p.h(castService, "this$0");
        castService.u2(true);
        castService.b2(xb.r.text_hide_notification_screen_off, false);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.lang.Integer] */
    public final void A1(Runnable runnable) {
        ye.b n10;
        jo.e0 e0Var = new jo.e0();
        jo.e0 e0Var2 = new jo.e0();
        jo.e0 e0Var3 = new jo.e0();
        cf.g gVar = this.f22716m0;
        if (gVar != null) {
            e0Var.f38136w = Integer.valueOf((int) gVar.l());
            e0Var2.f38136w = Integer.valueOf((int) gVar.n());
            e0Var3.f38136w = Integer.valueOf((int) gVar.o());
        }
        ye.n nVar = this.L0;
        if (nVar != null && (n10 = nVar.n()) != null) {
            e0Var.f38136w = Integer.valueOf(n10.b());
            e0Var2.f38136w = Integer.valueOf(n10.c());
            e0Var3.f38136w = Integer.valueOf(n10.a());
        }
        uo.l.d(this, null, null, new t0(e0Var, e0Var2, e0Var3, runnable, 60000, null), 3, null);
    }

    public final void B1(String str) {
        V0().i();
        N0().x(str);
    }

    public final void C1(boolean z10) {
        I0(this, Y0(), Z0().getTitle(), Z0().b1(), new jf.w(Z0().h(), Z0().R(), Z0().getTitle(), Z0().e5()), this.I0, z10 ? 1 : 0, h1().i(), false, 128, null);
    }

    public final void D0(GiftItem giftItem) {
        U0().f(giftItem, a1().i(), o1().a().d() && o1().a().e());
        dq.c.c().l(w.b.f19485a);
    }

    public final void D1(int i10) {
        I0(this, Y0(), Z0().getTitle(), Z0().b1(), new jf.w(Z0().h(), Z0().R(), Z0().D1(), Z0().e5()), this.I0, h1().h(), i10, false, 128, null);
    }

    public final void E0() {
        GiftItem e10;
        if (O0().O0().getValue().booleanValue() || (e10 = U0().e()) == null) {
            return;
        }
        U0().c(e10);
        E0();
        if (e10.getCoins() <= 0) {
            return;
        }
        uo.l.d(this, new e(uo.l0.f56050r, this), null, new f(e10, null), 2, null);
    }

    public final void E1(int i10) {
        if (this.K0 == null) {
            return;
        }
        I0(this, Y0(), Z0().getTitle(), Z0().b1(), new jf.w(Z0().h(), Z0().R(), Z0().D1(), Z0().e5()), i10, h1().h(), h1().i(), false, 128, null);
    }

    public final void F0() {
        xb.h0 h0Var = this.V0;
        if (h0Var != null) {
            h0Var.l();
            this.V0 = null;
        }
    }

    public final void F1() {
        this.N0 = 0L;
        G1(true);
        if (n1().f1() && this.V0 == null) {
            Context applicationContext = getApplicationContext();
            jo.p.g(applicationContext, "applicationContext");
            this.V0 = new xb.h0(applicationContext, jo.p.c(O0().I0().f(), Boolean.TRUE), n1());
        }
        nd.j1 p12 = p1();
        Context applicationContext2 = getApplicationContext();
        jo.p.g(applicationContext2, "applicationContext");
        p12.f(applicationContext2, Referer.BROADCAST);
    }

    public final void G0() {
        stopForeground(true);
    }

    public final void G1(boolean z10) {
        ec.z zVar;
        dc.j jVar;
        ec.z zVar2;
        boolean r42 = n1().r4();
        boolean w12 = n1().w1();
        boolean g02 = n1().g0();
        K1(z10);
        if (z10 || this.f22726w0 == null) {
            this.f22726w0 = new ec.z(this, Y0());
        }
        if (this.f22728x0 == null) {
            this.f22728x0 = new dc.j(this);
        }
        dc.j jVar2 = this.f22728x0;
        if (jVar2 != null) {
            ye.c cVar = this.K0;
            if (cVar != null) {
                jVar2.setLiveId(cVar.b());
            }
            jVar2.setAudioMute(r42);
            jVar2.setVideoMute(w12);
            jVar2.v();
        }
        ec.z zVar3 = this.f22726w0;
        if (zVar3 != null) {
            zVar3.u0(false);
        }
        if (g02 && !o1().a().e()) {
            ec.z zVar4 = this.f22726w0;
            if (zVar4 != null) {
                zVar4.w0();
            }
        } else {
            ec.z zVar5 = this.f22726w0;
            if (zVar5 != null) {
                zVar5.a0();
            }
        }
        if (this.f22722s0 && (zVar2 = this.f22726w0) != null) {
            zVar2.r(0, (int) getResources().getDimension(xb.m.float_top_toast_message_height));
        }
        ec.z zVar6 = this.f22726w0;
        if (zVar6 != null && (jVar = this.f22728x0) != null) {
            jVar.E(zVar6.getMLayoutParams().x, zVar6.getMLayoutParams().y);
        }
        Bundle bundle = this.f22730y0;
        if (bundle != null && (zVar = this.f22726w0) != null) {
            zVar.q0(bundle);
        }
        S0().f(new dc.e(this, jo.p.c(o1().a().b(), UnityReceiverKt.EMOMO)));
    }

    public final void H0(String str, String str2, String str3, jf.w wVar, int i10, int i11, int i12, boolean z10) {
        uo.l.d(this, null, null, new g(str, str2, wVar, str3, i10, i11, i12, z10, null), 3, null);
    }

    public final void H1() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        registerReceiver(this.f22721r0, intentFilter);
    }

    public final void I1() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        registerReceiver(this.F0, intentFilter);
    }

    public final void J0(String str, boolean z10) {
        Intent a10;
        a10 = MainActivity.f25195m0.a(this, (r17 & 2) != 0 ? null : str, (r17 & 4) != 0 ? 0L : System.currentTimeMillis() - this.O0, (r17 & 8) != 0 ? 0 : this.A0, (r17 & 16) != 0 ? false : z10, (r17 & 32) == 0 ? null : null, (r17 & 64) == 0 ? false : false);
        a10.setAction("EXTRA_ACTION_LIVE_VIEWER");
        a10.setFlags(335544320);
        startActivity(a10);
    }

    public final void J1() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        registerReceiver(this.J0, intentFilter);
    }

    public final void K0() {
        uo.l.d(this, null, null, new i(null), 3, null);
    }

    public final void K1(boolean z10) {
        ec.z zVar = this.f22726w0;
        if (zVar != null) {
            this.f22730y0 = zVar.getInstanceStateToSave();
            zVar.l();
            if (z10) {
                this.f22726w0 = null;
            }
        }
        dc.j jVar = this.f22728x0;
        if (jVar != null) {
            jVar.l();
            this.f22728x0 = null;
        }
        S0().e(u0.f22932w);
        dc.x xVar = this.f22732z0;
        if (xVar != null) {
            xVar.l();
        }
        dq.c.c().l(new nd.i());
    }

    public final AudioManager L0() {
        return (AudioManager) this.f22729y.getValue();
    }

    public final void L1(String str, boolean z10) {
        uo.l.d(this, null, null, new v0(str, z10, null), 3, null);
    }

    public final od.a M0() {
        return (od.a) this.B.getValue();
    }

    public final void M1(int i10) {
        if (o1().a().d() && o1().a().e()) {
            dq.c.c().l(new t.l(i10));
        }
    }

    public final od.b N0() {
        return (od.b) this.C.getValue();
    }

    public final void N1() {
        uo.l.d(this, null, null, new w0(null), 3, null);
    }

    public final nf.c O0() {
        return (nf.c) this.D.getValue();
    }

    public final void O1() {
        RTCManager rTCManager = this.R0;
        if (rTCManager != null) {
            RTCManager.close$default(rTCManager, false, 1, null);
        }
        ye.c cVar = this.K0;
        if (cVar != null) {
            wn.k<List<StunServer>, List<TurnServer>> f10 = O0().B0().f();
            if (f10 == null) {
                f10 = wn.q.a(null, null);
            }
            Context applicationContext = getApplicationContext();
            jo.p.g(applicationContext, "applicationContext");
            this.R0 = new RTCManager("CastService", applicationContext, Referer.BROADCAST, cVar.b(), t1().t4(), t1().T4(), f10.a(), f10.b());
        }
    }

    public final od.f P0() {
        return (od.f) this.E.getValue();
    }

    public final void P1(String str, String str2) {
        this.P0 = true;
        if (o1().a().d()) {
            u2(n1().w1());
            b2(xb.r.text_warning_about_share_screenoff, true);
        }
        g1().j(this, str, str2);
        hf.b.f35490a.d().a();
    }

    public final nf.h Q0() {
        return (nf.h) this.F.getValue();
    }

    public final void Q1(MRError mRError) {
        String message = mRError.getMessage();
        if (message == null) {
            message = getResources().getString(xb.r.f60070c);
            jo.p.g(message, "resources.getString(R.string.error_access)");
        }
        c2(message, true);
    }

    public final nf.k R0() {
        return (nf.k) this.G.getValue();
    }

    public final void R1() {
        S0().f(new gc.j(this));
        T1();
    }

    public final fa.c S0() {
        return (fa.c) this.f22709f0.getValue();
    }

    public final void S1() {
        S0().f(new gc.z(this));
    }

    public final hf.w T0() {
        return (hf.w) this.I.getValue();
    }

    public final void T1() {
        t4.a aVar = t4.f55536j;
        String Y02 = Y0();
        String string = getResources().getString(xb.r.text_collab_balance_please);
        jo.p.g(string, "getString(R.string.text_collab_balance_please)");
        final t4 a10 = aVar.a(Y02, 20001, string);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: xb.f
            @Override // java.lang.Runnable
            public final void run() {
                CastService.U1(CastService.this, a10);
            }
        }, 10000L);
    }

    public final cc.f U0() {
        return (cc.f) this.J.getValue();
    }

    public final od.p V0() {
        return (od.p) this.K.getValue();
    }

    public final void V1(MRError mRError) {
        String string;
        if (mRError instanceof MRError.Failure) {
            string = ((MRError.Failure) mRError).getErrorMessage();
        } else if (mRError instanceof MRError.Banned) {
            string = ((MRError.Banned) mRError).getErrorMessage();
        } else if (mRError instanceof MRError.Blocked) {
            string = ((MRError.Blocked) mRError).getErrorMessage();
        } else {
            string = mRError instanceof MRError.Network ? getResources().getString(xb.r.f60070c) : null;
        }
        if (string != null) {
            c2(string, false);
        } else {
            of.n.f45411a.l(this, mRError);
        }
        uo.l.d(this, null, null, new x0(null), 3, null);
        uo.l.d(this, null, null, new y0(null), 3, null);
        uo.l.d(this, null, null, new z0(null), 3, null);
    }

    public final nf.o W0() {
        return (nf.o) this.L.getValue();
    }

    public final void W1() {
        ye.c cVar = this.K0;
        jo.p.e(cVar);
        gc.q qVar = new gc.q(this, cVar, this.N0, this.f22722s0, this.I0 == 1);
        qVar.setTotalViewerNum(this.f22714k0.getValue().getTotalViewerNum());
        qVar.setTitle(Z0().getTitle());
        qVar.setSelectedApp(new jf.w(Z0().h(), Z0().R(), Z0().D1(), Z0().e5()));
        if (!Z0().W0()) {
            qVar.setAppsVisible(true);
            uo.l.d(this, null, null, new a1(qVar, null), 3, null);
        } else {
            qVar.setAppsVisible(false);
        }
        dq.c.c().l(new nd.l());
        S0().f(qVar);
        if (!TextUtils.isEmpty(Y0())) {
            MRLogger d12 = d1();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_TAP_SETTING);
            builder.setTargetType(MRLog.TARGET_TYPE_LIVE);
            builder.setTargetId(Y0());
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, Y0())));
            d12.sendLog(builder.build());
        }
        if (r1().b(14).b()) {
            r1().b(14).a();
        }
        xb.h0 h0Var = this.V0;
        if (h0Var != null) {
            h0Var.j();
        } else if (n1().f1()) {
            n1().U2(false);
            dq.c.c().l(new nd.l());
        }
    }

    public final tb.c X0() {
        return (tb.c) this.M.getValue();
    }

    public final void X1(d4 d4Var) {
        if (o1().a().d()) {
            N0().O(d4Var);
            ec.z zVar = this.f22726w0;
            if (zVar != null) {
                zVar.k0(d4Var);
            }
        }
    }

    public final String Y0() {
        return Z0().b();
    }

    public final void Y1(String str) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(268435456);
        j.e p10 = new j.e(this, getString(xb.r.f60079j)).D(xb.n.notification_cast).v(BitmapFactory.decodeResource(getResources(), xb.q.f60066f)).r(getString(xb.r.f60067a)).q(str).p(PendingIntent.getActivity(this, 0, intent, 201326592));
        jo.p.g(p10, "Builder(this, getString(…tentIntent(contentIntent)");
        startForeground(1337, p10.c());
    }

    public final kf.m Z0() {
        return (kf.m) this.N.getValue();
    }

    public final void Z1() {
        final ArrayList arrayList = new ArrayList();
        t4.a aVar = t4.f55536j;
        String Y02 = Y0();
        String string = getResources().getString(xb.r.text_started_broadcasting);
        jo.p.g(string, "getString(R.string.text_started_broadcasting)");
        arrayList.add(aVar.a(Y02, 20000, string));
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: xb.g
            @Override // java.lang.Runnable
            public final void run() {
                CastService.a2(arrayList, this);
            }
        });
    }

    @Override // y4.e
    public y4.c a0() {
        return this.W0;
    }

    public final nf.w a1() {
        return (nf.w) this.O.getValue();
    }

    @Override // dc.d.e
    public void b(String str) {
        nd.f fVar;
        nd.f fVar2;
        jo.p.h(str, "tag");
        switch (str.hashCode()) {
            case -192091037:
                if (str.equals("DIALOG_TAG_KICK_CONFIRM")) {
                    M0().i(q1().n(), Y0(), Referer.BROADCAST);
                    return;
                }
                return;
            case -176099932:
                if (str.equals("DIALOG_TAG_COLLAB_LIVE_TIMEOUT")) {
                    WebViewActivity.a aVar = WebViewActivity.X;
                    Context applicationContext = getApplicationContext();
                    jo.p.g(applicationContext, "applicationContext");
                    startActivity(WebViewActivity.a.b(aVar, applicationContext, MRUrl.TroubleshootCollab.INSTANCE.getUrl(), false, false, 12, null));
                    return;
                }
                return;
            case -124208750:
                if (str.equals("DIALOG_TAG_BLOCK_CONFIRM") && (fVar = this.f22715l0) != null) {
                    M0().d(fVar.a(), Referer.BROADCAST);
                    return;
                }
                return;
            case 1382370969:
                if (str.equals("DIALOG_TAG_UNBLOCK_CONFIRM") && (fVar2 = this.f22715l0) != null) {
                    M0().m(fVar2.a(), Referer.BROADCAST);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final b b1() {
        return (b) this.f22731z.getValue();
    }

    public final void b2(int i10, boolean z10) {
        String string = getResources().getString(i10);
        jo.p.g(string, "resources.getString(strId)");
        c2(string, z10);
    }

    @Override // dc.d.e
    public void c(String str) {
        jo.p.h(str, "tag");
    }

    public final void c2(String str, boolean z10) {
        S0().a(new fa.a(this, str, z10));
    }

    public final MRLogger d1() {
        return (MRLogger) this.P.getValue();
    }

    public final void d2() {
        String str;
        if (o1().a().d() || this.K0 == null) {
            return;
        }
        Object systemService = getSystemService("notification");
        jo.p.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        this.f22718o0 = notificationManager.getCurrentInterruptionFilter();
        if (n1().b0() == 1) {
            str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        } else if (n1().b0() == 2) {
            str = "2";
        } else {
            str = notificationManager.getCurrentInterruptionFilter() == 2 ? "3" : "0";
        }
        MRLogger d12 = d1();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_SETTING_HIDE_NOTIFICATION);
        builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, str), wn.q.a(MRLog.PAYLOAD_KEY_SETTING, String.valueOf(L0().getRingerMode()))));
        d12.sendLog(builder.build());
        if (n1().b0() == 2) {
            if (notificationManager.isNotificationPolicyAccessGranted()) {
                notificationManager.setInterruptionFilter(2);
            } else {
                n1().I4(-1);
            }
        }
        t2("requesting_livestart");
        of.n nVar = of.n.f45411a;
        Context applicationContext = getApplicationContext();
        jo.p.g(applicationContext, "applicationContext");
        if (nVar.m(applicationContext)) {
            b2(xb.r.C2, true);
            n2("StartCast Failed (BatterySave)");
            return;
        }
        this.E0 = new LinkedHashMap();
        ye.c cVar = this.K0;
        if (cVar != null) {
            S0().f(new dc.f(this));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Broadcast quality: ");
            sb2.append(cVar.h());
            sb2.append(" height/width:");
            sb2.append(cVar.getHeight());
            sb2.append('/');
            sb2.append(cVar.getWidth());
            sb2.append(" bitrate: ");
            b.a aVar = ze.b.f63104j;
            sb2.append(aVar.a().e());
            sb2.append(" framerate: ");
            sb2.append(aVar.a().f());
            g9.a.g(sb2.toString());
            uo.l.d(this, null, null, new g2(cVar, null), 3, null);
        }
        this.S0 = new SpeechAnalyzer();
    }

    public final hf.e e1() {
        return (hf.e) this.Q.getValue();
    }

    public final void e2() {
        this.D0 = true;
        Runnable runnable = this.C0;
        if (runnable == null) {
            runnable = new h2();
        }
        this.C0 = runnable;
        if (this.B0 == null) {
            this.B0 = new Handler();
        }
        Handler handler = this.B0;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
        long j10 = 60000;
        Handler handler2 = this.B0;
        if (handler2 != null) {
            handler2.postDelayed(runnable, j10);
        }
    }

    public final hf.r f1() {
        return (hf.r) this.R.getValue();
    }

    public final void f2() {
        if (o1().a().d()) {
            Runnable runnable = this.G0;
            if (runnable == null) {
                runnable = new Runnable() { // from class: xb.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        CastService.g2(CastService.this);
                    }
                };
            }
            this.G0 = runnable;
            if (this.B0 == null) {
                this.B0 = new Handler();
            }
            Handler handler = this.B0;
            if (handler != null) {
                handler.removeCallbacks(runnable);
            }
            Handler handler2 = this.B0;
            if (handler2 != null) {
                handler2.postDelayed(runnable, DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS);
            }
        }
    }

    public final hf.d0 g1() {
        return (hf.d0) this.S.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f22727x.getCoroutineContext();
    }

    public final hf.m0 h1() {
        return (hf.m0) this.T.getValue();
    }

    public final void h2(String str) {
        if (str == null) {
            return;
        }
        a aVar = X0;
        if (aVar.b(this) && !jo.p.c(W0().H().f(), Boolean.TRUE)) {
            Intent f10 = c.a.f(X0(), this, str, Referer.COLLAB_CONNECTED_USERS_LIST, null, null, false, true, false, false, null, 896, null);
            if (aVar.b(this)) {
                f10.addFlags(1342767104);
            } else {
                f10.addFlags(268435456);
            }
            startActivity(f10);
        }
    }

    public final hf.v0 i1() {
        return (hf.v0) this.U.getValue();
    }

    public final void i2(boolean z10) {
        k2();
        Object systemService = getSystemService("notification");
        jo.p.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (n1().b0() == 2 && notificationManager.getCurrentInterruptionFilter() != 1 && notificationManager.isNotificationPolicyAccessGranted()) {
            notificationManager.setInterruptionFilter(this.f22718o0);
        }
        e1().c("CastService");
        try {
            unregisterReceiver(this.J0);
            unregisterReceiver(this.F0);
            unregisterReceiver(this.f22721r0);
        } catch (Exception e10) {
            g9.a.c(e10);
        }
        l2();
        K1(true);
        F0();
        G0();
        this.f22730y0 = null;
        this.E0.clear();
        t2("stopped");
        U0().b();
        if (z10) {
            J0(Y0(), true);
        } else {
            B1(Y0());
            Puree.b();
        }
        if (this.f22724u0) {
            cf.g gVar = this.f22716m0;
            try {
                if (gVar != null) {
                    try {
                        gVar.A(null);
                        gVar.z(null);
                        gVar.D();
                    } catch (Exception e11) {
                        g9.a.c(e11);
                    }
                }
            } finally {
                this.f22716m0 = null;
            }
        } else {
            ye.n nVar = this.L0;
            if (nVar != null) {
                try {
                    nVar.N(null, null);
                    nVar.U();
                    this.L0 = null;
                } catch (Exception e12) {
                    g9.a.c(e12);
                }
            }
        }
        UnityManager.Companion.getInstance().getCollabAvatarManager().clear();
        vd.b.f57299a.c("CastService_casting");
    }

    @Override // dc.x.c
    public void j(String str) {
        jo.p.h(str, "targetUserId");
        String p10 = q1().p();
        if (p10 == null) {
            M0().c(Y0(), str, Referer.BROADCAST);
        } else if (jo.p.c(p10, str)) {
            M0().g(Y0(), str, Referer.BROADCAST);
        } else {
            S0().f(new dc.b(this, new o0(str)));
        }
    }

    public final MediaProjectionManager j1() {
        return (MediaProjectionManager) this.A.getValue();
    }

    @Override // dc.l.e
    public void k(String str) {
        jo.p.h(str, "tag");
        if (jo.p.c(str, "DIALOG_TAG_SUGGEST_SILENT_MODE")) {
            Intent intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
            List<ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(intent, 0);
            jo.p.g(queryIntentActivities, "pm.queryIntentActivities(intent, 0)");
            if (queryIntentActivities.size() < 1) {
                intent = new Intent("android.settings.SETTINGS");
            }
            intent.setFlags(268435456);
            startActivity(intent);
        } else if (jo.p.c(str, "DIALOG_TAG_SUGGEST_ALLOW_NOTIFICATION_ACCESS")) {
            Intent intent2 = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
            List<ResolveInfo> queryIntentActivities2 = getPackageManager().queryIntentActivities(intent2, 0);
            jo.p.g(queryIntentActivities2, "pm.queryIntentActivities(intent, 0)");
            if (queryIntentActivities2.size() < 1) {
                intent2 = new Intent("android.settings.SETTINGS");
            }
            intent2.setFlags(268435456);
            startActivity(intent2);
        }
    }

    public final nf.z k1() {
        return (nf.z) this.W.getValue();
    }

    public final void k2() {
        HashMap<String, RTCClient> clients;
        RTCManager rTCManager = this.R0;
        Collection<RTCClient> values = (rTCManager == null || (clients = rTCManager.getClients()) == null) ? null : clients.values();
        if (values == null) {
            values = xn.s.k();
        }
        od.f P0 = P0();
        String Y02 = Y0();
        ArrayList arrayList = new ArrayList(xn.t.u(values, 10));
        for (RTCClient rTCClient : values) {
            arrayList.add(new jf.g(rTCClient.getUserId(), rTCClient.isConnected()));
        }
        P0.h(Referer.BROADCAST, Y02, arrayList, jf.k.STOP_COLLAB);
        RTCManager rTCManager2 = this.R0;
        if (rTCManager2 != null) {
            rTCManager2.close(jo.p.c(k1().O1().f(), Boolean.TRUE));
        }
        this.R0 = null;
    }

    public final MRRequest l1() {
        return (MRRequest) this.V.getValue();
    }

    public final void l2() {
        Runnable runnable;
        this.D0 = false;
        Handler handler = this.B0;
        if (handler == null || (runnable = this.C0) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    public final kf.r m1() {
        return (kf.r) this.X.getValue();
    }

    public final void m2() {
        Runnable runnable;
        Handler handler = this.B0;
        if (handler == null || (runnable = this.G0) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    public final kf.t n1() {
        return (kf.t) this.Y.getValue();
    }

    public final void n2(String str) {
        G0();
        if (!TextUtils.isEmpty(str)) {
            g9.a.f32826a.b(str, new Object[0]);
        }
        j2(this, false, 1, null);
        vd.b.f57299a.c("CastService_casting");
    }

    @Override // dc.l.e
    public void o(String str) {
        jo.p.h(str, "tag");
    }

    public final nd.i1 o1() {
        return (nd.i1) this.Z.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o2(com.dena.mirrorman.net.api.response.live.LiveOwnedResponse r15) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.o2(com.dena.mirrorman.net.api.response.live.LiveOwnedResponse):void");
    }

    @dq.l
    public final void on(h.c cVar) {
        jo.p.h(cVar, "event");
        if (this.R0 == null) {
            O1();
        }
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        jo.p.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        int i10 = configuration.orientation;
        if ((i10 == 2 || i10 == 1) && i10 != this.I0) {
            this.I0 = i10;
            if (o1().a().d() && (this.L0 != null || this.f22716m0 != null)) {
                E1(this.I0);
                G1(false);
                cf.g gVar = this.f22716m0;
                if (gVar != null) {
                    gVar.q(configuration);
                }
                ye.n nVar = this.L0;
                if (nVar != null) {
                    nVar.t(configuration);
                }
            } else if (o1().a().f() || o1().a().g()) {
                E1(this.I0);
                G1(false);
            }
        }
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public void onCreate() {
        super.onCreate();
        dq.c.c().p(this);
        this.f22710g0.d(null);
        q1().g();
        o1().a().i("stopped");
        this.I0 = getResources().getConfiguration().orientation;
        b b12 = b1();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        wn.v vVar = wn.v.f59242a;
        registerReceiver(b12, intentFilter);
        Object systemService = getSystemService("notification");
        jo.p.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        jo.a0 a0Var = new jo.a0();
        a0Var.f38125w = notificationManager.isNotificationPolicyAccessGranted();
        uo.l.d(this, null, null, new p0(notificationManager, a0Var, this, null), 3, null);
        x1();
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public void onDestroy() {
        K1(true);
        F0();
        l2();
        dq.c.c().r(this);
        q1().h();
        unregisterReceiver(b1());
        uo.d2 d2Var = this.f22720q0;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        uo.d2 d2Var2 = this.f22720q0;
        if (d2Var2 != null) {
            d2.a.a(d2Var2, null, 1, null);
        }
        uo.r0.d(this, null, 1, null);
        P0().p(jf.k.STOP_CAST);
        te.b bVar = this.f22719p0;
        if (bVar != null) {
            bVar.f();
        }
        if (o1().a().d()) {
            t2("stopped");
        }
        this.S0 = null;
        vd.b.f57299a.c("CastService_casting");
        super.onDestroy();
    }

    @dq.l
    public final void onEvent(nd.t tVar) {
        jo.p.h(tVar, "event");
        if (S0().b("FloatControlView") == null) {
            W1();
        } else {
            S0().d("FloatControlView");
        }
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        startForeground(1337, new j.e(this, getString(xb.r.f60079j)).c());
        String action = intent != null ? intent.getAction() : null;
        if (action == null) {
            stopSelf(i11);
            return 2;
        }
        if (jo.p.c(action, "com.dena.mirrorman.castservice.action.PLAY")) {
            ye.c cVar = (ye.c) intent.getParcelableExtra("EXTRA_CASTSERVICE_PARAMS");
            this.M0 = Integer.valueOf(i11);
            if (cVar != null) {
                this.K0 = cVar;
            }
            this.f22722s0 = intent.getBooleanExtra("EXTRA_CASTSERVICE_IS_CLOSED_LIVE", this.f22722s0);
            F1();
            d2();
        }
        return 2;
    }

    public final nd.j1 p1() {
        return (nd.j1) this.f22704a0.getValue();
    }

    public final void p2(boolean z10) {
        try {
            n1().o3(z10);
            dc.j jVar = this.f22728x0;
            if (jVar != null) {
                jVar.setAudioMute(z10);
            }
            dq.c.c().l(new nd.l());
        } catch (Exception e10) {
            g9.a.c(e10);
        }
        if (this.f22724u0) {
            cf.g gVar = this.f22716m0;
            if (gVar != null) {
                gVar.B(z10, cf.i.AUDIO);
                return;
            }
            return;
        }
        ye.n nVar = this.L0;
        if (nVar != null) {
            nVar.M(z10, n.c.Audio);
        }
    }

    public final nf.i0 q1() {
        return (nf.i0) this.f22705b0.getValue();
    }

    public final void q2(boolean z10) {
        try {
            C1(z10);
            if (z10) {
                O1();
            } else {
                k2();
            }
        } catch (Exception e10) {
            g9.a.c(e10);
        }
    }

    public final ef.a r1() {
        return (ef.a) this.f22706c0.getValue();
    }

    public final void r2(LinkedLive linkedLive) {
        ye.c cVar = this.K0;
        if (cVar != null) {
            cVar.n(linkedLive);
        }
        dq.c.c().l(new nd.l());
    }

    public final hf.u0 s1() {
        return (hf.u0) this.f22707d0.getValue();
    }

    public final void s2() {
        if (S0().b("FloatControlView") != null) {
            dq.c.c().l(new nd.l());
        }
    }

    public final kf.x t1() {
        return (kf.x) this.f22708e0.getValue();
    }

    public final synchronized void t2(String str) {
        o1().a().i(str);
        w1();
    }

    public final void u(String str, CollabType collabType, boolean z10) {
        uo.l.d(this, null, null, new c(str, z10, collabType, null), 3, null);
    }

    public final void u1() {
        Intent K;
        if (i1().h()) {
            K = StreamEmomoActivity.a.b(StreamEmomoActivity.Q0, this, null, 2, null);
        } else {
            K = X0().K(this, false, false, false);
        }
        K.addFlags(335544320);
        startActivity(K);
    }

    public final void u2(boolean z10) {
        try {
            dc.j jVar = this.f22728x0;
            if (jVar != null) {
                jVar.setVideoMute(z10);
            }
            dq.c.c().l(new nd.l());
        } catch (Exception e10) {
            g9.a.c(e10);
        }
        if (this.f22724u0) {
            cf.g gVar = this.f22716m0;
            if (gVar != null) {
                gVar.B(z10, cf.i.VIDEO);
                return;
            }
            return;
        }
        ye.n nVar = this.L0;
        if (nVar != null) {
            nVar.M(z10, n.c.Video);
        }
    }

    public final boolean v1() {
        return L0().isWiredHeadsetOn();
    }

    public final void w1() {
        dq.c.c().l(o1().a());
    }

    public final void x1() {
        W0().F().i(this, new androidx.lifecycle.f0() { // from class: xb.c
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                CastService.y1(CastService.this, (Boolean) obj);
            }
        });
        uo.l.d(this, null, null, new f0(null), 3, null);
        uo.l.d(this, null, null, new g0(null), 3, null);
        uo.l.d(this, null, null, new h0(null), 3, null);
        uo.l.d(this, null, null, new i0(null), 3, null);
        uo.l.d(this, null, null, new j0(null), 3, null);
        uo.l.d(this, null, null, new k0(null), 3, null);
        uo.l.d(this, null, null, new l0(null), 3, null);
        uo.l.d(this, null, null, new m0(null), 3, null);
        uo.l.d(this, null, null, new p(null), 3, null);
        uo.l.d(this, null, null, new q(null), 3, null);
        uo.l.d(this, null, null, new r(null), 3, null);
        uo.l.d(this, null, null, new s(null), 3, null);
        uo.l.d(this, null, null, new t(null), 3, null);
        uo.l.d(this, null, null, new u(null), 3, null);
        uo.l.d(this, null, null, new v(null), 3, null);
        uo.l.d(this, null, null, new w(null), 3, null);
        uo.l.d(this, null, null, new x(null), 3, null);
        uo.l.d(this, null, null, new y(null), 3, null);
        uo.l.d(this, null, null, new z(null), 3, null);
        uo.l.d(this, null, null, new a0(null), 3, null);
        uo.l.d(this, null, null, new b0(null), 3, null);
        uo.l.d(this, null, null, new c0(null), 3, null);
        uo.l.d(this, null, null, new d0(null), 3, null);
        uo.l.d(this, null, null, new e0(null), 3, null);
    }

    @dq.l
    public final void on(i.f fVar) {
        jo.p.h(fVar, "event");
        RTCManager rTCManager = this.R0;
        if (rTCManager != null) {
            RTCManager.close$default(rTCManager, false, 1, null);
        }
        ye.c cVar = this.K0;
        if (cVar != null) {
            Context applicationContext = getApplicationContext();
            jo.p.g(applicationContext, "applicationContext");
            this.R0 = new RTCManager("CastService", applicationContext, Referer.BROADCAST, cVar.b(), t1().t4(), t1().T4(), fVar.a().getStunServers(), fVar.a().getTurnServers());
        }
    }

    @dq.l
    public final void onEvent(xb.y yVar) {
        jo.p.h(yVar, "event");
        S0().d("FloatControlView");
        W1();
        S1();
    }

    @dq.l
    public final void onEvent(nd.u uVar) {
        jo.p.h(uVar, "event");
        fa.c S0 = S0();
        gc.b bVar = new gc.b(this);
        ye.c cVar = this.K0;
        if (cVar != null) {
            bVar.setLiveId(cVar.b());
            bVar.setLinkedLive(cVar.a());
        }
        bVar.setOnUpdateLinkedLive(new q0());
        bVar.setOnClickBack(new r0());
        S0.f(bVar);
        S0().d("FloatControlView");
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.k kVar) {
        jo.p.h(kVar, "event");
        if (jo.p.c(kVar.a(), "CastService")) {
            P0().p(jf.k.STOP_CAST);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.i iVar) {
        String string;
        jo.p.h(iVar, "event");
        if (jo.p.c(iVar.a(), "CastService")) {
            if (iVar.b().getCollabType() == CollabType.CALL) {
                string = getResources().getString(xb.r.text_collab_talk_invite_reject, "");
            } else {
                string = getResources().getString(xb.r.text_collab_streaming_invite_reject, "");
            }
            String str = string;
            jo.p.g(str, "if (event.response.colla…ite_reject, \"\")\n        }");
            X1(f4.f54931p.b(Y0(), iVar.b().getUserName(), iVar.b().getUserId(), str, 75, iVar.b().getProfileImageUrl(), iVar.b().getBadgeImageUrl()));
        }
    }

    @dq.l
    public final void onEvent(nd.w wVar) {
        jo.p.h(wVar, "event");
        S0().d("FloatViewerListView");
        S0().d("FloatCustomYesNoView");
    }

    @dq.l
    public final void onEvent(nd.v vVar) {
        jo.p.h(vVar, "event");
        S0().d("FloatViewerListView");
        S0().d("FloatCustomYesNoView");
        W1();
    }

    @dq.l
    public final void onEvent(nd.x xVar) {
        jo.p.h(xVar, "event");
        fa.c S0 = S0();
        String Y02 = Y0();
        Map<String, String> map = this.E0;
        jo.p.f(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
        S0.f(new dc.k(this, Y02, (HashMap) map));
        S0().d("FloatControlView");
        u2(true);
        b2(xb.r.text_warning_about_screenoff, true);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.t tVar) {
        jo.p.h(tVar, "event");
        if (jo.p.c(tVar.b(), "CastService")) {
            N0().G(tVar.a());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.e1 e1Var) {
        jo.p.h(e1Var, "event");
        if (jo.p.c(e1Var.a(), "CastService")) {
            N0().K();
        }
    }

    @dq.l
    public final void onEvent(nd.h hVar) {
        jo.p.h(hVar, "event");
        p2(hVar.a());
    }

    @dq.l
    public final void onEvent(nd.g0 g0Var) {
        jo.p.h(g0Var, "event");
        this.U0 = 2;
        fa.c S0 = S0();
        String string = getString(xb.r.text_confim_access_notification_on);
        jo.p.g(string, "getString(R.string.text_…m_access_notification_on)");
        Integer valueOf = Integer.valueOf(xb.n.img_way_setting_notification);
        String string2 = getString(xb.r.text_change_settings);
        jo.p.g(string2, "getString(R.string.text_change_settings)");
        String string3 = getString(xb.r.H);
        jo.p.g(string3, "getString(R.string.text_cancel)");
        S0.a(new dc.l(this, string, valueOf, string2, string3, "DIALOG_TAG_SUGGEST_SILENT_MODE"));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.d1 d1Var) {
        jo.p.h(d1Var, "event");
        if (jo.p.c(d1Var.a(), "CastService")) {
            N0().H(d1Var.b());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.w wVar) {
        jo.p.h(wVar, "event");
        if (jo.p.c(wVar.a(), "CastService")) {
            N0().X(wVar.b());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.l1 l1Var) {
        jo.p.h(l1Var, "event");
        if (jo.p.c(l1Var.a(), "CastService")) {
            c2(l1Var.b(), true);
            j2(this, false, 1, null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.a aVar) {
        jo.p.h(aVar, "event");
        if (jo.p.c(aVar.b(), "CastService")) {
            X1(e4.f54891l.a(this, Y0(), aVar.a()));
        }
    }

    @dq.l
    public final void onEvent(nd.f0 f0Var) {
        jo.p.h(f0Var, "event");
        this.U0 = 1;
        fa.c S0 = S0();
        String string = getString(xb.r.text_confirm_access_notificaiton_stop_broadcast);
        jo.p.g(string, "getString(R.string.text_…ificaiton_stop_broadcast)");
        Integer valueOf = Integer.valueOf(xb.n.img_way_setting_notification);
        String string2 = getString(xb.r.text_change_settings);
        jo.p.g(string2, "getString(R.string.text_change_settings)");
        String string3 = getString(xb.r.H);
        jo.p.g(string3, "getString(R.string.text_cancel)");
        S0.a(new dc.l(this, string, valueOf, string2, string3, "DIALOG_TAG_SUGGEST_ALLOW_NOTIFICATION_ACCESS"));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.c0 c0Var) {
        jo.p.h(c0Var, "event");
        if (jo.p.c(c0Var.b(), "CastService")) {
            dq.c.c().l(new w.a(c0Var.a()));
            this.f22725v0 = c0Var.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00e8 A[SYNTHETIC] */
    @dq.l(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void on(ce.l.y r10) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.on(ce.l$y):void");
    }

    @dq.l
    public final void onEvent(nd.j jVar) {
        jo.p.h(jVar, "event");
        q2(jVar.a());
    }

    @dq.l
    public final void onEvent(nd.m mVar) {
        jo.p.h(mVar, "event");
        j2(this, false, 1, null);
    }

    @dq.l
    public final void onEvent(nd.b0 b0Var) {
        jo.p.h(b0Var, "event");
        if (o1().a().d()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: xb.d
                @Override // java.lang.Runnable
                public final void run() {
                    CastService.z1(CastService.this);
                }
            });
        }
    }

    @dq.l
    public final void onEvent(nd.s sVar) {
        jo.p.h(sVar, "event");
        String title = Z0().getTitle();
        String b12 = Z0().b1();
        String h10 = Z0().h();
        if (TextUtils.equals(sVar.c(), title) && TextUtils.equals(sVar.a(), b12) && TextUtils.equals(sVar.b().b(), h10)) {
            return;
        }
        S0().f(new dc.f(this));
        H0(Y0(), sVar.c(), sVar.a(), sVar.b(), this.I0, h1().h(), h1().i(), !jo.p.c(sVar.b().b(), h10));
        Z0().v0(sVar.b().b());
        Z0().A4(sVar.b().a());
        Z0().D3(sVar.b().c());
    }

    @dq.l
    public final void onEvent(nd.o0 o0Var) {
        jo.p.h(o0Var, "event");
        P1(o0Var.b(), o0Var.a());
    }

    @dq.l
    public final void onEvent(nd.f fVar) {
        jo.p.h(fVar, "event");
        this.f22715l0 = fVar;
        fa.c S0 = S0();
        String string = getString(fVar.b() ? xb.r.f60069b : xb.r.f60087q0);
        String string2 = getString(xb.r.f60091w1);
        String string3 = getString(fVar.b() ? xb.r.f60093z : xb.r.F2);
        jo.p.g(string3, "getString(if (event.isBl…se R.string.text_unblock)");
        S0.f(new dc.d(this, string, string2, string3, null, fVar.b() ? "DIALOG_TAG_BLOCK_CONFIRM" : "DIALOG_TAG_UNBLOCK_CONFIRM", 16, null));
    }

    @dq.l
    public final void onEvent(nd.d0 d0Var) {
        jo.p.h(d0Var, "event");
        dc.x xVar = this.f22732z0;
        if (xVar != null) {
            xVar.l();
        }
        dc.x xVar2 = new dc.x(this, M0(), q1(), d0Var.a(), Referer.BROADCAST, d0Var.b());
        this.f22732z0 = xVar2;
        xVar2.v();
    }

    @dq.l
    public final void onEvent(y.d dVar) {
        jo.p.h(dVar, "event");
        S0().f(new dc.h(this, new qe.a(dVar.a(), dVar.b(), Y0())));
    }

    @dq.l
    public final void onEvent(ce.m mVar) {
        jo.p.h(mVar, "event");
        u(mVar.b(), mVar.a(), false);
    }

    @dq.l
    public final void onEvent(ce.o oVar) {
        jo.p.h(oVar, "event");
        D1(oVar.a());
        RTCManager rTCManager = this.R0;
        if (rTCManager != null) {
            jo.p.e(rTCManager);
            if (rTCManager.getConnectedClientNum() == oVar.a()) {
                ArrayList arrayList = new ArrayList();
                RTCManager rTCManager2 = this.R0;
                jo.p.e(rTCManager2);
                for (RTCClient rTCClient : rTCManager2.getClients().values()) {
                    if (!rTCClient.isConnected()) {
                        arrayList.add(rTCClient);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    RTCClient rTCClient2 = (RTCClient) it.next();
                    N0().k(O0().S().f(), rTCClient2.getUserId());
                    RTCManager rTCManager3 = this.R0;
                    if (rTCManager3 != null) {
                        rTCManager3.disconnect(rTCClient2.getUserId());
                    }
                }
            }
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.d0 d0Var) {
        ye.c cVar;
        jo.p.h(d0Var, "event");
        if (!jo.p.c(d0Var.a(), "CastService") || (cVar = this.K0) == null || cVar.a() == null) {
            return;
        }
        String b10 = d0Var.b();
        LinkedLive a10 = cVar.a();
        if (TextUtils.equals(b10, a10 != null ? a10.getLiveId() : null)) {
            String string = getResources().getString(xb.r.text_push_broadcast_end, d0Var.c());
            jo.p.g(string, "resources.getString(R.st…ast_end, event.ownerName)");
            r2(null);
            c2(string, false);
        }
    }

    @dq.l
    public final void onEvent(ce.r rVar) {
        jo.p.h(rVar, "event");
        if (this.H0) {
            dq.c.c().l(new ce.q(rVar.a(), this.H0));
        } else {
            S0().f(new gc.n(this, rVar.a()));
        }
    }

    @dq.l
    public final void onEvent(ce.q qVar) {
        jo.p.h(qVar, "event");
        N0().m(O0().S().f(), qVar.a());
        this.H0 = qVar.b();
        od.f.i(P0(), Referer.BROADCAST, Y0(), xn.r.d(new jf.g(qVar.a().e(), false)), null, 8, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.n0 n0Var) {
        jo.p.h(n0Var, "event");
        if (jo.p.c(n0Var.a(), "CastService")) {
            String string = getResources().getString(xb.r.text_push_link_attached, n0Var.b().getLive().getOwnerName());
            jo.p.g(string, "resources.getString(R.st…rResponse.live.ownerName)");
            X1(q4.f55422m.a(Y0(), string, n0Var.b().getLive().getLiveId()));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(t0.a aVar) {
        jo.p.h(aVar, "event");
        if (jo.p.c(aVar.a(), "CastService")) {
            Handler handler = this.f22717n0;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f22717n0 = null;
            N0().f(aVar.b());
            R1();
            L1(aVar.b(), O0().O().f() == jf.i.MATCHING);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.r0 r0Var) {
        jo.p.h(r0Var, "event");
        if (jo.p.c(r0Var.a(), "CastService")) {
            this.f22713j0.setValue(r0Var.b());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(t0.b bVar) {
        jo.p.h(bVar, "event");
        if (jo.p.c(bVar.a(), "CastService")) {
            Handler handler = this.f22717n0;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f22717n0 = null;
            P0().h(Referer.BROADCAST, Y0(), xn.r.d(new jf.g(bVar.c(), true)), bVar.b() == PeerConnection.IceConnectionState.FAILED ? jf.k.ICE_CONNECTION_FAILED : jf.k.ICE_CONNECTION_CLOSED);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.q0 q0Var) {
        jo.p.h(q0Var, "event");
        if (jo.p.c(q0Var.a(), "CastService")) {
            X1(u4.f55574k.a(this, Y0(), q0Var.b().getUserId(), q0Var.b().getUserName(), q0Var.b().getProfileImageUrl(), q0Var.b().getBadgeImageUrl(), q0Var.b().isModerator()));
        }
    }

    @dq.l
    public final void onEvent(nd.q qVar) {
        jo.p.h(qVar, "event");
        LivePrepareLiveThumbnailActivity.a aVar = LivePrepareLiveThumbnailActivity.Y;
        Context applicationContext = getApplicationContext();
        jo.p.g(applicationContext, "applicationContext");
        Intent a10 = aVar.a(applicationContext, Referer.BROADCAST, 2, Y0(), null);
        a10.addFlags(268435456);
        startActivity(a10);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.d dVar) {
        jo.p.h(dVar, "event");
        if (jo.p.c(dVar.a(), "CastService")) {
            String string = getResources().getString(xb.r.text_collab_reached, "");
            jo.p.g(string, "resources.getString(R.st….text_collab_reached, \"\")");
            f4 b10 = f4.f54931p.b(Y0(), dVar.b().getUserName(), dVar.b().getUserId(), string, 12, dVar.b().getProfileImageUrl(), dVar.b().getBadgeImageUrl());
            N0().k(O0().S().f(), dVar.b().getUserId());
            X1(b10);
            RTCManager rTCManager = this.R0;
            if (rTCManager != null) {
                rTCManager.disconnect(dVar.b().getUserId());
            }
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(nd.a0 a0Var) {
        jo.p.h(a0Var, "event");
        s2();
    }

    @dq.l
    public final void onEvent(nd.k kVar) {
        ec.z zVar;
        jo.p.h(kVar, "event");
        n1().q(kVar.a());
        if (kVar.a()) {
            if ((o1().a().e() && this.f22723t0) || (zVar = this.f22726w0) == null) {
                return;
            }
            zVar.w0();
            return;
        }
        ec.z zVar2 = this.f22726w0;
        if (zVar2 != null) {
            zVar2.a0();
        }
        b2(xb.r.text_toast_comment_off, true);
    }

    @dq.l
    public final void onEvent(nd.p0 p0Var) {
        jo.p.h(p0Var, "event");
        boolean z10 = !(p0Var.a() == 0.0f);
        n1().U2(z10);
        if (z10) {
            if (this.V0 == null) {
                Context applicationContext = getApplicationContext();
                jo.p.g(applicationContext, "applicationContext");
                this.V0 = new xb.h0(applicationContext, jo.p.c(O0().I0().f(), Boolean.TRUE), n1());
            }
            xb.h0 h0Var = this.V0;
            if (h0Var != null) {
                h0Var.q(p0Var.a());
            }
            uo.l.d(this, null, null, new s0(null), 3, null);
        } else {
            F0();
        }
        dq.c.c().l(new nd.l());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.p pVar) {
        String string;
        jo.p.h(pVar, "event");
        if (jo.p.c(pVar.b(), "CastService")) {
            if (this.R0 == null) {
                O1();
            }
            if (n1().i5()) {
                RTCManager rTCManager = this.R0;
                if (rTCManager != null && rTCManager.isRejectUser(pVar.a().getUserId())) {
                    return;
                }
                N0().n(O0().S().f(), pVar.a().getUserId());
                if (pVar.a().isReconnect()) {
                    uo.l.d(this, null, null, new n0(pVar, null), 3, null);
                    return;
                }
                Integer collabType = pVar.a().getCollabType();
                int rawValue = CollabType.LIVE.getRawValue();
                if (collabType != null && collabType.intValue() == rawValue) {
                    string = getString(xb.r.text_collab_request_type_streaming, new Object[]{pVar.a().getUserName()});
                } else {
                    string = getString(xb.r.text_collab_request_type_talk, new Object[]{pVar.a().getUserName()});
                }
                jo.p.g(string, "if (event.collabRequest.…quest.userName)\n        }");
                X1(m4.f55225k.a(Y0(), string, pVar.a()));
            }
        }
    }

    @dq.l
    public final void onEvent(t.b bVar) {
        jo.p.h(bVar, "event");
        ec.z zVar = this.f22726w0;
        if (zVar != null) {
            zVar.a0();
        }
        ec.z zVar2 = this.f22726w0;
        if (zVar2 != null) {
            zVar2.x0();
        }
        ec.z zVar3 = this.f22726w0;
        if (zVar3 != null) {
            zVar3.v0();
        }
        t2(UnityReceiverKt.EMOMO);
    }

    @dq.l
    public final void onEvent(t.a aVar) {
        jo.p.h(aVar, "event");
        ec.z zVar = this.f22726w0;
        if (zVar != null) {
            if (n1().g0()) {
                zVar.w0();
            }
            zVar.y0();
            zVar.v0();
        }
        t2("braodcasting");
    }

    @dq.l
    public final void onEvent(t.e eVar) {
        jo.p.h(eVar, "event");
        this.f22723t0 = true;
        ec.z zVar = this.f22726w0;
        if (zVar != null) {
            zVar.a0();
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.f fVar) {
        jo.p.h(fVar, "event");
        if (jo.p.c(fVar.a(), "CastService")) {
            f4.a aVar = f4.f54931p;
            String Y02 = Y0();
            String userName = fVar.b().getUserName();
            String userId = fVar.b().getUserId();
            String string = getResources().getString(xb.r.text_collab_end_comm, fVar.b().getUserName());
            jo.p.g(string, "resources.getString(R.st… event.response.userName)");
            X1(aVar.b(Y02, userName, userId, string, 14, fVar.b().getProfileImageUrl(), fVar.b().getBadgeImageUrl()));
            N0().L(fVar.b().getUserId());
            RTCManager rTCManager = this.R0;
            if (rTCManager != null) {
                rTCManager.disconnect(fVar.b().getUserId());
            }
        }
    }

    @dq.l
    public final void onEvent(t.d dVar) {
        ec.z zVar;
        jo.p.h(dVar, "event");
        this.f22723t0 = false;
        if (!n1().g0() || (zVar = this.f22726w0) == null) {
            return;
        }
        zVar.w0();
    }

    @dq.l
    public final void onEvent(t.h hVar) {
        jo.p.h(hVar, "event");
        GiftRankingTopUser giftRankingTopUser = this.f22725v0;
        if (giftRankingTopUser != null) {
            dq.c.c().l(new w.a(giftRankingTopUser));
        }
    }

    @dq.l
    public final void onEvent(t.j jVar) {
        jo.p.h(jVar, "event");
        ec.z zVar = this.f22726w0;
        if (zVar != null) {
            zVar.a0();
        }
    }

    @dq.l
    public final void onEvent(t.k kVar) {
        ec.z zVar;
        jo.p.h(kVar, "event");
        if (!n1().g0() || (zVar = this.f22726w0) == null) {
            return;
        }
        zVar.w0();
    }

    @dq.l
    public final void onEvent(nd.o oVar) {
        jo.p.h(oVar, "event");
        if (n1().w1()) {
            return;
        }
        u2(true);
        this.Q0 = true;
    }

    @dq.l
    public final void onEvent(nd.p pVar) {
        jo.p.h(pVar, "event");
        if (this.Q0) {
            u2(false);
            this.Q0 = false;
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.n nVar) {
        RTCManager rTCManager;
        jo.p.h(nVar, "event");
        if (!jo.p.c(nVar.a(), "CastService") || jo.p.c(t1().T4(), nVar.c()) || (rTCManager = this.R0) == null) {
            return;
        }
        rTCManager.receiveMessage(nVar.c(), nVar.b());
    }

    @dq.l
    public final void onEvent(t.g gVar) {
        jo.p.h(gVar, "event");
        ec.z zVar = this.f22726w0;
        if (zVar != null) {
            zVar.Y();
        }
        xb.h0 h0Var = this.V0;
        if (h0Var == null) {
            return;
        }
        h0Var.p(true);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.f0 f0Var) {
        String liveComment;
        String speech;
        jo.p.h(f0Var, "event");
        if (jo.p.c(f0Var.b(), "CastService")) {
            String str = "";
            if (!Z0().W0() ? (liveComment = f0Var.a().getLiveComment()) != null : (liveComment = of.n.f45411a.i(f0Var.a().getLiveComment())) != null) {
                str = liveComment;
            }
            if (Z0().W0()) {
                speech = of.n.f45411a.i(f0Var.a().getSpeech());
            } else {
                speech = f0Var.a().getSpeech();
            }
            xb.h0 h0Var = this.V0;
            if (h0Var != null && speech != null && h0Var != null) {
                h0Var.h(speech);
            }
            this.E0.put(f0Var.a().getUserId(), str);
            X1(f4.f54931p.a(Y0(), f0Var.a(), str));
            if (i1().i(f0Var.a().getUserId())) {
                return;
            }
            this.A0++;
        }
    }

    @dq.l
    public final void onEvent(t.f fVar) {
        jo.p.h(fVar, "event");
        ec.z zVar = this.f22726w0;
        if (zVar != null) {
            zVar.v0();
        }
        xb.h0 h0Var = this.V0;
        if (h0Var == null) {
            return;
        }
        h0Var.p(false);
    }

    @dq.l
    public final void onEvent(t.i iVar) {
        jo.p.h(iVar, "event");
        ec.z zVar = this.f22726w0;
        if (zVar != null) {
            if (n1().g0()) {
                zVar.w0();
            }
            zVar.y0();
            zVar.v0();
        }
        t2("braodcasting");
    }

    @dq.l
    public final void onEvent(ce.s sVar) {
        jo.p.h(sVar, "event");
        S0().f(new gc.m(this, Q0().E()));
    }

    @dq.l
    public final void onEvent(w.b bVar) {
        jo.p.h(bVar, "event");
        E0();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(l.o oVar) {
        jo.p.h(oVar, "event");
        if (jo.p.c(oVar.a(), "CastService")) {
            X1(l4.f55173j.a(oVar.b().getLiveId(), oVar.b().getUserName(), oVar.b().getUserId(), oVar.b().getLiveComment(), oVar.b().getProfileImageUrl(), oVar.b().getBadgeImageUrl()));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.b bVar) {
        String speech;
        String speech2;
        jo.p.h(bVar, "event");
        if (jo.p.c(bVar.b(), "CastService")) {
            if (Z0().W0()) {
                speech = of.n.f45411a.i(bVar.a().getSpeech());
                if (speech == null) {
                    speech = "";
                }
            } else {
                speech = bVar.a().getSpeech();
            }
            if (Z0().W0()) {
                speech2 = of.n.f45411a.i(bVar.a().getSpeech());
            } else {
                speech2 = bVar.a().getSpeech();
            }
            xb.h0 h0Var = this.V0;
            if (h0Var != null && speech2 != null && h0Var != null) {
                h0Var.h(speech2);
            }
            this.E0.put(bVar.a().getUserId(), speech);
            X1(c4.f54835r.a(Y0(), bVar.a()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    @dq.l(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void on(ce.l.m0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            jo.p.h(r6, r0)
            java.lang.String r0 = r6.b()
            java.lang.String r1 = "CastService"
            boolean r0 = jo.p.c(r0, r1)
            if (r0 != 0) goto L12
            return
        L12:
            com.dena.mirrorman.net.bcsvr.response.Comment r0 = r6.a()
            java.lang.String r0 = r0.getLiveComment()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L29
            com.dena.mirrorman.net.bcsvr.response.Comment r0 = r6.a()
            java.lang.String r0 = r0.getLiveComment()
            goto L66
        L29:
            com.dena.mirrorman.net.bcsvr.response.Comment r0 = r6.a()
            java.lang.String r0 = r0.getLinkedLiveOwnerName()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L42
            int r0 = r0.length()
            if (r0 <= 0) goto L3d
            r0 = r1
            goto L3e
        L3d:
            r0 = r2
        L3e:
            if (r0 != r1) goto L42
            r0 = r1
            goto L43
        L42:
            r0 = r2
        L43:
            if (r0 == 0) goto L5c
            android.content.res.Resources r0 = r5.getResources()
            int r3 = xb.r.f60081k1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.dena.mirrorman.net.bcsvr.response.Comment r4 = r6.a()
            java.lang.String r4 = r4.getLinkedLiveOwnerName()
            r1[r2] = r4
            java.lang.String r0 = r0.getString(r3, r1)
            goto L66
        L5c:
            android.content.res.Resources r0 = r5.getResources()
            int r1 = xb.r.f60083l1
            java.lang.String r0 = r0.getString(r1)
        L66:
            com.dena.mirrorman.net.bcsvr.response.Comment r1 = r6.a()
            java.lang.String r1 = r1.getSpeech()
            xb.h0 r2 = r5.V0
            if (r2 == 0) goto L79
            if (r1 == 0) goto L79
            if (r2 == 0) goto L79
            r2.h(r1)
        L79:
            com.dena.mirrorman.net.bcsvr.response.Comment r1 = r6.a()
            int r1 = r1.getYellRank()
            if (r1 <= 0) goto L92
            ud.h4$a r1 = ud.h4.f55003m
            java.lang.String r2 = r5.Y0()
            com.dena.mirrorman.net.bcsvr.response.Comment r6 = r6.a()
            ud.h4 r6 = r1.a(r2, r6, r0)
            goto La0
        L92:
            ud.f4$a r1 = ud.f4.f54931p
            java.lang.String r2 = r5.Y0()
            com.dena.mirrorman.net.bcsvr.response.Comment r6 = r6.a()
            ud.f4 r6 = r1.a(r2, r6, r0)
        La0:
            r5.X1(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.CastService.on(ce.l$m0):void");
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.m1 m1Var) {
        String string;
        jo.p.h(m1Var, "event");
        if (jo.p.c(m1Var.b(), "CastService")) {
            if (!TextUtils.isEmpty(m1Var.a().getLiveComment())) {
                string = m1Var.a().getLiveComment();
            } else {
                string = getResources().getString(xb.r.text_followed_you);
            }
            X1(f4.f54931p.a(Y0(), m1Var.a(), string));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.q qVar) {
        jo.p.h(qVar, "event");
        if (jo.p.c(qVar.a(), "CastService")) {
            String string = getResources().getString(xb.r.text_matching_collab_start_comment, qVar.b().getUserName());
            jo.p.g(string, "resources.getString(R.st… event.response.userName)");
            X1(f4.f54931p.b(Y0(), qVar.b().getUserName(), qVar.b().getUserId(), string, 87, qVar.b().getProfileImageUrl(), ""));
            xb.h0 h0Var = this.V0;
            if (h0Var != null) {
                h0Var.h(string);
            }
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.g gVar) {
        jo.p.h(gVar, "event");
        if (jo.p.c(gVar.a(), "CastService")) {
            i4 a10 = i4.f55022j.a(this, Y0(), gVar.b().getUserId(), gVar.b().getUserName(), gVar.b().getProfileImageUrl());
            X1(a10);
            xb.h0 h0Var = this.V0;
            if (h0Var != null) {
                h0Var.h(a10.h());
            }
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.t0 t0Var) {
        jo.p.h(t0Var, "event");
        X1(g4.f54968j.a(this, Y0(), t0Var.b().getLiveComment(), 123456));
        xb.h0 h0Var = this.V0;
        if (h0Var != null) {
            h0Var.h(t0Var.b().getSpeech());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.m mVar) {
        jo.p.h(mVar, "event");
        X1(g4.f54968j.a(this, Y0(), mVar.b().getLiveComment(), 123456));
        xb.h0 h0Var = this.V0;
        if (h0Var != null) {
            h0Var.h(mVar.b().getSpeech());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.j1 j1Var) {
        jo.p.h(j1Var, "event");
        if (jo.p.c(j1Var.a(), "CastService")) {
            X1(s4.f55489j.a(this, Y0(), String.valueOf(j1Var.b().getUserId()), j1Var.b().getName(), j1Var.b().getProfileImageUrl()));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.a0 a0Var) {
        List<jf.u> f10;
        boolean z10;
        boolean z11;
        Object obj;
        boolean z12;
        jo.p.h(a0Var, "event");
        if (jo.p.c(a0Var.a(), "CastService") && (f10 = O0().l0().f()) != null) {
            if (!f10.isEmpty()) {
                for (jf.u uVar : f10) {
                    if (uVar.e() == a0Var.b().getEventId() && uVar.o() == a0Var.b().isAppEvent()) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        z11 = false;
                        break;
                    }
                }
            }
            z11 = true;
            if (z11) {
                N0().s(Y0());
                return;
            }
            Iterator<T> it = f10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                jf.u uVar2 = (jf.u) obj;
                if (uVar2.e() == a0Var.b().getEventId() && uVar2.o() == a0Var.b().isAppEvent()) {
                    z12 = true;
                    continue;
                } else {
                    z12 = false;
                    continue;
                }
                if (z12) {
                    break;
                }
            }
            if (((jf.u) obj) != null) {
                N0().Y(a0Var.b());
            }
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.x xVar) {
        jo.p.h(xVar, "event");
        if (jo.p.c(xVar.a(), "CastService")) {
            N0().s(Y0());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.y0 y0Var) {
        jo.p.h(y0Var, "event");
        if (jo.p.c(y0Var.a(), "CastService")) {
            g4.a aVar = g4.f54968j;
            String Y02 = Y0();
            String string = getString(xb.r.text_app_mutual_gift_achieved_streamer);
            jo.p.g(string, "getString(R.string.text_…l_gift_achieved_streamer)");
            X1(g4.a.b(aVar, this, Y02, string, 0, 8, null));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.s0 s0Var) {
        jo.p.h(s0Var, "event");
        if (jo.p.c(s0Var.a(), "CastService")) {
            String speech = s0Var.b().getSpeech();
            String string = getResources().getString(xb.r.N, s0Var.b().getUserName(), s0Var.b().getRewardTitle());
            jo.p.g(string, "resources.getString(R.st…ent.response.rewardTitle)");
            X1(r4.f55442l.a(Y0(), s0Var.b().getUserId(), s0Var.b().getUserName(), string, s0Var.b().getProfileImageUrl(), s0Var.b().getRewardTitle(), s0Var.b().getRewardImageUrl()));
            xb.h0 h0Var = this.V0;
            if (h0Var == null || speech == null || h0Var == null) {
                return;
            }
            h0Var.h(speech);
        }
    }
}
