package ai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class nn3 {
    public static <T> List<T> a(int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i10);
    }

    public static <T> HashSet<T> b(int i10) {
        return new HashSet<>(d(i10));
    }

    public static <K, V> LinkedHashMap<K, V> c(int i10) {
        return new LinkedHashMap<>(d(i10));
    }

    public static int d(int i10) {
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
