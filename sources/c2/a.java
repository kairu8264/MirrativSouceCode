package c2;

import jo.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f18793a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public static final Object[] f18794b = new Object[0];

    public static final int a(int[] iArr, int i10, int i11) {
        p.h(iArr, "<this>");
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else if (i15 <= i11) {
                return i14;
            } else {
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }
}
