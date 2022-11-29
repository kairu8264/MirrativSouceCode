package com.mirrativ.llstream.encoder;

import android.view.Surface;

/* loaded from: classes4.dex */
public interface VideoEncoder {
    void enqueueSampleBuffer(byte[] bArr);

    int getBitrate();

    VideoEncoderListener getListener();

    VideoEncoderSetting getSetting();

    Surface getSurface();

    void prepare();

    void setBitrate(int i10);

    void setListener(VideoEncoderListener videoEncoderListener);

    void startRunning();

    void stopRunning();
}
