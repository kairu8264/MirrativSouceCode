package y;

import q1.q0;

/* loaded from: classes.dex */
public final class p0 extends androidx.compose.ui.platform.d1 implements q1.x {

    /* renamed from: x  reason: collision with root package name */
    public final io.l<m2.d, m2.k> f60876x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f60877y;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ q1.e0 f60879x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q1.q0 f60880y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q1.e0 e0Var, q1.q0 q0Var) {
            super(1);
            this.f60879x = e0Var;
            this.f60880y = q0Var;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            long n10 = p0.this.b().invoke(this.f60879x).n();
            if (p0.this.c()) {
                q0.a.r(aVar, this.f60880y, m2.k.j(n10), m2.k.k(n10), 0.0f, null, 12, null);
            } else {
                q0.a.v(aVar, this.f60880y, m2.k.j(n10), m2.k.k(n10), 0.0f, null, 12, null);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p0(io.l<? super m2.d, m2.k> lVar, boolean z10, io.l<? super androidx.compose.ui.platform.c1, wn.v> lVar2) {
        super(lVar2);
        jo.p.h(lVar, "offset");
        jo.p.h(lVar2, "inspectorInfo");
        this.f60876x = lVar;
        this.f60877y = z10;
    }

    public final io.l<m2.d, m2.k> b() {
        return this.f60876x;
    }

    public final boolean c() {
        return this.f60877y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        p0 p0Var = obj instanceof p0 ? (p0) obj : null;
        if (p0Var == null) {
            return false;
        }
        return jo.p.c(this.f60876x, p0Var.f60876x) && this.f60877y == p0Var.f60877y;
    }

    public int hashCode() {
        return (this.f60876x.hashCode() * 31) + Boolean.hashCode(this.f60877y);
    }

    @Override // q1.x
    public q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(b0Var, "measurable");
        q1.q0 M = b0Var.M(j10);
        return q1.e0.O0(e0Var, M.r0(), M.f0(), null, new a(e0Var, M), 4, null);
    }

    public String toString() {
        return "OffsetPxModifier(offset=" + this.f60876x + ", rtlAware=" + this.f60877y + ')';
    }
}
