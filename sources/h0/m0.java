package h0;

import androidx.compose.ui.platform.g2;
import l0.h2;
import s1.a;
import x0.a;
import x0.f;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f34024a = m2.g.l(56);

    /* renamed from: b  reason: collision with root package name */
    public static final float f34025b = m2.g.l(48);

    /* renamed from: c  reason: collision with root package name */
    public static final float f34026c = m2.g.l(12);

    /* renamed from: d  reason: collision with root package name */
    public static final float f34027d = m2.g.l(20);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f34028w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f34029x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f34030y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10, io.p<? super l0.i, ? super Integer, wn.v> pVar2) {
            super(2);
            this.f34028w = pVar;
            this.f34029x = i10;
            this.f34030y = pVar2;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            float f10 = this.f34028w == null ? m0.f34027d : m0.f34026c;
            f.a aVar = x0.f.f59359u;
            x0.f m10 = y.r0.m(aVar, f10, 0.0f, m0.f34027d, 0.0f, 10, null);
            a.c i11 = x0.a.f59327a.i();
            io.p<l0.i, Integer, wn.v> pVar = this.f34028w;
            int i12 = this.f34029x;
            io.p<l0.i, Integer, wn.v> pVar2 = this.f34030y;
            iVar.x(693286680);
            q1.c0 a10 = y.y0.a(y.f.f60773a.f(), i11, iVar, 48);
            iVar.x(-1323940314);
            m2.d dVar = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar = (m2.q) iVar.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var = (g2) iVar.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(m10);
            if (!(iVar.k() instanceof l0.e)) {
                l0.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.r(a11);
            } else {
                iVar.o();
            }
            iVar.E();
            l0.i a13 = h2.a(iVar);
            h2.b(a13, a10, c0787a.d());
            h2.b(a13, dVar, c0787a.b());
            h2.b(a13, qVar, c0787a.c());
            h2.b(a13, g2Var, c0787a.f());
            iVar.c();
            a12.s0(l0.n1.a(l0.n1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-678309503);
            y.a1 a1Var = y.a1.f60672a;
            iVar.x(-388203689);
            iVar.x(-1435223762);
            if (pVar != null) {
                pVar.invoke(iVar, Integer.valueOf((i12 >> 9) & 14));
                y.g1.a(y.d1.y(aVar, m0.f34026c), iVar, 6);
            }
            iVar.O();
            pVar2.invoke(iVar, Integer.valueOf(i12 & 14));
            iVar.O();
            iVar.O();
            iVar.O();
            iVar.s();
            iVar.O();
            iVar.O();
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ x.m A;
        public final /* synthetic */ c1.g1 B;
        public final /* synthetic */ long C;
        public final /* synthetic */ long D;
        public final /* synthetic */ l0 E;
        public final /* synthetic */ int F;
        public final /* synthetic */ int G;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f34031w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f34032x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x0.f f34033y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f34034z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.p<? super l0.i, ? super Integer, wn.v> pVar, io.a<wn.v> aVar, x0.f fVar, io.p<? super l0.i, ? super Integer, wn.v> pVar2, x.m mVar, c1.g1 g1Var, long j10, long j11, l0 l0Var, int i10, int i11) {
            super(2);
            this.f34031w = pVar;
            this.f34032x = aVar;
            this.f34033y = fVar;
            this.f34034z = pVar2;
            this.A = mVar;
            this.B = g1Var;
            this.C = j10;
            this.D = j11;
            this.E = l0Var;
            this.F = i10;
            this.G = i11;
        }

        public final void a(l0.i iVar, int i10) {
            m0.a(this.f34031w, this.f34032x, this.f34033y, this.f34034z, this.A, this.B, this.C, this.D, this.E, iVar, this.F | 1, this.G);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ long f34035w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f34036x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f34037y;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.p<l0.i, Integer, wn.v> f34038w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ int f34039x;

            /* renamed from: h0.m0$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0421a extends jo.q implements io.p<l0.i, Integer, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.p<l0.i, Integer, wn.v> f34040w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ int f34041x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0421a(io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10) {
                    super(2);
                    this.f34040w = pVar;
                    this.f34041x = i10;
                }

                public final void a(l0.i iVar, int i10) {
                    if ((i10 & 11) != 2 || !iVar.j()) {
                        x0.f g10 = y.d1.g(x0.f.f59359u, m0.f34024a, m0.f34024a);
                        x0.a e10 = x0.a.f59327a.e();
                        io.p<l0.i, Integer, wn.v> pVar = this.f34040w;
                        int i11 = this.f34041x;
                        iVar.x(733328855);
                        q1.c0 h10 = y.j.h(e10, false, iVar, 6);
                        iVar.x(-1323940314);
                        m2.d dVar = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
                        m2.q qVar = (m2.q) iVar.G(androidx.compose.ui.platform.o0.j());
                        g2 g2Var = (g2) iVar.G(androidx.compose.ui.platform.o0.n());
                        a.C0787a c0787a = s1.a.f51802o;
                        io.a<s1.a> a10 = c0787a.a();
                        io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a11 = q1.w.a(g10);
                        if (!(iVar.k() instanceof l0.e)) {
                            l0.h.c();
                        }
                        iVar.D();
                        if (iVar.f()) {
                            iVar.r(a10);
                        } else {
                            iVar.o();
                        }
                        iVar.E();
                        l0.i a12 = h2.a(iVar);
                        h2.b(a12, h10, c0787a.d());
                        h2.b(a12, dVar, c0787a.b());
                        h2.b(a12, qVar, c0787a.c());
                        h2.b(a12, g2Var, c0787a.f());
                        iVar.c();
                        a11.s0(l0.n1.a(l0.n1.b(iVar)), iVar, 0);
                        iVar.x(2058660585);
                        iVar.x(-2137368960);
                        y.l lVar = y.l.f60836a;
                        iVar.x(-1049034642);
                        pVar.invoke(iVar, Integer.valueOf((i11 >> 21) & 14));
                        iVar.O();
                        iVar.O();
                        iVar.O();
                        iVar.s();
                        iVar.O();
                        iVar.O();
                        return;
                    }
                    iVar.I();
                }

                @Override // io.p
                public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
                    a(iVar, num.intValue());
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10) {
                super(2);
                this.f34038w = pVar;
                this.f34039x = i10;
            }

            public final void a(l0.i iVar, int i10) {
                if ((i10 & 11) == 2 && iVar.j()) {
                    iVar.I();
                } else {
                    w1.a(q0.f34133a.c(iVar, 6).b(), s0.c.b(iVar, -1567914264, true, new C0421a(this.f34038w, this.f34039x)), iVar, 48);
                }
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
                a(iVar, num.intValue());
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(long j10, io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10) {
            super(2);
            this.f34035w = j10;
            this.f34036x = pVar;
            this.f34037y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                l0.r.a(new l0.d1[]{o.a().c(Float.valueOf(c1.c0.n(this.f34035w)))}, s0.c.b(iVar, 1867794295, true, new a(this.f34036x, this.f34037y)), iVar, 56);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ long A;
        public final /* synthetic */ long B;
        public final /* synthetic */ l0 C;
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> D;
        public final /* synthetic */ int E;
        public final /* synthetic */ int F;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f34042w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f34043x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x.m f34044y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ c1.g1 f34045z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(io.a<wn.v> aVar, x0.f fVar, x.m mVar, c1.g1 g1Var, long j10, long j11, l0 l0Var, io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10, int i11) {
            super(2);
            this.f34042w = aVar;
            this.f34043x = fVar;
            this.f34044y = mVar;
            this.f34045z = g1Var;
            this.A = j10;
            this.B = j11;
            this.C = l0Var;
            this.D = pVar;
            this.E = i10;
            this.F = i11;
        }

        public final void a(l0.i iVar, int i10) {
            m0.b(this.f34042w, this.f34043x, this.f34044y, this.f34045z, this.A, this.B, this.C, this.D, iVar, this.E | 1, this.F);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(io.p<? super l0.i, ? super java.lang.Integer, wn.v> r30, io.a<wn.v> r31, x0.f r32, io.p<? super l0.i, ? super java.lang.Integer, wn.v> r33, x.m r34, c1.g1 r35, long r36, long r38, h0.l0 r40, l0.i r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.m0.a(io.p, io.a, x0.f, io.p, x.m, c1.g1, long, long, h0.l0, l0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(io.a<wn.v> r30, x0.f r31, x.m r32, c1.g1 r33, long r34, long r36, h0.l0 r38, io.p<? super l0.i, ? super java.lang.Integer, wn.v> r39, l0.i r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.m0.b(io.a, x0.f, x.m, c1.g1, long, long, h0.l0, io.p, l0.i, int, int):void");
    }
}
