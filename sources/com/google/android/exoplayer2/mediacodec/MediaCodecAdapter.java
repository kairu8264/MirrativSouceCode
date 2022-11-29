package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface MediaCodecAdapter {

    /* loaded from: classes3.dex */
    public interface Factory {
        public static final Factory DEFAULT = new SynchronousMediaCodecAdapter.Factory();

        MediaCodecAdapter createAdapter(MediaCodec mediaCodec);
    }

    /* loaded from: classes3.dex */
    public interface OnFrameRenderedListener {
        void onFrameRendered(MediaCodecAdapter mediaCodecAdapter, long j10, long j11);
    }

    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10);

    int dequeueInputBufferIndex();

    int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo);

    void flush();

    ByteBuffer getInputBuffer(int i10);

    ByteBuffer getOutputBuffer(int i10);

    MediaFormat getOutputFormat();

    void queueInputBuffer(int i10, int i11, int i12, long j10, int i13);

    void queueSecureInputBuffer(int i10, int i11, CryptoInfo cryptoInfo, long j10, int i12);

    void release();

    void releaseOutputBuffer(int i10, long j10);

    void releaseOutputBuffer(int i10, boolean z10);

    void setOnFrameRenderedListener(OnFrameRenderedListener onFrameRenderedListener, Handler handler);

    void setOutputSurface(Surface surface);

    void setParameters(Bundle bundle);

    void setVideoScalingMode(int i10);

    void start();
}
