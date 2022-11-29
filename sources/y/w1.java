package y;

import q1.q0;

/* loaded from: classes.dex */
public final class w1 extends androidx.compose.ui.platform.d1 implements q1.x {
    public final Object A;

    /* renamed from: x  reason: collision with root package name */
    public final t f61012x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f61013y;

    /* renamed from: z  reason: collision with root package name */
    public final io.p<m2.o, m2.q, m2.k> f61014z;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, wn.v> {
        public final /* synthetic */ q1.e0 A;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f61016x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q1.q0 f61017y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f61018z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, q1.q0 q0Var, int i11, q1.e0 e0Var) {
            super(1);
            this.f61016x = i10;
            this.f61017y = q0Var;
            this.f61018z = i11;
            this.A = e0Var;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            q0.a.l(aVar, this.f61017y, ((m2.k) w1.this.f61014z.invoke(m2.o.b(m2.p.a(this.f61016x - this.f61017y.r0(), this.f61018z - this.f61017y.f0())), this.A.getLayoutDirection())).n(), 0.0f, 2, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w1(t tVar, boolean z10, io.p<? super m2.o, ? super m2.q, m2.k> pVar, Object obj, io.l<? super androidx.compose.ui.platform.c1, wn.v> lVar) {
        super(lVar);
        jo.p.h(tVar, "direction");
        jo.p.h(pVar, "alignmentCallback");
        jo.p.h(obj, "align");
        jo.p.h(lVar, "inspectorInfo");
        this.f61012x = tVar;
        this.f61013y = z10;
        this.f61014z = pVar;
        this.A = obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            return this.f61012x == w1Var.f61012x && this.f61013y == w1Var.f61013y && jo.p.c(this.A, w1Var.A);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f61012x.hashCode() * 31) + Boolean.hashCode(this.f61013y)) * 31) + this.A.hashCode();
    }

    @Override // q1.x
    public q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(b0Var, "measurable");
        t tVar = this.f61012x;
        t tVar2 = t.Vertical;
        int p10 = tVar != tVar2 ? 0 : m2.b.p(j10);
        t tVar3 = this.f61012x;
        t tVar4 = t.Horizontal;
        int o10 = tVar3 == tVar4 ? m2.b.o(j10) : 0;
        int i10 = Integer.MAX_VALUE;
        int n10 = (this.f61012x == tVar2 || !this.f61013y) ? m2.b.n(j10) : Integer.MAX_VALUE;
        if (this.f61012x == tVar4 || !this.f61013y) {
            i10 = m2.b.m(j10);
        }
        q1.q0 M = b0Var.M(m2.c.a(p10, n10, o10, i10));
        int m10 = po.n.m(M.r0(), m2.b.p(j10), m2.b.n(j10));
        int m11 = po.n.m(M.f0(), m2.b.o(j10), m2.b.m(j10));
        return q1.e0.O0(e0Var, m10, m11, null, new a(m10, M, m11, e0Var), 4, null);
    }
}
