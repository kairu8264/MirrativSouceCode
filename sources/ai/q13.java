package ai;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class q13<K> extends j03<K> {

    /* renamed from: y  reason: collision with root package name */
    public final transient d03<K, ?> f8770y;

    /* renamed from: z  reason: collision with root package name */
    public final transient zz2<K> f8771z;

    public q13(d03<K, ?> d03Var, zz2<K> zz2Var) {
        this.f8770y = d03Var;
        this.f8771z = zz2Var;
    }

    @Override // ai.uz2, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8770y.get(obj) != null;
    }

    @Override // ai.j03, ai.uz2
    public final b23<K> d() {
        return this.f8771z.listIterator(0);
    }

    @Override // ai.j03, ai.uz2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return this.f8771z.listIterator(0);
    }

    @Override // ai.j03, ai.uz2
    public final zz2<K> k() {
        return this.f8771z;
    }

    @Override // ai.uz2
    public final int m(Object[] objArr, int i10) {
        return this.f8771z.m(objArr, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8770y.size();
    }
}
