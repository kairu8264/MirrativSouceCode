package ai;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes3.dex */
public final class yi3<F, T> extends AbstractList<T> {

    /* renamed from: w  reason: collision with root package name */
    public final List<F> f12625w;

    /* renamed from: x  reason: collision with root package name */
    public final xi3<F, T> f12626x;

    public yi3(List<F> list, xi3<F, T> xi3Var) {
        this.f12625w = list;
        this.f12626x = xi3Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i10) {
        T t10 = (T) mo.a(((Integer) this.f12625w.get(i10)).intValue());
        return t10 == null ? (T) mo.AD_FORMAT_TYPE_UNSPECIFIED : t10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12625w.size();
    }
}
