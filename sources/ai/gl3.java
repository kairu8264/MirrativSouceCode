package ai;

import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class gl3 implements ListIterator<String> {

    /* renamed from: w  reason: collision with root package name */
    public final ListIterator<String> f4508w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f4509x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ il3 f4510y;

    public gl3(il3 il3Var, int i10) {
        gj3 gj3Var;
        this.f4510y = il3Var;
        this.f4509x = i10;
        gj3Var = il3Var.f5283w;
        this.f4508w = gj3Var.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f4508w.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4508w.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.f4508w.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4508w.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.f4508w.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4508w.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
