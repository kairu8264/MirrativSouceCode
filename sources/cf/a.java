package cf;

import android.net.ConnectivityManager;
import android.util.Size;
import android.view.Surface;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.mirrativ.llstream.encoder.VideoEncoderSetting;
import com.mirrativ.llstream.publish.LLPublishStream;
import com.mirrativ.llstream.publish.LLPublishStreamListener;
import com.mirrativ.llstream.publish.LLPublishStreamParams;
import com.mirrativ.llstream.publish.WebSocketPublishStream;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import jo.p;
import uo.q0;
import ze.b;

/* loaded from: classes2.dex */
public final class a implements c, LLPublishStreamListener, k {

    /* renamed from: f  reason: collision with root package name */
    public static final C0152a f19509f = new C0152a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f19510g = 8;

    /* renamed from: a  reason: collision with root package name */
    public final q0 f19511a;

    /* renamed from: b  reason: collision with root package name */
    public final ye.c f19512b;

    /* renamed from: c  reason: collision with root package name */
    public final LLPublishStream f19513c;

    /* renamed from: d  reason: collision with root package name */
    public d f19514d;

    /* renamed from: e  reason: collision with root package name */
    public j f19515e;

    /* renamed from: cf.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0152a {
        public C0152a() {
        }

        public /* synthetic */ C0152a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19516a;

