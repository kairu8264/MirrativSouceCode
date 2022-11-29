package com.mirrativ.llstream.decoder;

import java.util.function.LongUnaryOperator;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements LongUnaryOperator {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ c f28247a = new c();

    @Override // java.util.function.LongUnaryOperator
    public final long applyAsLong(long j10) {
        long m24decrementBufferQueueTime$lambda1;
        m24decrementBufferQueueTime$lambda1 = PacketJitterConfig.m24decrementBufferQueueTime$lambda1(j10);
        return m24decrementBufferQueueTime$lambda1;
    }
}
