package y;

import java.util.List;
import q1.q0;

/* loaded from: classes.dex */
public final class w0 {

    /* loaded from: classes.dex */
    public static final class a implements q1.c0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g0 f61003a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f61004b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ e1 f61005c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ io.s<Integer, int[], m2.q, m2.d, int[], wn.v> f61006d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ s f61007e;

        /* renamed from: y.w0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1036a extends jo.q implements io.l<q0.a, wn.v> {
            public final /* synthetic */ q1.e0 A;
            public final /* synthetic */ int[] B;
            public final /* synthetic */ g0 C;
            public final /* synthetic */ x0[] D;
            public final /* synthetic */ s E;
            public final /* synthetic */ int F;
            public final /* synthetic */ jo.c0 G;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List<q1.b0> f61008w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ q1.q0[] f61009x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.s<Integer, int[], m2.q, m2.d, int[], wn.v> f61010y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f61011z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1036a(List<? extends q1.b0> list, q1.q0[] q0VarArr, io.s<? super Integer, ? super int[], ? super m2.q, ? super m2.d, ? super int[], wn.v> sVar, int i10, q1.e0 e0Var, int[] iArr, g0 g0Var, x0[] x0VarArr, s sVar2, int i11, jo.c0 c0Var) {
                super(1);
                this.f61008w = list;
                this.f61009x = q0VarArr;
                this.f61010y = sVar;
                this.f61011z = i10;
                this.A = e0Var;
                this.B = iArr;
                this.C = g0Var;
                this.D = x0VarArr;
                this.E = sVar2;
                this.F = i11;
                this.G = c0Var;
            }

            public final void a(q0.a aVar) {
                m2.q layoutDirection;
                int[] iArr;
                int i10;
                jo.p.h(aVar, "$this$layout");
                int size = this.f61008w.size();
                int[] iArr2 = new int[size];
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    q1.q0 q0Var = this.f61009x[i12];
                    jo.p.e(q0Var);
                    iArr2[i12] = w0.A(q0Var, this.C);
                }
                this.f61010y.P0(Integer.valueOf(this.f61011z), iArr2, this.A.getLayoutDirection(), this.A, this.B);
                q1.q0[] q0VarArr = this.f61009x;
                x0[] x0VarArr = this.D;
                s sVar = this.E;
                int i13 = this.F;
                g0 g0Var = this.C;
                q1.e0 e0Var = this.A;
                jo.c0 c0Var = this.G;
                int[] iArr3 = this.B;
                int length = q0VarArr.length;
                int i14 = 0;
                while (i11 < length) {
                    q1.q0 q0Var2 = q0VarArr[i11];
                    int i15 = i14 + 1;
                    jo.p.e(q0Var2);
                    s q10 = w0.q(x0VarArr[i14]);
                    if (q10 == null) {
                        q10 = sVar;
                    }
                    int z10 = i13 - w0.z(q0Var2, g0Var);
                    g0 g0Var2 = g0.Horizontal;
                    if (g0Var == g0Var2) {
                        layoutDirection = m2.q.Ltr;
                    } else {
                        layoutDirection = e0Var.getLayoutDirection();
                    }
                    q1.q0[] q0VarArr2 = q0VarArr;
                    m2.q qVar = layoutDirection;
                    int i16 = length;
                    int a10 = q10.a(z10, qVar, q0Var2, c0Var.f38129w);
                    if (g0Var == g0Var2) {
                        iArr = iArr3;
                        i10 = i11;
                        q0.a.j(aVar, q0Var2, iArr3[i14], a10, 0.0f, 4, null);
                    } else {
                        iArr = iArr3;
                        i10 = i11;
                        q0.a.j(aVar, q0Var2, a10, iArr[i14], 0.0f, 4, null);
                    }
                    i11 = i10 + 1;
                    i14 = i15;
                    length = i16;
                    q0VarArr = q0VarArr2;
                    iArr3 = iArr;
                }
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
                a(aVar);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(g0 g0Var, float f10, e1 e1Var, io.s<? super Integer, ? super int[], ? super m2.q, ? super m2.d, ? super int[], wn.v> sVar, s sVar2) {
            this.f61003a = g0Var;
            this.f61004b = f10;
            this.f61005c = e1Var;
            this.f61006d = sVar;
            this.f61007e = sVar2;
        }

