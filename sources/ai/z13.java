package ai;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class z13<F, T> implements Iterator<T> {

    /* renamed from: w  reason: collision with root package name */
    public final Iterator<? extends F> f12831w;

    public z13(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.f12831w = it;
    }

    public abstract T a(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12831w.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f12831w.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f12831w.remove();
    }
}
