package yc;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import h0.w1;
import ha.a;
import io.l;
import io.r;
import java.util.List;
import jo.p;
import jo.q;
import l0.h2;
import l0.l1;
import l0.n1;
import q1.w;
import s1.a;
import wn.v;
import x0.a;
import x0.f;
import y.d1;
import y.g1;
import y.j;
import y.r0;
import y1.d0;
import z.c0;

/* loaded from: classes2.dex */
public final class h {

    /* loaded from: classes2.dex */
    public static final class a extends q implements l<c0, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ yc.d f61679w;

        /* renamed from: yc.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C1058a extends q implements l<Integer, Object> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List f61680w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1058a(List list) {
                super(1);
                this.f61680w = list;
            }

            public final Object a(int i10) {
                this.f61680w.get(i10);
                return null;
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends q implements r<z.h, Integer, l0.i, Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List f61681w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ yc.d f61682x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List list, yc.d dVar) {
                super(4);
                this.f61681w = list;
                this.f61682x = dVar;
            }

            @Override // io.r
            public /* bridge */ /* synthetic */ v F(z.h hVar, Integer num, l0.i iVar, Integer num2) {
                a(hVar, num.intValue(), iVar, num2.intValue());
                return v.f59242a;
            }

            public final void a(z.h hVar, int i10, l0.i iVar, int i11) {
                int i12;
                int i13;
                long a10;
                p.h(hVar, "$this$items");
                if ((i11 & 14) == 0) {
                    i12 = i11 | (iVar.P(hVar) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i11 & 112) == 0) {
                    i12 |= iVar.d(i10) ? 32 : 16;
                }
                if ((i12 & 731) == 146 && iVar.j()) {
                    iVar.I();
                    return;
                }
                int i14 = (i12 & 112) | (i12 & 14);
                String str = (String) this.f61681w.get(i10);
                if ((i14 & 112) == 0) {
                    i13 = (iVar.d(i10) ? 32 : 16) | i14;
                } else {
                    i13 = i14;
                }
                if ((i14 & 896) == 0) {
                    i13 |= iVar.P(str) ? 256 : 128;
                }
                int i15 = i13;
                if ((i15 & 5841) == 1168 && iVar.j()) {
                    iVar.I();
                    return;
                }
                d0 w10 = o9.b.f44283a.b().w();
                if (this.f61682x.e() == i10) {
                    iVar.x(781061461);
                    a10 = v1.b.a(nc.b.f41804x, iVar, 0);
                    iVar.O();
                } else {
                    iVar.x(781061525);
                    a10 = v1.b.a(nc.b.f41800t, iVar, 0);
                    iVar.O();
                }
                w1.c(str, d1.C(d1.o(x0.f.f59359u, m2.g.l(40)), null, false, 3, null), a10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, w10, iVar, ((i15 >> 6) & 14) | 48, 0, 32760);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yc.d dVar) {
            super(1);
            this.f61679w = dVar;
        }

