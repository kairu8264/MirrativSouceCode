package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.List;

/* loaded from: classes3.dex */
public interface MediaCodecSelector {
    public static final MediaCodecSelector DEFAULT = f.f26885a;

    List<MediaCodecInfo> getDecoderInfos(String str, boolean z10, boolean z11) throws MediaCodecUtil.DecoderQueryException;
}
