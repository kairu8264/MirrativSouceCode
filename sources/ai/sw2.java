package ai;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class sw2<T> implements Iterator<T> {

    /* renamed from: w  reason: collision with root package name */
    public T f10010w;

    /* renamed from: x  reason: collision with root package name */
    public int f10011x = 2;

    public abstract T a();

    public final T b() {
        this.f10011x = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f10011x;
        if (i10 != 4) {
            int i11 = i10 - 1;
            if (i10 != 0) {
                if (i11 != 0) {
                    if (i11 != 2) {
                        this.f10011x = 4;
                        this.f10010w = a();
                        if (this.f10011x != 3) {
                            this.f10011x = 1;
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            throw null;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f10011x = 2;
            T t10 = this.f10010w;
            this.f10010w = null;
            return t10;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
