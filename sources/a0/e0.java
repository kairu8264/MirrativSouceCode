package a0;

import b0.k;
import java.util.List;
import l0.s0;
import l0.z1;
import q1.t0;

/* loaded from: classes.dex */
public final class e0 implements w.b0 {

    /* renamed from: v  reason: collision with root package name */
    public static final c f49v = new c(null);

    /* renamed from: w  reason: collision with root package name */
    public static final u0.i<e0, ?> f50w = u0.a.a(a.f72w, b.f73w);

    /* renamed from: a  reason: collision with root package name */
    public final a0 f51a;

    /* renamed from: b  reason: collision with root package name */
    public final s0<t> f52b;

    /* renamed from: c  reason: collision with root package name */
    public final x.m f53c;

    /* renamed from: d  reason: collision with root package name */
    public float f54d;

    /* renamed from: e  reason: collision with root package name */
    public final s0 f55e;

    /* renamed from: f  reason: collision with root package name */
    public final s0 f56f;

    /* renamed from: g  reason: collision with root package name */
    public final s0 f57g;

    /* renamed from: h  reason: collision with root package name */
    public final w.b0 f58h;

    /* renamed from: i  reason: collision with root package name */
    public int f59i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f60j;

    /* renamed from: k  reason: collision with root package name */
    public int f61k;

    /* renamed from: l  reason: collision with root package name */
    public final m0.e<k.a> f62l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f63m;

    /* renamed from: n  reason: collision with root package name */
    public final s0 f64n;

    /* renamed from: o  reason: collision with root package name */
    public final t0 f65o;

    /* renamed from: p  reason: collision with root package name */
    public final z.a f66p;

    /* renamed from: q  reason: collision with root package name */
    public final s0 f67q;

    /* renamed from: r  reason: collision with root package name */
    public final s0 f68r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f69s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f70t;

    /* renamed from: u  reason: collision with root package name */
    public final b0.k f71u;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<u0.k, e0, List<? extends Integer>> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f72w = new a();

