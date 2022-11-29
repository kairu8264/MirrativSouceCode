package xn;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class i0 implements Iterator<Integer>, ko.a {
    public abstract int b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
