package p0;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* renamed from: w  reason: collision with root package name */
    public final f<K, V> f45662w;

    public h(f<K, V> fVar) {
        jo.p.h(fVar, "builder");
        this.f45662w = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f45662w.clear();
    }

    @Override // xn.h
    public int d() {
        return this.f45662w.size();
    }

    @Override // p0.a
    public boolean g(Map.Entry<? extends K, ? extends V> entry) {
        jo.p.h(entry, "element");
        V v10 = this.f45662w.get(entry.getKey());
        return v10 != null ? jo.p.c(v10, entry.getValue()) : entry.getValue() == null && this.f45662w.containsKey(entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new i(this.f45662w);
    }

    @Override // p0.a
    public boolean k(Map.Entry<? extends K, ? extends V> entry) {
        jo.p.h(entry, "element");
        return this.f45662w.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: m */
    public boolean add(Map.Entry<K, V> entry) {
        jo.p.h(entry, "element");
        throw new UnsupportedOperationException();
    }
}
