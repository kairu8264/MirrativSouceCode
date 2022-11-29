package lk;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public abstract class u<K, V> extends g<K, V> implements Serializable {
    public final transient t<K, ? extends p<V>> A;
    public final transient int B;

    /* loaded from: classes3.dex */
    public class a extends v0<Map.Entry<K, V>> {

        /* renamed from: w  reason: collision with root package name */
        public final Iterator<? extends Map.Entry<K, ? extends p<V>>> f40366w;

        /* renamed from: x  reason: collision with root package name */
        public K f40367x = null;

        /* renamed from: y  reason: collision with root package name */
        public Iterator<V> f40368y = x.d();

        public a() {
            this.f40366w = u.this.A.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (!this.f40368y.hasNext()) {
                Map.Entry<K, ? extends p<V>> next = this.f40366w.next();
                this.f40367x = next.getKey();
                this.f40368y = next.getValue().iterator();
            }
            return d0.c(this.f40367x, this.f40368y.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f40368y.hasNext() || this.f40366w.hasNext();
        }
    }

    /* loaded from: classes3.dex */
    public class b extends v0<V> {

        /* renamed from: w  reason: collision with root package name */
        public Iterator<? extends p<V>> f40370w;

        /* renamed from: x  reason: collision with root package name */
        public Iterator<V> f40371x = x.d();

        public b() {
            this.f40370w = u.this.A.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f40371x.hasNext() || this.f40370w.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f40371x.hasNext()) {
                this.f40371x = this.f40370w.next().iterator();
            }
            return this.f40371x.next();
        }
    }

    /* loaded from: classes3.dex */
    public static class c<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public Map<K, Collection<V>> f40373a = l0.d();
        @MonotonicNonNullDecl

        /* renamed from: b  reason: collision with root package name */
        public Comparator<? super K> f40374b;
        @MonotonicNonNullDecl

        /* renamed from: c  reason: collision with root package name */
        public Comparator<? super V> f40375c;

        public u<K, V> a() {
            Collection entrySet = this.f40373a.entrySet();
            Comparator<? super K> comparator = this.f40374b;
            if (comparator != null) {
                entrySet = k0.a(comparator).d().b(entrySet);
            }
            return s.t(entrySet, this.f40375c);
        }

        public Collection<V> b() {
            return new ArrayList();
        }

        @CanIgnoreReturnValue
        public c<K, V> c(K k10, Iterable<? extends V> iterable) {
            if (k10 != null) {
                Collection<V> collection = this.f40373a.get(k10);
                if (collection != null) {
                    for (V v10 : iterable) {
                        i.a(k10, v10);
                        collection.add(v10);
                    }
                    return this;
                }
                Iterator<? extends V> it = iterable.iterator();
                if (it.hasNext()) {
                    Collection<V> b10 = b();
                    while (it.hasNext()) {
                        V next = it.next();
                        i.a(k10, next);
                        b10.add(next);
                    }
                    this.f40373a.put(k10, b10);
                    return this;
                }
                return this;
            }
            throw new NullPointerException("null key in entry: null=" + w.f(iterable));
        }

        @CanIgnoreReturnValue
        public c<K, V> d(K k10, V... vArr) {
            return c(k10, Arrays.asList(vArr));
        }
    }

    /* loaded from: classes3.dex */
    public static class d<K, V> extends p<Map.Entry<K, V>> {
        @Weak

        /* renamed from: x  reason: collision with root package name */
        public final u<K, V> f40376x;

        public d(u<K, V> uVar) {
            this.f40376x = uVar;
        }

        @Override // lk.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return this.f40376x.c(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // lk.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: m */
        public v0<Map.Entry<K, V>> iterator() {
            return this.f40376x.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f40376x.size();
        }
    }

    /* loaded from: classes3.dex */
    public static final class e<K, V> extends p<V> {
        @Weak

        /* renamed from: x  reason: collision with root package name */
        public final transient u<K, V> f40377x;

        public e(u<K, V> uVar) {
            this.f40377x = uVar;
        }

        @Override // lk.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return this.f40377x.d(obj);
        }

        @Override // lk.p
        public int f(Object[] objArr, int i10) {
            v0<? extends p<V>> it = this.f40377x.A.values().iterator();
            while (it.hasNext()) {
                i10 = it.next().f(objArr, i10);
            }
            return i10;
        }

        @Override // lk.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: m */
        public v0<V> iterator() {
            return this.f40377x.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f40377x.size();
        }
    }

    public u(t<K, ? extends p<V>> tVar, int i10) {
        this.A = tVar;
        this.B = i10;
    }

    @Override // lk.f, lk.e0
    public /* bridge */ /* synthetic */ boolean c(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.c(obj, obj2);
    }

    @Override // lk.e0
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // lk.f
    public boolean d(@NullableDecl Object obj) {
        return obj != null && super.d(obj);
    }

    @Override // lk.f
    public Map<K, Collection<V>> e() {
        throw new AssertionError("should never be called");
    }

    @Override // lk.f
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // lk.f
    public Set<K> g() {
        throw new AssertionError("unreachable");
    }

    @Override // lk.f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // lk.f, lk.e0
    /* renamed from: l */
    public t<K, Collection<V>> b() {
        return (t<K, ? extends p<V>>) this.A;
    }

    @Override // lk.f
    /* renamed from: m */
    public p<Map.Entry<K, V>> f() {
        return new d(this);
    }

    @Override // lk.f
    /* renamed from: n */
    public p<V> h() {
        return new e(this);
    }

    @Override // lk.f, lk.e0
    /* renamed from: o */
    public p<Map.Entry<K, V>> a() {
        return (p) super.a();
    }

    @Override // lk.f
    /* renamed from: p */
    public v0<Map.Entry<K, V>> i() {
        return new a();
    }

    @Override // lk.e0
    @CanIgnoreReturnValue
    @Deprecated
    public boolean put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // lk.f
    /* renamed from: q */
    public v0<V> k() {
        return new b();
    }

    @Override // lk.f, lk.e0
    /* renamed from: r */
    public p<V> values() {
        return (p) super.values();
    }

    @Override // lk.f, lk.e0
    @CanIgnoreReturnValue
    @Deprecated
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // lk.e0
    public int size() {
        return this.B;
    }

    @Override // lk.f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
