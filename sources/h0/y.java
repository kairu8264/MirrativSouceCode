package h0;

import androidx.compose.ui.platform.g2;
import java.util.Map;
import l0.h2;
import s1.a;
import x0.a;
import x0.f;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final float f34324a = m2.g.l(56);

    /* renamed from: b  reason: collision with root package name */
    public static final float f34325b = m2.g.l(400);

    /* renamed from: c  reason: collision with root package name */
    public static final u.b1<Float> f34326c = new u.b1<>(256, 0, null, 6, null);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.q<y.n, l0.i, Integer, wn.v> {
        public final /* synthetic */ c1.g1 A;
        public final /* synthetic */ long B;
        public final /* synthetic */ long C;
        public final /* synthetic */ float D;
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> E;
        public final /* synthetic */ uo.q0 F;
        public final /* synthetic */ io.q<y.q, l0.i, Integer, wn.v> G;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ z f34327w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f34328x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f34329y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f34330z;

        /* renamed from: h0.y$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0428a extends jo.q implements io.p<a0, a0, x1> {

            /* renamed from: w  reason: collision with root package name */
            public static final C0428a f34331w = new C0428a();

            public C0428a() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final x1 invoke(a0 a0Var, a0 a0Var2) {
                jo.p.h(a0Var, "<anonymous parameter 0>");
                jo.p.h(a0Var2, "<anonymous parameter 1>");
                return new n0(0.5f);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ boolean f34332w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ z f34333x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ uo.q0 f34334y;

            @co.f(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", l = {421}, m = "invokeSuspend")
            /* renamed from: h0.y$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0429a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public int f34335w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ z f34336x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0429a(z zVar, ao.d<? super C0429a> dVar) {
                    super(2, dVar);
                    this.f34336x = zVar;
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    return new C0429a(this.f34336x, dVar);
                }

                @Override // io.p
                public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                    return ((C0429a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    Object c10 = bo.c.c();
                    int i10 = this.f34335w;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        z zVar = this.f34336x;
                        this.f34335w = 1;
                        if (zVar.b(this) == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z10, z zVar, uo.q0 q0Var) {
                super(0);
                this.f34332w = z10;
                this.f34333x = zVar;
                this.f34334y = q0Var;
            }

            public final void a() {
                if (this.f34332w && this.f34333x.e().n().invoke(a0.Closed).booleanValue()) {
                    uo.l.d(this.f34334y, null, null, new C0429a(this.f34333x, null), 3, null);
                }
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends jo.q implements io.a<Float> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ float f34337w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ float f34338x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ z f34339y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(float f10, float f11, z zVar) {
                super(0);
                this.f34337w = f10;
                this.f34338x = f11;
                this.f34339y = zVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final Float invoke() {
                return Float.valueOf(y.h(this.f34337w, this.f34338x, this.f34339y.d().getValue().floatValue()));
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends jo.q implements io.l<m2.d, m2.k> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ z f34340w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(z zVar) {
                super(1);
                this.f34340w = zVar;
            }

            public final long a(m2.d dVar) {
                jo.p.h(dVar, "$this$offset");
                return m2.l.a(lo.c.c(this.f34340w.d().getValue().floatValue()), 0);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ m2.k invoke(m2.d dVar) {
                return m2.k.b(a(dVar));
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends jo.q implements io.l<w1.y, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f34341w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ z f34342x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ uo.q0 f34343y;

            /* renamed from: h0.y$a$e$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0430a extends jo.q implements io.a<Boolean> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ z f34344w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ uo.q0 f34345x;

                @co.f(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", l = {450}, m = "invokeSuspend")
                /* renamed from: h0.y$a$e$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0431a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

                    /* renamed from: w  reason: collision with root package name */
                    public int f34346w;

                    /* renamed from: x  reason: collision with root package name */
                    public final /* synthetic */ z f34347x;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0431a(z zVar, ao.d<? super C0431a> dVar) {
                        super(2, dVar);
                        this.f34347x = zVar;
                    }

                    @Override // co.a
                    public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                        return new C0431a(this.f34347x, dVar);
                    }

                    @Override // io.p
                    public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                        return ((C0431a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        Object c10 = bo.c.c();
                        int i10 = this.f34346w;
                        if (i10 == 0) {
                            wn.m.b(obj);
                            z zVar = this.f34347x;
                            this.f34346w = 1;
                            if (zVar.b(this) == c10) {
                                return c10;
                            }
                        } else if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            wn.m.b(obj);
                        }
                        return wn.v.f59242a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0430a(z zVar, uo.q0 q0Var) {
                    super(0);
                    this.f34344w = zVar;
                    this.f34345x = q0Var;
                }

                @Override // io.a
                /* renamed from: a */
                public final Boolean invoke() {
                    if (this.f34344w.e().n().invoke(a0.Closed).booleanValue()) {
                        uo.l.d(this.f34345x, null, null, new C0431a(this.f34344w, null), 3, null);
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String str, z zVar, uo.q0 q0Var) {
                super(1);
                this.f34341w = str;
                this.f34342x = zVar;
                this.f34343y = q0Var;
            }

            public final void a(w1.y yVar) {
                jo.p.h(yVar, "$this$semantics");
                w1.w.G(yVar, this.f34341w);
                if (this.f34342x.f()) {
                    w1.w.g(yVar, null, new C0430a(this.f34342x, this.f34343y), 1, null);
                }
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(w1.y yVar) {
                a(yVar);
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class f extends jo.q implements io.p<l0.i, Integer, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.q<y.q, l0.i, Integer, wn.v> f34348w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ int f34349x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public f(io.q<? super y.q, ? super l0.i, ? super Integer, wn.v> qVar, int i10) {
                super(2);
                this.f34348w = qVar;
                this.f34349x = i10;
            }

            public final void a(l0.i iVar, int i10) {
                if ((i10 & 11) == 2 && iVar.j()) {
                    iVar.I();
                    return;
                }
                x0.f l10 = y.d1.l(x0.f.f59359u, 0.0f, 1, null);
                io.q<y.q, l0.i, Integer, wn.v> qVar = this.f34348w;
                int i11 = ((this.f34349x << 9) & 7168) | 6;
                iVar.x(-483455358);
                int i12 = i11 >> 3;
                q1.c0 a10 = y.p.a(y.f.f60773a.g(), x0.a.f59327a.k(), iVar, (i12 & 112) | (i12 & 14));
                iVar.x(-1323940314);
                m2.d dVar = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
                m2.q qVar2 = (m2.q) iVar.G(androidx.compose.ui.platform.o0.j());
                g2 g2Var = (g2) iVar.G(androidx.compose.ui.platform.o0.n());
                a.C0787a c0787a = s1.a.f51802o;
                io.a<s1.a> a11 = c0787a.a();
                io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(l10);
                int i13 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
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
                h2.b(a13, qVar2, c0787a.c());
                h2.b(a13, g2Var, c0787a.f());
                iVar.c();
                a12.s0(l0.n1.a(l0.n1.b(iVar)), iVar, Integer.valueOf((i13 >> 3) & 112));
                iVar.x(2058660585);
                iVar.x(-1163856341);
                if (((i13 >> 9) & 14 & 11) == 2 && iVar.j()) {
                    iVar.I();
                } else {
                    qVar.s0(y.r.f60913a, iVar, Integer.valueOf(((i11 >> 6) & 112) | 6));
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
        public a(z zVar, boolean z10, int i10, long j10, c1.g1 g1Var, long j11, long j12, float f10, io.p<? super l0.i, ? super Integer, wn.v> pVar, uo.q0 q0Var, io.q<? super y.q, ? super l0.i, ? super Integer, wn.v> qVar) {
            super(3);
            this.f34327w = zVar;
            this.f34328x = z10;
            this.f34329y = i10;
            this.f34330z = j10;
            this.A = g1Var;
            this.B = j11;
            this.C = j12;
            this.D = f10;
            this.E = pVar;
            this.F = q0Var;
            this.G = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r39v0, types: [java.lang.Object, l0.i] */
        /* JADX WARN: Type inference failed for: r8v16 */
        public final void a(y.n nVar, l0.i iVar, int i10) {
            int i11;
            jo.p.h(nVar, "$this$BoxWithConstraints");
            if ((i10 & 14) == 0) {
                i11 = i10 | (iVar.P(nVar) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && iVar.j()) {
                iVar.I();
                return;
            }
            long b10 = nVar.b();
            if (m2.b.j(b10)) {
                float f10 = -m2.b.n(b10);
                Map h10 = xn.n0.h(wn.q.a(Float.valueOf(f10), a0.Closed), wn.q.a(Float.valueOf(0.0f), a0.Open));
                boolean z10 = iVar.G(androidx.compose.ui.platform.o0.j()) == m2.q.Rtl;
                f.a aVar = x0.f.f59359u;
                x0.f h11 = k1.h(aVar, this.f34327w.e(), h10, w.q.Horizontal, this.f34328x, z10, null, C0428a.f34331w, null, y.f34325b, 32, null);
                z zVar = this.f34327w;
                int i12 = this.f34329y;
                long j10 = this.f34330z;
                c1.g1 g1Var = this.A;
                long j11 = this.B;
                long j12 = this.C;
                float f11 = this.D;
                io.p<l0.i, Integer, wn.v> pVar = this.E;
                boolean z11 = this.f34328x;
                uo.q0 q0Var = this.F;
                io.q<y.q, l0.i, Integer, wn.v> qVar = this.G;
                iVar.x(733328855);
                a.C0986a c0986a = x0.a.f59327a;
                q1.c0 h12 = y.j.h(c0986a.o(), false, iVar, 0);
                iVar.x(-1323940314);
                m2.d dVar = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
                m2.q qVar2 = (m2.q) iVar.G(androidx.compose.ui.platform.o0.j());
                g2 g2Var = (g2) iVar.G(androidx.compose.ui.platform.o0.n());
                a.C0787a c0787a = s1.a.f51802o;
                io.a<s1.a> a10 = c0787a.a();
                io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a11 = q1.w.a(h11);
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
                h2.b(a12, h12, c0787a.d());
                h2.b(a12, dVar, c0787a.b());
                h2.b(a12, qVar2, c0787a.c());
                h2.b(a12, g2Var, c0787a.f());
                iVar.c();
                a11.s0(l0.n1.a(l0.n1.b(iVar)), iVar, 0);
                iVar.x(2058660585);
                iVar.x(-2137368960);
                y.l lVar = y.l.f60836a;
                iVar.x(-1263168067);
                iVar.x(733328855);
                q1.c0 h13 = y.j.h(c0986a.o(), false, iVar, 0);
                iVar.x(-1323940314);
                m2.d dVar2 = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
                m2.q qVar3 = (m2.q) iVar.G(androidx.compose.ui.platform.o0.j());
                g2 g2Var2 = (g2) iVar.G(androidx.compose.ui.platform.o0.n());
                io.a<s1.a> a13 = c0787a.a();
                io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a14 = q1.w.a(aVar);
                if (!(iVar.k() instanceof l0.e)) {
                    l0.h.c();
                }
                iVar.D();
                if (iVar.f()) {
                    iVar.r(a13);
                } else {
                    iVar.o();
                }
                iVar.E();
                l0.i a15 = h2.a(iVar);
                h2.b(a15, h13, c0787a.d());
                h2.b(a15, dVar2, c0787a.b());
                h2.b(a15, qVar3, c0787a.c());
                h2.b(a15, g2Var2, c0787a.f());
                iVar.c();
                a14.s0(l0.n1.a(l0.n1.b(iVar)), iVar, 0);
                iVar.x(2058660585);
                iVar.x(-2137368960);
                iVar.x(32495683);
                pVar.invoke(iVar, Integer.valueOf((i12 >> 27) & 14));
                iVar.O();
                iVar.O();
                iVar.O();
                iVar.s();
                iVar.O();
                iVar.O();
                boolean f12 = zVar.f();
                b bVar = new b(z11, zVar, q0Var);
                Float valueOf = Float.valueOf(f10);
                Float valueOf2 = Float.valueOf(0.0f);
                iVar.x(1618982084);
                boolean P = iVar.P(valueOf) | iVar.P(valueOf2) | iVar.P(zVar);
                Object y10 = iVar.y();
                if (P || y10 == l0.i.f39065a.a()) {
                    y10 = new c(f10, 0.0f, zVar);
                    iVar.q(y10);
                }
                iVar.O();
                y.b(f12, bVar, y10, j10, iVar, (i12 >> 15) & 7168);
                String a16 = h1.a(g1.f33874a.e(), iVar, 6);
                m2.d dVar3 = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
                x0.f w10 = y.d1.w(aVar, dVar3.s(m2.b.p(b10)), dVar3.s(m2.b.o(b10)), dVar3.s(m2.b.n(b10)), dVar3.s(m2.b.m(b10)));
                iVar.x(1157296644);
                boolean P2 = iVar.P(zVar);
                Object y11 = iVar.y();
                if (P2 || y11 == l0.i.f39065a.a()) {
                    y11 = new d(zVar);
                    iVar.q(y11);
                }
                iVar.O();
                int i13 = i12 >> 12;
                i1.a(w1.p.b(y.r0.m(y.n0.a(w10, (io.l) y11), 0.0f, 0.0f, y.f34324a, 0.0f, 11, null), false, new e(a16, zVar, q0Var), 1, null), g1Var, j11, j12, null, f11, s0.c.b(iVar, -1941234439, true, new f(qVar, i12)), iVar, 1572864 | ((i12 >> 9) & 112) | (i13 & 896) | (i13 & 7168) | (458752 & i12), 16);
                iVar.O();
                iVar.O();
                iVar.O();
                iVar.s();
                iVar.O();
                iVar.O();
                return;
            }
            throw new IllegalStateException("Drawer shouldn't have infinite width");
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(y.n nVar, l0.i iVar, Integer num) {
            a(nVar, iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ c1.g1 A;
        public final /* synthetic */ float B;
        public final /* synthetic */ long C;
        public final /* synthetic */ long D;
        public final /* synthetic */ long E;
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> F;
        public final /* synthetic */ int G;
        public final /* synthetic */ int H;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.q<y.q, l0.i, Integer, wn.v> f34350w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f34351x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ z f34352y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f34353z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.q<? super y.q, ? super l0.i, ? super Integer, wn.v> qVar, x0.f fVar, z zVar, boolean z10, c1.g1 g1Var, float f10, long j10, long j11, long j12, io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10, int i11) {
            super(2);
            this.f34350w = qVar;
            this.f34351x = fVar;
            this.f34352y = zVar;
            this.f34353z = z10;
            this.A = g1Var;
            this.B = f10;
            this.C = j10;
            this.D = j11;
            this.E = j12;
            this.F = pVar;
            this.G = i10;
            this.H = i11;
        }

        public final void a(l0.i iVar, int i10) {
            y.a(this.f34350w, this.f34351x, this.f34352y, this.f34353z, this.A, this.B, this.C, this.D, this.E, this.F, iVar, this.G | 1, this.H);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<e1.e, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ long f34354w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<Float> f34355x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, io.a<Float> aVar) {
            super(1);
            this.f34354w = j10;
            this.f34355x = aVar;
        }

        public final void a(e1.e eVar) {
            jo.p.h(eVar, "$this$Canvas");
            e1.e.L0(eVar, this.f34354w, 0L, 0L, this.f34355x.invoke().floatValue(), null, null, 0, 118, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(e1.e eVar) {
            a(eVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f34356w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f34357x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<Float> f34358y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f34359z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, io.a<wn.v> aVar, io.a<Float> aVar2, long j10, int i10) {
            super(2);
            this.f34356w = z10;
            this.f34357x = aVar;
            this.f34358y = aVar2;
            this.f34359z = j10;
            this.A = i10;
        }

        public final void a(l0.i iVar, int i10) {
            y.b(this.f34356w, this.f34357x, this.f34358y, this.f34359z, iVar, this.A | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.material.DrawerKt$Scrim$dismissDrawer$1$1", f = "Drawer.kt", l = {664}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends co.l implements io.p<n1.e0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34360w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f34361x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f34362y;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<b1.f, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.a<wn.v> f34363w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(io.a<wn.v> aVar) {
                super(1);
                this.f34363w = aVar;
            }

            public final void a(long j10) {
                this.f34363w.invoke();
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(b1.f fVar) {
                a(fVar.u());
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a<wn.v> aVar, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f34362y = aVar;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(n1.e0 e0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(e0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            e eVar = new e(this.f34362y, dVar);
            eVar.f34361x = obj;
            return eVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34360w;
            if (i10 == 0) {
                wn.m.b(obj);
                n1.e0 e0Var = (n1.e0) this.f34361x;
                a aVar = new a(this.f34362y);
                this.f34360w = 1;
                if (w.e0.k(e0Var, null, null, null, aVar, this, 7, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<w1.y, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f34364w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f34365x;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.a<wn.v> f34366w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(io.a<wn.v> aVar) {
                super(0);
                this.f34366w = aVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final Boolean invoke() {
                this.f34366w.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, io.a<wn.v> aVar) {
            super(1);
            this.f34364w = str;
            this.f34365x = aVar;
        }

        public final void a(w1.y yVar) {
            jo.p.h(yVar, "$this$semantics");
            w1.w.A(yVar, this.f34364w);
            w1.w.l(yVar, null, new a(this.f34365x), 1, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(w1.y yVar) {
            a(yVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.l<a0, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final g f34367w = new g();

        public g() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(a0 a0Var) {
            jo.p.h(a0Var, "it");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.a<z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a0 f34368w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<a0, Boolean> f34369x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(a0 a0Var, io.l<? super a0, Boolean> lVar) {
            super(0);
            this.f34368w = a0Var;
            this.f34369x = lVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final z invoke() {
            return new z(this.f34368w, this.f34369x);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(io.q<? super y.q, ? super l0.i, ? super java.lang.Integer, wn.v> r33, x0.f r34, h0.z r35, boolean r36, c1.g1 r37, float r38, long r39, long r41, long r43, io.p<? super l0.i, ? super java.lang.Integer, wn.v> r45, l0.i r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.y.a(io.q, x0.f, h0.z, boolean, c1.g1, float, long, long, long, io.p, l0.i, int, int):void");
    }

    public static final void b(boolean z10, io.a<wn.v> aVar, io.a<Float> aVar2, long j10, l0.i iVar, int i10) {
        int i11;
        x0.f fVar;
        l0.i h10 = iVar.h(1983403750);
        if ((i10 & 14) == 0) {
            i11 = (h10.a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(aVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.P(aVar2) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= h10.e(j10) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && h10.j()) {
            h10.I();
        } else {
            String a10 = h1.a(g1.f33874a.a(), h10, 6);
            h10.x(1010554047);
            if (z10) {
                f.a aVar3 = x0.f.f59359u;
                h10.x(1157296644);
                boolean P = h10.P(aVar);
                Object y10 = h10.y();
                if (P || y10 == l0.i.f39065a.a()) {
                    y10 = new e(aVar, null);
                    h10.q(y10);
                }
                h10.O();
                x0.f b10 = n1.o0.b(aVar3, aVar, (io.p) y10);
                h10.x(511388516);
                boolean P2 = h10.P(a10) | h10.P(aVar);
                Object y11 = h10.y();
                if (P2 || y11 == l0.i.f39065a.a()) {
                    y11 = new f(a10, aVar);
                    h10.q(y11);
                }
                h10.O();
                fVar = w1.p.a(b10, true, (io.l) y11);
            } else {
                fVar = x0.f.f59359u;
            }
            h10.O();
            x0.f L = y.d1.l(x0.f.f59359u, 0.0f, 1, null).L(fVar);
            c1.c0 g10 = c1.c0.g(j10);
            h10.x(511388516);
            boolean P3 = h10.P(g10) | h10.P(aVar2);
            Object y12 = h10.y();
            if (P3 || y12 == l0.i.f39065a.a()) {
                y12 = new c(j10, aVar2);
                h10.q(y12);
            }
            h10.O();
            v.j.a(L, (io.l) y12, h10, 0);
        }
        l0.l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new d(z10, aVar, aVar2, j10, i10));
    }

    public static final float h(float f10, float f11, float f12) {
        return po.n.l((f12 - f10) / (f11 - f10), 0.0f, 1.0f);
    }

    public static final z i(a0 a0Var, io.l<? super a0, Boolean> lVar, l0.i iVar, int i10, int i11) {
        jo.p.h(a0Var, "initialValue");
        iVar.x(-1435874229);
        if ((i11 & 2) != 0) {
            lVar = g.f34367w;
        }
        z zVar = (z) u0.b.b(new Object[0], z.f34376b.a(lVar), null, new h(a0Var, lVar), iVar, 72, 4);
        iVar.O();
        return zVar;
    }
}
