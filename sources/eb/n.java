package eb;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import c1.c0;
import c1.u;
import h0.w1;
import io.p;
import jo.q;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import l0.s0;
import l0.z1;
import s1.a;
import v.w;
import v.x;
import wn.v;
import x0.a;
import x0.f;
import xn.s;
import y.d1;
import y.g1;
import y.r;
import y.r0;

/* loaded from: classes2.dex */
public final class n {

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<m, v> f30384w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s0<m> f30385x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.l<? super m, v> lVar, s0<m> s0Var) {
            super(0);
            this.f30384w = lVar;
            this.f30385x = s0Var;
        }

        public final void a() {
            this.f30384w.invoke(n.b(this.f30385x));
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
        public final /* synthetic */ s0<m> f30386w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s0<m> s0Var) {
            super(0);
            this.f30386w = s0Var;
        }

        public final void a() {
            n.c(this.f30386w, m.VIEW);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ s0<m> f30387w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s0<m> s0Var) {
            super(2);
            this.f30387w = s0Var;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) != 2 || !iVar.j()) {
                if (n.b(this.f30387w) == m.VIEW) {
                    iVar.x(-557586717);
                    w.a(v1.e.c(wa.d.btn_survey_view_selected, iVar, 0), null, v.g.g(x0.f.f59359u, m2.g.l(2), v1.b.a(wa.c.f58523o, iVar, 0), e0.g.c(m2.g.l(12))), null, null, 0.0f, null, iVar, 56, 120);
                    iVar.O();
                    return;
                }
                iVar.x(-557586281);
                w.a(v1.e.c(wa.d.btn_survey_view, iVar, 0), null, null, null, null, 0.0f, null, iVar, 56, 124);
                iVar.O();
                return;
            }
            iVar.I();
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ s0<m> f30388w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(s0<m> s0Var) {
            super(0);
            this.f30388w = s0Var;
        }

        public final void a() {
            n.c(this.f30388w, m.LIVE);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ s0<m> f30389w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(s0<m> s0Var) {
            super(2);
            this.f30389w = s0Var;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) != 2 || !iVar.j()) {
                if (n.b(this.f30389w) == m.LIVE) {
                    iVar.x(-557585519);
                    w.a(v1.e.c(wa.d.btn_survey_live_selected, iVar, 0), null, v.g.g(x0.f.f59359u, m2.g.l(2), v1.b.a(wa.c.f58523o, iVar, 0), e0.g.c(m2.g.l(12))), null, null, 0.0f, null, iVar, 56, 120);
                    iVar.O();
                    return;
                }
                iVar.x(-557585083);
                w.a(v1.e.c(wa.d.btn_survey_live, iVar, 0), null, null, null, null, 0.0f, null, iVar, 56, 124);
                iVar.O();
                return;
            }
            iVar.I();
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ s0<m> f30390w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(s0<m> s0Var) {
            super(0);
            this.f30390w = s0Var;
        }

        public final void a() {
            n.c(this.f30390w, m.GAME);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ s0<m> f30391w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(s0<m> s0Var) {
            super(2);
            this.f30391w = s0Var;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) != 2 || !iVar.j()) {
                if (n.b(this.f30391w) == m.GAME) {
                    iVar.x(-557584321);
                    w.a(v1.e.c(wa.d.btn_survey_game_selected, iVar, 0), null, v.g.g(x0.f.f59359u, m2.g.l(2), v1.b.a(wa.c.f58523o, iVar, 0), e0.g.c(m2.g.l(12))), null, null, 0.0f, null, iVar, 56, 120);
                    iVar.O();
                    return;
                }
                iVar.x(-557583885);
                w.a(v1.e.c(wa.d.btn_survey_game, iVar, 0), null, null, null, null, 0.0f, null, iVar, 56, 124);
                iVar.O();
                return;
            }
            iVar.I();
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<m, v> f30392w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f30393x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(io.l<? super m, v> lVar, int i10) {
            super(2);
            this.f30392w = lVar;
            this.f30393x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            n.a(this.f30392w, iVar, this.f30393x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(io.l<? super m, v> lVar, l0.i iVar, int i10) {
        int i11;
        io.l<? super m, v> lVar2;
        jo.p.h(lVar, "onClickNext");
        l0.i h10 = iVar.h(-981913863);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(lVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && h10.j()) {
            h10.I();
            lVar2 = lVar;
        } else {
            h10.x(-492369756);
            Object y10 = h10.y();
            i.a aVar = l0.i.f39065a;
            if (y10 == aVar.a()) {
                y10 = z1.e(m.NONE, null, 2, null);
                h10.q(y10);
            }
            h10.O();
            s0 s0Var = (s0) y10;
            f.a aVar2 = x0.f.f59359u;
            x0.f b10 = v.e.b(d1.l(aVar2, 0.0f, 1, null), u.a.e(u.f18773b, s.m(c0.g(v1.b.a(da.d.f29335d, h10, 0)), c0.g(v1.b.a(da.d.topaz, h10, 0))), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null);
            a.b g10 = x0.a.f59327a.g();
            h10.x(-483455358);
            q1.c0 a10 = y.p.a(y.f.f60773a.g(), g10, h10, 48);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a12 = q1.w.a(b10);
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
            float f10 = 40;
            g1.a(d1.o(aVar2, m2.g.l(f10)), h10, 6);
            String b11 = v1.f.b(wa.j.text_onboarding_survey_title, h10, 0);
            int i12 = wa.c.f58523o;
            long a14 = v1.b.a(i12, h10, 0);
            o9.b bVar = o9.b.f44283a;
            w1.c(b11, null, a14, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().A(), h10, 0, 0, 32762);
            g1.a(d1.o(aVar2, m2.g.l(8)), h10, 6);
            w1.c(v1.f.b(wa.j.text_onboarding_survey_description, h10, 0), null, v1.b.a(i12, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().b(), h10, 0, 0, 32762);
            float f11 = 24;
            g1.a(d1.o(aVar2, m2.g.l(f11)), h10, 6);
            float f12 = 28;
            float f13 = 260;
            float f14 = 360;
            x0.f b12 = y.g.b(d1.z(r0.k(aVar2, m2.g.l(f12), 0.0f, 2, null), m2.g.l(f13), m2.g.l(f14)), 2.6666667f, false, 2, null);
            h10.x(-492369756);
            Object y11 = h10.y();
            if (y11 == aVar.a()) {
                y11 = x.l.a();
                h10.q(y11);
            }
            h10.O();
            x.m mVar = (x.m) y11;
            x e10 = k0.n.e(false, 0.0f, 0L, h10, 0, 7);
            h10.x(1157296644);
            boolean P = h10.P(s0Var);
            Object y12 = h10.y();
            if (P || y12 == aVar.a()) {
                y12 = new b(s0Var);
                h10.q(y12);
            }
            h10.O();
            float f15 = 12;
            h0.g.a(v.l.c(b12, mVar, e10, false, null, null, (io.a) y12, 28, null), e0.g.c(m2.g.l(f15)), 0L, 0L, null, m2.g.l(f15), s0.c.b(h10, 1874706368, true, new c(s0Var)), h10, 1769472, 28);
            g1.a(d1.o(aVar2, m2.g.l(f11)), h10, 6);
            x0.f b13 = y.g.b(d1.z(r0.k(aVar2, m2.g.l(f12), 0.0f, 2, null), m2.g.l(f13), m2.g.l(f14)), 2.6666667f, false, 2, null);
            h10.x(-492369756);
            Object y13 = h10.y();
            if (y13 == aVar.a()) {
                y13 = x.l.a();
                h10.q(y13);
            }
            h10.O();
            x.m mVar2 = (x.m) y13;
            x e11 = k0.n.e(false, 0.0f, 0L, h10, 0, 7);
            h10.x(1157296644);
            boolean P2 = h10.P(s0Var);
            Object y14 = h10.y();
            if (P2 || y14 == aVar.a()) {
                y14 = new d(s0Var);
                h10.q(y14);
            }
            h10.O();
            h0.g.a(v.l.c(b13, mVar2, e11, false, null, null, (io.a) y14, 28, null), e0.g.c(m2.g.l(f15)), 0L, 0L, null, m2.g.l(f15), s0.c.b(h10, -699392727, true, new e(s0Var)), h10, 1769472, 28);
            g1.a(d1.o(aVar2, m2.g.l(f11)), h10, 6);
            x0.f b14 = y.g.b(d1.z(r0.k(aVar2, m2.g.l(f12), 0.0f, 2, null), m2.g.l(f13), m2.g.l(f14)), 2.6666667f, false, 2, null);
            h10.x(-492369756);
            Object y15 = h10.y();
            if (y15 == aVar.a()) {
                y15 = x.l.a();
                h10.q(y15);
            }
            h10.O();
            x.m mVar3 = (x.m) y15;
            x e12 = k0.n.e(false, 0.0f, 0L, h10, 0, 7);
            h10.x(1157296644);
            boolean P3 = h10.P(s0Var);
            Object y16 = h10.y();
            if (P3 || y16 == aVar.a()) {
                y16 = new f(s0Var);
                h10.q(y16);
            }
            h10.O();
            h0.g.a(v.l.c(b14, mVar3, e12, false, null, null, (io.a) y16, 28, null), e0.g.c(m2.g.l(f15)), 0L, 0L, null, m2.g.l(f15), s0.c.b(h10, -1044308472, true, new g(s0Var)), h10, 1769472, 28);
            g1.a(y.q.c(rVar, aVar2, 1.0f, false, 2, null), h10, 0);
            h10.x(511388516);
            lVar2 = lVar;
            boolean P4 = h10.P(lVar2) | h10.P(s0Var);
            Object y17 = h10.y();
            if (P4 || y17 == aVar.a()) {
                y17 = new a(lVar2, s0Var);
                h10.q(y17);
            }
            h10.O();
            io.a aVar3 = (io.a) y17;
            x0.f k10 = r0.k(d1.o(d1.n(aVar2, 0.0f, 1, null), m2.g.l(48)), m2.g.l(f12), 0.0f, 2, null);
            m b15 = b(s0Var);
            m mVar4 = m.NONE;
            k9.c.a(aVar3, z0.a.a(k10, b15 != mVar4 ? 1.0f : 0.3f), new k9.a(bVar.a().B(), bVar.a().w(), 0L, bVar.a().B(), bVar.a().w(), 0L, 36, null), 0.0f, b(s0Var) != mVar4, null, null, eb.a.f30352a.a(), h10, (k9.a.C << 6) | 12582912, 104);
            g1.a(d1.o(aVar2, m2.g.l(f10)), h10, 6);
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
        l10.a(new h(lVar2, i10));
    }

    public static final m b(s0<m> s0Var) {
        return s0Var.getValue();
    }

    public static final void c(s0<m> s0Var, m mVar) {
        s0Var.setValue(mVar);
    }
}
