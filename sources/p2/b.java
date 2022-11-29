package p2;

import io.l;
import java.util.ArrayList;
import java.util.List;
import jo.p;
import jo.q;
import q1.b0;
import q1.c0;
import q1.d0;
import q1.e0;
import q1.q0;
import wn.v;
import xn.s;

/* loaded from: classes.dex */
public final class b implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f45719a = new b();

    /* loaded from: classes.dex */
    public static final class a extends q implements l<q0.a, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f45720w = new a();

        public a() {
            super(1);
        }

        public final void a(q0.a aVar) {
            p.h(aVar, "$this$layout");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(q0.a aVar) {
            a(aVar);
            return v.f59242a;
        }
    }

    /* renamed from: p2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0697b extends q implements l<q0.a, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q0 f45721w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0697b(q0 q0Var) {
            super(1);
            this.f45721w = q0Var;
        }

        public final void a(q0.a aVar) {
            p.h(aVar, "$this$layout");
            q0.a.n(aVar, this.f45721w, 0, 0, 0.0f, 4, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(q0.a aVar) {
            a(aVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements l<q0.a, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List<q0> f45722w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends q0> list) {
            super(1);
            this.f45722w = list;
        }

        public final void a(q0.a aVar) {
            p.h(aVar, "$this$layout");
            int l10 = s.l(this.f45722w);
            if (l10 < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                q0.a.n(aVar, this.f45722w.get(i10), 0, 0, 0.0f, 4, null);
                if (i10 == l10) {
                    return;
                }
                i10++;
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(q0.a aVar) {
            a(aVar);
            return v.f59242a;
        }
    }

    @Override // q1.c0
    public final d0 c(e0 e0Var, List<? extends b0> list, long j10) {
        int i10;
        int i11;
        p.h(e0Var, "$this$Layout");
        p.h(list, "measurables");
        int size = list.size();
        if (size != 0) {
            int i12 = 0;
            if (size != 1) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    arrayList.add(list.get(i13).M(j10));
                }
                int l10 = s.l(arrayList);
                if (l10 >= 0) {
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        q0 q0Var = (q0) arrayList.get(i12);
                        i14 = Math.max(i14, q0Var.r0());
                        i15 = Math.max(i15, q0Var.f0());
                        if (i12 == l10) {
                            break;
                        }
                        i12++;
                    }
                    i10 = i14;
                    i11 = i15;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                return e0.O0(e0Var, i10, i11, null, new c(arrayList), 4, null);
            }
            q0 M = list.get(0).M(j10);
            return e0.O0(e0Var, M.r0(), M.f0(), null, new C0697b(M), 4, null);
        }
        return e0.O0(e0Var, 0, 0, null, a.f45720w, 4, null);
    }
}
