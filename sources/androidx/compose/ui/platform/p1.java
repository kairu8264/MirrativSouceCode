package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;

/* loaded from: classes.dex */
public final class p1 implements s1.x {
    public static final b I = new b(null);
    public static final io.p<r0, Matrix, wn.v> J = a.f14583w;
    public final l1 A;
    public boolean B;
    public boolean C;
    public c1.s0 D;
    public final g1<r0> E;
    public final c1.x F;
    public long G;
    public final r0 H;

    /* renamed from: w  reason: collision with root package name */
    public final AndroidComposeView f14579w;

    /* renamed from: x  reason: collision with root package name */
    public io.l<? super c1.w, wn.v> f14580x;

    /* renamed from: y  reason: collision with root package name */
    public io.a<wn.v> f14581y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f14582z;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<r0, Matrix, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f14583w = new a();

        public a() {
            super(2);
        }

        public final void a(r0 r0Var, Matrix matrix) {
            jo.p.h(r0Var, "rn");
            jo.p.h(matrix, "matrix");
            r0Var.I(matrix);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(r0 r0Var, Matrix matrix) {
            a(r0Var, matrix);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    public p1(AndroidComposeView androidComposeView, io.l<? super c1.w, wn.v> lVar, io.a<wn.v> aVar) {
        r0 m1Var;
        jo.p.h(androidComposeView, "ownerView");
        jo.p.h(lVar, "drawBlock");
        jo.p.h(aVar, "invalidateParentLayer");
        this.f14579w = androidComposeView;
        this.f14580x = lVar;
        this.f14581y = aVar;
        this.A = new l1(androidComposeView.getDensity());
        this.E = new g1<>(J);
        this.F = new c1.x();
        this.G = c1.n1.f18729b.a();
        if (Build.VERSION.SDK_INT >= 29) {
            m1Var = new n1(androidComposeView);
        } else {
            m1Var = new m1(androidComposeView);
        }
        m1Var.G(true);
        this.H = m1Var;
    }

    @Override // s1.x
    public void a(c1.w wVar) {
        jo.p.h(wVar, "canvas");
        Canvas c10 = c1.c.c(wVar);
        if (c10.isHardwareAccelerated()) {
            i();
            boolean z10 = this.H.R() > 0.0f;
            this.C = z10;
            if (z10) {
                wVar.l();
            }
            this.H.w(c10);
            if (this.C) {
                wVar.q();
                return;
            }
            return;
        }
        float a10 = this.H.a();
        float E = this.H.E();
        float f10 = this.H.f();
        float K = this.H.K();
        if (this.H.k() < 1.0f) {
            c1.s0 s0Var = this.D;
            if (s0Var == null) {
                s0Var = c1.i.a();
                this.D = s0Var;
            }
            s0Var.b(this.H.k());
            c10.saveLayer(a10, E, f10, K, s0Var.q());
        } else {
            wVar.p();
        }
        wVar.b(a10, E);
        wVar.s(this.E.b(this.H));
        j(wVar);
        io.l<? super c1.w, wn.v> lVar = this.f14580x;
        if (lVar != null) {
            lVar.invoke(wVar);
        }
        wVar.k();
        k(false);
    }

    @Override // s1.x
    public long b(long j10, boolean z10) {
        if (z10) {
            float[] a10 = this.E.a(this.H);
            return a10 != null ? c1.o0.f(a10, j10) : b1.f.f16721b.a();
        }
        return c1.o0.f(this.E.b(this.H), j10);
    }

    @Override // s1.x
    public void c(long j10) {
        int g10 = m2.o.g(j10);
        int f10 = m2.o.f(j10);
        float f11 = g10;
        this.H.L(c1.n1.f(this.G) * f11);
        float f12 = f10;
        this.H.M(c1.n1.g(this.G) * f12);
        r0 r0Var = this.H;
        if (r0Var.y(r0Var.a(), this.H.E(), this.H.a() + g10, this.H.E() + f10)) {
            this.A.h(b1.m.a(f11, f12));
            this.H.N(this.A.c());
            invalidate();
            this.E.c();
        }
    }

    @Override // s1.x
    public void d(io.l<? super c1.w, wn.v> lVar, io.a<wn.v> aVar) {
        jo.p.h(lVar, "drawBlock");
        jo.p.h(aVar, "invalidateParentLayer");
        k(false);
        this.B = false;
        this.C = false;
        this.G = c1.n1.f18729b.a();
        this.f14580x = lVar;
        this.f14581y = aVar;
    }

    @Override // s1.x
    public void destroy() {
        if (this.H.C()) {
            this.H.z();
        }
        this.f14580x = null;
        this.f14581y = null;
        this.B = true;
        k(false);
        this.f14579w.o0();
        this.f14579w.m0(this);
    }

    @Override // s1.x
    public boolean e(long j10) {
        float m10 = b1.f.m(j10);
        float n10 = b1.f.n(j10);
        if (this.H.D()) {
            return 0.0f <= m10 && m10 < ((float) this.H.getWidth()) && 0.0f <= n10 && n10 < ((float) this.H.getHeight());
        } else if (this.H.F()) {
            return this.A.e(j10);
        } else {
            return true;
        }
    }

    @Override // s1.x
    public void f(b1.d dVar, boolean z10) {
        jo.p.h(dVar, "rect");
        if (z10) {
            float[] a10 = this.E.a(this.H);
            if (a10 == null) {
                dVar.g(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            } else {
                c1.o0.g(a10, dVar);
                return;
            }
        }
        c1.o0.g(this.E.b(this.H), dVar);
    }

    @Override // s1.x
    public void g(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, c1.g1 g1Var, boolean z10, c1.b1 b1Var, long j11, long j12, m2.q qVar, m2.d dVar) {
        io.a<wn.v> aVar;
        jo.p.h(g1Var, "shape");
        jo.p.h(qVar, "layoutDirection");
        jo.p.h(dVar, "density");
        this.G = j10;
        boolean z11 = true;
        boolean z12 = this.H.F() && !this.A.d();
        this.H.j(f10);
        this.H.r(f11);
        this.H.b(f12);
        this.H.v(f13);
        this.H.g(f14);
        this.H.A(f15);
        this.H.O(c1.e0.i(j11));
        this.H.Q(c1.e0.i(j12));
        this.H.p(f18);
        this.H.m(f16);
        this.H.n(f17);
        this.H.l(f19);
        this.H.L(c1.n1.f(j10) * this.H.getWidth());
        this.H.M(c1.n1.g(j10) * this.H.getHeight());
        this.H.P(z10 && g1Var != c1.a1.a());
        this.H.x(z10 && g1Var == c1.a1.a());
        this.H.i(b1Var);
        boolean g10 = this.A.g(g1Var, this.H.k(), this.H.F(), this.H.R(), qVar, dVar);
        this.H.N(this.A.c());
        if (!this.H.F() || this.A.d()) {
            z11 = false;
        }
        if (z12 == z11 && (!z11 || !g10)) {
            l();
        } else {
            invalidate();
        }
        if (!this.C && this.H.R() > 0.0f && (aVar = this.f14581y) != null) {
            aVar.invoke();
        }
        this.E.c();
    }

    @Override // s1.x
    public void h(long j10) {
        int a10 = this.H.a();
        int E = this.H.E();
        int j11 = m2.k.j(j10);
        int k10 = m2.k.k(j10);
        if (a10 == j11 && E == k10) {
            return;
        }
        this.H.J(j11 - a10);
        this.H.B(k10 - E);
        l();
        this.E.c();
    }

    @Override // s1.x
    public void i() {
        if (this.f14582z || !this.H.C()) {
            k(false);
            c1.u0 b10 = (!this.H.F() || this.A.d()) ? null : this.A.b();
            io.l<? super c1.w, wn.v> lVar = this.f14580x;
            if (lVar != null) {
                this.H.H(this.F, b10, lVar);
            }
        }
    }

    @Override // s1.x
    public void invalidate() {
        if (this.f14582z || this.B) {
            return;
        }
        this.f14579w.invalidate();
        k(true);
    }

    public final void j(c1.w wVar) {
        if (this.H.F() || this.H.D()) {
            this.A.a(wVar);
        }
    }

    public final void k(boolean z10) {
        if (z10 != this.f14582z) {
            this.f14582z = z10;
            this.f14579w.i0(this, z10);
        }
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 26) {
            s2.f14605a.a(this.f14579w);
        } else {
            this.f14579w.invalidate();
        }
    }
}
