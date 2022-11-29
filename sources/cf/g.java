package cf;

import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import co.l;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import hf.m0;
import io.p;
import jo.f0;
import jo.q;
import oq.a;
import uo.b0;
import uo.b1;
import uo.b3;
import uo.d2;
import uo.g1;
import uo.l0;
import uo.q0;
import uo.r0;
import vd.a;
import wn.m;
import wn.v;
import xn.s;
import ze.o;

/* loaded from: classes2.dex */
public final class g implements af.g, cf.d, oq.a {
    public static final a Q = new a(null);
    public static final int R = 8;
    public Handler A;
    public b B;
    public final wn.f C;
    public final l0 D;
    public final b0 E;
    public final q0 F;
    public d2 G;
    public long H;
    public volatile long I;
    public volatile long J;
    public volatile long K;
    public af.f L;
    public af.a M;
    public final wn.f N;
    public final cf.b O;
    public final wn.f P;

    /* renamed from: w  reason: collision with root package name */
    public final Context f19526w;

    /* renamed from: x  reason: collision with root package name */
    public final MediaProjectionManager f19527x;

    /* renamed from: y  reason: collision with root package name */
    public final ye.c f19528y;

    /* renamed from: z  reason: collision with root package name */
    public af.b f19529z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void onError(Throwable th2);
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19530a;

