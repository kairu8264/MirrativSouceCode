package lk;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public class q<K, V> extends e<K, V> implements Serializable {
    @NullableDecl

    /* renamed from: w  reason: collision with root package name */
    public final K f40345w;
    @NullableDecl

    /* renamed from: x  reason: collision with root package name */
    public final V f40346x;

    public q(@NullableDecl K k10, @NullableDecl V v10) {
        this.f40345w = k10;
        this.f40346x = v10;
    }

    @Override // lk.e, java.util.Map.Entry
    @NullableDecl
    public final K getKey() {
        return this.f40345w;
    }

    @Override // lk.e, java.util.Map.Entry
    @NullableDecl
    public final V getValue() {
        return this.f40346x;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
