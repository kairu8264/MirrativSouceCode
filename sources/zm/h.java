package zm;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes4.dex */
public final class h<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator<Comparable> D = new a();
    public final e<K, V> A;
    public h<K, V>.b B;
    public h<K, V>.c C;

    /* renamed from: w  reason: collision with root package name */
    public Comparator<? super K> f63246w;

    /* renamed from: x  reason: collision with root package name */
    public e<K, V> f63247x;

    /* renamed from: y  reason: collision with root package name */
    public int f63248y;

    /* renamed from: z  reason: collision with root package name */
    public int f63249z;

    /* loaded from: classes4.dex */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* loaded from: classes4.dex */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes4.dex */
        public class a extends h<K, V>.d<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && h.this.f((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> f10;
            if ((obj instanceof Map.Entry) && (f10 = h.this.f((Map.Entry) obj)) != null) {
                h.this.i(f10, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f63248y;
        }
    }

    /* loaded from: classes4.dex */
    public final class c extends AbstractSet<K> {

        /* loaded from: classes4.dex */
        public class a extends h<K, V>.d<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().B;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return h.this.j(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f63248y;
        }
    }

    /* loaded from: classes4.dex */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: w  reason: collision with root package name */
        public e<K, V> f63252w;

        /* renamed from: x  reason: collision with root package name */
        public e<K, V> f63253x = null;

        /* renamed from: y  reason: collision with root package name */
        public int f63254y;

        public d() {
            this.f63252w = h.this.A.f63259z;
            this.f63254y = h.this.f63249z;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f63252w;
            h hVar = h.this;
            if (eVar != hVar.A) {
                if (hVar.f63249z == this.f63254y) {
                    this.f63252w = eVar.f63259z;
                    this.f63253x = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f63252w != h.this.A;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f63253x;
            if (eVar != null) {
                h.this.i(eVar, true);
                this.f63253x = null;
                this.f63254y = h.this.f63249z;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public h() {
        this(D);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f63247x = null;
        this.f63248y = 0;
        this.f63249z++;
        e<K, V> eVar = this.A;
        eVar.A = eVar;
        eVar.f63259z = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return g(obj) != null;
    }

    public final boolean d(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public e<K, V> e(K k10, boolean z10) {
        int i10;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f63246w;
        e<K, V> eVar2 = this.f63247x;
        if (eVar2 != null) {
            Comparable comparable = comparator == D ? (Comparable) k10 : null;
            while (true) {
                if (comparable != null) {
                    i10 = comparable.compareTo(eVar2.B);
                } else {
                    i10 = comparator.compare(k10, (K) eVar2.B);
                }
                if (i10 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i10 < 0 ? eVar2.f63257x : eVar2.f63258y;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i10 = 0;
        }
        if (z10) {
            e<K, V> eVar4 = this.A;
            if (eVar2 == null) {
                if (comparator == D && !(k10 instanceof Comparable)) {
                    throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
                }
                eVar = new e<>(eVar2, k10, eVar4, eVar4.A);
                this.f63247x = eVar;
            } else {
                eVar = new e<>(eVar2, k10, eVar4, eVar4.A);
                if (i10 < 0) {
                    eVar2.f63257x = eVar;
                } else {
                    eVar2.f63258y = eVar;
                }
                h(eVar2, true);
            }
            this.f63248y++;
            this.f63249z++;
            return eVar;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        h<K, V>.b bVar = this.B;
        if (bVar != null) {
            return bVar;
        }
        h<K, V>.b bVar2 = new b();
        this.B = bVar2;
        return bVar2;
    }

    public e<K, V> f(Map.Entry<?, ?> entry) {
        e<K, V> g10 = g(entry.getKey());
        if (g10 != null && d(g10.C, entry.getValue())) {
            return g10;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e<K, V> g(Object obj) {
        if (obj != 0) {
            try {
                return e(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> g10 = g(obj);
        if (g10 != null) {
            return g10.C;
        }
        return null;
    }

    public final void h(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f63257x;
            e<K, V> eVar3 = eVar.f63258y;
            int i10 = eVar2 != null ? eVar2.D : 0;
            int i11 = eVar3 != null ? eVar3.D : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f63257x;
                e<K, V> eVar5 = eVar3.f63258y;
                int i13 = (eVar4 != null ? eVar4.D : 0) - (eVar5 != null ? eVar5.D : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    o(eVar3);
                    m(eVar);
                } else {
                    m(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f63257x;
                e<K, V> eVar7 = eVar2.f63258y;
                int i14 = (eVar6 != null ? eVar6.D : 0) - (eVar7 != null ? eVar7.D : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    m(eVar2);
                    o(eVar);
                } else {
                    o(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.D = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.D = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f63256w;
        }
    }

    public void i(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.A;
            eVar2.f63259z = eVar.f63259z;
            eVar.f63259z.A = eVar2;
        }
        e<K, V> eVar3 = eVar.f63257x;
        e<K, V> eVar4 = eVar.f63258y;
        e<K, V> eVar5 = eVar.f63256w;
        int i11 = 0;
        if (eVar3 != null && eVar4 != null) {
            e<K, V> b10 = eVar3.D > eVar4.D ? eVar3.b() : eVar4.a();
            i(b10, false);
            e<K, V> eVar6 = eVar.f63257x;
            if (eVar6 != null) {
                i10 = eVar6.D;
                b10.f63257x = eVar6;
                eVar6.f63256w = b10;
                eVar.f63257x = null;
            } else {
                i10 = 0;
            }
            e<K, V> eVar7 = eVar.f63258y;
            if (eVar7 != null) {
                i11 = eVar7.D;
                b10.f63258y = eVar7;
                eVar7.f63256w = b10;
                eVar.f63258y = null;
            }
            b10.D = Math.max(i10, i11) + 1;
            k(eVar, b10);
            return;
        }
        if (eVar3 != null) {
            k(eVar, eVar3);
            eVar.f63257x = null;
        } else if (eVar4 != null) {
            k(eVar, eVar4);
            eVar.f63258y = null;
        } else {
            k(eVar, null);
        }
        h(eVar5, false);
        this.f63248y--;
        this.f63249z++;
    }

    public e<K, V> j(Object obj) {
        e<K, V> g10 = g(obj);
        if (g10 != null) {
            i(g10, true);
        }
        return g10;
    }

    public final void k(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f63256w;
        eVar.f63256w = null;
        if (eVar2 != null) {
            eVar2.f63256w = eVar3;
        }
        if (eVar3 != null) {
            if (eVar3.f63257x == eVar) {
                eVar3.f63257x = eVar2;
                return;
            } else {
                eVar3.f63258y = eVar2;
                return;
            }
        }
        this.f63247x = eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        h<K, V>.c cVar = this.C;
        if (cVar != null) {
            return cVar;
        }
        h<K, V>.c cVar2 = new c();
        this.C = cVar2;
        return cVar2;
    }

    public final void m(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f63257x;
        e<K, V> eVar3 = eVar.f63258y;
        e<K, V> eVar4 = eVar3.f63257x;
        e<K, V> eVar5 = eVar3.f63258y;
        eVar.f63258y = eVar4;
        if (eVar4 != null) {
            eVar4.f63256w = eVar;
        }
        k(eVar, eVar3);
        eVar3.f63257x = eVar;
        eVar.f63256w = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.D : 0, eVar4 != null ? eVar4.D : 0) + 1;
        eVar.D = max;
        eVar3.D = Math.max(max, eVar5 != null ? eVar5.D : 0) + 1;
    }

    public final void o(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f63257x;
        e<K, V> eVar3 = eVar.f63258y;
        e<K, V> eVar4 = eVar2.f63257x;
        e<K, V> eVar5 = eVar2.f63258y;
        eVar.f63257x = eVar5;
        if (eVar5 != null) {
            eVar5.f63256w = eVar;
        }
        k(eVar, eVar2);
        eVar2.f63258y = eVar;
        eVar.f63256w = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.D : 0, eVar5 != null ? eVar5.D : 0) + 1;
        eVar.D = max;
        eVar2.D = Math.max(max, eVar4 != null ? eVar4.D : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        Objects.requireNonNull(k10, "key == null");
        e<K, V> e10 = e(k10, true);
        V v11 = e10.C;
        e10.C = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> j10 = j(obj);
        if (j10 != null) {
            return j10.C;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f63248y;
    }

    public h(Comparator<? super K> comparator) {
        this.f63248y = 0;
        this.f63249z = 0;
        this.A = new e<>();
        this.f63246w = comparator == null ? D : comparator;
    }

    /* loaded from: classes4.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {
        public e<K, V> A;
        public final K B;
        public V C;
        public int D;

        /* renamed from: w  reason: collision with root package name */
        public e<K, V> f63256w;

        /* renamed from: x  reason: collision with root package name */
        public e<K, V> f63257x;

        /* renamed from: y  reason: collision with root package name */
        public e<K, V> f63258y;

        /* renamed from: z  reason: collision with root package name */
        public e<K, V> f63259z;

        public e() {
            this.B = null;
            this.A = this;
            this.f63259z = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f63257x; eVar2 != null; eVar2 = eVar2.f63257x) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f63258y; eVar2 != null; eVar2 = eVar2.f63258y) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.B;
                if (k10 == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k10.equals(entry.getKey())) {
                    return false;
                }
                V v10 = this.C;
                if (v10 == null) {
                    if (entry.getValue() != null) {
                        return false;
                    }
                } else if (!v10.equals(entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.B;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.C;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.B;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.C;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.C;
            this.C = v10;
            return v11;
        }

        public String toString() {
            return this.B + "=" + this.C;
        }

        public e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f63256w = eVar;
            this.B = k10;
            this.D = 1;
            this.f63259z = eVar2;
            this.A = eVar3;
            eVar3.f63259z = this;
            eVar2.A = this;
        }
    }
}
