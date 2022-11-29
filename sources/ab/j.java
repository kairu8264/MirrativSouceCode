package ab;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import d2.x;
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
import y.g1;
import y.r0;
import y.y0;

/* loaded from: classes2.dex */
public final class j {

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ i f787w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f788x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, int i10) {
            super(2);
            this.f787w = iVar;
            this.f788x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            j.a(this.f787w, iVar, this.f788x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(i iVar, l0.i iVar2, int i10) {
        int i11;
        jo.p.h(iVar, "bindModel");
        l0.i h10 = iVar2.h(-524509129);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(iVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            f.a aVar = x0.f.f59359u;
            x0.f n10 = d1.n(r0.j(aVar, m2.g.l(16), m2.g.l(20)), 0.0f, 1, null);
            a.C0986a c0986a = x0.a.f59327a;
            a.b g10 = c0986a.g();
            h10.x(-483455358);
            y.f fVar = y.f.f60773a;
            c0 a10 = y.p.a(fVar.g(), g10, h10, 48);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(n10);
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
            a.c i12 = c0986a.i();
            h10.x(693286680);
            c0 a14 = y0.a(fVar.f(), i12, h10, 48);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(o0.e());
            m2.q qVar2 = (m2.q) h10.G(o0.j());
            g2 g2Var2 = (g2) h10.G(o0.n());
            io.a<s1.a> a15 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a16 = q1.w.a(aVar);
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
            float f10 = 25;
            v.w.a(v1.e.c(wa.g.f58545a, h10, 0), null, d1.o(d1.y(aVar, m2.g.l(f10)), m2.g.l(f10)), null, null, 0.0f, null, h10, 440, 120);
            g1.a(d1.y(aVar, m2.g.l(4)), h10, 6);
            String c10 = iVar.c();
            int i13 = wa.c.f58519k;
            w1.c(c10, null, v1.b.a(i13, h10, 0), m2.s.d(22), null, x.f29149x.h(), null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 199680, 0, 65490);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            g1.a(d1.o(aVar, m2.g.l(8)), h10, 6);
            a.c i14 = c0986a.i();
            h10.x(693286680);
            c0 a18 = y0.a(fVar.f(), i14, h10, 48);
            h10.x(-1323940314);
            m2.d dVar3 = (m2.d) h10.G(o0.e());
            m2.q qVar3 = (m2.q) h10.G(o0.j());
            g2 g2Var3 = (g2) h10.G(o0.n());
            io.a<s1.a> a19 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a20 = q1.w.a(aVar);
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
            l0.i a21 = h2.a(h10);
            h2.b(a21, a18, c0787a.d());
            h2.b(a21, dVar3, c0787a.b());
            h2.b(a21, qVar3, c0787a.c());
            h2.b(a21, g2Var3, c0787a.f());
            h10.c();
            a20.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-678309503);
            w1.c(v1.f.c(wa.j.E, new Object[]{iVar.a()}, h10, 64), null, v1.b.a(i13, h10, 0), m2.s.d(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 3072, 0, 65522);
            float f11 = 4;
            g1.a(d1.y(aVar, m2.g.l(f11)), h10, 6);
            w1.c("/", null, v1.b.a(i13, h10, 0), m2.s.d(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 3078, 0, 65522);
            g1.a(d1.y(aVar, m2.g.l(f11)), h10, 6);
            w1.c(v1.f.c(wa.j.F, new Object[]{iVar.b()}, h10, 64), null, v1.b.a(wa.c.f58524p, h10, 0), m2.s.d(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 3072, 0, 65522);
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
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(iVar, i10));
    }
}
