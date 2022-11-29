package b0;

import q1.e0;
import q1.q0;

/* loaded from: classes.dex */
public interface i extends e0 {
    q0[] J(int i10, long j10);

    @Override // m2.d
    default long f(long j10) {
        if (j10 != b1.l.f16742b.a()) {
            return m2.h.b(t(b1.l.i(j10)), t(b1.l.g(j10)));
        }
        return m2.j.f40524b.a();
    }

    @Override // m2.d
    default float s(int i10) {
        return m2.g.l(i10 / getDensity());
    }

    @Override // m2.d
    default float t(float f10) {
        return m2.g.l(f10 / getDensity());
    }
}
