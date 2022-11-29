package ai;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class gn3 implements Iterator {

    /* renamed from: w  reason: collision with root package name */
    public int f4524w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ hn3 f4525x;

    public gn3(hn3 hn3Var) {
        this.f4525x = hn3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4524w < this.f4525x.f4907w.size() || this.f4525x.f4908x.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4524w < this.f4525x.f4907w.size()) {
            List<E> list = this.f4525x.f4907w;
            int i10 = this.f4524w;
            this.f4524w = i10 + 1;
            return list.get(i10);
        }
        hn3 hn3Var = this.f4525x;
        hn3Var.f4907w.add(hn3Var.f4908x.next());
        return next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
