package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class DefaultExtractorInput implements ExtractorInput {
    private static final int PEEK_MAX_FREE_SPACE = 524288;
    private static final int PEEK_MIN_FREE_SPACE_AFTER_RESIZE = 65536;
    private static final int SCRATCH_SPACE_SIZE = 4096;
    private final DataReader dataReader;
    private int peekBufferLength;
    private int peekBufferPosition;
    private long position;
    private final long streamLength;
    private byte[] peekBuffer = new byte[65536];
    private final byte[] scratchSpace = new byte[4096];

    public DefaultExtractorInput(DataReader dataReader, long j10, long j11) {
        this.dataReader = dataReader;
        this.position = j10;
        this.streamLength = j11;
    }

    private void commitBytesRead(int i10) {
        if (i10 != -1) {
            this.position += i10;
        }
    }

    private void ensureSpaceForPeek(int i10) {
        int i11 = this.peekBufferPosition + i10;
        byte[] bArr = this.peekBuffer;
        if (i11 > bArr.length) {
            this.peekBuffer = Arrays.copyOf(this.peekBuffer, Util.constrainValue(bArr.length * 2, 65536 + i11, i11 + PEEK_MAX_FREE_SPACE));
        }
    }

    private int readFromPeekBuffer(byte[] bArr, int i10, int i11) {
        int i12 = this.peekBufferLength;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.peekBuffer, 0, bArr, i10, min);
        updatePeekBuffer(min);
        return min;
    }

    private int readFromUpstream(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (!Thread.interrupted()) {
            int read = this.dataReader.read(bArr, i10 + i12, i11 - i12);
            if (read == -1) {
                if (i12 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + read;
        }
        throw new InterruptedIOException();
    }

    private int skipFromPeekBuffer(int i10) {
        int min = Math.min(this.peekBufferLength, i10);
        updatePeekBuffer(min);
        return min;
    }

    private void updatePeekBuffer(int i10) {
        int i11 = this.peekBufferLength - i10;
        this.peekBufferLength = i11;
        this.peekBufferPosition = 0;
        byte[] bArr = this.peekBuffer;
        byte[] bArr2 = i11 < bArr.length - PEEK_MAX_FREE_SPACE ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.peekBuffer = bArr2;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean advancePeekPosition(int i10, boolean z10) throws IOException {
        ensureSpaceForPeek(i10);
        int i11 = this.peekBufferLength - this.peekBufferPosition;
        while (i11 < i10) {
            i11 = readFromUpstream(this.peekBuffer, this.peekBufferPosition, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.peekBufferLength = this.peekBufferPosition + i11;
        }
        this.peekBufferPosition += i10;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getLength() {
        return this.streamLength;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPeekPosition() {
        return this.position + this.peekBufferPosition;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPosition() {
        return this.position;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int peek(byte[] bArr, int i10, int i11) throws IOException {
        int min;
        ensureSpaceForPeek(i11);
        int i12 = this.peekBufferLength;
        int i13 = this.peekBufferPosition;
        int i14 = i12 - i13;
        if (i14 == 0) {
            min = readFromUpstream(this.peekBuffer, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            this.peekBufferLength += min;
        } else {
            min = Math.min(i11, i14);
        }
        System.arraycopy(this.peekBuffer, this.peekBufferPosition, bArr, i10, min);
        this.peekBufferPosition += min;
        return min;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (advancePeekPosition(i11, z10)) {
            System.arraycopy(this.peekBuffer, this.peekBufferPosition - i11, bArr, i10, i11);
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int readFromPeekBuffer = readFromPeekBuffer(bArr, i10, i11);
        if (readFromPeekBuffer == 0) {
            readFromPeekBuffer = readFromUpstream(bArr, i10, i11, 0, true);
        }
        commitBytesRead(readFromPeekBuffer);
        return readFromPeekBuffer;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int readFromPeekBuffer = readFromPeekBuffer(bArr, i10, i11);
        while (readFromPeekBuffer < i11 && readFromPeekBuffer != -1) {
            readFromPeekBuffer = readFromUpstream(bArr, i10, i11, readFromPeekBuffer, z10);
        }
        commitBytesRead(readFromPeekBuffer);
        return readFromPeekBuffer != -1;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void resetPeekPosition() {
        this.peekBufferPosition = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable {
        Assertions.checkArgument(j10 >= 0);
        this.position = j10;
        throw e10;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int skip(int i10) throws IOException {
        int skipFromPeekBuffer = skipFromPeekBuffer(i10);
        if (skipFromPeekBuffer == 0) {
            byte[] bArr = this.scratchSpace;
            skipFromPeekBuffer = readFromUpstream(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        commitBytesRead(skipFromPeekBuffer);
        return skipFromPeekBuffer;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean skipFully(int i10, boolean z10) throws IOException {
        int skipFromPeekBuffer = skipFromPeekBuffer(i10);
        while (skipFromPeekBuffer < i10 && skipFromPeekBuffer != -1) {
            skipFromPeekBuffer = readFromUpstream(this.scratchSpace, -skipFromPeekBuffer, Math.min(i10, this.scratchSpace.length + skipFromPeekBuffer), skipFromPeekBuffer, z10);
        }
        commitBytesRead(skipFromPeekBuffer);
        return skipFromPeekBuffer != -1;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void peekFully(byte[] bArr, int i10, int i11) throws IOException {
        peekFully(bArr, i10, i11, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        readFully(bArr, i10, i11, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void skipFully(int i10) throws IOException {
        skipFully(i10, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void advancePeekPosition(int i10) throws IOException {
        advancePeekPosition(i10, false);
    }
}
