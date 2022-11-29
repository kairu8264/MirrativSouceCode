package ad;

import l0.i;
import s1.a;
import x0.a;
import x0.f;
import y.f;

/* loaded from: classes2.dex */
public final class w2 {

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ v2 f1400w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v2 v2Var) {
            super(0);
            this.f1400w = v2Var;
        }

        public final void a() {
            this.f1400w.a();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ v2 f1401w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v2 v2Var) {
            super(0);
            this.f1401w = v2Var;
        }

        public final void a() {
            this.f1401w.b();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ v2 f1402w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v2 v2Var) {
            super(0);
            this.f1402w = v2Var;
        }

        public final void a() {
            this.f1402w.d();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ v2 f1403w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v2 v2Var) {
            super(0);
            this.f1403w = v2Var;
        }

        public final void a() {
            this.f1403w.c();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ v2 f1404w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(v2 v2Var) {
            super(0);
            this.f1404w = v2Var;
        }

        public final void a() {
            this.f1404w.d();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ r2 f1405w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ v2 f1406x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f1407y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r2 r2Var, v2 v2Var, int i10) {
            super(2);
            this.f1405w = r2Var;
            this.f1406x = v2Var;
            this.f1407y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            w2.a(this.f1405w, this.f1406x, iVar, this.f1407y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(r2 r2Var, v2 v2Var, l0.i iVar, int i10) {
        int i11;
        y.a1 a1Var;
        f.a aVar;
        f.a aVar2;
        y.a1 a1Var2;
        char c10;
        jo.p.h(r2Var, "bindModel");
        jo.p.h(v2Var, "uiEvent");
        l0.i h10 = iVar.h(672676021);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(r2Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(v2Var) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            f.a aVar3 = x0.f.f59359u;
            x0.f j10 = y.d1.j(y.d1.n(aVar3, 0.0f, 1, null), 0.0f, 1, null);
            h10.x(-483455358);
            y.f fVar = y.f.f60773a;
            f.l g10 = fVar.g();
            a.C0986a c0986a = x0.a.f59327a;
            q1.c0 a10 = y.p.a(g10, c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            androidx.compose.ui.platform.g2 g2Var = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(j10);
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
            l0.i a13 = l0.h2.a(h10);
            l0.h2.b(a13, a10, c0787a.d());
            l0.h2.b(a13, dVar, c0787a.b());
            l0.h2.b(a13, qVar, c0787a.c());
            l0.h2.b(a13, g2Var, c0787a.f());
            h10.c();
            a12.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            y.r rVar = y.r.f60913a;
            l9.f.a(v1.f.b(nc.i.text_select_payment_type_page_title, h10, 0), false, new a(v2Var), null, h10, 0, 10);
            x0.f j11 = y.d1.j(y.d1.n(aVar3, 0.0f, 1, null), 0.0f, 1, null);
            o9.b bVar = o9.b.f44283a;
            x0.f d10 = v.e.d(j11, bVar.a().b(), null, 2, null);
            h10.x(-483455358);
            q1.c0 a14 = y.p.a(fVar.g(), c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar2 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            androidx.compose.ui.platform.g2 g2Var2 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
            io.a<s1.a> a15 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a16 = q1.w.a(d10);
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
            l0.i a17 = l0.h2.a(h10);
            l0.h2.b(a17, a14, c0787a.d());
            l0.h2.b(a17, dVar2, c0787a.b());
            l0.h2.b(a17, qVar2, c0787a.c());
            l0.h2.b(a17, g2Var2, c0787a.f());
            h10.c();
            a16.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            float f10 = 20;
            y.g1.a(y.d1.o(aVar3, m2.g.l(f10)), h10, 6);
            float f11 = 15;
            x0.f k10 = y.r0.k(aVar3, m2.g.l(f11), 0.0f, 2, null);
            h10.x(693286680);
            q1.c0 a18 = y.y0.a(fVar.f(), c0986a.l(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar3 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar3 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            androidx.compose.ui.platform.g2 g2Var3 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
            io.a<s1.a> a19 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a20 = q1.w.a(k10);
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
            l0.i a21 = l0.h2.a(h10);
            l0.h2.b(a21, a18, c0787a.d());
            l0.h2.b(a21, dVar3, c0787a.b());
            l0.h2.b(a21, qVar3, c0787a.c());
            l0.h2.b(a21, g2Var3, c0787a.f());
            h10.c();
            a20.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-678309503);
            y.a1 a1Var3 = y.a1.f60672a;
            h0.w.a(v.e.d(y.d1.o(y.d1.y(aVar3, m2.g.l(4)), m2.g.l(f10)), bVar.a().w(), null, 2, null), 0L, 0.0f, 0.0f, h10, 0, 14);
            y.g1.a(y.d1.y(aVar3, m2.g.l(10)), h10, 6);
            h0.w1.c(v1.f.b(nc.i.text_select_payment_type_title, h10, 0), null, bVar.a().z(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().y(), h10, 0, 0, 32762);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            float f12 = 12;
            y.g1.a(y.d1.o(aVar3, m2.g.l(f12)), h10, 6);
            h0.w1.c(v1.f.b(nc.i.text_select_payment_type_body, h10, 0), y.r0.k(aVar3, m2.g.l(f11), 0.0f, 2, null), bVar.a().x(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().d(), h10, 48, 0, 32760);
            y.g1.a(y.d1.o(aVar3, m2.g.l(f10)), h10, 6);
            x0.f d11 = v.e.d(aVar3, bVar.a().d(), null, 2, null);
            float f13 = (float) 0.5d;
            h0.w.a(y.d1.o(d11, m2.g.l(f13)), 0L, 0.0f, 0.0f, h10, 0, 14);
            x0.f d12 = v.e.d(y.d1.n(aVar3, 0.0f, 1, null), bVar.a().B(), null, 2, null);
            h10.x(-483455358);
            q1.c0 a22 = y.p.a(fVar.g(), c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar4 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar4 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            androidx.compose.ui.platform.g2 g2Var4 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
            io.a<s1.a> a23 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a24 = q1.w.a(d12);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a23);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a25 = l0.h2.a(h10);
            l0.h2.b(a25, a22, c0787a.d());
            l0.h2.b(a25, dVar4, c0787a.b());
            l0.h2.b(a25, qVar4, c0787a.c());
            l0.h2.b(a25, g2Var4, c0787a.f());
            h10.c();
            a24.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            float f14 = 56;
            x0.f k11 = y.r0.k(y.d1.o(y.d1.n(aVar3, 0.0f, 1, null), m2.g.l(f14)), m2.g.l(f11), 0.0f, 2, null);
            h10.x(-492369756);
            Object y10 = h10.y();
            i.a aVar4 = l0.i.f39065a;
            if (y10 == aVar4.a()) {
                y10 = x.l.a();
                h10.q(y10);
            }
            h10.O();
            x0.f c11 = v.l.c(k11, (x.m) y10, null, false, null, null, new b(v2Var), 28, null);
            h10.x(693286680);
            q1.c0 a26 = y.y0.a(fVar.f(), c0986a.l(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar5 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar5 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            androidx.compose.ui.platform.g2 g2Var5 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
            io.a<s1.a> a27 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a28 = q1.w.a(c11);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a27);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a29 = l0.h2.a(h10);
            l0.h2.b(a29, a26, c0787a.d());
            l0.h2.b(a29, dVar5, c0787a.b());
            l0.h2.b(a29, qVar5, c0787a.c());
            l0.h2.b(a29, g2Var5, c0787a.f());
            h10.c();
            a28.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-678309503);
            h0.w1.c(v1.f.b(nc.i.text_select_payment_type_recieve_coin, h10, 0), y.z0.c(a1Var3, a1Var3.d(aVar3, c0986a.i()), 1.0f, false, 2, null), bVar.a().u(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().e(), h10, 0, 0, 32760);
            h10.x(1320859167);
            if (r2Var.i()) {
                a1Var = a1Var3;
                aVar = aVar3;
                v.w.a(v1.e.c(nc.d.f41816z, h10, 0), null, y.r0.i(v.e.d(a1Var3.d(z0.d.a(y.d1.u(aVar3, m2.g.l(24)), e0.g.f()), c0986a.i()), bVar.a().w(), null, 2, null), m2.g.l(7)), null, null, 0.0f, null, h10, 56, 120);
            } else {
                a1Var = a1Var3;
                aVar = aVar3;
            }
            h10.O();
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            h0.w.a(y.d1.n(y.r0.m(y.d1.o(v.e.d(aVar, bVar.a().d(), null, 2, null), m2.g.l(f13)), m2.g.l(f11), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null), 0L, 0.0f, 0.0f, h10, 0, 14);
            if (r2Var.k()) {
                h10.x(1320860121);
                f.a aVar5 = aVar;
                x0.f k12 = y.r0.k(y.d1.o(y.d1.n(aVar5, 0.0f, 1, null), m2.g.l(f14)), m2.g.l(f11), 0.0f, 2, null);
                h10.x(-492369756);
                Object y11 = h10.y();
                if (y11 == aVar4.a()) {
                    y11 = x.l.a();
                    h10.q(y11);
                }
                h10.O();
                x0.f c12 = v.l.c(k12, (x.m) y11, null, false, null, null, new c(v2Var), 28, null);
                h10.x(693286680);
                q1.c0 a30 = y.y0.a(fVar.f(), c0986a.l(), h10, 0);
                h10.x(-1323940314);
                m2.d dVar6 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
                m2.q qVar6 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
                androidx.compose.ui.platform.g2 g2Var6 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
                io.a<s1.a> a31 = c0787a.a();
                io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a32 = q1.w.a(c12);
                if (!(h10.k() instanceof l0.e)) {
                    l0.h.c();
                }
                h10.D();
                if (h10.f()) {
                    h10.r(a31);
                } else {
                    h10.o();
                }
                h10.E();
                l0.i a33 = l0.h2.a(h10);
                l0.h2.b(a33, a30, c0787a.d());
                l0.h2.b(a33, dVar6, c0787a.b());
                l0.h2.b(a33, qVar6, c0787a.c());
                l0.h2.b(a33, g2Var6, c0787a.f());
                h10.c();
                a32.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-678309503);
                v.w.a(v1.e.c(nc.d.f41814u, h10, 0), null, y.r0.i(v.g.g(a1Var.d(z0.d.a(y.d1.u(aVar5, m2.g.l(28)), e0.g.f()), c0986a.i()), m2.g.l(1), bVar.a().w(), e0.g.f()), m2.g.l(7)), null, null, 0.0f, null, h10, 56, 120);
                aVar2 = aVar5;
                h0.w1.c(v1.f.b(nc.i.text_select_payment_type_register_bank_account, h10, 0), y.z0.c(a1Var, a1Var.d(y.r0.k(aVar5, m2.g.l(8), 0.0f, 2, null), c0986a.i()), 1.0f, false, 2, null), bVar.a().w(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().e(), h10, 0, 0, 32760);
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
                h10.O();
                c10 = 0;
            } else {
                aVar2 = aVar;
                h10.x(1320861736);
                x0.f k13 = y.r0.k(y.d1.C(y.d1.n(aVar2, 0.0f, 1, null), null, false, 3, null), m2.g.l(f11), 0.0f, 2, null);
                h10.x(-492369756);
                Object y12 = h10.y();
                if (y12 == aVar4.a()) {
                    y12 = x.l.a();
                    h10.q(y12);
                }
                h10.O();
                x0.f c13 = v.l.c(k13, (x.m) y12, null, false, null, null, new d(v2Var), 28, null);
                h10.x(693286680);
                q1.c0 a34 = y.y0.a(fVar.f(), c0986a.l(), h10, 0);
                h10.x(-1323940314);
                m2.d dVar7 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
                m2.q qVar7 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
                androidx.compose.ui.platform.g2 g2Var7 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
                io.a<s1.a> a35 = c0787a.a();
                io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a36 = q1.w.a(c13);
                if (!(h10.k() instanceof l0.e)) {
                    l0.h.c();
                }
                h10.D();
                if (h10.f()) {
                    h10.r(a35);
                } else {
                    h10.o();
                }
                h10.E();
                l0.i a37 = l0.h2.a(h10);
                l0.h2.b(a37, a34, c0787a.d());
                l0.h2.b(a37, dVar7, c0787a.b());
                l0.h2.b(a37, qVar7, c0787a.c());
                l0.h2.b(a37, g2Var7, c0787a.f());
                h10.c();
                a36.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-678309503);
                y.a1 a1Var4 = a1Var;
                x0.f k14 = y.r0.k(y.z0.c(a1Var, aVar2, 1.0f, false, 2, null), 0.0f, m2.g.l(f11), 1, null);
                h10.x(-483455358);
                q1.c0 a38 = y.p.a(fVar.g(), c0986a.k(), h10, 0);
                h10.x(-1323940314);
                m2.d dVar8 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
                m2.q qVar8 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
                androidx.compose.ui.platform.g2 g2Var8 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
                io.a<s1.a> a39 = c0787a.a();
                io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a40 = q1.w.a(k14);
                if (!(h10.k() instanceof l0.e)) {
                    l0.h.c();
                }
                h10.D();
                if (h10.f()) {
                    h10.r(a39);
                } else {
                    h10.o();
                }
                h10.E();
                l0.i a41 = l0.h2.a(h10);
                l0.h2.b(a41, a38, c0787a.d());
                l0.h2.b(a41, dVar8, c0787a.b());
                l0.h2.b(a41, qVar8, c0787a.c());
                l0.h2.b(a41, g2Var8, c0787a.f());
                h10.c();
                a40.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-1163856341);
                h0.w1.c(v1.f.b(nc.i.text_select_payment_type_recieve_cash, h10, 0), null, bVar.a().u(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().e(), h10, 0, 0, 32762);
                h10.x(-492369756);
                Object y13 = h10.y();
                if (y13 == aVar4.a()) {
                    y13 = x.l.a();
                    h10.q(y13);
                }
                h10.O();
                float f15 = 8;
                float f16 = 4;
                x0.f c14 = v.e.c(y.d1.C(y.d1.G(y.r0.m(v.l.c(aVar2, (x.m) y13, null, false, null, null, new e(v2Var), 28, null), 0.0f, m2.g.l(f15), 0.0f, 0.0f, 13, null), null, false, 3, null), null, false, 3, null), bVar.a().b(), e0.g.c(m2.g.l(f16)));
                h10.x(-483455358);
                q1.c0 a42 = y.p.a(fVar.g(), c0986a.k(), h10, 0);
                h10.x(-1323940314);
                m2.d dVar9 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
                m2.q qVar9 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
                androidx.compose.ui.platform.g2 g2Var9 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
                io.a<s1.a> a43 = c0787a.a();
                io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a44 = q1.w.a(c14);
                if (!(h10.k() instanceof l0.e)) {
                    l0.h.c();
                }
                h10.D();
                if (h10.f()) {
                    h10.r(a43);
                } else {
                    h10.o();
                }
                h10.E();
                l0.i a45 = l0.h2.a(h10);
                l0.h2.b(a45, a42, c0787a.d());
                l0.h2.b(a45, dVar9, c0787a.b());
                l0.h2.b(a45, qVar9, c0787a.c());
                l0.h2.b(a45, g2Var9, c0787a.f());
                h10.c();
                a44.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-1163856341);
                float f17 = 5;
                x0.f m10 = y.r0.m(aVar2, m2.g.l(f15), m2.g.l(f17), m2.g.l(f15), 0.0f, 8, null);
                h10.x(693286680);
                q1.c0 a46 = y.y0.a(fVar.f(), c0986a.l(), h10, 0);
                h10.x(-1323940314);
                m2.d dVar10 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
                m2.q qVar10 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
                androidx.compose.ui.platform.g2 g2Var10 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
                io.a<s1.a> a47 = c0787a.a();
                io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a48 = q1.w.a(m10);
                if (!(h10.k() instanceof l0.e)) {
                    l0.h.c();
                }
                h10.D();
                if (h10.f()) {
                    h10.r(a47);
                } else {
                    h10.o();
                }
                h10.E();
                l0.i a49 = l0.h2.a(h10);
                l0.h2.b(a49, a46, c0787a.d());
                l0.h2.b(a49, dVar10, c0787a.b());
                l0.h2.b(a49, qVar10, c0787a.c());
                l0.h2.b(a49, g2Var10, c0787a.f());
                h10.c();
                a48.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-678309503);
                h0.w1.c(r2Var.d(), null, bVar.a().x(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().n(), h10, 0, 0, 32762);
                h0.w1.c(v1.f.b(nc.i.text_select_payment_type_branch_code, h10, 0), y.r0.m(aVar2, m2.g.l(f16), 0.0f, 0.0f, 0.0f, 14, null), bVar.a().x(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().m(), h10, 48, 0, 32760);
                h0.w1.c(r2Var.e(), null, bVar.a().x(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().n(), h10, 0, 0, 32762);
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
                float f18 = 2;
                y.g1.a(y.d1.o(aVar2, m2.g.l(f18)), h10, 6);
                x0.f l10 = y.r0.l(aVar2, m2.g.l(f15), m2.g.l(f18), m2.g.l(f15), m2.g.l(f17));
                h10.x(693286680);
                q1.c0 a50 = y.y0.a(fVar.f(), c0986a.l(), h10, 0);
                h10.x(-1323940314);
                m2.d dVar11 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
                m2.q qVar11 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
                androidx.compose.ui.platform.g2 g2Var11 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
                io.a<s1.a> a51 = c0787a.a();
                io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a52 = q1.w.a(l10);
                if (!(h10.k() instanceof l0.e)) {
                    l0.h.c();
                }
                h10.D();
                if (h10.f()) {
                    h10.r(a51);
                } else {
                    h10.o();
                }
                h10.E();
                l0.i a53 = l0.h2.a(h10);
                l0.h2.b(a53, a50, c0787a.d());
                l0.h2.b(a53, dVar11, c0787a.b());
                l0.h2.b(a53, qVar11, c0787a.c());
                l0.h2.b(a53, g2Var11, c0787a.f());
                h10.c();
                a52.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-678309503);
                h0.w1.c(v1.f.b(nc.i.text_select_payment_type_bank_account_type, h10, 0), null, bVar.a().x(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().n(), h10, 0, 0, 32762);
                h0.w1.c(r2Var.c(), y.r0.k(aVar2, m2.g.l(f15), 0.0f, 2, null), bVar.a().x(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().n(), h10, 48, 0, 32760);
                v.w.a(v1.e.c(nc.d.ic_select_payment_type_edit_bank_account, h10, 0), null, a1Var4.d(aVar2, c0986a.i()), null, null, 0.0f, null, h10, 56, 120);
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
                h10.x(-1625384455);
                if (r2Var.g()) {
                    a1Var2 = a1Var4;
                } else {
                    y.g1.a(y.d1.o(aVar2, m2.g.l(f12)), h10, 6);
                    a1Var2 = a1Var4;
                    h0.w1.c(v1.f.b(nc.i.text_select_payment_type_bank_account_check_ng_annotation, h10, 0), y.r0.m(aVar2, 0.0f, 0.0f, m2.g.l(f11), 0.0f, 11, null), bVar.a().p(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().p(), h10, 48, 0, 32760);
                }
                h10.O();
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
                if (r2Var.h()) {
                    c10 = 0;
                    v.w.a(v1.e.c(nc.d.f41816z, h10, 0), null, y.r0.i(v.e.d(a1Var2.d(z0.d.a(y.d1.u(aVar2, m2.g.l(24)), e0.g.f()), c0986a.i()), bVar.a().w(), null, 2, null), m2.g.l(7)), null, null, 0.0f, null, h10, 56, 120);
                } else {
                    c10 = 0;
                }
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
                h10.O();
            }
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            h0.w.a(v.e.d(y.d1.o(aVar2, m2.g.l(f13)), bVar.a().d(), null, 2, null), 0L, 0.0f, 0.0f, h10, 0, 14);
            y.g1.a(y.d1.o(aVar2, m2.g.l(f12)), h10, 6);
            h10.x(-315217854);
            if (r2Var.j()) {
                int i12 = nc.i.text_select_payment_type_start_date;
                Object[] objArr = new Object[1];
                objArr[c10] = r2Var.f();
                h0.w1.c(v1.f.c(i12, objArr, h10, 64), y.d1.n(y.r0.k(aVar2, m2.g.l(f11), 0.0f, 2, null), 0.0f, 1, null), bVar.a().x(), 0L, null, null, null, 0L, null, j2.e.g(j2.e.f37075b.a()), 0L, 0, false, 0, null, bVar.b().k(), h10, 48, 0, 32248);
            }
            h10.O();
            y.g1.a(y.d1.o(aVar2, m2.g.l(f10)), h10, 6);
            h0.w1.c(v1.f.b(nc.i.text_select_payment_type_annotation_1, h10, 0), y.r0.k(aVar2, m2.g.l(f11), 0.0f, 2, null), bVar.a().y(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().k(), h10, 48, 0, 32760);
            float f19 = 35;
            h0.w1.c(v1.f.b(nc.i.text_select_payment_type_annotation_2, h10, 0), y.r0.k(aVar2, m2.g.l(f19), 0.0f, 2, null), bVar.a().y(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().k(), h10, 48, 0, 32760);
            h0.w1.c(v1.f.b(nc.i.text_select_payment_type_annotation_3, h10, 0), y.r0.k(aVar2, m2.g.l(f19), 0.0f, 2, null), bVar.a().y(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().k(), h10, 48, 0, 32760);
            h0.w1.c(v1.f.b(nc.i.text_select_payment_type_annotation_4, h10, 0), y.r0.k(aVar2, m2.g.l(f11), 0.0f, 2, null), bVar.a().y(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().k(), h10, 48, 0, 32760);
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
        }
        l0.l1 l11 = h10.l();
        if (l11 == null) {
            return;
        }
        l11.a(new f(r2Var, v2Var, i10));
    }
}
