package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class BatchBuffer extends DecoderInputBuffer {
    public static final int DEFAULT_MAX_SAMPLE_COUNT = 32;
    public static final int MAX_SIZE_BYTES = 3072000;
    private long lastSampleTimeUs;
    private int maxSampleCount;
    private int sampleCount;

    public BatchBuffer() {
        super(2);
        this.maxSampleCount = 32;
    }

    private boolean canAppendSampleBuffer(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (hasSamples()) {
            if (this.sampleCount < this.maxSampleCount && decoderInputBuffer.isDecodeOnly() == isDecodeOnly()) {
                ByteBuffer byteBuffer2 = decoderInputBuffer.data;
                return byteBuffer2 == null || (byteBuffer = this.data) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
            }
            return false;
        }
        return true;
    }

    public boolean append(DecoderInputBuffer decoderInputBuffer) {
        Assertions.checkArgument(!decoderInputBuffer.isEncrypted());
        Assertions.checkArgument(!decoderInputBuffer.hasSupplementalData());
        Assertions.checkArgument(!decoderInputBuffer.isEndOfStream());
        if (canAppendSampleBuffer(decoderInputBuffer)) {
            int i10 = this.sampleCount;
            this.sampleCount = i10 + 1;
            if (i10 == 0) {
                this.timeUs = decoderInputBuffer.timeUs;
                if (decoderInputBuffer.isKeyFrame()) {
                    setFlags(1);
                }
            }
            if (decoderInputBuffer.isDecodeOnly()) {
                setFlags(Integer.MIN_VALUE);
            }
            ByteBuffer byteBuffer = decoderInputBuffer.data;
            if (byteBuffer != null) {
                ensureSpaceForWrite(byteBuffer.remaining());
                this.data.put(byteBuffer);
            }
            this.lastSampleTimeUs = decoderInputBuffer.timeUs;
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer, com.google.android.exoplayer2.decoder.Buffer
    public void clear() {
        super.clear();
        this.sampleCount = 0;
    }

    public long getFirstSampleTimeUs() {
        return this.timeUs;
    }

    public long getLastSampleTimeUs() {
        return this.lastSampleTimeUs;
    }

    public int getSampleCount() {
        return this.sampleCount;
    }

    public boolean hasSamples() {
        return this.sampleCount > 0;
    }

    public void setMaxSampleCount(int i10) {
        Assertions.checkArgument(i10 > 0);
        this.maxSampleCount = i10;
    }
}
