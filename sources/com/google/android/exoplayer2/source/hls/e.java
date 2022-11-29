package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements HlsExtractorFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ e f26971a = new e();

    @Override // com.google.android.exoplayer2.source.hls.HlsExtractorFactory
    public final HlsMediaChunkExtractor createExtractor(Uri uri, Format format, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput) {
        HlsMediaChunkExtractor lambda$static$0;
        lambda$static$0 = MediaParserHlsMediaChunkExtractor.lambda$static$0(uri, format, list, timestampAdjuster, map, extractorInput);
        return lambda$static$0;
    }
}
