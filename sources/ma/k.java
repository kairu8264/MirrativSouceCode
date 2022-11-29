package ma;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import h0.w1;
import io.p;
import jo.q;
import l0.h2;
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
import y.f;
import y.r;
import y.r0;
import y.y0;

/* loaded from: classes.dex */
public final class k {

    /* loaded from: classes.dex */
    public static final class a extends q implements p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ j f40703w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f40704x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, int i10) {
            super(2);
            this.f40703w = jVar;
            this.f40704x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            k.a(this.f40703w, iVar, this.f40704x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(j jVar, l0.i iVar, int i10) {
        int i11;
        jo.p.h(jVar, "bindModel");
        l0.i h10 = iVar.h(-2048548270);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(jVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            f.a aVar = x0.f.f59359u;
            x0.f k10 = r0.k(d1.n(aVar, 0.0f, 1, null), m2.g.l(16), 0.0f, 2, null);
            y.f fVar = y.f.f60773a;
            f.e b10 = fVar.b();
            h10.x(693286680);
            a.C0986a c0986a = x0.a.f59327a;
            c0 a10 = y0.a(b10, c0986a.l(), h10, 6);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a12 = w.a(k10);
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
            h10.x(-678309503);
            a1 a1Var = a1.f60672a;
            l9.d.c(jVar.b(), d1.o(d1.y(aVar, m2.g.l(90)), m2.g.l(60)), null, 0, null, null, h10, 48, 60);
            x0.f n10 = d1.n(aVar, 0.0f, 1, null);
            h10.x(-483455358);
            c0 a14 = y.p.a(fVar.g(), c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(o0.e());
            m2.q qVar2 = (m2.q) h10.G(o0.j());
            g2 g2Var2 = (g2) h10.G(o0.n());
            io.a<s1.a> a15 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a16 = w.a(n10);
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
            h10.x(-1163856341);
            r rVar = r.f60913a;
            String c10 = jVar.c();
            int i12 = ja.j.f37422t;
            long a18 = v1.b.a(i12, h10, 0);
            o9.b bVar = o9.b.f44283a;
            w1.c(c10, r0.m(d1.n(aVar, 0.0f, 1, null), 0.0f, m2.g.l(2), 0.0f, 0.0f, 13, null), a18, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().c(), h10, 48, 0, 32760);
            w1.c(jVar.a(), d1.n(aVar, 0.0f, 1, null), v1.b.a(i12, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().d(), h10, 48, 0, 32760);
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
        l10.a(new a(jVar, i10));
    }
}
