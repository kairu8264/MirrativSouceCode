package xn;

import java.util.AbstractList;

/* loaded from: classes4.dex */
public abstract class f<E> extends AbstractList<E> implements ko.d {
    public abstract int d();

    public abstract E f(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i10) {
        return f(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return d();
    }
}
