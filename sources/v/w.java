package v;

import androidx.compose.ui.platform.g2;
import java.util.List;
import l0.h2;
import l0.l1;
import l0.n1;
import q1.q0;
import s1.a;
import x0.f;

/* loaded from: classes.dex */
public final class w {

    /* loaded from: classes.dex */
    public static final class a implements q1.c0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f56433a = new a();

        /* renamed from: v.w$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0899a extends jo.q implements io.l<q0.a, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public static final C0899a f56434w = new C0899a();

            public C0899a() {
                super(1);
            }

            public final void a(q0.a aVar) {
                jo.p.h(aVar, "$this$layout");
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
                a(aVar);
                return wn.v.f59242a;
            }
        }

        @Override // q1.c0
        public final q1.d0 c(q1.e0 e0Var, List<? extends q1.b0> list, long j10) {
            jo.p.h(e0Var, "$this$Layout");
            jo.p.h(list, "<anonymous parameter 0>");
            return q1.e0.O0(e0Var, m2.b.p(j10), m2.b.o(j10), null, C0899a.f56434w, 4, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ q1.f A;
        public final /* synthetic */ float B;
        public final /* synthetic */ c1.d0 C;
        public final /* synthetic */ int D;
        public final /* synthetic */ int E;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f1.d f56435w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f56436x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x0.f f56437y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ x0.a f56438z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f1.d dVar, String str, x0.f fVar, x0.a aVar, q1.f fVar2, float f10, c1.d0 d0Var, int i10, int i11) {
            super(2);
            this.f56435w = dVar;
            this.f56436x = str;
            this.f56437y = fVar;
            this.f56438z = aVar;
            this.A = fVar2;
            this.B = f10;
            this.C = d0Var;
            this.D = i10;
            this.E = i11;
        }

        public final void a(l0.i iVar, int i10) {
            w.a(this.f56435w, this.f56436x, this.f56437y, this.f56438z, this.A, this.B, this.C, iVar, this.D | 1, this.E);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<w1.y, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f56439w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f56439w = str;
        }

        public final void a(w1.y yVar) {
            jo.p.h(yVar, "$this$semantics");
            w1.w.A(yVar, this.f56439w);
            w1.w.I(yVar, w1.h.f57895b.c());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(w1.y yVar) {
            a(yVar);
            return wn.v.f59242a;
        }
    }

    public static final void a(f1.d dVar, String str, x0.f fVar, x0.a aVar, q1.f fVar2, float f10, c1.d0 d0Var, l0.i iVar, int i10, int i11) {
        x0.f fVar3;
        jo.p.h(dVar, "painter");
        l0.i h10 = iVar.h(1142754848);
        f.a aVar2 = (i11 & 4) != 0 ? x0.f.f59359u : fVar;
        x0.a e10 = (i11 & 8) != 0 ? x0.a.f59327a.e() : aVar;
        q1.f d10 = (i11 & 16) != 0 ? q1.f.f48569a.d() : fVar2;
        float f11 = (i11 & 32) != 0 ? 1.0f : f10;
        c1.d0 d0Var2 = (i11 & 64) != 0 ? null : d0Var;
        h10.x(-816794123);
        if (str != null) {
            f.a aVar3 = x0.f.f59359u;
            h10.x(1157296644);
            boolean P = h10.P(str);
            Object y10 = h10.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new c(str);
                h10.q(y10);
            }
            h10.O();
            fVar3 = w1.p.b(aVar3, false, (io.l) y10, 1, null);
        } else {
            fVar3 = x0.f.f59359u;
        }
        h10.O();
        x0.f b10 = z0.n.b(z0.d.b(aVar2.L(fVar3)), dVar, false, e10, d10, f11, d0Var2, 2, null);
        a aVar4 = a.f56433a;
        h10.x(-1323940314);
        m2.d dVar2 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
        m2.q qVar = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
        g2 g2Var = (g2) h10.G(androidx.compose.ui.platform.o0.n());
        a.C0787a c0787a = s1.a.f51802o;
        io.a<s1.a> a10 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, wn.v> a11 = q1.w.a(b10);
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
        h2.b(a12, aVar4, c0787a.d());
        h2.b(a12, dVar2, c0787a.b());
        h2.b(a12, qVar, c0787a.c());
        h2.b(a12, g2Var, c0787a.f());
        h10.c();
        a11.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-2077995625);
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(dVar, str, aVar2, e10, d10, f11, d0Var2, i10, i11));
    }
}
