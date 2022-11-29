package p000do;

/* renamed from: do.c  reason: invalid package */
/* loaded from: classes4.dex */
public final class c {
    public static final int a(int i10, int i11, int i12) {
        return e(e(i10, i12) - e(i11, i12), i12);
    }

    public static final long b(long j10, long j11, long j12) {
        return f(f(j10, j12) - f(j11, j12), j12);
    }

    public static final int c(int i10, int i11, int i12) {
        if (i12 > 0) {
            return i10 >= i11 ? i11 : i11 - a(i11, i10, i12);
        } else if (i12 < 0) {
            return i10 <= i11 ? i11 : i11 + a(i10, i11, -i12);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    public static final long d(long j10, long j11, long j12) {
        int i10 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
        if (i10 > 0) {
            return j10 >= j11 ? j11 : j11 - b(j11, j10, j12);
        } else if (i10 < 0) {
            return j10 <= j11 ? j11 : j11 + b(j10, j11, -j12);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    public static final int e(int i10, int i11) {
        int i12 = i10 % i11;
        return i12 >= 0 ? i12 : i12 + i11;
    }

    public static final long f(long j10, long j11) {
        long j12 = j10 % j11;
        return j12 >= 0 ? j12 : j12 + j11;
    }
}
