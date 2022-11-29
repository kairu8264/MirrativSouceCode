package com.dena.showroom.flvplayback.higherLevel;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.dena.showroom.flvplayback.Closeable;
import com.dena.showroom.flvplayback.Size;
import com.dena.showroom.flvplayback.impl.ThreadingPolicy;
import com.dena.showroom.flvplayback.profile.PlaybackProfile;

/* loaded from: classes3.dex */
public interface LiveStreamPlayback extends ThreadingPolicy.LooperAware, Closeable {

    /* loaded from: classes3.dex */
    public static class BackgroundPlaybackUnsupportedException extends Exception implements Unrecoverable {
    }

    /* loaded from: classes3.dex */
    public interface Callback {
        void onAudioLoaded(byte[] bArr);

        void onCrash(LiveStreamPlayback liveStreamPlayback, Throwable th2);

        void onReady(LiveStreamPlayback liveStreamPlayback, Throwable th2);

        void onVideoRendered(int i10);

        void onVideoSizeChanged(LiveStreamPlayback liveStreamPlayback, Size size);
    }

    /* loaded from: classes3.dex */
    public static class NetworkBandwidthNotEnoughException extends Exception implements Unrecoverable {
        public NetworkBandwidthNotEnoughException(Throwable th2) {
            super(th2);
        }
    }

    /* loaded from: classes3.dex */
    public interface Unrecoverable {
    }

    PlaybackProfile queryPlaybackProfile();

    void sendReceivesVideo(Boolean bool);

    void setCallback(Callback callback);

    void setDisplay(SurfaceHolder surfaceHolder);

    void setMute(Boolean bool);

    void setSurface(Surface surface);
}
