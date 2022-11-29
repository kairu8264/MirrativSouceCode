package com.mirrativ.llstream.decoder;

import java.util.function.LongUnaryOperator;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements LongUnaryOperator {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f28246a = new b();

    @Override // java.util.function.LongUnaryOperator
    public final long applyAsLong(long j10) {
        long m26incrementBufferQueueTime$lambda0;
        m26incrementBufferQueueTime$lambda0 = PacketJitterConfig.m26incrementBufferQueueTime$lambda0(j10);
        return m26incrementBufferQueueTime$lambda0;
    }
}
