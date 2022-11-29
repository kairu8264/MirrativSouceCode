package com.mirrativ.llstream.publish;

/* loaded from: classes4.dex */
public interface LLPublishStreamListener {
    void onLLStreamConnected(LLPublishStream lLPublishStream);

    void onLLStreamDisconnected(LLPublishStream lLPublishStream);

    void onLLStreamError(LLPublishStream lLPublishStream, Throwable th2);

    void onPublishInsufficientBitrate(LLPublishStream lLPublishStream);

    void onPublishStreamStalled(LLPublishStream lLPublishStream);

    void onPublishSufficientBitrate(LLPublishStream lLPublishStream);
}
