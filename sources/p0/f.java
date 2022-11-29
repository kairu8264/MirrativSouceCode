package p0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import n0.f;

/* loaded from: classes.dex */
public final class f<K, V> extends xn.g<K, V> implements f.a<K, V> {
    public int A;
    public int B;

    /* renamed from: w  reason: collision with root package name */
    public d<K, V> f45657w;

    /* renamed from: x  reason: collision with root package name */
    public r0.e f45658x;

    /* renamed from: y  reason: collision with root package name */
    public t<K, V> f45659y;

    /* renamed from: z  reason: collision with root package name */
    public V f45660z;

    public f(d<K, V> dVar) {
        jo.p.h(dVar, "map");
        this.f45657w = dVar;
        this.f45658x = new r0.e();
        this.f45659y = this.f45657w.r();
        this.B = this.f45657w.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f45659y = t.f45669e.a();
        p(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f45659y.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // xn.g
    public Set<Map.Entry<K, V>> d() {
        return new h(this);
    }

    @Override // xn.g
    public Set<K> e() {
        return new j(this);
    }

    @Override // xn.g
    public int f() {
        return this.B;
    }

    @Override // xn.g
    public Collection<V> g() {
        return new l(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        return this.f45659y.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // n0.f.a
    /* renamed from: h */
    public d<K, V> a() {
        d<K, V> dVar;
        if (this.f45659y == this.f45657w.r()) {
            dVar = this.f45657w;
        } else {
            this.f45658x = new r0.e();
            dVar = new d<>(this.f45659y, size());
        }
        this.f45657w = dVar;
        return dVar;
    }

    public final int i() {
        return this.A;
    }

    public final t<K, V> j() {
        return this.f45659y;
    }

    public final r0.e k() {
        return this.f45658x;
    }

    public final void m(int i10) {
        this.A = i10;
    }

    public final void o(V v10) {
        this.f45660z = v10;
    }

    public void p(int i10) {
        this.B = i10;
        this.A++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        this.f45660z = null;
        this.f45659y = this.f45659y.D(k10 != null ? k10.hashCode() : 0, k10, v10, 0, this);
        return this.f45660z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        jo.p.h(map, "from");
        d<K, V> dVar = map instanceof d ? (d) map : null;
        if (dVar == null) {
            f fVar = map instanceof f ? (f) map : null;
            dVar = fVar != null ? fVar.a() : null;
        }
        if (dVar != null) {
            r0.b bVar = new r0.b(0, 1, null);
            int size = size();
            this.f45659y = this.f45659y.E(dVar.r(), 0, bVar, this);
            int size2 = (dVar.size() + size) - bVar.a();
            if (size != size2) {
                p(size2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        this.f45660z = null;
        t G = this.f45659y.G(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (G == null) {
            G = t.f45669e.a();
        }
        this.f45659y = G;
        return this.f45660z;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        t H = this.f45659y.H(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (H == null) {
            H = t.f45669e.a();
        }
        this.f45659y = H;
        return size != size();
    }
}
