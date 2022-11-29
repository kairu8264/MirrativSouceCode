package com.mirrativ.llstream.decoder;

import java.util.function.LongUnaryOperator;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements LongUnaryOperator {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ e f28249a = new e();

    @Override // java.util.function.LongUnaryOperator
    public final long applyAsLong(long j10) {
        long m23decrementAVRenderingSkipGap$lambda3;
        m23decrementAVRenderingSkipGap$lambda3 = PacketJitterConfig.m23decrementAVRenderingSkipGap$lambda3(j10);
        return m23decrementAVRenderingSkipGap$lambda3;
    }
}
