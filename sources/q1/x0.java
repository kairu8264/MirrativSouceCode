package q1;

import androidx.compose.ui.platform.g2;
import l0.c2;
import l0.h2;
import l0.l1;
import l0.u1;
import s1.a;

/* loaded from: classes.dex */
public final class x0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<s1.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f48613w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a aVar) {
            super(0);
            this.f48613w = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, s1.k] */
        @Override // io.a
        public final s1.k invoke() {
            return this.f48613w.invoke();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f48614w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p<z0, m2.b, d0> f48615x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f48616y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f48617z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x0.f fVar, io.p<? super z0, ? super m2.b, ? extends d0> pVar, int i10, int i11) {
            super(2);
            this.f48614w = fVar;
            this.f48615x = pVar;
            this.f48616y = i10;
            this.f48617z = i11;
        }

        public final void a(l0.i iVar, int i10) {
            x0.b(this.f48614w, this.f48615x, iVar, this.f48616y | 1, this.f48617z);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ y0 f48618w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(y0 y0Var) {
            super(0);
            this.f48618w = y0Var;
        }

        public final void a() {
            this.f48618w.e();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<l0.a0, l0.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c2<y0> f48619w;

        /* loaded from: classes.dex */
        public static final class a implements l0.z {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c2 f48620a;

            public a(c2 c2Var) {
                this.f48620a = c2Var;
            }

            @Override // l0.z
            public void dispose() {
                ((y0) this.f48620a.getValue()).d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c2<y0> c2Var) {
            super(1);
            this.f48619w = c2Var;
        }

        @Override // io.l
        /* renamed from: a */
        public final l0.z invoke(l0.a0 a0Var) {
            jo.p.h(a0Var, "$this$DisposableEffect");
            return new a(this.f48619w);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ y0 f48621w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f48622x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.p<z0, m2.b, d0> f48623y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f48624z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(y0 y0Var, x0.f fVar, io.p<? super z0, ? super m2.b, ? extends d0> pVar, int i10, int i11) {
            super(2);
            this.f48621w = y0Var;
            this.f48622x = fVar;
            this.f48623y = pVar;
            this.f48624z = i10;
            this.A = i11;
        }

        public final void a(l0.i iVar, int i10) {
            x0.a(this.f48621w, this.f48622x, this.f48623y, iVar, this.f48624z | 1, this.A);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(y0 y0Var, x0.f fVar, io.p<? super z0, ? super m2.b, ? extends d0> pVar, l0.i iVar, int i10, int i11) {
        jo.p.h(y0Var, "state");
        jo.p.h(pVar, "measurePolicy");
        l0.i h10 = iVar.h(-511989831);
        if ((i11 & 2) != 0) {
            fVar = x0.f.f59359u;
        }
        x0.f fVar2 = fVar;
        l0.m d10 = l0.h.d(h10, 0);
        x0.f e10 = x0.e.e(h10, fVar2);
        m2.d dVar = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
        m2.q qVar = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
        g2 g2Var = (g2) h10.G(androidx.compose.ui.platform.o0.n());
        io.a<s1.k> a10 = s1.k.f51858p0.a();
        h10.x(1886828752);
        if (!(h10.k() instanceof l0.e)) {
            l0.h.c();
        }
        h10.m();
        if (h10.f()) {
            h10.r(new a(a10));
        } else {
            h10.o();
        }
        l0.i a11 = h2.a(h10);
        h2.b(a11, y0Var, y0Var.h());
        h2.b(a11, d10, y0Var.f());
        a.C0787a c0787a = s1.a.f51802o;
        h2.b(a11, e10, c0787a.e());
        h2.b(a11, pVar, y0Var.g());
        h2.b(a11, dVar, c0787a.b());
        h2.b(a11, qVar, c0787a.c());
        h2.b(a11, g2Var, c0787a.f());
        h10.s();
        h10.O();
        h10.x(-607848778);
        if (!h10.j()) {
            l0.c0.g(new c(y0Var), h10, 0);
        }
        h10.O();
        c2 l10 = u1.l(y0Var, h10, 8);
        wn.v vVar = wn.v.f59242a;
        h10.x(1157296644);
        boolean P = h10.P(l10);
        Object y10 = h10.y();
        if (P || y10 == l0.i.f39065a.a()) {
            y10 = new d(l10);
            h10.q(y10);
        }
        h10.O();
        l0.c0.a(vVar, (io.l) y10, h10, 0);
        l1 l11 = h10.l();
        if (l11 == null) {
            return;
        }
        l11.a(new e(y0Var, fVar2, pVar, i10, i11));
    }

    public static final void b(x0.f fVar, io.p<? super z0, ? super m2.b, ? extends d0> pVar, l0.i iVar, int i10, int i11) {
        int i12;
        jo.p.h(pVar, "measurePolicy");
        l0.i h10 = iVar.h(-1298353104);
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
            i12 |= h10.P(pVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            if (i13 != 0) {
                fVar = x0.f.f59359u;
            }
            h10.x(-492369756);
            Object y10 = h10.y();
            if (y10 == l0.i.f39065a.a()) {
                y10 = new y0();
                h10.q(y10);
            }
            h10.O();
            int i14 = i12 << 3;
            a((y0) y10, fVar, pVar, h10, (i14 & 112) | 8 | (i14 & 896), 0);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(fVar, pVar, i10, i11));
    }
}
