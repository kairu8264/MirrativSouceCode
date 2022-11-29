package y9;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import c1.i1;
import h0.w1;
import io.l;
import io.r;
import java.util.List;
import jo.p;
import jo.q;
import l0.c2;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import m2.g;
import q1.w;
import s1.a;
import w9.h;
import wn.v;
import x0.a;
import x0.f;
import y.d1;
import y.f;
import y.g1;
import y.j;
import y.r0;
import z.c0;

/* loaded from: classes.dex */
public final class e {

    /* loaded from: classes.dex */
    public static final class a extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f61343w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<v> aVar) {
            super(0);
            this.f61343w = aVar;
        }

        public final void a() {
            this.f61343w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements l<c0, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x9.a f61344w;

        /* loaded from: classes.dex */
        public static final class a extends q implements l {

            /* renamed from: w  reason: collision with root package name */
            public static final a f61345w = new a();

            public a() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final Void invoke(h hVar) {
                return null;
            }
        }

        /* renamed from: y9.e$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1046b extends q implements l<Integer, Object> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ l f61346w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ List f61347x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1046b(l lVar, List list) {
                super(1);
                this.f61346w = lVar;
                this.f61347x = list;
            }

            public final Object a(int i10) {
                return this.f61346w.invoke(this.f61347x.get(i10));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends q implements r<z.h, Integer, i, Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List f61348w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List list) {
                super(4);
                this.f61348w = list;
            }

            @Override // io.r
            public /* bridge */ /* synthetic */ v F(z.h hVar, Integer num, i iVar, Integer num2) {
                a(hVar, num.intValue(), iVar, num2.intValue());
                return v.f59242a;
            }

            public final void a(z.h hVar, int i10, i iVar, int i11) {
                int i12;
                p.h(hVar, "$this$items");
                if ((i11 & 14) == 0) {
                    i12 = (iVar.P(hVar) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 112) == 0) {
                    i12 |= iVar.d(i10) ? 32 : 16;
                }
                if ((i12 & 731) == 146 && iVar.j()) {
                    iVar.I();
                    return;
                }
                int i13 = i12 & 14;
                h hVar2 = (h) this.f61348w.get(i10);
                if ((i13 & 112) == 0) {
                    i13 |= iVar.P(hVar2) ? 32 : 16;
                }
                if ((i13 & 721) == 144 && iVar.j()) {
                    iVar.I();
                } else {
                    y9.b.a(r0.m(f.f59359u, 0.0f, 0.0f, g.l(16), 0.0f, 11, null), hVar2, iVar, (i13 & 112) | 6, 0);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x9.a aVar) {
            super(1);
            this.f61344w = aVar;
        }

        public final void a(c0 c0Var) {
            p.h(c0Var, "$this$LazyColumn");
            List<h> b10 = this.f61344w.d().b();
            c0Var.c(b10.size(), null, new C1046b(a.f61345w, b10), s0.c.c(-632812321, true, new c(b10)));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c0 c0Var) {
            a(c0Var);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f61349w = new c();

        public c() {
            super(0);
        }

        public final void a() {
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements io.p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c2<ha.a> f61350w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c2<x9.a> f61351x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f61352y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f61353z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(c2<? extends ha.a> c2Var, c2<x9.a> c2Var2, io.a<v> aVar, int i10) {
            super(2);
            this.f61350w = c2Var;
            this.f61351x = c2Var2;
            this.f61352y = aVar;
            this.f61353z = i10;
        }

        public final void a(i iVar, int i10) {
            e.a(this.f61350w, this.f61351x, this.f61352y, iVar, this.f61353z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(c2<? extends ha.a> c2Var, c2<x9.a> c2Var2, io.a<v> aVar, i iVar, int i10) {
        int i11;
        float f10;
        float f11;
        int i12;
        p.h(c2Var, "statusState");
        p.h(c2Var2, "bindModelState");
        p.h(aVar, "onClickClose");
        i h10 = iVar.h(2031852529);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(c2Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(c2Var2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.P(aVar) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && h10.j()) {
            h10.I();
        } else {
            f.a aVar2 = f.f59359u;
            float f12 = 28;
            float f13 = 12;
            f b10 = v.e.b(d1.n(d1.o(r0.k(aVar2, g.l(f12), 0.0f, 2, null), g.l(470)), 0.0f, 1, null), new i1(v1.b.a(q9.d.G, h10, 0), null), e0.g.c(g.l(f13)), 0.0f, 4, null);
            h10.x(-483455358);
            f.l g10 = y.f.f60773a.g();
            a.C0986a c0986a = x0.a.f59327a;
            q1.c0 a10 = y.p.a(g10, c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a12 = w.a(b10);
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
            i a13 = h2.a(h10);
            h2.b(a13, a10, c0787a.d());
            h2.b(a13, dVar, c0787a.b());
            h2.b(a13, qVar, c0787a.c());
            h2.b(a13, g2Var, c0787a.f());
            h10.c();
            a12.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            y.r rVar = y.r.f60913a;
            x9.a value = c2Var2.getValue();
            if (value != null) {
                h10.x(-37248161);
                h10.x(733328855);
                q1.c0 h11 = j.h(c0986a.o(), false, h10, 0);
                h10.x(-1323940314);
                m2.d dVar2 = (m2.d) h10.G(o0.e());
                m2.q qVar2 = (m2.q) h10.G(o0.j());
                g2 g2Var2 = (g2) h10.G(o0.n());
                io.a<s1.a> a14 = c0787a.a();
                io.q<n1<s1.a>, i, Integer, v> a15 = w.a(aVar2);
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
                i a16 = h2.a(h10);
                h2.b(a16, h11, c0787a.d());
                h2.b(a16, dVar2, c0787a.b());
                h2.b(a16, qVar2, c0787a.c());
                h2.b(a16, g2Var2, c0787a.f());
                h10.c();
                a15.s0(n1.a(n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-2137368960);
                y.l lVar = y.l.f60836a;
                v.w.a(v1.e.c(q9.f.ic_emomo_quest_ranking_popup_header, h10, 0), null, r0.m(d1.n(aVar2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, g.l(14), 7, null), null, null, 0.0f, null, h10, 440, 120);
                x0.f u10 = d1.u(lVar.a(r0.i(aVar2, g.l(8)), c0986a.n()), g.l(f12));
                h10.x(1157296644);
                boolean P = h10.P(aVar);
                Object y10 = h10.y();
                if (P || y10 == i.f39065a.a()) {
                    y10 = new a(aVar);
                    h10.q(y10);
                }
                h10.O();
                v.w.a(v1.e.c(q9.f.f48824x, h10, 0), null, v.l.e(u10, false, null, null, (io.a) y10, 7, null), null, null, 0.0f, null, h10, 56, 120);
                x0.f a17 = lVar.a(aVar2, c0986a.b());
                String b11 = v1.f.b(q9.i.text_emomo_quest_ranking_popup_title, h10, 0);
                long a18 = v1.b.a(q9.d.f48818v, h10, 0);
                o9.b bVar = o9.b.f44283a;
                w1.c(b11, a17, a18, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().z(), h10, 0, 0, 32760);
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
                float f14 = 4;
                g1.a(d1.o(aVar2, g.l(f14)), h10, 6);
                float f15 = 16;
                float f16 = 2;
                h0.w.a(r0.k(aVar2, g.l(f15), 0.0f, 2, null), v1.b.a(q9.d.f48819w, h10, 0), g.l(f16), 0.0f, h10, 390, 8);
                if (value.d().c()) {
                    h10.x(-37246765);
                    x0.f m10 = r0.m(rVar.b(aVar2, c0986a.g()), 0.0f, g.l(f16), 0.0f, g.l(10), 5, null);
                    f10 = f15;
                    f11 = f14;
                    w1.c(value.d().a(), m10, v1.b.a(q9.d.f48805c, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().f(), h10, 0, 0, 32760);
                    h10.O();
                    i12 = 6;
                } else {
                    f10 = f15;
                    f11 = f14;
                    h10.x(-37246347);
                    i12 = 6;
                    g1.a(d1.o(aVar2, g.l(14)), h10, 6);
                    h10.O();
                }
                y9.c.a(r0.i(v.e.b(r0.k(aVar2, g.l(f10), 0.0f, 2, null), new i1(v1.b.a(q9.d.D, h10, 0), null), e0.g.c(g.l(f11)), 0.0f, 4, null), g.l(f13)), value.e(), h10, 64, 0);
                g1.a(d1.o(aVar2, g.l(20)), h10, i12);
                z.g.a(d1.l(aVar2, 0.0f, 1, null), null, null, false, null, null, null, false, new b(value), h10, 6, 254);
                h10.O();
            } else {
                h10.x(-37245436);
                x0.f l10 = d1.l(aVar2, 0.0f, 1, null);
                x0.a e10 = c0986a.e();
                h10.x(733328855);
                q1.c0 h12 = j.h(e10, false, h10, 6);
                h10.x(-1323940314);
                m2.d dVar3 = (m2.d) h10.G(o0.e());
                m2.q qVar3 = (m2.q) h10.G(o0.j());
                g2 g2Var3 = (g2) h10.G(o0.n());
                io.a<s1.a> a19 = c0787a.a();
                io.q<n1<s1.a>, i, Integer, v> a20 = w.a(l10);
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
                i a21 = h2.a(h10);
                h2.b(a21, h12, c0787a.d());
                h2.b(a21, dVar3, c0787a.b());
                h2.b(a21, qVar3, c0787a.c());
                h2.b(a21, g2Var3, c0787a.f());
                h10.c();
                a20.s0(n1.a(n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-2137368960);
                y.l lVar2 = y.l.f60836a;
                l9.e.b(c2Var.getValue(), "", c.f61349w, h10, ha.a.f34693a | 432);
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
                h10.O();
            }
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
        l11.a(new d(c2Var, c2Var2, aVar, i10));
    }
}
