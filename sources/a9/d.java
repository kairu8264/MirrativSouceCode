package a9;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import c1.i1;
import h0.w1;
import io.p;
import j2.e;
import j2.k;
import jo.q;
import l0.h;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import m2.g;
import q1.c0;
import q1.w;
import s1.a;
import wn.v;
import x0.a;
import x0.f;
import y.d1;
import y.f;
import y.g1;
import y.j;
import y.l;
import y.r;
import y.r0;

/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    public static final class a extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e f656w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(0);
            this.f656w = eVar;
        }

        public final void a() {
            this.f656w.H();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements p<i, Integer, v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f f657w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c f658x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e f659y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f660z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar, c cVar, e eVar, int i10, int i11) {
            super(2);
            this.f657w = fVar;
            this.f658x = cVar;
            this.f659y = eVar;
            this.f660z = i10;
            this.A = i11;
        }

        public final void a(i iVar, int i10) {
            d.a(this.f657w, this.f658x, this.f659y, iVar, this.f660z | 1, this.A);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(f fVar, c cVar, e eVar, i iVar, int i10, int i11) {
        Object obj;
        int i12;
        f fVar2;
        f.a aVar;
        jo.p.h(cVar, "bindModel");
        jo.p.h(eVar, "uiEvent");
        i h10 = iVar.h(-914111412);
        int i13 = i11 & 1;
        if (i13 != 0) {
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
            i12 |= h10.P(cVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= h10.P(eVar) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && h10.j()) {
            h10.I();
            fVar2 = obj;
        } else {
            fVar2 = i13 != 0 ? f.f59359u : obj;
            int i14 = i12 & 14;
            h10.x(-483455358);
            y.f fVar3 = y.f.f60773a;
            f.l g10 = fVar3.g();
            a.C0986a c0986a = x0.a.f59327a;
            int i15 = i14 >> 3;
            c0 a10 = y.p.a(g10, c0986a.k(), h10, (i15 & 112) | (i15 & 14));
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a12 = w.a(fVar2);
            int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
            if (!(h10.k() instanceof l0.e)) {
                h.c();
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
            a12.s0(n1.a(n1.b(h10)), h10, Integer.valueOf((i16 >> 3) & 112));
            h10.x(2058660585);
            h10.x(-1163856341);
            if (((i16 >> 9) & 14 & 11) == 2 && h10.j()) {
                h10.I();
            } else {
                r rVar = r.f60913a;
                int i17 = ((i14 >> 6) & 112) | 6;
                if ((i17 & 14) == 0) {
                    i17 |= h10.P(rVar) ? 4 : 2;
                }
                if ((i17 & 91) == 18 && h10.j()) {
                    h10.I();
                } else {
                    f.a aVar2 = x0.f.f59359u;
                    h0.o0.a(new a(eVar), rVar.b(d1.u(aVar2, g.l(22)), c0986a.j()), false, null, a9.a.f648a.a(), h10, 24576, 12);
                    float f10 = 20;
                    g1.a(d1.o(aVar2, g.l(f10)), h10, 6);
                    x0.f y10 = d1.y(aVar2, g.l(280));
                    o9.b bVar = o9.b.f44283a;
                    float f11 = 12;
                    x0.f b10 = v.e.b(y10, new i1(bVar.a().B(), null), e0.g.c(g.l(f11)), 0.0f, 4, null);
                    h10.x(733328855);
                    c0 h11 = j.h(c0986a.o(), false, h10, 0);
                    h10.x(-1323940314);
                    m2.d dVar2 = (m2.d) h10.G(o0.e());
                    m2.q qVar2 = (m2.q) h10.G(o0.j());
                    g2 g2Var2 = (g2) h10.G(o0.n());
                    io.a<s1.a> a14 = c0787a.a();
                    io.q<n1<s1.a>, i, Integer, v> a15 = w.a(b10);
                    if (!(h10.k() instanceof l0.e)) {
                        h.c();
                    }
                    h10.D();
                    if (h10.f()) {
                        h10.r(a14);
                    } else {
                        h10.o();
                    }
                    h10.E();
                    i a16 = h2.a(h10);
                    h2.b(a16, h11, c0787a.d());
                    h2.b(a16, dVar2, c0787a.b());
                    h2.b(a16, qVar2, c0787a.c());
                    h2.b(a16, g2Var2, c0787a.f());
                    h10.c();
                    a15.s0(n1.a(n1.b(h10)), h10, 0);
                    h10.x(2058660585);
                    h10.x(-2137368960);
                    l lVar = l.f60836a;
                    float f12 = 16;
                    x0.f l10 = r0.l(d1.n(aVar2, 0.0f, 1, null), g.l(f10), g.l(24), g.l(f10), g.l(f12));
                    a.b g11 = c0986a.g();
                    h10.x(-483455358);
                    c0 a17 = y.p.a(fVar3.g(), g11, h10, 48);
                    h10.x(-1323940314);
                    m2.d dVar3 = (m2.d) h10.G(o0.e());
                    m2.q qVar3 = (m2.q) h10.G(o0.j());
                    g2 g2Var3 = (g2) h10.G(o0.n());
                    io.a<s1.a> a18 = c0787a.a();
                    io.q<n1<s1.a>, i, Integer, v> a19 = w.a(l10);
                    if (!(h10.k() instanceof l0.e)) {
                        h.c();
                    }
                    h10.D();
                    if (h10.f()) {
                        h10.r(a18);
                    } else {
                        h10.o();
                    }
                    h10.E();
                    i a20 = h2.a(h10);
                    h2.b(a20, a17, c0787a.d());
                    h2.b(a20, dVar3, c0787a.b());
                    h2.b(a20, qVar3, c0787a.c());
                    h2.b(a20, g2Var3, c0787a.f());
                    h10.c();
                    a19.s0(n1.a(n1.b(h10)), h10, 0);
                    h10.x(2058660585);
                    h10.x(-1163856341);
                    l9.d.c(cVar.d(), y.g.b(d1.n(aVar2, 0.0f, 1, null), 1.0f, false, 2, null), null, r8.d1.f49851n, null, null, h10, 48, 52);
                    g1.a(d1.o(aVar2, g.l(f12)), h10, 6);
                    x0.f n10 = d1.n(aVar2, 0.0f, 1, null);
                    String c10 = cVar.c();
                    e.a aVar3 = j2.e.f37075b;
                    w1.c(c10, n10, bVar.a().u(), 0L, null, null, null, 0L, null, j2.e.g(aVar3.a()), 0L, 0, false, 0, null, bVar.b().a(), h10, 48, 0, 32248);
                    g1.a(d1.o(aVar2, g.l(f11)), h10, 6);
                    w1.c(cVar.b(), d1.n(r0.k(aVar2, g.l(f10), 0.0f, 2, null), 0.0f, 1, null), bVar.a().q(), 0L, null, null, null, 0L, null, j2.e.g(aVar3.a()), 0L, k.f37107a.b(), false, 0, null, bVar.b().p(), h10, 48, 48, 30200);
                    h10.O();
                    h10.O();
                    h10.s();
                    h10.O();
                    h10.O();
                    h10.x(21767119);
                    if (cVar.e()) {
                        aVar = aVar2;
                        l9.d.c(cVar.a(), d1.u(r0.m(lVar.a(aVar, c0986a.n()), 0.0f, g.l(f11), g.l(f11), 0.0f, 9, null), g.l(32)), null, r8.d1.f49848i, null, null, h10, 0, 52);
                    } else {
                        aVar = aVar2;
                    }
                    h10.O();
                    h10.O();
                    h10.O();
                    h10.s();
                    h10.O();
                    h10.O();
                    g1.a(d1.o(aVar, g.l(42)), h10, 6);
                }
            }
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
        }
        l1 l11 = h10.l();
        if (l11 == null) {
            return;
        }
        l11.a(new b(fVar2, cVar, eVar, i10, i11));
    }
}