        @Override // q1.c0
        public int a(q1.m mVar, List<? extends q1.l> list, int i10) {
            jo.p.h(mVar, "<this>");
            jo.p.h(list, "measurables");
            return ((Number) w0.a(this.f61003a).s0(list, Integer.valueOf(i10), Integer.valueOf(mVar.X(this.f61004b)))).intValue();
        }

        @Override // q1.c0
        public q1.d0 c(q1.e0 e0Var, List<? extends q1.b0> list, long j10) {
            int f10;
            int i10;
            int i11;
            float f11;
            int i12;
            int i13;
            int i14;
            int max;
            int i15;
            int i16;
            x0[] x0VarArr;
            List<? extends q1.b0> list2 = list;
            jo.p.h(e0Var, "$this$measure");
            jo.p.h(list2, "measurables");
            q0 q0Var = new q0(j10, this.f61003a, null);
            int X = e0Var.X(this.f61004b);
            int size = list.size();
            q1.q0[] q0VarArr = new q1.q0[size];
            int size2 = list.size();
            x0[] x0VarArr2 = new x0[size2];
            for (int i17 = 0; i17 < size2; i17++) {
                x0VarArr2[i17] = w0.r(list2.get(i17));
            }
            int size3 = list.size();
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            boolean z10 = false;
            float f12 = 0.0f;
            while (true) {
                if (i20 >= size3) {
                    break;
                }
                q1.b0 b0Var = list2.get(i20);
                x0 x0Var = x0VarArr2[i20];
                float t10 = w0.t(x0Var);
                if (t10 > 0.0f) {
                    f12 += t10;
                    i21++;
                    i15 = i20;
                    i16 = size3;
                    x0VarArr = x0VarArr2;
                } else {
                    int e10 = q0Var.e();
                    i15 = i20;
                    i16 = size3;
                    x0VarArr = x0VarArr2;
                    q1.q0 M = b0Var.M(q0.b(q0Var, 0, e10 != Integer.MAX_VALUE ? e10 - i22 : Integer.MAX_VALUE, 0, 0, 8, null).g(this.f61003a));
                    int min = Math.min(X, (e10 - i22) - w0.A(M, this.f61003a));
                    i22 += w0.A(M, this.f61003a) + min;
                    i19 = Math.max(i19, w0.z(M, this.f61003a));
                    boolean z11 = z10 || w0.x(x0Var);
                    q0VarArr[i15] = M;
                    i18 = min;
                    z10 = z11;
                }
                i20 = i15 + 1;
                size3 = i16;
                x0VarArr2 = x0VarArr;
            }
            int i23 = i19;
            x0[] x0VarArr3 = x0VarArr2;
            if (i21 == 0) {
                i22 -= i18;
                i10 = i23;
                i11 = 0;
            } else {
                int i24 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
                if (i24 > 0 && q0Var.e() != Integer.MAX_VALUE) {
                    f10 = q0Var.e();
                } else {
                    f10 = q0Var.f();
                }
                int i25 = X * (i21 - 1);
                int i26 = (f10 - i22) - i25;
                float f13 = i24 > 0 ? i26 / f12 : 0.0f;
                int i27 = 0;
                for (int i28 = 0; i28 < size2; i28++) {
                    i27 += lo.c.c(w0.t(x0VarArr3[i28]) * f13);
                }
                int size4 = list.size();
                int i29 = i26 - i27;
                i10 = i23;
                int i30 = 0;
                int i31 = 0;
                while (i30 < size4) {
                    if (q0VarArr[i30] == null) {
                        q1.b0 b0Var2 = list2.get(i30);
                        x0 x0Var2 = x0VarArr3[i30];
                        float t11 = w0.t(x0Var2);
                        if (t11 > 0.0f) {
                            int a10 = lo.c.a(i29);
                            int i32 = i29 - a10;
                            int max2 = Math.max(0, lo.c.c(t11 * f13) + a10);
                            f11 = f13;
                            if (!w0.s(x0Var2) || max2 == Integer.MAX_VALUE) {
                                i12 = size4;
                                i13 = 0;
                            } else {
                                i13 = max2;
                                i12 = size4;
                            }
                            q1.q0 M2 = b0Var2.M(new q0(i13, max2, 0, q0Var.c()).g(this.f61003a));
                            i31 += w0.A(M2, this.f61003a);
                            i10 = Math.max(i10, w0.z(M2, this.f61003a));
                            boolean z12 = z10 || w0.x(x0Var2);
                            q0VarArr[i30] = M2;
                            z10 = z12;
                            i29 = i32;
                        } else {
                            throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                        }
                    } else {
                        f11 = f13;
                        i12 = size4;
                    }
                    i30++;
                    list2 = list;
                    f13 = f11;
                    size4 = i12;
                }
                i11 = po.n.i(i31 + i25, q0Var.e() - i22);
            }
            jo.c0 c0Var = new jo.c0();
            if (z10) {
                i14 = 0;
                for (int i33 = 0; i33 < size; i33++) {
                    q1.q0 q0Var2 = q0VarArr[i33];
                    jo.p.e(q0Var2);
                    s q10 = w0.q(x0VarArr3[i33]);
                    Integer b10 = q10 != null ? q10.b(q0Var2) : null;
                    if (b10 != null) {
                        int i34 = c0Var.f38129w;
                        int intValue = b10.intValue();
                        if (intValue == Integer.MIN_VALUE) {
                            intValue = 0;
                        }
                        c0Var.f38129w = Math.max(i34, intValue);
                        int z13 = w0.z(q0Var2, this.f61003a);
                        g0 g0Var = this.f61003a;
                        int intValue2 = b10.intValue();
                        if (intValue2 == Integer.MIN_VALUE) {
                            intValue2 = w0.z(q0Var2, g0Var);
                        }
                        i14 = Math.max(i14, z13 - intValue2);
                    }
                }
            } else {
                i14 = 0;
            }
            int max3 = Math.max(i22 + i11, q0Var.f());
            if (q0Var.c() != Integer.MAX_VALUE && this.f61005c == e1.Expand) {
                max = q0Var.c();
            } else {
                max = Math.max(i10, Math.max(q0Var.d(), c0Var.f38129w + i14));
            }
            int i35 = max;
            g0 g0Var2 = this.f61003a;
            g0 g0Var3 = g0.Horizontal;
            int i36 = g0Var2 == g0Var3 ? max3 : i35;
            int i37 = g0Var2 == g0Var3 ? i35 : max3;
            int size5 = list.size();
            int[] iArr = new int[size5];
            for (int i38 = 0; i38 < size5; i38++) {
                iArr[i38] = 0;
            }
            return q1.e0.O0(e0Var, i36, i37, null, new C1036a(list, q0VarArr, this.f61006d, max3, e0Var, iArr, this.f61003a, x0VarArr3, this.f61007e, i35, c0Var), 4, null);
        }

