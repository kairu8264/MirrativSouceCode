package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: w  reason: collision with root package name */
    public c<K, V> f40440w;

    /* renamed from: x  reason: collision with root package name */
    public c<K, V> f40441x;

    /* renamed from: y  reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f40442y = new WeakHashMap<>();

    /* renamed from: z  reason: collision with root package name */
    public int f40443z = 0;

    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f40447z;
        }

        @Override // m.b.e
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f40446y;
        }
    }

    /* renamed from: m.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0586b<K, V> extends e<K, V> {
        public C0586b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f40446y;
        }

        @Override // m.b.e
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f40447z;
        }
    }

    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: w  reason: collision with root package name */
        public final K f40444w;

        /* renamed from: x  reason: collision with root package name */
        public final V f40445x;

        /* renamed from: y  reason: collision with root package name */
        public c<K, V> f40446y;

        /* renamed from: z  reason: collision with root package name */
        public c<K, V> f40447z;

        public c(K k10, V v10) {
            this.f40444w = k10;
            this.f40445x = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f40444w.equals(cVar.f40444w) && this.f40445x.equals(cVar.f40445x);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f40444w;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f40445x;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f40444w.hashCode() ^ this.f40445x.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f40444w + "=" + this.f40445x;
        }
    }

    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: w  reason: collision with root package name */
        public c<K, V> f40448w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f40449x = true;

        public d() {
        }

        @Override // m.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f40448w;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f40447z;
                this.f40448w = cVar3;
                this.f40449x = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (this.f40449x) {
                this.f40449x = false;
                this.f40448w = b.this.f40440w;
            } else {
                c<K, V> cVar = this.f40448w;
                this.f40448w = cVar != null ? cVar.f40446y : null;
            }
            return this.f40448w;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f40449x) {
                return b.this.f40440w != null;
            }
            c<K, V> cVar = this.f40448w;
            return (cVar == null || cVar.f40446y == null) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: w  reason: collision with root package name */
        public c<K, V> f40451w;

        /* renamed from: x  reason: collision with root package name */
        public c<K, V> f40452x;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f40451w = cVar2;
            this.f40452x = cVar;
        }

        @Override // m.b.f
        public void a(c<K, V> cVar) {
            if (this.f40451w == cVar && cVar == this.f40452x) {
                this.f40452x = null;
                this.f40451w = null;
            }
            c<K, V> cVar2 = this.f40451w;
            if (cVar2 == cVar) {
                this.f40451w = b(cVar2);
            }
            if (this.f40452x == cVar) {
                this.f40452x = f();
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> d(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: e */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f40452x;
            this.f40452x = f();
            return cVar;
        }

        public final c<K, V> f() {
            c<K, V> cVar = this.f40452x;
            c<K, V> cVar2 = this.f40451w;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f40452x != null;
        }
    }

    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Map.Entry<K, V> d() {
        return this.f40440w;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0586b c0586b = new C0586b(this.f40441x, this.f40440w);
        this.f40442y.put(c0586b, Boolean.FALSE);
        return c0586b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (size() != bVar.size()) {
                return false;
            }
            Iterator<Map.Entry<K, V>> it = iterator();
            Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Map.Entry<K, V> next = it.next();
                Map.Entry<K, V> next2 = it2.next();
                if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                    return false;
                }
            }
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        return false;
    }

    public c<K, V> f(K k10) {
        c<K, V> cVar = this.f40440w;
        while (cVar != null && !cVar.f40444w.equals(k10)) {
            cVar = cVar.f40446y;
        }
        return cVar;
    }

    public b<K, V>.d g() {
        b<K, V>.d dVar = new d();
        this.f40442y.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().hashCode();
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f40440w, this.f40441x);
        this.f40442y.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Map.Entry<K, V> j() {
        return this.f40441x;
    }

    public c<K, V> k(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f40443z++;
        c<K, V> cVar2 = this.f40441x;
        if (cVar2 == null) {
            this.f40440w = cVar;
            this.f40441x = cVar;
            return cVar;
        }
        cVar2.f40446y = cVar;
        cVar.f40447z = cVar2;
        this.f40441x = cVar;
        return cVar;
    }

    public V l(K k10, V v10) {
        c<K, V> f10 = f(k10);
        if (f10 != null) {
            return f10.f40445x;
        }
        k(k10, v10);
        return null;
    }

    public V m(K k10) {
        c<K, V> f10 = f(k10);
        if (f10 == null) {
            return null;
        }
        this.f40443z--;
        if (!this.f40442y.isEmpty()) {
            for (f<K, V> fVar : this.f40442y.keySet()) {
                fVar.a(f10);
            }
        }
        c<K, V> cVar = f10.f40447z;
        if (cVar != null) {
            cVar.f40446y = f10.f40446y;
        } else {
            this.f40440w = f10.f40446y;
        }
        c<K, V> cVar2 = f10.f40446y;
        if (cVar2 != null) {
            cVar2.f40447z = cVar;
        } else {
            this.f40441x = cVar;
        }
        f10.f40446y = null;
        f10.f40447z = null;
        return f10.f40445x;
    }

    public int size() {
        return this.f40443z;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
