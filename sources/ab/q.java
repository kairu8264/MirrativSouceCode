package ab;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import c1.c0;
import d2.x;
import h0.w1;
import l0.h2;
import l0.l1;
import l0.n1;
import s1.a;
import x0.a;
import x0.f;
import y.a1;
import y.d1;
import y.g1;
import y.r0;
import y.t0;
import y.y0;
import y.z0;

/* loaded from: classes2.dex */
public final class q {

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f815w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ p f816x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.l<? super String, wn.v> lVar, p pVar) {
            super(0);
            this.f815w = lVar;
            this.f816x = pVar;
        }

        public final void a() {
            this.f815w.invoke(this.f816x.d());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.q<z0, l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p f817w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(3);
            this.f817w = pVar;
        }

        public final void a(z0 z0Var, l0.i iVar, int i10) {
            int i11;
            jo.p.h(z0Var, "$this$Button");
            if ((i10 & 14) == 0) {
                i11 = i10 | (iVar.P(z0Var) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && iVar.j()) {
                iVar.I();
                return;
            }
            w1.c(this.f817w.c(), z0Var.d(x0.f.f59359u, x0.a.f59327a.i()), c0.f18634b.f(), m2.s.d(12), null, x.f29149x.h(), null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 200064, 0, 65488);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(z0 z0Var, l0.i iVar, Integer num) {
            a(z0Var, iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p f818w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f819x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f820y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(p pVar, io.l<? super String, wn.v> lVar, int i10) {
            super(2);
            this.f818w = pVar;
            this.f819x = lVar;
            this.f820y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            q.a(this.f818w, this.f819x, iVar, this.f820y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(p pVar, io.l<? super String, wn.v> lVar, l0.i iVar, int i10) {
        int i11;
        jo.p.h(pVar, "bindModel");
        jo.p.h(lVar, "onClickPurchase");
        l0.i h10 = iVar.h(-1820221099);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(lVar) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            f.a aVar = x0.f.f59359u;
            x0.f j10 = r0.j(v.e.d(aVar, v1.b.a(wa.c.f58510b, h10, 0), null, 2, null), m2.g.l(16), m2.g.l(12));
            a.C0986a c0986a = x0.a.f59327a;
            a.c i12 = c0986a.i();
            h10.x(693286680);
            y.f fVar = y.f.f60773a;
            q1.c0 a10 = y0.a(fVar.f(), i12, h10, 48);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(j10);
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
            h10.x(-483455358);
            q1.c0 a14 = y.p.a(fVar.g(), c0986a.k(), h10, 0);
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
            h10.x(-1163856341);
            y.r rVar = y.r.f60913a;
            l9.d.c(pVar.e(), d1.o(aVar, m2.g.l(14)), null, 0, null, null, h10, 48, 60);
            g1.a(d1.o(aVar, m2.g.l(4)), h10, 6);
            a.c i13 = c0986a.i();
            h10.x(693286680);
            q1.c0 a18 = y0.a(fVar.f(), i13, h10, 48);
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
            float f10 = 25;
            v.w.a(v1.e.c(wa.g.f58545a, h10, 0), null, d1.o(d1.y(aVar, m2.g.l(f10)), m2.g.l(f10)), null, null, 0.0f, null, h10, 440, 120);
            g1.a(d1.y(aVar, m2.g.l(6)), h10, 6);
            w1.c(pVar.a(), null, v1.b.a(wa.c.f58518j, h10, 0), m2.s.d(16), null, x.f29149x.h(), null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 199680, 0, 65490);
            g1.a(d1.y(aVar, m2.g.l(8)), h10, 6);
            l.a(pVar.b(), h10, 0);
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
            g1.a(z0.c(a1Var, aVar, 1.0f, false, 2, null), h10, 0);
            x0.f o10 = d1.o(d1.t(aVar, m2.g.l(80)), m2.g.l(32));
            e0.f a22 = e0.g.a(50);
            h0.d dVar4 = h0.d.f33749a;
            h0.c a23 = dVar4.a(v1.b.a(wa.c.f58516h, h10, 0), 0L, 0L, 0L, h10, 32768, 14);
            float f11 = 0;
            h0.e b10 = dVar4.b(m2.g.l(f11), m2.g.l(f11), 0.0f, 0.0f, 0.0f, h10, 262198, 28);
            t0 c10 = r0.c(0.0f, 0.0f, 3, null);
            h10.x(511388516);
            boolean P = h10.P(lVar) | h10.P(pVar);
            Object y10 = h10.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new a(lVar, pVar);
                h10.q(y10);
            }
            h10.O();
            h0.f.a((io.a) y10, o10, false, null, b10, a22, null, a23, c10, s0.c.b(h10, 991520937, true, new b(pVar)), h10, 905969712, 76);
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
        l10.a(new c(pVar, lVar, i10));
    }
}
