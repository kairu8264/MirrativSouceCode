package w9;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import c1.f1;
import d2.x;
import h0.w1;
import java.util.List;
import l0.h2;
import l0.l1;
import l0.n1;
import q1.w;
import s1.a;
import x0.a;
import x0.f;
import xn.a0;
import y.a1;
import y.c0;
import y.d1;
import y.e0;
import y.f;
import y.g1;
import y.r0;
import y.y0;
import y.z0;
import y1.a;

/* loaded from: classes.dex */
public final class t {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f58459w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s f58460x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.l<? super String, wn.v> lVar, s sVar) {
            super(0);
            this.f58459w = lVar;
            this.f58460x = sVar;
        }

        public final void a() {
            this.f58459w.invoke(this.f58460x.e());
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
        public final /* synthetic */ io.l<Integer, wn.v> f58461w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ n f58462x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.l<? super Integer, wn.v> lVar, n nVar) {
            super(0);
            this.f58461w = lVar;
            this.f58462x = nVar;
        }

        public final void a() {
            this.f58461w.invoke(Integer.valueOf(this.f58462x.d()));
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ io.l<Integer, wn.v> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ int C;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f58463w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s f58464x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f58465y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<Integer, wn.v> f58466z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(x0.f fVar, s sVar, io.l<? super String, wn.v> lVar, io.l<? super Integer, wn.v> lVar2, io.l<? super Integer, wn.v> lVar3, int i10, int i11) {
            super(2);
            this.f58463w = fVar;
            this.f58464x = sVar;
            this.f58465y = lVar;
            this.f58466z = lVar2;
            this.A = lVar3;
            this.B = i10;
            this.C = i11;
        }

        public final void a(l0.i iVar, int i10) {
            t.a(this.f58463w, this.f58464x, this.f58465y, this.f58466z, this.A, iVar, this.B | 1, this.C);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<Integer, wn.v> f58467w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s f58468x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(io.l<? super Integer, wn.v> lVar, s sVar) {
            super(0);
            this.f58467w = lVar;
            this.f58468x = sVar;
        }

        public final void a() {
            this.f58467w.invoke(Integer.valueOf(this.f58468x.l()));
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f58469w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s f58470x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<Integer, wn.v> f58471y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f58472z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(x0.f fVar, s sVar, io.l<? super Integer, wn.v> lVar, int i10, int i11) {
            super(2);
            this.f58469w = fVar;
            this.f58470x = sVar;
            this.f58471y = lVar;
            this.f58472z = i10;
            this.A = i11;
        }

        public final void a(l0.i iVar, int i10) {
            t.b(this.f58469w, this.f58470x, this.f58471y, iVar, this.f58472z | 1, this.A);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v25 */
    public static final void a(x0.f fVar, s sVar, io.l<? super String, wn.v> lVar, io.l<? super Integer, wn.v> lVar2, io.l<? super Integer, wn.v> lVar3, l0.i iVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        jo.p.h(sVar, "bindModel");
        jo.p.h(lVar, "onClickGradeLink");
        jo.p.h(lVar2, "onClickReward");
        jo.p.h(lVar3, "onClickProfile");
        l0.i h10 = iVar.h(-94403168);
        f.a aVar = (i11 & 1) != 0 ? x0.f.f59359u : fVar;
        x0.f a10 = c0.a(d1.n(aVar, 0.0f, 1, null), e0.Min);
        h10.x(733328855);
        a.C0986a c0986a = x0.a.f59327a;
        q1.c0 h11 = y.j.h(c0986a.o(), false, h10, 0);
        h10.x(-1323940314);
        m2.d dVar = (m2.d) h10.G(o0.e());
        m2.q qVar = (m2.q) h10.G(o0.j());
        g2 g2Var = (g2) h10.G(o0.n());
        a.C0787a c0787a = s1.a.f51802o;
        io.a<s1.a> a11 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, wn.v> a12 = w.a(a10);
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
        h2.b(a13, h11, c0787a.d());
        h2.b(a13, dVar, c0787a.b());
        h2.b(a13, qVar, c0787a.c());
        h2.b(a13, g2Var, c0787a.f());
        h10.c();
        a12.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-2137368960);
        y.l lVar4 = y.l.f60836a;
        f.a aVar2 = x0.f.f59359u;
        x0.f i16 = r0.i(d1.n(aVar2, 0.0f, 1, null), m2.g.l(8));
        h10.x(-483455358);
        y.f fVar2 = y.f.f60773a;
        q1.c0 a14 = y.p.a(fVar2.g(), c0986a.k(), h10, 0);
        h10.x(-1323940314);
        m2.d dVar2 = (m2.d) h10.G(o0.e());
        m2.q qVar2 = (m2.q) h10.G(o0.j());
        g2 g2Var2 = (g2) h10.G(o0.n());
        io.a<s1.a> a15 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, wn.v> a16 = w.a(i16);
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
        y.r rVar = y.r.f60913a;
        float f10 = 24;
        float f11 = 30;
        float f12 = 16;
        b(r0.l(v.e.c(d1.n(aVar2, 0.0f, 1, null), v1.b.a(q9.d.emomo_quest_user_detail_background, h10, 0), e0.g.e(m2.g.l(f10), m2.g.l(f10), 0.0f, 0.0f, 12, null)), m2.g.l(f12), m2.g.l(f11), m2.g.l(f12), m2.g.l(f12)), sVar, lVar3, h10, ((i10 >> 6) & 896) | 64, 0);
        x0.f fVar3 = aVar;
        h0.w.a(null, v1.b.a(q9.d.f48819w, h10, 0), 0.0f, 0.0f, h10, 0, 13);
        x0.f c10 = v.e.c(d1.n(aVar2, 0.0f, 1, null), v1.b.a(q9.d.G, h10, 0), e0.g.e(0.0f, 0.0f, m2.g.l(f10), m2.g.l(f10), 3, null));
        a.b g10 = c0986a.g();
        h10.x(-483455358);
        q1.c0 a18 = y.p.a(fVar2.g(), g10, h10, 48);
        h10.x(-1323940314);
        m2.d dVar3 = (m2.d) h10.G(o0.e());
        m2.q qVar3 = (m2.q) h10.G(o0.j());
        g2 g2Var3 = (g2) h10.G(o0.n());
        io.a<s1.a> a19 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, wn.v> a20 = w.a(c10);
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
        h2.b(a21, a18, c0787a.d());
        h2.b(a21, dVar3, c0787a.b());
        h2.b(a21, qVar3, c0787a.c());
        h2.b(a21, g2Var3, c0787a.f());
        h10.c();
        a20.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-1163856341);
        if (sVar.n()) {
            h10.x(-1606727824);
            g1.a(d1.o(aVar2, m2.g.l(12)), h10, 6);
            h10.x(-1606727703);
            a.C1037a c1037a = new a.C1037a(0, 1, null);
            String c11 = v1.f.c(q9.i.text_emomo_quest_ranking_title_grade_ranking_reward, new Object[]{sVar.c()}, h10, 64);
            String str = '[' + sVar.c() + ']';
            int U = so.o.U(c11, str, 0, false, 6, null);
            int length = U >= 0 ? str.length() + U : 0;
            int g11 = c1037a.g(new y1.v(v1.b.a(q9.d.f48818v, h10, 0), 0L, (x) null, (d2.u) null, (d2.v) null, (d2.l) null, (String) null, 0L, (j2.a) null, (j2.i) null, (f2.f) null, 0L, (j2.f) null, (f1) null, 16382, (jo.h) null));
            try {
                String substring = c11.substring(0, length);
                jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                c1037a.c(substring);
                wn.v vVar = wn.v.f59242a;
                c1037a.f(g11);
                String substring2 = c11.substring(length);
                jo.p.g(substring2, "this as java.lang.String).substring(startIndex)");
                c1037a.c(substring2);
                y1.a h12 = c1037a.h();
                h10.O();
                long a22 = v1.b.a(q9.d.f48816t, h10, 0);
                i12 = 6;
                i13 = 0;
                o9.b bVar = o9.b.f44283a;
                w1.b(h12, null, a22, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, bVar.b().c(), h10, 0, 0, 65530);
                g1.a(d1.o(aVar2, m2.g.l(2)), h10, 6);
                h10.x(-492369756);
                Object y10 = h10.y();
                if (y10 == l0.i.f39065a.a()) {
                    y10 = x.l.a();
                    h10.q(y10);
                }
                h10.O();
                x0.f c12 = v.l.c(aVar2, (x.m) y10, null, false, null, null, new a(lVar, sVar), 28, null);
                h10.x(693286680);
                q1.c0 a23 = y0.a(fVar2.f(), c0986a.l(), h10, 0);
                h10.x(-1323940314);
                m2.d dVar4 = (m2.d) h10.G(o0.e());
                m2.q qVar4 = (m2.q) h10.G(o0.j());
                g2 g2Var4 = (g2) h10.G(o0.n());
                io.a<s1.a> a24 = c0787a.a();
                io.q<n1<s1.a>, l0.i, Integer, wn.v> a25 = w.a(c12);
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
                h2.b(a26, a23, c0787a.d());
                h2.b(a26, dVar4, c0787a.b());
                h2.b(a26, qVar4, c0787a.c());
                h2.b(a26, g2Var4, c0787a.f());
                h10.c();
                a25.s0(n1.a(n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-678309503);
                a1 a1Var = a1.f60672a;
                w1.c(v1.f.b(q9.i.text_emomo_quest_ranking_what_grade, h10, 0), null, v1.b.a(q9.d.f48814r, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().n(), h10, 0, 0, 32762);
                g1.a(d1.y(aVar2, m2.g.l(4)), h10, 6);
                v.w.a(v1.e.c(q9.f.ic_help_transparent, h10, 0), null, d1.u(aVar2, m2.g.l(14)), null, null, 0.0f, null, h10, 440, 120);
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
                g1.a(d1.o(aVar2, m2.g.l(14)), h10, 6);
                h10.O();
                i14 = 4;
                i15 = 693286680;
            } catch (Throwable th2) {
                c1037a.f(g11);
                throw th2;
            }
        } else {
            i12 = 6;
            i13 = 0;
            i14 = 4;
            i15 = 693286680;
            h10.x(-1606725593);
            g1.a(d1.o(aVar2, m2.g.l(f12)), h10, 6);
            h10.O();
        }
        float l10 = m2.g.l(68);
        h10.x(-1606725412);
        int i17 = i13;
        for (Object obj : a0.N(sVar.j(), i14)) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                xn.s.t();
            }
            List<n> list = (List) obj;
            h10.x(-1606725353);
            if (i17 > 0) {
                g1.a(d1.o(x0.f.f59359u, m2.g.l(10)), h10, i12);
            }
            h10.O();
            f.e e10 = y.f.f60773a.e();
            x0.f n10 = d1.n(x0.f.f59359u, 0.0f, 1, null);
            h10.x(i15);
            q1.c0 a27 = y0.a(e10, x0.a.f59327a.l(), h10, i12);
            h10.x(-1323940314);
            m2.d dVar5 = (m2.d) h10.G(o0.e());
            m2.q qVar5 = (m2.q) h10.G(o0.j());
            g2 g2Var5 = (g2) h10.G(o0.n());
            a.C0787a c0787a2 = s1.a.f51802o;
            io.a<s1.a> a28 = c0787a2.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a29 = w.a(n10);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a28);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a30 = h2.a(h10);
            h2.b(a30, a27, c0787a2.d());
            h2.b(a30, dVar5, c0787a2.b());
            h2.b(a30, qVar5, c0787a2.c());
            h2.b(a30, g2Var5, c0787a2.f());
            h10.c();
            a29.s0(n1.a(n1.b(h10)), h10, Integer.valueOf(i13));
            h10.x(2058660585);
            char c13 = 53633;
            h10.x(-678309503);
            a1 a1Var2 = a1.f60672a;
            h10.x(741094684);
            for (n nVar : list) {
                x0.f y11 = d1.y(x0.f.f59359u, l10);
                h10.x(511388516);
                boolean P = h10.P(lVar2) | h10.P(nVar);
                Object y12 = h10.y();
                if (P || y12 == l0.i.f39065a.a()) {
                    y12 = new b(lVar2, nVar);
                    h10.q(y12);
                }
                h10.O();
                o.a(y11, nVar, y12, h10, 6, 0);
                c13 = c13;
            }
            h10.O();
            int size = 4 - list.size();
            for (int i19 = i13; i19 < size; i19++) {
                g1.a(d1.y(x0.f.f59359u, l10), h10, 6);
                wn.v vVar2 = wn.v.f59242a;
            }
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            i17 = i18;
            i15 = 693286680;
            i12 = 6;
        }
        h10.O();
        f.a aVar3 = x0.f.f59359u;
        g1.a(d1.o(aVar3, m2.g.l(f11)), h10, 6);
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
        l9.d.a(q9.f.bg_emomo_quest_ranking_frame, d1.l(aVar3, 0.0f, 1, null), null, h10, 48, 4);
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        l1 l11 = h10.l();
        if (l11 == null) {
            return;
        }
        l11.a(new c(fVar3, sVar, lVar, lVar2, lVar3, i10, i11));
    }

    public static final void b(x0.f fVar, s sVar, io.l<? super Integer, wn.v> lVar, l0.i iVar, int i10, int i11) {
        a1 a1Var;
        l0.i h10 = iVar.h(691608993);
        f.a aVar = (i11 & 1) != 0 ? x0.f.f59359u : fVar;
        a.C0986a c0986a = x0.a.f59327a;
        a.c i12 = c0986a.i();
        int i13 = (i10 & 14) | 384;
        h10.x(693286680);
        y.f fVar2 = y.f.f60773a;
        int i14 = i13 >> 3;
        q1.c0 a10 = y0.a(fVar2.f(), i12, h10, (i14 & 112) | (i14 & 14));
        h10.x(-1323940314);
        m2.d dVar = (m2.d) h10.G(o0.e());
        m2.q qVar = (m2.q) h10.G(o0.j());
        g2 g2Var = (g2) h10.G(o0.n());
        a.C0787a c0787a = s1.a.f51802o;
        io.a<s1.a> a11 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, wn.v> a12 = w.a(aVar);
        int i15 = ((((i13 << 3) & 112) << 9) & 7168) | 6;
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
        a12.s0(n1.a(n1.b(h10)), h10, Integer.valueOf((i15 >> 3) & 112));
        h10.x(2058660585);
        h10.x(-678309503);
        if (((i15 >> 9) & 14 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            a1 a1Var2 = a1.f60672a;
            int i16 = ((i13 >> 6) & 112) | 6;
            if ((i16 & 14) == 0) {
                i16 |= h10.P(a1Var2) ? 4 : 2;
            }
            if ((i16 & 91) == 18 && h10.j()) {
                h10.I();
            } else {
                f.a aVar2 = x0.f.f59359u;
                x0.f y10 = d1.y(aVar2, m2.g.l(62));
                a.b g10 = c0986a.g();
                h10.x(-483455358);
                q1.c0 a14 = y.p.a(fVar2.g(), g10, h10, 48);
                h10.x(-1323940314);
                m2.d dVar2 = (m2.d) h10.G(o0.e());
                m2.q qVar2 = (m2.q) h10.G(o0.j());
                g2 g2Var2 = (g2) h10.G(o0.n());
                io.a<s1.a> a15 = c0787a.a();
                io.q<n1<s1.a>, l0.i, Integer, wn.v> a16 = w.a(y10);
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
                y.r rVar = y.r.f60913a;
                float f10 = 24;
                v.w.a(v1.e.c(q9.f.ic_emomo_quest_ranking_crown, h10, 0), null, d1.v(aVar2, m2.g.l(f10), m2.g.l(f10)), null, null, 0.0f, null, h10, 440, 120);
                if (sVar.q()) {
                    h10.x(34345444);
                    a1Var = a1Var2;
                    w1.c(sVar.i(), null, v1.b.a(q9.d.f48804b, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, o9.b.f44283a.b().B(), h10, 0, 0, 32762);
                    h10.O();
                } else {
                    a1Var = a1Var2;
                    h10.x(34345682);
                    w1.c(v1.f.b(sVar.a(), h10, 0), null, v1.b.a(q9.d.f48804b, h10, 0), 0L, null, null, null, 0L, null, j2.e.g(j2.e.f37075b.a()), 0L, 0, false, 0, null, o9.b.f44283a.b().f(), h10, 0, 0, 32250);
                    h10.O();
                }
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
                g1.a(d1.y(aVar2, m2.g.l(18)), h10, 6);
                h10.x(733328855);
                q1.c0 h11 = y.j.h(c0986a.o(), false, h10, 0);
                h10.x(-1323940314);
                m2.d dVar3 = (m2.d) h10.G(o0.e());
                m2.q qVar3 = (m2.q) h10.G(o0.j());
                g2 g2Var3 = (g2) h10.G(o0.n());
                io.a<s1.a> a18 = c0787a.a();
                io.q<n1<s1.a>, l0.i, Integer, wn.v> a19 = w.a(aVar2);
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
                y.l lVar2 = y.l.f60836a;
                x0.f a21 = z0.d.a(d1.u(aVar2, m2.g.l(48)), e0.g.f());
                h10.x(-492369756);
                Object y11 = h10.y();
                if (y11 == l0.i.f39065a.a()) {
                    y11 = x.l.a();
                    h10.q(y11);
                }
                h10.O();
                l9.d.c(sVar.f(), v.l.c(a21, (x.m) y11, null, false, null, null, new d(lVar, sVar), 28, null), Integer.valueOf(q9.f.N), 0, null, null, h10, 0, 56);
                h10.x(488848577);
                if (sVar.m()) {
                    l9.d.c(sVar.b(), lVar2.a(d1.u(aVar2, m2.g.l(16)), c0986a.n()), null, 0, null, null, h10, 0, 60);
                }
                h10.O();
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
                g1.a(d1.y(aVar2, m2.g.l(8)), h10, 6);
                x0.f c10 = z0.c(a1Var, aVar2, 1.0f, false, 2, null);
                h10.x(-483455358);
                q1.c0 a22 = y.p.a(fVar2.g(), c0986a.k(), h10, 0);
                h10.x(-1323940314);
                m2.d dVar4 = (m2.d) h10.G(o0.e());
                m2.q qVar4 = (m2.q) h10.G(o0.j());
                g2 g2Var4 = (g2) h10.G(o0.n());
                io.a<s1.a> a23 = c0787a.a();
                io.q<n1<s1.a>, l0.i, Integer, wn.v> a24 = w.a(c10);
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
                l0.i a25 = h2.a(h10);
                h2.b(a25, a22, c0787a.d());
                h2.b(a25, dVar4, c0787a.b());
                h2.b(a25, qVar4, c0787a.c());
                h2.b(a25, g2Var4, c0787a.f());
                h10.c();
                a24.s0(n1.a(n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-1163856341);
                h10.x(34346994);
                if (sVar.p()) {
                    l9.d.c(sVar.g(), d1.o(aVar2, m2.g.l(12)), null, 0, null, null, h10, 48, 60);
                    g1.a(d1.o(aVar2, m2.g.l(2)), h10, 6);
                }
                h10.O();
                x0.f n10 = d1.n(aVar2, 0.0f, 1, null);
                String h12 = sVar.h();
                long a26 = v1.b.a(q9.d.f48804b, h10, 0);
                o9.b bVar = o9.b.f44283a;
                w1.c(h12, n10, a26, 0L, null, null, null, 0L, null, null, 0L, j2.k.f37107a.b(), false, 1, null, bVar.b().l(), h10, 48, 3120, 22520);
                w1.c(sVar.k(), d1.n(aVar2, 0.0f, 1, null), v1.b.a(q9.d.f48818v, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().z(), h10, 48, 0, 32760);
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
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
        l10.a(new e(aVar, sVar, lVar, i10, i11));
    }
}
