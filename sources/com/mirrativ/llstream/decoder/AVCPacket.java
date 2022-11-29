package com.mirrativ.llstream.decoder;

import com.mirrativ.llstream.protocol.v1.topic.Extend;
import jo.p;

/* loaded from: classes4.dex */
public final class AVCPacket implements Comparable<AVCPacket>, TimeSeriesPacket {
    private final Extend nalType;
    private long originalTimestamp;
    private final byte[] payload;
    private long timestamp;

    public AVCPacket(byte[] bArr, long j10, long j11, Extend extend) {
        p.h(bArr, "payload");
        p.h(extend, "nalType");
        this.payload = bArr;
        this.timestamp = j10;
        this.originalTimestamp = j11;
        this.nalType = extend;
    }

    public final Extend getNalType() {
        return this.nalType;
    }

    @Override // com.mirrativ.llstream.decoder.TimeSeriesPacket
    public long getOriginalTimestamp() {
        return this.originalTimestamp;
    }

    @Override // com.mirrativ.llstream.decoder.TimeSeriesPacket
    public byte[] getPayload() {
        return this.payload;
    }

    @Override // com.mirrativ.llstream.decoder.TimeSeriesPacket
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.mirrativ.llstream.decoder.TimeSeriesPacket
    public void setOriginalTimestamp(long j10) {
        this.originalTimestamp = j10;
    }

    @Override // com.mirrativ.llstream.decoder.TimeSeriesPacket
    public void setTimestamp(long j10) {
        this.timestamp = j10;
    }

    @Override // java.lang.Comparable
    public int compareTo(AVCPacket aVCPacket) {
        p.h(aVCPacket, "other");
        if (getOriginalTimestamp() < aVCPacket.getOriginalTimestamp()) {
            return -1;
        }
        return getOriginalTimestamp() > aVCPacket.getOriginalTimestamp() ? 1 : 0;
    }
}
