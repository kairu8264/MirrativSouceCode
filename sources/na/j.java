package na;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import c1.c0;
import c1.u;
import d2.x;
import h0.w1;
import io.p;
import ja.n;
import jo.q;
import l0.h2;
import l0.l1;
import l0.n1;
import q1.w;
import s1.a;
import wn.v;
import x0.a;
import x0.f;
import xn.s;
import y.a1;
import y.d1;
import y.f;
import y.l;
import y.r;
import y.r0;
import y.y0;

/* loaded from: classes.dex */
public final class j {

    /* loaded from: classes.dex */
    public static final class a extends q implements p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ i f41724w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f41725x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, int i10) {
            super(2);
            this.f41724w = iVar;
            this.f41725x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            j.a(this.f41724w, iVar, this.f41725x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(i iVar, l0.i iVar2, int i10) {
        int i11;
        int i12;
        jo.p.h(iVar, "bindModel");
        l0.i h10 = iVar2.h(-1443554960);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(iVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            f.a aVar = x0.f.f59359u;
            float f10 = 2;
            float f11 = 8;
            x0.f a10 = z0.d.a(v.g.h(y.g.b(d1.j(r0.k(aVar, 0.0f, m2.g.l(5), 1, null), 0.0f, 1, null), 0.9411765f, false, 2, null), m2.g.l(f10), u.a.b(u.f18773b, s.m(c0.g(v1.b.a(ja.j.game_color_purple_start, h10, 0)), c0.g(v1.b.a(ja.j.game_color_purple_end, h10, 0))), 0.0f, 0.0f, 0, 14, null), e0.g.c(m2.g.l(f11))), e0.g.c(m2.g.l(f11)));
            a.C0986a c0986a = x0.a.f59327a;
            x0.a e10 = c0986a.e();
            h10.x(733328855);
            q1.c0 h11 = y.j.h(e10, false, h10, 6);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a12 = w.a(a10);
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
            h2.b(a13, h11, c0787a.d());
            h2.b(a13, dVar, c0787a.b());
            h2.b(a13, qVar, c0787a.c());
            h2.b(a13, g2Var, c0787a.f());
            h10.c();
            a12.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            l lVar = l.f60836a;
            x0.f a14 = z0.a.a(v.e.d(d1.l(r0.i(aVar, m2.g.l(f10)), 0.0f, 1, null), v1.b.a(ja.j.f37423v, h10, 0), null, 2, null), iVar.a());
            y.f fVar = y.f.f60773a;
            f.e b10 = fVar.b();
            a.c i13 = c0986a.i();
            h10.x(693286680);
            q1.c0 a15 = y0.a(b10, i13, h10, 54);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(o0.e());
            m2.q qVar2 = (m2.q) h10.G(o0.j());
            g2 g2Var2 = (g2) h10.G(o0.n());
            io.a<s1.a> a16 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a17 = w.a(a14);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a16);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a18 = h2.a(h10);
            h2.b(a18, a15, c0787a.d());
            h2.b(a18, dVar2, c0787a.b());
            h2.b(a18, qVar2, c0787a.c());
            h2.b(a18, g2Var2, c0787a.f());
            h10.c();
            a17.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-678309503);
            a1 a1Var = a1.f60672a;
            a.b g10 = c0986a.g();
            h10.x(-483455358);
            q1.c0 a19 = y.p.a(fVar.g(), g10, h10, 48);
            h10.x(-1323940314);
            m2.d dVar3 = (m2.d) h10.G(o0.e());
            m2.q qVar3 = (m2.q) h10.G(o0.j());
            g2 g2Var3 = (g2) h10.G(o0.n());
            io.a<s1.a> a20 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a21 = w.a(aVar);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a20);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a22 = h2.a(h10);
            h2.b(a22, a19, c0787a.d());
            h2.b(a22, dVar3, c0787a.b());
            h2.b(a22, qVar3, c0787a.c());
            h2.b(a22, g2Var3, c0787a.f());
            h10.c();
            a21.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            r rVar = r.f60913a;
            String b11 = v1.f.b(n.text_live_game_mission_received_coins_today, h10, 0);
            long d10 = m2.s.d(8);
            x.a aVar2 = x.f29149x;
            w1.c(b11, null, v1.b.a(ja.j.toryBlue, h10, 0), d10, null, aVar2.h(), null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 199680, 0, 65490);
            v.w.a(v1.e.c(ja.k.ic_mirrativ_coin, h10, 0), null, d1.u(r0.m(aVar, 0.0f, m2.g.l(3), 0.0f, 0.0f, 13, null), m2.g.l(28)), null, null, 0.0f, null, h10, 440, 120);
            h10.x(693286680);
            q1.c0 a23 = y0.a(fVar.f(), c0986a.l(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar4 = (m2.d) h10.G(o0.e());
            m2.q qVar4 = (m2.q) h10.G(o0.j());
            g2 g2Var4 = (g2) h10.G(o0.n());
            io.a<s1.a> a24 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a25 = w.a(aVar);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a24);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a26 = h2.a(h10);
            h2.b(a26, a23, c0787a.d());
            h2.b(a26, dVar4, c0787a.b());
            h2.b(a26, qVar4, c0787a.c());
            h2.b(a26, g2Var4, c0787a.f());
            h10.c();
            a25.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-678309503);
            w1.c(iVar.b(), a1Var.b(aVar), v1.b.a(ja.j.pinkFlamingo, h10, 0), m2.s.d(12), null, aVar2.j(), null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 199680, 0, 65488);
            w1.c(iVar.c(), a1Var.b(aVar), v1.b.a(ja.j.f37422t, h10, 0), m2.s.d(8), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 3072, 0, 65520);
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
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            h10.x(-817467956);
            if (iVar.d()) {
                i12 = 0;
                v.w.a(v1.e.c(ja.k.ic_clear_stamp, h10, 0), null, d1.u(r0.m(aVar, 0.0f, 0.0f, 0.0f, m2.g.l(12), 7, null), m2.g.l(48)), null, null, 0.0f, null, h10, 440, 120);
            } else {
                i12 = 0;
            }
            h10.O();
            if (iVar.e()) {
                v.w.a(v1.e.c(ja.k.ic_live_game_mission_invalid, h10, i12), null, d1.u(aVar, m2.g.l(58)), null, null, 0.0f, null, h10, 440, 120);
            }
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(iVar, i10));
    }
}
