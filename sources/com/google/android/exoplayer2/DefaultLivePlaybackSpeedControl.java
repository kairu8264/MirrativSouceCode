package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes3.dex */
public final class DefaultLivePlaybackSpeedControl implements LivePlaybackSpeedControl {
    public static final float DEFAULT_FALLBACK_MAX_PLAYBACK_SPEED = 1.03f;
    public static final float DEFAULT_FALLBACK_MIN_PLAYBACK_SPEED = 0.97f;
    public static final long DEFAULT_MAX_LIVE_OFFSET_ERROR_MS_FOR_UNIT_SPEED = 20;
    public static final float DEFAULT_MIN_POSSIBLE_LIVE_OFFSET_SMOOTHING_FACTOR = 0.999f;
    public static final long DEFAULT_MIN_UPDATE_INTERVAL_MS = 1000;
    public static final float DEFAULT_PROPORTIONAL_CONTROL_FACTOR = 0.1f;
    public static final long DEFAULT_TARGET_LIVE_OFFSET_INCREMENT_ON_REBUFFER_MS = 500;
    private float adjustedPlaybackSpeed;
    private long currentTargetLiveOffsetUs;
    private final float fallbackMaxPlaybackSpeed;
    private final float fallbackMinPlaybackSpeed;
    private long idealTargetLiveOffsetUs;
    private long lastPlaybackSpeedUpdateMs;
    private final long maxLiveOffsetErrorUsForUnitSpeed;
    private float maxPlaybackSpeed;
    private long maxTargetLiveOffsetUs;
    private long mediaConfigurationTargetLiveOffsetUs;
    private float minPlaybackSpeed;
    private final float minPossibleLiveOffsetSmoothingFactor;
    private long minTargetLiveOffsetUs;
    private final long minUpdateIntervalMs;
    private final float proportionalControlFactor;
    private long smoothedMinPossibleLiveOffsetDeviationUs;
    private long smoothedMinPossibleLiveOffsetUs;
    private long targetLiveOffsetOverrideUs;
    private final long targetLiveOffsetRebufferDeltaUs;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private float fallbackMinPlaybackSpeed = 0.97f;
        private float fallbackMaxPlaybackSpeed = 1.03f;
        private long minUpdateIntervalMs = 1000;
        private float proportionalControlFactorUs = 1.0E-7f;
        private long maxLiveOffsetErrorUsForUnitSpeed = C.msToUs(20);
        private long targetLiveOffsetIncrementOnRebufferUs = C.msToUs(500);
        private float minPossibleLiveOffsetSmoothingFactor = 0.999f;

        public DefaultLivePlaybackSpeedControl build() {
            return new DefaultLivePlaybackSpeedControl(this.fallbackMinPlaybackSpeed, this.fallbackMaxPlaybackSpeed, this.minUpdateIntervalMs, this.proportionalControlFactorUs, this.maxLiveOffsetErrorUsForUnitSpeed, this.targetLiveOffsetIncrementOnRebufferUs, this.minPossibleLiveOffsetSmoothingFactor);
        }

        public Builder setFallbackMaxPlaybackSpeed(float f10) {
            Assertions.checkArgument(f10 >= 1.0f);
            this.fallbackMaxPlaybackSpeed = f10;
            return this;
        }

        public Builder setFallbackMinPlaybackSpeed(float f10) {
            Assertions.checkArgument(0.0f < f10 && f10 <= 1.0f);
            this.fallbackMinPlaybackSpeed = f10;
            return this;
        }

        public Builder setMaxLiveOffsetErrorMsForUnitSpeed(long j10) {
            Assertions.checkArgument(j10 > 0);
            this.maxLiveOffsetErrorUsForUnitSpeed = C.msToUs(j10);
            return this;
        }

        public Builder setMinPossibleLiveOffsetSmoothingFactor(float f10) {
            Assertions.checkArgument(f10 >= 0.0f && f10 < 1.0f);
            this.minPossibleLiveOffsetSmoothingFactor = f10;
            return this;
        }

