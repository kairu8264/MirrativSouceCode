package ai;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class rj3<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: x  reason: collision with root package name */
    public static final rj3 f9478x;

    /* renamed from: w  reason: collision with root package name */
    public boolean f9479w;

    static {
        rj3 rj3Var = new rj3();
        f9478x = rj3Var;
        rj3Var.f9479w = false;
    }

    public rj3() {
        this.f9479w = true;
    }

    public static <K, V> rj3<K, V> e() {
        return f9478x;
    }

    public static int k(Object obj) {
        if (obj instanceof byte[]) {
            return bj3.g((byte[]) obj);
        }
        if (!(obj instanceof ti3)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
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

    public final void f(rj3<K, V> rj3Var) {
        m();
        if (rj3Var.isEmpty()) {
            return;
        }
        putAll(rj3Var);
    }

    public final rj3<K, V> g() {
        return isEmpty() ? new rj3<>() : new rj3<>(this);
    }

    public final void h() {
        this.f9479w = false;
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
        return this.f9479w;
    }

    public final void m() {
        if (!this.f9479w) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        m();
        bj3.a(k10);
        bj3.a(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m();
        for (K k10 : map.keySet()) {
            bj3.a(k10);
            bj3.a(map.get(k10));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m();
        return (V) super.remove(obj);
    }

    public rj3(Map<K, V> map) {
        super(map);
        this.f9479w = true;
    }
}
