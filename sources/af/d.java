package af;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.util.Size;
import android.view.Surface;
import bf.a;
import cf.h;
import co.l;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mirrativ.llstream.NamedThreadFactory;
import io.p;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import of.e;
import uo.d2;
import uo.i2;
import uo.j;
import uo.k0;
import uo.q0;
import uo.r0;
import uo.u1;
import wn.m;
import wn.v;
import ze.o;

/* loaded from: classes2.dex */
public final class d implements af.f {
    public static final a D = new a(null);
    public static final int E = 8;
    public boolean A;
    public d2 B;
    public boolean C;

    /* renamed from: a  reason: collision with root package name */
    public final q0 f1550a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1551b;

    /* renamed from: c  reason: collision with root package name */
    public final MediaProjection f1552c;

    /* renamed from: d  reason: collision with root package name */
    public final Surface f1553d;

    /* renamed from: e  reason: collision with root package name */
    public final Size f1554e;

    /* renamed from: f  reason: collision with root package name */
    public Surface f1555f;

    /* renamed from: g  reason: collision with root package name */
    public af.g f1556g;

    /* renamed from: h  reason: collision with root package name */
    public final o f1557h;

    /* renamed from: i  reason: collision with root package name */
    public h f1558i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1559j;

    /* renamed from: k  reason: collision with root package name */
    public k0 f1560k;

    /* renamed from: l  reason: collision with root package name */
    public k0 f1561l;

    /* renamed from: m  reason: collision with root package name */
    public q0 f1562m;

    /* renamed from: n  reason: collision with root package name */
    public q0 f1563n;

    /* renamed from: o  reason: collision with root package name */
    public volatile Size f1564o;

    /* renamed from: p  reason: collision with root package name */
    public SurfaceTexture f1565p;

    /* renamed from: q  reason: collision with root package name */
    public bf.a f1566q;

    /* renamed from: r  reason: collision with root package name */
    public a.b f1567r;

    /* renamed from: s  reason: collision with root package name */
    public bf.c f1568s;

    /* renamed from: t  reason: collision with root package name */
    public int f1569t;

    /* renamed from: u  reason: collision with root package name */
    public final float[] f1570u;

    /* renamed from: v  reason: collision with root package name */
    public Size f1571v;

    /* renamed from: w  reason: collision with root package name */
    public volatile Size f1572w;

    /* renamed from: x  reason: collision with root package name */
    public volatile Size f1573x;

    /* renamed from: y  reason: collision with root package name */
    public VirtualDisplay f1574y;

    /* renamed from: z  reason: collision with root package name */
    public ze.d f1575z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.recorder.encoder.v2.MediaProjectionSourceV2$refresh$1", f = "MediaProjectionSourceV2.kt", l = {106}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1576w;

