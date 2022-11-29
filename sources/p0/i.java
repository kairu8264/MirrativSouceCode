package p0;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class i<K, V> implements Iterator<Map.Entry<K, V>>, ko.a {

    /* renamed from: w  reason: collision with root package name */
    public final g<K, V, Map.Entry<K, V>> f45663w;

    public i(f<K, V> fVar) {
        jo.p.h(fVar, "builder");
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new y(this);
        }
        this.f45663w = new g<>(fVar, uVarArr);
    }

    @Override // java.util.Iterator
    /* renamed from: b */
    public Map.Entry<K, V> next() {
        return this.f45663w.next();
    }

    public final void d(K k10, V v10) {
        this.f45663w.m(k10, v10);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f45663w.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f45663w.remove();
    }
}
