package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class SilenceMediaSource extends BaseMediaSource {
    private static final int CHANNEL_COUNT = 2;
    private static final Format FORMAT;
    public static final String MEDIA_ID = "SilenceMediaSource";
    private static final MediaItem MEDIA_ITEM;
    private static final int PCM_ENCODING = 2;
    private static final int SAMPLE_RATE_HZ = 44100;
    private static final byte[] SILENCE_SAMPLE;
    private final long durationUs;
    private final MediaItem mediaItem;

    /* loaded from: classes3.dex */
    public static final class Factory {
        private long durationUs;
        private Object tag;

        public SilenceMediaSource createMediaSource() {
            Assertions.checkState(this.durationUs > 0);
            return new SilenceMediaSource(this.durationUs, SilenceMediaSource.MEDIA_ITEM.buildUpon().setTag(this.tag).build());
        }

        public Factory setDurationUs(long j10) {
            this.durationUs = j10;
            return this;
        }

        public Factory setTag(Object obj) {
            this.tag = obj;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SilenceMediaPeriod implements MediaPeriod {
        private static final TrackGroupArray TRACKS = new TrackGroupArray(new TrackGroup(SilenceMediaSource.FORMAT));
        private final long durationUs;
        private final ArrayList<SampleStream> sampleStreams = new ArrayList<>();

        public SilenceMediaPeriod(long j10) {
            this.durationUs = j10;
        }

        private long constrainSeekPosition(long j10) {
            return Util.constrainValue(j10, 0L, this.durationUs);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean continueLoading(long j10) {
            return false;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void discardBuffer(long j10, boolean z10) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
            return constrainSeekPosition(j10);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return TRACKS;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void maybeThrowPrepareError() {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void prepare(MediaPeriod.Callback callback, long j10) {
            callback.onPrepared(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long readDiscontinuity() {
            return C.TIME_UNSET;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public void reevaluateBuffer(long j10) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long seekToUs(long j10) {
            long constrainSeekPosition = constrainSeekPosition(j10);
            for (int i10 = 0; i10 < this.sampleStreams.size(); i10++) {
                ((SilenceSampleStream) this.sampleStreams.get(i10)).seekTo(constrainSeekPosition);
            }
            return constrainSeekPosition;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10) {
            long constrainSeekPosition = constrainSeekPosition(j10);
            for (int i10 = 0; i10 < exoTrackSelectionArr.length; i10++) {
                if (sampleStreamArr[i10] != null && (exoTrackSelectionArr[i10] == null || !zArr[i10])) {
                    this.sampleStreams.remove(sampleStreamArr[i10]);
                    sampleStreamArr[i10] = null;
                }
                if (sampleStreamArr[i10] == null && exoTrackSelectionArr[i10] != null) {
                    SilenceSampleStream silenceSampleStream = new SilenceSampleStream(this.durationUs);
                    silenceSampleStream.seekTo(constrainSeekPosition);
                    this.sampleStreams.add(silenceSampleStream);
                    sampleStreamArr[i10] = silenceSampleStream;
                    zArr2[i10] = true;
                }
            }
            return constrainSeekPosition;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SilenceSampleStream implements SampleStream {
        private final long durationBytes;
        private long positionBytes;
        private boolean sentFormat;

        public SilenceSampleStream(long j10) {
            this.durationBytes = SilenceMediaSource.getAudioByteCount(j10);
            seekTo(0L);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return true;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z10) {
            if (!this.sentFormat || z10) {
                formatHolder.format = SilenceMediaSource.FORMAT;
                this.sentFormat = true;
                return -5;
            }
            long j10 = this.durationBytes;
            long j11 = this.positionBytes;
            long j12 = j10 - j11;
            if (j12 != 0) {
                decoderInputBuffer.timeUs = SilenceMediaSource.getAudioPositionUs(j11);
                decoderInputBuffer.addFlag(1);
                if (decoderInputBuffer.isFlagsOnly()) {
                    return -4;
                }
                int min = (int) Math.min(SilenceMediaSource.SILENCE_SAMPLE.length, j12);
                decoderInputBuffer.ensureSpaceForWrite(min);
                decoderInputBuffer.data.put(SilenceMediaSource.SILENCE_SAMPLE, 0, min);
                this.positionBytes += min;
                return -4;
            }
            decoderInputBuffer.addFlag(4);
            return -4;
        }

        public void seekTo(long j10) {
            this.positionBytes = Util.constrainValue(SilenceMediaSource.getAudioByteCount(j10), 0L, this.durationBytes);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j10) {
            long j11 = this.positionBytes;
            seekTo(j10);
            return (int) ((this.positionBytes - j11) / SilenceMediaSource.SILENCE_SAMPLE.length);
        }
    }

    static {
        Format build = new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_RAW).setChannelCount(2).setSampleRate(44100).setPcmEncoding(2).build();
        FORMAT = build;
        MEDIA_ITEM = new MediaItem.Builder().setMediaId(MEDIA_ID).setUri(Uri.EMPTY).setMimeType(build.sampleMimeType).build();
        SILENCE_SAMPLE = new byte[Util.getPcmFrameSize(2, 2) * 1024];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getAudioByteCount(long j10) {
        return Util.getPcmFrameSize(2, 2) * ((j10 * 44100) / 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getAudioPositionUs(long j10) {
        return ((j10 / Util.getPcmFrameSize(2, 2)) * 1000000) / 44100;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        return new SilenceMediaPeriod(this.durationUs);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    @Deprecated
    public Object getTag() {
        return ((MediaItem.PlaybackProperties) Assertions.checkNotNull(this.mediaItem.playbackProperties)).tag;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(TransferListener transferListener) {
        refreshSourceInfo(new SinglePeriodTimeline(this.durationUs, true, false, false, (Object) null, this.mediaItem));
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
    }

    public SilenceMediaSource(long j10) {
        this(j10, MEDIA_ITEM);
    }

    private SilenceMediaSource(long j10, MediaItem mediaItem) {
        Assertions.checkArgument(j10 >= 0);
        this.durationUs = j10;
        this.mediaItem = mediaItem;
    }
}
