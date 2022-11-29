package com.google.android.exoplayer2.text.cea;

import com.google.android.exoplayer2.decoder.OutputBuffer;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoder;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.text.cea.CeaDecoder;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class CeaDecoder implements SubtitleDecoder {
    private static final int NUM_INPUT_BUFFERS = 10;
    private static final int NUM_OUTPUT_BUFFERS = 2;
    private final ArrayDeque<CeaInputBuffer> availableInputBuffers = new ArrayDeque<>();
    private final ArrayDeque<SubtitleOutputBuffer> availableOutputBuffers;
    private CeaInputBuffer dequeuedInputBuffer;
    private long playbackPositionUs;
    private long queuedInputBufferCount;
    private final PriorityQueue<CeaInputBuffer> queuedInputBuffers;

    /* loaded from: classes3.dex */
    public static final class CeaInputBuffer extends SubtitleInputBuffer implements Comparable<CeaInputBuffer> {
        private long queuedInputBufferCount;

        private CeaInputBuffer() {
        }

        @Override // java.lang.Comparable
        public int compareTo(CeaInputBuffer ceaInputBuffer) {
            if (isEndOfStream() != ceaInputBuffer.isEndOfStream()) {
                return isEndOfStream() ? 1 : -1;
            }
            long j10 = this.timeUs - ceaInputBuffer.timeUs;
            if (j10 == 0) {
                j10 = this.queuedInputBufferCount - ceaInputBuffer.queuedInputBufferCount;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* loaded from: classes3.dex */
    public static final class CeaOutputBuffer extends SubtitleOutputBuffer {
        private OutputBuffer.Owner<CeaOutputBuffer> owner;

        public CeaOutputBuffer(OutputBuffer.Owner<CeaOutputBuffer> owner) {
            this.owner = owner;
        }

        @Override // com.google.android.exoplayer2.decoder.OutputBuffer
        public final void release() {
            this.owner.releaseOutputBuffer(this);
        }
    }

    public CeaDecoder() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.availableInputBuffers.add(new CeaInputBuffer());
        }
        this.availableOutputBuffers = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.availableOutputBuffers.add(new CeaOutputBuffer(new OutputBuffer.Owner() { // from class: com.google.android.exoplayer2.text.cea.b
                @Override // com.google.android.exoplayer2.decoder.OutputBuffer.Owner
                public final void releaseOutputBuffer(OutputBuffer outputBuffer) {
                    CeaDecoder.this.releaseOutputBuffer((CeaDecoder.CeaOutputBuffer) outputBuffer);
                }
            }));
        }
        this.queuedInputBuffers = new PriorityQueue<>();
    }

    private void releaseInputBuffer(CeaInputBuffer ceaInputBuffer) {
        ceaInputBuffer.clear();
        this.availableInputBuffers.add(ceaInputBuffer);
    }

    public abstract Subtitle createSubtitle();

    public abstract void decode(SubtitleInputBuffer subtitleInputBuffer);

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        this.queuedInputBufferCount = 0L;
        this.playbackPositionUs = 0L;
        while (!this.queuedInputBuffers.isEmpty()) {
            releaseInputBuffer((CeaInputBuffer) Util.castNonNull(this.queuedInputBuffers.poll()));
        }
        CeaInputBuffer ceaInputBuffer = this.dequeuedInputBuffer;
        if (ceaInputBuffer != null) {
            releaseInputBuffer(ceaInputBuffer);
            this.dequeuedInputBuffer = null;
        }
    }

    public final SubtitleOutputBuffer getAvailableOutputBuffer() {
        return this.availableOutputBuffers.pollFirst();
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public abstract String getName();

    public final long getPositionUs() {
        return this.playbackPositionUs;
    }

    public abstract boolean isNewSubtitleDataAvailable();

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void release() {
    }

    public void releaseOutputBuffer(SubtitleOutputBuffer subtitleOutputBuffer) {
        subtitleOutputBuffer.clear();
        this.availableOutputBuffers.add(subtitleOutputBuffer);
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    public void setPositionUs(long j10) {
        this.playbackPositionUs = j10;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    public SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
        Assertions.checkState(this.dequeuedInputBuffer == null);
        if (this.availableInputBuffers.isEmpty()) {
            return null;
        }
        CeaInputBuffer pollFirst = this.availableInputBuffers.pollFirst();
        this.dequeuedInputBuffer = pollFirst;
        return pollFirst;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    public SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
        if (this.availableOutputBuffers.isEmpty()) {
            return null;
        }
        while (!this.queuedInputBuffers.isEmpty() && ((CeaInputBuffer) Util.castNonNull(this.queuedInputBuffers.peek())).timeUs <= this.playbackPositionUs) {
            CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) Util.castNonNull(this.queuedInputBuffers.poll());
            if (ceaInputBuffer.isEndOfStream()) {
                SubtitleOutputBuffer subtitleOutputBuffer = (SubtitleOutputBuffer) Util.castNonNull(this.availableOutputBuffers.pollFirst());
                subtitleOutputBuffer.addFlag(4);
                releaseInputBuffer(ceaInputBuffer);
                return subtitleOutputBuffer;
            }
            decode(ceaInputBuffer);
            if (isNewSubtitleDataAvailable()) {
                Subtitle createSubtitle = createSubtitle();
                SubtitleOutputBuffer subtitleOutputBuffer2 = (SubtitleOutputBuffer) Util.castNonNull(this.availableOutputBuffers.pollFirst());
                subtitleOutputBuffer2.setContent(ceaInputBuffer.timeUs, createSubtitle, Long.MAX_VALUE);
                releaseInputBuffer(ceaInputBuffer);
                return subtitleOutputBuffer2;
            }
            releaseInputBuffer(ceaInputBuffer);
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) throws SubtitleDecoderException {
        Assertions.checkArgument(subtitleInputBuffer == this.dequeuedInputBuffer);
        CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) subtitleInputBuffer;
        if (ceaInputBuffer.isDecodeOnly()) {
            releaseInputBuffer(ceaInputBuffer);
        } else {
            long j10 = this.queuedInputBufferCount;
            this.queuedInputBufferCount = 1 + j10;
            ceaInputBuffer.queuedInputBufferCount = j10;
            this.queuedInputBuffers.add(ceaInputBuffer);
        }
        this.dequeuedInputBuffer = null;
    }
}
