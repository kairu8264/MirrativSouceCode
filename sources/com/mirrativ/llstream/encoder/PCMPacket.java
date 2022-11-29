package com.mirrativ.llstream.encoder;

import com.mirrativ.llstream.decoder.TimeSeriesPacket;
import jo.p;

/* loaded from: classes4.dex */
public final class PCMPacket implements Comparable<PCMPacket>, TimeSeriesPacket {
    private long originalTimestamp;
    private final byte[] payload;
    private long timestamp;

    public PCMPacket(byte[] bArr, long j10, long j11) {
        p.h(bArr, "payload");
        this.payload = bArr;
        this.timestamp = j10;
        this.originalTimestamp = j11;
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
    public int compareTo(PCMPacket pCMPacket) {
        p.h(pCMPacket, "other");
        if (getOriginalTimestamp() < pCMPacket.getOriginalTimestamp()) {
            return -1;
        }
        return getOriginalTimestamp() > pCMPacket.getOriginalTimestamp() ? 1 : 0;
    }
}
