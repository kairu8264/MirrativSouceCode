package ai;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class q03<F, T> extends AbstractSequentialList<T> implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public final List<F> f8765w;

    /* renamed from: x  reason: collision with root package name */
    public final bx2<? super F, ? extends T> f8766x;

    public q03(List<F> list, bx2<? super F, ? extends T> bx2Var) {
        this.f8765w = list;
        this.f8766x = bx2Var;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f8765w.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i10) {
        return new p03(this, this.f8765w.listIterator(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8765w.size();
    }
}
