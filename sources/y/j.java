package y;

import androidx.compose.ui.platform.g2;
import java.util.List;
import java.util.Objects;
import l0.h2;
import q1.q0;
import s1.a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final q1.c0 f60812a = d(x0.a.f59327a.o(), false);

    /* renamed from: b  reason: collision with root package name */
    public static final q1.c0 f60813b = b.f60816a;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f60814w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f60815x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0.f fVar, int i10) {
            super(2);
            this.f60814w = fVar;
            this.f60815x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            j.a(this.f60814w, iVar, this.f60815x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements q1.c0 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f60816a = new b();

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<q0.a, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public static final a f60817w = new a();

            public a() {
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
            jo.p.h(e0Var, "$this$MeasurePolicy");
            jo.p.h(list, "<anonymous parameter 0>");
            return q1.e0.O0(e0Var, m2.b.p(j10), m2.b.o(j10), null, a.f60817w, 4, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements q1.c0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f60818a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ x0.a f60819b;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<q0.a, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public static final a f60820w = new a();

            public a() {
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

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.l<q0.a, wn.v> {
            public final /* synthetic */ int A;
            public final /* synthetic */ x0.a B;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ q1.q0 f60821w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ q1.b0 f60822x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ q1.e0 f60823y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f60824z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(q1.q0 q0Var, q1.b0 b0Var, q1.e0 e0Var, int i10, int i11, x0.a aVar) {
                super(1);
                this.f60821w = q0Var;
                this.f60822x = b0Var;
                this.f60823y = e0Var;
                this.f60824z = i10;
                this.A = i11;
                this.B = aVar;
            }

            public final void a(q0.a aVar) {
                jo.p.h(aVar, "$this$layout");
                j.g(aVar, this.f60821w, this.f60822x, this.f60823y.getLayoutDirection(), this.f60824z, this.A, this.B);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
                a(aVar);
                return wn.v.f59242a;
            }
        }

        /* renamed from: y.j$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1030c extends jo.q implements io.l<q0.a, wn.v> {
            public final /* synthetic */ jo.c0 A;
            public final /* synthetic */ x0.a B;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ q1.q0[] f60825w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ List<q1.b0> f60826x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ q1.e0 f60827y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ jo.c0 f60828z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1030c(q1.q0[] q0VarArr, List<? extends q1.b0> list, q1.e0 e0Var, jo.c0 c0Var, jo.c0 c0Var2, x0.a aVar) {
                super(1);
                this.f60825w = q0VarArr;
                this.f60826x = list;
                this.f60827y = e0Var;
                this.f60828z = c0Var;
                this.A = c0Var2;
                this.B = aVar;
            }

            public final void a(q0.a aVar) {
                jo.p.h(aVar, "$this$layout");
                q1.q0[] q0VarArr = this.f60825w;
                List<q1.b0> list = this.f60826x;
                q1.e0 e0Var = this.f60827y;
                jo.c0 c0Var = this.f60828z;
                jo.c0 c0Var2 = this.A;
                x0.a aVar2 = this.B;
                int length = q0VarArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i11 < length) {
                    q1.q0 q0Var = q0VarArr[i11];
                    Objects.requireNonNull(q0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    j.g(aVar, q0Var, list.get(i10), e0Var.getLayoutDirection(), c0Var.f38129w, c0Var2.f38129w, aVar2);
                    i11++;
                    i10++;
                }
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
                a(aVar);
                return wn.v.f59242a;
            }
        }

        public c(boolean z10, x0.a aVar) {
            this.f60818a = z10;
            this.f60819b = aVar;
        }

        @Override // q1.c0
        public final q1.d0 c(q1.e0 e0Var, List<? extends q1.b0> list, long j10) {
            int p10;
            q1.q0 M;
            int i10;
            jo.p.h(e0Var, "$this$MeasurePolicy");
            jo.p.h(list, "measurables");
            if (list.isEmpty()) {
                return q1.e0.O0(e0Var, m2.b.p(j10), m2.b.o(j10), null, a.f60820w, 4, null);
            }
            long e10 = this.f60818a ? j10 : m2.b.e(j10, 0, 0, 0, 0, 10, null);
            if (list.size() == 1) {
                q1.b0 b0Var = list.get(0);
                if (!j.f(b0Var)) {
                    q1.q0 M2 = b0Var.M(e10);
                    int max = Math.max(m2.b.p(j10), M2.r0());
                    i10 = Math.max(m2.b.o(j10), M2.f0());
                    M = M2;
                    p10 = max;
                } else {
                    p10 = m2.b.p(j10);
                    int o10 = m2.b.o(j10);
                    M = b0Var.M(m2.b.f40509b.c(m2.b.p(j10), m2.b.o(j10)));
                    i10 = o10;
                }
                return q1.e0.O0(e0Var, p10, i10, null, new b(M, b0Var, e0Var, p10, i10, this.f60819b), 4, null);
            }
            q1.q0[] q0VarArr = new q1.q0[list.size()];
            jo.c0 c0Var = new jo.c0();
            c0Var.f38129w = m2.b.p(j10);
            jo.c0 c0Var2 = new jo.c0();
            c0Var2.f38129w = m2.b.o(j10);
            int size = list.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                q1.b0 b0Var2 = list.get(i11);
                if (j.f(b0Var2)) {
                    z10 = true;
                } else {
                    q1.q0 M3 = b0Var2.M(e10);
                    q0VarArr[i11] = M3;
                    c0Var.f38129w = Math.max(c0Var.f38129w, M3.r0());
                    c0Var2.f38129w = Math.max(c0Var2.f38129w, M3.f0());
                }
            }
            if (z10) {
                int i12 = c0Var.f38129w;
                int i13 = i12 != Integer.MAX_VALUE ? i12 : 0;
                int i14 = c0Var2.f38129w;
                long a10 = m2.c.a(i13, i12, i14 != Integer.MAX_VALUE ? i14 : 0, i14);
                int size2 = list.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    q1.b0 b0Var3 = list.get(i15);
                    if (j.f(b0Var3)) {
                        q0VarArr[i15] = b0Var3.M(a10);
                    }
                }
            }
            return q1.e0.O0(e0Var, c0Var.f38129w, c0Var2.f38129w, null, new C1030c(q0VarArr, list, e0Var, c0Var, c0Var2, this.f60819b), 4, null);
        }
    }

    public static final void a(x0.f fVar, l0.i iVar, int i10) {
        int i11;
        jo.p.h(fVar, "modifier");
        l0.i h10 = iVar.h(-211209833);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(fVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            q1.c0 c0Var = f60813b;
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var = (g2) h10.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a11 = q1.w.a(fVar);
            int i12 = (((((i11 << 3) & 112) | 384) << 9) & 7168) | 6;
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
            h2.b(a12, c0Var, c0787a.d());
            h2.b(a12, dVar, c0787a.b());
            h2.b(a12, qVar, c0787a.c());
            h2.b(a12, g2Var, c0787a.f());
            h10.c();
            a11.s0(l0.n1.a(l0.n1.b(h10)), h10, Integer.valueOf((i12 >> 3) & 112));
            h10.x(2058660585);
            h10.x(1021196736);
            if (((i12 >> 9) & 14 & 11) == 2 && h10.j()) {
                h10.I();
            }
            h10.O();
            h10.O();
            h10.s();
            h10.O();
        }
        l0.l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(fVar, i10));
    }

    public static final q1.c0 d(x0.a aVar, boolean z10) {
        jo.p.h(aVar, "alignment");
        return new c(z10, aVar);
    }

    public static final i e(q1.b0 b0Var) {
        Object d10 = b0Var.d();
        if (d10 instanceof i) {
            return (i) d10;
        }
        return null;
    }

    public static final boolean f(q1.b0 b0Var) {
        i e10 = e(b0Var);
        if (e10 != null) {
            return e10.c();
        }
        return false;
    }

    public static final void g(q0.a aVar, q1.q0 q0Var, q1.b0 b0Var, m2.q qVar, int i10, int i11, x0.a aVar2) {
        x0.a b10;
        i e10 = e(b0Var);
        q0.a.l(aVar, q0Var, ((e10 == null || (b10 = e10.b()) == null) ? aVar2 : b10).a(m2.p.a(q0Var.r0(), q0Var.f0()), m2.p.a(i10, i11), qVar), 0.0f, 2, null);
    }

    public static final q1.c0 h(x0.a aVar, boolean z10, l0.i iVar, int i10) {
        q1.c0 c0Var;
        jo.p.h(aVar, "alignment");
        iVar.x(56522820);
        if (jo.p.c(aVar, x0.a.f59327a.o()) && !z10) {
            c0Var = f60812a;
        } else {
            Boolean valueOf = Boolean.valueOf(z10);
            iVar.x(511388516);
            boolean P = iVar.P(valueOf) | iVar.P(aVar);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = d(aVar, z10);
                iVar.q(y10);
            }
            iVar.O();
            c0Var = (q1.c0) y10;
        }
        iVar.O();
        return c0Var;
    }
}
