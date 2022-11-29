package v0;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class b0<K, V> extends z<K, V> implements Iterator<V>, ko.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(u<K, V> uVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(uVar, it);
        jo.p.h(uVar, "map");
        jo.p.h(it, "iterator");
    }

    @Override // java.util.Iterator
    public V next() {
        Map.Entry<K, V> h10 = h();
        if (h10 != null) {
            e();
            return h10.getValue();
        }
        throw new IllegalStateException();
    }
}
