package p0;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class n<K, V> extends xn.i<Map.Entry<? extends K, ? extends V>> implements n0.d<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: x  reason: collision with root package name */
    public final d<K, V> f45666x;

    public n(d<K, V> dVar) {
        jo.p.h(dVar, "map");
        this.f45666x = dVar;
    }

    @Override // xn.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return f((Map.Entry) obj);
        }
        return false;
    }

    @Override // xn.a
    public int d() {
        return this.f45666x.size();
    }

    public boolean f(Map.Entry<? extends K, ? extends V> entry) {
        jo.p.h(entry, "element");
        V v10 = this.f45666x.get(entry.getKey());
        return v10 != null ? jo.p.c(v10, entry.getValue()) : entry.getValue() == null && this.f45666x.containsKey(entry.getKey());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new o(this.f45666x.r());
    }
}
