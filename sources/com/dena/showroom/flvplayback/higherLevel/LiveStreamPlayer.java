package com.dena.showroom.flvplayback.higherLevel;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.dena.showroom.flvplayback.Size;
import com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayback;
import com.dena.showroom.flvplayback.impl.Factory;
import com.dena.showroom.flvplayback.impl.ThreadingPolicy;
import com.dena.showroom.flvplayback.impl.util.Loopers;
import com.dena.showroom.flvplayback.impl.util.SurfaceUtil;
import com.dena.showroom.flvplayback.profile.PlaybackProfile;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public class LiveStreamPlayer implements ThreadingPolicy.Actor, LiveStreamPlayback.Callback {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ boolean f26433n = true;

    /* renamed from: b  reason: collision with root package name */
    public volatile LiveStreamPlayback f26435b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Callback f26436c;

    /* renamed from: d  reason: collision with root package name */
    public SurfaceHolder f26437d;

    /* renamed from: e  reason: collision with root package name */
    public Surface f26438e;

    /* renamed from: f  reason: collision with root package name */
    public HandlerThread f26439f;

    /* renamed from: g  reason: collision with root package name */
    public Handler f26440g;

    /* renamed from: h  reason: collision with root package name */
    public StreamEndpoint f26441h;

    /* renamed from: i  reason: collision with root package name */
    public StreamEndpoint f26442i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f26443j;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet<LiveStreamPlayerObserver> f26434a = new HashSet<>();

    /* renamed from: k  reason: collision with root package name */
    public long f26444k = -1;

    /* renamed from: l  reason: collision with root package name */
    public boolean f26445l = false;

    /* renamed from: m  reason: collision with root package name */
    public final Runnable f26446m = new b();

    /* loaded from: classes3.dex */
    public interface Callback extends LiveStreamPlayerObserver {
        boolean continuesToRetry(LiveStreamPlayer liveStreamPlayer, Throwable th2);

        void onAudioLoaded(byte[] bArr);

        void onError(Throwable th2);

        void onVideoRendered(int i10);
    }

    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f26447w;

        public a(boolean z10) {
            this.f26447w = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveStreamPlayer.this.j(this.f26447w);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveStreamPlayer.this.f();
        }
    }

    /* loaded from: classes3.dex */
    public class c implements s<LiveStreamPlayerObserver> {
        public c() {
        }

        @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayer.s
        public void a(LiveStreamPlayerObserver liveStreamPlayerObserver) {
            liveStreamPlayerObserver.onLoadingBegan(LiveStreamPlayer.this);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f26451w;

        public d(boolean z10) {
            this.f26451w = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveStreamPlayer.this.f26443j = false;
            LiveStreamPlayer.this.f26441h = null;
            LiveStreamPlayer.this.i(null, this.f26451w);
        }
    }

    /* loaded from: classes3.dex */
    public class e implements s<LiveStreamPlayerObserver> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Throwable f26453a;

        public e(Throwable th2) {
            this.f26453a = th2;
        }

        @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayer.s
        public void a(LiveStreamPlayerObserver liveStreamPlayerObserver) {
            liveStreamPlayerObserver.onPlaybackFailed(LiveStreamPlayer.this, this.f26453a);
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Callable<PlaybackProfile> {
        public f() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public PlaybackProfile call() {
            return LiveStreamPlayer.this.f26435b.queryPlaybackProfile();
        }
    }

    /* loaded from: classes3.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveStreamPlayer.this.i(null, false);
        }
    }

    /* loaded from: classes3.dex */
    public class h implements s<LiveStreamPlayerObserver> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Throwable f26457a;

        public h(Throwable th2) {
            this.f26457a = th2;
        }

        @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayer.s
        public void a(LiveStreamPlayerObserver liveStreamPlayerObserver) {
            liveStreamPlayerObserver.onLoadingEnded(LiveStreamPlayer.this, this.f26457a);
        }
    }

    /* loaded from: classes3.dex */
    public class i implements s<LiveStreamPlayerObserver> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Size f26459a;

        public i(Size size) {
            this.f26459a = size;
        }

        @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayer.s
        public void a(LiveStreamPlayerObserver liveStreamPlayerObserver) {
            liveStreamPlayerObserver.onVideoSizeChanged(LiveStreamPlayer.this, this.f26459a);
        }
    }

    /* loaded from: classes3.dex */
    public class j implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ArrayList f26461w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s f26462x;

        public j(LiveStreamPlayer liveStreamPlayer, ArrayList arrayList, s sVar) {
            this.f26461w = arrayList;
            this.f26462x = sVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f26461w.iterator();
            while (it.hasNext()) {
                this.f26462x.a((LiveStreamPlayerObserver) it.next());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class k implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f26463w;

        public k(boolean z10) {
            this.f26463w = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (LiveStreamPlayer.this.f26435b != null) {
                LiveStreamPlayer.this.f26435b.sendReceivesVideo(Boolean.valueOf(this.f26463w));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class l implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Boolean f26465w;

        public l(Boolean bool) {
            this.f26465w = bool;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (LiveStreamPlayer.this.f26435b != null) {
                LiveStreamPlayer.this.f26435b.setMute(this.f26465w);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class m implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ StreamEndpoint f26467w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f26468x;

        public m(StreamEndpoint streamEndpoint, boolean z10) {
            this.f26467w = streamEndpoint;
            this.f26468x = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f26467w != LiveStreamPlayer.this.f26441h) {
                StreamEndpoint streamEndpoint = this.f26467w;
                if (streamEndpoint == null || !streamEndpoint.equals(LiveStreamPlayer.this.f26441h)) {
                    if (LiveStreamPlayer.this.f26441h = this.f26467w == null) {
                        LiveStreamPlayer.this.i(null, this.f26468x);
                    }
                    LiveStreamPlayer.this.k(false, 0L, this.f26468x);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class n implements Callable<StreamEndpoint> {
        public n() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public StreamEndpoint call() {
            return LiveStreamPlayer.this.f26441h;
        }
    }

    /* loaded from: classes3.dex */
    public class o implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ SurfaceHolder f26471w;

        public o(SurfaceHolder surfaceHolder) {
            this.f26471w = surfaceHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            SurfaceHolder surfaceHolder = LiveStreamPlayer.this.f26437d;
            SurfaceHolder surfaceHolder2 = this.f26471w;
            if (surfaceHolder != surfaceHolder2) {
                LiveStreamPlayer.this.f26437d = surfaceHolder2;
                if (LiveStreamPlayer.this.f26435b != null) {
                    LiveStreamPlayer.this.f26435b.setDisplay(this.f26471w);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class p implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Surface f26473w;

        public p(Surface surface) {
            this.f26473w = surface;
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveStreamPlayer.this.f26438e = this.f26473w;
            if (LiveStreamPlayer.this.f26435b != null) {
                LiveStreamPlayer.this.f26435b.setSurface(this.f26473w);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class q implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ LiveStreamPlayerObserver f26475w;

        public q(LiveStreamPlayerObserver liveStreamPlayerObserver) {
            this.f26475w = liveStreamPlayerObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveStreamPlayer.this.f26434a.add(this.f26475w);
        }
    }

    /* loaded from: classes3.dex */
    public class r implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ LiveStreamPlayerObserver f26477w;

        public r(LiveStreamPlayerObserver liveStreamPlayerObserver) {
            this.f26477w = liveStreamPlayerObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveStreamPlayer.this.f26434a.remove(this.f26477w);
        }
    }

    /* loaded from: classes3.dex */
    public interface s<T> {
        void a(T t10);
    }

    public LiveStreamPlayer() {
        HandlerThread handlerThread = new HandlerThread("PlaybackService", -2);
        this.f26439f = handlerThread;
        handlerThread.start();
        this.f26440g = new Handler(this.f26439f.getLooper());
    }

    @Deprecated
    public void addObserver(LiveStreamPlayerObserver liveStreamPlayerObserver) {
        this.f26440g.post(new q(liveStreamPlayerObserver));
    }

    public final <T> T e(Callable<T> callable) {
        return (T) Loopers.waitFor(this.f26440g, callable);
    }

    public final void f() {
        if (!f26433n && this.f26435b != null) {
            throw new AssertionError();
        }
        g(new c());
        this.f26444k = -1L;
        this.f26435b = LiveStreamPlaybackFactory.open(this.f26442i);
        this.f26435b.setCallback(this);
        if (this.f26445l) {
            this.f26435b.setMute(Boolean.valueOf(this.f26445l));
        }
        if (this.f26437d != null) {
            this.f26435b.setDisplay(this.f26437d);
        }
        if (this.f26438e != null) {
            this.f26435b.setSurface(this.f26438e);
        }
    }

    public final void g(s<LiveStreamPlayerObserver> sVar) {
        ArrayList arrayList = new ArrayList(this.f26434a);
        Callback callback = this.f26436c;
        if (callback != null) {
            arrayList.add(callback);
        }
        new Handler().post(new j(this, arrayList, sVar));
    }

    public StreamEndpoint getEndpoint() {
        return (StreamEndpoint) e(new n());
    }

    public void i(Throwable th2, boolean z10) {
        SurfaceHolder surfaceHolder;
        this.f26440g.removeCallbacks(this.f26446m);
        if (this.f26435b != null) {
            this.f26435b.close();
            this.f26435b = null;
            this.f26442i = null;
            if (th2 != null && !m(th2)) {
                g(new e(th2));
            }
            if (!z10 || (surfaceHolder = this.f26437d) == null) {
                return;
            }
            SurfaceUtil.clear(surfaceHolder);
        }
    }

    public boolean isPlaying() {
        return this.f26435b != null;
    }

    public final void j(boolean z10) {
        boolean z11 = !this.f26443j;
        if (z11) {
            this.f26443j = true;
        }
        k(z10 || z11, 0L, true);
    }

    public final void k(boolean z10, long j10, boolean z11) {
        if (!this.f26443j || this.f26441h == null) {
            return;
        }
        if (z10 || this.f26435b == null || !this.f26441h.equals(this.f26442i)) {
            Log.i(Factory.TAG, "[live] playback will begin in " + j10 + "msec.");
            i(null, z11);
            this.f26442i = this.f26441h;
            if (j10 > 0) {
                this.f26440g.postDelayed(this.f26446m, j10);
            } else {
                f();
            }
        }
    }

    public final boolean m(Throwable th2) {
        if (th2 instanceof LiveStreamPlayback.Unrecoverable) {
            return false;
        }
        Callback callback = this.f26436c;
        if (callback == null || callback.continuesToRetry(this, th2)) {
            if (this.f26444k == -1) {
                k(true, PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS, false);
            } else {
                k(true, Math.max(0L, PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS - (SystemClock.uptimeMillis() - this.f26444k)), false);
            }
            Log.w(Factory.TAG, "playback recovering!");
            return true;
        }
        return false;
    }

    @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayback.Callback
    public void onAudioLoaded(byte[] bArr) {
        Callback callback = this.f26436c;
        if (callback != null) {
            callback.onAudioLoaded(bArr);
        }
    }

    @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayback.Callback
    public void onCrash(LiveStreamPlayback liveStreamPlayback, Throwable th2) {
        i(th2, false);
        Callback callback = this.f26436c;
        if (callback != null) {
            callback.onError(th2);
        }
    }

    @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayback.Callback
    public void onReady(LiveStreamPlayback liveStreamPlayback, Throwable th2) {
        g(new h(th2));
        if (th2 == null) {
            this.f26444k = SystemClock.uptimeMillis();
        }
    }

    @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayback.Callback
    public void onVideoRendered(int i10) {
        if (this.f26436c != null) {
            this.f26436c.onVideoRendered(i10);
        }
    }

    @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayback.Callback
    public void onVideoSizeChanged(LiveStreamPlayback liveStreamPlayback, Size size) {
        g(new i(size));
    }

    public void play() {
        play(false);
    }

    public PlaybackProfile queryPlaybackProfile() {
        return (PlaybackProfile) e(new f());
    }

    public synchronized void release() {
        if (this.f26439f == null) {
            return;
        }
        Loopers.postAndWait(this.f26440g, new g());
        this.f26439f.quit();
        this.f26439f = null;
    }

    @Deprecated
    public void removeObserver(LiveStreamPlayerObserver liveStreamPlayerObserver) {
        this.f26440g.post(new r(liveStreamPlayerObserver));
    }

    public void sendReceivesVideo(boolean z10) {
        this.f26440g.post(new k(z10));
    }

    public void setCallback(Callback callback) {
        this.f26436c = callback;
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        this.f26440g.post(new o(surfaceHolder));
    }

    public void setEndpoint(StreamEndpoint streamEndpoint, boolean z10) {
        this.f26440g.post(new m(streamEndpoint, z10));
    }

    public void setMute(Boolean bool) {
        this.f26445l = bool.booleanValue();
        this.f26440g.post(new l(bool));
    }

    public void setSurface(Surface surface) {
        this.f26440g.post(new p(surface));
    }

    public void stop() {
        stop(false);
    }

    public void play(boolean z10) {
        this.f26440g.post(new a(z10));
    }

    public void setEndpoint(StreamEndpoint streamEndpoint) {
        setEndpoint(streamEndpoint, false);
    }

    public void stop(boolean z10) {
        this.f26440g.post(new d(z10));
    }
}
