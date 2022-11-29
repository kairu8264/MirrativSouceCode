package p0;

import ko.e;

/* loaded from: classes.dex */
public final class c<K, V> extends b<K, V> implements e.a {

    /* renamed from: y  reason: collision with root package name */
    public final i<K, V> f45649y;

    /* renamed from: z  reason: collision with root package name */
    public V f45650z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i<K, V> iVar, K k10, V v10) {
        super(k10, v10);
        jo.p.h(iVar, "parentIterator");
        this.f45649y = iVar;
        this.f45650z = v10;
    }

    public void b(V v10) {
        this.f45650z = v10;
    }

    @Override // p0.b, java.util.Map.Entry
    public V getValue() {
        return this.f45650z;
    }

    @Override // p0.b, java.util.Map.Entry
    public V setValue(V v10) {
        V value = getValue();
        b(v10);
        this.f45649y.d(getKey(), v10);
        return value;
    }
}
