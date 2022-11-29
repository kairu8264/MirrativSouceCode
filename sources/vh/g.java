package vh;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class g {
    @Deprecated
    public static <T> List<T> a() {
        return Collections.emptyList();
    }

    @Deprecated
    public static <T> List<T> b(T t10) {
        return Collections.singletonList(t10);
    }

    @Deprecated
    public static <T> List<T> c(T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                return Collections.unmodifiableList(Arrays.asList(tArr));
            }
            return b(tArr[0]);
        }
        return a();
    }

    public static <K, V> Map<K, V> d(K k10, V v10, K k11, V v11, K k12, V v12) {
        Map h10 = h(3, false);
        h10.put(k10, v10);
        h10.put(k11, v11);
        h10.put(k12, v12);
        return Collections.unmodifiableMap(h10);
    }

    public static <K, V> Map<K, V> e(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Key and values array lengths not equal: ");
            sb2.append(length);
            sb2.append(" != ");
            sb2.append(length2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (length != 0) {
            if (length != 1) {
                Map h10 = h(length, false);
                for (int i10 = 0; i10 < kArr.length; i10++) {
                    h10.put(kArr[i10], vArr[i10]);
                }
                return Collections.unmodifiableMap(h10);
            }
            return Collections.singletonMap(kArr[0], vArr[0]);
        } else {
            return Collections.emptyMap();
        }
    }

    @Deprecated
    public static <T> Set<T> f(T t10, T t11, T t12) {
        Set i10 = i(3, false);
        i10.add(t10);
        i10.add(t11);
        i10.add(t12);
        return Collections.unmodifiableSet(i10);
    }

    @Deprecated
    public static <T> Set<T> g(T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                if (length == 2) {
                    T t10 = tArr[0];
                    T t11 = tArr[1];
                    Set i10 = i(2, false);
                    i10.add(t10);
                    i10.add(t11);
                    return Collections.unmodifiableSet(i10);
                } else if (length != 3) {
                    if (length != 4) {
                        Set i11 = i(length, false);
                        Collections.addAll(i11, tArr);
                        return Collections.unmodifiableSet(i11);
                    }
                    T t12 = tArr[0];
                    T t13 = tArr[1];
                    T t14 = tArr[2];
                    T t15 = tArr[3];
                    Set i12 = i(4, false);
                    i12.add(t12);
                    i12.add(t13);
                    i12.add(t14);
                    i12.add(t15);
                    return Collections.unmodifiableSet(i12);
                } else {
                    return f(tArr[0], tArr[1], tArr[2]);
                }
            }
            return Collections.singleton(tArr[0]);
        }
        return Collections.emptySet();
    }

    public static <K, V> Map<K, V> h(int i10, boolean z10) {
        if (i10 <= 256) {
            return new s.a(i10);
        }
        return new HashMap(i10, 1.0f);
    }

    public static <T> Set<T> i(int i10, boolean z10) {
        float f10 = true != z10 ? 1.0f : 0.75f;
        if (i10 <= (true != z10 ? 256 : 128)) {
            return new s.b(i10);
        }
        return new HashSet(i10, f10);
    }
}
