package m2;

/* loaded from: classes.dex */
public interface d {
    float G0();

    default float I0(float f10) {
        return f10 * getDensity();
    }

    default int N0(long j10) {
        return lo.c.c(c0(j10));
    }

    default long W0(long j10) {
        if (j10 != j.f40524b.a()) {
            return b1.m.a(I0(j.h(j10)), I0(j.g(j10)));
        }
        return b1.l.f16742b.a();
    }

    default int X(float f10) {
        float I0 = I0(f10);
        if (Float.isInfinite(I0)) {
            return Integer.MAX_VALUE;
        }
        return lo.c.c(I0);
    }

    default float c0(long j10) {
        if (t.g(r.g(j10), t.f40544b.b())) {
            return r.h(j10) * G0() * getDensity();
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    default long f(long j10) {
        if (j10 != b1.l.f16742b.a()) {
            return h.b(t(b1.l.i(j10)), t(b1.l.g(j10)));
        }
        return j.f40524b.a();
    }

    float getDensity();

    default float s(int i10) {
        return g.l(i10 / getDensity());
    }

    default float t(float f10) {
        return g.l(f10 / getDensity());
    }
}
