package com.dena.mirrativ.player.archive;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Surface;
import androidx.lifecycle.y;
import ce.y;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.player.archive.ArchivePlayerActivity;
import com.dena.mirrorman.clientlog.logs.Archive;
import com.dena.mirrorman.clientlog.logs.Live;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.live.LiveTimeline;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.video.VideoListener;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import hb.p1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jo.f0;
import jo.h;
import jo.p;
import jo.q;
import nd.i1;
import vd.b;
import wn.f;
import wn.g;
import wn.i;

/* loaded from: classes2.dex */
public final class ArchivePlayerService extends y implements Player.EventListener, VideoListener {
    public static final a L = new a(null);
    public static final int M = 8;
    public long A;
    public long B;
    public boolean C;
    public SimpleExoPlayer D;
    public Integer E;
    public long F;
    public long G;
    public Surface H;
    public List<LiveTimeline> I;
    public te.c J;
    public boolean K;

    /* renamed from: x  reason: collision with root package name */
    public final f f22643x = g.a(new c());

    /* renamed from: y  reason: collision with root package name */
    public final f f22644y;

    /* renamed from: z  reason: collision with root package name */
    public final f f22645z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(Context context) {
            return new Intent(context, ArchivePlayerService.class);
        }

        public final Intent b(Context context, te.c cVar, ArrayList<LiveTimeline> arrayList) {
            Intent intent = new Intent(context, ArchivePlayerService.class);
            intent.setAction("com.dena.mirrorman.voidplayerservice.action.PLAY");
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_PLAY_REQUEST_PARAMS", cVar);
            intent.putExtra("EXTRA_PLAY_REQUEST_PARAMS", bundle);
            intent.putExtra("timeline", arrayList);
            return intent;
        }

        public final te.c c(Intent intent) {
            p.h(intent, "intent");
            Bundle bundleExtra = intent.getBundleExtra("EXTRA_PLAY_REQUEST_PARAMS");
            if (bundleExtra != null) {
                return (te.c) bundleExtra.getParcelable("EXTRA_PLAY_REQUEST_PARAMS");
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public String f22646a;

        /* renamed from: b  reason: collision with root package name */
        public te.e f22647b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ArchivePlayerService f22648c;

        public b(ArchivePlayerService archivePlayerService, String str, te.a aVar) {
            p.h(aVar, "state");
            this.f22648c = archivePlayerService;
            this.f22646a = str;
            this.f22647b = aVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<mf.a<ArchivePlayerService>> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final mf.a<ArchivePlayerService> invoke() {
            return new mf.a<>(ArchivePlayerService.this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<jb.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22650w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22651x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22652y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22650w = componentCallbacks;
            this.f22651x = aVar;
            this.f22652y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jb.a] */
        @Override // io.a
        public final jb.a invoke() {
            ComponentCallbacks componentCallbacks = this.f22650w;
            return gq.a.a(componentCallbacks).c(f0.b(jb.a.class), this.f22651x, this.f22652y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22653w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22654x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22655y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22653w = componentCallbacks;
            this.f22654x = aVar;
            this.f22655y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f22653w;
            return gq.a.a(componentCallbacks).c(f0.b(i1.class), this.f22654x, this.f22655y);
        }
    }

    public ArchivePlayerService() {
        i iVar = i.SYNCHRONIZED;
        this.f22644y = g.b(iVar, new d(this, null, null));
        this.f22645z = g.b(iVar, new e(this, null, null));
    }

    public final void A() {
        SimpleExoPlayer simpleExoPlayer = this.D;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setPlayWhenReady(false);
        }
        SimpleExoPlayer simpleExoPlayer2 = this.D;
        if (simpleExoPlayer2 != null) {
            simpleExoPlayer2.getPlaybackState();
        }
    }

    public final void B() {
        if (this.D != null) {
            return;
        }
        this.D = new SimpleExoPlayer.Builder(getApplicationContext()).build();
        te.c cVar = this.J;
        p.e(cVar);
        HlsMediaSource createMediaSource = new HlsMediaSource.Factory(new DefaultDataSourceFactory(getApplicationContext(), ApiUtil.INSTANCE.userAgent())).createMediaSource(Uri.parse(cVar.j()));
        p.g(createMediaSource, "Factory(dataSourceFactory).createMediaSource(uri)");
        SimpleExoPlayer simpleExoPlayer = this.D;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.addListener(this);
        }
        SimpleExoPlayer simpleExoPlayer2 = this.D;
        if (simpleExoPlayer2 != null) {
            simpleExoPlayer2.addVideoListener(this);
        }
        SimpleExoPlayer simpleExoPlayer3 = this.D;
        if (simpleExoPlayer3 != null) {
            simpleExoPlayer3.prepare(createMediaSource);
        }
        Surface surface = this.H;
        if (surface != null) {
            L(surface);
        }
        SimpleExoPlayer simpleExoPlayer4 = this.D;
        if (simpleExoPlayer4 != null) {
            simpleExoPlayer4.setPlayWhenReady(true);
        }
        M();
    }

    public final void C() {
        SimpleExoPlayer simpleExoPlayer = this.D;
        if (simpleExoPlayer != null) {
            if (simpleExoPlayer != null) {
                simpleExoPlayer.removeListener(this);
            }
            SimpleExoPlayer simpleExoPlayer2 = this.D;
            if (simpleExoPlayer2 != null) {
                simpleExoPlayer2.release();
            }
            this.D = null;
        }
    }

    public final void D() {
        C();
        B();
        J(Referer.LiveView.RETRY);
    }

    public final void E(long j10) {
        SimpleExoPlayer simpleExoPlayer = this.D;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.seekTo(j10);
        }
    }

    public final void F() {
        if (this.B > 0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.B) / 1000;
            te.c cVar = this.J;
            p.e(cVar);
            String liveId = cVar.getLiveId();
            te.c cVar2 = this.J;
            p.e(cVar2);
            String g10 = cVar2.g();
            te.c cVar3 = this.J;
            p.e(cVar3);
            String e10 = cVar3.e();
            te.c cVar4 = this.J;
            p.e(cVar4);
            String title = cVar4.getTitle();
            p1 p1Var = p1.f34946a;
            List<LiveTimeline> list = this.I;
            te.c cVar5 = this.J;
            p.e(cVar5);
            long startedAt = cVar5.getStartedAt();
            te.c cVar6 = this.J;
            p.e(cVar6);
            Puree.d(new Archive.ViewBackgroundEnd(liveId, g10, e10, title, p1Var.b(list, startedAt, cVar6.getEndedAt(), u()), currentTimeMillis));
            this.B = 0L;
        }
    }

