package v0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import n0.f;
import v0.u;

/* loaded from: classes.dex */
public final class q<K, V> extends p<K, V, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u<K, V> uVar) {
        super(uVar);
        jo.p.h(uVar, "map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) g(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) j(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return d().containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        jo.p.h(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!d().containsValue(obj)) {
                return false;
            }
        }
        return true;
    }

    public Void g(V v10) {
        v.b();
        throw new KotlinNothingValueException();
    }

    public Void j(Collection<? extends V> collection) {
        jo.p.h(collection, "elements");
        v.b();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public b0<K, V> iterator() {
        return new b0<>(d(), ((n0.d) d().h().g().entrySet()).iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return d().o(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        Object obj;
        n0.f<K, V> g10;
        int h10;
        boolean z10;
        Object obj2;
        h b10;
        jo.p.h(collection, "elements");
        Set F0 = xn.a0.F0(collection);
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
            for (Map.Entry<K, V> entry : d10.entrySet()) {
                if (F0.contains(entry.getValue())) {
                    n10.remove(entry.getKey());
                    z11 = true;
                }
            }
            wn.v vVar2 = wn.v.f59242a;
            n0.f<K, V> a10 = n10.a();
            if (jo.p.c(a10, g10)) {
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
                        aVar3.i(a10);
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

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        Object obj;
        n0.f<K, V> g10;
        int h10;
        boolean z10;
        Object obj2;
        h b10;
        jo.p.h(collection, "elements");
        Set F0 = xn.a0.F0(collection);
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
            for (Map.Entry<K, V> entry : d10.entrySet()) {
                if (!F0.contains(entry.getValue())) {
                    n10.remove(entry.getKey());
                    z11 = true;
                }
            }
            wn.v vVar2 = wn.v.f59242a;
            n0.f<K, V> a10 = n10.a();
            if (jo.p.c(a10, g10)) {
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
                        aVar3.i(a10);
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
