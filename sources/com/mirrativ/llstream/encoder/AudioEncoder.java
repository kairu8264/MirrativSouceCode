package com.mirrativ.llstream.encoder;

/* loaded from: classes4.dex */
public interface AudioEncoder {
    void enqueueSampleBuffer(byte[] bArr);

    AudioEncoderListener getListener();

    AudioEncoderSetting getSetting();

    void prepare();

    void setListener(AudioEncoderListener audioEncoderListener);

    void startRunning();

    void stopRunning();
}
