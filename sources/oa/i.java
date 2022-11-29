package oa;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import h0.w1;
import l0.h2;
import l0.l1;
import l0.n1;
import q1.c0;
import s1.a;
import x0.a;
import x0.f;
import y.a1;
import y.d1;
import y.f;
import y.g1;
import y.r0;
import y.y0;
import y.z0;

/* loaded from: classes.dex */
public final class i {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f44375w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ h f44376x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.l<? super String, wn.v> lVar, h hVar) {
            super(0);
            this.f44375w = lVar;
            this.f44376x = hVar;
        }

        public final void a() {
            this.f44375w.invoke(this.f44376x.j());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f44377w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ h f44378x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f44379y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f44380z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x0.f fVar, h hVar, io.l<? super String, wn.v> lVar, int i10, int i11) {
            super(2);
            this.f44377w = fVar;
            this.f44378x = hVar;
            this.f44379y = lVar;
            this.f44380z = i10;
            this.A = i11;
        }

        public final void a(l0.i iVar, int i10) {
            i.a(this.f44377w, this.f44378x, this.f44379y, iVar, this.f44380z | 1, this.A);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(x0.f fVar, h hVar, io.l<? super String, wn.v> lVar, l0.i iVar, int i10, int i11) {
        int i12;
        jo.p.h(hVar, "bindModel");
        jo.p.h(lVar, "onClickProfile");
        l0.i h10 = iVar.h(299670858);
        x0.f fVar2 = (i11 & 1) != 0 ? x0.f.f59359u : fVar;
        float f10 = 12;
        x0.f c10 = v.e.c(r0.j(fVar2, m2.g.l(18), m2.g.l(f10)), v1.b.a(ja.j.background_default, h10, 0), e0.g.c(m2.g.l(10)));
        h10.x(-483455358);
        y.f fVar3 = y.f.f60773a;
        f.l g10 = fVar3.g();
        a.C0986a c0986a = x0.a.f59327a;
        c0 a10 = y.p.a(g10, c0986a.k(), h10, 0);
        h10.x(-1323940314);
        m2.d dVar = (m2.d) h10.G(o0.e());
        m2.q qVar = (m2.q) h10.G(o0.j());
        g2 g2Var = (g2) h10.G(o0.n());
        a.C0787a c0787a = s1.a.f51802o;
        io.a<s1.a> a11 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(c10);
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
        l0.i a13 = h2.a(h10);
        h2.b(a13, a10, c0787a.d());
        h2.b(a13, dVar, c0787a.b());
        h2.b(a13, qVar, c0787a.c());
        h2.b(a13, g2Var, c0787a.f());
        h10.c();
        a12.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-1163856341);
        y.r rVar = y.r.f60913a;
        f.a aVar = x0.f.f59359u;
        g1.a(d1.u(aVar, m2.g.l(f10)), h10, 6);
        x0.f g11 = d1.g(d1.n(aVar, 0.0f, 1, null), m2.g.f40516x.b(), m2.g.l(70));
        a.c i13 = c0986a.i();
        h10.x(693286680);
        c0 a14 = y0.a(fVar3.f(), i13, h10, 48);
        h10.x(-1323940314);
        m2.d dVar2 = (m2.d) h10.G(o0.e());
        m2.q qVar2 = (m2.q) h10.G(o0.j());
        g2 g2Var2 = (g2) h10.G(o0.n());
        io.a<s1.a> a15 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, wn.v> a16 = q1.w.a(g11);
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
        l0.i a17 = h2.a(h10);
        h2.b(a17, a14, c0787a.d());
        h2.b(a17, dVar2, c0787a.b());
        h2.b(a17, qVar2, c0787a.c());
        h2.b(a17, g2Var2, c0787a.f());
        h10.c();
        a16.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-678309503);
        a1 a1Var = a1.f60672a;
        g1.a(d1.u(aVar, m2.g.l(f10)), h10, 6);
        x0.f y10 = d1.y(aVar, m2.g.l(46));
        x0.a e10 = c0986a.e();
        h10.x(733328855);
        c0 h11 = y.j.h(e10, false, h10, 6);
        h10.x(-1323940314);
        m2.d dVar3 = (m2.d) h10.G(o0.e());
        m2.q qVar3 = (m2.q) h10.G(o0.j());
        g2 g2Var3 = (g2) h10.G(o0.n());
        io.a<s1.a> a18 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, wn.v> a19 = q1.w.a(y10);
        if (!(h10.k() instanceof l0.e)) {
            l0.h.c();
        }
        h10.D();
        if (h10.f()) {
            h10.r(a18);
        } else {
            h10.o();
        }
        h10.E();
        l0.i a20 = h2.a(h10);
        h2.b(a20, h11, c0787a.d());
        h2.b(a20, dVar3, c0787a.b());
        h2.b(a20, qVar3, c0787a.c());
        h2.b(a20, g2Var3, c0787a.f());
        h10.c();
        a19.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-2137368960);
        y.l lVar2 = y.l.f60836a;
        w1.c(hVar.h(), null, v1.b.a(hVar.e(), h10, 0), hVar.f(), null, d2.x.f29149x.a(), null, 0L, null, j2.e.g(j2.e.f37075b.a()), 0L, 0, false, 0, null, hVar.g(), h10, 196608, 0, 32210);
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        float f11 = 8;
        g1.a(d1.u(aVar, m2.g.l(f11)), h10, 6);
        float f12 = 45;
        x0.f u10 = d1.u(aVar, m2.g.l(f12));
        x0.a e11 = c0986a.e();
        h10.x(733328855);
        c0 h12 = y.j.h(e11, false, h10, 6);
        h10.x(-1323940314);
        m2.d dVar4 = (m2.d) h10.G(o0.e());
        m2.q qVar4 = (m2.q) h10.G(o0.j());
        g2 g2Var4 = (g2) h10.G(o0.n());
        io.a<s1.a> a21 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, wn.v> a22 = q1.w.a(u10);
        if (!(h10.k() instanceof l0.e)) {
            l0.h.c();
        }
        h10.D();
        if (h10.f()) {
            h10.r(a21);
        } else {
            h10.o();
        }
        h10.E();
        l0.i a23 = h2.a(h10);
        h2.b(a23, h12, c0787a.d());
        h2.b(a23, dVar4, c0787a.b());
        h2.b(a23, qVar4, c0787a.c());
        h2.b(a23, g2Var4, c0787a.f());
        h10.c();
        a22.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-2137368960);
        x0.f a24 = z0.d.a(d1.u(aVar, m2.g.l(f12)), e0.g.f());
        h10.x(-492369756);
        Object y11 = h10.y();
        if (y11 == l0.i.f39065a.a()) {
            y11 = x.l.a();
            h10.q(y11);
        }
        h10.O();
        l9.d.c(hVar.b(), v.l.c(a24, (x.m) y11, null, false, null, null, new a(lVar, hVar), 28, null), Integer.valueOf(ja.k.f37425e), 0, null, null, h10, 0, 56);
        h10.x(813958057);
        if (hVar.l()) {
            l9.d.c(hVar.a(), lVar2.a(d1.u(aVar, m2.g.l(16)), c0986a.n()), null, 0, null, null, h10, 0, 60);
        }
        h10.O();
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        g1.a(d1.u(aVar, m2.g.l(f11)), h10, 6);
        x0.f c11 = z0.c(a1Var, aVar, 1.0f, false, 2, null);
        h10.x(-483455358);
        c0 a25 = y.p.a(fVar3.g(), c0986a.k(), h10, 0);
        h10.x(-1323940314);
        m2.d dVar5 = (m2.d) h10.G(o0.e());
        m2.q qVar5 = (m2.q) h10.G(o0.j());
        g2 g2Var5 = (g2) h10.G(o0.n());
        io.a<s1.a> a26 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, wn.v> a27 = q1.w.a(c11);
        if (!(h10.k() instanceof l0.e)) {
            l0.h.c();
        }
        h10.D();
        if (h10.f()) {
            h10.r(a26);
        } else {
            h10.o();
        }
        h10.E();
        l0.i a28 = h2.a(h10);
        h2.b(a28, a25, c0787a.d());
        h2.b(a28, dVar5, c0787a.b());
        h2.b(a28, qVar5, c0787a.c());
        h2.b(a28, g2Var5, c0787a.f());
        h10.c();
        a27.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-1163856341);
        h10.x(-1004949766);
        if (hVar.m()) {
            l9.d.c(hVar.c(), d1.o(aVar, m2.g.l(f10)), null, 0, null, null, h10, 48, 60);
            g1.a(d1.o(aVar, m2.g.l(4)), h10, 6);
        }
        h10.O();
        String k10 = hVar.k();
        long a29 = v1.b.a(ja.j.f37412f, h10, 0);
        o9.b bVar = o9.b.f44283a;
        w1.c(k10, null, a29, 0L, null, null, null, 0L, null, null, 0L, j2.k.f37107a.b(), false, 2, null, bVar.b().h(), h10, 0, 3120, 22522);
        float f13 = 4;
        g1.a(d1.o(aVar, m2.g.l(f13)), h10, 6);
        w1.c(hVar.i(), d1.n(aVar, 0.0f, 1, null), v1.b.a(ja.j.azure, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().z(), h10, 48, 0, 32760);
        g1.a(d1.o(aVar, m2.g.l(f13)), h10, 6);
        h10.x(813959481);
        if (hVar.n()) {
            h10.x(693286680);
            c0 a30 = y0.a(fVar3.f(), c0986a.l(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar6 = (m2.d) h10.G(o0.e());
            m2.q qVar6 = (m2.q) h10.G(o0.j());
            g2 g2Var6 = (g2) h10.G(o0.n());
            io.a<s1.a> a31 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a32 = q1.w.a(aVar);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a31);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a33 = h2.a(h10);
            h2.b(a33, a30, c0787a.d());
            h2.b(a33, dVar6, c0787a.b());
            h2.b(a33, qVar6, c0787a.c());
            h2.b(a33, g2Var6, c0787a.f());
            h10.c();
            a32.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-678309503);
            w1.c(v1.f.b(ja.n.text_livegame_daily_ranking_focused_livegame, h10, 0), null, v1.b.a(ja.j.f37413g, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().n(), h10, 0, 0, 32762);
            for (String str : hVar.d()) {
                f.a aVar2 = x0.f.f59359u;
                g1.a(d1.u(aVar2, m2.g.l(f13)), h10, 6);
                l9.d.c(str, z0.d.a(d1.o(aVar2, m2.g.l(16)), e0.g.c(m2.g.l(f13))), null, 0, null, null, h10, 0, 60);
            }
            i12 = 6;
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
        } else {
            i12 = 6;
        }
        h10.O();
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        f.a aVar3 = x0.f.f59359u;
        g1.a(d1.u(aVar3, m2.g.l(f10)), h10, i12);
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        g1.a(d1.u(aVar3, m2.g.l(f10)), h10, i12);
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(fVar2, hVar, lVar, i10, i11));
    }
}
