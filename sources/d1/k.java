package d1;

import java.util.Arrays;
import jo.f0;
import jo.p;
import jo.q;

/* loaded from: classes.dex */
public final class k extends d1.c {

    /* renamed from: r  reason: collision with root package name */
    public static final h f29021r = new h(null);

    /* renamed from: s  reason: collision with root package name */
    public static final io.l<Double, Double> f29022s = g.f29042w;

    /* renamed from: e  reason: collision with root package name */
    public final m f29023e;

    /* renamed from: f  reason: collision with root package name */
    public final float f29024f;

    /* renamed from: g  reason: collision with root package name */
    public final float f29025g;

    /* renamed from: h  reason: collision with root package name */
    public final l f29026h;

    /* renamed from: i  reason: collision with root package name */
    public final float[] f29027i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f29028j;

    /* renamed from: k  reason: collision with root package name */
    public final float[] f29029k;

    /* renamed from: l  reason: collision with root package name */
    public final io.l<Double, Double> f29030l;

    /* renamed from: m  reason: collision with root package name */
    public final io.l<Double, Double> f29031m;

    /* renamed from: n  reason: collision with root package name */
    public final io.l<Double, Double> f29032n;

    /* renamed from: o  reason: collision with root package name */
    public final io.l<Double, Double> f29033o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f29034p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f29035q;

