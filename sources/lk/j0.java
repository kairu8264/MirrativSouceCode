package lk;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: classes3.dex */
public final class j0 {
    @CanIgnoreReturnValue
    public static Object a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i10);
    }

    @CanIgnoreReturnValue
    public static Object[] b(Object... objArr) {
        return c(objArr, objArr.length);
    }

    @CanIgnoreReturnValue
    public static Object[] c(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            a(objArr[i11], i11);
        }
        return objArr;
    }

    public static <T> T[] d(T[] tArr, int i10) {
        return (T[]) l0.b(tArr, i10);
    }
}
