package e1;

import c1.b0;
import c1.u0;

/* loaded from: classes.dex */
public interface g {
    static /* synthetic */ void e(g gVar, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        gVar.b(f10, f11);
    }

    static /* synthetic */ void f(g gVar, u0 u0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = b0.f18630a.b();
        }
        gVar.c(u0Var, i10);
    }

    void a(float f10, float f11, float f12, float f13, int i10);

    void b(float f10, float f11);

    void c(u0 u0Var, int i10);

    void d(float[] fArr);

    void g(float f10, float f11, long j10);

    void h(float f10, long j10);

    void i(float f10, float f11, float f12, float f13);
}
