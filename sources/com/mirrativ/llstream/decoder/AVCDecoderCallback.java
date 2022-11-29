package com.mirrativ.llstream.decoder;

import android.media.MediaFormat;
import com.mirrativ.llstream.subscribe.DecodeErrorInfo;

/* loaded from: classes4.dex */
public interface AVCDecoderCallback {
    void onError(Throwable th2);

    void onLoadingEnd();

    void onMediaCodecError(Exception exc, DecodeErrorInfo decodeErrorInfo);

    void onOutputFormatChanged(MediaFormat mediaFormat);

    void onVideoRendered(int i10);
}
