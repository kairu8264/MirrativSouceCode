package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.DefaultMediaClock;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaSourceList;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.TextRenderer;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import lk.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ExoPlayerImplInternal implements Handler.Callback, MediaPeriod.Callback, TrackSelector.InvalidationListener, MediaSourceList.MediaSourceListInfoRefreshListener, DefaultMediaClock.PlaybackParametersListener, PlayerMessage.Sender {
    private static final int ACTIVE_INTERVAL_MS = 10;
    private static final int IDLE_INTERVAL_MS = 1000;
    private static final long MIN_RENDERER_SLEEP_DURATION_MS = 2000;
    private static final int MSG_ADD_MEDIA_SOURCES = 18;
    private static final int MSG_ATTEMPT_ERROR_RECOVERY = 25;
    private static final int MSG_DO_SOME_WORK = 2;
    private static final int MSG_MOVE_MEDIA_SOURCES = 19;
    private static final int MSG_PERIOD_PREPARED = 8;
    private static final int MSG_PLAYBACK_PARAMETERS_CHANGED_INTERNAL = 16;
    private static final int MSG_PLAYLIST_UPDATE_REQUESTED = 22;
    private static final int MSG_PREPARE = 0;
    private static final int MSG_RELEASE = 7;
    private static final int MSG_REMOVE_MEDIA_SOURCES = 20;
    private static final int MSG_SEEK_TO = 3;
    private static final int MSG_SEND_MESSAGE = 14;
    private static final int MSG_SEND_MESSAGE_TO_TARGET_THREAD = 15;
    private static final int MSG_SET_FOREGROUND_MODE = 13;
    private static final int MSG_SET_MEDIA_SOURCES = 17;
    private static final int MSG_SET_OFFLOAD_SCHEDULING_ENABLED = 24;
    private static final int MSG_SET_PAUSE_AT_END_OF_WINDOW = 23;
    private static final int MSG_SET_PLAYBACK_PARAMETERS = 4;
    private static final int MSG_SET_PLAY_WHEN_READY = 1;
    private static final int MSG_SET_REPEAT_MODE = 11;
    private static final int MSG_SET_SEEK_PARAMETERS = 5;
    private static final int MSG_SET_SHUFFLE_ENABLED = 12;
    private static final int MSG_SET_SHUFFLE_ORDER = 21;
    private static final int MSG_SOURCE_CONTINUE_LOADING_REQUESTED = 9;
    private static final int MSG_STOP = 6;
    private static final int MSG_TRACK_SELECTION_INVALIDATED = 10;
    private static final String TAG = "ExoPlayerImplInternal";
    private final long backBufferDurationUs;
    private final BandwidthMeter bandwidthMeter;
    private final Clock clock;
    private boolean deliverPendingMessageAtStartPositionRequired;
    private final TrackSelectorResult emptyTrackSelectorResult;
    private int enabledRendererCount;
    private boolean foregroundMode;
    private final HandlerWrapper handler;
    private final HandlerThread internalPlaybackThread;
    private boolean isRebuffering;
    private final LivePlaybackSpeedControl livePlaybackSpeedControl;
    private final LoadControl loadControl;
    private final DefaultMediaClock mediaClock;
    private final MediaSourceList mediaSourceList;
    private int nextPendingMessageIndexHint;
    private boolean offloadSchedulingEnabled;
    private boolean pauseAtEndOfWindow;
    private SeekPosition pendingInitialSeekPosition;
    private final ArrayList<PendingMessageInfo> pendingMessages;
    private boolean pendingPauseAtEndOfPeriod;
    private ExoPlaybackException pendingRecoverableError;
    private final Timeline.Period period;
    private PlaybackInfo playbackInfo;
    private PlaybackInfoUpdate playbackInfoUpdate;
    private final PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private final Looper playbackLooper;
    private final MediaPeriodQueue queue;
    private final long releaseTimeoutMs;
    private boolean released;
    private final RendererCapabilities[] rendererCapabilities;
    private long rendererPositionUs;
    private final Renderer[] renderers;
    private int repeatMode;
    private boolean requestForRendererSleep;
    private final boolean retainBackBufferFromKeyframe;
    private SeekParameters seekParameters;
    private long setForegroundModeTimeoutMs;
    private boolean shouldContinueLoading;
    private boolean shuffleModeEnabled;
    private final TrackSelector trackSelector;
    private final Timeline.Window window;

    /* loaded from: classes3.dex */
    public static final class MediaSourceListUpdateMessage {
        private final List<MediaSourceList.MediaSourceHolder> mediaSourceHolders;
        private final long positionUs;
        private final ShuffleOrder shuffleOrder;
        private final int windowIndex;

        private MediaSourceListUpdateMessage(List<MediaSourceList.MediaSourceHolder> list, ShuffleOrder shuffleOrder, int i10, long j10) {
            this.mediaSourceHolders = list;
            this.shuffleOrder = shuffleOrder;
            this.windowIndex = i10;
            this.positionUs = j10;
        }
    }

    /* loaded from: classes3.dex */
    public static class MoveMediaItemsMessage {
        public final int fromIndex;
        public final int newFromIndex;
        public final ShuffleOrder shuffleOrder;
        public final int toIndex;

        public MoveMediaItemsMessage(int i10, int i11, int i12, ShuffleOrder shuffleOrder) {
            this.fromIndex = i10;
            this.toIndex = i11;
            this.newFromIndex = i12;
            this.shuffleOrder = shuffleOrder;
        }
    }

    /* loaded from: classes3.dex */
    public static final class PendingMessageInfo implements Comparable<PendingMessageInfo> {
        public final PlayerMessage message;
        public int resolvedPeriodIndex;
        public long resolvedPeriodTimeUs;
        public Object resolvedPeriodUid;

        public PendingMessageInfo(PlayerMessage playerMessage) {
            this.message = playerMessage;
        }

        public void setResolvedPosition(int i10, long j10, Object obj) {
            this.resolvedPeriodIndex = i10;
            this.resolvedPeriodTimeUs = j10;
            this.resolvedPeriodUid = obj;
        }

        @Override // java.lang.Comparable
        public int compareTo(PendingMessageInfo pendingMessageInfo) {
            Object obj = this.resolvedPeriodUid;
            if ((obj == null) != (pendingMessageInfo.resolvedPeriodUid == null)) {
                return obj != null ? -1 : 1;
            } else if (obj == null) {
                return 0;
            } else {
                int i10 = this.resolvedPeriodIndex - pendingMessageInfo.resolvedPeriodIndex;
                return i10 != 0 ? i10 : Util.compareLong(this.resolvedPeriodTimeUs, pendingMessageInfo.resolvedPeriodTimeUs);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class PlaybackInfoUpdate {
        public int discontinuityReason;
        private boolean hasPendingChange;
        public boolean hasPlayWhenReadyChangeReason;
        public int operationAcks;
        public int playWhenReadyChangeReason;
        public PlaybackInfo playbackInfo;
        public boolean positionDiscontinuity;

        public PlaybackInfoUpdate(PlaybackInfo playbackInfo) {
            this.playbackInfo = playbackInfo;
        }

        public void incrementPendingOperationAcks(int i10) {
            this.hasPendingChange |= i10 > 0;
            this.operationAcks += i10;
        }

        public void setPlayWhenReadyChangeReason(int i10) {
            this.hasPendingChange = true;
            this.hasPlayWhenReadyChangeReason = true;
            this.playWhenReadyChangeReason = i10;
        }

        public void setPlaybackInfo(PlaybackInfo playbackInfo) {
            this.hasPendingChange |= this.playbackInfo != playbackInfo;
            this.playbackInfo = playbackInfo;
        }

        public void setPositionDiscontinuity(int i10) {
            if (this.positionDiscontinuity && this.discontinuityReason != 4) {
                Assertions.checkArgument(i10 == 4);
                return;
            }
            this.hasPendingChange = true;
            this.positionDiscontinuity = true;
            this.discontinuityReason = i10;
        }
    }

    /* loaded from: classes3.dex */
    public interface PlaybackInfoUpdateListener {
        void onPlaybackInfoUpdate(PlaybackInfoUpdate playbackInfoUpdate);
    }

    /* loaded from: classes3.dex */
    public static final class PositionUpdateForPlaylistChange {
        public final boolean endPlayback;
        public final boolean forceBufferingState;
        public final MediaSource.MediaPeriodId periodId;
        public final long periodPositionUs;
        public final long requestedContentPositionUs;
        public final boolean setTargetLiveOffset;

        public PositionUpdateForPlaylistChange(MediaSource.MediaPeriodId mediaPeriodId, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.periodId = mediaPeriodId;
            this.periodPositionUs = j10;
            this.requestedContentPositionUs = j11;
            this.forceBufferingState = z10;
            this.endPlayback = z11;
            this.setTargetLiveOffset = z12;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SeekPosition {
        public final Timeline timeline;
        public final int windowIndex;
        public final long windowPositionUs;

        public SeekPosition(Timeline timeline, int i10, long j10) {
            this.timeline = timeline;
            this.windowIndex = i10;
            this.windowPositionUs = j10;
        }
    }

    public ExoPlayerImplInternal(Renderer[] rendererArr, TrackSelector trackSelector, TrackSelectorResult trackSelectorResult, LoadControl loadControl, BandwidthMeter bandwidthMeter, int i10, boolean z10, AnalyticsCollector analyticsCollector, SeekParameters seekParameters, LivePlaybackSpeedControl livePlaybackSpeedControl, long j10, boolean z11, Looper looper, Clock clock, PlaybackInfoUpdateListener playbackInfoUpdateListener) {
        this.playbackInfoUpdateListener = playbackInfoUpdateListener;
        this.renderers = rendererArr;
        this.trackSelector = trackSelector;
        this.emptyTrackSelectorResult = trackSelectorResult;
        this.loadControl = loadControl;
        this.bandwidthMeter = bandwidthMeter;
        this.repeatMode = i10;
        this.shuffleModeEnabled = z10;
        this.seekParameters = seekParameters;
        this.livePlaybackSpeedControl = livePlaybackSpeedControl;
        this.releaseTimeoutMs = j10;
        this.setForegroundModeTimeoutMs = j10;
        this.pauseAtEndOfWindow = z11;
        this.clock = clock;
        this.backBufferDurationUs = loadControl.getBackBufferDurationUs();
        this.retainBackBufferFromKeyframe = loadControl.retainBackBufferFromKeyframe();
        PlaybackInfo createDummy = PlaybackInfo.createDummy(trackSelectorResult);
        this.playbackInfo = createDummy;
        this.playbackInfoUpdate = new PlaybackInfoUpdate(createDummy);
        this.rendererCapabilities = new RendererCapabilities[rendererArr.length];
        for (int i11 = 0; i11 < rendererArr.length; i11++) {
            rendererArr[i11].setIndex(i11);
            this.rendererCapabilities[i11] = rendererArr[i11].getCapabilities();
        }
        this.mediaClock = new DefaultMediaClock(this, clock);
        this.pendingMessages = new ArrayList<>();
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        trackSelector.init(this, bandwidthMeter);
        this.deliverPendingMessageAtStartPositionRequired = true;
        Handler handler = new Handler(looper);
        this.queue = new MediaPeriodQueue(analyticsCollector, handler);
        this.mediaSourceList = new MediaSourceList(this, analyticsCollector, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.internalPlaybackThread = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.playbackLooper = looper2;
        this.handler = clock.createHandler(looper2, this);
    }

    private void addMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage, int i10) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        MediaSourceList mediaSourceList = this.mediaSourceList;
        if (i10 == -1) {
            i10 = mediaSourceList.getSize();
        }
        handleMediaSourceListInfoRefreshed(mediaSourceList.addMediaSources(i10, mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder));
    }

    private void attemptErrorRecovery(ExoPlaybackException exoPlaybackException) throws ExoPlaybackException {
        Assertions.checkArgument(exoPlaybackException.isRecoverable && exoPlaybackException.type == 1);
        try {
            seekToCurrentPosition(true);
        } catch (Exception e10) {
            exoPlaybackException.addSuppressed(e10);
            throw exoPlaybackException;
        }
    }

    private void deliverMessage(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.isCanceled()) {
            return;
        }
        try {
            playerMessage.getTarget().handleMessage(playerMessage.getType(), playerMessage.getPayload());
        } finally {
            playerMessage.markAsProcessed(true);
        }
    }

    private void disableRenderer(Renderer renderer) throws ExoPlaybackException {
        if (isRendererEnabled(renderer)) {
            this.mediaClock.onRendererDisabled(renderer);
            ensureStopped(renderer);
            renderer.disable();
            this.enabledRendererCount--;
        }
    }

    private void doSomeWork() throws ExoPlaybackException, IOException {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        long uptimeMillis = this.clock.uptimeMillis();
        updatePeriods();
        int i11 = this.playbackInfo.playbackState;
        if (i11 != 1 && i11 != 4) {
            MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            if (playingPeriod == null) {
                scheduleNextWork(uptimeMillis, 10L);
                return;
            }
            TraceUtil.beginSection("doSomeWork");
            updatePlaybackPositions();
            if (playingPeriod.prepared) {
                long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                playingPeriod.mediaPeriod.discardBuffer(this.playbackInfo.positionUs - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
                z10 = true;
                z11 = true;
                int i12 = 0;
                while (true) {
                    Renderer[] rendererArr = this.renderers;
                    if (i12 >= rendererArr.length) {
                        break;
                    }
                    Renderer renderer = rendererArr[i12];
                    if (isRendererEnabled(renderer)) {
                        renderer.render(this.rendererPositionUs, elapsedRealtime);
                        z10 = z10 && renderer.isEnded();
                        boolean z13 = playingPeriod.sampleStreams[i12] != renderer.getStream();
                        boolean z14 = z13 || (!z13 && renderer.hasReadStreamToEnd()) || renderer.isReady() || renderer.isEnded();
                        z11 = z11 && z14;
                        if (!z14) {
                            renderer.maybeThrowStreamError();
                        }
                    }
                    i12++;
                }
            } else {
                playingPeriod.mediaPeriod.maybeThrowPrepareError();
                z10 = true;
                z11 = true;
            }
            long j10 = playingPeriod.info.durationUs;
            boolean z15 = z10 && playingPeriod.prepared && (j10 == C.TIME_UNSET || j10 <= this.playbackInfo.positionUs);
            if (z15 && this.pendingPauseAtEndOfPeriod) {
                this.pendingPauseAtEndOfPeriod = false;
                setPlayWhenReadyInternal(false, this.playbackInfo.playbackSuppressionReason, false, 5);
            }
            if (z15 && playingPeriod.info.isFinal) {
                setState(4);
                stopRenderers();
            } else if (this.playbackInfo.playbackState == 2 && shouldTransitionToReadyState(z11)) {
                setState(3);
                this.pendingRecoverableError = null;
                if (shouldPlayWhenReady()) {
                    startRenderers();
                }
            } else if (this.playbackInfo.playbackState == 3 && (this.enabledRendererCount != 0 ? !z11 : !isTimelineReady())) {
                this.isRebuffering = shouldPlayWhenReady();
                setState(2);
                if (this.isRebuffering) {
                    notifyTrackSelectionRebuffer();
                    this.livePlaybackSpeedControl.notifyRebuffer();
                }
                stopRenderers();
            }
            if (this.playbackInfo.playbackState == 2) {
                int i13 = 0;
                while (true) {
                    Renderer[] rendererArr2 = this.renderers;
                    if (i13 >= rendererArr2.length) {
                        break;
                    }
                    if (isRendererEnabled(rendererArr2[i13]) && this.renderers[i13].getStream() == playingPeriod.sampleStreams[i13]) {
                        this.renderers[i13].maybeThrowStreamError();
                    }
                    i13++;
                }
                PlaybackInfo playbackInfo = this.playbackInfo;
                if (!playbackInfo.isLoading && playbackInfo.totalBufferedDurationUs < 500000 && isLoadingPossible()) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            }
            boolean z16 = this.offloadSchedulingEnabled;
            PlaybackInfo playbackInfo2 = this.playbackInfo;
            if (z16 != playbackInfo2.offloadSchedulingEnabled) {
                this.playbackInfo = playbackInfo2.copyWithOffloadSchedulingEnabled(z16);
            }
            if ((shouldPlayWhenReady() && this.playbackInfo.playbackState == 3) || (i10 = this.playbackInfo.playbackState) == 2) {
                z12 = !maybeScheduleWakeup(uptimeMillis, 10L);
            } else {
                if (this.enabledRendererCount != 0 && i10 != 4) {
                    scheduleNextWork(uptimeMillis, 1000L);
                } else {
                    this.handler.removeMessages(2);
                }
                z12 = false;
            }
            PlaybackInfo playbackInfo3 = this.playbackInfo;
            if (playbackInfo3.sleepingForOffload != z12) {
                this.playbackInfo = playbackInfo3.copyWithSleepingForOffload(z12);
            }
            this.requestForRendererSleep = false;
            TraceUtil.endSection();
            return;
        }
        this.handler.removeMessages(2);
    }

    private void enableRenderer(int i10, boolean z10) throws ExoPlaybackException {
        Renderer renderer = this.renderers[i10];
        if (isRendererEnabled(renderer)) {
            return;
        }
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        boolean z11 = readingPeriod == this.queue.getPlayingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i10];
        Format[] formats = getFormats(trackSelectorResult.selections[i10]);
        boolean z12 = shouldPlayWhenReady() && this.playbackInfo.playbackState == 3;
        boolean z13 = !z10 && z12;
        this.enabledRendererCount++;
        renderer.enable(rendererConfiguration, formats, readingPeriod.sampleStreams[i10], this.rendererPositionUs, z13, z11, readingPeriod.getStartPositionRendererTime(), readingPeriod.getRendererOffset());
        renderer.handleMessage(103, new Renderer.WakeupListener() { // from class: com.google.android.exoplayer2.ExoPlayerImplInternal.1
            @Override // com.google.android.exoplayer2.Renderer.WakeupListener
            public void onSleep(long j10) {
                if (j10 >= 2000) {
                    ExoPlayerImplInternal.this.requestForRendererSleep = true;
                }
            }

            @Override // com.google.android.exoplayer2.Renderer.WakeupListener
            public void onWakeup() {
                ExoPlayerImplInternal.this.handler.sendEmptyMessage(2);
            }
        });
        this.mediaClock.onRendererEnabled(renderer);
        if (z12) {
            renderer.start();
        }
    }

    private void enableRenderers() throws ExoPlaybackException {
        enableRenderers(new boolean[this.renderers.length]);
    }

    private void ensureStopped(Renderer renderer) throws ExoPlaybackException {
        if (renderer.getState() == 2) {
            renderer.stop();
        }
    }

    private lk.r<Metadata> extractMetadataFromTrackSelectionArray(ExoTrackSelection[] exoTrackSelectionArr) {
        r.a aVar = new r.a();
        boolean z10 = false;
        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                Metadata metadata = exoTrackSelection.getFormat(0).metadata;
                if (metadata == null) {
                    aVar.d(new Metadata(new Metadata.Entry[0]));
                } else {
                    aVar.d(metadata);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.e() : lk.r.A();
    }

    private long getCurrentLiveOffsetUs() {
        PlaybackInfo playbackInfo = this.playbackInfo;
        return getLiveOffsetUs(playbackInfo.timeline, playbackInfo.periodId.periodUid, playbackInfo.positionUs);
    }

    private static Format[] getFormats(ExoTrackSelection exoTrackSelection) {
        int length = exoTrackSelection != null ? exoTrackSelection.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i10 = 0; i10 < length; i10++) {
            formatArr[i10] = exoTrackSelection.getFormat(i10);
        }
        return formatArr;
    }

    private long getLiveOffsetUs(Timeline timeline, Object obj, long j10) {
        timeline.getWindow(timeline.getPeriodByUid(obj, this.period).windowIndex, this.window);
        Timeline.Window window = this.window;
        if (window.windowStartTimeMs != C.TIME_UNSET && window.isLive()) {
            Timeline.Window window2 = this.window;
            if (window2.isDynamic) {
                return C.msToUs(window2.getCurrentUnixTimeMs() - this.window.windowStartTimeMs) - (j10 + this.period.getPositionInWindowUs());
            }
        }
        return C.TIME_UNSET;
    }

    private long getMaxRendererReadPositionUs() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null) {
            return 0L;
        }
        long rendererOffset = readingPeriod.getRendererOffset();
        if (!readingPeriod.prepared) {
            return rendererOffset;
        }
        int i10 = 0;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i10 >= rendererArr.length) {
                return rendererOffset;
            }
            if (isRendererEnabled(rendererArr[i10]) && this.renderers[i10].getStream() == readingPeriod.sampleStreams[i10]) {
                long readingPositionUs = this.renderers[i10].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                rendererOffset = Math.max(readingPositionUs, rendererOffset);
            }
            i10++;
        }
    }

    private Pair<MediaSource.MediaPeriodId, Long> getPlaceholderFirstMediaPeriodPosition(Timeline timeline) {
        if (timeline.isEmpty()) {
            return Pair.create(PlaybackInfo.getDummyPeriodForEmptyTimeline(), 0L);
        }
        Pair<Object, Long> periodPosition = timeline.getPeriodPosition(this.window, this.period, timeline.getFirstWindowIndex(this.shuffleModeEnabled), C.TIME_UNSET);
        MediaSource.MediaPeriodId resolveMediaPeriodIdForAds = this.queue.resolveMediaPeriodIdForAds(timeline, periodPosition.first, 0L);
        long longValue = ((Long) periodPosition.second).longValue();
        if (resolveMediaPeriodIdForAds.isAd()) {
            timeline.getPeriodByUid(resolveMediaPeriodIdForAds.periodUid, this.period);
            longValue = resolveMediaPeriodIdForAds.adIndexInAdGroup == this.period.getFirstAdIndexToPlay(resolveMediaPeriodIdForAds.adGroupIndex) ? this.period.getAdResumePositionUs() : 0L;
        }
        return Pair.create(resolveMediaPeriodIdForAds, Long.valueOf(longValue));
    }

    private long getTotalBufferedDurationUs() {
        return getTotalBufferedDurationUs(this.playbackInfo.bufferedPositionUs);
    }

    private void handleContinueLoadingRequested(MediaPeriod mediaPeriod) {
        if (this.queue.isLoading(mediaPeriod)) {
            this.queue.reevaluateBuffer(this.rendererPositionUs);
            maybeContinueLoading();
        }
    }

    private void handleLoadingMediaPeriodChanged(boolean z10) {
        long bufferedPositionUs;
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        MediaSource.MediaPeriodId mediaPeriodId = loadingPeriod == null ? this.playbackInfo.periodId : loadingPeriod.info.f26650id;
        boolean z11 = !this.playbackInfo.loadingMediaPeriodId.equals(mediaPeriodId);
        if (z11) {
            this.playbackInfo = this.playbackInfo.copyWithLoadingMediaPeriodId(mediaPeriodId);
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (loadingPeriod == null) {
            bufferedPositionUs = playbackInfo.positionUs;
        } else {
            bufferedPositionUs = loadingPeriod.getBufferedPositionUs();
        }
        playbackInfo.bufferedPositionUs = bufferedPositionUs;
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        if ((z11 || z10) && loadingPeriod != null && loadingPeriod.prepared) {
            updateLoadControlTrackSelection(loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
        }
    }

    private void handleMediaSourceListInfoRefreshed(Timeline timeline) throws ExoPlaybackException {
        SeekPosition seekPosition;
        PositionUpdateForPlaylistChange resolvePositionForPlaylistChange = resolvePositionForPlaylistChange(timeline, this.playbackInfo, this.pendingInitialSeekPosition, this.queue, this.repeatMode, this.shuffleModeEnabled, this.window, this.period);
        MediaSource.MediaPeriodId mediaPeriodId = resolvePositionForPlaylistChange.periodId;
        long j10 = resolvePositionForPlaylistChange.requestedContentPositionUs;
        boolean z10 = resolvePositionForPlaylistChange.forceBufferingState;
        long j11 = resolvePositionForPlaylistChange.periodPositionUs;
        boolean z11 = (this.playbackInfo.periodId.equals(mediaPeriodId) && j11 == this.playbackInfo.positionUs) ? false : true;
        long j12 = C.TIME_UNSET;
        try {
            if (resolvePositionForPlaylistChange.endPlayback) {
                if (this.playbackInfo.playbackState != 1) {
                    setState(4);
                }
                resetInternal(false, false, false, true);
            }
        } catch (Throwable th2) {
            th = th2;
            seekPosition = null;
        }
        try {
            if (!z11) {
                if (!this.queue.updateQueuedPeriods(timeline, this.rendererPositionUs, getMaxRendererReadPositionUs())) {
                    seekToCurrentPosition(false);
                }
            } else if (!timeline.isEmpty()) {
                for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
                    if (playingPeriod.info.f26650id.equals(mediaPeriodId)) {
                        playingPeriod.info = this.queue.getUpdatedMediaPeriodInfo(timeline, playingPeriod.info);
                    }
                }
                j11 = seekToPeriodPosition(mediaPeriodId, j11, z10);
            }
            PlaybackInfo playbackInfo = this.playbackInfo;
            Timeline timeline2 = playbackInfo.timeline;
            MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo.periodId;
            if (resolvePositionForPlaylistChange.setTargetLiveOffset) {
                j12 = j11;
            }
            updateLivePlaybackSpeedControl(timeline, mediaPeriodId, timeline2, mediaPeriodId2, j12);
            if (z11 || j10 != this.playbackInfo.requestedContentPositionUs) {
                this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j11, j10);
            }
            resetPendingPauseAtEndOfPeriod();
            resolvePendingMessagePositions(timeline, this.playbackInfo.timeline);
            this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline);
            if (!timeline.isEmpty()) {
                this.pendingInitialSeekPosition = null;
            }
            handleLoadingMediaPeriodChanged(false);
        } catch (Throwable th3) {
            th = th3;
            seekPosition = null;
            PlaybackInfo playbackInfo2 = this.playbackInfo;
            Timeline timeline3 = playbackInfo2.timeline;
            MediaSource.MediaPeriodId mediaPeriodId3 = playbackInfo2.periodId;
            if (resolvePositionForPlaylistChange.setTargetLiveOffset) {
                j12 = j11;
            }
            SeekPosition seekPosition2 = seekPosition;
            updateLivePlaybackSpeedControl(timeline, mediaPeriodId, timeline3, mediaPeriodId3, j12);
            if (z11 || j10 != this.playbackInfo.requestedContentPositionUs) {
                this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j11, j10);
            }
            resetPendingPauseAtEndOfPeriod();
            resolvePendingMessagePositions(timeline, this.playbackInfo.timeline);
            this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline);
            if (!timeline.isEmpty()) {
                this.pendingInitialSeekPosition = seekPosition2;
            }
            handleLoadingMediaPeriodChanged(false);
            throw th;
        }
    }

    private void handlePeriodPrepared(MediaPeriod mediaPeriod) throws ExoPlaybackException {
        if (this.queue.isLoading(mediaPeriod)) {
            MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
            loadingPeriod.handlePrepared(this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.timeline);
            updateLoadControlTrackSelection(loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
            if (loadingPeriod == this.queue.getPlayingPeriod()) {
                resetRendererPosition(loadingPeriod.info.startPositionUs);
                enableRenderers();
                PlaybackInfo playbackInfo = this.playbackInfo;
                this.playbackInfo = handlePositionDiscontinuity(playbackInfo.periodId, loadingPeriod.info.startPositionUs, playbackInfo.requestedContentPositionUs);
            }
            maybeContinueLoading();
        }
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, boolean z10) throws ExoPlaybackException {
        handlePlaybackParameters(playbackParameters, playbackParameters.speed, true, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PlaybackInfo handlePositionDiscontinuity(MediaSource.MediaPeriodId mediaPeriodId, long j10, long j11) {
        List list;
        TrackGroupArray trackGroupArray;
        TrackSelectorResult trackSelectorResult;
        TrackGroupArray trackGroups;
        TrackSelectorResult trackSelectorResult2;
        this.deliverPendingMessageAtStartPositionRequired = (!this.deliverPendingMessageAtStartPositionRequired && j10 == this.playbackInfo.positionUs && mediaPeriodId.equals(this.playbackInfo.periodId)) ? false : true;
        resetPendingPauseAtEndOfPeriod();
        PlaybackInfo playbackInfo = this.playbackInfo;
        TrackGroupArray trackGroupArray2 = playbackInfo.trackGroups;
        TrackSelectorResult trackSelectorResult3 = playbackInfo.trackSelectorResult;
        List list2 = playbackInfo.staticMetadata;
        if (this.mediaSourceList.isPrepared()) {
            MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            if (playingPeriod == null) {
                trackGroups = TrackGroupArray.EMPTY;
            } else {
                trackGroups = playingPeriod.getTrackGroups();
            }
            if (playingPeriod == null) {
                trackSelectorResult2 = this.emptyTrackSelectorResult;
            } else {
                trackSelectorResult2 = playingPeriod.getTrackSelectorResult();
            }
            List extractMetadataFromTrackSelectionArray = extractMetadataFromTrackSelectionArray(trackSelectorResult2.selections);
            if (playingPeriod != null) {
                MediaPeriodInfo mediaPeriodInfo = playingPeriod.info;
                if (mediaPeriodInfo.requestedContentPositionUs != j11) {
                    playingPeriod.info = mediaPeriodInfo.copyWithRequestedContentPositionUs(j11);
                }
            }
            trackGroupArray = trackGroups;
            trackSelectorResult = trackSelectorResult2;
            list = extractMetadataFromTrackSelectionArray;
        } else if (mediaPeriodId.equals(this.playbackInfo.periodId)) {
            list = list2;
            trackGroupArray = trackGroupArray2;
            trackSelectorResult = trackSelectorResult3;
        } else {
            trackGroupArray = TrackGroupArray.EMPTY;
            trackSelectorResult = this.emptyTrackSelectorResult;
            list = lk.r.A();
        }
        return this.playbackInfo.copyWithNewPosition(mediaPeriodId, j10, j11, getTotalBufferedDurationUs(), trackGroupArray, trackSelectorResult, list);
    }

    private boolean hasReadingPeriodFinishedReading() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod.prepared) {
            int i10 = 0;
            while (true) {
                Renderer[] rendererArr = this.renderers;
                if (i10 >= rendererArr.length) {
                    return true;
                }
                Renderer renderer = rendererArr[i10];
                SampleStream sampleStream = readingPeriod.sampleStreams[i10];
                if (renderer.getStream() != sampleStream || (sampleStream != null && !renderer.hasReadStreamToEnd())) {
                    break;
                }
                i10++;
            }
            return false;
        }
        return false;
    }

    private boolean isLoadingPossible() {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        return (loadingPeriod == null || loadingPeriod.getNextLoadPositionUs() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean isRendererEnabled(Renderer renderer) {
        return renderer.getState() != 0;
    }

    private boolean isTimelineReady() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long j10 = playingPeriod.info.durationUs;
        return playingPeriod.prepared && (j10 == C.TIME_UNSET || this.playbackInfo.positionUs < j10 || !shouldPlayWhenReady());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$release$0() {
        return Boolean.valueOf(this.released);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessageToTargetThread$1(PlayerMessage playerMessage) {
        try {
            deliverMessage(playerMessage);
        } catch (ExoPlaybackException e10) {
            Log.e(TAG, "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void maybeContinueLoading() {
        boolean shouldContinueLoading = shouldContinueLoading();
        this.shouldContinueLoading = shouldContinueLoading;
        if (shouldContinueLoading) {
            this.queue.getLoadingPeriod().continueLoading(this.rendererPositionUs);
        }
        updateIsLoading();
    }

    private void maybeNotifyPlaybackInfoChanged() {
        this.playbackInfoUpdate.setPlaybackInfo(this.playbackInfo);
        if (this.playbackInfoUpdate.hasPendingChange) {
            this.playbackInfoUpdateListener.onPlaybackInfoUpdate(this.playbackInfoUpdate);
            this.playbackInfoUpdate = new PlaybackInfoUpdate(this.playbackInfo);
        }
    }

    private boolean maybeScheduleWakeup(long j10, long j11) {
        if (this.offloadSchedulingEnabled && this.requestForRendererSleep) {
            return false;
        }
        scheduleNextWork(j10, j11);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090 A[LOOP:1: B:27:0x0074->B:37:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0044 -> B:14:0x0045). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0073 -> B:27:0x0074). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void maybeTriggerPendingMessages(long r8, long r10) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlayerImplInternal.maybeTriggerPendingMessages(long, long):void");
    }

    private void maybeUpdateLoadingPeriod() throws ExoPlaybackException {
        MediaPeriodInfo nextMediaPeriodInfo;
        this.queue.reevaluateBuffer(this.rendererPositionUs);
        if (this.queue.shouldLoadNextMediaPeriod() && (nextMediaPeriodInfo = this.queue.getNextMediaPeriodInfo(this.rendererPositionUs, this.playbackInfo)) != null) {
            MediaPeriodHolder enqueueNextMediaPeriodHolder = this.queue.enqueueNextMediaPeriodHolder(this.rendererCapabilities, this.trackSelector, this.loadControl.getAllocator(), this.mediaSourceList, nextMediaPeriodInfo, this.emptyTrackSelectorResult);
            enqueueNextMediaPeriodHolder.mediaPeriod.prepare(this, nextMediaPeriodInfo.startPositionUs);
            if (this.queue.getPlayingPeriod() == enqueueNextMediaPeriodHolder) {
                resetRendererPosition(enqueueNextMediaPeriodHolder.getStartPositionRendererTime());
            }
            handleLoadingMediaPeriodChanged(false);
        }
        if (this.shouldContinueLoading) {
            this.shouldContinueLoading = isLoadingPossible();
            updateIsLoading();
            return;
        }
        maybeContinueLoading();
    }

    private void maybeUpdatePlayingPeriod() throws ExoPlaybackException {
        boolean z10 = false;
        while (shouldAdvancePlayingPeriod()) {
            if (z10) {
                maybeNotifyPlaybackInfoChanged();
            }
            MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            MediaPeriodHolder advancePlayingPeriod = this.queue.advancePlayingPeriod();
            MediaPeriodInfo mediaPeriodInfo = advancePlayingPeriod.info;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodInfo.f26650id, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.requestedContentPositionUs);
            this.playbackInfoUpdate.setPositionDiscontinuity(playingPeriod.info.isLastInTimelinePeriod ? 0 : 3);
            Timeline timeline = this.playbackInfo.timeline;
            updateLivePlaybackSpeedControl(timeline, advancePlayingPeriod.info.f26650id, timeline, playingPeriod.info.f26650id, C.TIME_UNSET);
            resetPendingPauseAtEndOfPeriod();
            updatePlaybackPositions();
            z10 = true;
        }
    }

    private void maybeUpdateReadingPeriod() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null) {
            return;
        }
        int i10 = 0;
        if (readingPeriod.getNext() != null && !this.pendingPauseAtEndOfPeriod) {
            if (hasReadingPeriodFinishedReading()) {
                if (readingPeriod.getNext().prepared || this.rendererPositionUs >= readingPeriod.getNext().getStartPositionRendererTime()) {
                    TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
                    MediaPeriodHolder advanceReadingPeriod = this.queue.advanceReadingPeriod();
                    TrackSelectorResult trackSelectorResult2 = advanceReadingPeriod.getTrackSelectorResult();
                    if (advanceReadingPeriod.prepared && advanceReadingPeriod.mediaPeriod.readDiscontinuity() != C.TIME_UNSET) {
                        setAllRendererStreamsFinal(advanceReadingPeriod.getStartPositionRendererTime());
                        return;
                    }
                    for (int i11 = 0; i11 < this.renderers.length; i11++) {
                        boolean isRendererEnabled = trackSelectorResult.isRendererEnabled(i11);
                        boolean isRendererEnabled2 = trackSelectorResult2.isRendererEnabled(i11);
                        if (isRendererEnabled && !this.renderers[i11].isCurrentStreamFinal()) {
                            boolean z10 = this.rendererCapabilities[i11].getTrackType() == 7;
                            RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i11];
                            RendererConfiguration rendererConfiguration2 = trackSelectorResult2.rendererConfigurations[i11];
                            if (!isRendererEnabled2 || !rendererConfiguration2.equals(rendererConfiguration) || z10) {
                                setCurrentStreamFinal(this.renderers[i11], advanceReadingPeriod.getStartPositionRendererTime());
                            }
                        }
                    }
                }
            }
        } else if (readingPeriod.info.isFinal || this.pendingPauseAtEndOfPeriod) {
            while (true) {
                Renderer[] rendererArr = this.renderers;
                if (i10 >= rendererArr.length) {
                    return;
                }
                Renderer renderer = rendererArr[i10];
                SampleStream sampleStream = readingPeriod.sampleStreams[i10];
                if (sampleStream != null && renderer.getStream() == sampleStream && renderer.hasReadStreamToEnd()) {
                    long j10 = readingPeriod.info.durationUs;
                    setCurrentStreamFinal(renderer, (j10 == C.TIME_UNSET || j10 == Long.MIN_VALUE) ? -9223372036854775807L : readingPeriod.getRendererOffset() + readingPeriod.info.durationUs);
                }
                i10++;
            }
        }
    }

    private void maybeUpdateReadingRenderers() throws ExoPlaybackException {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null || this.queue.getPlayingPeriod() == readingPeriod || readingPeriod.allRenderersEnabled || !replaceStreamsOrDisableRendererForTransition()) {
            return;
        }
        enableRenderers();
    }

    private void mediaSourceListUpdateRequestedInternal() throws ExoPlaybackException {
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.createTimeline());
    }

    private void moveMediaItemsInternal(MoveMediaItemsMessage moveMediaItemsMessage) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.moveMediaSourceRange(moveMediaItemsMessage.fromIndex, moveMediaItemsMessage.toIndex, moveMediaItemsMessage.newFromIndex, moveMediaItemsMessage.shuffleOrder));
    }

    private void notifyTrackSelectionDiscontinuity() {
        ExoTrackSelection[] exoTrackSelectionArr;
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onDiscontinuity();
                }
            }
        }
    }

    private void notifyTrackSelectionPlayWhenReadyChanged(boolean z10) {
        ExoTrackSelection[] exoTrackSelectionArr;
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlayWhenReadyChanged(z10);
                }
            }
        }
    }

    private void notifyTrackSelectionRebuffer() {
        ExoTrackSelection[] exoTrackSelectionArr;
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onRebuffer();
                }
            }
        }
    }

    private void prepareInternal() {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        resetInternal(false, false, false, true);
        this.loadControl.onPrepared();
        setState(this.playbackInfo.timeline.isEmpty() ? 4 : 2);
        this.mediaSourceList.prepare(this.bandwidthMeter.getTransferListener());
        this.handler.sendEmptyMessage(2);
    }

    private void releaseInternal() {
        resetInternal(true, false, true, false);
        this.loadControl.onReleased();
        setState(1);
        this.internalPlaybackThread.quit();
        synchronized (this) {
            this.released = true;
            notifyAll();
        }
    }

    private void removeMediaItemsInternal(int i10, int i11, ShuffleOrder shuffleOrder) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.removeMediaSourceRange(i10, i11, shuffleOrder));
    }

    private boolean replaceStreamsOrDisableRendererForTransition() throws ExoPlaybackException {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i10 >= rendererArr.length) {
                return !z10;
            }
            Renderer renderer = rendererArr[i10];
            if (isRendererEnabled(renderer)) {
                boolean z11 = renderer.getStream() != readingPeriod.sampleStreams[i10];
                if (!trackSelectorResult.isRendererEnabled(i10) || z11) {
                    if (!renderer.isCurrentStreamFinal()) {
                        renderer.replaceStream(getFormats(trackSelectorResult.selections[i10]), readingPeriod.sampleStreams[i10], readingPeriod.getStartPositionRendererTime(), readingPeriod.getRendererOffset());
                    } else if (renderer.isEnded()) {
                        disableRenderer(renderer);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    private void reselectTracksInternal() throws ExoPlaybackException {
        float f10 = this.mediaClock.getPlaybackParameters().speed;
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        boolean z10 = true;
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null && playingPeriod.prepared; playingPeriod = playingPeriod.getNext()) {
            TrackSelectorResult selectTracks = playingPeriod.selectTracks(f10, this.playbackInfo.timeline);
            int i10 = 0;
            if (!selectTracks.isEquivalent(playingPeriod.getTrackSelectorResult())) {
                if (z10) {
                    MediaPeriodHolder playingPeriod2 = this.queue.getPlayingPeriod();
                    boolean removeAfter = this.queue.removeAfter(playingPeriod2);
                    boolean[] zArr = new boolean[this.renderers.length];
                    long applyTrackSelection = playingPeriod2.applyTrackSelection(selectTracks, this.playbackInfo.positionUs, removeAfter, zArr);
                    PlaybackInfo playbackInfo = this.playbackInfo;
                    PlaybackInfo handlePositionDiscontinuity = handlePositionDiscontinuity(playbackInfo.periodId, applyTrackSelection, playbackInfo.requestedContentPositionUs);
                    this.playbackInfo = handlePositionDiscontinuity;
                    if (handlePositionDiscontinuity.playbackState != 4 && applyTrackSelection != handlePositionDiscontinuity.positionUs) {
                        this.playbackInfoUpdate.setPositionDiscontinuity(4);
                        resetRendererPosition(applyTrackSelection);
                    }
                    boolean[] zArr2 = new boolean[this.renderers.length];
                    while (true) {
                        Renderer[] rendererArr = this.renderers;
                        if (i10 >= rendererArr.length) {
                            break;
                        }
                        Renderer renderer = rendererArr[i10];
                        zArr2[i10] = isRendererEnabled(renderer);
                        SampleStream sampleStream = playingPeriod2.sampleStreams[i10];
                        if (zArr2[i10]) {
                            if (sampleStream != renderer.getStream()) {
                                disableRenderer(renderer);
                            } else if (zArr[i10]) {
                                renderer.resetPosition(this.rendererPositionUs);
                            }
                        }
                        i10++;
                    }
                    enableRenderers(zArr2);
                } else {
                    this.queue.removeAfter(playingPeriod);
                    if (playingPeriod.prepared) {
                        playingPeriod.applyTrackSelection(selectTracks, Math.max(playingPeriod.info.startPositionUs, playingPeriod.toPeriodTime(this.rendererPositionUs)), false);
                    }
                }
                handleLoadingMediaPeriodChanged(true);
                if (this.playbackInfo.playbackState != 4) {
                    maybeContinueLoading();
                    updatePlaybackPositions();
                    this.handler.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            if (playingPeriod == readingPeriod) {
                z10 = false;
            }
        }
    }

    private void resetInternal(boolean z10, boolean z11, boolean z12, boolean z13) {
        long j10;
        MediaSource.MediaPeriodId mediaPeriodId;
        long j11;
        long j12;
        boolean z14;
        this.handler.removeMessages(2);
        this.isRebuffering = false;
        this.mediaClock.stop();
        this.rendererPositionUs = 0L;
        for (Renderer renderer : this.renderers) {
            try {
                disableRenderer(renderer);
            } catch (ExoPlaybackException | RuntimeException e10) {
                Log.e(TAG, "Disable failed.", e10);
            }
        }
        if (z10) {
            for (Renderer renderer2 : this.renderers) {
                try {
                    renderer2.reset();
                } catch (RuntimeException e11) {
                    Log.e(TAG, "Reset failed.", e11);
                }
            }
        }
        this.enabledRendererCount = 0;
        PlaybackInfo playbackInfo = this.playbackInfo;
        MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo.periodId;
        long j13 = playbackInfo.positionUs;
        if (shouldUseRequestedContentPosition(this.playbackInfo, this.period, this.window)) {
            j10 = this.playbackInfo.requestedContentPositionUs;
        } else {
            j10 = this.playbackInfo.positionUs;
        }
        if (z11) {
            this.pendingInitialSeekPosition = null;
            Pair<MediaSource.MediaPeriodId, Long> placeholderFirstMediaPeriodPosition = getPlaceholderFirstMediaPeriodPosition(this.playbackInfo.timeline);
            MediaSource.MediaPeriodId mediaPeriodId3 = (MediaSource.MediaPeriodId) placeholderFirstMediaPeriodPosition.first;
            long longValue = ((Long) placeholderFirstMediaPeriodPosition.second).longValue();
            z14 = !mediaPeriodId3.equals(this.playbackInfo.periodId);
            mediaPeriodId = mediaPeriodId3;
            j11 = longValue;
            j12 = -9223372036854775807L;
        } else {
            mediaPeriodId = mediaPeriodId2;
            j11 = j13;
            j12 = j10;
            z14 = false;
        }
        this.queue.clear();
        this.shouldContinueLoading = false;
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        Timeline timeline = playbackInfo2.timeline;
        int i10 = playbackInfo2.playbackState;
        ExoPlaybackException exoPlaybackException = z13 ? null : playbackInfo2.playbackError;
        TrackGroupArray trackGroupArray = z14 ? TrackGroupArray.EMPTY : playbackInfo2.trackGroups;
        TrackSelectorResult trackSelectorResult = z14 ? this.emptyTrackSelectorResult : playbackInfo2.trackSelectorResult;
        List A = z14 ? lk.r.A() : playbackInfo2.staticMetadata;
        PlaybackInfo playbackInfo3 = this.playbackInfo;
        this.playbackInfo = new PlaybackInfo(timeline, mediaPeriodId, j12, i10, exoPlaybackException, false, trackGroupArray, trackSelectorResult, A, mediaPeriodId, playbackInfo3.playWhenReady, playbackInfo3.playbackSuppressionReason, playbackInfo3.playbackParameters, j11, 0L, j11, this.offloadSchedulingEnabled, false);
        if (z12) {
            this.mediaSourceList.release();
        }
        this.pendingRecoverableError = null;
    }

    private void resetPendingPauseAtEndOfPeriod() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        this.pendingPauseAtEndOfPeriod = playingPeriod != null && playingPeriod.info.isLastInTimelineWindow && this.pauseAtEndOfWindow;
    }

    private void resetRendererPosition(long j10) throws ExoPlaybackException {
        Renderer[] rendererArr;
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod != null) {
            j10 = playingPeriod.toRendererTime(j10);
        }
        this.rendererPositionUs = j10;
        this.mediaClock.resetPosition(j10);
        for (Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                renderer.resetPosition(this.rendererPositionUs);
            }
        }
        notifyTrackSelectionDiscontinuity();
    }

    private static void resolvePendingMessageEndOfStreamPosition(Timeline timeline, PendingMessageInfo pendingMessageInfo, Timeline.Window window, Timeline.Period period) {
        int i10 = timeline.getWindow(timeline.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period).windowIndex, window).lastPeriodIndex;
        Object obj = timeline.getPeriod(i10, period, true).uid;
        long j10 = period.durationUs;
        pendingMessageInfo.setResolvedPosition(i10, j10 != C.TIME_UNSET ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    private static boolean resolvePendingMessagePosition(PendingMessageInfo pendingMessageInfo, Timeline timeline, Timeline timeline2, int i10, boolean z10, Timeline.Window window, Timeline.Period period) {
        Object obj = pendingMessageInfo.resolvedPeriodUid;
        if (obj == null) {
            Pair<Object, Long> resolveSeekPosition = resolveSeekPosition(timeline, new SeekPosition(pendingMessageInfo.message.getTimeline(), pendingMessageInfo.message.getWindowIndex(), pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE ? C.TIME_UNSET : C.msToUs(pendingMessageInfo.message.getPositionMs())), false, i10, z10, window, period);
            if (resolveSeekPosition == null) {
                return false;
            }
            pendingMessageInfo.setResolvedPosition(timeline.getIndexOfPeriod(resolveSeekPosition.first), ((Long) resolveSeekPosition.second).longValue(), resolveSeekPosition.first);
            if (pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE) {
                resolvePendingMessageEndOfStreamPosition(timeline, pendingMessageInfo, window, period);
            }
            return true;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        if (indexOfPeriod == -1) {
            return false;
        }
        if (pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE) {
            resolvePendingMessageEndOfStreamPosition(timeline, pendingMessageInfo, window, period);
            return true;
        }
        pendingMessageInfo.resolvedPeriodIndex = indexOfPeriod;
        timeline2.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period);
        if (timeline2.getWindow(period.windowIndex, window).isPlaceholder) {
            Pair<Object, Long> periodPosition = timeline.getPeriodPosition(window, period, timeline.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period).windowIndex, pendingMessageInfo.resolvedPeriodTimeUs + period.getPositionInWindowUs());
            pendingMessageInfo.setResolvedPosition(timeline.getIndexOfPeriod(periodPosition.first), ((Long) periodPosition.second).longValue(), periodPosition.first);
        }
        return true;
    }

    private void resolvePendingMessagePositions(Timeline timeline, Timeline timeline2) {
        if (timeline.isEmpty() && timeline2.isEmpty()) {
            return;
        }
        for (int size = this.pendingMessages.size() - 1; size >= 0; size--) {
            if (!resolvePendingMessagePosition(this.pendingMessages.get(size), timeline, timeline2, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
                this.pendingMessages.get(size).message.markAsProcessed(false);
                this.pendingMessages.remove(size);
            }
        }
        Collections.sort(this.pendingMessages);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.exoplayer2.ExoPlayerImplInternal.PositionUpdateForPlaylistChange resolvePositionForPlaylistChange(com.google.android.exoplayer2.Timeline r21, com.google.android.exoplayer2.PlaybackInfo r22, com.google.android.exoplayer2.ExoPlayerImplInternal.SeekPosition r23, com.google.android.exoplayer2.MediaPeriodQueue r24, int r25, boolean r26, com.google.android.exoplayer2.Timeline.Window r27, com.google.android.exoplayer2.Timeline.Period r28) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlayerImplInternal.resolvePositionForPlaylistChange(com.google.android.exoplayer2.Timeline, com.google.android.exoplayer2.PlaybackInfo, com.google.android.exoplayer2.ExoPlayerImplInternal$SeekPosition, com.google.android.exoplayer2.MediaPeriodQueue, int, boolean, com.google.android.exoplayer2.Timeline$Window, com.google.android.exoplayer2.Timeline$Period):com.google.android.exoplayer2.ExoPlayerImplInternal$PositionUpdateForPlaylistChange");
    }

    private static Pair<Object, Long> resolveSeekPosition(Timeline timeline, SeekPosition seekPosition, boolean z10, int i10, boolean z11, Timeline.Window window, Timeline.Period period) {
        Pair<Object, Long> periodPosition;
        Object resolveSubsequentPeriod;
        Timeline timeline2 = seekPosition.timeline;
        if (timeline.isEmpty()) {
            return null;
        }
        Timeline timeline3 = timeline2.isEmpty() ? timeline : timeline2;
        try {
            periodPosition = timeline3.getPeriodPosition(window, period, seekPosition.windowIndex, seekPosition.windowPositionUs);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (timeline.equals(timeline3)) {
            return periodPosition;
        }
        if (timeline.getIndexOfPeriod(periodPosition.first) != -1) {
            timeline3.getPeriodByUid(periodPosition.first, period);
            return timeline3.getWindow(period.windowIndex, window).isPlaceholder ? timeline.getPeriodPosition(window, period, timeline.getPeriodByUid(periodPosition.first, period).windowIndex, seekPosition.windowPositionUs) : periodPosition;
        }
        if (z10 && (resolveSubsequentPeriod = resolveSubsequentPeriod(window, period, i10, z11, periodPosition.first, timeline3, timeline)) != null) {
            return timeline.getPeriodPosition(window, period, timeline.getPeriodByUid(resolveSubsequentPeriod, period).windowIndex, C.TIME_UNSET);
        }
        return null;
    }

    public static Object resolveSubsequentPeriod(Timeline.Window window, Timeline.Period period, int i10, boolean z10, Object obj, Timeline timeline, Timeline timeline2) {
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        int periodCount = timeline.getPeriodCount();
        int i11 = indexOfPeriod;
        int i12 = -1;
        for (int i13 = 0; i13 < periodCount && i12 == -1; i13++) {
            i11 = timeline.getNextPeriodIndex(i11, period, window, i10, z10);
            if (i11 == -1) {
                break;
            }
            i12 = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(i11));
        }
        if (i12 == -1) {
            return null;
        }
        return timeline2.getUidOfPeriod(i12);
    }

    private void scheduleNextWork(long j10, long j11) {
        this.handler.removeMessages(2);
        this.handler.sendEmptyMessageAtTime(2, j10 + j11);
    }

    private void seekToCurrentPosition(boolean z10) throws ExoPlaybackException {
        MediaSource.MediaPeriodId mediaPeriodId = this.queue.getPlayingPeriod().info.f26650id;
        long seekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, this.playbackInfo.positionUs, true, false);
        if (seekToPeriodPosition != this.playbackInfo.positionUs) {
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, seekToPeriodPosition, this.playbackInfo.requestedContentPositionUs);
            if (z10) {
                this.playbackInfoUpdate.setPositionDiscontinuity(4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void seekToInternal(com.google.android.exoplayer2.ExoPlayerImplInternal.SeekPosition r19) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlayerImplInternal.seekToInternal(com.google.android.exoplayer2.ExoPlayerImplInternal$SeekPosition):void");
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j10, boolean z10) throws ExoPlaybackException {
        return seekToPeriodPosition(mediaPeriodId, j10, this.queue.getPlayingPeriod() != this.queue.getReadingPeriod(), z10);
    }

    private void sendMessageInternal(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.getPositionMs() == C.TIME_UNSET) {
            sendMessageToTarget(playerMessage);
        } else if (this.playbackInfo.timeline.isEmpty()) {
            this.pendingMessages.add(new PendingMessageInfo(playerMessage));
        } else {
            PendingMessageInfo pendingMessageInfo = new PendingMessageInfo(playerMessage);
            Timeline timeline = this.playbackInfo.timeline;
            if (resolvePendingMessagePosition(pendingMessageInfo, timeline, timeline, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
                this.pendingMessages.add(pendingMessageInfo);
                Collections.sort(this.pendingMessages);
                return;
            }
            playerMessage.markAsProcessed(false);
        }
    }

    private void sendMessageToTarget(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.getLooper() == this.playbackLooper) {
            deliverMessage(playerMessage);
            int i10 = this.playbackInfo.playbackState;
            if (i10 == 3 || i10 == 2) {
                this.handler.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.handler.obtainMessage(15, playerMessage).sendToTarget();
    }

    private void sendMessageToTargetThread(final PlayerMessage playerMessage) {
        Looper looper = playerMessage.getLooper();
        if (!looper.getThread().isAlive()) {
            Log.w("TAG", "Trying to send message on a dead thread.");
            playerMessage.markAsProcessed(false);
            return;
        }
        this.clock.createHandler(looper, null).post(new Runnable() { // from class: com.google.android.exoplayer2.z
            @Override // java.lang.Runnable
            public final void run() {
                ExoPlayerImplInternal.this.lambda$sendMessageToTargetThread$1(playerMessage);
            }
        });
    }

    private void setAllRendererStreamsFinal(long j10) {
        Renderer[] rendererArr;
        for (Renderer renderer : this.renderers) {
            if (renderer.getStream() != null) {
                setCurrentStreamFinal(renderer, j10);
            }
        }
    }

    private void setCurrentStreamFinal(Renderer renderer, long j10) {
        renderer.setCurrentStreamFinal();
        if (renderer instanceof TextRenderer) {
            ((TextRenderer) renderer).setFinalStreamEndPositionUs(j10);
        }
    }

    private void setForegroundModeInternal(boolean z10, AtomicBoolean atomicBoolean) {
        Renderer[] rendererArr;
        if (this.foregroundMode != z10) {
            this.foregroundMode = z10;
            if (!z10) {
                for (Renderer renderer : this.renderers) {
                    if (!isRendererEnabled(renderer)) {
                        renderer.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void setMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        if (mediaSourceListUpdateMessage.windowIndex != -1) {
            this.pendingInitialSeekPosition = new SeekPosition(new PlaylistTimeline(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), mediaSourceListUpdateMessage.windowIndex, mediaSourceListUpdateMessage.positionUs);
        }
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setMediaSources(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder));
    }

    private void setOffloadSchedulingEnabledInternal(boolean z10) {
        if (z10 == this.offloadSchedulingEnabled) {
            return;
        }
        this.offloadSchedulingEnabled = z10;
        PlaybackInfo playbackInfo = this.playbackInfo;
        int i10 = playbackInfo.playbackState;
        if (!z10 && i10 != 4 && i10 != 1) {
            this.handler.sendEmptyMessage(2);
        } else {
            this.playbackInfo = playbackInfo.copyWithOffloadSchedulingEnabled(z10);
        }
    }

    private void setPauseAtEndOfWindowInternal(boolean z10) throws ExoPlaybackException {
        this.pauseAtEndOfWindow = z10;
        resetPendingPauseAtEndOfPeriod();
        if (!this.pendingPauseAtEndOfPeriod || this.queue.getReadingPeriod() == this.queue.getPlayingPeriod()) {
            return;
        }
        seekToCurrentPosition(true);
        handleLoadingMediaPeriodChanged(false);
    }

    private void setPlayWhenReadyInternal(boolean z10, int i10, boolean z11, int i11) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(z11 ? 1 : 0);
        this.playbackInfoUpdate.setPlayWhenReadyChangeReason(i11);
        this.playbackInfo = this.playbackInfo.copyWithPlayWhenReady(z10, i10);
        this.isRebuffering = false;
        notifyTrackSelectionPlayWhenReadyChanged(z10);
        if (!shouldPlayWhenReady()) {
            stopRenderers();
            updatePlaybackPositions();
            return;
        }
        int i12 = this.playbackInfo.playbackState;
        if (i12 == 3) {
            startRenderers();
            this.handler.sendEmptyMessage(2);
        } else if (i12 == 2) {
            this.handler.sendEmptyMessage(2);
        }
    }

    private void setPlaybackParametersInternal(PlaybackParameters playbackParameters) throws ExoPlaybackException {
        this.mediaClock.setPlaybackParameters(playbackParameters);
        handlePlaybackParameters(this.mediaClock.getPlaybackParameters(), true);
    }

    private void setRepeatModeInternal(int i10) throws ExoPlaybackException {
        this.repeatMode = i10;
        if (!this.queue.updateRepeatMode(this.playbackInfo.timeline, i10)) {
            seekToCurrentPosition(true);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setSeekParametersInternal(SeekParameters seekParameters) {
        this.seekParameters = seekParameters;
    }

    private void setShuffleModeEnabledInternal(boolean z10) throws ExoPlaybackException {
        this.shuffleModeEnabled = z10;
        if (!this.queue.updateShuffleModeEnabled(this.playbackInfo.timeline, z10)) {
            seekToCurrentPosition(true);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setShuffleOrderInternal(ShuffleOrder shuffleOrder) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setShuffleOrder(shuffleOrder));
    }

    private void setState(int i10) {
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playbackState != i10) {
            this.playbackInfo = playbackInfo.copyWithPlaybackState(i10);
        }
    }

    private boolean shouldAdvancePlayingPeriod() {
        MediaPeriodHolder playingPeriod;
        MediaPeriodHolder next;
        return shouldPlayWhenReady() && !this.pendingPauseAtEndOfPeriod && (playingPeriod = this.queue.getPlayingPeriod()) != null && (next = playingPeriod.getNext()) != null && this.rendererPositionUs >= next.getStartPositionRendererTime() && next.allRenderersEnabled;
    }

    private boolean shouldContinueLoading() {
        long periodTime;
        if (isLoadingPossible()) {
            MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
            long totalBufferedDurationUs = getTotalBufferedDurationUs(loadingPeriod.getNextLoadPositionUs());
            if (loadingPeriod == this.queue.getPlayingPeriod()) {
                periodTime = loadingPeriod.toPeriodTime(this.rendererPositionUs);
            } else {
                periodTime = loadingPeriod.toPeriodTime(this.rendererPositionUs) - loadingPeriod.info.startPositionUs;
            }
            return this.loadControl.shouldContinueLoading(periodTime, totalBufferedDurationUs, this.mediaClock.getPlaybackParameters().speed);
        }
        return false;
    }

    private boolean shouldPlayWhenReady() {
        PlaybackInfo playbackInfo = this.playbackInfo;
        return playbackInfo.playWhenReady && playbackInfo.playbackSuppressionReason == 0;
    }

    private boolean shouldTransitionToReadyState(boolean z10) {
        if (this.enabledRendererCount == 0) {
            return isTimelineReady();
        }
        if (z10) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            if (playbackInfo.isLoading) {
                long targetLiveOffsetUs = shouldUseLivePlaybackSpeedControl(playbackInfo.timeline, this.queue.getPlayingPeriod().info.f26650id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : C.TIME_UNSET;
                MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
                return (loadingPeriod.isFullyBuffered() && loadingPeriod.info.isFinal) || (loadingPeriod.info.f26650id.isAd() && !loadingPeriod.prepared) || this.loadControl.shouldStartPlayback(getTotalBufferedDurationUs(), this.mediaClock.getPlaybackParameters().speed, this.isRebuffering, targetLiveOffsetUs);
            }
            return true;
        }
        return false;
    }

    private boolean shouldUseLivePlaybackSpeedControl(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (mediaPeriodId.isAd() || timeline.isEmpty()) {
            return false;
        }
        timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
        if (this.window.isLive()) {
            Timeline.Window window = this.window;
            return window.isDynamic && window.windowStartTimeMs != C.TIME_UNSET;
        }
        return false;
    }

    private static boolean shouldUseRequestedContentPosition(PlaybackInfo playbackInfo, Timeline.Period period, Timeline.Window window) {
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        Timeline timeline = playbackInfo.timeline;
        return mediaPeriodId.isAd() || timeline.isEmpty() || timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, period).windowIndex, window).isPlaceholder;
    }

    private void startRenderers() throws ExoPlaybackException {
        Renderer[] rendererArr;
        this.isRebuffering = false;
        this.mediaClock.start();
        for (Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                renderer.start();
            }
        }
    }

    private void stopInternal(boolean z10, boolean z11) {
        resetInternal(z10 || !this.foregroundMode, false, true, false);
        this.playbackInfoUpdate.incrementPendingOperationAcks(z11 ? 1 : 0);
        this.loadControl.onStopped();
        setState(1);
    }

    private void stopRenderers() throws ExoPlaybackException {
        Renderer[] rendererArr;
        this.mediaClock.stop();
        for (Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                ensureStopped(renderer);
            }
        }
    }

    private void updateIsLoading() {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        boolean z10 = this.shouldContinueLoading || (loadingPeriod != null && loadingPeriod.mediaPeriod.isLoading());
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (z10 != playbackInfo.isLoading) {
            this.playbackInfo = playbackInfo.copyWithIsLoading(z10);
        }
    }

    private void updateLivePlaybackSpeedControl(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline2, MediaSource.MediaPeriodId mediaPeriodId2, long j10) {
        if (!timeline.isEmpty() && shouldUseLivePlaybackSpeedControl(timeline, mediaPeriodId)) {
            timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
            this.livePlaybackSpeedControl.setLiveConfiguration((MediaItem.LiveConfiguration) Util.castNonNull(this.window.liveConfiguration));
            if (j10 != C.TIME_UNSET) {
                this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(getLiveOffsetUs(timeline, mediaPeriodId.periodUid, j10));
                return;
            }
            if (Util.areEqual(timeline2.isEmpty() ? null : timeline2.getWindow(timeline2.getPeriodByUid(mediaPeriodId2.periodUid, this.period).windowIndex, this.window).uid, this.window.uid)) {
                return;
            }
            this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(C.TIME_UNSET);
            return;
        }
        float f10 = this.mediaClock.getPlaybackParameters().speed;
        PlaybackParameters playbackParameters = this.playbackInfo.playbackParameters;
        if (f10 != playbackParameters.speed) {
            this.mediaClock.setPlaybackParameters(playbackParameters);
        }
    }

    private void updateLoadControlTrackSelection(TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
        this.loadControl.onTracksSelected(this.renderers, trackGroupArray, trackSelectorResult.selections);
    }

    private void updatePeriods() throws ExoPlaybackException, IOException {
        if (this.playbackInfo.timeline.isEmpty() || !this.mediaSourceList.isPrepared()) {
            return;
        }
        maybeUpdateLoadingPeriod();
        maybeUpdateReadingPeriod();
        maybeUpdateReadingRenderers();
        maybeUpdatePlayingPeriod();
    }

    private void updatePlaybackPositions() throws ExoPlaybackException {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        long readDiscontinuity = playingPeriod.prepared ? playingPeriod.mediaPeriod.readDiscontinuity() : -9223372036854775807L;
        if (readDiscontinuity != C.TIME_UNSET) {
            resetRendererPosition(readDiscontinuity);
            if (readDiscontinuity != this.playbackInfo.positionUs) {
                PlaybackInfo playbackInfo = this.playbackInfo;
                this.playbackInfo = handlePositionDiscontinuity(playbackInfo.periodId, readDiscontinuity, playbackInfo.requestedContentPositionUs);
                this.playbackInfoUpdate.setPositionDiscontinuity(4);
            }
        } else {
            long syncAndGetPositionUs = this.mediaClock.syncAndGetPositionUs(playingPeriod != this.queue.getReadingPeriod());
            this.rendererPositionUs = syncAndGetPositionUs;
            long periodTime = playingPeriod.toPeriodTime(syncAndGetPositionUs);
            maybeTriggerPendingMessages(this.playbackInfo.positionUs, periodTime);
            this.playbackInfo.positionUs = periodTime;
        }
        this.playbackInfo.bufferedPositionUs = this.queue.getLoadingPeriod().getBufferedPositionUs();
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        if (playbackInfo2.playWhenReady && playbackInfo2.playbackState == 3 && shouldUseLivePlaybackSpeedControl(playbackInfo2.timeline, playbackInfo2.periodId) && this.playbackInfo.playbackParameters.speed == 1.0f) {
            float adjustedPlaybackSpeed = this.livePlaybackSpeedControl.getAdjustedPlaybackSpeed(getCurrentLiveOffsetUs(), getTotalBufferedDurationUs());
            if (this.mediaClock.getPlaybackParameters().speed != adjustedPlaybackSpeed) {
                this.mediaClock.setPlaybackParameters(this.playbackInfo.playbackParameters.withSpeed(adjustedPlaybackSpeed));
                handlePlaybackParameters(this.playbackInfo.playbackParameters, this.mediaClock.getPlaybackParameters().speed, false, false);
            }
        }
    }

    private void updateTrackSelectionPlaybackSpeed(float f10) {
        ExoTrackSelection[] exoTrackSelectionArr;
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlaybackSpeed(f10);
                }
            }
        }
    }

    private synchronized void waitUninterruptibly(kk.n<Boolean> nVar, long j10) {
        long elapsedRealtime = this.clock.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!nVar.get().booleanValue() && j10 > 0) {
            try {
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = elapsedRealtime - this.clock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public void addMediaSources(int i10, List<MediaSourceList.MediaSourceHolder> list, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(18, i10, 0, new MediaSourceListUpdateMessage(list, shuffleOrder, -1, C.TIME_UNSET)).sendToTarget();
    }

    public void experimentalSetForegroundModeTimeoutMs(long j10) {
        this.setForegroundModeTimeoutMs = j10;
    }

    public void experimentalSetOffloadSchedulingEnabled(boolean z10) {
        this.handler.obtainMessage(24, z10 ? 1 : 0, 0).sendToTarget();
    }

    public Looper getPlaybackLooper() {
        return this.playbackLooper;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        MediaPeriodHolder readingPeriod;
        try {
            switch (message.what) {
                case 0:
                    prepareInternal();
                    break;
                case 1:
                    setPlayWhenReadyInternal(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    doSomeWork();
                    break;
                case 3:
                    seekToInternal((SeekPosition) message.obj);
                    break;
                case 4:
                    setPlaybackParametersInternal((PlaybackParameters) message.obj);
                    break;
                case 5:
                    setSeekParametersInternal((SeekParameters) message.obj);
                    break;
                case 6:
                    stopInternal(false, true);
                    break;
                case 7:
                    releaseInternal();
                    return true;
                case 8:
                    handlePeriodPrepared((MediaPeriod) message.obj);
                    break;
                case 9:
                    handleContinueLoadingRequested((MediaPeriod) message.obj);
                    break;
                case 10:
                    reselectTracksInternal();
                    break;
                case 11:
                    setRepeatModeInternal(message.arg1);
                    break;
                case 12:
                    setShuffleModeEnabledInternal(message.arg1 != 0);
                    break;
                case 13:
                    setForegroundModeInternal(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    sendMessageInternal((PlayerMessage) message.obj);
                    break;
                case 15:
                    sendMessageToTargetThread((PlayerMessage) message.obj);
                    break;
                case 16:
                    handlePlaybackParameters((PlaybackParameters) message.obj, false);
                    break;
                case 17:
                    setMediaItemsInternal((MediaSourceListUpdateMessage) message.obj);
                    break;
                case 18:
                    addMediaItemsInternal((MediaSourceListUpdateMessage) message.obj, message.arg1);
                    break;
                case 19:
                    moveMediaItemsInternal((MoveMediaItemsMessage) message.obj);
                    break;
                case 20:
                    removeMediaItemsInternal(message.arg1, message.arg2, (ShuffleOrder) message.obj);
                    break;
                case 21:
                    setShuffleOrderInternal((ShuffleOrder) message.obj);
                    break;
                case 22:
                    mediaSourceListUpdateRequestedInternal();
                    break;
                case 23:
                    setPauseAtEndOfWindowInternal(message.arg1 != 0);
                    break;
                case 24:
                    setOffloadSchedulingEnabledInternal(message.arg1 == 1);
                    break;
                case 25:
                    attemptErrorRecovery((ExoPlaybackException) message.obj);
                    break;
                default:
                    return false;
            }
            maybeNotifyPlaybackInfoChanged();
        } catch (ExoPlaybackException e10) {
            e = e10;
            if (e.type == 1 && (readingPeriod = this.queue.getReadingPeriod()) != null) {
                e = e.copyWithMediaPeriodId(readingPeriod.info.f26650id);
            }
            if (e.isRecoverable && this.pendingRecoverableError == null) {
                Log.w(TAG, "Recoverable playback error", e);
                this.pendingRecoverableError = e;
                Message obtainMessage = this.handler.obtainMessage(25, e);
                obtainMessage.getTarget().sendMessageAtFrontOfQueue(obtainMessage);
            } else {
                ExoPlaybackException exoPlaybackException = this.pendingRecoverableError;
                if (exoPlaybackException != null) {
                    e.addSuppressed(exoPlaybackException);
                    this.pendingRecoverableError = null;
                }
                Log.e(TAG, "Playback error", e);
                stopInternal(true, false);
                this.playbackInfo = this.playbackInfo.copyWithPlaybackError(e);
            }
            maybeNotifyPlaybackInfoChanged();
        } catch (IOException e11) {
            ExoPlaybackException createForSource = ExoPlaybackException.createForSource(e11);
            MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            if (playingPeriod != null) {
                createForSource = createForSource.copyWithMediaPeriodId(playingPeriod.info.f26650id);
            }
            Log.e(TAG, "Playback error", createForSource);
            stopInternal(false, false);
            this.playbackInfo = this.playbackInfo.copyWithPlaybackError(createForSource);
            maybeNotifyPlaybackInfoChanged();
        } catch (RuntimeException e12) {
            ExoPlaybackException createForUnexpected = ExoPlaybackException.createForUnexpected(e12);
            Log.e(TAG, "Playback error", createForUnexpected);
            stopInternal(true, false);
            this.playbackInfo = this.playbackInfo.copyWithPlaybackError(createForUnexpected);
            maybeNotifyPlaybackInfoChanged();
        }
        return true;
    }

    public void moveMediaSources(int i10, int i11, int i12, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(19, new MoveMediaItemsMessage(i10, i11, i12, shuffleOrder)).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.DefaultMediaClock.PlaybackParametersListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(16, playbackParameters).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.MediaSourceList.MediaSourceListInfoRefreshListener
    public void onPlaylistUpdateRequested() {
        this.handler.sendEmptyMessage(22);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(8, mediaPeriod).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        this.handler.sendEmptyMessage(10);
    }

    public void prepare() {
        this.handler.obtainMessage(0).sendToTarget();
    }

    public synchronized boolean release() {
        if (!this.released && this.internalPlaybackThread.isAlive()) {
            this.handler.sendEmptyMessage(7);
            waitUninterruptibly(new kk.n() { // from class: com.google.android.exoplayer2.a0
                @Override // kk.n
                public final Object get() {
                    Boolean lambda$release$0;
                    lambda$release$0 = ExoPlayerImplInternal.this.lambda$release$0();
                    return lambda$release$0;
                }
            }, this.releaseTimeoutMs);
            return this.released;
        }
        return true;
    }

    public void removeMediaSources(int i10, int i11, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(20, i10, i11, shuffleOrder).sendToTarget();
    }

    public void seekTo(Timeline timeline, int i10, long j10) {
        this.handler.obtainMessage(3, new SeekPosition(timeline, i10, j10)).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Sender
    public synchronized void sendMessage(PlayerMessage playerMessage) {
        if (!this.released && this.internalPlaybackThread.isAlive()) {
            this.handler.obtainMessage(14, playerMessage).sendToTarget();
            return;
        }
        Log.w(TAG, "Ignoring messages sent after release.");
        playerMessage.markAsProcessed(false);
    }

    public synchronized boolean setForegroundMode(boolean z10) {
        if (!this.released && this.internalPlaybackThread.isAlive()) {
            if (z10) {
                this.handler.obtainMessage(13, 1, 0).sendToTarget();
                return true;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.handler.obtainMessage(13, 0, 0, atomicBoolean).sendToTarget();
            waitUninterruptibly(new kk.n() { // from class: com.google.android.exoplayer2.b0
                @Override // kk.n
                public final Object get() {
                    return Boolean.valueOf(atomicBoolean.get());
                }
            }, this.setForegroundModeTimeoutMs);
            return atomicBoolean.get();
        }
        return true;
    }

    public void setMediaSources(List<MediaSourceList.MediaSourceHolder> list, int i10, long j10, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(17, new MediaSourceListUpdateMessage(list, shuffleOrder, i10, j10)).sendToTarget();
    }

    public void setPauseAtEndOfWindow(boolean z10) {
        this.handler.obtainMessage(23, z10 ? 1 : 0, 0).sendToTarget();
    }

    public void setPlayWhenReady(boolean z10, int i10) {
        this.handler.obtainMessage(1, z10 ? 1 : 0, i10).sendToTarget();
    }

    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(4, playbackParameters).sendToTarget();
    }

    public void setRepeatMode(int i10) {
        this.handler.obtainMessage(11, i10, 0).sendToTarget();
    }

    public void setSeekParameters(SeekParameters seekParameters) {
        this.handler.obtainMessage(5, seekParameters).sendToTarget();
    }

    public void setShuffleModeEnabled(boolean z10) {
        this.handler.obtainMessage(12, z10 ? 1 : 0, 0).sendToTarget();
    }

    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(21, shuffleOrder).sendToTarget();
    }

    public void stop() {
        this.handler.obtainMessage(6).sendToTarget();
    }

    private void enableRenderers(boolean[] zArr) throws ExoPlaybackException {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        for (int i10 = 0; i10 < this.renderers.length; i10++) {
            if (!trackSelectorResult.isRendererEnabled(i10)) {
                this.renderers[i10].reset();
            }
        }
        for (int i11 = 0; i11 < this.renderers.length; i11++) {
            if (trackSelectorResult.isRendererEnabled(i11)) {
                enableRenderer(i11, zArr[i11]);
            }
        }
        readingPeriod.allRenderersEnabled = true;
    }

    private long getTotalBufferedDurationUs(long j10) {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        if (loadingPeriod == null) {
            return 0L;
        }
        return Math.max(0L, j10 - loadingPeriod.toPeriodTime(this.rendererPositionUs));
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, float f10, boolean z10, boolean z11) throws ExoPlaybackException {
        Renderer[] rendererArr;
        if (z10) {
            if (z11) {
                this.playbackInfoUpdate.incrementPendingOperationAcks(1);
            }
            this.playbackInfo = this.playbackInfo.copyWithPlaybackParameters(playbackParameters);
        }
        updateTrackSelectionPlaybackSpeed(playbackParameters.speed);
        for (Renderer renderer : this.renderers) {
            if (renderer != null) {
                renderer.setPlaybackSpeed(f10, playbackParameters.speed);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(9, mediaPeriod).sendToTarget();
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j10, boolean z10, boolean z11) throws ExoPlaybackException {
        stopRenderers();
        this.isRebuffering = false;
        if (z11 || this.playbackInfo.playbackState == 3) {
            setState(2);
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        MediaPeriodHolder mediaPeriodHolder = playingPeriod;
        while (mediaPeriodHolder != null && !mediaPeriodId.equals(mediaPeriodHolder.info.f26650id)) {
            mediaPeriodHolder = mediaPeriodHolder.getNext();
        }
        if (z10 || playingPeriod != mediaPeriodHolder || (mediaPeriodHolder != null && mediaPeriodHolder.toRendererTime(j10) < 0)) {
            for (Renderer renderer : this.renderers) {
                disableRenderer(renderer);
            }
            if (mediaPeriodHolder != null) {
                while (this.queue.getPlayingPeriod() != mediaPeriodHolder) {
                    this.queue.advancePlayingPeriod();
                }
                this.queue.removeAfter(mediaPeriodHolder);
                mediaPeriodHolder.setRendererOffset(0L);
                enableRenderers();
            }
        }
        if (mediaPeriodHolder != null) {
            this.queue.removeAfter(mediaPeriodHolder);
            if (!mediaPeriodHolder.prepared) {
                mediaPeriodHolder.info = mediaPeriodHolder.info.copyWithStartPositionUs(j10);
            } else {
                long j11 = mediaPeriodHolder.info.durationUs;
                if (j11 != C.TIME_UNSET && j10 >= j11) {
                    j10 = Math.max(0L, j11 - 1);
                }
                if (mediaPeriodHolder.hasEnabledTracks) {
                    long seekToUs = mediaPeriodHolder.mediaPeriod.seekToUs(j10);
                    mediaPeriodHolder.mediaPeriod.discardBuffer(seekToUs - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
                    j10 = seekToUs;
                }
            }
            resetRendererPosition(j10);
            maybeContinueLoading();
        } else {
            this.queue.clear();
            resetRendererPosition(j10);
        }
        handleLoadingMediaPeriodChanged(false);
        this.handler.sendEmptyMessage(2);
        return j10;
    }
}
