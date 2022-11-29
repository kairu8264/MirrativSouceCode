package c1;

/* loaded from: classes.dex */
public final class p0 {
    public static final boolean a(float[] fArr) {
        jo.p.h(fArr, "$this$isIdentity");
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (i11 < 4) {
                if (!(fArr[(i10 * 4) + i11] == (i10 == i11 ? 1.0f : 0.0f))) {
                    return false;
                }
                i11++;
            }
            i10++;
        }
        return true;
    }
}
