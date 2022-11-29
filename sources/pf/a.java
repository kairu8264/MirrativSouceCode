package pf;

import android.content.Context;
import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import androidx.compose.ui.platform.z;
import h0.w1;
import io.p;
import jo.q;
import l0.h;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import m2.d;
import m2.g;
import nd.w0;
import q1.c0;
import q1.w;
import s1.a;
import ud.x1;
import v.e;
import v1.b;
import wn.v;
import x0.a;
import x0.f;
import y.a1;
import y.d1;
import y.f;
import y.g1;
import y.r;
import y.r0;
import y.y0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: pf.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0723a extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x1.d f47452w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f47453x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0723a(x1.d dVar, int i10) {
            super(2);
            this.f47452w = dVar;
            this.f47453x = i10;
        }

        public final void a(i iVar, int i10) {
            a.a(this.f47452w, iVar, this.f47453x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(x1.d dVar, i iVar, int i10) {
        int i11;
        jo.p.h(dVar, "bindModel");
        i h10 = iVar.h(1573432121);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            Context context = (Context) h10.G(z.g());
            f.a aVar = f.f59359u;
            f d10 = e.d(d1.n(aVar, 0.0f, 1, null), b.a(w0.f42226b, h10, 0), null, 2, null);
            h10.x(-483455358);
            y.f fVar = y.f.f60773a;
            f.l g10 = fVar.g();
            a.C0986a c0986a = x0.a.f59327a;
            c0 a10 = y.p.a(g10, c0986a.k(), h10, 0);
            h10.x(-1323940314);
            d dVar2 = (d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a12 = w.a(d10);
            if (!(h10.k() instanceof l0.e)) {
                h.c();
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
            g1.a(d1.o(aVar, g.l(24)), h10, 6);
            x0.f m10 = r0.m(aVar, g.l(16), 0.0f, 0.0f, 0.0f, 14, null);
            h10.x(693286680);
            c0 a14 = y0.a(fVar.f(), c0986a.l(), h10, 0);
            h10.x(-1323940314);
            d dVar3 = (d) h10.G(o0.e());
            m2.q qVar2 = (m2.q) h10.G(o0.j());
            g2 g2Var2 = (g2) h10.G(o0.n());
            io.a<s1.a> a15 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a16 = w.a(m10);
            if (!(h10.k() instanceof l0.e)) {
                h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a15);
            } else {
                h10.o();
            }
            h10.E();
            i a17 = h2.a(h10);
            h2.b(a17, a14, c0787a.d());
            h2.b(a17, dVar3, c0787a.b());
            h2.b(a17, qVar2, c0787a.c());
            h2.b(a17, g2Var2, c0787a.f());
            h10.c();
            a16.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-678309503);
            a1 a1Var = a1.f60672a;
            float f10 = 33;
            v.w.a(v1.e.c(dVar.a().o(), h10, 0), null, d1.o(d1.y(aVar, g.l(f10)), g.l(f10)), null, null, 0.0f, null, h10, 440, 120);
            x0.f d11 = a1Var.d(aVar, c0986a.i());
            h10.x(-483455358);
            c0 a18 = y.p.a(fVar.g(), c0986a.k(), h10, 0);
            h10.x(-1323940314);
            d dVar4 = (d) h10.G(o0.e());
            m2.q qVar3 = (m2.q) h10.G(o0.j());
            g2 g2Var3 = (g2) h10.G(o0.n());
            io.a<s1.a> a19 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a20 = w.a(d11);
            if (!(h10.k() instanceof l0.e)) {
                h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a19);
            } else {
                h10.o();
            }
            h10.E();
            i a21 = h2.a(h10);
            h2.b(a21, a18, c0787a.d());
            h2.b(a21, dVar4, c0787a.b());
            h2.b(a21, qVar3, c0787a.c());
            h2.b(a21, g2Var3, c0787a.f());
            h10.c();
            a20.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            float f11 = 8;
            x0.f m11 = r0.m(aVar, g.l(f11), 0.0f, 0.0f, 0.0f, 14, null);
            o9.b bVar = o9.b.f44283a;
            w1.c(v1.f.b(dVar.a().i(), h10, 0), m11, b.a(dVar.a().p(), h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().h(), h10, 48, 0, 32760);
            g1.a(d1.o(aVar, g.l(4)), h10, 6);
            w1.c(dVar.b(), r0.m(aVar, g.l(f11), 0.0f, 0.0f, 0.0f, 14, null), b.a(dVar.a().p(), h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().p(), h10, 48, 0, 32760);
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
            g1.a(d1.o(aVar, g.l(8)), h10, 6);
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
        l10.a(new C0723a(dVar, i10));
    }
}
