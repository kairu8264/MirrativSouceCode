package q1;

import java.util.ArrayList;
import java.util.List;
import q1.q0;
import s1.k;

/* loaded from: classes.dex */
public final class u0 extends k.h {

    /* renamed from: b  reason: collision with root package name */
    public static final u0 f48606b = new u0();

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f48607w = new a();

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

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q0 f48608w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q0 q0Var) {
            super(1);
            this.f48608w = q0Var;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            q0.a.r(aVar, this.f48608w, 0, 0, 0.0f, null, 12, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List<q0> f48609w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends q0> list) {
            super(1);
            this.f48609w = list;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            List<q0> list = this.f48609w;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                q0.a.r(aVar, list.get(i10), 0, 0, 0.0f, null, 12, null);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    public u0() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // q1.c0
    public d0 c(e0 e0Var, List<? extends b0> list, long j10) {
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(list, "measurables");
        if (list.isEmpty()) {
            return e0.O0(e0Var, m2.b.p(j10), m2.b.o(j10), null, a.f48607w, 4, null);
        }
        if (list.size() == 1) {
            q0 M = list.get(0).M(j10);
            return e0.O0(e0Var, m2.c.g(j10, M.r0()), m2.c.f(j10, M.f0()), null, new b(M), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(list.get(i10).M(j10));
        }
        int size2 = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size2; i13++) {
            q0 q0Var = (q0) arrayList.get(i13);
            i11 = Math.max(q0Var.r0(), i11);
            i12 = Math.max(q0Var.f0(), i12);
        }
        return e0.O0(e0Var, m2.c.g(j10, i11), m2.c.f(j10, i12), null, new c(arrayList), 4, null);
    }
}
