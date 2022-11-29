package lk;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class a<E> extends w0<E> {

    /* renamed from: w  reason: collision with root package name */
    public final int f40225w;

    /* renamed from: x  reason: collision with root package name */
    public int f40226x;

    public a(int i10, int i11) {
        kk.j.k(i11, i10);
        this.f40225w = i10;
        this.f40226x = i11;
    }

    public abstract E a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f40226x < this.f40225w;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f40226x > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f40226x;
            this.f40226x = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f40226x;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f40226x - 1;
            this.f40226x = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f40226x - 1;
    }
}
