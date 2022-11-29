package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import java.io.IOException;

/* loaded from: classes3.dex */
final class UnexpectedSampleTimestampException extends IOException {
    public final long lastAcceptedSampleTimeUs;
    public final MediaChunk mediaChunk;
    public final long rejectedSampleTimeUs;

    public UnexpectedSampleTimestampException(MediaChunk mediaChunk, long j10, long j11) {
        super("Unexpected sample timestamp: " + C.usToMs(j11) + " in chunk [" + mediaChunk.startTimeUs + ", " + mediaChunk.endTimeUs + "]");
        this.mediaChunk = mediaChunk;
        this.lastAcceptedSampleTimeUs = j10;
        this.rejectedSampleTimeUs = j11;
    }
}
