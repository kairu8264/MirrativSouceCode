package p0;

import java.util.Map;

/* loaded from: classes.dex */
public final class y<K, V> extends u<K, V, Map.Entry<K, V>> {

    /* renamed from: z  reason: collision with root package name */
    public final i<K, V> f45680z;

    public y(i<K, V> iVar) {
        jo.p.h(iVar, "parentIterator");
        this.f45680z = iVar;
    }

    @Override // java.util.Iterator
    /* renamed from: p */
    public Map.Entry<K, V> next() {
        r0.a.a(g());
        o(f() + 2);
        return new c(this.f45680z, e()[f() - 2], e()[f() - 1]);
    }
}
