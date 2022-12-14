package com.google.android.exoplayer2.text.cea;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class CeaSubtitle implements Subtitle {
    private final List<Cue> cues;

    public CeaSubtitle(List<Cue> list) {
        this.cues = list;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List<Cue> getCues(long j10) {
        return j10 >= 0 ? this.cues : Collections.emptyList();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int i10) {
        Assertions.checkArgument(i10 == 0);
        return 0L;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
