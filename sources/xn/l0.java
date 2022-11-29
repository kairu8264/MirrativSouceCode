package xn;

import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public class l0 {
    public static final <K, V> V a(Map<K, ? extends V> map, K k10) {
        jo.p.h(map, "<this>");
        if (map instanceof k0) {
            return (V) ((k0) map).l(k10);
        }
        V v10 = map.get(k10);
        if (v10 != null || map.containsKey(k10)) {
            return v10;
        }
        throw new NoSuchElementException("Key " + k10 + " is missing in the map.");
    }
}
