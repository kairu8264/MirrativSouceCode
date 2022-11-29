package u;

/* loaded from: classes.dex */
public final class t {
    public static final wn.k<s, s> a(double d10, double d11, double d12) {
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        double d19;
        double d20;
        double d21 = -d11;
        double d22 = (d11 * d11) - ((4.0d * d10) * d12);
        s b10 = b(d22);
        d13 = b10.f54123a;
        b10.f54123a = d13 + d21;
        double d23 = d10 * 2.0d;
        d14 = b10.f54123a;
        b10.f54123a = d14 / d23;
        d15 = b10.f54124b;
        b10.f54124b = d15 / d23;
        s b11 = b(d22);
        d16 = b11.f54123a;
        double d24 = -1;
        b11.f54123a = d16 * d24;
        d17 = b11.f54124b;
        b11.f54124b = d17 * d24;
        d18 = b11.f54123a;
        b11.f54123a = d18 + d21;
        d19 = b11.f54123a;
        b11.f54123a = d19 / d23;
        d20 = b11.f54124b;
        b11.f54124b = d20 / d23;
        return wn.q.a(b10, b11);
    }

    public static final s b(double d10) {
        if (d10 < 0.0d) {
            return new s(0.0d, Math.sqrt(Math.abs(d10)));
        }
        return new s(Math.sqrt(d10), 0.0d);
    }
}
