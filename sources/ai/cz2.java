package ai;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class cz2<T> implements Iterator<T> {

    /* renamed from: w  reason: collision with root package name */
    public int f3083w;

    /* renamed from: x  reason: collision with root package name */
    public int f3084x;

    /* renamed from: y  reason: collision with root package name */
    public int f3085y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ hz2 f3086z;

    public /* synthetic */ cz2(hz2 hz2Var, fz2 fz2Var) {
        int i10;
        this.f3086z = hz2Var;
        i10 = hz2Var.A;
        this.f3083w = i10;
        this.f3084x = hz2Var.u();
        this.f3085y = -1;
    }

    public abstract T a(int i10);

    public final void b() {
        int i10;
        i10 = this.f3086z.A;
        if (i10 != this.f3083w) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3084x >= 0;
    }

    @Override // java.util.Iterator
    public final T next() {
        b();
        if (hasNext()) {
            int i10 = this.f3084x;
            this.f3085y = i10;
            T a10 = a(i10);
            this.f3084x = this.f3086z.v(this.f3084x);
            return a10;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        lx2.b(this.f3085y >= 0, "no calls to next() since the last call to remove()");
        this.f3083w += 32;
        hz2 hz2Var = this.f3086z;
        hz2Var.remove(hz2.A(hz2Var, this.f3085y));
        this.f3084x--;
        this.f3085y = -1;
    }
}
