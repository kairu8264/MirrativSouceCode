package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lk.e0;
import lk.f0;

/* loaded from: classes3.dex */
public final class MergingMediaSource extends CompositeMediaSource<Integer> {
    private static final MediaItem EMPTY_MEDIA_ITEM = new MediaItem.Builder().setMediaId("MergingMediaSource").build();
    private static final int PERIOD_COUNT_UNSET = -1;
    private final boolean adjustPeriodTimeOffsets;
    private final boolean clipDurations;
    private final Map<Object, Long> clippedDurationsUs;
    private final e0<Object, ClippingMediaPeriod> clippedMediaPeriods;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final MediaSource[] mediaSources;
    private IllegalMergeException mergeError;
    private final ArrayList<MediaSource> pendingTimelineSources;
    private int periodCount;
    private long[][] periodTimeOffsetsUs;
    private final Timeline[] timelines;

    /* loaded from: classes3.dex */
    public static final class ClippedTimeline extends ForwardingTimeline {
        private final long[] periodDurationsUs;
        private final long[] windowDurationsUs;

        public ClippedTimeline(Timeline timeline, Map<Object, Long> map) {
            super(timeline);
            int windowCount = timeline.getWindowCount();
            this.windowDurationsUs = new long[timeline.getWindowCount()];
            Timeline.Window window = new Timeline.Window();
            for (int i10 = 0; i10 < windowCount; i10++) {
                this.windowDurationsUs[i10] = timeline.getWindow(i10, window).durationUs;
            }
            int periodCount = timeline.getPeriodCount();
            this.periodDurationsUs = new long[periodCount];
            Timeline.Period period = new Timeline.Period();
            for (int i11 = 0; i11 < periodCount; i11++) {
                timeline.getPeriod(i11, period, true);
                long longValue = ((Long) Assertions.checkNotNull(map.get(period.uid))).longValue();
                long[] jArr = this.periodDurationsUs;
                jArr[i11] = longValue == Long.MIN_VALUE ? period.durationUs : longValue;
                long j10 = period.durationUs;
                if (j10 != C.TIME_UNSET) {
                    long[] jArr2 = this.windowDurationsUs;
                    int i12 = period.windowIndex;
                    jArr2[i12] = jArr2[i12] - (j10 - jArr[i11]);
                }
            }
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
            super.getPeriod(i10, period, z10);
            period.durationUs = this.periodDurationsUs[i10];
            return period;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int i10, Timeline.Window window, long j10) {
            long j11;
            super.getWindow(i10, window, j10);
            long j12 = this.windowDurationsUs[i10];
            window.durationUs = j12;
            if (j12 != C.TIME_UNSET) {
                long j13 = window.defaultPositionUs;
                if (j13 != C.TIME_UNSET) {
                    j11 = Math.min(j13, j12);
                    window.defaultPositionUs = j11;
                    return window;
                }
            }
            j11 = window.defaultPositionUs;
            window.defaultPositionUs = j11;
            return window;
        }
    }

    /* loaded from: classes3.dex */
    public static final class IllegalMergeException extends IOException {
        public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
        public final int reason;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface Reason {
        }

        public IllegalMergeException(int i10) {
            this.reason = i10;
        }
    }

    public MergingMediaSource(MediaSource... mediaSourceArr) {
        this(false, mediaSourceArr);
    }

    private void computePeriodTimeOffsets() {
        Timeline.Period period = new Timeline.Period();
        for (int i10 = 0; i10 < this.periodCount; i10++) {
            long j10 = -this.timelines[0].getPeriod(i10, period).getPositionInWindowUs();
            int i11 = 1;
            while (true) {
                Timeline[] timelineArr = this.timelines;
                if (i11 < timelineArr.length) {
                    this.periodTimeOffsetsUs[i10][i11] = j10 - (-timelineArr[i11].getPeriod(i10, period).getPositionInWindowUs());
                    i11++;
                }
            }
        }
    }

