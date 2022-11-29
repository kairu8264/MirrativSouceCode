package com.dena.showroom.flvplayback;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface RTMPWriter extends ByteProcessor {
    void enqueueSample(int i10, Sample sample, ByteBuffer byteBuffer);

    long getQueueSize();
}
