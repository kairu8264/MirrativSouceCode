package p0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class j<K, V> extends xn.h<K> {

    /* renamed from: w  reason: collision with root package name */
    public final f<K, V> f45664w;

    public j(f<K, V> fVar) {
        jo.p.h(fVar, "builder");
        this.f45664w = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(K k10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f45664w.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f45664w.containsKey(obj);
    }

    @Override // xn.h
    public int d() {
        return this.f45664w.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new k(this.f45664w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (this.f45664w.containsKey(obj)) {
            this.f45664w.remove(obj);
            return true;
        }
        return false;
    }
}
