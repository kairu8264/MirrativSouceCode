package y1;

import c1.f1;
import c1.u0;
import java.util.List;

/* loaded from: classes.dex */
public interface h {
    float a();

    j2.d b(int i10);

    float c(int i10);

    b1.h d(int i10);

    long e(int i10);

    float f();

    default void g(c1.w wVar, c1.u uVar, f1 f1Var, j2.f fVar) {
        jo.p.h(wVar, "canvas");
        jo.p.h(uVar, "brush");
        throw new UnsupportedOperationException("Using brush for painting the paragraph is a separate functionality that is not supported on this platform");
    }

    float getHeight();

    float getWidth();

    int h(long j10);

    int i(int i10);

    int j(int i10, boolean z10);

    int k();

    float l(int i10);

    boolean m();

    int n(float f10);

    u0 o(int i10, int i11);

    float p(int i10, boolean z10);

    float q(int i10);

    float r();

    int s(int i10);

    j2.d t(int i10);

    float u(int i10);

    b1.h v(int i10);

    List<b1.h> w();

    void x(c1.w wVar, long j10, f1 f1Var, j2.f fVar);
}
