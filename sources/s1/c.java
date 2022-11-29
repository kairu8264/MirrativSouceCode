package s1;

/* loaded from: classes.dex */
public final class c {
    public static final int a(long j10, long j11) {
        boolean d10 = d(j10);
        if (d10 != d(j11)) {
            return d10 ? -1 : 1;
        }
        return (int) Math.signum(c(j10) - c(j11));
    }

    public static long b(long j10) {
        return j10;
    }

    public static final float c(long j10) {
        jo.i iVar = jo.i.f38148a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final boolean d(long j10) {
        return ((int) (j10 & 4294967295L)) != 0;
    }
}
