package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class C2Mp3TimestampTracker {
    private static final long DECODER_DELAY_SAMPLES = 529;
    private static final String TAG = "C2Mp3TimestampTracker";
    private long anchorTimestampUs;
    private long processedSamples;
    private boolean seenInvalidMpegAudioHeader;

    private long getProcessedDurationUs(Format format) {
        return (this.processedSamples * 1000000) / format.sampleRate;
    }

    public void reset() {
        this.processedSamples = 0L;
        this.anchorTimestampUs = 0L;
        this.seenInvalidMpegAudioHeader = false;
    }

    public long updateAndGetPresentationTimeUs(Format format, DecoderInputBuffer decoderInputBuffer) {
        if (this.seenInvalidMpegAudioHeader) {
            return decoderInputBuffer.timeUs;
        }
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.data);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & TagConstant.TAG_CAT_RESERVED);
        }
        int parseMpegAudioFrameSampleCount = MpegAudioUtil.parseMpegAudioFrameSampleCount(i10);
        if (parseMpegAudioFrameSampleCount == -1) {
            this.seenInvalidMpegAudioHeader = true;
            Log.w(TAG, "MPEG audio header is invalid.");
            return decoderInputBuffer.timeUs;
        } else if (this.processedSamples == 0) {
            long j10 = decoderInputBuffer.timeUs;
            this.anchorTimestampUs = j10;
            this.processedSamples = parseMpegAudioFrameSampleCount - DECODER_DELAY_SAMPLES;
            return j10;
        } else {
            long processedDurationUs = getProcessedDurationUs(format);
            this.processedSamples += parseMpegAudioFrameSampleCount;
            return this.anchorTimestampUs + processedDurationUs;
        }
    }
}
