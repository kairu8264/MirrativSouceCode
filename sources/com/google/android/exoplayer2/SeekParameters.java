package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes3.dex */
public final class SeekParameters {
    public static final SeekParameters CLOSEST_SYNC;
    public static final SeekParameters DEFAULT;
    public static final SeekParameters EXACT;
    public static final SeekParameters NEXT_SYNC;
    public static final SeekParameters PREVIOUS_SYNC;
    public final long toleranceAfterUs;
    public final long toleranceBeforeUs;

    static {
        SeekParameters seekParameters = new SeekParameters(0L, 0L);
        EXACT = seekParameters;
        CLOSEST_SYNC = new SeekParameters(Long.MAX_VALUE, Long.MAX_VALUE);
        PREVIOUS_SYNC = new SeekParameters(Long.MAX_VALUE, 0L);
        NEXT_SYNC = new SeekParameters(0L, Long.MAX_VALUE);
        DEFAULT = seekParameters;
    }

    public SeekParameters(long j10, long j11) {
        Assertions.checkArgument(j10 >= 0);
        Assertions.checkArgument(j11 >= 0);
        this.toleranceBeforeUs = j10;
        this.toleranceAfterUs = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SeekParameters.class != obj.getClass()) {
            return false;
        }
        SeekParameters seekParameters = (SeekParameters) obj;
        return this.toleranceBeforeUs == seekParameters.toleranceBeforeUs && this.toleranceAfterUs == seekParameters.toleranceAfterUs;
    }

    public int hashCode() {
        return (((int) this.toleranceBeforeUs) * 31) + ((int) this.toleranceAfterUs);
    }

    public long resolveSeekPositionUs(long j10, long j11, long j12) {
        long j13 = this.toleranceBeforeUs;
        if (j13 == 0 && this.toleranceAfterUs == 0) {
            return j10;
        }
        long subtractWithOverflowDefault = Util.subtractWithOverflowDefault(j10, j13, Long.MIN_VALUE);
        long addWithOverflowDefault = Util.addWithOverflowDefault(j10, this.toleranceAfterUs, Long.MAX_VALUE);
        boolean z10 = true;
        boolean z11 = subtractWithOverflowDefault <= j11 && j11 <= addWithOverflowDefault;
        if (subtractWithOverflowDefault > j12 || j12 > addWithOverflowDefault) {
            z10 = false;
        }
        return (z11 && z10) ? Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12 : z11 ? j11 : z10 ? j12 : subtractWithOverflowDefault;
    }
}
