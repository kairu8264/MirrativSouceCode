package xn;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class q implements Iterator<Character>, ko.a {
    public abstract char b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
