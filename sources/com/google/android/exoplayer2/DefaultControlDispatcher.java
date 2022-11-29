package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Timeline;
import com.mirrativ.llstream.decoder.PacketJitterConfig;

/* loaded from: classes3.dex */
public class DefaultControlDispatcher implements ControlDispatcher {
    public static final int DEFAULT_FAST_FORWARD_MS = 15000;
    public static final int DEFAULT_REWIND_MS = 5000;
    private static final int MAX_POSITION_FOR_SEEK_TO_PREVIOUS = 3000;
    private long fastForwardIncrementMs;
    private long rewindIncrementMs;
    private final Timeline.Window window;

    public DefaultControlDispatcher() {
        this(15000L, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }

    private static void seekToOffset(Player player, long j10) {
        long currentPosition = player.getCurrentPosition() + j10;
        long duration = player.getDuration();
        if (duration != C.TIME_UNSET) {
            currentPosition = Math.min(currentPosition, duration);
        }
        player.seekTo(player.getCurrentWindowIndex(), Math.max(currentPosition, 0L));
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchFastForward(Player player) {
        if (isFastForwardEnabled() && player.isCurrentWindowSeekable()) {
            seekToOffset(player, this.fastForwardIncrementMs);
            return true;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchNext(Player player) {
        Timeline currentTimeline = player.getCurrentTimeline();
        if (!currentTimeline.isEmpty() && !player.isPlayingAd()) {
            int currentWindowIndex = player.getCurrentWindowIndex();
            currentTimeline.getWindow(currentWindowIndex, this.window);
            int nextWindowIndex = player.getNextWindowIndex();
            if (nextWindowIndex != -1) {
                player.seekTo(nextWindowIndex, C.TIME_UNSET);
            } else if (this.window.isLive() && this.window.isDynamic) {
                player.seekTo(currentWindowIndex, C.TIME_UNSET);
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchPrepare(Player player) {
        player.prepare();
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchPrevious(Player player) {
        Timeline currentTimeline = player.getCurrentTimeline();
        if (!currentTimeline.isEmpty() && !player.isPlayingAd()) {
            int currentWindowIndex = player.getCurrentWindowIndex();
            currentTimeline.getWindow(currentWindowIndex, this.window);
            int previousWindowIndex = player.getPreviousWindowIndex();
            boolean z10 = this.window.isLive() && !this.window.isSeekable;
            if (previousWindowIndex != -1 && (player.getCurrentPosition() <= PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS || z10)) {
                player.seekTo(previousWindowIndex, C.TIME_UNSET);
            } else if (!z10) {
                player.seekTo(currentWindowIndex, 0L);
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchRewind(Player player) {
        if (isRewindEnabled() && player.isCurrentWindowSeekable()) {
            seekToOffset(player, -this.rewindIncrementMs);
            return true;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchSeekTo(Player player, int i10, long j10) {
        player.seekTo(i10, j10);
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchSetPlayWhenReady(Player player, boolean z10) {
        player.setPlayWhenReady(z10);
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchSetPlaybackParameters(Player player, PlaybackParameters playbackParameters) {
        player.setPlaybackParameters(playbackParameters);
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchSetRepeatMode(Player player, int i10) {
        player.setRepeatMode(i10);
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchSetShuffleModeEnabled(Player player, boolean z10) {
        player.setShuffleModeEnabled(z10);
        return true;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchStop(Player player, boolean z10) {
        player.stop(z10);
        return true;
    }

    public long getFastForwardIncrementMs() {
        return this.fastForwardIncrementMs;
    }

    public long getRewindIncrementMs() {
        return this.rewindIncrementMs;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean isFastForwardEnabled() {
        return this.fastForwardIncrementMs > 0;
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean isRewindEnabled() {
        return this.rewindIncrementMs > 0;
    }

    @Deprecated
    public void setFastForwardIncrementMs(long j10) {
        this.fastForwardIncrementMs = j10;
    }

    @Deprecated
    public void setRewindIncrementMs(long j10) {
        this.rewindIncrementMs = j10;
    }

    public DefaultControlDispatcher(long j10, long j11) {
        this.fastForwardIncrementMs = j10;
        this.rewindIncrementMs = j11;
        this.window = new Timeline.Window();
    }
}
