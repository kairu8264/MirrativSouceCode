package com.dena.showroom.flvplayback.higherLevel;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.dena.showroom.flvplayback.Size;
import com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayback;
import com.dena.showroom.flvplayback.impl.Factory;
import com.dena.showroom.flvplayback.impl.util.BlackList;
import com.dena.showroom.flvplayback.impl.util.Loopers;
import com.dena.showroom.flvplayback.profile.PlaybackProfile;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class HLSMoviePlayer implements LiveStreamPlayback, SurfaceHolder.Callback, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: x  reason: collision with root package name */
    public SurfaceHolder f26420x;

    /* renamed from: y  reason: collision with root package name */
    public LiveStreamPlayback.Callback f26421y;

    /* renamed from: w  reason: collision with root package name */
    public volatile MediaPlayer f26419w = new MediaPlayer();
    public boolean A = false;
    public int B = -1;

    /* renamed from: z  reason: collision with root package name */
    public Handler f26422z = new Handler(Looper.myLooper());

    /* loaded from: classes3.dex */
    public class a implements MediaPlayer.OnInfoListener {
        public a(HLSMoviePlayer hLSMoviePlayer) {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            Log.w(Factory.TAG, "MediaPlayer(HLS) - what/extra=" + i10 + "/" + i11);
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (HLSMoviePlayer.this.A) {
                return;
            }
            HLSMoviePlayer.this.d(new TimeoutException("preparation timed out"), false);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                HLSMoviePlayer.this.j();
            } finally {
                HLSMoviePlayer.this.a();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Throwable f26425w;

        public d(Throwable th2) {
            this.f26425w = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (HLSMoviePlayer.this.f26421y != null) {
                if (!HLSMoviePlayer.this.A) {
                    HLSMoviePlayer.this.f26421y.onReady(HLSMoviePlayer.this, this.f26425w);
                }
                HLSMoviePlayer.this.f26421y.onCrash(HLSMoviePlayer.this, this.f26425w);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ SurfaceHolder f26427w;

        public e(SurfaceHolder surfaceHolder) {
            this.f26427w = surfaceHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f26427w == HLSMoviePlayer.this.f26420x) {
                HLSMoviePlayer.this.h();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ SurfaceHolder f26429w;

        public f(SurfaceHolder surfaceHolder) {
            this.f26429w = surfaceHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (HLSMoviePlayer.this.isClosed() || this.f26429w != HLSMoviePlayer.this.f26420x) {
                return;
            }
            if (BlackList.mediaPlayerHangsUpWithNullSurface()) {
                HLSMoviePlayer.this.d(new LiveStreamPlayback.BackgroundPlaybackUnsupportedException(), false);
            } else {
                HLSMoviePlayer.this.f26419w.setSurface(null);
            }
        }
    }

    public HLSMoviePlayer(HLSStreamEndpoint hLSStreamEndpoint) {
        try {
            Context context = hLSStreamEndpoint.getContext();
            if (context != null) {
                this.f26419w.setDataSource(context, Uri.parse(hLSStreamEndpoint.getURI().toASCIIString()));
            } else {
                this.f26419w.setDataSource(hLSStreamEndpoint.getURI().toASCIIString());
            }
            this.f26419w.setOnPreparedListener(this);
            this.f26419w.setOnErrorListener(this);
            this.f26419w.setOnVideoSizeChangedListener(this);
            this.f26419w.setOnInfoListener(new a(this));
            a();
            this.f26419w.prepareAsync();
            this.f26422z.postDelayed(new b(), DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public final void a() {
        this.f26422z.postDelayed(new c(), 1000L);
    }

    @Override // com.dena.showroom.flvplayback.Closeable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d(null, false);
    }

    public final void d(Throwable th2, boolean z10) {
        if (this.f26419w != null) {
            this.f26419w.release();
            this.f26419w = null;
            if (th2 != null) {
                Loopers.asyncIfTrue(this.f26422z, new d(th2), z10);
            }
        }
    }

    @Override // com.dena.showroom.flvplayback.impl.ThreadingPolicy.LooperAware
    public Looper getLooper() {
        return this.f26422z.getLooper();
    }

    public final void h() {
        Surface surface;
        if (isClosed() || (surface = this.f26420x.getSurface()) == null || !surface.isValid()) {
            return;
        }
        this.f26419w.setSurface(surface);
    }

    public boolean isClosed() {
        return this.f26419w == null;
    }

    public final void j() {
        if (this.f26419w != null) {
            int currentPosition = this.f26419w.getCurrentPosition();
            if (currentPosition == this.B) {
                d(new Exception("The playback is stucking"), false);
            } else {
                this.B = currentPosition;
            }
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        if (!this.A && i10 == 1 && i11 == -1) {
            return true;
        }
        MediaPlayerException mediaPlayerException = new MediaPlayerException(i10, i11);
        if (i10 == 1 && i11 == -1004) {
            d(new LiveStreamPlayback.NetworkBandwidthNotEnoughException(mediaPlayerException), false);
        } else {
            d(mediaPlayerException, false);
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        if (isClosed()) {
            return;
        }
        this.A = true;
        LiveStreamPlayback.Callback callback = this.f26421y;
        if (callback != null) {
            callback.onReady(this, null);
        }
        try {
            mediaPlayer.start();
        } catch (Exception e10) {
            d(e10, false);
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        if (this.f26421y == null || isClosed()) {
            return;
        }
        this.f26421y.onVideoSizeChanged(this, new Size(i10, i11));
    }

    @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayback
    public PlaybackProfile queryPlaybackProfile() {
        return null;
    }

    @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayback
    public void sendReceivesVideo(Boolean bool) {
    }

    @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayback
    public void setCallback(LiveStreamPlayback.Callback callback) {
        this.f26421y = callback;
    }

    @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayback
    public void setDisplay(SurfaceHolder surfaceHolder) {
        SurfaceHolder surfaceHolder2;
        if (isClosed() || (surfaceHolder2 = this.f26420x) == surfaceHolder) {
            return;
        }
        if (surfaceHolder2 != null) {
            surfaceHolder2.removeCallback(this);
        }
        this.f26420x = surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this);
            h();
        } else if (BlackList.mediaPlayerHangsUpWithNullSurface()) {
            d(new LiveStreamPlayback.BackgroundPlaybackUnsupportedException(), true);
        } else {
            this.f26419w.setSurface(null);
        }
    }

    @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayback
    public void setMute(Boolean bool) {
    }

    @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayback
    public void setSurface(Surface surface) {
        if (isClosed()) {
            return;
        }
        this.f26419w.setSurface(surface);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Loopers.postAndWait(this.f26422z, new e(surfaceHolder));
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Loopers.postAndWait(this.f26422z, new f(surfaceHolder));
    }
}