    public final void G() {
        this.B = System.currentTimeMillis();
        long u10 = u();
        te.c cVar = this.J;
        p.e(cVar);
        String liveId = cVar.getLiveId();
        te.c cVar2 = this.J;
        p.e(cVar2);
        String g10 = cVar2.g();
        te.c cVar3 = this.J;
        p.e(cVar3);
        String e10 = cVar3.e();
        te.c cVar4 = this.J;
        p.e(cVar4);
        String title = cVar4.getTitle();
        p1 p1Var = p1.f34946a;
        List<LiveTimeline> list = this.I;
        te.c cVar5 = this.J;
        p.e(cVar5);
        long startedAt = cVar5.getStartedAt();
        te.c cVar6 = this.J;
        p.e(cVar6);
        Puree.d(new Archive.ViewBackgroundStart(liveId, g10, e10, title, p1Var.b(list, startedAt, cVar6.getEndedAt(), u10)));
    }

    public final void H() {
        if (this.C || this.J == null) {
            return;
        }
        te.c cVar = this.J;
        p.e(cVar);
        String liveId = cVar.getLiveId();
        te.c cVar2 = this.J;
        p.e(cVar2);
        String g10 = cVar2.g();
        te.c cVar3 = this.J;
        p.e(cVar3);
        String e10 = cVar3.e();
        te.c cVar4 = this.J;
        p.e(cVar4);
        String title = cVar4.getTitle();
        p1 p1Var = p1.f34946a;
        List<LiveTimeline> list = this.I;
        te.c cVar5 = this.J;
        p.e(cVar5);
        long startedAt = cVar5.getStartedAt();
        te.c cVar6 = this.J;
        p.e(cVar6);
        Puree.d(new Archive.ViewEnd(liveId, g10, e10, title, p1Var.b(list, startedAt, cVar6.getEndedAt(), u()), S(), this.A));
        this.A = 0L;
        this.C = true;
        if (this.D == null || !this.K) {
            return;
        }
        F();
    }

