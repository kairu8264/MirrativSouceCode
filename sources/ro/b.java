package ro;

import java.util.Iterator;
import jo.p;

/* loaded from: classes4.dex */
public final class b<T> implements g<T>, c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final g<T> f51607a;

    /* renamed from: b  reason: collision with root package name */
    public final int f51608b;

    /* loaded from: classes4.dex */
    public static final class a implements Iterator<T>, ko.a {

        /* renamed from: w  reason: collision with root package name */
        public final Iterator<T> f51609w;

        /* renamed from: x  reason: collision with root package name */
        public int f51610x;

        public a(b<T> bVar) {
            this.f51609w = bVar.f51607a.iterator();
            this.f51610x = bVar.f51608b;
        }

        public final void b() {
            while (this.f51610x > 0 && this.f51609w.hasNext()) {
                this.f51609w.next();
                this.f51610x--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            return this.f51609w.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            b();
            return this.f51609w.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(g<? extends T> gVar, int i10) {
        p.h(gVar, "sequence");
        this.f51607a = gVar;
        this.f51608b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // ro.c
    public g<T> a(int i10) {
        int i11 = this.f51608b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f51607a, i11);
    }

    @Override // ro.g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
