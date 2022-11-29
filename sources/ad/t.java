package ad;

import s1.a;
import x0.a;
import x0.f;
import y.f;

/* loaded from: classes2.dex */
public final class t {

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ s f1331w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f1332x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s sVar, int i10) {
            super(2);
            this.f1331w = sVar;
            this.f1332x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            t.a(this.f1331w, iVar, this.f1332x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(s sVar, l0.i iVar, int i10) {
        int i11;
        int i12;
        f.a aVar;
        f.a aVar2;
        jo.p.h(sVar, "bindModel");
        l0.i h10 = iVar.h(1835799851);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(sVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            f.a aVar3 = x0.f.f59359u;
            x0.f C = y.d1.C(y.d1.y(v.e.d(z0.d.a(y.r0.m(aVar3, 0.0f, m2.g.l(17), 0.0f, 0.0f, 13, null), e0.g.c(m2.g.l(12))), v1.b.a(nc.b.F, h10, 0), null, 2, null), m2.g.l(280)), null, false, 3, null);
            h10.x(-483455358);
            y.f fVar = y.f.f60773a;
            f.l g10 = fVar.g();
            a.C0986a c0986a = x0.a.f59327a;
            q1.c0 a10 = y.p.a(g10, c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            androidx.compose.ui.platform.g2 g2Var = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(C);
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
            l0.i a13 = l0.h2.a(h10);
            l0.h2.b(a13, a10, c0787a.d());
            l0.h2.b(a13, dVar, c0787a.b());
            l0.h2.b(a13, qVar, c0787a.c());
            l0.h2.b(a13, g2Var, c0787a.f());
            h10.c();
            a12.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            y.r rVar = y.r.f60913a;
            y.g1.a(y.d1.o(aVar3, m2.g.l(84)), h10, 6);
            r.a(sVar, h10, i11 & 14);
            String b10 = v1.f.b(nc.i.text_earned_cash_bonus_detail, h10, 0);
            o9.b bVar = o9.b.f44283a;
            y1.d0 q10 = bVar.b().q();
            int i13 = nc.b.f41794e;
            h0.w1.c(b10, rVar.b(y.r0.m(aVar3, 0.0f, m2.g.l(16), 0.0f, 0.0f, 13, null), c0986a.g()), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, q10.C(new y1.d0(v1.b.a(i13, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, 0, 0, 32764);
            y.g1.a(y.d1.o(aVar3, m2.g.l(6)), h10, 6);
            int i14 = nc.b.f41799s;
            float f10 = 24;
            h0.w.a(y.r0.k(aVar3, m2.g.l(f10), 0.0f, 2, null), v1.b.a(i14, h10, 0), 0.0f, 0.0f, h10, 6, 12);
            float f11 = 8;
            y.g1.a(y.d1.o(aVar3, m2.g.l(f11)), h10, 6);
            x0.f C2 = y.d1.C(y.d1.n(y.r0.k(aVar3, m2.g.l(f10), 0.0f, 2, null), 0.0f, 1, null), null, false, 3, null);
            h10.x(733328855);
            q1.c0 h11 = y.j.h(c0986a.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar2 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            androidx.compose.ui.platform.g2 g2Var2 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
            io.a<s1.a> a14 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a15 = q1.w.a(C2);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a14);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a16 = l0.h2.a(h10);
            l0.h2.b(a16, h11, c0787a.d());
            l0.h2.b(a16, dVar2, c0787a.b());
            l0.h2.b(a16, qVar2, c0787a.c());
            l0.h2.b(a16, g2Var2, c0787a.f());
            h10.c();
            a15.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            y.l lVar = y.l.f60836a;
            x0.f a17 = lVar.a(aVar3, c0986a.h());
            h10.x(-483455358);
            q1.c0 a18 = y.p.a(fVar.g(), c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar3 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar3 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            androidx.compose.ui.platform.g2 g2Var3 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
            io.a<s1.a> a19 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a20 = q1.w.a(a17);
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
            l0.i a21 = l0.h2.a(h10);
            l0.h2.b(a21, a18, c0787a.d());
            l0.h2.b(a21, dVar3, c0787a.b());
            l0.h2.b(a21, qVar3, c0787a.c());
            l0.h2.b(a21, g2Var3, c0787a.f());
            h10.c();
            a20.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            h10.x(693286680);
            q1.c0 a22 = y.y0.a(fVar.f(), c0986a.l(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar4 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar4 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            androidx.compose.ui.platform.g2 g2Var4 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
            io.a<s1.a> a23 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a24 = q1.w.a(aVar3);
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
            l0.i a25 = l0.h2.a(h10);
            l0.h2.b(a25, a22, c0787a.d());
            l0.h2.b(a25, dVar4, c0787a.b());
            l0.h2.b(a25, qVar4, c0787a.c());
            l0.h2.b(a25, g2Var4, c0787a.f());
            h10.c();
            a24.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-678309503);
            y.a1 a1Var = y.a1.f60672a;
            h0.w1.c(v1.f.b(nc.i.text_earned_cash_streaming_bonus, h10, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().r().C(new y1.d0(v1.b.a(i13, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, 0, 0, 32766);
            float f12 = 4;
            y.g1.a(y.d1.y(aVar3, m2.g.l(f12)), h10, 6);
            h0.w1.c("[", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().t().C(new y1.d0(v1.b.a(i13, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, 6, 0, 32766);
            y.g1.a(y.d1.y(aVar3, m2.g.l(f12)), h10, 6);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sVar.o().name());
            sb2.append(v1.f.b(nc.i.text_stream_class_name, h10, 0));
            h0.w1.c(sb2.toString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().t().C(new y1.d0(v1.b.a(sVar.o().r(), h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, 0, 0, 32766);
            y.g1.a(y.d1.y(aVar3, m2.g.l(f12)), h10, 6);
            h0.w1.c("]", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().t().C(new y1.d0(v1.b.a(i13, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, 6, 0, 32766);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            float f13 = 3;
            x0.f m10 = y.r0.m(aVar3, 0.0f, m2.g.l(f13), 0.0f, 0.0f, 13, null);
            h10.x(693286680);
            q1.c0 a26 = y.y0.a(fVar.f(), c0986a.l(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar5 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar5 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            androidx.compose.ui.platform.g2 g2Var5 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
            io.a<s1.a> a27 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a28 = q1.w.a(m10);
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
            l0.i a29 = l0.h2.a(h10);
            l0.h2.b(a29, a26, c0787a.d());
            l0.h2.b(a29, dVar5, c0787a.b());
            l0.h2.b(a29, qVar5, c0787a.c());
            l0.h2.b(a29, g2Var5, c0787a.f());
            h10.c();
            a28.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-678309503);
            float f14 = 15;
            v.w.a(v1.e.c(nc.d.icon_season_rating_money, h10, 0), null, a1Var.d(y.d1.y(y.d1.o(aVar3, m2.g.l(f14)), m2.g.l(f14)), c0986a.i()), null, null, 0.0f, null, h10, 56, 120);
            h0.w1.c(sVar.g(), a1Var.b(y.r0.m(aVar3, m2.g.l(4), 0.0f, 0.0f, 0.0f, 14, null)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().i().C(new y1.d0(v1.b.a(i13, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, 0, 0, 32764);
            float f15 = 2;
            h0.w1.c(sVar.e(), a1Var.b(y.r0.m(aVar3, m2.g.l(f15), 0.0f, 0.0f, 0.0f, 14, null)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().o().C(new y1.d0(v1.b.a(i13, h10, 0), 0L, null, null, null, null, null, m2.s.d(1), null, null, null, 0L, null, null, null, null, 0L, null, 262014, null)), h10, 0, 0, 32764);
            h0.w1.c(sVar.f(), y.r0.m(aVar3, m2.g.l(f15), m2.g.l(f13), 0.0f, 0.0f, 12, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().u().C(new y1.d0(v1.b.a(i13, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, 48, 0, 32764);
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
            x0.f a30 = lVar.a(aVar3, c0986a.c());
            h10.x(-483455358);
            q1.c0 a31 = y.p.a(fVar.g(), c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar6 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar6 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            androidx.compose.ui.platform.g2 g2Var6 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
            io.a<s1.a> a32 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a33 = q1.w.a(a30);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a32);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a34 = l0.h2.a(h10);
            l0.h2.b(a34, a31, c0787a.d());
            l0.h2.b(a34, dVar6, c0787a.b());
            l0.h2.b(a34, qVar6, c0787a.c());
            l0.h2.b(a34, g2Var6, c0787a.f());
            h10.c();
            a33.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            h10.x(1061808759);
            if (sVar.r()) {
                v.w.a(v1.e.c(nc.d.ic_broad_cast_cash_bonus_max, h10, 0), null, rVar.b(y.d1.y(y.d1.o(aVar3, m2.g.l(14)), m2.g.l(f10)), c0986a.j()), null, null, 0.0f, null, h10, 56, 120);
            }
            h10.O();
            h0.w1.c(sVar.c(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().c().C(new y1.d0(v1.b.a(sVar.d(), h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, 0, 0, 32766);
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
            h10.x(-1619584345);
            if (sVar.q()) {
                y.g1.a(y.d1.o(aVar3, m2.g.l(9)), h10, 6);
                h0.w.a(y.r0.k(aVar3, m2.g.l(f10), 0.0f, 2, null), v1.b.a(i14, h10, 0), 0.0f, 0.0f, h10, 6, 12);
                y.g1.a(y.d1.o(aVar3, m2.g.l(f11)), h10, 6);
                x0.f C3 = y.d1.C(y.d1.n(y.r0.k(aVar3, m2.g.l(f10), 0.0f, 2, null), 0.0f, 1, null), null, false, 3, null);
                h10.x(733328855);
                q1.c0 h12 = y.j.h(c0986a.o(), false, h10, 0);
                h10.x(-1323940314);
                m2.d dVar7 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
                m2.q qVar7 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
                androidx.compose.ui.platform.g2 g2Var7 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
                io.a<s1.a> a35 = c0787a.a();
                io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a36 = q1.w.a(C3);
                if (!(h10.k() instanceof l0.e)) {
                    l0.h.c();
                }
                h10.D();
                if (h10.f()) {
                    h10.r(a35);
                } else {
                    h10.o();
                }
                h10.E();
                l0.i a37 = l0.h2.a(h10);
                l0.h2.b(a37, h12, c0787a.d());
                l0.h2.b(a37, dVar7, c0787a.b());
                l0.h2.b(a37, qVar7, c0787a.c());
                l0.h2.b(a37, g2Var7, c0787a.f());
                h10.c();
                a36.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-2137368960);
                x0.f a38 = lVar.a(aVar3, c0986a.h());
                h10.x(-483455358);
                q1.c0 a39 = y.p.a(fVar.g(), c0986a.k(), h10, 0);
                h10.x(-1323940314);
                m2.d dVar8 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
                m2.q qVar8 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
                androidx.compose.ui.platform.g2 g2Var8 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
                io.a<s1.a> a40 = c0787a.a();
                io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a41 = q1.w.a(a38);
                if (!(h10.k() instanceof l0.e)) {
                    l0.h.c();
                }
                h10.D();
                if (h10.f()) {
                    h10.r(a40);
                } else {
                    h10.o();
                }
                h10.E();
                l0.i a42 = l0.h2.a(h10);
                l0.h2.b(a42, a39, c0787a.d());
                l0.h2.b(a42, dVar8, c0787a.b());
                l0.h2.b(a42, qVar8, c0787a.c());
                l0.h2.b(a42, g2Var8, c0787a.f());
                h10.c();
                a41.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-1163856341);
                h10.x(693286680);
                q1.c0 a43 = y.y0.a(fVar.f(), c0986a.l(), h10, 0);
                h10.x(-1323940314);
                m2.d dVar9 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
                m2.q qVar9 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
                androidx.compose.ui.platform.g2 g2Var9 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
                io.a<s1.a> a44 = c0787a.a();
                io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a45 = q1.w.a(aVar3);
                if (!(h10.k() instanceof l0.e)) {
                    l0.h.c();
                }
                h10.D();
                if (h10.f()) {
                    h10.r(a44);
                } else {
                    h10.o();
                }
                h10.E();
                l0.i a46 = l0.h2.a(h10);
                l0.h2.b(a46, a43, c0787a.d());
                l0.h2.b(a46, dVar9, c0787a.b());
                l0.h2.b(a46, qVar9, c0787a.c());
                l0.h2.b(a46, g2Var9, c0787a.f());
                h10.c();
                a45.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-678309503);
                h0.w1.c(v1.f.b(nc.i.text_earned_cash_paid_coin_gift_bonus, h10, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().r().C(new y1.d0(v1.b.a(i13, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, 0, 0, 32766);
                float f16 = 4;
                y.g1.a(y.d1.y(aVar3, m2.g.l(f16)), h10, 6);
                h0.w1.c("[", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().t().C(new y1.d0(v1.b.a(i13, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, 6, 0, 32766);
                y.g1.a(y.d1.y(aVar3, m2.g.l(f16)), h10, 6);
                l2 n10 = sVar.n();
                h10.x(1223155302);
                if (n10 == null) {
                    aVar2 = aVar3;
                } else {
                    aVar2 = aVar3;
                    h0.w1.c(v1.f.b(n10.w(), h10, 0) + v1.f.b(i12, h10, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().t().C(new y1.d0(v1.b.a(n10.c(), h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, 0, 0, 32766);
                    wn.v vVar = wn.v.f59242a;
                }
                h10.O();
                float l10 = m2.g.l(f16);
                f.a aVar4 = aVar2;
                y.g1.a(y.d1.y(aVar4, l10), h10, 6);
                h0.w1.c("]", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().t().C(new y1.d0(v1.b.a(i13, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, 6, 0, 32766);
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
                x0.f m11 = y.r0.m(aVar4, 0.0f, m2.g.l(3), 0.0f, 0.0f, 13, null);
                h10.x(693286680);
                q1.c0 a47 = y.y0.a(fVar.f(), c0986a.l(), h10, 0);
                h10.x(-1323940314);
                m2.d dVar10 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
                m2.q qVar10 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
                androidx.compose.ui.platform.g2 g2Var10 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
                io.a<s1.a> a48 = c0787a.a();
                io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a49 = q1.w.a(m11);
                if (!(h10.k() instanceof l0.e)) {
                    l0.h.c();
                }
                h10.D();
                if (h10.f()) {
                    h10.r(a48);
                } else {
                    h10.o();
                }
                h10.E();
                l0.i a50 = l0.h2.a(h10);
                l0.h2.b(a50, a47, c0787a.d());
                l0.h2.b(a50, dVar10, c0787a.b());
                l0.h2.b(a50, qVar10, c0787a.c());
                l0.h2.b(a50, g2Var10, c0787a.f());
                h10.c();
                a49.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-678309503);
                float f17 = 15;
                v.w.a(v1.e.c(nc.d.ic_broad_cast_result_gift_bonus, h10, 0), null, a1Var.d(y.d1.y(y.d1.o(aVar4, m2.g.l(f17)), m2.g.l(f17)), c0986a.i()), null, null, 0.0f, null, h10, 56, 120);
                h0.w1.c(sVar.j(), a1Var.b(y.r0.m(aVar4, m2.g.l(4), 0.0f, 0.0f, 0.0f, 14, null)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().i().C(new y1.d0(v1.b.a(i13, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, 0, 0, 32764);
                h0.w1.c(sVar.l(), a1Var.b(y.r0.m(aVar4, m2.g.l(2), 0.0f, 0.0f, 0.0f, 14, null)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().o().C(new y1.d0(v1.b.a(i13, h10, 0), 0L, null, null, null, null, null, m2.s.d(1), null, null, null, 0L, null, null, null, null, 0L, null, 262014, null)), h10, 0, 0, 32764);
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
                x0.f a51 = lVar.a(aVar4, c0986a.c());
                h10.x(-483455358);
                q1.c0 a52 = y.p.a(fVar.g(), c0986a.k(), h10, 0);
                h10.x(-1323940314);
                m2.d dVar11 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
                m2.q qVar11 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
                androidx.compose.ui.platform.g2 g2Var11 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
                io.a<s1.a> a53 = c0787a.a();
                io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a54 = q1.w.a(a51);
                if (!(h10.k() instanceof l0.e)) {
                    l0.h.c();
                }
                h10.D();
                if (h10.f()) {
                    h10.r(a53);
                } else {
                    h10.o();
                }
                h10.E();
                l0.i a55 = l0.h2.a(h10);
                l0.h2.b(a55, a52, c0787a.d());
                l0.h2.b(a55, dVar11, c0787a.b());
                l0.h2.b(a55, qVar11, c0787a.c());
                l0.h2.b(a55, g2Var11, c0787a.f());
                h10.c();
                a54.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-1163856341);
                aVar = aVar4;
                h0.w1.c(sVar.k(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().c().C(new y1.d0(v1.b.a(i13, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, 0, 0, 32766);
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
            } else {
                aVar = aVar3;
            }
            h10.O();
            y.g1.a(y.d1.o(aVar, m2.g.l(21)), h10, 6);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
        }
        l0.l1 l11 = h10.l();
        if (l11 == null) {
            return;
        }
        l11.a(new a(sVar, i10));
    }
}
