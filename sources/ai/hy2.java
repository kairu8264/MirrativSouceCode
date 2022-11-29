package ai;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class hy2 implements Iterator {

    /* renamed from: w  reason: collision with root package name */
    public Map.Entry f5040w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Iterator f5041x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ iy2 f5042y;

    public hy2(iy2 iy2Var, Iterator it) {
        this.f5042y = iy2Var;
        this.f5041x = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5041x.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f5041x.next();
        this.f5040w = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        lx2.b(this.f5040w != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f5040w.getValue();
        this.f5041x.remove();
        sy2 sy2Var = this.f5042y.f5448x;
        i10 = sy2Var.A;
        sy2Var.A = i10 - collection.size();
        collection.clear();
        this.f5040w = null;
    }
}
