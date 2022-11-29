package h0;

import androidx.compose.ui.platform.g2;
import l0.h2;
import s1.a;

/* loaded from: classes.dex */
public final class i1 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;
        public final /* synthetic */ v.h B;
        public final /* synthetic */ float C;
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> D;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f33902w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c1.g1 f33903x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ long f33904y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ float f33905z;

        /* renamed from: h0.i1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0418a extends jo.q implements io.l<w1.y, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public static final C0418a f33906w = new C0418a();

            public C0418a() {
                super(1);
            }

            public final void a(w1.y yVar) {
                jo.p.h(yVar, "$this$semantics");
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(w1.y yVar) {
                a(yVar);
                return wn.v.f59242a;
            }
        }

        @co.f(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends co.l implements io.p<n1.e0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f33907w;

            public b(ao.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // io.p
            /* renamed from: a */
            public final Object invoke(n1.e0 e0Var, ao.d<? super wn.v> dVar) {
                return ((b) create(e0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new b(dVar);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                bo.c.c();
                if (this.f33907w == 0) {
                    wn.m.b(obj);
                    return wn.v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x0.f fVar, c1.g1 g1Var, long j10, float f10, int i10, v.h hVar, float f11, io.p<? super l0.i, ? super Integer, wn.v> pVar) {
            super(2);
            this.f33902w = fVar;
            this.f33903x = g1Var;
            this.f33904y = j10;
            this.f33905z = f10;
            this.A = i10;
            this.B = hVar;
            this.C = f11;
            this.D = pVar;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            x0.f b10 = n1.o0.b(w1.p.a(i1.e(this.f33902w, this.f33903x, i1.f(this.f33904y, (d0) iVar.G(e0.d()), this.f33905z, iVar, (this.A >> 6) & 14), this.B, this.C), false, C0418a.f33906w), wn.v.f59242a, new b(null));
            io.p<l0.i, Integer, wn.v> pVar = this.D;
            int i11 = this.A;
            iVar.x(733328855);
            q1.c0 h10 = y.j.h(x0.a.f59327a.o(), true, iVar, 48);
            iVar.x(-1323940314);
            m2.d dVar = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar = (m2.q) iVar.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var = (g2) iVar.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a11 = q1.w.a(b10);
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
            iVar.x(1539610176);
            pVar.invoke(iVar, Integer.valueOf((i11 >> 18) & 14));
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
        public final /* synthetic */ v.h A;
        public final /* synthetic */ float B;
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> C;
        public final /* synthetic */ int D;
        public final /* synthetic */ int E;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f33908w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c1.g1 f33909x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ long f33910y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f33911z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x0.f fVar, c1.g1 g1Var, long j10, long j11, v.h hVar, float f10, io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10, int i11) {
            super(2);
            this.f33908w = fVar;
            this.f33909x = g1Var;
            this.f33910y = j10;
            this.f33911z = j11;
            this.A = hVar;
            this.B = f10;
            this.C = pVar;
            this.D = i10;
            this.E = i11;
        }

        public final void a(l0.i iVar, int i10) {
            i1.a(this.f33908w, this.f33909x, this.f33910y, this.f33911z, this.A, this.B, this.C, iVar, this.D | 1, this.E);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;
        public final /* synthetic */ v.h B;
        public final /* synthetic */ float C;
        public final /* synthetic */ x.m D;
        public final /* synthetic */ boolean E;
        public final /* synthetic */ io.a<wn.v> F;
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> G;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f33912w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c1.g1 f33913x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ long f33914y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ float f33915z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(x0.f fVar, c1.g1 g1Var, long j10, float f10, int i10, v.h hVar, float f11, x.m mVar, boolean z10, io.a<wn.v> aVar, io.p<? super l0.i, ? super Integer, wn.v> pVar) {
            super(2);
            this.f33912w = fVar;
            this.f33913x = g1Var;
            this.f33914y = j10;
            this.f33915z = f10;
            this.A = i10;
            this.B = hVar;
            this.C = f11;
            this.D = mVar;
            this.E = z10;
            this.F = aVar;
            this.G = pVar;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            x0.f c10 = v.l.c(i1.e(y1.b(this.f33912w), this.f33913x, i1.f(this.f33914y, (d0) iVar.G(e0.d()), this.f33915z, iVar, (this.A >> 12) & 14), this.B, this.C), this.D, k0.n.e(false, 0.0f, 0L, iVar, 0, 7), this.E, null, w1.h.g(w1.h.f57895b.a()), this.F, 8, null);
            io.p<l0.i, Integer, wn.v> pVar = this.G;
            int i11 = this.A;
            iVar.x(733328855);
            q1.c0 h10 = y.j.h(x0.a.f59327a.o(), true, iVar, 48);
            iVar.x(-1323940314);
            m2.d dVar = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar = (m2.q) iVar.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var = (g2) iVar.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a11 = q1.w.a(c10);
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
            iVar.x(-390905273);
            pVar.invoke(iVar, Integer.valueOf((i11 >> 27) & 14));
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
    public static final class d extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ long A;
        public final /* synthetic */ long B;
        public final /* synthetic */ v.h C;
        public final /* synthetic */ float D;
        public final /* synthetic */ x.m E;
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> F;
        public final /* synthetic */ int G;
        public final /* synthetic */ int H;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f33916w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f33917x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f33918y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ c1.g1 f33919z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(io.a<wn.v> aVar, x0.f fVar, boolean z10, c1.g1 g1Var, long j10, long j11, v.h hVar, float f10, x.m mVar, io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10, int i11) {
            super(2);
            this.f33916w = aVar;
            this.f33917x = fVar;
            this.f33918y = z10;
            this.f33919z = g1Var;
            this.A = j10;
            this.B = j11;
            this.C = hVar;
            this.D = f10;
            this.E = mVar;
            this.F = pVar;
            this.G = i10;
            this.H = i11;
        }

        public final void a(l0.i iVar, int i10) {
            i1.b(this.f33916w, this.f33917x, this.f33918y, this.f33919z, this.A, this.B, this.C, this.D, this.E, this.F, iVar, this.G | 1, this.H);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(x0.f r22, c1.g1 r23, long r24, long r26, v.h r28, float r29, io.p<? super l0.i, ? super java.lang.Integer, wn.v> r30, l0.i r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i1.a(x0.f, c1.g1, long, long, v.h, float, io.p, l0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(io.a<wn.v> r28, x0.f r29, boolean r30, c1.g1 r31, long r32, long r34, v.h r36, float r37, x.m r38, io.p<? super l0.i, ? super java.lang.Integer, wn.v> r39, l0.i r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i1.b(io.a, x0.f, boolean, c1.g1, long, long, v.h, float, x.m, io.p, l0.i, int, int):void");
    }

    public static final x0.f e(x0.f fVar, c1.g1 g1Var, long j10, v.h hVar, float f10) {
        return z0.d.a(v.e.c(z0.q.b(fVar, f10, g1Var, false, 0L, 0L, 24, null).L(hVar != null ? v.g.f(x0.f.f59359u, hVar, g1Var) : x0.f.f59359u), j10, g1Var), g1Var);
    }

    public static final long f(long j10, d0 d0Var, float f10, l0.i iVar, int i10) {
        iVar.x(1561611256);
        if (c1.c0.m(j10, q0.f34133a.a(iVar, 6).l()) && d0Var != null) {
            j10 = d0Var.a(j10, f10, iVar, (i10 & 14) | ((i10 >> 3) & 112) | ((i10 << 3) & 896));
        }
        iVar.O();
        return j10;
    }
}
