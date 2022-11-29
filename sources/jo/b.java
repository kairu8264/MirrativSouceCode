package jo;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class b<T> implements Iterator<T>, ko.a {

    /* renamed from: w  reason: collision with root package name */
    public final T[] f38126w;

    /* renamed from: x  reason: collision with root package name */
    public int f38127x;

    public b(T[] tArr) {
        p.h(tArr, "array");
        this.f38126w = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38127x < this.f38126w.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f38126w;
            int i10 = this.f38127x;
            this.f38127x = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f38127x--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
