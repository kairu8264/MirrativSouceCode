package ai;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class iy2 extends u03 {

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ sy2 f5448x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy2(sy2 sy2Var, Map map) {
        super(map);
        this.f5448x = sy2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        n03.b(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.f10543w.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f10543w.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f10543w.keySet().hashCode();
    }

    @Override // ai.u03, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new hy2(this, this.f10543w.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i10;
        Collection collection = (Collection) this.f10543w.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            sy2 sy2Var = this.f5448x;
            i10 = sy2Var.A;
            sy2Var.A = i10 - size;
            return size > 0;
        }
        return false;
    }
}
