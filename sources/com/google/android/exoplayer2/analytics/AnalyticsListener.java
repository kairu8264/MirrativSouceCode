package com.google.android.exoplayer2.analytics;

import android.util.SparseArray;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MutableFlags;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: classes3.dex */
public interface AnalyticsListener {
    public static final int EVENT_AUDIO_ATTRIBUTES_CHANGED = 1016;
    public static final int EVENT_AUDIO_DECODER_INITIALIZED = 1009;
    public static final int EVENT_AUDIO_DECODER_RELEASED = 1013;
    public static final int EVENT_AUDIO_DISABLED = 1014;
    public static final int EVENT_AUDIO_ENABLED = 1008;
    public static final int EVENT_AUDIO_INPUT_FORMAT_CHANGED = 1010;
    public static final int EVENT_AUDIO_POSITION_ADVANCING = 1011;
    public static final int EVENT_AUDIO_SESSION_ID = 1015;
    public static final int EVENT_AUDIO_SINK_ERROR = 1018;
    public static final int EVENT_AUDIO_UNDERRUN = 1012;
    public static final int EVENT_BANDWIDTH_ESTIMATE = 1006;
    public static final int EVENT_DOWNSTREAM_FORMAT_CHANGED = 1004;
    public static final int EVENT_DRM_KEYS_LOADED = 1031;
    public static final int EVENT_DRM_KEYS_REMOVED = 1034;
    public static final int EVENT_DRM_KEYS_RESTORED = 1033;
    public static final int EVENT_DRM_SESSION_ACQUIRED = 1030;
    public static final int EVENT_DRM_SESSION_MANAGER_ERROR = 1032;
    public static final int EVENT_DRM_SESSION_RELEASED = 1035;
    public static final int EVENT_DROPPED_VIDEO_FRAMES = 1023;
    public static final int EVENT_IS_LOADING_CHANGED = 4;
    public static final int EVENT_IS_PLAYING_CHANGED = 8;
    public static final int EVENT_LOAD_CANCELED = 1002;
    public static final int EVENT_LOAD_COMPLETED = 1001;
    public static final int EVENT_LOAD_ERROR = 1003;
    public static final int EVENT_LOAD_STARTED = 1000;
    public static final int EVENT_MEDIA_ITEM_TRANSITION = 1;
    public static final int EVENT_METADATA = 1007;
    public static final int EVENT_PLAYBACK_PARAMETERS_CHANGED = 13;
    public static final int EVENT_PLAYBACK_STATE_CHANGED = 5;
    public static final int EVENT_PLAYBACK_SUPPRESSION_REASON_CHANGED = 7;
    public static final int EVENT_PLAYER_ERROR = 11;
    public static final int EVENT_PLAYER_RELEASED = 1036;
    public static final int EVENT_PLAY_WHEN_READY_CHANGED = 6;
    public static final int EVENT_POSITION_DISCONTINUITY = 12;
    public static final int EVENT_RENDERED_FIRST_FRAME = 1027;
    public static final int EVENT_REPEAT_MODE_CHANGED = 9;
    public static final int EVENT_SHUFFLE_MODE_ENABLED_CHANGED = 10;
    public static final int EVENT_SKIP_SILENCE_ENABLED_CHANGED = 1017;
    public static final int EVENT_STATIC_METADATA_CHANGED = 3;
    public static final int EVENT_SURFACE_SIZE_CHANGED = 1029;
    public static final int EVENT_TIMELINE_CHANGED = 0;
    public static final int EVENT_TRACKS_CHANGED = 2;
    public static final int EVENT_UPSTREAM_DISCARDED = 1005;
    public static final int EVENT_VIDEO_DECODER_INITIALIZED = 1021;
    public static final int EVENT_VIDEO_DECODER_RELEASED = 1024;
    public static final int EVENT_VIDEO_DISABLED = 1025;
    public static final int EVENT_VIDEO_ENABLED = 1020;
    public static final int EVENT_VIDEO_FRAME_PROCESSING_OFFSET = 1026;
    public static final int EVENT_VIDEO_INPUT_FORMAT_CHANGED = 1022;
    public static final int EVENT_VIDEO_SIZE_CHANGED = 1028;
    public static final int EVENT_VOLUME_CHANGED = 1019;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface EventFlags {
    }

