package t;

import java.util.ArrayList;
import java.util.List;
import q1.q0;

/* loaded from: classes.dex */
public final class e implements q1.c0 {

    /* renamed from: a  reason: collision with root package name */
    public final h f52906a;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q1.l, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f52907w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(1);
            this.f52907w = i10;
        }

        @Override // io.l
        /* renamed from: a */
        public final Integer invoke(q1.l lVar) {
            jo.p.h(lVar, "it");
            return Integer.valueOf(lVar.e(this.f52907w));
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<q1.l, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f52908w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(1);
            this.f52908w = i10;
        }

        @Override // io.l
        /* renamed from: a */
        public final Integer invoke(q1.l lVar) {
            jo.p.h(lVar, "it");
            return Integer.valueOf(lVar.G(this.f52908w));
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List<q0> f52909w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends q0> list) {
            super(1);
            this.f52909w = list;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            List<q0> list = this.f52909w;
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                q0.a.j(aVar, list.get(i10), 0, 0, 0.0f, 4, null);
                if (i11 > size) {
                    return;
                }
                i10 = i11;
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
        public final /* synthetic */ int f52910w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10) {
            super(1);
            this.f52910w = i10;
        }

        @Override // io.l
        /* renamed from: a */
        public final Integer invoke(q1.l lVar) {
            jo.p.h(lVar, "it");
            return Integer.valueOf(lVar.u(this.f52910w));
        }
    }

    /* renamed from: t.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0815e extends jo.q implements io.l<q1.l, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f52911w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0815e(int i10) {
            super(1);
            this.f52911w = i10;
        }

        @Override // io.l
        /* renamed from: a */
        public final Integer invoke(q1.l lVar) {
            jo.p.h(lVar, "it");
            return Integer.valueOf(lVar.E(this.f52911w));
        }
    }

    public e(h hVar) {
        jo.p.h(hVar, "scope");
        this.f52906a = hVar;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    @Override // q1.c0
    public q1.d0 c(q1.e0 e0Var, List<? extends q1.b0> list, long j10) {
        Object obj;
        q1.d0 O0;
        jo.p.h(e0Var, "$receiver");
        jo.p.h(list, "measurables");
        ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
        for (q1.b0 b0Var : list) {
            arrayList.add(b0Var.M(j10));
        }
        q0 q0Var = null;
        int i10 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int r02 = ((q0) obj).r0();
            int l10 = xn.s.l(arrayList);
            if (1 <= l10) {
                int i11 = 1;
                while (true) {
                    int i12 = i11 + 1;
                    Object obj2 = arrayList.get(i11);
                    int r03 = ((q0) obj2).r0();
                    if (r02 < r03) {
                        obj = obj2;
                        r02 = r03;
                    }
                    if (i11 == l10) {
                        break;
                    }
                    i11 = i12;
                }
            }
        }
        q0 q0Var2 = (q0) obj;
        int r04 = q0Var2 == null ? 0 : q0Var2.r0();
        if (!arrayList.isEmpty()) {
            Object obj3 = arrayList.get(0);
            int f02 = ((q0) obj3).f0();
            int l11 = xn.s.l(arrayList);
            Object obj4 = obj3;
            if (1 <= l11) {
                while (true) {
                    int i13 = i10 + 1;
                    Object obj5 = arrayList.get(i10);
                    int f03 = ((q0) obj5).f0();
                    obj3 = obj4;
                    if (f02 < f03) {
                        obj3 = obj5;
                        f02 = f03;
                    }
                    if (i10 == l11) {
                        break;
                    }
                    i10 = i13;
                    obj4 = obj3;
                }
            }
            q0Var = obj3;
        }
        q0 q0Var3 = q0Var;
        int f04 = q0Var3 != null ? q0Var3.f0() : 0;
        this.f52906a.b().setValue(m2.o.b(m2.p.a(r04, f04)));
        O0 = q1.e0.O0(e0Var, r04, f04, null, new c(arrayList), 4, null);
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
        Integer num = (Integer) ro.n.t(ro.n.r(xn.a0.M(list), new C0815e(i10)));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
