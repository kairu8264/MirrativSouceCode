package t;

/* loaded from: classes.dex */
public final class b0 {
    public static final void b(float[] fArr, float[] fArr2, int i10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        int i11;
        float f19 = 0.0f;
        int i12 = 0;
        float f20 = 0.0f;
        while (true) {
            float f21 = 1.0f;
            if (i12 < i10) {
                int i13 = i12 + 1;
                float f22 = i12 / i10;
                float f23 = 1.0f;
                while (true) {
                    f10 = 2.0f;
                    f11 = ((f23 - f19) / 2.0f) + f19;
                    f12 = f21 - f11;
                    f13 = f11 * 3.0f * f12;
                    f14 = f11 * f11 * f11;
                    float f24 = (((f12 * 0.175f) + (f11 * 0.35000002f)) * f13) + f14;
                    if (Math.abs(f24 - f22) < 1.0E-5d) {
                        break;
                    }
                    int i14 = i13;
                    if (f24 > f22) {
                        f23 = f11;
                    } else {
                        f19 = f11;
                    }
                    i13 = i14;
                    f21 = 1.0f;
                }
                fArr[i12] = (f13 * ((f12 * 0.5f) + f11)) + f14;
                float f25 = f21;
                while (true) {
                    f15 = ((f25 - f20) / f10) + f20;
                    f16 = f21 - f15;
                    f17 = f15 * 3.0f * f16;
                    f18 = f15 * f15 * f15;
                    float f26 = (((f16 * 0.5f) + f15) * f17) + f18;
                    i11 = i13;
                    if (Math.abs(f26 - f22) < 1.0E-5d) {
                        break;
                    }
                    if (f26 > f22) {
                        f25 = f15;
                    } else {
                        f20 = f15;
                    }
                    i13 = i11;
                    f21 = 1.0f;
                    f10 = 2.0f;
                }
                fArr2[i12] = (f17 * ((f16 * 0.175f) + (f15 * 0.35000002f))) + f18;
                i12 = i11;
            } else {
                fArr2[i10] = 1.0f;
                fArr[i10] = fArr2[i10];
                return;
            }
        }
    }
}
