package com.google.android.exoplayer2.analytics;

import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.PlaybackSessionManager;
import com.google.android.exoplayer2.analytics.PlaybackStats;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class PlaybackStatsListener implements AnalyticsListener, PlaybackSessionManager.Listener {
    private String activeAdPlayback;
    private String activeContentPlayback;
    public Format audioFormat;
    public long bandwidthBytes;
    public long bandwidthTimeMs;
    private final Callback callback;
    public int discontinuityReason;
    public int droppedFrames;
    private PlaybackStats finishedPlaybackStats;
    private final boolean keepHistory;
    public Exception nonFatalException;
    private AnalyticsListener.EventTime onSeekStartedEventTime;
    private final Timeline.Period period;
    private final Map<String, PlaybackStatsTracker> playbackStatsTrackers;
    private final PlaybackSessionManager sessionManager;
    private final Map<String, AnalyticsListener.EventTime> sessionStartEventTimes;
    public Format videoFormat;
    public int videoHeight;
    public int videoWidth;

    /* loaded from: classes3.dex */
    public interface Callback {
        void onPlaybackStatsReady(AnalyticsListener.EventTime eventTime, PlaybackStats playbackStats);
    }

    /* loaded from: classes3.dex */
    public static final class PlaybackStatsTracker {
        private long audioFormatBitrateTimeProduct;
        private final List<PlaybackStats.EventTimeAndFormat> audioFormatHistory;
        private long audioFormatTimeMs;
        private long audioUnderruns;
        private long bandwidthBytes;
        private long bandwidthTimeMs;
        private Format currentAudioFormat;
        private float currentPlaybackSpeed;
        private int currentPlaybackState;
        private long currentPlaybackStateStartTimeMs;
        private Format currentVideoFormat;
        private long droppedFrames;
        private int fatalErrorCount;
        private final List<PlaybackStats.EventTimeAndException> fatalErrorHistory;
        private long firstReportedTimeMs;
        private boolean hasBeenReady;
        private boolean hasEnded;
        private boolean hasFatalError;
        private long initialAudioFormatBitrate;
        private long initialVideoFormatBitrate;
        private int initialVideoFormatHeight;
        private final boolean isAd;
        private boolean isForeground;
        private boolean isInterruptedByAd;
        private boolean isJoinTimeInvalid;
        private boolean isSeeking;
        private final boolean keepHistory;
        private long lastAudioFormatStartTimeMs;
        private long lastRebufferStartTimeMs;
        private long lastVideoFormatStartTimeMs;
        private long maxRebufferTimeMs;
        private final List<long[]> mediaTimeHistory;
        private int nonFatalErrorCount;
        private final List<PlaybackStats.EventTimeAndException> nonFatalErrorHistory;
        private int pauseBufferCount;
        private int pauseCount;
        private final long[] playbackStateDurationsMs = new long[16];
        private final List<PlaybackStats.EventTimeAndPlaybackState> playbackStateHistory;
        private int rebufferCount;
        private int seekCount;
        private boolean startedLoading;
        private long videoFormatBitrateTimeMs;
        private long videoFormatBitrateTimeProduct;
        private long videoFormatHeightTimeMs;
        private long videoFormatHeightTimeProduct;
        private final List<PlaybackStats.EventTimeAndFormat> videoFormatHistory;

        public PlaybackStatsTracker(boolean z10, AnalyticsListener.EventTime eventTime) {
            this.keepHistory = z10;
            this.playbackStateHistory = z10 ? new ArrayList<>() : Collections.emptyList();
            this.mediaTimeHistory = z10 ? new ArrayList<>() : Collections.emptyList();
            this.videoFormatHistory = z10 ? new ArrayList<>() : Collections.emptyList();
            this.audioFormatHistory = z10 ? new ArrayList<>() : Collections.emptyList();
            this.fatalErrorHistory = z10 ? new ArrayList<>() : Collections.emptyList();
            this.nonFatalErrorHistory = z10 ? new ArrayList<>() : Collections.emptyList();
            boolean z11 = false;
            this.currentPlaybackState = 0;
            this.currentPlaybackStateStartTimeMs = eventTime.realtimeMs;
            this.firstReportedTimeMs = C.TIME_UNSET;
            this.maxRebufferTimeMs = C.TIME_UNSET;
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
            if (mediaPeriodId != null && mediaPeriodId.isAd()) {
                z11 = true;
            }
            this.isAd = z11;
            this.initialAudioFormatBitrate = -1L;
            this.initialVideoFormatBitrate = -1L;
            this.initialVideoFormatHeight = -1;
            this.currentPlaybackSpeed = 1.0f;
        }

        private long[] guessMediaTimeBasedOnElapsedRealtime(long j10) {
            List<long[]> list = this.mediaTimeHistory;
            long[] jArr = list.get(list.size() - 1);
            return new long[]{j10, jArr[1] + (((float) (j10 - jArr[0])) * this.currentPlaybackSpeed)};
        }

        private static boolean isInvalidJoinTransition(int i10, int i11) {
            return ((i10 != 1 && i10 != 2 && i10 != 14) || i11 == 1 || i11 == 2 || i11 == 14 || i11 == 3 || i11 == 4 || i11 == 9 || i11 == 11) ? false : true;
        }

        private static boolean isPausedState(int i10) {
            return i10 == 4 || i10 == 7;
        }

        private static boolean isReadyState(int i10) {
            return i10 == 3 || i10 == 4 || i10 == 9;
        }

        private static boolean isRebufferingState(int i10) {
            return i10 == 6 || i10 == 7 || i10 == 10;
        }

        private void maybeRecordAudioFormatTime(long j10) {
            Format format;
            int i10;
            if (this.currentPlaybackState == 3 && (format = this.currentAudioFormat) != null && (i10 = format.bitrate) != -1) {
                long j11 = ((float) (j10 - this.lastAudioFormatStartTimeMs)) * this.currentPlaybackSpeed;
                this.audioFormatTimeMs += j11;
                this.audioFormatBitrateTimeProduct += j11 * i10;
            }
            this.lastAudioFormatStartTimeMs = j10;
        }

        private void maybeRecordVideoFormatTime(long j10) {
            Format format;
            if (this.currentPlaybackState == 3 && (format = this.currentVideoFormat) != null) {
                long j11 = ((float) (j10 - this.lastVideoFormatStartTimeMs)) * this.currentPlaybackSpeed;
                int i10 = format.height;
                if (i10 != -1) {
                    this.videoFormatHeightTimeMs += j11;
                    this.videoFormatHeightTimeProduct += i10 * j11;
                }
                int i11 = format.bitrate;
                if (i11 != -1) {
                    this.videoFormatBitrateTimeMs += j11;
                    this.videoFormatBitrateTimeProduct += j11 * i11;
                }
            }
            this.lastVideoFormatStartTimeMs = j10;
        }

        private void maybeUpdateAudioFormat(AnalyticsListener.EventTime eventTime, Format format) {
            int i10;
            if (Util.areEqual(this.currentAudioFormat, format)) {
                return;
            }
            maybeRecordAudioFormatTime(eventTime.realtimeMs);
            if (format != null && this.initialAudioFormatBitrate == -1 && (i10 = format.bitrate) != -1) {
                this.initialAudioFormatBitrate = i10;
            }
            this.currentAudioFormat = format;
            if (this.keepHistory) {
                this.audioFormatHistory.add(new PlaybackStats.EventTimeAndFormat(eventTime, format));
            }
        }

        private void maybeUpdateMaxRebufferTimeMs(long j10) {
            if (isRebufferingState(this.currentPlaybackState)) {
                long j11 = j10 - this.lastRebufferStartTimeMs;
                long j12 = this.maxRebufferTimeMs;
                if (j12 == C.TIME_UNSET || j11 > j12) {
                    this.maxRebufferTimeMs = j11;
                }
            }
        }

        private void maybeUpdateMediaTimeHistory(long j10, long j11) {
            if (this.keepHistory) {
                if (this.currentPlaybackState != 3) {
                    if (j11 == C.TIME_UNSET) {
                        return;
                    }
                    if (!this.mediaTimeHistory.isEmpty()) {
                        List<long[]> list = this.mediaTimeHistory;
                        long j12 = list.get(list.size() - 1)[1];
                        if (j12 != j11) {
                            this.mediaTimeHistory.add(new long[]{j10, j12});
                        }
                    }
                }
                this.mediaTimeHistory.add(j11 == C.TIME_UNSET ? guessMediaTimeBasedOnElapsedRealtime(j10) : new long[]{j10, j11});
            }
        }

        private void maybeUpdateVideoFormat(AnalyticsListener.EventTime eventTime, Format format) {
            int i10;
            int i11;
            if (Util.areEqual(this.currentVideoFormat, format)) {
                return;
            }
            maybeRecordVideoFormatTime(eventTime.realtimeMs);
            if (format != null) {
                if (this.initialVideoFormatHeight == -1 && (i11 = format.height) != -1) {
                    this.initialVideoFormatHeight = i11;
                }
                if (this.initialVideoFormatBitrate == -1 && (i10 = format.bitrate) != -1) {
                    this.initialVideoFormatBitrate = i10;
                }
            }
            this.currentVideoFormat = format;
            if (this.keepHistory) {
                this.videoFormatHistory.add(new PlaybackStats.EventTimeAndFormat(eventTime, format));
            }
        }

        private int resolveNewPlaybackState(Player player) {
            int playbackState = player.getPlaybackState();
            if (this.isSeeking && this.isForeground) {
                return 5;
            }
            if (this.hasFatalError) {
                return 13;
            }
            if (this.isForeground) {
                if (this.isInterruptedByAd) {
                    return 14;
                }
                if (playbackState == 4) {
                    return 11;
                }
                if (playbackState != 2) {
                    if (playbackState == 3) {
                        if (player.getPlayWhenReady()) {
                            return player.getPlaybackSuppressionReason() != 0 ? 9 : 3;
                        }
                        return 4;
                    } else if (playbackState != 1 || this.currentPlaybackState == 0) {
                        return this.currentPlaybackState;
                    } else {
                        return 12;
                    }
                }
                int i10 = this.currentPlaybackState;
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 14) {
                    return 2;
                }
                if (player.getPlayWhenReady()) {
                    return player.getPlaybackSuppressionReason() != 0 ? 10 : 6;
                }
                return 7;
            }
            return this.startedLoading ? 1 : 0;
        }

        private void updatePlaybackState(int i10, AnalyticsListener.EventTime eventTime) {
            Assertions.checkArgument(eventTime.realtimeMs >= this.currentPlaybackStateStartTimeMs);
            long j10 = eventTime.realtimeMs;
            long[] jArr = this.playbackStateDurationsMs;
            int i11 = this.currentPlaybackState;
            jArr[i11] = jArr[i11] + (j10 - this.currentPlaybackStateStartTimeMs);
            if (this.firstReportedTimeMs == C.TIME_UNSET) {
                this.firstReportedTimeMs = j10;
            }
            this.isJoinTimeInvalid |= isInvalidJoinTransition(i11, i10);
            this.hasBeenReady |= isReadyState(i10);
            this.hasEnded |= i10 == 11;
            if (!isPausedState(this.currentPlaybackState) && isPausedState(i10)) {
                this.pauseCount++;
            }
            if (i10 == 5) {
                this.seekCount++;
            }
            if (!isRebufferingState(this.currentPlaybackState) && isRebufferingState(i10)) {
                this.rebufferCount++;
                this.lastRebufferStartTimeMs = eventTime.realtimeMs;
            }
            if (isRebufferingState(this.currentPlaybackState) && this.currentPlaybackState != 7 && i10 == 7) {
                this.pauseBufferCount++;
            }
            maybeUpdateMaxRebufferTimeMs(eventTime.realtimeMs);
            this.currentPlaybackState = i10;
            this.currentPlaybackStateStartTimeMs = eventTime.realtimeMs;
            if (this.keepHistory) {
                this.playbackStateHistory.add(new PlaybackStats.EventTimeAndPlaybackState(eventTime, i10));
            }
        }

        public PlaybackStats build(boolean z10) {
            long[] jArr;
            ArrayList arrayList;
            long[] jArr2 = this.playbackStateDurationsMs;
            List<long[]> list = this.mediaTimeHistory;
            if (z10) {
                jArr = jArr2;
                arrayList = list;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long[] copyOf = Arrays.copyOf(this.playbackStateDurationsMs, 16);
                long max = Math.max(0L, elapsedRealtime - this.currentPlaybackStateStartTimeMs);
                int i10 = this.currentPlaybackState;
                copyOf[i10] = copyOf[i10] + max;
                maybeUpdateMaxRebufferTimeMs(elapsedRealtime);
                maybeRecordVideoFormatTime(elapsedRealtime);
                maybeRecordAudioFormatTime(elapsedRealtime);
                ArrayList arrayList2 = new ArrayList(this.mediaTimeHistory);
                if (this.keepHistory && this.currentPlaybackState == 3) {
                    arrayList2.add(guessMediaTimeBasedOnElapsedRealtime(elapsedRealtime));
                }
                jArr = copyOf;
                arrayList = arrayList2;
            }
            int i11 = (this.isJoinTimeInvalid || !this.hasBeenReady) ? 1 : 0;
            long j10 = i11 != 0 ? C.TIME_UNSET : jArr[2];
            int i12 = jArr[1] > 0 ? 1 : 0;
            List arrayList3 = z10 ? this.videoFormatHistory : new ArrayList(this.videoFormatHistory);
            List arrayList4 = z10 ? this.audioFormatHistory : new ArrayList(this.audioFormatHistory);
            List arrayList5 = z10 ? this.playbackStateHistory : new ArrayList(this.playbackStateHistory);
            long j11 = this.firstReportedTimeMs;
            boolean z11 = this.isForeground;
            int i13 = !this.hasBeenReady ? 1 : 0;
            boolean z12 = this.hasEnded;
            int i14 = i11 ^ 1;
            int i15 = this.pauseCount;
            int i16 = this.pauseBufferCount;
            int i17 = this.seekCount;
            int i18 = this.rebufferCount;
            long j12 = this.maxRebufferTimeMs;
            boolean z13 = this.isAd;
            long[] jArr3 = jArr;
            long j13 = this.videoFormatHeightTimeMs;
            long j14 = this.videoFormatHeightTimeProduct;
            long j15 = this.videoFormatBitrateTimeMs;
            long j16 = this.videoFormatBitrateTimeProduct;
            long j17 = this.audioFormatTimeMs;
            long j18 = this.audioFormatBitrateTimeProduct;
            int i19 = this.initialVideoFormatHeight;
            int i20 = i19 == -1 ? 0 : 1;
            long j19 = this.initialVideoFormatBitrate;
            int i21 = j19 == -1 ? 0 : 1;
            long j20 = this.initialAudioFormatBitrate;
            int i22 = j20 == -1 ? 0 : 1;
            long j21 = this.bandwidthTimeMs;
            long j22 = this.bandwidthBytes;
            long j23 = this.droppedFrames;
            long j24 = this.audioUnderruns;
            int i23 = this.fatalErrorCount;
            return new PlaybackStats(1, jArr3, arrayList5, arrayList, j11, z11 ? 1 : 0, i13, z12 ? 1 : 0, i12, j10, i14, i15, i16, i17, i18, j12, z13 ? 1 : 0, arrayList3, arrayList4, j13, j14, j15, j16, j17, j18, i20, i21, i19, j19, i22, j20, j21, j22, j23, j24, i23 > 0 ? 1 : 0, i23, this.nonFatalErrorCount, this.fatalErrorHistory, this.nonFatalErrorHistory);
        }

        public void onEvents(Player player, AnalyticsListener.EventTime eventTime, boolean z10, boolean z11, boolean z12, int i10, boolean z13, boolean z14, ExoPlaybackException exoPlaybackException, Exception exc, long j10, long j11, Format format, Format format2, int i11, int i12) {
            TrackSelection[] all;
            if (z11) {
                this.isSeeking = true;
            }
            if (player.getPlaybackState() != 2) {
                this.isSeeking = false;
            }
            int playbackState = player.getPlaybackState();
            if (playbackState == 1 || playbackState == 4 || z12) {
                this.isInterruptedByAd = false;
            }
            if (exoPlaybackException != null) {
                this.hasFatalError = true;
                this.fatalErrorCount++;
                if (this.keepHistory) {
                    this.fatalErrorHistory.add(new PlaybackStats.EventTimeAndException(eventTime, exoPlaybackException));
                }
            } else if (player.getPlayerError() == null) {
                this.hasFatalError = false;
            }
            if (this.isForeground && !this.isInterruptedByAd) {
                boolean z15 = false;
                boolean z16 = false;
                for (TrackSelection trackSelection : player.getCurrentTrackSelections().getAll()) {
                    if (trackSelection != null && trackSelection.length() > 0) {
                        int trackType = MimeTypes.getTrackType(trackSelection.getFormat(0).sampleMimeType);
                        if (trackType == 2) {
                            z15 = true;
                        } else if (trackType == 1) {
                            z16 = true;
                        }
                    }
                }
                if (!z15) {
                    maybeUpdateVideoFormat(eventTime, null);
                }
                if (!z16) {
                    maybeUpdateAudioFormat(eventTime, null);
                }
            }
            if (format != null) {
                maybeUpdateVideoFormat(eventTime, format);
            }
            if (format2 != null) {
                maybeUpdateAudioFormat(eventTime, format2);
            }
            Format format3 = this.currentVideoFormat;
            if (format3 != null && format3.height == -1 && i11 != -1) {
                maybeUpdateVideoFormat(eventTime, format3.buildUpon().setWidth(i12).setHeight(i11).build());
            }
            if (z14) {
                this.startedLoading = true;
            }
            if (z13) {
                this.audioUnderruns++;
            }
            this.droppedFrames += i10;
            this.bandwidthTimeMs += j10;
            this.bandwidthBytes += j11;
            if (exc != null) {
                this.nonFatalErrorCount++;
                if (this.keepHistory) {
                    this.nonFatalErrorHistory.add(new PlaybackStats.EventTimeAndException(eventTime, exc));
                }
            }
            int resolveNewPlaybackState = resolveNewPlaybackState(player);
            float f10 = player.getPlaybackParameters().speed;
            if (this.currentPlaybackState != resolveNewPlaybackState || this.currentPlaybackSpeed != f10) {
                maybeUpdateMediaTimeHistory(eventTime.realtimeMs, z10 ? eventTime.eventPlaybackPositionMs : C.TIME_UNSET);
                maybeRecordVideoFormatTime(eventTime.realtimeMs);
                maybeRecordAudioFormatTime(eventTime.realtimeMs);
            }
            this.currentPlaybackSpeed = f10;
            if (this.currentPlaybackState != resolveNewPlaybackState) {
                updatePlaybackState(resolveNewPlaybackState, eventTime);
            }
        }

        public void onFinished(AnalyticsListener.EventTime eventTime, boolean z10) {
            int i10 = 11;
            if (this.currentPlaybackState != 11 && !z10) {
                i10 = 15;
            }
            maybeUpdateMediaTimeHistory(eventTime.realtimeMs, C.TIME_UNSET);
            maybeRecordVideoFormatTime(eventTime.realtimeMs);
            maybeRecordAudioFormatTime(eventTime.realtimeMs);
            updatePlaybackState(i10, eventTime);
        }

        public void onForeground() {
            this.isForeground = true;
        }

        public void onInterruptedByAd() {
            this.isInterruptedByAd = true;
            this.isSeeking = false;
        }
    }

    public PlaybackStatsListener(boolean z10, Callback callback) {
        this.callback = callback;
        this.keepHistory = z10;
        DefaultPlaybackSessionManager defaultPlaybackSessionManager = new DefaultPlaybackSessionManager();
        this.sessionManager = defaultPlaybackSessionManager;
        this.playbackStatsTrackers = new HashMap();
        this.sessionStartEventTimes = new HashMap();
        this.finishedPlaybackStats = PlaybackStats.EMPTY;
        this.period = new Timeline.Period();
        defaultPlaybackSessionManager.setListener(this);
    }

    private Pair<AnalyticsListener.EventTime, Boolean> findBestEventTime(AnalyticsListener.Events events, String str) {
        MediaSource.MediaPeriodId mediaPeriodId;
        AnalyticsListener.EventTime eventTime = this.onSeekStartedEventTime;
        boolean z10 = eventTime != null && this.sessionManager.belongsToSession(eventTime, str);
        for (int i10 = 0; i10 < events.size(); i10++) {
            AnalyticsListener.EventTime eventTime2 = events.getEventTime(events.get(i10));
            boolean belongsToSession = this.sessionManager.belongsToSession(eventTime2, str);
            if (eventTime == null || ((belongsToSession && !z10) || (belongsToSession == z10 && eventTime2.realtimeMs > eventTime.realtimeMs))) {
                eventTime = eventTime2;
                z10 = belongsToSession;
            }
        }
        Assertions.checkNotNull(eventTime);
        if (!z10 && (mediaPeriodId = eventTime.mediaPeriodId) != null && mediaPeriodId.isAd()) {
            long adGroupTimeUs = eventTime.timeline.getPeriodByUid(eventTime.mediaPeriodId.periodUid, this.period).getAdGroupTimeUs(eventTime.mediaPeriodId.adGroupIndex);
            if (adGroupTimeUs == Long.MIN_VALUE) {
                adGroupTimeUs = this.period.durationUs;
            }
            long positionInWindowUs = adGroupTimeUs + this.period.getPositionInWindowUs();
            long j10 = eventTime.realtimeMs;
            Timeline timeline = eventTime.timeline;
            int i11 = eventTime.windowIndex;
            MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
            AnalyticsListener.EventTime eventTime3 = new AnalyticsListener.EventTime(j10, timeline, i11, new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber, mediaPeriodId2.adGroupIndex), C.usToMs(positionInWindowUs), eventTime.timeline, eventTime.currentWindowIndex, eventTime.currentMediaPeriodId, eventTime.currentPlaybackPositionMs, eventTime.totalBufferedDurationMs);
            z10 = this.sessionManager.belongsToSession(eventTime3, str);
            eventTime = eventTime3;
        }
        return Pair.create(eventTime, Boolean.valueOf(z10));
    }

    private boolean hasEvent(AnalyticsListener.Events events, String str, int i10) {
        return events.contains(i10) && this.sessionManager.belongsToSession(events.getEventTime(i10), str);
    }

    private void maybeAddSessions(Player player, AnalyticsListener.Events events) {
        boolean z10 = true;
        z10 = (player.getCurrentTimeline().isEmpty() && player.getPlaybackState() == 1) ? false : false;
        for (int i10 = 0; i10 < events.size(); i10++) {
            int i11 = events.get(i10);
            AnalyticsListener.EventTime eventTime = events.getEventTime(i11);
            if (i11 == 0) {
                this.sessionManager.updateSessionsWithTimelineChange(eventTime);
            } else if (!z10 && i11 == 12) {
                this.sessionManager.updateSessionsWithDiscontinuity(eventTime, this.discontinuityReason);
            } else if (!z10) {
                this.sessionManager.updateSessions(eventTime);
            }
        }
    }

    public PlaybackStats getCombinedPlaybackStats() {
        int i10 = 1;
        PlaybackStats[] playbackStatsArr = new PlaybackStats[this.playbackStatsTrackers.size() + 1];
        playbackStatsArr[0] = this.finishedPlaybackStats;
        for (PlaybackStatsTracker playbackStatsTracker : this.playbackStatsTrackers.values()) {
            playbackStatsArr[i10] = playbackStatsTracker.build(false);
            i10++;
        }
        return PlaybackStats.merge(playbackStatsArr);
    }

    public PlaybackStats getPlaybackStats() {
        PlaybackStatsTracker playbackStatsTracker;
        String str = this.activeAdPlayback;
        if (str != null) {
            playbackStatsTracker = this.playbackStatsTrackers.get(str);
        } else {
            String str2 = this.activeContentPlayback;
            playbackStatsTracker = str2 != null ? this.playbackStatsTrackers.get(str2) : null;
        }
        if (playbackStatsTracker == null) {
            return null;
        }
        return playbackStatsTracker.build(false);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onAdPlaybackStarted(AnalyticsListener.EventTime eventTime, String str, String str2) {
        ((PlaybackStatsTracker) Assertions.checkNotNull(this.playbackStatsTrackers.get(str))).onInterruptedByAd();
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i10, long j10, long j11) {
        this.bandwidthTimeMs = i10;
        this.bandwidthBytes = j10;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        int i10 = mediaLoadData.trackType;
        if (i10 == 2 || i10 == 0) {
            this.videoFormat = mediaLoadData.trackFormat;
        } else if (i10 == 1) {
            this.audioFormat = mediaLoadData.trackFormat;
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        this.nonFatalException = exc;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i10, long j10) {
        this.droppedFrames = i10;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onEvents(Player player, AnalyticsListener.Events events) {
        if (events.size() == 0) {
            return;
        }
        maybeAddSessions(player, events);
        for (String str : this.playbackStatsTrackers.keySet()) {
            Pair<AnalyticsListener.EventTime, Boolean> findBestEventTime = findBestEventTime(events, str);
            PlaybackStatsTracker playbackStatsTracker = this.playbackStatsTrackers.get(str);
            boolean z10 = hasEvent(events, str, 12) || hasEvent(events, str, 0);
            boolean hasEvent = hasEvent(events, str, AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES);
            boolean hasEvent2 = hasEvent(events, str, AnalyticsListener.EVENT_AUDIO_UNDERRUN);
            boolean hasEvent3 = hasEvent(events, str, 1000);
            boolean hasEvent4 = hasEvent(events, str, 11);
            boolean z11 = hasEvent(events, str, AnalyticsListener.EVENT_LOAD_ERROR) || hasEvent(events, str, AnalyticsListener.EVENT_DRM_SESSION_MANAGER_ERROR);
            boolean hasEvent5 = hasEvent(events, str, AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE);
            boolean hasEvent6 = hasEvent(events, str, AnalyticsListener.EVENT_DOWNSTREAM_FORMAT_CHANGED);
            boolean hasEvent7 = hasEvent(events, str, AnalyticsListener.EVENT_VIDEO_SIZE_CHANGED);
            playbackStatsTracker.onEvents(player, (AnalyticsListener.EventTime) findBestEventTime.first, ((Boolean) findBestEventTime.second).booleanValue(), this.onSeekStartedEventTime != null, z10, hasEvent ? this.droppedFrames : 0, hasEvent2, hasEvent3, hasEvent4 ? player.getPlayerError() : null, z11 ? this.nonFatalException : null, hasEvent5 ? this.bandwidthTimeMs : 0L, hasEvent5 ? this.bandwidthBytes : 0L, hasEvent6 ? this.videoFormat : null, hasEvent6 ? this.audioFormat : null, hasEvent7 ? this.videoHeight : -1, hasEvent7 ? this.videoWidth : -1);
        }
        this.onSeekStartedEventTime = null;
        this.videoFormat = null;
        this.audioFormat = null;
        if (events.contains(AnalyticsListener.EVENT_PLAYER_RELEASED)) {
            this.sessionManager.finishAllSessions(events.getEventTime(AnalyticsListener.EVENT_PLAYER_RELEASED));
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z10) {
        this.nonFatalException = iOException;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i10) {
        this.discontinuityReason = i10;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onSeekStarted(AnalyticsListener.EventTime eventTime) {
        this.onSeekStartedEventTime = eventTime;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionActive(AnalyticsListener.EventTime eventTime, String str) {
        ((PlaybackStatsTracker) Assertions.checkNotNull(this.playbackStatsTrackers.get(str))).onForeground();
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId != null && mediaPeriodId.isAd()) {
            this.activeAdPlayback = str;
        } else {
            this.activeContentPlayback = str;
        }
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionCreated(AnalyticsListener.EventTime eventTime, String str) {
        this.playbackStatsTrackers.put(str, new PlaybackStatsTracker(this.keepHistory, eventTime));
        this.sessionStartEventTimes.put(str, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionFinished(AnalyticsListener.EventTime eventTime, String str, boolean z10) {
        if (str.equals(this.activeAdPlayback)) {
            this.activeAdPlayback = null;
        } else if (str.equals(this.activeContentPlayback)) {
            this.activeContentPlayback = null;
        }
        PlaybackStatsTracker playbackStatsTracker = (PlaybackStatsTracker) Assertions.checkNotNull(this.playbackStatsTrackers.remove(str));
        AnalyticsListener.EventTime eventTime2 = (AnalyticsListener.EventTime) Assertions.checkNotNull(this.sessionStartEventTimes.remove(str));
        playbackStatsTracker.onFinished(eventTime, z10);
        PlaybackStats build = playbackStatsTracker.build(true);
        this.finishedPlaybackStats = PlaybackStats.merge(this.finishedPlaybackStats, build);
        Callback callback = this.callback;
        if (callback != null) {
            callback.onPlaybackStatsReady(eventTime2, build);
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i10, int i11, int i12, float f10) {
        this.videoWidth = i10;
        this.videoHeight = i11;
    }
}
