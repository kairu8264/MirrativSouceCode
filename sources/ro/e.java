package ro;

import java.util.Iterator;
import java.util.NoSuchElementException;
import jo.p;

/* loaded from: classes4.dex */
public final class e<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final g<T> f51612a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f51613b;

    /* renamed from: c  reason: collision with root package name */
    public final io.l<T, Boolean> f51614c;

    /* loaded from: classes4.dex */
    public static final class a implements Iterator<T>, ko.a {

        /* renamed from: w  reason: collision with root package name */
        public final Iterator<T> f51615w;

        /* renamed from: x  reason: collision with root package name */
        public int f51616x = -1;

        /* renamed from: y  reason: collision with root package name */
        public T f51617y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ e<T> f51618z;

        public a(e<T> eVar) {
            this.f51618z = eVar;
            this.f51615w = eVar.f51612a.iterator();
        }

        public final void b() {
            while (this.f51615w.hasNext()) {
                T next = this.f51615w.next();
                if (((Boolean) this.f51618z.f51614c.invoke(next)).booleanValue() == this.f51618z.f51613b) {
                    this.f51617y = next;
                    this.f51616x = 1;
                    return;
                }
            }
            this.f51616x = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f51616x == -1) {
                b();
            }
            return this.f51616x == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f51616x == -1) {
                b();
            }
            if (this.f51616x != 0) {
                T t10 = this.f51617y;
                this.f51617y = null;
                this.f51616x = -1;
                return t10;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(g<? extends T> gVar, boolean z10, io.l<? super T, Boolean> lVar) {
        p.h(gVar, "sequence");
        p.h(lVar, "predicate");
        this.f51612a = gVar;
        this.f51613b = z10;
        this.f51614c = lVar;
    }

    @Override // ro.g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