        @Override // q1.c0
        public int d(q1.m mVar, List<? extends q1.l> list, int i10) {
            jo.p.h(mVar, "<this>");
            jo.p.h(list, "measurables");
            return ((Number) w0.b(this.f61003a).s0(list, Integer.valueOf(i10), Integer.valueOf(mVar.X(this.f61004b)))).intValue();
        }

        @Override // q1.c0
        public int e(q1.m mVar, List<? extends q1.l> list, int i10) {
            jo.p.h(mVar, "<this>");
            jo.p.h(list, "measurables");
            return ((Number) w0.c(this.f61003a).s0(list, Integer.valueOf(i10), Integer.valueOf(mVar.X(this.f61004b)))).intValue();
        }

        @Override // q1.c0
        public int g(q1.m mVar, List<? extends q1.l> list, int i10) {
            jo.p.h(mVar, "<this>");
            jo.p.h(list, "measurables");
            return ((Number) w0.d(this.f61003a).s0(list, Integer.valueOf(i10), Integer.valueOf(mVar.X(this.f61004b)))).intValue();
        }
    }

    public static final int A(q1.q0 q0Var, g0 g0Var) {
        return g0Var == g0.Horizontal ? q0Var.r0() : q0Var.f0();
    }

    public static final io.q<List<? extends q1.l>, Integer, Integer, Integer> a(g0 g0Var) {
        if (g0Var == g0.Horizontal) {
            return d0.f60696a.a();
        }
        return d0.f60696a.e();
    }

    public static final io.q<List<? extends q1.l>, Integer, Integer, Integer> b(g0 g0Var) {
        if (g0Var == g0.Horizontal) {
            return d0.f60696a.b();
        }
        return d0.f60696a.f();
    }

    public static final io.q<List<? extends q1.l>, Integer, Integer, Integer> c(g0 g0Var) {
        if (g0Var == g0.Horizontal) {
            return d0.f60696a.c();
        }
        return d0.f60696a.g();
    }

    public static final io.q<List<? extends q1.l>, Integer, Integer, Integer> d(g0 g0Var) {
        if (g0Var == g0.Horizontal) {
            return d0.f60696a.d();
        }
        return d0.f60696a.h();
    }

    public static final s q(x0 x0Var) {
        if (x0Var != null) {
            return x0Var.a();
        }
        return null;
    }

    public static final x0 r(q1.l lVar) {
        Object d10 = lVar.d();
        if (d10 instanceof x0) {
            return (x0) d10;
        }
        return null;
    }

    public static final boolean s(x0 x0Var) {
        if (x0Var != null) {
            return x0Var.b();
        }
        return true;
    }

    public static final float t(x0 x0Var) {
        if (x0Var != null) {
            return x0Var.c();
        }
        return 0.0f;
    }

    public static final int u(List<? extends q1.l> list, io.p<? super q1.l, ? super Integer, Integer> pVar, io.p<? super q1.l, ? super Integer, Integer> pVar2, int i10, int i11) {
        int c10;
        int min = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        float f10 = 0.0f;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            q1.l lVar = list.get(i13);
            float t10 = t(r(lVar));
            if (t10 == 0.0f) {
                int min2 = Math.min(pVar.invoke(lVar, Integer.MAX_VALUE).intValue(), i10 - min);
                min += min2;
                i12 = Math.max(i12, pVar2.invoke(lVar, Integer.valueOf(min2)).intValue());
            } else if (t10 > 0.0f) {
                f10 += t10;
            }
        }
        if (f10 == 0.0f) {
            c10 = 0;
        } else {
            c10 = i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : lo.c.c(Math.max(i10 - min, 0) / f10);
        }
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            q1.l lVar2 = list.get(i14);
            float t11 = t(r(lVar2));
            if (t11 > 0.0f) {
                i12 = Math.max(i12, pVar2.invoke(lVar2, Integer.valueOf(c10 != Integer.MAX_VALUE ? lo.c.c(c10 * t11) : Integer.MAX_VALUE)).intValue());
            }
        }
        return i12;
    }

    public static final int v(List<? extends q1.l> list, io.p<? super q1.l, ? super Integer, Integer> pVar, int i10, int i11) {
        int size = list.size();
        float f10 = 0.0f;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i12 < size) {
                q1.l lVar = list.get(i12);
                float t10 = t(r(lVar));
                int intValue = pVar.invoke(lVar, Integer.valueOf(i10)).intValue();
                if (t10 == 0.0f) {
                    i14 += intValue;
                } else if (t10 > 0.0f) {
                    f10 += t10;
                    i13 = Math.max(i13, lo.c.c(intValue / t10));
                }
                i12++;
            } else {
                return lo.c.c(i13 * f10) + i14 + ((list.size() - 1) * i11);
            }
        }
    }

    public static final int w(List<? extends q1.l> list, io.p<? super q1.l, ? super Integer, Integer> pVar, io.p<? super q1.l, ? super Integer, Integer> pVar2, int i10, int i11, g0 g0Var, g0 g0Var2) {
        if (g0Var == g0Var2) {
            return v(list, pVar, i10, i11);
        }
        return u(list, pVar2, pVar, i10, i11);
    }

    public static final boolean x(x0 x0Var) {
        s q10 = q(x0Var);
        if (q10 != null) {
            return q10.c();
        }
        return false;
    }

    public static final q1.c0 y(g0 g0Var, io.s<? super Integer, ? super int[], ? super m2.q, ? super m2.d, ? super int[], wn.v> sVar, float f10, e1 e1Var, s sVar2) {
        jo.p.h(g0Var, "orientation");
        jo.p.h(sVar, "arrangement");
        jo.p.h(e1Var, "crossAxisSize");
        jo.p.h(sVar2, "crossAxisAlignment");
        return new a(g0Var, f10, e1Var, sVar, sVar2);
    }

    public static final int z(q1.q0 q0Var, g0 g0Var) {
        return g0Var == g0.Horizontal ? q0Var.f0() : q0Var.r0();
    }
}
