package lk;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import lk.p;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public abstract class t<K, V> implements Map<K, V>, Serializable {

    /* renamed from: z  reason: collision with root package name */
    public static final Map.Entry<?, ?>[] f40356z = new Map.Entry[0];
    @LazyInit

    /* renamed from: w  reason: collision with root package name */
    public transient v<Map.Entry<K, V>> f40357w;
    @RetainedWith
    @LazyInit

    /* renamed from: x  reason: collision with root package name */
    public transient v<K> f40358x;
    @RetainedWith
    @LazyInit

    /* renamed from: y  reason: collision with root package name */
    public transient p<V> f40359y;

    /* loaded from: classes3.dex */
    public static class a<K, V> {
        @MonotonicNonNullDecl

        /* renamed from: a  reason: collision with root package name */
        public Comparator<? super V> f40360a;

        /* renamed from: b  reason: collision with root package name */
        public Object[] f40361b;

        /* renamed from: c  reason: collision with root package name */
        public int f40362c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f40363d;

        public a() {
            this(4);
        }

        public t<K, V> a() {
            f();
            this.f40363d = true;
            return n0.q(this.f40362c, this.f40361b);
        }

        public final void b(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f40361b;
            if (i11 > objArr.length) {
                this.f40361b = Arrays.copyOf(objArr, p.b.a(objArr.length, i11));
                this.f40363d = false;
            }
        }

        @CanIgnoreReturnValue
        public a<K, V> c(K k10, V v10) {
            b(this.f40362c + 1);
            i.a(k10, v10);
            Object[] objArr = this.f40361b;
            int i10 = this.f40362c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f40362c = i10 + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public a<K, V> d(Map.Entry<? extends K, ? extends V> entry) {
            return c(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        public a<K, V> e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                b(this.f40362c + ((Collection) iterable).size());
            }
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                d(entry);
            }
            return this;
        }

        public void f() {
            int i10;
            if (this.f40360a != null) {
                if (this.f40363d) {
                    this.f40361b = Arrays.copyOf(this.f40361b, this.f40362c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f40362c];
                int i11 = 0;
                while (true) {
                    i10 = this.f40362c;
                    if (i11 >= i10) {
                        break;
                    }
                    Object[] objArr = this.f40361b;
                    int i12 = i11 * 2;
                    entryArr[i11] = new AbstractMap.SimpleImmutableEntry(objArr[i12], objArr[i12 + 1]);
                    i11++;
                }
                Arrays.sort(entryArr, 0, i10, k0.a(this.f40360a).e(d0.j()));
                for (int i13 = 0; i13 < this.f40362c; i13++) {
                    int i14 = i13 * 2;
                    this.f40361b[i14] = entryArr[i13].getKey();
                    this.f40361b[i14 + 1] = entryArr[i13].getValue();
                }
            }
        }

        public a(int i10) {
            this.f40361b = new Object[i10 * 2];
            this.f40362c = 0;
            this.f40363d = false;
        }
    }

    public static <K, V> a<K, V> d() {
        return new a<>();
    }

    public static <K, V> t<K, V> e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.e(iterable);
        return aVar.a();
    }

    public static <K, V> t<K, V> f(Map<? extends K, ? extends V> map) {
        if ((map instanceof t) && !(map instanceof SortedMap)) {
            t<K, V> tVar = (t) map;
            if (!tVar.k()) {
                return tVar;
            }
        }
        return e(map.entrySet());
    }

    public static <K, V> t<K, V> o() {
        return (t<K, V>) n0.D;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
        return d0.b(this, obj);
    }

    public abstract v<Map.Entry<K, V>> g();

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    public abstract v<K> h();

    @Override // java.util.Map
    public int hashCode() {
        return s0.b(entrySet());
    }

    public abstract p<V> i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: j */
    public v<Map.Entry<K, V>> entrySet() {
        v<Map.Entry<K, V>> vVar = this.f40357w;
        if (vVar == null) {
            v<Map.Entry<K, V>> g10 = g();
            this.f40357w = g10;
            return g10;
        }
        return vVar;
    }

    public abstract boolean k();

    @Override // java.util.Map
    /* renamed from: m */
    public v<K> keySet() {
        v<K> vVar = this.f40358x;
        if (vVar == null) {
            v<K> h10 = h();
            this.f40358x = h10;
            return h10;
        }
        return vVar;
    }

    @Override // java.util.Map
    /* renamed from: p */
    public p<V> values() {
        p<V> pVar = this.f40359y;
        if (pVar == null) {
            p<V> i10 = i();
            this.f40359y = i10;
            return i10;
        }
        return pVar;
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return d0.i(this);
    }
}
