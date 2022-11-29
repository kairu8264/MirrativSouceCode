package ji;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class l<E> extends s<E> {

    /* renamed from: w  reason: collision with root package name */
    public final int f38059w;

    /* renamed from: x  reason: collision with root package name */
    public int f38060x;

    public l(int i10, int i11) {
        j.b(i11, i10, "index");
        this.f38059w = i10;
        this.f38060x = i11;
    }

    public abstract E a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f38060x < this.f38059w;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f38060x > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f38060x;
            this.f38060x = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f38060x;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f38060x - 1;
            this.f38060x = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f38060x - 1;
    }
}
