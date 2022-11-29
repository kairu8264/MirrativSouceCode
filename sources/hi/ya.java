package hi;

import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class ya implements ListIterator<String> {

    /* renamed from: w  reason: collision with root package name */
    public final ListIterator<String> f36075w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f36076x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ ab f36077y;

    public ya(ab abVar, int i10) {
        f9 f9Var;
        this.f36077y = abVar;
        this.f36076x = i10;
        f9Var = abVar.f35643w;
        this.f36075w = f9Var.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f36075w.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f36075w.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.f36075w.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f36075w.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.f36075w.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f36075w.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
