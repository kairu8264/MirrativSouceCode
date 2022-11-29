package ai;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class g03<K, V> extends uz2<V> {

    /* renamed from: x  reason: collision with root package name */
    public final transient h03<K, V> f4275x;

    public g03(h03<K, V> h03Var) {
        this.f4275x = h03Var;
    }

    @Override // ai.uz2, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4275x.g(obj);
    }

    @Override // ai.uz2
    public final b23<V> d() {
        return new e03(this.f4275x);
    }

    @Override // ai.uz2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new e03(this.f4275x);
    }

    @Override // ai.uz2
    public final int m(Object[] objArr, int i10) {
        c23 listIterator = ((zz2) this.f4275x.f4675z.values()).listIterator(0);
        while (listIterator.hasNext()) {
            i10 = ((uz2) listIterator.next()).m(objArr, i10);
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f4275x.A;
    }
}