    /* loaded from: classes.dex */
    public static final class a extends q implements io.l<Double, Double> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l f29036w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar) {
            super(1);
            this.f29036w = lVar;
        }

        public final Double a(double d10) {
            return Double.valueOf(d1.d.n(d10, this.f29036w.a(), this.f29036w.b(), this.f29036w.c(), this.f29036w.d(), this.f29036w.g()));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.l<Double, Double> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l f29037w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l lVar) {
            super(1);
            this.f29037w = lVar;
        }

        public final Double a(double d10) {
            return Double.valueOf(d1.d.o(d10, this.f29037w.a(), this.f29037w.b(), this.f29037w.c(), this.f29037w.d(), this.f29037w.e(), this.f29037w.f(), this.f29037w.g()));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.l<Double, Double> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l f29038w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l lVar) {
            super(1);
            this.f29038w = lVar;
        }

        public final Double a(double d10) {
            return Double.valueOf(d1.d.p(d10, this.f29038w.a(), this.f29038w.b(), this.f29038w.c(), this.f29038w.d(), this.f29038w.g()));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements io.l<Double, Double> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l f29039w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l lVar) {
            super(1);
            this.f29039w = lVar;
        }

        public final Double a(double d10) {
            return Double.valueOf(d1.d.q(d10, this.f29039w.a(), this.f29039w.b(), this.f29039w.c(), this.f29039w.d(), this.f29039w.e(), this.f29039w.f(), this.f29039w.g()));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends q implements io.l<Double, Double> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ double f29040w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(double d10) {
            super(1);
            this.f29040w = d10;
        }

        public final Double a(double d10) {
            if (d10 < 0.0d) {
                d10 = 0.0d;
            }
            return Double.valueOf(Math.pow(d10, 1.0d / this.f29040w));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements io.l<Double, Double> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ double f29041w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(double d10) {
            super(1);
            this.f29041w = d10;
        }

        public final Double a(double d10) {
            if (d10 < 0.0d) {
                d10 = 0.0d;
            }
            return Double.valueOf(Math.pow(d10, this.f29041w));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends q implements io.l<Double, Double> {

        /* renamed from: w  reason: collision with root package name */
        public static final g f29042w = new g();

        public g() {
            super(1);
        }

        public final Double a(double d10) {
            return Double.valueOf(d10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class h {
        public h() {
        }

        public /* synthetic */ h(jo.h hVar) {
            this();
        }

        public final float e(float[] fArr) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float f16 = ((((((f10 * f13) + (f11 * f14)) + (f12 * f15)) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            return f16 < 0.0f ? -f16 : f16;
        }

        public final boolean f(double d10, io.l<? super Double, Double> lVar, io.l<? super Double, Double> lVar2) {
            return Math.abs(lVar.invoke(Double.valueOf(d10)).doubleValue() - lVar2.invoke(Double.valueOf(d10)).doubleValue()) <= 0.001d;
        }

        public final float[] g(float[] fArr, m mVar) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float a10 = mVar.a();
            float b10 = mVar.b();
            float f16 = 1;
            float f17 = (f16 - f10) / f11;
            float f18 = f10 / f11;
            float f19 = (f12 / f13) - f18;
            float f20 = (a10 / b10) - f18;
            float f21 = ((f16 - f12) / f13) - f17;
            float f22 = (f14 / f15) - f18;
            float f23 = (((((f16 - a10) / b10) - f17) * f19) - (f20 * f21)) / (((((f16 - f14) / f15) - f17) * f19) - (f21 * f22));
            float f24 = (f20 - (f22 * f23)) / f19;
            float f25 = (1.0f - f24) - f23;
            float f26 = f25 / f11;
            float f27 = f24 / f13;
            float f28 = f23 / f15;
            return new float[]{f26 * f10, f25, f26 * ((1.0f - f10) - f11), f27 * f12, f24, f27 * ((1.0f - f12) - f13), f28 * f14, f23, f28 * ((1.0f - f14) - f15)};
        }

        public final boolean h(float[] fArr, float[] fArr2) {
            float[] fArr3 = {fArr[0] - fArr2[0], fArr[1] - fArr2[1], fArr[2] - fArr2[2], fArr[3] - fArr2[3], fArr[4] - fArr2[4], fArr[5] - fArr2[5]};
            return i(fArr3[0], fArr3[1], fArr2[0] - fArr2[4], fArr2[1] - fArr2[5]) >= 0.0f && i(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) >= 0.0f && i(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) >= 0.0f && i(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) >= 0.0f && i(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) >= 0.0f && i(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) >= 0.0f;
        }

        public final float i(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        public final boolean j(float[] fArr, m mVar, io.l<? super Double, Double> lVar, io.l<? super Double, Double> lVar2, float f10, float f11, int i10) {
            if (i10 == 0) {
                return true;
            }
            d1.e eVar = d1.e.f28963a;
            if (d1.d.g(fArr, eVar.s()) && d1.d.f(mVar, d1.g.f28999a.e())) {
                if (f10 == 0.0f) {
                    if (f11 == 1.0f) {
                        k r10 = eVar.r();
                        for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                            if (!f(d10, lVar, r10.p()) || !f(d10, lVar2, r10.m())) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public final boolean k(float[] fArr, float f10, float f11) {
            float e10 = e(fArr);
            d1.e eVar = d1.e.f28963a;
            return (e10 / e(eVar.o()) > 0.9f && h(fArr, eVar.s())) || (f10 < 0.0f && f11 > 1.0f);
        }

        public final float[] l(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f10 = fArr[0] + fArr[1] + fArr[2];
                fArr2[0] = fArr[0] / f10;
                fArr2[1] = fArr[1] / f10;
                float f11 = fArr[3] + fArr[4] + fArr[5];
                fArr2[2] = fArr[3] / f11;
                fArr2[3] = fArr[4] / f11;
                float f12 = fArr[6] + fArr[7] + fArr[8];
                fArr2[4] = fArr[6] / f12;
                fArr2[5] = fArr[7] / f12;
            } else {
                xn.n.k(fArr, fArr2, 0, 0, 6, 6, null);
            }
            return fArr2;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends q implements io.l<Double, Double> {
        public i() {
            super(1);
        }

        public final Double a(double d10) {
            return k.this.m().invoke(Double.valueOf(po.n.k(d10, k.this.f29024f, k.this.f29025g)));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends q implements io.l<Double, Double> {
        public j() {
            super(1);
        }

        public final Double a(double d10) {
            return Double.valueOf(po.n.k(k.this.p().invoke(Double.valueOf(d10)).doubleValue(), k.this.f29024f, k.this.f29025g));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(String str, float[] fArr, m mVar, float[] fArr2, io.l<? super Double, Double> lVar, io.l<? super Double, Double> lVar2, float f10, float f11, l lVar3, int i10) {
        super(str, d1.b.f28954a.b(), i10, null);
        p.h(str, "name");
        p.h(fArr, "primaries");
        p.h(mVar, "whitePoint");
        p.h(lVar, "oetf");
        p.h(lVar2, "eotf");
        this.f29023e = mVar;
        this.f29024f = f10;
        this.f29025g = f11;
        this.f29026h = lVar3;
        this.f29030l = lVar;
        this.f29031m = new j();
        this.f29032n = lVar2;
        this.f29033o = new i();
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 < f11) {
            h hVar = f29021r;
            float[] l10 = hVar.l(fArr);
            this.f29027i = l10;
            if (fArr2 == null) {
                this.f29028j = hVar.g(l10, mVar);
            } else if (fArr2.length == 9) {
                this.f29028j = fArr2;
            } else {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f29029k = d1.d.j(this.f29028j);
            this.f29034p = hVar.k(l10, f10, f11);
            this.f29035q = hVar.j(l10, mVar, lVar, lVar2, f10, f11, i10);
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
    }

    @Override // d1.c
    public float[] a(float[] fArr) {
        p.h(fArr, "v");
        d1.d.m(this.f29029k, fArr);
        fArr[0] = (float) this.f29031m.invoke(Double.valueOf(fArr[0])).doubleValue();
        fArr[1] = (float) this.f29031m.invoke(Double.valueOf(fArr[1])).doubleValue();
        fArr[2] = (float) this.f29031m.invoke(Double.valueOf(fArr[2])).doubleValue();
        return fArr;
    }

    @Override // d1.c
    public float d(int i10) {
        return this.f29025g;
    }

    @Override // d1.c
    public float e(int i10) {
        return this.f29024f;
    }

    @Override // d1.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.c(f0.b(k.class), f0.b(obj.getClass())) && super.equals(obj)) {
            k kVar = (k) obj;
            if (Float.compare(kVar.f29024f, this.f29024f) == 0 && Float.compare(kVar.f29025g, this.f29025g) == 0 && p.c(this.f29023e, kVar.f29023e) && Arrays.equals(this.f29027i, kVar.f29027i)) {
                l lVar = this.f29026h;
                if (lVar != null) {
                    return p.c(lVar, kVar.f29026h);
                }
                if (kVar.f29026h == null) {
                    return true;
                }
                if (p.c(this.f29030l, kVar.f29030l)) {
                    return p.c(this.f29032n, kVar.f29032n);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // d1.c
    public boolean h() {
        return this.f29035q;
    }

    @Override // d1.c
    public int hashCode() {
        int hashCode = ((((super.hashCode() * 31) + this.f29023e.hashCode()) * 31) + Arrays.hashCode(this.f29027i)) * 31;
        float f10 = this.f29024f;
        int floatToIntBits = (hashCode + (!((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) == 0) ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f29025g;
        int floatToIntBits2 = (floatToIntBits + (!(f11 == 0.0f) ? Float.floatToIntBits(f11) : 0)) * 31;
        l lVar = this.f29026h;
        int hashCode2 = floatToIntBits2 + (lVar != null ? lVar.hashCode() : 0);
        return this.f29026h == null ? (((hashCode2 * 31) + this.f29030l.hashCode()) * 31) + this.f29032n.hashCode() : hashCode2;
    }

    @Override // d1.c
    public float[] i(float[] fArr) {
        p.h(fArr, "v");
        fArr[0] = (float) this.f29033o.invoke(Double.valueOf(fArr[0])).doubleValue();
        fArr[1] = (float) this.f29033o.invoke(Double.valueOf(fArr[1])).doubleValue();
        fArr[2] = (float) this.f29033o.invoke(Double.valueOf(fArr[2])).doubleValue();
        return d1.d.m(this.f29028j, fArr);
    }

    public final io.l<Double, Double> l() {
        return this.f29033o;
    }

    public final io.l<Double, Double> m() {
        return this.f29032n;
    }

    public final float[] n() {
        return this.f29029k;
    }

    public final io.l<Double, Double> o() {
        return this.f29031m;
    }

    public final io.l<Double, Double> p() {
        return this.f29030l;
    }

    public final float[] q() {
        return this.f29028j;
    }

    public final m r() {
        return this.f29023e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(java.lang.String r13, float[] r14, d1.m r15, d1.l r16, int r17) {
        /*
            r12 = this;
            r9 = r16
            java.lang.String r0 = "name"
            r1 = r13
            jo.p.h(r13, r0)
            java.lang.String r0 = "primaries"
            r2 = r14
            jo.p.h(r14, r0)
            java.lang.String r0 = "whitePoint"
            r3 = r15
            jo.p.h(r15, r0)
            java.lang.String r0 = "function"
            jo.p.h(r9, r0)
            double r4 = r16.e()
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L27
            r0 = r4
            goto L28
        L27:
            r0 = r5
        L28:
            if (r0 == 0) goto L3d
            double r10 = r16.f()
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 != 0) goto L34
            r0 = r4
            goto L35
        L34:
            r0 = r5
        L35:
            if (r0 == 0) goto L3d
            d1.k$a r0 = new d1.k$a
            r0.<init>(r9)
            goto L42
        L3d:
            d1.k$b r0 = new d1.k$b
            r0.<init>(r9)
        L42:
            r8 = r0
            double r10 = r16.e()
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 != 0) goto L4d
            r0 = r4
            goto L4e
        L4d:
            r0 = r5
        L4e:
            if (r0 == 0) goto L62
            double r10 = r16.f()
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 != 0) goto L59
            goto L5a
        L59:
            r4 = r5
        L5a:
            if (r4 == 0) goto L62
            d1.k$c r0 = new d1.k$c
            r0.<init>(r9)
            goto L67
        L62:
            d1.k$d r0 = new d1.k$d
            r0.<init>(r9)
        L67:
            r6 = r0
            r7 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r5 = r8
            r8 = r10
            r9 = r16
            r10 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.k.<init>(java.lang.String, float[], d1.m, d1.l, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(java.lang.String r23, float[] r24, d1.m r25, double r26, float r28, float r29, int r30) {
        /*
            r22 = this;
            r1 = r26
            java.lang.String r0 = "name"
            r15 = r23
            jo.p.h(r15, r0)
            java.lang.String r0 = "primaries"
            r13 = r24
            jo.p.h(r13, r0)
            java.lang.String r0 = "whitePoint"
            r14 = r25
            jo.p.h(r14, r0)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L21
            r5 = r3
            goto L22
        L21:
            r5 = r4
        L22:
            if (r5 == 0) goto L27
            io.l<java.lang.Double, java.lang.Double> r5 = d1.k.f29022s
            goto L2c
        L27:
            d1.k$e r5 = new d1.k$e
            r5.<init>(r1)
        L2c:
            r17 = r5
            if (r0 != 0) goto L31
            goto L32
        L31:
            r3 = r4
        L32:
            if (r3 == 0) goto L37
            io.l<java.lang.Double, java.lang.Double> r0 = d1.k.f29022s
            goto L3c
        L37:
            d1.k$f r0 = new d1.k$f
            r0.<init>(r1)
        L3c:
            r18 = r0
            d1.l r19 = new d1.l
            r0 = r19
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r20 = 0
            r13 = r20
            r16 = 96
            r15 = r16
            r16 = 0
            r1 = r26
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r5 = 0
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r6 = r17
            r7 = r18
            r8 = r28
            r9 = r29
            r10 = r19
            r11 = r30
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.k.<init>(java.lang.String, float[], d1.m, double, float, float, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(k kVar, float[] fArr, m mVar) {
        this(kVar.g(), kVar.f29027i, mVar, fArr, kVar.f29030l, kVar.f29032n, kVar.f29024f, kVar.f29025g, kVar.f29026h, -1);
        p.h(kVar, "colorSpace");
        p.h(fArr, "transform");
        p.h(mVar, "whitePoint");
    }
}
