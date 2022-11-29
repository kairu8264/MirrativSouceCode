package v;

import q1.q0;

/* loaded from: classes.dex */
public final class s0 implements q1.x {

    /* renamed from: w  reason: collision with root package name */
    public final r0 f56389w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f56390x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f56391y;

    /* renamed from: z  reason: collision with root package name */
    public final i0 f56392z;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f56394x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q1.q0 f56395y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, q1.q0 q0Var) {
            super(1);
            this.f56394x = i10;
            this.f56395y = q0Var;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            s0.this.a().l(this.f56394x);
            int m10 = po.n.m(s0.this.a().k(), 0, this.f56394x);
            int i10 = s0.this.b() ? m10 - this.f56394x : -m10;
            q0.a.r(aVar, this.f56395y, s0.this.c() ? 0 : i10, s0.this.c() ? i10 : 0, 0.0f, null, 12, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    public s0(r0 r0Var, boolean z10, boolean z11, i0 i0Var) {
        jo.p.h(r0Var, "scrollerState");
        jo.p.h(i0Var, "overscrollEffect");
        this.f56389w = r0Var;
        this.f56390x = z10;
        this.f56391y = z11;
        this.f56392z = i0Var;
    }

    public final r0 a() {
        return this.f56389w;
    }

    public final boolean b() {
        return this.f56390x;
    }

    public final boolean c() {
        return this.f56391y;
    }

    @Override // q1.x
    public int d(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        return lVar.G(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            return jo.p.c(this.f56389w, s0Var.f56389w) && this.f56390x == s0Var.f56390x && this.f56391y == s0Var.f56391y && jo.p.c(this.f56392z, s0Var.f56392z);
        }
        return false;
    }

    @Override // q1.x
    public int h(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        return lVar.u(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f56389w.hashCode() * 31;
        boolean z10 = this.f56390x;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f56391y;
        return ((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.f56392z.hashCode();
    }

    @Override // q1.x
    public q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(b0Var, "measurable");
        k.a(j10, this.f56391y ? w.q.Vertical : w.q.Horizontal);
        q1.q0 M = b0Var.M(m2.b.e(j10, 0, this.f56391y ? m2.b.n(j10) : Integer.MAX_VALUE, 0, this.f56391y ? Integer.MAX_VALUE : m2.b.m(j10), 5, null));
        int i10 = po.n.i(M.r0(), m2.b.n(j10));
        int i11 = po.n.i(M.f0(), m2.b.m(j10));
        int f02 = M.f0() - i11;
        int r02 = M.r0() - i10;
        if (!this.f56391y) {
            f02 = r02;
        }
        this.f56392z.setEnabled(f02 != 0);
        return q1.e0.O0(e0Var, i10, i11, null, new a(f02, M), 4, null);
    }

    public String toString() {
        return "ScrollingLayoutModifier(scrollerState=" + this.f56389w + ", isReversed=" + this.f56390x + ", isVertical=" + this.f56391y + ", overscrollEffect=" + this.f56392z + ')';
    }

    @Override // q1.x
    public int u(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        return lVar.e(i10);
    }

    @Override // q1.x
    public int w(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        return lVar.E(i10);
    }
}
