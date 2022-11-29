package com.dena.showroom.flvplayback;

/* loaded from: classes3.dex */
public interface FLVPublisher extends Closeable {

    /* loaded from: classes3.dex */
    public interface Callback {
        void onCrash(FLVPublisher fLVPublisher, Throwable th2);
    }

    void setAudioSource(SampleSource sampleSource);

    void setCallback(Callback callback);

    void setVideoSource(SampleSource sampleSource);
}
