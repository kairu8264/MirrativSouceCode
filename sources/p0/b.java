package p0;

import java.util.Map;

/* loaded from: classes.dex */
public class b<K, V> implements Map.Entry<K, V>, ko.a {

    /* renamed from: w  reason: collision with root package name */
    public final K f45647w;

    /* renamed from: x  reason: collision with root package name */
    public final V f45648x;

    public b(K k10, V v10) {
        this.f45647w = k10;
        this.f45648x = v10;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && jo.p.c(entry.getKey(), getKey()) && jo.p.c(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.f45647w;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f45648x;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        V value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
