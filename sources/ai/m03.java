package ai;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public enum m03 implements Iterator<Object> {
    INSTANCE;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        lx2.b(false, "no calls to next() since the last call to remove()");
    }
}
