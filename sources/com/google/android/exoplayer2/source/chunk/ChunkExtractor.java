package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.io.IOException;

/* loaded from: classes3.dex */
public interface ChunkExtractor {

    /* loaded from: classes3.dex */
    public interface TrackOutputProvider {
        TrackOutput track(int i10, int i11);
    }

    ChunkIndex getChunkIndex();

    Format[] getSampleFormats();

    void init(TrackOutputProvider trackOutputProvider, long j10, long j11);

    boolean read(ExtractorInput extractorInput) throws IOException;

    void release();
}
