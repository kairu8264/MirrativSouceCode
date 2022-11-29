package p0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class l<K, V> extends xn.e<V> {

    /* renamed from: w  reason: collision with root package name */
    public final f<K, V> f45665w;

    public l(f<K, V> fVar) {
        jo.p.h(fVar, "builder");
        this.f45665w = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f45665w.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f45665w.containsValue(obj);
    }

    @Override // xn.e
    public int d() {
        return this.f45665w.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new m(this.f45665w);
    }
}
