package com.mirrativ.llstream.decoder;

import java.util.ArrayList;
import jo.p;

/* loaded from: classes4.dex */
public final class VideoDecodeParams {
    private long decodeLoopPeriodMs;
    private long defaultFPS;
    private double factorOfBufferFullPeriod;
    private double factorOfDefaultPeriod;
    private double factorOfEnoughPeriod;
    private final ArrayList<String> forceH264ProfileLevel30DeviceModels;
    private int maxDecodeQueueLength;
    private double maxRenderingPeriodOfFrameMs;
    private int maxTimestampSizeForCalcFPS;
    private long maxWaitTimeOfInputBufferUs;
    private long maxWaitTimeOfOutputBufferUs;
    private long minSmoothQueueLength;
    private int minTimestampSizeForCalcFPS;
    private final long startIndexForSkipToRender;
    private int thresholdForRapidChangeOfFPS;
    private long thresholdForRenderingDelayFromAudioUs;
    private int thresholdOfBufferRecoveryCount;

    public VideoDecodeParams() {
        this(0, 0, 0L, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 0L, 0, 0L, 0L, 0L, 0L, 0L, null, 131071, null);
    }

    public VideoDecodeParams(int i10, int i11, long j10, double d10, double d11, double d12, double d13, int i12, int i13, long j11, int i14, long j12, long j13, long j14, long j15, long j16, ArrayList<String> arrayList) {
        p.h(arrayList, "forceH264ProfileLevel30DeviceModels");
        this.maxTimestampSizeForCalcFPS = i10;
        this.minTimestampSizeForCalcFPS = i11;
        this.defaultFPS = j10;
        this.factorOfDefaultPeriod = d10;
        this.factorOfBufferFullPeriod = d11;
        this.factorOfEnoughPeriod = d12;
        this.maxRenderingPeriodOfFrameMs = d13;
        this.thresholdForRapidChangeOfFPS = i12;
        this.thresholdOfBufferRecoveryCount = i13;
        this.minSmoothQueueLength = j11;
        this.maxDecodeQueueLength = i14;
        this.decodeLoopPeriodMs = j12;
        this.maxWaitTimeOfInputBufferUs = j13;
        this.maxWaitTimeOfOutputBufferUs = j14;
        this.thresholdForRenderingDelayFromAudioUs = j15;
        this.startIndexForSkipToRender = j16;
        this.forceH264ProfileLevel30DeviceModels = arrayList;
    }

    public final long getDecodeLoopPeriodMs() {
        return this.decodeLoopPeriodMs;
    }

    public final long getDefaultFPS() {
        return this.defaultFPS;
    }

    public final double getFactorOfBufferFullPeriod() {
        return this.factorOfBufferFullPeriod;
    }

    public final double getFactorOfDefaultPeriod() {
        return this.factorOfDefaultPeriod;
    }

    public final double getFactorOfEnoughPeriod() {
        return this.factorOfEnoughPeriod;
    }

    public final ArrayList<String> getForceH264ProfileLevel30DeviceModels() {
        return this.forceH264ProfileLevel30DeviceModels;
    }

    public final int getMaxDecodeQueueLength() {
        return this.maxDecodeQueueLength;
    }

    public final double getMaxRenderingPeriodOfFrameMs() {
        return this.maxRenderingPeriodOfFrameMs;
    }

    public final int getMaxTimestampSizeForCalcFPS() {
        return this.maxTimestampSizeForCalcFPS;
    }

    public final long getMaxWaitTimeOfInputBufferUs() {
        return this.maxWaitTimeOfInputBufferUs;
    }

    public final long getMaxWaitTimeOfOutputBufferUs() {
        return this.maxWaitTimeOfOutputBufferUs;
    }

    public final long getMinSmoothQueueLength() {
        return this.minSmoothQueueLength;
    }

    public final int getMinTimestampSizeForCalcFPS() {
        return this.minTimestampSizeForCalcFPS;
    }

    public final long getStartIndexForSkipToRender() {
        return this.startIndexForSkipToRender;
    }

    public final int getThresholdForRapidChangeOfFPS() {
        return this.thresholdForRapidChangeOfFPS;
    }

    public final long getThresholdForRenderingDelayFromAudioUs() {
        return this.thresholdForRenderingDelayFromAudioUs;
    }

    public final int getThresholdOfBufferRecoveryCount() {
        return this.thresholdOfBufferRecoveryCount;
    }

    public final void setDecodeLoopPeriodMs(long j10) {
        this.decodeLoopPeriodMs = j10;
    }

    public final void setDefaultFPS(long j10) {
        this.defaultFPS = j10;
    }

    public final void setFactorOfBufferFullPeriod(double d10) {
        this.factorOfBufferFullPeriod = d10;
    }

    public final void setFactorOfDefaultPeriod(double d10) {
        this.factorOfDefaultPeriod = d10;
    }

    public final void setFactorOfEnoughPeriod(double d10) {
        this.factorOfEnoughPeriod = d10;
    }

    public final void setMaxDecodeQueueLength(int i10) {
        this.maxDecodeQueueLength = i10;
    }

    public final void setMaxRenderingPeriodOfFrameMs(double d10) {
        this.maxRenderingPeriodOfFrameMs = d10;
    }

    public final void setMaxTimestampSizeForCalcFPS(int i10) {
        this.maxTimestampSizeForCalcFPS = i10;
    }

    public final void setMaxWaitTimeOfInputBufferUs(long j10) {
        this.maxWaitTimeOfInputBufferUs = j10;
    }

    public final void setMaxWaitTimeOfOutputBufferUs(long j10) {
        this.maxWaitTimeOfOutputBufferUs = j10;
    }

    public final void setMinSmoothQueueLength(long j10) {
        this.minSmoothQueueLength = j10;
    }

    public final void setMinTimestampSizeForCalcFPS(int i10) {
        this.minTimestampSizeForCalcFPS = i10;
    }

    public final void setThresholdForRapidChangeOfFPS(int i10) {
        this.thresholdForRapidChangeOfFPS = i10;
    }

    public final void setThresholdForRenderingDelayFromAudioUs(long j10) {
        this.thresholdForRenderingDelayFromAudioUs = j10;
    }

    public final void setThresholdOfBufferRecoveryCount(int i10) {
        this.thresholdOfBufferRecoveryCount = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ VideoDecodeParams(int r31, int r32, long r33, double r35, double r37, double r39, double r41, int r43, int r44, long r45, int r47, long r48, long r50, long r52, long r54, long r56, java.util.ArrayList r58, int r59, jo.h r60) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.decoder.VideoDecodeParams.<init>(int, int, long, double, double, double, double, int, int, long, int, long, long, long, long, long, java.util.ArrayList, int, jo.h):void");
    }
}
