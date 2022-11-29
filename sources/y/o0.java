package y;

import q1.q0;

/* loaded from: classes.dex */
public final class o0 extends androidx.compose.ui.platform.d1 implements q1.x {

    /* renamed from: x  reason: collision with root package name */
    public final float f60861x;

    /* renamed from: y  reason: collision with root package name */
    public final float f60862y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f60863z;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ q1.q0 f60865x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q1.e0 f60866y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q1.q0 q0Var, q1.e0 e0Var) {
            super(1);
            this.f60865x = q0Var;
            this.f60866y = e0Var;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            if (o0.this.b()) {
                q0.a.n(aVar, this.f60865x, this.f60866y.X(o0.this.c()), this.f60866y.X(o0.this.f()), 0.0f, 4, null);
            } else {
                q0.a.j(aVar, this.f60865x, this.f60866y.X(o0.this.c()), this.f60866y.X(o0.this.f()), 0.0f, 4, null);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    public o0(float f10, float f11, boolean z10, io.l<? super androidx.compose.ui.platform.c1, wn.v> lVar) {
        super(lVar);
        this.f60861x = f10;
        this.f60862y = f11;
        this.f60863z = z10;
    }

    public /* synthetic */ o0(float f10, float f11, boolean z10, io.l lVar, jo.h hVar) {
        this(f10, f11, z10, lVar);
    }

    public final boolean b() {
        return this.f60863z;
    }

    public final float c() {
        return this.f60861x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        o0 o0Var = obj instanceof o0 ? (o0) obj : null;
        if (o0Var == null) {
            return false;
        }
        return m2.g.n(this.f60861x, o0Var.f60861x) && m2.g.n(this.f60862y, o0Var.f60862y) && this.f60863z == o0Var.f60863z;
    }

    public final float f() {
        return this.f60862y;
    }

    public int hashCode() {
        return (((m2.g.o(this.f60861x) * 31) + m2.g.o(this.f60862y)) * 31) + Boolean.hashCode(this.f60863z);
    }

    @Override // q1.x
    public q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(b0Var, "measurable");
        q1.q0 M = b0Var.M(j10);
        return q1.e0.O0(e0Var, M.r0(), M.f0(), null, new a(M, e0Var), 4, null);
    }

    public String toString() {
        return "OffsetModifier(x=" + ((Object) m2.g.p(this.f60861x)) + ", y=" + ((Object) m2.g.p(this.f60862y)) + ", rtlAware=" + this.f60863z + ')';
    }
}
