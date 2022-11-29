package ai;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public class fy2 extends w03 {

    /* renamed from: y  reason: collision with root package name */
    public final transient Map f4251y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ sy2 f4252z;

    public fy2(sy2 sy2Var, Map map) {
        this.f4252z = sy2Var;
        this.f4251y = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.f4251y;
        map = this.f4252z.f10028z;
        if (map2 == map) {
            this.f4252z.h();
        } else {
            n03.b(new ey2(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f4251y;
        Objects.requireNonNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // ai.w03
    public final Set<Map.Entry> d() {
        return new dy2(this);
    }

    public final Map.Entry e(Map.Entry entry) {
        Object key = entry.getKey();
        return new vz2(key, this.f4252z.k(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f4251y.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) x03.a(this.f4251y, obj);
        if (collection == null) {
            return null;
        }
        return this.f4252z.k(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f4251y.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.f4252z.i();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        int i10;
        Collection collection = (Collection) this.f4251y.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection l10 = this.f4252z.l();
        l10.addAll(collection);
        sy2 sy2Var = this.f4252z;
        i10 = sy2Var.A;
        sy2Var.A = i10 - collection.size();
        collection.clear();
        return l10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4251y.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f4251y.toString();
    }
}
