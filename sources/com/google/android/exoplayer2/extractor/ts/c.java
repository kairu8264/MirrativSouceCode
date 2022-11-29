package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements ExtractorsFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ c f26862a = new c();

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public final Extractor[] createExtractors() {
        Extractor[] lambda$static$0;
        lambda$static$0 = AdtsExtractor.lambda$static$0();
        return lambda$static$0;
    }
}
