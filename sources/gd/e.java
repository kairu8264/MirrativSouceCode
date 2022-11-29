package gd;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import c1.c0;
import d2.x;
import h0.w1;
import io.p;
import java.util.Arrays;
import jo.q;
import l0.h2;
import l0.l1;
import l0.n1;
import m2.s;
import q1.w;
import s1.a;
import wn.v;
import x0.a;
import x0.f;
import y.a1;
import y.d1;
import y.f;
import y.g1;
import y.l;
import y.r;
import y.r0;
import y.y0;
import y.z0;

/* loaded from: classes2.dex */
public final class e {

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f33207w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<v> aVar) {
            super(0);
            this.f33207w = aVar;
        }

        public final void a() {
            this.f33207w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements p<l0.i, Integer, v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f33208w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f33209x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f33210y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f33211z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, int i11, int i12, io.a<v> aVar, int i13) {
            super(2);
            this.f33208w = i10;
            this.f33209x = i11;
            this.f33210y = i12;
            this.f33211z = aVar;
            this.A = i13;
        }

        public final void a(l0.i iVar, int i10) {
            e.a(this.f33208w, this.f33209x, this.f33210y, this.f33211z, iVar, this.A | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(int i10, int i11, int i12, io.a<v> aVar, l0.i iVar, int i13) {
        int i14;
        jo.p.h(aVar, "onClickPurchase");
        l0.i h10 = iVar.h(268692431);
        if ((i13 & 14) == 0) {
            i14 = (h10.d(i10) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= h10.d(i11) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i14 |= h10.d(i12) ? 256 : 128;
        }
        if ((i13 & 7168) == 0) {
            i14 |= h10.P(aVar) ? 2048 : 1024;
        }
        if ((i14 & 5851) == 1170 && h10.j()) {
            h10.I();
        } else {
            f.a aVar2 = x0.f.f59359u;
            x0.f d10 = v.e.d(d1.n(aVar2, 0.0f, 1, null), c0.f18634b.f(), null, 2, null);
            h10.x(-483455358);
            y.f fVar = y.f.f60773a;
            f.l g10 = fVar.g();
            a.C0986a c0986a = x0.a.f59327a;
            q1.c0 a10 = y.p.a(g10, c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a12 = w.a(d10);
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
            float f10 = 16;
            float f11 = 24;
            x0.f j10 = r0.j(aVar2, m2.g.l(f10), m2.g.l(f11));
            a.c i15 = c0986a.i();
            h10.x(693286680);
            q1.c0 a14 = y0.a(fVar.f(), i15, h10, 48);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(o0.e());
            m2.q qVar2 = (m2.q) h10.G(o0.j());
            g2 g2Var2 = (g2) h10.G(o0.n());
            io.a<s1.a> a15 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a16 = w.a(j10);
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
            String b10 = v1.f.b(nc.i.text_possession_coin, h10, 0);
            int i16 = nc.b.A;
            w1.c(b10, null, v1.b.a(i16, h10, 0), s.d(14), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 3072, 0, 65522);
            g1.a(z0.c(a1Var, aVar2, 1.0f, false, 2, null), h10, 0);
            v.w.a(v1.e.c(nc.h.f41870d, h10, 0), null, null, null, null, 0.0f, null, h10, 56, 124);
            g1.a(d1.y(aVar2, m2.g.l(8)), h10, 6);
            String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
            jo.p.g(format, "format(this, *args)");
            w1.c(format, null, v1.b.a(i16, h10, 0), s.d(20), null, x.f29149x.h(), null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 199680, 0, 65490);
            g1.a(d1.y(aVar2, m2.g.l(f10)), h10, 6);
            x0.f o10 = d1.o(aVar2, m2.g.l(32));
            e0.f a18 = e0.g.a(50);
            h0.d dVar3 = h0.d.f33749a;
            int i17 = nc.b.J;
            h0.c a19 = dVar3.a(v1.b.a(i17, h10, 0), 0L, 0L, 0L, h10, 32768, 14);
            h10.x(1157296644);
            boolean P = h10.P(aVar);
            Object y10 = h10.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new a(aVar);
                h10.q(y10);
            }
            h10.O();
            h0.f.a((io.a) y10, o10, false, null, null, a18, null, a19, null, h.f33241a.a(), h10, 805306416, 348);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            h0.w.a(r0.k(aVar2, m2.g.l(f10), 0.0f, 2, null), v1.b.a(nc.b.f41797o, h10, 0), 0.0f, 0.0f, h10, 6, 12);
            x0.f j11 = r0.j(aVar2, m2.g.l(f10), m2.g.l(f10));
            a.c i18 = c0986a.i();
            h10.x(693286680);
            q1.c0 a20 = y0.a(fVar.f(), i18, h10, 48);
            h10.x(-1323940314);
            m2.d dVar4 = (m2.d) h10.G(o0.e());
            m2.q qVar3 = (m2.q) h10.G(o0.j());
            g2 g2Var3 = (g2) h10.G(o0.n());
            io.a<s1.a> a21 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a22 = w.a(j11);
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
            h2.b(a23, a20, c0787a.d());
            h2.b(a23, dVar4, c0787a.b());
            h2.b(a23, qVar3, c0787a.c());
            h2.b(a23, g2Var3, c0787a.f());
            h10.c();
            a22.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-678309503);
            w1.c(v1.f.b(nc.i.text_breakdown_possession_coin, h10, 0), null, v1.b.a(i16, h10, 0), s.d(14), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 3072, 0, 65522);
            g1.a(z0.c(a1Var, aVar2, 1.0f, false, 2, null), h10, 0);
            int i19 = nc.i.M4;
            String format2 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
            jo.p.g(format2, "format(this, *args)");
            w1.c(v1.f.c(i19, new Object[]{format2}, h10, 64), null, v1.b.a(i16, h10, 0), s.d(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 3072, 0, 65522);
            float f12 = 4;
            g1.a(d1.y(aVar2, m2.g.l(f12)), h10, 6);
            w1.c("/", null, v1.b.a(i16, h10, 0), s.d(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 3078, 0, 65522);
            g1.a(d1.y(aVar2, m2.g.l(f12)), h10, 6);
            int i20 = nc.i.N4;
            String format3 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1));
            jo.p.g(format3, "format(this, *args)");
            w1.c(v1.f.c(i20, new Object[]{format3}, h10, 64), null, v1.b.a(i17, h10, 0), s.d(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 3072, 0, 65522);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            x0.f l10 = r0.l(v.e.d(d1.n(aVar2, 0.0f, 1, null), v1.b.a(nc.b.I, h10, 0), null, 2, null), m2.g.l(f10), m2.g.l(f11), m2.g.l(f10), m2.g.l(8));
            h10.x(733328855);
            q1.c0 h11 = y.j.h(c0986a.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar5 = (m2.d) h10.G(o0.e());
            m2.q qVar4 = (m2.q) h10.G(o0.j());
            g2 g2Var4 = (g2) h10.G(o0.n());
            io.a<s1.a> a24 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a25 = w.a(l10);
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
            h2.b(a26, h11, c0787a.d());
            h2.b(a26, dVar5, c0787a.b());
            h2.b(a26, qVar4, c0787a.c());
            h2.b(a26, g2Var4, c0787a.f());
            h10.c();
            a25.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            l lVar = l.f60836a;
            w1.c(v1.f.b(nc.i.text_coin_passbook_history, h10, 0), null, v1.b.a(nc.b.C, h10, 0), s.d(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 3072, 0, 65522);
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
        l1 l11 = h10.l();
        if (l11 == null) {
            return;
        }
        l11.a(new b(i10, i11, i12, aVar, i13));
    }
}
