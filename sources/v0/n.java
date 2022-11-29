package v0;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jo.j0;
import kotlin.KotlinNothingValueException;
import n0.f;
import v0.u;
import xn.m0;

/* loaded from: classes.dex */
public final class n<K, V> extends p<K, V, Map.Entry<K, V>> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u<K, V> uVar) {
        super(uVar);
        jo.p.h(uVar, "map");
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) g((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) j(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (j0.l(obj)) {
            return k((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        jo.p.h(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Void g(Map.Entry<K, V> entry) {
        jo.p.h(entry, "element");
        v.b();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new y(d(), ((n0.d) d().h().g().entrySet()).iterator());
    }

    public Void j(Collection<? extends Map.Entry<K, V>> collection) {
        jo.p.h(collection, "elements");
        v.b();
        throw new KotlinNothingValueException();
    }

    public boolean k(Map.Entry<K, V> entry) {
        jo.p.h(entry, "element");
        return jo.p.c(d().get(entry.getKey()), entry.getValue());
    }

    public boolean m(Map.Entry<K, V> entry) {
        jo.p.h(entry, "element");
        return d().remove(entry.getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (j0.l(obj)) {
            return m((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        jo.p.h(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (d().remove(((Map.Entry) it.next()).getKey()) != null || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        Object obj;
        n0.f<K, V> g10;
        int h10;
        boolean z10;
        Object obj2;
        h b10;
        jo.p.h(collection, "elements");
        LinkedHashMap linkedHashMap = new LinkedHashMap(po.n.d(m0.b(xn.t.u(collection, 10)), 16));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            wn.k a10 = wn.q.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(a10.c(), a10.d());
        }
        u<K, V> d10 = d();
        boolean z11 = false;
        do {
            obj = v.f56537a;
            synchronized (obj) {
                u.a aVar = (u.a) m.A((u.a) d10.d(), h.f56484e.b());
                g10 = aVar.g();
                h10 = aVar.h();
                wn.v vVar = wn.v.f59242a;
            }
            jo.p.e(g10);
            f.a<K, V> n10 = g10.n();
            z10 = true;
            for (Map.Entry<K, V> entry2 : d10.entrySet()) {
                if ((linkedHashMap.containsKey(entry2.getKey()) && jo.p.c(linkedHashMap.get(entry2.getKey()), entry2.getValue())) ? false : true) {
                    n10.remove(entry2.getKey());
                    z11 = true;
                }
            }
            wn.v vVar2 = wn.v.f59242a;
            n0.f<K, V> a11 = n10.a();
            if (jo.p.c(a11, g10)) {
                break;
            }
            obj2 = v.f56537a;
            synchronized (obj2) {
                u.a aVar2 = (u.a) d10.d();
                m.D();
                synchronized (m.C()) {
                    b10 = h.f56484e.b();
                    u.a aVar3 = (u.a) m.Z(aVar2, d10, b10);
                    if (aVar3.h() == h10) {
                        aVar3.i(a11);
                        aVar3.j(aVar3.h() + 1);
                    } else {
                        z10 = false;
                    }
                }
                m.J(b10, d10);
            }
        } while (!z10);
        return z11;
    }
}
