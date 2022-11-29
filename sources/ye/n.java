package ye;

import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.showroom.flvplayback.FLVPublisher;
import com.dena.showroom.flvplayback.RTMPEndpoint;
import com.dena.showroom.flvplayback.Size;
import com.dena.showroom.flvplayback.impl.net.AsyncSocketLooper;
import com.dena.showroom.flvplayback.impl.publish.AudioEncoderSetting;
import com.dena.showroom.flvplayback.impl.publish.Publisher;
import com.dena.showroom.flvplayback.impl.publish.VideoEncoderSetting;
import com.dena.showroom.flvplayback.impl.util.Loopers;
import java.io.IOException;
import jo.f0;
import jo.q;
import oq.a;
import org.json.JSONObject;
import org.webrtc.voiceengine.WebRtcAudioMediator;
import vd.a;
import xn.s;
import ze.b;
import ze.k;
import ze.p;

/* loaded from: classes2.dex */
public final class n implements k.a, FLVPublisher.Callback, oq.a {
    public static final b X = new b(null);
    public static final int Y = 8;
    public boolean A;
    public boolean B;
    public Publisher C;
    public p D;
    public ze.k E;
    public AsyncSocketLooper F;
    public HandlerThread G;
    public Handler H;
    public ye.c I;
    public VideoEncoderSetting J;
    public AudioEncoderSetting K;
    public d L;
    public Handler M;
    public boolean N;
    public boolean O;
    public final Handler P;
    public boolean Q;
    public long R;
    public int S;
    public final wn.f T;
    public int U;
    public int V;
    public int W;

    /* renamed from: w  reason: collision with root package name */
    public final Context f61835w;

    /* renamed from: x  reason: collision with root package name */
    public final MediaProjectionManager f61836x;

    /* renamed from: y  reason: collision with root package name */
    public a f61837y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f61838z;

