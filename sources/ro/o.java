package ro;

import java.util.Iterator;
import jo.p;

/* loaded from: classes4.dex */
public final class o<T, R> implements g<R> {

    /* renamed from: a  reason: collision with root package name */
    public final g<T> f51634a;

    /* renamed from: b  reason: collision with root package name */
    public final io.l<T, R> f51635b;

    /* loaded from: classes4.dex */
    public static final class a implements Iterator<R>, ko.a {

        /* renamed from: w  reason: collision with root package name */
        public final Iterator<T> f51636w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ o<T, R> f51637x;

        public a(o<T, R> oVar) {
            this.f51637x = oVar;
            this.f51636w = oVar.f51634a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f51636w.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) this.f51637x.f51635b.invoke(this.f51636w.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(g<? extends T> gVar, io.l<? super T, ? extends R> lVar) {
        p.h(gVar, "sequence");
        p.h(lVar, "transformer");
        this.f51634a = gVar;
        this.f51635b = lVar;
    }

    @Override // ro.g
    public Iterator<R> iterator() {
        return new a(this);
    }
}
