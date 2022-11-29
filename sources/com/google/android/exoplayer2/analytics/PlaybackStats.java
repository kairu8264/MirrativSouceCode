package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class PlaybackStats {
    public static final PlaybackStats EMPTY = merge(new PlaybackStats[0]);
    public static final int PLAYBACK_STATE_ABANDONED = 15;
    public static final int PLAYBACK_STATE_BUFFERING = 6;
    public static final int PLAYBACK_STATE_COUNT = 16;
    public static final int PLAYBACK_STATE_ENDED = 11;
    public static final int PLAYBACK_STATE_FAILED = 13;
    public static final int PLAYBACK_STATE_INTERRUPTED_BY_AD = 14;
    public static final int PLAYBACK_STATE_JOINING_BACKGROUND = 1;
    public static final int PLAYBACK_STATE_JOINING_FOREGROUND = 2;
    public static final int PLAYBACK_STATE_NOT_STARTED = 0;
    public static final int PLAYBACK_STATE_PAUSED = 4;
    public static final int PLAYBACK_STATE_PAUSED_BUFFERING = 7;
    public static final int PLAYBACK_STATE_PLAYING = 3;
    public static final int PLAYBACK_STATE_SEEKING = 5;
    public static final int PLAYBACK_STATE_STOPPED = 12;
    public static final int PLAYBACK_STATE_SUPPRESSED = 9;
    public static final int PLAYBACK_STATE_SUPPRESSED_BUFFERING = 10;
    public final int abandonedBeforeReadyCount;
    public final int adPlaybackCount;
    public final List<EventTimeAndFormat> audioFormatHistory;
    public final int backgroundJoiningCount;
    public final int endedCount;
    public final int fatalErrorCount;
    public final List<EventTimeAndException> fatalErrorHistory;
    public final int fatalErrorPlaybackCount;
    public final long firstReportedTimeMs;
    public final int foregroundPlaybackCount;
    public final int initialAudioFormatBitrateCount;
    public final int initialVideoFormatBitrateCount;
    public final int initialVideoFormatHeightCount;
    public final long maxRebufferTimeMs;
    public final List<long[]> mediaTimeHistory;
    public final int nonFatalErrorCount;
    public final List<EventTimeAndException> nonFatalErrorHistory;
    public final int playbackCount;
    private final long[] playbackStateDurationsMs;
    public final List<EventTimeAndPlaybackState> playbackStateHistory;
    public final long totalAudioFormatBitrateTimeProduct;
    public final long totalAudioFormatTimeMs;
    public final long totalAudioUnderruns;
    public final long totalBandwidthBytes;
    public final long totalBandwidthTimeMs;
    public final long totalDroppedFrames;
    public final long totalInitialAudioFormatBitrate;
    public final long totalInitialVideoFormatBitrate;
    public final int totalInitialVideoFormatHeight;
    public final int totalPauseBufferCount;
    public final int totalPauseCount;
    public final int totalRebufferCount;
    public final int totalSeekCount;
    public final long totalValidJoinTimeMs;
    public final long totalVideoFormatBitrateTimeMs;
    public final long totalVideoFormatBitrateTimeProduct;
    public final long totalVideoFormatHeightTimeMs;
    public final long totalVideoFormatHeightTimeProduct;
    public final int validJoinTimeCount;
    public final List<EventTimeAndFormat> videoFormatHistory;

    /* loaded from: classes3.dex */
    public static final class EventTimeAndException {
        public final AnalyticsListener.EventTime eventTime;
        public final Exception exception;

        public EventTimeAndException(AnalyticsListener.EventTime eventTime, Exception exc) {
            this.eventTime = eventTime;
            this.exception = exc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndException.class != obj.getClass()) {
                return false;
            }
            EventTimeAndException eventTimeAndException = (EventTimeAndException) obj;
            if (this.eventTime.equals(eventTimeAndException.eventTime)) {
                return this.exception.equals(eventTimeAndException.exception);
            }
            return false;
        }

        public int hashCode() {
            return (this.eventTime.hashCode() * 31) + this.exception.hashCode();
        }
    }

    /* loaded from: classes3.dex */
    public static final class EventTimeAndFormat {
        public final AnalyticsListener.EventTime eventTime;
        public final Format format;

        public EventTimeAndFormat(AnalyticsListener.EventTime eventTime, Format format) {
            this.eventTime = eventTime;
            this.format = format;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndFormat.class != obj.getClass()) {
                return false;
            }
            EventTimeAndFormat eventTimeAndFormat = (EventTimeAndFormat) obj;
            if (this.eventTime.equals(eventTimeAndFormat.eventTime)) {
                Format format = this.format;
                Format format2 = eventTimeAndFormat.format;
                return format != null ? format.equals(format2) : format2 == null;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.eventTime.hashCode() * 31;
            Format format = this.format;
            return hashCode + (format != null ? format.hashCode() : 0);
        }
    }

    /* loaded from: classes3.dex */
    public static final class EventTimeAndPlaybackState {
        public final AnalyticsListener.EventTime eventTime;
        public final int playbackState;

        public EventTimeAndPlaybackState(AnalyticsListener.EventTime eventTime, int i10) {
            this.eventTime = eventTime;
            this.playbackState = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndPlaybackState.class != obj.getClass()) {
                return false;
            }
            EventTimeAndPlaybackState eventTimeAndPlaybackState = (EventTimeAndPlaybackState) obj;
            if (this.playbackState != eventTimeAndPlaybackState.playbackState) {
                return false;
            }
            return this.eventTime.equals(eventTimeAndPlaybackState.eventTime);
        }

        public int hashCode() {
            return (this.eventTime.hashCode() * 31) + this.playbackState;
        }
    }

    public PlaybackStats(int i10, long[] jArr, List<EventTimeAndPlaybackState> list, List<long[]> list2, long j10, int i11, int i12, int i13, int i14, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, List<EventTimeAndFormat> list3, List<EventTimeAndFormat> list4, long j13, long j14, long j15, long j16, long j17, long j18, int i21, int i22, int i23, long j19, int i24, long j20, long j21, long j22, long j23, long j24, int i25, int i26, int i27, List<EventTimeAndException> list5, List<EventTimeAndException> list6) {
        this.playbackCount = i10;
        this.playbackStateDurationsMs = jArr;
        this.playbackStateHistory = Collections.unmodifiableList(list);
        this.mediaTimeHistory = Collections.unmodifiableList(list2);
        this.firstReportedTimeMs = j10;
        this.foregroundPlaybackCount = i11;
        this.abandonedBeforeReadyCount = i12;
        this.endedCount = i13;
        this.backgroundJoiningCount = i14;
        this.totalValidJoinTimeMs = j11;
        this.validJoinTimeCount = i15;
        this.totalPauseCount = i16;
        this.totalPauseBufferCount = i17;
        this.totalSeekCount = i18;
        this.totalRebufferCount = i19;
        this.maxRebufferTimeMs = j12;
        this.adPlaybackCount = i20;
        this.videoFormatHistory = Collections.unmodifiableList(list3);
        this.audioFormatHistory = Collections.unmodifiableList(list4);
        this.totalVideoFormatHeightTimeMs = j13;
        this.totalVideoFormatHeightTimeProduct = j14;
        this.totalVideoFormatBitrateTimeMs = j15;
        this.totalVideoFormatBitrateTimeProduct = j16;
        this.totalAudioFormatTimeMs = j17;
        this.totalAudioFormatBitrateTimeProduct = j18;
        this.initialVideoFormatHeightCount = i21;
        this.initialVideoFormatBitrateCount = i22;
        this.totalInitialVideoFormatHeight = i23;
        this.totalInitialVideoFormatBitrate = j19;
        this.initialAudioFormatBitrateCount = i24;
        this.totalInitialAudioFormatBitrate = j20;
        this.totalBandwidthTimeMs = j21;
        this.totalBandwidthBytes = j22;
        this.totalDroppedFrames = j23;
        this.totalAudioUnderruns = j24;
        this.fatalErrorPlaybackCount = i25;
        this.fatalErrorCount = i26;
        this.nonFatalErrorCount = i27;
        this.fatalErrorHistory = Collections.unmodifiableList(list5);
        this.nonFatalErrorHistory = Collections.unmodifiableList(list6);
    }

    public static PlaybackStats merge(PlaybackStats... playbackStatsArr) {
        int i10;
        PlaybackStats[] playbackStatsArr2 = playbackStatsArr;
        int i11 = 16;
        long[] jArr = new long[16];
        int length = playbackStatsArr2.length;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        int i12 = -1;
        long j20 = C.TIME_UNSET;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        long j21 = C.TIME_UNSET;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        long j22 = C.TIME_UNSET;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        long j23 = -1;
        int i27 = 0;
        long j24 = -1;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        while (i15 < length) {
            PlaybackStats playbackStats = playbackStatsArr2[i15];
            int i31 = i13 + playbackStats.playbackCount;
            int i32 = 0;
            while (i32 < i11) {
                jArr[i32] = jArr[i32] + playbackStats.playbackStateDurationsMs[i32];
                i32++;
                i11 = 16;
            }
            if (j21 == C.TIME_UNSET) {
                j21 = playbackStats.firstReportedTimeMs;
            } else {
                long j25 = playbackStats.firstReportedTimeMs;
                if (j25 != C.TIME_UNSET) {
                    j21 = Math.min(j21, j25);
                }
            }
            i14 += playbackStats.foregroundPlaybackCount;
            i16 += playbackStats.abandonedBeforeReadyCount;
            i17 += playbackStats.endedCount;
            i18 += playbackStats.backgroundJoiningCount;
            if (j22 == C.TIME_UNSET) {
                j22 = playbackStats.totalValidJoinTimeMs;
            } else {
                long j26 = playbackStats.totalValidJoinTimeMs;
                if (j26 != C.TIME_UNSET) {
                    j22 += j26;
                }
            }
            i19 += playbackStats.validJoinTimeCount;
            i20 += playbackStats.totalPauseCount;
            i21 += playbackStats.totalPauseBufferCount;
            i22 += playbackStats.totalSeekCount;
            i23 += playbackStats.totalRebufferCount;
            if (j20 == C.TIME_UNSET) {
                j20 = playbackStats.maxRebufferTimeMs;
                i10 = i31;
            } else {
                i10 = i31;
                long j27 = playbackStats.maxRebufferTimeMs;
                if (j27 != C.TIME_UNSET) {
                    j20 = Math.max(j20, j27);
                }
            }
            i24 += playbackStats.adPlaybackCount;
            j10 += playbackStats.totalVideoFormatHeightTimeMs;
            j11 += playbackStats.totalVideoFormatHeightTimeProduct;
            j12 += playbackStats.totalVideoFormatBitrateTimeMs;
            j13 += playbackStats.totalVideoFormatBitrateTimeProduct;
            j14 += playbackStats.totalAudioFormatTimeMs;
            j15 += playbackStats.totalAudioFormatBitrateTimeProduct;
            i25 += playbackStats.initialVideoFormatHeightCount;
            i26 += playbackStats.initialVideoFormatBitrateCount;
            if (i12 == -1) {
                i12 = playbackStats.totalInitialVideoFormatHeight;
            } else {
                int i33 = playbackStats.totalInitialVideoFormatHeight;
                if (i33 != -1) {
                    i12 += i33;
                }
            }
            if (j23 == -1) {
                j23 = playbackStats.totalInitialVideoFormatBitrate;
            } else {
                long j28 = playbackStats.totalInitialVideoFormatBitrate;
                if (j28 != -1) {
                    j23 += j28;
                }
            }
            i27 += playbackStats.initialAudioFormatBitrateCount;
            if (j24 == -1) {
                j24 = playbackStats.totalInitialAudioFormatBitrate;
            } else {
                long j29 = playbackStats.totalInitialAudioFormatBitrate;
                if (j29 != -1) {
                    j24 += j29;
                }
            }
            j16 += playbackStats.totalBandwidthTimeMs;
            j17 += playbackStats.totalBandwidthBytes;
            j18 += playbackStats.totalDroppedFrames;
            j19 += playbackStats.totalAudioUnderruns;
            i28 += playbackStats.fatalErrorPlaybackCount;
            i29 += playbackStats.fatalErrorCount;
            i30 += playbackStats.nonFatalErrorCount;
            i15++;
            playbackStatsArr2 = playbackStatsArr;
            i13 = i10;
            i11 = 16;
        }
        return new PlaybackStats(i13, jArr, Collections.emptyList(), Collections.emptyList(), j21, i14, i16, i17, i18, j22, i19, i20, i21, i22, i23, j20, i24, Collections.emptyList(), Collections.emptyList(), j10, j11, j12, j13, j14, j15, i25, i26, i12, j23, i27, j24, j16, j17, j18, j19, i28, i29, i30, Collections.emptyList(), Collections.emptyList());
    }

    public float getAbandonedBeforeReadyRatio() {
        int i10 = this.abandonedBeforeReadyCount;
        int i11 = this.playbackCount;
        int i12 = this.foregroundPlaybackCount;
        int i13 = i10 - (i11 - i12);
        if (i12 == 0) {
            return 0.0f;
        }
        return i13 / i12;
    }

    public float getAudioUnderrunRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (((float) this.totalAudioUnderruns) * 1000.0f) / ((float) totalPlayTimeMs);
    }

    public float getDroppedFramesRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (((float) this.totalDroppedFrames) * 1000.0f) / ((float) totalPlayTimeMs);
    }

    public float getEndedRatio() {
        int i10 = this.foregroundPlaybackCount;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.endedCount / i10;
    }

    public float getFatalErrorRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.fatalErrorCount * 1000.0f) / ((float) totalPlayTimeMs);
    }

    public float getFatalErrorRatio() {
        int i10 = this.foregroundPlaybackCount;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.fatalErrorPlaybackCount / i10;
    }

    public float getJoinTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return ((float) getTotalJoinTimeMs()) / ((float) totalPlayAndWaitTimeMs);
    }

    public int getMeanAudioFormatBitrate() {
        long j10 = this.totalAudioFormatTimeMs;
        if (j10 == 0) {
            return -1;
        }
        return (int) (this.totalAudioFormatBitrateTimeProduct / j10);
    }

    public int getMeanBandwidth() {
        long j10 = this.totalBandwidthTimeMs;
        if (j10 == 0) {
            return -1;
        }
        return (int) ((this.totalBandwidthBytes * 8000) / j10);
    }

    public long getMeanElapsedTimeMs() {
        return this.playbackCount == 0 ? C.TIME_UNSET : getTotalElapsedTimeMs() / this.playbackCount;
    }

    public int getMeanInitialAudioFormatBitrate() {
        int i10 = this.initialAudioFormatBitrateCount;
        if (i10 == 0) {
            return -1;
        }
        return (int) (this.totalInitialAudioFormatBitrate / i10);
    }

    public int getMeanInitialVideoFormatBitrate() {
        int i10 = this.initialVideoFormatBitrateCount;
        if (i10 == 0) {
            return -1;
        }
        return (int) (this.totalInitialVideoFormatBitrate / i10);
    }

    public int getMeanInitialVideoFormatHeight() {
        int i10 = this.initialVideoFormatHeightCount;
        if (i10 == 0) {
            return -1;
        }
        return this.totalInitialVideoFormatHeight / i10;
    }

    public long getMeanJoinTimeMs() {
        int i10 = this.validJoinTimeCount;
        return i10 == 0 ? C.TIME_UNSET : this.totalValidJoinTimeMs / i10;
    }

    public float getMeanNonFatalErrorCount() {
        int i10 = this.foregroundPlaybackCount;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.nonFatalErrorCount / i10;
    }

    public float getMeanPauseBufferCount() {
        int i10 = this.foregroundPlaybackCount;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.totalPauseBufferCount / i10;
    }

    public float getMeanPauseCount() {
        int i10 = this.foregroundPlaybackCount;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.totalPauseCount / i10;
    }

    public long getMeanPausedTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPausedTimeMs() / this.foregroundPlaybackCount;
    }

    public long getMeanPlayAndWaitTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPlayAndWaitTimeMs() / this.foregroundPlaybackCount;
    }

    public long getMeanPlayTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPlayTimeMs() / this.foregroundPlaybackCount;
    }

    public float getMeanRebufferCount() {
        int i10 = this.foregroundPlaybackCount;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.totalRebufferCount / i10;
    }

    public long getMeanRebufferTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalRebufferTimeMs() / this.foregroundPlaybackCount;
    }

    public float getMeanSeekCount() {
        int i10 = this.foregroundPlaybackCount;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.totalSeekCount / i10;
    }

    public long getMeanSeekTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalSeekTimeMs() / this.foregroundPlaybackCount;
    }

    public long getMeanSingleRebufferTimeMs() {
        return this.totalRebufferCount == 0 ? C.TIME_UNSET : (getPlaybackStateDurationMs(6) + getPlaybackStateDurationMs(7)) / this.totalRebufferCount;
    }

    public long getMeanSingleSeekTimeMs() {
        return this.totalSeekCount == 0 ? C.TIME_UNSET : getTotalSeekTimeMs() / this.totalSeekCount;
    }

    public float getMeanTimeBetweenFatalErrors() {
        return 1.0f / getFatalErrorRate();
    }

    public float getMeanTimeBetweenNonFatalErrors() {
        return 1.0f / getNonFatalErrorRate();
    }

    public float getMeanTimeBetweenRebuffers() {
        return 1.0f / getRebufferRate();
    }

    public int getMeanVideoFormatBitrate() {
        long j10 = this.totalVideoFormatBitrateTimeMs;
        if (j10 == 0) {
            return -1;
        }
        return (int) (this.totalVideoFormatBitrateTimeProduct / j10);
    }

    public int getMeanVideoFormatHeight() {
        long j10 = this.totalVideoFormatHeightTimeMs;
        if (j10 == 0) {
            return -1;
        }
        return (int) (this.totalVideoFormatHeightTimeProduct / j10);
    }

    public long getMeanWaitTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalWaitTimeMs() / this.foregroundPlaybackCount;
    }

    public long getMediaTimeMsAtRealtimeMs(long j10) {
        long j11;
        if (this.mediaTimeHistory.isEmpty()) {
            return C.TIME_UNSET;
        }
        int i10 = 0;
        while (i10 < this.mediaTimeHistory.size() && this.mediaTimeHistory.get(i10)[0] <= j10) {
            i10++;
        }
        if (i10 == 0) {
            return this.mediaTimeHistory.get(0)[1];
        }
        if (i10 == this.mediaTimeHistory.size()) {
            List<long[]> list = this.mediaTimeHistory;
            return list.get(list.size() - 1)[1];
        }
        int i11 = i10 - 1;
        long j12 = this.mediaTimeHistory.get(i11)[0];
        long j13 = this.mediaTimeHistory.get(i11)[1];
        long j14 = this.mediaTimeHistory.get(i10)[0];
        long j15 = this.mediaTimeHistory.get(i10)[1];
        if (j14 - j12 == 0) {
            return j13;
        }
        return j13 + (((float) (j15 - j13)) * (((float) (j10 - j12)) / ((float) j11)));
    }

    public float getNonFatalErrorRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.nonFatalErrorCount * 1000.0f) / ((float) totalPlayTimeMs);
    }

    public int getPlaybackStateAtTime(long j10) {
        int i10 = 0;
        for (EventTimeAndPlaybackState eventTimeAndPlaybackState : this.playbackStateHistory) {
            if (eventTimeAndPlaybackState.eventTime.realtimeMs > j10) {
                break;
            }
            i10 = eventTimeAndPlaybackState.playbackState;
        }
        return i10;
    }

    public long getPlaybackStateDurationMs(int i10) {
        return this.playbackStateDurationsMs[i10];
    }

    public float getRebufferRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalRebufferCount * 1000.0f) / ((float) totalPlayTimeMs);
    }

    public float getRebufferTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return ((float) getTotalRebufferTimeMs()) / ((float) totalPlayAndWaitTimeMs);
    }

    public float getSeekTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return ((float) getTotalSeekTimeMs()) / ((float) totalPlayAndWaitTimeMs);
    }

    public long getTotalElapsedTimeMs() {
        long j10 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            j10 += this.playbackStateDurationsMs[i10];
        }
        return j10;
    }

    public long getTotalJoinTimeMs() {
        return getPlaybackStateDurationMs(2);
    }

    public long getTotalPausedTimeMs() {
        return getPlaybackStateDurationMs(4) + getPlaybackStateDurationMs(7);
    }

    public long getTotalPlayAndWaitTimeMs() {
        return getTotalPlayTimeMs() + getTotalWaitTimeMs();
    }

    public long getTotalPlayTimeMs() {
        return getPlaybackStateDurationMs(3);
    }

    public long getTotalRebufferTimeMs() {
        return getPlaybackStateDurationMs(6);
    }

    public long getTotalSeekTimeMs() {
        return getPlaybackStateDurationMs(5);
    }

    public long getTotalWaitTimeMs() {
        return getPlaybackStateDurationMs(2) + getPlaybackStateDurationMs(6) + getPlaybackStateDurationMs(5);
    }

    public float getWaitTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return ((float) getTotalWaitTimeMs()) / ((float) totalPlayAndWaitTimeMs);
    }
}
