package com.dena.mirrativ.player;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Size;
import android.view.Surface;
import b3.j;
import ce.k;
import ce.l;
import ce.y;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.player.PlayerService;
import com.dena.mirrorman.activity.MainActivity;
import com.dena.mirrorman.clientlog.logs.DurationFromPlayStartLog;
import com.dena.mirrorman.clientlog.logs.EventBannerActionType;
import com.dena.mirrorman.clientlog.logs.EventBannerLog;
import com.dena.mirrorman.clientlog.logs.Live;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.clientlog.logs.ResponseTimeLogTargetType;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.live.LinkedLive;
import com.dena.mirrorman.net.api.response.live.LivePolling;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import com.dena.mirrorman.net.bcsvr.BcsvrAddress;
import com.dena.mirrorman.net.bcsvr.BcsvrChannel;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.dena.showroom.flvplayback.RTMPEndpoint;
import com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayer;
import com.dena.showroom.flvplayback.higherLevel.RTMPStreamEndpoint;
import com.dena.showroom.flvplayback.impl.net.AsyncSecureSocket;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.video.VideoListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.metrics.Trace;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import com.mirrativ.llstream.subscribe.DecodeErrorInfo;
import com.mirrativ.llstream.subscribe.LLStreamingPlayer;
import com.mirrativ.llstream.subscribe.LLStreamingPlayerCallback;
import com.mirrativ.llstream.subscribe.StreamEndpoint;
import hb.b2;
import hb.p1;
import hb.z1;
import hf.v0;
import java.net.URI;
import java.nio.channels.UnresolvedAddressException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import jo.f0;
import kotlin.KotlinNothingValueException;
import nd.i1;
import nd.j1;
import oe.b;
import oq.a;
import org.greenrobot.eventbus.ThreadMode;
import tb.c;
import ud.a3;
import ud.b3;
import ud.c3;
import ud.q2;
import ud.r2;
import ud.s2;
import ud.t2;
import ud.w2;
import ud.x2;
import ud.z2;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.q0;
import uo.r0;
import xn.n0;

/* loaded from: classes2.dex */
public final class PlayerService extends androidx.lifecycle.y implements oq.a, q0, te.d {

    /* renamed from: t0  reason: collision with root package name */
    public static final a f22427t0 = new a(null);

    /* renamed from: u0  reason: collision with root package name */
    public static final int f22428u0 = 8;
    public final wn.f A;
    public final wn.f B;
    public final wn.f C;
    public final wn.f D;
    public final wn.f E;
    public final wn.f F;
    public final wn.f G;
    public final wn.f H;
    public final wn.f I;
    public final wn.f J;
    public final wn.f K;
    public final wn.f L;
    public final wn.f M;
    public final wn.f N;
    public final wn.f O;
    public final wn.f P;
    public final wn.f Q;
    public g R;
    public long S;
    public k.b T;
    public Player.EventListener U;
    public VideoListener V;
    public boolean W;
    public Long X;
    public LLStreamingPlayer Y;
    public e Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f22429a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f22430b0;

    /* renamed from: c0  reason: collision with root package name */
    public long f22431c0;

    /* renamed from: d0  reason: collision with root package name */
    public SimpleExoPlayer f22432d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f22433e0;

    /* renamed from: f0  reason: collision with root package name */
    public Handler f22434f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f22435g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f22436h0;

    /* renamed from: i0  reason: collision with root package name */
    public te.c f22437i0;

    /* renamed from: j0  reason: collision with root package name */
    public Runnable f22438j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f22439k0;

    /* renamed from: l0  reason: collision with root package name */
    public long f22440l0;

    /* renamed from: m0  reason: collision with root package name */
    public long f22441m0;

    /* renamed from: n0  reason: collision with root package name */
    public Surface f22442n0;

    /* renamed from: o0  reason: collision with root package name */
    public long f22443o0;

    /* renamed from: p0  reason: collision with root package name */
    public LiveStreamPlayer f22444p0;

    /* renamed from: q0  reason: collision with root package name */
    public f f22445q0;

    /* renamed from: r0  reason: collision with root package name */
    public long f22446r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f22447s0;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ q0 f22448x = r0.b();

    /* renamed from: y  reason: collision with root package name */
    public final ao.g f22449y;

