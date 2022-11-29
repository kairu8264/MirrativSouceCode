package com.google.android.exoplayer2.extractor;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public interface Extractor {
    public static final int RESULT_CONTINUE = 0;
    public static final int RESULT_END_OF_INPUT = -1;
    public static final int RESULT_SEEK = 1;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ReadResult {
    }

    void init(ExtractorOutput extractorOutput);

    int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException;

    void release();

    void seek(long j10, long j11);

    boolean sniff(ExtractorInput extractorInput) throws IOException;
}