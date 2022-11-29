package com.google.android.exoplayer2.mediacodec;

import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements MediaCodecSelector {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ f f26885a = new f();

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecSelector
    public final List getDecoderInfos(String str, boolean z10, boolean z11) {
        return MediaCodecUtil.getDecoderInfos(str, z10, z11);
    }
}
