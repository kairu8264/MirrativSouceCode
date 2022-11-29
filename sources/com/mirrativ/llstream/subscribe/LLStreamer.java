package com.mirrativ.llstream.subscribe;

/* loaded from: classes4.dex */
public interface LLStreamer {
    void close();

    void open();

    void opened();

    void retry();

    void tick();
}
