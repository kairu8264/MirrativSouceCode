package ai;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class ay2<E> extends c23<E> {

    /* renamed from: w  reason: collision with root package name */
    public final int f2151w;

    /* renamed from: x  reason: collision with root package name */
    public int f2152x;

    public ay2(int i10, int i11) {
        lx2.f(i11, i10, "index");
        this.f2151w = i10;
        this.f2152x = i11;
    }

    public abstract E a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f2152x < this.f2151w;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2152x > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f2152x;
            this.f2152x = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2152x;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f2152x - 1;
            this.f2152x = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2152x - 1;
    }
}
