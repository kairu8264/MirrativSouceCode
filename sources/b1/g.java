package b1;

/* loaded from: classes.dex */
public final class g {
    public static final long a(float f10, float f11) {
        return f.g((Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    public static final boolean b(long j10) {
        float m10 = f.m(j10);
        if ((Float.isInfinite(m10) || Float.isNaN(m10)) ? false : true) {
            float n10 = f.n(j10);
            if ((Float.isInfinite(n10) || Float.isNaN(n10)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(long j10) {
        return j10 != f.f16721b.b();
    }
}
