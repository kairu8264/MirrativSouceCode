package com.dena.showroom.flvplayback.higherLevel;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.dena.showroom.flvplayback.FLVPlayback;
import com.dena.showroom.flvplayback.RTMPEndpoint;
import com.dena.showroom.flvplayback.Size;
import com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayback;
import com.dena.showroom.flvplayback.impl.Factory;
import com.dena.showroom.flvplayback.profile.PlaybackProfile;

/* loaded from: classes3.dex */
public class RTMPMoviePlayer implements LiveStreamPlayback, FLVPlayback.Callback {

    /* renamed from: w  reason: collision with root package name */
    public FLVPlayback f26481w;

    /* renamed from: x  reason: collision with root package name */
    public LiveStreamPlayback.Callback f26482x;

    /* renamed from: y  reason: collision with root package name */
    public Handler f26483y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f26484z;

    public RTMPMoviePlayer(RTMPEndpoint rTMPEndpoint) {
        FLVPlayback newPlayback = Factory.newPlayback(rTMPEndpoint);
        this.f26481w = newPlayback;
        newPlayback.setCallback(this);
        this.f26481w.play(rTMPEndpoint);
        this.f26483y = new Handler(Looper.myLooper());
    }

    public final void a(Throwable th2) {
        FLVPlayback fLVPlayback = this.f26481w;
        if (fLVPlayback != null) {
            fLVPlayback.close();
            this.f26481w = null;
            LiveStreamPlayback.Callback callback = this.f26482x;
            if (callback != null && th2 != null) {
                callback.onCrash(this, th2);
            }
        }
        Handler handler = this.f26483y;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f26483y = null;
        }
    }

    @Override // com.dena.showroom.flvplayback.Closeable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a(null);
    }

    @Override // com.dena.showroom.flvplayback.impl.ThreadingPolicy.LooperAware
    public Looper getLooper() {
        return this.f26483y.getLooper();
    }

    @Override // com.dena.showroom.flvplayback.FLVPlayback.Callback
    public void onAudioLoaded(byte[] bArr) {
        LiveStreamPlayback.Callback callback = this.f26482x;
        if (callback != null) {
            callback.onAudioLoaded(bArr);
        }
    }

    @Override // com.dena.showroom.flvplayback.FLVPlayback.Callback
    public void onCrash(FLVPlayback fLVPlayback, Throwable th2) {
        a(th2);
    }

    @Override // com.dena.showroom.flvplayback.FLVPlayback.Callback
    public void onPlaybackBegan(FLVPlayback fLVPlayback) {
        this.f26484z = true;
        LiveStreamPlayback.Callback callback = this.f26482x;
        if (callback != null) {
            callback.onReady(this, null);
        }
    }

    @Override // com.dena.showroom.flvplayback.FLVPlayback.Callback
    public void onPlaybackEnded(FLVPlayback fLVPlayback, Throwable th2) {
        LiveStreamPlayback.Callback callback = this.f26482x;
        if (callback != null && th2 != null && !this.f26484z) {
            callback.onReady(this, th2);
        }
        a(th2);
    }

    @Override // com.dena.showroom.flvplayback.FLVPlayback.Callback
    public void onVideoRendered(int i10) {
        LiveStreamPlayback.Callback callback = this.f26482x;
        if (callback != null) {
            callback.onVideoRendered(i10);
        }
    }

    @Override // com.dena.showroom.flvplayback.FLVPlayback.Callback
    public void onVideoSizeChanged(FLVPlayback fLVPlayback, Size size) {
        LiveStreamPlayback.Callback callback = this.f26482x;
        if (callback != null) {
            callback.onVideoSizeChanged(this, size);
        }
    }

    @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayback
    public PlaybackProfile queryPlaybackProfile() {
        FLVPlayback fLVPlayback = this.f26481w;
        if (fLVPlayback == null) {
            return null;
        }
        return fLVPlayback.queryPlaybackProfile();
    }

    @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayback
    public void sendReceivesVideo(Boolean bool) {
        FLVPlayback fLVPlayback = this.f26481w;
        if (fLVPlayback != null) {
            fLVPlayback.sendReceivesVideo(bool);
        }
    }

    @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayback
    public void setCallback(LiveStreamPlayback.Callback callback) {
        this.f26482x = callback;
    }

    @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayback
    public void setDisplay(SurfaceHolder surfaceHolder) {
        this.f26481w.setDisplay(surfaceHolder);
    }

    @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayback
    public void setMute(Boolean bool) {
        FLVPlayback fLVPlayback = this.f26481w;
        if (fLVPlayback != null) {
            fLVPlayback.setMute(bool);
        }
    }

    @Override // com.dena.showroom.flvplayback.higherLevel.LiveStreamPlayback
    public void setSurface(Surface surface) {
        this.f26481w.setSurface(surface);
    }
}
