package lk;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public abstract class c<K, V> extends d<K, V> implements y<K, V> {
    public c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // lk.d, lk.e0
    /* renamed from: B */
    public List<V> get(@NullableDecl K k10) {
        return (List) super.get(k10);
    }

    @Override // lk.f, lk.e0
    public Map<K, Collection<V>> b() {
        return super.b();
    }

    @Override // lk.f
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // lk.d, lk.e0
    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k10, @NullableDecl V v10) {
        return super.put(k10, v10);
    }

    @Override // lk.d
    public <E> Collection<E> y(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // lk.d
    public Collection<V> z(K k10, Collection<V> collection) {
        return A(k10, (List) collection, null);
    }
}
