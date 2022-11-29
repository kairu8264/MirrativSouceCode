package ma;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import h0.w1;
import io.l;
import io.r;
import java.util.List;
import jo.p;
import jo.q;
import l0.h2;
import l0.l1;
import l0.n1;
import q1.w;
import s1.a;
import wn.v;
import x0.a;
import x0.f;
import y.a1;
import y.d1;
import y.f;
import y.g1;
import y.r0;
import y.y0;
import y.z0;
import z.c0;

/* loaded from: classes.dex */
public final class i {

    /* loaded from: classes.dex */
    public static final class a extends q implements l<c0, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ma.c f40681w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f40682x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l<String, v> f40683y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f40684z;

        /* renamed from: ma.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0596a extends q implements io.q<z.h, l0.i, Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ma.c f40685w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f40686x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ l<String, v> f40687y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f40688z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0596a(ma.c cVar, io.a<v> aVar, l<? super String, v> lVar, int i10) {
                super(3);
                this.f40685w = cVar;
                this.f40686x = aVar;
                this.f40687y = lVar;
                this.f40688z = i10;
            }

            public final void a(z.h hVar, l0.i iVar, int i10) {
                p.h(hVar, "$this$item");
                if ((i10 & 81) == 16 && iVar.j()) {
                    iVar.I();
                    return;
                }
                ma.e b10 = this.f40685w.b();
                io.a<v> aVar = this.f40686x;
                l<String, v> lVar = this.f40687y;
                int i11 = this.f40688z;
                f.a(b10, aVar, lVar, iVar, (i11 & 896) | (i11 & 112));
                g1.a(d1.o(x0.f.f59359u, m2.g.l(8)), iVar, 6);
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ v s0(z.h hVar, l0.i iVar, Integer num) {
                a(hVar, iVar, num.intValue());
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends q implements io.q<z.h, l0.i, Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ma.c f40689w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ma.c cVar) {
                super(3);
                this.f40689w = cVar;
            }

            public final void a(z.h hVar, l0.i iVar, int i10) {
                p.h(hVar, "$this$item");
                if ((i10 & 81) == 16 && iVar.j()) {
                    iVar.I();
                    return;
                }
                float f10 = 16;
                w1.c(this.f40689w.c(), r0.l(x0.f.f59359u, m2.g.l(f10), m2.g.l(8), m2.g.l(f10), m2.g.l(40)), v1.b.a(ja.j.f37420r, iVar, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, o9.b.f44283a.b().g(), iVar, 0, 0, 32760);
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ v s0(z.h hVar, l0.i iVar, Integer num) {
                a(hVar, iVar, num.intValue());
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends q implements l {

            /* renamed from: w  reason: collision with root package name */
            public static final c f40690w = new c();

