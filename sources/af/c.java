package af;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.audiofx.AutomaticGainControl;
import android.os.Build;
import cf.h;
import co.l;
import com.mirrativ.llstream.encoder.AACEncoder;
import io.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import jo.q;
import org.webrtc.voiceengine.WebRtcAudioMediator;
import org.webrtc.voiceengine.WebRtcAudioTrack;
import org.webrtc.voiceengine.WebRtcAudioUtils;
import uo.b1;
import uo.d2;
import uo.i2;
import uo.q0;
import uo.r0;
import uo.s1;
import uo.u1;
import wn.m;
import wn.v;
import ze.o;

/* loaded from: classes2.dex */
public final class c implements af.a {

    /* renamed from: q  reason: collision with root package name */
    public static final a f1522q = new a(null);

    /* renamed from: r  reason: collision with root package name */
    public static final int f1523r = 8;

    /* renamed from: a  reason: collision with root package name */
    public final q0 f1524a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1525b;

    /* renamed from: c  reason: collision with root package name */
    public final AudioManager f1526c;

    /* renamed from: d  reason: collision with root package name */
    public final o f1527d;

    /* renamed from: e  reason: collision with root package name */
    public h f1528e;

    /* renamed from: f  reason: collision with root package name */
    public af.b f1529f;

    /* renamed from: g  reason: collision with root package name */
    public final s1 f1530g;

    /* renamed from: h  reason: collision with root package name */
    public final s1 f1531h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1532i;

    /* renamed from: j  reason: collision with root package name */
    public d2 f1533j;

    /* renamed from: k  reason: collision with root package name */
    public d2 f1534k;

    /* renamed from: l  reason: collision with root package name */
    public nk.b f1535l;

    /* renamed from: m  reason: collision with root package name */
    public nk.b f1536m;

    /* renamed from: n  reason: collision with root package name */
    public AtomicBoolean f1537n;

    /* renamed from: o  reason: collision with root package name */
    public AudioRecord f1538o;

