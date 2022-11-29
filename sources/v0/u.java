package v0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import n0.f;
import v0.h;

/* loaded from: classes.dex */
public final class u<K, V> implements Map<K, V>, c0, ko.e {

    /* renamed from: w  reason: collision with root package name */
    public d0 f56531w = new a(n0.a.a());

    /* renamed from: x  reason: collision with root package name */
    public final Set<Map.Entry<K, V>> f56532x = new n(this);

    /* renamed from: y  reason: collision with root package name */
    public final Set<K> f56533y = new o(this);

    /* renamed from: z  reason: collision with root package name */
    public final Collection<V> f56534z = new q(this);

    /* loaded from: classes.dex */
    public static final class a<K, V> extends d0 {

        /* renamed from: c  reason: collision with root package name */
        public n0.f<K, ? extends V> f56535c;

        /* renamed from: d  reason: collision with root package name */
        public int f56536d;

        public a(n0.f<K, ? extends V> fVar) {
            jo.p.h(fVar, "map");
            this.f56535c = fVar;
        }

        @Override // v0.d0
        public void a(d0 d0Var) {
            Object obj;
            jo.p.h(d0Var, "value");
            a aVar = (a) d0Var;
            obj = v.f56537a;
            synchronized (obj) {
                this.f56535c = aVar.f56535c;
                this.f56536d = aVar.f56536d;
                wn.v vVar = wn.v.f59242a;
            }
        }

        @Override // v0.d0
        public d0 b() {
            return new a(this.f56535c);
        }

        public final n0.f<K, V> g() {
            return (n0.f<K, ? extends V>) this.f56535c;
        }

        public final int h() {
            return this.f56536d;
        }

        public final void i(n0.f<K, ? extends V> fVar) {
            jo.p.h(fVar, "<set-?>");
            this.f56535c = fVar;
        }

        public final void j(int i10) {
            this.f56536d = i10;
        }
    }

    @Override // java.util.Map
    public void clear() {
        Object obj;
        h b10;
        h.a aVar = h.f56484e;
        a aVar2 = (a) m.A((a) d(), aVar.b());
        aVar2.g();
        n0.f<K, V> a10 = n0.a.a();
        if (a10 != aVar2.g()) {
            obj = v.f56537a;
            synchronized (obj) {
                a aVar3 = (a) d();
                m.D();
                synchronized (m.C()) {
                    b10 = aVar.b();
                    a aVar4 = (a) m.Z(aVar3, this, b10);
                    aVar4.i(a10);
                    aVar4.j(aVar4.h() + 1);
                }
                m.J(b10, this);
            }
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return h().g().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return h().g().containsValue(obj);
    }

    @Override // v0.c0
    public d0 d() {
        return this.f56531w;
    }

    public Set<Map.Entry<K, V>> e() {
        return this.f56532x;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return e();
    }

    public Set<K> f() {
        return this.f56533y;
    }

    public final int g() {
        return h().h();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return h().g().get(obj);
    }

    public final a<K, V> h() {
        return (a) m.O((a) d(), this);
    }

    public int i() {
        return h().g().size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return h().g().isEmpty();
    }

    @Override // v0.c0
    public void j(d0 d0Var) {
        jo.p.h(d0Var, "value");
        this.f56531w = (a) d0Var;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return f();
    }

    public Collection<V> m() {
        return this.f56534z;
    }

    public final boolean o(V v10) {
        Object obj;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jo.p.c(((Map.Entry) obj).getValue(), v10)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        Object obj;
        h.a aVar;
        n0.f<K, V> g10;
        int h10;
        V put;
        Object obj2;
        h b10;
        boolean z10;
        do {
            obj = v.f56537a;
            synchronized (obj) {
                aVar = h.f56484e;
                a aVar2 = (a) m.A((a) d(), aVar.b());
                g10 = aVar2.g();
                h10 = aVar2.h();
                wn.v vVar = wn.v.f59242a;
            }
            jo.p.e(g10);
            f.a<K, V> n10 = g10.n();
            put = n10.put(k10, v10);
            n0.f<K, V> a10 = n10.a();
            if (jo.p.c(a10, g10)) {
                break;
            }
            obj2 = v.f56537a;
            synchronized (obj2) {
                a aVar3 = (a) d();
                m.D();
                synchronized (m.C()) {
                    b10 = aVar.b();
                    a aVar4 = (a) m.Z(aVar3, this, b10);
                    z10 = true;
                    if (aVar4.h() == h10) {
                        aVar4.i(a10);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z10 = false;
                    }
                }
                m.J(b10, this);
            }
        } while (!z10);
        return put;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        Object obj;
        h.a aVar;
        n0.f<K, V> g10;
        int h10;
        Object obj2;
        h b10;
        boolean z10;
        jo.p.h(map, "from");
        do {
            obj = v.f56537a;
            synchronized (obj) {
                aVar = h.f56484e;
                a aVar2 = (a) m.A((a) d(), aVar.b());
                g10 = aVar2.g();
                h10 = aVar2.h();
                wn.v vVar = wn.v.f59242a;
            }
            jo.p.e(g10);
            f.a<K, V> n10 = g10.n();
            n10.putAll(map);
            n0.f<K, V> a10 = n10.a();
            if (jo.p.c(a10, g10)) {
                return;
            }
            obj2 = v.f56537a;
            synchronized (obj2) {
                a aVar3 = (a) d();
                m.D();
                synchronized (m.C()) {
                    b10 = aVar.b();
                    a aVar4 = (a) m.Z(aVar3, this, b10);
                    z10 = true;
                    if (aVar4.h() == h10) {
                        aVar4.i(a10);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z10 = false;
                    }
                }
                m.J(b10, this);
            }
        } while (!z10);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        Object obj2;
        h.a aVar;
        n0.f<K, V> g10;
        int h10;
        V remove;
        Object obj3;
        h b10;
        boolean z10;
        do {
            obj2 = v.f56537a;
            synchronized (obj2) {
                aVar = h.f56484e;
                a aVar2 = (a) m.A((a) d(), aVar.b());
                g10 = aVar2.g();
                h10 = aVar2.h();
                wn.v vVar = wn.v.f59242a;
            }
            jo.p.e(g10);
            f.a<K, V> n10 = g10.n();
            remove = n10.remove(obj);
            n0.f<K, V> a10 = n10.a();
            if (jo.p.c(a10, g10)) {
                break;
            }
            obj3 = v.f56537a;
            synchronized (obj3) {
                a aVar3 = (a) d();
                m.D();
                synchronized (m.C()) {
                    b10 = aVar.b();
                    a aVar4 = (a) m.Z(aVar3, this, b10);
                    z10 = true;
                    if (aVar4.h() == h10) {
                        aVar4.i(a10);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z10 = false;
                    }
                }
                m.J(b10, this);
            }
        } while (!z10);
        return remove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return i();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m();
    }
}
