package i9;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import h0.w1;
import i9.a;
import io.l;
import io.r;
import java.util.List;
import jo.p;
import jo.q;
import l0.e;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import m2.d;
import m2.g;
import q1.w;
import s1.a;
import wn.v;
import x0.a;
import x0.f;
import y.a1;
import y.d1;
import y.g1;
import y.j;
import y.r0;
import y.y0;
import y1.d0;
import z.c0;
import z.h;

/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public static final class a extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f36444w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<v> aVar) {
            super(0);
            this.f36444w = aVar;
        }

        public final void a() {
            this.f36444w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* renamed from: i9.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0467b extends q implements l<c0, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ i9.a f36445w;

        /* renamed from: i9.b$b$a */
        /* loaded from: classes.dex */
        public static final class a extends q implements l {

            /* renamed from: w  reason: collision with root package name */
            public static final a f36446w = new a();

            public a() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final Void invoke(a.c cVar) {
                return null;
            }
        }

        /* renamed from: i9.b$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0468b extends q implements l<Integer, Object> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ l f36447w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ List f36448x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0468b(l lVar, List list) {
                super(1);
                this.f36447w = lVar;
                this.f36448x = list;
            }

            public final Object a(int i10) {
                return this.f36447w.invoke(this.f36448x.get(i10));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        /* renamed from: i9.b$b$c */
        /* loaded from: classes.dex */
        public static final class c extends q implements r<h, Integer, i, Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List f36449w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List list) {
                super(4);
                this.f36449w = list;
            }

            @Override // io.r
            public /* bridge */ /* synthetic */ v F(h hVar, Integer num, i iVar, Integer num2) {
                a(hVar, num.intValue(), iVar, num2.intValue());
                return v.f59242a;
            }

            public final void a(h hVar, int i10, i iVar, int i11) {
                int i12;
                p.h(hVar, "$this$items");
                if ((i11 & 14) == 0) {
                    i12 = i11 | (iVar.P(hVar) ? 4 : 2);
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
                a.c cVar = (a.c) this.f36449w.get(i10);
                if ((i13 & 112) == 0) {
                    i13 |= iVar.P(cVar) ? 32 : 16;
                }
                if ((i13 & 721) == 144 && iVar.j()) {
                    iVar.I();
                    return;
                }
                f.a aVar = f.f59359u;
                f u10 = d1.u(aVar, g.l(23));
                iVar.x(733328855);
                a.C0986a c0986a = x0.a.f59327a;
                q1.c0 h10 = j.h(c0986a.o(), false, iVar, 0);
                iVar.x(-1323940314);
                d dVar = (d) iVar.G(o0.e());
                m2.q qVar = (m2.q) iVar.G(o0.j());
                g2 g2Var = (g2) iVar.G(o0.n());
                a.C0787a c0787a = s1.a.f51802o;
                io.a<s1.a> a10 = c0787a.a();
                io.q<n1<s1.a>, i, Integer, v> a11 = w.a(u10);
                if (!(iVar.k() instanceof e)) {
                    l0.h.c();
                }
                iVar.D();
                if (iVar.f()) {
                    iVar.r(a10);
                } else {
                    iVar.o();
                }
                iVar.E();
                i a12 = h2.a(iVar);
                h2.b(a12, h10, c0787a.d());
                h2.b(a12, dVar, c0787a.b());
                h2.b(a12, qVar, c0787a.c());
                h2.b(a12, g2Var, c0787a.f());
                iVar.c();
                a11.s0(n1.a(n1.b(iVar)), iVar, 0);
                iVar.x(2058660585);
                iVar.x(-2137368960);
                y.l lVar = y.l.f60836a;
                l9.d.c(cVar.b(), z0.d.a(lVar.c(aVar), e0.g.f()), null, 0, null, null, iVar, 0, 60);
                iVar.x(-1270968083);
                if (cVar.c()) {
                    l9.d.c(cVar.a(), lVar.a(d1.u(aVar, g.l(8)), c0986a.n()), null, 0, null, null, iVar, 0, 60);
                }
                iVar.O();
                iVar.O();
                iVar.O();
                iVar.s();
                iVar.O();
                iVar.O();
                if (cVar.d()) {
                    g1.a(d1.y(aVar, g.l(4)), iVar, 6);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0467b(i9.a aVar) {
            super(1);
            this.f36445w = aVar;
        }

        public final void a(c0 c0Var) {
            p.h(c0Var, "$this$LazyRow");
            List<a.c> b10 = this.f36445w.b();
            c0Var.c(b10.size(), null, new C0468b(a.f36446w, b10), s0.c.c(-632812321, true, new c(b10)));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c0 c0Var) {
            a(c0Var);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.p<i, Integer, v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f f36450w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ i9.a f36451x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f36452y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f36453z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f fVar, i9.a aVar, io.a<v> aVar2, int i10, int i11) {
            super(2);
            this.f36450w = fVar;
            this.f36451x = aVar;
            this.f36452y = aVar2;
            this.f36453z = i10;
            this.A = i11;
        }

        public final void a(i iVar, int i10) {
            b.a(this.f36450w, this.f36451x, this.f36452y, iVar, this.f36453z | 1, this.A);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(f fVar, i9.a aVar, io.a<v> aVar2, i iVar, int i10, int i11) {
        p.h(aVar, "bindModel");
        p.h(aVar2, "onClick");
        i h10 = iVar.h(-1797115906);
        f fVar2 = (i11 & 1) != 0 ? f.f59359u : fVar;
        h10.x(1157296644);
        boolean P = h10.P(aVar2);
        Object y10 = h10.y();
        if (P || y10 == i.f39065a.a()) {
            y10 = new a(aVar2);
            h10.q(y10);
        }
        h10.O();
        f e10 = v.l.e(fVar2, false, null, null, (io.a) y10, 7, null);
        a.c i12 = x0.a.f59327a.i();
        h10.x(693286680);
        q1.c0 a10 = y0.a(y.f.f60773a.f(), i12, h10, 48);
        h10.x(-1323940314);
        d dVar = (d) h10.G(o0.e());
        m2.q qVar = (m2.q) h10.G(o0.j());
        g2 g2Var = (g2) h10.G(o0.n());
        a.C0787a c0787a = s1.a.f51802o;
        io.a<s1.a> a11 = c0787a.a();
        io.q<n1<s1.a>, i, Integer, v> a12 = w.a(e10);
        if (!(h10.k() instanceof e)) {
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
        h10.x(-678309503);
        a1 a1Var = a1.f60672a;
        f1.d c10 = v1.e.c(h9.c.ic_cheer_profile, h10, 0);
        f.a aVar3 = f.f59359u;
        v.w.a(c10, null, d1.u(aVar3, g.l(11)), null, null, 0.0f, null, h10, 440, 120);
        float f10 = 3;
        f m10 = r0.m(aVar3, g.l(f10), 0.0f, 0.0f, 0.0f, 14, null);
        String b10 = v1.f.b(h9.f.f34610b, h10, 0);
        o9.b bVar = o9.b.f44283a;
        d0 l10 = bVar.b().l();
        int i13 = h9.b.f34607e;
        w1.c(b10, m10, v1.b.a(i13, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, l10, h10, 48, 196608, 32760);
        w1.c(aVar.a(), r0.m(aVar3, g.l(4), 0.0f, 0.0f, 0.0f, 14, null), v1.b.a(i13, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().y(), h10, 48, 196608, 32760);
        w1.c(v1.f.b(h9.f.f34611c, h10, 0), r0.m(aVar3, g.l(f10), 0.0f, g.l(8), 0.0f, 10, null), v1.b.a(i13, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().l(), h10, 48, 196608, 32760);
        if (aVar.d()) {
            h10.x(-146242146);
            w1.c(v1.f.b(h9.f.text_cheer_leader_none_body_in_profile, h10, 0), r0.m(aVar3, g.l(f10), 0.0f, 0.0f, 0.0f, 14, null), v1.b.a(h9.b.f34605c, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().p(), h10, 48, 196608, 32760);
            h10.O();
        } else {
            h10.x(-146241830);
            z.g.b(d1.G(d1.C(aVar3, null, false, 3, null), null, false, 3, null), null, null, false, null, null, null, false, new C0467b(aVar), h10, 6, 254);
            if (aVar.e()) {
                v.w.a(v1.e.c(h9.c.ic_more_cheer_profile, h10, 0), null, r0.m(d1.u(aVar3, g.l(15)), g.l(5), 0.0f, 0.0f, 0.0f, 14, null), null, null, 0.0f, null, h10, 440, 120);
            }
            h10.O();
        }
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        l1 l11 = h10.l();
        if (l11 == null) {
            return;
        }
        l11.a(new c(fVar2, aVar, aVar2, i10, i11));
    }
}
