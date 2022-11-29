package zn;

import jo.p;

/* loaded from: classes4.dex */
public class b extends a {
    public static final float f(float f10, float... fArr) {
        p.h(fArr, "other");
        for (float f11 : fArr) {
            f10 = Math.max(f10, f11);
        }
        return f10;
    }

    public static final float g(float f10, float... fArr) {
        p.h(fArr, "other");
        for (float f11 : fArr) {
            f10 = Math.min(f10, f11);
        }
        return f10;
    }
}
