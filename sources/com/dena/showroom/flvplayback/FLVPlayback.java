package com.dena.showroom.flvplayback;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.dena.showroom.flvplayback.impl.ThreadingPolicy;
import com.dena.showroom.flvplayback.profile.PlaybackProfile;

/* loaded from: classes3.dex */
public interface FLVPlayback extends Closeable, ThreadingPolicy.LooperAware {

    /* loaded from: classes3.dex */
    public interface Callback {
        void onAudioLoaded(byte[] bArr);

        void onCrash(FLVPlayback fLVPlayback, Throwable th2);

        void onPlaybackBegan(FLVPlayback fLVPlayback);

        void onPlaybackEnded(FLVPlayback fLVPlayback, Throwable th2);

        void onVideoRendered(int i10);

        void onVideoSizeChanged(FLVPlayback fLVPlayback, Size size);
    }

    void play(RTMPEndpoint rTMPEndpoint);

    PlaybackProfile queryPlaybackProfile();

    void sendReceivesVideo(Boolean bool);

    void setCallback(Callback callback);

    void setDisplay(SurfaceHolder surfaceHolder);

    void setMute(Boolean bool);

    void setSurface(Surface surface);

    void stop();
}
