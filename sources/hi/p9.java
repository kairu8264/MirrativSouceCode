package hi;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class p9<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: x  reason: collision with root package name */
    public static final p9 f35906x;

    /* renamed from: w  reason: collision with root package name */
    public boolean f35907w;

    static {
        p9 p9Var = new p9();
        f35906x = p9Var;
        p9Var.f35907w = false;
    }

    public p9() {
        this.f35907w = true;
    }

    public static <K, V> p9<K, V> e() {
        return f35906x;
    }

    public static int k(Object obj) {
        if (obj instanceof byte[]) {
            return b9.b((byte[]) obj);
        }
        return obj.hashCode();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                return true;
            }
            if (size() != map.size()) {
                return false;
            }
            for (Map.Entry<K, V> entry : entrySet()) {
                if (!map.containsKey(entry.getKey())) {
                    return false;
                }
                V value = entry.getValue();
                Object obj2 = map.get(entry.getKey());
                if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                    equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                    continue;
                } else {
                    equals = value.equals(obj2);
                    continue;
                }
                if (!equals) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final p9<K, V> f() {
        return isEmpty() ? new p9<>() : new p9<>(this);
    }

    public final void g() {
        this.f35907w = false;
    }

    public final void h(p9<K, V> p9Var) {
        m();
        if (p9Var.isEmpty()) {
            return;
        }
        putAll(p9Var);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i10 += k(entry.getValue()) ^ k(entry.getKey());
        }
        return i10;
    }

    public final boolean i() {
        return this.f35907w;
    }

    public final void m() {
        if (!this.f35907w) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        m();
        b9.e(k10);
        b9.e(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m();
        for (K k10 : map.keySet()) {
            b9.e(k10);
            b9.e(map.get(k10));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m();
        return (V) super.remove(obj);
    }

    public p9(Map<K, V> map) {
        super(map);
        this.f35907w = true;
    }
}
