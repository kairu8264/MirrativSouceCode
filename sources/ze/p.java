package ze;

import android.media.AudioManager;
import android.media.MediaFormat;
import android.media.projection.MediaProjection;
import android.os.Looper;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.showroom.flvplayback.SampleSource;
import com.dena.showroom.flvplayback.impl.publish.AudioEncoderSetting;
import com.google.android.exoplayer2.util.MimeTypes;
import hf.m0;
import java.util.Iterator;
import java.util.WeakHashMap;
import jo.f0;
import oq.a;
import org.json.JSONObject;
import ye.n;

/* loaded from: classes2.dex */
public final class p implements SampleSource, oq.a {
    public final AudioManager A;
    public final o B;
    public final WeakHashMap<a, Void> C;
    public final wn.f D;
    public final wn.f E;

    /* renamed from: w  reason: collision with root package name */
    public final Looper f63153w;

    /* renamed from: x  reason: collision with root package name */
    public final AudioEncoderSetting f63154x;

    /* renamed from: y  reason: collision with root package name */
    public final n.a f63155y;

    /* renamed from: z  reason: collision with root package name */
    public final MediaProjection f63156z;

    /* loaded from: classes2.dex */
    public interface a extends SampleSource.Connection {
        JSONObject d1();
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<hf.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f63157w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f63158x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f63159y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f63157w = aVar;
            this.f63158x = aVar2;
            this.f63159y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.r, java.lang.Object] */
        @Override // io.a
        public final hf.r invoke() {
            xq.a b10;
            oq.a aVar = this.f63157w;
            vq.a aVar2 = this.f63158x;
            io.a<? extends uq.a> aVar3 = this.f63159y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(hf.r.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<m0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f63160w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f63161x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f63162y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f63160w = aVar;
            this.f63161x = aVar2;
            this.f63162y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hf.m0] */
        @Override // io.a
        public final m0 invoke() {
            xq.a b10;
            oq.a aVar = this.f63160w;
            vq.a aVar2 = this.f63161x;
            io.a<? extends uq.a> aVar3 = this.f63162y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(m0.class), aVar2, aVar3);
        }
    }

    public p(Looper looper, AudioEncoderSetting audioEncoderSetting, n.a aVar, MediaProjection mediaProjection, AudioManager audioManager) {
        jo.p.h(looper, "looper");
        jo.p.h(audioEncoderSetting, MRLog.PAYLOAD_KEY_SETTING);
        jo.p.h(mediaProjection, "projection");
        jo.p.h(audioManager, "audioManager");
        this.f63153w = looper;
        this.f63154x = audioEncoderSetting;
        this.f63155y = aVar;
        this.f63156z = mediaProjection;
        this.A = audioManager;
        this.B = new o();
        this.C = new WeakHashMap<>();
        cr.a aVar2 = cr.a.f28611a;
        this.D = wn.g.b(aVar2.b(), new b(this, null, null));
        this.E = wn.g.b(aVar2.b(), new c(this, null, null));
    }

    public final void a() {
    }

    public final hf.r b() {
        return (hf.r) this.D.getValue();
    }

    public final m0 c() {
        return (m0) this.E.getValue();
    }

    public final void d(boolean z10) {
        this.B.b(z10);
    }

    public final JSONObject f() {
        Iterator<a> it = this.C.keySet().iterator();
        if (it.hasNext()) {
            return it.next().d1();
        }
        return new JSONObject();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // com.dena.showroom.flvplayback.SampleSource
    public SampleSource.Connection open(SampleSource.Sink sink, double d10) {
        jo.p.h(sink, "sink");
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(MimeTypes.AUDIO_AAC, this.f63154x.getSamplingRate(), this.f63154x.getChannelCount());
        jo.p.g(createAudioFormat, "createAudioFormat(\n     …ng.channelCount\n        )");
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("bitrate", (int) (this.f63154x.getBps() * d10));
        if (c().c()) {
            t tVar = new t(this.f63156z, this.A);
            tVar.z(b().r() ? 1 : 0);
            tVar.o(this.f63153w, sink, createAudioFormat, this.B, this.f63155y);
            this.C.put(tVar, null);
            return tVar;
        }
        q qVar = new q(this.A);
        qVar.o(b().r() ? 1 : 0);
        qVar.i(this.f63153w, sink, createAudioFormat, this.B, this.f63155y);
        this.C.put(qVar, null);
        return qVar;
    }
}
