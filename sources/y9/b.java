package y9;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import h0.w1;
import io.p;
import j2.k;
import jo.q;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import m2.g;
import q1.c0;
import q1.w;
import s1.a;
import w9.h;
import wn.v;
import x0.a;
import x0.f;
import y.a1;
import y.d1;
import y.f;
import y.g1;
import y.j;
import y.l;
import y.r;
import y.r0;
import y.y0;
import y.z0;

/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public static final class a extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f f61314w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ h f61315x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f61316y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f61317z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, h hVar, int i10, int i11) {
            super(2);
            this.f61314w = fVar;
            this.f61315x = hVar;
            this.f61316y = i10;
            this.f61317z = i11;
        }

        public final void a(i iVar, int i10) {
            b.a(this.f61314w, this.f61315x, iVar, this.f61316y | 1, this.f61317z);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(f fVar, h hVar, i iVar, int i10, int i11) {
        Object obj;
        int i12;
        int i13;
        jo.p.h(hVar, "bindModel");
        i h10 = iVar.h(-35377669);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            obj = fVar;
        } else if ((i10 & 14) == 0) {
            obj = fVar;
            i12 = (h10.P(obj) ? 4 : 2) | i10;
        } else {
            obj = fVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= h10.P(hVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            f.a aVar = i14 != 0 ? f.f59359u : obj;
            int i15 = i12 & 14;
            h10.x(-483455358);
            y.f fVar2 = y.f.f60773a;
            f.l g10 = fVar2.g();
            a.C0986a c0986a = x0.a.f59327a;
            int i16 = i15 >> 3;
            c0 a10 = y.p.a(g10, c0986a.k(), h10, (i16 & 112) | (i16 & 14));
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a12 = w.a(aVar);
            int i17 = ((((i15 << 3) & 112) << 9) & 7168) | 6;
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a11);
            } else {
                h10.o();
            }
            h10.E();
            i a13 = h2.a(h10);
            h2.b(a13, a10, c0787a.d());
            h2.b(a13, dVar, c0787a.b());
            h2.b(a13, qVar, c0787a.c());
            h2.b(a13, g2Var, c0787a.f());
            h10.c();
            a12.s0(n1.a(n1.b(h10)), h10, Integer.valueOf((i17 >> 3) & 112));
            h10.x(2058660585);
            h10.x(-1163856341);
            if (((i17 >> 9) & 14 & 11) == 2 && h10.j()) {
                h10.I();
            } else {
                r rVar = r.f60913a;
                if (((((i15 >> 6) & 112) | 6) & 81) == 16 && h10.j()) {
                    h10.I();
                } else {
                    h10.x(-1770108370);
                    if (hVar.l()) {
                        i13 = 0;
                        h0.w.a(r0.m(x0.f.f59359u, g.l(50), 0.0f, 0.0f, 0.0f, 14, null), v1.b.a(q9.d.F, h10, 0), g.l((float) 0.5d), 0.0f, h10, 390, 8);
                    } else {
                        i13 = 0;
                    }
                    h10.O();
                    f.a aVar2 = x0.f.f59359u;
                    float f10 = 12;
                    x0.f m10 = r0.m(aVar2, 0.0f, g.l(f10), 0.0f, g.l(f10), 5, null);
                    a.c i18 = c0986a.i();
                    h10.x(693286680);
                    c0 a14 = y0.a(fVar2.f(), i18, h10, 48);
                    h10.x(-1323940314);
                    m2.d dVar2 = (m2.d) h10.G(o0.e());
                    m2.q qVar2 = (m2.q) h10.G(o0.j());
                    g2 g2Var2 = (g2) h10.G(o0.n());
                    io.a<s1.a> a15 = c0787a.a();
                    io.q<n1<s1.a>, i, Integer, v> a16 = w.a(m10);
                    if (!(h10.k() instanceof l0.e)) {
                        l0.h.c();
                    }
                    h10.D();
                    if (h10.f()) {
                        h10.r(a15);
                    } else {
                        h10.o();
                    }
                    h10.E();
                    i a17 = h2.a(h10);
                    h2.b(a17, a14, c0787a.d());
                    h2.b(a17, dVar2, c0787a.b());
                    h2.b(a17, qVar2, c0787a.c());
                    h2.b(a17, g2Var2, c0787a.f());
                    h10.c();
                    a16.s0(n1.a(n1.b(h10)), h10, Integer.valueOf(i13));
                    h10.x(2058660585);
                    h10.x(-678309503);
                    a1 a1Var = a1.f60672a;
                    x0.f y10 = d1.y(aVar2, g.l(51));
                    a.b g11 = c0986a.g();
                    h10.x(-483455358);
                    c0 a18 = y.p.a(fVar2.g(), g11, h10, 48);
                    h10.x(-1323940314);
                    m2.d dVar3 = (m2.d) h10.G(o0.e());
                    m2.q qVar3 = (m2.q) h10.G(o0.j());
                    g2 g2Var3 = (g2) h10.G(o0.n());
                    io.a<s1.a> a19 = c0787a.a();
                    io.q<n1<s1.a>, i, Integer, v> a20 = w.a(y10);
                    if (!(h10.k() instanceof l0.e)) {
                        l0.h.c();
                    }
                    h10.D();
                    if (h10.f()) {
                        h10.r(a19);
                    } else {
                        h10.o();
                    }
                    h10.E();
                    i a21 = h2.a(h10);
                    h2.b(a21, a18, c0787a.d());
                    h2.b(a21, dVar3, c0787a.b());
                    h2.b(a21, qVar3, c0787a.c());
                    h2.b(a21, g2Var3, c0787a.f());
                    h10.c();
                    a20.s0(n1.a(n1.b(h10)), h10, Integer.valueOf(i13));
                    h10.x(2058660585);
                    h10.x(-1163856341);
                    String e10 = hVar.e();
                    int i19 = q9.d.f48815s;
                    long a22 = v1.b.a(i19, h10, i13);
                    o9.b bVar = o9.b.f44283a;
                    w1.c(e10, null, a22, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().e(), h10, 0, 0, 32762);
                    h10.O();
                    h10.O();
                    h10.s();
                    h10.O();
                    h10.O();
                    h10.x(733328855);
                    c0 h11 = j.h(c0986a.o(), false, h10, 0);
                    h10.x(-1323940314);
                    m2.d dVar4 = (m2.d) h10.G(o0.e());
                    m2.q qVar4 = (m2.q) h10.G(o0.j());
                    g2 g2Var4 = (g2) h10.G(o0.n());
                    io.a<s1.a> a23 = c0787a.a();
                    io.q<n1<s1.a>, i, Integer, v> a24 = w.a(aVar2);
                    if (!(h10.k() instanceof l0.e)) {
                        l0.h.c();
                    }
                    h10.D();
                    if (h10.f()) {
                        h10.r(a23);
                    } else {
                        h10.o();
                    }
                    h10.E();
                    i a25 = h2.a(h10);
                    h2.b(a25, h11, c0787a.d());
                    h2.b(a25, dVar4, c0787a.b());
                    h2.b(a25, qVar4, c0787a.c());
                    h2.b(a25, g2Var4, c0787a.f());
                    h10.c();
                    a24.s0(n1.a(n1.b(h10)), h10, 0);
                    h10.x(2058660585);
                    h10.x(-2137368960);
                    l lVar = l.f60836a;
                    l9.d.c(hVar.b(), z0.d.a(d1.u(aVar2, g.l(45)), e0.g.f()), Integer.valueOf(q9.f.N), 0, null, null, h10, 0, 56);
                    h10.x(-33733603);
                    if (hVar.j()) {
                        l9.d.c(hVar.a(), lVar.a(d1.u(aVar2, g.l(16)), c0986a.n()), null, 0, null, null, h10, 0, 60);
                    }
                    h10.O();
                    h10.O();
                    h10.O();
                    h10.s();
                    h10.O();
                    h10.O();
                    g1.a(d1.y(aVar2, g.l(8)), h10, 6);
                    x0.f c10 = z0.c(a1Var, aVar2, 1.0f, false, 2, null);
                    h10.x(-483455358);
                    c0 a26 = y.p.a(fVar2.g(), c0986a.k(), h10, 0);
                    h10.x(-1323940314);
                    m2.d dVar5 = (m2.d) h10.G(o0.e());
                    m2.q qVar5 = (m2.q) h10.G(o0.j());
                    g2 g2Var5 = (g2) h10.G(o0.n());
                    io.a<s1.a> a27 = c0787a.a();
                    io.q<n1<s1.a>, i, Integer, v> a28 = w.a(c10);
                    if (!(h10.k() instanceof l0.e)) {
                        l0.h.c();
                    }
                    h10.D();
                    if (h10.f()) {
                        h10.r(a27);
                    } else {
                        h10.o();
                    }
                    h10.E();
                    i a29 = h2.a(h10);
                    h2.b(a29, a26, c0787a.d());
                    h2.b(a29, dVar5, c0787a.b());
                    h2.b(a29, qVar5, c0787a.c());
                    h2.b(a29, g2Var5, c0787a.f());
                    h10.c();
                    a28.s0(n1.a(n1.b(h10)), h10, 0);
                    h10.x(2058660585);
                    h10.x(-1163856341);
                    h10.x(2115752442);
                    if (hVar.k()) {
                        l9.d.c(hVar.c(), d1.o(aVar2, g.l(f10)), null, 0, null, null, h10, 48, 60);
                        g1.a(d1.o(aVar2, g.l(4)), h10, 6);
                    }
                    h10.O();
                    w1.c(hVar.d(), null, v1.b.a(q9.d.f48804b, h10, 0), 0L, null, null, null, 0L, null, null, 0L, k.f37107a.b(), false, 1, null, bVar.b().e(), h10, 0, 3120, 22522);
                    g1.a(d1.o(aVar2, g.l(4)), h10, 6);
                    w1.c(hVar.h(), d1.n(aVar2, 0.0f, 1, null), v1.b.a(i19, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().n(), h10, 48, 0, 32760);
                    h10.O();
                    h10.O();
                    h10.s();
                    h10.O();
                    h10.O();
                    h10.O();
                    h10.O();
                    h10.s();
                    h10.O();
                    h10.O();
                }
            }
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            obj = aVar;
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(obj, hVar, i10, i11));
    }
}
