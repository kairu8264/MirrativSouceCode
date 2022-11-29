package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes3.dex */
final class WavSeekMap implements SeekMap {
    private final long blockCount;
    private final long durationUs;
    private final long firstBlockPosition;
    private final int framesPerBlock;
    private final WavHeader wavHeader;

    public WavSeekMap(WavHeader wavHeader, int i10, long j10, long j11) {
        this.wavHeader = wavHeader;
        this.framesPerBlock = i10;
        this.firstBlockPosition = j10;
        long j12 = (j11 - j10) / wavHeader.blockSize;
        this.blockCount = j12;
        this.durationUs = blockIndexToTimeUs(j12);
    }

    private long blockIndexToTimeUs(long j10) {
        return Util.scaleLargeTimestamp(j10 * this.framesPerBlock, 1000000L, this.wavHeader.frameRateHz);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j10) {
        long constrainValue = Util.constrainValue((this.wavHeader.frameRateHz * j10) / (this.framesPerBlock * 1000000), 0L, this.blockCount - 1);
        long j11 = this.firstBlockPosition + (this.wavHeader.blockSize * constrainValue);
        long blockIndexToTimeUs = blockIndexToTimeUs(constrainValue);
        SeekPoint seekPoint = new SeekPoint(blockIndexToTimeUs, j11);
        if (blockIndexToTimeUs < j10 && constrainValue != this.blockCount - 1) {
            long j12 = constrainValue + 1;
            return new SeekMap.SeekPoints(seekPoint, new SeekPoint(blockIndexToTimeUs(j12), this.firstBlockPosition + (this.wavHeader.blockSize * j12)));
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
