package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes3.dex */
final class MediaPeriodInfo {
    public final long durationUs;
    public final long endPositionUs;

    /* renamed from: id  reason: collision with root package name */
    public final MediaSource.MediaPeriodId f26650id;
    public final boolean isFinal;
    public final boolean isLastInTimelinePeriod;
    public final boolean isLastInTimelineWindow;
    public final long requestedContentPositionUs;
    public final long startPositionUs;

    public MediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12) {
        this.f26650id = mediaPeriodId;
        this.startPositionUs = j10;
        this.requestedContentPositionUs = j11;
        this.endPositionUs = j12;
        this.durationUs = j13;
        this.isLastInTimelinePeriod = z10;
        this.isLastInTimelineWindow = z11;
        this.isFinal = z12;
    }

    public MediaPeriodInfo copyWithRequestedContentPositionUs(long j10) {
        return j10 == this.requestedContentPositionUs ? this : new MediaPeriodInfo(this.f26650id, this.startPositionUs, j10, this.endPositionUs, this.durationUs, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public MediaPeriodInfo copyWithStartPositionUs(long j10) {
        return j10 == this.startPositionUs ? this : new MediaPeriodInfo(this.f26650id, j10, this.requestedContentPositionUs, this.endPositionUs, this.durationUs, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaPeriodInfo.class != obj.getClass()) {
            return false;
        }
        MediaPeriodInfo mediaPeriodInfo = (MediaPeriodInfo) obj;
        return this.startPositionUs == mediaPeriodInfo.startPositionUs && this.requestedContentPositionUs == mediaPeriodInfo.requestedContentPositionUs && this.endPositionUs == mediaPeriodInfo.endPositionUs && this.durationUs == mediaPeriodInfo.durationUs && this.isLastInTimelinePeriod == mediaPeriodInfo.isLastInTimelinePeriod && this.isLastInTimelineWindow == mediaPeriodInfo.isLastInTimelineWindow && this.isFinal == mediaPeriodInfo.isFinal && Util.areEqual(this.f26650id, mediaPeriodInfo.f26650id);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f26650id.hashCode()) * 31) + ((int) this.startPositionUs)) * 31) + ((int) this.requestedContentPositionUs)) * 31) + ((int) this.endPositionUs)) * 31) + ((int) this.durationUs)) * 31) + (this.isLastInTimelinePeriod ? 1 : 0)) * 31) + (this.isLastInTimelineWindow ? 1 : 0)) * 31) + (this.isFinal ? 1 : 0);
    }
}