        public final void a(c0 c0Var) {
            p.h(c0Var, "$this$SnapHelpedLazyColumn");
            i iVar = i.f61689a;
            c0.e(c0Var, 2, null, null, iVar.a(), 6, null);
            List<String> c10 = this.f61679w.c();
            c0Var.c(c10.size(), null, new C1058a(c10), s0.c.c(-1091073711, true, new b(c10, this.f61679w)));
            c0.e(c0Var, 2, null, null, iVar.b(), 6, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c0 c0Var) {
            a(c0Var);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f61683w = new b();

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
    public static final class c extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f61684w = new c();

        public c() {
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
    public static final class d extends q implements io.p<l0.i, Integer, v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ yc.d f61685w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l<Integer, v> f61686x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f61687y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f61688z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(yc.d dVar, l<? super Integer, v> lVar, io.a<v> aVar, io.a<v> aVar2, int i10) {
            super(2);
            this.f61685w = dVar;
            this.f61686x = lVar;
            this.f61687y = aVar;
            this.f61688z = aVar2;
            this.A = i10;
        }

        public final void a(l0.i iVar, int i10) {
            h.a(this.f61685w, this.f61686x, this.f61687y, this.f61688z, iVar, this.A | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(yc.d dVar, l<? super Integer, v> lVar, io.a<v> aVar, io.a<v> aVar2, l0.i iVar, int i10) {
        p.h(dVar, "bindModel");
        p.h(lVar, "onGenerationChange");
        p.h(aVar, "onClickRegister");
        p.h(aVar2, "onClickCancel");
        l0.i h10 = iVar.h(709668512);
        float f10 = 40;
        int X = ((m2.d) h10.G(o0.e())).X(m2.g.l(f10));
        f.a aVar3 = x0.f.f59359u;
        float f11 = 12;
        x0.f d10 = v.e.d(z0.d.a(d1.y(d1.E(aVar3, null, false, 3, null), m2.g.l(280)), e0.g.c(m2.g.l(f11))), v1.b.a(nc.b.F, h10, 0), null, 2, null);
        h10.x(733328855);
        a.C0986a c0986a = x0.a.f59327a;
        q1.c0 h11 = j.h(c0986a.o(), false, h10, 0);
        h10.x(-1323940314);
        m2.d dVar2 = (m2.d) h10.G(o0.e());
        m2.q qVar = (m2.q) h10.G(o0.j());
        g2 g2Var = (g2) h10.G(o0.n());
        a.C0787a c0787a = s1.a.f51802o;
        io.a<s1.a> a10 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, v> a11 = w.a(d10);
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
        h2.b(a12, dVar2, c0787a.b());
        h2.b(a12, qVar, c0787a.c());
        h2.b(a12, g2Var, c0787a.f());
        h10.c();
        a11.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-2137368960);
        y.l lVar2 = y.l.f60836a;
        a.b g10 = c0986a.g();
        x0.f k10 = r0.k(d1.E(aVar3, null, false, 3, null), 0.0f, m2.g.l(32), 1, null);
        h10.x(-483455358);
        q1.c0 a13 = y.p.a(y.f.f60773a.g(), g10, h10, 48);
        h10.x(-1323940314);
        m2.d dVar3 = (m2.d) h10.G(o0.e());
        m2.q qVar2 = (m2.q) h10.G(o0.j());
        g2 g2Var2 = (g2) h10.G(o0.n());
        io.a<s1.a> a14 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, v> a15 = w.a(k10);
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
        l0.i a16 = h2.a(h10);
        h2.b(a16, a13, c0787a.d());
        h2.b(a16, dVar3, c0787a.b());
        h2.b(a16, qVar2, c0787a.c());
        h2.b(a16, g2Var2, c0787a.f());
        h10.c();
        a15.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-1163856341);
        y.r rVar = y.r.f60913a;
        String b10 = v1.f.b(nc.i.text_chat_confirmation_generation_picker_title, h10, 0);
        o9.b bVar = o9.b.f44283a;
        w1.c(b10, null, v1.b.a(nc.b.f41794e, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().y(), h10, 0, 0, 32762);
        float f12 = 16;
        g1.a(d1.o(aVar3, m2.g.l(f12)), h10, 6);
        h10.x(733328855);
        q1.c0 h12 = j.h(c0986a.o(), false, h10, 0);
        h10.x(-1323940314);
        m2.d dVar4 = (m2.d) h10.G(o0.e());
        m2.q qVar3 = (m2.q) h10.G(o0.j());
        g2 g2Var3 = (g2) h10.G(o0.n());
        io.a<s1.a> a17 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, v> a18 = w.a(aVar3);
        if (!(h10.k() instanceof l0.e)) {
            l0.h.c();
        }
        h10.D();
        if (h10.f()) {
            h10.r(a17);
        } else {
            h10.o();
        }
        h10.E();
        l0.i a19 = h2.a(h10);
        h2.b(a19, h12, c0787a.d());
        h2.b(a19, dVar4, c0787a.b());
        h2.b(a19, qVar3, c0787a.c());
        h2.b(a19, g2Var3, c0787a.f());
        h10.c();
        a18.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-2137368960);
        int i11 = nc.b.f41797o;
        h0.w.a(r0.m(aVar3, 0.0f, m2.g.l(80), 0.0f, 0.0f, 13, null), v1.b.a(i11, h10, 0), 0.0f, 0.0f, h10, 6, 12);
        h0.w.a(r0.m(aVar3, 0.0f, m2.g.l(120), 0.0f, 0.0f, 13, null), v1.b.a(i11, h10, 0), 0.0f, 0.0f, h10, 6, 12);
        vc.a.a(X, d1.o(d1.n(aVar3, 0.0f, 1, null), m2.g.l(200)), dVar.e(), lVar, new a(dVar), h10, ((i10 << 6) & 7168) | 48, 0);
        x0.f n10 = d1.n(d1.o(aVar3, m2.g.l(f10)), 0.0f, 1, null);
        int i12 = nc.b.H;
        j.a(v.e.d(n10, v1.b.a(i12, h10, 0), null, 2, null), h10, 0);
        j.a(v.e.d(d1.n(d1.o(r0.m(aVar3, 0.0f, m2.g.l(160), 0.0f, 0.0f, 13, null), m2.g.l(f10)), 0.0f, 1, null), v1.b.a(i12, h10, 0), null, 2, null), h10, 0);
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        g1.a(d1.o(aVar3, m2.g.l(f12)), h10, 6);
        float f13 = 20;
        w1.c(v1.f.b(nc.i.text_chat_confirmation_warning_notice, h10, 0), r0.k(aVar3, m2.g.l(f13), 0.0f, 2, null), v1.b.a(nc.b.f41798r, h10, 0), 0L, null, null, null, 0L, null, j2.e.g(j2.e.f37075b.a()), 0L, 0, false, 0, null, bVar.b().j(), h10, 48, 0, 32248);
        g1.a(d1.o(aVar3, m2.g.l(f13)), h10, 6);
        boolean d11 = dVar.d();
        float f14 = 200;
        x0.f v10 = d1.v(aVar3, m2.g.l(f14), m2.g.l(f10));
        i iVar2 = i.f61689a;
        k9.c.a(aVar, v10, null, 0.0f, d11, null, null, iVar2.c(), h10, ((i10 >> 6) & 14) | 12582960, 108);
        g1.a(d1.o(aVar3, m2.g.l(f11)), h10, 6);
        k9.c.a(aVar2, d1.v(aVar3, m2.g.l(f14), m2.g.l(f10)), new k9.a(bVar.a().B(), bVar.a().q(), bVar.a().q(), 0L, 0L, 0L, 56, null), m2.g.l(1), false, null, null, iVar2.d(), h10, 12586032 | ((i10 >> 9) & 14) | (k9.a.C << 6), 112);
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        if (p.c(dVar.f(), a.b.f34695b)) {
            x0.a e10 = c0986a.e();
            x0.f e11 = v.l.e(v.e.d(lVar2.c(aVar3), v1.b.a(i12, h10, 0), null, 2, null), false, null, null, b.f61683w, 6, null);
            h10.x(733328855);
            q1.c0 h13 = j.h(e10, false, h10, 6);
            h10.x(-1323940314);
            m2.d dVar5 = (m2.d) h10.G(o0.e());
            m2.q qVar4 = (m2.q) h10.G(o0.j());
            g2 g2Var4 = (g2) h10.G(o0.n());
            io.a<s1.a> a20 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a21 = w.a(e11);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a20);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a22 = h2.a(h10);
            h2.b(a22, h13, c0787a.d());
            h2.b(a22, dVar5, c0787a.b());
            h2.b(a22, qVar4, c0787a.c());
            h2.b(a22, g2Var4, c0787a.f());
            h10.c();
            a21.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            l9.e.b(dVar.f(), "", c.f61684w, h10, ha.a.f34693a | 432);
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
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new d(dVar, lVar, aVar, aVar2, i10));
    }
}
