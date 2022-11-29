package d2;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final class p extends j implements List<k>, ko.a {
    public final /* synthetic */ List<k> D;
    public final List<k> E;

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends k> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends k> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof k) {
            return f((k) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        jo.p.h(collection, "elements");
        return this.D.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && jo.p.c(this.E, ((p) obj).E);
    }

    public boolean f(k kVar) {
        jo.p.h(kVar, "element");
        return this.D.contains(kVar);
    }

    @Override // java.util.List
    /* renamed from: g */
    public k get(int i10) {
        return this.D.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.E.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof k) {
            return m((k) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.D.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<k> iterator() {
        return this.D.iterator();
    }

    public final List<k> j() {
        return this.E;
    }

    public int k() {
        return this.D.size();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof k) {
            return p((k) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<k> listIterator() {
        return this.D.listIterator();
    }

    @Override // java.util.List
    public ListIterator<k> listIterator(int i10) {
        return this.D.listIterator(i10);
    }

    public int m(k kVar) {
        jo.p.h(kVar, "element");
        return this.D.indexOf(kVar);
    }

    public int p(k kVar) {
        jo.p.h(kVar, "element");
        return this.D.lastIndexOf(kVar);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ k remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<k> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ k set(int i10, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return k();
    }

    @Override // java.util.List
    public void sort(Comparator<? super k> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<k> subList(int i10, int i11) {
        return this.D.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return jo.g.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        jo.p.h(tArr, "array");
        return (T[]) jo.g.b(this, tArr);
    }

    public String toString() {
        return "FontListFontFamily(fonts=" + this.E + ')';
    }
}
