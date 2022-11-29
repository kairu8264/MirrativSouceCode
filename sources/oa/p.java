package oa;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import h0.w1;
import l0.h2;
import l0.l1;
import l0.n1;
import q1.c0;
import s1.a;
import x0.a;
import x0.f;
import y.a1;
import y.d1;
import y.f;
import y.g1;
import y.r0;
import y.y0;
import y.z0;

/* loaded from: classes.dex */
public final class p {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f44439w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ o f44440x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.l<? super String, wn.v> lVar, o oVar) {
            super(0);
            this.f44439w = lVar;
            this.f44440x = oVar;
        }

        public final void a() {
            this.f44439w.invoke(this.f44440x.l());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f44441w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ o f44442x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.l<? super String, wn.v> lVar, o oVar) {
            super(0);
            this.f44441w = lVar;
            this.f44442x = oVar;
        }

        public final void a() {
            this.f44441w.invoke(this.f44442x.g());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f44443w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ o f44444x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f44445y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f44446z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(x0.f fVar, o oVar, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2, int i10, int i11) {
            super(2);
            this.f44443w = fVar;
            this.f44444x = oVar;
            this.f44445y = lVar;
            this.f44446z = lVar2;
            this.A = i10;
            this.B = i11;
        }

        public final void a(l0.i iVar, int i10) {
            p.a(this.f44443w, this.f44444x, this.f44445y, this.f44446z, iVar, this.A | 1, this.B);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(x0.f fVar, o oVar, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2, l0.i iVar, int i10, int i11) {
        f.a aVar;
        int i12;
        int i13;
        Object obj;
        jo.p.h(oVar, "bindModel");
        jo.p.h(lVar, "onClickProfile");
        jo.p.h(lVar2, "onClickLive");
        l0.i h10 = iVar.h(933935214);
        x0.f fVar2 = (i11 & 1) != 0 ? x0.f.f59359u : fVar;
        int i14 = i10 & 14;
        h10.x(-483455358);
        y.f fVar3 = y.f.f60773a;
        f.l g10 = fVar3.g();
        a.C0986a c0986a = x0.a.f59327a;
        int i15 = i14 >> 3;
        c0 a10 = y.p.a(g10, c0986a.k(), h10, (i15 & 112) | (i15 & 14));
        h10.x(-1323940314);
        m2.d dVar = (m2.d) h10.G(o0.e());
        m2.q qVar = (m2.q) h10.G(o0.j());
        g2 g2Var = (g2) h10.G(o0.n());
        a.C0787a c0787a = s1.a.f51802o;
        io.a<s1.a> a11 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(fVar2);
        int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
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
        a12.s0(n1.a(n1.b(h10)), h10, Integer.valueOf((i16 >> 3) & 112));
        h10.x(2058660585);
        h10.x(-1163856341);
        if (((i16 >> 9) & 14 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            y.r rVar = y.r.f60913a;
            if (((((i14 >> 6) & 112) | 6) & 81) == 16 && h10.j()) {
                h10.I();
            } else {
                f.a aVar2 = x0.f.f59359u;
                float f10 = 8;
                x0.f j10 = r0.j(d1.g(aVar2, m2.g.f40516x.b(), m2.g.l(80)), m2.g.l(0), m2.g.l(f10));
                a.c i17 = c0986a.i();
                h10.x(693286680);
                c0 a14 = y0.a(fVar3.f(), i17, h10, 48);
                h10.x(-1323940314);
                m2.d dVar2 = (m2.d) h10.G(o0.e());
                m2.q qVar2 = (m2.q) h10.G(o0.j());
                g2 g2Var2 = (g2) h10.G(o0.n());
                io.a<s1.a> a15 = c0787a.a();
                io.q<n1<s1.a>, l0.i, Integer, wn.v> a16 = q1.w.a(j10);
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
                h10.x(-678309503);
                a1 a1Var = a1.f60672a;
                float f11 = 12;
                g1.a(d1.u(aVar2, m2.g.l(f11)), h10, 6);
                x0.f y10 = d1.y(aVar2, m2.g.l(44));
                x0.a e10 = c0986a.e();
                h10.x(733328855);
                c0 h11 = y.j.h(e10, false, h10, 6);
                h10.x(-1323940314);
                m2.d dVar3 = (m2.d) h10.G(o0.e());
                m2.q qVar3 = (m2.q) h10.G(o0.j());
                g2 g2Var3 = (g2) h10.G(o0.n());
                io.a<s1.a> a18 = c0787a.a();
                io.q<n1<s1.a>, l0.i, Integer, wn.v> a19 = q1.w.a(y10);
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
                l0.i a20 = h2.a(h10);
                h2.b(a20, h11, c0787a.d());
                h2.b(a20, dVar3, c0787a.b());
                h2.b(a20, qVar3, c0787a.c());
                h2.b(a20, g2Var3, c0787a.f());
                h10.c();
                a19.s0(n1.a(n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-2137368960);
                y.l lVar3 = y.l.f60836a;
                w1.c(oVar.j(), null, v1.b.a(oVar.h(), h10, 0), oVar.i(), null, d2.x.f29149x.a(), null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 196608, 0, 65490);
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
                g1.a(d1.u(aVar2, m2.g.l(f10)), h10, 6);
                float f12 = 45;
                x0.f u10 = d1.u(aVar2, m2.g.l(f12));
                h10.x(733328855);
                c0 h12 = y.j.h(c0986a.o(), false, h10, 0);
                h10.x(-1323940314);
                m2.d dVar4 = (m2.d) h10.G(o0.e());
                m2.q qVar4 = (m2.q) h10.G(o0.j());
                g2 g2Var4 = (g2) h10.G(o0.n());
                io.a<s1.a> a21 = c0787a.a();
                io.q<n1<s1.a>, l0.i, Integer, wn.v> a22 = q1.w.a(u10);
                if (!(h10.k() instanceof l0.e)) {
                    l0.h.c();
                }
                h10.D();
                if (h10.f()) {
                    h10.r(a21);
                } else {
                    h10.o();
                }
                h10.E();
                l0.i a23 = h2.a(h10);
                h2.b(a23, h12, c0787a.d());
                h2.b(a23, dVar4, c0787a.b());
                h2.b(a23, qVar4, c0787a.c());
                h2.b(a23, g2Var4, c0787a.f());
                h10.c();
                a22.s0(n1.a(n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-2137368960);
                x0.f a24 = z0.d.a(d1.u(aVar2, m2.g.l(f12)), e0.g.f());
                h10.x(-492369756);
                Object y11 = h10.y();
                if (y11 == l0.i.f39065a.a()) {
                    y11 = x.l.a();
                    h10.q(y11);
                }
                h10.O();
                l9.d.c(oVar.d(), v.l.c(a24, (x.m) y11, null, false, null, null, new a(lVar, oVar), 28, null), Integer.valueOf(ja.k.f37425e), 0, null, null, h10, 0, 56);
                h10.x(1889869549);
                if (oVar.n()) {
                    l9.d.c(oVar.c(), lVar3.a(d1.u(aVar2, m2.g.l(16)), c0986a.n()), null, 0, null, null, h10, 0, 60);
                }
                h10.O();
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
                g1.a(d1.u(aVar2, m2.g.l(f10)), h10, 6);
                x0.f c10 = z0.c(a1Var, aVar2, 1.0f, false, 2, null);
                h10.x(-483455358);
                c0 a25 = y.p.a(fVar3.g(), c0986a.k(), h10, 0);
                h10.x(-1323940314);
                m2.d dVar5 = (m2.d) h10.G(o0.e());
                m2.q qVar5 = (m2.q) h10.G(o0.j());
                g2 g2Var5 = (g2) h10.G(o0.n());
                io.a<s1.a> a26 = c0787a.a();
                io.q<n1<s1.a>, l0.i, Integer, wn.v> a27 = q1.w.a(c10);
                if (!(h10.k() instanceof l0.e)) {
                    l0.h.c();
                }
                h10.D();
                if (h10.f()) {
                    h10.r(a26);
                } else {
                    h10.o();
                }
                h10.E();
                l0.i a28 = h2.a(h10);
                h2.b(a28, a25, c0787a.d());
                h2.b(a28, dVar5, c0787a.b());
                h2.b(a28, qVar5, c0787a.c());
                h2.b(a28, g2Var5, c0787a.f());
                h10.c();
                a27.s0(n1.a(n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-1163856341);
                h10.x(-420596034);
                if (oVar.p()) {
                    aVar = aVar2;
                    i12 = 0;
                    l9.d.c(oVar.e(), d1.o(aVar2, m2.g.l(f11)), null, 0, null, null, h10, 48, 60);
                } else {
                    aVar = aVar2;
                    i12 = 0;
                }
                h10.O();
                String m10 = oVar.m();
                long a29 = v1.b.a(ja.j.f37414h, h10, i12);
                o9.b bVar = o9.b.f44283a;
                f.a aVar3 = aVar;
                w1.c(m10, null, a29, 0L, null, null, null, 0L, null, null, 0L, j2.k.f37107a.b(), false, 2, null, bVar.b().h(), h10, 0, 3120, 22522);
                float f13 = 4;
                g1.a(d1.o(aVar3, m2.g.l(f13)), h10, 6);
                w1.c(oVar.k(), d1.n(aVar3, 0.0f, 1, null), v1.b.a(ja.j.azure, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().r(), h10, 48, 0, 32760);
                g1.a(d1.o(aVar3, m2.g.l(f13)), h10, 6);
                h10.x(1889870919);
                if (oVar.q()) {
                    h10.x(693286680);
                    c0 a30 = y0.a(fVar3.f(), c0986a.l(), h10, 0);
                    h10.x(-1323940314);
                    m2.d dVar6 = (m2.d) h10.G(o0.e());
                    m2.q qVar6 = (m2.q) h10.G(o0.j());
                    g2 g2Var6 = (g2) h10.G(o0.n());
                    io.a<s1.a> a31 = c0787a.a();
                    io.q<n1<s1.a>, l0.i, Integer, wn.v> a32 = q1.w.a(aVar3);
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
                    l0.i a33 = h2.a(h10);
                    h2.b(a33, a30, c0787a.d());
                    h2.b(a33, dVar6, c0787a.b());
                    h2.b(a33, qVar6, c0787a.c());
                    h2.b(a33, g2Var6, c0787a.f());
                    h10.c();
                    a32.s0(n1.a(n1.b(h10)), h10, 0);
                    h10.x(2058660585);
                    h10.x(-678309503);
                    w1.c(v1.f.b(ja.n.text_livegame_daily_ranking_focused_livegame, h10, 0), null, v1.b.a(ja.j.f37413g, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().n(), h10, 0, 0, 32762);
                    for (String str : oVar.f()) {
                        f.a aVar4 = x0.f.f59359u;
                        g1.a(d1.u(aVar4, m2.g.l(f13)), h10, 6);
                        l9.d.c(str, z0.d.a(d1.u(aVar4, m2.g.l(16)), e0.g.c(m2.g.l(f13))), null, 0, null, null, h10, 0, 60);
                    }
                    i13 = 6;
                    h10.O();
                    h10.O();
                    h10.s();
                    h10.O();
                    h10.O();
                } else {
                    i13 = 6;
                }
                h10.O();
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
                f.a aVar5 = x0.f.f59359u;
                g1.a(d1.u(aVar5, m2.g.l(f10)), h10, i13);
                x0.f y12 = d1.y(aVar5, m2.g.l(48));
                h10.x(733328855);
                c0 h13 = y.j.h(x0.a.f59327a.o(), false, h10, 0);
                h10.x(-1323940314);
                m2.d dVar7 = (m2.d) h10.G(o0.e());
                m2.q qVar7 = (m2.q) h10.G(o0.j());
                g2 g2Var7 = (g2) h10.G(o0.n());
                a.C0787a c0787a2 = s1.a.f51802o;
                io.a<s1.a> a34 = c0787a2.a();
                io.q<n1<s1.a>, l0.i, Integer, wn.v> a35 = q1.w.a(y12);
                if (!(h10.k() instanceof l0.e)) {
                    l0.h.c();
                }
                h10.D();
                if (h10.f()) {
                    h10.r(a34);
                } else {
                    h10.o();
                }
                h10.E();
                l0.i a36 = h2.a(h10);
                h2.b(a36, h13, c0787a2.d());
                h2.b(a36, dVar7, c0787a2.b());
                h2.b(a36, qVar7, c0787a2.c());
                h2.b(a36, g2Var7, c0787a2.f());
                h10.c();
                a35.s0(n1.a(n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-2137368960);
                y.l lVar4 = y.l.f60836a;
                h10.x(1889871964);
                if (oVar.r()) {
                    obj = null;
                    ja.b.a(new b(lVar2, oVar), null, h10, 0, 2);
                } else {
                    obj = null;
                }
                h10.O();
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
                g1.a(d1.u(aVar5, m2.g.l(f11)), h10, i13);
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
                if (oVar.o()) {
                    h0.w.a(d1.n(d1.o(aVar5, m2.g.l(1)), 0.0f, 1, obj), v1.b.a(ja.j.f37415i, h10, 0), 0.0f, 0.0f, h10, 6, 12);
                }
            }
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
        l10.a(new c(fVar2, oVar, lVar, lVar2, i10, i11));
    }
}
