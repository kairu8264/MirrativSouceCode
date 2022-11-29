package ai;

import java.util.ListIterator;

/* loaded from: classes3.dex */
public abstract class a23<F, T> extends z13<F, T> implements ListIterator<T> {
    public a23(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final void add(T t10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f12831w).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f12831w).nextIndex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public final T previous() {
        return (T) a(((ListIterator) this.f12831w).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f12831w).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(T t10) {
        throw new UnsupportedOperationException();
    }
}
