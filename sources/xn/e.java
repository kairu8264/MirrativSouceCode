package xn;

import java.util.AbstractCollection;

/* loaded from: classes4.dex */
public abstract class e<E> extends AbstractCollection<E> implements ko.b {
    public abstract int d();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }
}
