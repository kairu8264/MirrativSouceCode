package w9;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import h0.w1;
import l0.h2;
import l0.l1;
import l0.n1;
import q1.c0;
import q1.w;
import s1.a;
import x0.a;
import x0.f;
import y.d1;
import y.f;
import y.g1;

/* loaded from: classes.dex */
public final class o {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f58416w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ n f58417x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f58418y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f58419z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0.f fVar, n nVar, io.a<wn.v> aVar, int i10, int i11) {
            super(2);
            this.f58416w = fVar;
            this.f58417x = nVar;
            this.f58418y = aVar;
            this.f58419z = i10;
            this.A = i11;
        }

        public final void a(l0.i iVar, int i10) {
            o.a(this.f58416w, this.f58417x, this.f58418y, iVar, this.f58419z | 1, this.A);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(x0.f fVar, n nVar, io.a<wn.v> aVar, l0.i iVar, int i10, int i11) {
        Object obj;
        int i12;
        x0.f fVar2;
        jo.p.h(nVar, "bindModel");
        jo.p.h(aVar, "onClickReward");
        l0.i h10 = iVar.h(-1009562542);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            obj = fVar;
        } else if ((i10 & 14) == 0) {
            obj = fVar;
            i12 = (h10.P(obj) ? 4 : 2) | i10;
        } else {
            obj = fVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= h10.P(nVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= h10.P(aVar) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && h10.j()) {
            h10.I();
            fVar2 = obj;
        } else {
            Object obj2 = i13 != 0 ? x0.f.f59359u : obj;
            h10.x(-492369756);
            Object y10 = h10.y();
            if (y10 == l0.i.f39065a.a()) {
                y10 = x.l.a();
                h10.q(y10);
            }
            h10.O();
            x0.f c10 = v.l.c(obj2, (x.m) y10, null, false, null, null, aVar, 28, null);
            h10.x(-483455358);
            f.l g10 = y.f.f60773a.g();
            a.C0986a c0986a = x0.a.f59327a;
            c0 a10 = y.p.a(g10, c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a12 = w.a(c10);
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
            y.r rVar = y.r.f60913a;
            f.a aVar2 = x0.f.f59359u;
            x0.f c11 = v.e.c(d1.l(y.g.b(aVar2, 1.0f, false, 2, null), 0.0f, 1, null), v1.b.a(q9.d.D, h10, 0), e0.g.f());
            h10.x(733328855);
            c0 h11 = y.j.h(c0986a.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(o0.e());
            m2.q qVar2 = (m2.q) h10.G(o0.j());
            g2 g2Var2 = (g2) h10.G(o0.n());
            io.a<s1.a> a14 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a15 = w.a(c11);
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
            y.l lVar = y.l.f60836a;
            x0.f fVar3 = obj2;
            l9.d.c(nVar.c(), d1.l(aVar2, 0.0f, 1, null), null, 0, null, null, h10, 48, 60);
            h10.x(-1361064743);
            if (nVar.e()) {
                l9.d.c(nVar.a(), lVar.a(d1.u(aVar2, m2.g.l(22)), c0986a.o()), null, 0, null, null, h10, 0, 60);
            }
            h10.O();
            v.w.a(v1.e.c(q9.f.ic_icon_zoom, h10, 0), null, lVar.a(d1.u(aVar2, m2.g.l(18)), c0986a.c()), null, null, 0.0f, null, h10, 56, 120);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            g1.a(d1.o(aVar2, m2.g.l(4)), h10, 6);
            x0.f n10 = d1.n(aVar2, 0.0f, 1, null);
            w1.c(nVar.b(), n10, v1.b.a(q9.d.f48816t, h10, 0), 0L, null, null, null, 0L, null, j2.e.g(j2.e.f37075b.a()), 0L, 0, false, 0, null, o9.b.f44283a.b().q(), h10, 48, 0, 32248);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            fVar2 = fVar3;
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(fVar2, nVar, aVar, i10, i11));
    }
}
