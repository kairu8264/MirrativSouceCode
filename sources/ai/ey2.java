package ai;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ey2 implements Iterator<Map.Entry> {

    /* renamed from: w  reason: collision with root package name */
    public final Iterator<Map.Entry> f3821w;

    /* renamed from: x  reason: collision with root package name */
    public Collection f3822x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ fy2 f3823y;

    public ey2(fy2 fy2Var) {
        this.f3823y = fy2Var;
        this.f3821w = fy2Var.f4251y.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3821w.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        Map.Entry next = this.f3821w.next();
        this.f3822x = (Collection) next.getValue();
        return this.f3823y.e(next);
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        lx2.b(this.f3822x != null, "no calls to next() since the last call to remove()");
        this.f3821w.remove();
        sy2 sy2Var = this.f3823y.f4252z;
        i10 = sy2Var.A;
        sy2Var.A = i10 - this.f3822x.size();
        this.f3822x.clear();
        this.f3822x = null;
    }
}
