package po;

import jo.p;
import po.g;

/* loaded from: classes4.dex */
public class n extends m {
    public static final float c(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static final int d(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static final long e(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static final <T extends Comparable<? super T>> T f(T t10, T t11) {
        p.h(t10, "<this>");
        p.h(t11, "minimumValue");
        return t10.compareTo(t11) < 0 ? t11 : t10;
    }

    public static final double g(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    public static final float h(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static final int i(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static final long j(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static final double k(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static final float l(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static final int m(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static final int n(int i10, f<Integer> fVar) {
        p.h(fVar, "range");
        if (fVar instanceof e) {
            return ((Number) p(Integer.valueOf(i10), (e) fVar)).intValue();
        }
        if (!fVar.isEmpty()) {
            return i10 < fVar.d().intValue() ? fVar.d().intValue() : i10 > fVar.j().intValue() ? fVar.j().intValue() : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + fVar + '.');
    }

    public static final long o(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static final <T extends Comparable<? super T>> T p(T t10, e<T> eVar) {
        p.h(t10, "<this>");
        p.h(eVar, "range");
        if (!eVar.isEmpty()) {
            return (!eVar.f(t10, eVar.d()) || eVar.f(eVar.d(), t10)) ? (!eVar.f(eVar.j(), t10) || eVar.f(t10, eVar.j())) ? t10 : eVar.j() : eVar.d();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + eVar + '.');
    }

    public static final g q(int i10, int i11) {
        return g.f48467z.a(i10, i11, -1);
    }

    public static final g r(g gVar) {
        p.h(gVar, "<this>");
        return g.f48467z.a(gVar.m(), gVar.k(), -gVar.p());
    }

    public static final g s(g gVar, int i10) {
        p.h(gVar, "<this>");
        m.a(i10 > 0, Integer.valueOf(i10));
        g.a aVar = g.f48467z;
        int k10 = gVar.k();
        int m10 = gVar.m();
        if (gVar.p() <= 0) {
            i10 = -i10;
        }
        return aVar.a(k10, m10, i10);
    }

    public static final i t(int i10, int i11) {
        if (i11 <= Integer.MIN_VALUE) {
            return i.A.a();
        }
        return new i(i10, i11 - 1);
    }
}
