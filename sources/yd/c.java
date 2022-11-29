package yd;

import androidx.compose.ui.platform.g2;
import h0.w1;
import l0.h2;
import s1.a;
import x0.a;
import x0.f;
import y.f;

/* loaded from: classes2.dex */
public final class c {

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ b f61707w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f61708x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f61709y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, x0.f fVar, int i10) {
            super(2);
            this.f61707w = bVar;
            this.f61708x = fVar;
            this.f61709y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            c.a(this.f61707w, this.f61708x, iVar, this.f61709y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(b bVar, x0.f fVar, l0.i iVar, int i10) {
        int i11;
        jo.p.h(bVar, "bindModel");
        jo.p.h(fVar, "modifier");
        l0.i h10 = iVar.h(-1552263069);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(fVar) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && h10.j()) {
            h10.I();
        } else if (bVar.c()) {
            h10.x(1584970711);
            f.a aVar = x0.f.f59359u;
            x0.f L = v.e.c(aVar, v1.b.a(nd.w0.U0, h10, 0), e0.g.c(m2.g.l(6))).L(fVar);
            h10.x(693286680);
            f.d f10 = y.f.f60773a.f();
            a.C0986a c0986a = x0.a.f59327a;
            q1.c0 a10 = y.y0.a(f10, c0986a.l(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var = (g2) h10.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(L);
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
            a12.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-678309503);
            y.a1 a1Var = y.a1.f60672a;
            float f11 = 4;
            float f12 = 2;
            w1.c(bVar.a(), y.r0.m(aVar, m2.g.l(f11), m2.g.l(f12), 0.0f, m2.g.l(f12), 4, null), v1.b.a(bVar.b().p(), h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, o9.b.f44283a.b().n(), h10, 48, 0, 32760);
            v.w.a(v1.e.c(nd.y0.f42253i0, h10, 0), null, a1Var.d(y.d1.u(y.r0.m(aVar, m2.g.l(f11), 0.0f, m2.g.l(f11), 0.0f, 10, null), m2.g.l(14)), c0986a.i()), null, null, 0.0f, null, h10, 56, 120);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            h10.O();
        } else {
            h10.x(1584971635);
            int i12 = (i11 >> 3) & 14;
            h10.x(693286680);
            f.d f13 = y.f.f60773a.f();
            a.C0986a c0986a2 = x0.a.f59327a;
            int i13 = i12 >> 3;
            q1.c0 a14 = y.y0.a(f13, c0986a2.l(), h10, (i13 & 112) | (i13 & 14));
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar2 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var2 = (g2) h10.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a2 = s1.a.f51802o;
            io.a<s1.a> a15 = c0787a2.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a16 = q1.w.a(fVar);
            int i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
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
            h2.b(a17, a14, c0787a2.d());
            h2.b(a17, dVar2, c0787a2.b());
            h2.b(a17, qVar2, c0787a2.c());
            h2.b(a17, g2Var2, c0787a2.f());
            h10.c();
            a16.s0(l0.n1.a(l0.n1.b(h10)), h10, Integer.valueOf((i14 >> 3) & 112));
            h10.x(2058660585);
            h10.x(-678309503);
            if (((i14 >> 9) & 14 & 11) == 2 && h10.j()) {
                h10.I();
            } else {
                y.a1 a1Var2 = y.a1.f60672a;
                int i15 = ((i12 >> 6) & 112) | 6;
                if ((i15 & 14) == 0) {
                    i15 |= h10.P(a1Var2) ? 4 : 2;
                }
                if ((i15 & 91) == 18 && h10.j()) {
                    h10.I();
                } else {
                    w1.c(v1.f.b(nd.f1.text_about_of_cheer_function, h10, 0), null, v1.b.a(bVar.b() == we.g.NONE ? nd.w0.f42230e0 : nd.w0.U0, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, o9.b.f44283a.b().g(), h10, 0, 0, 32762);
                    v.w.a(v1.e.c(nd.y0.ic_help_opacity50, h10, 0), null, a1Var2.d(y.d1.u(y.r0.m(x0.f.f59359u, m2.g.l(4), 0.0f, 0.0f, 0.0f, 14, null), m2.g.l(14)), c0986a2.i()), null, null, 0.0f, null, h10, 56, 120);
                }
            }
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            h10.O();
        }
        l0.l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(bVar, fVar, i10));
    }
}
