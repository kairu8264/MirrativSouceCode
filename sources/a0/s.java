package a0;

import a0.d0;
import java.util.ArrayList;
import java.util.List;
import l0.l1;
import q1.q0;
import v0.h;
import y.f;
import y.r0;
import y.t0;

/* loaded from: classes.dex */
public final class s {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ w.m C;
        public final /* synthetic */ boolean D;
        public final /* synthetic */ f.l E;
        public final /* synthetic */ f.d F;
        public final /* synthetic */ io.l<y, wn.v> G;
        public final /* synthetic */ int H;
        public final /* synthetic */ int I;
        public final /* synthetic */ int J;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f207w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ e0 f208x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.p<m2.d, m2.b, List<Integer>> f209y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ t0 f210z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x0.f fVar, e0 e0Var, io.p<? super m2.d, ? super m2.b, ? extends List<Integer>> pVar, t0 t0Var, boolean z10, boolean z11, w.m mVar, boolean z12, f.l lVar, f.d dVar, io.l<? super y, wn.v> lVar2, int i10, int i11, int i12) {
            super(2);
            this.f207w = fVar;
            this.f208x = e0Var;
            this.f209y = pVar;
            this.f210z = t0Var;
            this.A = z10;
            this.B = z11;
            this.C = mVar;
            this.D = z12;
            this.E = lVar;
            this.F = dVar;
            this.G = lVar2;
            this.H = i10;
            this.I = i11;
            this.J = i12;
        }

        public final void a(l0.i iVar, int i10) {
            s.a(this.f207w, this.f208x, this.f209y, this.f210z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, iVar, this.H | 1, this.I, this.J);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l f211w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ e0 f212x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f213y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l lVar, e0 e0Var, int i10) {
            super(2);
            this.f211w = lVar;
            this.f212x = e0Var;
            this.f213y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            s.b(this.f211w, this.f212x, iVar, this.f213y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<b0.i, m2.b, v> {
        public final /* synthetic */ l A;
        public final /* synthetic */ io.p<m2.d, m2.b, List<Integer>> B;
        public final /* synthetic */ f.l C;
        public final /* synthetic */ f.d D;
        public final /* synthetic */ j E;
        public final /* synthetic */ v.i0 F;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f214w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ t0 f215x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f216y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ e0 f217z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<l0, ArrayList<wn.k<? extends Integer, ? extends m2.b>>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ d0 f218w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ j0 f219x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d0 d0Var, j0 j0Var) {
                super(1);
                this.f218w = d0Var;
                this.f219x = j0Var;
            }

            public final ArrayList<wn.k<Integer, m2.b>> a(int i10) {
                d0.c c10 = this.f218w.c(i10);
                int b10 = e.b(c10.a());
                ArrayList<wn.k<Integer, m2.b>> arrayList = new ArrayList<>(c10.b().size());
                List<a0.c> b11 = c10.b();
                j0 j0Var = this.f219x;
                int size = b11.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    int d10 = a0.c.d(b11.get(i12).g());
                    arrayList.add(wn.q.a(Integer.valueOf(b10), j0Var.c().invoke(Integer.valueOf(i11), Integer.valueOf(d10))));
                    b10 = e.b(b10 + 1);
                    i11 += d10;
                }
                return arrayList;
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ ArrayList<wn.k<? extends Integer, ? extends m2.b>> invoke(l0 l0Var) {
                return a(l0Var.g());
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.q<Integer, Integer, io.l<? super q0.a, ? extends wn.v>, q1.d0> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ b0.i f220w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ long f221x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ int f222y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f223z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(b0.i iVar, long j10, int i10, int i11) {
                super(3);
                this.f220w = iVar;
                this.f221x = j10;
                this.f222y = i10;
                this.f223z = i11;
            }

            public final q1.d0 a(int i10, int i11, io.l<? super q0.a, wn.v> lVar) {
                jo.p.h(lVar, "placement");
                return this.f220w.W(m2.c.g(this.f221x, i10 + this.f222y), m2.c.f(this.f221x, i11 + this.f223z), xn.n0.e(), lVar);
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ q1.d0 s0(Integer num, Integer num2, io.l<? super q0.a, ? extends wn.v> lVar) {
                return a(num.intValue(), num2.intValue(), lVar);
            }
        }

        /* renamed from: a0.s$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0003c implements m0 {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b0.i f224a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ boolean f225b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ boolean f226c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ int f227d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ int f228e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ j f229f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ long f230g;

            public C0003c(b0.i iVar, boolean z10, boolean z11, int i10, int i11, j jVar, long j10) {
                this.f224a = iVar;
                this.f225b = z10;
                this.f226c = z11;
                this.f227d = i10;
                this.f228e = i11;
                this.f229f = jVar;
                this.f230g = j10;
            }

            @Override // a0.m0
            public final g0 a(int i10, Object obj, int i11, int i12, q0[] q0VarArr) {
                jo.p.h(obj, "key");
                jo.p.h(q0VarArr, "placeables");
                return new g0(i10, obj, this.f225b, i11, i12, this.f226c, this.f224a.getLayoutDirection(), this.f227d, this.f228e, q0VarArr, this.f229f, this.f230g, null);
            }
        }

        /* loaded from: classes.dex */
        public static final class d implements n0 {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f231a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ List<Integer> f232b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ b0.i f233c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ int f234d;

            public d(boolean z10, List<Integer> list, b0.i iVar, int i10) {
                this.f231a = z10;
                this.f232b = list;
                this.f233c = iVar;
                this.f234d = i10;
            }

            @Override // a0.n0
            public final i0 a(int i10, g0[] g0VarArr, List<a0.c> list, int i11) {
                jo.p.h(g0VarArr, "items");
                jo.p.h(list, "spans");
                return new i0(i10, g0VarArr, list, this.f231a, this.f232b.size(), this.f233c.getLayoutDirection(), i11, this.f234d, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(boolean z10, t0 t0Var, boolean z11, e0 e0Var, l lVar, io.p<? super m2.d, ? super m2.b, ? extends List<Integer>> pVar, f.l lVar2, f.d dVar, j jVar, v.i0 i0Var) {
            super(2);
            this.f214w = z10;
            this.f215x = t0Var;
            this.f216y = z11;
            this.f217z = e0Var;
            this.A = lVar;
            this.B = pVar;
            this.C = lVar2;
            this.D = dVar;
            this.E = jVar;
            this.F = i0Var;
        }

        public final v a(b0.i iVar, long j10) {
            int X;
            int X2;
            int i10;
            float a10;
            float a11;
            int n10;
            long a12;
            int n11;
            int i11;
            jo.p.h(iVar, "$this$null");
            v.k.a(j10, this.f214w ? w.q.Vertical : w.q.Horizontal);
            if (this.f214w) {
                X = iVar.X(this.f215x.b(iVar.getLayoutDirection()));
            } else {
                X = iVar.X(r0.g(this.f215x, iVar.getLayoutDirection()));
            }
            if (this.f214w) {
                X2 = iVar.X(this.f215x.c(iVar.getLayoutDirection()));
            } else {
                X2 = iVar.X(r0.f(this.f215x, iVar.getLayoutDirection()));
            }
            int X3 = iVar.X(this.f215x.d());
            int X4 = iVar.X(this.f215x.a());
            int i12 = X3 + X4;
            int i13 = X + X2;
            boolean z10 = this.f214w;
            int i14 = z10 ? i12 : i13;
            if (z10 && !this.f216y) {
                i10 = X3;
            } else if (z10 && this.f216y) {
                i10 = X4;
            } else {
                i10 = (z10 || this.f216y) ? X2 : X;
            }
            int i15 = i14 - i10;
            long i16 = m2.c.i(j10, -i13, -i12);
            this.f217z.J(this.A);
            d0 h10 = this.A.h();
            List<Integer> invoke = this.B.invoke(iVar, m2.b.b(j10));
            h10.g(invoke.size());
            this.f217z.C(iVar);
            this.f217z.G(invoke.size());
            if (this.f214w) {
                f.l lVar = this.C;
                if (lVar == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                a10 = lVar.a();
            } else {
                f.d dVar = this.D;
                if (dVar == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                a10 = dVar.a();
            }
            int X5 = iVar.X(a10);
            if (this.f214w) {
                f.d dVar2 = this.D;
                a11 = dVar2 != null ? dVar2.a() : m2.g.l(0);
            } else {
                f.l lVar2 = this.C;
                a11 = lVar2 != null ? lVar2.a() : m2.g.l(0);
            }
            int X6 = iVar.X(a11);
            int d10 = this.A.d();
            if (this.f214w) {
                n10 = m2.b.m(j10) - i12;
            } else {
                n10 = m2.b.n(j10) - i13;
            }
            int i17 = n10;
            if (this.f216y && i17 <= 0) {
                boolean z11 = this.f214w;
                if (!z11) {
                    X += i17;
                }
                if (z11) {
                    X3 += i17;
                }
                a12 = m2.l.a(X, X3);
            } else {
                a12 = m2.l.a(X, X3);
            }
            h0 h0Var = new h0(this.A, iVar, X5, new C0003c(iVar, this.f214w, this.f216y, i10, i15, this.E, a12));
            boolean z12 = this.f214w;
            j0 j0Var = new j0(z12, invoke, X6, d10, X5, h0Var, h10, new d(z12, invoke, iVar, X6));
            this.f217z.E(new a(h10, j0Var));
            h.a aVar = v0.h.f56484e;
            e0 e0Var = this.f217z;
            v0.h a13 = aVar.a();
            try {
                v0.h k10 = a13.k();
                if (e0Var.m() >= d10 && d10 > 0) {
                    i11 = h10.d(d10 - 1);
                    n11 = 0;
                    wn.v vVar = wn.v.f59242a;
                    a13.r(k10);
                    a13.d();
                    v c10 = u.c(d10, j0Var, h0Var, i17, invoke.size(), i10, i15, i11, n11, this.f217z.v(), i16, this.f214w, this.C, this.D, this.f216y, iVar, this.E, new b(iVar, j10, i13, i12));
                    e0 e0Var2 = this.f217z;
                    v.i0 i0Var = this.F;
                    e0Var2.i(c10);
                    s.e(i0Var, c10);
                    return c10;
                }
                int d11 = h10.d(e0Var.m());
                n11 = e0Var.n();
                i11 = d11;
                wn.v vVar2 = wn.v.f59242a;
                a13.r(k10);
                a13.d();
                v c102 = u.c(d10, j0Var, h0Var, i17, invoke.size(), i10, i15, i11, n11, this.f217z.v(), i16, this.f214w, this.C, this.D, this.f216y, iVar, this.E, new b(iVar, j10, i13, i12));
                e0 e0Var22 = this.f217z;
                v.i0 i0Var2 = this.F;
                e0Var22.i(c102);
                s.e(i0Var2, c102);
                return c102;
            } catch (Throwable th2) {
                a13.d();
                throw th2;
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(b0.i iVar, m2.b bVar) {
            return a(iVar, bVar.t());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0307 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(x0.f r32, a0.e0 r33, io.p<? super m2.d, ? super m2.b, ? extends java.util.List<java.lang.Integer>> r34, y.t0 r35, boolean r36, boolean r37, w.m r38, boolean r39, y.f.l r40, y.f.d r41, io.l<? super a0.y, wn.v> r42, l0.i r43, int r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.s.a(x0.f, a0.e0, io.p, y.t0, boolean, boolean, w.m, boolean, y.f$l, y.f$d, io.l, l0.i, int, int, int):void");
    }

    public static final void b(l lVar, e0 e0Var, l0.i iVar, int i10) {
        int i11;
        l0.i h10 = iVar.h(950944068);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(lVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(e0Var) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && h10.j()) {
            h10.I();
        } else if (lVar.d() > 0) {
            e0Var.J(lVar);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(lVar, e0Var, i10));
    }

    public static final void e(v.i0 i0Var, v vVar) {
        Object obj;
        g0[] b10;
        boolean d10 = vVar.d();
        i0 g10 = vVar.g();
        boolean z10 = false;
        if (g10 == null || (b10 = g10.b()) == null || (obj = (g0) xn.o.G(b10)) == null) {
            obj = 0;
        }
        boolean z11 = (jo.p.c(obj, 0) && vVar.h() == 0) ? false : true;
        if (d10 || z11) {
            z10 = true;
        }
        i0Var.setEnabled(z10);
    }

    public static final io.p<b0.i, m2.b, q1.d0> f(l lVar, e0 e0Var, v.i0 i0Var, io.p<? super m2.d, ? super m2.b, ? extends List<Integer>> pVar, t0 t0Var, boolean z10, boolean z11, f.d dVar, f.l lVar2, j jVar, l0.i iVar, int i10, int i11) {
        iVar.x(1958911962);
        f.d dVar2 = (i11 & 128) != 0 ? null : dVar;
        f.l lVar3 = (i11 & 256) != 0 ? null : lVar2;
        Object[] objArr = {e0Var, i0Var, pVar, t0Var, Boolean.valueOf(z10), Boolean.valueOf(z11), dVar2, lVar3, jVar};
        iVar.x(-568225417);
        boolean z12 = false;
        for (int i12 = 0; i12 < 9; i12++) {
            z12 |= iVar.P(objArr[i12]);
        }
        Object y10 = iVar.y();
        if (z12 || y10 == l0.i.f39065a.a()) {
            y10 = new c(z11, t0Var, z10, e0Var, lVar, pVar, lVar3, dVar2, jVar, i0Var);
            iVar.q(y10);
        }
        iVar.O();
        io.p<b0.i, m2.b, q1.d0> pVar2 = (io.p) y10;
        iVar.O();
        return pVar2;
    }
}
