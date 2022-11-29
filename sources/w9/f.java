package w9;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import com.dena.mirrativ.mirrativapi.common.Description;
import h0.w1;
import l0.h2;
import l0.l1;
import l0.n1;
import q1.c0;
import q1.w;
import s1.a;
import x0.a;
import x0.f;
import y.d1;
import y.g1;
import y.r0;

/* loaded from: classes.dex */
public final class f {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e f58287w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f58288x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, int i10) {
            super(2);
            this.f58287w = eVar;
            this.f58288x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            f.a(this.f58287w, iVar, this.f58288x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(e eVar, l0.i iVar, int i10) {
        jo.p.h(eVar, "bindModel");
        l0.i h10 = iVar.h(1561117804);
        int i11 = 0;
        x0.f k10 = r0.k(v.e.d(d1.n(x0.f.f59359u, 0.0f, 1, null), v1.b.a(q9.d.f48804b, h10, 0), null, 2, null), m2.g.l(20), 0.0f, 2, null);
        a.b g10 = x0.a.f59327a.g();
        h10.x(-483455358);
        c0 a10 = y.p.a(y.f.f60773a.g(), g10, h10, 48);
        h10.x(-1323940314);
        m2.d dVar = (m2.d) h10.G(o0.e());
        m2.q qVar = (m2.q) h10.G(o0.j());
        g2 g2Var = (g2) h10.G(o0.n());
        a.C0787a c0787a = s1.a.f51802o;
        io.a<s1.a> a11 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, wn.v> a12 = w.a(k10);
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
        h10.x(-622429875);
        int i12 = 0;
        for (Object obj : eVar.a()) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                xn.s.t();
            }
            Description description = (Description) obj;
            if (i12 == 0) {
                h10.x(246564037);
                g1.a(d1.o(x0.f.f59359u, m2.g.l(50)), h10, 6);
                h10.O();
            } else {
                h10.x(246564143);
                g1.a(d1.o(x0.f.f59359u, m2.g.l(38)), h10, 6);
                h10.O();
            }
            String title = description.getTitle();
            int i14 = q9.d.G;
            long a14 = v1.b.a(i14, h10, i11);
            o9.b bVar = o9.b.f44283a;
            w1.c(title, null, a14, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().c(), h10, 0, 0, 32762);
            f.a aVar = x0.f.f59359u;
            g1.a(d1.o(aVar, m2.g.l(18)), h10, 6);
            w1.c(description.getText(), d1.n(aVar, 0.0f, 1, null), v1.b.a(i14, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().g(), h10, 48, 0, 32760);
            i12 = i13;
            i11 = 0;
        }
        h10.O();
        f.a aVar2 = x0.f.f59359u;
        g1.a(d1.o(aVar2, m2.g.l(50)), h10, 6);
        g1.a(y.g.b(d1.n(aVar2, 0.0f, 1, null), 3.4f, false, 2, null), h10, 6);
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(eVar, i10));
    }
}
