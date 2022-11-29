package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class BinarySearchSeeker {
    private static final long MAX_SKIP_BYTES = 262144;
    private final int minimumSearchRange;
    public final BinarySearchSeekMap seekMap;
    public SeekOperationParams seekOperationParams;
    public final TimestampSeeker timestampSeeker;

    /* loaded from: classes3.dex */
    public static class BinarySearchSeekMap implements SeekMap {
        private final long approxBytesPerFrame;
        private final long ceilingBytePosition;
        private final long ceilingTimePosition;
        private final long durationUs;
        private final long floorBytePosition;
        private final long floorTimePosition;
        private final SeekTimestampConverter seekTimestampConverter;

        public BinarySearchSeekMap(SeekTimestampConverter seekTimestampConverter, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.seekTimestampConverter = seekTimestampConverter;
            this.durationUs = j10;
            this.floorTimePosition = j11;
            this.ceilingTimePosition = j12;
            this.floorBytePosition = j13;
            this.ceilingBytePosition = j14;
            this.approxBytesPerFrame = j15;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j10) {
            return new SeekMap.SeekPoints(new SeekPoint(j10, SeekOperationParams.calculateNextSearchBytePosition(this.seekTimestampConverter.timeUsToTargetTime(j10), this.floorTimePosition, this.ceilingTimePosition, this.floorBytePosition, this.ceilingBytePosition, this.approxBytesPerFrame)));
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        public long timeUsToTargetTime(long j10) {
            return this.seekTimestampConverter.timeUsToTargetTime(j10);
        }
    }

    /* loaded from: classes3.dex */
    public static final class DefaultSeekTimestampConverter implements SeekTimestampConverter {
        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
        public long timeUsToTargetTime(long j10) {
            return j10;
        }
    }

    /* loaded from: classes3.dex */
    public static class SeekOperationParams {
        private final long approxBytesPerFrame;
        private long ceilingBytePosition;
        private long ceilingTimePosition;
        private long floorBytePosition;
        private long floorTimePosition;
        private long nextSearchBytePosition;
        private final long seekTimeUs;
        private final long targetTimePosition;

        public SeekOperationParams(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.seekTimeUs = j10;
            this.targetTimePosition = j11;
            this.floorTimePosition = j12;
            this.ceilingTimePosition = j13;
            this.floorBytePosition = j14;
            this.ceilingBytePosition = j15;
            this.approxBytesPerFrame = j16;
            this.nextSearchBytePosition = calculateNextSearchBytePosition(j11, j12, j13, j14, j15, j16);
        }

        public static long calculateNextSearchBytePosition(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = ((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11)));
            return Util.constrainValue(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getCeilingBytePosition() {
            return this.ceilingBytePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getFloorBytePosition() {
            return this.floorBytePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getNextSearchBytePosition() {
            return this.nextSearchBytePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getSeekTimeUs() {
            return this.seekTimeUs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getTargetTimePosition() {
            return this.targetTimePosition;
        }

        private void updateNextSearchBytePosition() {
            this.nextSearchBytePosition = calculateNextSearchBytePosition(this.targetTimePosition, this.floorTimePosition, this.ceilingTimePosition, this.floorBytePosition, this.ceilingBytePosition, this.approxBytesPerFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateSeekCeiling(long j10, long j11) {
            this.ceilingTimePosition = j10;
            this.ceilingBytePosition = j11;
            updateNextSearchBytePosition();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateSeekFloor(long j10, long j11) {
            this.floorTimePosition = j10;
            this.floorBytePosition = j11;
            updateNextSearchBytePosition();
        }
    }

    /* loaded from: classes3.dex */
    public interface SeekTimestampConverter {
        long timeUsToTargetTime(long j10);
    }

    /* loaded from: classes3.dex */
    public static final class TimestampSearchResult {
        public static final TimestampSearchResult NO_TIMESTAMP_IN_RANGE_RESULT = new TimestampSearchResult(-3, C.TIME_UNSET, -1);
        public static final int TYPE_NO_TIMESTAMP = -3;
        public static final int TYPE_POSITION_OVERESTIMATED = -1;
        public static final int TYPE_POSITION_UNDERESTIMATED = -2;
        public static final int TYPE_TARGET_TIMESTAMP_FOUND = 0;
        private final long bytePositionToUpdate;
        private final long timestampToUpdate;
        private final int type;

        private TimestampSearchResult(int i10, long j10, long j11) {
            this.type = i10;
            this.timestampToUpdate = j10;
            this.bytePositionToUpdate = j11;
        }

        public static TimestampSearchResult overestimatedResult(long j10, long j11) {
            return new TimestampSearchResult(-1, j10, j11);
        }

        public static TimestampSearchResult targetFoundResult(long j10) {
            return new TimestampSearchResult(0, C.TIME_UNSET, j10);
        }

        public static TimestampSearchResult underestimatedResult(long j10, long j11) {
            return new TimestampSearchResult(-2, j10, j11);
        }
    }

    /* loaded from: classes3.dex */
    public interface TimestampSeeker {
        default void onSeekFinished() {
        }

        TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j10) throws IOException;
    }

    public BinarySearchSeeker(SeekTimestampConverter seekTimestampConverter, TimestampSeeker timestampSeeker, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.timestampSeeker = timestampSeeker;
        this.minimumSearchRange = i10;
        this.seekMap = new BinarySearchSeekMap(seekTimestampConverter, j10, j11, j12, j13, j14, j15);
    }

    public SeekOperationParams createSeekParamsForTargetTimeUs(long j10) {
        return new SeekOperationParams(j10, this.seekMap.timeUsToTargetTime(j10), this.seekMap.floorTimePosition, this.seekMap.ceilingTimePosition, this.seekMap.floorBytePosition, this.seekMap.ceilingBytePosition, this.seekMap.approxBytesPerFrame);
    }

    public final SeekMap getSeekMap() {
        return this.seekMap;
    }

    public int handlePendingSeek(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        while (true) {
            SeekOperationParams seekOperationParams = (SeekOperationParams) Assertions.checkStateNotNull(this.seekOperationParams);
            long floorBytePosition = seekOperationParams.getFloorBytePosition();
            long ceilingBytePosition = seekOperationParams.getCeilingBytePosition();
            long nextSearchBytePosition = seekOperationParams.getNextSearchBytePosition();
            if (ceilingBytePosition - floorBytePosition <= this.minimumSearchRange) {
                markSeekOperationFinished(false, floorBytePosition);
                return seekToPosition(extractorInput, floorBytePosition, positionHolder);
            } else if (!skipInputUntilPosition(extractorInput, nextSearchBytePosition)) {
                return seekToPosition(extractorInput, nextSearchBytePosition, positionHolder);
            } else {
                extractorInput.resetPeekPosition();
                TimestampSearchResult searchForTimestamp = this.timestampSeeker.searchForTimestamp(extractorInput, seekOperationParams.getTargetTimePosition());
                int i10 = searchForTimestamp.type;
                if (i10 == -3) {
                    markSeekOperationFinished(false, nextSearchBytePosition);
                    return seekToPosition(extractorInput, nextSearchBytePosition, positionHolder);
                } else if (i10 == -2) {
                    seekOperationParams.updateSeekFloor(searchForTimestamp.timestampToUpdate, searchForTimestamp.bytePositionToUpdate);
                } else if (i10 != -1) {
                    if (i10 == 0) {
                        skipInputUntilPosition(extractorInput, searchForTimestamp.bytePositionToUpdate);
                        markSeekOperationFinished(true, searchForTimestamp.bytePositionToUpdate);
                        return seekToPosition(extractorInput, searchForTimestamp.bytePositionToUpdate, positionHolder);
                    }
                    throw new IllegalStateException("Invalid case");
                } else {
                    seekOperationParams.updateSeekCeiling(searchForTimestamp.timestampToUpdate, searchForTimestamp.bytePositionToUpdate);
                }
            }
        }
    }

    public final boolean isSeeking() {
        return this.seekOperationParams != null;
    }

    public final void markSeekOperationFinished(boolean z10, long j10) {
        this.seekOperationParams = null;
        this.timestampSeeker.onSeekFinished();
        onSeekOperationFinished(z10, j10);
    }

    public void onSeekOperationFinished(boolean z10, long j10) {
    }

    public final int seekToPosition(ExtractorInput extractorInput, long j10, PositionHolder positionHolder) {
        if (j10 == extractorInput.getPosition()) {
            return 0;
        }
        positionHolder.position = j10;
        return 1;
    }

    public final void setSeekTargetUs(long j10) {
        SeekOperationParams seekOperationParams = this.seekOperationParams;
        if (seekOperationParams == null || seekOperationParams.getSeekTimeUs() != j10) {
            this.seekOperationParams = createSeekParamsForTargetTimeUs(j10);
        }
    }

    public final boolean skipInputUntilPosition(ExtractorInput extractorInput, long j10) throws IOException {
        long position = j10 - extractorInput.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        extractorInput.skipFully((int) position);
        return true;
    }
}
