package m2;

/* loaded from: classes.dex */
public final class l {
    public static final long a(int i10, int i11) {
        return k.e((i11 & 4294967295L) | (i10 << 32));
    }

    public static final long b(long j10, long j11) {
        return b1.g.a(b1.f.m(j10) - k.j(j11), b1.f.n(j10) - k.k(j11));
    }

    public static final long c(long j10, long j11) {
        return b1.g.a(b1.f.m(j10) + k.j(j11), b1.f.n(j10) + k.k(j11));
    }
}
