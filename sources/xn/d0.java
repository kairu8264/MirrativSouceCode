package xn;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class d0 implements Map, Serializable, ko.a {

    /* renamed from: w  reason: collision with root package name */
    public static final d0 f60440w = new d0();

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return d((Void) obj);
        }
        return false;
    }

    public boolean d(Void r22) {
        jo.p.h(r22, "value");
        return false;
    }

    @Override // java.util.Map
    /* renamed from: e */
    public Void get(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return f();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public Set<Map.Entry> f() {
        return e0.f60441w;
    }

    public Set<Object> g() {
        return e0.f60441w;
    }

    public int h() {
        return 0;
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    public Collection i() {
        return c0.f60437w;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    /* renamed from: j */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return g();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return h();
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return i();
    }
}