            public c() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final Void invoke(j jVar) {
                return null;
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends q implements l<Integer, Object> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ l f40691w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ List f40692x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(l lVar, List list) {
                super(1);
                this.f40691w = lVar;
                this.f40692x = list;
            }

            public final Object a(int i10) {
                return this.f40691w.invoke(this.f40692x.get(i10));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends q implements r<z.h, Integer, l0.i, Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List f40693w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(List list) {
                super(4);
                this.f40693w = list;
            }

            @Override // io.r
            public /* bridge */ /* synthetic */ v F(z.h hVar, Integer num, l0.i iVar, Integer num2) {
                a(hVar, num.intValue(), iVar, num2.intValue());
                return v.f59242a;
            }

            public final void a(z.h hVar, int i10, l0.i iVar, int i11) {
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
                j jVar = (j) this.f40693w.get(i10);
                if ((i13 & 112) == 0) {
                    i13 |= iVar.P(jVar) ? 32 : 16;
                }
                if ((i13 & 721) == 144 && iVar.j()) {
                    iVar.I();
                } else {
                    k.a(jVar, iVar, (i13 >> 3) & 14);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ma.c cVar, io.a<v> aVar, l<? super String, v> lVar, int i10) {
            super(1);
            this.f40681w = cVar;
            this.f40682x = aVar;
            this.f40683y = lVar;
            this.f40684z = i10;
        }

        public final void a(c0 c0Var) {
            p.h(c0Var, "$this$LazyColumn");
            c0.d(c0Var, null, null, s0.c.c(217927368, true, new C0596a(this.f40681w, this.f40682x, this.f40683y, this.f40684z)), 3, null);
            List<j> a10 = this.f40681w.a();
            c0Var.c(a10.size(), null, new d(c.f40690w, a10), s0.c.c(-632812321, true, new e(a10)));
            c0.d(c0Var, null, null, s0.c.c(297066737, true, new b(this.f40681w)), 3, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c0 c0Var) {
            a(c0Var);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f40694w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<v> aVar) {
            super(0);
            this.f40694w = aVar;
        }

        public final void a() {
            this.f40694w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ma.c f40695w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f40696x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l<String, v> f40697y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f40698z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(ma.c cVar, io.a<v> aVar, l<? super String, v> lVar, int i10) {
            super(2);
            this.f40695w = cVar;
            this.f40696x = aVar;
            this.f40697y = lVar;
            this.f40698z = i10;
        }

        public final void a(l0.i iVar, int i10) {
            i.a(this.f40695w, this.f40696x, this.f40697y, iVar, this.f40698z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(ma.c cVar, io.a<v> aVar, l<? super String, v> lVar, l0.i iVar, int i10) {
        p.h(cVar, "bindModel");
        p.h(aVar, "onClickClose");
        p.h(lVar, "onClickLink");
        l0.i h10 = iVar.h(-1837304872);
        f.a aVar2 = x0.f.f59359u;
        x0.f d10 = v.e.d(z0.d.a(d1.l(aVar2, 0.0f, 1, null), e0.g.c(m2.g.l(12))), v1.b.a(ja.j.f37423v, h10, 0), null, 2, null);
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
        y.r rVar = y.r.f60913a;
        h10.x(733328855);
        q1.c0 h11 = y.j.h(c0986a.o(), false, h10, 0);
        h10.x(-1323940314);
        m2.d dVar2 = (m2.d) h10.G(o0.e());
        m2.q qVar2 = (m2.q) h10.G(o0.j());
        g2 g2Var2 = (g2) h10.G(o0.n());
        io.a<s1.a> a14 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, v> a15 = w.a(aVar2);
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
        z.g.a(d1.l(aVar2, 0.0f, 1, null), null, null, false, fVar.n(m2.g.l(16)), null, null, false, new a(cVar, aVar, lVar, i10), h10, 24582, 238);
        h10.x(693286680);
        q1.c0 a17 = y0.a(fVar.f(), c0986a.l(), h10, 0);
        h10.x(-1323940314);
        m2.d dVar3 = (m2.d) h10.G(o0.e());
        m2.q qVar3 = (m2.q) h10.G(o0.j());
        g2 g2Var3 = (g2) h10.G(o0.n());
        io.a<s1.a> a18 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, v> a19 = w.a(aVar2);
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
        h10.x(-678309503);
        g1.a(z0.c(a1.f60672a, aVar2, 1.0f, false, 2, null), h10, 0);
        float f10 = 44;
        x0.f i11 = r0.i(d1.o(d1.y(aVar2, m2.g.l(f10)), m2.g.l(f10)), m2.g.l(8));
        h10.x(1157296644);
        boolean P = h10.P(aVar);
        Object y10 = h10.y();
        if (P || y10 == l0.i.f39065a.a()) {
            y10 = new b(aVar);
            h10.q(y10);
        }
        h10.O();
        v.w.a(v1.e.c(ja.k.f37424c, h10, 0), null, v.l.e(i11, false, null, null, (io.a) y10, 7, null), null, null, 0.0f, null, h10, 56, 120);
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
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new c(cVar, aVar, lVar, i10));
    }
}
