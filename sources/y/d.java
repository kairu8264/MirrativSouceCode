package y;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f60693a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f60694b = new float[101];

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f60695c = new float[101];

    /* loaded from: classes.dex */
    public static final class a {
        public static long a(long j10) {
            return j10;
        }

        public static final float b(long j10) {
            jo.i iVar = jo.i.f38148a;
            return Float.intBitsToFloat((int) (j10 >> 32));
        }

        public static final float c(long j10) {
            jo.i iVar = jo.i.f38148a;
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
    }

    static {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20 = 0.0f;
        int i10 = 0;
        float f21 = 0.0f;
        while (true) {
            float f22 = 1.0f;
            if (i10 < 100) {
                float f23 = i10 / 100;
                float f24 = 1.0f;
                while (true) {
                    f10 = 2.0f;
                    f11 = ((f24 - f20) / 2.0f) + f20;
                    f12 = 3.0f;
                    f13 = f22 - f11;
                    f14 = f11 * 3.0f * f13;
                    f15 = f11 * f11 * f11;
                    float f25 = (((f13 * 0.175f) + (f11 * 0.35000002f)) * f14) + f15;
                    float f26 = f24;
                    if (Math.abs(f25 - f23) < 1.0E-5d) {
                        break;
                    }
                    if (f25 > f23) {
                        f24 = f11;
                    } else {
                        f20 = f11;
                        f24 = f26;
                    }
                    f22 = 1.0f;
                }
                f60694b[i10] = (f14 * ((f13 * 0.5f) + f11)) + f15;
                float f27 = 1.0f;
                while (true) {
                    f16 = ((f27 - f21) / f10) + f21;
                    f17 = 1.0f - f16;
                    f18 = f16 * f12 * f17;
                    f19 = f16 * f16 * f16;
                    float f28 = (((f17 * 0.5f) + f16) * f18) + f19;
                    if (Math.abs(f28 - f23) >= 1.0E-5d) {
                        if (f28 > f23) {
                            f27 = f16;
                        } else {
                            f21 = f16;
                        }
                        f10 = 2.0f;
                        f12 = 3.0f;
                    }
                }
                f60695c[i10] = (f18 * ((f17 * 0.175f) + (f16 * 0.35000002f))) + f19;
                i10++;
            } else {
                float[] fArr = f60695c;
                fArr[100] = 1.0f;
                f60694b[100] = fArr[100];
                return;
            }
        }
    }

    public final double a(float f10, float f11) {
        return Math.log((Math.abs(f10) * 0.35f) / f11);
    }

    public final long b(float f10) {
        float f11;
        float f12;
        float f13 = 100;
        int i10 = (int) (f13 * f10);
        if (i10 < 100) {
            float f14 = i10 / f13;
            int i11 = i10 + 1;
            float f15 = i11 / f13;
            float[] fArr = f60694b;
            float f16 = fArr[i10];
            f12 = (fArr[i11] - f16) / (f15 - f14);
            f11 = f16 + ((f10 - f14) * f12);
        } else {
            f11 = 1.0f;
            f12 = 0.0f;
        }
        return a.a((Float.floatToIntBits(f12) & 4294967295L) | (Float.floatToIntBits(f11) << 32));
    }
}
