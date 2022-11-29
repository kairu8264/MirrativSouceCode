package ze;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.audiofx.AutomaticGainControl;
import android.media.projection.MediaProjection;
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
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Arrays;
import org.json.JSONObject;
import org.webrtc.voiceengine.WebRtcAudioMediator;
import org.webrtc.voiceengine.WebRtcAudioRecord;
import org.webrtc.voiceengine.WebRtcAudioTrack;
import org.webrtc.voiceengine.WebRtcAudioUtils;
import ye.n;
import ze.p;
import ze.t;

/* loaded from: classes2.dex */
public final class t extends MediaCodec.Callback implements p.a, ThreadingPolicy.LooperAware {
    public static final a N = new a(null);
    public static final int O = 8;
    public static final String P = t.class.getSimpleName();
    public AudioRecord A;
    public final wn.f B;
    public Handler C;
    public MediaCodec D;
    public SampleSource.Sink E;
    public MediaCodec.BufferInfo F;
    public int G;
    public long H;
    public b I;
    public n.a J;
    public int K;
    public long L;
    public o M;

    /* renamed from: w  reason: collision with root package name */
    public final MediaProjection f63172w;

    /* renamed from: x  reason: collision with root package name */
    public final AudioManager f63173x;

    /* renamed from: y  reason: collision with root package name */
    public int f63174y;

