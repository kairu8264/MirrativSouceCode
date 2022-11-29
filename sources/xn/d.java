package xn;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class d<K, V> implements Map<K, V>, ko.a {

    /* renamed from: w  reason: collision with root package name */
    public static final a f60438w = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends jo.q implements io.l<Map.Entry<? extends K, ? extends V>, CharSequence> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ d<K, V> f60439w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(d<K, ? extends V> dVar) {
            super(1);
            this.f60439w = dVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final CharSequence invoke(Map.Entry<? extends K, ? extends V> entry) {
            jo.p.h(entry, "it");
            return this.f60439w.k(entry);
        }
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> entrySet = entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (jo.p.c(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        jo.p.f(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        V v10 = get(key);
        if (jo.p.c(value, v10)) {
            if (v10 == null) {
                jo.p.f(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
                return containsKey(key);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return f();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            Set<Map.Entry<K, V>> entrySet = map.entrySet();
            if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
                return true;
            }
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                if (!e((Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public abstract Set f();

    public abstract Set<K> g();

    public abstract int h();

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    public abstract Collection<V> i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final String j(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    public final String k(Map.Entry<? extends K, ? extends V> entry) {
        return j(entry.getKey()) + '=' + j(entry.getValue());
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return g();
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return h();
    }

    public String toString() {
        return a0.g0(entrySet(), ", ", "{", "}", 0, null, new b(this), 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return i();
    }
}