    /* loaded from: classes3.dex */
    public static final class EventTime {
        public final MediaSource.MediaPeriodId currentMediaPeriodId;
        public final long currentPlaybackPositionMs;
        public final Timeline currentTimeline;
        public final int currentWindowIndex;
        public final long eventPlaybackPositionMs;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final long realtimeMs;
        public final Timeline timeline;
        public final long totalBufferedDurationMs;
        public final int windowIndex;

        public EventTime(long j10, Timeline timeline, int i10, MediaSource.MediaPeriodId mediaPeriodId, long j11, Timeline timeline2, int i11, MediaSource.MediaPeriodId mediaPeriodId2, long j12, long j13) {
            this.realtimeMs = j10;
            this.timeline = timeline;
            this.windowIndex = i10;
            this.mediaPeriodId = mediaPeriodId;
            this.eventPlaybackPositionMs = j11;
            this.currentTimeline = timeline2;
            this.currentWindowIndex = i11;
            this.currentMediaPeriodId = mediaPeriodId2;
            this.currentPlaybackPositionMs = j12;
            this.totalBufferedDurationMs = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTime.class != obj.getClass()) {
                return false;
            }
            EventTime eventTime = (EventTime) obj;
            return this.realtimeMs == eventTime.realtimeMs && this.windowIndex == eventTime.windowIndex && this.eventPlaybackPositionMs == eventTime.eventPlaybackPositionMs && this.currentWindowIndex == eventTime.currentWindowIndex && this.currentPlaybackPositionMs == eventTime.currentPlaybackPositionMs && this.totalBufferedDurationMs == eventTime.totalBufferedDurationMs && kk.i.a(this.timeline, eventTime.timeline) && kk.i.a(this.mediaPeriodId, eventTime.mediaPeriodId) && kk.i.a(this.currentTimeline, eventTime.currentTimeline) && kk.i.a(this.currentMediaPeriodId, eventTime.currentMediaPeriodId);
        }

