package y;

import java.util.List;
import q1.q0;

/* loaded from: classes.dex */
public final class h1 implements q1.c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final h1 f60805a = new h1();

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f60806w = new a();

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
    public q1.d0 c(q1.e0 e0Var, List<? extends q1.b0> list, long j10) {
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(list, "measurables");
        return q1.e0.O0(e0Var, m2.b.l(j10) ? m2.b.n(j10) : 0, m2.b.k(j10) ? m2.b.m(j10) : 0, null, a.f60806w, 4, null);
    }
}
