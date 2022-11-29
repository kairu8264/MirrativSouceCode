package xn;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class j<T> implements Collection<T>, ko.a {

    /* renamed from: w  reason: collision with root package name */
    public final T[] f60448w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f60449x;

    public j(T[] tArr, boolean z10) {
        jo.p.h(tArr, "values");
        this.f60448w = tArr;
        this.f60449x = z10;
    }

    @Override // java.util.Collection
    public boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return o.B(this.f60448w, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        jo.p.h(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int d() {
        return this.f60448w.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f60448w.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return jo.c.a(this.f60448w);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return r.b(this.f60448w, this.f60449x);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        jo.p.h(tArr, "array");
        return (T[]) jo.g.b(this, tArr);
    }
}
