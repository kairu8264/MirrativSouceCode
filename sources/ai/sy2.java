package ai;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes3.dex */
public abstract class sy2<K, V> extends vy2<K, V> implements Serializable {
    public transient int A;

    /* renamed from: z  reason: collision with root package name */
    public transient Map<K, Collection<V>> f10028z;

    public sy2(Map<K, Collection<V>> map) {
        if (map.isEmpty()) {
            this.f10028z = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void t(sy2 sy2Var, Object obj) {
        Collection<V> collection;
        Map<K, Collection<V>> map = sy2Var.f10028z;
        Objects.requireNonNull(map);
        try {
            collection = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            collection = null;
        }
        Collection<V> collection2 = collection;
        if (collection2 != null) {
            int size = collection2.size();
            collection2.clear();
            sy2Var.A -= size;
        }
    }

    @Override // ai.y03
    public final boolean a(K k10, V v10) {
        Collection<V> collection = this.f10028z.get(k10);
        if (collection == null) {
            Collection<V> l10 = l();
            if (l10.add(v10)) {
                this.A++;
                this.f10028z.put(k10, l10);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(v10)) {
            this.A++;
            return true;
        } else {
            return false;
        }
    }

    @Override // ai.vy2
    public final Collection<V> c() {
        return new uy2(this);
    }

    @Override // ai.vy2
    public final Iterator<V> d() {
        return new cy2(this);
    }

    @Override // ai.y03
    public final int f() {
        return this.A;
    }

    @Override // ai.y03
    public final void h() {
        for (Collection<V> collection : this.f10028z.values()) {
            collection.clear();
        }
        this.f10028z.clear();
        this.A = 0;
    }

    public abstract <E> Collection<E> j(Collection<E> collection);

    public abstract Collection<V> k(K k10, Collection<V> collection);

    public abstract Collection<V> l();

    public final List<V> q(K k10, List<V> list, py2 py2Var) {
        if (list instanceof RandomAccess) {
            return new ly2(this, k10, list, py2Var);
        }
        return new ry2(this, k10, list, py2Var);
    }

    public final Set<K> s() {
        Map<K, Collection<V>> map = this.f10028z;
        if (map instanceof NavigableMap) {
            return new ky2(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new ny2(this, (SortedMap) map);
        }
        return new iy2(this, map);
    }

    public final Map<K, Collection<V>> u() {
        Map<K, Collection<V>> map = this.f10028z;
        if (map instanceof NavigableMap) {
            return new jy2(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new my2(this, (SortedMap) map);
        }
        return new fy2(this, map);
    }
}
