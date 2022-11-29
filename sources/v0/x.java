package v0;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class x<T> implements ListIterator<T>, ko.a {

    /* renamed from: w  reason: collision with root package name */
    public final s<T> f56552w;

    /* renamed from: x  reason: collision with root package name */
    public int f56553x;

    /* renamed from: y  reason: collision with root package name */
    public int f56554y;

    public x(s<T> sVar, int i10) {
        jo.p.h(sVar, "list");
        this.f56552w = sVar;
        this.f56553x = i10 - 1;
        this.f56554y = sVar.f();
    }

    @Override // java.util.ListIterator
    public void add(T t10) {
        b();
        this.f56552w.add(this.f56553x + 1, t10);
        this.f56553x++;
        this.f56554y = this.f56552w.f();
    }

    public final void b() {
        if (this.f56552w.f() != this.f56554y) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f56553x < this.f56552w.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f56553x >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        b();
        int i10 = this.f56553x + 1;
        t.e(i10, this.f56552w.size());
        T t10 = this.f56552w.get(i10);
        this.f56553x = i10;
        return t10;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f56553x + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        b();
        t.e(this.f56553x, this.f56552w.size());
        this.f56553x--;
        return this.f56552w.get(this.f56553x);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f56553x;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        b();
        this.f56552w.remove(this.f56553x);
        this.f56553x--;
        this.f56554y = this.f56552w.f();
    }

    @Override // java.util.ListIterator
    public void set(T t10) {
        b();
        this.f56552w.set(this.f56553x, t10);
        this.f56554y = this.f56552w.f();
    }
}
