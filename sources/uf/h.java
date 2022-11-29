package uf;

import h0.q1;
import io.l;
import java.util.List;
import jo.p;
import jo.q;
import q1.b0;
import q1.d0;
import q1.e0;
import q1.q0;
import q1.z;
import wn.v;
import xn.a0;
import xn.s;

/* loaded from: classes3.dex */
public final class h {

    /* loaded from: classes3.dex */
    public static final class a extends q implements l<Integer, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f55909w = new a();

        public a() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf(i10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends q implements io.q<e0, b0, m2.b, d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List<q1> f55910w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l<Integer, Integer> f55911x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f f55912y;

        /* loaded from: classes3.dex */
        public static final class a extends q implements l<q0.a, v> {

            /* renamed from: w  reason: collision with root package name */
            public static final a f55913w = new a();

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

        /* renamed from: uf.h$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0877b extends q implements l<q0.a, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ q0 f55914w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ int f55915x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ long f55916y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0877b(q0 q0Var, int i10, long j10) {
                super(1);
                this.f55914w = q0Var;
                this.f55915x = i10;
                this.f55916y = j10;
            }

            public final void a(q0.a aVar) {
                p.h(aVar, "$this$layout");
                q0.a.n(aVar, this.f55914w, this.f55915x, Math.max(m2.b.o(this.f55916y) - this.f55914w.f0(), 0), 0.0f, 4, null);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(q0.a aVar) {
                a(aVar);
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<q1> list, l<? super Integer, Integer> lVar, f fVar) {
            super(3);
            this.f55910w = list;
            this.f55911x = lVar;
            this.f55912y = fVar;
        }

        public final d0 a(e0 e0Var, b0 b0Var, long j10) {
            int X;
            int X2;
            p.h(e0Var, "$this$layout");
            p.h(b0Var, "measurable");
            if (this.f55910w.isEmpty()) {
                return e0.O0(e0Var, m2.b.n(j10), 0, null, a.f55913w, 4, null);
            }
            int min = Math.min(s.l(this.f55910w), this.f55911x.invoke(Integer.valueOf(this.f55912y.i())).intValue());
            q1 q1Var = this.f55910w.get(min);
            q1 q1Var2 = (q1) a0.a0(this.f55910w, min - 1);
            q1 q1Var3 = (q1) a0.a0(this.f55910w, min + 1);
            float k10 = this.f55912y.k();
            int i10 = (k10 > 0.0f ? 1 : (k10 == 0.0f ? 0 : -1));
            if (i10 > 0 && q1Var3 != null) {
                X = e0Var.X(m2.h.c(q1Var.c(), q1Var3.c(), k10));
            } else if (k10 < 0.0f && q1Var2 != null) {
                X = e0Var.X(m2.h.c(q1Var.c(), q1Var2.c(), -k10));
            } else {
                X = e0Var.X(q1Var.c());
            }
            if (i10 > 0 && q1Var3 != null) {
                X2 = e0Var.X(m2.h.c(q1Var.a(), q1Var3.a(), k10));
            } else if (k10 < 0.0f && q1Var2 != null) {
                X2 = e0Var.X(m2.h.c(q1Var.a(), q1Var2.a(), -k10));
            } else {
                X2 = e0Var.X(q1Var.a());
            }
            q0 M = b0Var.M(m2.c.a(X, X, 0, m2.b.m(j10)));
            return e0.O0(e0Var, m2.b.n(j10), Math.max(M.f0(), m2.b.o(j10)), null, new C0877b(M, X2, j10), 4, null);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ d0 s0(e0 e0Var, b0 b0Var, m2.b bVar) {
            return a(e0Var, b0Var, bVar.t());
        }
    }

    public static final x0.f a(x0.f fVar, f fVar2, List<q1> list, l<? super Integer, Integer> lVar) {
        p.h(fVar, "<this>");
        p.h(fVar2, "pagerState");
        p.h(list, "tabPositions");
        p.h(lVar, "pageIndexMapping");
        return z.a(fVar, new b(list, lVar, fVar2));
    }

    public static /* synthetic */ x0.f b(x0.f fVar, f fVar2, List list, l lVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            lVar = a.f55909w;
        }
        return a(fVar, fVar2, list, lVar);
    }
}
