package h0;

import androidx.compose.ui.platform.g2;
import l0.c2;
import l0.h2;
import s1.a;
import x0.a;
import x0.f;
import y.f;

/* loaded from: classes.dex */
public final class f {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c2<c1.c0> f33799w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ y.t0 f33800x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.q<y.z0, l0.i, Integer, wn.v> f33801y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f33802z;

        /* renamed from: h0.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0415a extends jo.q implements io.p<l0.i, Integer, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ y.t0 f33803w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ io.q<y.z0, l0.i, Integer, wn.v> f33804x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ int f33805y;

            /* renamed from: h0.f$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0416a extends jo.q implements io.p<l0.i, Integer, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ y.t0 f33806w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ io.q<y.z0, l0.i, Integer, wn.v> f33807x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ int f33808y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0416a(y.t0 t0Var, io.q<? super y.z0, ? super l0.i, ? super Integer, wn.v> qVar, int i10) {
                    super(2);
                    this.f33806w = t0Var;
                    this.f33807x = qVar;
                    this.f33808y = i10;
                }

                public final void a(l0.i iVar, int i10) {
                    if ((i10 & 11) == 2 && iVar.j()) {
                        iVar.I();
                        return;
                    }
                    f.a aVar = x0.f.f59359u;
                    d dVar = d.f33749a;
                    x0.f h10 = y.r0.h(y.d1.g(aVar, dVar.e(), dVar.d()), this.f33806w);
                    f.e b10 = y.f.f60773a.b();
                    a.c i11 = x0.a.f59327a.i();
                    io.q<y.z0, l0.i, Integer, wn.v> qVar = this.f33807x;
                    int i12 = ((this.f33808y >> 18) & 7168) | 432;
                    iVar.x(693286680);
                    int i13 = i12 >> 3;
                    q1.c0 a10 = y.y0.a(b10, i11, iVar, (i13 & 112) | (i13 & 14));
                    iVar.x(-1323940314);
                    m2.d dVar2 = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
                    m2.q qVar2 = (m2.q) iVar.G(androidx.compose.ui.platform.o0.j());
                    g2 g2Var = (g2) iVar.G(androidx.compose.ui.platform.o0.n());
                    a.C0787a c0787a = s1.a.f51802o;
                    io.a<s1.a> a11 = c0787a.a();
                    io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(h10);
                    int i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
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
                    h2.b(a13, dVar2, c0787a.b());
                    h2.b(a13, qVar2, c0787a.c());
                    h2.b(a13, g2Var, c0787a.f());
                    iVar.c();
                    a12.s0(l0.n1.a(l0.n1.b(iVar)), iVar, Integer.valueOf((i14 >> 3) & 112));
                    iVar.x(2058660585);
                    iVar.x(-678309503);
                    if (((i14 >> 9) & 14 & 11) == 2 && iVar.j()) {
                        iVar.I();
                    } else {
                        qVar.s0(y.a1.f60672a, iVar, Integer.valueOf(((i12 >> 6) & 112) | 6));
                    }
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0415a(y.t0 t0Var, io.q<? super y.z0, ? super l0.i, ? super Integer, wn.v> qVar, int i10) {
                super(2);
                this.f33803w = t0Var;
                this.f33804x = qVar;
                this.f33805y = i10;
            }

            public final void a(l0.i iVar, int i10) {
                if ((i10 & 11) == 2 && iVar.j()) {
                    iVar.I();
                } else {
                    w1.a(q0.f34133a.c(iVar, 6).b(), s0.c.b(iVar, -630330208, true, new C0416a(this.f33803w, this.f33804x, this.f33805y)), iVar, 48);
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
        public a(c2<c1.c0> c2Var, y.t0 t0Var, io.q<? super y.z0, ? super l0.i, ? super Integer, wn.v> qVar, int i10) {
            super(2);
            this.f33799w = c2Var;
            this.f33800x = t0Var;
            this.f33801y = qVar;
            this.f33802z = i10;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                l0.r.a(new l0.d1[]{o.a().c(Float.valueOf(c1.c0.n(f.b(this.f33799w))))}, s0.c.b(iVar, -1699085201, true, new C0415a(this.f33800x, this.f33801y, this.f33802z)), iVar, 56);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ e A;
        public final /* synthetic */ c1.g1 B;
        public final /* synthetic */ v.h C;
        public final /* synthetic */ c D;
        public final /* synthetic */ y.t0 E;
        public final /* synthetic */ io.q<y.z0, l0.i, Integer, wn.v> F;
        public final /* synthetic */ int G;
        public final /* synthetic */ int H;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f33809w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f33810x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f33811y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ x.m f33812z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.a<wn.v> aVar, x0.f fVar, boolean z10, x.m mVar, e eVar, c1.g1 g1Var, v.h hVar, c cVar, y.t0 t0Var, io.q<? super y.z0, ? super l0.i, ? super Integer, wn.v> qVar, int i10, int i11) {
            super(2);
            this.f33809w = aVar;
            this.f33810x = fVar;
            this.f33811y = z10;
            this.f33812z = mVar;
            this.A = eVar;
            this.B = g1Var;
            this.C = hVar;
            this.D = cVar;
            this.E = t0Var;
            this.F = qVar;
            this.G = i10;
            this.H = i11;
        }

        public final void a(l0.i iVar, int i10) {
            f.a(this.f33809w, this.f33810x, this.f33811y, this.f33812z, this.A, this.B, this.C, this.D, this.E, this.F, iVar, this.G | 1, this.H);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(io.a<wn.v> r38, x0.f r39, boolean r40, x.m r41, h0.e r42, c1.g1 r43, v.h r44, h0.c r45, y.t0 r46, io.q<? super y.z0, ? super l0.i, ? super java.lang.Integer, wn.v> r47, l0.i r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.f.a(io.a, x0.f, boolean, x.m, h0.e, c1.g1, v.h, h0.c, y.t0, io.q, l0.i, int, int):void");
    }

    public static final long b(c2<c1.c0> c2Var) {
        return c2Var.getValue().u();
    }

    public static final void c(io.a<wn.v> aVar, x0.f fVar, boolean z10, x.m mVar, e eVar, c1.g1 g1Var, v.h hVar, c cVar, y.t0 t0Var, io.q<? super y.z0, ? super l0.i, ? super Integer, wn.v> qVar, l0.i iVar, int i10, int i11) {
        x.m mVar2;
        jo.p.h(aVar, "onClick");
        jo.p.h(qVar, "content");
        iVar.x(-1776134358);
        f.a aVar2 = (i11 & 2) != 0 ? x0.f.f59359u : fVar;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        if ((i11 & 8) != 0) {
            iVar.x(-492369756);
            Object y10 = iVar.y();
            if (y10 == l0.i.f39065a.a()) {
                y10 = x.l.a();
                iVar.q(y10);
            }
            iVar.O();
            mVar2 = (x.m) y10;
        } else {
            mVar2 = mVar;
        }
        a(aVar, aVar2, z11, mVar2, (i11 & 16) != 0 ? null : eVar, (i11 & 32) != 0 ? q0.f34133a.b(iVar, 6).c() : g1Var, (i11 & 64) != 0 ? d.f33749a.f(iVar, 6) : hVar, (i11 & 128) != 0 ? d.f33749a.h(0L, 0L, 0L, iVar, 3072, 7) : cVar, (i11 & 256) != 0 ? d.f33749a.c() : t0Var, qVar, iVar, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10) | (1879048192 & i10), 0);
        iVar.O();
    }

    public static final void d(io.a<wn.v> aVar, x0.f fVar, boolean z10, x.m mVar, e eVar, c1.g1 g1Var, v.h hVar, c cVar, y.t0 t0Var, io.q<? super y.z0, ? super l0.i, ? super Integer, wn.v> qVar, l0.i iVar, int i10, int i11) {
        x.m mVar2;
        jo.p.h(aVar, "onClick");
        jo.p.h(qVar, "content");
        iVar.x(288797557);
        f.a aVar2 = (i11 & 2) != 0 ? x0.f.f59359u : fVar;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        if ((i11 & 8) != 0) {
            iVar.x(-492369756);
            Object y10 = iVar.y();
            if (y10 == l0.i.f39065a.a()) {
                y10 = x.l.a();
                iVar.q(y10);
            }
            iVar.O();
            mVar2 = (x.m) y10;
        } else {
            mVar2 = mVar;
        }
        a(aVar, aVar2, z11, mVar2, (i11 & 16) != 0 ? null : eVar, (i11 & 32) != 0 ? q0.f34133a.b(iVar, 6).c() : g1Var, (i11 & 64) != 0 ? null : hVar, (i11 & 128) != 0 ? d.f33749a.i(0L, 0L, 0L, iVar, 3072, 7) : cVar, (i11 & 256) != 0 ? d.f33749a.g() : t0Var, qVar, iVar, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10) | (1879048192 & i10), 0);
        iVar.O();
    }
}
