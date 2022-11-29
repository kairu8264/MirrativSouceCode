package com.google.android.exoplayer2.extractor.mkv;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;

/* loaded from: classes3.dex */
final class Sniffer {
    private static final int ID_EBML = 440786851;
    private static final int SEARCH_LENGTH = 1024;
    private int peekLength;
    private final ParsableByteArray scratch = new ParsableByteArray(8);

    private long readUint(ExtractorInput extractorInput) throws IOException {
        int i10 = 0;
        extractorInput.peekFully(this.scratch.getData(), 0, 1);
        int i11 = this.scratch.getData()[0] & TagConstant.TAG_CAT_RESERVED;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        extractorInput.peekFully(this.scratch.getData(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.scratch.getData()[i10] & TagConstant.TAG_CAT_RESERVED) + (i14 << 8);
        }
        this.peekLength += i13 + 1;
        return i14;
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        long readUint;
        int i10;
        long length = extractorInput.getLength();
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j10 = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (i11 != 0 && length <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j10 = length;
        }
        int i12 = (int) j10;
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        long readUnsignedInt = this.scratch.readUnsignedInt();
        this.peekLength = 4;
        while (readUnsignedInt != 440786851) {
            int i13 = this.peekLength + 1;
            this.peekLength = i13;
            if (i13 == i12) {
                return false;
            }
            extractorInput.peekFully(this.scratch.getData(), 0, 1);
            readUnsignedInt = ((readUnsignedInt << 8) & (-256)) | (this.scratch.getData()[0] & TagConstant.TAG_CAT_RESERVED);
        }
        long readUint2 = readUint(extractorInput);
        long j11 = this.peekLength;
        if (readUint2 == Long.MIN_VALUE) {
            return false;
        }
        if (i11 != 0 && j11 + readUint2 >= length) {
            return false;
        }
        while (true) {
            int i14 = this.peekLength;
            long j12 = j11 + readUint2;
            if (i14 >= j12) {
                return ((long) i14) == j12;
            } else if (readUint(extractorInput) != Long.MIN_VALUE && (readUint(extractorInput)) >= 0 && readUint <= 2147483647L) {
                if (i10 != 0) {
                    int i15 = (int) readUint;
                    extractorInput.advancePeekPosition(i15);
                    this.peekLength += i15;
                }
            }
        }
    }
}
