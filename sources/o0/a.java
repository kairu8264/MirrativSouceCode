package o0;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class a<E> implements ListIterator<E>, ko.a {

    /* renamed from: w  reason: collision with root package name */
    public int f43774w;

    /* renamed from: x  reason: collision with root package name */
    public int f43775x;

    public a(int i10, int i11) {
        this.f43774w = i10;
        this.f43775x = i11;
    }

    @Override // java.util.ListIterator
    public void add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void d() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int e() {
        return this.f43774w;
    }

    public final int f() {
        return this.f43775x;
    }

    public final void g(int i10) {
        this.f43774w = i10;
    }

    public final void h(int i10) {
        this.f43775x = i10;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f43774w < this.f43775x;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f43774w > 0;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f43774w;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f43774w - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
