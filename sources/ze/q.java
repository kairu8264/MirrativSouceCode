package ze;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.audiofx.AutomaticGainControl;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import android.view.Surface;
import com.dena.showroom.flvplayback.Sample;
import com.dena.showroom.flvplayback.SampleSource;
import com.dena.showroom.flvplayback.impl.ThreadingPolicy;
import com.google.android.exoplayer2.util.MimeTypes;
import com.mirrativ.llstream.encoder.AACEncoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONObject;
import org.webrtc.voiceengine.WebRtcAudioMediator;
import org.webrtc.voiceengine.WebRtcAudioRecord;
import org.webrtc.voiceengine.WebRtcAudioTrack;
import org.webrtc.voiceengine.WebRtcAudioUtils;
import ye.n;
import ze.p;
import ze.q;

/* loaded from: classes2.dex */
public final class q extends MediaCodec.Callback implements p.a, ThreadingPolicy.LooperAware {
    public static final a L = new a(null);
    public static final int M = 8;
    public static final String N = q.class.getSimpleName();
    public Handler A;
    public MediaCodec B;
    public SampleSource.Sink C;
    public MediaCodec.BufferInfo D;
    public int E;
    public long F;
    public b G;
    public n.a H;
    public int I;
    public long J;
    public o K;

    /* renamed from: w  reason: collision with root package name */
    public final AudioManager f63163w;

    /* renamed from: x  reason: collision with root package name */
    public int f63164x;

    /* renamed from: y  reason: collision with root package name */
    public int f63165y;

    /* renamed from: z  reason: collision with root package name */
    public AudioRecord f63166z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public final class b extends Thread {

        /* renamed from: w  reason: collision with root package name */
        public volatile boolean f63167w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ q f63168x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q qVar, String str) {
            super(str);
            jo.p.h(str, "name");
            this.f63168x = qVar;
        }

        public static final void d(q qVar) {
            jo.p.h(qVar, "this$0");
            qVar.n();
        }

        public static final void e(q qVar, Exception exc) {
            jo.p.h(qVar, "this$0");
            jo.p.h(exc, "$ex");
            qVar.j(exc);
        }

