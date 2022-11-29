package hd;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import com.google.android.exoplayer2.C;
import h0.w1;
import jo.q;
import l0.h2;
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
import y.g1;
import y.r0;
import y.y0;
import y1.d0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: hd.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0446a extends q implements io.p<l0.i, Integer, v> {
        public final /* synthetic */ String A;
        public final /* synthetic */ String B;
        public final /* synthetic */ int C;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f35347w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f35348x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f35349y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f35350z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0446a(x0.f fVar, int i10, String str, String str2, String str3, String str4, int i11) {
            super(2);
            this.f35347w = fVar;
            this.f35348x = i10;
            this.f35349y = str;
            this.f35350z = str2;
            this.A = str3;
            this.B = str4;
            this.C = i11;
        }

        public final void a(l0.i iVar, int i10) {
            a.a(this.f35347w, this.f35348x, this.f35349y, this.f35350z, this.A, this.B, iVar, this.C | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(x0.f fVar, int i10, String str, String str2, String str3, String str4, l0.i iVar, int i11) {
        int i12;
        l0.i iVar2;
        jo.p.h(fVar, "modifier");
        jo.p.h(str, "startTitleText");
        jo.p.h(str2, "startText");
        jo.p.h(str3, "endTitleText");
        jo.p.h(str4, "endText");
        l0.i h10 = iVar.h(-1858127300);
        if ((i11 & 14) == 0) {
            i12 = (h10.P(fVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h10.d(i10) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h10.P(str) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= h10.P(str2) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= h10.P(str3) ? 16384 : 8192;
        }
        if ((458752 & i11) == 0) {
            i12 |= h10.P(str4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i13 = i12;
        if ((i13 & 374491) == 74898 && h10.j()) {
            h10.I();
            iVar2 = h10;
        } else {
            o9.b bVar = o9.b.f44283a;
            d0 s10 = bVar.b().s();
            int i14 = nc.b.f41802v;
            d0 C = s10.C(new d0(v1.b.a(i14, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null));
            d0 C2 = bVar.b().t().C(new d0(v1.b.a(i14, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null));
            int i15 = i13 & 14;
            h10.x(733328855);
            a.C0986a c0986a = x0.a.f59327a;
            int i16 = i15 >> 3;
            c0 h11 = y.j.h(c0986a.o(), false, h10, (i16 & 112) | (i16 & 14));
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a11 = w.a(fVar);
            int i17 = ((((i15 << 3) & 112) << 9) & 7168) | 6;
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
            a11.s0(n1.a(n1.b(h10)), h10, Integer.valueOf((i17 >> 3) & 112));
            h10.x(2058660585);
            h10.x(-2137368960);
            if (((i17 >> 9) & 14 & 11) == 2 && h10.j()) {
                h10.I();
            } else {
                y.l lVar = y.l.f60836a;
                int i18 = ((i15 >> 6) & 112) | 6;
                if ((i18 & 14) == 0) {
                    i18 |= h10.P(lVar) ? 4 : 2;
                }
                if ((i18 & 91) == 18 && h10.j()) {
                    h10.I();
                } else {
                    f1.d c10 = v1.e.c(nc.d.bg_cash_bonus_history_balloon, h10, 0);
                    f.a aVar = x0.f.f59359u;
                    v.w.a(c10, null, lVar.c(aVar), null, q1.f.f48569a.b(), 0.0f, null, h10, 24632, 104);
                    float f10 = 8;
                    x0.f l10 = r0.l(aVar, m2.g.l(f10), m2.g.l(7), m2.g.l(f10), m2.g.l(3));
                    h10.x(693286680);
                    c0 a13 = y0.a(y.f.f60773a.f(), c0986a.l(), h10, 0);
                    h10.x(-1323940314);
                    m2.d dVar2 = (m2.d) h10.G(o0.e());
                    m2.q qVar2 = (m2.q) h10.G(o0.j());
                    g2 g2Var2 = (g2) h10.G(o0.n());
                    io.a<s1.a> a14 = c0787a.a();
                    io.q<n1<s1.a>, l0.i, Integer, v> a15 = w.a(l10);
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
                    h10.x(-678309503);
                    a1 a1Var = a1.f60672a;
                    v.w.a(v1.e.c(i10, h10, (i13 >> 3) & 14), null, d1.u(aVar, m2.g.l(16)), null, null, 0.0f, null, h10, 440, 120);
                    g1.a(d1.y(aVar, m2.g.l(6)), h10, 6);
                    w1.c(str, a1Var.d(aVar, c0986a.i()), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C, h10, (i13 >> 6) & 14, 0, 32764);
                    w1.c(str2, a1Var.d(aVar, c0986a.i()), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C2, h10, (i13 >> 9) & 14, 0, 32764);
                    g1.a(d1.y(aVar, m2.g.l(f10)), h10, 6);
                    iVar2 = h10;
                    w1.c(str3, a1Var.d(aVar, c0986a.i()), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C, iVar2, (i13 >> 12) & 14, 0, 32764);
                    w1.c(str4, a1Var.d(aVar, c0986a.i()), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C2, iVar2, (i13 >> 15) & 14, 0, 32764);
                    iVar2.O();
                    iVar2.O();
                    iVar2.s();
                    iVar2.O();
                    iVar2.O();
                    iVar2.O();
                    iVar2.O();
                    iVar2.s();
                    iVar2.O();
                    iVar2.O();
                }
            }
            iVar2 = h10;
            iVar2.O();
            iVar2.O();
            iVar2.s();
            iVar2.O();
            iVar2.O();
        }
        l1 l11 = iVar2.l();
        if (l11 == null) {
            return;
        }
        l11.a(new C0446a(fVar, i10, str, str2, str3, str4, i11));
    }
}
