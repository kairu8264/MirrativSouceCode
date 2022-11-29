package q1;

/* loaded from: classes.dex */
public final class w0 {
    public static final long a(float f10, float f11) {
        return v0.a((Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    public static final long b(long j10, long j11) {
        return b1.m.a(b1.l.i(j10) * v0.b(j11), b1.l.g(j10) * v0.c(j11));
    }
}
