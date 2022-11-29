package la;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import h0.w1;
import io.p;
import ja.j;
import ja.k;
import jo.q;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import q1.c0;
import q1.w;
import s1.a;
import wn.v;
import x0.a;
import x0.f;
import y.d1;
import y.g1;
import y.l;
import y.r0;

/* loaded from: classes.dex */
public final class h {

    /* loaded from: classes.dex */
    public static final class a extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ na.h f39775w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f39776x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(na.h hVar, int i10) {
            super(2);
            this.f39775w = hVar;
            this.f39776x = i10;
        }

        public final void a(i iVar, int i10) {
            h.a(this.f39775w, iVar, this.f39776x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(na.h hVar, i iVar, int i10) {
        int i11;
        jo.p.h(hVar, "bindModel");
        i h10 = iVar.h(-305210405);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            f.a aVar = x0.f.f59359u;
            float f10 = 8;
            x0.f g10 = v.g.g(d1.o(d1.y(aVar, m2.g.l(90)), m2.g.l(60)), m2.g.l((float) 0.5d), v1.b.a(j.f37417m, h10, 0), e0.g.c(m2.g.l(f10)));
            a.C0986a c0986a = x0.a.f59327a;
            x0.a e10 = c0986a.e();
            h10.x(733328855);
            c0 h11 = y.j.h(e10, false, h10, 6);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a11 = w.a(g10);
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
            i a12 = h2.a(h10);
            h2.b(a12, h11, c0787a.d());
            h2.b(a12, dVar, c0787a.b());
            h2.b(a12, qVar, c0787a.c());
            h2.b(a12, g2Var, c0787a.f());
            h10.c();
            a11.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            l lVar = l.f60836a;
            x0.f l10 = d1.l(z0.a.a(aVar, hVar.a()), 0.0f, 1, null);
            h10.x(733328855);
            c0 h12 = y.j.h(c0986a.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(o0.e());
            m2.q qVar2 = (m2.q) h10.G(o0.j());
            g2 g2Var2 = (g2) h10.G(o0.n());
            io.a<s1.a> a13 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a14 = w.a(l10);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a13);
            } else {
                h10.o();
            }
            h10.E();
            i a15 = h2.a(h10);
            h2.b(a15, h12, c0787a.d());
            h2.b(a15, dVar2, c0787a.b());
            h2.b(a15, qVar2, c0787a.c());
            h2.b(a15, g2Var2, c0787a.f());
            h10.c();
            a14.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            float f11 = 4;
            v.w.a(v1.e.c(hVar.d(), h10, 0), null, d1.u(r0.m(aVar, m2.g.l(f11), m2.g.l(f11), 0.0f, 0.0f, 12, null), m2.g.l(20)), null, null, 0.0f, null, h10, 56, 120);
            f1.d c10 = v1.e.c(k.ic_mirrativ_coin, h10, 0);
            float l11 = m2.g.l(f10);
            float f12 = 36;
            v.w.a(c10, null, d1.u(r0.m(aVar, m2.g.l(27), l11, 0.0f, 0.0f, 12, null), m2.g.l(f12)), null, null, 0.0f, null, h10, 56, 120);
            x0.f o10 = d1.o(d1.y(r0.m(aVar, m2.g.l(25), m2.g.l(f12), 0.0f, 0.0f, 12, null), m2.g.l(40)), m2.g.l(14));
            int i12 = j.f37423v;
            float f13 = 7;
            x0.f c11 = v.e.c(o10, v1.b.a(i12, h10, 0), e0.g.c(m2.g.l(f13)));
            x0.a e11 = c0986a.e();
            h10.x(733328855);
            c0 h13 = y.j.h(e11, false, h10, 6);
            h10.x(-1323940314);
            m2.d dVar3 = (m2.d) h10.G(o0.e());
            m2.q qVar3 = (m2.q) h10.G(o0.j());
            g2 g2Var3 = (g2) h10.G(o0.n());
            io.a<s1.a> a16 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a17 = w.a(c11);
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
            i a18 = h2.a(h10);
            h2.b(a18, h13, c0787a.d());
            h2.b(a18, dVar3, c0787a.b());
            h2.b(a18, qVar3, c0787a.c());
            h2.b(a18, g2Var3, c0787a.f());
            h10.c();
            a17.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            g1.a(v.e.c(r0.i(d1.l(aVar, 0.0f, 1, null), m2.g.l(1)), v1.b.a(hVar.c(), h10, 0), e0.g.c(m2.g.l(f13))), h10, 0);
            w1.c(hVar.b(), null, v1.b.a(i12, h10, 0), 0L, null, null, null, 0L, null, j2.e.g(j2.e.f37075b.a()), 0L, 0, false, 0, null, o9.b.f44283a.b().t(), h10, 0, 0, 32250);
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
            if (hVar.e()) {
                v.w.a(v1.e.c(k.ic_get_stamp, h10, 0), null, d1.u(aVar, m2.g.l(38)), null, null, 0.0f, null, h10, 440, 120);
            }
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
        }
        l1 l12 = h10.l();
        if (l12 == null) {
            return;
        }
        l12.a(new a(hVar, i10));
    }
}
