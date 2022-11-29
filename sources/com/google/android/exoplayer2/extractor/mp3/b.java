package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.metadata.id3.Id3Decoder;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Id3Decoder.FramePredicate {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f26852a = new b();

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate
    public final boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
        boolean lambda$static$1;
        lambda$static$1 = Mp3Extractor.lambda$static$1(i10, i11, i12, i13, i14);
        return lambda$static$1;
    }
}
