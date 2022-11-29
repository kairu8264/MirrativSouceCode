package com.mirrativ.llstream.decoder;

import com.mirrativ.llstream.protocol.v1.topic.Extend;
import jo.p;

/* loaded from: classes4.dex */
public final class AACPacket implements Comparable<AACPacket>, TimeSeriesPacket {
    private long originalTimestamp;
    private final byte[] payload;
    private long timestamp;
    private final Extend type;

    public AACPacket(byte[] bArr, long j10, long j11, Extend extend) {
        p.h(bArr, "payload");
        p.h(extend, "type");
        this.payload = bArr;
        this.timestamp = j10;
        this.originalTimestamp = j11;
        this.type = extend;
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

    public final Extend getType() {
        return this.type;
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
    public int compareTo(AACPacket aACPacket) {
        p.h(aACPacket, "other");
        if (getOriginalTimestamp() < aACPacket.getOriginalTimestamp()) {
            return -1;
        }
        return getOriginalTimestamp() > aACPacket.getOriginalTimestamp() ? 1 : 0;
    }
}
