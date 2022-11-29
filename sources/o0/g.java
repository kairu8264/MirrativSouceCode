package o0;

import jo.p;
import po.n;

/* loaded from: classes.dex */
public final class g<T> extends a<T> {

    /* renamed from: y  reason: collision with root package name */
    public final T[] f43787y;

    /* renamed from: z  reason: collision with root package name */
    public final k<T> f43788z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Object[] objArr, T[] tArr, int i10, int i11, int i12) {
        super(i10, i11);
        p.h(objArr, "root");
        p.h(tArr, "tail");
        this.f43787y = tArr;
        int d10 = l.d(i11);
        this.f43788z = new k<>(objArr, n.i(i10, d10), d10, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        b();
        if (this.f43788z.hasNext()) {
            g(e() + 1);
            return this.f43788z.next();
        }
        T[] tArr = this.f43787y;
        int e10 = e();
        g(e10 + 1);
        return tArr[e10 - this.f43788z.f()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        d();
        if (e() > this.f43788z.f()) {
            T[] tArr = this.f43787y;
            g(e() - 1);
            return tArr[e() - this.f43788z.f()];
        }
        g(e() - 1);
        return this.f43788z.previous();
    }
}