    public final void I() {
        long u10 = u();
        te.c cVar = this.J;
        p.e(cVar);
        String liveId = cVar.getLiveId();
        te.c cVar2 = this.J;
        p.e(cVar2);
        String g10 = cVar2.g();
        te.c cVar3 = this.J;
        p.e(cVar3);
        String e10 = cVar3.e();
        te.c cVar4 = this.J;
        p.e(cVar4);
        String title = cVar4.getTitle();
        p1 p1Var = p1.f34946a;
        List<LiveTimeline> list = this.I;
        te.c cVar5 = this.J;
        p.e(cVar5);
        long startedAt = cVar5.getStartedAt();
        te.c cVar6 = this.J;
        p.e(cVar6);
        Puree.d(new Archive.ViewForeground(liveId, g10, e10, title, p1Var.b(list, startedAt, cVar6.getEndedAt(), u10)));
    }

    public final void J(String str) {
        if (this.C) {
            this.G = System.currentTimeMillis();
            this.C = false;
            te.c cVar = this.J;
            p.e(cVar);
            Puree.d(new Archive.ViewStart(cVar, str));
        }
    }

    public final void K(PlaybackParameters playbackParameters) {
        p.h(playbackParameters, "playbackParameters");
        SimpleExoPlayer simpleExoPlayer = this.D;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setPlaybackParameters(playbackParameters);
        }
    }

    public final void L(Surface surface) {
        this.H = surface;
        SimpleExoPlayer simpleExoPlayer = this.D;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setVideoSurface(surface);
        }
    }

    public final void M() {
        te.c cVar = this.J;
        if (cVar == null) {
            return;
        }
        ArchivePlayerActivity.a aVar = ArchivePlayerActivity.f22590a0;
        Context applicationContext = getApplicationContext();
        p.g(applicationContext, "applicationContext");
        Intent a10 = aVar.a(applicationContext, cVar.getLiveId());
        a10.putExtra("EXTRA_FROM_NOTIFICATION", true);
        p1 p1Var = p1.f34946a;
        Context applicationContext2 = getApplicationContext();
        p.g(applicationContext2, "applicationContext");
        Intent d10 = p1Var.d(getApplicationContext());
        String e10 = cVar.e();
        String title = cVar.getTitle();
        if (title == null) {
            title = "";
        }
        startForeground(206, p1Var.a(applicationContext2, a10, d10, e10, title, cVar.getImage_url(), 206));
    }

    public final void N() {
        SimpleExoPlayer simpleExoPlayer = this.D;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setPlayWhenReady(true);
        }
        SimpleExoPlayer simpleExoPlayer2 = this.D;
        if (simpleExoPlayer2 != null) {
            simpleExoPlayer2.getPlaybackState();
        }
    }

    public final void O(boolean z10) {
        H();
        C();
        stopForeground(true);
        if (z10) {
            Q("stopped");
        }
        vd.b.f57299a.c("VODPlayerService_playing");
    }

    public final void P(int i10) {
        stopSelf(i10);
        O(true);
        Integer num = this.E;
        if (num != null) {
            p.e(num);
            stopSelf(num.intValue());
            this.E = null;
        }
    }

    public final void Q(String str) {
        w().c().g(str);
        z();
    }

    public final long R() {
        return (System.currentTimeMillis() - this.F) / 1000;
    }

    public final long S() {
        return (System.currentTimeMillis() - this.G) / 1000;
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public IBinder onBind(Intent intent) {
        p.h(intent, "intent");
        super.onBind(intent);
        return t();
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public void onDestroy() {
        O(true);
        H();
        super.onDestroy();
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        p.h(exoPlaybackException, i7.e.f36387u);
        Q("failed");
        g9.a.c(exoPlaybackException);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(boolean z10, int i10) {
        if (i10 == 1) {
            g9.a.g("state:idle");
            H();
            Q("stopped");
            vd.b.f57299a.c("VODPlayerService_playing");
        } else if (i10 == 2) {
            g9.a.g("state:buffering");
            Q("loading");
        } else if (i10 != 3) {
            if (i10 != 4) {
                return;
            }
            g9.a.g("state:ended");
            H();
            stopForeground(true);
            Q("live_end");
            vd.b.f57299a.c("VODPlayerService_playing");
        } else if (this.D != null && y()) {
            g9.a.g("state:ready(playing)");
            M();
            J(Referer.LiveView.RESUME);
            Q("playing");
            b.a aVar = vd.b.f57299a;
            if (aVar.a("VODPlayerService_playing") == null) {
                aVar.b("VODPlayerService_playing");
            }
        } else {
            g9.a.g("state:ready(pause)");
            stopForeground(true);
            H();
            Q("pause");
            vd.b.f57299a.c("VODPlayerService_playing");
        }
    }

    @Override // com.google.android.exoplayer2.video.VideoListener
    public void onRenderedFirstFrame() {
        this.A = System.currentTimeMillis() - this.G;
        vd.b.f57299a.c("click_play");
        te.c cVar = this.J;
        p.e(cVar);
        Puree.d(new Live.RenderStart(cVar.getLiveId(), this.A, TopicConstant.PACKET_TYPE_HLS));
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
        if (p.c(action, "com.dena.mirrorman.voidplayerservice.action.PLAY")) {
            this.J = L.c(intent);
            Serializable serializableExtra = intent.getSerializableExtra("timeline");
            p.f(serializableExtra, "null cannot be cast to non-null type kotlin.collections.List<com.dena.mirrorman.net.api.response.live.LiveTimeline>");
            this.I = (List) serializableExtra;
            vd.b.f57299a.b("VODPlayerService_playing");
            this.E = Integer.valueOf(i11);
            if (x(intent) || this.D == null || !y()) {
                C();
            }
            B();
        } else if (p.c(action, "com.dena.mirrorman.voidplayerservice.action.STOP")) {
            P(i11);
        }
        return 2;
    }

    @Override // com.google.android.exoplayer2.video.VideoListener
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        String liveId;
        g9.a.g("video size changed : " + i10 + " / " + i11);
        dq.c c10 = dq.c.c();
        te.c cVar = this.J;
        if (cVar == null) {
            liveId = "";
        } else {
            p.e(cVar);
            liveId = cVar.getLiveId();
        }
        c10.l(new y.g(liveId, i10, i11));
    }

    public final void p() {
        SimpleExoPlayer simpleExoPlayer = this.D;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.clearVideoSurface(this.H);
        }
        this.H = null;
    }

    public final void q() {
        if (this.D != null) {
            this.K = true;
            if (y()) {
                G();
            }
        }
    }

    public final void r() {
        if (this.D != null) {
            this.K = false;
            if (y()) {
                I();
                F();
            }
        }
    }

    public final jb.a s() {
        return (jb.a) this.f22644y.getValue();
    }

    public final IBinder t() {
        return (IBinder) this.f22643x.getValue();
    }

    public final long u() {
        SimpleExoPlayer simpleExoPlayer = this.D;
        if (simpleExoPlayer != null) {
            p.e(simpleExoPlayer);
            return simpleExoPlayer.getCurrentPosition();
        }
        return 0L;
    }

    public final long v() {
        SimpleExoPlayer simpleExoPlayer = this.D;
        if (simpleExoPlayer != null) {
            return simpleExoPlayer.getDuration();
        }
        return 0L;
    }

    public final i1 w() {
        return (i1) this.f22645z.getValue();
    }

    public final boolean x(Intent intent) {
        if (this.J == null) {
            return true;
        }
        te.c c10 = L.c(intent);
        te.c cVar = this.J;
        return !p.c(cVar != null ? cVar.getLiveId() : null, c10 != null ? c10.getLiveId() : null);
    }

    public final boolean y() {
        SimpleExoPlayer simpleExoPlayer = this.D;
        if (simpleExoPlayer == null) {
            return false;
        }
        p.e(simpleExoPlayer);
        int playbackState = simpleExoPlayer.getPlaybackState();
        if (playbackState == 1 || playbackState == 4) {
            return false;
        }
        SimpleExoPlayer simpleExoPlayer2 = this.D;
        p.e(simpleExoPlayer2);
        return simpleExoPlayer2.getPlayWhenReady();
    }

    public final void z() {
        String str;
        te.c cVar = this.J;
        if (cVar != null) {
            p.e(cVar);
            str = cVar.j();
        } else {
            str = null;
        }
        dq.c.c().l(new b(this, str, w().c()));
        s().e(w().c());
    }
}
