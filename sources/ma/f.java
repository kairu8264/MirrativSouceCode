package ma;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import h0.w1;
import io.l;
import io.p;
import ja.n;
import jo.q;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import q1.c0;
import q1.w;
import s1.a;
import wn.v;
import x.m;
import x0.a;
import x0.f;
import y.d1;
import y.r;
import y.r0;

/* loaded from: classes.dex */
public final class f {

    /* loaded from: classes.dex */
    public static final class a extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l<String, v> f40657w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ e f40658x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super String, v> lVar, e eVar) {
            super(0);
            this.f40657w = lVar;
            this.f40658x = eVar;
        }

        public final void a() {
            this.f40657w.invoke(this.f40658x.a());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e f40659w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f40660x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l<String, v> f40661y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f40662z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(e eVar, io.a<v> aVar, l<? super String, v> lVar, int i10) {
            super(2);
            this.f40659w = eVar;
            this.f40660x = aVar;
            this.f40661y = lVar;
            this.f40662z = i10;
        }

        public final void a(l0.i iVar, int i10) {
            f.a(this.f40659w, this.f40660x, this.f40661y, iVar, this.f40662z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(e eVar, io.a<v> aVar, l<? super String, v> lVar, l0.i iVar, int i10) {
        int i11;
        jo.p.h(eVar, "bindModel");
        jo.p.h(aVar, "onClickClose");
        jo.p.h(lVar, "onClickLink");
        l0.i h10 = iVar.h(-1046632917);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.P(lVar) ? 256 : 128;
        }
        if ((i11 & 651) == 130 && h10.j()) {
            h10.I();
        } else {
            f.a aVar2 = x0.f.f59359u;
            x0.f n10 = d1.n(aVar2, 0.0f, 1, null);
            a.C0986a c0986a = x0.a.f59327a;
            a.b g10 = c0986a.g();
            h10.x(-483455358);
            c0 a10 = y.p.a(y.f.f60773a.g(), g10, h10, 48);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a12 = w.a(n10);
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
            r rVar = r.f60913a;
            float f10 = 24;
            float f11 = 32;
            x0.f m10 = r0.m(aVar2, m2.g.l(f10), m2.g.l(f11), m2.g.l(f10), 0.0f, 8, null);
            String c10 = eVar.c();
            int a14 = j2.e.f37075b.a();
            int i12 = ja.j.f37414h;
            long a15 = v1.b.a(i12, h10, 0);
            o9.b bVar = o9.b.f44283a;
            w1.c(c10, m10, a15, 0L, null, null, null, 0L, null, j2.e.g(a14), 0L, 0, false, 0, null, bVar.b().f(), h10, 0, 0, 32248);
            w1.c(v1.f.b(n.text_exclusive_gift, h10, 0), r0.m(aVar2, 0.0f, m2.g.l(2), 0.0f, 0.0f, 13, null), v1.b.a(i12, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().x(), h10, 48, 0, 32760);
            if (eVar.b()) {
                x0.f c11 = v.e.c(v.g.g(d1.o(d1.y(r0.m(aVar2, 0.0f, m2.g.l(16), 0.0f, 0.0f, 13, null), m2.g.l(176)), m2.g.l(f11)), m2.g.l(1), v1.b.a(ja.j.f37417m, h10, 0), e0.g.c(m2.g.l(f10))), v1.b.a(ja.j.f37423v, h10, 0), e0.g.c(m2.g.l(f10)));
                h10.x(-492369756);
                Object y10 = h10.y();
                i.a aVar3 = l0.i.f39065a;
                if (y10 == aVar3.a()) {
                    y10 = x.l.a();
                    h10.q(y10);
                }
                h10.O();
                m mVar = (m) y10;
                h10.x(511388516);
                boolean P = h10.P(lVar) | h10.P(eVar);
                Object y11 = h10.y();
                if (P || y11 == aVar3.a()) {
                    y11 = new a(lVar, eVar);
                    h10.q(y11);
                }
                h10.O();
                x0.f c12 = v.l.c(c11, mVar, null, false, null, null, (io.a) y11, 28, null);
                x0.a e10 = c0986a.e();
                h10.x(733328855);
                c0 h11 = y.j.h(e10, false, h10, 6);
                h10.x(-1323940314);
                m2.d dVar2 = (m2.d) h10.G(o0.e());
                m2.q qVar2 = (m2.q) h10.G(o0.j());
                g2 g2Var2 = (g2) h10.G(o0.n());
                io.a<s1.a> a16 = c0787a.a();
                io.q<n1<s1.a>, l0.i, Integer, v> a17 = w.a(c12);
                if (!(h10.k() instanceof l0.e)) {
                    l0.h.c();
                }
                h10.D();
                if (h10.f()) {
                    h10.r(a16);
                } else {
                    h10.o();
                }
                h10.E();
                l0.i a18 = h2.a(h10);
                h2.b(a18, h11, c0787a.d());
                h2.b(a18, dVar2, c0787a.b());
                h2.b(a18, qVar2, c0787a.c());
                h2.b(a18, g2Var2, c0787a.f());
                h10.c();
                a17.s0(n1.a(n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-2137368960);
                y.l lVar2 = y.l.f60836a;
                w1.c(v1.f.b(n.text_gacha_item_offer_ratio, h10, 0), null, v1.b.a(ja.j.f37420r, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().g(), h10, 0, 0, 32762);
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
            }
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
        l10.a(new b(eVar, aVar, lVar, i10));
    }
}
