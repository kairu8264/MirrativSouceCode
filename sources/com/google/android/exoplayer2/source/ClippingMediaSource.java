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
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ClippingMediaSource extends CompositeMediaSource<Void> {
    private final boolean allowDynamicClippingUpdates;
    private IllegalClippingException clippingError;
    private ClippingTimeline clippingTimeline;
    private final boolean enableInitialDiscontinuity;
    private final long endUs;
    private final ArrayList<ClippingMediaPeriod> mediaPeriods;
    private final MediaSource mediaSource;
    private long periodEndUs;
    private long periodStartUs;
    private final boolean relativeToDefaultPosition;
    private final long startUs;
    private final Timeline.Window window;

    /* loaded from: classes3.dex */
    public static final class ClippingTimeline extends ForwardingTimeline {
        private final long durationUs;
        private final long endUs;
        private final boolean isDynamic;
        private final long startUs;

        public ClippingTimeline(Timeline timeline, long j10, long j11) throws IllegalClippingException {
            super(timeline);
            boolean z10 = false;
            if (timeline.getPeriodCount() == 1) {
                Timeline.Window window = timeline.getWindow(0, new Timeline.Window());
                long max = Math.max(0L, j10);
                if (!window.isPlaceholder && max != 0 && !window.isSeekable) {
                    throw new IllegalClippingException(1);
                }
                long max2 = j11 == Long.MIN_VALUE ? window.durationUs : Math.max(0L, j11);
                long j12 = window.durationUs;
                if (j12 != C.TIME_UNSET) {
                    max2 = max2 > j12 ? j12 : max2;
                    if (max > max2) {
                        throw new IllegalClippingException(2);
                    }
                }
                this.startUs = max;
                this.endUs = max2;
                int i10 = (max2 > C.TIME_UNSET ? 1 : (max2 == C.TIME_UNSET ? 0 : -1));
                this.durationUs = i10 == 0 ? -9223372036854775807L : max2 - max;
                if (window.isDynamic && (i10 == 0 || (j12 != C.TIME_UNSET && max2 == j12))) {
                    z10 = true;
                }
                this.isDynamic = z10;
                return;
            }
            throw new IllegalClippingException(0);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
            this.timeline.getPeriod(0, period, z10);
            long positionInWindowUs = period.getPositionInWindowUs() - this.startUs;
            long j10 = this.durationUs;
            return period.set(period.f26652id, period.uid, 0, j10 == C.TIME_UNSET ? -9223372036854775807L : j10 - positionInWindowUs, positionInWindowUs);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int i10, Timeline.Window window, long j10) {
            this.timeline.getWindow(0, window, 0L);
            long j11 = window.positionInFirstPeriodUs;
            long j12 = this.startUs;
            window.positionInFirstPeriodUs = j11 + j12;
            window.durationUs = this.durationUs;
            window.isDynamic = this.isDynamic;
            long j13 = window.defaultPositionUs;
            if (j13 != C.TIME_UNSET) {
                long max = Math.max(j13, j12);
                window.defaultPositionUs = max;
                long j14 = this.endUs;
                if (j14 != C.TIME_UNSET) {
                    max = Math.min(max, j14);
                }
                window.defaultPositionUs = max;
                window.defaultPositionUs = max - this.startUs;
            }
            long usToMs = C.usToMs(this.startUs);
            long j15 = window.presentationStartTimeMs;
            if (j15 != C.TIME_UNSET) {
                window.presentationStartTimeMs = j15 + usToMs;
            }
            long j16 = window.windowStartTimeMs;
            if (j16 != C.TIME_UNSET) {
                window.windowStartTimeMs = j16 + usToMs;
            }
            return window;
        }
    }

    /* loaded from: classes3.dex */
    public static final class IllegalClippingException extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface Reason {
        }

        public IllegalClippingException(int i10) {
            super("Illegal clipping: " + getReasonDescription(i10));
            this.reason = i10;
        }

        private static String getReasonDescription(int i10) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public ClippingMediaSource(MediaSource mediaSource, long j10, long j11) {
        this(mediaSource, j10, j11, true, false, false);
    }

    private void refreshClippedTimeline(Timeline timeline) {
        long j10;
        long j11;
        timeline.getWindow(0, this.window);
        long positionInFirstPeriodUs = this.window.getPositionInFirstPeriodUs();
        if (this.clippingTimeline != null && !this.mediaPeriods.isEmpty() && !this.allowDynamicClippingUpdates) {
            long j12 = this.periodStartUs - positionInFirstPeriodUs;
            j11 = this.endUs != Long.MIN_VALUE ? this.periodEndUs - positionInFirstPeriodUs : Long.MIN_VALUE;
            j10 = j12;
        } else {
            long j13 = this.startUs;
            long j14 = this.endUs;
            if (this.relativeToDefaultPosition) {
                long defaultPositionUs = this.window.getDefaultPositionUs();
                j13 += defaultPositionUs;
                j14 += defaultPositionUs;
            }
            this.periodStartUs = positionInFirstPeriodUs + j13;
            this.periodEndUs = this.endUs != Long.MIN_VALUE ? positionInFirstPeriodUs + j14 : Long.MIN_VALUE;
            int size = this.mediaPeriods.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.mediaPeriods.get(i10).updateClipping(this.periodStartUs, this.periodEndUs);
            }
            j10 = j13;
            j11 = j14;
        }
        try {
            ClippingTimeline clippingTimeline = new ClippingTimeline(timeline, j10, j11);
            this.clippingTimeline = clippingTimeline;
            refreshSourceInfo(clippingTimeline);
        } catch (IllegalClippingException e10) {
            this.clippingError = e10;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator, j10), this.enableInitialDiscontinuity, this.periodStartUs, this.periodEndUs);
        this.mediaPeriods.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.mediaSource.getMediaItem();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    @Deprecated
    public Object getTag() {
        return this.mediaSource.getTag();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException == null) {
            super.maybeThrowSourceInfoRefreshError();
            return;
        }
        throw illegalClippingException;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        prepareChildSource(null, this.mediaSource);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        Assertions.checkState(this.mediaPeriods.remove(mediaPeriod));
        this.mediaSource.releasePeriod(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
        if (!this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            return;
        }
        refreshClippedTimeline(((ClippingTimeline) Assertions.checkNotNull(this.clippingTimeline)).timeline);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.clippingError = null;
        this.clippingTimeline = null;
    }

    public ClippingMediaSource(MediaSource mediaSource, long j10) {
        this(mediaSource, 0L, j10, true, false, true);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public long getMediaTimeForChildMediaTime(Void r72, long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long usToMs = C.usToMs(this.startUs);
        long max = Math.max(0L, j10 - usToMs);
        long j11 = this.endUs;
        return j11 != Long.MIN_VALUE ? Math.min(C.usToMs(j11) - usToMs, max) : max;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public void onChildSourceInfoRefreshed(Void r12, MediaSource mediaSource, Timeline timeline) {
        if (this.clippingError != null) {
            return;
        }
        refreshClippedTimeline(timeline);
    }

    public ClippingMediaSource(MediaSource mediaSource, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        Assertions.checkArgument(j10 >= 0);
        this.mediaSource = (MediaSource) Assertions.checkNotNull(mediaSource);
        this.startUs = j10;
        this.endUs = j11;
        this.enableInitialDiscontinuity = z10;
        this.allowDynamicClippingUpdates = z11;
        this.relativeToDefaultPosition = z12;
        this.mediaPeriods = new ArrayList<>();
        this.window = new Timeline.Window();
    }
}
