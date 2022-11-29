package m;

import java.util.HashMap;
import java.util.Map;
import m.b;

/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {
    public HashMap<K, b.c<K, V>> A = new HashMap<>();

    public boolean contains(K k10) {
        return this.A.containsKey(k10);
    }

    @Override // m.b
    public b.c<K, V> f(K k10) {
        return this.A.get(k10);
    }

    @Override // m.b
    public V l(K k10, V v10) {
        b.c<K, V> f10 = f(k10);
        if (f10 != null) {
            return f10.f40445x;
        }
        this.A.put(k10, k(k10, v10));
        return null;
    }

    @Override // m.b
    public V m(K k10) {
        V v10 = (V) super.m(k10);
        this.A.remove(k10);
        return v10;
    }

    public Map.Entry<K, V> p(K k10) {
        if (contains(k10)) {
            return this.A.get(k10).f40447z;
        }
        return null;
    }
}
