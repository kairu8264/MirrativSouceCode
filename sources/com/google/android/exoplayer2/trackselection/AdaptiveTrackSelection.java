package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lk.e0;
import lk.f0;
import lk.r;
import lk.w;

/* loaded from: classes3.dex */
public class AdaptiveTrackSelection extends BaseTrackSelection {
    public static final float DEFAULT_BANDWIDTH_FRACTION = 0.7f;
    public static final float DEFAULT_BUFFERED_FRACTION_TO_LIVE_EDGE_FOR_QUALITY_INCREASE = 0.75f;
    public static final int DEFAULT_MAX_DURATION_FOR_QUALITY_DECREASE_MS = 25000;
    public static final int DEFAULT_MIN_DURATION_FOR_QUALITY_INCREASE_MS = 10000;
    public static final int DEFAULT_MIN_DURATION_TO_RETAIN_AFTER_DISCARD_MS = 25000;
    private static final long MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS = 1000;
    private final r<AdaptationCheckpoint> adaptationCheckpoints;
    private final float bandwidthFraction;
    private final BandwidthMeter bandwidthMeter;
    private final float bufferedFractionToLiveEdgeForQualityIncrease;
    private final Clock clock;
    private MediaChunk lastBufferEvaluationMediaChunk;
    private long lastBufferEvaluationMs;
    private final long maxDurationForQualityDecreaseUs;
    private final long minDurationForQualityIncreaseUs;
    private final long minDurationToRetainAfterDiscardUs;
    private float playbackSpeed;
    private int reason;
    private int selectedIndex;

    /* loaded from: classes3.dex */
    public static final class AdaptationCheckpoint {
        public final long allocatedBandwidth;
        public final long totalBandwidth;

