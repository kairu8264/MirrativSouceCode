package lk;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public interface e0<K, V> {
    Collection<Map.Entry<K, V>> a();

    Map<K, Collection<V>> b();

    boolean c(@NullableDecl @CompatibleWith("K") Object obj, @NullableDecl @CompatibleWith("V") Object obj2);

    void clear();

    Collection<V> get(@NullableDecl K k10);

    @CanIgnoreReturnValue
    boolean put(@NullableDecl K k10, @NullableDecl V v10);

    @CanIgnoreReturnValue
    boolean remove(@NullableDecl @CompatibleWith("K") Object obj, @NullableDecl @CompatibleWith("V") Object obj2);

    int size();

    Collection<V> values();
}
