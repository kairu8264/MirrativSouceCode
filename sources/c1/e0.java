package c1;

/* loaded from: classes.dex */
public final class e0 {
    /* JADX WARN: Removed duplicated region for block: B:108:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long a(float r9, float r10, float r11, float r12, d1.c r13) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.e0.a(float, float, float, float, d1.c):long");
    }

    public static final long b(int i10) {
        return c0.h(wn.t.c(wn.t.c(i10) << 32));
    }

    public static final long c(long j10) {
        return c0.h(wn.t.c(wn.t.c(wn.t.c(j10) & 4294967295L) << 32));
    }

    public static final /* synthetic */ float[] d(long j10) {
        return f(j10);
    }

    public static final long e(long j10, long j11) {
        long i10 = c0.i(j10, c0.p(j11));
        float n10 = c0.n(j11);
        float n11 = c0.n(i10);
        float f10 = 1.0f - n11;
        float f11 = (n10 * f10) + n11;
        int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        return a(i11 == 0 ? 0.0f : ((c0.r(i10) * n11) + ((c0.r(j11) * n10) * f10)) / f11, i11 == 0 ? 0.0f : ((c0.q(i10) * n11) + ((c0.q(j11) * n10) * f10)) / f11, i11 == 0 ? 0.0f : ((c0.o(i10) * n11) + ((c0.o(j11) * n10) * f10)) / f11, f11, c0.p(j11));
    }

    public static final float[] f(long j10) {
        return new float[]{c0.r(j10), c0.q(j10), c0.o(j10), c0.n(j10)};
    }

    public static final float g(long j10) {
        d1.c p10 = c0.p(j10);
        if (d1.b.e(p10.f(), d1.b.f28954a.b())) {
            io.l<Double, Double> l10 = ((d1.k) p10).l();
            return h((float) ((l10.invoke(Double.valueOf(c0.r(j10))).doubleValue() * 0.2126d) + (l10.invoke(Double.valueOf(c0.q(j10))).doubleValue() * 0.7152d) + (l10.invoke(Double.valueOf(c0.o(j10))).doubleValue() * 0.0722d)));
        }
        throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) d1.b.h(p10.f()))).toString());
    }

    public static final float h(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    public static final int i(long j10) {
        d1.c p10 = c0.p(j10);
        if (p10.h()) {
            return (int) wn.t.c(j10 >>> 32);
        }
        float[] f10 = f(j10);
        d1.d.i(p10, null, 0, 3, null).a(f10);
        return ((int) ((f10[2] * 255.0f) + 0.5f)) | (((int) ((f10[3] * 255.0f) + 0.5f)) << 24) | (((int) ((f10[0] * 255.0f) + 0.5f)) << 16) | (((int) ((f10[1] * 255.0f) + 0.5f)) << 8);
    }
}