    private void updateClippedDuration() {
        Timeline[] timelineArr;
        Timeline.Period period = new Timeline.Period();
        for (int i10 = 0; i10 < this.periodCount; i10++) {
            int i11 = 0;
            long j10 = Long.MIN_VALUE;
            while (true) {
                timelineArr = this.timelines;
                if (i11 >= timelineArr.length) {
                    break;
                }
                long durationUs = timelineArr[i11].getPeriod(i10, period).getDurationUs();
                if (durationUs != C.TIME_UNSET) {
                    long j11 = durationUs + this.periodTimeOffsetsUs[i10][i11];
                    if (j10 == Long.MIN_VALUE || j11 < j10) {
                        j10 = j11;
                    }
                }
                i11++;
            }
            Object uidOfPeriod = timelineArr[0].getUidOfPeriod(i10);
            this.clippedDurationsUs.put(uidOfPeriod, Long.valueOf(j10));
            for (ClippingMediaPeriod clippingMediaPeriod : this.clippedMediaPeriods.get(uidOfPeriod)) {
                clippingMediaPeriod.updateClipping(0L, j10);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        int length = this.mediaSources.length;
        MediaPeriod[] mediaPeriodArr = new MediaPeriod[length];
        int indexOfPeriod = this.timelines[0].getIndexOfPeriod(mediaPeriodId.periodUid);
        for (int i10 = 0; i10 < length; i10++) {
            mediaPeriodArr[i10] = this.mediaSources[i10].createPeriod(mediaPeriodId.copyWithPeriodUid(this.timelines[i10].getUidOfPeriod(indexOfPeriod)), allocator, j10 - this.periodTimeOffsetsUs[indexOfPeriod][i10]);
        }
        MergingMediaPeriod mergingMediaPeriod = new MergingMediaPeriod(this.compositeSequenceableLoaderFactory, this.periodTimeOffsetsUs[indexOfPeriod], mediaPeriodArr);
        if (this.clipDurations) {
            ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(mergingMediaPeriod, true, 0L, ((Long) Assertions.checkNotNull(this.clippedDurationsUs.get(mediaPeriodId.periodUid))).longValue());
            this.clippedMediaPeriods.put(mediaPeriodId.periodUid, clippingMediaPeriod);
            return clippingMediaPeriod;
        }
        return mergingMediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        MediaSource[] mediaSourceArr = this.mediaSources;
        return mediaSourceArr.length > 0 ? mediaSourceArr[0].getMediaItem() : EMPTY_MEDIA_ITEM;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    @Deprecated
    public Object getTag() {
        MediaSource[] mediaSourceArr = this.mediaSources;
        if (mediaSourceArr.length > 0) {
            return mediaSourceArr[0].getTag();
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalMergeException illegalMergeException = this.mergeError;
        if (illegalMergeException == null) {
            super.maybeThrowSourceInfoRefreshError();
            return;
        }
        throw illegalMergeException;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        for (int i10 = 0; i10 < this.mediaSources.length; i10++) {
            prepareChildSource(Integer.valueOf(i10), this.mediaSources[i10]);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        if (this.clipDurations) {
            ClippingMediaPeriod clippingMediaPeriod = (ClippingMediaPeriod) mediaPeriod;
            Iterator<Map.Entry<Object, ClippingMediaPeriod>> it = this.clippedMediaPeriods.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, ClippingMediaPeriod> next = it.next();
                if (next.getValue().equals(clippingMediaPeriod)) {
                    this.clippedMediaPeriods.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            mediaPeriod = clippingMediaPeriod.mediaPeriod;
        }
        MergingMediaPeriod mergingMediaPeriod = (MergingMediaPeriod) mediaPeriod;
        int i10 = 0;
        while (true) {
            MediaSource[] mediaSourceArr = this.mediaSources;
            if (i10 >= mediaSourceArr.length) {
                return;
            }
            mediaSourceArr[i10].releasePeriod(mergingMediaPeriod.getChildPeriod(i10));
            i10++;
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        Arrays.fill(this.timelines, (Object) null);
        this.periodCount = -1;
        this.mergeError = null;
        this.pendingTimelineSources.clear();
        Collections.addAll(this.pendingTimelineSources, this.mediaSources);
    }

    public MergingMediaSource(boolean z10, MediaSource... mediaSourceArr) {
        this(z10, false, mediaSourceArr);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Integer num, MediaSource.MediaPeriodId mediaPeriodId) {
        if (num.intValue() == 0) {
            return mediaPeriodId;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public void onChildSourceInfoRefreshed(Integer num, MediaSource mediaSource, Timeline timeline) {
        if (this.mergeError != null) {
            return;
        }
        if (this.periodCount == -1) {
            this.periodCount = timeline.getPeriodCount();
        } else if (timeline.getPeriodCount() != this.periodCount) {
            this.mergeError = new IllegalMergeException(0);
            return;
        }
        if (this.periodTimeOffsetsUs.length == 0) {
            this.periodTimeOffsetsUs = (long[][]) Array.newInstance(long.class, this.periodCount, this.timelines.length);
        }
        this.pendingTimelineSources.remove(mediaSource);
        this.timelines[num.intValue()] = timeline;
        if (this.pendingTimelineSources.isEmpty()) {
            if (this.adjustPeriodTimeOffsets) {
                computePeriodTimeOffsets();
            }
            ClippedTimeline clippedTimeline = this.timelines[0];
            if (this.clipDurations) {
                updateClippedDuration();
                clippedTimeline = new ClippedTimeline(clippedTimeline, this.clippedDurationsUs);
            }
            refreshSourceInfo(clippedTimeline);
        }
    }

    public MergingMediaSource(boolean z10, boolean z11, MediaSource... mediaSourceArr) {
        this(z10, z11, new DefaultCompositeSequenceableLoaderFactory(), mediaSourceArr);
    }

    public MergingMediaSource(boolean z10, boolean z11, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, MediaSource... mediaSourceArr) {
        this.adjustPeriodTimeOffsets = z10;
        this.clipDurations = z11;
        this.mediaSources = mediaSourceArr;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.pendingTimelineSources = new ArrayList<>(Arrays.asList(mediaSourceArr));
        this.periodCount = -1;
        this.timelines = new Timeline[mediaSourceArr.length];
        this.periodTimeOffsetsUs = new long[0];
        this.clippedDurationsUs = new HashMap();
        this.clippedMediaPeriods = f0.a().a().e();
    }
}
