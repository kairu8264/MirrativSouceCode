package com.mirrativ.llstream.encoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public interface VideoEncoderListener {
    void onChangeVideoFormat(MediaFormat mediaFormat);

    void onVideoEncoderError(Throwable th2);

    void onVideoSampleOutput(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer);
}