    /* renamed from: z  reason: collision with root package name */
    public int f63175z;

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
        public volatile boolean f63176w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ t f63177x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar, String str) {
            super(str);
            jo.p.h(str, "name");
            this.f63177x = tVar;
        }

        public static final void d(t tVar) {
            jo.p.h(tVar, "this$0");
            tVar.v();
        }

        public static final void e(t tVar, Exception exc) {
            jo.p.h(tVar, "this$0");
            jo.p.h(exc, "$ex");
            tVar.p(exc);
        }

        public final void c() {
            this.f63176w = false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            MediaCodec mediaCodec;
            Process.setThreadPriority(-19);
            this.f63176w = true;
            while (this.f63176w && (mediaCodec = this.f63177x.D) != null) {
                try {
                    int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(10L);
                    if (dequeueInputBuffer != -1) {
                        this.f63177x.onInputBufferAvailable(mediaCodec, dequeueInputBuffer);
                        Handler handler = this.f63177x.C;
                        if (handler != null) {
                            final t tVar = this.f63177x;
                            handler.post(new Runnable() { // from class: ze.u
                                @Override // java.lang.Runnable
                                public final void run() {
                                    t.b.d(t.this);
                                }
                            });
                        }
                    }
                } catch (Exception e10) {
                    Handler handler2 = this.f63177x.C;
                    if (handler2 != null) {
                        final t tVar2 = this.f63177x;
                        handler2.post(new Runnable() { // from class: ze.v
                            @Override // java.lang.Runnable
                            public final void run() {
                                t.b.e(t.this, e10);
                            }
                        });
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<AudioRecord> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final AudioRecord invoke() {
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    return new AudioRecord.Builder().setAudioPlaybackCaptureConfig(new AudioPlaybackCaptureConfiguration.Builder(t.this.f63172w).addMatchingUsage(1).addMatchingUsage(14).addMatchingUsage(0).build()).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(AACEncoder.SAMPLING_RATE).setChannelMask(16).build()).setBufferSizeInBytes(t.this.K * 2).build();
                } catch (UnsupportedOperationException unused) {
                    return null;
                }
            }
            return null;
        }
    }

    static {
        System.loadLibrary("voice-analyzer");
    }

    public t(MediaProjection mediaProjection, AudioManager audioManager) {
        jo.p.h(mediaProjection, "projection");
        jo.p.h(audioManager, "audioManager");
        this.f63172w = mediaProjection;
        this.f63173x = audioManager;
        this.f63175z = -1;
        this.B = wn.g.a(new c());
        this.G = -1;
        this.H = -1L;
        this.K = 1024;
    }

    public final long C(int i10) {
        return (i10 / 44100.0f) * 1000000.0f;
    }

    @Override // com.dena.showroom.flvplayback.Closeable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        p(null);
    }

    @Override // ze.p.a
    public JSONObject d1() {
        MediaCodec mediaCodec = this.D;
        if (mediaCodec == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", mediaCodec.getName());
        if (Build.VERSION.SDK_INT >= 29) {
            jSONObject.put("is_hardware_accelerated", mediaCodec.getCodecInfo().isHardwareAccelerated());
            jSONObject.put("is_software_only", mediaCodec.getCodecInfo().isSoftwareOnly());
        }
        jSONObject.put("media_codec_mode", this.f63174y);
        return jSONObject;
    }

    @Override // com.dena.showroom.flvplayback.SampleSource.Connection
    public boolean dequeueSample() {
        int i10;
        MediaCodec mediaCodec = this.D;
        if (mediaCodec == null || (i10 = this.G) == -1) {
            return false;
        }
        if (mediaCodec != null) {
            mediaCodec.releaseOutputBuffer(i10, false);
        }
        this.G = -1;
        if (this.f63174y == 0) {
            v();
            return true;
        }
        return true;
    }

    @Override // com.dena.showroom.flvplayback.SampleSource.Connection
    public Sample getLastSample() {
        if (this.D == null || this.G == -1) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = this.F;
        jo.p.e(bufferInfo);
        long j10 = (bufferInfo.flags & 2) != 0 ? 513L : 512L;
        MediaCodec.BufferInfo bufferInfo2 = this.F;
        jo.p.e(bufferInfo2);
        long j11 = (bufferInfo2.presentationTimeUs / 1000) - this.H;
        MediaCodec.BufferInfo bufferInfo3 = this.F;
        jo.p.e(bufferInfo3);
        return new Sample(j11, j11, j10, bufferInfo3.size);
    }

    @Override // com.dena.showroom.flvplayback.SampleSource.Connection
    public ByteBuffer getLastSampleData() {
        int i10;
        MediaCodec mediaCodec = this.D;
        if (mediaCodec == null || (i10 = this.G) == -1) {
            return null;
        }
        ByteBuffer outputBuffer = mediaCodec != null ? mediaCodec.getOutputBuffer(i10) : null;
        MediaCodec.BufferInfo bufferInfo = this.F;
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
        Handler handler = this.C;
        jo.p.e(handler);
        Looper looper = handler.getLooper();
        jo.p.g(looper, "handler!!.looper");
        return looper;
    }

    public final AudioRecord h() {
        return (AudioRecord) this.B.getValue();
    }

    public final AudioRecord i() {
        if (this.A == null) {
            try {
                this.A = new AudioRecord.Builder().setAudioSource(j()).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(AACEncoder.SAMPLING_RATE).setChannelMask(16).build()).setBufferSizeInBytes(this.K * 2).build();
            } catch (UnsupportedOperationException unused) {
                this.A = new AudioRecord(j(), AACEncoder.SAMPLING_RATE, 16, 2, this.K * 2);
            }
        }
        AudioRecord audioRecord = this.A;
        jo.p.f(audioRecord, "null cannot be cast to non-null type android.media.AudioRecord");
        return audioRecord;
    }

    public final boolean isClosed() {
        return this.D == null;
    }

    public final int j() {
        return this.f63173x.isWiredHeadsetOn() ? 0 : 5;
    }

    public final int n() {
        if (this.f63175z == -1) {
            this.f63175z = AudioRecord.getMinBufferSize(AACEncoder.SAMPLING_RATE, 16, 2);
        }
        return this.f63175z;
    }

    public final void o(Looper looper, SampleSource.Sink sink, MediaFormat mediaFormat, o oVar, n.a aVar) {
        Handler handler;
        AutomaticGainControl create;
        jo.p.h(looper, "looper");
        if (this.f63174y == 0) {
            handler = new Handler(looper);
        } else {
            HandlerThread handlerThread = new HandlerThread(P, -19);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
        }
        this.C = handler;
        this.E = sink;
        this.M = oVar;
        this.J = aVar;
        this.K = Math.min(this.K, n() / 2);
        boolean z10 = true;
        try {
            WebRtcAudioUtils.setWebRtcBasedAcousticEchoCanceler(true);
            WebRtcAudioUtils.setWebRtcBasedNoiseSuppressor(false);
            WebRtcAudioUtils.setWebRtcBasedAutomaticGainControl(false);
            WebRtcAudioTrack.setAudioTrackUsageAttribute(1);
            WebRtcAudioMediator.getInstance().startMediation(i());
            if (AutomaticGainControl.isAvailable() && (create = AutomaticGainControl.create(i().getAudioSessionId())) != null) {
                create.setEnabled(false);
            }
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(MimeTypes.AUDIO_AAC);
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            this.D = createEncoderByType;
            if (this.f63174y == 1) {
                createEncoderByType.setCallback(this, this.C);
            }
            i().startRecording();
            AudioRecord h10 = h();
            if (h10 == null || h10.getState() != 1) {
                z10 = false;
            }
            if (z10) {
                AudioRecord h11 = h();
                if (h11 != null) {
                    h11.startRecording();
                }
            } else {
                g9.a aVar2 = g9.a.f32826a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("appAudioRecord start failed state = ");
                AudioRecord h12 = h();
                sb2.append(h12 != null ? Integer.valueOf(h12.getState()) : null);
                aVar2.b(sb2.toString(), new Object[0]);
            }
            MediaCodec mediaCodec = this.D;
            if (mediaCodec != null) {
                mediaCodec.start();
            }
            if (this.f63174y == 0) {
                b bVar = new b(this, "AudioRecordLoop");
                this.I = bVar;
                bVar.start();
            }
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        jo.p.h(mediaCodec, "codec");
        jo.p.h(codecException, i7.e.f36387u);
        p(codecException.getCause());
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        int i11;
        int readAudioRecord;
        String str;
        jo.p.h(mediaCodec, "codec");
        try {
            ByteBuffer inputBuffer = mediaCodec.getInputBuffer(i10);
            if (inputBuffer == null) {
                return;
            }
            WebRtcAudioMediator webRtcAudioMediator = WebRtcAudioMediator.getInstance();
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.K * 2);
            boolean z10 = true;
            if (webRtcAudioMediator.getWebRtcAudioRecord() != null) {
                try {
                    WebRtcAudioRecord webRtcAudioRecord = webRtcAudioMediator.getWebRtcAudioRecord();
                    AudioRecord i12 = i();
                    byte[] array = allocateDirect.array();
                    o oVar = this.M;
                    readAudioRecord = webRtcAudioRecord.readAudioRecord(i12, array, oVar != null && oVar.a());
                } catch (Exception e10) {
                    Log.w(P, e10);
                    i11 = -1;
                }
            } else {
                readAudioRecord = i().read(allocateDirect.array(), 0, this.K * 2);
            }
            i11 = readAudioRecord;
            if (i11 > 0) {
                n.a aVar = this.J;
                if (aVar != null) {
                    aVar.onAudioLoaded(allocateDirect.array());
                }
                jo.p.g(allocateDirect, "buffer");
                ByteBuffer q10 = q(allocateDirect, i11 / 2);
                o oVar2 = this.M;
                if (oVar2 == null || !oVar2.a()) {
                    z10 = false;
                }
                if (z10) {
                    Arrays.fill(q10.array(), 0, i11, (byte) 0);
                }
                inputBuffer.put(q10.array(), 0, i11);
                long C = C(i11 / 2) + this.L;
                this.L = C;
                mediaCodec.queueInputBuffer(i10, 0, i11, C, 0);
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
            Log.w(P + "#read", str);
        } catch (IllegalStateException e11) {
            Log.w(P, e11);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        jo.p.h(mediaCodec, "codec");
        jo.p.h(bufferInfo, "info");
        try {
            this.G = i10;
            this.F = bufferInfo;
            if (this.H == -1) {
                long j10 = bufferInfo.presentationTimeUs;
                if (j10 != 0) {
                    this.H = j10 / 1000;
                }
            }
            SampleSource.Sink sink = this.E;
            if (sink != null) {
                sink.onSampleProduced(this);
            }
        } catch (IllegalStateException e10) {
            Log.w(P, e10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        jo.p.h(mediaCodec, "codec");
        jo.p.h(mediaFormat, "format");
    }

    public final void p(Throwable th2) {
        Looper looper;
        WebRtcAudioMediator.getInstance().setAudioRecord(null);
        Handler handler = this.C;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        b bVar = this.I;
        if (bVar != null) {
            bVar.c();
        }
        b bVar2 = this.I;
        if (bVar2 != null) {
            bVar2.interrupt();
        }
        this.I = null;
        try {
            Thread.sleep(100L);
        } catch (Throwable unused) {
        }
        try {
            MediaCodec mediaCodec = this.D;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
        } catch (IllegalStateException e10) {
            g9.a.c(e10);
        }
        MediaCodec mediaCodec2 = this.D;
        if (mediaCodec2 != null) {
            mediaCodec2.release();
        }
        this.D = null;
        try {
            i().stop();
            i().release();
        } catch (IllegalStateException e11) {
            g9.a.c(e11);
        }
        this.A = null;
        try {
            AudioRecord h10 = h();
            if (h10 != null) {
                h10.stop();
            }
            AudioRecord h11 = h();
            if (h11 != null) {
                h11.release();
            }
        } catch (IllegalStateException e12) {
            g9.a.c(e12);
        }
        SampleSource.Sink sink = this.E;
        if (sink != null && th2 != null && sink != null) {
            sink.onCrash(this, th2);
        }
        if (this.f63174y == 1) {
            Handler handler2 = this.C;
            if (handler2 != null && (looper = handler2.getLooper()) != null) {
                looper.quitSafely();
            }
            this.C = null;
        }
    }

    public final ByteBuffer q(ByteBuffer byteBuffer, int i10) {
        if (h() != null) {
            AudioRecord h10 = h();
            boolean z10 = true;
            if (h10 != null && h10.getState() == 1) {
                ByteBuffer wrap = ByteBuffer.wrap(byteBuffer.array());
                ShortBuffer asShortBuffer = wrap.order(ByteOrder.LITTLE_ENDIAN).asShortBuffer();
                ShortBuffer allocate = ShortBuffer.allocate(i10);
                AudioRecord h11 = h();
                int read = h11 != null ? h11.read(allocate.array(), 0, i10) : -1;
                float streamMaxVolume = this.f63173x.getStreamMaxVolume(3);
                float streamVolume = this.f63173x.getStreamVolume(3);
                if (read >= 0 && this.f63173x.isWiredHeadsetOn()) {
                    o oVar = this.M;
                    if ((oVar == null || oVar.a()) ? false : false) {
                        for (int i11 = 0; i11 < i10; i11++) {
                            int i12 = asShortBuffer.get(i11) + ((int) (allocate.get(i11) * ((streamVolume * 0.25d) / streamMaxVolume)));
                            if (32767 < i12) {
                                i12 = 32767;
                            } else if (i12 < -32768) {
                                i12 = -32768;
                            }
                            asShortBuffer.put(i11, (short) i12);
                        }
                        jo.p.g(wrap, "mixedBuffer");
                        return wrap;
                    }
                }
            }
        }
        return byteBuffer;
    }

    @Override // com.dena.showroom.flvplayback.SampleSource.Connection
    public boolean setBandwidth(double d10) {
        return false;
    }

    public final void v() {
        MediaCodec mediaCodec;
        int dequeueOutputBuffer;
        if (isClosed() || this.G != -1) {
            return;
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        while (true) {
            try {
                mediaCodec = this.D;
            } catch (IllegalStateException e10) {
                p(e10);
            } catch (NullPointerException e11) {
                p(e11);
            }
            if (mediaCodec == null || (dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L)) < 0) {
                return;
            }
            onOutputBufferAvailable(mediaCodec, dequeueOutputBuffer, bufferInfo);
        }
    }

    public final void z(int i10) {
        this.f63174y = i10;
    }
}
