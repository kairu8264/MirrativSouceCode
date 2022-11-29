package l0;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f39063a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f39064b = new Object();

    public static final <K, V> boolean a(Map<K, List<V>> map, K k10, V v10) {
        jo.p.h(map, "<this>");
        List<V> list = map.get(k10);
        if (list == null) {
            list = new ArrayList<>();
            map.put(k10, list);
        }
        return list.add(v10);
    }

    public static final <K, V> V b(Map<K, List<V>> map, K k10) {
        jo.p.h(map, "<this>");
        List<V> list = map.get(k10);
        if (list != null) {
            V v10 = (V) xn.x.D(list);
            if (list.isEmpty()) {
                map.remove(k10);
                return v10;
            }
            return v10;
        }
        return null;
    }
}