        public final void c() {
            this.f63167w = false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            MediaCodec mediaCodec;
            Process.setThreadPriority(-19);
            this.f63167w = true;
            while (this.f63167w && (mediaCodec = this.f63168x.B) != null) {
                try {
                    int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(10L);
                    if (dequeueInputBuffer != -1) {
                        this.f63168x.onInputBufferAvailable(mediaCodec, dequeueInputBuffer);
                        Handler handler = this.f63168x.A;
                        if (handler != null) {
                            final q qVar = this.f63168x;
                            handler.post(new Runnable() { // from class: ze.r
                                @Override // java.lang.Runnable
                                public final void run() {
                                    q.b.d(q.this);
                                }
                            });
                        }
                    }
                } catch (Exception e10) {
                    Handler handler2 = this.f63168x.A;
                    if (handler2 != null) {
                        final q qVar2 = this.f63168x;
                        handler2.post(new Runnable() { // from class: ze.s
                            @Override // java.lang.Runnable
                            public final void run() {
                                q.b.e(q.this, e10);
                            }
                        });
                        return;
                    }
                    return;
                }
            }
        }
    }

    static {
        System.loadLibrary("voice-analyzer");
    }

    public q(AudioManager audioManager) {
        jo.p.h(audioManager, "audioManager");
        this.f63163w = audioManager;
        this.f63165y = -1;
        this.E = -1;
        this.F = -1L;
        this.I = 1024;
    }

    @Override // com.dena.showroom.flvplayback.Closeable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        j(null);
    }

    public final AudioRecord d() {
        if (this.f63166z == null) {
            try {
                this.f63166z = new AudioRecord.Builder().setAudioSource(e()).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(AACEncoder.SAMPLING_RATE).setChannelMask(16).build()).setBufferSizeInBytes(this.I * 2).build();
            } catch (UnsupportedOperationException unused) {
                this.f63166z = new AudioRecord(e(), AACEncoder.SAMPLING_RATE, 16, 2, this.I * 2);
            }
        }
        AudioRecord audioRecord = this.f63166z;
        jo.p.f(audioRecord, "null cannot be cast to non-null type android.media.AudioRecord");
        return audioRecord;
    }

    @Override // ze.p.a
    public JSONObject d1() {
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
        jSONObject.put("media_codec_mode", this.f63164x);
        return jSONObject;
    }

    @Override // com.dena.showroom.flvplayback.SampleSource.Connection
    public boolean dequeueSample() {
        int i10;
        MediaCodec mediaCodec = this.B;
        if (mediaCodec == null || (i10 = this.E) == -1) {
            return false;
        }
        if (mediaCodec != null) {
            mediaCodec.releaseOutputBuffer(i10, false);
        }
        this.E = -1;
        if (this.f63164x == 0) {
            n();
            return true;
        }
        return true;
    }

    public final int e() {
        return this.f63163w.isWiredHeadsetOn() ? 0 : 5;
    }

    @Override // com.dena.showroom.flvplayback.SampleSource.Connection
    public Sample getLastSample() {
        if (this.B == null || this.E == -1) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = this.D;
        jo.p.e(bufferInfo);
        long j10 = (bufferInfo.flags & 2) != 0 ? 513L : 512L;
        MediaCodec.BufferInfo bufferInfo2 = this.D;
        jo.p.e(bufferInfo2);
        long j11 = (bufferInfo2.presentationTimeUs / 1000) - this.F;
        MediaCodec.BufferInfo bufferInfo3 = this.D;
        jo.p.e(bufferInfo3);
        return new Sample(j11, j11, j10, bufferInfo3.size);
    }

    @Override // com.dena.showroom.flvplayback.SampleSource.Connection
    public ByteBuffer getLastSampleData() {
        int i10;
        MediaCodec mediaCodec = this.B;
        if (mediaCodec == null || (i10 = this.E) == -1) {
            return null;
        }
        ByteBuffer outputBuffer = mediaCodec != null ? mediaCodec.getOutputBuffer(i10) : null;
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
        Handler handler = this.A;
        jo.p.e(handler);
        Looper looper = handler.getLooper();
        jo.p.g(looper, "handler!!.looper");
        return looper;
    }

    public final int h() {
        if (this.f63165y == -1) {
            this.f63165y = AudioRecord.getMinBufferSize(AACEncoder.SAMPLING_RATE, 16, 2);
        }
        return this.f63165y;
    }

    public final void i(Looper looper, SampleSource.Sink sink, MediaFormat mediaFormat, o oVar, n.a aVar) {
        Handler handler;
        AutomaticGainControl create;
        jo.p.h(looper, "looper");
        if (this.f63164x == 0) {
            handler = new Handler(looper);
        } else {
            HandlerThread handlerThread = new HandlerThread(N, -19);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
        }
        this.A = handler;
        this.C = sink;
        this.K = oVar;
        this.H = aVar;
        this.I = Math.min(this.I, h() / 2);
        try {
            WebRtcAudioUtils.setWebRtcBasedAcousticEchoCanceler(true);
            WebRtcAudioUtils.setWebRtcBasedNoiseSuppressor(false);
            WebRtcAudioUtils.setWebRtcBasedAutomaticGainControl(false);
            WebRtcAudioTrack.setAudioTrackUsageAttribute(2);
            WebRtcAudioMediator.getInstance().startMediation(d());
            if (AutomaticGainControl.isAvailable() && (create = AutomaticGainControl.create(d().getAudioSessionId())) != null) {
                create.setEnabled(false);
            }
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(MimeTypes.AUDIO_AAC);
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            this.B = createEncoderByType;
            if (this.f63164x == 1) {
                createEncoderByType.setCallback(this, this.A);
            }
            d().startRecording();
            MediaCodec mediaCodec = this.B;
            if (mediaCodec != null) {
                mediaCodec.start();
            }
            if (this.f63164x == 0) {
                b bVar = new b(this, "AudioRecordLoop");
                this.G = bVar;
                bVar.start();
            }
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public final boolean isClosed() {
        return this.B == null;
    }

    public final void j(Throwable th2) {
        Looper looper;
        WebRtcAudioMediator.getInstance().setAudioRecord(null);
        Handler handler = this.A;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        b bVar = this.G;
        if (bVar != null) {
            bVar.c();
        }
        b bVar2 = this.G;
        if (bVar2 != null) {
            bVar2.interrupt();
        }
        this.G = null;
        try {
            Thread.sleep(100L);
        } catch (Throwable unused) {
        }
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
        d().stop();
        d().release();
        this.f63166z = null;
        SampleSource.Sink sink = this.C;
        if (sink != null && th2 != null && sink != null) {
            sink.onCrash(this, th2);
        }
        if (this.f63164x == 1) {
            Handler handler2 = this.A;
            if (handler2 != null && (looper = handler2.getLooper()) != null) {
                looper.quitSafely();
            }
            this.A = null;
        }
    }

    public final void n() {
        MediaCodec mediaCodec;
        int dequeueOutputBuffer;
        if (isClosed() || this.E != -1) {
            return;
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        while (true) {
            try {
                mediaCodec = this.B;
            } catch (IllegalStateException e10) {
                j(e10);
            } catch (NullPointerException e11) {
                j(e11);
            }
            if (mediaCodec == null || (dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L)) < 0) {
                return;
            }
            onOutputBufferAvailable(mediaCodec, dequeueOutputBuffer, bufferInfo);
        }
    }

    public final void o(int i10) {
        this.f63164x = i10;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        jo.p.h(mediaCodec, "codec");
        jo.p.h(codecException, i7.e.f36387u);
        j(codecException.getCause());
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        int i11;
        String str;
        jo.p.h(mediaCodec, "codec");
        try {
            ByteBuffer inputBuffer = mediaCodec.getInputBuffer(i10);
            if (inputBuffer == null) {
                return;
            }
            WebRtcAudioMediator webRtcAudioMediator = WebRtcAudioMediator.getInstance();
            byte[] bArr = new byte[this.I * 2];
            boolean z10 = true;
            if (webRtcAudioMediator.getWebRtcAudioRecord() != null) {
                try {
                    WebRtcAudioRecord webRtcAudioRecord = webRtcAudioMediator.getWebRtcAudioRecord();
                    AudioRecord d10 = d();
                    o oVar = this.K;
                    if (oVar == null || !oVar.a()) {
                        z10 = false;
                    }
                    i11 = webRtcAudioRecord.readAudioRecord(d10, bArr, z10);
                } catch (Exception e10) {
                    Log.w(N, e10);
                    i11 = -1;
                }
            } else {
                i11 = d().read(bArr, 0, this.I * 2);
                if (i11 > 0) {
                    o oVar2 = this.K;
                    if (oVar2 == null || !oVar2.a()) {
                        z10 = false;
                    }
                    if (z10) {
                        Arrays.fill(bArr, 0, i11, (byte) 0);
                    }
                }
            }
            if (i11 > 0) {
                inputBuffer.put(bArr, 0, i11);
                long p10 = this.J + p(i11 / 2);
                this.J = p10;
                mediaCodec.queueInputBuffer(i10, 0, i11, p10, 0);
                n.a aVar = this.H;
                if (aVar != null) {
                    aVar.onAudioLoaded(bArr);
                    return;
                }
                return;
            }
            if (i11 == -6) {
                str = "ERROR_DEAD_OBJECT";
            } else if (i11 == -3) {
                str = "ERROR_INVALID_OPERATION";
            } else if (i11 == -2) {
                str = "ERROR_BAD_VALUE";
            } else if (i11 != -1) {
                str = "ERROR(" + i11 + ')';
            } else {
                str = "ERROR";
            }
            Log.w(N + "#read", str);
        } catch (IllegalStateException e11) {
            Log.w(N, e11);
        }
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
            SampleSource.Sink sink = this.C;
            if (sink != null) {
                sink.onSampleProduced(this);
            }
        } catch (IllegalStateException e10) {
            Log.w(N, e10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        jo.p.h(mediaCodec, "codec");
        jo.p.h(mediaFormat, "format");
    }

    public final long p(int i10) {
        return (i10 / 44100.0f) * 1000000.0f;
    }

    @Override // com.dena.showroom.flvplayback.SampleSource.Connection
    public boolean setBandwidth(double d10) {
        return false;
    }
}
