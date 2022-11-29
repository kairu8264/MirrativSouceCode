package q1;

/* loaded from: classes.dex */
public final class g {
    public static final float e(long j10, long j11) {
        return b1.l.g(j11) / b1.l.g(j10);
    }

    public static final float f(long j10, long j11) {
        return Math.max(h(j10, j11), e(j10, j11));
    }

    public static final float g(long j10, long j11) {
        return Math.min(h(j10, j11), e(j10, j11));
    }

    public static final float h(long j10, long j11) {
        return b1.l.i(j11) / b1.l.i(j10);
    }
}
