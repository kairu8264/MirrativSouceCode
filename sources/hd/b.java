package hd;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import com.google.android.exoplayer2.C;
import h0.w1;
import jo.q;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import q1.c0;
import q1.w;
import s1.a;
import wn.v;
import x0.a;
import x0.f;
import y.a1;
import y.d1;
import y.f;
import y.g1;
import y.r;
import y.r0;
import y.y0;
import y.z0;
import y1.d0;

/* loaded from: classes2.dex */
public final class b {

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f35351w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<v> aVar) {
            super(0);
            this.f35351w = aVar;
        }

        public final void a() {
            this.f35351w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* renamed from: hd.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0447b extends q implements io.p<l0.i, Integer, v> {
        public final /* synthetic */ String A;
        public final /* synthetic */ String B;
        public final /* synthetic */ String C;
        public final /* synthetic */ io.a<v> D;
        public final /* synthetic */ int E;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f35352w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f35353x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f35354y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f35355z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0447b(String str, String str2, int i10, String str3, String str4, String str5, String str6, io.a<v> aVar, int i11) {
            super(2);
            this.f35352w = str;
            this.f35353x = str2;
            this.f35354y = i10;
            this.f35355z = str3;
            this.A = str4;
            this.B = str5;
            this.C = str6;
            this.D = aVar;
            this.E = i11;
        }

        public final void a(l0.i iVar, int i10) {
            b.a(this.f35352w, this.f35353x, this.f35354y, this.f35355z, this.A, this.B, this.C, this.D, iVar, this.E | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(String str, String str2, int i10, String str3, String str4, String str5, String str6, io.a<v> aVar, l0.i iVar, int i11) {
        int i12;
        l0.i iVar2;
        jo.p.h(str, "titleText");
        jo.p.h(str2, "amountText");
        jo.p.h(str3, "balloonStartTitleText");
        jo.p.h(str4, "balloonStartText");
        jo.p.h(str5, "balloonEndTitleText");
        jo.p.h(str6, "balloonEndText");
        jo.p.h(aVar, "onClickHelpButton");
        l0.i h10 = iVar.h(-2044925367);
        if ((i11 & 14) == 0) {
            i12 = (h10.P(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h10.P(str2) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h10.d(i10) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= h10.P(str3) ? 2048 : 1024;
        }
        if ((i11 & 57344) == 0) {
            i12 |= h10.P(str4) ? 16384 : 8192;
        }
        if ((i11 & 458752) == 0) {
            i12 |= h10.P(str5) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((3670016 & i11) == 0) {
            i12 |= h10.P(str6) ? 1048576 : 524288;
        }
        if ((29360128 & i11) == 0) {
            i12 |= h10.P(aVar) ? 8388608 : 4194304;
        }
        int i13 = i12;
        if ((i13 & 23967451) == 4793490 && h10.j()) {
            h10.I();
            iVar2 = h10;
        } else {
            f.a aVar2 = x0.f.f59359u;
            x0.f k10 = r0.k(v.e.d(d1.C(d1.n(aVar2, 0.0f, 1, null), null, false, 3, null), v1.b.a(nc.b.F, h10, 0), null, 2, null), m2.g.l(16), 0.0f, 2, null);
            h10.x(-483455358);
            y.f fVar = y.f.f60773a;
            f.l g10 = fVar.g();
            a.C0986a c0986a = x0.a.f59327a;
            c0 a10 = y.p.a(g10, c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a12 = w.a(k10);
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
            float f10 = 14;
            g1.a(d1.o(aVar2, m2.g.l(f10)), h10, 6);
            x0.f C = d1.C(d1.n(aVar2, 0.0f, 1, null), null, false, 3, null);
            h10.x(693286680);
            c0 a14 = y0.a(fVar.f(), c0986a.l(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(o0.e());
            m2.q qVar2 = (m2.q) h10.G(o0.j());
            g2 g2Var2 = (g2) h10.G(o0.n());
            io.a<s1.a> a15 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a16 = w.a(C);
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
            x0.f d10 = a1Var.d(d1.C(d1.G(aVar2, null, false, 3, null), null, false, 3, null), c0986a.i());
            h10.x(-492369756);
            Object y10 = h10.y();
            i.a aVar3 = l0.i.f39065a;
            if (y10 == aVar3.a()) {
                y10 = x.l.a();
                h10.q(y10);
            }
            h10.O();
            x.m mVar = (x.m) y10;
            h10.x(1157296644);
            boolean P = h10.P(aVar);
            Object y11 = h10.y();
            if (P || y11 == aVar3.a()) {
                y11 = new a(aVar);
                h10.q(y11);
            }
            h10.O();
            x0.f c10 = v.l.c(d10, mVar, null, false, null, null, (io.a) y11, 28, null);
            h10.x(693286680);
            c0 a18 = y0.a(fVar.f(), c0986a.l(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar3 = (m2.d) h10.G(o0.e());
            m2.q qVar3 = (m2.q) h10.G(o0.j());
            g2 g2Var3 = (g2) h10.G(o0.n());
            io.a<s1.a> a19 = c0787a.a();
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
            h2.b(a21, a18, c0787a.d());
            h2.b(a21, dVar3, c0787a.b());
            h2.b(a21, qVar3, c0787a.c());
            h2.b(a21, g2Var3, c0787a.f());
            h10.c();
            a20.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-678309503);
            o9.b bVar = o9.b.f44283a;
            d0 h11 = bVar.b().h();
            int i14 = nc.b.f41802v;
            w1.c(str, a1Var.d(aVar2, c0986a.i()), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, h11.C(new d0(v1.b.a(i14, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, i13 & 14, 0, 32764);
            g1.a(d1.y(aVar2, m2.g.l(4)), h10, 6);
            v.w.a(v1.e.c(nc.d.f41812o, h10, 0), null, a1Var.d(d1.u(aVar2, m2.g.l(f10)), c0986a.i()), null, null, 0.0f, null, h10, 56, 120);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            g1.a(z0.c(a1Var, d1.y(aVar2, m2.g.l(0)), 1.0f, false, 2, null), h10, 0);
            w1.c(str2, a1Var.d(aVar2, c0986a.i()), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().b().C(new d0(v1.b.a(i14, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, (i13 >> 3) & 14, 0, 32764);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            int i15 = i13 >> 3;
            hd.a.a(d1.C(d1.G(r0.m(aVar2, 0.0f, m2.g.l(2), 0.0f, 0.0f, 13, null), null, false, 3, null), null, false, 3, null), i10, str3, str4, str5, str6, h10, (i15 & 112) | 6 | (i15 & 896) | (i15 & 7168) | (i15 & 57344) | (i15 & 458752));
            iVar2 = h10;
            g1.a(d1.o(aVar2, m2.g.l(f10)), iVar2, 6);
            iVar2.O();
            iVar2.O();
            iVar2.s();
            iVar2.O();
            iVar2.O();
        }
        l1 l10 = iVar2.l();
        if (l10 == null) {
            return;
        }
        l10.a(new C0447b(str, str2, i10, str3, str4, str5, str6, aVar, i11));
    }
}
