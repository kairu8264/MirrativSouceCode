package g1;

import c1.u0;
import g1.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final List<f> f32467a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final b f32468b = new b(0.0f, 0.0f, 3, null);

    /* renamed from: c  reason: collision with root package name */
    public final b f32469c = new b(0.0f, 0.0f, 3, null);

    /* renamed from: d  reason: collision with root package name */
    public final b f32470d = new b(0.0f, 0.0f, 3, null);

    /* renamed from: e  reason: collision with root package name */
    public final b f32471e = new b(0.0f, 0.0f, 3, null);

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public float f32474a;

        /* renamed from: b  reason: collision with root package name */
        public float f32475b;

        public b() {
            this(0.0f, 0.0f, 3, null);
        }

        public b(float f10, float f11) {
            this.f32474a = f10;
            this.f32475b = f11;
        }

        public final float a() {
            return this.f32474a;
        }

        public final float b() {
            return this.f32475b;
        }

        public final void c() {
            this.f32474a = 0.0f;
            this.f32475b = 0.0f;
        }

        public final void d(float f10) {
            this.f32474a = f10;
        }

        public final void e(float f10) {
            this.f32475b = f10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return jo.p.c(Float.valueOf(this.f32474a), Float.valueOf(bVar.f32474a)) && jo.p.c(Float.valueOf(this.f32475b), Float.valueOf(bVar.f32475b));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f32474a) * 31) + Float.hashCode(this.f32475b);
        }

        public String toString() {
            return "PathPoint(x=" + this.f32474a + ", y=" + this.f32475b + ')';
        }

        public /* synthetic */ b(float f10, float f11, int i10, jo.h hVar) {
            this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
        }
    }

    public final void A(f.q qVar, boolean z10, u0 u0Var) {
        if (z10) {
            this.f32471e.d(this.f32468b.a() - this.f32469c.a());
            this.f32471e.e(this.f32468b.b() - this.f32469c.b());
        } else {
            this.f32471e.c();
        }
        u0Var.g(this.f32471e.a(), this.f32471e.b(), qVar.c(), qVar.d());
        this.f32469c.d(this.f32468b.a() + this.f32471e.a());
        this.f32469c.e(this.f32468b.b() + this.f32471e.b());
        b bVar = this.f32468b;
        bVar.d(bVar.a() + qVar.c());
        b bVar2 = this.f32468b;
        bVar2.e(bVar2.b() + qVar.d());
    }

    public final void B(f.r rVar, u0 u0Var) {
        u0Var.p(0.0f, rVar.c());
        b bVar = this.f32468b;
        bVar.e(bVar.b() + rVar.c());
    }

    public final List<f> C() {
        return this.f32467a;
    }

    public final u0 D(u0 u0Var) {
        jo.p.h(u0Var, "target");
        u0Var.reset();
        this.f32468b.c();
        this.f32469c.c();
        this.f32470d.c();
        this.f32471e.c();
        List<f> list = this.f32467a;
        int size = list.size();
        f fVar = null;
        int i10 = 0;
        while (i10 < size) {
            f fVar2 = list.get(i10);
            if (fVar == null) {
                fVar = fVar2;
            }
            if (fVar2 instanceof f.b) {
                f(u0Var);
            } else if (fVar2 instanceof f.n) {
                x((f.n) fVar2, u0Var);
            } else if (fVar2 instanceof f.C0374f) {
                n((f.C0374f) fVar2, u0Var);
            } else if (fVar2 instanceof f.m) {
                w((f.m) fVar2, u0Var);
            } else if (fVar2 instanceof f.e) {
                m((f.e) fVar2, u0Var);
            } else if (fVar2 instanceof f.l) {
                v((f.l) fVar2, u0Var);
            } else if (fVar2 instanceof f.d) {
                l((f.d) fVar2, u0Var);
            } else if (fVar2 instanceof f.r) {
                B((f.r) fVar2, u0Var);
            } else if (fVar2 instanceof f.s) {
                F((f.s) fVar2, u0Var);
            } else if (fVar2 instanceof f.k) {
                u((f.k) fVar2, u0Var);
            } else if (fVar2 instanceof f.c) {
                h((f.c) fVar2, u0Var);
            } else if (fVar2 instanceof f.p) {
                jo.p.e(fVar);
                z((f.p) fVar2, fVar.a(), u0Var);
            } else if (fVar2 instanceof f.h) {
                jo.p.e(fVar);
                r((f.h) fVar2, fVar.a(), u0Var);
            } else if (fVar2 instanceof f.o) {
                y((f.o) fVar2, u0Var);
            } else if (fVar2 instanceof f.g) {
                q((f.g) fVar2, u0Var);
            } else if (fVar2 instanceof f.q) {
                jo.p.e(fVar);
                A((f.q) fVar2, fVar.b(), u0Var);
            } else if (fVar2 instanceof f.i) {
                jo.p.e(fVar);
                s((f.i) fVar2, fVar.b(), u0Var);
            } else if (fVar2 instanceof f.j) {
                t((f.j) fVar2, u0Var);
            } else if (fVar2 instanceof f.a) {
                c((f.a) fVar2, u0Var);
            }
            i10++;
            fVar = fVar2;
        }
        return u0Var;
    }

    public final double E(double d10) {
        return (d10 / 180) * 3.141592653589793d;
    }

    public final void F(f.s sVar, u0 u0Var) {
        u0Var.q(this.f32468b.a(), sVar.c());
        this.f32468b.e(sVar.c());
    }

    public final void a(char c10, float[] fArr) {
        this.f32467a.addAll(g.a(c10, fArr));
    }

    public final h b(List<? extends f> list) {
        jo.p.h(list, "nodes");
        this.f32467a.addAll(list);
        return this;
    }

    public final void c(f.a aVar, u0 u0Var) {
        i(u0Var, this.f32468b.a(), this.f32468b.b(), aVar.c(), aVar.d(), aVar.e(), aVar.g(), aVar.f(), aVar.h(), aVar.i());
        this.f32468b.d(aVar.c());
        this.f32468b.e(aVar.d());
        this.f32469c.d(this.f32468b.a());
        this.f32469c.e(this.f32468b.b());
    }

    public final void d(u0 u0Var, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        double d19 = d12;
        double d20 = 4;
        int ceil = (int) Math.ceil(Math.abs((d18 * d20) / 3.141592653589793d));
        double cos = Math.cos(d16);
        double sin = Math.sin(d16);
        double cos2 = Math.cos(d17);
        double sin2 = Math.sin(d17);
        double d21 = -d19;
        double d22 = d21 * cos;
        double d23 = d13 * sin;
        double d24 = (d22 * sin2) - (d23 * cos2);
        double d25 = d21 * sin;
        double d26 = d13 * cos;
        double d27 = (sin2 * d25) + (cos2 * d26);
        double d28 = d18 / ceil;
        double d29 = d14;
        double d30 = d27;
        double d31 = d24;
        int i10 = 0;
        double d32 = d15;
        double d33 = d17;
        while (i10 < ceil) {
            double d34 = d33 + d28;
            double sin3 = Math.sin(d34);
            double cos3 = Math.cos(d34);
            int i11 = ceil;
            double d35 = (d10 + ((d19 * cos) * cos3)) - (d23 * sin3);
            double d36 = d11 + (d19 * sin * cos3) + (d26 * sin3);
            double d37 = (d22 * sin3) - (d23 * cos3);
            double d38 = (sin3 * d25) + (cos3 * d26);
            double d39 = d34 - d33;
            double tan = Math.tan(d39 / 2);
            double sin4 = (Math.sin(d39) * (Math.sqrt(d20 + ((3.0d * tan) * tan)) - 1)) / 3;
            u0Var.o((float) (d29 + (d31 * sin4)), (float) (d32 + (d30 * sin4)), (float) (d35 - (sin4 * d37)), (float) (d36 - (sin4 * d38)), (float) d35, (float) d36);
            i10++;
            d28 = d28;
            sin = sin;
            d29 = d35;
            d25 = d25;
            d33 = d34;
            d30 = d38;
            d20 = d20;
            d31 = d37;
            cos = cos;
            ceil = i11;
            d32 = d36;
            d19 = d12;
        }
    }

    public final void e() {
        this.f32467a.clear();
    }

    public final void f(u0 u0Var) {
        this.f32468b.d(this.f32470d.a());
        this.f32468b.e(this.f32470d.b());
        this.f32469c.d(this.f32470d.a());
        this.f32469c.e(this.f32470d.b());
        u0Var.close();
        u0Var.n(this.f32468b.a(), this.f32468b.b());
    }

    public final float[] g(float[] fArr, int i10, int i11) {
        if (i10 <= i11) {
            int length = fArr.length;
            if (i10 >= 0 && i10 <= length) {
                int i12 = i11 - i10;
                int min = Math.min(i12, length - i10);
                float[] fArr2 = new float[i12];
                xn.n.f(fArr, fArr2, 0, i10, min + i10);
                return fArr2;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public final void h(f.c cVar, u0 u0Var) {
        u0Var.o(cVar.c(), cVar.f(), cVar.d(), cVar.g(), cVar.e(), cVar.h());
        this.f32469c.d(cVar.d());
        this.f32469c.e(cVar.g());
        this.f32468b.d(cVar.e());
        this.f32468b.e(cVar.h());
    }

    public final void i(u0 u0Var, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        double d17;
        double d18;
        double E = E(d16);
        double cos = Math.cos(E);
        double sin = Math.sin(E);
        double d19 = ((d10 * cos) + (d11 * sin)) / d14;
        double d20 = (((-d10) * sin) + (d11 * cos)) / d15;
        double d21 = ((d12 * cos) + (d13 * sin)) / d14;
        double d22 = (((-d12) * sin) + (d13 * cos)) / d15;
        double d23 = d19 - d21;
        double d24 = d20 - d22;
        double d25 = 2;
        double d26 = (d19 + d21) / d25;
        double d27 = (d20 + d22) / d25;
        double d28 = (d23 * d23) + (d24 * d24);
        if (d28 == 0.0d) {
            return;
        }
        double d29 = (1.0d / d28) - 0.25d;
        if (d29 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d28) / 1.99999d);
            i(u0Var, d10, d11, d12, d13, d14 * sqrt, d15 * sqrt, d16, z10, z11);
            return;
        }
        double sqrt2 = Math.sqrt(d29);
        double d30 = d23 * sqrt2;
        double d31 = sqrt2 * d24;
        if (z10 == z11) {
            d17 = d26 - d31;
            d18 = d27 + d30;
        } else {
            d17 = d26 + d31;
            d18 = d27 - d30;
        }
        double atan2 = Math.atan2(d20 - d18, d19 - d17);
        double atan22 = Math.atan2(d22 - d18, d21 - d17) - atan2;
        int i10 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (z11 != (i10 >= 0)) {
            atan22 = i10 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d32 = d17 * d14;
        double d33 = d18 * d15;
        d(u0Var, (d32 * cos) - (d33 * sin), (d32 * sin) + (d33 * cos), d14, d15, d10, d11, E, atan2, atan22);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0051 A[LOOP:0: B:3:0x0008->B:36:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0054 A[EDGE_INSN: B:40:0x0054->B:37:0x0054 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.lang.String r9, int r10, g1.h.a r11) {
        /*
            r8 = this;
            r0 = 0
            r11.d(r0)
            r1 = r10
            r2 = r0
            r3 = r2
            r4 = r3
        L8:
            int r5 = r9.length()
            if (r1 >= r5) goto L54
            char r5 = r9.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 != r6) goto L19
        L17:
            r6 = r7
            goto L1f
        L19:
            r6 = 44
            if (r5 != r6) goto L1e
            goto L17
        L1e:
            r6 = r0
        L1f:
            if (r6 == 0) goto L24
        L21:
            r2 = r0
            r4 = r7
            goto L4e
        L24:
            r6 = 45
            if (r5 != r6) goto L30
            if (r1 == r10) goto L4d
            if (r2 != 0) goto L4d
            r11.d(r7)
            goto L21
        L30:
            r2 = 46
            if (r5 != r2) goto L3d
            if (r3 != 0) goto L39
            r2 = r0
            r3 = r7
            goto L4e
        L39:
            r11.d(r7)
            goto L21
        L3d:
            r2 = 101(0x65, float:1.42E-43)
            if (r5 != r2) goto L43
        L41:
            r2 = r7
            goto L49
        L43:
            r2 = 69
            if (r5 != r2) goto L48
            goto L41
        L48:
            r2 = r0
        L49:
            if (r2 == 0) goto L4d
            r2 = r7
            goto L4e
        L4d:
            r2 = r0
        L4e:
            if (r4 == 0) goto L51
            goto L54
        L51:
            int r1 = r1 + 1
            goto L8
        L54:
            r11.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.h.j(java.lang.String, int, g1.h$a):void");
    }

    public final float[] k(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        float[] fArr = new float[str.length()];
        a aVar = new a(0, false, 3, null);
        int length = str.length();
        int i10 = 1;
        int i11 = 0;
        while (i10 < length) {
            j(str, i10, aVar);
            int a10 = aVar.a();
            if (i10 < a10) {
                String substring = str.substring(i10, a10);
                jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                fArr[i11] = Float.parseFloat(substring);
                i11++;
            }
            i10 = aVar.b() ? a10 : a10 + 1;
        }
        return g(fArr, 0, i11);
    }

    public final void l(f.d dVar, u0 u0Var) {
        u0Var.q(dVar.c(), this.f32468b.b());
        this.f32468b.d(dVar.c());
    }

    public final void m(f.e eVar, u0 u0Var) {
        u0Var.q(eVar.c(), eVar.d());
        this.f32468b.d(eVar.c());
        this.f32468b.e(eVar.d());
    }

    public final void n(f.C0374f c0374f, u0 u0Var) {
        this.f32468b.d(c0374f.c());
        this.f32468b.e(c0374f.d());
        u0Var.n(c0374f.c(), c0374f.d());
        this.f32470d.d(this.f32468b.a());
        this.f32470d.e(this.f32468b.b());
    }

    public final int o(String str, int i10) {
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i10;
            }
            i10++;
        }
        return i10;
    }

    public final h p(String str) {
        jo.p.h(str, "pathData");
        this.f32467a.clear();
        int i10 = 0;
        int i11 = 1;
        while (i11 < str.length()) {
            int o10 = o(str, i11);
            String substring = str.substring(i10, o10);
            jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int length = substring.length() - 1;
            int i12 = 0;
            boolean z10 = false;
            while (i12 <= length) {
                boolean z11 = jo.p.j(substring.charAt(!z10 ? i12 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i12++;
                } else {
                    z10 = true;
                }
            }
            String obj = substring.subSequence(i12, length + 1).toString();
            if (obj.length() > 0) {
                a(obj.charAt(0), k(obj));
            }
            i10 = o10;
            i11 = o10 + 1;
        }
        if (i11 - i10 == 1 && i10 < str.length()) {
            a(str.charAt(i10), new float[0]);
        }
        return this;
    }

    public final void q(f.g gVar, u0 u0Var) {
        u0Var.f(gVar.c(), gVar.e(), gVar.d(), gVar.f());
        this.f32469c.d(gVar.c());
        this.f32469c.e(gVar.e());
        this.f32468b.d(gVar.d());
        this.f32468b.e(gVar.f());
    }

    public final void r(f.h hVar, boolean z10, u0 u0Var) {
        if (z10) {
            float f10 = 2;
            this.f32471e.d((this.f32468b.a() * f10) - this.f32469c.a());
            this.f32471e.e((f10 * this.f32468b.b()) - this.f32469c.b());
        } else {
            this.f32471e.d(this.f32468b.a());
            this.f32471e.e(this.f32468b.b());
        }
        u0Var.o(this.f32471e.a(), this.f32471e.b(), hVar.c(), hVar.e(), hVar.d(), hVar.f());
        this.f32469c.d(hVar.c());
        this.f32469c.e(hVar.e());
        this.f32468b.d(hVar.d());
        this.f32468b.e(hVar.f());
    }

    public final void s(f.i iVar, boolean z10, u0 u0Var) {
        if (z10) {
            float f10 = 2;
            this.f32471e.d((this.f32468b.a() * f10) - this.f32469c.a());
            this.f32471e.e((f10 * this.f32468b.b()) - this.f32469c.b());
        } else {
            this.f32471e.d(this.f32468b.a());
            this.f32471e.e(this.f32468b.b());
        }
        u0Var.f(this.f32471e.a(), this.f32471e.b(), iVar.c(), iVar.d());
        this.f32469c.d(this.f32471e.a());
        this.f32469c.e(this.f32471e.b());
        this.f32468b.d(iVar.c());
        this.f32468b.e(iVar.d());
    }

    public final void t(f.j jVar, u0 u0Var) {
        float c10 = jVar.c() + this.f32468b.a();
        float d10 = jVar.d() + this.f32468b.b();
        i(u0Var, this.f32468b.a(), this.f32468b.b(), c10, d10, jVar.e(), jVar.g(), jVar.f(), jVar.h(), jVar.i());
        this.f32468b.d(c10);
        this.f32468b.e(d10);
        this.f32469c.d(this.f32468b.a());
        this.f32469c.e(this.f32468b.b());
    }

    public final void u(f.k kVar, u0 u0Var) {
        u0Var.e(kVar.c(), kVar.f(), kVar.d(), kVar.g(), kVar.e(), kVar.h());
        this.f32469c.d(this.f32468b.a() + kVar.d());
        this.f32469c.e(this.f32468b.b() + kVar.g());
        b bVar = this.f32468b;
        bVar.d(bVar.a() + kVar.e());
        b bVar2 = this.f32468b;
        bVar2.e(bVar2.b() + kVar.h());
    }

    public final void v(f.l lVar, u0 u0Var) {
        u0Var.p(lVar.c(), 0.0f);
        b bVar = this.f32468b;
        bVar.d(bVar.a() + lVar.c());
    }

    public final void w(f.m mVar, u0 u0Var) {
        u0Var.p(mVar.c(), mVar.d());
        b bVar = this.f32468b;
        bVar.d(bVar.a() + mVar.c());
        b bVar2 = this.f32468b;
        bVar2.e(bVar2.b() + mVar.d());
    }

    public final void x(f.n nVar, u0 u0Var) {
        b bVar = this.f32468b;
        bVar.d(bVar.a() + nVar.c());
        b bVar2 = this.f32468b;
        bVar2.e(bVar2.b() + nVar.d());
        u0Var.d(nVar.c(), nVar.d());
        this.f32470d.d(this.f32468b.a());
        this.f32470d.e(this.f32468b.b());
    }

    public final void y(f.o oVar, u0 u0Var) {
        u0Var.g(oVar.c(), oVar.e(), oVar.d(), oVar.f());
        this.f32469c.d(this.f32468b.a() + oVar.c());
        this.f32469c.e(this.f32468b.b() + oVar.e());
        b bVar = this.f32468b;
        bVar.d(bVar.a() + oVar.d());
        b bVar2 = this.f32468b;
        bVar2.e(bVar2.b() + oVar.f());
    }

    public final void z(f.p pVar, boolean z10, u0 u0Var) {
        if (z10) {
            this.f32471e.d(this.f32468b.a() - this.f32469c.a());
            this.f32471e.e(this.f32468b.b() - this.f32469c.b());
        } else {
            this.f32471e.c();
        }
        u0Var.e(this.f32471e.a(), this.f32471e.b(), pVar.c(), pVar.e(), pVar.d(), pVar.f());
        this.f32469c.d(this.f32468b.a() + pVar.c());
        this.f32469c.e(this.f32468b.b() + pVar.e());
        b bVar = this.f32468b;
        bVar.d(bVar.a() + pVar.d());
        b bVar2 = this.f32468b;
        bVar2.e(bVar2.b() + pVar.f());
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f32472a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f32473b;

        public a() {
            this(0, false, 3, null);
        }

        public a(int i10, boolean z10) {
            this.f32472a = i10;
            this.f32473b = z10;
        }

        public final int a() {
            return this.f32472a;
        }

        public final boolean b() {
            return this.f32473b;
        }

        public final void c(int i10) {
            this.f32472a = i10;
        }

        public final void d(boolean z10) {
            this.f32473b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f32472a == aVar.f32472a && this.f32473b == aVar.f32473b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = Integer.hashCode(this.f32472a) * 31;
            boolean z10 = this.f32473b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "ExtractFloatResult(endPosition=" + this.f32472a + ", endWithNegativeOrDot=" + this.f32473b + ')';
        }

        public /* synthetic */ a(int i10, boolean z10, int i11, jo.h hVar) {
            this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? false : z10);
        }
    }
}
