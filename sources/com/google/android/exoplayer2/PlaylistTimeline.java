package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
final class PlaylistTimeline extends AbstractConcatenatedTimeline {
    private final HashMap<Object, Integer> childIndexByUid;
    private final int[] firstPeriodInChildIndices;
    private final int[] firstWindowInChildIndices;
    private final int periodCount;
    private final Timeline[] timelines;
    private final Object[] uids;
    private final int windowCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistTimeline(Collection<? extends MediaSourceInfoHolder> collection, ShuffleOrder shuffleOrder) {
        super(false, shuffleOrder);
        int i10 = 0;
        int size = collection.size();
        this.firstPeriodInChildIndices = new int[size];
        this.firstWindowInChildIndices = new int[size];
        this.timelines = new Timeline[size];
        this.uids = new Object[size];
        this.childIndexByUid = new HashMap<>();
        int i11 = 0;
        int i12 = 0;
        for (MediaSourceInfoHolder mediaSourceInfoHolder : collection) {
            this.timelines[i12] = mediaSourceInfoHolder.getTimeline();
            this.firstWindowInChildIndices[i12] = i10;
            this.firstPeriodInChildIndices[i12] = i11;
            i10 += this.timelines[i12].getWindowCount();
            i11 += this.timelines[i12].getPeriodCount();
            this.uids[i12] = mediaSourceInfoHolder.getUid();
            this.childIndexByUid.put(this.uids[i12], Integer.valueOf(i12));
            i12++;
        }
        this.windowCount = i10;
        this.periodCount = i11;
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public int getChildIndexByChildUid(Object obj) {
        Integer num = this.childIndexByUid.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public int getChildIndexByPeriodIndex(int i10) {
        return Util.binarySearchFloor(this.firstPeriodInChildIndices, i10 + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public int getChildIndexByWindowIndex(int i10) {
        return Util.binarySearchFloor(this.firstWindowInChildIndices, i10 + 1, false, false);
    }

    public List<Timeline> getChildTimelines() {
        return Arrays.asList(this.timelines);
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public Object getChildUidByChildIndex(int i10) {
        return this.uids[i10];
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public int getFirstPeriodIndexByChildIndex(int i10) {
        return this.firstPeriodInChildIndices[i10];
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public int getFirstWindowIndexByChildIndex(int i10) {
        return this.firstWindowInChildIndices[i10];
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPeriodCount() {
        return this.periodCount;
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public Timeline getTimelineByChildIndex(int i10) {
        return this.timelines[i10];
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getWindowCount() {
        return this.windowCount;
    }
}
