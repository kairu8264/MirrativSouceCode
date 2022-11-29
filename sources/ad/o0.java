package ad;

import com.google.android.exoplayer2.C;
import l0.i;
import s1.a;
import x0.a;
import x0.f;

/* loaded from: classes2.dex */
public final class o0 {

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f1230w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<wn.v> aVar) {
            super(0);
            this.f1230w = aVar;
        }

        public final void a() {
            this.f1230w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f1231w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar) {
            super(0);
            this.f1231w = aVar;
        }

        public final void a() {
            this.f1231w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f1232w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a<wn.v> aVar) {
            super(0);
            this.f1232w = aVar;
        }

        public final void a() {
            this.f1232w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f1233w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f1234x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f1235y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f1236z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a<wn.v> aVar, io.a<wn.v> aVar2, io.a<wn.v> aVar3, int i10) {
            super(2);
            this.f1233w = aVar;
            this.f1234x = aVar2;
            this.f1235y = aVar3;
            this.f1236z = i10;
        }

        public final void a(l0.i iVar, int i10) {
            o0.a(this.f1233w, this.f1234x, this.f1235y, iVar, this.f1236z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(io.a<wn.v> aVar, io.a<wn.v> aVar2, io.a<wn.v> aVar3, l0.i iVar, int i10) {
        int i11;
        jo.p.h(aVar, "onClickClose");
        jo.p.h(aVar2, "onClickRegister");
        jo.p.h(aVar3, "onClickHelp");
        l0.i h10 = iVar.h(-1972550039);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(aVar2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.P(aVar3) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && h10.j()) {
            h10.I();
        } else {
            f.a aVar4 = x0.f.f59359u;
            x0.f j10 = y.d1.j(y.d1.n(aVar4, 0.0f, 1, null), 0.0f, 1, null);
            h10.x(733328855);
            a.C0986a c0986a = x0.a.f59327a;
            q1.c0 h11 = y.j.h(c0986a.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            androidx.compose.ui.platform.g2 g2Var = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a11 = q1.w.a(j10);
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
            l0.i a12 = l0.h2.a(h10);
            l0.h2.b(a12, h11, c0787a.d());
            l0.h2.b(a12, dVar, c0787a.b());
            l0.h2.b(a12, qVar, c0787a.c());
            l0.h2.b(a12, g2Var, c0787a.f());
            h10.c();
            a11.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            y.l lVar = y.l.f60836a;
            x0.f a13 = lVar.a(y.d1.y(y.d1.C(aVar4, null, false, 3, null), m2.g.l(280)), c0986a.e());
            h10.x(733328855);
            q1.c0 h12 = y.j.h(c0986a.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar2 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            androidx.compose.ui.platform.g2 g2Var2 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
            io.a<s1.a> a14 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a15 = q1.w.a(a13);
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
            l0.i a16 = l0.h2.a(h10);
            l0.h2.b(a16, h12, c0787a.d());
            l0.h2.b(a16, dVar2, c0787a.b());
            l0.h2.b(a16, qVar2, c0787a.c());
            l0.h2.b(a16, g2Var2, c0787a.f());
            h10.c();
            a15.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            x0.f C = y.d1.C(y.d1.n(aVar4, 0.0f, 1, null), null, false, 3, null);
            h10.x(-483455358);
            y.f fVar = y.f.f60773a;
            q1.c0 a17 = y.p.a(fVar.g(), c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar3 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar3 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            androidx.compose.ui.platform.g2 g2Var3 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
            io.a<s1.a> a18 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a19 = q1.w.a(C);
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
            l0.i a20 = l0.h2.a(h10);
            l0.h2.b(a20, a17, c0787a.d());
            l0.h2.b(a20, dVar3, c0787a.b());
            l0.h2.b(a20, qVar3, c0787a.c());
            l0.h2.b(a20, g2Var3, c0787a.f());
            h10.c();
            a19.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            y.r rVar = y.r.f60913a;
            float f10 = 14;
            x0.f C2 = y.d1.C(y.d1.n(v.e.d(z0.d.a(y.r0.m(aVar4, 0.0f, m2.g.l(35), 0.0f, 0.0f, 13, null), e0.g.c(m2.g.l(f10))), v1.b.a(nc.b.F, h10, 0), null, 2, null), 0.0f, 1, null), null, false, 3, null);
            h10.x(-483455358);
            q1.c0 a21 = y.p.a(fVar.g(), c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar4 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar4 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            androidx.compose.ui.platform.g2 g2Var4 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
            io.a<s1.a> a22 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a23 = q1.w.a(C2);
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
            l0.i a24 = l0.h2.a(h10);
            l0.h2.b(a24, a21, c0787a.d());
            l0.h2.b(a24, dVar4, c0787a.b());
            l0.h2.b(a24, qVar4, c0787a.c());
            l0.h2.b(a24, g2Var4, c0787a.f());
            h10.c();
            a23.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            f1.d c10 = v1.e.c(nc.d.button_close, h10, 0);
            float f11 = 8;
            x0.f b10 = rVar.b(y.d1.u(y.r0.m(aVar4, 0.0f, m2.g.l(f11), m2.g.l(f11), 0.0f, 9, null), m2.g.l(28)), c0986a.j());
            h10.x(-492369756);
            Object y10 = h10.y();
            i.a aVar5 = l0.i.f39065a;
            if (y10 == aVar5.a()) {
                y10 = x.l.a();
                h10.q(y10);
            }
            h10.O();
            x.m mVar = (x.m) y10;
            h10.x(1157296644);
            boolean P = h10.P(aVar);
            Object y11 = h10.y();
            if (P || y11 == aVar5.a()) {
                y11 = new a(aVar);
                h10.q(y11);
            }
            h10.O();
            v.w.a(c10, null, v.l.c(b10, mVar, null, false, null, null, (io.a) y11, 28, null), null, null, 0.0f, null, h10, 56, 120);
            y.g1.a(y.d1.o(aVar4, m2.g.l(64)), h10, 6);
            x0.f b11 = rVar.b(aVar4, c0986a.g());
            String b12 = v1.f.b(nc.i.text_recommend_identifcation_message, h10, 0);
            o9.b bVar = o9.b.f44283a;
            h0.w1.c(b12, b11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().e().C(new y1.d0(v1.b.a(nc.b.f41794e, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, j2.e.g(j2.e.f37075b.a()), null, 0L, null, 245758, null)), h10, 0, 0, 32764);
            y.g1.a(y.d1.o(aVar4, m2.g.l(24)), h10, 6);
            h0.c a25 = h0.d.f33749a.a(v1.b.a(nc.b.f41804x, h10, 0), 0L, 0L, 0L, h10, 32768, 14);
            e0.f c11 = e0.g.c(m2.g.l(20));
            x0.f b13 = rVar.b(y.d1.o(y.d1.y(aVar4, m2.g.l(200)), m2.g.l(40)), c0986a.g());
            h10.x(1157296644);
            boolean P2 = h10.P(aVar2);
            Object y12 = h10.y();
            if (P2 || y12 == aVar5.a()) {
                y12 = new b(aVar2);
                h10.q(y12);
            }
            h10.O();
            h0.f.a((io.a) y12, b13, false, null, null, c11, null, a25, null, n0.f1216a.a(), h10, C.ENCODING_PCM_32BIT, 348);
            y.g1.a(y.d1.o(aVar4, m2.g.l(f10)), h10, 6);
            x0.f b14 = rVar.b(y.d1.C(y.d1.G(aVar4, null, false, 3, null), null, false, 3, null), c0986a.g());
            h10.x(-492369756);
            Object y13 = h10.y();
            if (y13 == aVar5.a()) {
                y13 = x.l.a();
                h10.q(y13);
            }
            h10.O();
            x.m mVar2 = (x.m) y13;
            h10.x(1157296644);
            boolean P3 = h10.P(aVar3);
            Object y14 = h10.y();
            if (P3 || y14 == aVar5.a()) {
                y14 = new c(aVar3);
                h10.q(y14);
            }
            h10.O();
            x0.f c12 = v.l.c(b14, mVar2, null, false, null, null, (io.a) y14, 28, null);
            h10.x(693286680);
            q1.c0 a26 = y.y0.a(fVar.f(), c0986a.l(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar5 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar5 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            androidx.compose.ui.platform.g2 g2Var5 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
            io.a<s1.a> a27 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a28 = q1.w.a(c12);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a27);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a29 = l0.h2.a(h10);
            l0.h2.b(a29, a26, c0787a.d());
            l0.h2.b(a29, dVar5, c0787a.b());
            l0.h2.b(a29, qVar5, c0787a.c());
            l0.h2.b(a29, g2Var5, c0787a.f());
            h10.c();
            a28.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-678309503);
            y.a1 a1Var = y.a1.f60672a;
            h0.w1.c(v1.f.b(nc.i.text_recommend_identifcation_help, h10, 0), y.d1.G(aVar4, null, false, 3, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().q().C(new y1.d0(v1.b.a(nc.b.f41802v, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, 48, 0, 32764);
            y.g1.a(y.d1.y(aVar4, m2.g.l(5)), h10, 6);
            v.w.a(v1.e.c(nc.d.f41812o, h10, 0), null, y.d1.u(aVar4, m2.g.l(f10)), null, null, 0.0f, null, h10, 440, 120);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            y.g1.a(y.d1.o(aVar4, m2.g.l(30)), h10, 6);
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
            v.w.a(v1.e.c(nc.d.confirm_cash_bonus_history_title_image, h10, 0), null, lVar.a(y.d1.o(y.d1.y(aVar4, m2.g.l(230)), m2.g.l(120)), c0986a.m()), null, null, 0.0f, null, h10, 56, 120);
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
        l0.l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new d(aVar, aVar2, aVar3, i10));
    }
}
