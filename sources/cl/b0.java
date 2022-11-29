package cl;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class b0<E> implements List<E>, RandomAccess {

    /* renamed from: w  reason: collision with root package name */
    public final List<E> f19808w;

    public b0(List<E> list) {
        this.f19808w = Collections.unmodifiableList(list);
    }

    public static <E> b0<E> d(List<E> list) {
        return new b0<>(list);
    }

    public static <E> b0<E> f(E... eArr) {
        return new b0<>(Arrays.asList(eArr));
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e10) {
        return this.f19808w.add(e10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.f19808w.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f19808w.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f19808w.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f19808w.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f19808w.equals(obj);
    }

    @Override // java.util.List
    public E get(int i10) {
        return this.f19808w.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f19808w.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f19808w.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f19808w.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f19808w.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f19808w.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.f19808w.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f19808w.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f19808w.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f19808w.retainAll(collection);
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        return this.f19808w.set(i10, e10);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f19808w.size();
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return this.f19808w.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f19808w.toArray();
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        this.f19808w.add(i10, e10);
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        return this.f19808w.addAll(i10, collection);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return this.f19808w.listIterator(i10);
    }

    @Override // java.util.List
    public E remove(int i10) {
        return this.f19808w.remove(i10);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f19808w.toArray(tArr);
    }
}
