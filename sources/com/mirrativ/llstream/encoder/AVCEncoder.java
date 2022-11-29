package com.mirrativ.llstream.encoder;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import com.dena.mirrorman.net.api.Referer;
import com.google.android.exoplayer2.util.MimeTypes;
import com.mirrativ.llstream.NamedThreadFactory;
import com.mirrativ.llstream.decoder.a;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jo.h;
import jo.p;
import uo.d2;
import uo.q0;
import uo.s1;
import uo.u1;
import wn.j;
import wo.b0;
import wo.i;
import wo.l;
import wo.x;

/* loaded from: classes4.dex */
public final class AVCEncoder implements VideoEncoder {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "AVCEncoder";
    private int bitrateMode;
    private final i<CompressedBuffer> channel;
    private MediaCodec codec;
    private final q0 coroutineScope;
    private d2 dequeueJob;
    private final s1 encodeDispatcher;
    private MediaFormat format;
    private Surface inputSurface;
    private volatile boolean keepAlive;
    private VideoEncoderListener listener;
    private d2 outputJob;
    private final VideoEncoderSetting setting;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final MediaFormat createFormat(Size size, int i10, int i11, int i12) {
            p.h(size, "resolution");
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(MimeTypes.VIDEO_H264, size.getWidth(), size.getHeight());
            p.g(createVideoFormat, "createVideoFormat(\n     …tion.height\n            )");
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", i12);
            createVideoFormat.setInteger("frame-rate", i10);
            createVideoFormat.setInteger("i-frame-interval", i11);
            createVideoFormat.setInteger(Referer.PROFILE, 1);
            createVideoFormat.setInteger("level", 512);
            createVideoFormat.setInteger("bitrate-mode", 1);
            createVideoFormat.setInteger("repeat-previous-frame-after", 1000000 / i10);
            return createVideoFormat;
        }
    }

    public AVCEncoder(q0 q0Var) {
        p.h(q0Var, "coroutineScope");
        this.coroutineScope = q0Var;
        this.setting = new VideoEncoderSetting(null, 0, 0, 0, 15, null);
        this.bitrateMode = -1;
        this.channel = l.b(1000, null, null, 6, null);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory(TAG));
        p.g(newSingleThreadExecutor, "newSingleThreadExecutor(…eadFactory(\"AVCEncoder\"))");
        this.encodeDispatcher = u1.a(newSingleThreadExecutor);
    }

    private final void changeBitrate(int i10) {
        Bundle bundle = new Bundle();
        if (Log.isLoggable(TAG, 3)) {
            StringBuilder a10 = a.a("change video bitrate - ");
            a10.append(getBitrate());
            a10.append("bps -> ");
            a10.append(i10);
            a10.append("bps");
            Log.d(TAG, a10.toString());
        }
        bundle.putInt("video-bitrate", i10);
        try {
            MediaCodec mediaCodec = this.codec;
            if (mediaCodec != null) {
                mediaCodec.setParameters(bundle);
            }
            getSetting().setBitrate(i10);
        } catch (Exception e10) {
            Log.e(TAG, "failed to setParameters", e10);
        }
    }

    private final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        try {
            ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i10);
            if (outputBuffer == null) {
                return;
            }
            outputBuffer.limit(bufferInfo.size + bufferInfo.offset);
            outputBuffer.position(bufferInfo.offset);
            ByteBuffer allocate = ByteBuffer.allocate(bufferInfo.size);
            allocate.put(outputBuffer);
            i<CompressedBuffer> iVar = this.channel;
            p.g(allocate, "outBuffer");
            iVar.l(new CompressedBuffer(bufferInfo, allocate));
        } catch (Exception e10) {
            Log.e(TAG, "getOutputBuffer failed", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object proceedOutgoings(ao.d<? super wn.v> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.mirrativ.llstream.encoder.AVCEncoder$proceedOutgoings$1
            if (r0 == 0) goto L13
            r0 = r9
            com.mirrativ.llstream.encoder.AVCEncoder$proceedOutgoings$1 r0 = (com.mirrativ.llstream.encoder.AVCEncoder$proceedOutgoings$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.mirrativ.llstream.encoder.AVCEncoder$proceedOutgoings$1 r0 = new com.mirrativ.llstream.encoder.AVCEncoder$proceedOutgoings$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.L$0
            com.mirrativ.llstream.encoder.AVCEncoder r2 = (com.mirrativ.llstream.encoder.AVCEncoder) r2
            goto L39
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            java.lang.Object r2 = r0.L$0
            com.mirrativ.llstream.encoder.AVCEncoder r2 = (com.mirrativ.llstream.encoder.AVCEncoder) r2
        L39:
            wn.m.b(r9)     // Catch: java.lang.Exception -> L3d
            goto L45
        L3d:
            r9 = move-exception
            goto L87
        L3f:
            wn.m.b(r9)
            r8.keepAlive = r4
            r2 = r8
        L45:
            boolean r9 = r2.keepAlive
            if (r9 == 0) goto L95
            uo.d2 r9 = r2.dequeueJob
            if (r9 == 0) goto L50
            uo.g2.k(r9)
        L50:
            android.media.MediaCodec$BufferInfo r9 = new android.media.MediaCodec$BufferInfo
            r9.<init>()
            android.media.MediaCodec r5 = r2.codec
            if (r5 != 0) goto L5a
            goto L95
        L5a:
            r6 = 10000(0x2710, double:4.9407E-320)
            int r6 = r5.dequeueOutputBuffer(r9, r6)     // Catch: java.lang.Exception -> L3d
            if (r6 >= 0) goto L6f
            r5 = 1
            r0.L$0 = r2     // Catch: java.lang.Exception -> L3d
            r0.label = r4     // Catch: java.lang.Exception -> L3d
            java.lang.Object r9 = uo.b1.a(r5, r0)     // Catch: java.lang.Exception -> L3d
            if (r9 != r1) goto L45
            return r1
        L6f:
            r2.onOutputBufferAvailable(r5, r6, r9)     // Catch: java.lang.Exception -> L3d
            android.media.MediaCodec r9 = r2.codec     // Catch: java.lang.Exception -> L3d
            if (r9 == 0) goto L7a
            r5 = 0
            r9.releaseOutputBuffer(r6, r5)     // Catch: java.lang.Exception -> L3d
        L7a:
            r5 = 10
            r0.L$0 = r2     // Catch: java.lang.Exception -> L3d
            r0.label = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r9 = uo.b1.a(r5, r0)     // Catch: java.lang.Exception -> L3d
            if (r9 != r1) goto L45
            return r1
        L87:
            r0 = 3
            java.lang.String r1 = "AVCEncoder"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L95
            java.lang.String r0 = "dequeue error"
            android.util.Log.d(r1, r0, r9)
        L95:
            wn.v r9 = wn.v.f59242a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.encoder.AVCEncoder.proceedOutgoings(ao.d):java.lang.Object");
    }

    @Override // com.mirrativ.llstream.encoder.VideoEncoder
    public void enqueueSampleBuffer(byte[] bArr) {
        p.h(bArr, "data");
        throw new j("An operation is not implemented: Not yet implemented");
    }

    @Override // com.mirrativ.llstream.encoder.VideoEncoder
    public int getBitrate() {
        return getSetting().getBitrate();
    }

    public final int getBitrateMode() {
        return this.bitrateMode;
    }

    public final MediaCodec getCodec() {
        return this.codec;
    }

    public final q0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final MediaFormat getFormat() {
        return this.format;
    }

    @Override // com.mirrativ.llstream.encoder.VideoEncoder
    public VideoEncoderListener getListener() {
        return this.listener;
    }

    @Override // com.mirrativ.llstream.encoder.VideoEncoder
    public VideoEncoderSetting getSetting() {
        return this.setting;
    }

    @Override // com.mirrativ.llstream.encoder.VideoEncoder
    public Surface getSurface() {
        return this.inputSurface;
    }

    @Override // com.mirrativ.llstream.encoder.VideoEncoder
    public void prepare() {
        try {
            this.format = Companion.createFormat(getSetting().getResolution(), getSetting().getFrameRate(), getSetting().getKeyInterval(), getSetting().getBitrate());
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(MimeTypes.VIDEO_H264);
            this.codec = createEncoderByType;
            if (createEncoderByType != null) {
                createEncoderByType.configure(this.format, (Surface) null, (MediaCrypto) null, 1);
            }
            MediaCodec mediaCodec = this.codec;
            this.inputSurface = mediaCodec != null ? mediaCodec.createInputSurface() : null;
        } catch (Exception e10) {
            Log.e(TAG, "Failed to prepare", e10);
            VideoEncoderListener listener = getListener();
            if (listener != null) {
                listener.onVideoEncoderError(e10);
            }
        }
    }

    public final void release() {
        stopRunning();
        MediaCodec mediaCodec = this.codec;
        if (mediaCodec != null) {
            mediaCodec.release();
        }
        this.codec = null;
        this.encodeDispatcher.close();
    }

    @Override // com.mirrativ.llstream.encoder.VideoEncoder
    public void setBitrate(int i10) {
        if (getSetting().getBitrate() != i10) {
            changeBitrate(i10);
        }
    }

    public final void setBitrateMode(int i10) {
        this.bitrateMode = i10;
    }

    public final void setCodec(MediaCodec mediaCodec) {
        this.codec = mediaCodec;
    }

    public final void setFormat(MediaFormat mediaFormat) {
        this.format = mediaFormat;
    }

    @Override // com.mirrativ.llstream.encoder.VideoEncoder
    public void setListener(VideoEncoderListener videoEncoderListener) {
        this.listener = videoEncoderListener;
    }

    @Override // com.mirrativ.llstream.encoder.VideoEncoder
    public void startRunning() {
        d2 d10;
        d2 d11;
        MediaCodec mediaCodec;
        MediaFormat outputFormat;
        MediaFormat outputFormat2;
        try {
            MediaCodec mediaCodec2 = this.codec;
            if (mediaCodec2 != null) {
                mediaCodec2.start();
            }
            MediaCodec mediaCodec3 = this.codec;
            boolean z10 = true;
            if (mediaCodec3 == null || (outputFormat2 = mediaCodec3.getOutputFormat()) == null || !outputFormat2.containsKey("bitrate-mode")) {
                z10 = false;
            }
            if (z10 && (mediaCodec = this.codec) != null && (outputFormat = mediaCodec.getOutputFormat()) != null) {
                this.bitrateMode = outputFormat.getInteger("bitrate-mode");
            }
            d10 = uo.l.d(this.coroutineScope, this.encodeDispatcher, null, new AVCEncoder$startRunning$2(this, null), 2, null);
            this.dequeueJob = d10;
            d11 = uo.l.d(this.coroutineScope, this.encodeDispatcher, null, new AVCEncoder$startRunning$3(this, null), 2, null);
            this.outputJob = d11;
        } catch (Exception e10) {
            Log.e(TAG, "Failed to start", e10);
            VideoEncoderListener listener = getListener();
            if (listener != null) {
                listener.onVideoEncoderError(e10);
            }
        }
    }

    @Override // com.mirrativ.llstream.encoder.VideoEncoder
    public void stopRunning() {
        x.a.a(this.channel, null, 1, null);
        b0.a.a(this.channel, null, 1, null);
        this.keepAlive = false;
        try {
            MediaCodec mediaCodec = this.codec;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
        } catch (Exception e10) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Failed to stop MediaCodec", e10);
            }
        }
        d2 d2Var = this.dequeueJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.dequeueJob = null;
        d2 d2Var2 = this.outputJob;
        if (d2Var2 != null) {
            d2.a.a(d2Var2, null, 1, null);
        }
        this.outputJob = null;
    }
}
