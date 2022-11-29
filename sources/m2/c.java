package m2;

/* loaded from: classes.dex */
public final class c {
    public static final long a(int i10, int i11, int i12, int i13) {
        boolean z10 = true;
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("maxWidth(" + i11 + ") must be >= than minWidth(" + i10 + ')').toString());
        }
        if (!(i13 >= i12)) {
            throw new IllegalArgumentException(("maxHeight(" + i13 + ") must be >= than minHeight(" + i12 + ')').toString());
        }
        if (i10 < 0 || i12 < 0) {
            z10 = false;
        }
        if (z10) {
            return b.f40509b.b(i10, i11, i12, i13);
        }
        throw new IllegalArgumentException(("minWidth(" + i10 + ") and minHeight(" + i12 + ") must be >= 0").toString());
    }

    public static /* synthetic */ long b(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return a(i10, i11, i12, i13);
    }

    public static final int c(int i10, int i11) {
        return i10 == Integer.MAX_VALUE ? i10 : po.n.d(i10 + i11, 0);
    }

    public static final long d(long j10, long j11) {
        return p.a(po.n.m(o.g(j11), b.p(j10), b.n(j10)), po.n.m(o.f(j11), b.o(j10), b.m(j10)));
    }

    public static final long e(long j10, long j11) {
        return a(po.n.m(b.p(j11), b.p(j10), b.n(j10)), po.n.m(b.n(j11), b.p(j10), b.n(j10)), po.n.m(b.o(j11), b.o(j10), b.m(j10)), po.n.m(b.m(j11), b.o(j10), b.m(j10)));
    }

    public static final int f(long j10, int i10) {
        return po.n.m(i10, b.o(j10), b.m(j10));
    }

    public static final int g(long j10, int i10) {
        return po.n.m(i10, b.p(j10), b.n(j10));
    }

    public static final boolean h(long j10, long j11) {
        int p10 = b.p(j10);
        int n10 = b.n(j10);
        int g10 = o.g(j11);
        if (p10 <= g10 && g10 <= n10) {
            int o10 = b.o(j10);
            int m10 = b.m(j10);
            int f10 = o.f(j11);
            if (o10 <= f10 && f10 <= m10) {
                return true;
            }
        }
        return false;
    }

    public static final long i(long j10, int i10, int i11) {
        return a(po.n.d(b.p(j10) + i10, 0), c(b.n(j10), i10), po.n.d(b.o(j10) + i11, 0), c(b.m(j10), i11));
    }
}
