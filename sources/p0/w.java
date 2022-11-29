package p0;

/* loaded from: classes.dex */
public final class w<K, V> extends u<K, V, K> {
    @Override // java.util.Iterator
    public K next() {
        r0.a.a(g());
        o(f() + 2);
        return (K) e()[f() - 2];
    }
}
