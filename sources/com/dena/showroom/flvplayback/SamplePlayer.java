package com.dena.showroom.flvplayback;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.dena.showroom.flvplayback.impl.ThreadingPolicy;
import com.dena.showroom.flvplayback.profile.PlaybackProfile;

/* loaded from: classes3.dex */
public interface SamplePlayer extends Closeable, ThreadingPolicy.LooperAware {
    void clear();

    Size getResolution();

    PlaybackProfile queryPlaybackProfile();

    void setDelegate(SamplePlayerDelegate samplePlayerDelegate);

    void setDisplay(SurfaceHolder surfaceHolder);

    void setMute(Boolean bool);

    void setSurface(Surface surface);

    void triggerDecoderLoop();
}
