package com.dena.showroom.flvplayback.impl;

import com.dena.showroom.flvplayback.RTMPEndpoint;
import com.dena.showroom.flvplayback.RTMPWriter;
import com.dena.showroom.flvplayback.Sample;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class DefaultRTMPWriter extends SampleIO implements RTMPWriter {
    public DefaultRTMPWriter(RTMPEndpoint rTMPEndpoint) {
        super(createOpaque("" + rTMPEndpoint.getTcUrl(), "" + rTMPEndpoint.getApplication(), "" + rTMPEndpoint.getStream()));
    }

    private static native long createOpaque(String str, String str2, String str3);

    private static native long getSendQueueSize(long j10);

    private static native void offerSample(long j10, int i10, long j11, long j12, long j13, ByteBuffer byteBuffer, int i11, int i12);

    @Override // com.dena.showroom.flvplayback.RTMPWriter
    public void enqueueSample(int i10, Sample sample, ByteBuffer byteBuffer) {
        offerSample(this.f26548c, i10, sample.pts(), sample.dts(), sample.getFlag(), byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    @Override // com.dena.showroom.flvplayback.RTMPWriter
    public long getQueueSize() {
        return getSendQueueSize(this.f26548c);
    }
}
