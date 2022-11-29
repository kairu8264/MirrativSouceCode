package ze;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.dena.showroom.flvplayback.Sample;
import com.dena.showroom.flvplayback.SampleSource;
import com.dena.showroom.flvplayback.impl.ThreadingPolicy;
import com.dena.showroom.flvplayback.impl.util.BlackList;
import com.dena.showroom.flvplayback.impl.util.Loopers;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.json.JSONObject;
import xn.a0;

/* loaded from: classes2.dex */
public final class n extends MediaCodec.Callback implements SampleSource.Connection, ThreadingPolicy.LooperAware {
    public static final a K = new a(null);
    public static final int L = 8;
    public static String M = n.class.getSimpleName();
    public final Handler A;
    public MediaCodec B;
    public Surface C;
    public MediaCodec.BufferInfo D;
    public int E;
    public long F;
    public final int G;
    public double H;
    public long I;
    public int J;

    /* renamed from: w  reason: collision with root package name */
    public final k f63148w;

    /* renamed from: x  reason: collision with root package name */
    public final SampleSource.Sink f63149x;

    /* renamed from: y  reason: collision with root package name */
    public final long f63150y;

    /* renamed from: z  reason: collision with root package name */
    public int f63151z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public n(k kVar, Looper looper, SampleSource.Sink sink, MediaFormat mediaFormat, long j10, double d10) {
        Handler handler;
        MediaCodec mediaCodec;
        MediaFormat outputFormat;
        MediaFormat outputFormat2;
        jo.p.h(kVar, "mediaProjectionSource");
        jo.p.h(looper, "looper");
        jo.p.h(mediaFormat, "format");
        this.f63148w = kVar;
        this.f63149x = sink;
        this.f63150y = j10;
        this.E = -1;
        this.F = -1L;
        this.G = mediaFormat.getInteger("bitrate");
        this.H = 1.0d;
        this.J = -1;
        this.H = d10;
        if (this.f63151z == 0) {
            handler = new Handler(looper);
        } else {
            HandlerThread handlerThread = new HandlerThread(M);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
        }
        this.A = handler;
        this.I = handler.getLooper().getThread().getId();
        try {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(MimeTypes.VIDEO_H264);
            boolean z10 = true;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            this.C = createEncoderByType.createInputSurface();
            this.B = createEncoderByType;
            if (this.f63151z == 1) {
                createEncoderByType.setCallback(this, handler);
            }
            MediaCodec mediaCodec2 = this.B;
            if (mediaCodec2 != null) {
                mediaCodec2.start();
            }
            if (this.f63151z == 0) {
                h();
            }
            MediaCodec mediaCodec3 = this.B;
            if (mediaCodec3 == null || (outputFormat2 = mediaCodec3.getOutputFormat()) == null || !outputFormat2.containsKey("bitrate-mode")) {
                z10 = false;
            }
            if (!z10 || (mediaCodec = this.B) == null || (outputFormat = mediaCodec.getOutputFormat()) == null) {
                return;
            }
            this.J = outputFormat.getInteger("bitrate-mode");
        } catch (MediaCodec.CodecException e10) {
            n(e10);
            g9.a.c(e10);
        } catch (IOException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public static final void i(n nVar) {
        jo.p.h(nVar, "this$0");
        nVar.h();
    }

    public static final void o(n nVar) {
        jo.p.h(nVar, "this$0");
        nVar.e();
    }

    @Override // com.dena.showroom.flvplayback.Closeable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        n(null);
    }

    public final boolean d(double d10) {
        if (isClosed()) {
            return false;
        }
        if (this.H == d10) {
            return true;
        }
        Bundle bundle = new Bundle();
        int i10 = (int) (this.G * d10);
        g9.a.g("[video] change bitrate(on-the-fly) - " + this.G + " --> " + i10);
        bundle.putInt("video-bitrate", i10);
        try {
            MediaCodec mediaCodec = this.B;
            if (mediaCodec != null) {
                mediaCodec.setParameters(bundle);
            }
            return true;
        } catch (Exception e10) {
            g9.a.c(e10);
            return false;
        }
    }

    public final JSONObject d1() {
        MediaCodec mediaCodec = this.B;
        if (mediaCodec == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", mediaCodec.getName());
        if (Build.VERSION.SDK_INT >= 29) {
            jSONObject.put("is_hardware_accelerated", mediaCodec.getCodecInfo().isHardwareAccelerated());
            jSONObject.put("is_software_only", mediaCodec.getCodecInfo().isSoftwareOnly());
        }
        jSONObject.put("bitrate_mode", this.J);
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = mediaCodec.getCodecInfo().getCapabilitiesForType(MimeTypes.VIDEO_H264).getEncoderCapabilities();
        int[] iArr = {1, 2, 0};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr[i10];
            if (encoderCapabilities.isBitrateModeSupported(i11)) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        jSONObject.put("supported_bitrate_modes", a0.g0(arrayList, ",", null, null, 0, null, null, 62, null));
        jSONObject.put("media_codec_mode", this.f63151z);
        return jSONObject;
    }

    @Override // com.dena.showroom.flvplayback.SampleSource.Connection
    public boolean dequeueSample() {
        int i10;
        if (isClosed() || (i10 = this.E) == -1) {
            return false;
        }
        MediaCodec mediaCodec = this.B;
        if (mediaCodec != null) {
            mediaCodec.releaseOutputBuffer(i10, false);
        }
        this.E = -1;
        if (this.f63151z == 0) {
            q();
            return true;
        }
        return true;
    }

    public final void e() {
        try {
            MediaCodec mediaCodec = this.B;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
        } catch (IllegalStateException e10) {
            g9.a.c(e10);
        }
        MediaCodec mediaCodec2 = this.B;
        if (mediaCodec2 != null) {
            mediaCodec2.release();
        }
        this.B = null;
        if (this.f63151z == 1) {
            this.A.getLooper().quitSafely();
        }
    }

    @Override // com.dena.showroom.flvplayback.SampleSource.Connection
    public Sample getLastSample() {
        if (isClosed() || this.E == -1) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = this.D;
        if (bufferInfo != null) {
            long j10 = (bufferInfo.flags & 2) != 0 ? 257L : 256L;
            long j11 = (bufferInfo.presentationTimeUs / 1000) - this.F;
            return new Sample(j11, j11, j10, bufferInfo.size);
        }
        return null;
    }

    @Override // com.dena.showroom.flvplayback.SampleSource.Connection
    public ByteBuffer getLastSampleData() {
        int i10;
        MediaCodec mediaCodec;
        if (isClosed() || (i10 = this.E) == -1 || (mediaCodec = this.B) == null) {
            return null;
        }
        ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i10);
        MediaCodec.BufferInfo bufferInfo = this.D;
        if (bufferInfo != null) {
            if (outputBuffer != null) {
                outputBuffer.limit(bufferInfo.size + bufferInfo.offset);
            }
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo.offset);
            }
            return outputBuffer;
        }
        return null;
    }

    @Override // com.dena.showroom.flvplayback.impl.ThreadingPolicy.LooperAware
    public Looper getLooper() {
        Looper looper = this.A.getLooper();
        jo.p.g(looper, "handler.looper");
        return looper;
    }

    public final void h() {
        try {
            if (isClosed()) {
                return;
            }
            p();
            q();
        } finally {
            this.A.postDelayed(new Runnable() { // from class: ze.l
                @Override // java.lang.Runnable
                public final void run() {
                    n.i(n.this);
                }
            }, this.f63150y);
        }
    }

    public final boolean isClosed() {
        return this.B == null;
    }

    public final Surface j() {
        if (this.B == null) {
            return null;
        }
        return this.C;
    }

    public final void n(Throwable th2) {
        this.A.removeCallbacksAndMessages(null);
        if (Thread.currentThread().getId() != this.I) {
            Loopers.postAndWait(this.A, new Runnable() { // from class: ze.m
                @Override // java.lang.Runnable
                public final void run() {
                    n.o(n.this);
                }
            });
        } else {
            e();
        }
        SampleSource.Sink sink = this.f63149x;
        if (sink == null || th2 == null) {
            return;
        }
        sink.onCrash(this, th2);
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        jo.p.h(mediaCodec, "codec");
        jo.p.h(codecException, i7.e.f36387u);
        try {
            n(codecException.getCause());
        } catch (IllegalStateException e10) {
            n(e10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        jo.p.h(mediaCodec, "codec");
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        jo.p.h(mediaCodec, "codec");
        jo.p.h(bufferInfo, "info");
        try {
            this.E = i10;
            this.D = bufferInfo;
            if (this.F == -1) {
                long j10 = bufferInfo.presentationTimeUs;
                if (j10 != 0) {
                    this.F = j10 / 1000;
                }
            }
            SampleSource.Sink sink = this.f63149x;
            if (sink != null) {
                sink.onSampleProduced(this);
            }
        } catch (IllegalStateException e10) {
            n(e10);
        } catch (Exception e11) {
            n(e11);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        jo.p.h(mediaCodec, "codec");
        jo.p.h(mediaFormat, "format");
    }

    public final void p() {
        this.f63148w.d0();
    }

    public final void q() {
        int dequeueOutputBuffer;
        if (isClosed() || this.E != -1) {
            return;
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        while (true) {
            MediaCodec mediaCodec = this.B;
            if (mediaCodec == null) {
                return;
            }
            try {
                dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            } catch (IllegalStateException e10) {
                g9.a.c(e10);
            }
            if (dequeueOutputBuffer < 0) {
                return;
            }
            onOutputBufferAvailable(mediaCodec, dequeueOutputBuffer, bufferInfo);
        }
    }

    @Override // com.dena.showroom.flvplayback.SampleSource.Connection
    public boolean setBandwidth(double d10) {
        if (BlackList.canChangeBitrateOnTheFly()) {
            return d(d10);
        }
        return false;
    }

    public final void v(int i10) {
        this.f63151z = i10;
    }
}
