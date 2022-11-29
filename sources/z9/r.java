package z9;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import h0.i1;
import h0.w1;
import l0.h2;
import l0.l1;
import l0.n1;
import s1.a;
import x0.a;
import x0.f;
import y.a1;
import y.d1;
import y.g1;
import y.r0;
import y.y0;
import y.z0;

/* loaded from: classes.dex */
public final class r {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ o f62892w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar) {
            super(2);
            this.f62892w = oVar;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            w1.c(this.f62892w.b(), r0.j(x0.f.f59359u, m2.g.l(8), m2.g.l(2)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, o9.b.f44283a.b().u(), iVar, 0, 0, 32764);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f62893w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ o f62894x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f62895y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f62896z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x0.f fVar, o oVar, int i10, int i11) {
            super(2);
            this.f62893w = fVar;
            this.f62894x = oVar;
            this.f62895y = i10;
            this.f62896z = i11;
        }

        public final void a(l0.i iVar, int i10) {
            r.a(this.f62893w, this.f62894x, iVar, this.f62895y | 1, this.f62896z);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(x0.f fVar, o oVar, l0.i iVar, int i10, int i11) {
        Object obj;
        int i12;
        f.a aVar;
        Object obj2;
        float f10;
        jo.p.h(oVar, "bindModel");
        l0.i h10 = iVar.h(-550857154);
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
            i12 |= h10.P(oVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            f.a aVar2 = i13 != 0 ? x0.f.f59359u : obj;
            o9.b bVar = o9.b.f44283a;
            float f11 = 12;
            x0.f j10 = r0.j(v.e.d(aVar2, bVar.a().B(), null, 2, null), m2.g.l(16), m2.g.l(f11));
            a.C0986a c0986a = x0.a.f59327a;
            a.c i14 = c0986a.i();
            h10.x(693286680);
            y.f fVar2 = y.f.f60773a;
            q1.c0 a10 = y0.a(fVar2.f(), i14, h10, 48);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(j10);
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
            h10.x(-678309503);
            a1 a1Var = a1.f60672a;
            f.a aVar3 = x0.f.f59359u;
            x0.f u10 = d1.u(aVar3, m2.g.l(48));
            h10.x(733328855);
            q1.c0 h11 = y.j.h(c0986a.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(o0.e());
            m2.q qVar2 = (m2.q) h10.G(o0.j());
            g2 g2Var2 = (g2) h10.G(o0.n());
            io.a<s1.a> a14 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a15 = q1.w.a(u10);
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
            l9.d.c(oVar.c(), z0.d.a(d1.l(aVar3, 0.0f, 1, null), e0.g.f()), Integer.valueOf(q9.f.N), 0, null, null, h10, 0, 56);
            h10.x(1475697956);
            if (oVar.i()) {
                aVar = aVar3;
                l9.d.c(oVar.a(), lVar.a(d1.v(aVar, m2.g.l(14), m2.g.l(18)), c0986a.n()), null, 0, null, null, h10, 0, 60);
            } else {
                aVar = aVar3;
            }
            h10.O();
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            float f12 = 8;
            g1.a(d1.y(aVar, m2.g.l(f12)), h10, 6);
            x0.f c10 = z0.c(a1Var, aVar, 1.0f, false, 2, null);
            h10.x(-483455358);
            q1.c0 a17 = y.p.a(fVar2.g(), c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar3 = (m2.d) h10.G(o0.e());
            m2.q qVar3 = (m2.q) h10.G(o0.j());
            g2 g2Var3 = (g2) h10.G(o0.n());
            io.a<s1.a> a18 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a19 = q1.w.a(c10);
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
            h2.b(a20, a17, c0787a.d());
            h2.b(a20, dVar3, c0787a.b());
            h2.b(a20, qVar3, c0787a.c());
            h2.b(a20, g2Var3, c0787a.f());
            h10.c();
            a19.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            y.r rVar = y.r.f60913a;
            h10.x(-134321043);
            if (oVar.j()) {
                l9.d.c(oVar.d(), d1.o(aVar, m2.g.l(f11)), null, 0, null, null, h10, 48, 60);
            }
            h10.O();
            f.a aVar4 = aVar;
            w1.c(oVar.g(), d1.n(aVar, 0.0f, 1, null), bVar.a().z(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().h(), h10, 48, 0, 32760);
            g1.a(d1.o(aVar4, m2.g.l(4)), h10, 6);
            i1.a(null, e0.g.c(m2.g.l(20)), bVar.a().w(), bVar.a().B(), null, 0.0f, s0.c.b(h10, 1742307284, true, new a(oVar)), h10, 1572864, 49);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            g1.a(d1.y(aVar4, m2.g.l(f12)), h10, 6);
            x0.f y10 = d1.y(aVar4, m2.g.l((float) TsExtractor.TS_STREAM_TYPE_HDMV_DTS));
            h10.x(-483455358);
            q1.c0 a21 = y.p.a(fVar2.g(), c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar4 = (m2.d) h10.G(o0.e());
            m2.q qVar4 = (m2.q) h10.G(o0.j());
            g2 g2Var4 = (g2) h10.G(o0.n());
            io.a<s1.a> a22 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a23 = q1.w.a(y10);
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
            l0.i a24 = h2.a(h10);
            h2.b(a24, a21, c0787a.d());
            h2.b(a24, dVar4, c0787a.b());
            h2.b(a24, qVar4, c0787a.c());
            h2.b(a24, g2Var4, c0787a.f());
            h10.c();
            a23.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            p h12 = oVar.h();
            h10.x(-134319974);
            if (h12 == null) {
                obj2 = null;
                f10 = 0.0f;
            } else {
                obj2 = null;
                f10 = 0.0f;
                q.a(d1.n(aVar4, 0.0f, 1, null), oVar.h(), h10, 6, 0);
                wn.v vVar = wn.v.f59242a;
            }
            h10.O();
            q.a(d1.n(aVar4, f10, 1, obj2), oVar.f(), h10, 6, 0);
            if (oVar.e() != null) {
                q.a(d1.n(aVar4, f10, 1, obj2), oVar.e(), h10, 6, 0);
                wn.v vVar2 = wn.v.f59242a;
            }
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
            obj = aVar2;
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(obj, oVar, i10, i11));
    }
}
