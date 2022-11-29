package c1;

import q1.q0;

/* loaded from: classes.dex */
public final class h1 extends androidx.compose.ui.platform.d1 implements q1.x {
    public final float A;
    public final float B;
    public final float C;
    public final float D;
    public final float E;
    public final float F;
    public final float G;
    public final long H;
    public final g1 I;
    public final boolean J;
    public final b1 K;
    public final long L;
    public final long M;
    public final io.l<i0, wn.v> N;

    /* renamed from: x  reason: collision with root package name */
    public final float f18682x;

    /* renamed from: y  reason: collision with root package name */
    public final float f18683y;

    /* renamed from: z  reason: collision with root package name */
    public final float f18684z;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<i0, wn.v> {
        public a() {
            super(1);
        }

        public final void a(i0 i0Var) {
            jo.p.h(i0Var, "$this$null");
            i0Var.j(h1.this.f18682x);
            i0Var.r(h1.this.f18683y);
            i0Var.b(h1.this.f18684z);
            i0Var.v(h1.this.A);
            i0Var.g(h1.this.B);
            i0Var.n0(h1.this.C);
            i0Var.m(h1.this.D);
            i0Var.n(h1.this.E);
            i0Var.p(h1.this.F);
            i0Var.l(h1.this.G);
            i0Var.Y(h1.this.H);
            i0Var.A0(h1.this.I);
            i0Var.U(h1.this.J);
            i0Var.i(h1.this.K);
            i0Var.Q(h1.this.L);
            i0Var.Z(h1.this.M);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(i0 i0Var) {
            a(i0Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q1.q0 f18686w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ h1 f18687x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q1.q0 q0Var, h1 h1Var) {
            super(1);
            this.f18686w = q0Var;
            this.f18687x = h1Var;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            q0.a.v(aVar, this.f18686w, 0, 0, 0.0f, this.f18687x.N, 4, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    public h1(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, g1 g1Var, boolean z10, b1 b1Var, long j11, long j12, io.l<? super androidx.compose.ui.platform.c1, wn.v> lVar) {
        super(lVar);
        this.f18682x = f10;
        this.f18683y = f11;
        this.f18684z = f12;
        this.A = f13;
        this.B = f14;
        this.C = f15;
        this.D = f16;
        this.E = f17;
        this.F = f18;
        this.G = f19;
        this.H = j10;
        this.I = g1Var;
        this.J = z10;
        this.L = j11;
        this.M = j12;
        this.N = new a();
    }

    public /* synthetic */ h1(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, g1 g1Var, boolean z10, b1 b1Var, long j11, long j12, io.l lVar, jo.h hVar) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, g1Var, z10, b1Var, j11, j12, lVar);
    }

    public boolean equals(Object obj) {
        h1 h1Var = obj instanceof h1 ? (h1) obj : null;
        if (h1Var == null) {
            return false;
        }
        if (this.f18682x == h1Var.f18682x) {
            if (this.f18683y == h1Var.f18683y) {
                if (this.f18684z == h1Var.f18684z) {
                    if (this.A == h1Var.A) {
                        if (this.B == h1Var.B) {
                            if (this.C == h1Var.C) {
                                if (this.D == h1Var.D) {
                                    if (this.E == h1Var.E) {
                                        if (this.F == h1Var.F) {
                                            return ((this.G > h1Var.G ? 1 : (this.G == h1Var.G ? 0 : -1)) == 0) && n1.e(this.H, h1Var.H) && jo.p.c(this.I, h1Var.I) && this.J == h1Var.J && jo.p.c(this.K, h1Var.K) && c0.m(this.L, h1Var.L) && c0.m(this.M, h1Var.M);
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Float.hashCode(this.f18682x) * 31) + Float.hashCode(this.f18683y)) * 31) + Float.hashCode(this.f18684z)) * 31) + Float.hashCode(this.A)) * 31) + Float.hashCode(this.B)) * 31) + Float.hashCode(this.C)) * 31) + Float.hashCode(this.D)) * 31) + Float.hashCode(this.E)) * 31) + Float.hashCode(this.F)) * 31) + Float.hashCode(this.G)) * 31) + n1.h(this.H)) * 31) + this.I.hashCode()) * 31) + Boolean.hashCode(this.J)) * 31) + 0) * 31) + c0.s(this.L)) * 31) + c0.s(this.M);
    }

    @Override // q1.x
    public q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(b0Var, "measurable");
        q1.q0 M = b0Var.M(j10);
        return q1.e0.O0(e0Var, M.r0(), M.f0(), null, new b(M, this), 4, null);
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.f18682x + ", scaleY=" + this.f18683y + ", alpha = " + this.f18684z + ", translationX=" + this.A + ", translationY=" + this.B + ", shadowElevation=" + this.C + ", rotationX=" + this.D + ", rotationY=" + this.E + ", rotationZ=" + this.F + ", cameraDistance=" + this.G + ", transformOrigin=" + ((Object) n1.i(this.H)) + ", shape=" + this.I + ", clip=" + this.J + ", renderEffect=" + this.K + ", ambientShadowColor=" + ((Object) c0.t(this.L)) + ", spotShadowColor=" + ((Object) c0.t(this.M)) + ')';
    }
}
