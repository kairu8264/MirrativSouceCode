package ai;

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
public class al3<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public volatile yk3 A;

    /* renamed from: w  reason: collision with root package name */
    public final int f1914w;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1917z;

    /* renamed from: x  reason: collision with root package name */
    public List<wk3> f1915x = Collections.emptyList();

    /* renamed from: y  reason: collision with root package name */
    public Map<K, V> f1916y = Collections.emptyMap();
    public Map<K, V> B = Collections.emptyMap();

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        r();
        if (!this.f1915x.isEmpty()) {
            this.f1915x.clear();
        }
        if (this.f1916y.isEmpty()) {
            return;
        }
        this.f1916y.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return q(comparable) >= 0 || this.f1916y.containsKey(comparable);
    }

    public void d() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.f1917z) {
            return;
        }
        if (this.f1916y.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.f1916y);
        }
        this.f1916y = unmodifiableMap;
        if (this.B.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.B);
        }
        this.B = unmodifiableMap2;
        this.f1917z = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.A == null) {
            this.A = new yk3(this, null);
        }
        return this.A;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al3)) {
            return super.equals(obj);
        }
        al3 al3Var = (al3) obj;
        int size = size();
        if (size != al3Var.size()) {
            return false;
        }
        int h10 = h();
        if (h10 == al3Var.h()) {
            for (int i10 = 0; i10 < h10; i10++) {
                if (!i(i10).equals(al3Var.i(i10))) {
                    return false;
                }
            }
            if (h10 != size) {
                return this.f1916y.equals(al3Var.f1916y);
            }
            return true;
        }
        return entrySet().equals(al3Var.entrySet());
    }

    public final boolean g() {
        return this.f1917z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int q10 = q(comparable);
        if (q10 >= 0) {
            return (V) this.f1915x.get(q10).getValue();
        }
        return this.f1916y.get(comparable);
    }

    public final int h() {
        return this.f1915x.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int h10 = h();
        int i10 = 0;
        for (int i11 = 0; i11 < h10; i11++) {
            i10 += this.f1915x.get(i11).hashCode();
        }
        return this.f1916y.size() > 0 ? i10 + this.f1916y.hashCode() : i10;
    }

    public final Map.Entry<K, V> i(int i10) {
        return this.f1915x.get(i10);
    }

    public final Iterable<Map.Entry<K, V>> j() {
        return this.f1916y.isEmpty() ? vk3.b() : this.f1916y.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: k */
    public final V put(K k10, V v10) {
        r();
        int q10 = q(k10);
        if (q10 >= 0) {
            return (V) this.f1915x.get(q10).setValue(v10);
        }
        r();
        if (this.f1915x.isEmpty() && !(this.f1915x instanceof ArrayList)) {
            this.f1915x = new ArrayList(this.f1914w);
        }
        int i10 = -(q10 + 1);
        if (i10 >= this.f1914w) {
            return s().put(k10, v10);
        }
        int size = this.f1915x.size();
        int i11 = this.f1914w;
        if (size == i11) {
            wk3 remove = this.f1915x.remove(i11 - 1);
            s().put((K) remove.a(), (V) remove.getValue());
        }
        this.f1915x.add(i10, new wk3(this, k10, v10));
        return null;
    }

    public final V p(int i10) {
        r();
        V v10 = (V) this.f1915x.remove(i10).getValue();
        if (!this.f1916y.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = s().entrySet().iterator();
            List<wk3> list = this.f1915x;
            Map.Entry<K, V> next = it.next();
            list.add(new wk3(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v10;
    }

    public final int q(K k10) {
        int size = this.f1915x.size() - 1;
        int i10 = 0;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f1915x.get(size).a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f1915x.get(i11).a());
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

    public final void r() {
        if (this.f1917z) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        r();
        Comparable comparable = (Comparable) obj;
        int q10 = q(comparable);
        if (q10 >= 0) {
            return (V) p(q10);
        }
        if (this.f1916y.isEmpty()) {
            return null;
        }
        return this.f1916y.remove(comparable);
    }

    public final SortedMap<K, V> s() {
        r();
        if (this.f1916y.isEmpty() && !(this.f1916y instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f1916y = treeMap;
            this.B = treeMap.descendingMap();
        }
        return (SortedMap) this.f1916y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1915x.size() + this.f1916y.size();
    }
}
