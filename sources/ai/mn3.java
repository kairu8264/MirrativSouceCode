package ai;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class mn3<K, V, V2> implements rn3<Map<K, V2>> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<K, eo3<V>> f6987a;

    public mn3(Map<K, eo3<V>> map) {
        this.f6987a = Collections.unmodifiableMap(map);
    }

    public final Map<K, eo3<V>> a() {
        return this.f6987a;
    }
}
