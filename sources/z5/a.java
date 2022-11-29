package z5;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import c1.d0;
import io.l;
import io.p;
import j6.i;
import java.util.List;
import jo.q;
import k6.b;
import l0.h2;
import l0.l1;
import q1.b0;
import q1.c0;
import q1.e0;
import q1.m;
import q1.q0;
import s1.a;
import w1.w;
import w1.y;
import wn.v;
import x0.f;
import z5.b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: z5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1073a extends q implements p<l0.i, Integer, v> {
        public final /* synthetic */ f1.d A;
        public final /* synthetic */ f1.d B;
        public final /* synthetic */ f1.d C;
        public final /* synthetic */ l<b.c.C1077c, v> D;
        public final /* synthetic */ l<b.c.d, v> E;
        public final /* synthetic */ l<b.c.C1076b, v> F;
        public final /* synthetic */ x0.a G;
        public final /* synthetic */ q1.f H;
        public final /* synthetic */ float I;
        public final /* synthetic */ d0 J;
        public final /* synthetic */ int K;
        public final /* synthetic */ int L;
        public final /* synthetic */ int M;
        public final /* synthetic */ int N;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f62514w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f62515x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x5.e f62516y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ x0.f f62517z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1073a(Object obj, String str, x5.e eVar, x0.f fVar, f1.d dVar, f1.d dVar2, f1.d dVar3, l<? super b.c.C1077c, v> lVar, l<? super b.c.d, v> lVar2, l<? super b.c.C1076b, v> lVar3, x0.a aVar, q1.f fVar2, float f10, d0 d0Var, int i10, int i11, int i12, int i13) {
            super(2);
            this.f62514w = obj;
            this.f62515x = str;
            this.f62516y = eVar;
            this.f62517z = fVar;
            this.A = dVar;
            this.B = dVar2;
            this.C = dVar3;
            this.D = lVar;
            this.E = lVar2;
            this.F = lVar3;
            this.G = aVar;
            this.H = fVar2;
            this.I = f10;
            this.J = d0Var;
            this.K = i10;
            this.L = i11;
            this.M = i12;
            this.N = i13;
        }

        public final void a(l0.i iVar, int i10) {
            a.b(this.f62514w, this.f62515x, this.f62516y, this.f62517z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, iVar, this.L | 1, this.M, this.N);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements p<l0.i, Integer, v> {
        public final /* synthetic */ l<b.c, b.c> A;
        public final /* synthetic */ l<b.c, v> B;
        public final /* synthetic */ x0.a C;
        public final /* synthetic */ q1.f D;
        public final /* synthetic */ float E;
        public final /* synthetic */ d0 F;
        public final /* synthetic */ int G;
        public final /* synthetic */ int H;
        public final /* synthetic */ int I;
        public final /* synthetic */ int J;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f62518w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f62519x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x5.e f62520y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ x0.f f62521z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Object obj, String str, x5.e eVar, x0.f fVar, l<? super b.c, ? extends b.c> lVar, l<? super b.c, v> lVar2, x0.a aVar, q1.f fVar2, float f10, d0 d0Var, int i10, int i11, int i12, int i13) {
            super(2);
            this.f62518w = obj;
            this.f62519x = str;
            this.f62520y = eVar;
            this.f62521z = fVar;
            this.A = lVar;
            this.B = lVar2;
            this.C = aVar;
            this.D = fVar2;
            this.E = f10;
            this.F = d0Var;
            this.G = i10;
            this.H = i11;
            this.I = i12;
            this.J = i13;
        }

        public final void a(l0.i iVar, int i10) {
            a.a(this.f62518w, this.f62519x, this.f62520y, this.f62521z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, iVar, this.H | 1, this.I, this.J);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.a<s1.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f62522w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a aVar) {
            super(0);
            this.f62522w = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [s1.a, java.lang.Object] */
        @Override // io.a
        public final s1.a invoke() {
            return this.f62522w.invoke();
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements c0 {

        /* renamed from: a  reason: collision with root package name */
        public static final d f62523a = new d();

        /* renamed from: z5.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1074a extends q implements l<q0.a, v> {

            /* renamed from: w  reason: collision with root package name */
            public static final C1074a f62524w = new C1074a();

            public C1074a() {
                super(1);
            }

            public final void a(q0.a aVar) {
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(q0.a aVar) {
                a(aVar);
                return v.f59242a;
            }
        }

        @Override // q1.c0
        public int a(m mVar, List<? extends q1.l> list, int i10) {
            return c0.a.a(this, mVar, list, i10);
        }

        @Override // q1.c0
        public final q1.d0 c(e0 e0Var, List<? extends b0> list, long j10) {
            q1.d0 O0;
            O0 = e0.O0(e0Var, m2.b.p(j10), m2.b.o(j10), null, C1074a.f62524w, 4, null);
            return O0;
        }

        @Override // q1.c0
        public int d(m mVar, List<? extends q1.l> list, int i10) {
            return c0.a.b(this, mVar, list, i10);
        }

        @Override // q1.c0
        public int e(m mVar, List<? extends q1.l> list, int i10) {
            return c0.a.c(this, mVar, list, i10);
        }

        @Override // q1.c0
        public int g(m mVar, List<? extends q1.l> list, int i10) {
            return c0.a.d(this, mVar, list, i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends q implements p<l0.i, Integer, v> {
        public final /* synthetic */ q1.f A;
        public final /* synthetic */ float B;
        public final /* synthetic */ d0 C;
        public final /* synthetic */ int D;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f62525w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ f1.d f62526x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f62527y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ x0.a f62528z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(x0.f fVar, f1.d dVar, String str, x0.a aVar, q1.f fVar2, float f10, d0 d0Var, int i10) {
            super(2);
            this.f62525w = fVar;
            this.f62526x = dVar;
            this.f62527y = str;
            this.f62528z = aVar;
            this.A = fVar2;
            this.B = f10;
            this.C = d0Var;
            this.D = i10;
        }

        public final void a(l0.i iVar, int i10) {
            a.c(this.f62525w, this.f62526x, this.f62527y, this.f62528z, this.A, this.B, this.C, iVar, this.D | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements l<y, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f62529w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(1);
            this.f62529w = str;
        }

        public final void a(y yVar) {
            w.A(yVar, this.f62529w);
            w.I(yVar, w1.h.f57895b.c());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(y yVar) {
            a(yVar);
            return v.f59242a;
        }
    }

    public static final void a(Object obj, String str, x5.e eVar, x0.f fVar, l<? super b.c, ? extends b.c> lVar, l<? super b.c, v> lVar2, x0.a aVar, q1.f fVar2, float f10, d0 d0Var, int i10, l0.i iVar, int i11, int i12, int i13) {
        int i14;
        int i15;
        l0.i h10 = iVar.h(-1423043130);
        f.a aVar2 = (i13 & 8) != 0 ? x0.f.f59359u : fVar;
        l<b.c, b.c> a10 = (i13 & 16) != 0 ? z5.b.R.a() : lVar;
        l<? super b.c, v> lVar3 = (i13 & 32) != 0 ? null : lVar2;
        x0.a e10 = (i13 & 64) != 0 ? x0.a.f59327a.e() : aVar;
        q1.f d10 = (i13 & 128) != 0 ? q1.f.f48569a.d() : fVar2;
        float f11 = (i13 & 256) != 0 ? 1.0f : f10;
        d0 d0Var2 = (i13 & 512) != 0 ? null : d0Var;
        if ((i13 & 1024) != 0) {
            i15 = i12 & (-15);
            i14 = e1.e.f30042e.b();
        } else {
            i14 = i10;
            i15 = i12;
        }
        j6.i g10 = g(j.e(obj, h10, 8), h10, 8);
        int i16 = i11 >> 6;
        int i17 = i11 >> 9;
        int i18 = 57344 & i17;
        l<? super b.c, ? extends b.c> lVar4 = a10;
        l<? super b.c, v> lVar5 = lVar3;
        q1.f fVar3 = d10;
        int i19 = i14;
        z5.b d11 = z5.c.d(g10, eVar, lVar4, lVar5, fVar3, i19, h10, ((i15 << 15) & 458752) | (i16 & 7168) | (i16 & 896) | 72 | i18, 0);
        k6.i K = g10.K();
        c(K instanceof z5.d ? aVar2.L((x0.f) K) : aVar2, d11, str, e10, d10, f11, d0Var2, h10, (i17 & 7168) | ((i11 << 3) & 896) | i18 | (i17 & 458752) | (3670016 & i17));
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(obj, str, eVar, aVar2, a10, lVar3, e10, d10, f11, d0Var2, i14, i11, i12, i13));
    }

    public static final void b(Object obj, String str, x5.e eVar, x0.f fVar, f1.d dVar, f1.d dVar2, f1.d dVar3, l<? super b.c.C1077c, v> lVar, l<? super b.c.d, v> lVar2, l<? super b.c.C1076b, v> lVar3, x0.a aVar, q1.f fVar2, float f10, d0 d0Var, int i10, l0.i iVar, int i11, int i12, int i13) {
        f1.d dVar4;
        int i14;
        int i15;
        int i16;
        l0.i h10 = iVar.h(-1423045651);
        f.a aVar2 = (i13 & 8) != 0 ? x0.f.f59359u : fVar;
        f1.d dVar5 = (i13 & 16) != 0 ? null : dVar;
        f1.d dVar6 = (i13 & 32) != 0 ? null : dVar2;
        if ((i13 & 64) != 0) {
            i14 = i11 & (-3670017);
            dVar4 = dVar6;
        } else {
            dVar4 = dVar3;
            i14 = i11;
        }
        l<? super b.c.C1077c, v> lVar4 = (i13 & 128) != 0 ? null : lVar;
        l<? super b.c.d, v> lVar5 = (i13 & 256) != 0 ? null : lVar2;
        l<? super b.c.C1076b, v> lVar6 = (i13 & 512) != 0 ? null : lVar3;
        x0.a e10 = (i13 & 1024) != 0 ? x0.a.f59327a.e() : aVar;
        q1.f d10 = (i13 & 2048) != 0 ? q1.f.f48569a.d() : fVar2;
        float f11 = (i13 & 4096) != 0 ? 1.0f : f10;
        d0 d0Var2 = (i13 & 8192) != 0 ? null : d0Var;
        if ((i13 & 16384) != 0) {
            i16 = i12 & (-57345);
            i15 = e1.e.f30042e.b();
        } else {
            i15 = i10;
            i16 = i12;
        }
        int i17 = i16 << 18;
        a(obj, str, eVar, aVar2, j.h(dVar5, dVar6, dVar4), j.d(lVar4, lVar5, lVar6), e10, d10, f11, d0Var2, i15, h10, (i14 & 7168) | (i14 & 112) | 520 | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024) | (i17 & 1879048192), (i16 >> 12) & 14, 0);
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new C1073a(obj, str, eVar, aVar2, dVar5, dVar6, dVar4, lVar4, lVar5, lVar6, e10, d10, f11, d0Var2, i15, i11, i12, i13));
    }

    public static final void c(x0.f fVar, f1.d dVar, String str, x0.a aVar, q1.f fVar2, float f10, d0 d0Var, l0.i iVar, int i10) {
        l0.i h10 = iVar.h(-341425040);
        x0.f L = z0.d.b(e(fVar, str)).L(new z5.e(dVar, aVar, fVar2, f10, d0Var));
        d dVar2 = d.f62523a;
        h10.x(1376091099);
        m2.d dVar3 = (m2.d) h10.G(o0.e());
        m2.q qVar = (m2.q) h10.G(o0.j());
        g2 g2Var = (g2) h10.G(o0.n());
        x0.f e10 = x0.e.e(h10, L);
        a.C0787a c0787a = s1.a.f51802o;
        io.a<s1.a> a10 = c0787a.a();
        h10.x(1546164872);
        if (!(h10.k() instanceof l0.e)) {
            l0.h.c();
        }
        h10.D();
        if (h10.f()) {
            h10.r(new c(a10));
        } else {
            h10.o();
        }
        h10.E();
        l0.i a11 = h2.a(h10);
        h2.b(a11, dVar2, c0787a.d());
        h2.b(a11, dVar3, c0787a.b());
        h2.b(a11, qVar, c0787a.c());
        h2.b(a11, g2Var, c0787a.f());
        h2.b(a11, e10, c0787a.e());
        h10.c();
        h10.s();
        h10.O();
        h10.O();
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new e(fVar, dVar, str, aVar, fVar2, f10, d0Var, i10));
    }

    public static final x0.f e(x0.f fVar, String str) {
        return str != null ? w1.p.b(fVar, false, new f(str), 1, null) : fVar;
    }

    public static final k6.h f(long j10) {
        k6.b bVar;
        k6.b bVar2;
        if (m2.b.r(j10)) {
            return null;
        }
        if (m2.b.j(j10)) {
            bVar = new b.C0535b(m2.b.n(j10));
        } else {
            bVar = b.a.f38437a;
        }
        if (m2.b.i(j10)) {
            bVar2 = new b.C0535b(m2.b.m(j10));
        } else {
            bVar2 = b.a.f38437a;
        }
        return new k6.h(bVar, bVar2);
    }

    public static final j6.i g(j6.i iVar, l0.i iVar2, int i10) {
        iVar2.x(-1553384601);
        i.a R = j6.i.R(iVar, null, 1, null);
        if (iVar.q().m() == null) {
            iVar2.x(-3687241);
            Object y10 = iVar2.y();
            if (y10 == l0.i.f39065a.a()) {
                y10 = new z5.d();
                iVar2.q(y10);
            }
            iVar2.O();
            R.k((k6.i) y10);
        }
        j6.i a10 = R.a();
        iVar2.O();
        return a10;
    }
}
