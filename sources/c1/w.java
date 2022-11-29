package c1;

/* loaded from: classes.dex */
public interface w {
    static /* synthetic */ void h(w wVar, float f10, float f11, float f12, float f13, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i11 & 16) != 0) {
            i10 = b0.f18630a.b();
        }
        wVar.a(f10, f11, f12, f13, i10);
    }

    static /* synthetic */ void j(w wVar, u0 u0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = b0.f18630a.b();
        }
        wVar.c(u0Var, i10);
    }

    static /* synthetic */ void x(w wVar, b1.h hVar, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = b0.f18630a.b();
        }
        wVar.d(hVar, i10);
    }

    void a(float f10, float f11, float f12, float f13, int i10);

    void b(float f10, float f11);

    void c(u0 u0Var, int i10);

    default void d(b1.h hVar, int i10) {
        jo.p.h(hVar, "rect");
        a(hVar.i(), hVar.l(), hVar.j(), hVar.e(), i10);
    }

    void e(float f10, float f11);

    void f(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, s0 s0Var);

    void g(b1.h hVar, s0 s0Var);

    void i(float f10, float f11, float f12, float f13, s0 s0Var);

    void k();

    void l();

    void m(float f10);

    void n(k0 k0Var, long j10, long j11, long j12, long j13, s0 s0Var);

    default void o(b1.h hVar, s0 s0Var) {
        jo.p.h(hVar, "rect");
        jo.p.h(s0Var, "paint");
        i(hVar.i(), hVar.l(), hVar.j(), hVar.e(), s0Var);
    }

    void p();

    void q();

    void r(k0 k0Var, long j10, s0 s0Var);

    void s(float[] fArr);

    void t(long j10, float f10, s0 s0Var);

    void u(float f10, float f11, float f12, float f13, float f14, float f15, s0 s0Var);

    void v(long j10, long j11, s0 s0Var);

    void w(u0 u0Var, s0 s0Var);
}
