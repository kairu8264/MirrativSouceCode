package lk;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import lk.g0;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public abstract class f<K, V> implements e0<K, V> {
    @MonotonicNonNullDecl

    /* renamed from: w  reason: collision with root package name */
    public transient Collection<Map.Entry<K, V>> f40296w;
    @MonotonicNonNullDecl

    /* renamed from: x  reason: collision with root package name */
    public transient Set<K> f40297x;
    @MonotonicNonNullDecl

    /* renamed from: y  reason: collision with root package name */
    public transient Collection<V> f40298y;
    @MonotonicNonNullDecl

    /* renamed from: z  reason: collision with root package name */
    public transient Map<K, Collection<V>> f40299z;

    /* loaded from: classes3.dex */
    public class a extends g0.b<K, V> {
        public a() {
        }

        @Override // lk.g0.b
        public e0<K, V> d() {
            return f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return f.this.i();
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AbstractCollection<V> {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return f.this.d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return f.this.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return f.this.size();
        }
    }

    @Override // lk.e0
    public Collection<Map.Entry<K, V>> a() {
        Collection<Map.Entry<K, V>> collection = this.f40296w;
        if (collection == null) {
            Collection<Map.Entry<K, V>> f10 = f();
            this.f40296w = f10;
            return f10;
        }
        return collection;
    }

    @Override // lk.e0
    public Map<K, Collection<V>> b() {
        Map<K, Collection<V>> map = this.f40299z;
        if (map == null) {
            Map<K, Collection<V>> e10 = e();
            this.f40299z = e10;
            return e10;
        }
        return map;
    }

    @Override // lk.e0
    public boolean c(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection<V> collection = b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean d(@NullableDecl Object obj) {
        for (Collection<V> collection : b().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map<K, Collection<V>> e();

    public boolean equals(@NullableDecl Object obj) {
        return g0.a(this, obj);
    }

    public abstract Collection<Map.Entry<K, V>> f();

    public abstract Set<K> g();

    public abstract Collection<V> h();

    public int hashCode() {
        return b().hashCode();
    }

    public abstract Iterator<Map.Entry<K, V>> i();

    public Set<K> j() {
        Set<K> set = this.f40297x;
        if (set == null) {
            Set<K> g10 = g();
            this.f40297x = g10;
            return g10;
        }
        return set;
    }

    public abstract Iterator<V> k();

    @Override // lk.e0
    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection<V> collection = b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return b().toString();
    }

    @Override // lk.e0
    public Collection<V> values() {
        Collection<V> collection = this.f40298y;
        if (collection == null) {
            Collection<V> h10 = h();
            this.f40298y = h10;
            return h10;
        }
        return collection;
    }
}
