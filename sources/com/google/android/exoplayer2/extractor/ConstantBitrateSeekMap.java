package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes3.dex */
public class ConstantBitrateSeekMap implements SeekMap {
    private final int bitrate;
    private final long dataSize;
    private final long durationUs;
    private final long firstFrameBytePosition;
    private final int frameSize;
    private final long inputLength;

    public ConstantBitrateSeekMap(long j10, long j11, int i10, int i11) {
        this.inputLength = j10;
        this.firstFrameBytePosition = j11;
        this.frameSize = i11 == -1 ? 1 : i11;
        this.bitrate = i10;
        if (j10 == -1) {
            this.dataSize = -1L;
            this.durationUs = C.TIME_UNSET;
            return;
        }
        this.dataSize = j10 - j11;
        this.durationUs = getTimeUsAtPosition(j10, j11, i10);
    }

    private long getFramePositionForTimeUs(long j10) {
        int i10 = this.frameSize;
        return this.firstFrameBytePosition + Util.constrainValue((((j10 * this.bitrate) / 8000000) / i10) * i10, 0L, this.dataSize - i10);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j10) {
        if (this.dataSize == -1) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.firstFrameBytePosition));
        }
        long framePositionForTimeUs = getFramePositionForTimeUs(j10);
        long timeUsAtPosition = getTimeUsAtPosition(framePositionForTimeUs);
        SeekPoint seekPoint = new SeekPoint(timeUsAtPosition, framePositionForTimeUs);
        if (timeUsAtPosition < j10) {
            int i10 = this.frameSize;
            if (i10 + framePositionForTimeUs < this.inputLength) {
                long j11 = framePositionForTimeUs + i10;
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUsAtPosition(j11), j11));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    public long getTimeUsAtPosition(long j10) {
        return getTimeUsAtPosition(j10, this.firstFrameBytePosition, this.bitrate);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return this.dataSize != -1;
    }

    private static long getTimeUsAtPosition(long j10, long j11, int i10) {
        return ((Math.max(0L, j10 - j11) * 8) * 1000000) / i10;
    }
}
