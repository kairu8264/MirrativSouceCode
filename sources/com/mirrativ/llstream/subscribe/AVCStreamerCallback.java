package com.mirrativ.llstream.subscribe;

import android.media.MediaFormat;

/* loaded from: classes4.dex */
public interface AVCStreamerCallback {
    void onAVCStreamerError(Throwable th2, DecodeErrorInfo decodeErrorInfo);

    void onLoadingBegan();

    void onLoadingEnd();

    void onVideoOutputFormatChanged(MediaFormat mediaFormat);

    void onVideoRendered(int i10);
}
