package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ExtractorsFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f26855a = new a();

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public final Extractor[] createExtractors() {
        Extractor[] lambda$static$0;
        lambda$static$0 = FragmentedMp4Extractor.lambda$static$0();
        return lambda$static$0;
    }
}
