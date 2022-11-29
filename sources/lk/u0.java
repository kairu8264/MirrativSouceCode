package lk;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class u0<F, T> implements Iterator<T> {

    /* renamed from: w  reason: collision with root package name */
    public final Iterator<? extends F> f40378w;

    public u0(Iterator<? extends F> it) {
        this.f40378w = (Iterator) kk.j.i(it);
    }

    public abstract T a(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40378w.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f40378w.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f40378w.remove();
    }
}
