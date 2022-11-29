package m2;

/* loaded from: classes.dex */
public final class s {
    public static final long a(float f10, long j10) {
        return f(j10, f10);
    }

    public static final long b(double d10) {
        return f(4294967296L, (float) d10);
    }

    public static final long c(float f10) {
        return f(4294967296L, f10);
    }

    public static final long d(int i10) {
        return f(4294967296L, i10);
    }

    public static final boolean e(long j10) {
        return r.f(j10) == 0;
    }

    public static final long f(long j10, float f10) {
        return r.c(j10 | (Float.floatToIntBits(f10) & 4294967295L));
    }
}
