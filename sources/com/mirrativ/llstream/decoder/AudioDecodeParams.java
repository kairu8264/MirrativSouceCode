package com.mirrativ.llstream.decoder;

import com.google.android.exoplayer2.DefaultRenderersFactory;
import jo.h;

/* loaded from: classes4.dex */
public final class AudioDecodeParams {
    private long decodeLoopPeriodMs;
    private int delayCheckIntervalMs;
    private boolean enableAdjustmentOfTimestamps;
    private int maxLinearRegressionPoints;
    private double maxRenderQueueLengthFactor;
    private long maxWaitTimeOfInputBufferUs;
    private long maxWaitTimeOfOutputBufferUs;
    private float playSpeedHigh;
    private long playSpeedHighThreshold;
    private float playSpeedLow;
    private long playSpeedLowThreshold;
    private float playSpeedNormal;
    private long playSpeedNormalThreshold;
    private long renderLoopPeriodMs;
    private int thresholdOfOutlierForlinearRegressionNs;
    private long thresholdOfUnderrunCountForFadeOut;

    public AudioDecodeParams() {
        this(0, 0.0d, false, 0, 0, 0L, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, 0L, 0L, 0L, 0L, 65535, null);
    }

    public AudioDecodeParams(int i10, double d10, boolean z10, int i11, int i12, long j10, long j11, long j12, long j13, float f10, float f11, float f12, long j14, long j15, long j16, long j17) {
        this.delayCheckIntervalMs = i10;
        this.maxRenderQueueLengthFactor = d10;
        this.enableAdjustmentOfTimestamps = z10;
        this.maxLinearRegressionPoints = i11;
        this.thresholdOfOutlierForlinearRegressionNs = i12;
        this.maxWaitTimeOfInputBufferUs = j10;
        this.maxWaitTimeOfOutputBufferUs = j11;
        this.decodeLoopPeriodMs = j12;
        this.renderLoopPeriodMs = j13;
        this.playSpeedLow = f10;
        this.playSpeedNormal = f11;
        this.playSpeedHigh = f12;
        this.playSpeedLowThreshold = j14;
        this.playSpeedNormalThreshold = j15;
        this.playSpeedHighThreshold = j16;
        this.thresholdOfUnderrunCountForFadeOut = j17;
    }

    public final long getDecodeLoopPeriodMs() {
        return this.decodeLoopPeriodMs;
    }

    public final int getDelayCheckIntervalMs() {
        return this.delayCheckIntervalMs;
    }

    public final boolean getEnableAdjustmentOfTimestamps() {
        return this.enableAdjustmentOfTimestamps;
    }

    public final int getMaxLinearRegressionPoints() {
        return this.maxLinearRegressionPoints;
    }

    public final double getMaxRenderQueueLengthFactor() {
        return this.maxRenderQueueLengthFactor;
    }

    public final long getMaxWaitTimeOfInputBufferUs() {
        return this.maxWaitTimeOfInputBufferUs;
    }

    public final long getMaxWaitTimeOfOutputBufferUs() {
        return this.maxWaitTimeOfOutputBufferUs;
    }

    public final float getPlaySpeedHigh() {
        return this.playSpeedHigh;
    }

    public final long getPlaySpeedHighThreshold() {
        return this.playSpeedHighThreshold;
    }

    public final float getPlaySpeedLow() {
        return this.playSpeedLow;
    }

    public final long getPlaySpeedLowThreshold() {
        return this.playSpeedLowThreshold;
    }

    public final float getPlaySpeedNormal() {
        return this.playSpeedNormal;
    }

    public final long getPlaySpeedNormalThreshold() {
        return this.playSpeedNormalThreshold;
    }

    public final long getRenderLoopPeriodMs() {
        return this.renderLoopPeriodMs;
    }

    public final int getThresholdOfOutlierForlinearRegressionNs() {
        return this.thresholdOfOutlierForlinearRegressionNs;
    }

    public final long getThresholdOfUnderrunCountForFadeOut() {
        return this.thresholdOfUnderrunCountForFadeOut;
    }

    public final void setDecodeLoopPeriodMs(long j10) {
        this.decodeLoopPeriodMs = j10;
    }

    public final void setDelayCheckIntervalMs(int i10) {
        this.delayCheckIntervalMs = i10;
    }

    public final void setEnableAdjustmentOfTimestamps(boolean z10) {
        this.enableAdjustmentOfTimestamps = z10;
    }

    public final void setMaxLinearRegressionPoints(int i10) {
        this.maxLinearRegressionPoints = i10;
    }

    public final void setMaxRenderQueueLengthFactor(double d10) {
        this.maxRenderQueueLengthFactor = d10;
    }

    public final void setMaxWaitTimeOfInputBufferUs(long j10) {
        this.maxWaitTimeOfInputBufferUs = j10;
    }

    public final void setMaxWaitTimeOfOutputBufferUs(long j10) {
        this.maxWaitTimeOfOutputBufferUs = j10;
    }

    public final void setPlaySpeedHigh(float f10) {
        this.playSpeedHigh = f10;
    }

    public final void setPlaySpeedHighThreshold(long j10) {
        this.playSpeedHighThreshold = j10;
    }

    public final void setPlaySpeedLow(float f10) {
        this.playSpeedLow = f10;
    }

    public final void setPlaySpeedLowThreshold(long j10) {
        this.playSpeedLowThreshold = j10;
    }

    public final void setPlaySpeedNormal(float f10) {
        this.playSpeedNormal = f10;
    }

    public final void setPlaySpeedNormalThreshold(long j10) {
        this.playSpeedNormalThreshold = j10;
    }

    public final void setRenderLoopPeriodMs(long j10) {
        this.renderLoopPeriodMs = j10;
    }

    public final void setThresholdOfOutlierForlinearRegressionNs(int i10) {
        this.thresholdOfOutlierForlinearRegressionNs = i10;
    }

    public final void setThresholdOfUnderrunCountForFadeOut(long j10) {
        this.thresholdOfUnderrunCountForFadeOut = j10;
    }

    public /* synthetic */ AudioDecodeParams(int i10, double d10, boolean z10, int i11, int i12, long j10, long j11, long j12, long j13, float f10, float f11, float f12, long j14, long j15, long j16, long j17, int i13, h hVar) {
        this((i13 & 1) != 0 ? 3000 : i10, (i13 & 2) != 0 ? 2.0d : d10, (i13 & 4) != 0 ? false : z10, (i13 & 8) != 0 ? 100 : i11, (i13 & 16) != 0 ? 250000000 : i12, (i13 & 32) != 0 ? 5000L : j10, (i13 & 64) == 0 ? j11 : DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, (i13 & 128) != 0 ? 10L : j12, (i13 & 256) != 0 ? 10L : j13, (i13 & 512) != 0 ? 0.99f : f10, (i13 & 1024) != 0 ? 1.0f : f11, (i13 & 2048) != 0 ? 1.05f : f12, (i13 & 4096) != 0 ? 5L : j14, (i13 & 8192) != 0 ? 10L : j15, (i13 & 16384) != 0 ? 30L : j16, (i13 & 32768) == 0 ? j17 : 5L);
    }
}
