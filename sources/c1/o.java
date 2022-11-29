package c1;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.List;

/* loaded from: classes.dex */
public final class o {
    public static final Shader a(long j10, long j11, List<c0> list, List<Float> list2, int i10) {
        jo.p.h(list, "colors");
        e(list, list2);
        int b10 = b(list);
        return new LinearGradient(b1.f.m(j10), b1.f.n(j10), b1.f.m(j11), b1.f.n(j11), c(list, b10), d(list2, list, b10), p.a(i10));
    }

    public static final int b(List<c0> list) {
        jo.p.h(list, "colors");
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int l10 = xn.s.l(list);
        int i10 = 0;
        for (int i11 = 1; i11 < l10; i11++) {
            if (c0.n(list.get(i11).u()) == 0.0f) {
                i10++;
            }
        }
        return i10;
    }

    public static final int[] c(List<c0> list, int i10) {
        int i11;
        jo.p.h(list, "colors");
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i12 = 0; i12 < size; i12++) {
                iArr[i12] = e0.i(list.get(i12).u());
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i10];
        int l10 = xn.s.l(list);
        int size2 = list.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size2; i14++) {
            long u10 = list.get(i14).u();
            if (c0.n(u10) == 0.0f) {
                if (i14 == 0) {
                    i11 = i13 + 1;
                    iArr2[i13] = e0.i(c0.k(list.get(1).u(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i14 == l10) {
                    i11 = i13 + 1;
                    iArr2[i13] = e0.i(c0.k(list.get(i14 - 1).u(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i15 = i13 + 1;
                    iArr2[i13] = e0.i(c0.k(list.get(i14 - 1).u(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i13 = i15 + 1;
                    iArr2[i15] = e0.i(c0.k(list.get(i14 + 1).u(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i13 = i11;
            } else {
                iArr2[i13] = e0.i(u10);
                i13++;
            }
        }
        return iArr2;
    }

    public static final float[] d(List<Float> list, List<c0> list2, int i10) {
        jo.p.h(list2, "colors");
        if (i10 == 0) {
            if (list != null) {
                return xn.a0.z0(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i10];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int l10 = xn.s.l(list2);
        int i11 = 1;
        for (int i12 = 1; i12 < l10; i12++) {
            long u10 = list2.get(i12).u();
            float floatValue = list != null ? list.get(i12).floatValue() : i12 / xn.s.l(list2);
            int i13 = i11 + 1;
            fArr[i11] = floatValue;
            if (c0.n(u10) == 0.0f) {
                i11 = i13 + 1;
                fArr[i13] = floatValue;
            } else {
                i11 = i13;
            }
        }
        fArr[i11] = list != null ? list.get(xn.s.l(list2)).floatValue() : 1.0f;
        return fArr;
    }

    public static final void e(List<c0> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
