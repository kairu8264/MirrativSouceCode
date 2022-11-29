package z;

import l0.l1;
import q1.q0;
import v0.h;
import x0.a;
import xn.n0;
import y.f;
import y.r0;
import y.t0;

/* loaded from: classes.dex */
public final class u {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ w.m B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ a.b D;
        public final /* synthetic */ f.l E;
        public final /* synthetic */ a.c F;
        public final /* synthetic */ f.d G;
        public final /* synthetic */ io.l<c0, wn.v> H;
        public final /* synthetic */ int I;
        public final /* synthetic */ int J;
        public final /* synthetic */ int K;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f62348w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g0 f62349x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ t0 f62350y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f62351z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x0.f fVar, g0 g0Var, t0 t0Var, boolean z10, boolean z11, w.m mVar, boolean z12, a.b bVar, f.l lVar, a.c cVar, f.d dVar, io.l<? super c0, wn.v> lVar2, int i10, int i11, int i12) {
            super(2);
            this.f62348w = fVar;
            this.f62349x = g0Var;
            this.f62350y = t0Var;
            this.f62351z = z10;
            this.A = z11;
            this.B = mVar;
            this.C = z12;
            this.D = bVar;
            this.E = lVar;
            this.F = cVar;
            this.G = dVar;
            this.H = lVar2;
            this.I = i10;
            this.J = i11;
            this.K = i12;
        }

        public final void a(l0.i iVar, int i10) {
            u.a(this.f62348w, this.f62349x, this.f62350y, this.f62351z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, iVar, this.I | 1, this.J, this.K);
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
        public final /* synthetic */ q f62352w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g0 f62353x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f62354y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q qVar, g0 g0Var, int i10) {
            super(2);
            this.f62352w = qVar;
            this.f62353x = g0Var;
            this.f62354y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            u.b(this.f62352w, this.f62353x, iVar, this.f62354y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<b0.i, m2.b, x> {
        public final /* synthetic */ q A;
        public final /* synthetic */ f.l B;
        public final /* synthetic */ f.d C;
        public final /* synthetic */ o D;
        public final /* synthetic */ j E;
        public final /* synthetic */ a.b F;
        public final /* synthetic */ a.c G;
        public final /* synthetic */ v.i0 H;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f62355w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ t0 f62356x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f62357y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ g0 f62358z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.q<Integer, Integer, io.l<? super q0.a, ? extends wn.v>, q1.d0> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ b0.i f62359w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ long f62360x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ int f62361y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f62362z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b0.i iVar, long j10, int i10, int i11) {
                super(3);
                this.f62359w = iVar;
                this.f62360x = j10;
                this.f62361y = i10;
                this.f62362z = i11;
            }

            public final q1.d0 a(int i10, int i11, io.l<? super q0.a, wn.v> lVar) {
                jo.p.h(lVar, "placement");
                return this.f62359w.W(m2.c.g(this.f62360x, i10 + this.f62361y), m2.c.f(this.f62360x, i11 + this.f62362z), n0.e(), lVar);
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ q1.d0 s0(Integer num, Integer num2, io.l<? super q0.a, ? extends wn.v> lVar) {
                return a(num.intValue(), num2.intValue(), lVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements l0 {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f62363a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ int f62364b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ b0.i f62365c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ boolean f62366d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ a.b f62367e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ a.c f62368f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ boolean f62369g;

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ int f62370h;

            /* renamed from: i  reason: collision with root package name */
            public final /* synthetic */ int f62371i;

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ o f62372j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ long f62373k;

            public b(int i10, int i11, b0.i iVar, boolean z10, a.b bVar, a.c cVar, boolean z11, int i12, int i13, o oVar, long j10) {
                this.f62363a = i10;
                this.f62364b = i11;
                this.f62365c = iVar;
                this.f62366d = z10;
                this.f62367e = bVar;
                this.f62368f = cVar;
                this.f62369g = z11;
                this.f62370h = i12;
                this.f62371i = i13;
                this.f62372j = oVar;
                this.f62373k = j10;
            }

            @Override // z.l0
            public final i0 a(int i10, Object obj, q0[] q0VarArr) {
                jo.p.h(obj, "key");
                jo.p.h(q0VarArr, "placeables");
                return new i0(i10, q0VarArr, this.f62366d, this.f62367e, this.f62368f, this.f62365c.getLayoutDirection(), this.f62369g, this.f62370h, this.f62371i, this.f62372j, i10 == this.f62363a + (-1) ? 0 : this.f62364b, this.f62373k, obj, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, t0 t0Var, boolean z11, g0 g0Var, q qVar, f.l lVar, f.d dVar, o oVar, j jVar, a.b bVar, a.c cVar, v.i0 i0Var) {
            super(2);
            this.f62355w = z10;
            this.f62356x = t0Var;
            this.f62357y = z11;
            this.f62358z = g0Var;
            this.A = qVar;
            this.B = lVar;
            this.C = dVar;
            this.D = oVar;
            this.E = jVar;
            this.F = bVar;
            this.G = cVar;
            this.H = i0Var;
        }

        public final x a(b0.i iVar, long j10) {
            int X;
            int X2;
            int i10;
            float a10;
            int n10;
            long a11;
            jo.p.h(iVar, "$this$null");
            v.k.a(j10, this.f62355w ? w.q.Vertical : w.q.Horizontal);
            if (this.f62355w) {
                X = iVar.X(this.f62356x.b(iVar.getLayoutDirection()));
            } else {
                X = iVar.X(r0.g(this.f62356x, iVar.getLayoutDirection()));
            }
            if (this.f62355w) {
                X2 = iVar.X(this.f62356x.c(iVar.getLayoutDirection()));
            } else {
                X2 = iVar.X(r0.f(this.f62356x, iVar.getLayoutDirection()));
            }
            int X3 = iVar.X(this.f62356x.d());
            int X4 = iVar.X(this.f62356x.a());
            int i11 = X3 + X4;
            int i12 = X + X2;
            boolean z10 = this.f62355w;
            int i13 = z10 ? i11 : i12;
            if (z10 && !this.f62357y) {
                i10 = X3;
            } else if (z10 && this.f62357y) {
                i10 = X4;
            } else {
                i10 = (z10 || this.f62357y) ? X2 : X;
            }
            int i14 = i13 - i10;
            long i15 = m2.c.i(j10, -i12, -i11);
            this.f62358z.F(this.A);
            this.f62358z.A(iVar);
            this.A.b().h(iVar.s(m2.b.n(i15)));
            this.A.b().g(iVar.s(m2.b.m(i15)));
            if (this.f62355w) {
                f.l lVar = this.B;
                if (lVar == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                a10 = lVar.a();
            } else {
                f.d dVar = this.C;
                if (dVar == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                a10 = dVar.a();
            }
            int X5 = iVar.X(a10);
            int d10 = this.A.d();
            if (this.f62355w) {
                n10 = m2.b.m(j10) - i11;
            } else {
                n10 = m2.b.n(j10) - i12;
            }
            int i16 = n10;
            if (this.f62357y && i16 <= 0) {
                boolean z11 = this.f62355w;
                if (!z11) {
                    X += i16;
                }
                if (z11) {
                    X3 += i16;
                }
                a11 = m2.l.a(X, X3);
            } else {
                a11 = m2.l.a(X, X3);
            }
            boolean z12 = this.f62355w;
            j0 j0Var = new j0(i15, z12, this.A, iVar, new b(d10, X5, iVar, z12, this.F, this.G, this.f62357y, i10, i14, this.D, a11), null);
            this.f62358z.C(j0Var.b());
            h.a aVar = v0.h.f56484e;
            g0 g0Var = this.f62358z;
            v0.h a12 = aVar.a();
            try {
                v0.h k10 = a12.k();
                int b10 = z.b.b(g0Var.m());
                int n11 = g0Var.n();
                wn.v vVar = wn.v.f59242a;
                a12.r(k10);
                a12.d();
                x c10 = w.c(d10, j0Var, i16, i10, i14, b10, n11, this.f62358z.v(), i15, this.f62355w, this.A.f(), this.B, this.C, this.f62357y, iVar, this.D, this.E, new a(iVar, j10, i12, i11));
                g0 g0Var2 = this.f62358z;
                v.i0 i0Var = this.H;
                g0Var2.i(c10);
                u.e(i0Var, c10);
                return c10;
            } catch (Throwable th2) {
                a12.d();
                throw th2;
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ x invoke(b0.i iVar, m2.b bVar) {
            return a(iVar, bVar.t());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0333 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(x0.f r33, z.g0 r34, y.t0 r35, boolean r36, boolean r37, w.m r38, boolean r39, x0.a.b r40, y.f.l r41, x0.a.c r42, y.f.d r43, io.l<? super z.c0, wn.v> r44, l0.i r45, int r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.u.a(x0.f, z.g0, y.t0, boolean, boolean, w.m, boolean, x0.a$b, y.f$l, x0.a$c, y.f$d, io.l, l0.i, int, int, int):void");
    }

    public static final void b(q qVar, g0 g0Var, l0.i iVar, int i10) {
        int i11;
        l0.i h10 = iVar.h(3173830);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(g0Var) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && h10.j()) {
            h10.I();
        } else if (qVar.d() > 0) {
            g0Var.F(qVar);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(qVar, g0Var, i10));
    }

    public static final void e(v.i0 i0Var, x xVar) {
        boolean f10 = xVar.f();
        i0 h10 = xVar.h();
        boolean z10 = false;
        boolean z11 = ((h10 != null ? h10.b() : 0) == 0 && xVar.i() == 0) ? false : true;
        if (f10 || z11) {
            z10 = true;
        }
        i0Var.setEnabled(z10);
    }

    public static final io.p<b0.i, m2.b, q1.d0> f(q qVar, g0 g0Var, j jVar, v.i0 i0Var, t0 t0Var, boolean z10, boolean z11, a.b bVar, a.c cVar, f.d dVar, f.l lVar, o oVar, l0.i iVar, int i10, int i11, int i12) {
        iVar.x(-1404987696);
        a.b bVar2 = (i12 & 128) != 0 ? null : bVar;
        a.c cVar2 = (i12 & 256) != 0 ? null : cVar;
        f.d dVar2 = (i12 & 512) != 0 ? null : dVar;
        f.l lVar2 = (i12 & 1024) != 0 ? null : lVar;
        Object[] objArr = {g0Var, jVar, i0Var, t0Var, Boolean.valueOf(z10), Boolean.valueOf(z11), bVar2, cVar2, dVar2, lVar2, oVar};
        iVar.x(-568225417);
        boolean z12 = false;
        for (int i13 = 0; i13 < 11; i13++) {
            z12 |= iVar.P(objArr[i13]);
        }
        Object y10 = iVar.y();
        if (z12 || y10 == l0.i.f39065a.a()) {
            y10 = new c(z11, t0Var, z10, g0Var, qVar, lVar2, dVar2, oVar, jVar, bVar2, cVar2, i0Var);
            iVar.q(y10);
        }
        iVar.O();
        io.p<b0.i, m2.b, q1.d0> pVar = (io.p) y10;
        iVar.O();
        return pVar;
    }
}
