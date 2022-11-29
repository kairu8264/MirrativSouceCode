package lk;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class l0 {
    public static <T> T[] a(Object[] objArr, int i10, int i11, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i10, i11, tArr.getClass());
    }

    public static <T> T[] b(T[] tArr, int i10) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
    }

    public static <K, V> Map<K, V> c(int i10) {
        return k.o(i10);
    }

    public static <K, V> Map<K, V> d() {
        return k.i();
    }
}
