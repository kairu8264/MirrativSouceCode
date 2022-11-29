package ai;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class d03<K, V> implements Map<K, V>, Serializable {

    /* renamed from: w  reason: collision with root package name */
    public transient j03<Map.Entry<K, V>> f3093w;

    /* renamed from: x  reason: collision with root package name */
    public transient j03<K> f3094x;

    /* renamed from: y  reason: collision with root package name */
    public transient uz2<V> f3095y;

    public static <K, V> d03<K, V> d() {
        return (d03<K, V>) s13.C;
    }

    public static <K, V> d03<K, V> e(Map<? extends K, ? extends V> map) {
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        c03 c03Var = new c03(entrySet instanceof Collection ? entrySet.size() : 4);
        c03Var.b(entrySet);
        return c03Var.c();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* renamed from: f */
    public final j03<Map.Entry<K, V>> entrySet() {
        j03<Map.Entry<K, V>> j03Var = this.f3093w;
        if (j03Var == null) {
            j03<Map.Entry<K, V>> g10 = g();
            this.f3093w = g10;
            return g10;
        }
        return j03Var;
    }

    public abstract j03<Map.Entry<K, V>> g();

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    public abstract j03<K> h();

    @Override // java.util.Map
    public final int hashCode() {
        return x13.a(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i */
    public final uz2<V> values() {
        uz2<V> uz2Var = this.f3095y;
        if (uz2Var == null) {
            uz2<V> j10 = j();
            this.f3095y = j10;
            return j10;
        }
        return uz2Var;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract uz2<V> j();

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        j03<K> j03Var = this.f3094x;
        if (j03Var == null) {
            j03<K> h10 = h();
            this.f3094x = h10;
            return h10;
        }
        return j03Var;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        xy2.b(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }
}