    /* loaded from: classes2.dex */
    public interface a {
        void onAudioLoaded(byte[] bArr);
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public enum c {
        Audio,
        Video
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a();

        void onError(Throwable th2);
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f61839a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.Audio.ordinal()] = 1;
            iArr[c.Video.ordinal()] = 2;
            f61839a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f61840w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f61841x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f61842y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f61840w = aVar;
            this.f61841x = aVar2;
            this.f61842y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            xq.a b10;
            oq.a aVar = this.f61840w;
            vq.a aVar2 = this.f61841x;
            io.a<? extends uq.a> aVar3 = this.f61842y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(MRLogger.class), aVar2, aVar3);
        }
    }

    public n(Context context, MediaProjectionManager mediaProjectionManager) {
        jo.p.h(context, "mContext");
        this.f61835w = context;
        this.f61836x = mediaProjectionManager;
        this.P = new Handler();
        this.T = wn.g.b(cr.a.f28611a.b(), new f(this, null, null));
    }

    public static final void B(n nVar, boolean z10, MediaProjection mediaProjection, int i10) {
        jo.p.h(nVar, "this$0");
        if (nVar.E == null) {
            VideoEncoderSetting s10 = nVar.s();
            Context context = nVar.f61835w;
            Handler handler = nVar.H;
            jo.p.e(handler);
            Looper looper = handler.getLooper();
            jo.p.g(looper, "handler!!.looper");
            ze.k kVar = new ze.k(context, looper, mediaProjection, s10, i10, nVar.f61838z);
            kVar.L(nVar);
            nVar.E = kVar;
            nVar.J = s10;
        }
        if (nVar.D == null && z10) {
            nVar.K = nVar.r();
            Object systemService = nVar.f61835w.getSystemService("audio");
            jo.p.f(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            Handler handler2 = nVar.H;
            jo.p.e(handler2);
            Looper looper2 = handler2.getLooper();
            jo.p.g(looper2, "handler!!.looper");
            AudioEncoderSetting audioEncoderSetting = nVar.K;
            jo.p.e(audioEncoderSetting);
            a aVar = nVar.f61837y;
            jo.p.e(mediaProjection);
            nVar.D = new p(looper2, audioEncoderSetting, aVar, mediaProjection, (AudioManager) systemService);
        }
    }

    public static final void D(n nVar, RTMPEndpoint rTMPEndpoint) {
        jo.p.h(nVar, "this$0");
        jo.p.h(rTMPEndpoint, "$endpoint");
        if (nVar.C != null) {
            return;
        }
        Publisher publisher = new Publisher(rTMPEndpoint, nVar.F);
        publisher.setCallback(nVar);
        publisher.setAudioSource(nVar.D);
        publisher.setVideoSource(nVar.E);
        nVar.C = publisher;
    }

    public static final void F(n nVar) {
        jo.p.h(nVar, "this$0");
        Publisher publisher = nVar.C;
        if (publisher != null) {
            publisher.setVideoSource(null);
        }
        ze.k kVar = nVar.E;
        if (kVar != null) {
            kVar.close();
        }
        nVar.E = null;
    }

    public static final void H(n nVar) {
        jo.p.h(nVar, "this$0");
        Publisher publisher = nVar.C;
        if (publisher != null) {
            publisher.close();
        }
        nVar.C = null;
    }

    public static final void R(n nVar) {
        jo.p.h(nVar, "this$0");
        nVar.o();
    }

    public static final void p(n nVar) {
        jo.p.h(nVar, "this$0");
        nVar.o();
    }

    public static final void v(n nVar, Throwable th2) {
        jo.p.h(nVar, "this$0");
        jo.p.h(th2, "$cause");
        d dVar = nVar.L;
        if (dVar != null) {
            dVar.onError(th2);
        }
    }

    public static final void x(n nVar) {
        jo.p.h(nVar, "this$0");
        d dVar = nVar.L;
        if (dVar != null) {
            dVar.a();
        }
    }

    public static final void y(n nVar) {
        jo.p.h(nVar, "this$0");
        nVar.I();
    }

    public static final void z(n nVar) {
        jo.p.h(nVar, "this$0");
        nVar.I();
    }

    public final void A() {
        ye.c cVar = this.I;
        if (cVar == null) {
            return;
        }
        MediaProjectionManager mediaProjectionManager = this.f61836x;
        final MediaProjection mediaProjection = null;
        if (mediaProjectionManager != null && cVar != null) {
            mediaProjection = cVar.f(mediaProjectionManager);
        }
        ye.c cVar2 = this.I;
        final boolean e10 = cVar2 != null ? cVar2.e() : false;
        ye.c cVar3 = this.I;
        final int g10 = cVar3 != null ? cVar3.g() : 0;
        Loopers.postAndWait(this.H, new Runnable() { // from class: ye.m
            @Override // java.lang.Runnable
            public final void run() {
                n.B(n.this, e10, mediaProjection, g10);
            }
        });
    }

    public final void C(final RTMPEndpoint rTMPEndpoint) {
        Loopers.postAndWait(this.H, new Runnable() { // from class: ye.k
            @Override // java.lang.Runnable
            public final void run() {
                n.D(n.this, rTMPEndpoint);
            }
        });
    }

    public final void E() {
        Loopers.postAndWait(this.H, new Runnable() { // from class: ye.d
            @Override // java.lang.Runnable
            public final void run() {
                n.F(n.this);
            }
        });
        Publisher publisher = this.C;
        if (publisher != null) {
            publisher.setAudioSource(null);
        }
        p pVar = this.D;
        if (pVar != null) {
            pVar.a();
        }
        this.D = null;
    }

    public final void G() {
        Loopers.postAndWait(this.H, new Runnable() { // from class: ye.h
            @Override // java.lang.Runnable
            public final void run() {
                n.H(n.this);
            }
        });
    }

    public final void I() {
        if (this.Q) {
            return;
        }
        MRLogger q10 = q();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_RECORDER_RETRY);
        wn.k[] kVarArr = new wn.k[2];
        ye.c cVar = this.I;
        kVarArr[0] = new wn.k(MRLog.PAYLOAD_KEY_LIVE_ID, (cVar == null || (r5 = cVar.b()) == null) ? "" : "");
        kVarArr[1] = new wn.k(MRLog.PAYLOAD_KEY_STEP, "" + this.S);
        builder.setPayload(s.e(kVarArr));
        q10.sendLog(builder.build());
        V();
        T();
        p pVar = this.D;
        if (pVar != null) {
            pVar.d(this.N);
        }
        ze.k kVar = this.E;
        if (kVar != null) {
            kVar.O(this.O);
        }
        this.R = System.currentTimeMillis();
    }

    public final void J(boolean z10) {
        this.B = z10;
    }

    public final void K(a aVar) {
        this.f61837y = aVar;
    }

    public final void L(boolean z10) {
        this.f61838z = z10;
    }

    public final void M(boolean z10, c cVar) {
        jo.p.h(cVar, "type");
        int i10 = e.f61839a[cVar.ordinal()];
        if (i10 == 1) {
            this.N = z10;
            p pVar = this.D;
            if (pVar == null) {
                return;
            }
            pVar.d(z10);
        } else if (i10 != 2) {
        } else {
            this.O = z10;
            ze.k kVar = this.E;
            if (kVar == null) {
                return;
            }
            kVar.O(z10);
        }
    }

    public final void N(d dVar, Handler handler) {
        this.L = dVar;
        this.M = handler;
        if (dVar == null || handler != null) {
            return;
        }
        this.M = new Handler();
    }

    public final void O(boolean z10) {
        this.A = z10;
    }

    public final boolean P() {
        if (this.Q) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.R > 10000) {
            this.S = 0;
        }
        boolean z10 = this.S < 15;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("shouldRetry liveID=");
        ye.c cVar = this.I;
        sb2.append(cVar != null ? cVar.b() : null);
        sb2.append(", mLastRetryTime=");
        sb2.append(this.R);
        sb2.append(", (now - mLastRetryTime)=");
        sb2.append(currentTimeMillis - this.R);
        sb2.append(", retryCount=");
        sb2.append(this.S);
        sb2.append(", ret=");
        sb2.append(z10);
        g9.a.g(sb2.toString());
        return z10;
    }

    public final void Q() {
        Handler handler = this.H;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: ye.f
                @Override // java.lang.Runnable
                public final void run() {
                    n.R(n.this);
                }
            }, 1000L);
        }
    }

    public final void S(ye.c cVar) {
        this.Q = false;
        this.I = cVar;
        T();
    }

    public final void T() {
        HandlerThread handlerThread = new HandlerThread("RtmpRecorder");
        this.G = handlerThread;
        handlerThread.start();
        this.F = new AsyncSocketLooper(handlerThread.getLooper());
        this.H = new Handler(handlerThread.getLooper());
        A();
        ye.c cVar = this.I;
        String i10 = cVar != null ? cVar.i() : null;
        ye.c cVar2 = this.I;
        RTMPEndpoint fromURL = RTMPEndpoint.fromURL(i10, cVar2 != null ? cVar2.j() : null, false, false);
        jo.p.g(fromURL, "fromURL(recordRequestPar…reamingKey, false, false)");
        C(fromURL);
        Q();
    }

    public final void U() {
        this.Q = true;
        WebRtcAudioMediator.getInstance().stopMediation();
        V();
    }

    public final void V() {
        String b10;
        if (this.H == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        p pVar = this.D;
        if (pVar != null) {
            jSONObject.put("audio", pVar.f());
        }
        ze.k kVar = this.E;
        if (kVar != null) {
            jSONObject.put("video", kVar.d1());
        }
        MRLogger q10 = q();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_MEDIA_CODEC_INFO);
        builder.setTargetType(MRLog.TARGET_TYPE_LIVE);
        ye.c cVar = this.I;
        String str = "";
        builder.setTargetId((cVar == null || (r3 = cVar.b()) == null) ? "" : "");
        wn.k[] kVarArr = new wn.k[2];
        ye.c cVar2 = this.I;
        if (cVar2 != null && (b10 = cVar2.b()) != null) {
            str = b10;
        }
        kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, str);
        kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString());
        builder.setPayload(s.m(kVarArr));
        q10.sendLog(builder.build());
        G();
        E();
        HandlerThread handlerThread = this.G;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.H = null;
    }

    @Override // ze.k.a
    public void a(ze.k kVar, Throwable th2) {
        if ((th2 instanceof SecurityException) && P()) {
            this.S++;
            g9.a.g("SecurityException detected. Retry recording");
            this.P.postDelayed(new Runnable() { // from class: ye.e
                @Override // java.lang.Runnable
                public final void run() {
                    n.y(n.this);
                }
            }, 1000L);
        } else if (th2 != null) {
            g9.a.c(th2);
            u(th2);
        }
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final void m(int i10, int i11, int i12) {
        ze.k kVar;
        VideoEncoderSetting videoEncoderSetting;
        AudioEncoderSetting audioEncoderSetting;
        if (this.J == null || i10 == 0 || i11 == 0 || (kVar = this.E) == null) {
            return;
        }
        long n10 = kVar != null ? kVar.n() : 1000L;
        ze.k kVar2 = this.E;
        float j10 = kVar2 != null ? kVar2.j() : 1.0f;
        VideoEncoderSetting videoEncoderSetting2 = this.J;
        int fps = videoEncoderSetting2 != null ? videoEncoderSetting2.getFps() : 1;
        float bps = this.J != null ? videoEncoderSetting.getBps() : 0.0f;
        float bps2 = (bps * j10) + (this.K != null ? audioEncoderSetting.getBps() : 0.0f);
        float f10 = fps;
        if (f10 <= 0.0f || bps <= 0.0f) {
            return;
        }
        boolean z10 = i12 < ((int) (bps2 / 8.0f));
        int i13 = 1000 / ((int) n10);
        if (z10 && this.V >= i12) {
            i13 = fps <= i13 ? fps : i13 + 1;
        } else if (!z10 && this.V <= i12 && i13 - 2 <= 0) {
            i13 = 1;
        }
        boolean z11 = z10;
        long j11 = 1000 / i13;
        float f11 = (i13 + 1) / f10;
        float f12 = f11 <= 1.0f ? f11 : 1.0f;
        if (i13 >= (fps / 2) - 1 && z11) {
            this.U = 0;
        } else {
            this.U++;
        }
        if (this.U > 5) {
            w();
            this.U = 0;
        }
        if (!(f12 == j10) && this.B) {
            ze.k kVar3 = this.E;
            if (kVar3 != null) {
                kVar3.N(j11);
                kVar3.K(f12);
            }
            g9.a.g("Target interval: " + j11);
            g9.a.g("Target bps adjust ratio: " + j10);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bitrates, queue size = [");
            sb2.append(i10);
            sb2.append(", ");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(i11 > 0 ? Float.valueOf(i10 / i11) : 0);
            sb2.append(", ");
            sb2.append(i12);
            sb2.append(']');
            g9.a.g(sb2.toString());
        }
        this.V = i12;
    }

    public final ye.b n() {
        Publisher publisher = this.C;
        if (publisher == null) {
            return null;
        }
        int encoderBitrate = publisher != null ? publisher.getEncoderBitrate() : 0;
        Publisher publisher2 = this.C;
        int networkBitrate = publisher2 != null ? publisher2.getNetworkBitrate() : 0;
        Publisher publisher3 = this.C;
        return new ye.b(encoderBitrate, networkBitrate, publisher3 != null ? publisher3.getSendQueueSize() : 0);
    }

    public final void o() {
        Publisher publisher = this.C;
        if (publisher == null) {
            return;
        }
        int networkBitrate = publisher != null ? publisher.getNetworkBitrate() : 0;
        Publisher publisher2 = this.C;
        int encoderBitrate = publisher2 != null ? publisher2.getEncoderBitrate() : 0;
        Publisher publisher3 = this.C;
        int sendQueueSize = publisher3 != null ? publisher3.getSendQueueSize() : 0;
        if (this.E == null) {
            g9.a.f32826a.b("Unexpectedly video source is null", new Object[0]);
            return;
        }
        m(networkBitrate, encoderBitrate, sendQueueSize);
        int i10 = this.W + 1;
        this.W = i10;
        if (i10 >= 10) {
            this.W = 0;
            a.C0931a c0931a = vd.a.f57288i;
            int d10 = (int) c0931a.a().d();
            int e10 = c0931a.a().e();
            MRLogger q10 = q();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_PERFORMANCE_MONITORING);
            wn.k[] kVarArr = new wn.k[2];
            ye.c cVar = this.I;
            kVarArr[0] = new wn.k(MRLog.PAYLOAD_KEY_LIVE_ID, (cVar == null || (r11 = cVar.b()) == null) ? "" : "");
            kVarArr[1] = new wn.k(MRLog.PAYLOAD_KEY_TARGET_DETAIL, "{\"NetworkBitrate\":" + networkBitrate + ",\"EncoderBitrate\":" + encoderBitrate + ",\"BufferingSize\":" + sendQueueSize + ",\"CPUPercent\":" + d10 + ",\"CPUCount\":" + e10 + '}');
            builder.setPayload(s.e(kVarArr));
            q10.sendLog(builder.build());
        }
        Handler handler = this.H;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: ye.j
                @Override // java.lang.Runnable
                public final void run() {
                    n.p(n.this);
                }
            }, 1000L);
        }
    }

    @Override // com.dena.showroom.flvplayback.FLVPublisher.Callback
    public void onCrash(FLVPublisher fLVPublisher, Throwable th2) {
        jo.p.h(fLVPublisher, "publisher");
        jo.p.h(th2, "cause");
        g9.a.c(th2);
        if ((th2 instanceof IOException) && P()) {
            this.S++;
            g9.a.g("IOException detected. Retry recording");
            this.P.postDelayed(new Runnable() { // from class: ye.i
                @Override // java.lang.Runnable
                public final void run() {
                    n.z(n.this);
                }
            }, 1000L);
            return;
        }
        u(th2);
    }

    public final MRLogger q() {
        return (MRLogger) this.T.getValue();
    }

    public final AudioEncoderSetting r() {
        b.a aVar = ze.b.f63104j;
        return new AudioEncoderSetting(aVar.a().c(), aVar.a().d(), 1);
    }

    public final VideoEncoderSetting s() {
        ye.c cVar = this.I;
        int width = cVar != null ? cVar.getWidth() : 1;
        ye.c cVar2 = this.I;
        Size size = new Size(width, cVar2 != null ? cVar2.getHeight() : 1);
        b.a aVar = ze.b.f63104j;
        return new VideoEncoderSetting(size, aVar.a().e(), aVar.a().f(), 2, false);
    }

    public final void t(Configuration configuration) {
        ze.k kVar = this.E;
        if (kVar != null) {
            kVar.v(configuration);
        }
    }

    public final void u(final Throwable th2) {
        Handler handler = this.M;
        if (handler != null) {
            handler.post(new Runnable() { // from class: ye.l
                @Override // java.lang.Runnable
                public final void run() {
                    n.v(n.this, th2);
                }
            });
        }
    }

    public final void w() {
        Handler handler = this.M;
        if (handler != null) {
            handler.post(new Runnable() { // from class: ye.g
                @Override // java.lang.Runnable
                public final void run() {
                    n.x(n.this);
                }
            });
        }
    }
}
