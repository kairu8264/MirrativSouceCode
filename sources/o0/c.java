package o0;

import java.util.NoSuchElementException;
import jo.p;

/* loaded from: classes.dex */
public final class c<T> extends a<T> {

    /* renamed from: y  reason: collision with root package name */
    public final T[] f43777y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(T[] tArr, int i10, int i11) {
        super(i10, i11);
        p.h(tArr, "buffer");
        this.f43777y = tArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        if (hasNext()) {
            T[] tArr = this.f43777y;
            int e10 = e();
            g(e10 + 1);
            return tArr[e10];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public T previous() {
        if (hasPrevious()) {
            T[] tArr = this.f43777y;
            g(e() - 1);
            return tArr[e()];
        }
        throw new NoSuchElementException();
    }
}
