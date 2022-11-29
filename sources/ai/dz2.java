package ai;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class dz2 extends AbstractSet {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ hz2 f3468w;

    public dz2(hz2 hz2Var) {
        this.f3468w = hz2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f3468w.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f3468w.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        hz2 hz2Var = this.f3468w;
        Map o10 = hz2Var.o();
        if (o10 != null) {
            return o10.keySet().iterator();
        }
        return new yy2(hz2Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object H;
        Object obj2;
        Map o10 = this.f3468w.o();
        if (o10 != null) {
            return o10.keySet().remove(obj);
        }
        H = this.f3468w.H(obj);
        obj2 = hz2.F;
        return H != obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3468w.size();
    }
}
