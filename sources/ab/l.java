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
import y.y0;

/* loaded from: classes2.dex */
public final class l {

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f789w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f790x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11) {
            super(2);
            this.f789w = i10;
            this.f790x = i11;
        }

        public final void a(l0.i iVar, int i10) {
            l.a(this.f789w, iVar, this.f790x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(int i10, l0.i iVar, int i11) {
        int i12;
        l0.i h10 = iVar.h(-1402523307);
        if ((i11 & 14) == 0) {
            i12 = (h10.d(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            a.c i13 = x0.a.f59327a.i();
            h10.x(693286680);
            f.a aVar = x0.f.f59359u;
            c0 a10 = y0.a(y.f.f60773a.f(), i13, h10, 48);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(aVar);
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
            StringBuilder sb2 = new StringBuilder();
            sb2.append('+');
            sb2.append(i10);
            w1.c(sb2.toString(), null, v1.b.a(wa.c.f58516h, h10, 0), m2.s.d(11), null, x.f29149x.h(), null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 199680, 0, 65490);
            w1.c(v1.f.b(wa.j.text_omake_coin, h10, 0), null, v1.b.a(wa.c.f58519k, h10, 0), m2.s.d(11), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 3072, 0, 65522);
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
        l10.a(new a(i10, i11));
    }
}
