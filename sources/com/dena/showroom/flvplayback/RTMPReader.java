package com.dena.showroom.flvplayback;

import com.dena.showroom.flvplayback.impl.ThreadingPolicy;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface RTMPReader extends ByteProcessor, ThreadingPolicy.Fragile {
    void dequeueSample(int i10, ByteBuffer byteBuffer);

    Sample getLastSample(int i10);

    void sendReceivesVideo(Boolean bool);
}
