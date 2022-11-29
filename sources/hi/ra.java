package hi;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public class ra<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public volatile qa A;

    /* renamed from: w  reason: collision with root package name */
    public final int f35975w;

    /* renamed from: z  reason: collision with root package name */
    public boolean f35978z;

    /* renamed from: x  reason: collision with root package name */
    public List<oa> f35976x = Collections.emptyList();

    /* renamed from: y  reason: collision with root package name */
    public Map<K, V> f35977y = Collections.emptyMap();
    public Map<K, V> B = Collections.emptyMap();

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        s();
        if (!this.f35976x.isEmpty()) {
            this.f35976x.clear();
        }
        if (this.f35977y.isEmpty()) {
            return;
        }
        this.f35977y.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return p(comparable) >= 0 || this.f35977y.containsKey(comparable);
    }

    public void d() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.f35978z) {
            return;
        }
        if (this.f35977y.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.f35977y);
        }
        this.f35977y = unmodifiableMap;
        if (this.B.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.B);
        }
        this.B = unmodifiableMap2;
        this.f35978z = true;
    }

    public final int e() {
        return this.f35976x.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.A == null) {
            this.A = new qa(this, null);
        }
        return this.A;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return super.equals(obj);
        }
        ra raVar = (ra) obj;
        int size = size();
        if (size != raVar.size()) {
            return false;
        }
        int e10 = e();
        if (e10 == raVar.e()) {
            for (int i10 = 0; i10 < e10; i10++) {
                if (!j(i10).equals(raVar.j(i10))) {
                    return false;
                }
            }
            if (e10 != size) {
                return this.f35977y.equals(raVar.f35977y);
            }
            return true;
        }
        return entrySet().equals(raVar.entrySet());
    }

    public final Iterable<Map.Entry<K, V>> f() {
        return this.f35977y.isEmpty() ? na.a() : this.f35977y.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int p10 = p(comparable);
        if (p10 >= 0) {
            return (V) this.f35976x.get(p10).getValue();
        }
        return this.f35977y.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: h */
    public final V put(K k10, V v10) {
        s();
        int p10 = p(k10);
        if (p10 >= 0) {
            return (V) this.f35976x.get(p10).setValue(v10);
        }
        s();
        if (this.f35976x.isEmpty() && !(this.f35976x instanceof ArrayList)) {
            this.f35976x = new ArrayList(this.f35975w);
        }
        int i10 = -(p10 + 1);
        if (i10 >= this.f35975w) {
            return r().put(k10, v10);
        }
        int size = this.f35976x.size();
        int i11 = this.f35975w;
        if (size == i11) {
            oa remove = this.f35976x.remove(i11 - 1);
            r().put((K) remove.a(), (V) remove.getValue());
        }
        this.f35976x.add(i10, new oa(this, k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int e10 = e();
        int i10 = 0;
        for (int i11 = 0; i11 < e10; i11++) {
            i10 += this.f35976x.get(i11).hashCode();
        }
        return this.f35977y.size() > 0 ? i10 + this.f35977y.hashCode() : i10;
    }

    public final Map.Entry<K, V> j(int i10) {
        return this.f35976x.get(i10);
    }

    public final boolean o() {
        return this.f35978z;
    }

    public final int p(K k10) {
        int size = this.f35976x.size() - 1;
        int i10 = 0;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f35976x.get(size).a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f35976x.get(i11).a());
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

    public final V q(int i10) {
        s();
        V v10 = (V) this.f35976x.remove(i10).getValue();
        if (!this.f35977y.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = r().entrySet().iterator();
            List<oa> list = this.f35976x;
            Map.Entry<K, V> next = it.next();
            list.add(new oa(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v10;
    }

    public final SortedMap<K, V> r() {
        s();
        if (this.f35977y.isEmpty() && !(this.f35977y instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f35977y = treeMap;
            this.B = treeMap.descendingMap();
        }
        return (SortedMap) this.f35977y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        s();
        Comparable comparable = (Comparable) obj;
        int p10 = p(comparable);
        if (p10 >= 0) {
            return (V) q(p10);
        }
        if (this.f35977y.isEmpty()) {
            return null;
        }
        return this.f35977y.remove(comparable);
    }

    public final void s() {
        if (this.f35978z) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f35976x.size() + this.f35977y.size();
    }
}
