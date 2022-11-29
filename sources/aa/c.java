package aa;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import c1.i1;
import h0.w1;
import io.p;
import j2.e;
import java.util.List;
import jo.q;
import l0.h2;
import l0.l1;
import l0.n1;
import q1.c0;
import q1.w;
import s1.a;
import ud.t0;
import wn.v;
import x0.a;
import x0.f;
import xn.s;
import y.a1;
import y.d1;
import y.g1;
import y.j;
import y.l;
import y.r;
import y.r0;
import y.y0;
import y.z0;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static final class a extends q implements p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ aa.b f668w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List<t0> f669x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f670y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(aa.b bVar, List<t0> list, int i10) {
            super(2);
            this.f668w = bVar;
            this.f669x = list;
            this.f670y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            c.a(this.f668w, this.f669x, iVar, this.f670y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ aa.b f671w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f672x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(aa.b bVar, int i10) {
            super(2);
            this.f671w = bVar;
            this.f672x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            c.b(this.f671w, iVar, this.f672x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* renamed from: aa.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0012c extends q implements p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f673w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ aa.b f674x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f675y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f676z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0012c(x0.f fVar, aa.b bVar, int i10, int i11) {
            super(2);
            this.f673w = fVar;
            this.f674x = bVar;
            this.f675y = i10;
            this.f676z = i11;
        }

        public final void a(l0.i iVar, int i10) {
            c.c(this.f673w, this.f674x, iVar, this.f675y | 1, this.f676z);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(aa.b bVar, List<t0> list, l0.i iVar, int i10) {
        l0.i h10 = iVar.h(1458938269);
        f.a aVar = x0.f.f59359u;
        x0.f n10 = d1.n(aVar, 0.0f, 1, null);
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
        float f10 = 6;
        g1.a(d1.o(aVar, m2.g.l(f10)), h10, 6);
        h10.x(818186711);
        if (bVar.o()) {
            l9.g.a(bVar.h(), d1.o(aVar, m2.g.l(20)), h10, 48, 0);
        }
        h10.O();
        float f11 = 2;
        g1.a(d1.o(aVar, m2.g.l(f11)), h10, 6);
        String d10 = bVar.d();
        long a14 = v1.b.a(q9.d.f48816t, h10, 0);
        o9.b bVar2 = o9.b.f44283a;
        w1.c(d10, null, a14, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar2.b().s(), h10, 0, 0, 32762);
        g1.a(d1.o(aVar, m2.g.l(f11)), h10, 6);
        float f12 = 10;
        x0.f n11 = d1.n(r0.k(aVar, m2.g.l(f12), 0.0f, 2, null), 0.0f, 1, null);
        w1.c(bVar.g(), n11, v1.b.a(q9.d.f48806d, h10, 0), 0L, null, null, null, 0L, null, j2.e.g(j2.e.f37075b.a()), 0L, 0, false, 0, null, bVar2.b().a(), h10, 48, 0, 32248);
        x0.f o10 = d1.o(aVar, m2.g.l(f10));
        int i11 = 6;
        g1.a(o10, h10, 6);
        float f13 = 0.0f;
        Object obj = null;
        int i12 = 2;
        int i13 = 1;
        x0.f n12 = d1.n(r0.k(aVar, m2.g.l(30), 0.0f, 2, null), 0.0f, 1, null);
        x0.a e10 = c0986a.e();
        h10.x(733328855);
        c0 h11 = j.h(e10, false, h10, 6);
        h10.x(-1323940314);
        m2.d dVar2 = (m2.d) h10.G(o0.e());
        m2.q qVar2 = (m2.q) h10.G(o0.j());
        g2 g2Var2 = (g2) h10.G(o0.n());
        io.a<s1.a> a15 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, v> a16 = w.a(n12);
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
        h2.b(a17, h11, c0787a.d());
        h2.b(a17, dVar2, c0787a.b());
        h2.b(a17, qVar2, c0787a.c());
        h2.b(a17, g2Var2, c0787a.f());
        h10.c();
        a16.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-2137368960);
        l lVar = l.f60836a;
        h0.w.a(d1.n(aVar, 0.0f, 1, null), v1.b.a(q9.d.f48808l, h10, 0), 0.0f, 0.0f, h10, 6, 12);
        l9.d.c(bVar.f(), d1.v(aVar, m2.g.l(80), m2.g.l(28)), null, q9.f.ic_shooter_logo, null, null, h10, 48, 52);
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        float f14 = 4;
        g1.a(d1.o(aVar, m2.g.l(f14)), h10, 6);
        h10.x(818188174);
        int i14 = 0;
        for (Object obj2 : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                s.t();
            }
            t0 t0Var = (t0) obj2;
            h10.x(818188218);
            if (i14 < bVar.b().size()) {
                g1.a(d1.o(x0.f.f59359u, m2.g.l(f11)), h10, i11);
            }
            h10.O();
            f.a aVar2 = x0.f.f59359u;
            x0.f c10 = v.e.c(d1.n(d1.o(r0.k(aVar2, m2.g.l(40), f13, i12, obj), m2.g.l(20)), f13, i13, obj), v1.b.a(q9.d.f48803a, h10, 0), e0.g.c(m2.g.l(f12)));
            a.C0986a c0986a2 = x0.a.f59327a;
            a.c i16 = c0986a2.i();
            h10.x(693286680);
            y.f fVar = y.f.f60773a;
            c0 a18 = y0.a(fVar.f(), i16, h10, 48);
            h10.x(-1323940314);
            m2.d dVar3 = (m2.d) h10.G(o0.e());
            m2.q qVar3 = (m2.q) h10.G(o0.j());
            g2 g2Var3 = (g2) h10.G(o0.n());
            a.C0787a c0787a2 = s1.a.f51802o;
            io.a<s1.a> a19 = c0787a2.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a20 = w.a(c10);
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
            h2.b(a21, a18, c0787a2.d());
            h2.b(a21, dVar3, c0787a2.b());
            h2.b(a21, qVar3, c0787a2.c());
            h2.b(a21, g2Var3, c0787a2.f());
            h10.c();
            a20.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-678309503);
            a1 a1Var = a1.f60672a;
            g1.a(d1.y(aVar2, m2.g.l(8)), h10, i11);
            float f15 = f14;
            v.w.a(v1.e.c(t0Var.a(), h10, 0), null, d1.u(aVar2, m2.g.l(14)), null, null, 0.0f, null, h10, 440, 120);
            g1.a(d1.y(aVar2, m2.g.l(f15)), h10, i11);
            x0.f c11 = z0.c(a1Var, aVar2, 1.0f, false, 2, null);
            String b10 = t0Var.b();
            int i17 = q9.d.f48806d;
            long a22 = v1.b.a(i17, h10, 0);
            o9.b bVar3 = o9.b.f44283a;
            float f16 = f13;
            w1.c(b10, c11, a22, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar3.b().t(), h10, 0, 0, 32760);
            g1.a(d1.y(aVar2, m2.g.l(f15)), h10, 6);
            w1.c(t0Var.d(), null, v1.b.a(i17, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar3.b().t(), h10, 0, 0, 32762);
            if (t0Var.e()) {
                h10.x(-508902599);
                g1.a(d1.y(aVar2, m2.g.l(f15)), h10, 6);
                x0.f i18 = r0.i(v.e.c(aVar2, v1.b.a(q9.d.f48807k, h10, 0), e0.g.c(m2.g.l(f12))), m2.g.l(3));
                a.c i19 = c0986a2.i();
                h10.x(693286680);
                c0 a23 = y0.a(fVar.f(), i19, h10, 48);
                h10.x(-1323940314);
                m2.d dVar4 = (m2.d) h10.G(o0.e());
                m2.q qVar4 = (m2.q) h10.G(o0.j());
                g2 g2Var4 = (g2) h10.G(o0.n());
                io.a<s1.a> a24 = c0787a2.a();
                io.q<n1<s1.a>, l0.i, Integer, v> a25 = w.a(i18);
                if (!(h10.k() instanceof l0.e)) {
                    l0.h.c();
                }
                h10.D();
                if (h10.f()) {
                    h10.r(a24);
                } else {
                    h10.o();
                }
                h10.E();
                l0.i a26 = h2.a(h10);
                h2.b(a26, a23, c0787a2.d());
                h2.b(a26, dVar4, c0787a2.b());
                h2.b(a26, qVar4, c0787a2.c());
                h2.b(a26, g2Var4, c0787a2.f());
                h10.c();
                a25.s0(n1.a(n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-678309503);
                w1.c(t0Var.c(), null, v1.b.a(q9.d.G, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar3.b().u(), h10, 0, 0, 32762);
                i11 = 6;
                g1.a(d1.y(aVar2, m2.g.l(f11)), h10, 6);
                v.w.a(v1.e.c(q9.f.ic_emomo_quest_event_bonus, h10, 0), null, d1.u(aVar2, m2.g.l(f12)), null, null, 0.0f, null, h10, 440, 120);
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
                g1.a(d1.y(aVar2, m2.g.l(f11)), h10, 6);
                h10.O();
            } else {
                i11 = 6;
                h10.x(-508901410);
                g1.a(d1.y(aVar2, m2.g.l(f10)), h10, 6);
                h10.O();
            }
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            i14 = i15;
            f14 = f15;
            obj = null;
            f13 = f16;
            i12 = 2;
            i13 = 1;
        }
        h10.O();
        f.a aVar3 = x0.f.f59359u;
        g1.a(d1.o(aVar3, m2.g.l(f14)), h10, i11);
        String b11 = v1.f.b(q9.i.text_emomo_quest_gift_gacha_caption, h10, 0);
        long a27 = v1.b.a(q9.d.f48816t, h10, 0);
        o9.b bVar4 = o9.b.f44283a;
        w1.c(b11, null, a27, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar4.b().s(), h10, 0, 0, 32762);
        if (bVar.p()) {
            g1.a(d1.o(aVar3, m2.g.l(1)), h10, 6);
            a.c i20 = x0.a.f59327a.i();
            h10.x(693286680);
            c0 a28 = y0.a(y.f.f60773a.f(), i20, h10, 48);
            h10.x(-1323940314);
            m2.d dVar5 = (m2.d) h10.G(o0.e());
            m2.q qVar5 = (m2.q) h10.G(o0.j());
            g2 g2Var5 = (g2) h10.G(o0.n());
            a.C0787a c0787a3 = s1.a.f51802o;
            io.a<s1.a> a29 = c0787a3.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a30 = w.a(aVar3);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a29);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a31 = h2.a(h10);
            h2.b(a31, a28, c0787a3.d());
            h2.b(a31, dVar5, c0787a3.b());
            h2.b(a31, qVar5, c0787a3.c());
            h2.b(a31, g2Var5, c0787a3.f());
            h10.c();
            a30.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-678309503);
            a1 a1Var2 = a1.f60672a;
            v.w.a(v1.e.c(q9.f.ic_emomo_quest_event_bonus, h10, 0), null, d1.u(aVar3, m2.g.l(12)), null, null, 0.0f, null, h10, 440, 120);
            g1.a(d1.y(aVar3, m2.g.l(f11)), h10, 6);
            w1.c(bVar.k(), null, bVar4.a().p(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar4.b().s(), h10, 0, 0, 32762);
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
        l10.a(new a(bVar, list, i10));
    }

    public static final void b(aa.b bVar, l0.i iVar, int i10) {
        l0.i h10 = iVar.h(2117285431);
        f.a aVar = x0.f.f59359u;
        x0.f n10 = d1.n(aVar, 0.0f, 1, null);
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
        float f10 = 10;
        g1.a(d1.o(aVar, m2.g.l(f10)), h10, 6);
        x0.f n11 = d1.n(r0.k(aVar, m2.g.l(30), 0.0f, 2, null), 0.0f, 1, null);
        x0.a e10 = c0986a.e();
        h10.x(733328855);
        c0 h11 = j.h(e10, false, h10, 6);
        h10.x(-1323940314);
        m2.d dVar2 = (m2.d) h10.G(o0.e());
        m2.q qVar2 = (m2.q) h10.G(o0.j());
        g2 g2Var2 = (g2) h10.G(o0.n());
        io.a<s1.a> a14 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, v> a15 = w.a(n11);
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
        h2.b(a16, h11, c0787a.d());
        h2.b(a16, dVar2, c0787a.b());
        h2.b(a16, qVar2, c0787a.c());
        h2.b(a16, g2Var2, c0787a.f());
        h10.c();
        a15.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-2137368960);
        l lVar = l.f60836a;
        h0.w.a(d1.n(aVar, 0.0f, 1, null), v1.b.a(q9.d.f48808l, h10, 0), 0.0f, 0.0f, h10, 6, 12);
        l9.d.c(bVar.f(), d1.v(aVar, m2.g.l(80), m2.g.l(28)), null, q9.f.ic_shooter_logo, null, null, h10, 48, 52);
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        g1.a(d1.o(aVar, m2.g.l(f10)), h10, 6);
        x0.f n12 = d1.n(r0.k(aVar, m2.g.l(f10), 0.0f, 2, null), 0.0f, 1, null);
        String g11 = bVar.g();
        e.a aVar2 = j2.e.f37075b;
        int a17 = aVar2.a();
        long a18 = v1.b.a(q9.d.f48806d, h10, 0);
        o9.b bVar2 = o9.b.f44283a;
        w1.c(g11, n12, a18, 0L, null, null, null, 0L, null, j2.e.g(a17), 0L, 0, false, 0, null, bVar2.b().a(), h10, 48, 0, 32248);
        g1.a(d1.o(aVar, m2.g.l(6)), h10, 6);
        x0.f n13 = d1.n(r0.k(aVar, m2.g.l(f10), 0.0f, 2, null), 0.0f, 1, null);
        w1.c(bVar.e(), n13, v1.b.a(q9.d.f48814r, h10, 0), 0L, null, null, null, 0L, null, j2.e.g(aVar2.a()), 0L, 0, false, 0, null, bVar2.b().p(), h10, 48, 0, 32248);
        g1.a(d1.o(aVar, m2.g.l(20)), h10, 6);
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(bVar, i10));
    }

    public static final void c(x0.f fVar, aa.b bVar, l0.i iVar, int i10, int i11) {
        l lVar;
        jo.p.h(bVar, "bindModel");
        l0.i h10 = iVar.h(-2075332849);
        f.a aVar = (i11 & 1) != 0 ? x0.f.f59359u : fVar;
        h10.x(733328855);
        f.a aVar2 = x0.f.f59359u;
        a.C0986a c0986a = x0.a.f59327a;
        c0 h11 = j.h(c0986a.o(), false, h10, 0);
        h10.x(-1323940314);
        m2.d dVar = (m2.d) h10.G(o0.e());
        m2.q qVar = (m2.q) h10.G(o0.j());
        g2 g2Var = (g2) h10.G(o0.n());
        a.C0787a c0787a = s1.a.f51802o;
        io.a<s1.a> a10 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, v> a11 = w.a(aVar2);
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
        l lVar2 = l.f60836a;
        float f10 = 12;
        x0.f b10 = v.e.b(d1.q(r0.m(aVar, 0.0f, m2.g.l(3), 0.0f, 0.0f, 13, null), m2.g.l(400), 0.0f, 2, null), new i1(v1.b.a(q9.d.G, h10, 0), null), e0.g.c(m2.g.l(f10)), 0.0f, 4, null);
        a.b g10 = c0986a.g();
        h10.x(-483455358);
        c0 a13 = y.p.a(y.f.f60773a.g(), g10, h10, 48);
        h10.x(-1323940314);
        m2.d dVar2 = (m2.d) h10.G(o0.e());
        m2.q qVar2 = (m2.q) h10.G(o0.j());
        g2 g2Var2 = (g2) h10.G(o0.n());
        io.a<s1.a> a14 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, v> a15 = w.a(b10);
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
        h2.b(a16, dVar2, c0787a.b());
        h2.b(a16, qVar2, c0787a.c());
        h2.b(a16, g2Var2, c0787a.f());
        h10.c();
        a15.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-1163856341);
        r rVar = r.f60913a;
        g1.a(d1.o(aVar2, m2.g.l(24)), h10, 6);
        l9.d.c(bVar.j(), y.g.b(d1.o(r0.k(aVar2, m2.g.l(20), 0.0f, 2, null), m2.g.l(bVar.i())), 1.0f, false, 2, null), null, q9.f.Q, null, null, h10, 0, 52);
        if (bVar.m()) {
            h10.x(-2068385508);
            a(bVar, bVar.b(), h10, 72);
            h10.O();
        } else {
            h10.x(-2068385315);
            b(bVar, h10, 8);
            h10.O();
        }
        g1.a(d1.o(aVar2, m2.g.l(f10)), h10, 6);
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        h10.x(-652697464);
        if (bVar.l()) {
            lVar = lVar2;
            l9.d.c(bVar.a(), d1.v(r0.m(lVar.a(aVar2, c0986a.o()), m2.g.l(16), 0.0f, 0.0f, 0.0f, 14, null), m2.g.l(36), m2.g.l(43)), null, 0, null, null, h10, 0, 60);
        } else {
            lVar = lVar2;
        }
        h10.O();
        if (bVar.n()) {
            l9.d.c(bVar.c(), d1.u(r0.m(lVar.a(aVar2, c0986a.n()), 0.0f, m2.g.l(f10), m2.g.l(f10), 0.0f, 9, null), m2.g.l(32)), null, q9.f.f48823v, null, null, h10, 0, 52);
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
        l10.a(new C0012c(aVar, bVar, i10, i11));
    }
}
