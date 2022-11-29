package com.dena.showroom.flvplayback.impl;

import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.dena.showroom.flvplayback.FLVPlayback;
import com.dena.showroom.flvplayback.RTMPEndpoint;
import com.dena.showroom.flvplayback.RTMPReader;
import com.dena.showroom.flvplayback.Sample;
import com.dena.showroom.flvplayback.SamplePlayer;
import com.dena.showroom.flvplayback.SamplePlayerDelegate;
import com.dena.showroom.flvplayback.impl.net.AsyncSocket;
import com.dena.showroom.flvplayback.impl.net.AsyncSocketDelegate;
import com.dena.showroom.flvplayback.impl.net.AsyncSocketLooper;
import com.dena.showroom.flvplayback.profile.PlaybackProfile;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class DefaultFLVPlayback implements FLVPlayback, SamplePlayerDelegate {
    public int A;
    public int B;

    /* renamed from: w  reason: collision with root package name */
    public SamplePlayer f26486w;

    /* renamed from: x  reason: collision with root package name */
    public AsyncSocketLooper f26487x;

    /* renamed from: y  reason: collision with root package name */
    public FLVPlayback.Callback f26488y;

    /* renamed from: z  reason: collision with root package name */
    public a f26489z;

    /* loaded from: classes3.dex */
    public class a implements AsyncSocketDelegate {

        /* renamed from: w  reason: collision with root package name */
        public RTMPReader f26490w;

        /* renamed from: x  reason: collision with root package name */
        public AsyncSocket f26491x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f26492y;

        public a(RTMPReader rTMPReader, AsyncSocket asyncSocket) {
            this.f26490w = rTMPReader;
            this.f26491x = asyncSocket;
            asyncSocket.setDelegate(this);
            DefaultFLVPlayback.this.f26486w.clear();
            DefaultFLVPlayback.this.B = 0;
            DefaultFLVPlayback.this.A = 0;
        }

        public void b() {
            c(null);
        }

        public final void c(Throwable th2) {
            AsyncSocket asyncSocket = this.f26491x;
            if (asyncSocket != null) {
                asyncSocket.close();
                this.f26491x = null;
                if (th2 != null) {
                    DefaultFLVPlayback.this.e(th2);
                }
            }
        }

        public final boolean d() {
            try {
                return this.f26490w.proceed();
            } catch (Exception e10) {
                c(e10);
                return false;
            }
        }

        @Override // com.dena.showroom.flvplayback.impl.net.AsyncSocketDelegate
        public void onBytesAvailable(AsyncSocket asyncSocket) {
            do {
                asyncSocket.read(this.f26490w.getIncomingBytes());
            } while (d());
            DefaultFLVPlayback.this.f26486w.triggerDecoderLoop();
            if (this.f26492y) {
                return;
            }
            DefaultFLVPlayback defaultFLVPlayback = DefaultFLVPlayback.this;
            if (defaultFLVPlayback.B + defaultFLVPlayback.A != 0) {
                this.f26492y = true;
                defaultFLVPlayback.c();
            }
        }

        @Override // com.dena.showroom.flvplayback.impl.net.AsyncSocketDelegate
        public void onClosed(AsyncSocket asyncSocket, Throwable th2) {
            c(th2);
        }

        @Override // com.dena.showroom.flvplayback.impl.net.AsyncSocketDelegate
        public void onSpaceAvailable(AsyncSocket asyncSocket) {
            do {
                int send = asyncSocket.send(this.f26490w.getOutgoingBytes());
                if (send > 0) {
                    Log.v(Factory.TAG, "[playback] outgoingBytes=" + send);
                }
            } while (d());
        }
    }

    public DefaultFLVPlayback(SamplePlayer samplePlayer, AsyncSocketLooper asyncSocketLooper) {
        this.f26487x = asyncSocketLooper;
        this.f26486w = samplePlayer;
        samplePlayer.setDelegate(this);
    }

    public final void c() {
        FLVPlayback.Callback callback = this.f26488y;
        if (callback != null) {
            callback.onPlaybackBegan(this);
        }
    }

    @Override // com.dena.showroom.flvplayback.Closeable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e(null);
    }

    @Override // com.dena.showroom.flvplayback.SamplePlayerDelegate
    public void dequeueSample(SamplePlayer samplePlayer, int i10, ByteBuffer byteBuffer) {
        if (i10 == 1) {
            this.A++;
        } else if (i10 == 2) {
            this.B++;
        }
        this.f26489z.f26490w.dequeueSample(i10, byteBuffer);
    }

    public final void e(Throwable th2) {
        i(th2);
        SamplePlayer samplePlayer = this.f26486w;
        if (samplePlayer != null) {
            samplePlayer.close();
            this.f26486w = null;
            FLVPlayback.Callback callback = this.f26488y;
            if (callback != null && th2 != null) {
                callback.onCrash(this, th2);
            }
            Log.i(Factory.TAG, "[playback] closed", th2);
        }
    }

    @Override // com.dena.showroom.flvplayback.SamplePlayerDelegate
    public Sample getLastSample(SamplePlayer samplePlayer, int i10) {
        a aVar = this.f26489z;
        if (aVar == null) {
            return null;
        }
        return aVar.f26490w.getLastSample(i10);
    }

    @Override // com.dena.showroom.flvplayback.impl.ThreadingPolicy.LooperAware
    public Looper getLooper() {
        return this.f26487x.getLooper();
    }

    public final void i(Throwable th2) {
        a aVar = this.f26489z;
        if (aVar == null) {
            return;
        }
        boolean z10 = aVar.f26492y;
        aVar.b();
        this.f26489z = null;
        FLVPlayback.Callback callback = this.f26488y;
        if (callback != null && z10) {
            callback.onPlaybackEnded(this, th2);
        }
        Log.i(Factory.TAG, "[playback] stop", th2);
    }

    @Override // com.dena.showroom.flvplayback.SamplePlayerDelegate
    public void onAudioLoaded(byte[] bArr) {
        this.f26488y.onAudioLoaded(bArr);
    }

    @Override // com.dena.showroom.flvplayback.SamplePlayerDelegate
    public void onCrash(SamplePlayer samplePlayer, Throwable th2) {
        e(th2);
    }

    @Override // com.dena.showroom.flvplayback.SamplePlayerDelegate
    public void onVideoRendered(int i10) {
        FLVPlayback.Callback callback = this.f26488y;
        if (callback != null) {
            callback.onVideoRendered(i10);
        }
    }

    @Override // com.dena.showroom.flvplayback.SamplePlayerDelegate
    public void onVideoSizeChanged(SamplePlayer samplePlayer) {
        FLVPlayback.Callback callback = this.f26488y;
        if (callback != null) {
            callback.onVideoSizeChanged(this, samplePlayer.getResolution());
        }
    }

    @Override // com.dena.showroom.flvplayback.FLVPlayback
    public void play(RTMPEndpoint rTMPEndpoint) {
        Log.i(Factory.TAG, "[playback] play(" + rTMPEndpoint + ")");
        stop();
        this.f26489z = new a(Factory.newReader(rTMPEndpoint), this.f26487x.connect(rTMPEndpoint.getSocketAddress()));
    }

    @Override // com.dena.showroom.flvplayback.FLVPlayback
    public PlaybackProfile queryPlaybackProfile() {
        return this.f26486w.queryPlaybackProfile();
    }

    @Override // com.dena.showroom.flvplayback.FLVPlayback
    public void sendReceivesVideo(Boolean bool) {
        a aVar = this.f26489z;
        if (aVar != null) {
            aVar.f26490w.sendReceivesVideo(bool);
        }
    }

    @Override // com.dena.showroom.flvplayback.FLVPlayback
    public void setCallback(FLVPlayback.Callback callback) {
        this.f26488y = callback;
    }

    @Override // com.dena.showroom.flvplayback.FLVPlayback
    public void setDisplay(SurfaceHolder surfaceHolder) {
        this.f26486w.setDisplay(surfaceHolder);
    }

    @Override // com.dena.showroom.flvplayback.FLVPlayback
    public void setMute(Boolean bool) {
        SamplePlayer samplePlayer = this.f26486w;
        if (samplePlayer != null) {
            samplePlayer.setMute(bool);
        }
    }

    @Override // com.dena.showroom.flvplayback.FLVPlayback
    public void setSurface(Surface surface) {
        this.f26486w.setSurface(surface);
    }

    @Override // com.dena.showroom.flvplayback.FLVPlayback
    public void stop() {
        i(null);
    }
}
