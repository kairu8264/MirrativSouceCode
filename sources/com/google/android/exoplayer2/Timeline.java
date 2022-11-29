package com.google.android.exoplayer2;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes3.dex */
public abstract class Timeline {
    public static final Timeline EMPTY = new Timeline() { // from class: com.google.android.exoplayer2.Timeline.1
        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Period getPeriod(int i10, Period period, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Window getWindow(int i10, Window window, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return 0;
        }
    };

    /* loaded from: classes3.dex */
    public static final class Period {
        private AdPlaybackState adPlaybackState = AdPlaybackState.NONE;
        public long durationUs;

        /* renamed from: id  reason: collision with root package name */
        public Object f26652id;
        private long positionInWindowUs;
        public Object uid;
        public int windowIndex;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Period.class.equals(obj.getClass())) {
                return false;
            }
            Period period = (Period) obj;
            return Util.areEqual(this.f26652id, period.f26652id) && Util.areEqual(this.uid, period.uid) && this.windowIndex == period.windowIndex && this.durationUs == period.durationUs && this.positionInWindowUs == period.positionInWindowUs && Util.areEqual(this.adPlaybackState, period.adPlaybackState);
        }

        public int getAdCountInAdGroup(int i10) {
            return this.adPlaybackState.adGroups[i10].count;
        }

        public long getAdDurationUs(int i10, int i11) {
            AdPlaybackState.AdGroup adGroup = this.adPlaybackState.adGroups[i10];
            return adGroup.count != -1 ? adGroup.durationsUs[i11] : C.TIME_UNSET;
        }

        public int getAdGroupCount() {
            return this.adPlaybackState.adGroupCount;
        }

        public int getAdGroupIndexAfterPositionUs(long j10) {
            return this.adPlaybackState.getAdGroupIndexAfterPositionUs(j10, this.durationUs);
        }

        public int getAdGroupIndexForPositionUs(long j10) {
            return this.adPlaybackState.getAdGroupIndexForPositionUs(j10, this.durationUs);
        }

        public long getAdGroupTimeUs(int i10) {
            return this.adPlaybackState.adGroupTimesUs[i10];
        }

        public long getAdResumePositionUs() {
            return this.adPlaybackState.adResumePositionUs;
        }

        public Object getAdsId() {
            return this.adPlaybackState.adsId;
        }