        static {
            int[] iArr = new int[i.values().length];
            iArr[i.AUDIO.ordinal()] = 1;
            f19516a = iArr;
        }
    }

    public a(q0 q0Var, ye.c cVar) {
        p.h(q0Var, "coroutineScope");
        p.h(cVar, "recordRequestParams");
        this.f19511a = q0Var;
        this.f19512b = cVar;
        this.f19513c = new LLPublishStream(q0Var, new LLPublishStreamParams(ApiUtil.INSTANCE.userAgent(), false));
    }

    @Override // cf.c
    public int a() {
        return this.f19513c.getVideoSetting().getBitrate();
    }

    @Override // cf.c
    public long b() {
        return this.f19513c.getTotalOutBytes();
    }

    @Override // cf.k
    public void c(int i10) {
        j(i10);
    }

    @Override // cf.c
    public void close() {
        this.f19513c.close();
        this.f19513c.stopEncoders();
    }

    @Override // cf.c
    public void connect() {
        URI create = URI.create(this.f19512b.c());
        g9.a.g("publish url: " + create);
        LLPublishStream lLPublishStream = this.f19513c;
        p.g(create, "llstreamUri");
        lLPublishStream.connect(create);
        this.f19513c.publish();
    }

    @Override // cf.c
    public void d(ByteBuffer byteBuffer, i iVar) {
        p.h(byteBuffer, "buffer");
        p.h(iVar, "type");
        if (b.f19516a[iVar.ordinal()] == 1) {
            LLPublishStream lLPublishStream = this.f19513c;
            ByteBuffer wrap = ByteBuffer.wrap(byteBuffer.duplicate().array());
            p.g(wrap, "wrap(buffer.duplicate().array())");
            LLPublishStream.appendSampleBuffer$default(lLPublishStream, wrap, LLPublishStream.AVMediaType.AUDIO, null, 4, null);
        }
    }

    @Override // cf.c
    public long e() {
        return this.f19513c.getTotalQueuedOutCount() - this.f19513c.getTotalOutCount();
    }

    @Override // cf.c
    public ConnectivityManager.NetworkCallback f() {
        return this.f19513c.getPublishStream();
    }

    public d g() {
        return this.f19514d;
    }

    @Override // cf.c
    public Surface getSurface() {
        return this.f19513c.getSurface();
    }

    public j h() {
        return this.f19515e;
    }

    public void i(d dVar) {
        this.f19514d = dVar;
    }

    public final void j(int i10) {
        this.f19513c.getVideoEncoder().setBitrate(i10);
    }

    public void k(j jVar) {
        if (jVar != null) {
            jVar.h(this);
        }
        if (jVar != null) {
            jVar.i(ze.b.f63104j.a().e());
        }
        this.f19515e = jVar;
    }

    @Override // com.mirrativ.llstream.publish.LLPublishStreamListener
    public void onLLStreamConnected(LLPublishStream lLPublishStream) {
        p.h(lLPublishStream, "stream");
    }

    @Override // com.mirrativ.llstream.publish.LLPublishStreamListener
    public void onLLStreamDisconnected(LLPublishStream lLPublishStream) {
        p.h(lLPublishStream, "stream");
    }

    @Override // com.mirrativ.llstream.publish.LLPublishStreamListener
    public void onLLStreamError(LLPublishStream lLPublishStream, Throwable th2) {
        p.h(lLPublishStream, "stream");
        p.h(th2, "throwable");
        d g10 = g();
        if (g10 != null) {
            g10.b(this, th2);
        }
    }

    @Override // com.mirrativ.llstream.publish.LLPublishStreamListener
    public void onPublishInsufficientBitrate(LLPublishStream lLPublishStream) {
        AtomicLong totalBytesOut;
        AtomicLong queuedBytesOut;
        p.h(lLPublishStream, "stream");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onPublishInsufficientBitrate queued=");
        WebSocketPublishStream publishStream = lLPublishStream.getPublishStream();
        Long l10 = null;
        sb2.append((publishStream == null || (queuedBytesOut = publishStream.getQueuedBytesOut()) == null) ? null : Long.valueOf(queuedBytesOut.get()));
        sb2.append(" sent=");
        WebSocketPublishStream publishStream2 = lLPublishStream.getPublishStream();
        if (publishStream2 != null && (totalBytesOut = publishStream2.getTotalBytesOut()) != null) {
            l10 = Long.valueOf(totalBytesOut.get());
        }
        sb2.append(l10);
        g9.a.g(sb2.toString());
        j h10 = h();
        if (h10 != null) {
            h10.d();
        }
    }

    @Override // com.mirrativ.llstream.publish.LLPublishStreamListener
    public void onPublishStreamStalled(LLPublishStream lLPublishStream) {
        AtomicInteger noSentCount;
        p.h(lLPublishStream, "stream");
        WebSocketPublishStream publishStream = lLPublishStream.getPublishStream();
        if (publishStream == null || (noSentCount = publishStream.getNoSentCount()) == null) {
            return;
        }
        int i10 = noSentCount.get();
        if (i10 != 5) {
            int i11 = i10 % 60;
            if (i11 + ((((i11 ^ 60) & ((-i11) | i11)) >> 31) & 60) != 0) {
                return;
            }
        }
        g9.a aVar = g9.a.f32826a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onPublishStreamStalled ");
        WebSocketPublishStream publishStream2 = lLPublishStream.getPublishStream();
        sb2.append(publishStream2 != null ? publishStream2.getNoSentCount() : null);
        aVar.b(sb2.toString(), new Object[0]);
    }

    @Override // com.mirrativ.llstream.publish.LLPublishStreamListener
    public void onPublishSufficientBitrate(LLPublishStream lLPublishStream) {
        p.h(lLPublishStream, "stream");
        j h10 = h();
        if (h10 != null) {
            h10.e();
        }
    }

    @Override // cf.c
    public void prepare() {
        Size size = new Size(this.f19512b.getWidth(), this.f19512b.getHeight());
        this.f19513c.setListener(this);
        this.f19513c.getVideoSetting().setResolution(size);
        VideoEncoderSetting videoSetting = this.f19513c.getVideoSetting();
        b.a aVar = ze.b.f63104j;
        videoSetting.setFrameRate(aVar.a().f());
        this.f19513c.getVideoSetting().setBitrate(aVar.a().e());
        this.f19513c.getVideoSetting().setKeyInterval(2);
        this.f19513c.getAudioSetting().setBitrate(aVar.a().c());
        this.f19513c.getAudioSetting().setSamplingRate(aVar.a().d());
        this.f19513c.getAudioSetting().setChannelCount(1);
        this.f19513c.prepare();
    }
}
