package yd;

import androidx.compose.ui.platform.g2;
import h0.w1;
import l0.h2;
import s1.a;
import ud.c4;
import x0.a;
import x0.f;
import y1.a;

/* loaded from: classes2.dex */
public final class l1 {

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f61753w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<wn.v> aVar) {
            super(0);
            this.f61753w = aVar;
        }

        public final void a() {
            this.f61753w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f61754w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar) {
            super(0);
            this.f61754w = aVar;
        }

        public final void a() {
            this.f61754w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c4 f61755w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f61756x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f61757y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f61758z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c4 c4Var, io.a<wn.v> aVar, io.a<wn.v> aVar2, int i10) {
            super(2);
            this.f61755w = c4Var;
            this.f61756x = aVar;
            this.f61757y = aVar2;
            this.f61758z = i10;
        }

        public final void a(l0.i iVar, int i10) {
            l1.a(this.f61755w, this.f61756x, this.f61757y, iVar, this.f61758z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(c4 c4Var, io.a<wn.v> aVar, io.a<wn.v> aVar2, l0.i iVar, int i10) {
        int i11;
        x0.f c10;
        y.l lVar;
        f.a aVar3;
        boolean z10;
        c1.f1 f1Var;
        jo.p.h(c4Var, "bindModel");
        jo.p.h(aVar, "onClickLpUrl");
        jo.p.h(aVar2, "onClickComment");
        l0.i h10 = iVar.h(1166449749);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(c4Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(aVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.P(aVar2) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && h10.j()) {
            h10.I();
        } else {
            h10.x(802945556);
            f.a aVar4 = x0.f.f59359u;
            x0.f C = y.d1.C(y.d1.n(aVar4, 0.0f, 1, null), null, false, 3, null);
            h10.x(1157296644);
            boolean P = h10.P(aVar2);
            Object y10 = h10.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new a(aVar2);
                h10.q(y10);
            }
            h10.O();
            x0.f e10 = v.l.e(C, false, null, null, (io.a) y10, 7, null);
            if (c4Var.m().c() != null) {
                h10.x(-44206201);
                c10 = v.g.f(e10, v.i.a(m2.g.l(1), v1.b.a(nd.w0.U0, h10, 0)), e0.g.c(m2.g.l(12)));
                h10.O();
            } else {
                h10.x(-44205975);
                c10 = v.e.c(e10, v1.b.a(nd.w0.V0, h10, 0), e0.g.c(m2.g.l(12)));
                h10.O();
            }
            h10.O();
            h10.x(733328855);
            a.C0986a c0986a = x0.a.f59327a;
            q1.c0 h11 = y.j.h(c0986a.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var = (g2) h10.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a11 = q1.w.a(c10);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a10);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a12 = h2.a(h10);
            h2.b(a12, h11, c0787a.d());
            h2.b(a12, dVar, c0787a.b());
            h2.b(a12, qVar, c0787a.c());
            h2.b(a12, g2Var, c0787a.f());
            h10.c();
            a11.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            y.l lVar2 = y.l.f60836a;
            Integer c11 = c4Var.m().c();
            h10.x(-44205691);
            if (c11 == null) {
                lVar = lVar2;
                aVar3 = aVar4;
            } else {
                lVar = lVar2;
                aVar3 = aVar4;
                v.w.a(v1.e.c(c11.intValue(), h10, 0), null, z0.d.a(y.r0.i(lVar2.c(aVar4), m2.g.l(1)), e0.g.c(m2.g.l(10))), null, q1.f.f48569a.b(), 0.85f, null, h10, 221240, 72);
                wn.v vVar = wn.v.f59242a;
            }
            h10.O();
            h10.x(-44205289);
            if (c4Var.n()) {
                l9.d.b(nd.y0.cheer_level_up_comment_background_effect, lVar.c(aVar3), null, 0, q1.f.f48569a.b(), h10, 24576, 12);
            }
            h10.O();
            float f10 = 8;
            x0.f m10 = y.r0.m(y.d1.C(y.d1.n(aVar3, 0.0f, 1, null), null, false, 3, null), 0.0f, m2.g.l(f10), 0.0f, 0.0f, 13, null);
            h10.x(693286680);
            y.f fVar = y.f.f60773a;
            q1.c0 a13 = y.y0.a(fVar.f(), c0986a.l(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar2 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var2 = (g2) h10.G(androidx.compose.ui.platform.o0.n());
            io.a<s1.a> a14 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a15 = q1.w.a(m10);
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
            l0.i a16 = h2.a(h10);
            h2.b(a16, a13, c0787a.d());
            h2.b(a16, dVar2, c0787a.b());
            h2.b(a16, qVar2, c0787a.c());
            h2.b(a16, g2Var2, c0787a.f());
            h10.c();
            a15.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-678309503);
            y.a1 a1Var = y.a1.f60672a;
            l9.d.c(c4Var.f(), z0.d.a(y.d1.u(y.r0.m(aVar3, m2.g.l(f10), 0.0f, 0.0f, 0.0f, 14, null), m2.g.l(24)), e0.g.f()), null, 0, null, null, h10, 0, 60);
            x0.f m11 = y.r0.m(y.d1.C(y.d1.n(aVar3, 0.0f, 1, null), null, false, 3, null), m2.g.l(5), 0.0f, m2.g.l(f10), 0.0f, 10, null);
            h10.x(-483455358);
            q1.c0 a17 = y.p.a(fVar.g(), c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar3 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar3 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var3 = (g2) h10.G(androidx.compose.ui.platform.o0.n());
            io.a<s1.a> a18 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a19 = q1.w.a(m11);
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
            h2.b(a20, a17, c0787a.d());
            h2.b(a20, dVar3, c0787a.b());
            h2.b(a20, qVar3, c0787a.c());
            h2.b(a20, g2Var3, c0787a.f());
            h10.c();
            a19.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            y.r rVar = y.r.f60913a;
            h10.x(-2067546988);
            a.C1037a c1037a = new a.C1037a(0, 1, null);
            c1037a.c(v1.f.c(nd.f1.text_season_yell_level_up_player_comment_1, new Object[]{c4Var.c()}, h10, 64));
            o9.b bVar = o9.b.f44283a;
            int g10 = c1037a.g(new y1.v(0L, bVar.b().z().j(), bVar.b().z().m(), (d2.u) null, (d2.v) null, (d2.l) null, (String) null, 0L, (j2.a) null, (j2.i) null, (f2.f) null, 0L, (j2.f) null, (c1.f1) null, 16377, (jo.h) null));
            try {
                c1037a.c(c4Var.l());
                wn.v vVar2 = wn.v.f59242a;
                c1037a.f(g10);
                c1037a.c(v1.f.b(nd.f1.text_season_yell_level_up_player_comment_2, h10, 0));
                y1.a h12 = c1037a.h();
                h10.O();
                long a21 = v1.b.a(c4Var.k(), h10, 0);
                y1.d0 h13 = bVar.b().h();
                h10.x(-2067546107);
                if (c4Var.o()) {
                    z10 = false;
                    f1Var = new c1.f1(v1.b.a(nd.w0.f42229d, h10, 0), b1.g.a(0.5f, 0.5f), 3.0f, null);
                } else {
                    z10 = false;
                    f1Var = null;
                }
                h10.O();
                w1.b(h12, null, a21, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, h13.C(new y1.d0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, f1Var, null, null, m2.s.b(22.4d), null, 188415, null)), h10, 0, 0, 65530);
                h10.x(-2067545627);
                if (c4Var.p()) {
                    y.g1.a(y.d1.o(aVar3, m2.g.l(4)), h10, 6);
                    h10.x(-2067545479);
                    a.C1037a c1037a2 = new a.C1037a(0, 1, null);
                    String b10 = v1.f.b(c4Var.m().i(), h10, 0);
                    String c12 = v1.f.c(nd.f1.text_season_yell_level_up_streaming_comment, new Object[]{b10}, h10, 64);
                    c1037a2.c(c12);
                    c1037a2.b(new y1.v(0L, bVar.b().z().j(), bVar.b().z().m(), (d2.u) null, (d2.v) null, (d2.l) null, (String) null, 0L, (j2.a) null, (j2.i) null, (f2.f) null, 0L, (j2.f) null, (c1.f1) null, 16377, (jo.h) null), so.o.U(c12, b10, 0, false, 6, null), so.o.U(c12, b10, 0, false, 6, null) + b10.length());
                    y1.a h14 = c1037a2.h();
                    h10.O();
                    w1.b(h14, null, v1.b.a(c4Var.k(), h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, bVar.b().h().C(new y1.d0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, c4Var.o() ? new c1.f1(v1.b.a(nd.w0.f42229d, h10, 0), b1.g.a(0.5f, 0.5f), 3.0f, null) : null, null, null, m2.s.b(22.4d), null, 188415, null)), h10, 0, 0, 65530);
                }
                h10.O();
                y.g1.a(y.d1.o(aVar3, m2.g.l(f10)), h10, 6);
                yd.b i12 = c4Var.i();
                x0.f b11 = rVar.b(aVar3, c0986a.j());
                h10.x(1157296644);
                boolean P2 = h10.P(aVar);
                Object y11 = h10.y();
                if (P2 || y11 == l0.i.f39065a.a()) {
                    y11 = new b(aVar);
                    h10.q(y11);
                }
                h10.O();
                yd.c.a(i12, v.l.e(b11, false, null, null, (io.a) y11, 7, null), h10, 0);
                y.g1.a(y.d1.o(aVar3, m2.g.l(f10)), h10, 6);
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
            } catch (Throwable th2) {
                c1037a.f(g10);
                throw th2;
            }
        }
        l0.l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new c(c4Var, aVar, aVar2, i10));
    }
}
