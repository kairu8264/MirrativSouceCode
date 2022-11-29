package z;

import b0.k;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.List;
import l0.s0;
import l0.z1;
import q1.t0;

/* loaded from: classes.dex */
public final class g0 implements w.b0 {

    /* renamed from: t  reason: collision with root package name */
    public static final c f62215t = new c(null);

    /* renamed from: u  reason: collision with root package name */
    public static final u0.i<g0, ?> f62216u = u0.a.a(a.f62236w, b.f62237w);

    /* renamed from: a  reason: collision with root package name */
    public final e0 f62217a;

    /* renamed from: b  reason: collision with root package name */
    public final s0<v> f62218b;

    /* renamed from: c  reason: collision with root package name */
    public final x.m f62219c;

    /* renamed from: d  reason: collision with root package name */
    public float f62220d;

    /* renamed from: e  reason: collision with root package name */
    public final s0 f62221e;

    /* renamed from: f  reason: collision with root package name */
    public final w.b0 f62222f;

    /* renamed from: g  reason: collision with root package name */
    public int f62223g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f62224h;

    /* renamed from: i  reason: collision with root package name */
    public int f62225i;

    /* renamed from: j  reason: collision with root package name */
    public k.a f62226j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f62227k;

    /* renamed from: l  reason: collision with root package name */
    public final s0 f62228l;

    /* renamed from: m  reason: collision with root package name */
    public final t0 f62229m;

    /* renamed from: n  reason: collision with root package name */
    public final z.a f62230n;

    /* renamed from: o  reason: collision with root package name */
    public final s0 f62231o;

    /* renamed from: p  reason: collision with root package name */
    public final s0 f62232p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f62233q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f62234r;

    /* renamed from: s  reason: collision with root package name */
    public final b0.k f62235s;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<u0.k, g0, List<? extends Integer>> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f62236w = new a();

