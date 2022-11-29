package com.google.android.exoplayer2.extractor;

import java.io.IOException;

/* loaded from: classes3.dex */
final class ExtractorUtil {
    private ExtractorUtil() {
    }

    public static int peekToLength(ExtractorInput extractorInput, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int peek = extractorInput.peek(bArr, i10 + i12, i11 - i12);
            if (peek == -1) {
                break;
            }
            i12 += peek;
        }
        return i12;
    }
}
