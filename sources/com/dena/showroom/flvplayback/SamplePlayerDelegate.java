package com.dena.showroom.flvplayback;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface SamplePlayerDelegate {
    void dequeueSample(SamplePlayer samplePlayer, int i10, ByteBuffer byteBuffer);

    Sample getLastSample(SamplePlayer samplePlayer, int i10);

    void onAudioLoaded(byte[] bArr);

    void onCrash(SamplePlayer samplePlayer, Throwable th2);

    void onVideoRendered(int i10);

    void onVideoSizeChanged(SamplePlayer samplePlayer);
}
