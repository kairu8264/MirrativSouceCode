package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PsBinarySearchSeeker extends BinarySearchSeeker {
    private static final int MINIMUM_SEARCH_RANGE_BYTES = 1000;
    private static final long SEEK_TOLERANCE_US = 100000;
    private static final int TIMESTAMP_SEARCH_BYTES = 20000;

    /* loaded from: classes3.dex */
    public static final class PsScrSeeker implements BinarySearchSeeker.TimestampSeeker {
        private final ParsableByteArray packetBuffer;
        private final TimestampAdjuster scrTimestampAdjuster;

        private BinarySearchSeeker.TimestampSearchResult searchForScrValueInBuffer(ParsableByteArray parsableByteArray, long j10, long j11) {
            int i10 = -1;
            int i11 = -1;
            long j12 = -9223372036854775807L;
            while (parsableByteArray.bytesLeft() >= 4) {
                if (PsBinarySearchSeeker.peekIntAtPosition(parsableByteArray.getData(), parsableByteArray.getPosition()) != 442) {
                    parsableByteArray.skipBytes(1);
                } else {
                    parsableByteArray.skipBytes(4);
                    long readScrValueFromPack = PsDurationReader.readScrValueFromPack(parsableByteArray);
                    if (readScrValueFromPack != C.TIME_UNSET) {
                        long adjustTsTimestamp = this.scrTimestampAdjuster.adjustTsTimestamp(readScrValueFromPack);
                        if (adjustTsTimestamp > j10) {
                            if (j12 == C.TIME_UNSET) {
                                return BinarySearchSeeker.TimestampSearchResult.overestimatedResult(adjustTsTimestamp, j11);
                            }
                            return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j11 + i11);
                        } else if (100000 + adjustTsTimestamp > j10) {
                            return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j11 + parsableByteArray.getPosition());
                        } else {
                            i11 = parsableByteArray.getPosition();
                            j12 = adjustTsTimestamp;
                        }
                    }
                    skipToEndOfCurrentPack(parsableByteArray);
                    i10 = parsableByteArray.getPosition();
                }
            }
            if (j12 != C.TIME_UNSET) {
                return BinarySearchSeeker.TimestampSearchResult.underestimatedResult(j12, j11 + i10);
            }
            return BinarySearchSeeker.TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT;
        }

        private static void skipToEndOfCurrentPack(ParsableByteArray parsableByteArray) {
            int peekIntAtPosition;
            int limit = parsableByteArray.limit();
            if (parsableByteArray.bytesLeft() < 10) {
                parsableByteArray.setPosition(limit);
                return;
            }
            parsableByteArray.skipBytes(9);
            int readUnsignedByte = parsableByteArray.readUnsignedByte() & 7;
            if (parsableByteArray.bytesLeft() < readUnsignedByte) {
                parsableByteArray.setPosition(limit);
                return;
            }
            parsableByteArray.skipBytes(readUnsignedByte);
            if (parsableByteArray.bytesLeft() >= 4) {
                if (PsBinarySearchSeeker.peekIntAtPosition(parsableByteArray.getData(), parsableByteArray.getPosition()) == 443) {
                    parsableByteArray.skipBytes(4);
                    int readUnsignedShort = parsableByteArray.readUnsignedShort();
                    if (parsableByteArray.bytesLeft() < readUnsignedShort) {
                        parsableByteArray.setPosition(limit);
                        return;
                    }
                    parsableByteArray.skipBytes(readUnsignedShort);
                }
                while (parsableByteArray.bytesLeft() >= 4 && (peekIntAtPosition = PsBinarySearchSeeker.peekIntAtPosition(parsableByteArray.getData(), parsableByteArray.getPosition())) != 442 && peekIntAtPosition != 441 && (peekIntAtPosition >>> 8) == 1) {
                    parsableByteArray.skipBytes(4);
                    if (parsableByteArray.bytesLeft() < 2) {
                        parsableByteArray.setPosition(limit);
                        return;
                    }
                    parsableByteArray.setPosition(Math.min(parsableByteArray.limit(), parsableByteArray.getPosition() + parsableByteArray.readUnsignedShort()));
                }
                return;
            }
            parsableByteArray.setPosition(limit);
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public void onSeekFinished() {
            this.packetBuffer.reset(Util.EMPTY_BYTE_ARRAY);
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j10) throws IOException {
            long position = extractorInput.getPosition();
            int min = (int) Math.min((long) SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, extractorInput.getLength() - position);
            this.packetBuffer.reset(min);
            extractorInput.peekFully(this.packetBuffer.getData(), 0, min);
            return searchForScrValueInBuffer(this.packetBuffer, j10, position);
        }

        private PsScrSeeker(TimestampAdjuster timestampAdjuster) {
            this.scrTimestampAdjuster = timestampAdjuster;
            this.packetBuffer = new ParsableByteArray();
        }
    }

    public PsBinarySearchSeeker(TimestampAdjuster timestampAdjuster, long j10, long j11) {
        super(new BinarySearchSeeker.DefaultSeekTimestampConverter(), new PsScrSeeker(timestampAdjuster), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int peekIntAtPosition(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & TagConstant.TAG_CAT_RESERVED) | ((bArr[i10] & TagConstant.TAG_CAT_RESERVED) << 24) | ((bArr[i10 + 1] & TagConstant.TAG_CAT_RESERVED) << 16) | ((bArr[i10 + 2] & TagConstant.TAG_CAT_RESERVED) << 8);
    }
}
