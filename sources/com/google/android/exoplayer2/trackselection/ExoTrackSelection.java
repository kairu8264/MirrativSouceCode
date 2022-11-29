package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.util.List;

/* loaded from: classes3.dex */
public interface ExoTrackSelection extends TrackSelection {

    /* loaded from: classes3.dex */
    public static final class Definition {
        public final Object data;
        public final TrackGroup group;
        public final int reason;
        public final int[] tracks;

        public Definition(TrackGroup trackGroup, int... iArr) {
            this(trackGroup, iArr, 0, null);
        }

        public Definition(TrackGroup trackGroup, int[] iArr, int i10, Object obj) {
            this.group = trackGroup;
            this.tracks = iArr;
            this.reason = i10;
            this.data = obj;
        }
    }

    /* loaded from: classes3.dex */
    public interface Factory {
        ExoTrackSelection[] createTrackSelections(Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline);
    }

    boolean blacklist(int i10, long j10);

    void disable();

    void enable();

    int evaluateQueueSize(long j10, List<? extends MediaChunk> list);

    Format getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    Object getSelectionData();

    int getSelectionReason();

    default void onDiscontinuity() {
    }

    default void onPlayWhenReadyChanged(boolean z10) {
    }

    void onPlaybackSpeed(float f10);

    default void onRebuffer() {
    }

    default boolean shouldCancelChunkLoad(long j10, Chunk chunk, List<? extends MediaChunk> list) {
        return false;
    }

    void updateSelectedTrack(long j10, long j11, long j12, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr);
}
