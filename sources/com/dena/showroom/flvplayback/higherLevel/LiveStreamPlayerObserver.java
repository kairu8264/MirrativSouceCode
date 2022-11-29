package com.dena.showroom.flvplayback.higherLevel;

import com.dena.showroom.flvplayback.Size;

/* loaded from: classes3.dex */
public interface LiveStreamPlayerObserver {
    void onLoadingBegan(LiveStreamPlayer liveStreamPlayer);

    void onLoadingEnded(LiveStreamPlayer liveStreamPlayer, Throwable th2);

    void onPlaybackFailed(LiveStreamPlayer liveStreamPlayer, Throwable th2);

    void onVideoSizeChanged(LiveStreamPlayer liveStreamPlayer, Size size);
}
