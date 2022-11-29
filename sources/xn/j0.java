package xn;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class j0 implements Iterator<Long>, ko.a {
    public abstract long b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
