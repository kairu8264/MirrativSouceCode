package oa;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import c1.a1;
import java.util.List;
import l0.c2;
import l0.h2;
import l0.l1;
import l0.n1;
import s1.a;
import x0.a;
import x0.f;
import y.d1;
import y.g1;
import z.c0;
import z.g0;

/* loaded from: classes.dex */
public final class x {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ io.l<String, wn.v> A;
        public final /* synthetic */ io.a<wn.v> B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g0 f44565w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f44566x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ t f44567y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f44568z;

        /* renamed from: oa.x$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0673a extends jo.q implements io.l<c0, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ t f44569w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ io.l<String, wn.v> f44570x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ int f44571y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ io.l<String, wn.v> f44572z;

            /* renamed from: oa.x$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0674a extends jo.q implements io.q<z.h, l0.i, Integer, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ t f44573w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ io.l<String, wn.v> f44574x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ int f44575y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0674a(t tVar, io.l<? super String, wn.v> lVar, int i10) {
                    super(3);
                    this.f44573w = tVar;
                    this.f44574x = lVar;
                    this.f44575y = i10;
                }

                public final void a(z.h hVar, l0.i iVar, int i10) {
                    jo.p.h(hVar, "$this$item");
                    if ((i10 & 81) == 16 && iVar.j()) {
                        iVar.I();
                        return;
                    }
                    f.a aVar = x0.f.f59359u;
                    g1.a(d1.o(aVar, m2.g.l(32)), iVar, 6);
                    v.w.a(v1.e.c(ja.k.livegame_ranking_yesterday_title, iVar, 0), null, null, null, null, 0.0f, null, iVar, 56, 124);
                    g1.a(d1.o(aVar, m2.g.l(12)), iVar, 6);
                    h d10 = this.f44573w.d();
                    if (d10 == null) {
                        return;
                    }
                    i.a(null, d10, this.f44574x, iVar, (this.f44575y & 896) | 64, 1);
                }

                @Override // io.q
                public /* bridge */ /* synthetic */ wn.v s0(z.h hVar, l0.i iVar, Integer num) {
                    a(hVar, iVar, num.intValue());
                    return wn.v.f59242a;
                }
            }

            /* renamed from: oa.x$a$a$b */
            /* loaded from: classes.dex */
            public static final class b extends jo.q implements io.l {

                /* renamed from: w  reason: collision with root package name */
                public static final b f44576w = new b();

                public b() {
                    super(1);
                }

                @Override // io.l
                /* renamed from: a */
                public final Void invoke(o oVar) {
                    return null;
                }
            }

            /* renamed from: oa.x$a$a$c */
            /* loaded from: classes.dex */
            public static final class c extends jo.q implements io.l<Integer, Object> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.l f44577w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ List f44578x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(io.l lVar, List list) {
                    super(1);
                    this.f44577w = lVar;
                    this.f44578x = list;
                }

                public final Object a(int i10) {
                    return this.f44577w.invoke(this.f44578x.get(i10));
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return a(num.intValue());
                }
            }

            /* renamed from: oa.x$a$a$d */
            /* loaded from: classes.dex */
            public static final class d extends jo.q implements io.r<z.h, Integer, l0.i, Integer, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ List f44579w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ io.l f44580x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ io.l f44581y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ int f44582z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(List list, io.l lVar, io.l lVar2, int i10) {
                    super(4);
                    this.f44579w = list;
                    this.f44580x = lVar;
                    this.f44581y = lVar2;
                    this.f44582z = i10;
                }

                @Override // io.r
                public /* bridge */ /* synthetic */ wn.v F(z.h hVar, Integer num, l0.i iVar, Integer num2) {
                    a(hVar, num.intValue(), iVar, num2.intValue());
                    return wn.v.f59242a;
                }

                public final void a(z.h hVar, int i10, l0.i iVar, int i11) {
                    int i12;
                    jo.p.h(hVar, "$this$items");
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
                    o oVar = (o) this.f44579w.get(i10);
                    io.l lVar = this.f44580x;
                    io.l lVar2 = this.f44581y;
                    int i13 = this.f44582z;
                    p.a(null, oVar, lVar, lVar2, iVar, (i13 & 896) | 64 | (i13 & 7168), 1);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0673a(t tVar, io.l<? super String, wn.v> lVar, int i10, io.l<? super String, wn.v> lVar2) {
                super(1);
                this.f44569w = tVar;
                this.f44570x = lVar;
                this.f44571y = i10;
                this.f44572z = lVar2;
            }

            public final void a(c0 c0Var) {
                jo.p.h(c0Var, "$this$LazyColumn");
                c0.d(c0Var, null, null, s0.c.c(-1912025646, true, new C0674a(this.f44569w, this.f44570x, this.f44571y)), 3, null);
                List<o> c10 = this.f44569w.c();
                io.l<String, wn.v> lVar = this.f44570x;
                io.l<String, wn.v> lVar2 = this.f44572z;
                int i10 = this.f44571y;
                c0Var.c(c10.size(), null, new c(b.f44576w, c10), s0.c.c(-632812321, true, new d(c10, lVar, lVar2, i10)));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(c0 c0Var) {
                a(c0Var);
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.a<wn.v> f44583w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(io.a<wn.v> aVar) {
                super(0);
                this.f44583w = aVar;
            }

            public final void a() {
                this.f44583w.invoke();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(g0 g0Var, int i10, t tVar, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2, io.a<wn.v> aVar) {
            super(2);
            this.f44565w = g0Var;
            this.f44566x = i10;
            this.f44567y = tVar;
            this.f44568z = lVar;
            this.A = lVar2;
            this.B = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, l0.i] */
        /* JADX WARN: Type inference failed for: r4v4 */
        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            f.a aVar = x0.f.f59359u;
            x0.f l10 = d1.l(aVar, 0.0f, 1, null);
            a.C0986a c0986a = x0.a.f59327a;
            z.g.a(l10, this.f44565w, null, false, null, c0986a.g(), null, false, new C0673a(this.f44567y, this.f44568z, this.f44566x, this.A), iVar, ((this.f44566x << 3) & 112) | 196614, 220);
            x0.f n10 = d1.n(aVar, 0.0f, 1, null);
            io.a<wn.v> aVar2 = this.B;
            iVar.x(733328855);
            q1.c0 h10 = y.j.h(c0986a.o(), false, iVar, 0);
            iVar.x(-1323940314);
            m2.d dVar = (m2.d) iVar.G(o0.e());
            m2.q qVar = (m2.q) iVar.G(o0.j());
            g2 g2Var = (g2) iVar.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a11 = q1.w.a(n10);
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
            h2.b(a12, qVar, c0787a.c());
            h2.b(a12, g2Var, c0787a.f());
            iVar.c();
            a11.s0(n1.a(n1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-2137368960);
            y.l lVar = y.l.f60836a;
            iVar.x(1157296644);
            boolean P = iVar.P(aVar2);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new b(aVar2);
                iVar.q(y10);
            }
            iVar.O();
            h0.o0.a(y10, lVar.a(aVar, c0986a.n()), false, null, d.f44325a.a(), iVar, 24576, 12);
            iVar.O();
            iVar.O();
            iVar.s();
            iVar.O();
            iVar.O();
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ io.a<wn.v> A;
        public final /* synthetic */ int B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g0 f44584w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c2<t> f44585x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f44586y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f44587z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(g0 g0Var, c2<t> c2Var, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2, io.a<wn.v> aVar, int i10) {
            super(2);
            this.f44584w = g0Var;
            this.f44585x = c2Var;
            this.f44586y = lVar;
            this.f44587z = lVar2;
            this.A = aVar;
            this.B = i10;
        }

        public final void a(l0.i iVar, int i10) {
            x.a(this.f44584w, this.f44585x, this.f44586y, this.f44587z, this.A, iVar, this.B | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ io.a<wn.v> A;
        public final /* synthetic */ int B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g0 f44588w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c2<t> f44589x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f44590y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f44591z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(g0 g0Var, c2<t> c2Var, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2, io.a<wn.v> aVar, int i10) {
            super(2);
            this.f44588w = g0Var;
            this.f44589x = c2Var;
            this.f44590y = lVar;
            this.f44591z = lVar2;
            this.A = aVar;
            this.B = i10;
        }

        public final void a(l0.i iVar, int i10) {
            x.a(this.f44588w, this.f44589x, this.f44590y, this.f44591z, this.A, iVar, this.B | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(g0 g0Var, c2<t> c2Var, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2, io.a<wn.v> aVar, l0.i iVar, int i10) {
        int i11;
        l0.i iVar2;
        jo.p.h(g0Var, "listState");
        jo.p.h(c2Var, "liveGameRankingYesterdayBindModel");
        jo.p.h(lVar, "onClickProfile");
        jo.p.h(lVar2, "onClickLive");
        jo.p.h(aVar, "onClose");
        l0.i h10 = iVar.h(-1291557285);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(g0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(c2Var) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.P(lVar) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= h10.P(lVar2) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= h10.P(aVar) ? 16384 : 8192;
        }
        int i12 = i11;
        if ((46811 & i12) == 9362 && h10.j()) {
            h10.I();
            iVar2 = h10;
        } else {
            t value = c2Var.getValue();
            if (value == null) {
                l1 l10 = h10.l();
                if (l10 == null) {
                    return;
                }
                l10.a(new c(g0Var, c2Var, lVar, lVar2, aVar, i10));
                return;
            }
            float f10 = 12;
            iVar2 = h10;
            h0.g.a(z0.d.a(v.g.g(d1.o(d1.y(x0.f.f59359u, m2.g.l(320)), m2.g.l(500)), m2.g.l(1), c1.c0.f18634b.f(), e0.g.c(m2.g.l(f10))), a1.a()), e0.g.c(m2.g.l(f10)), 0L, 0L, null, m2.g.l(f10), s0.c.b(h10, 1435338302, true, new a(g0Var, i12, value, lVar, lVar2, aVar)), iVar2, 1769472, 28);
        }
        l1 l11 = iVar2.l();
        if (l11 == null) {
            return;
        }
        l11.a(new b(g0Var, c2Var, lVar, lVar2, aVar, i10));
    }
}