        public int hashCode() {
            return kk.i.b(Long.valueOf(this.realtimeMs), this.timeline, Integer.valueOf(this.windowIndex), this.mediaPeriodId, Long.valueOf(this.eventPlaybackPositionMs), this.currentTimeline, Integer.valueOf(this.currentWindowIndex), this.currentMediaPeriodId, Long.valueOf(this.currentPlaybackPositionMs), Long.valueOf(this.totalBufferedDurationMs));
        }
    }

    /* loaded from: classes3.dex */
    public static final class Events extends MutableFlags {
        private final SparseArray<EventTime> eventTimes = new SparseArray<>(0);

        @Override // com.google.android.exoplayer2.util.MutableFlags
        public boolean contains(int i10) {
            return super.contains(i10);
        }

        @Override // com.google.android.exoplayer2.util.MutableFlags
        public boolean containsAny(int... iArr) {
            return super.containsAny(iArr);
        }

        @Override // com.google.android.exoplayer2.util.MutableFlags
        public int get(int i10) {
            return super.get(i10);
        }

        public EventTime getEventTime(int i10) {
            return (EventTime) Assertions.checkNotNull(this.eventTimes.get(i10));
        }

        public void setEventTimes(SparseArray<EventTime> sparseArray) {
            this.eventTimes.clear();
            for (int i10 = 0; i10 < size(); i10++) {
                int i11 = get(i10);
                this.eventTimes.append(i11, (EventTime) Assertions.checkNotNull(sparseArray.get(i11)));
            }
        }
    }

    default void onAudioAttributesChanged(EventTime eventTime, AudioAttributes audioAttributes) {
    }

    default void onAudioDecoderInitialized(EventTime eventTime, String str, long j10) {
    }

    default void onAudioDecoderReleased(EventTime eventTime, String str) {
    }

    default void onAudioDisabled(EventTime eventTime, DecoderCounters decoderCounters) {
    }

    default void onAudioEnabled(EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @Deprecated
    default void onAudioInputFormatChanged(EventTime eventTime, Format format) {
    }

    default void onAudioInputFormatChanged(EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        onAudioInputFormatChanged(eventTime, format);
    }

    default void onAudioPositionAdvancing(EventTime eventTime, long j10) {
    }

    default void onAudioSessionIdChanged(EventTime eventTime, int i10) {
    }

    default void onAudioSinkError(EventTime eventTime, Exception exc) {
    }

    default void onAudioUnderrun(EventTime eventTime, int i10, long j10, long j11) {
    }

    default void onBandwidthEstimate(EventTime eventTime, int i10, long j10, long j11) {
    }

    @Deprecated
    default void onDecoderDisabled(EventTime eventTime, int i10, DecoderCounters decoderCounters) {
    }

    @Deprecated
    default void onDecoderEnabled(EventTime eventTime, int i10, DecoderCounters decoderCounters) {
    }

    @Deprecated
    default void onDecoderInitialized(EventTime eventTime, int i10, String str, long j10) {
    }

    @Deprecated
    default void onDecoderInputFormatChanged(EventTime eventTime, int i10, Format format) {
    }

    default void onDownstreamFormatChanged(EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    default void onDrmKeysLoaded(EventTime eventTime) {
    }

    default void onDrmKeysRemoved(EventTime eventTime) {
    }

    default void onDrmKeysRestored(EventTime eventTime) {
    }

    default void onDrmSessionAcquired(EventTime eventTime) {
    }

    default void onDrmSessionManagerError(EventTime eventTime, Exception exc) {
    }

    default void onDrmSessionReleased(EventTime eventTime) {
    }

    default void onDroppedVideoFrames(EventTime eventTime, int i10, long j10) {
    }

    default void onEvents(Player player, Events events) {
    }

    default void onIsLoadingChanged(EventTime eventTime, boolean z10) {
        onLoadingChanged(eventTime, z10);
    }

    default void onIsPlayingChanged(EventTime eventTime, boolean z10) {
    }

    default void onLoadCanceled(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadCompleted(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadError(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z10) {
    }

    default void onLoadStarted(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Deprecated
    default void onLoadingChanged(EventTime eventTime, boolean z10) {
    }

    default void onMediaItemTransition(EventTime eventTime, MediaItem mediaItem, int i10) {
    }

    default void onMetadata(EventTime eventTime, Metadata metadata) {
    }

    default void onPlayWhenReadyChanged(EventTime eventTime, boolean z10, int i10) {
    }

    default void onPlaybackParametersChanged(EventTime eventTime, PlaybackParameters playbackParameters) {
    }

    default void onPlaybackStateChanged(EventTime eventTime, int i10) {
    }

    default void onPlaybackSuppressionReasonChanged(EventTime eventTime, int i10) {
    }

    default void onPlayerError(EventTime eventTime, ExoPlaybackException exoPlaybackException) {
    }

    default void onPlayerReleased(EventTime eventTime) {
    }

    @Deprecated
    default void onPlayerStateChanged(EventTime eventTime, boolean z10, int i10) {
    }

    default void onPositionDiscontinuity(EventTime eventTime, int i10) {
    }

    default void onRenderedFirstFrame(EventTime eventTime, Surface surface) {
    }

    default void onRepeatModeChanged(EventTime eventTime, int i10) {
    }

    @Deprecated
    default void onSeekProcessed(EventTime eventTime) {
    }

    default void onSeekStarted(EventTime eventTime) {
    }

    default void onShuffleModeChanged(EventTime eventTime, boolean z10) {
    }

    default void onSkipSilenceEnabledChanged(EventTime eventTime, boolean z10) {
    }

    default void onStaticMetadataChanged(EventTime eventTime, List<Metadata> list) {
    }

    default void onSurfaceSizeChanged(EventTime eventTime, int i10, int i11) {
    }

    default void onTimelineChanged(EventTime eventTime, int i10) {
    }

    default void onTracksChanged(EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    default void onUpstreamDiscarded(EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    default void onVideoDecoderInitialized(EventTime eventTime, String str, long j10) {
    }

    default void onVideoDecoderReleased(EventTime eventTime, String str) {
    }

    default void onVideoDisabled(EventTime eventTime, DecoderCounters decoderCounters) {
    }

    default void onVideoEnabled(EventTime eventTime, DecoderCounters decoderCounters) {
    }

    default void onVideoFrameProcessingOffset(EventTime eventTime, long j10, int i10) {
    }

    @Deprecated
    default void onVideoInputFormatChanged(EventTime eventTime, Format format) {
    }

    default void onVideoInputFormatChanged(EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        onVideoInputFormatChanged(eventTime, format);
    }

    default void onVideoSizeChanged(EventTime eventTime, int i10, int i11, int i12, float f10) {
    }

    default void onVolumeChanged(EventTime eventTime, float f10) {
    }
}
