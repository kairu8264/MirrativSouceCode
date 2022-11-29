package hd;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import c1.f1;
import com.google.android.exoplayer2.C;
import d2.u;
import d2.x;
import h0.w1;
import jo.q;
import l0.h2;
import l0.l1;
import l0.n1;
import m2.s;
import q1.c0;
import q1.w;
import s1.a;
import wn.v;
import x0.a;
import x0.f;
import y.d1;
import y.g1;
import y.r;
import y.r0;
import y1.a;
import y1.d0;

/* loaded from: classes2.dex */
public final class n {

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f35449w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<v> aVar) {
            super(0);
            this.f35449w = aVar;
        }

        public final void a() {
            this.f35449w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f35450w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f35451x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<v> aVar, int i10) {
            super(2);
            this.f35450w = aVar;
            this.f35451x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            n.a(this.f35450w, iVar, this.f35451x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(io.a<v> aVar, l0.i iVar, int i10) {
        int i11;
        jo.p.h(aVar, "onClickOk");
        l0.i h10 = iVar.h(78878630);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            f.a aVar2 = x0.f.f59359u;
            x0.f j10 = d1.j(d1.n(aVar2, 0.0f, 1, null), 0.0f, 1, null);
            h10.x(733328855);
            a.C0986a c0986a = x0.a.f59327a;
            c0 h11 = y.j.h(c0986a.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a11 = w.a(j10);
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
            l0.i a12 = h2.a(h10);
            h2.b(a12, h11, c0787a.d());
            h2.b(a12, dVar, c0787a.b());
            h2.b(a12, qVar, c0787a.c());
            h2.b(a12, g2Var, c0787a.f());
            h10.c();
            a11.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            x0.f a13 = y.l.f60836a.a(d1.C(d1.y(v.e.d(z0.d.a(aVar2, e0.g.c(m2.g.l(10))), v1.b.a(nc.b.F, h10, 0), null, 2, null), m2.g.l(280)), null, false, 3, null), c0986a.e());
            h10.x(-483455358);
            c0 a14 = y.p.a(y.f.f60773a.g(), c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(o0.e());
            m2.q qVar2 = (m2.q) h10.G(o0.j());
            g2 g2Var2 = (g2) h10.G(o0.n());
            io.a<s1.a> a15 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a16 = w.a(a13);
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
            float f10 = 20;
            g1.a(d1.o(aVar2, m2.g.l(f10)), h10, 6);
            String b10 = v1.f.b(nc.i.text_about_withholding_tax_title, h10, 0);
            d0 b11 = o9.b.f44283a.b().b();
            int i12 = nc.b.f41794e;
            w1.c(b10, rVar.b(aVar2, c0986a.g()), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, b11.C(new d0(v1.b.a(i12, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, 0, 0, 32764);
            g1.a(d1.o(aVar2, m2.g.l(8)), h10, 6);
            h10.x(-1987442211);
            a.C1037a c1037a = new a.C1037a(0, 1, null);
            String b12 = v1.f.b(nc.i.text_about_withholding_tax_body, h10, 0);
            String b13 = v1.f.b(nc.i.text_about_withholding_tax_body_highlight_1, h10, 0);
            String b14 = v1.f.b(nc.i.text_about_withholding_tax_body_highlight_2, h10, 0);
            int g10 = c1037a.g(new y1.v(v1.b.a(i12, h10, 0), s.d(11), (x) null, (u) null, (d2.v) null, (d2.l) null, (String) null, 0L, (j2.a) null, (j2.i) null, (f2.f) null, 0L, (j2.f) null, (f1) null, 16380, (jo.h) null));
            try {
                c1037a.c(b12);
                v vVar = v.f59242a;
                c1037a.f(g10);
                x.a aVar3 = x.f29149x;
                c1037a.b(new y1.v(0L, 0L, aVar3.a(), (u) null, (d2.v) null, (d2.l) null, (String) null, 0L, (j2.a) null, (j2.i) null, (f2.f) null, 0L, (j2.f) null, (f1) null, 16379, (jo.h) null), so.o.U(b12, b13, 0, false, 6, null), so.o.U(b12, b13, 0, false, 6, null) + b13.length());
                c1037a.b(new y1.v(0L, 0L, aVar3.a(), (u) null, (d2.v) null, (d2.l) null, (String) null, 0L, (j2.a) null, (j2.i) null, (f2.f) null, 0L, (j2.f) null, (f1) null, 16379, (jo.h) null), so.o.U(b12, b14, 0, false, 6, null), so.o.U(b12, b14, 0, false, 6, null) + b13.length());
                y1.a h12 = c1037a.h();
                h10.O();
                w1.b(h12, r0.k(aVar2, m2.g.l(f10), 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, null, h10, 48, 0, 131068);
                g1.a(d1.o(aVar2, m2.g.l(f10)), h10, 6);
                h0.c a18 = h0.d.f33749a.a(v1.b.a(nc.b.f41804x, h10, 0), 0L, 0L, 0L, h10, 32768, 14);
                e0.f c10 = e0.g.c(m2.g.l(f10));
                x0.f b15 = rVar.b(d1.o(d1.y(aVar2, m2.g.l(200)), m2.g.l(40)), c0986a.g());
                h10.x(1157296644);
                boolean P = h10.P(aVar);
                Object y10 = h10.y();
                if (P || y10 == l0.i.f39065a.a()) {
                    y10 = new a(aVar);
                    h10.q(y10);
                }
                h10.O();
                h0.f.a((io.a) y10, b15, false, null, null, c10, null, a18, null, d.f35359a.a(), h10, C.ENCODING_PCM_32BIT, 348);
                g1.a(d1.o(aVar2, m2.g.l(f10)), h10, 6);
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
            } catch (Throwable th2) {
                c1037a.f(g10);
                throw th2;
            }
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(aVar, i10));
    }
}