        @co.f(c = "com.dena.mirrorman.feature.recorder.encoder.v2.MediaProjectionSourceV2$refresh$1$1", f = "MediaProjectionSourceV2.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends l implements p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f1578w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ d f1579x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, ao.d<? super a> dVar2) {
                super(2, dVar2);
                this.f1579x = dVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f1579x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                bo.c.c();
                if (this.f1578w == 0) {
                    m.b(obj);
                    this.f1579x.Q();
                    return v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f1576w;
            if (i10 == 0) {
                m.b(obj);
                d.this.O();
                d.this.P();
                k0 k0Var = d.this.f1561l;
                a aVar = new a(d.this, null);
                this.f1576w = 1;
                if (j.f(k0Var, aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            d.this.M();
            d dVar = d.this;
            dVar.f1572w = dVar.f1571v;
            d dVar2 = d.this;
            dVar2.f1573x = dVar2.f1571v;
            ze.d dVar3 = d.this.f1575z;
            if (dVar3 != null) {
                dVar3.c(d.this.f1572w, d.this.f1554e, d.this.f1573x);
            }
            d.this.L();
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.recorder.encoder.v2.MediaProjectionSourceV2$release$1", f = "MediaProjectionSourceV2.kt", l = {122}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1580w;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f1580w;
            if (i10 == 0) {
                m.b(obj);
                d.this.C = false;
                d.this.N();
                d dVar = d.this;
                this.f1580w = 1;
                if (dVar.G(this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.feature.recorder.encoder.v2.MediaProjectionSourceV2$releaseGL$2", f = "MediaProjectionSourceV2.kt", l = {}, m = "invokeSuspend")
    /* renamed from: af.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0035d extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1582w;

        public C0035d(ao.d<? super C0035d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0035d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((C0035d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f1582w == 0) {
                m.b(obj);
                d.this.H();
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.recorder.encoder.v2.MediaProjectionSourceV2$setUp$1", f = "MediaProjectionSourceV2.kt", l = {96}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1584w;

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
            int i10 = this.f1584w;
            if (i10 == 0) {
                m.b(obj);
                e.a c11 = of.e.c(d.this.E());
                d.this.f1572w = new Size(c11.d(), c11.b());
                d.this.f1573x = new Size(c11.d(), c11.b());
                d.this.P();
                d dVar = d.this;
                this.f1584w = 1;
                if (dVar.J(this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            d.this.L();
            d.this.C = true;
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.recorder.encoder.v2.MediaProjectionSourceV2$setupGL$2", f = "MediaProjectionSourceV2.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1586w;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f1586w == 0) {
                m.b(obj);
                d.this.K();
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.recorder.encoder.v2.MediaProjectionSourceV2$startTicker$1", f = "MediaProjectionSourceV2.kt", l = {279, 285}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public long f1588w;

        /* renamed from: x  reason: collision with root package name */
        public long f1589x;

        /* renamed from: y  reason: collision with root package name */
        public int f1590y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f1591z;

        @co.f(c = "com.dena.mirrorman.feature.recorder.encoder.v2.MediaProjectionSourceV2$startTicker$1$1", f = "MediaProjectionSourceV2.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends l implements p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f1592w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ d f1593x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ long f1594y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, long j10, ao.d<? super a> dVar2) {
                super(2, dVar2);
                this.f1593x = dVar;
                this.f1594y = j10;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f1593x, this.f1594y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                bo.c.c();
                if (this.f1592w == 0) {
                    m.b(obj);
                    this.f1593x.D(this.f1594y);
                    return v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            g gVar = new g(dVar);
            gVar.f1591z = obj;
            return gVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0090 -> B:12:0x0045). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r14.f1590y
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2f
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                long r4 = r14.f1588w
                java.lang.Object r1 = r14.f1591z
                uo.q0 r1 = (uo.q0) r1
                wn.m.b(r15)
                r15 = r1
                goto L44
            L19:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L21:
                long r4 = r14.f1589x
                long r6 = r14.f1588w
                java.lang.Object r1 = r14.f1591z
                uo.q0 r1 = (uo.q0) r1
                wn.m.b(r15)
                r15 = r1
                r1 = r14
                goto L78
            L2f:
                wn.m.b(r15)
                java.lang.Object r15 = r14.f1591z
                uo.q0 r15 = (uo.q0) r15
                r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
                af.d r1 = af.d.this
                int r1 = af.d.i(r1)
                double r6 = (double) r1
                double r4 = r4 / r6
                long r4 = (long) r4
            L44:
                r1 = r14
            L45:
                af.d r6 = af.d.this
                boolean r6 = af.d.m(r6)
                if (r6 == 0) goto L92
                uo.r0.f(r15)
                long r6 = java.lang.System.currentTimeMillis()
                af.d r8 = af.d.this
                uo.q0 r8 = af.d.k(r8)
                ao.g r8 = r8.getCoroutineContext()
                af.d$g$a r9 = new af.d$g$a
                af.d r10 = af.d.this
                r11 = 0
                r9.<init>(r10, r6, r11)
                r1.f1591z = r15
                r1.f1588w = r4
                r1.f1589x = r6
                r1.f1590y = r3
                java.lang.Object r8 = uo.j.f(r8, r9, r1)
                if (r8 != r0) goto L75
                return r0
            L75:
                r12 = r4
                r4 = r6
                r6 = r12
            L78:
                long r8 = java.lang.System.currentTimeMillis()
                long r8 = r8 - r4
                int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r4 <= 0) goto L90
                long r4 = r6 - r8
                r1.f1591z = r15
                r1.f1588w = r6
                r1.f1590y = r2
                java.lang.Object r4 = uo.b1.a(r4, r1)
                if (r4 != r0) goto L90
                return r0
            L90:
                r4 = r6
                goto L45
            L92:
                wn.v r15 = wn.v.f59242a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: af.d.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public d(q0 q0Var, Context context, MediaProjection mediaProjection, Surface surface, Size size) {
        jo.p.h(q0Var, "coroutineScope");
        jo.p.h(context, "context");
        jo.p.h(mediaProjection, "mediaProjection");
        jo.p.h(surface, "encoderSurface");
        jo.p.h(size, "outputSize");
        this.f1550a = q0Var;
        this.f1551b = context;
        this.f1552c = mediaProjection;
        this.f1553d = surface;
        this.f1554e = size;
        this.f1557h = new o();
        this.f1559j = 30;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("MediaProjectionSourceV2-Capture"));
        jo.p.g(newSingleThreadExecutor, "newSingleThreadExecutor(…ectionSourceV2-Capture\"))");
        this.f1560k = u1.a(newSingleThreadExecutor);
        ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor(new NamedThreadFactory("MediaProjectionSourceV2-Render"));
        jo.p.g(newSingleThreadExecutor2, "newSingleThreadExecutor(…jectionSourceV2-Render\"))");
        this.f1561l = u1.a(newSingleThreadExecutor2);
        this.f1562m = r0.h(q0Var, this.f1560k);
        this.f1563n = r0.h(q0Var, this.f1561l);
        this.f1564o = new Size(1, 1);
        this.f1570u = new float[16];
        this.f1571v = new Size(0, 0);
        this.f1572w = new Size(0, 0);
        this.f1573x = new Size(0, 0);
    }

    public final void D(long j10) {
        if (!a().a()) {
            R();
        }
        I(j10);
    }

    public final Context E() {
        return this.f1551b;
    }

    public af.g F() {
        return this.f1556g;
    }

    public final Object G(ao.d<? super v> dVar) {
        Object f10 = j.f(this.f1561l, new C0035d(null), dVar);
        return f10 == bo.c.c() ? f10 : v.f59242a;
    }

    public final void H() {
        g9.a.g("releaseGLInternal");
        bf.c cVar = this.f1568s;
        if (cVar != null) {
            cVar.release();
        }
        this.f1568s = null;
        Surface surface = this.f1555f;
        if (surface != null) {
            surface.release();
        }
        this.f1555f = null;
        af.g F = F();
        if (F != null) {
            F.a(this.f1555f);
        }
        SurfaceTexture surfaceTexture = this.f1565p;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f1565p = null;
        a.b bVar = this.f1567r;
        if (bVar != null) {
            bVar.b();
        }
        this.f1567r = null;
        bf.a aVar = this.f1566q;
        if (aVar != null) {
            aVar.n();
        }
        this.f1566q = null;
    }

    public final void I(long j10) {
        a.b bVar = this.f1567r;
        if (bVar != null) {
            bVar.a();
        }
        if (this.f1568s == null) {
            return;
        }
        a.b bVar2 = this.f1567r;
        if (bVar2 != null) {
            bVar2.c(j10 * 1000 * 1000);
        }
        ze.d dVar = this.f1575z;
        if (dVar != null) {
            bf.c cVar = this.f1568s;
            jo.p.f(cVar, "null cannot be cast to non-null type com.dena.mirrorman.feature.recorder.glutils.GLDrawer");
            dVar.d(cVar, this.f1570u);
        }
        a.b bVar3 = this.f1567r;
        if (bVar3 != null) {
            bVar3.d();
        }
    }

    public final Object J(ao.d<? super v> dVar) {
        Object f10 = j.f(this.f1561l, new f(null), dVar);
        return f10 == bo.c.c() ? f10 : v.f59242a;
    }

    public final void K() {
        bf.a aVar = new bf.a(null, false);
        this.f1566q = aVar;
        a.b h10 = aVar.h(this.f1553d);
        this.f1567r = h10;
        if (h10 != null) {
            h10.a();
        }
        bf.d dVar = new bf.d();
        this.f1568s = dVar;
        this.f1569t = dVar.b();
        Q();
        this.f1575z = ze.c.f63116a.a();
        this.f1572w = this.f1571v;
        this.f1573x = this.f1571v;
        ze.d dVar2 = this.f1575z;
        if (dVar2 != null) {
            dVar2.a(this.f1569t, this.f1572w, this.f1554e, this.f1573x, true);
        }
    }

    public final void L() {
        g9.a.g("startProjection");
        try {
            O();
            e.a c10 = of.e.c(this.f1551b);
            VirtualDisplay virtualDisplay = this.f1574y;
            if (virtualDisplay != null) {
                virtualDisplay.release();
            }
            this.f1574y = null;
            this.f1574y = this.f1552c.createVirtualDisplay(TtmlNode.TEXT_EMPHASIS_AUTO, this.f1564o.getWidth(), this.f1564o.getHeight(), c10.a(), 16, this.f1555f, null, null);
            M();
        } catch (Exception e10) {
            g9.a.c(e10);
        }
    }

    public final void M() {
        d2 d10;
        this.A = false;
        d2 d2Var = this.B;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.A = true;
        d10 = uo.l.d(this.f1562m, null, null, new g(null), 3, null);
        this.B = d10;
    }

    public final void N() {
        O();
        VirtualDisplay virtualDisplay = this.f1574y;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        this.f1574y = null;
        this.f1552c.stop();
    }

    public final void O() {
        this.A = false;
        d2 d2Var = this.B;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.B = null;
    }

    public final void P() {
        e.a c10 = of.e.c(this.f1551b);
        Size c11 = ze.c.f63116a.c(c10.d(), c10.b(), this.f1554e.getWidth(), this.f1554e.getHeight());
        this.f1571v = c11;
        this.f1564o = c11;
    }

    @SuppressLint({"Recycle"})
    public final void Q() {
        try {
            SurfaceTexture surfaceTexture = this.f1565p;
            if (surfaceTexture != null) {
                surfaceTexture.setOnFrameAvailableListener(null, null);
            }
            SurfaceTexture surfaceTexture2 = this.f1565p;
            if (surfaceTexture2 != null) {
                surfaceTexture2.release();
            }
            Surface surface = this.f1555f;
            if (surface != null) {
                surface.release();
            }
            SurfaceTexture surfaceTexture3 = new SurfaceTexture(this.f1569t);
            this.f1565p = surfaceTexture3;
            surfaceTexture3.setDefaultBufferSize(this.f1564o.getWidth(), this.f1564o.getHeight());
            this.f1555f = new Surface(this.f1565p);
            af.g F = F();
            if (F != null) {
                F.a(this.f1555f);
            }
        } catch (Exception e10) {
            g9.a.c(e10);
            Surface surface2 = this.f1555f;
            if (surface2 != null) {
                surface2.release();
            }
            this.f1555f = null;
            SurfaceTexture surfaceTexture4 = this.f1565p;
            if (surfaceTexture4 != null) {
                surfaceTexture4.release();
            }
            this.f1565p = null;
        }
    }

    public final void R() {
        try {
            SurfaceTexture surfaceTexture = this.f1565p;
            if (surfaceTexture != null) {
                surfaceTexture.updateTexImage();
            }
            SurfaceTexture surfaceTexture2 = this.f1565p;
            if (surfaceTexture2 != null) {
                surfaceTexture2.getTransformMatrix(this.f1570u);
            }
        } catch (Exception e10) {
            g9.a.c(e10);
        }
    }

    @Override // af.e
    public o a() {
        return this.f1557h;
    }

    @Override // af.e
    public void b(h hVar) {
        this.f1558i = hVar;
    }

    @Override // af.e
    public void c() {
        uo.l.d(this.f1562m, null, null, new e(null), 3, null);
    }

    @Override // af.e
    public void e() {
        uo.l.d(this.f1562m, null, null, new b(null), 3, null);
    }

    @Override // af.f
    public void f(af.g gVar) {
        this.f1556g = gVar;
    }

    @Override // af.e
    public void release() {
        g9.a.g("release MediaProjectionSourceV2");
        uo.l.d(this.f1562m, null, null, new c(null), 3, null);
        i2.e(this.f1560k, null, 1, null);
        i2.e(this.f1561l, null, 1, null);
        r0.d(this.f1562m, null, 1, null);
        r0.d(this.f1563n, null, 1, null);
    }
}
