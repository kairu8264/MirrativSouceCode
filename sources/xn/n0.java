package xn;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class n0 extends m0 {
    public static final <K, V> Map<K, V> e() {
        d0 d0Var = d0.f60440w;
        jo.p.f(d0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return d0Var;
    }

    public static final <K, V> V f(Map<K, ? extends V> map, K k10) {
        jo.p.h(map, "<this>");
        return (V) l0.a(map, k10);
    }

    public static final <K, V> HashMap<K, V> g(wn.k<? extends K, ? extends V>... kVarArr) {
        jo.p.h(kVarArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(m0.b(kVarArr.length));
        k(hashMap, kVarArr);
        return hashMap;
    }

    public static final <K, V> Map<K, V> h(wn.k<? extends K, ? extends V>... kVarArr) {
        jo.p.h(kVarArr, "pairs");
        return kVarArr.length > 0 ? o(kVarArr, new LinkedHashMap(m0.b(kVarArr.length))) : e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> i(Map<K, ? extends V> map) {
        jo.p.h(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : m0.d(map);
        }
        return e();
    }

    public static final <K, V> void j(Map<? super K, ? super V> map, Iterable<? extends wn.k<? extends K, ? extends V>> iterable) {
        jo.p.h(map, "<this>");
        jo.p.h(iterable, "pairs");
        for (wn.k<? extends K, ? extends V> kVar : iterable) {
            map.put((K) kVar.a(), (V) kVar.b());
        }
    }

    public static final <K, V> void k(Map<? super K, ? super V> map, wn.k<? extends K, ? extends V>[] kVarArr) {
        jo.p.h(map, "<this>");
        jo.p.h(kVarArr, "pairs");
        for (wn.k<? extends K, ? extends V> kVar : kVarArr) {
            map.put((K) kVar.a(), (V) kVar.b());
        }
    }

    public static final <K, V> Map<K, V> l(Iterable<? extends wn.k<? extends K, ? extends V>> iterable) {
        jo.p.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return m(iterable, new LinkedHashMap(m0.b(collection.size())));
                }
                return m0.c(iterable instanceof List ? (wn.k<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
            }
            return e();
        }
        return i(m(iterable, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M m(Iterable<? extends wn.k<? extends K, ? extends V>> iterable, M m10) {
        jo.p.h(iterable, "<this>");
        jo.p.h(m10, "destination");
        j(m10, iterable);
        return m10;
    }

    public static final <K, V> Map<K, V> n(Map<? extends K, ? extends V> map) {
        jo.p.h(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return p(map);
            }
            return m0.d(map);
        }
        return e();
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M o(wn.k<? extends K, ? extends V>[] kVarArr, M m10) {
        jo.p.h(kVarArr, "<this>");
        jo.p.h(m10, "destination");
        k(m10, kVarArr);
        return m10;
    }

    public static final <K, V> Map<K, V> p(Map<? extends K, ? extends V> map) {
        jo.p.h(map, "<this>");
        return new LinkedHashMap(map);
    }
}
