package t;

import java.util.List;
import q1.q0;
import t.d;

/* loaded from: classes.dex */
public final class c implements q1.c0 {

    /* renamed from: a  reason: collision with root package name */
    public final t.d<?> f52880a;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q1.l, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f52881w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(1);
            this.f52881w = i10;
        }

        @Override // io.l
        /* renamed from: a */
        public final Integer invoke(q1.l lVar) {
            jo.p.h(lVar, "it");
            return Integer.valueOf(lVar.e(this.f52881w));
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<q1.l, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f52882w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(1);
            this.f52882w = i10;
        }

        @Override // io.l
        /* renamed from: a */
        public final Integer invoke(q1.l lVar) {
            jo.p.h(lVar, "it");
            return Integer.valueOf(lVar.G(this.f52882w));
        }
    }

    /* renamed from: t.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0813c extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q0[] f52883w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c f52884x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f52885y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f52886z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0813c(q0[] q0VarArr, c cVar, int i10, int i11) {
            super(1);
            this.f52883w = q0VarArr;
            this.f52884x = cVar;
            this.f52885y = i10;
            this.f52886z = i11;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            q0[] q0VarArr = this.f52883w;
            c cVar = this.f52884x;
            int i10 = this.f52885y;
            int i11 = this.f52886z;
            int length = q0VarArr.length;
            int i12 = 0;
            while (i12 < length) {
                q0 q0Var = q0VarArr[i12];
                i12++;
                if (q0Var != null) {
                    long a10 = cVar.j().g().a(m2.p.a(q0Var.r0(), q0Var.f0()), m2.p.a(i10, i11), m2.q.Ltr);
                    q0.a.j(aVar, q0Var, m2.k.j(a10), m2.k.k(a10), 0.0f, 4, null);
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<q1.l, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f52887w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10) {
            super(1);
            this.f52887w = i10;
        }

        @Override // io.l
        /* renamed from: a */
        public final Integer invoke(q1.l lVar) {
            jo.p.h(lVar, "it");
            return Integer.valueOf(lVar.u(this.f52887w));
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.l<q1.l, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f52888w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10) {
            super(1);
            this.f52888w = i10;
        }

        @Override // io.l
        /* renamed from: a */
        public final Integer invoke(q1.l lVar) {
            jo.p.h(lVar, "it");
            return Integer.valueOf(lVar.E(this.f52888w));
        }
    }

    public c(t.d<?> dVar) {
        jo.p.h(dVar, "rootScope");
        this.f52880a = dVar;
    }

    @Override // q1.c0
    public int a(q1.m mVar, List<? extends q1.l> list, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(list, "measurables");
        Integer num = (Integer) ro.n.t(ro.n.r(xn.a0.M(list), new a(i10)));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // q1.c0
    public q1.d0 c(q1.e0 e0Var, List<? extends q1.b0> list, long j10) {
        q0 q0Var;
        q1.d0 O0;
        jo.p.h(e0Var, "$receiver");
        jo.p.h(list, "measurables");
        int size = list.size();
        q0[] q0VarArr = new q0[size];
        int size2 = list.size() - 1;
        q0 q0Var2 = null;
        int i10 = 1;
        if (size2 >= 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                q1.b0 b0Var = list.get(i11);
                Object d10 = b0Var.d();
                d.a aVar = d10 instanceof d.a ? (d.a) d10 : null;
                if (aVar != null && aVar.a()) {
                    q0VarArr[i11] = b0Var.M(j10);
                }
                if (i12 > size2) {
                    break;
                }
                i11 = i12;
            }
        }
        int size3 = list.size() - 1;
        if (size3 >= 0) {
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                q1.b0 b0Var2 = list.get(i13);
                if (q0VarArr[i13] == null) {
                    q0VarArr[i13] = b0Var2.M(j10);
                }
                if (i14 > size3) {
                    break;
                }
                i13 = i14;
            }
        }
        if (size == 0) {
            q0Var = null;
        } else {
            q0Var = q0VarArr[0];
            int L = xn.o.L(q0VarArr);
            if (L != 0) {
                int r02 = q0Var == null ? 0 : q0Var.r0();
                if (1 <= L) {
                    int i15 = 1;
                    while (true) {
                        int i16 = i15 + 1;
                        q0 q0Var3 = q0VarArr[i15];
                        int r03 = q0Var3 == null ? 0 : q0Var3.r0();
                        if (r02 < r03) {
                            q0Var = q0Var3;
                            r02 = r03;
                        }
                        if (i15 == L) {
                            break;
                        }
                        i15 = i16;
                    }
                }
            }
        }
        int r04 = q0Var == null ? 0 : q0Var.r0();
        if (!(size == 0)) {
            q0Var2 = q0VarArr[0];
            int L2 = xn.o.L(q0VarArr);
            if (L2 != 0) {
                int f02 = q0Var2 == null ? 0 : q0Var2.f0();
                if (1 <= L2) {
                    while (true) {
                        int i17 = i10 + 1;
                        q0 q0Var4 = q0VarArr[i10];
                        int f03 = q0Var4 == null ? 0 : q0Var4.f0();
                        if (f02 < f03) {
                            q0Var2 = q0Var4;
                            f02 = f03;
                        }
                        if (i10 == L2) {
                            break;
                        }
                        i10 = i17;
                    }
                }
            }
        }
        int f04 = q0Var2 == null ? 0 : q0Var2.f0();
        this.f52880a.l(m2.p.a(r04, f04));
        O0 = q1.e0.O0(e0Var, r04, f04, null, new C0813c(q0VarArr, this, r04, f04), 4, null);
        return O0;
    }

    @Override // q1.c0
    public int d(q1.m mVar, List<? extends q1.l> list, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(list, "measurables");
        Integer num = (Integer) ro.n.t(ro.n.r(xn.a0.M(list), new b(i10)));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // q1.c0
    public int e(q1.m mVar, List<? extends q1.l> list, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(list, "measurables");
        Integer num = (Integer) ro.n.t(ro.n.r(xn.a0.M(list), new d(i10)));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // q1.c0
    public int g(q1.m mVar, List<? extends q1.l> list, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(list, "measurables");
        Integer num = (Integer) ro.n.t(ro.n.r(xn.a0.M(list), new e(i10)));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final t.d<?> j() {
        return this.f52880a;
    }
}