    /* renamed from: z  reason: collision with root package name */
    public final wn.f f22450z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context) {
            jo.p.h(context, "context");
            return new Intent(context, PlayerService.class);
        }

        public final Intent b(Context context, g gVar, te.c cVar) {
            jo.p.h(context, "context");
            Intent intent = new Intent(context, PlayerService.class);
            intent.setAction("com.dena.mirrorman.playerservice.action.PLAY");
            intent.putExtra("EXTRA_PLAYER_ENDPOINT", gVar);
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_PLAY_REQUEST_PARAMS", cVar);
            wn.v vVar = wn.v.f59242a;
            intent.putExtra("EXTRA_PLAY_REQUEST_PARAMS", bundle);
            return intent;
        }

        public final te.c c(Intent intent) {
            jo.p.h(intent, "intent");
            Bundle bundleExtra = intent.getBundleExtra("EXTRA_PLAY_REQUEST_PARAMS");
            if (bundleExtra != null) {
                return (te.c) bundleExtra.getParcelable("EXTRA_PLAY_REQUEST_PARAMS");
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends jo.q implements io.a<nf.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22451w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22452x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22453y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22451w = aVar;
            this.f22452x = aVar2;
            this.f22453y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.k, java.lang.Object] */
        @Override // io.a
        public final nf.k invoke() {
            xq.a b10;
            oq.a aVar = this.f22451w;
            vq.a aVar2 = this.f22452x;
            io.a<? extends uq.a> aVar3 = this.f22453y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(nf.k.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public g f22454a;

        /* renamed from: b  reason: collision with root package name */
        public te.e f22455b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ PlayerService f22456c;

        public b(PlayerService playerService, g gVar, te.e eVar) {
            jo.p.h(gVar, "url");
            jo.p.h(eVar, "state");
            this.f22456c = playerService;
            this.f22454a = gVar;
            this.f22455b = eVar;
        }

        public final te.e a() {
            return this.f22455b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends jo.q implements io.a<hf.s> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22457w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22458x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22459y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22457w = aVar;
            this.f22458x = aVar2;
            this.f22459y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.s, java.lang.Object] */
        @Override // io.a
        public final hf.s invoke() {
            xq.a b10;
            oq.a aVar = this.f22457w;
            vq.a aVar2 = this.f22458x;
            io.a<? extends uq.a> aVar3 = this.f22459y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(hf.s.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public final class c implements Player.EventListener {

        /* renamed from: w  reason: collision with root package name */
        public final te.d f22460w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ PlayerService f22461x;

        public c(PlayerService playerService, te.d dVar) {
            jo.p.h(dVar, "listener");
            this.f22461x = playerService;
            this.f22460w = dVar;
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerError(ExoPlaybackException exoPlaybackException) {
            jo.p.h(exoPlaybackException, i7.e.f36387u);
            g9.a.g("error -> failed");
            this.f22460w.h(exoPlaybackException);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerStateChanged(boolean z10, int i10) {
            if (i10 == 1) {
                g9.a.g("state:idle");
                this.f22460w.h(null);
            } else if (i10 == 2) {
                g9.a.g("state:buffering");
                this.f22460w.onLoadingBegan();
            } else if (i10 != 3) {
                if (i10 != 4) {
                    return;
                }
                g9.a.g("state:ended");
                this.f22460w.h(null);
            } else {
                this.f22460w.f(null);
                if (this.f22461x.f22432d0 != null && this.f22461x.o0()) {
                    g9.a.g("state:ready(playing)");
                } else {
                    g9.a.g("state:ready(pause)");
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends jo.q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22462w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22463x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22464y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22462w = aVar;
            this.f22463x = aVar2;
            this.f22464y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            xq.a b10;
            oq.a aVar = this.f22462w;
            vq.a aVar2 = this.f22463x;
            io.a<? extends uq.a> aVar3 = this.f22464y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(nf.o.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public final class d implements VideoListener {

        /* renamed from: w  reason: collision with root package name */
        public final te.d f22465w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ PlayerService f22466x;

        public d(PlayerService playerService, te.d dVar) {
            jo.p.h(dVar, "listener");
            this.f22466x = playerService;
            this.f22465w = dVar;
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public void onRenderedFirstFrame() {
            String liveId;
            this.f22466x.S = System.currentTimeMillis() - this.f22466x.f22441m0;
            vd.b.f57299a.c("click_play");
            te.c cVar = this.f22466x.f22437i0;
            if (cVar != null && (liveId = cVar.getLiveId()) != null) {
                Puree.d(new Live.RenderStart(liveId, this.f22466x.S, TopicConstant.PACKET_TYPE_HLS));
            }
            dq.c.c().l(y.b.f19499a);
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
            g9.a.g("video size changed : " + i10 + " / " + i11);
            this.f22465w.d(new Size(i10, i11));
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22467w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22468x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22469y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22467w = aVar;
            this.f22468x = aVar2;
            this.f22469y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            xq.a b10;
            oq.a aVar = this.f22467w;
            vq.a aVar2 = this.f22468x;
            io.a<? extends uq.a> aVar3 = this.f22469y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(tb.c.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public final class e implements LLStreamingPlayerCallback {

        /* renamed from: a  reason: collision with root package name */
        public final te.d f22470a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22471b;

        /* renamed from: c  reason: collision with root package name */
        public int f22472c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ PlayerService f22473d;

        public e(PlayerService playerService, te.d dVar) {
            jo.p.h(dVar, "listener");
            this.f22473d = playerService;
            this.f22470a = dVar;
            this.f22471b = 5;
        }

        @Override // com.mirrativ.llstream.subscribe.LLStreamingPlayerCallback
        public boolean continuesToRetry(LLStreamingPlayer lLStreamingPlayer, Throwable th2) {
            if (lLStreamingPlayer == null || th2 == null) {
                return false;
            }
            return this.f22470a.m(th2);
        }

        @Override // com.mirrativ.llstream.subscribe.LLStreamingPlayerCallback
        public void onAudioLoaded(byte[] bArr) {
            this.f22470a.onAudioLoaded(bArr);
        }

        @Override // com.mirrativ.llstream.subscribe.LLStreamingPlayerCallback
        public void onError(Throwable th2) {
            this.f22470a.onError(th2);
        }

        @Override // com.mirrativ.llstream.subscribe.LLStreamingPlayerCallback
        public void onLoadingBegan(LLStreamingPlayer lLStreamingPlayer) {
            this.f22472c = 0;
            this.f22470a.onLoadingBegan();
        }

        @Override // com.mirrativ.llstream.subscribe.LLStreamingPlayerCallback
        public void onLoadingEnded(LLStreamingPlayer lLStreamingPlayer, Throwable th2) {
            this.f22470a.f(th2);
        }

        @Override // com.mirrativ.llstream.subscribe.LLStreamingPlayerCallback
        public void onPlaybackFailed(LLStreamingPlayer lLStreamingPlayer, Throwable th2) {
            if ((lLStreamingPlayer != null ? lLStreamingPlayer.getDecodeErrorInfo() : null) != null && !this.f22473d.f22447s0) {
                MRLogger c02 = this.f22473d.c0();
                MRLog.Companion companion = MRLog.Companion;
                PlayerService playerService = this.f22473d;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LLSTREAM_DECODE_ERROR);
                builder.setTargetType(MRLog.TARGET_TYPE_LIVE);
                te.c cVar = playerService.f22437i0;
                builder.setTargetId(cVar != null ? cVar.getLiveId() : null);
                wn.k[] kVarArr = new wn.k[1];
                xm.e b10 = new xm.f().e(xm.c.LOWER_CASE_WITH_UNDERSCORES).b();
                wn.k[] kVarArr2 = new wn.k[3];
                DecodeErrorInfo decodeErrorInfo = lLStreamingPlayer.getDecodeErrorInfo();
                kVarArr2[0] = wn.q.a(TopicConstant.EXTEND_AVC_SPS, String.valueOf(decodeErrorInfo != null ? decodeErrorInfo.getSps() : null));
                DecodeErrorInfo decodeErrorInfo2 = lLStreamingPlayer.getDecodeErrorInfo();
                kVarArr2[1] = wn.q.a(TopicConstant.EXTEND_AVC_PPS, String.valueOf(decodeErrorInfo2 != null ? decodeErrorInfo2.getPps() : null));
                kVarArr2[2] = wn.q.a("streamKey", lLStreamingPlayer.getEndpoint().getStreamKey());
                kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, b10.s(n0.h(kVarArr2)));
                builder.setPayload(xn.s.p(kVarArr));
                c02.sendLog(builder.build());
                this.f22473d.f22447s0 = true;
            }
            this.f22470a.h(th2);
        }

        @Override // com.mirrativ.llstream.subscribe.LLStreamingPlayerCallback
        public void onVideoRendered(int i10) {
            if (this.f22472c < this.f22471b) {
                this.f22470a.onVideoRendered(i10);
                this.f22472c++;
            }
        }

        @Override // com.mirrativ.llstream.subscribe.LLStreamingPlayerCallback
        public void onVideoSizeChanged(LLStreamingPlayer lLStreamingPlayer, Size size) {
            this.f22470a.d(size);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0 extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22474w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22475x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22476y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22474w = aVar;
            this.f22475x = aVar2;
            this.f22476y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            xq.a b10;
            oq.a aVar = this.f22474w;
            vq.a aVar2 = this.f22475x;
            io.a<? extends uq.a> aVar3 = this.f22476y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(MRLogger.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public final class f implements LiveStreamPlayer.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final te.d f22477a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ PlayerService f22478b;

        public f(PlayerService playerService, te.d dVar) {
            jo.p.h(dVar, "listener");
            this.f22478b = playerService;
            this.f22477a = dVar;
        }

        @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayer.Callback
        public boolean continuesToRetry(LiveStreamPlayer liveStreamPlayer, Throwable th2) {
            if (liveStreamPlayer == null || th2 == null) {
                return false;
            }
            return this.f22477a.m(th2);
        }

        @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayer.Callback
        public void onAudioLoaded(byte[] bArr) {
            this.f22477a.onAudioLoaded(bArr);
        }

        @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayer.Callback
        public void onError(Throwable th2) {
            this.f22477a.onError(th2);
        }

        @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayerObserver
        public void onLoadingBegan(LiveStreamPlayer liveStreamPlayer) {
            this.f22477a.onLoadingBegan();
        }

        @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayerObserver
        public void onLoadingEnded(LiveStreamPlayer liveStreamPlayer, Throwable th2) {
            this.f22477a.f(th2);
        }

        @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayerObserver
        public void onPlaybackFailed(LiveStreamPlayer liveStreamPlayer, Throwable th2) {
            this.f22477a.h(th2);
        }

        @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayer.Callback
        public void onVideoRendered(int i10) {
            this.f22477a.onVideoRendered(i10);
        }

        @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayerObserver
        public void onVideoSizeChanged(LiveStreamPlayer liveStreamPlayer, com.dena.showroom.flvplayback.Size size) {
            if (size != null) {
                this.f22477a.d(new Size(size.getWidth(), size.getHeight()));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements Parcelable {

        /* renamed from: w  reason: collision with root package name */
        public final Uri f22479w;

        /* renamed from: x  reason: collision with root package name */
        public final Uri f22480x;

        /* renamed from: y  reason: collision with root package name */
        public final Uri f22481y;

        /* renamed from: z  reason: collision with root package name */
        public final Uri f22482z;
        public static final a A = new a(null);
        public static final Parcelable.Creator<g> CREATOR = new b();
        public static final int B = 8;

        /* loaded from: classes2.dex */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(jo.h hVar) {
                this();
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final g createFromParcel(Parcel parcel) {
                jo.p.h(parcel, "parcel");
                return new g((Uri) parcel.readParcelable(g.class.getClassLoader()), (Uri) parcel.readParcelable(g.class.getClassLoader()), (Uri) parcel.readParcelable(g.class.getClassLoader()), (Uri) parcel.readParcelable(g.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Uri uri, Uri uri2, Uri uri3, Uri uri4) {
            this.f22479w = uri;
            this.f22480x = uri2;
            this.f22481y = uri3;
            this.f22482z = uri4;
        }

        public final boolean a() {
            String uri;
            Uri uri2 = this.f22482z;
            return (uri2 == null || (uri = uri2.toString()) == null || uri.length() <= 0) ? false : true;
        }

        public final boolean b() {
            String uri;
            Uri uri2 = this.f22480x;
            return (uri2 == null || (uri = uri2.toString()) == null || uri.length() <= 0) ? false : true;
        }

        public final boolean c() {
            String uri;
            Uri uri2 = this.f22479w;
            return (uri2 == null || (uri = uri2.toString()) == null || uri.length() <= 0) ? false : true;
        }

        public final Uri d() {
            return this.f22482z;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Uri e() {
            return this.f22481y;
        }

        public final Uri f() {
            return this.f22480x;
        }

        public final Uri g() {
            return this.f22479w;
        }

        public final String h() {
            return b() ? (String) so.o.r0(String.valueOf(this.f22480x), new String[]{"/"}, false, 0, 6, null).get(4) : c() ? (String) so.o.r0(String.valueOf(this.f22479w), new String[]{"/"}, false, 0, 6, null).get(4) : a() ? (String) so.o.r0(String.valueOf(this.f22482z), new String[]{"/"}, false, 0, 6, null).get(4) : "";
        }

        public final Uri i() {
            if (b()) {
                return this.f22480x;
            }
            if (c()) {
                return this.f22479w;
            }
            if (a()) {
                return this.f22482z;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            jo.p.h(parcel, "out");
            parcel.writeParcelable(this.f22479w, i10);
            parcel.writeParcelable(this.f22480x, i10);
            parcel.writeParcelable(this.f22481y, i10);
            parcel.writeParcelable(this.f22482z, i10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<mf.a<PlayerService>> {
        public h() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final mf.a<PlayerService> invoke() {
            return new mf.a<>(PlayerService.this);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerService$onCreate$1", f = "PlayerService.kt", l = {1645}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22484w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22485x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22486y;

        /* renamed from: z  reason: collision with root package name */
        public int f22487z;

        public i(ao.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x008c, TryCatch #1 {all -> 0x008c, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0068, B:22:0x0073, B:24:0x0079), top: B:37:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
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
                int r1 = r9.f22487z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f22486y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f22485x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f22484w
                com.dena.mirrativ.player.PlayerService r4 = (com.dena.mirrativ.player.PlayerService) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L8f
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
                com.dena.mirrativ.player.PlayerService r10 = com.dena.mirrativ.player.PlayerService.this
                nf.h r10 = com.dena.mirrativ.player.PlayerService.r(r10)
                wo.x r3 = r10.t()
                com.dena.mirrativ.player.PlayerService r10 = com.dena.mirrativ.player.PlayerService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L8f
                r4 = r10
                r10 = r9
            L3d:
                r10.f22484w = r4     // Catch: java.lang.Throwable -> L8f
                r10.f22485x = r3     // Catch: java.lang.Throwable -> L8f
                r10.f22486y = r1     // Catch: java.lang.Throwable -> L8f
                r10.f22487z = r2     // Catch: java.lang.Throwable -> L8f
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L8f
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
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L8c
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L8c
                if (r10 == 0) goto L86
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L8c
                jf.j r10 = (jf.j) r10     // Catch: java.lang.Throwable -> L8c
                com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayer r6 = com.dena.mirrativ.player.PlayerService.B(r5)     // Catch: java.lang.Throwable -> L8c
                if (r6 == 0) goto L73
                boolean r7 = r10.h()     // Catch: java.lang.Throwable -> L8c
                java.lang.Boolean r7 = co.b.a(r7)     // Catch: java.lang.Throwable -> L8c
                r6.setMute(r7)     // Catch: java.lang.Throwable -> L8c
            L73:
                com.mirrativ.llstream.subscribe.LLStreamingPlayer r6 = com.dena.mirrativ.player.PlayerService.v(r5)     // Catch: java.lang.Throwable -> L8c
                if (r6 == 0) goto L80
                boolean r10 = r10.h()     // Catch: java.lang.Throwable -> L8c
                r6.setMute(r10)     // Catch: java.lang.Throwable -> L8c
            L80:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L86:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L8c:
                r10 = move-exception
                r3 = r4
                goto L90
            L8f:
                r10 = move-exception
            L90:
                throw r10     // Catch: java.lang.Throwable -> L91
            L91:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerService.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerService$onCreate$2", f = "PlayerService.kt", l = {1645}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22488w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22489x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22490y;

        /* renamed from: z  reason: collision with root package name */
        public int f22491z;

        public j(ao.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
            r8 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00f2, code lost:
            r13 = true;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x010c, TryCatch #1 {all -> 0x010c, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0070, B:24:0x007c, B:26:0x0083, B:28:0x0087, B:40:0x00b7, B:31:0x008f, B:32:0x0093, B:34:0x0099, B:41:0x00be, B:43:0x00c4, B:45:0x00c8, B:56:0x00f6, B:48:0x00d0, B:49:0x00d4, B:51:0x00da, B:58:0x0100), top: B:72:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0106  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 278
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerService.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerService$onCreate$3", f = "PlayerService.kt", l = {471}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22492w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerService f22494w;

            public a(PlayerService playerService) {
                this.f22494w = playerService;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f22494w.f22439k0 = false;
                this.f22494w.stopSelf();
                this.f22494w.O0(true);
                return wn.v.f59242a;
            }
        }

        public k(ao.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22492w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<wn.v> X0 = PlayerService.this.f0().X0();
                a aVar = new a(PlayerService.this);
                this.f22492w = 1;
                if (X0.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.player.PlayerService$onCreate$5", f = "PlayerService.kt", l = {502}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22495w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerService f22497w;

            public a(PlayerService playerService) {
                this.f22497w = playerService;
            }

            public final Object a(int i10, ao.d<? super wn.v> dVar) {
                if (i10 == 1) {
                    this.f22497w.O0(true);
                }
                return wn.v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Integer num, ao.d dVar) {
                return a(num.intValue(), dVar);
            }
        }

        public l(ao.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new l(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22495w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<Integer> u10 = PlayerService.this.Y().u();
                a aVar = new a(PlayerService.this);
                this.f22495w = 1;
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
    public static final class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PlayerService playerService = PlayerService.this;
            playerService.v0(this, playerService.W);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerService$postPolling$1", f = "PlayerService.kt", l = {1334}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ Runnable A;
        public final /* synthetic */ long B;
        public final /* synthetic */ jo.a0 C;

        /* renamed from: w  reason: collision with root package name */
        public int f22499w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ te.c f22501y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ jo.c0 f22502z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(te.c cVar, jo.c0 c0Var, Runnable runnable, long j10, jo.a0 a0Var, ao.d<? super n> dVar) {
            super(2, dVar);
            this.f22501y = cVar;
            this.f22502z = c0Var;
            this.A = runnable;
            this.B = j10;
            this.C = a0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new n(this.f22501y, this.f22502z, this.A, this.B, this.C, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((n) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22499w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest g02 = PlayerService.this.g0();
                    String liveId = this.f22501y.getLiveId();
                    String liveUserKey = this.f22501y.getLiveUserKey();
                    Integer d10 = co.b.d(this.f22502z.f38129w);
                    this.f22499w = 1;
                    obj = g02.pollingRequest(Referer.LIVE_VIEW, liveId, liveUserKey, d10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                LivePolling livePolling = (LivePolling) obj;
                if (jo.p.c(this.f22501y.getLiveId(), livePolling.getLiveId())) {
                    if (!livePolling.isLive()) {
                        if (PlayerService.this.X == null) {
                            PlayerService.this.X = co.b.e(System.currentTimeMillis());
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            Long l10 = PlayerService.this.X;
                            jo.p.e(l10);
                            if (currentTimeMillis - l10.longValue() > 90000) {
                                PlayerService.this.O0(true);
                                return wn.v.f59242a;
                            }
                        }
                    }
                    PlayerService.this.f22436h0 = livePolling.isLive();
                    this.f22501y.setTotalViewerNum(livePolling.getTotalViewerNum());
                    this.f22501y.setTitle(livePolling.getTitle());
                    this.f22501y.setApp(livePolling.getApp());
                    te.c cVar = this.f22501y;
                    String moderatorUserId = livePolling.getModeratorUserId();
                    if (moderatorUserId == null) {
                        moderatorUserId = "";
                    }
                    cVar.setModeratorUserId(moderatorUserId);
                }
                if (this.A != null) {
                    Handler handler = PlayerService.this.f22434f0;
                    jo.p.e(handler);
                    handler.postDelayed(this.A, this.B);
                    this.C.f38125w = false;
                }
                dq.c.c().l(new y.h(livePolling));
            } catch (Exception e10) {
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.Maintenance ? true : jo.p.c(error, MRError.ForceUpdate.INSTANCE)) {
                    of.n.f45411a.l(PlayerService.this.getApplicationContext(), error);
                } else if (error instanceof MRError.Blocked) {
                    PlayerService.this.O0(false);
                } else {
                    of.n nVar = of.n.f45411a;
                    Context applicationContext = PlayerService.this.getApplicationContext();
                    String message = error.getMessage();
                    if (message == null) {
                        message = PlayerService.this.getString(b2.f34715b);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(applicationContext, message, false);
                }
                if (this.A != null && this.C.f38125w) {
                    Handler handler2 = PlayerService.this.f22434f0;
                    jo.p.e(handler2);
                    handler2.postDelayed(this.A, this.B);
                }
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<hf.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22503w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22504x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22505y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22503w = aVar;
            this.f22504x = aVar2;
            this.f22505y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.e, java.lang.Object] */
        @Override // io.a
        public final hf.e invoke() {
            xq.a b10;
            oq.a aVar = this.f22503w;
            vq.a aVar2 = this.f22504x;
            io.a<? extends uq.a> aVar3 = this.f22505y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(hf.e.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22506w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22507x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22508y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22506w = aVar;
            this.f22507x = aVar2;
            this.f22508y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            xq.a b10;
            oq.a aVar = this.f22506w;
            vq.a aVar2 = this.f22507x;
            io.a<? extends uq.a> aVar3 = this.f22508y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(MRRequest.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<hb.i> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22509w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22510x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22511y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22509w = aVar;
            this.f22510x = aVar2;
            this.f22511y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hb.i, java.lang.Object] */
        @Override // io.a
        public final hb.i invoke() {
            xq.a b10;
            oq.a aVar = this.f22509w;
            vq.a aVar2 = this.f22510x;
            io.a<? extends uq.a> aVar3 = this.f22511y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(hb.i.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<nf.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22512w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22513x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22514y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22512w = aVar;
            this.f22513x = aVar2;
            this.f22514y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.z, java.lang.Object] */
        @Override // io.a
        public final nf.z invoke() {
            xq.a b10;
            oq.a aVar = this.f22512w;
            vq.a aVar2 = this.f22513x;
            io.a<? extends uq.a> aVar3 = this.f22514y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(nf.z.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22515w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22516x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22517y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22515w = aVar;
            this.f22516x = aVar2;
            this.f22517y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            xq.a b10;
            oq.a aVar = this.f22515w;
            vq.a aVar2 = this.f22516x;
            io.a<? extends uq.a> aVar3 = this.f22517y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(i1.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<j1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22518w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22519x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22520y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22518w = aVar;
            this.f22519x = aVar2;
            this.f22520y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [nd.j1, java.lang.Object] */
        @Override // io.a
        public final j1 invoke() {
            xq.a b10;
            oq.a aVar = this.f22518w;
            vq.a aVar2 = this.f22519x;
            io.a<? extends uq.a> aVar3 = this.f22520y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(j1.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22521w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22522x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22523y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22521w = aVar;
            this.f22522x = aVar2;
            this.f22523y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            xq.a b10;
            oq.a aVar = this.f22521w;
            vq.a aVar2 = this.f22522x;
            io.a<? extends uq.a> aVar3 = this.f22523y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(v0.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22524w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22525x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22526y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22524w = aVar;
            this.f22525x = aVar2;
            this.f22526y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            xq.a b10;
            oq.a aVar = this.f22524w;
            vq.a aVar2 = this.f22525x;
            io.a<? extends uq.a> aVar3 = this.f22526y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(kf.x.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<nf.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22527w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22528x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22529y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22527w = aVar;
            this.f22528x = aVar2;
            this.f22529y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.c] */
        @Override // io.a
        public final nf.c invoke() {
            xq.a b10;
            oq.a aVar = this.f22527w;
            vq.a aVar2 = this.f22528x;
            io.a<? extends uq.a> aVar3 = this.f22529y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(nf.c.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends jo.q implements io.a<od.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22530w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22531x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22532y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22530w = aVar;
            this.f22531x = aVar2;
            this.f22532y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.f] */
        @Override // io.a
        public final od.f invoke() {
            xq.a b10;
            oq.a aVar = this.f22530w;
            vq.a aVar2 = this.f22531x;
            io.a<? extends uq.a> aVar3 = this.f22532y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(od.f.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends jo.q implements io.a<nf.h> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22533w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22534x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22535y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22533w = aVar;
            this.f22534x = aVar2;
            this.f22535y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.h, java.lang.Object] */
        @Override // io.a
        public final nf.h invoke() {
            xq.a b10;
            oq.a aVar = this.f22533w;
            vq.a aVar2 = this.f22534x;
            io.a<? extends uq.a> aVar3 = this.f22535y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(nf.h.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends jo.q implements io.a<hf.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22536w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22537x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22538y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22536w = aVar;
            this.f22537x = aVar2;
            this.f22538y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.r, java.lang.Object] */
        @Override // io.a
        public final hf.r invoke() {
            xq.a b10;
            oq.a aVar = this.f22536w;
            vq.a aVar2 = this.f22537x;
            io.a<? extends uq.a> aVar3 = this.f22538y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(hf.r.class), aVar2, aVar3);
        }
    }

    public PlayerService() {
        uo.b0 b10;
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.f22449y = c10.plus(b10);
        this.f22450z = wn.g.a(new h());
        cr.a aVar = cr.a.f28611a;
        this.A = wn.g.b(aVar.b(), new w(this, null, null));
        this.B = wn.g.b(aVar.b(), new x(this, null, null));
        this.C = wn.g.b(aVar.b(), new y(this, null, null));
        this.D = wn.g.b(aVar.b(), new z(this, null, null));
        this.E = wn.g.b(aVar.b(), new a0(this, null, null));
        this.F = wn.g.b(aVar.b(), new b0(this, null, null));
        this.G = wn.g.b(aVar.b(), new c0(this, null, null));
        this.H = wn.g.b(aVar.b(), new d0(this, null, null));
        this.I = wn.g.b(aVar.b(), new e0(this, null, null));
        this.J = wn.g.b(aVar.b(), new o(this, null, null));
        this.K = wn.g.b(aVar.b(), new p(this, null, null));
        this.L = wn.g.b(aVar.b(), new q(this, null, null));
        this.M = wn.g.b(aVar.b(), new r(this, null, null));
        this.N = wn.g.b(aVar.b(), new s(this, null, null));
        this.O = wn.g.b(aVar.b(), new t(this, null, null));
        this.P = wn.g.b(aVar.b(), new u(this, null, null));
        this.Q = wn.g.b(aVar.b(), new v(this, null, null));
        this.f22436h0 = true;
    }

    public static final void s0(PlayerService playerService, Boolean bool) {
        jo.p.h(playerService, "this$0");
        jo.p.g(bool, "it");
        if (bool.booleanValue()) {
            playerService.y0();
            playerService.x0();
            if (playerService.o0()) {
                playerService.B0();
                playerService.E0();
            }
        } else if (playerService.U().K0() || jo.p.c(playerService.Y().H().f(), Boolean.TRUE)) {
        } else {
            playerService.R();
            playerService.G0(false);
        }
    }

    public final void A0() {
        vd.b.f57299a.b("PlayerService_playing");
        this.f22433e0 = 0;
        this.f22429a0 = 0;
        F0(Referer.LiveView.RETRY);
        x0();
    }

    public final void B0() {
        te.c cVar = this.f22437i0;
        if (cVar != null && this.f22431c0 > 0) {
            Puree.d(new Live.ViewBackgroundEnd(cVar.getLiveId(), cVar.g(), cVar.e(), cVar.getTitle(), b0(), (System.currentTimeMillis() - this.f22431c0) / 1000));
            this.f22431c0 = 0L;
        }
    }

    public final void C0() {
        te.c cVar = this.f22437i0;
        if (cVar == null) {
            return;
        }
        this.f22431c0 = System.currentTimeMillis();
        Puree.d(new Live.ViewBackgroundStart(cVar.getLiveId(), cVar.g(), cVar.e(), cVar.getTitle(), b0()));
    }

    public final void D0() {
        te.c cVar = this.f22437i0;
        if (cVar == null || this.f22435g0) {
            return;
        }
        Puree.d(new Live.ViewEnd(cVar, T0(), n0(), this.S));
        this.S = 0L;
        this.f22435g0 = true;
        if (this.f22430b0) {
            B0();
        }
    }

    public final void E0() {
        te.c cVar = this.f22437i0;
        if (cVar == null) {
            return;
        }
        Puree.d(new Live.ViewForeground(cVar.getLiveId(), cVar.g(), cVar.e(), cVar.getTitle(), b0()));
    }

    public final void F0(String str) {
        App.AppParams app;
        String appId;
        UserProfile owner;
        String title;
        te.c cVar;
        String liveId;
        if (this.f22437i0 == null) {
            return;
        }
        if (jo.p.c(Referer.LiveView.RETRY, str) && (cVar = this.f22437i0) != null && (liveId = cVar.getLiveId()) != null) {
            Puree.d(new Live.ViewReconnect(liveId, str, T0()));
        }
        if (this.f22435g0) {
            this.f22441m0 = System.currentTimeMillis();
            this.f22435g0 = false;
            MRLogger c02 = c0();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_VIEW_START);
            wn.k[] kVarArr = new wn.k[7];
            kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_WHERE, str);
            kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_IS_MUTED, String.valueOf(n0()));
            te.c cVar2 = this.f22437i0;
            String str2 = "";
            kVarArr[2] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, (cVar2 == null || (r5 = cVar2.g()) == null) ? "" : "");
            te.c cVar3 = this.f22437i0;
            kVarArr[3] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_NAME, (cVar3 == null || (r5 = cVar3.e()) == null) ? "" : "");
            te.c cVar4 = this.f22437i0;
            kVarArr[4] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, (cVar4 == null || (r5 = cVar4.getLiveId()) == null) ? "" : "");
            te.c cVar5 = this.f22437i0;
            if (cVar5 != null && (title = cVar5.getTitle()) != null) {
                str2 = title;
            }
            kVarArr[5] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_NAME, str2);
            xm.e eVar = new xm.e();
            HashMap hashMap = new HashMap();
            te.c cVar6 = this.f22437i0;
            boolean z10 = (cVar6 == null || (owner = cVar6.getOwner()) == null || !owner.isBirthday()) ? false : true;
            String str3 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            if (z10) {
                hashMap.put(MRLog.PAYLOAD_KEY_MEMORIAL_ID, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            }
            te.c cVar7 = this.f22437i0;
            if (!(cVar7 != null && cVar7.isOmotenashi())) {
                str3 = "0";
            }
            hashMap.put(MRLog.PAYLOAD_KEY_IS_OMOTENASHI, str3);
            wn.v vVar = wn.v.f59242a;
            kVarArr[6] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, eVar.s(hashMap));
            List<wn.k<String, String>> p10 = xn.s.p(kVarArr);
            te.c cVar8 = this.f22437i0;
            if (cVar8 != null && (app = cVar8.getApp()) != null && (appId = app.getAppId()) != null) {
                if (appId.length() > 0) {
                    p10.add(wn.q.a(MRLog.PAYLOAD_KEY_APP_ID, appId));
                }
            }
            builder.setPayload(p10);
            c02.sendLog(builder.build());
        }
    }

    public final void G0(boolean z10) {
        if ((p0() || m0()) && this.f22430b0 && o0()) {
            LiveStreamPlayer liveStreamPlayer = this.f22444p0;
            if (liveStreamPlayer != null) {
                liveStreamPlayer.sendReceivesVideo(z10);
            }
            LLStreamingPlayer lLStreamingPlayer = this.Y;
            if (lLStreamingPlayer != null) {
                lLStreamingPlayer.sendReceivesVideo(z10);
            }
        }
    }

    public final void H0(boolean z10) {
        this.W = z10;
    }

    public final void I0(boolean z10) {
        this.f22439k0 = z10;
        if (z10) {
            hf.b.f35490a.j();
            FirebaseAnalytics.getInstance(getApplicationContext()).a("aao3ha", null);
        }
    }

    public final void J0(Surface surface) {
        this.f22442n0 = surface;
        SimpleExoPlayer simpleExoPlayer = this.f22432d0;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setVideoSurface(surface);
        }
        LiveStreamPlayer liveStreamPlayer = this.f22444p0;
        if (liveStreamPlayer != null) {
            liveStreamPlayer.setSurface(surface);
        }
        LLStreamingPlayer lLStreamingPlayer = this.Y;
        if (lLStreamingPlayer == null) {
            return;
        }
        lLStreamingPlayer.setSurface(surface);
    }

    public final void K0() {
        LinkedLive linkedLive;
        te.c cVar = this.f22437i0;
        if (cVar == null) {
            return;
        }
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.setFlags(270532608);
        intent.setAction("actiontype_dialog_afterplay");
        String liveId = cVar.getLiveId();
        String userId = cVar.getOwner().getUserId();
        boolean t12 = f0().t1();
        long m12 = f0().m1();
        te.c f10 = f0().j1().f();
        String str = (f10 == null || (linkedLive = f10.getLinkedLive()) == null || (r3 = linkedLive.getLiveId()) == null) ? "" : "";
        b.a aVar = oe.b.J;
        UserProfile owner = cVar.getOwner();
        Boolean f11 = f0().g1().f();
        if (f11 == null) {
            f11 = Boolean.FALSE;
        }
        intent.putExtra("EXTRA_LIVE_REQUEST", new oe.a(liveId, userId, t12, false, m12, str, aVar.a(owner, f11.booleanValue())));
        intent.putExtra("EXTRA_STREAMER_USER_ID", cVar.getOwner().getUserId());
        intent.putExtra("EXTRA_STREAMER_USER_NAME", cVar.getOwner().getName());
        intent.putExtra("EXTRA_SHOULD_SHOW_LIVE_REQUEST", true);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 335544320);
        j.e r10 = new j.e(this, getString(b2.f34717e)).D(z1.f35044i).v(BitmapFactory.decodeResource(getResources(), z1.f35043h)).r(getString(this.f22436h0 ? b2.text_finish_viewing : b2.f34723o));
        j.e p10 = r10.q(cVar.e() + " / " + cVar.getTitle()).j(true).p(activity);
        jo.p.g(p10, "Builder(this, getString(…tentIntent(pendingIntent)");
        Object systemService = getSystemService("notification");
        jo.p.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).notify(202, p10.c());
    }

    public final void L0() {
        Intent intent;
        String image_url;
        String e10;
        String h10;
        if (this.f22437i0 == null || this.R == null) {
            intent = null;
        } else {
            tb.c Z = Z();
            Context applicationContext = getApplicationContext();
            jo.p.g(applicationContext, "applicationContext");
            te.c cVar = this.f22437i0;
            String str = (cVar == null || (r1 = cVar.getLiveId()) == null) ? "0" : "0";
            g gVar = this.R;
            intent = c.a.f(Z, applicationContext, str, (gVar == null || (h10 = gVar.h()) == null) ? "" : h10, null, null, true, false, false, false, null, 984, null);
            intent.addFlags(67108864);
        }
        Intent intent2 = intent;
        String str2 = (of.n.n() && m0()) ? "[LLS]" : "";
        p1 p1Var = p1.f34946a;
        Context applicationContext2 = getApplicationContext();
        jo.p.g(applicationContext2, "applicationContext");
        Intent c10 = p1Var.c(getApplicationContext());
        te.c cVar2 = this.f22437i0;
        String str3 = (cVar2 == null || (e10 = cVar2.e()) == null) ? "" : e10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        te.c cVar3 = this.f22437i0;
        sb2.append((cVar3 == null || (r1 = cVar3.getTitle()) == null) ? "" : "");
        String sb3 = sb2.toString();
        te.c cVar4 = this.f22437i0;
        startForeground(205, p1Var.a(applicationContext2, intent2, c10, str3, sb3, (cVar4 == null || (image_url = cVar4.getImage_url()) == null) ? "" : image_url, 205));
    }

    public final void M0() {
        vd.b.f57299a.b("PlayerService_playing");
        x0();
    }

    public final void N0() {
        d0().c("PlayerService");
    }

    public final void O0(boolean z10) {
        if (!W().E()) {
            V().p(jf.k.STOP_PLAY);
        }
        D0();
        P0();
        y0();
        stopForeground(true);
        if (z10) {
            R0("stopped");
        }
        vd.b.f57299a.c("PlayerService_playing");
    }

    public final void P(te.c cVar) {
        jo.p.h(cVar, "playRequestParams");
        BcsvrChannel d10 = d0().d("PlayerService", true);
        if (d10.isConnected() || d10.isWorkerRunning()) {
            d10.disconnectNoThrow();
        }
        if (d10.connectNoThrow(new BcsvrAddress(cVar.getBroadcastHost(), cVar.getBroadcastPort(), cVar.getBroadcastKey()))) {
            return;
        }
        g9.a.f32826a.b("bcsvr does not start", new Object[0]);
    }

    public final void P0() {
        Handler handler;
        Runnable runnable = this.f22438j0;
        if (runnable == null || (handler = this.f22434f0) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    public final void Q(te.c cVar) {
        if (d0().d("PlayerService", true).isConnected()) {
            return;
        }
        P(cVar);
    }

    public final void Q0(boolean z10) {
        te.c cVar = this.f22437i0;
        if (cVar == null) {
            return;
        }
        cVar.o(z10);
    }

    public final void R() {
        if (o0()) {
            C0();
        }
        this.f22430b0 = true;
    }

    public final void R0(String str) {
        h0().d().g(str);
        r0();
    }

    public final void S() {
        String liveId;
        te.c f10 = f0().j1().f();
        if (f10 != null) {
            Q(f10);
        }
        k.b bVar = this.T;
        if (bVar != null) {
            te.c cVar = this.f22437i0;
            if (cVar != null && (liveId = cVar.getLiveId()) != null) {
                Puree.d(new EventBannerLog(EventBannerActionType.LIVE_VIEW_BACK, bVar.a().e(), bVar.b(), bVar.c(), liveId, null, 32, null));
            }
            this.T = null;
        }
        this.f22430b0 = false;
    }

    public final long S0() {
        return (System.currentTimeMillis() - this.f22440l0) / 1000;
    }

    public final IBinder T() {
        return (IBinder) this.f22450z.getValue();
    }

    public final long T0() {
        return (System.currentTimeMillis() - this.f22441m0) / 1000;
    }

    public final nf.c U() {
        return (nf.c) this.A.getValue();
    }

    public final od.f V() {
        return (od.f) this.B.getValue();
    }

    public final nf.h W() {
        return (nf.h) this.C.getValue();
    }

    public final hf.r X() {
        return (hf.r) this.D.getValue();
    }

    public final nf.o Y() {
        return (nf.o) this.G.getValue();
    }

    public final tb.c Z() {
        return (tb.c) this.H.getValue();
    }

    public final String b0() {
        App.AppParams app;
        te.c cVar = this.f22437i0;
        if (cVar == null || (app = cVar.getApp()) == null) {
            return null;
        }
        return app.getAppId();
    }

    public final MRLogger c0() {
        return (MRLogger) this.I.getValue();
    }

    @Override // te.d
    public void d(Size size) {
        if (size == null) {
            return;
        }
        g9.a.g("video size changed : " + size.getWidth() + " / " + size.getHeight());
        dq.c c10 = dq.c.c();
        te.c cVar = this.f22437i0;
        c10.l(new y.g((cVar == null || (r2 = cVar.getLiveId()) == null) ? "" : "", size.getWidth(), size.getHeight()));
    }

    public final hf.e d0() {
        return (hf.e) this.J.getValue();
    }

    public final hb.i e0() {
        return (hb.i) this.L.getValue();
    }

    @Override // te.d
    public void f(Throwable th2) {
        this.f22429a0 = 0;
        this.f22433e0 = 0;
        R0("loaded");
    }

    public final nf.z f0() {
        return (nf.z) this.M.getValue();
    }

    public final MRRequest g0() {
        return (MRRequest) this.K.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f22449y;
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // te.d
    public void h(Throwable th2) {
        String liveId;
        g9.a.g("Playback failed: " + th2);
        y0();
        if (!this.f22436h0) {
            t0();
            return;
        }
        int i10 = this.f22429a0;
        this.f22429a0 = i10 + 1;
        if (i10 >= 3) {
            u0();
            return;
        }
        te.c cVar = this.f22437i0;
        if (cVar != null && (liveId = cVar.getLiveId()) != null) {
            Puree.d(new Live.ViewReconnect(liveId, Referer.LiveView.AUTO_RETRY, T0(), this.f22429a0));
        }
        x0();
    }

    public final i1 h0() {
        return (i1) this.N.getValue();
    }

    public final j1 i0() {
        return (j1) this.O.getValue();
    }

    public final v0 j0() {
        return (v0) this.P.getValue();
    }

    public final kf.x k0() {
        return (kf.x) this.Q.getValue();
    }

    public final boolean l0() {
        SimpleExoPlayer simpleExoPlayer = this.f22432d0;
        Integer valueOf = simpleExoPlayer != null ? Integer.valueOf(simpleExoPlayer.getPlaybackState()) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            return false;
        }
        if (valueOf != null && valueOf.intValue() == 4) {
            return false;
        }
        SimpleExoPlayer simpleExoPlayer2 = this.f22432d0;
        return simpleExoPlayer2 != null && simpleExoPlayer2.getPlayWhenReady();
    }

    @Override // te.d
    public boolean m(Throwable th2) {
        te.c cVar;
        String liveId;
        jo.p.h(th2, "cause");
        if ((th2 instanceof UnresolvedAddressException) || (th2 instanceof AsyncSecureSocket.ConnectionNotEstablishedException)) {
            int i10 = this.f22433e0;
            this.f22433e0 = i10 + 1;
            boolean z10 = i10 < 3;
            if (z10 && (cVar = this.f22437i0) != null && (liveId = cVar.getLiveId()) != null) {
                Puree.d(new Live.ViewReconnect(liveId, Referer.LiveView.AUTO_RETRY2, T0(), this.f22433e0));
            }
            return z10;
        }
        return false;
    }

    public final boolean m0() {
        return q0();
    }

    public final int n0() {
        Object systemService = getApplicationContext().getSystemService("audio");
        jo.p.f(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return ((AudioManager) systemService).getStreamVolume(3) > 0 ? 0 : 1;
    }

    public final boolean o0() {
        LiveStreamPlayer liveStreamPlayer = this.f22444p0;
        if (liveStreamPlayer != null && liveStreamPlayer.isPlaying()) {
            return true;
        }
        if (this.f22432d0 == null || !l0()) {
            LLStreamingPlayer lLStreamingPlayer = this.Y;
            return lLStreamingPlayer != null && lLStreamingPlayer.isPlaying();
        }
        return true;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.f0 f0Var) {
        te.c cVar;
        String liveId;
        String liveComment;
        jo.p.h(f0Var, "event");
        if (!jo.p.c(f0Var.b(), "PlayerService") || (cVar = this.f22437i0) == null || (liveId = cVar.getLiveId()) == null) {
            return;
        }
        te.c f10 = f0().j1().f();
        boolean z10 = true;
        if (f10 == null || !f10.isPrivate()) {
            z10 = false;
        }
        if (z10) {
            liveComment = of.n.f45411a.i(f0Var.a().getLiveComment());
        } else {
            liveComment = f0Var.a().getLiveComment();
        }
        e0().U(t2.f55515o.a(liveId, f0Var.a(), liveComment));
        if (jo.p.c(f0Var.a().getUserId(), j0().x())) {
            MRLogger c02 = c0();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_COMMENT_SHOW_OWN_COMMENT);
            builder.setTargetId(liveComment);
            builder.setPageId(Referer.LIVE_VIEW);
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, liveId)));
            c02.sendLog(builder.build());
        }
    }

    @Override // te.d
    public void onAudioLoaded(byte[] bArr) {
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public IBinder onBind(Intent intent) {
        jo.p.h(intent, "intent");
        super.onBind(intent);
        return T();
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public void onCreate() {
        super.onCreate();
        dq.c.c().p(this);
        this.f22441m0 = System.currentTimeMillis();
        this.f22440l0 = System.currentTimeMillis();
        this.f22435g0 = false;
        uo.l.d(this, null, null, new i(null), 3, null);
        uo.l.d(this, null, null, new j(null), 3, null);
        uo.l.d(this, null, null, new k(null), 3, null);
        j1 i02 = i0();
        Context applicationContext = getApplicationContext();
        jo.p.g(applicationContext, "applicationContext");
        i02.f(applicationContext, Referer.LIVE_VIEW);
        Y().F().i(this, new androidx.lifecycle.f0() { // from class: hb.n1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PlayerService.s0(PlayerService.this, (Boolean) obj);
            }
        });
        uo.l.d(this, null, null, new l(null), 3, null);
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public void onDestroy() {
        dq.c.c().r(this);
        O0(true);
        r0.d(this, null, 1, null);
        d0().c("PlayerService");
        D0();
        super.onDestroy();
    }

    @Override // te.d
    public void onError(Throwable th2) {
        g9.a.c(th2);
    }

    @dq.l
    public final void onEvent(nd.z zVar) {
        jo.p.h(zVar, "event");
        Runnable runnable = this.f22438j0;
        if (runnable == null) {
            runnable = new m();
        }
        this.f22438j0 = runnable;
        if (this.f22434f0 == null) {
            this.f22434f0 = new Handler();
        }
        Handler handler = this.f22434f0;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
        Handler handler2 = this.f22434f0;
        if (handler2 != null) {
            handler2.post(runnable);
        }
    }

    @Override // te.d
    public void onLoadingBegan() {
        R0("loading");
    }

    @Override // androidx.lifecycle.y, android.app.Service
    @SuppressLint({"NewApi"})
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (intent == null) {
            return 2;
        }
        String action = intent.getAction();
        if (action == null) {
            stopSelf(i11);
            return 2;
        }
        g gVar = (g) intent.getParcelableExtra("EXTRA_PLAYER_ENDPOINT");
        if (gVar != null) {
            this.R = gVar;
        }
        if (jo.p.c(action, "com.dena.mirrorman.playerservice.action.PLAY")) {
            this.f22437i0 = f22427t0.c(intent);
            M0();
        }
        return 2;
    }

    @Override // te.d
    public void onVideoRendered(int i10) {
        String liveId;
        if (this.f22443o0 > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j10 = uptimeMillis - this.f22443o0;
            long j11 = uptimeMillis - this.f22446r0;
            this.f22446r0 = uptimeMillis;
            if (i10 == 0) {
                vd.b.f57299a.c("click_play");
                te.c cVar = this.f22437i0;
                if (cVar != null && (liveId = cVar.getLiveId()) != null) {
                    Puree.d(new Live.RenderStart(liveId, j10, "rtmp"));
                }
                dq.c.c().l(y.b.f19499a);
            } else if (i10 == 1) {
                this.S = System.currentTimeMillis() - this.f22441m0;
            }
            if (this.f22444p0 != null) {
                Puree.d(new DurationFromPlayStartLog(ResponseTimeLogTargetType.RTMP_PLAYER, i10, j10, j11));
            } else if (this.Y != null) {
                Puree.d(new DurationFromPlayStartLog(ResponseTimeLogTargetType.LLSTREAM_PLAYER, i10, j10, j11));
            }
        }
    }

    public final boolean p0() {
        g gVar = this.R;
        if (gVar != null) {
            return gVar.c();
        }
        return false;
    }

    public final boolean q0() {
        g gVar = this.R;
        boolean b10 = gVar != null ? gVar.b() : false;
        g gVar2 = this.R;
        boolean c10 = gVar2 != null ? gVar2.c() : false;
        if (b10 || c10) {
            g gVar3 = this.R;
            URI create = URI.create(String.valueOf(gVar3 != null ? gVar3.i() : null));
            if (X().p()) {
                LLStreamingPlayer.Companion companion = LLStreamingPlayer.Companion;
                jo.p.g(create, "uri");
                return companion.isV1StreamKey(create);
            }
            return false;
        }
        return false;
    }

    public final void r0() {
        g gVar = this.R;
        if (gVar == null) {
            return;
        }
        dq.c.c().l(new b(this, gVar, h0().d()));
    }

    public final void t0() {
        stopForeground(true);
        D0();
        R0("live_end");
        if (this.f22430b0) {
            K0();
        }
        vd.b.f57299a.c("PlayerService_playing");
    }

    public final void u0() {
        stopForeground(true);
        D0();
        R0("failed");
        if (this.f22430b0) {
            K0();
        }
        vd.b.f57299a.c("PlayerService_playing");
    }

    public final void v0(Runnable runnable, boolean z10) {
        te.c cVar = this.f22437i0;
        if (cVar == null) {
            return;
        }
        jo.c0 c0Var = new jo.c0();
        if (z10) {
            c0Var.f38129w = 1;
        }
        jo.a0 a0Var = new jo.a0();
        a0Var.f38125w = true;
        uo.l.d(this, null, null, new n(cVar, c0Var, runnable, 60000, a0Var, null), 3, null);
        g9.a.g("polling : requested");
    }

    public final boolean w0() {
        return this.f22439k0;
    }

    public final void x0() {
        String str;
        LiveStreamPlayer liveStreamPlayer;
        StreamEndpoint streamEndpoint;
        L0();
        g gVar = this.R;
        if (gVar == null) {
            return;
        }
        Trace a10 = vd.b.f57299a.a("click_play");
        if (m0()) {
            str = "llstream";
        } else {
            str = p0() ? "rtmp" : TopicConstant.PACKET_TYPE_HLS;
        }
        if (a10 != null) {
            a10.putAttribute("transport", str);
        }
        if (m0()) {
            if (this.Y == null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                this.f22446r0 = uptimeMillis;
                this.f22443o0 = uptimeMillis;
                if (gVar.b()) {
                    streamEndpoint = new StreamEndpoint((String) so.o.r0(String.valueOf(gVar.f()), new String[]{"/"}, false, 0, 6, null).get(4), String.valueOf(gVar.f()), String.valueOf(gVar.e()), String.valueOf(gVar.d()));
                } else if (gVar.c()) {
                    LLStreamingPlayer.Companion companion = LLStreamingPlayer.Companion;
                    URI create = URI.create(String.valueOf(gVar.g()));
                    jo.p.g(create, "create(playerEndpoint.rtmpURL.toString())");
                    streamEndpoint = companion.parseURL(create);
                } else {
                    streamEndpoint = null;
                }
                StreamEndpoint streamEndpoint2 = streamEndpoint;
                if (streamEndpoint2 != null) {
                    LLStreamingPlayer lLStreamingPlayer = new LLStreamingPlayer(streamEndpoint2, null, null, 6, null);
                    e eVar = new e(this, this);
                    this.Z = eVar;
                    lLStreamingPlayer.setCallback(eVar);
                    if (U().K0() || W().F()) {
                        lLStreamingPlayer.setMute(true);
                    }
                    lLStreamingPlayer.setContext(getApplicationContext());
                    this.Y = lLStreamingPlayer;
                }
            }
            J0(this.f22442n0);
            LLStreamingPlayer lLStreamingPlayer2 = this.Y;
            if (lLStreamingPlayer2 != null) {
                lLStreamingPlayer2.stop();
            }
            LLStreamingPlayer lLStreamingPlayer3 = this.Y;
            if (lLStreamingPlayer3 != null) {
                lLStreamingPlayer3.play();
            }
        } else if (p0()) {
            if (this.f22444p0 == null) {
                long uptimeMillis2 = SystemClock.uptimeMillis();
                this.f22446r0 = uptimeMillis2;
                this.f22443o0 = uptimeMillis2;
                this.f22444p0 = new LiveStreamPlayer();
                f fVar = new f(this, this);
                this.f22445q0 = fVar;
                LiveStreamPlayer liveStreamPlayer2 = this.f22444p0;
                if (liveStreamPlayer2 != null) {
                    liveStreamPlayer2.setCallback(fVar);
                }
                if ((U().K0() || W().F()) && (liveStreamPlayer = this.f22444p0) != null) {
                    liveStreamPlayer.setMute(Boolean.TRUE);
                }
            }
            String valueOf = String.valueOf(gVar.g());
            LiveStreamPlayer liveStreamPlayer3 = this.f22444p0;
            if (liveStreamPlayer3 != null) {
                liveStreamPlayer3.setEndpoint(new RTMPStreamEndpoint(RTMPEndpoint.fromURL(valueOf, true, true)));
            }
            J0(this.f22442n0);
            LiveStreamPlayer liveStreamPlayer4 = this.f22444p0;
            if (liveStreamPlayer4 != null) {
                liveStreamPlayer4.play();
            }
        } else {
            if (this.f22432d0 == null) {
                this.f22432d0 = new SimpleExoPlayer.Builder(getApplicationContext()).build();
                c cVar = new c(this, this);
                this.U = cVar;
                SimpleExoPlayer simpleExoPlayer = this.f22432d0;
                if (simpleExoPlayer != null) {
                    simpleExoPlayer.addListener(cVar);
                }
                d dVar = new d(this, this);
                this.V = dVar;
                SimpleExoPlayer simpleExoPlayer2 = this.f22432d0;
                if (simpleExoPlayer2 != null) {
                    simpleExoPlayer2.addVideoListener(dVar);
                }
            }
            DefaultDataSourceFactory defaultDataSourceFactory = new DefaultDataSourceFactory(getApplicationContext(), ApiUtil.INSTANCE.userAgent());
            MediaItem fromUri = MediaItem.fromUri(String.valueOf(gVar.d()));
            jo.p.g(fromUri, "fromUri(playerEndpoint.hlsURL.toString())");
            HlsMediaSource createMediaSource = new HlsMediaSource.Factory(defaultDataSourceFactory).createMediaSource(fromUri);
            jo.p.g(createMediaSource, "Factory(dataSourceFactor…ateMediaSource(mediaItem)");
            SimpleExoPlayer simpleExoPlayer3 = this.f22432d0;
            if (simpleExoPlayer3 != null) {
                simpleExoPlayer3.setMediaSource(createMediaSource);
            }
            SimpleExoPlayer simpleExoPlayer4 = this.f22432d0;
            if (simpleExoPlayer4 != null) {
                simpleExoPlayer4.prepare();
            }
            J0(this.f22442n0);
            SimpleExoPlayer simpleExoPlayer5 = this.f22432d0;
            if (simpleExoPlayer5 == null) {
                return;
            }
            simpleExoPlayer5.setPlayWhenReady(true);
        }
    }

    public final void y0() {
        SimpleExoPlayer simpleExoPlayer = this.f22432d0;
        if (simpleExoPlayer != null) {
            Player.EventListener eventListener = this.U;
            if (eventListener != null) {
                simpleExoPlayer.removeListener(eventListener);
            }
            VideoListener videoListener = this.V;
            if (videoListener != null) {
                simpleExoPlayer.removeVideoListener(videoListener);
            }
            simpleExoPlayer.release();
            this.f22432d0 = null;
            this.U = null;
            this.V = null;
        }
        LiveStreamPlayer liveStreamPlayer = this.f22444p0;
        if (liveStreamPlayer != null) {
            liveStreamPlayer.stop();
            liveStreamPlayer.setCallback(null);
            liveStreamPlayer.release();
            this.f22444p0 = null;
            this.f22445q0 = null;
        }
        LLStreamingPlayer lLStreamingPlayer = this.Y;
        if (lLStreamingPlayer != null) {
            lLStreamingPlayer.stop();
            lLStreamingPlayer.setCallback(null);
            lLStreamingPlayer.release();
            this.Y = null;
            this.Z = null;
        }
    }

    public final void z0() {
        this.f22441m0 = System.currentTimeMillis();
        this.f22435g0 = false;
        O0(false);
    }

    @dq.l
    public final void onEvent(k.b bVar) {
        jo.p.h(bVar, "event");
        this.T = bVar;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.b bVar) {
        te.c cVar;
        String liveId;
        jo.p.h(bVar, "event");
        if (!jo.p.c(bVar.b(), "PlayerService") || (cVar = this.f22437i0) == null || (liveId = cVar.getLiveId()) == null) {
            return;
        }
        te.c f10 = f0().j1().f();
        boolean z10 = true;
        if (f10 == null || !f10.isPrivate()) {
            z10 = false;
        }
        if (z10) {
            of.n.f45411a.i(bVar.a().getSpeech());
        } else {
            bVar.a().getSpeech();
        }
        e0().U(q2.f55380p.a(liveId, bVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.x xVar) {
        String liveId;
        jo.p.h(xVar, "event");
        te.c cVar = this.f22437i0;
        if (cVar == null || (liveId = cVar.getLiveId()) == null) {
            return;
        }
        e0().B(liveId);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.m0 m0Var) {
        te.c cVar;
        String liveId;
        String string;
        r2 a10;
        jo.p.h(m0Var, "event");
        if (!jo.p.c(m0Var.b(), "PlayerService") || (cVar = this.f22437i0) == null || (liveId = cVar.getLiveId()) == null) {
            return;
        }
        String liveComment = m0Var.a().getLiveComment();
        if (liveComment == null || liveComment.length() == 0) {
            String linkedLiveOwnerName = m0Var.a().getLinkedLiveOwnerName();
            string = !(linkedLiveOwnerName == null || linkedLiveOwnerName.length() == 0) ? getResources().getString(b2.f34720i0, m0Var.a().getLinkedLiveOwnerName()) : getResources().getString(b2.f34721j0);
        } else {
            string = m0Var.a().getLiveComment();
        }
        hb.i e02 = e0();
        if (m0Var.a().getYellRank() > 0) {
            a10 = w2.f55640l.a(liveId, m0Var.a(), string);
        } else {
            a10 = t2.f55515o.a(liveId, m0Var.a(), string);
        }
        e02.U(a10);
        if (jo.p.c(m0Var.a().getUserId(), j0().x())) {
            MRLogger c02 = c0();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_COMMENT_SHOW_OWN_COMMENT);
            builder.setTargetId(string);
            builder.setPageId(Referer.LIVE_VIEW);
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, liveId)));
            c02.sendLog(builder.build());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.e0 e0Var) {
        String liveId;
        jo.p.h(e0Var, "event");
        if (jo.p.c(e0Var.a(), "PlayerService")) {
            e0().F(e0Var.b());
            te.c cVar = this.f22437i0;
            if (cVar == null || (liveId = cVar.getLiveId()) == null) {
                return;
            }
            e0().B(liveId);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.g0 g0Var) {
        jo.p.h(g0Var, "event");
        if (jo.p.c(g0Var.b(), "PlayerService")) {
            e0().r0(null);
            V().p(jf.k.PLAYER_SHOW_RECOMMEND_LIVE);
            Double d10 = g0Var.d();
            double doubleValue = d10 != null ? d10.doubleValue() : 0.0d;
            Double c10 = g0Var.c();
            double doubleValue2 = c10 != null ? c10.doubleValue() : 0.0d;
            Double a10 = g0Var.a();
            e0().x((long) (((Math.random() * (doubleValue2 - doubleValue)) + doubleValue + ((a10 != null ? a10.doubleValue() : 0.0d) * Math.pow(2.0d, new Random().nextInt(13) - 1))) * 1000));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.o0 o0Var) {
        te.c f10;
        String liveId;
        jo.p.h(o0Var, "event");
        if (!jo.p.c(o0Var.b(), "PlayerService") || j0().i(o0Var.e()) || (f10 = f0().j1().f()) == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        String string = getString(b2.text_migration_ab, new Object[]{o0Var.c()});
        jo.p.g(string, "getString(R.string.text_…tion_ab, event.ownerName)");
        String.valueOf(System.currentTimeMillis());
        e0().U(new t2(null, liveId, 9, o0Var.e(), o0Var.f(), string, o0Var.d(), o0Var.a(), false, false, 0, null, null, 0, 16129, null));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.w0 w0Var) {
        te.c cVar;
        String liveId;
        String description;
        jo.p.h(w0Var, "event");
        if (jo.p.c(w0Var.b(), "PlayerService")) {
            String description2 = w0Var.a().getDescription();
            if ((description2 == null || description2.length() == 0) || (cVar = this.f22437i0) == null || (liveId = cVar.getLiveId()) == null) {
                return;
            }
            if (k0().t4().length() > 0) {
                description = getString(b2.text_live_description_user_name, new Object[]{k0().t4()}) + w0Var.a().getDescription();
            } else {
                description = w0Var.a().getDescription();
            }
            String str = description;
            String string = k0().t4().length() > 0 ? getString(b2.text_live_description_user_name, new Object[]{k0().t4()}) : "";
            jo.p.g(string, "if (userPreference.NAME.…\n            \"\"\n        }");
            e0().U(c3.f54826i.a(liveId, w0Var.a().getUserId(), w0Var.a().getUserName(), string + w0Var.a().getDescription(), w0Var.a().getProfileImageUrl(), w0Var.a().getBadgeImageUrl()));
            if (jo.p.c(w0Var.a().getUserId(), j0().x())) {
                MRLogger c02 = c0();
                MRLog.Companion companion = MRLog.Companion;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_COMMENT_SHOW_OWN_COMMENT);
                builder.setTargetId(str);
                builder.setPageId(Referer.LIVE_VIEW);
                builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, liveId)));
                c02.sendLog(builder.build());
            }
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.r0 r0Var) {
        jo.p.h(r0Var, "event");
        if (jo.p.c(r0Var.a(), "PlayerService")) {
            e0().u0(r0Var.b().getTotalViewerNum());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.n0 n0Var) {
        jo.p.h(n0Var, "event");
        if (jo.p.c(n0Var.a(), "PlayerService")) {
            e0().q0(n0Var.b().getLinkedLive());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.p0 p0Var) {
        jo.p.h(p0Var, "event");
        if (jo.p.c(p0Var.a(), "PlayerService")) {
            e0().q0(null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.d0 d0Var) {
        jo.p.h(d0Var, "event");
        if (jo.p.c(d0Var.a(), "PlayerService")) {
            e0().q0(null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.c1 c1Var) {
        jo.p.h(c1Var, "event");
        if (jo.p.c(c1Var.a(), "PlayerService")) {
            e0().j0(c1Var.b());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.a1 a1Var) {
        jo.p.h(a1Var, "event");
        if (jo.p.c(a1Var.a(), "PlayerService")) {
            e0().g0(a1Var.b());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.b1 b1Var) {
        jo.p.h(b1Var, "event");
        if (jo.p.c(b1Var.a(), "PlayerService")) {
            e0().w();
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.y yVar) {
        te.c f10;
        String liveId;
        r2 a10;
        jo.p.h(yVar, "event");
        if (!jo.p.c(yVar.b(), "PlayerService") || (f10 = f0().j1().f()) == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        hb.i e02 = e0();
        if (yVar.a().isOtherLiveGift()) {
            a10 = x2.f55684n.a(this, liveId, yVar.a(), currentTimeMillis);
        } else {
            a10 = z2.f55801s.a(this, liveId, yVar.a(), currentTimeMillis);
        }
        e02.U(a10);
        e0().V(yVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.b0 b0Var) {
        jo.p.h(b0Var, "event");
        if (jo.p.c(b0Var.a(), "PlayerService") && X().e()) {
            e0().s0(b0Var.b());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.k1 k1Var) {
        jo.p.h(k1Var, "event");
        if (jo.p.c(k1Var.a(), "PlayerService")) {
            e0().f0(xn.r.d(k1Var.b().getPopupUrl()));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.a aVar) {
        te.c f10;
        String liveId;
        jo.p.h(aVar, "event");
        if (!jo.p.c(aVar.b(), "PlayerService") || (f10 = f0().j1().f()) == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        e0().U(s2.f55476k.a(this, liveId, aVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.x0 x0Var) {
        jo.p.h(x0Var, "event");
        if (jo.p.c(x0Var.b(), "PlayerService")) {
            e0().r0(x0Var.a().isAppoint() ? x0Var.a().getModeratorUserId() : null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.u uVar) {
        jo.p.h(uVar, "event");
        if (jo.p.c(uVar.b(), "PlayerService")) {
            e0().o0(uVar.a());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.s sVar) {
        jo.p.h(sVar, "event");
        if (jo.p.c(sVar.a(), "PlayerService")) {
            e0().n0(sVar.b());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.z zVar) {
        jo.p.h(zVar, "event");
        if (jo.p.c(zVar.a(), "PlayerService")) {
            e0().b0();
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.f1 f1Var) {
        jo.p.h(f1Var, "event");
        if (jo.p.c(f1Var.a(), "PlayerService") && jo.p.c(k0().T4(), f1Var.b())) {
            e0().b0();
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.n1 n1Var) {
        jo.p.h(n1Var, "event");
        if (jo.p.c(n1Var.a(), "PlayerService") && jo.p.c(k0().T4(), n1Var.b().getUserId())) {
            e0().v0(n1Var.b());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.k kVar) {
        jo.p.h(kVar, "event");
        if (jo.p.c(kVar.a(), "PlayerService")) {
            e0().p();
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.e eVar) {
        jo.p.h(eVar, "event");
        if (jo.p.c(eVar.b(), "PlayerService")) {
            e0().q(eVar.a());
            String f10 = f0().s0().f();
            if (f10 != null) {
                e0().z(f10);
            }
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.a0 a0Var) {
        te.c f10;
        String liveId;
        List<jf.u> f11;
        boolean z10;
        boolean z11;
        Object obj;
        boolean z12;
        jo.p.h(a0Var, "event");
        if (!jo.p.c(a0Var.a(), "PlayerService") || (f10 = f0().j1().f()) == null || (liveId = f10.getLiveId()) == null || (f11 = f0().O0().f()) == null) {
            return;
        }
        if (!f11.isEmpty()) {
            for (jf.u uVar : f11) {
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
            e0().B(liveId);
            return;
        }
        Iterator<T> it = f11.iterator();
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
            e0().p0(a0Var.b());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.h0 h0Var) {
        te.c f10;
        String liveId;
        jo.p.h(h0Var, "event");
        if (jo.p.c(h0Var.a(), "PlayerService") && (f10 = f0().j1().f()) != null && (liveId = f10.getLiveId()) != null && h0Var.b().getUserIds().contains(k0().T4())) {
            hb.i e02 = e0();
            a3.a aVar = a3.f54739k;
            Context applicationContext = getApplicationContext();
            jo.p.g(applicationContext, "applicationContext");
            e02.U(aVar.a(applicationContext, liveId, h0Var.b()));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.s0 s0Var) {
        te.c f10;
        String liveId;
        jo.p.h(s0Var, "event");
        if (!jo.p.c(s0Var.a(), "PlayerService") || (f10 = f0().j1().f()) == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        e0().U(b3.f54782j.a(this, liveId, s0Var.b().getUserId(), s0Var.b().getUserName(), s0Var.b().getRewardTitle(), s0Var.b().getRewardImageUrl(), s0Var.b().getProfileImageUrl()));
    }
}
