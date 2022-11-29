package h0;

import q1.q0;

/* loaded from: classes.dex */
public final class r0 implements q1.x {

    /* renamed from: w  reason: collision with root package name */
    public final long f34152w;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f34153w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ q1.q0 f34154x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f34155y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, q1.q0 q0Var, int i11) {
            super(1);
            this.f34153w = i10;
            this.f34154x = q0Var;
            this.f34155y = i11;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            q0.a.j(aVar, this.f34154x, lo.c.c((this.f34153w - this.f34154x.r0()) / 2.0f), lo.c.c((this.f34155y - this.f34154x.f0()) / 2.0f), 0.0f, 4, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    public r0(long j10) {
        this.f34152w = j10;
    }

    public /* synthetic */ r0(long j10, jo.h hVar) {
        this(j10);
    }

    public boolean equals(Object obj) {
        r0 r0Var = obj instanceof r0 ? (r0) obj : null;
        if (r0Var == null) {
            return false;
        }
        return m2.j.f(this.f34152w, r0Var.f34152w);
    }

    public int hashCode() {
        return m2.j.i(this.f34152w);
    }

    @Override // q1.x
    public q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(b0Var, "measurable");
        q1.q0 M = b0Var.M(j10);
        int max = Math.max(M.r0(), e0Var.X(m2.j.h(this.f34152w)));
        int max2 = Math.max(M.f0(), e0Var.X(m2.j.g(this.f34152w)));
        return q1.e0.O0(e0Var, max, max2, null, new a(max, M, max2), 4, null);
    }
}
