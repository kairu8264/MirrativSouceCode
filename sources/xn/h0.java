package xn;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class h0<T> implements Iterator<f0<? extends T>>, ko.a {

    /* renamed from: w  reason: collision with root package name */
    public final Iterator<T> f60445w;

    /* renamed from: x  reason: collision with root package name */
    public int f60446x;

    /* JADX WARN: Multi-variable type inference failed */
    public h0(Iterator<? extends T> it) {
        jo.p.h(it, "iterator");
        this.f60445w = it;
    }

    @Override // java.util.Iterator
    /* renamed from: b */
    public final f0<T> next() {
        int i10 = this.f60446x;
        this.f60446x = i10 + 1;
        if (i10 < 0) {
            s.t();
        }
        return new f0<>(i10, this.f60445w.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f60445w.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
