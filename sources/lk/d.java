package lk;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import lk.d0;
import lk.f;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public abstract class d<K, V> extends lk.f<K, V> implements Serializable {
    public transient Map<K, Collection<V>> A;
    public transient int B;

    /* loaded from: classes3.dex */
    public class a extends d<K, V>.AbstractC0580d<V> {
        public a() {
            super();
        }

        @Override // lk.d.AbstractC0580d
        public V a(K k10, V v10) {
            return v10;
        }
    }

    /* loaded from: classes3.dex */
    public class b extends d<K, V>.AbstractC0580d<Map.Entry<K, V>> {
        public b() {
            super();
        }

        @Override // lk.d.AbstractC0580d
        /* renamed from: b */
        public Map.Entry<K, V> a(K k10, V v10) {
            return d0.c(k10, v10);
        }
    }

    /* loaded from: classes3.dex */
    public class c extends d0.f<K, Collection<V>> {

        /* renamed from: y  reason: collision with root package name */
        public final transient Map<K, Collection<V>> f40268y;

        /* loaded from: classes3.dex */
        public class a extends d0.c<K, Collection<V>> {
            public a() {
            }

            @Override // lk.d0.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return lk.j.b(c.this.f40268y.entrySet(), obj);
            }

            @Override // lk.d0.c
            public Map<K, Collection<V>> d() {
                return c.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (contains(obj)) {
                    d.this.x(((Map.Entry) obj).getKey());
                    return true;
                }
                return false;
            }
        }

        /* loaded from: classes3.dex */
        public class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: w  reason: collision with root package name */
            public final Iterator<Map.Entry<K, Collection<V>>> f40271w;
            @NullableDecl

            /* renamed from: x  reason: collision with root package name */
            public Collection<V> f40272x;

            public b() {
                this.f40271w = c.this.f40268y.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f40271w.next();
                this.f40272x = next.getValue();
                return c.this.h(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f40271w.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                lk.i.c(this.f40272x != null);
                this.f40271w.remove();
                d.this.B -= this.f40272x.size();
                this.f40272x.clear();
                this.f40272x = null;
            }
        }

        public c(Map<K, Collection<V>> map) {
            this.f40268y = map;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f40268y == d.this.A) {
                d.this.clear();
            } else {
                x.b(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return d0.f(this.f40268y, obj);
        }

        @Override // lk.d0.f
        public Set<Map.Entry<K, Collection<V>>> d() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f40268y.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: f */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) d0.g(this.f40268y, obj);
            if (collection == null) {
                return null;
            }
            return d.this.z(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: g */
        public Collection<V> remove(Object obj) {
            Collection<V> remove = this.f40268y.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> s10 = d.this.s();
            s10.addAll(remove);
            d.this.B -= remove.size();
            remove.clear();
            return s10;
        }

        public Map.Entry<K, Collection<V>> h(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return d0.c(key, d.this.z(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f40268y.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return d.this.j();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f40268y.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f40268y.toString();
        }
    }

    /* renamed from: lk.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public abstract class AbstractC0580d<T> implements Iterator<T> {

        /* renamed from: w  reason: collision with root package name */
        public final Iterator<Map.Entry<K, Collection<V>>> f40274w;
        @NullableDecl

        /* renamed from: x  reason: collision with root package name */
        public K f40275x = null;
        @MonotonicNonNullDecl

        /* renamed from: y  reason: collision with root package name */
        public Collection<V> f40276y = null;

        /* renamed from: z  reason: collision with root package name */
        public Iterator<V> f40277z = x.f();

        public AbstractC0580d() {
            this.f40274w = (Iterator<Map.Entry<K, V>>) d.this.A.entrySet().iterator();
        }

        public abstract T a(K k10, V v10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f40274w.hasNext() || this.f40277z.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f40277z.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f40274w.next();
                this.f40275x = next.getKey();
                Collection<V> value = next.getValue();
                this.f40276y = value;
                this.f40277z = value.iterator();
            }
            return a(this.f40275x, this.f40277z.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f40277z.remove();
            if (this.f40276y.isEmpty()) {
                this.f40274w.remove();
            }
            d.q(d.this);
        }
    }

    /* loaded from: classes3.dex */
    public class e extends d0.d<K, Collection<V>> {

        /* loaded from: classes3.dex */
        public class a implements Iterator<K> {
            @NullableDecl

            /* renamed from: w  reason: collision with root package name */
            public Map.Entry<K, Collection<V>> f40279w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ Iterator f40280x;

            public a(Iterator it) {
                this.f40280x = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f40280x.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f40280x.next();
                this.f40279w = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                lk.i.c(this.f40279w != null);
                Collection<V> value = this.f40279w.getValue();
                this.f40280x.remove();
                d.this.B -= value.size();
                value.clear();
                this.f40279w = null;
            }
        }

        public e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            x.b(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return d().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return this == obj || d().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return d().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(d().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i10;
            Collection<V> remove = d().remove(obj);
            if (remove != null) {
                i10 = remove.size();
                remove.clear();
                d.this.B -= i10;
            } else {
                i10 = 0;
            }
            return i10 > 0;
        }
    }

    /* loaded from: classes3.dex */
    public class f extends d<K, V>.i implements NavigableMap<K, Collection<V>> {
        public f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> ceilingEntry = k().ceilingEntry(k10);
            if (ceilingEntry == null) {
                return null;
            }
            return h(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return k().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(k().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = k().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return h(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> floorEntry = k().floorEntry(k10);
            if (floorEntry == null) {
                return null;
            }
            return h(floorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return k().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> higherEntry = k().higherEntry(k10);
            if (higherEntry == null) {
                return null;
            }
            return h(higherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return k().higherKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = k().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return h(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> lowerEntry = k().lowerEntry(k10);
            if (lowerEntry == null) {
                return null;
            }
            return h(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return k().lowerKey(k10);
        }

        @Override // lk.d.i
        /* renamed from: m */
        public NavigableSet<K> i() {
            return new g(k());
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        @Override // lk.d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: o */
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // lk.d.i, lk.d.c, java.util.AbstractMap, java.util.Map
        /* renamed from: p */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return q(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return q(descendingMap().entrySet().iterator());
        }

        public Map.Entry<K, Collection<V>> q(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (it.hasNext()) {
                Map.Entry<K, Collection<V>> next = it.next();
                Collection<V> s10 = d.this.s();
                s10.addAll(next.getValue());
                it.remove();
                return d0.c(next.getKey(), d.this.y(s10));
            }
            return null;
        }

        @Override // lk.d.i
        /* renamed from: r */
        public NavigableMap<K, Collection<V>> k() {
            return (NavigableMap) super.k();
        }

        @Override // lk.d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: s */
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // lk.d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: t */
        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new f(k().headMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new f(k().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new f(k().tailMap(k10, z10));
        }
    }

    /* loaded from: classes3.dex */
    public class g extends d<K, V>.j implements NavigableSet<K> {
        public g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k10) {
            return f().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(f().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(K k10) {
            return f().floorKey(k10);
        }

        @Override // lk.d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: g */
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        @Override // java.util.NavigableSet
        public K higher(K k10) {
            return f().higherKey(k10);
        }

        @Override // lk.d.j
        /* renamed from: j */
        public NavigableMap<K, Collection<V>> f() {
            return (NavigableMap) super.f();
        }

        @Override // lk.d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: k */
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // lk.d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: l */
        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        @Override // java.util.NavigableSet
        public K lower(K k10) {
            return f().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) x.i(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) x.i(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new g(f().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new g(f().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new g(f().tailMap(k10, z10));
        }
    }

    /* loaded from: classes3.dex */
    public class h extends d<K, V>.l implements RandomAccess {
        public h(@NullableDecl K k10, List<V> list, @NullableDecl d<K, V>.k kVar) {
            super(k10, list, kVar);
        }
    }

    /* loaded from: classes3.dex */
    public class i extends d<K, V>.c implements SortedMap<K, Collection<V>> {
        @MonotonicNonNullDecl
        public SortedSet<K> A;

        public i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return k().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return k().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new i(k().headMap(k10));
        }

        public SortedSet<K> i() {
            return new j(k());
        }

        @Override // lk.d.c, java.util.AbstractMap, java.util.Map
        /* renamed from: j */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.A;
            if (sortedSet == null) {
                SortedSet<K> i10 = i();
                this.A = i10;
                return i10;
            }
            return sortedSet;
        }

        public SortedMap<K, Collection<V>> k() {
            return (SortedMap) this.f40268y;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return k().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new i(k().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new i(k().tailMap(k10));
        }
    }

    /* loaded from: classes3.dex */
    public class j extends d<K, V>.e implements SortedSet<K> {
        public j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return f().comparator();
        }

        public SortedMap<K, Collection<V>> f() {
            return (SortedMap) super.d();
        }

        @Override // java.util.SortedSet
        public K first() {
            return f().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new j(f().headMap(k10));
        }

        @Override // java.util.SortedSet
        public K last() {
            return f().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new j(f().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new j(f().tailMap(k10));
        }
    }

    public d(Map<K, Collection<V>> map) {
        kk.j.d(map.isEmpty());
        this.A = map;
    }

    public static /* synthetic */ int p(d dVar) {
        int i10 = dVar.B;
        dVar.B = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int q(d dVar) {
        int i10 = dVar.B;
        dVar.B = i10 - 1;
        return i10;
    }

    public static <E> Iterator<E> w(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    public final List<V> A(@NullableDecl K k10, List<V> list, @NullableDecl d<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(k10, list, kVar) : new l(k10, list, kVar);
    }

    @Override // lk.f, lk.e0
    public Collection<Map.Entry<K, V>> a() {
        return super.a();
    }

    @Override // lk.e0
    public void clear() {
        for (Collection<V> collection : this.A.values()) {
            collection.clear();
        }
        this.A.clear();
        this.B = 0;
    }

    @Override // lk.f
    public Collection<Map.Entry<K, V>> f() {
        return new f.a();
    }

    @Override // lk.e0
    public Collection<V> get(@NullableDecl K k10) {
        Collection<V> collection = this.A.get(k10);
        if (collection == null) {
            collection = t(k10);
        }
        return z(k10, collection);
    }

    @Override // lk.f
    public Collection<V> h() {
        return new f.b();
    }

    @Override // lk.f
    public Iterator<Map.Entry<K, V>> i() {
        return new b();
    }

    @Override // lk.f
    public Iterator<V> k() {
        return new a();
    }

    @Override // lk.e0
    public boolean put(@NullableDecl K k10, @NullableDecl V v10) {
        Collection<V> collection = this.A.get(k10);
        if (collection == null) {
            Collection<V> t10 = t(k10);
            if (t10.add(v10)) {
                this.B++;
                this.A.put(k10, t10);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(v10)) {
            this.B++;
            return true;
        } else {
            return false;
        }
    }

    public abstract Collection<V> s();

    @Override // lk.e0
    public int size() {
        return this.B;
    }

    public Collection<V> t(@NullableDecl K k10) {
        return s();
    }

    public final Map<K, Collection<V>> u() {
        Map<K, Collection<V>> map = this.A;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap) this.A);
        }
        if (map instanceof SortedMap) {
            return new i((SortedMap) this.A);
        }
        return new c(this.A);
    }

    public final Set<K> v() {
        Map<K, Collection<V>> map = this.A;
        if (map instanceof NavigableMap) {
            return new g((NavigableMap) this.A);
        }
        if (map instanceof SortedMap) {
            return new j((SortedMap) this.A);
        }
        return new e(this.A);
    }

    @Override // lk.f, lk.e0
    public Collection<V> values() {
        return super.values();
    }

    public final void x(Object obj) {
        Collection collection = (Collection) d0.h(this.A, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.B -= size;
        }
    }

    public abstract <E> Collection<E> y(Collection<E> collection);

    public abstract Collection<V> z(@NullableDecl K k10, Collection<V> collection);

    /* loaded from: classes3.dex */
    public class k extends AbstractCollection<V> {
        @NullableDecl

        /* renamed from: w  reason: collision with root package name */
        public final K f40284w;

        /* renamed from: x  reason: collision with root package name */
        public Collection<V> f40285x;
        @NullableDecl

        /* renamed from: y  reason: collision with root package name */
        public final d<K, V>.k f40286y;
        @NullableDecl

        /* renamed from: z  reason: collision with root package name */
        public final Collection<V> f40287z;

        public k(@NullableDecl K k10, Collection<V> collection, @NullableDecl d<K, V>.k kVar) {
            this.f40284w = k10;
            this.f40285x = collection;
            this.f40286y = kVar;
            this.f40287z = kVar == null ? null : kVar.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v10) {
            k();
            boolean isEmpty = this.f40285x.isEmpty();
            boolean add = this.f40285x.add(v10);
            if (add) {
                d.p(d.this);
                if (isEmpty) {
                    d();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f40285x.addAll(collection);
            if (addAll) {
                int size2 = this.f40285x.size();
                d.this.B += size2 - size;
                if (size == 0) {
                    d();
                }
            }
            return addAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f40285x.clear();
            d.this.B -= size;
            l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            k();
            return this.f40285x.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            k();
            return this.f40285x.containsAll(collection);
        }

        public void d() {
            d<K, V>.k kVar = this.f40286y;
            if (kVar == null) {
                d.this.A.put(this.f40284w, this.f40285x);
            } else {
                kVar.d();
            }
        }

        @Override // java.util.Collection
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            k();
            return this.f40285x.equals(obj);
        }

        public d<K, V>.k f() {
            return this.f40286y;
        }

        public Collection<V> g() {
            return this.f40285x;
        }

        @Override // java.util.Collection
        public int hashCode() {
            k();
            return this.f40285x.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            k();
            return new a();
        }

        K j() {
            return this.f40284w;
        }

        public void k() {
            Collection<V> collection;
            d<K, V>.k kVar = this.f40286y;
            if (kVar != null) {
                kVar.k();
                if (this.f40286y.g() != this.f40287z) {
                    throw new ConcurrentModificationException();
                }
            } else if (!this.f40285x.isEmpty() || (collection = (Collection) d.this.A.get(this.f40284w)) == null) {
            } else {
                this.f40285x = collection;
            }
        }

        public void l() {
            d<K, V>.k kVar = this.f40286y;
            if (kVar != null) {
                kVar.l();
            } else if (this.f40285x.isEmpty()) {
                d.this.A.remove(this.f40284w);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            k();
            boolean remove = this.f40285x.remove(obj);
            if (remove) {
                d.q(d.this);
                l();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f40285x.removeAll(collection);
            if (removeAll) {
                int size2 = this.f40285x.size();
                d.this.B += size2 - size;
                l();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            kk.j.i(collection);
            int size = size();
            boolean retainAll = this.f40285x.retainAll(collection);
            if (retainAll) {
                int size2 = this.f40285x.size();
                d.this.B += size2 - size;
                l();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            k();
            return this.f40285x.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            k();
            return this.f40285x.toString();
        }

        /* loaded from: classes3.dex */
        public class a implements Iterator<V> {

            /* renamed from: w  reason: collision with root package name */
            public final Iterator<V> f40288w;

            /* renamed from: x  reason: collision with root package name */
            public final Collection<V> f40289x;

            public a() {
                Collection<V> collection = k.this.f40285x;
                this.f40289x = collection;
                this.f40288w = d.w(collection);
            }

            public Iterator<V> a() {
                b();
                return this.f40288w;
            }

            public void b() {
                k.this.k();
                if (k.this.f40285x != this.f40289x) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f40288w.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                b();
                return this.f40288w.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f40288w.remove();
                d.q(d.this);
                k.this.l();
            }

            public a(Iterator<V> it) {
                this.f40289x = k.this.f40285x;
                this.f40288w = it;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class l extends d<K, V>.k implements List<V> {

        /* loaded from: classes3.dex */
        public class a extends d<K, V>.k.a implements ListIterator<V> {
            public a() {
                super();
            }

            @Override // java.util.ListIterator
            public void add(V v10) {
                boolean isEmpty = l.this.isEmpty();
                d().add(v10);
                d.p(d.this);
                if (isEmpty) {
                    l.this.d();
                }
            }

            public final ListIterator<V> d() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return d().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return d().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return d().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return d().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v10) {
                d().set(v10);
            }

            public a(int i10) {
                super(l.this.m().listIterator(i10));
            }
        }

        public l(@NullableDecl K k10, List<V> list, @NullableDecl d<K, V>.k kVar) {
            super(k10, list, kVar);
        }

        @Override // java.util.List
        public void add(int i10, V v10) {
            k();
            boolean isEmpty = g().isEmpty();
            m().add(i10, v10);
            d.p(d.this);
            if (isEmpty) {
                d();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = m().addAll(i10, collection);
            if (addAll) {
                int size2 = g().size();
                d.this.B += size2 - size;
                if (size == 0) {
                    d();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public V get(int i10) {
            k();
            return m().get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            k();
            return m().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            k();
            return m().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            k();
            return new a();
        }

        public List<V> m() {
            return (List) g();
        }

        @Override // java.util.List
        public V remove(int i10) {
            k();
            V remove = m().remove(i10);
            d.q(d.this);
            l();
            return remove;
        }

        @Override // java.util.List
        public V set(int i10, V v10) {
            k();
            return m().set(i10, v10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            k();
            return d.this.A(j(), m().subList(i10, i11), f() == null ? this : f());
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            k();
            return new a(i10);
        }
    }
}
