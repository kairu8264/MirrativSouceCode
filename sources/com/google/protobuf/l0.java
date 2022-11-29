package com.google.protobuf;

import com.google.protobuf.p;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public class l0<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public volatile l0<K, V>.g A;
    public Map<K, V> B;
    public volatile l0<K, V>.c C;

    /* renamed from: w  reason: collision with root package name */
    public final int f28163w;

    /* renamed from: x  reason: collision with root package name */
    public List<l0<K, V>.e> f28164x;

    /* renamed from: y  reason: collision with root package name */
    public Map<K, V> f28165y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f28166z;

    /* loaded from: classes4.dex */
    public static class a extends l0<FieldDescriptorType, Object> {
        public a(int i10) {
            super(i10, null);
        }

        @Override // com.google.protobuf.l0, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((p.b) obj, obj2);
        }

        @Override // com.google.protobuf.l0
        public void u() {
            if (!t()) {
                for (int i10 = 0; i10 < p(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> o10 = o(i10);
                    if (((p.b) o10.getKey()).f()) {
                        o10.setValue(Collections.unmodifiableList((List) o10.getValue()));
                    }
                }
                Iterator it = r().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((p.b) entry.getKey()).f()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.u();
        }
    }

    /* loaded from: classes4.dex */
    public class c extends l0<K, V>.g {
        public c() {
            super(l0.this, null);
        }

        @Override // com.google.protobuf.l0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(l0.this, null);
        }

        public /* synthetic */ c(l0 l0Var, a aVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public static final Iterator<Object> f28171a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final Iterable<Object> f28172b = new b();

        /* loaded from: classes4.dex */
        public static class a implements Iterator<Object> {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* loaded from: classes4.dex */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f28171a;
            }
        }

        public static <T> Iterable<T> b() {
            return (Iterable<T>) f28172b;
        }
    }

    /* loaded from: classes4.dex */
    public class e implements Map.Entry<K, V>, Comparable<l0<K, V>.e> {

        /* renamed from: w  reason: collision with root package name */
        public final K f28173w;

        /* renamed from: x  reason: collision with root package name */
        public V f28174x;

        public e(l0 l0Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(l0<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        public final boolean c(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* renamed from: e */
        public K getKey() {
            return this.f28173w;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return c(this.f28173w, entry.getKey()) && c(this.f28174x, entry.getValue());
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f28174x;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f28173w;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f28174x;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            l0.this.j();
            V v11 = this.f28174x;
            this.f28174x = v10;
            return v11;
        }

        public String toString() {
            return this.f28173w + "=" + this.f28174x;
        }

        public e(K k10, V v10) {
            this.f28173w = k10;
            this.f28174x = v10;
        }
    }

    /* loaded from: classes4.dex */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        public g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            l0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = l0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: d */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            l0.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(l0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                l0.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return l0.this.size();
        }

        public /* synthetic */ g(l0 l0Var, a aVar) {
            this();
        }
    }

    public /* synthetic */ l0(int i10, a aVar) {
        this(i10);
    }

    public static <FieldDescriptorType extends p.b<FieldDescriptorType>> l0<FieldDescriptorType, Object> v(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        j();
        if (!this.f28164x.isEmpty()) {
            this.f28164x.clear();
        }
        if (this.f28165y.isEmpty()) {
            return;
        }
        this.f28165y.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return i(comparable) >= 0 || this.f28165y.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.A == null) {
            this.A = new g(this, null);
        }
        return this.A;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return super.equals(obj);
        }
        l0 l0Var = (l0) obj;
        int size = size();
        if (size != l0Var.size()) {
            return false;
        }
        int p10 = p();
        if (p10 != l0Var.p()) {
            return entrySet().equals(l0Var.entrySet());
        }
        for (int i10 = 0; i10 < p10; i10++) {
            if (!o(i10).equals(l0Var.o(i10))) {
                return false;
            }
        }
        if (p10 != size) {
            return this.f28165y.equals(l0Var.f28165y);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int i10 = i(comparable);
        if (i10 >= 0) {
            return this.f28164x.get(i10).getValue();
        }
        return this.f28165y.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int p10 = p();
        int i10 = 0;
        for (int i11 = 0; i11 < p10; i11++) {
            i10 += this.f28164x.get(i11).hashCode();
        }
        return q() > 0 ? i10 + this.f28165y.hashCode() : i10;
    }

    public final int i(K k10) {
        int size = this.f28164x.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f28164x.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f28164x.get(i11).getKey());
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 <= 0) {
                return i11;
            } else {
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    public final void j() {
        if (this.f28166z) {
            throw new UnsupportedOperationException();
        }
    }

    public Set<Map.Entry<K, V>> k() {
        if (this.C == null) {
            this.C = new c(this, null);
        }
        return this.C;
    }

    public final void m() {
        j();
        if (!this.f28164x.isEmpty() || (this.f28164x instanceof ArrayList)) {
            return;
        }
        this.f28164x = new ArrayList(this.f28163w);
    }

    public Map.Entry<K, V> o(int i10) {
        return this.f28164x.get(i10);
    }

    public int p() {
        return this.f28164x.size();
    }

    public int q() {
        return this.f28165y.size();
    }

    public Iterable<Map.Entry<K, V>> r() {
        if (this.f28165y.isEmpty()) {
            return d.b();
        }
        return this.f28165y.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        j();
        Comparable comparable = (Comparable) obj;
        int i10 = i(comparable);
        if (i10 >= 0) {
            return (V) x(i10);
        }
        if (this.f28165y.isEmpty()) {
            return null;
        }
        return this.f28165y.remove(comparable);
    }

    public final SortedMap<K, V> s() {
        j();
        if (this.f28165y.isEmpty() && !(this.f28165y instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f28165y = treeMap;
            this.B = treeMap.descendingMap();
        }
        return (SortedMap) this.f28165y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f28164x.size() + this.f28165y.size();
    }

    public boolean t() {
        return this.f28166z;
    }

    public void u() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.f28166z) {
            return;
        }
        if (this.f28165y.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.f28165y);
        }
        this.f28165y = unmodifiableMap;
        if (this.B.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.B);
        }
        this.B = unmodifiableMap2;
        this.f28166z = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: w */
    public V put(K k10, V v10) {
        j();
        int i10 = i(k10);
        if (i10 >= 0) {
            return this.f28164x.get(i10).setValue(v10);
        }
        m();
        int i11 = -(i10 + 1);
        if (i11 >= this.f28163w) {
            return s().put(k10, v10);
        }
        int size = this.f28164x.size();
        int i12 = this.f28163w;
        if (size == i12) {
            l0<K, V>.e remove = this.f28164x.remove(i12 - 1);
            s().put((K) remove.getKey(), remove.getValue());
        }
        this.f28164x.add(i11, new e(k10, v10));
        return null;
    }

    public final V x(int i10) {
        j();
        V value = this.f28164x.remove(i10).getValue();
        if (!this.f28165y.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = s().entrySet().iterator();
            this.f28164x.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    /* loaded from: classes4.dex */
    public class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: w  reason: collision with root package name */
        public int f28167w;

        /* renamed from: x  reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f28168x;

        public b() {
            this.f28167w = l0.this.f28164x.size();
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f28168x == null) {
                this.f28168x = l0.this.B.entrySet().iterator();
            }
            return this.f28168x;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (!a().hasNext()) {
                List list = l0.this.f28164x;
                int i10 = this.f28167w - 1;
                this.f28167w = i10;
                return (Map.Entry) list.get(i10);
            }
            return a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f28167w;
            return (i10 > 0 && i10 <= l0.this.f28164x.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(l0 l0Var, a aVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: w  reason: collision with root package name */
        public int f28176w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f28177x;

        /* renamed from: y  reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f28178y;

        public f() {
            this.f28176w = -1;
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f28178y == null) {
                this.f28178y = l0.this.f28165y.entrySet().iterator();
            }
            return this.f28178y;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            this.f28177x = true;
            int i10 = this.f28176w + 1;
            this.f28176w = i10;
            if (i10 < l0.this.f28164x.size()) {
                return (Map.Entry) l0.this.f28164x.get(this.f28176w);
            }
            return a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f28176w + 1 >= l0.this.f28164x.size()) {
                return !l0.this.f28165y.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f28177x) {
                this.f28177x = false;
                l0.this.j();
                if (this.f28176w < l0.this.f28164x.size()) {
                    l0 l0Var = l0.this;
                    int i10 = this.f28176w;
                    this.f28176w = i10 - 1;
                    l0Var.x(i10);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        public /* synthetic */ f(l0 l0Var, a aVar) {
            this();
        }
    }

    public l0(int i10) {
        this.f28163w = i10;
        this.f28164x = Collections.emptyList();
        this.f28165y = Collections.emptyMap();
        this.B = Collections.emptyMap();
    }
}
