package com.google.android.exoplayer2.extractor;

import java.io.IOException;

/* loaded from: classes3.dex */
public class ForwardingExtractorInput implements ExtractorInput {
    private final ExtractorInput input;

    public ForwardingExtractorInput(ExtractorInput extractorInput) {
        this.input = extractorInput;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean advancePeekPosition(int i10, boolean z10) throws IOException {
        return this.input.advancePeekPosition(i10, z10);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getLength() {
        return this.input.getLength();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPeekPosition() {
        return this.input.getPeekPosition();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPosition() {
        return this.input.getPosition();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int peek(byte[] bArr, int i10, int i11) throws IOException {
        return this.input.peek(bArr, i10, i11);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.input.peekFully(bArr, i10, i11, z10);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.input.read(bArr, i10, i11);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.input.readFully(bArr, i10, i11, z10);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void resetPeekPosition() {
        this.input.resetPeekPosition();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable {
        this.input.setRetryPosition(j10, e10);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int skip(int i10) throws IOException {
        return this.input.skip(i10);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean skipFully(int i10, boolean z10) throws IOException {
        return this.input.skipFully(i10, z10);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void advancePeekPosition(int i10) throws IOException {
        this.input.advancePeekPosition(i10);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void peekFully(byte[] bArr, int i10, int i11) throws IOException {
        this.input.peekFully(bArr, i10, i11);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.input.readFully(bArr, i10, i11);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void skipFully(int i10) throws IOException {
        this.input.skipFully(i10);
    }
}
