package ro;

import java.util.Iterator;
import java.util.NoSuchElementException;
import jo.p;

/* loaded from: classes4.dex */
public final class f<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final io.a<T> f51619a;

    /* renamed from: b  reason: collision with root package name */
    public final io.l<T, T> f51620b;

    /* loaded from: classes4.dex */
    public static final class a implements Iterator<T>, ko.a {

        /* renamed from: w  reason: collision with root package name */
        public T f51621w;

        /* renamed from: x  reason: collision with root package name */
        public int f51622x = -2;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f<T> f51623y;

        public a(f<T> fVar) {
            this.f51623y = fVar;
        }

        public final void b() {
            T t10;
            if (this.f51622x == -2) {
                t10 = (T) this.f51623y.f51619a.invoke();
            } else {
                io.l lVar = this.f51623y.f51620b;
                T t11 = this.f51621w;
                p.e(t11);
                t10 = (T) lVar.invoke(t11);
            }
            this.f51621w = t10;
            this.f51622x = t10 == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f51622x < 0) {
                b();
            }
            return this.f51622x == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f51622x < 0) {
                b();
            }
            if (this.f51622x != 0) {
                T t10 = this.f51621w;
                p.f(t10, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f51622x = -1;
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
    public f(io.a<? extends T> aVar, io.l<? super T, ? extends T> lVar) {
        p.h(aVar, "getInitialValue");
        p.h(lVar, "getNextValue");
        this.f51619a = aVar;
        this.f51620b = lVar;
    }

    @Override // ro.g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
