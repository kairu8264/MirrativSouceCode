package com.mirrativ.llstream.decoder;

/* loaded from: classes4.dex */
public interface TimeSeriesPacket {
    long getOriginalTimestamp();

    byte[] getPayload();

    long getTimestamp();

    void setOriginalTimestamp(long j10);

    void setTimestamp(long j10);
}
