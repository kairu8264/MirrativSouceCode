package p0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class p<K, V> extends xn.i<K> implements n0.d<K> {

    /* renamed from: x  reason: collision with root package name */
    public final d<K, V> f45667x;

    public p(d<K, V> dVar) {
        jo.p.h(dVar, "map");
        this.f45667x = dVar;
    }

    @Override // xn.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f45667x.containsKey(obj);
    }

    @Override // xn.a
    public int d() {
        return this.f45667x.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new q(this.f45667x.r());
    }
}
