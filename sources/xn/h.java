package xn;

import java.util.AbstractSet;

/* loaded from: classes4.dex */
public abstract class h<E> extends AbstractSet<E> implements ko.f {
    public abstract int d();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return d();
    }
}
