package com.mirrativ.llstream.decoder;

import java.util.function.LongUnaryOperator;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements LongUnaryOperator {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ d f28248a = new d();

    @Override // java.util.function.LongUnaryOperator
    public final long applyAsLong(long j10) {
        long m25incrementAVRenderingSkipGap$lambda2;
        m25incrementAVRenderingSkipGap$lambda2 = PacketJitterConfig.m25incrementAVRenderingSkipGap$lambda2(j10);
        return m25incrementAVRenderingSkipGap$lambda2;
    }
}
