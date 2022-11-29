package w9;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import d2.x;
import h0.w1;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import q1.c0;
import q1.w;
import s1.a;
import x0.a;
import x0.f;
import y.a1;
import y.d1;
import y.e0;
import y.f;
import y.g1;
import y.r0;
import y.y0;
import y.z0;

/* loaded from: classes.dex */
public final class i {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f58308w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.q<y.q, l0.i, Integer, wn.v> f58309x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f58310y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f58311z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x0.f fVar, io.q<? super y.q, ? super l0.i, ? super Integer, wn.v> qVar, int i10, int i11) {
            super(2);
            this.f58308w = fVar;
            this.f58309x = qVar;
            this.f58310y = i10;
            this.f58311z = i11;
        }

        public final void a(l0.i iVar, int i10) {
            i.a(this.f58308w, this.f58309x, iVar, this.f58310y | 1, this.f58311z);
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
        public final /* synthetic */ int f58312w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(2);
            this.f58312w = i10;
        }

        public final void a(l0.i iVar, int i10) {
            i.b(iVar, this.f58312w | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.q<y.k, l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f58313w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f58314x;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.a<wn.v> f58315w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(io.a<wn.v> aVar) {
                super(0);
                this.f58315w = aVar;
            }

            public final void a() {
                this.f58315w.invoke();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a<wn.v> aVar, int i10) {
            super(3);
            this.f58313w = aVar;
            this.f58314x = i10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.Object, l0.i] */
        public final void a(y.k kVar, l0.i iVar, int i10) {
            jo.p.h(kVar, "$this$RankingFrame");
            if ((i10 & 81) == 16 && iVar.j()) {
                iVar.I();
                return;
            }
            a.b g10 = x0.a.f59327a.g();
            io.a<wn.v> aVar = this.f58313w;
            iVar.x(-483455358);
            f.a aVar2 = x0.f.f59359u;
            c0 a10 = y.p.a(y.f.f60773a.g(), g10, iVar, 48);
            iVar.x(-1323940314);
            m2.d dVar = (m2.d) iVar.G(o0.e());
            m2.q qVar = (m2.q) iVar.G(o0.j());
            g2 g2Var = (g2) iVar.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a12 = w.a(aVar2);
            if (!(iVar.k() instanceof l0.e)) {
                l0.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.r(a11);
            } else {
                iVar.o();
            }
            iVar.E();
            l0.i a13 = h2.a(iVar);
            h2.b(a13, a10, c0787a.d());
            h2.b(a13, dVar, c0787a.b());
            h2.b(a13, qVar, c0787a.c());
            h2.b(a13, g2Var, c0787a.f());
            iVar.c();
            a12.s0(n1.a(n1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-1163856341);
            y.r rVar = y.r.f60913a;
            g1.a(d1.o(aVar2, m2.g.l(12)), iVar, 6);
            h0.w.a(r0.k(aVar2, m2.g.l(8), 0.0f, 2, null), v1.b.a(q9.d.f48808l, iVar, 0), 0.0f, 0.0f, iVar, 6, 12);
            g1.a(d1.o(aVar2, m2.g.l(20)), iVar, 6);
            x0.f v10 = d1.v(aVar2, m2.g.l(200), m2.g.l(40));
            e0.f c10 = e0.g.c(m2.g.l(24));
            v.h a14 = v.i.a(m2.g.l(2), v1.b.a(q9.d.f48817u, iVar, 0));
            h0.c h10 = h0.d.f33749a.h(0L, v1.b.a(q9.d.G, iVar, 0), 0L, iVar, 4096, 5);
            iVar.x(1157296644);
            boolean P = iVar.P(aVar);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new a(aVar);
                iVar.q(y10);
            }
            iVar.O();
            h0.f.c(y10, v10, false, null, null, c10, a14, h10, null, w9.a.f58254a.c(), iVar, 805306416, 284);
            iVar.O();
            iVar.O();
            iVar.s();
            iVar.O();
            iVar.O();
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(y.k kVar, l0.i iVar, Integer num) {
            a(kVar, iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f58316w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f58317x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f58318y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f58319z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(x0.f fVar, io.a<wn.v> aVar, int i10, int i11) {
            super(2);
            this.f58316w = fVar;
            this.f58317x = aVar;
            this.f58318y = i10;
            this.f58319z = i11;
        }

        public final void a(l0.i iVar, int i10) {
            i.c(this.f58316w, this.f58317x, iVar, this.f58318y | 1, this.f58319z);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.q<y.q, l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f58320w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(x0.f fVar) {
            super(3);
            this.f58320w = fVar;
        }

        public final void a(y.q qVar, l0.i iVar, int i10) {
            jo.p.h(qVar, "$this$BackgroundView");
            if ((i10 & 81) != 16 || !iVar.j()) {
                float f10 = 30;
                i.h(d1.o(this.f58320w, m2.g.l(f10)), false, true, w9.a.f58254a.d(), iVar, 3456, 2);
                g1.a(d1.o(x0.f.f59359u, m2.g.l(f10)), iVar, 6);
                return;
            }
            iVar.I();
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(y.q qVar, l0.i iVar, Integer num) {
            a(qVar, iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f58321w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f58322x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f58323y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(x0.f fVar, int i10, int i11) {
            super(2);
            this.f58321w = fVar;
            this.f58322x = i10;
            this.f58323y = i11;
        }

        public final void a(l0.i iVar, int i10) {
            i.d(this.f58321w, iVar, this.f58322x | 1, this.f58323y);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.q<y.q, l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f58324w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(x0.f fVar) {
            super(3);
            this.f58324w = fVar;
        }

        public final void a(y.q qVar, l0.i iVar, int i10) {
            jo.p.h(qVar, "$this$BackgroundView");
            if ((i10 & 81) == 16 && iVar.j()) {
                iVar.I();
                return;
            }
            g1.a(d1.o(x0.f.f59359u, m2.g.l(12)), iVar, 6);
            i.h(d1.o(this.f58324w, m2.g.l(30)), true, false, w9.a.f58254a.b(), iVar, 3120, 4);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(y.q qVar, l0.i iVar, Integer num) {
            a(qVar, iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f58325w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f58326x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f58327y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(x0.f fVar, int i10, int i11) {
            super(2);
            this.f58325w = fVar;
            this.f58326x = i10;
            this.f58327y = i11;
        }

        public final void a(l0.i iVar, int i10) {
            i.e(this.f58325w, iVar, this.f58326x | 1, this.f58327y);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* renamed from: w9.i$i  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0961i extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f58328w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f58329x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f58330y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0961i(x0.f fVar, int i10, int i11) {
            super(2);
            this.f58328w = fVar;
            this.f58329x = i10;
            this.f58330y = i11;
        }

        public final void a(l0.i iVar, int i10) {
            i.f(this.f58328w, iVar, this.f58329x | 1, this.f58330y);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.q<y.k, l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ w9.h f58331w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<Integer, wn.v> f58332x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f58333y;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.l<Integer, wn.v> f58334w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ w9.h f58335x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(io.l<? super Integer, wn.v> lVar, w9.h hVar) {
                super(0);
                this.f58334w = lVar;
                this.f58335x = hVar;
            }

            public final void a() {
                this.f58334w.invoke(Integer.valueOf(this.f58335x.i()));
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(w9.h hVar, io.l<? super Integer, wn.v> lVar, int i10) {
            super(3);
            this.f58331w = hVar;
            this.f58332x = lVar;
            this.f58333y = i10;
        }

        public final void a(y.k kVar, l0.i iVar, int i10) {
            int i11;
            int i12;
            io.l<Integer, wn.v> lVar;
            int i13;
            jo.p.h(kVar, "$this$RankingFrame");
            if ((i10 & 81) == 16 && iVar.j()) {
                iVar.I();
                return;
            }
            f.a aVar = x0.f.f59359u;
            float f10 = 8;
            x0.f k10 = r0.k(aVar, m2.g.l(f10), 0.0f, 2, null);
            w9.h hVar = this.f58331w;
            io.l<Integer, wn.v> lVar2 = this.f58332x;
            iVar.x(-483455358);
            y.f fVar = y.f.f60773a;
            f.l g10 = fVar.g();
            a.C0986a c0986a = x0.a.f59327a;
            c0 a10 = y.p.a(g10, c0986a.k(), iVar, 0);
            iVar.x(-1323940314);
            m2.d dVar = (m2.d) iVar.G(o0.e());
            m2.q qVar = (m2.q) iVar.G(o0.j());
            g2 g2Var = (g2) iVar.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a12 = w.a(k10);
            if (!(iVar.k() instanceof l0.e)) {
                l0.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.r(a11);
            } else {
                iVar.o();
            }
            iVar.E();
            l0.i a13 = h2.a(iVar);
            h2.b(a13, a10, c0787a.d());
            h2.b(a13, dVar, c0787a.b());
            h2.b(a13, qVar, c0787a.c());
            h2.b(a13, g2Var, c0787a.f());
            iVar.c();
            a12.s0(n1.a(n1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-1163856341);
            y.r rVar = y.r.f60913a;
            iVar.x(473203469);
            if (hVar.l()) {
                i13 = -1323940314;
                i11 = 0;
                i12 = 6;
                lVar = lVar2;
                h0.w.a(r0.m(aVar, m2.g.l(50), 0.0f, 0.0f, 0.0f, 14, null), v1.b.a(q9.d.f48808l, iVar, 0), 0.0f, 0.0f, iVar, 6, 12);
                g1.a(d1.o(aVar, m2.g.l(f10)), iVar, 6);
            } else {
                i11 = 0;
                i12 = 6;
                lVar = lVar2;
                i13 = -1323940314;
            }
            iVar.O();
            a.c i14 = c0986a.i();
            iVar.x(693286680);
            c0 a14 = y0.a(fVar.f(), i14, iVar, 48);
            iVar.x(i13);
            m2.d dVar2 = (m2.d) iVar.G(o0.e());
            m2.q qVar2 = (m2.q) iVar.G(o0.j());
            g2 g2Var2 = (g2) iVar.G(o0.n());
            io.a<s1.a> a15 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a16 = w.a(aVar);
            if (!(iVar.k() instanceof l0.e)) {
                l0.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.r(a15);
            } else {
                iVar.o();
            }
            iVar.E();
            l0.i a17 = h2.a(iVar);
            h2.b(a17, a14, c0787a.d());
            h2.b(a17, dVar2, c0787a.b());
            h2.b(a17, qVar2, c0787a.c());
            h2.b(a17, g2Var2, c0787a.f());
            iVar.c();
            a16.s0(n1.a(n1.b(iVar)), iVar, Integer.valueOf(i11));
            iVar.x(2058660585);
            iVar.x(-678309503);
            a1 a1Var = a1.f60672a;
            float f11 = 4;
            g1.a(d1.y(aVar, m2.g.l(f11)), iVar, i12);
            float f12 = 42;
            x0.f y10 = d1.y(aVar, m2.g.l(f12));
            a.b g11 = c0986a.g();
            iVar.x(-483455358);
            c0 a18 = y.p.a(fVar.g(), g11, iVar, 48);
            iVar.x(i13);
            m2.d dVar3 = (m2.d) iVar.G(o0.e());
            m2.q qVar3 = (m2.q) iVar.G(o0.j());
            g2 g2Var3 = (g2) iVar.G(o0.n());
            io.a<s1.a> a19 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a20 = w.a(y10);
            if (!(iVar.k() instanceof l0.e)) {
                l0.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.r(a19);
            } else {
                iVar.o();
            }
            iVar.E();
            l0.i a21 = h2.a(iVar);
            h2.b(a21, a18, c0787a.d());
            h2.b(a21, dVar3, c0787a.b());
            h2.b(a21, qVar3, c0787a.c());
            h2.b(a21, g2Var3, c0787a.f());
            iVar.c();
            a20.s0(n1.a(n1.b(iVar)), iVar, Integer.valueOf(i11));
            iVar.x(2058660585);
            iVar.x(-1163856341);
            String e10 = hVar.e();
            long a22 = v1.b.a(hVar.f(), iVar, i11);
            x.a aVar2 = x.f29149x;
            int i15 = i12;
            l9.a.b(e10, hVar.g(), hVar.g() - i12, null, a22, aVar2.i(), null, iVar, 196608, 72);
            iVar.O();
            iVar.O();
            iVar.s();
            iVar.O();
            iVar.O();
            g1.a(d1.y(aVar, m2.g.l(f11)), iVar, i15);
            iVar.x(733328855);
            c0 h10 = y.j.h(c0986a.o(), false, iVar, 0);
            iVar.x(-1323940314);
            m2.d dVar4 = (m2.d) iVar.G(o0.e());
            m2.q qVar4 = (m2.q) iVar.G(o0.j());
            g2 g2Var4 = (g2) iVar.G(o0.n());
            io.a<s1.a> a23 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a24 = w.a(aVar);
            if (!(iVar.k() instanceof l0.e)) {
                l0.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.r(a23);
            } else {
                iVar.o();
            }
            iVar.E();
            l0.i a25 = h2.a(iVar);
            h2.b(a25, h10, c0787a.d());
            h2.b(a25, dVar4, c0787a.b());
            h2.b(a25, qVar4, c0787a.c());
            h2.b(a25, g2Var4, c0787a.f());
            iVar.c();
            a24.s0(n1.a(n1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-2137368960);
            y.l lVar3 = y.l.f60836a;
            x0.f a26 = z0.d.a(d1.u(aVar, m2.g.l(f12)), e0.g.f());
            iVar.x(-492369756);
            Object y11 = iVar.y();
            i.a aVar3 = l0.i.f39065a;
            if (y11 == aVar3.a()) {
                y11 = x.l.a();
                iVar.q(y11);
            }
            iVar.O();
            x.m mVar = (x.m) y11;
            iVar.x(511388516);
            io.l<Integer, wn.v> lVar4 = lVar;
            boolean P = iVar.P(lVar4) | iVar.P(hVar);
            Object y12 = iVar.y();
            if (P || y12 == aVar3.a()) {
                y12 = new a(lVar4, hVar);
                iVar.q(y12);
            }
            iVar.O();
            l9.d.c(hVar.b(), v.l.c(a26, mVar, null, false, null, null, (io.a) y12, 28, null), Integer.valueOf(q9.f.N), 0, null, null, iVar, 0, 56);
            iVar.x(-773967816);
            if (hVar.j()) {
                l9.d.c(hVar.a(), lVar3.a(d1.u(aVar, m2.g.l(13)), c0986a.n()), null, 0, null, null, iVar, 0, 60);
            }
            iVar.O();
            iVar.O();
            iVar.O();
            iVar.s();
            iVar.O();
            iVar.O();
            g1.a(d1.y(aVar, m2.g.l(f11)), iVar, i15);
            x0.f c10 = z0.c(a1Var, aVar, 1.0f, false, 2, null);
            iVar.x(-483455358);
            c0 a27 = y.p.a(fVar.g(), c0986a.k(), iVar, 0);
            iVar.x(-1323940314);
            m2.d dVar5 = (m2.d) iVar.G(o0.e());
            m2.q qVar5 = (m2.q) iVar.G(o0.j());
            g2 g2Var5 = (g2) iVar.G(o0.n());
            io.a<s1.a> a28 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a29 = w.a(c10);
            if (!(iVar.k() instanceof l0.e)) {
                l0.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.r(a28);
            } else {
                iVar.o();
            }
            iVar.E();
            l0.i a30 = h2.a(iVar);
            h2.b(a30, a27, c0787a.d());
            h2.b(a30, dVar5, c0787a.b());
            h2.b(a30, qVar5, c0787a.c());
            h2.b(a30, g2Var5, c0787a.f());
            iVar.c();
            a29.s0(n1.a(n1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-1163856341);
            iVar.x(1218834241);
            if (hVar.k()) {
                l9.d.c(hVar.c(), d1.o(aVar, m2.g.l(12)), null, 0, null, null, iVar, 48, 60);
                g1.a(d1.o(aVar, m2.g.l(2)), iVar, i15);
            }
            iVar.O();
            w1.c(hVar.d(), null, v1.b.a(q9.d.f48804b, iVar, 0), m2.s.d(12), null, aVar2.h(), null, 0L, null, null, 0L, j2.k.f37107a.b(), false, 1, null, null, iVar, 199680, 3120, 55250);
            w1.c(hVar.h(), d1.n(aVar, 0.0f, 1, null), v1.b.a(q9.d.f48818v, iVar, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, o9.b.f44283a.b().f(), iVar, 48, 0, 32760);
            iVar.O();
            iVar.O();
            iVar.s();
            iVar.O();
            iVar.O();
            iVar.O();
            iVar.O();
            iVar.s();
            iVar.O();
            iVar.O();
            g1.a(d1.o(aVar, m2.g.l(f10)), iVar, 6);
            iVar.O();
            iVar.O();
            iVar.s();
            iVar.O();
            iVar.O();
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(y.k kVar, l0.i iVar, Integer num) {
            a(kVar, iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f58336w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ w9.h f58337x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<Integer, wn.v> f58338y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f58339z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(x0.f fVar, w9.h hVar, io.l<? super Integer, wn.v> lVar, int i10, int i11) {
            super(2);
            this.f58336w = fVar;
            this.f58337x = hVar;
            this.f58338y = lVar;
            this.f58339z = i10;
            this.A = i11;
        }

        public final void a(l0.i iVar, int i10) {
            i.g(this.f58336w, this.f58337x, this.f58338y, iVar, this.f58339z | 1, this.A);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.q<y.q, l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f58340w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f58341x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.q<y.k, l0.i, Integer, wn.v> f58342y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f58343z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(boolean z10, boolean z11, io.q<? super y.k, ? super l0.i, ? super Integer, wn.v> qVar, int i10) {
            super(3);
            this.f58340w = z10;
            this.f58341x = z11;
            this.f58342y = qVar;
            this.f58343z = i10;
        }

        public final void a(y.q qVar, l0.i iVar, int i10) {
            int i11;
            jo.p.h(qVar, "$this$BackgroundView");
            if ((i10 & 81) == 16 && iVar.j()) {
                iVar.I();
                return;
            }
            f.a aVar = x0.f.f59359u;
            x0.f k10 = r0.k(d1.n(aVar, 0.0f, 1, null), m2.g.l(16), 0.0f, 2, null);
            x0.a e10 = x0.a.f59327a.e();
            boolean z10 = this.f58340w;
            boolean z11 = this.f58341x;
            io.q<y.k, l0.i, Integer, wn.v> qVar2 = this.f58342y;
            int i12 = this.f58343z;
            iVar.x(733328855);
            c0 h10 = y.j.h(e10, false, iVar, 6);
            iVar.x(-1323940314);
            m2.d dVar = (m2.d) iVar.G(o0.e());
            m2.q qVar3 = (m2.q) iVar.G(o0.j());
            g2 g2Var = (g2) iVar.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a11 = w.a(k10);
            if (!(iVar.k() instanceof l0.e)) {
                l0.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.r(a10);
            } else {
                iVar.o();
            }
            iVar.E();
            l0.i a12 = h2.a(iVar);
            h2.b(a12, h10, c0787a.d());
            h2.b(a12, dVar, c0787a.b());
            h2.b(a12, qVar3, c0787a.c());
            h2.b(a12, g2Var, c0787a.f());
            iVar.c();
            a11.s0(n1.a(n1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-2137368960);
            y.l lVar = y.l.f60836a;
            float f10 = 2;
            y.j.a(v.e.c(r0.l(d1.l(aVar, 0.0f, 1, null), m2.g.l(f10), m2.g.l(z10 ? 4 : 0), m2.g.l(f10), m2.g.l(z11 ? 4 : 0)), v1.b.a(q9.d.G, iVar, 0), e0.g.d(m2.g.l(z10 ? 24 : 0), m2.g.l(z10 ? 24 : 0), m2.g.l(z11 ? 24 : 0), m2.g.l(z11 ? 24 : 0))), iVar, 0);
            x0.f l10 = d1.l(aVar, 0.0f, 1, null);
            if (z10) {
                i11 = q9.f.bg_emomo_quest_ranking_frame_top;
            } else if (z11) {
                i11 = q9.f.bg_emomo_quest_ranking_frame_bottom;
            } else {
                i11 = q9.f.bg_emomo_quest_ranking_frame_middle;
            }
            l9.d.a(i11, l10, null, iVar, 48, 4);
            qVar2.s0(lVar, iVar, Integer.valueOf(6 | ((i12 >> 6) & 112)));
            iVar.O();
            iVar.O();
            iVar.s();
            iVar.O();
            iVar.O();
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(y.q qVar, l0.i iVar, Integer num) {
            a(qVar, iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f58344w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f58345x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f58346y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.q<y.k, l0.i, Integer, wn.v> f58347z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(x0.f fVar, boolean z10, boolean z11, io.q<? super y.k, ? super l0.i, ? super Integer, wn.v> qVar, int i10, int i11) {
            super(2);
            this.f58344w = fVar;
            this.f58345x = z10;
            this.f58346y = z11;
            this.f58347z = qVar;
            this.A = i10;
            this.B = i11;
        }

        public final void a(l0.i iVar, int i10) {
            i.h(this.f58344w, this.f58345x, this.f58346y, this.f58347z, iVar, this.A | 1, this.B);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(x0.f fVar, io.q<? super y.q, ? super l0.i, ? super Integer, wn.v> qVar, l0.i iVar, int i10, int i11) {
        int i12;
        l0.i h10 = iVar.h(376946362);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (h10.P(fVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= h10.P(qVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            if (i13 != 0) {
                fVar = x0.f.f59359u;
            }
            x0.f n10 = d1.n(v.e.d(fVar, v1.b.a(q9.d.emorunNavy, h10, 0), null, 2, null), 0.0f, 1, null);
            a.b g10 = x0.a.f59327a.g();
            h10.x(-483455358);
            c0 a10 = y.p.a(y.f.f60773a.g(), g10, h10, 48);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar2 = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a12 = w.a(n10);
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
            h2.b(a13, qVar2, c0787a.c());
            h2.b(a13, g2Var, c0787a.f());
            h10.c();
            a12.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            qVar.s0(y.r.f60913a, h10, Integer.valueOf((i12 & 112) | 6));
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
        l10.a(new a(fVar, qVar, i10, i11));
    }

    public static final void b(l0.i iVar, int i10) {
        l0.i h10 = iVar.h(-144149357);
        if (i10 == 0 && h10.j()) {
            h10.I();
        } else {
            a(null, w9.a.f58254a.e(), h10, 48, 1);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(i10));
    }

    public static final void c(x0.f fVar, io.a<wn.v> aVar, l0.i iVar, int i10, int i11) {
        int i12;
        jo.p.h(aVar, "onContentExpand");
        l0.i h10 = iVar.h(37504480);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (h10.P(fVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= h10.P(aVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            if (i13 != 0) {
                fVar = x0.f.f59359u;
            }
            h(y.c0.a(fVar, e0.Min), false, false, s0.c.b(h10, 2135828706, true, new c(aVar, i12)), h10, 3072, 6);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new d(fVar, aVar, i10, i11));
    }

    public static final void d(x0.f fVar, l0.i iVar, int i10, int i11) {
        int i12;
        l0.i h10 = iVar.h(339723808);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (h10.P(fVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            if (i13 != 0) {
                fVar = x0.f.f59359u;
            }
            a(fVar, s0.c.b(h10, -649854225, true, new e(fVar)), h10, (i12 & 14) | 48, 0);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new f(fVar, i10, i11));
    }

    public static final void e(x0.f fVar, l0.i iVar, int i10, int i11) {
        int i12;
        l0.i h10 = iVar.h(-58812434);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (h10.P(fVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            if (i13 != 0) {
                fVar = x0.f.f59359u;
            }
            a(null, s0.c.b(h10, -1048390467, true, new g(fVar)), h10, 48, 1);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new h(fVar, i10, i11));
    }

    public static final void f(x0.f fVar, l0.i iVar, int i10, int i11) {
        int i12;
        l0.i h10 = iVar.h(769551199);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (h10.P(fVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            if (i13 != 0) {
                fVar = x0.f.f59359u;
            }
            a(fVar, w9.a.f58254a.a(), h10, (i12 & 14) | 48, 0);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new C0961i(fVar, i10, i11));
    }

    public static final void g(x0.f fVar, w9.h hVar, io.l<? super Integer, wn.v> lVar, l0.i iVar, int i10, int i11) {
        x0.f fVar2;
        int i12;
        x0.f fVar3;
        jo.p.h(hVar, "bindModel");
        jo.p.h(lVar, "onClickProfile");
        l0.i h10 = iVar.h(-1863900872);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            fVar2 = fVar;
        } else if ((i10 & 14) == 0) {
            fVar2 = fVar;
            i12 = (h10.P(fVar) ? 4 : 2) | i10;
        } else {
            fVar2 = fVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= h10.P(hVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= h10.P(lVar) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && h10.j()) {
            h10.I();
            fVar3 = fVar2;
        } else {
            fVar3 = i13 != 0 ? x0.f.f59359u : fVar2;
            h(y.c0.a(fVar3, e0.Min), false, false, s0.c.b(h10, 444477686, true, new j(hVar, lVar, i12)), h10, 3072, 6);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new k(fVar3, hVar, lVar, i10, i11));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(x0.f r12, boolean r13, boolean r14, io.q<? super y.k, ? super l0.i, ? super java.lang.Integer, wn.v> r15, l0.i r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.i.h(x0.f, boolean, boolean, io.q, l0.i, int, int):void");
    }
}
