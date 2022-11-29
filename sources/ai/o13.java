package ai;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class o13<K, V> extends j03<Map.Entry<K, V>> {
    public final transient int A;

    /* renamed from: y  reason: collision with root package name */
    public final transient d03<K, V> f7608y;

    /* renamed from: z  reason: collision with root package name */
    public final transient Object[] f7609z;

    public o13(d03<K, V> d03Var, Object[] objArr, int i10, int i11) {
        this.f7608y = d03Var;
        this.f7609z = objArr;
        this.A = i11;
    }

    @Override // ai.uz2, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f7608y.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // ai.j03, ai.uz2
    public final b23<Map.Entry<K, V>> d() {
        return k().listIterator(0);
    }

    @Override // ai.j03, ai.uz2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }

    @Override // ai.uz2
    public final int m(Object[] objArr, int i10) {
        return k().m(objArr, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A;
    }

    @Override // ai.j03
    public final zz2<Map.Entry<K, V>> x() {
        return new n13(this);
    }
}