        public long getDurationMs() {
            return C.usToMs(this.durationUs);
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public int getFirstAdIndexToPlay(int i10) {
            return this.adPlaybackState.adGroups[i10].getFirstAdIndexToPlay();
        }

        public int getNextAdIndexToPlay(int i10, int i11) {
            return this.adPlaybackState.adGroups[i10].getNextAdIndexToPlay(i11);
        }

        public long getPositionInWindowMs() {
            return C.usToMs(this.positionInWindowUs);
        }

        public long getPositionInWindowUs() {
            return this.positionInWindowUs;
        }

        public boolean hasPlayedAdGroup(int i10) {
            return !this.adPlaybackState.adGroups[i10].hasUnplayedAds();
        }

        public int hashCode() {
            Object obj = this.f26652id;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.uid;
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            long j10 = this.durationUs;
            long j11 = this.positionInWindowUs;
            return ((((((((hashCode + hashCode2) * 31) + this.windowIndex) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.adPlaybackState.hashCode();
        }

        public Period set(Object obj, Object obj2, int i10, long j10, long j11) {
            return set(obj, obj2, i10, j10, j11, AdPlaybackState.NONE);
        }

        public Period set(Object obj, Object obj2, int i10, long j10, long j11, AdPlaybackState adPlaybackState) {
            this.f26652id = obj;
            this.uid = obj2;
            this.windowIndex = i10;
            this.durationUs = j10;
            this.positionInWindowUs = j11;
            this.adPlaybackState = adPlaybackState;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Window {
        public long defaultPositionUs;
        public long durationUs;
        public long elapsedRealtimeEpochOffsetMs;
        public int firstPeriodIndex;
        public boolean isDynamic;
        @Deprecated
        public boolean isLive;
        public boolean isPlaceholder;
        public boolean isSeekable;
        public int lastPeriodIndex;
        public MediaItem.LiveConfiguration liveConfiguration;
        public Object manifest;
        public long positionInFirstPeriodUs;
        public long presentationStartTimeMs;
        @Deprecated
        public Object tag;
        public long windowStartTimeMs;
        public static final Object SINGLE_WINDOW_UID = new Object();
        private static final MediaItem EMPTY_MEDIA_ITEM = new MediaItem.Builder().setMediaId("com.google.android.exoplayer2.Timeline").setUri(Uri.EMPTY).build();
        public Object uid = SINGLE_WINDOW_UID;
        public MediaItem mediaItem = EMPTY_MEDIA_ITEM;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Window.class.equals(obj.getClass())) {
                return false;
            }
            Window window = (Window) obj;
            return Util.areEqual(this.uid, window.uid) && Util.areEqual(this.mediaItem, window.mediaItem) && Util.areEqual(this.manifest, window.manifest) && Util.areEqual(this.liveConfiguration, window.liveConfiguration) && this.presentationStartTimeMs == window.presentationStartTimeMs && this.windowStartTimeMs == window.windowStartTimeMs && this.elapsedRealtimeEpochOffsetMs == window.elapsedRealtimeEpochOffsetMs && this.isSeekable == window.isSeekable && this.isDynamic == window.isDynamic && this.isPlaceholder == window.isPlaceholder && this.defaultPositionUs == window.defaultPositionUs && this.durationUs == window.durationUs && this.firstPeriodIndex == window.firstPeriodIndex && this.lastPeriodIndex == window.lastPeriodIndex && this.positionInFirstPeriodUs == window.positionInFirstPeriodUs;
        }

        public long getCurrentUnixTimeMs() {
            return Util.getNowUnixTimeMs(this.elapsedRealtimeEpochOffsetMs);
        }

        public long getDefaultPositionMs() {
            return C.usToMs(this.defaultPositionUs);
        }

        public long getDefaultPositionUs() {
            return this.defaultPositionUs;
        }

        public long getDurationMs() {
            return C.usToMs(this.durationUs);
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public long getPositionInFirstPeriodMs() {
            return C.usToMs(this.positionInFirstPeriodUs);
        }

        public long getPositionInFirstPeriodUs() {
            return this.positionInFirstPeriodUs;
        }

        public int hashCode() {
            int hashCode = (((217 + this.uid.hashCode()) * 31) + this.mediaItem.hashCode()) * 31;
            Object obj = this.manifest;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            int hashCode3 = liveConfiguration != null ? liveConfiguration.hashCode() : 0;
            long j10 = this.presentationStartTimeMs;
            long j11 = this.windowStartTimeMs;
            long j12 = this.elapsedRealtimeEpochOffsetMs;
            long j13 = this.defaultPositionUs;
            long j14 = this.durationUs;
            long j15 = this.positionInFirstPeriodUs;
            return ((((((((((((((((((((((hashCode2 + hashCode3) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.isSeekable ? 1 : 0)) * 31) + (this.isDynamic ? 1 : 0)) * 31) + (this.isPlaceholder ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.firstPeriodIndex) * 31) + this.lastPeriodIndex) * 31) + ((int) (j15 ^ (j15 >>> 32)));
        }

        public boolean isLive() {
            Assertions.checkState(this.isLive == (this.liveConfiguration != null));
            return this.liveConfiguration != null;
        }

        public Window set(Object obj, MediaItem mediaItem, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, MediaItem.LiveConfiguration liveConfiguration, long j13, long j14, int i10, int i11, long j15) {
            MediaItem.PlaybackProperties playbackProperties;
            this.uid = obj;
            this.mediaItem = mediaItem != null ? mediaItem : EMPTY_MEDIA_ITEM;
            this.tag = (mediaItem == null || (playbackProperties = mediaItem.playbackProperties) == null) ? null : playbackProperties.tag;
            this.manifest = obj2;
            this.presentationStartTimeMs = j10;
            this.windowStartTimeMs = j11;
            this.elapsedRealtimeEpochOffsetMs = j12;
            this.isSeekable = z10;
            this.isDynamic = z11;
            this.isLive = liveConfiguration != null;
            this.liveConfiguration = liveConfiguration;
            this.defaultPositionUs = j13;
            this.durationUs = j14;
            this.firstPeriodIndex = i10;
            this.lastPeriodIndex = i11;
            this.positionInFirstPeriodUs = j15;
            this.isPlaceholder = false;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Timeline) {
            Timeline timeline = (Timeline) obj;
            if (timeline.getWindowCount() == getWindowCount() && timeline.getPeriodCount() == getPeriodCount()) {
                Window window = new Window();
                Period period = new Period();
                Window window2 = new Window();
                Period period2 = new Period();
                for (int i10 = 0; i10 < getWindowCount(); i10++) {
                    if (!getWindow(i10, window).equals(timeline.getWindow(i10, window2))) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < getPeriodCount(); i11++) {
                    if (!getPeriod(i11, period, true).equals(timeline.getPeriod(i11, period2, true))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public int getFirstWindowIndex(boolean z10) {
        return isEmpty() ? -1 : 0;
    }

    public abstract int getIndexOfPeriod(Object obj);

    public int getLastWindowIndex(boolean z10) {
        if (isEmpty()) {
            return -1;
        }
        return getWindowCount() - 1;
    }

    public final int getNextPeriodIndex(int i10, Period period, Window window, int i11, boolean z10) {
        int i12 = getPeriod(i10, period).windowIndex;
        if (getWindow(i12, window).lastPeriodIndex == i10) {
            int nextWindowIndex = getNextWindowIndex(i12, i11, z10);
            if (nextWindowIndex == -1) {
                return -1;
            }
            return getWindow(nextWindowIndex, window).firstPeriodIndex;
        }
        return i10 + 1;
    }

    public int getNextWindowIndex(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == getLastWindowIndex(z10)) {
                return -1;
            }
            return i10 + 1;
        } else if (i11 != 1) {
            if (i11 == 2) {
                return i10 == getLastWindowIndex(z10) ? getFirstWindowIndex(z10) : i10 + 1;
            }
            throw new IllegalStateException();
        } else {
            return i10;
        }
    }

    public final Period getPeriod(int i10, Period period) {
        return getPeriod(i10, period, false);
    }

    public abstract Period getPeriod(int i10, Period period, boolean z10);

    public Period getPeriodByUid(Object obj, Period period) {
        return getPeriod(getIndexOfPeriod(obj), period, true);
    }

    public abstract int getPeriodCount();

    public final Pair<Object, Long> getPeriodPosition(Window window, Period period, int i10, long j10) {
        return (Pair) Assertions.checkNotNull(getPeriodPosition(window, period, i10, j10, 0L));
    }

    public int getPreviousWindowIndex(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == getFirstWindowIndex(z10)) {
                return -1;
            }
            return i10 - 1;
        } else if (i11 != 1) {
            if (i11 == 2) {
                return i10 == getFirstWindowIndex(z10) ? getLastWindowIndex(z10) : i10 - 1;
            }
            throw new IllegalStateException();
        } else {
            return i10;
        }
    }

    public abstract Object getUidOfPeriod(int i10);

    public final Window getWindow(int i10, Window window) {
        return getWindow(i10, window, 0L);
    }

    public abstract Window getWindow(int i10, Window window, long j10);

    public abstract int getWindowCount();

    public int hashCode() {
        Window window = new Window();
        Period period = new Period();
        int windowCount = 217 + getWindowCount();
        for (int i10 = 0; i10 < getWindowCount(); i10++) {
            windowCount = (windowCount * 31) + getWindow(i10, window).hashCode();
        }
        int periodCount = (windowCount * 31) + getPeriodCount();
        for (int i11 = 0; i11 < getPeriodCount(); i11++) {
            periodCount = (periodCount * 31) + getPeriod(i11, period, true).hashCode();
        }
        return periodCount;
    }

    public final boolean isEmpty() {
        return getWindowCount() == 0;
    }

    public final boolean isLastPeriod(int i10, Period period, Window window, int i11, boolean z10) {
        return getNextPeriodIndex(i10, period, window, i11, z10) == -1;
    }

    @Deprecated
    public final Window getWindow(int i10, Window window, boolean z10) {
        return getWindow(i10, window, 0L);
    }

    public final Pair<Object, Long> getPeriodPosition(Window window, Period period, int i10, long j10, long j11) {
        Assertions.checkIndex(i10, 0, getWindowCount());
        getWindow(i10, window, j11);
        if (j10 == C.TIME_UNSET) {
            j10 = window.getDefaultPositionUs();
            if (j10 == C.TIME_UNSET) {
                return null;
            }
        }
        int i11 = window.firstPeriodIndex;
        long positionInFirstPeriodUs = window.getPositionInFirstPeriodUs() + j10;
        long durationUs = getPeriod(i11, period, true).getDurationUs();
        while (durationUs != C.TIME_UNSET && positionInFirstPeriodUs >= durationUs && i11 < window.lastPeriodIndex) {
            positionInFirstPeriodUs -= durationUs;
            i11++;
            durationUs = getPeriod(i11, period, true).getDurationUs();
        }
        return Pair.create(Assertions.checkNotNull(period.uid), Long.valueOf(positionInFirstPeriodUs));
    }
}
