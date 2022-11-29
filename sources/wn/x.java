package wn;

/* loaded from: classes4.dex */
public final class x {
    public static final int a(long j10, long j11) {
        return jo.p.k(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    public static final double b(long j10) {
        return ((j10 >>> 11) * 2048) + (j10 & 2047);
    }

    public static final String c(long j10) {
        return d(j10, 10);
    }

    public static final String d(long j10, int i10) {
        if (j10 >= 0) {
            String l10 = Long.toString(j10, so.a.a(i10));
            jo.p.g(l10, "toString(this, checkRadix(radix))");
            return l10;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        String l11 = Long.toString(j12, so.a.a(i10));
        jo.p.g(l11, "toString(this, checkRadix(radix))");
        sb2.append(l11);
        String l12 = Long.toString(j13, so.a.a(i10));
        jo.p.g(l12, "toString(this, checkRadix(radix))");
        sb2.append(l12);
        return sb2.toString();
    }
}
