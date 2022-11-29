package ai;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class by2<K, V> extends sy2<K, V> implements o03<K, V> {
    public by2(Map<K, Collection<V>> map) {
        super(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ai.sy2
    public final <E> Collection<E> j(Collection<E> collection) {
        return Collections.unmodifiableList(collection);
    }

    @Override // ai.sy2
    public final Collection<V> k(K k10, Collection<V> collection) {
        return q(k10, (List) collection, null);
    }
}
