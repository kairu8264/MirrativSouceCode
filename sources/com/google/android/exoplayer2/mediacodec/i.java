package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements MediaCodecUtil.ScoreProvider {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ i f26888a = new i();

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
    public final int getScore(Object obj) {
        int lambda$applyWorkarounds$2;
        lambda$applyWorkarounds$2 = MediaCodecUtil.lambda$applyWorkarounds$2((MediaCodecInfo) obj);
        return lambda$applyWorkarounds$2;
    }
}