    /* renamed from: p  reason: collision with root package name */
    public final wn.f f1539p;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<AudioRecord> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ AudioPlaybackCaptureConfiguration f1540w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AudioPlaybackCaptureConfiguration audioPlaybackCaptureConfiguration) {
            super(0);
            this.f1540w = audioPlaybackCaptureConfiguration;
        }

        @Override // io.a
        /* renamed from: a */
        public final AudioRecord invoke() {
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    if (this.f1540w != null) {
                        return new AudioRecord.Builder().setAudioPlaybackCaptureConfig(this.f1540w).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(AACEncoder.SAMPLING_RATE).setChannelMask(16).build()).setBufferSizeInBytes(2048).build();
                    }
                    return null;
                } catch (UnsupportedOperationException unused) {
                    return null;
                }
            }
            return null;
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.recorder.encoder.v2.LlWebRtcAudioSource", f = "LlWebRtcAudioSource.kt", l = {227}, m = "readLoop")
    /* renamed from: af.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0034c extends co.d {
        public int A;
        public int B;
        public /* synthetic */ Object C;
        public int E;

        /* renamed from: w  reason: collision with root package name */
        public Object f1541w;

        /* renamed from: x  reason: collision with root package name */
        public Object f1542x;

        /* renamed from: y  reason: collision with root package name */
        public Object f1543y;

        /* renamed from: z  reason: collision with root package name */
        public Object f1544z;

        public C0034c(ao.d<? super C0034c> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.C = obj;
            this.E |= Integer.MIN_VALUE;
            return c.this.r(this);
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.recorder.encoder.v2.LlWebRtcAudioSource$setUp$1", f = "LlWebRtcAudioSource.kt", l = {149}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1545w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f1546x;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f1546x = obj;
            return dVar2;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            q0 q0Var;
            Object c10 = bo.c.c();
            int i10 = this.f1545w;
            if (i10 == 0) {
                m.b(obj);
                q0Var = (q0) this.f1546x;
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                q0Var = (q0) this.f1546x;
                m.b(obj);
            }
            do {
                r0.f(q0Var);
                if (c.this.f1535l.a() < 1.0d) {
                    c.this.f1535l.b(c.this.f1526c.getStreamMaxVolume(3));
                }
                c.this.f1536m.b(c.this.f1526c.getStreamVolume(3));
                c.this.f1537n.set(c.this.f1526c.isWiredHeadsetOn());
                this.f1546x = q0Var;
                this.f1545w = 1;
            } while (b1.a(250L, this) != c10);
            return c10;
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.recorder.encoder.v2.LlWebRtcAudioSource$setUp$2", f = "LlWebRtcAudioSource.kt", l = {154}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1548w;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f1548w;
            if (i10 == 0) {
                m.b(obj);
                c cVar = c.this;
                this.f1548w = 1;
                if (cVar.r(this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    static {
        System.loadLibrary("voice-analyzer");
    }

    public c(q0 q0Var, boolean z10, AudioManager audioManager, AudioPlaybackCaptureConfiguration audioPlaybackCaptureConfiguration) {
        jo.p.h(q0Var, "coroutineScope");
        jo.p.h(audioManager, "audioManager");
        this.f1524a = q0Var;
        this.f1525b = z10;
        this.f1526c = audioManager;
        this.f1527d = new o();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new wh.a("WebRTCAudioSourceV2-Capture"));
        jo.p.g(newSingleThreadExecutor, "newSingleThreadExecutor(…CAudioSourceV2-Capture\"))");
        this.f1530g = u1.a(newSingleThreadExecutor);
        ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor(new wh.a("WebRTCAudioSourceV2-Monitor"));
        jo.p.g(newSingleThreadExecutor2, "newSingleThreadExecutor(…CAudioSourceV2-Monitor\"))");
        this.f1531h = u1.a(newSingleThreadExecutor2);
        this.f1535l = new nk.b(0.0d);
        this.f1536m = new nk.b(0.0d);
        this.f1537n = new AtomicBoolean(false);
        this.f1539p = wn.g.a(new b(audioPlaybackCaptureConfiguration));
    }

    @Override // af.e
    public o a() {
        return this.f1527d;
    }

    @Override // af.e
    public void b(h hVar) {
        this.f1528e = hVar;
    }

    @Override // af.e
    public void c() {
        d2 d10;
        d2 d11;
        s(m());
        m().startRecording();
        AudioRecord l10 = l();
        boolean z10 = true;
        if (l10 == null || l10.getState() != 1) {
            z10 = false;
        }
        if (z10) {
            AudioRecord l11 = l();
            if (l11 != null) {
                l11.startRecording();
            }
        } else {
            g9.a aVar = g9.a.f32826a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("appAudioRecord start failed state = ");
            AudioRecord l12 = l();
            sb2.append(l12 != null ? Integer.valueOf(l12.getState()) : null);
            aVar.b(sb2.toString(), new Object[0]);
        }
        d10 = uo.l.d(this.f1524a, this.f1531h, null, new d(null), 2, null);
        this.f1534k = d10;
        d11 = uo.l.d(this.f1524a, this.f1530g, null, new e(null), 2, null);
        this.f1533j = d11;
    }

    @Override // af.a
    public void d(af.b bVar) {
        this.f1529f = bVar;
    }

    public final AudioRecord l() {
        return (AudioRecord) this.f1539p.getValue();
    }

    public final AudioRecord m() {
        if (this.f1538o == null) {
            try {
                this.f1538o = new AudioRecord.Builder().setAudioSource(n()).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(AACEncoder.SAMPLING_RATE).setChannelMask(16).build()).setBufferSizeInBytes(2048).build();
            } catch (UnsupportedOperationException unused) {
                this.f1538o = new AudioRecord(n(), AACEncoder.SAMPLING_RATE, 16, 2, 2048);
            }
        }
        AudioRecord audioRecord = this.f1538o;
        jo.p.f(audioRecord, "null cannot be cast to non-null type android.media.AudioRecord");
        return audioRecord;
    }

    public final int n() {
        return this.f1526c.isWiredHeadsetOn() ? 0 : 5;
    }

    public af.b o() {
        return this.f1529f;
    }

    public h p() {
        return this.f1528e;
    }

    public final ByteBuffer q(ByteBuffer byteBuffer, int i10) {
        if (this.f1525b && l() != null) {
            AudioRecord l10 = l();
            boolean z10 = true;
            if (((l10 == null || l10.getState() != 1) ? false : false) && this.f1537n.get() && !a().a()) {
                ByteBuffer wrap = ByteBuffer.wrap(byteBuffer.array());
                ShortBuffer asShortBuffer = wrap.order(ByteOrder.LITTLE_ENDIAN).asShortBuffer();
                ShortBuffer allocate = ShortBuffer.allocate(i10);
                AudioRecord l11 = l();
                if ((l11 != null ? l11.read(allocate.array(), 0, i10) : -1) >= 0) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        int a10 = asShortBuffer.get(i11) + ((int) (allocate.get(i11) * ((this.f1536m.a() * 0.25d) / this.f1535l.a())));
                        if (32767 < a10) {
                            a10 = 32767;
                        } else if (a10 < -32768) {
                            a10 = -32768;
                        }
                        asShortBuffer.put(i11, (short) a10);
                    }
                    jo.p.g(wrap, "mixedBuffer");
                    return wrap;
                }
            }
        }
        return byteBuffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0179 -> B:12:0x003d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(ao.d<? super wn.v> r14) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: af.c.r(ao.d):java.lang.Object");
    }

    @Override // af.e
    public void release() {
        this.f1532i = false;
        m().stop();
        AudioRecord l10 = l();
        if (l10 != null) {
            l10.stop();
        }
        d2 d2Var = this.f1534k;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.f1534k = null;
        d2 d2Var2 = this.f1533j;
        if (d2Var2 != null) {
            d2.a.a(d2Var2, null, 1, null);
        }
        this.f1533j = null;
        i2.e(this.f1530g, null, 1, null);
        i2.e(this.f1531h, null, 1, null);
        WebRtcAudioMediator.getInstance().setAudioRecord(null);
        WebRtcAudioMediator.getInstance().stopMediation();
    }

    public final void s(AudioRecord audioRecord) {
        AutomaticGainControl create;
        WebRtcAudioUtils.setWebRtcBasedAcousticEchoCanceler(true);
        WebRtcAudioUtils.setWebRtcBasedNoiseSuppressor(false);
        WebRtcAudioUtils.setWebRtcBasedAutomaticGainControl(false);
        WebRtcAudioTrack.setAudioTrackUsageAttribute(1);
        WebRtcAudioMediator.getInstance().startMediation(audioRecord);
        if (!AutomaticGainControl.isAvailable() || (create = AutomaticGainControl.create(audioRecord.getAudioSessionId())) == null) {
            return;
        }
        create.setEnabled(true);
    }
}
