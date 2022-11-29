package sp;

import jo.p;
import rp.e0;

/* loaded from: classes4.dex */
public final class j {
    public static final int a(int[] iArr, int i10, int i11, int i12) {
        p.h(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else if (i15 <= i10) {
                return i14;
            } else {
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final int b(e0 e0Var, int i10) {
        p.h(e0Var, "<this>");
        int a10 = a(e0Var.N(), i10 + 1, 0, e0Var.O().length);
        return a10 >= 0 ? a10 : ~a10;
    }
}
