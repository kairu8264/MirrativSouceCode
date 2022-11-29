package com.mirrativ.llstream.subscribe;

import android.util.Size;

/* loaded from: classes4.dex */
public interface LLStreamingPlayerCallback {
    boolean continuesToRetry(LLStreamingPlayer lLStreamingPlayer, Throwable th2);

    void onAudioLoaded(byte[] bArr);

    void onError(Throwable th2);

    void onLoadingBegan(LLStreamingPlayer lLStreamingPlayer);

    void onLoadingEnded(LLStreamingPlayer lLStreamingPlayer, Throwable th2);

    void onPlaybackFailed(LLStreamingPlayer lLStreamingPlayer, Throwable th2);

    void onVideoRendered(int i10);

    void onVideoSizeChanged(LLStreamingPlayer lLStreamingPlayer, Size size);
}
