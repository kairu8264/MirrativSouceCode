package com.mirrativ.llstream.encoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public interface AudioEncoderListener {
    void onAudioEncoderError(Throwable th2);

    void onAudioSampleOutput(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer);

    void onChangeAudioFormat(MediaFormat mediaFormat);
}
