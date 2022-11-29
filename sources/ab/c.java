package ab;

import ab.k;
import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import java.util.List;
import l0.c2;
import l0.h2;
import l0.l1;
import l0.n1;
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
import z.c0;

/* loaded from: classes2.dex */
public final class c {

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f731w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<wn.v> aVar) {
            super(0);
            this.f731w = aVar;
        }

        public final void a() {
            this.f731w.invoke();
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
        public final /* synthetic */ io.a<wn.v> f732w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar) {
            super(0);
            this.f732w = aVar;
        }

        public final void a() {
            this.f732w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* renamed from: ab.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0015c extends jo.q implements io.l<c0, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List<k> f733w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f734x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f735y;

        /* renamed from: ab.c$c$a */
        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.l<String, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.l<String, wn.v> f736w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(io.l<? super String, wn.v> lVar) {
                super(1);
                this.f736w = lVar;
            }

            public final void a(String str) {
                jo.p.h(str, "it");
                this.f736w.invoke(str);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(String str) {
                a(str);
                return wn.v.f59242a;
            }
        }

        /* renamed from: ab.c$c$b */
        /* loaded from: classes2.dex */
        public static final class b extends jo.q implements io.l<String, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.l<String, wn.v> f737w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(io.l<? super String, wn.v> lVar) {
                super(1);
                this.f737w = lVar;
            }

            public final void a(String str) {
                jo.p.h(str, "it");
                this.f737w.invoke(str);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(String str) {
                a(str);
                return wn.v.f59242a;
            }
        }

        /* renamed from: ab.c$c$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0016c {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f738a;

            static {
                int[] iArr = new int[k.a.values().length];
                iArr[k.a.NORMAL.ordinal()] = 1;
                iArr[k.a.SPECIAL.ordinal()] = 2;
                f738a = iArr;
            }
        }

        /* renamed from: ab.c$c$d */
        /* loaded from: classes2.dex */
        public static final class d extends jo.q implements io.l<Integer, Object> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List f739w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(List list) {
                super(1);
                this.f739w = list;
            }

            public final Object a(int i10) {
                this.f739w.get(i10);
                return null;
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        /* renamed from: ab.c$c$e */
        /* loaded from: classes2.dex */
        public static final class e extends jo.q implements io.r<z.h, Integer, l0.i, Integer, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List f740w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ io.l f741x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ int f742y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ List f743z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(List list, io.l lVar, int i10, List list2) {
                super(4);
                this.f740w = list;
                this.f741x = lVar;
                this.f742y = i10;
                this.f743z = list2;
            }

            @Override // io.r
            public /* bridge */ /* synthetic */ wn.v F(z.h hVar, Integer num, l0.i iVar, Integer num2) {
                a(hVar, num.intValue(), iVar, num2.intValue());
                return wn.v.f59242a;
            }

            public final void a(z.h hVar, int i10, l0.i iVar, int i11) {
                int i12;
                int i13;
                jo.p.h(hVar, "$this$items");
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
                int i14 = (i12 & 112) | (i12 & 14);
                k kVar = (k) this.f740w.get(i10);
                if ((i14 & 112) == 0) {
                    i13 = (iVar.d(i10) ? 32 : 16) | i14;
                } else {
                    i13 = i14;
                }
                if ((i14 & 896) == 0) {
                    i13 |= iVar.P(kVar) ? 256 : 128;
                }
                if ((i13 & 5841) == 1168 && iVar.j()) {
                    iVar.I();
                    return;
                }
                int i15 = C0016c.f738a[kVar.getType().ordinal()];
                if (i15 == 1) {
                    iVar.x(421476471);
                    jo.p.f(kVar, "null cannot be cast to non-null type com.dena.mirrativ.otherfeature.coin.CoinPurchaseNormalItemBindModel");
                    m mVar = (m) kVar;
                    iVar.x(1157296644);
                    boolean P = iVar.P(this.f741x);
                    Object y10 = iVar.y();
                    if (P || y10 == l0.i.f39065a.a()) {
                        y10 = new a(this.f741x);
                        iVar.q(y10);
                    }
                    iVar.O();
                    n.a(mVar, (io.l) y10, iVar, 0);
                    iVar.O();
                } else if (i15 != 2) {
                    iVar.x(421476752);
                    iVar.O();
                } else {
                    iVar.x(421476620);
                    jo.p.f(kVar, "null cannot be cast to non-null type com.dena.mirrativ.otherfeature.coin.CoinPurchaseSpecialItemBindModel");
                    p pVar = (p) kVar;
                    iVar.x(1157296644);
                    boolean P2 = iVar.P(this.f741x);
                    Object y11 = iVar.y();
                    if (P2 || y11 == l0.i.f39065a.a()) {
                        y11 = new b(this.f741x);
                        iVar.q(y11);
                    }
                    iVar.O();
                    q.a(pVar, (io.l) y11, iVar, 0);
                    iVar.O();
                }
                if (i10 < this.f743z.size() - 1) {
                    h0.w.a(r0.m(x0.f.f59359u, m2.g.l(16), 0.0f, 0.0f, 0.0f, 14, null), v1.b.a(sb.a.f52602a, iVar, 0), 0.0f, 0.0f, iVar, 6, 12);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0015c(List<? extends k> list, io.l<? super String, wn.v> lVar, int i10) {
            super(1);
            this.f733w = list;
            this.f734x = lVar;
            this.f735y = i10;
        }

        public final void a(c0 c0Var) {
            jo.p.h(c0Var, "$this$LazyColumn");
            List<k> list = this.f733w;
            c0Var.c(list.size(), null, new d(list), s0.c.c(-1091073711, true, new e(list, this.f734x, this.f735y, list)));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c0 c0Var) {
            a(c0Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ io.a<wn.v> A;
        public final /* synthetic */ io.a<wn.v> B;
        public final /* synthetic */ int C;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c2<ha.a> f744w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ i f745x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ List<k> f746y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f747z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(c2<? extends ha.a> c2Var, i iVar, List<? extends k> list, io.l<? super String, wn.v> lVar, io.a<wn.v> aVar, io.a<wn.v> aVar2, int i10) {
            super(2);
            this.f744w = c2Var;
            this.f745x = iVar;
            this.f746y = list;
            this.f747z = lVar;
            this.A = aVar;
            this.B = aVar2;
            this.C = i10;
        }

        public final void a(l0.i iVar, int i10) {
            c.a(this.f744w, this.f745x, this.f746y, this.f747z, this.A, this.B, iVar, this.C | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(c2<? extends ha.a> c2Var, i iVar, List<? extends k> list, io.l<? super String, wn.v> lVar, io.a<wn.v> aVar, io.a<wn.v> aVar2, l0.i iVar2, int i10) {
        jo.p.h(c2Var, "statusState");
        jo.p.h(iVar, "headerBindModel");
        jo.p.h(list, "itemBindModels");
        jo.p.h(lVar, "onClickPurchase");
        jo.p.h(aVar, "onClickClose");
        jo.p.h(aVar2, "onClickRetry");
        l0.i h10 = iVar2.h(1395466615);
        f.a aVar3 = x0.f.f59359u;
        x0.f d10 = v.e.d(z0.d.a(d1.j(d1.n(aVar3, 0.0f, 1, null), 0.0f, 1, null), e0.g.c(m2.g.l(12))), v1.b.a(wa.c.f58523o, h10, 0), null, 2, null);
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
        io.q<n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(d10);
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
        io.q<n1<s1.a>, l0.i, Integer, wn.v> a15 = q1.w.a(aVar3);
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
        h10.x(-483455358);
        q1.c0 a17 = y.p.a(fVar.g(), c0986a.k(), h10, 0);
        h10.x(-1323940314);
        m2.d dVar3 = (m2.d) h10.G(o0.e());
        m2.q qVar3 = (m2.q) h10.G(o0.j());
        g2 g2Var3 = (g2) h10.G(o0.n());
        io.a<s1.a> a18 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, wn.v> a19 = q1.w.a(aVar3);
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
        h10.x(-1163856341);
        j.a(iVar, h10, (i10 >> 3) & 14);
        h0.w.a(null, v1.b.a(wa.c.f58512d, h10, 0), 0.0f, 0.0f, h10, 0, 13);
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        h10.x(693286680);
        q1.c0 a21 = y0.a(fVar.f(), c0986a.l(), h10, 0);
        h10.x(-1323940314);
        m2.d dVar4 = (m2.d) h10.G(o0.e());
        m2.q qVar4 = (m2.q) h10.G(o0.j());
        g2 g2Var4 = (g2) h10.G(o0.n());
        io.a<s1.a> a22 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, wn.v> a23 = q1.w.a(aVar3);
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
        l0.i a24 = h2.a(h10);
        h2.b(a24, a21, c0787a.d());
        h2.b(a24, dVar4, c0787a.b());
        h2.b(a24, qVar4, c0787a.c());
        h2.b(a24, g2Var4, c0787a.f());
        h10.c();
        a23.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-678309503);
        g1.a(z0.c(a1.f60672a, aVar3, 1.0f, false, 2, null), h10, 0);
        float f10 = 44;
        x0.f i11 = r0.i(d1.o(d1.y(aVar3, m2.g.l(f10)), m2.g.l(f10)), m2.g.l(8));
        h10.x(1157296644);
        boolean P = h10.P(aVar);
        Object y10 = h10.y();
        if (P || y10 == l0.i.f39065a.a()) {
            y10 = new a(aVar);
            h10.q(y10);
        }
        h10.O();
        v.w.a(v1.e.c(wa.d.btn_dialog_close, h10, 0), null, v.l.e(i11, false, null, null, (io.a) y10, 7, null), null, null, 0.0f, null, h10, 56, 120);
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
        ha.a value = c2Var.getValue();
        h10.x(1157296644);
        boolean P2 = h10.P(aVar2);
        Object y11 = h10.y();
        if (P2 || y11 == l0.i.f39065a.a()) {
            y11 = new b(aVar2);
            h10.q(y11);
        }
        h10.O();
        l9.e.b(value, "", (io.a) y11, h10, ha.a.f34693a | 48);
        z.g.a(null, null, null, false, null, null, null, false, new C0015c(list, lVar, i10), h10, 0, 255);
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new d(c2Var, iVar, list, lVar, aVar, aVar2, i10));
    }
}
