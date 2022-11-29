package ai;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class vz2<K, V> extends ty2<K, V> implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public final K f11423w;

    /* renamed from: x  reason: collision with root package name */
    public final V f11424x;

    public vz2(K k10, V v10) {
        this.f11423w = k10;
        this.f11424x = v10;
    }

    @Override // ai.ty2, java.util.Map.Entry
    public final K getKey() {
        return this.f11423w;
    }

    @Override // ai.ty2, java.util.Map.Entry
    public final V getValue() {
        return this.f11424x;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
