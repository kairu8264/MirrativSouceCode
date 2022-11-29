package o0;

/* loaded from: classes.dex */
public final class i<E> extends a<E> {

    /* renamed from: y  reason: collision with root package name */
    public final E f43791y;

    public i(E e10, int i10) {
        super(i10, 1);
        this.f43791y = e10;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        b();
        g(e() + 1);
        return this.f43791y;
    }

    @Override // java.util.ListIterator
    public E previous() {
        d();
        g(e() - 1);
        return this.f43791y;
    }
}
