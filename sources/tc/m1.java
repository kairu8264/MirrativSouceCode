package tc;

import androidx.compose.ui.platform.g2;
import h0.w1;
import l0.h2;
import s1.a;
import x0.a;
import x0.f;

/* loaded from: classes2.dex */
public final class m1 {

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f53547w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<wn.v> aVar) {
            super(0);
            this.f53547w = aVar;
        }

        public final void a() {
            this.f53547w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f53548w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f53549x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar, int i10) {
            super(2);
            this.f53548w = aVar;
            this.f53549x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            m1.a(this.f53548w, iVar, this.f53549x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(io.a<wn.v> aVar, l0.i iVar, int i10) {
        int i11;
        jo.p.h(aVar, "onClickRegister");
        l0.i h10 = iVar.h(-2039986677);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            a.b g10 = x0.a.f59327a.g();
            f.a aVar2 = x0.f.f59359u;
            x0.f n10 = y.d1.n(aVar2, 0.0f, 1, null);
            h10.x(-483455358);
            q1.c0 a10 = y.p.a(y.f.f60773a.g(), g10, h10, 48);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var = (g2) h10.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(n10);
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
            h10.x(-1163856341);
            y.r rVar = y.r.f60913a;
            y.g1.a(y.d1.o(aVar2, m2.g.l(33)), h10, 6);
            w1.c(v1.f.b(nc.i.text_chat_confirmation_request_title, h10, 0), null, v1.b.a(nc.b.f41802v, h10, 0), 0L, null, null, null, 0L, null, j2.e.g(j2.e.f37075b.a()), 0L, 0, false, 0, null, o9.b.f44283a.b().b(), h10, 0, 0, 32250);
            y.g1.a(y.d1.o(aVar2, m2.g.l(16)), h10, 6);
            h10.x(1157296644);
            boolean P = h10.P(aVar);
            Object y10 = h10.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new a(aVar);
                h10.q(y10);
            }
            h10.O();
            k9.c.a((io.a) y10, y.d1.v(aVar2, m2.g.l(200), m2.g.l(40)), null, 0.0f, false, null, null, d0.f53485a.a(), h10, 12582960, 124);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
        }
        l0.l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(aVar, i10));
    }
}
