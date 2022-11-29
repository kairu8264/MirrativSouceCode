package z9;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import c1.d0;
import h0.w1;
import j2.e;
import l0.h2;
import l0.l1;
import l0.n1;
import s1.a;
import x0.a;
import x0.f;
import y.a1;
import y.d1;
import y.f;
import y.g1;
import y.r0;
import y.y0;
import z9.p;

/* loaded from: classes.dex */
public final class q {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f62888w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ p f62889x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f62890y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f62891z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0.f fVar, p pVar, int i10, int i11) {
            super(2);
            this.f62888w = fVar;
            this.f62889x = pVar;
            this.f62890y = i10;
            this.f62891z = i11;
        }

        public final void a(l0.i iVar, int i10) {
            q.a(this.f62888w, this.f62889x, iVar, this.f62890y | 1, this.f62891z);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(x0.f fVar, p pVar, l0.i iVar, int i10, int i11) {
        Object obj;
        int i12;
        f.a aVar;
        a1 a1Var;
        int i13;
        x0.f fVar2;
        a1 a1Var2;
        jo.p.h(pVar, "bindModel");
        l0.i h10 = iVar.h(1349103108);
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
            i12 |= h10.P(pVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            f.a aVar2 = i14 != 0 ? x0.f.f59359u : obj;
            x0.f a10 = z0.a.a(aVar2, pVar.a());
            a.C0986a c0986a = x0.a.f59327a;
            a.c i15 = c0986a.i();
            h10.x(693286680);
            y.f fVar3 = y.f.f60773a;
            q1.c0 a11 = y0.a(fVar3.f(), i15, h10, 48);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a12 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a13 = q1.w.a(a10);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a12);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a14 = h2.a(h10);
            h2.b(a14, a11, c0787a.d());
            h2.b(a14, dVar, c0787a.b());
            h2.b(a14, qVar, c0787a.c());
            h2.b(a14, g2Var, c0787a.f());
            h10.c();
            a13.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-678309503);
            a1 a1Var3 = a1.f60672a;
            f.a aVar3 = x0.f.f59359u;
            x0.f y10 = d1.y(aVar3, m2.g.l(88));
            a.b j10 = c0986a.j();
            h10.x(-483455358);
            q1.c0 a15 = y.p.a(fVar3.g(), j10, h10, 48);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(o0.e());
            m2.q qVar2 = (m2.q) h10.G(o0.j());
            g2 g2Var2 = (g2) h10.G(o0.n());
            io.a<s1.a> a16 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a17 = q1.w.a(y10);
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
            h10.x(-1163856341);
            y.r rVar = y.r.f60913a;
            h10.x(675711142);
            if (pVar.j() == p.b.LowerRank) {
                String b10 = pVar.b();
                int b11 = j2.e.f37075b.b();
                o9.b bVar = o9.b.f44283a;
                i13 = 0;
                a1Var = a1Var3;
                fVar2 = aVar2;
                aVar = aVar3;
                w1.c(b10, null, bVar.a().w(), 0L, null, null, null, 0L, null, j2.e.g(b11), 0L, 0, false, 0, null, bVar.b().u(), h10, 0, 0, 32250);
            } else {
                aVar = aVar3;
                a1Var = a1Var3;
                i13 = 0;
                fVar2 = aVar2;
            }
            h10.O();
            f.a aVar4 = aVar;
            x0.f n10 = d1.n(aVar4, 0.0f, 1, null);
            String c10 = pVar.c();
            long j11 = pVar.e().j();
            long c11 = m2.s.c(m2.r.h(pVar.e().j()) - 6.0f);
            e.a aVar5 = j2.e.f37075b;
            l9.a.a(c10, j11, c11, n10, pVar.d(), pVar.e().m(), j2.e.g(aVar5.b()), h10, 3072, 0);
            h10.x(1727607079);
            if (pVar.j() == p.b.UpperRank) {
                String b12 = pVar.b();
                int b13 = aVar5.b();
                o9.b bVar2 = o9.b.f44283a;
                w1.c(b12, null, bVar2.a().w(), 0L, null, null, null, 0L, null, j2.e.g(b13), 0L, 0, false, 0, null, bVar2.b().u(), h10, 0, 0, 32250);
            }
            h10.O();
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            x0.f y11 = d1.y(aVar4, m2.g.l(44));
            f.d c12 = fVar3.c();
            h10.x(693286680);
            q1.c0 a19 = y0.a(c12, c0986a.l(), h10, 6);
            h10.x(-1323940314);
            m2.d dVar3 = (m2.d) h10.G(o0.e());
            m2.q qVar3 = (m2.q) h10.G(o0.j());
            g2 g2Var3 = (g2) h10.G(o0.n());
            io.a<s1.a> a20 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a21 = q1.w.a(y11);
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
            a21.s0(n1.a(n1.b(h10)), h10, Integer.valueOf(i13));
            h10.x(2058660585);
            h10.x(-678309503);
            g1.a(d1.y(aVar4, m2.g.l(4)), h10, 6);
            h10.x(675712485);
            if (pVar.k()) {
                a1Var2 = a1Var;
                v.w.a(v1.e.c(q9.f.ic_crown, h10, i13), null, d1.v(r0.m(a1Var2.d(aVar4, c0986a.a()), 0.0f, 0.0f, 0.0f, m2.g.l(5), 7, null), m2.g.l(10), m2.g.l(8)), null, null, 0.0f, d0.a.b(c1.d0.f18653b, pVar.g(), 0, 2, null), h10, 56, 56);
                g1.a(d1.y(aVar4, m2.g.l(2)), h10, 6);
            } else {
                a1Var2 = a1Var;
            }
            h10.O();
            a1 a1Var4 = a1Var2;
            l9.a.a(pVar.f(), pVar.h().j(), m2.s.c(m2.r.h(pVar.h().j()) - 6.0f), a1Var2.b(a1Var2.a(aVar4, 1.0f, false)), pVar.g(), pVar.h().m(), j2.e.g(aVar5.b()), h10, 0, 0);
            if (pVar.l()) {
                g1.a(d1.y(aVar4, m2.g.l(2)), h10, 6);
                w1.c(v1.f.b(q9.i.text_event_ranking_rank_suffix, h10, 0), a1Var4.b(aVar4), pVar.i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, o9.b.f44283a.b().q(), h10, 0, 0, 32760);
            }
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
            obj = fVar2;
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(obj, pVar, i10, i11));
    }
}
