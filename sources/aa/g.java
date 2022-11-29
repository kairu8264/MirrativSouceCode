package aa;

import androidx.compose.ui.platform.b1;
import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import io.l;
import io.r;
import java.util.List;
import jo.p;
import jo.q;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import l0.s0;
import l0.z1;
import m2.o;
import q1.c0;
import q1.n0;
import q1.w;
import s1.a;
import wn.v;
import x0.a;
import x0.f;
import y.d1;
import y.f;
import y.r0;

/* loaded from: classes.dex */
public final class g {

    /* loaded from: classes.dex */
    public static final class a extends q implements l<o, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ s0<m2.g> f685w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s0<m2.g> s0Var) {
            super(1);
            this.f685w = s0Var;
        }

        public final void a(long j10) {
            g.c(this.f685w, m2.g.l(o.g(j10)));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(o oVar) {
            a(oVar.j());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements r<uf.d, Integer, l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List<e> f686w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ float f687x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends e> list, float f10) {
            super(4);
            this.f686w = list;
            this.f687x = f10;
        }

        @Override // io.r
        public /* bridge */ /* synthetic */ v F(uf.d dVar, Integer num, l0.i iVar, Integer num2) {
            a(dVar, num.intValue(), iVar, num2.intValue());
            return v.f59242a;
        }

        public final void a(uf.d dVar, int i10, l0.i iVar, int i11) {
            p.h(dVar, "$this$HorizontalPager");
            if ((i11 & 112) == 0) {
                i11 |= iVar.d(i10) ? 32 : 16;
            }
            if ((i11 & 721) == 144 && iVar.j()) {
                iVar.I();
                return;
            }
            e eVar = this.f686w.get(i10);
            if (eVar instanceof aa.b) {
                iVar.x(-1315676327);
                aa.c.c(d1.y(x0.f.f59359u, this.f687x), (aa.b) eVar, iVar, 70, 0);
                iVar.O();
            } else if (eVar instanceof d) {
                iVar.x(-1315676073);
                i.a(d1.y(x0.f.f59359u, this.f687x), (d) eVar, iVar, 6, 0);
                iVar.O();
            } else {
                iVar.x(-1315675871);
                iVar.O();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List<e> f688w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f689x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f690y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f691z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends e> list, int i10, io.a<v> aVar, int i11) {
            super(2);
            this.f688w = list;
            this.f689x = i10;
            this.f690y = aVar;
            this.f691z = i11;
        }

        public final void a(l0.i iVar, int i10) {
            g.a(this.f688w, this.f689x, this.f690y, iVar, this.f691z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(List<? extends e> list, int i10, io.a<v> aVar, l0.i iVar, int i11) {
        Object obj;
        float l10;
        p.h(list, "listItems");
        p.h(aVar, "onClickClose");
        l0.i h10 = iVar.h(1646906575);
        uf.f a10 = uf.g.a(i10, h10, (i11 >> 3) & 14, 0);
        f.a aVar2 = x0.f.f59359u;
        x0.f n10 = d1.n(aVar2, 0.0f, 1, null);
        f.e b10 = y.f.f60773a.b();
        h10.x(-483455358);
        a.C0986a c0986a = x0.a.f59327a;
        c0 a11 = y.p.a(b10, c0986a.k(), h10, 6);
        h10.x(-1323940314);
        m2.d dVar = (m2.d) h10.G(o0.e());
        m2.q qVar = (m2.q) h10.G(o0.j());
        g2 g2Var = (g2) h10.G(o0.n());
        a.C0787a c0787a = s1.a.f51802o;
        io.a<s1.a> a12 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, v> a13 = w.a(n10);
        if (!(h10.k() instanceof l0.e)) {
            l0.h.c();
        }
        h10.D();
        if (h10.f()) {
            h10.r(a12);
        } else {
            h10.o();
        }
        h10.E();
        l0.i a14 = h2.a(h10);
        h2.b(a14, a11, c0787a.d());
        h2.b(a14, dVar, c0787a.b());
        h2.b(a14, qVar, c0787a.c());
        h2.b(a14, g2Var, c0787a.f());
        h10.c();
        a13.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-1163856341);
        h0.o0.a(aVar, r0.m(y.r.f60913a.b(aVar2, c0986a.j()), 0.0f, 0.0f, m2.g.l(40), 0.0f, 11, null), false, null, aa.a.f661a.a(), h10, ((i11 >> 6) & 14) | 24576, 12);
        h10.x(-492369756);
        Object y10 = h10.y();
        i.a aVar3 = l0.i.f39065a;
        if (y10 == aVar3.a()) {
            obj = null;
            y10 = z1.e(m2.g.e(m2.g.l(0)), null, 2, null);
            h10.q(y10);
        } else {
            obj = null;
        }
        h10.O();
        s0 s0Var = (s0) y10;
        float l11 = m2.g.l(280);
        h10.x(58751616);
        if (((Boolean) h10.G(b1.a())).booleanValue()) {
            l10 = m2.g.l(48);
        } else {
            l10 = m2.g.l(Math.max(m2.g.l(m2.g.l(m2.g.l(b(s0Var) / ((m2.d) h10.G(o0.e())).getDensity()) - l11) / 2), m2.g.l(0)));
        }
        h10.O();
        x0.f n11 = d1.n(aVar2, 0.0f, 1, obj);
        h10.x(1157296644);
        boolean P = h10.P(s0Var);
        Object y11 = h10.y();
        if (P || y11 == aVar3.a()) {
            y11 = new a(s0Var);
            h10.q(y11);
        }
        h10.O();
        x0.f a15 = n0.a(n11, (l) y11);
        uf.b.a(list.size(), a15, a10, false, m2.g.l(30), r0.c(l10, 0.0f, 2, obj), c0986a.l(), null, null, false, s0.c.b(h10, 670570378, true, new b(list, l11)), h10, 1597440, 6, 904);
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        l1 l12 = h10.l();
        if (l12 == null) {
            return;
        }
        l12.a(new c(list, i10, aVar, i11));
    }

    public static final float b(s0<m2.g> s0Var) {
        return s0Var.getValue().q();
    }

    public static final void c(s0<m2.g> s0Var, float f10) {
        s0Var.setValue(m2.g.e(f10));
    }
}