        public a() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final List<Integer> invoke(u0.k kVar, e0 e0Var) {
            jo.p.h(kVar, "$this$listSaver");
            jo.p.h(e0Var, "it");
            return xn.s.m(Integer.valueOf(e0Var.m()), Integer.valueOf(e0Var.n()));
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<List<? extends Integer>, e0> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f73w = new b();

        public b() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final e0 invoke(List<Integer> list) {
            jo.p.h(list, "it");
            return new e0(list.get(0).intValue(), list.get(1).intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(jo.h hVar) {
            this();
        }

        public final u0.i<e0, ?> a() {
            return e0.f50w;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<l0, List<? extends wn.k<? extends Integer, ? extends m2.b>>> {

        /* renamed from: w  reason: collision with root package name */
        public static final d f74w = new d();

        public d() {
            super(1);
        }

        public final List<wn.k<Integer, m2.b>> a(int i10) {
            return xn.s.k();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ List<? extends wn.k<? extends Integer, ? extends m2.b>> invoke(l0 l0Var) {
            return a(l0Var.g());
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements t0 {
        public e() {
        }

        @Override // q1.t0
        public void p0(q1.s0 s0Var) {
            jo.p.h(s0Var, "remeasurement");
            e0.this.F(s0Var);
        }
    }

    @co.f(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", l = {263, 264}, m = "scroll")
    /* loaded from: classes.dex */
    public static final class f extends co.d {
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f76w;

        /* renamed from: x  reason: collision with root package name */
        public Object f77x;

        /* renamed from: y  reason: collision with root package name */
        public Object f78y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f79z;

        public f(ao.d<? super f> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f79z = obj;
            this.B |= Integer.MIN_VALUE;
            return e0.this.a(null, null, this);
        }
    }

    @co.f(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends co.l implements io.p<w.y, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f80w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f82y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f83z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i10, int i11, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f82y = i10;
            this.f83z = i11;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(w.y yVar, ao.d<? super wn.v> dVar) {
            return ((g) create(yVar, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f82y, this.f83z, dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f80w == 0) {
                wn.m.b(obj);
                e0.this.I(this.f82y, this.f83z);
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.l<Float, Float> {
        public h() {
            super(1);
        }

        public final Float invoke(float f10) {
            return Float.valueOf(-e0.this.z(-f10));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return invoke(f10.floatValue());
        }
    }

    public e0() {
        this(0, 0, 3, null);
    }

    public e0(int i10, int i11) {
        s0<t> e10;
        s0 e11;
        s0 e12;
        s0 e13;
        s0 e14;
        s0 e15;
        s0 e16;
        this.f51a = new a0(i10, i11);
        e10 = z1.e(a0.a.f1a, null, 2, null);
        this.f52b = e10;
        this.f53c = x.l.a();
        e11 = z1.e(0, null, 2, null);
        this.f55e = e11;
        e12 = z1.e(m2.f.a(1.0f, 1.0f), null, 2, null);
        this.f56f = e12;
        e13 = z1.e(Boolean.TRUE, null, 2, null);
        this.f57g = e13;
        this.f58h = w.c0.a(new h());
        this.f60j = true;
        this.f61k = -1;
        this.f62l = new m0.e<>(new k.a[16], 0);
        e14 = z1.e(null, null, 2, null);
        this.f64n = e14;
        this.f65o = new e();
        this.f66p = new z.a();
        e15 = z1.e(d.f74w, null, 2, null);
        this.f67q = e15;
        e16 = z1.e(null, null, 2, null);
        this.f68r = e16;
        this.f71u = new b0.k();
    }

    public static /* synthetic */ Object B(e0 e0Var, int i10, int i11, ao.d dVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return e0Var.A(i10, i11, dVar);
    }

    public static /* synthetic */ Object h(e0 e0Var, int i10, int i11, ao.d dVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return e0Var.g(i10, i11, dVar);
    }

    public final Object A(int i10, int i11, ao.d<? super wn.v> dVar) {
        Object b10 = w.b0.b(this, null, new g(i10, i11, null), dVar, 1, null);
        return b10 == bo.c.c() ? b10 : wn.v.f59242a;
    }

    public final void C(m2.d dVar) {
        jo.p.h(dVar, "<set-?>");
        this.f56f.setValue(dVar);
    }

    public final void D(j jVar) {
        this.f68r.setValue(jVar);
    }

    public final void E(io.l<? super l0, ? extends List<wn.k<Integer, m2.b>>> lVar) {
        jo.p.h(lVar, "<set-?>");
        this.f67q.setValue(lVar);
    }

    public final void F(q1.s0 s0Var) {
        this.f64n.setValue(s0Var);
    }

    public final void G(int i10) {
        this.f55e.setValue(Integer.valueOf(i10));
    }

    public final void H(boolean z10) {
        this.f57g.setValue(Boolean.valueOf(z10));
    }

    public final void I(int i10, int i11) {
        this.f51a.c(a0.e.b(i10), i11);
        j q10 = q();
        if (q10 != null) {
            q10.f();
        }
        q1.s0 t10 = t();
        if (t10 != null) {
            t10.b();
        }
    }

    public final void J(l lVar) {
        jo.p.h(lVar, "itemProvider");
        this.f51a.h(lVar);
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
            boolean r0 = r8 instanceof a0.e0.f
            if (r0 == 0) goto L13
            r0 = r8
            a0.e0$f r0 = (a0.e0.f) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            a0.e0$f r0 = new a0.e0$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f79z
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
            java.lang.Object r6 = r0.f78y
            r7 = r6
            io.p r7 = (io.p) r7
            java.lang.Object r6 = r0.f77x
            v.d0 r6 = (v.d0) r6
            java.lang.Object r2 = r0.f76w
            a0.e0 r2 = (a0.e0) r2
            wn.m.b(r8)
            goto L5a
        L45:
            wn.m.b(r8)
            z.a r8 = r5.f66p
            r0.f76w = r5
            r0.f77x = r6
            r0.f78y = r7
            r0.B = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r2 = r5
        L5a:
            w.b0 r8 = r2.f58h
            r2 = 0
            r0.f76w = r2
            r0.f77x = r2
            r0.f78y = r2
            r0.B = r3
            java.lang.Object r6 = r8.a(r6, r7, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            wn.v r6 = wn.v.f59242a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.e0.a(v.d0, io.p, ao.d):java.lang.Object");
    }

    @Override // w.b0
    public boolean c() {
        return this.f58h.c();
    }

    @Override // w.b0
    public float d(float f10) {
        return this.f58h.d(f10);
    }

    public final Object g(int i10, int i11, ao.d<? super wn.v> dVar) {
        Object f10 = b0.f(this, i10, i11, w(), dVar);
        return f10 == bo.c.c() ? f10 : wn.v.f59242a;
    }

    public final void i(v vVar) {
        jo.p.h(vVar, "result");
        this.f51a.g(vVar);
        this.f54d -= vVar.f();
        this.f52b.setValue(vVar);
        this.f70t = vVar.d();
        i0 g10 = vVar.g();
        boolean z10 = false;
        if ((g10 != null ? g10.a() : 0) != 0 || vVar.h() != 0) {
            z10 = true;
        }
        this.f69s = z10;
        this.f59i++;
    }

    public final z.a j() {
        return this.f66p;
    }

    public final boolean k() {
        return this.f70t;
    }

    public final m2.d l() {
        return (m2.d) this.f56f.getValue();
    }

    public final int m() {
        return this.f51a.a();
    }

    public final int n() {
        return this.f51a.b();
    }

    public final x.m o() {
        return this.f53c;
    }

    public final t p() {
        return this.f52b.getValue();
    }

    public final j q() {
        return (j) this.f68r.getValue();
    }

    public final io.l<l0, List<wn.k<Integer, m2.b>>> r() {
        return (io.l) this.f67q.getValue();
    }

    public final b0.k s() {
        return this.f71u;
    }

    public final q1.s0 t() {
        return (q1.s0) this.f64n.getValue();
    }

    public final t0 u() {
        return this.f65o;
    }

    public final float v() {
        return this.f54d;
    }

    public final int w() {
        return ((Number) this.f55e.getValue()).intValue();
    }

    public final boolean x() {
        return ((Boolean) this.f57g.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3 A[LOOP:1: B:38:0x00c1->B:39:0x00c3, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(float r9) {
        /*
            r8 = this;
            b0.k r0 = r8.f71u
            boolean r1 = r8.f60j
            if (r1 != 0) goto L7
            return
        L7:
            a0.t r1 = r8.p()
            java.util.List r2 = r1.b()
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto Le9
            r2 = 0
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r2 = 0
            if (r9 >= 0) goto L1f
            r9 = r3
            goto L20
        L1f:
            r9 = r2
        L20:
            if (r9 == 0) goto L4c
            java.util.List r4 = r1.b()
            java.lang.Object r4 = xn.a0.i0(r4)
            a0.i r4 = (a0.i) r4
            boolean r5 = r8.x()
            if (r5 == 0) goto L37
            int r4 = r4.b()
            goto L3b
        L37:
            int r4 = r4.c()
        L3b:
            int r4 = r4 + r3
            java.util.List r5 = r1.b()
            java.lang.Object r5 = xn.a0.i0(r5)
            a0.i r5 = (a0.i) r5
            int r5 = r5.getIndex()
            int r5 = r5 + r3
            goto L76
        L4c:
            java.util.List r4 = r1.b()
            java.lang.Object r4 = xn.a0.X(r4)
            a0.i r4 = (a0.i) r4
            boolean r5 = r8.x()
            if (r5 == 0) goto L61
            int r4 = r4.b()
            goto L65
        L61:
            int r4 = r4.c()
        L65:
            int r4 = r4 + (-1)
            java.util.List r5 = r1.b()
            java.lang.Object r5 = xn.a0.X(r5)
            a0.i r5 = (a0.i) r5
            int r5 = r5.getIndex()
            int r5 = r5 - r3
        L76:
            int r6 = r8.f61k
            if (r4 == r6) goto Le9
            if (r5 < 0) goto L84
            int r1 = r1.a()
            if (r5 >= r1) goto L84
            r1 = r3
            goto L85
        L84:
            r1 = r2
        L85:
            if (r1 == 0) goto Le9
            boolean r1 = r8.f63m
            if (r1 == r9) goto La2
            m0.e<b0.k$a> r1 = r8.f62l
            int r5 = r1.p()
            if (r5 <= 0) goto La2
            java.lang.Object[] r1 = r1.n()
            r6 = r2
        L98:
            r7 = r1[r6]
            b0.k$a r7 = (b0.k.a) r7
            r7.cancel()
            int r6 = r6 + r3
            if (r6 < r5) goto L98
        La2:
            r8.f63m = r9
            r8.f61k = r4
            m0.e<b0.k$a> r9 = r8.f62l
            r9.h()
            io.l r9 = r8.r()
            int r1 = a0.l0.b(r4)
            a0.l0 r1 = a0.l0.a(r1)
            java.lang.Object r9 = r9.invoke(r1)
            java.util.List r9 = (java.util.List) r9
            int r1 = r9.size()
        Lc1:
            if (r2 >= r1) goto Le9
            java.lang.Object r3 = r9.get(r2)
            wn.k r3 = (wn.k) r3
            m0.e<b0.k$a> r4 = r8.f62l
            java.lang.Object r5 = r3.c()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r3 = r3.d()
            m2.b r3 = (m2.b) r3
            long r6 = r3.t()
            b0.k$a r3 = r0.b(r5, r6)
            r4.c(r3)
            int r2 = r2 + 1
            goto Lc1
        Le9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.e0.y(float):void");
    }

    public final float z(float f10) {
        if ((f10 >= 0.0f || this.f70t) && (f10 <= 0.0f || this.f69s)) {
            if (Math.abs(this.f54d) <= 0.5f) {
                float f11 = this.f54d + f10;
                this.f54d = f11;
                if (Math.abs(f11) > 0.5f) {
                    float f12 = this.f54d;
                    q1.s0 t10 = t();
                    if (t10 != null) {
                        t10.b();
                    }
                    if (this.f60j) {
                        y(f12 - this.f54d);
                    }
                }
                if (Math.abs(this.f54d) <= 0.5f) {
                    return f10;
                }
                float f13 = f10 - this.f54d;
                this.f54d = 0.0f;
                return f13;
            }
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f54d).toString());
        }
        return 0.0f;
    }

    public /* synthetic */ e0(int i10, int i11, int i12, jo.h hVar) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