        public AdaptationCheckpoint(long j10, long j11) {
            this.totalBandwidth = j10;
            this.allocatedBandwidth = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AdaptationCheckpoint) {
                AdaptationCheckpoint adaptationCheckpoint = (AdaptationCheckpoint) obj;
                return this.totalBandwidth == adaptationCheckpoint.totalBandwidth && this.allocatedBandwidth == adaptationCheckpoint.allocatedBandwidth;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.totalBandwidth) * 31) + ((int) this.allocatedBandwidth);
        }
    }

    /* loaded from: classes3.dex */
    public static class Factory implements ExoTrackSelection.Factory {
        private final float bandwidthFraction;
        private final float bufferedFractionToLiveEdgeForQualityIncrease;
        private final Clock clock;
        private final int maxDurationForQualityDecreaseMs;
        private final int minDurationForQualityIncreaseMs;
        private final int minDurationToRetainAfterDiscardMs;

        public Factory() {
            this(10000, 25000, 25000, 0.7f, 0.75f, Clock.DEFAULT);
        }

        public AdaptiveTrackSelection createAdaptiveTrackSelection(TrackGroup trackGroup, BandwidthMeter bandwidthMeter, int[] iArr, r<AdaptationCheckpoint> rVar) {
            return new AdaptiveTrackSelection(trackGroup, iArr, bandwidthMeter, this.minDurationForQualityIncreaseMs, this.maxDurationForQualityDecreaseMs, this.minDurationToRetainAfterDiscardMs, this.bandwidthFraction, this.bufferedFractionToLiveEdgeForQualityIncrease, rVar, this.clock);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
        public final ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            ExoTrackSelection createAdaptiveTrackSelection;
            r adaptationCheckpoints = AdaptiveTrackSelection.getAdaptationCheckpoints(definitionArr);
            ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
            for (int i10 = 0; i10 < definitionArr.length; i10++) {
                ExoTrackSelection.Definition definition = definitionArr[i10];
                if (definition != null) {
                    int[] iArr = definition.tracks;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            createAdaptiveTrackSelection = new FixedTrackSelection(definition.group, iArr[0], definition.reason, definition.data);
                        } else {
                            createAdaptiveTrackSelection = createAdaptiveTrackSelection(definition.group, bandwidthMeter, iArr, (r) adaptationCheckpoints.get(i10));
                        }
                        exoTrackSelectionArr[i10] = createAdaptiveTrackSelection;
                    }
                }
            }
            return exoTrackSelectionArr;
        }

        public Factory(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, f10, 0.75f, Clock.DEFAULT);
        }

        public Factory(int i10, int i11, int i12, float f10, float f11, Clock clock) {
            this.minDurationForQualityIncreaseMs = i10;
            this.maxDurationForQualityDecreaseMs = i11;
            this.minDurationToRetainAfterDiscardMs = i12;
            this.bandwidthFraction = f10;
            this.bufferedFractionToLiveEdgeForQualityIncrease = f11;
            this.clock = clock;
        }
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter) {
        this(trackGroup, iArr, bandwidthMeter, 10000L, 25000L, 25000L, 0.7f, 0.75f, r.A(), Clock.DEFAULT);
    }

    private static void addCheckpoint(List<r.a<AdaptationCheckpoint>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            r.a<AdaptationCheckpoint> aVar = list.get(i10);
            if (aVar != null) {
                aVar.d(new AdaptationCheckpoint(j10, jArr[i10]));
            }
        }
    }

    private int determineIdealSelectedIndex(long j10) {
        long allocatedBandwidth = getAllocatedBandwidth();
        int i10 = 0;
        for (int i11 = 0; i11 < this.length; i11++) {
            if (j10 == Long.MIN_VALUE || !isBlacklisted(i11, j10)) {
                Format format = getFormat(i11);
                if (canSelectFormat(format, format.bitrate, this.playbackSpeed, allocatedBandwidth)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r<r<AdaptationCheckpoint>> getAdaptationCheckpoints(ExoTrackSelection.Definition[] definitionArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < definitionArr.length; i10++) {
            if (definitionArr[i10] != null && definitionArr[i10].tracks.length > 1) {
                r.a s10 = r.s();
                s10.d(new AdaptationCheckpoint(0L, 0L));
                arrayList.add(s10);
            } else {
                arrayList.add(null);
            }
        }
        long[][] sortedTrackBitrates = getSortedTrackBitrates(definitionArr);
        int[] iArr = new int[sortedTrackBitrates.length];
        long[] jArr = new long[sortedTrackBitrates.length];
        for (int i11 = 0; i11 < sortedTrackBitrates.length; i11++) {
            jArr[i11] = sortedTrackBitrates[i11].length == 0 ? 0L : sortedTrackBitrates[i11][0];
        }
        addCheckpoint(arrayList, jArr);
        r<Integer> switchOrder = getSwitchOrder(sortedTrackBitrates);
        for (int i12 = 0; i12 < switchOrder.size(); i12++) {
            int intValue = switchOrder.get(i12).intValue();
            int i13 = iArr[intValue] + 1;
            iArr[intValue] = i13;
            jArr[intValue] = sortedTrackBitrates[intValue][i13];
            addCheckpoint(arrayList, jArr);
        }
        for (int i14 = 0; i14 < definitionArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                jArr[i14] = jArr[i14] * 2;
            }
        }
        addCheckpoint(arrayList, jArr);
        r.a s11 = r.s();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            r.a aVar = (r.a) arrayList.get(i15);
            s11.d(aVar == null ? r.A() : aVar.e());
        }
        return s11.e();
    }

    private long getAllocatedBandwidth() {
        long j10;
        long bitrateEstimate = ((float) this.bandwidthMeter.getBitrateEstimate()) * this.bandwidthFraction;
        if (this.adaptationCheckpoints.isEmpty()) {
            return bitrateEstimate;
        }
        int i10 = 1;
        while (i10 < this.adaptationCheckpoints.size() - 1 && this.adaptationCheckpoints.get(i10).totalBandwidth < bitrateEstimate) {
            i10++;
        }
        AdaptationCheckpoint adaptationCheckpoint = this.adaptationCheckpoints.get(i10 - 1);
        AdaptationCheckpoint adaptationCheckpoint2 = this.adaptationCheckpoints.get(i10);
        long j11 = adaptationCheckpoint.totalBandwidth;
        float f10 = ((float) (bitrateEstimate - j11)) / ((float) (adaptationCheckpoint2.totalBandwidth - j11));
        return adaptationCheckpoint.allocatedBandwidth + (f10 * ((float) (adaptationCheckpoint2.allocatedBandwidth - j10)));
    }

    private static long[][] getSortedTrackBitrates(ExoTrackSelection.Definition[] definitionArr) {
        int[] iArr;
        long[][] jArr = new long[definitionArr.length];
        for (int i10 = 0; i10 < definitionArr.length; i10++) {
            ExoTrackSelection.Definition definition = definitionArr[i10];
            if (definition == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[definition.tracks.length];
                int i11 = 0;
                while (true) {
                    if (i11 >= definition.tracks.length) {
                        break;
                    }
                    jArr[i10][i11] = definition.group.getFormat(iArr[i11]).bitrate;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    private static r<Integer> getSwitchOrder(long[][] jArr) {
        e0 e10 = f0.c().a().e();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (jArr[i10].length > 1) {
                int length = jArr[i10].length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    double d10 = 0.0d;
                    if (i11 >= jArr[i10].length) {
                        break;
                    }
                    if (jArr[i10][i11] != -1) {
                        d10 = Math.log(jArr[i10][i11]);
                    }
                    dArr[i11] = d10;
                    i11++;
                }
                int i12 = length - 1;
                double d11 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d12 = dArr[i13];
                    i13++;
                    e10.put(Double.valueOf(d11 == 0.0d ? 1.0d : (((d12 + dArr[i13]) * 0.5d) - dArr[0]) / d11), Integer.valueOf(i10));
                }
            }
        }
        return r.u(e10.values());
    }

    private long minDurationForQualityIncreaseUs(long j10) {
        if (j10 != C.TIME_UNSET && j10 <= this.minDurationForQualityIncreaseUs) {
            return ((float) j10) * this.bufferedFractionToLiveEdgeForQualityIncrease;
        }
        return this.minDurationForQualityIncreaseUs;
    }

    public boolean canSelectFormat(Format format, int i10, float f10, long j10) {
        return ((long) Math.round(((float) i10) * f10)) <= j10;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void disable() {
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void enable() {
        this.lastBufferEvaluationMs = C.TIME_UNSET;
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j10, List<? extends MediaChunk> list) {
        int i10;
        int i11;
        long elapsedRealtime = this.clock.elapsedRealtime();
        if (!shouldEvaluateQueueSize(elapsedRealtime, list)) {
            return list.size();
        }
        this.lastBufferEvaluationMs = elapsedRealtime;
        this.lastBufferEvaluationMediaChunk = list.isEmpty() ? null : (MediaChunk) w.c(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(list.get(size - 1).startTimeUs - j10, this.playbackSpeed);
        long minDurationToRetainAfterDiscardUs = getMinDurationToRetainAfterDiscardUs();
        if (playoutDurationForMediaDuration < minDurationToRetainAfterDiscardUs) {
            return size;
        }
        Format format = getFormat(determineIdealSelectedIndex(elapsedRealtime));
        for (int i12 = 0; i12 < size; i12++) {
            MediaChunk mediaChunk = list.get(i12);
            Format format2 = mediaChunk.trackFormat;
            if (Util.getPlayoutDurationForMediaDuration(mediaChunk.startTimeUs - j10, this.playbackSpeed) >= minDurationToRetainAfterDiscardUs && format2.bitrate < format.bitrate && (i10 = format2.height) != -1 && i10 < 720 && (i11 = format2.width) != -1 && i11 < 1280 && i10 < format.height) {
                return i12;
            }
        }
        return size;
    }

    public long getMinDurationToRetainAfterDiscardUs() {
        return this.minDurationToRetainAfterDiscardUs;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public Object getSelectionData() {
        return null;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.reason;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f10) {
        this.playbackSpeed = f10;
    }

    public boolean shouldEvaluateQueueSize(long j10, List<? extends MediaChunk> list) {
        long j11 = this.lastBufferEvaluationMs;
        return j11 == C.TIME_UNSET || j10 - j11 >= 1000 || !(list.isEmpty() || ((MediaChunk) w.c(list)).equals(this.lastBufferEvaluationMediaChunk));
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j10, long j11, long j12, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        long elapsedRealtime = this.clock.elapsedRealtime();
        int i10 = this.reason;
        if (i10 == 0) {
            this.reason = 1;
            this.selectedIndex = determineIdealSelectedIndex(elapsedRealtime);
            return;
        }
        int i11 = this.selectedIndex;
        int indexOf = list.isEmpty() ? -1 : indexOf(((MediaChunk) w.c(list)).trackFormat);
        if (indexOf != -1) {
            i10 = ((MediaChunk) w.c(list)).trackSelectionReason;
            i11 = indexOf;
        }
        int determineIdealSelectedIndex = determineIdealSelectedIndex(elapsedRealtime);
        if (!isBlacklisted(i11, elapsedRealtime)) {
            Format format = getFormat(i11);
            Format format2 = getFormat(determineIdealSelectedIndex);
            if ((format2.bitrate > format.bitrate && j11 < minDurationForQualityIncreaseUs(j12)) || (format2.bitrate < format.bitrate && j11 >= this.maxDurationForQualityDecreaseUs)) {
                determineIdealSelectedIndex = i11;
            }
        }
        if (determineIdealSelectedIndex != i11) {
            i10 = 3;
        }
        this.reason = i10;
        this.selectedIndex = determineIdealSelectedIndex;
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter, long j10, long j11, long j12, float f10, float f11, List<AdaptationCheckpoint> list, Clock clock) {
        super(trackGroup, iArr);
        this.bandwidthMeter = bandwidthMeter;
        this.minDurationForQualityIncreaseUs = j10 * 1000;
        this.maxDurationForQualityDecreaseUs = j11 * 1000;
        this.minDurationToRetainAfterDiscardUs = j12 * 1000;
        this.bandwidthFraction = f10;
        this.bufferedFractionToLiveEdgeForQualityIncrease = f11;
        this.adaptationCheckpoints = r.u(list);
        this.clock = clock;
        this.playbackSpeed = 1.0f;
        this.reason = 0;
        this.lastBufferEvaluationMs = C.TIME_UNSET;
    }
}
