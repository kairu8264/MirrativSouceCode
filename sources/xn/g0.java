package xn;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class g0<T> implements Iterable<f0<? extends T>>, ko.a {

    /* renamed from: w  reason: collision with root package name */
    public final io.a<Iterator<T>> f60444w;

    /* JADX WARN: Multi-variable type inference failed */
    public g0(io.a<? extends Iterator<? extends T>> aVar) {
        jo.p.h(aVar, "iteratorFactory");
        this.f60444w = aVar;
    }

    @Override // java.lang.Iterable
    public Iterator<f0<T>> iterator() {
        return new h0(this.f60444w.invoke());
    }
}
