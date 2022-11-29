package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes3.dex */
final class TsBinarySearchSeeker extends BinarySearchSeeker {
    private static final int MINIMUM_SEARCH_RANGE_BYTES = 940;
    private static final long SEEK_TOLERANCE_US = 100000;

    /* loaded from: classes3.dex */
    public static final class TsPcrSeeker implements BinarySearchSeeker.TimestampSeeker {
        private final ParsableByteArray packetBuffer = new ParsableByteArray();
        private final int pcrPid;
        private final TimestampAdjuster pcrTimestampAdjuster;
        private final int timestampSearchBytes;

        public TsPcrSeeker(int i10, TimestampAdjuster timestampAdjuster, int i11) {
            this.pcrPid = i10;
            this.pcrTimestampAdjuster = timestampAdjuster;
            this.timestampSearchBytes = i11;
        }

        private BinarySearchSeeker.TimestampSearchResult searchForPcrValueInBuffer(ParsableByteArray parsableByteArray, long j10, long j11) {
            int findSyncBytePosition;
            int findSyncBytePosition2;
            int limit = parsableByteArray.limit();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (parsableByteArray.bytesLeft() >= 188 && (findSyncBytePosition2 = (findSyncBytePosition = TsUtil.findSyncBytePosition(parsableByteArray.getData(), parsableByteArray.getPosition(), limit)) + TsExtractor.TS_PACKET_SIZE) <= limit) {
                long readPcrFromPacket = TsUtil.readPcrFromPacket(parsableByteArray, findSyncBytePosition, this.pcrPid);
                if (readPcrFromPacket != C.TIME_UNSET) {
                    long adjustTsTimestamp = this.pcrTimestampAdjuster.adjustTsTimestamp(readPcrFromPacket);
                    if (adjustTsTimestamp > j10) {
                        if (j14 == C.TIME_UNSET) {
                            return BinarySearchSeeker.TimestampSearchResult.overestimatedResult(adjustTsTimestamp, j11);
                        }
                        return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j11 + j13);
                    } else if (100000 + adjustTsTimestamp > j10) {
                        return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j11 + findSyncBytePosition);
                    } else {
                        j13 = findSyncBytePosition;
                        j14 = adjustTsTimestamp;
                    }
                }
                parsableByteArray.setPosition(findSyncBytePosition2);
                j12 = findSyncBytePosition2;
            }
            if (j14 != C.TIME_UNSET) {
                return BinarySearchSeeker.TimestampSearchResult.underestimatedResult(j14, j11 + j12);
            }
            return BinarySearchSeeker.TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT;
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public void onSeekFinished() {
            this.packetBuffer.reset(Util.EMPTY_BYTE_ARRAY);
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j10) throws IOException {
            long position = extractorInput.getPosition();
            int min = (int) Math.min(this.timestampSearchBytes, extractorInput.getLength() - position);
            this.packetBuffer.reset(min);
            extractorInput.peekFully(this.packetBuffer.getData(), 0, min);
            return searchForPcrValueInBuffer(this.packetBuffer, j10, position);
        }
    }

    public TsBinarySearchSeeker(TimestampAdjuster timestampAdjuster, long j10, long j11, int i10, int i11) {
        super(new BinarySearchSeeker.DefaultSeekTimestampConverter(), new TsPcrSeeker(i10, timestampAdjuster, i11), j10, 0L, j10 + 1, 0L, j11, 188L, MINIMUM_SEARCH_RANGE_BYTES);
    }
}
