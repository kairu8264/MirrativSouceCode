package ai;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class w03<K, V> extends AbstractMap<K, V> {

    /* renamed from: w  reason: collision with root package name */
    public transient Set<Map.Entry<K, V>> f11447w;

    /* renamed from: x  reason: collision with root package name */
    public transient Collection<V> f11448x;

    public abstract Set<Map.Entry<K, V>> d();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f11447w;
        if (set == null) {
            Set<Map.Entry<K, V>> d10 = d();
            this.f11447w = d10;
            return d10;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f11448x;
        if (collection == null) {
            v03 v03Var = new v03(this);
            this.f11448x = v03Var;
            return v03Var;
        }
        return collection;
    }
}
