package com.mirrativ.llstream.encoder;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import jo.p;

/* loaded from: classes4.dex */
public final class CompressedBuffer {
    private final ByteBuffer buffer;
    private final MediaCodec.BufferInfo info;

    public CompressedBuffer(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        p.h(bufferInfo, "info");
        p.h(byteBuffer, "buffer");
        this.info = bufferInfo;
        this.buffer = byteBuffer;
    }

    public final ByteBuffer getBuffer() {
        return this.buffer;
    }

    public final MediaCodec.BufferInfo getInfo() {
        return this.info;
    }
}
