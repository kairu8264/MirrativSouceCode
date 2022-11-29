package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class TimestampAdjuster {
    public static final long DO_NOT_OFFSET = Long.MAX_VALUE;
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    private long firstSampleTimestampUs;
    private long lastSampleTimestampUs = C.TIME_UNSET;
    private boolean sharedInitializationStarted;
    private long timestampOffsetUs;

    public TimestampAdjuster(long j10) {
        this.firstSampleTimestampUs = j10;
    }

    public static long ptsToUs(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long usToNonWrappedPts(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public static long usToWrappedPts(long j10) {
        return usToNonWrappedPts(j10) % MAX_PTS_PLUS_ONE;
    }

    public synchronized long adjustSampleTimestamp(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.lastSampleTimestampUs != C.TIME_UNSET) {
            this.lastSampleTimestampUs = j10;
        } else {
            long j11 = this.firstSampleTimestampUs;
            if (j11 != Long.MAX_VALUE) {
                this.timestampOffsetUs = j11 - j10;
            }
            this.lastSampleTimestampUs = j10;
            notifyAll();
        }
        return j10 + this.timestampOffsetUs;
    }

    public synchronized long adjustTsTimestamp(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long j11 = this.lastSampleTimestampUs;
        if (j11 != C.TIME_UNSET) {
            long usToNonWrappedPts = usToNonWrappedPts(j11);
            long j12 = (4294967296L + usToNonWrappedPts) / MAX_PTS_PLUS_ONE;
            long j13 = ((j12 - 1) * MAX_PTS_PLUS_ONE) + j10;
            j10 += j12 * MAX_PTS_PLUS_ONE;
            if (Math.abs(j13 - usToNonWrappedPts) < Math.abs(j10 - usToNonWrappedPts)) {
                j10 = j13;
            }
        }
        return adjustSampleTimestamp(ptsToUs(j10));
    }

    public synchronized long getFirstSampleTimestampUs() {
        return this.firstSampleTimestampUs;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j10;
        long j11 = this.lastSampleTimestampUs;
        j10 = C.TIME_UNSET;
        if (j11 != C.TIME_UNSET) {
            j10 = this.timestampOffsetUs + j11;
        } else {
            long j12 = this.firstSampleTimestampUs;
            if (j12 != Long.MAX_VALUE) {
                j10 = j12;
            }
        }
        return j10;
    }

    public synchronized long getTimestampOffsetUs() {
        long j10;
        int i10 = (this.firstSampleTimestampUs > Long.MAX_VALUE ? 1 : (this.firstSampleTimestampUs == Long.MAX_VALUE ? 0 : -1));
        j10 = C.TIME_UNSET;
        if (i10 == 0) {
            j10 = 0;
        } else if (this.lastSampleTimestampUs != C.TIME_UNSET) {
            j10 = this.timestampOffsetUs;
        }
        return j10;
    }

    public synchronized void reset(long j10) {
        this.firstSampleTimestampUs = j10;
        this.lastSampleTimestampUs = C.TIME_UNSET;
        this.sharedInitializationStarted = false;
    }

    public synchronized void sharedInitializeOrWait(boolean z10, long j10) throws InterruptedException {
        if (z10) {
            try {
                if (!this.sharedInitializationStarted) {
                    this.firstSampleTimestampUs = j10;
                    this.sharedInitializationStarted = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10 || j10 != this.firstSampleTimestampUs) {
            while (this.lastSampleTimestampUs == C.TIME_UNSET) {
                wait();
            }
        }
    }
}
