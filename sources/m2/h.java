package m2;

/* loaded from: classes.dex */
public final class h {
    public static final long a(float f10, float f11) {
        return i.c((Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    public static final long b(float f10, float f11) {
        return j.d((Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    public static final float c(float f10, float f11, float f12) {
        return g.l(n2.a.a(f10, f11, f12));
    }
}
