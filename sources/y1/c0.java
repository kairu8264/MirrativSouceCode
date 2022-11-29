package y1;

/* loaded from: classes.dex */
public final class c0 {
    public static final long a(int i10) {
        return b(i10, i10);
    }

    public static final long b(int i10, int i11) {
        return b0.c(d(i10, i11));
    }

    public static final long c(long j10, int i10, int i11) {
        int m10 = po.n.m(b0.n(j10), i10, i11);
        int m11 = po.n.m(b0.i(j10), i10, i11);
        return (m10 == b0.n(j10) && m11 == b0.i(j10)) ? j10 : b(m10, m11);
    }

    public static final long d(int i10, int i11) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i10 + ']').toString());
        }
        if (i11 >= 0) {
            return (i11 & 4294967295L) | (i10 << 32);
        }
        throw new IllegalArgumentException(("end cannot negative. [end: " + i11 + ']').toString());
    }
}
