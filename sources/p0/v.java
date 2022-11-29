package p0;

import java.util.Map;

/* loaded from: classes.dex */
public final class v<K, V> extends u<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    /* renamed from: p */
    public Map.Entry<K, V> next() {
        r0.a.a(g());
        o(f() + 2);
        return new b(e()[f() - 2], e()[f() - 1]);
    }
}
