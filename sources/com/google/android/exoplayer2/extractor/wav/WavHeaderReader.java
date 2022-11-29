package com.google.android.exoplayer2.extractor.wav;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes3.dex */
final class WavHeaderReader {
    private static final String TAG = "WavHeaderReader";

    /* loaded from: classes3.dex */
    public static final class ChunkHeader {
        public static final int SIZE_IN_BYTES = 8;

        /* renamed from: id  reason: collision with root package name */
        public final int f26865id;
        public final long size;

        private ChunkHeader(int i10, long j10) {
            this.f26865id = i10;
            this.size = j10;
        }

        public static ChunkHeader peek(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws IOException {
            extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
            parsableByteArray.setPosition(0);
            return new ChunkHeader(parsableByteArray.readInt(), parsableByteArray.readLittleEndianUnsignedInt());
        }
    }

    private WavHeaderReader() {
    }

    public static WavHeader peek(ExtractorInput extractorInput) throws IOException {
        byte[] bArr;
        Assertions.checkNotNull(extractorInput);
        ParsableByteArray parsableByteArray = new ParsableByteArray(16);
        if (ChunkHeader.peek(extractorInput, parsableByteArray).f26865id != 1380533830) {
            return null;
        }
        extractorInput.peekFully(parsableByteArray.getData(), 0, 4);
        parsableByteArray.setPosition(0);
        int readInt = parsableByteArray.readInt();
        if (readInt != 1463899717) {
            Log.e(TAG, "Unsupported RIFF format: " + readInt);
            return null;
        }
        ChunkHeader peek = ChunkHeader.peek(extractorInput, parsableByteArray);
        while (peek.f26865id != 1718449184) {
            extractorInput.advancePeekPosition((int) peek.size);
            peek = ChunkHeader.peek(extractorInput, parsableByteArray);
        }
        Assertions.checkState(peek.size >= 16);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 16);
        parsableByteArray.setPosition(0);
        int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int readLittleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int readLittleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedShort4 = parsableByteArray.readLittleEndianUnsignedShort();
        int i10 = ((int) peek.size) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            extractorInput.peekFully(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = Util.EMPTY_BYTE_ARRAY;
        }
        return new WavHeader(readLittleEndianUnsignedShort, readLittleEndianUnsignedShort2, readLittleEndianUnsignedIntToInt, readLittleEndianUnsignedIntToInt2, readLittleEndianUnsignedShort3, readLittleEndianUnsignedShort4, bArr);
    }

    public static Pair<Long, Long> skipToData(ExtractorInput extractorInput) throws IOException {
        Assertions.checkNotNull(extractorInput);
        extractorInput.resetPeekPosition();
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        ChunkHeader peek = ChunkHeader.peek(extractorInput, parsableByteArray);
        while (true) {
            int i10 = peek.f26865id;
            if (i10 != 1684108385) {
                if (i10 != 1380533830 && i10 != 1718449184) {
                    Log.w(TAG, "Ignoring unknown WAV chunk: " + peek.f26865id);
                }
                long j10 = peek.size + 8;
                if (peek.f26865id == 1380533830) {
                    j10 = 12;
                }
                if (j10 <= 2147483647L) {
                    extractorInput.skipFully((int) j10);
                    peek = ChunkHeader.peek(extractorInput, parsableByteArray);
                } else {
                    throw new ParserException("Chunk is too large (~2GB+) to skip; id: " + peek.f26865id);
                }
            } else {
                extractorInput.skipFully(8);
                long position = extractorInput.getPosition();
                long j11 = peek.size + position;
                long length = extractorInput.getLength();
                if (length != -1 && j11 > length) {
                    Log.w(TAG, "Data exceeds input length: " + j11 + ", " + length);
                    j11 = length;
                }
                return Pair.create(Long.valueOf(position), Long.valueOf(j11));
            }
        }
    }
}
