package com.google.android.exoplayer2.text.ssa;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class SsaSubtitle implements Subtitle {
    private final List<Long> cueTimesUs;
    private final List<List<Cue>> cues;

    public SsaSubtitle(List<List<Cue>> list, List<Long> list2) {
        this.cues = list;
        this.cueTimesUs = list2;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List<Cue> getCues(long j10) {
        int binarySearchFloor = Util.binarySearchFloor((List<? extends Comparable<? super Long>>) this.cueTimesUs, Long.valueOf(j10), true, false);
        if (binarySearchFloor == -1) {
            return Collections.emptyList();
        }
        return this.cues.get(binarySearchFloor);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int i10) {
        Assertions.checkArgument(i10 >= 0);
        Assertions.checkArgument(i10 < this.cueTimesUs.size());
        return this.cueTimesUs.get(i10).longValue();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.cueTimesUs.size();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j10) {
        int binarySearchCeil = Util.binarySearchCeil((List<? extends Comparable<? super Long>>) this.cueTimesUs, Long.valueOf(j10), false, false);
        if (binarySearchCeil < this.cueTimesUs.size()) {
            return binarySearchCeil;
        }
        return -1;
    }
}
