package s;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public class a<K, V> extends g<K, V> implements Map<K, V> {
    public a<K, V>.C0785a D;
    public a<K, V>.c E;
    public a<K, V>.e F;

    /* renamed from: s.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0785a extends AbstractSet<Map.Entry<K, V>> {
        public C0785a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a.this.f51778y;
        }
    }

    /* loaded from: classes.dex */
    public final class b extends s.d<K> {
        public b() {
            super(a.this.f51778y);
        }

        @Override // s.d
        public K a(int i10) {
            return a.this.m(i10);
        }

        @Override // s.d
        public void b(int i10) {
            a.this.p(i10);
        }
    }

    /* loaded from: classes.dex */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: w  reason: collision with root package name */
        public int f51754w;

        /* renamed from: x  reason: collision with root package name */
        public int f51755x = -1;

        /* renamed from: y  reason: collision with root package name */
        public boolean f51756y;

        public d() {
            this.f51754w = a.this.f51778y - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f51755x++;
                this.f51756y = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f51756y) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return s.c.c(entry.getKey(), a.this.m(this.f51755x)) && s.c.c(entry.getValue(), a.this.r(this.f51755x));
                }
                return false;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f51756y) {
                return a.this.m(this.f51755x);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f51756y) {
                return a.this.r(this.f51755x);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f51755x < this.f51754w;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (this.f51756y) {
                K m10 = a.this.m(this.f51755x);
                V r10 = a.this.r(this.f51755x);
                return (m10 == null ? 0 : m10.hashCode()) ^ (r10 != null ? r10.hashCode() : 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f51756y) {
                a.this.p(this.f51755x);
                this.f51755x--;
                this.f51754w--;
                this.f51756y = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            if (this.f51756y) {
                return a.this.q(this.f51755x, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* loaded from: classes.dex */
    public final class f extends s.d<V> {
        public f() {
            super(a.this.f51778y);
        }

        @Override // s.d
        public V a(int i10) {
            return a.this.r(i10);
        }

        @Override // s.d
        public void b(int i10) {
            a.this.p(i10);
        }
    }

    public a() {
    }

    public static <T> boolean t(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        a<K, V>.C0785a c0785a = this.D;
        if (c0785a == null) {
            a<K, V>.C0785a c0785a2 = new C0785a();
            this.D = c0785a2;
            return c0785a2;
        }
        return c0785a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        a<K, V>.c cVar = this.E;
        if (cVar == null) {
            a<K, V>.c cVar2 = new c();
            this.E = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        f(this.f51778y + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean s(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean u(Collection<?> collection) {
        int i10 = this.f51778y;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i10 != this.f51778y;
    }

    public boolean v(Collection<?> collection) {
        int i10 = this.f51778y;
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (!collection.contains(m(i11))) {
                p(i11);
            }
        }
        return i10 != this.f51778y;
    }

    @Override // java.util.Map
    public Collection<V> values() {
        a<K, V>.e eVar = this.F;
        if (eVar == null) {
            a<K, V>.e eVar2 = new e();
            this.F = eVar2;
            return eVar2;
        }
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] w(T[] tArr, int i10) {
        int i11 = this.f51778y;
        if (tArr.length < i11) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i11));
        }
        for (int i12 = 0; i12 < i11; i12++) {
            tArr[i12] = this.f51777x[(i12 << 1) + i10];
        }
        if (tArr.length > i11) {
            tArr[i11] = null;
        }
        return tArr;
    }

    public a(int i10) {
        super(i10);
    }

    /* loaded from: classes.dex */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return a.this.s(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return a.t(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i10 = 0;
            for (int i11 = a.this.f51778y - 1; i11 >= 0; i11--) {
                K m10 = a.this.m(i11);
                i10 += m10 == null ? 0 : m10.hashCode();
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int i10 = a.this.i(obj);
            if (i10 >= 0) {
                a.this.p(i10);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return a.this.u(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return a.this.v(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return a.this.f51778y;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int i10 = a.this.f51778y;
            Object[] objArr = new Object[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                objArr[i11] = a.this.m(i11);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) a.this.w(tArr, 0);
        }
    }

    /* loaded from: classes.dex */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return a.this.k(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int k10 = a.this.k(obj);
            if (k10 >= 0) {
                a.this.p(k10);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int i10 = a.this.f51778y;
            int i11 = 0;
            boolean z10 = false;
            while (i11 < i10) {
                if (collection.contains(a.this.r(i11))) {
                    a.this.p(i11);
                    i11--;
                    i10--;
                    z10 = true;
                }
                i11++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int i10 = a.this.f51778y;
            int i11 = 0;
            boolean z10 = false;
            while (i11 < i10) {
                if (!collection.contains(a.this.r(i11))) {
                    a.this.p(i11);
                    i11--;
                    i10--;
                    z10 = true;
                }
                i11++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return a.this.f51778y;
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int i10 = a.this.f51778y;
            Object[] objArr = new Object[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                objArr[i11] = a.this.r(i11);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) a.this.w(tArr, 1);
        }
    }

    public a(g gVar) {
        super(gVar);
    }
}
