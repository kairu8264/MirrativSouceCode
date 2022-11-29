package p0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class r<K, V> extends xn.a<V> implements n0.b<V> {

    /* renamed from: w  reason: collision with root package name */
    public final d<K, V> f45668w;

    public r(d<K, V> dVar) {
        jo.p.h(dVar, "map");
        this.f45668w = dVar;
    }

    @Override // xn.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f45668w.containsValue(obj);
    }

    @Override // xn.a
    public int d() {
        return this.f45668w.size();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new s(this.f45668w.r());
    }
}
