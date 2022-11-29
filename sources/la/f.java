package la;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import h0.w1;
import io.p;
import j2.e;
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
import y.a1;
import y.d1;
import y.g1;
import y.r;
import y.r0;
import y.y0;
import y.z0;
import y1.d0;

/* loaded from: classes.dex */
public final class f {

    /* loaded from: classes.dex */
    public static final class a extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ na.d f39763w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f39764x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(na.d dVar, int i10) {
            super(2);
            this.f39763w = dVar;
            this.f39764x = i10;
        }

        public final void a(i iVar, int i10) {
            f.a(this.f39763w, iVar, this.f39764x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(na.d dVar, i iVar, int i10) {
        int i11;
        f.a aVar;
        int i12;
        f.a aVar2;
        jo.p.h(dVar, "bindModel");
        i h10 = iVar.h(-1407949063);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            String h11 = dVar.h();
            if (h11 != null) {
                a.C0986a c0986a = x0.a.f59327a;
                a.b g10 = c0986a.g();
                h10.x(-483455358);
                f.a aVar3 = x0.f.f59359u;
                y.f fVar = y.f.f60773a;
                c0 a10 = y.p.a(fVar.g(), g10, h10, 48);
                h10.x(-1323940314);
                m2.d dVar2 = (m2.d) h10.G(o0.e());
                m2.q qVar = (m2.q) h10.G(o0.j());
                g2 g2Var = (g2) h10.G(o0.n());
                a.C0787a c0787a = s1.a.f51802o;
                io.a<s1.a> a11 = c0787a.a();
                io.q<n1<s1.a>, i, Integer, v> a12 = w.a(aVar3);
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
                h2.b(a13, dVar2, c0787a.b());
                h2.b(a13, qVar, c0787a.c());
                h2.b(a13, g2Var, c0787a.f());
                h10.c();
                a12.s0(n1.a(n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-1163856341);
                r rVar = r.f60913a;
                float f10 = 10;
                v.w.a(v1.e.c(k.ic_mission, h10, 0), null, r0.m(aVar3, 0.0f, m2.g.l(f10), 0.0f, 0.0f, 13, null), null, null, 0.0f, null, h10, 440, 120);
                long a14 = v1.b.a(j.f37422t, h10, 0);
                o9.b bVar = o9.b.f44283a;
                d0 c10 = bVar.b().c();
                e.a aVar4 = j2.e.f37075b;
                float f11 = 6;
                float f12 = 16;
                w1.c(h11, d1.n(r0.m(aVar3, m2.g.l(f12), m2.g.l(f11), m2.g.l(f12), 0.0f, 8, null), 0.0f, 1, null), a14, 0L, null, null, null, 0L, null, j2.e.g(aVar4.a()), 0L, 0, false, 0, null, c10, h10, 0, 0, 32248);
                x0.f m10 = r0.m(aVar3, 0.0f, m2.g.l(8), 0.0f, 0.0f, 13, null);
                h10.x(693286680);
                c0 a15 = y0.a(fVar.f(), c0986a.l(), h10, 0);
                h10.x(-1323940314);
                m2.d dVar3 = (m2.d) h10.G(o0.e());
                m2.q qVar2 = (m2.q) h10.G(o0.j());
                g2 g2Var2 = (g2) h10.G(o0.n());
                io.a<s1.a> a16 = c0787a.a();
                io.q<n1<s1.a>, i, Integer, v> a17 = w.a(m10);
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
                h2.b(a18, a15, c0787a.d());
                h2.b(a18, dVar3, c0787a.b());
                h2.b(a18, qVar2, c0787a.c());
                h2.b(a18, g2Var2, c0787a.f());
                h10.c();
                a17.s0(n1.a(n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-678309503);
                a1 a1Var = a1.f60672a;
                g1.a(z0.c(a1Var, aVar3, 1.0f, false, 2, null), h10, 0);
                na.h i13 = dVar.i();
                h10.x(982437845);
                if (i13 == null) {
                    aVar = aVar3;
                    i12 = 6;
                } else {
                    h.a(i13, h10, 0);
                    aVar = aVar3;
                    i12 = 6;
                    g1.a(d1.y(aVar, m2.g.l(f11)), h10, 6);
                    v vVar = v.f59242a;
                }
                h10.O();
                na.h m11 = dVar.m();
                h10.x(982438041);
                if (m11 != null) {
                    h.a(m11, h10, 0);
                    v vVar2 = v.f59242a;
                }
                h10.O();
                g1.a(z0.c(a1Var, aVar, 1.0f, false, 2, null), h10, 0);
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
                h10.x(-102660577);
                if (dVar.c() != null) {
                    g1.a(d1.o(aVar, m2.g.l(f10)), h10, i12);
                    aVar2 = aVar;
                    w1.c(dVar.c(), r0.k(v.e.c(d1.y(aVar, m2.g.l(186)), v1.b.a(j.f37418p, h10, 0), e0.g.c(m2.g.l(4))), 0.0f, m2.g.l(2), 1, null), v1.b.a(j.f37423v, h10, 0), 0L, null, null, null, 0L, null, j2.e.g(aVar4.a()), 0L, 0, false, 0, null, bVar.b().t(), h10, 0, 0, 32248);
                } else {
                    aVar2 = aVar;
                }
                h10.O();
                g1.a(v.e.d(d1.o(d1.n(r0.m(aVar2, m2.g.l(f12), m2.g.l(f12), m2.g.l(f12), 0.0f, 8, null), 0.0f, 1, null), m2.g.l((float) 0.5d)), v1.b.a(j.f37417m, h10, 0), null, 2, null), h10, 0);
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
                v vVar3 = v.f59242a;
            }
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(dVar, i10));
    }
}
