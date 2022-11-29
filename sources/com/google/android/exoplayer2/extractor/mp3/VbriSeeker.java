package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes3.dex */
final class VbriSeeker implements Seeker {
    private static final String TAG = "VbriSeeker";
    private final long dataEndPosition;
    private final long durationUs;
    private final long[] positions;
    private final long[] timesUs;

    private VbriSeeker(long[] jArr, long[] jArr2, long j10, long j11) {
        this.timesUs = jArr;
        this.positions = jArr2;
        this.durationUs = j10;
        this.dataEndPosition = j11;
    }

    public static VbriSeeker create(long j10, long j11, MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        int readUnsignedByte;
        parsableByteArray.skipBytes(10);
        int readInt = parsableByteArray.readInt();
        if (readInt <= 0) {
            return null;
        }
        int i10 = header.sampleRate;
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(readInt, 1000000 * (i10 >= 32000 ? 1152 : 576), i10);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(2);
        long j12 = j11 + header.frameSize;
        long[] jArr = new long[readUnsignedShort];
        long[] jArr2 = new long[readUnsignedShort];
        int i11 = 0;
        long j13 = j11;
        while (i11 < readUnsignedShort) {
            int i12 = readUnsignedShort2;
            long j14 = j12;
            jArr[i11] = (i11 * scaleLargeTimestamp) / readUnsignedShort;
            jArr2[i11] = Math.max(j13, j14);
            if (readUnsignedShort3 == 1) {
                readUnsignedByte = parsableByteArray.readUnsignedByte();
            } else if (readUnsignedShort3 == 2) {
                readUnsignedByte = parsableByteArray.readUnsignedShort();
            } else if (readUnsignedShort3 == 3) {
                readUnsignedByte = parsableByteArray.readUnsignedInt24();
            } else if (readUnsignedShort3 != 4) {
                return null;
            } else {
                readUnsignedByte = parsableByteArray.readUnsignedIntToInt();
            }
            j13 += readUnsignedByte * i12;
            i11++;
            j12 = j14;
            readUnsignedShort2 = i12;
        }
        if (j10 != -1 && j10 != j13) {
            Log.w(TAG, "VBRI data size mismatch: " + j10 + ", " + j13);
        }
        return new VbriSeeker(jArr, jArr2, scaleLargeTimestamp, j13);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j10) {
        int binarySearchFloor = Util.binarySearchFloor(this.timesUs, j10, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs[binarySearchFloor], this.positions[binarySearchFloor]);
        if (seekPoint.timeUs < j10 && binarySearchFloor != this.timesUs.length - 1) {
            int i10 = binarySearchFloor + 1;
            return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs[i10], this.positions[i10]));
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j10) {
        return this.timesUs[Util.binarySearchFloor(this.positions, j10, true, true)];
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
