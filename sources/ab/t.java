package ab;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import java.util.List;
import l0.c2;
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

/* loaded from: classes2.dex */
public final class t {

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ io.l<String, wn.v> A;
        public final /* synthetic */ io.a<wn.v> B;
        public final /* synthetic */ io.a<wn.v> C;
        public final /* synthetic */ io.a<wn.v> D;
        public final /* synthetic */ io.a<wn.v> E;
        public final /* synthetic */ int F;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c2<Integer> f835w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c2<ha.a> f836x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i f837y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ List<k> f838z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(c2<Integer> c2Var, c2<? extends ha.a> c2Var2, i iVar, List<? extends k> list, io.l<? super String, wn.v> lVar, io.a<wn.v> aVar, io.a<wn.v> aVar2, io.a<wn.v> aVar3, io.a<wn.v> aVar4, int i10) {
            super(2);
            this.f835w = c2Var;
            this.f836x = c2Var2;
            this.f837y = iVar;
            this.f838z = list;
            this.A = lVar;
            this.B = aVar;
            this.C = aVar2;
            this.D = aVar3;
            this.E = aVar4;
            this.F = i10;
        }

        public final void a(l0.i iVar, int i10) {
            t.a(this.f835w, this.f836x, this.f837y, this.f838z, this.A, this.B, this.C, this.D, this.E, iVar, this.F | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(c2<Integer> c2Var, c2<? extends ha.a> c2Var2, i iVar, List<? extends k> list, io.l<? super String, wn.v> lVar, io.a<wn.v> aVar, io.a<wn.v> aVar2, io.a<wn.v> aVar3, io.a<wn.v> aVar4, l0.i iVar2, int i10) {
        jo.p.h(c2Var, "orientation");
        jo.p.h(c2Var2, "statusState");
        jo.p.h(iVar, "headerBindModel");
        jo.p.h(list, "itemBindModels");
        jo.p.h(lVar, "onClickPurchase");
        jo.p.h(aVar, "onClickClose");
        jo.p.h(aVar2, "onClickRetry");
        jo.p.h(aVar3, "onClickNotice");
        jo.p.h(aVar4, "onClickRestore");
        l0.i h10 = iVar2.h(1889345376);
        if (c2Var.getValue().intValue() == 1) {
            h10.x(1381453726);
            f.a aVar5 = x0.f.f59359u;
            float f10 = 20;
            x0.f l10 = r0.l(d1.n(aVar5, 0.0f, 1, null), m2.g.l(f10), m2.g.l(50), m2.g.l(f10), m2.g.l(26));
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
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(l10);
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
            x0.f c10 = y.q.c(y.r.f60913a, d1.n(aVar5, 0.0f, 1, null), 1.0f, false, 2, null);
            h10.x(733328855);
            c0 h11 = y.j.h(c0986a.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(o0.e());
            m2.q qVar2 = (m2.q) h10.G(o0.j());
            g2 g2Var2 = (g2) h10.G(o0.n());
            io.a<s1.a> a14 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a15 = q1.w.a(c10);
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
            y.l lVar2 = y.l.f60836a;
            int i11 = i10 >> 3;
            c.a(c2Var2, iVar, list, lVar, aVar, aVar2, h10, (i11 & 14) | 512 | (i11 & 112) | (i11 & 7168) | (57344 & i11) | (i11 & 458752));
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            g1.a(d1.o(aVar5, m2.g.l(16)), h10, 6);
            int i12 = i10 >> 21;
            o.a(aVar3, aVar4, h10, (i12 & 112) | (i12 & 14));
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            h10.O();
        } else {
            h10.x(1381454599);
            f.a aVar6 = x0.f.f59359u;
            float f11 = 32;
            float f12 = 16;
            x0.f l11 = r0.l(d1.n(aVar6, 0.0f, 1, null), m2.g.l(42), m2.g.l(f11), m2.g.l(f12), m2.g.l(f11));
            h10.x(693286680);
            f.d f13 = y.f.f60773a.f();
            a.C0986a c0986a2 = x0.a.f59327a;
            c0 a17 = y0.a(f13, c0986a2.l(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar3 = (m2.d) h10.G(o0.e());
            m2.q qVar3 = (m2.q) h10.G(o0.j());
            g2 g2Var3 = (g2) h10.G(o0.n());
            a.C0787a c0787a2 = s1.a.f51802o;
            io.a<s1.a> a18 = c0787a2.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a19 = q1.w.a(l11);
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
            h2.b(a20, a17, c0787a2.d());
            h2.b(a20, dVar3, c0787a2.b());
            h2.b(a20, qVar3, c0787a2.c());
            h2.b(a20, g2Var3, c0787a2.f());
            h10.c();
            a19.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-678309503);
            a1 a1Var = a1.f60672a;
            x0.f c11 = z0.c(a1Var, d1.j(aVar6, 0.0f, 1, null), 0.58f, false, 2, null);
            h10.x(733328855);
            c0 h12 = y.j.h(c0986a2.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar4 = (m2.d) h10.G(o0.e());
            m2.q qVar4 = (m2.q) h10.G(o0.j());
            g2 g2Var4 = (g2) h10.G(o0.n());
            io.a<s1.a> a21 = c0787a2.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a22 = q1.w.a(c11);
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
            h2.b(a23, h12, c0787a2.d());
            h2.b(a23, dVar4, c0787a2.b());
            h2.b(a23, qVar4, c0787a2.c());
            h2.b(a23, g2Var4, c0787a2.f());
            h10.c();
            a22.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            y.l lVar3 = y.l.f60836a;
            int i13 = i10 >> 3;
            c.a(c2Var2, iVar, list, lVar, aVar, aVar2, h10, (i13 & 14) | 512 | (i13 & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752));
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            g1.a(d1.y(aVar6, m2.g.l(f12)), h10, 6);
            x0.f c12 = z0.c(a1Var, d1.j(aVar6, 0.0f, 1, null), 0.58f, false, 2, null);
            x0.a e10 = c0986a2.e();
            h10.x(733328855);
            c0 h13 = y.j.h(e10, false, h10, 6);
            h10.x(-1323940314);
            m2.d dVar5 = (m2.d) h10.G(o0.e());
            m2.q qVar5 = (m2.q) h10.G(o0.j());
            g2 g2Var5 = (g2) h10.G(o0.n());
            io.a<s1.a> a24 = c0787a2.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a25 = q1.w.a(c12);
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
            h2.b(a26, h13, c0787a2.d());
            h2.b(a26, dVar5, c0787a2.b());
            h2.b(a26, qVar5, c0787a2.c());
            h2.b(a26, g2Var5, c0787a2.f());
            h10.c();
            a25.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            int i14 = i10 >> 21;
            o.a(aVar3, aVar4, h10, (i14 & 112) | (i14 & 14));
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
        }
        l1 l12 = h10.l();
        if (l12 == null) {
            return;
        }
        l12.a(new a(c2Var, c2Var2, iVar, list, lVar, aVar, aVar2, aVar3, aVar4, i10));
    }
}
