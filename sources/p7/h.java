package p7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p7.m;

/* loaded from: classes.dex */
public class h<K extends m, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f46180a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    public final Map<K, a<K, V>> f46181b = new HashMap();

    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f46182a;

        /* renamed from: b  reason: collision with root package name */
        public List<V> f46183b;

        /* renamed from: c  reason: collision with root package name */
        public a<K, V> f46184c;

        /* renamed from: d  reason: collision with root package name */
        public a<K, V> f46185d;

        public a() {
            this(null);
        }

        public void a(V v10) {
            if (this.f46183b == null) {
                this.f46183b = new ArrayList();
            }
            this.f46183b.add(v10);
        }

        public V b() {
            int c10 = c();
            if (c10 > 0) {
                return this.f46183b.remove(c10 - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f46183b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public a(K k10) {
            this.f46185d = this;
            this.f46184c = this;
            this.f46182a = k10;
        }
    }

    public static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f46185d;
        aVar2.f46184c = aVar.f46184c;
        aVar.f46184c.f46185d = aVar2;
    }

    public static <K, V> void g(a<K, V> aVar) {
        aVar.f46184c.f46185d = aVar;
        aVar.f46185d.f46184c = aVar;
    }

    public V a(K k10) {
        a<K, V> aVar = this.f46181b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            this.f46181b.put(k10, aVar);
        } else {
            k10.a();
        }
        b(aVar);
        return aVar.b();
    }

    public final void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f46180a;
        aVar.f46185d = aVar2;
        aVar.f46184c = aVar2.f46184c;
        g(aVar);
    }

    public final void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f46180a;
        aVar.f46185d = aVar2.f46185d;
        aVar.f46184c = aVar2;
        g(aVar);
    }

    public void d(K k10, V v10) {
        a<K, V> aVar = this.f46181b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            c(aVar);
            this.f46181b.put(k10, aVar);
        } else {
            k10.a();
        }
        aVar.a(v10);
    }

    public V f() {
        for (a aVar = this.f46180a.f46185d; !aVar.equals(this.f46180a); aVar = aVar.f46185d) {
            V v10 = (V) aVar.b();
            if (v10 != null) {
                return v10;
            }
            e(aVar);
            this.f46181b.remove(aVar.f46182a);
            ((m) aVar.f46182a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        boolean z10 = false;
        for (a aVar = this.f46180a.f46184c; !aVar.equals(this.f46180a); aVar = aVar.f46184c) {
            z10 = true;
            sb2.append('{');
            sb2.append(aVar.f46182a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
