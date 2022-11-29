package com.dena.showroom.flvplayback.impl;

import com.dena.showroom.flvplayback.RTMPEndpoint;
import com.dena.showroom.flvplayback.RTMPReader;
import com.dena.showroom.flvplayback.Sample;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class DefaultRTMPReader extends SampleIO implements RTMPReader {
    public DefaultRTMPReader(RTMPEndpoint rTMPEndpoint) {
        super(createOpaque("" + rTMPEndpoint.getTcUrl(), "" + rTMPEndpoint.getApplication(), "" + rTMPEndpoint.getStream(), rTMPEndpoint.getEnable(), rTMPEndpoint.getVideo()));
    }

    private static native long createOpaque(String str, String str2, String str3, boolean z10, boolean z11);

    private static native int getSampleByteLength(long j10, int i10);

    private static native int getSampleBytes(long j10, int i10, ByteBuffer byteBuffer, int i11, int i12);

    private static native long getSampleDTS(long j10, int i10);

    private static native long getSampleFlag(long j10, int i10);

    private static native long getSamplePTS(long j10, int i10);

    private static native void popCurrentSample(long j10, int i10);

    private static native void sendReceivesVideo(long j10, boolean z10);

    @Override // com.dena.showroom.flvplayback.RTMPReader
    public void dequeueSample(int i10, ByteBuffer byteBuffer) {
        if (getSampleByteLength(this.f26548c, i10) < 0) {
            return;
        }
        if (byteBuffer != null) {
            byteBuffer.position(byteBuffer.position() + getSampleBytes(this.f26548c, i10, byteBuffer, 0, byteBuffer.capacity()));
        }
        popCurrentSample(this.f26548c, i10);
    }

    @Override // com.dena.showroom.flvplayback.RTMPReader
    public Sample getLastSample(int i10) {
        int sampleByteLength = getSampleByteLength(this.f26548c, i10);
        if (sampleByteLength < 0) {
            return null;
        }
        return new Sample(getSamplePTS(this.f26548c, i10), getSampleDTS(this.f26548c, i10), getSampleFlag(this.f26548c, i10), sampleByteLength);
    }

    @Override // com.dena.showroom.flvplayback.RTMPReader
    public void sendReceivesVideo(Boolean bool) {
        sendReceivesVideo(this.f26548c, bool.booleanValue());
    }
}
