package s;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d<T> implements Iterator<T> {

    /* renamed from: w  reason: collision with root package name */
    public int f51768w;

    /* renamed from: x  reason: collision with root package name */
    public int f51769x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f51770y;

    public d(int i10) {
        this.f51768w = i10;
    }

    public abstract T a(int i10);

    public abstract void b(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51769x < this.f51768w;
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            T a10 = a(this.f51769x);
            this.f51769x++;
            this.f51770y = true;
            return a10;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.f51770y) {
            int i10 = this.f51769x - 1;
            this.f51769x = i10;
            b(i10);
            this.f51768w--;
            this.f51770y = false;
            return;
        }
        throw new IllegalStateException();
    }
}
