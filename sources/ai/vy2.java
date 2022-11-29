package ai;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class vy2<K, V> implements y03<K, V> {

    /* renamed from: w  reason: collision with root package name */
    public transient Set<K> f11414w;

    /* renamed from: x  reason: collision with root package name */
    public transient Collection<V> f11415x;

    /* renamed from: y  reason: collision with root package name */
    public transient Map<K, Collection<V>> f11416y;

    public abstract Set<K> b();

    public abstract Collection<V> c();

    public Iterator<V> d() {
        throw null;
    }

    public abstract Map<K, Collection<V>> e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y03) {
            return r().equals(((y03) obj).r());
        }
        return false;
    }

    public boolean g(Object obj) {
        for (Collection<V> collection : r().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return r().hashCode();
    }

    public final Set<K> i() {
        Set<K> set = this.f11414w;
        if (set == null) {
            Set<K> b10 = b();
            this.f11414w = b10;
            return b10;
        }
        return set;
    }

    @Override // ai.y03
    public Collection<V> m() {
        Collection<V> collection = this.f11415x;
        if (collection == null) {
            Collection<V> c10 = c();
            this.f11415x = c10;
            return c10;
        }
        return collection;
    }

    @Override // ai.y03
    public Map<K, Collection<V>> r() {
        Map<K, Collection<V>> map = this.f11416y;
        if (map == null) {
            Map<K, Collection<V>> e10 = e();
            this.f11416y = e10;
            return e10;
        }
        return map;
    }

    public final String toString() {
        return r().toString();
    }
}