        static {
            int[] iArr = new int[cf.i.values().length];
            iArr[cf.i.AUDIO.ordinal()] = 1;
            iArr[cf.i.VIDEO.ordinal()] = 2;
            f19530a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<cf.a> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final cf.a invoke() {
            cf.a aVar = new cf.a(g.this.F, g.this.f19528y);
            aVar.i(g.this);
            aVar.k(new j(g.this.f19528y.l(), g.this.f19528y.k()));
            return aVar;
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.recorder.v2.MediaProjectionBroadcaster$prepare$2", f = "MediaProjectionBroadcaster.kt", l = {146}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f19532w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f19533x;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f19533x = obj;
            return eVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            q0 q0Var;
            Object c10 = bo.c.c();
            int i10 = this.f19532w;
            if (i10 == 0) {
                m.b(obj);
                q0Var = (q0) this.f19533x;
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                q0Var = (q0) this.f19533x;
                m.b(obj);
            }
            do {
                r0.f(q0Var);
                g.this.x(10L);
                this.f19533x = q0Var;
                this.f19532w = 1;
            } while (b1.a(10000L, this) != c10);
            return c10;
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.recorder.v2.MediaProjectionBroadcaster$sendPerformanceLog$1", f = "MediaProjectionBroadcaster.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f19535w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f19537y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f19538z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i10, int i11, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f19537y = i10;
            this.f19538z = i11;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f19537y, this.f19538z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f19535w == 0) {
                m.b(obj);
                MRLogger m10 = g.this.m();
                MRLog.Companion companion = MRLog.Companion;
                g gVar = g.this;
                int i10 = this.f19537y;
                int i11 = this.f19538z;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_PERFORMANCE_MONITORING);
                builder.setPayload(s.e(new wn.k(MRLog.PAYLOAD_KEY_LIVE_ID, gVar.f19528y.b()), new wn.k(MRLog.PAYLOAD_KEY_TARGET_DETAIL, "{\"NetworkBitrate\":" + gVar.n() + ",\"EncoderBitrate\":" + gVar.l() + ",\"BufferingSize\":" + gVar.o() + ",\"CPUPercent\":" + i10 + ",\"CPUCount\":" + i11 + '}')));
                m10.sendLog(builder.build());
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: cf.g$g  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0154g extends ao.a implements l0 {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g f19539w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0154g(l0.a aVar, g gVar) {
            super(aVar);
            this.f19539w = gVar;
        }

        @Override // uo.l0
        public void handleException(ao.g gVar, Throwable th2) {
            g9.a.c(th2);
            g gVar2 = this.f19539w;
            gVar2.b(gVar2.k(), th2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f19540w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f19541x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f19542y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f19540w = aVar;
            this.f19541x = aVar2;
            this.f19542y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            xq.a b10;
            oq.a aVar = this.f19540w;
            vq.a aVar2 = this.f19541x;
            io.a<? extends uq.a> aVar3 = this.f19542y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(MRLogger.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<m0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f19543w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f19544x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f19545y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f19543w = aVar;
            this.f19544x = aVar2;
            this.f19545y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hf.m0] */
        @Override // io.a
        public final m0 invoke() {
            xq.a b10;
            oq.a aVar = this.f19543w;
            vq.a aVar2 = this.f19544x;
            io.a<? extends uq.a> aVar3 = this.f19545y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(m0.class), aVar2, aVar3);
        }
    }

    public g(Context context, MediaProjectionManager mediaProjectionManager, ye.c cVar) {
        jo.p.h(context, "context");
        jo.p.h(mediaProjectionManager, "mediaProjectionManager");
        jo.p.h(cVar, "requestParams");
        this.f19526w = context;
        this.f19527x = mediaProjectionManager;
        this.f19528y = cVar;
        cr.a aVar = cr.a.f28611a;
        this.C = wn.g.b(aVar.b(), new h(this, null, null));
        C0154g c0154g = new C0154g(l0.f56050r, this);
        this.D = c0154g;
        b0 b10 = b3.b(null, 1, null);
        this.E = b10;
        this.F = r0.h(r0.h(r0.a(b10), g1.a()), c0154g);
        this.N = wn.g.a(new d());
        this.O = new cf.b(context, k());
        this.P = wn.g.b(aVar.b(), new i(this, null, null));
    }

    public static final void r(g gVar, Throwable th2) {
        jo.p.h(gVar, "this$0");
        jo.p.h(th2, "$cause");
        b bVar = gVar.B;
        if (bVar != null) {
            bVar.onError(th2);
        }
    }

    public static final void t(g gVar) {
        jo.p.h(gVar, "this$0");
        b bVar = gVar.B;
        if (bVar != null) {
            bVar.onError(new Exception("client is not initialized"));
        }
    }

    public final void A(b bVar) {
        this.B = bVar;
    }

    public final void B(boolean z10, cf.i iVar) {
        o a10;
        jo.p.h(iVar, "type");
        int i10 = c.f19530a[iVar.ordinal()];
        if (i10 == 1) {
            af.a aVar = this.M;
            a10 = aVar != null ? aVar.a() : null;
            if (a10 == null) {
                return;
            }
            a10.b(z10);
        } else if (i10 != 2) {
        } else {
            af.f fVar = this.L;
            a10 = fVar != null ? fVar.a() : null;
            if (a10 == null) {
                return;
            }
            a10.b(z10);
        }
    }

    public final void C() {
        g9.a.g(TtmlNode.START);
        s();
        this.O.c();
    }

    public final void D() {
        g9.a.g("stop");
        this.O.b();
        w();
    }

    @Override // af.g
    public void a(Surface surface) {
        g9.a.g("onSurfaceChanged");
    }

    @Override // cf.d
    public void b(cf.c cVar, final Throwable th2) {
        jo.p.h(cVar, "client");
        jo.p.h(th2, "cause");
        this.O.d(th2);
        w();
        g9.a.c(th2);
        Handler handler = this.A;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cf.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.r(g.this, th2);
                }
            });
        }
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final cf.c k() {
        return (cf.c) this.N.getValue();
    }

    public final long l() {
        return this.J;
    }

    public final MRLogger m() {
        return (MRLogger) this.C.getValue();
    }

    public final long n() {
        return this.I;
    }

    public final long o() {
        return this.K;
    }

    public final m0 p() {
        return (m0) this.P.getValue();
    }

    public final void q(Configuration configuration) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("notifyConfigurationChanged orientation=");
        sb2.append(configuration != null ? Integer.valueOf(configuration.orientation) : null);
        g9.a.g(sb2.toString());
        af.f fVar = this.L;
        if (fVar != null) {
            fVar.e();
        }
    }

    public final void s() {
        d2 d10;
        g9.a.g("prepare");
        k().prepare();
        if (k().getSurface() == null) {
            Handler handler = this.A;
            if (handler != null) {
                handler.post(new Runnable() { // from class: cf.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.t(g.this);
                    }
                });
                return;
            }
            return;
        }
        MediaProjection f10 = this.f19528y.f(this.f19527x);
        v(f10);
        u(f10);
        d10 = uo.l.d(this.F, null, null, new e(null), 3, null);
        this.G = d10;
    }

    public final void u(MediaProjection mediaProjection) {
        af.a aVar = this.M;
        if (aVar != null) {
            aVar.release();
        }
        if (!this.f19528y.e()) {
            g9.a.f32826a.b("mic is not granted", new Object[0]);
            return;
        }
        AudioPlaybackCaptureConfiguration build = Build.VERSION.SDK_INT >= 29 ? new AudioPlaybackCaptureConfiguration.Builder(mediaProjection).addMatchingUsage(1).addMatchingUsage(14).addMatchingUsage(0).build() : null;
        Object systemService = this.f19526w.getSystemService("audio");
        jo.p.f(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        af.c cVar = new af.c(this.F, p().c(), (AudioManager) systemService, build);
        this.M = cVar;
        cVar.c();
        af.a aVar2 = this.M;
        if (aVar2 != null) {
            aVar2.b(this.O);
        }
        af.a aVar3 = this.M;
        if (aVar3 == null) {
            return;
        }
        aVar3.d(this.f19529z);
    }

    public final void v(MediaProjection mediaProjection) {
        af.f fVar = this.L;
        if (fVar != null) {
            fVar.release();
        }
        q0 q0Var = this.F;
        Context context = this.f19526w;
        Surface surface = k().getSurface();
        jo.p.f(surface, "null cannot be cast to non-null type android.view.Surface");
        af.d dVar = new af.d(q0Var, context, mediaProjection, surface, new Size(this.f19528y.getWidth(), this.f19528y.getHeight()));
        this.L = dVar;
        dVar.f(this);
        af.f fVar2 = this.L;
        if (fVar2 != null) {
            fVar2.b(this.O);
        }
        af.f fVar3 = this.L;
        if (fVar3 != null) {
            fVar3.c();
        }
    }

    public final void w() {
        af.f fVar = this.L;
        if (fVar != null) {
            fVar.release();
        }
        this.L = null;
        af.a aVar = this.M;
        if (aVar != null) {
            aVar.release();
        }
        this.M = null;
        d2 d2Var = this.G;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.G = null;
        d2.a.a(this.E, null, 1, null);
    }

    public final void x(long j10) {
        this.I = ((k().b() - this.H) * 8) / j10;
        this.J = k().a();
        this.K = k().e();
        a.C0931a c0931a = vd.a.f57288i;
        uo.l.d(this.F, g1.c(), null, new f((int) c0931a.a().d(), c0931a.a().e(), null), 2, null);
        this.H = k().b();
    }

    public final void y(af.b bVar) {
        this.f19529z = bVar;
    }

    public final void z(Handler handler) {
        this.A = handler;
    }
}
