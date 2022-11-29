package yd;

import androidx.compose.ui.platform.g2;
import l0.h2;
import s1.a;
import ud.x1;
import x0.a;
import x0.f;
import y.f;

/* loaded from: classes2.dex */
public final class l0 {

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f61749w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<wn.v> aVar) {
            super(0);
            this.f61749w = aVar;
        }

        public final void a() {
            this.f61749w.invoke();
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
        public final /* synthetic */ x1.a f61750w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f61751x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f61752y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x1.a aVar, io.a<wn.v> aVar2, int i10) {
            super(2);
            this.f61750w = aVar;
            this.f61751x = aVar2;
            this.f61752y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            l0.a(this.f61750w, this.f61751x, iVar, this.f61752y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(x1.a aVar, io.a<wn.v> aVar2, l0.i iVar, int i10) {
        int i11;
        jo.p.h(aVar, "bindModel");
        jo.p.h(aVar2, "onClick");
        l0.i h10 = iVar.h(-1713861218);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(aVar2) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            f.a aVar3 = x0.f.f59359u;
            x0.f d10 = v.e.d(y.d1.C(y.d1.n(aVar3, 0.0f, 1, null), null, false, 3, null), v1.b.a(nd.w0.f42226b, h10, 0), null, 2, null);
            h10.x(-483455358);
            f.l g10 = y.f.f60773a.g();
            a.C0986a c0986a = x0.a.f59327a;
            q1.c0 a10 = y.p.a(g10, c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var = (g2) h10.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(d10);
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
            y.g1.a(y.d1.o(aVar3, m2.g.l(24)), h10, 6);
            String a14 = aVar.a();
            x0.f C = y.d1.C(y.d1.n(y.d1.A(y.r0.k(rVar.b(aVar3, c0986a.g()), m2.g.l(16), 0.0f, 2, null), 0.0f, m2.g.l(500), 1, null), 0.0f, 1, null), null, false, 3, null);
            h10.x(1157296644);
            boolean P = h10.P(aVar2);
            Object y10 = h10.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new a(aVar2);
                h10.q(y10);
            }
            h10.O();
            l9.d.c(a14, v.l.e(C, false, null, null, (io.a) y10, 7, null), null, 0, q1.f.f48569a.c(), null, h10, 24576, 44);
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
        l10.a(new b(aVar, aVar2, i10));
    }
}
