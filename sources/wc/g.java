package wc;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import h0.w1;
import ha.a;
import io.p;
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
import y.d1;
import y.g1;
import y.j;
import y.l;
import y.r;
import y.r0;
import y1.d0;

/* loaded from: classes2.dex */
public final class g {

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f58640w = new a();

        public a() {
            super(0);
        }

        public final void a() {
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f58641w = new b();

        public b() {
            super(0);
        }

        public final void a() {
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ wc.c f58642w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f58643x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f58644y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f58645z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wc.c cVar, io.a<v> aVar, io.a<v> aVar2, int i10) {
            super(2);
            this.f58642w = cVar;
            this.f58643x = aVar;
            this.f58644y = aVar2;
            this.f58645z = i10;
        }

        public final void a(i iVar, int i10) {
            g.a(this.f58642w, this.f58643x, this.f58644y, iVar, this.f58645z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(wc.c cVar, io.a<v> aVar, io.a<v> aVar2, i iVar, int i10) {
        int i11;
        i iVar2;
        jo.p.h(cVar, "bindModel");
        jo.p.h(aVar, "onClickAgree");
        jo.p.h(aVar2, "onClickDisagree");
        i h10 = iVar.h(935018731);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(aVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.P(aVar2) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 731) == 146 && h10.j()) {
            h10.I();
            iVar2 = h10;
        } else {
            a.C0986a c0986a = x0.a.f59327a;
            x0.a e10 = c0986a.e();
            f.a aVar3 = x0.f.f59359u;
            float f10 = 12;
            x0.f d10 = v.e.d(z0.d.a(d1.y(d1.E(aVar3, null, false, 3, null), m2.g.l(280)), e0.g.c(m2.g.l(f10))), v1.b.a(nc.b.F, h10, 0), null, 2, null);
            h10.x(733328855);
            c0 h11 = j.h(e10, false, h10, 6);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a11 = w.a(d10);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a10);
            } else {
                h10.o();
            }
            h10.E();
            i a12 = h2.a(h10);
            h2.b(a12, h11, c0787a.d());
            h2.b(a12, dVar, c0787a.b());
            h2.b(a12, qVar, c0787a.c());
            h2.b(a12, g2Var, c0787a.f());
            h10.c();
            a11.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            l lVar = l.f60836a;
            a.b g10 = c0986a.g();
            x0.f k10 = r0.k(d1.C(aVar3, null, false, 3, null), 0.0f, m2.g.l(32), 1, null);
            h10.x(-483455358);
            c0 a13 = y.p.a(y.f.f60773a.g(), g10, h10, 48);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(o0.e());
            m2.q qVar2 = (m2.q) h10.G(o0.j());
            g2 g2Var2 = (g2) h10.G(o0.n());
            io.a<s1.a> a14 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a15 = w.a(k10);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a14);
            } else {
                h10.o();
            }
            h10.E();
            i a16 = h2.a(h10);
            h2.b(a16, a13, c0787a.d());
            h2.b(a16, dVar2, c0787a.b());
            h2.b(a16, qVar2, c0787a.c());
            h2.b(a16, g2Var2, c0787a.f());
            h10.c();
            a15.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            r rVar = r.f60913a;
            String b10 = v1.f.b(nc.i.text_chat_confirmation_agreement_title, h10, 0);
            o9.b bVar = o9.b.f44283a;
            d0 y10 = bVar.b().y();
            int i13 = nc.b.f41794e;
            w1.c(b10, null, v1.b.a(i13, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, y10, h10, 0, 0, 32762);
            g1.a(d1.o(aVar3, m2.g.l(16)), h10, 6);
            String b11 = v1.f.b(nc.i.text_chat_confirmation_agreement_notice, h10, 0);
            d0 d11 = bVar.b().d();
            long a17 = v1.b.a(i13, h10, 0);
            float f11 = 20;
            w1.c(b11, r0.k(aVar3, m2.g.l(f11), 0.0f, 2, null), a17, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, d11, h10, 48, 0, 32760);
            g1.a(d1.o(aVar3, m2.g.l(f11)), h10, 6);
            float f12 = 200;
            float f13 = 40;
            x0.f v10 = d1.v(aVar3, m2.g.l(f12), m2.g.l(f13));
            h hVar = h.f58646a;
            iVar2 = h10;
            k9.c.a(aVar, v10, null, 0.0f, false, null, null, hVar.a(), h10, ((i12 >> 3) & 14) | 12582960, 124);
            g1.a(d1.o(aVar3, m2.g.l(f10)), iVar2, 6);
            k9.c.a(aVar2, d1.v(aVar3, m2.g.l(f12), m2.g.l(f13)), new k9.a(bVar.a().B(), bVar.a().q(), bVar.a().q(), 0L, 0L, 0L, 56, null), m2.g.l(1), false, null, null, hVar.b(), iVar2, 12586032 | ((i12 >> 6) & 14) | (k9.a.C << 6), 112);
            iVar2.O();
            iVar2.O();
            iVar2.s();
            iVar2.O();
            iVar2.O();
            if (jo.p.c(cVar.b(), a.b.f34695b)) {
                x0.a e11 = c0986a.e();
                x0.f e12 = v.l.e(v.e.d(lVar.c(aVar3), v1.b.a(nc.b.H, iVar2, 0), null, 2, null), false, null, null, a.f58640w, 6, null);
                iVar2.x(733328855);
                c0 h12 = j.h(e11, false, iVar2, 6);
                iVar2.x(-1323940314);
                m2.d dVar3 = (m2.d) iVar2.G(o0.e());
                m2.q qVar3 = (m2.q) iVar2.G(o0.j());
                g2 g2Var3 = (g2) iVar2.G(o0.n());
                io.a<s1.a> a18 = c0787a.a();
                io.q<n1<s1.a>, i, Integer, v> a19 = w.a(e12);
                if (!(iVar2.k() instanceof l0.e)) {
                    l0.h.c();
                }
                iVar2.D();
                if (iVar2.f()) {
                    iVar2.r(a18);
                } else {
                    iVar2.o();
                }
                iVar2.E();
                i a20 = h2.a(iVar2);
                h2.b(a20, h12, c0787a.d());
                h2.b(a20, dVar3, c0787a.b());
                h2.b(a20, qVar3, c0787a.c());
                h2.b(a20, g2Var3, c0787a.f());
                iVar2.c();
                a19.s0(n1.a(n1.b(iVar2)), iVar2, 0);
                iVar2.x(2058660585);
                iVar2.x(-2137368960);
                l9.e.b(cVar.b(), "", b.f58641w, iVar2, ha.a.f34693a | 432);
                iVar2.O();
                iVar2.O();
                iVar2.s();
                iVar2.O();
                iVar2.O();
            }
            iVar2.O();
            iVar2.O();
            iVar2.s();
            iVar2.O();
            iVar2.O();
        }
        l1 l10 = iVar2.l();
        if (l10 == null) {
            return;
        }
        l10.a(new c(cVar, aVar, aVar2, i10));
    }
}