        public Builder setMinUpdateIntervalMs(long j10) {
            Assertions.checkArgument(j10 > 0);
            this.minUpdateIntervalMs = j10;
            return this;
        }

        public Builder setProportionalControlFactor(float f10) {
            Assertions.checkArgument(f10 > 0.0f);
            this.proportionalControlFactorUs = f10 / 1000000.0f;
            return this;
        }

        public Builder setTargetLiveOffsetIncrementOnRebufferMs(long j10) {
            Assertions.checkArgument(j10 >= 0);
            this.targetLiveOffsetIncrementOnRebufferUs = C.msToUs(j10);
            return this;
        }
    }

    private void adjustTargetLiveOffsetUs(long j10) {
        long j11 = this.smoothedMinPossibleLiveOffsetUs + (this.smoothedMinPossibleLiveOffsetDeviationUs * 3);
        if (this.currentTargetLiveOffsetUs > j11) {
            float msToUs = (float) C.msToUs(this.minUpdateIntervalMs);
            this.currentTargetLiveOffsetUs = mk.d.c(j11, this.idealTargetLiveOffsetUs, this.currentTargetLiveOffsetUs - (((this.adjustedPlaybackSpeed - 1.0f) * msToUs) + ((this.maxPlaybackSpeed - 1.0f) * msToUs)));
            return;
        }
        long constrainValue = Util.constrainValue(j10 - (Math.max(0.0f, this.adjustedPlaybackSpeed - 1.0f) / this.proportionalControlFactor), this.currentTargetLiveOffsetUs, j11);
        this.currentTargetLiveOffsetUs = constrainValue;
        long j12 = this.maxTargetLiveOffsetUs;
        if (j12 == C.TIME_UNSET || constrainValue <= j12) {
            return;
        }
        this.currentTargetLiveOffsetUs = j12;
    }

    private void maybeResetTargetLiveOffsetUs() {
        long j10 = this.mediaConfigurationTargetLiveOffsetUs;
        if (j10 != C.TIME_UNSET) {
            long j11 = this.targetLiveOffsetOverrideUs;
            if (j11 != C.TIME_UNSET) {
                j10 = j11;
            }
            long j12 = this.minTargetLiveOffsetUs;
            if (j12 != C.TIME_UNSET && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.maxTargetLiveOffsetUs;
            if (j13 != C.TIME_UNSET && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.idealTargetLiveOffsetUs == j10) {
            return;
        }
        this.idealTargetLiveOffsetUs = j10;
        this.currentTargetLiveOffsetUs = j10;
        this.smoothedMinPossibleLiveOffsetUs = C.TIME_UNSET;
        this.smoothedMinPossibleLiveOffsetDeviationUs = C.TIME_UNSET;
        this.lastPlaybackSpeedUpdateMs = C.TIME_UNSET;
    }

    private static long smooth(long j10, long j11, float f10) {
        return (((float) j10) * f10) + ((1.0f - f10) * ((float) j11));
    }

    private void updateSmoothedMinPossibleLiveOffsetUs(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.smoothedMinPossibleLiveOffsetUs;
        if (j13 == C.TIME_UNSET) {
            this.smoothedMinPossibleLiveOffsetUs = j12;
            this.smoothedMinPossibleLiveOffsetDeviationUs = 0L;
            return;
        }
        long max = Math.max(j12, smooth(j13, j12, this.minPossibleLiveOffsetSmoothingFactor));
        this.smoothedMinPossibleLiveOffsetUs = max;
        this.smoothedMinPossibleLiveOffsetDeviationUs = smooth(this.smoothedMinPossibleLiveOffsetDeviationUs, Math.abs(j12 - max), this.minPossibleLiveOffsetSmoothingFactor);
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public float getAdjustedPlaybackSpeed(long j10, long j11) {
        if (this.mediaConfigurationTargetLiveOffsetUs == C.TIME_UNSET) {
            return 1.0f;
        }
        updateSmoothedMinPossibleLiveOffsetUs(j10, j11);
        if (this.lastPlaybackSpeedUpdateMs != C.TIME_UNSET && SystemClock.elapsedRealtime() - this.lastPlaybackSpeedUpdateMs < this.minUpdateIntervalMs) {
            return this.adjustedPlaybackSpeed;
        }
        this.lastPlaybackSpeedUpdateMs = SystemClock.elapsedRealtime();
        adjustTargetLiveOffsetUs(j10);
        long j12 = j10 - this.currentTargetLiveOffsetUs;
        if (Math.abs(j12) < this.maxLiveOffsetErrorUsForUnitSpeed) {
            this.adjustedPlaybackSpeed = 1.0f;
        } else {
            this.adjustedPlaybackSpeed = Util.constrainValue((this.proportionalControlFactor * ((float) j12)) + 1.0f, this.minPlaybackSpeed, this.maxPlaybackSpeed);
        }
        return this.adjustedPlaybackSpeed;
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public long getTargetLiveOffsetUs() {
        return this.currentTargetLiveOffsetUs;
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void notifyRebuffer() {
        long j10 = this.currentTargetLiveOffsetUs;
        if (j10 == C.TIME_UNSET) {
            return;
        }
        long j11 = j10 + this.targetLiveOffsetRebufferDeltaUs;
        this.currentTargetLiveOffsetUs = j11;
        long j12 = this.maxTargetLiveOffsetUs;
        if (j12 != C.TIME_UNSET && j11 > j12) {
            this.currentTargetLiveOffsetUs = j12;
        }
        this.lastPlaybackSpeedUpdateMs = C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration) {
        this.mediaConfigurationTargetLiveOffsetUs = C.msToUs(liveConfiguration.targetOffsetMs);
        this.minTargetLiveOffsetUs = C.msToUs(liveConfiguration.minOffsetMs);
        this.maxTargetLiveOffsetUs = C.msToUs(liveConfiguration.maxOffsetMs);
        float f10 = liveConfiguration.minPlaybackSpeed;
        if (f10 == -3.4028235E38f) {
            f10 = this.fallbackMinPlaybackSpeed;
        }
        this.minPlaybackSpeed = f10;
        float f11 = liveConfiguration.maxPlaybackSpeed;
        if (f11 == -3.4028235E38f) {
            f11 = this.fallbackMaxPlaybackSpeed;
        }
        this.maxPlaybackSpeed = f11;
        maybeResetTargetLiveOffsetUs();
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void setTargetLiveOffsetOverrideUs(long j10) {
        this.targetLiveOffsetOverrideUs = j10;
        maybeResetTargetLiveOffsetUs();
    }

    private DefaultLivePlaybackSpeedControl(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.fallbackMinPlaybackSpeed = f10;
        this.fallbackMaxPlaybackSpeed = f11;
        this.minUpdateIntervalMs = j10;
        this.proportionalControlFactor = f12;
        this.maxLiveOffsetErrorUsForUnitSpeed = j11;
        this.targetLiveOffsetRebufferDeltaUs = j12;
        this.minPossibleLiveOffsetSmoothingFactor = f13;
        this.mediaConfigurationTargetLiveOffsetUs = C.TIME_UNSET;
        this.targetLiveOffsetOverrideUs = C.TIME_UNSET;
        this.minTargetLiveOffsetUs = C.TIME_UNSET;
        this.maxTargetLiveOffsetUs = C.TIME_UNSET;
        this.minPlaybackSpeed = f10;
        this.maxPlaybackSpeed = f11;
        this.adjustedPlaybackSpeed = 1.0f;
        this.lastPlaybackSpeedUpdateMs = C.TIME_UNSET;
        this.idealTargetLiveOffsetUs = C.TIME_UNSET;
        this.currentTargetLiveOffsetUs = C.TIME_UNSET;
        this.smoothedMinPossibleLiveOffsetUs = C.TIME_UNSET;
        this.smoothedMinPossibleLiveOffsetDeviationUs = C.TIME_UNSET;
    }
}
