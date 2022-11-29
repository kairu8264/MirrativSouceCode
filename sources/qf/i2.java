package qf;

import c1.u;
import com.google.android.exoplayer2.C;
import s1.a;
import x0.a;
import x0.f;

/* loaded from: classes3.dex */
public final class i2 {

    /* loaded from: classes3.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f49225w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<wn.v> aVar) {
            super(0);
            this.f49225w = aVar;
        }

        public final void a() {
            this.f49225w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements x0.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ m2.d f49226b;

        public b(m2.d dVar) {
            this.f49226b = dVar;
        }

        @Override // x0.a
        public final long a(long j10, long j11, m2.q qVar) {
            jo.p.h(qVar, "<anonymous parameter 2>");
            return m2.l.a(lo.c.c(this.f49226b.I0(m2.g.l(24))), lo.c.c(this.f49226b.I0(m2.g.l(-8))));
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f49227w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g2 f49228x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f49229y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f49230z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x0.f fVar, g2 g2Var, io.a<wn.v> aVar, int i10, int i11) {
            super(2);
            this.f49227w = fVar;
            this.f49228x = g2Var;
            this.f49229y = aVar;
            this.f49230z = i10;
            this.A = i11;
        }

        public final void a(l0.i iVar, int i10) {
            i2.a(this.f49227w, this.f49228x, this.f49229y, iVar, this.f49230z | 1, this.A);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(x0.f fVar, g2 g2Var, io.a<wn.v> aVar, l0.i iVar, int i10, int i11) {
        y1.d0 b10;
        y1.d0 b11;
        jo.p.h(g2Var, "bindModel");
        jo.p.h(aVar, "onClick");
        l0.i h10 = iVar.h(-367797978);
        x0.f fVar2 = (i11 & 1) != 0 ? x0.f.f59359u : fVar;
        float f10 = 8;
        x0.f a10 = z0.d.a(y.c0.a(fVar2, y.e0.Min), e0.g.c(m2.g.l(f10)));
        h10.x(1157296644);
        boolean P = h10.P(aVar);
        Object y10 = h10.y();
        if (P || y10 == l0.i.f39065a.a()) {
            y10 = new a(aVar);
            h10.q(y10);
        }
        h10.O();
        x0.f e10 = v.l.e(a10, false, null, null, (io.a) y10, 7, null);
        h10.x(733328855);
        a.C0986a c0986a = x0.a.f59327a;
        q1.c0 h11 = y.j.h(c0986a.o(), false, h10, 0);
        h10.x(-1323940314);
        m2.d dVar = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
        m2.q qVar = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
        androidx.compose.ui.platform.g2 g2Var2 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
        a.C0787a c0787a = s1.a.f51802o;
        io.a<s1.a> a11 = c0787a.a();
        io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(e10);
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
        l0.h2.b(a13, h11, c0787a.d());
        l0.h2.b(a13, dVar, c0787a.b());
        l0.h2.b(a13, qVar, c0787a.c());
        l0.h2.b(a13, g2Var2, c0787a.f());
        h10.c();
        a12.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-2137368960);
        y.l lVar = y.l.f60836a;
        f.a aVar2 = x0.f.f59359u;
        y.j.a(v.e.b(lVar.c(aVar2), u.a.b(c1.u.f18773b, g2Var.c(), 0.0f, 0.0f, 0, 14, null), null, 0.8f, 2, null), h10, 0);
        l9.d.c(g2Var.a(), y.d1.j(y.d1.y(lVar.a(aVar2, c0986a.f()), m2.g.l(90)), 0.0f, 1, null), null, nd.y0.f42255w3, q1.f.f48569a.c(), new b((m2.d) h10.G(androidx.compose.ui.platform.o0.e())), h10, 24576, 4);
        x0.f l10 = y.r0.l(aVar2, m2.g.l(f10), m2.g.l(f10), m2.g.l(44), m2.g.l(f10));
        h10.x(693286680);
        y.f fVar3 = y.f.f60773a;
        q1.c0 a14 = y.y0.a(fVar3.f(), c0986a.l(), h10, 0);
        h10.x(-1323940314);
        m2.d dVar2 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
        m2.q qVar2 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
        androidx.compose.ui.platform.g2 g2Var3 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
        io.a<s1.a> a15 = c0787a.a();
        io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a16 = q1.w.a(l10);
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
        l0.h2.b(a17, g2Var3, c0787a.f());
        h10.c();
        a16.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-678309503);
        y.a1 a1Var = y.a1.f60672a;
        h10.x(733328855);
        q1.c0 h12 = y.j.h(c0986a.o(), false, h10, 0);
        h10.x(-1323940314);
        m2.d dVar3 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
        m2.q qVar3 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
        androidx.compose.ui.platform.g2 g2Var4 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
        io.a<s1.a> a18 = c0787a.a();
        io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a19 = q1.w.a(aVar2);
        if (!(h10.k() instanceof l0.e)) {
            l0.h.c();
        }
        h10.D();
        if (h10.f()) {
            h10.r(a18);
        } else {
            h10.o();
        }
        h10.E();
        l0.i a20 = l0.h2.a(h10);
        l0.h2.b(a20, h12, c0787a.d());
        l0.h2.b(a20, dVar3, c0787a.b());
        l0.h2.b(a20, qVar3, c0787a.c());
        l0.h2.b(a20, g2Var4, c0787a.f());
        h10.c();
        a19.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-2137368960);
        l9.d.c(g2Var.d(), z0.d.a(y.d1.u(aVar2, m2.g.l(24)), e0.g.f()), Integer.valueOf(nd.y0.U1), 0, null, null, h10, 0, 56);
        h10.x(-1972498875);
        if (g2Var.g()) {
            l9.d.c(g2Var.b(), lVar.a(y.d1.u(aVar2, m2.g.l(f10)), c0986a.n()), null, 0, null, null, h10, 0, 60);
        }
        h10.O();
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        y.g1.a(y.d1.y(aVar2, m2.g.l(5)), h10, 6);
        h10.x(-483455358);
        q1.c0 a21 = y.p.a(fVar3.g(), c0986a.k(), h10, 0);
        h10.x(-1323940314);
        m2.d dVar4 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
        m2.q qVar4 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
        androidx.compose.ui.platform.g2 g2Var5 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
        io.a<s1.a> a22 = c0787a.a();
        io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a23 = q1.w.a(aVar2);
        if (!(h10.k() instanceof l0.e)) {
            l0.h.c();
        }
        h10.D();
        if (h10.f()) {
            h10.r(a22);
        } else {
            h10.o();
        }
        h10.E();
        l0.i a24 = l0.h2.a(h10);
        l0.h2.b(a24, a21, c0787a.d());
        l0.h2.b(a24, dVar4, c0787a.b());
        l0.h2.b(a24, qVar4, c0787a.c());
        l0.h2.b(a24, g2Var5, c0787a.f());
        h10.c();
        a23.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-1163856341);
        y.r rVar = y.r.f60913a;
        h10.x(-492369756);
        Object y11 = h10.y();
        if (y11 == l0.i.f39065a.a()) {
            y11 = new c1.f1(c1.c0.k(o9.b.f44283a.a().c(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), b1.g.a(0.5f, 0.5f), 3.0f, null);
            h10.q(y11);
        }
        h10.O();
        c1.f1 f1Var = (c1.f1) y11;
        String f11 = g2Var.f();
        o9.b bVar = o9.b.f44283a;
        b10 = r5.b((r42 & 1) != 0 ? r5.f61077a.f() : 0L, (r42 & 2) != 0 ? r5.f61077a.i() : 0L, (r42 & 4) != 0 ? r5.f61077a.l() : null, (r42 & 8) != 0 ? r5.f61077a.j() : null, (r42 & 16) != 0 ? r5.f61077a.k() : null, (r42 & 32) != 0 ? r5.f61077a.g() : null, (r42 & 64) != 0 ? r5.f61077a.h() : null, (r42 & 128) != 0 ? r5.f61077a.m() : 0L, (r42 & 256) != 0 ? r5.f61077a.d() : null, (r42 & 512) != 0 ? r5.f61077a.s() : null, (r42 & 1024) != 0 ? r5.f61077a.n() : null, (r42 & 2048) != 0 ? r5.f61077a.c() : 0L, (r42 & 4096) != 0 ? r5.f61077a.q() : null, (r42 & 8192) != 0 ? r5.f61077a.p() : f1Var, (r42 & 16384) != 0 ? r5.f61078b.f() : null, (r42 & 32768) != 0 ? r5.f61078b.g() : null, (r42 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? r5.f61078b.c() : 0L, (r42 & 131072) != 0 ? bVar.b().i().f61078b.h() : null);
        h0.w1.c(f11, null, bVar.a().B(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, b10, h10, 0, 0, 32762);
        String e11 = g2Var.e();
        b11 = r31.b((r42 & 1) != 0 ? r31.f61077a.f() : 0L, (r42 & 2) != 0 ? r31.f61077a.i() : 0L, (r42 & 4) != 0 ? r31.f61077a.l() : null, (r42 & 8) != 0 ? r31.f61077a.j() : null, (r42 & 16) != 0 ? r31.f61077a.k() : null, (r42 & 32) != 0 ? r31.f61077a.g() : null, (r42 & 64) != 0 ? r31.f61077a.h() : null, (r42 & 128) != 0 ? r31.f61077a.m() : 0L, (r42 & 256) != 0 ? r31.f61077a.d() : null, (r42 & 512) != 0 ? r31.f61077a.s() : null, (r42 & 1024) != 0 ? r31.f61077a.n() : null, (r42 & 2048) != 0 ? r31.f61077a.c() : 0L, (r42 & 4096) != 0 ? r31.f61077a.q() : null, (r42 & 8192) != 0 ? r31.f61077a.p() : f1Var, (r42 & 16384) != 0 ? r31.f61078b.f() : null, (r42 & 32768) != 0 ? r31.f61078b.g() : null, (r42 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? r31.f61078b.c() : 0L, (r42 & 131072) != 0 ? bVar.b().h().f61078b.h() : null);
        h0.w1.c(e11, null, bVar.a().B(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, b11, h10, 0, 0, 32762);
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
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        l0.l1 l11 = h10.l();
        if (l11 == null) {
            return;
        }
        l11.a(new c(fVar2, g2Var, aVar, i10, i11));
    }
}
