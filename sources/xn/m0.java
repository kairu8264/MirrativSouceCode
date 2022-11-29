package xn;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
public class m0 extends l0 {
    public static final int b(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> c(wn.k<? extends K, ? extends V> kVar) {
        jo.p.h(kVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(kVar.c(), kVar.d());
        jo.p.g(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> d(Map<? extends K, ? extends V> map) {
        jo.p.h(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        jo.p.g(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