        public a() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final List<Integer> invoke(u0.k kVar, g0 g0Var) {
            jo.p.h(kVar, "$this$listSaver");
            jo.p.h(g0Var, "it");
            return xn.s.m(Integer.valueOf(g0Var.m()), Integer.valueOf(g0Var.n()));
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<List<? extends Integer>, g0> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f62237w = new b();

        public b() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final g0 invoke(List<Integer> list) {
            jo.p.h(list, "it");
            return new g0(list.get(0).intValue(), list.get(1).intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(jo.h hVar) {
            this();
        }

        public final u0.i<g0, ?> a() {
            return g0.f62216u;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements t0 {
        public d() {
        }

        @Override // q1.t0
        public void p0(q1.s0 s0Var) {
            jo.p.h(s0Var, "remeasurement");
            g0.this.D(s0Var);
        }
    }

    @co.f(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {TsExtractor.TS_STREAM_TYPE_AIT, 258}, m = "scroll")
    /* loaded from: classes.dex */
    public static final class e extends co.d {
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f62239w;

        /* renamed from: x  reason: collision with root package name */
        public Object f62240x;

        /* renamed from: y  reason: collision with root package name */
        public Object f62241y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f62242z;

        public e(ao.d<? super e> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f62242z = obj;
            this.B |= Integer.MIN_VALUE;
            return g0.this.a(null, null, this);
        }
    }

    @co.f(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends co.l implements io.p<w.y, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f62243w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f62245y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f62246z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i10, int i11, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f62245y = i10;
            this.f62246z = i11;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(w.y yVar, ao.d<? super wn.v> dVar) {
            return ((f) create(yVar, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f62245y, this.f62246z, dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f62243w == 0) {
                wn.m.b(obj);
                g0.this.E(this.f62245y, this.f62246z);
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.l<Float, Float> {
        public g() {
            super(1);
        }

        public final Float invoke(float f10) {
            return Float.valueOf(-g0.this.x(-f10));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return invoke(f10.floatValue());
        }
    }

    public g0() {
        this(0, 0, 3, null);
    }

    public g0(int i10, int i11) {
        s0<v> e10;
        s0 e11;
        s0 e12;
        s0 e13;
        s0 e14;
        this.f62217a = new e0(i10, i11);
        e10 = z1.e(z.c.f62171a, null, 2, null);
        this.f62218b = e10;
        this.f62219c = x.l.a();
        e11 = z1.e(m2.f.a(1.0f, 1.0f), null, 2, null);
        this.f62221e = e11;
        this.f62222f = w.c0.a(new g());
        this.f62224h = true;
        this.f62225i = -1;
        e12 = z1.e(null, null, 2, null);
        this.f62228l = e12;
        this.f62229m = new d();
        this.f62230n = new z.a();
        e13 = z1.e(null, null, 2, null);
        this.f62231o = e13;
        e14 = z1.e(m2.b.b(m2.c.b(0, 0, 0, 0, 15, null)), null, 2, null);
        this.f62232p = e14;
        this.f62235s = new b0.k();
    }

    public static /* synthetic */ Object h(g0 g0Var, int i10, int i11, ao.d dVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return g0Var.g(i10, i11, dVar);
    }

    public static /* synthetic */ Object z(g0 g0Var, int i10, int i11, ao.d dVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return g0Var.y(i10, i11, dVar);
    }

    public final void A(m2.d dVar) {
        jo.p.h(dVar, "<set-?>");
        this.f62221e.setValue(dVar);
    }

    public final void B(o oVar) {
        this.f62231o.setValue(oVar);
    }

    public final void C(long j10) {
        this.f62232p.setValue(m2.b.b(j10));
    }

    public final void D(q1.s0 s0Var) {
        this.f62228l.setValue(s0Var);
    }

    public final void E(int i10, int i11) {
        this.f62217a.c(z.b.b(i10), i11);
        o q10 = q();
        if (q10 != null) {
            q10.f();
        }
        q1.s0 t10 = t();
        if (t10 != null) {
            t10.b();
        }
    }

    public final void F(q qVar) {
        jo.p.h(qVar, "itemProvider");
        this.f62217a.h(qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[RETURN] */
    @Override // w.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(v.d0 r6, io.p<? super w.y, ? super ao.d<? super wn.v>, ? extends java.lang.Object> r7, ao.d<? super wn.v> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof z.g0.e
            if (r0 == 0) goto L13
            r0 = r8
            z.g0$e r0 = (z.g0.e) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            z.g0$e r0 = new z.g0$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f62242z
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.B
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            wn.m.b(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f62241y
            r7 = r6
            io.p r7 = (io.p) r7
            java.lang.Object r6 = r0.f62240x
            v.d0 r6 = (v.d0) r6
            java.lang.Object r2 = r0.f62239w
            z.g0 r2 = (z.g0) r2
            wn.m.b(r8)
            goto L5a
        L45:
            wn.m.b(r8)
            z.a r8 = r5.f62230n
            r0.f62239w = r5
            r0.f62240x = r6
            r0.f62241y = r7
            r0.B = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r2 = r5
        L5a:
            w.b0 r8 = r2.f62222f
            r2 = 0
            r0.f62239w = r2
            r0.f62240x = r2
            r0.f62241y = r2
            r0.B = r3
            java.lang.Object r6 = r8.a(r6, r7, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            wn.v r6 = wn.v.f59242a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z.g0.a(v.d0, io.p, ao.d):java.lang.Object");
    }

    @Override // w.b0
    public boolean c() {
        return this.f62222f.c();
    }

    @Override // w.b0
    public float d(float f10) {
        return this.f62222f.d(f10);
    }

    public final Object g(int i10, int i11, ao.d<? super wn.v> dVar) {
        Object d10 = f0.d(this, i10, i11, dVar);
        return d10 == bo.c.c() ? d10 : wn.v.f59242a;
    }

    public final void i(x xVar) {
        jo.p.h(xVar, "result");
        this.f62217a.g(xVar);
        this.f62220d -= xVar.g();
        this.f62218b.setValue(xVar);
        this.f62234r = xVar.f();
        i0 h10 = xVar.h();
        boolean z10 = false;
        if ((h10 != null ? h10.b() : 0) != 0 || xVar.i() != 0) {
            z10 = true;
        }
        this.f62233q = z10;
        this.f62223g++;
    }

    public final z.a j() {
        return this.f62230n;
    }

    public final boolean k() {
        return this.f62234r;
    }

    public final m2.d l() {
        return (m2.d) this.f62221e.getValue();
    }

    public final int m() {
        return this.f62217a.a();
    }

    public final int n() {
        return this.f62217a.b();
    }

    public final x.m o() {
        return this.f62219c;
    }

    public final v p() {
        return this.f62218b.getValue();
    }

    public final o q() {
        return (o) this.f62231o.getValue();
    }

    public final b0.k r() {
        return this.f62235s;
    }

    public final long s() {
        return ((m2.b) this.f62232p.getValue()).t();
    }

    public final q1.s0 t() {
        return (q1.s0) this.f62228l.getValue();
    }

    public final t0 u() {
        return this.f62229m;
    }

    public final float v() {
        return this.f62220d;
    }

    public final void w(float f10) {
        int index;
        k.a aVar;
        if (this.f62224h) {
            v p10 = p();
            boolean z10 = true;
            if (!p10.b().isEmpty()) {
                boolean z11 = f10 < 0.0f;
                if (z11) {
                    index = ((n) xn.a0.i0(p10.b())).getIndex() + 1;
                } else {
                    index = ((n) xn.a0.X(p10.b())).getIndex() - 1;
                }
                if (index != this.f62225i) {
                    if (index < 0 || index >= p10.a()) {
                        z10 = false;
                    }
                    if (z10) {
                        if (this.f62227k != z11 && (aVar = this.f62226j) != null) {
                            aVar.cancel();
                        }
                        this.f62227k = z11;
                        this.f62225i = index;
                        this.f62226j = this.f62235s.b(index, s());
                    }
                }
            }
        }
    }

    public final float x(float f10) {
        if ((f10 >= 0.0f || this.f62234r) && (f10 <= 0.0f || this.f62233q)) {
            if (Math.abs(this.f62220d) <= 0.5f) {
                float f11 = this.f62220d + f10;
                this.f62220d = f11;
                if (Math.abs(f11) > 0.5f) {
                    float f12 = this.f62220d;
                    q1.s0 t10 = t();
                    if (t10 != null) {
                        t10.b();
                    }
                    if (this.f62224h) {
                        w(f12 - this.f62220d);
                    }
                }
                if (Math.abs(this.f62220d) <= 0.5f) {
                    return f10;
                }
                float f13 = f10 - this.f62220d;
                this.f62220d = 0.0f;
                return f13;
            }
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f62220d).toString());
        }
        return 0.0f;
    }

    public final Object y(int i10, int i11, ao.d<? super wn.v> dVar) {
        Object b10 = w.b0.b(this, null, new f(i10, i11, null), dVar, 1, null);
        return b10 == bo.c.c() ? b10 : wn.v.f59242a;
    }

    public /* synthetic */ g0(int i10, int i11, int i12, jo.h hVar) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
