package f0;

import q1.q0;

/* loaded from: classes.dex */
public final class b1 implements q1.x {

    /* renamed from: w  reason: collision with root package name */
    public final o0 f31311w;

    /* renamed from: x  reason: collision with root package name */
    public final int f31312x;

    /* renamed from: y  reason: collision with root package name */
    public final e2.g0 f31313y;

    /* renamed from: z  reason: collision with root package name */
    public final io.a<t0> f31314z;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q1.e0 f31315w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ b1 f31316x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q1.q0 f31317y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f31318z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q1.e0 e0Var, b1 b1Var, q1.q0 q0Var, int i10) {
            super(1);
            this.f31315w = e0Var;
            this.f31316x = b1Var;
            this.f31317y = q0Var;
            this.f31318z = i10;
        }

        public final void a(q0.a aVar) {
            b1.h b10;
            jo.p.h(aVar, "$this$layout");
            q1.e0 e0Var = this.f31315w;
            int a10 = this.f31316x.a();
            e2.g0 f10 = this.f31316x.f();
            t0 invoke = this.f31316x.c().invoke();
            b10 = n0.b(e0Var, a10, f10, invoke != null ? invoke.i() : null, false, this.f31317y.r0());
            this.f31316x.b().j(w.q.Vertical, b10, this.f31318z, this.f31317y.f0());
            q0.a.n(aVar, this.f31317y, 0, lo.c.c(-this.f31316x.b().d()), 0.0f, 4, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    public b1(o0 o0Var, int i10, e2.g0 g0Var, io.a<t0> aVar) {
        jo.p.h(o0Var, "scrollerPosition");
        jo.p.h(g0Var, "transformedText");
        jo.p.h(aVar, "textLayoutResultProvider");
        this.f31311w = o0Var;
        this.f31312x = i10;
        this.f31313y = g0Var;
        this.f31314z = aVar;
    }

    public final int a() {
        return this.f31312x;
    }

    public final o0 b() {
        return this.f31311w;
    }

    public final io.a<t0> c() {
        return this.f31314z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            return jo.p.c(this.f31311w, b1Var.f31311w) && this.f31312x == b1Var.f31312x && jo.p.c(this.f31313y, b1Var.f31313y) && jo.p.c(this.f31314z, b1Var.f31314z);
        }
        return false;
    }

    public final e2.g0 f() {
        return this.f31313y;
    }

    public int hashCode() {
        return (((((this.f31311w.hashCode() * 31) + Integer.hashCode(this.f31312x)) * 31) + this.f31313y.hashCode()) * 31) + this.f31314z.hashCode();
    }

    @Override // q1.x
    public q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(b0Var, "measurable");
        q1.q0 M = b0Var.M(m2.b.e(j10, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        int min = Math.min(M.f0(), m2.b.m(j10));
        return q1.e0.O0(e0Var, M.r0(), min, null, new a(e0Var, this, M, min), 4, null);
    }

    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f31311w + ", cursorOffset=" + this.f31312x + ", transformedText=" + this.f31313y + ", textLayoutResultProvider=" + this.f31314z + ')';
    }
}
