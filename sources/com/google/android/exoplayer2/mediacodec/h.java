package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements MediaCodecUtil.ScoreProvider {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ h f26887a = new h();

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
    public final int getScore(Object obj) {
        int lambda$applyWorkarounds$1;
        lambda$applyWorkarounds$1 = MediaCodecUtil.lambda$applyWorkarounds$1((MediaCodecInfo) obj);
        return lambda$applyWorkarounds$1;
    }
}
