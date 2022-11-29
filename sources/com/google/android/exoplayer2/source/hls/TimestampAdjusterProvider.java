package com.google.android.exoplayer2.source.hls;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;

/* loaded from: classes3.dex */
public final class TimestampAdjusterProvider {
    private final SparseArray<TimestampAdjuster> timestampAdjusters = new SparseArray<>();

    public TimestampAdjuster getAdjuster(int i10) {
        TimestampAdjuster timestampAdjuster = this.timestampAdjusters.get(i10);
        if (timestampAdjuster == null) {
            TimestampAdjuster timestampAdjuster2 = new TimestampAdjuster(Long.MAX_VALUE);
            this.timestampAdjusters.put(i10, timestampAdjuster2);
            return timestampAdjuster2;
        }
        return timestampAdjuster;
    }

    public void reset() {
        this.timestampAdjusters.clear();
    }
}
