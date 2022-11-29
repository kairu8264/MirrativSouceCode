package yn;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import jo.p;
import xn.c;
import xn.f;
import xn.k;
import xn.n;

/* loaded from: classes4.dex */
public final class a<E> extends f<E> implements RandomAccess, Serializable {
    public final a<E> A;
    public final a<E> B;

    /* renamed from: w  reason: collision with root package name */
    public E[] f62069w;

    /* renamed from: x  reason: collision with root package name */
    public int f62070x;

    /* renamed from: y  reason: collision with root package name */
    public int f62071y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f62072z;

    /* renamed from: yn.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C1063a<E> implements ListIterator<E>, ko.a {

        /* renamed from: w  reason: collision with root package name */
        public final a<E> f62073w;

        /* renamed from: x  reason: collision with root package name */
        public int f62074x;

        /* renamed from: y  reason: collision with root package name */
        public int f62075y;

        public C1063a(a<E> aVar, int i10) {
            p.h(aVar, "list");
            this.f62073w = aVar;
            this.f62074x = i10;
            this.f62075y = -1;
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            a<E> aVar = this.f62073w;
            int i10 = this.f62074x;
            this.f62074x = i10 + 1;
            aVar.add(i10, e10);
            this.f62075y = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f62074x < this.f62073w.f62071y;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f62074x > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            if (this.f62074x < this.f62073w.f62071y) {
                int i10 = this.f62074x;
                this.f62074x = i10 + 1;
                this.f62075y = i10;
                return (E) this.f62073w.f62069w[this.f62073w.f62070x + this.f62075y];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f62074x;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i10 = this.f62074x;
            if (i10 > 0) {
                int i11 = i10 - 1;
                this.f62074x = i11;
                this.f62075y = i11;
                return (E) this.f62073w.f62069w[this.f62073w.f62070x + this.f62075y];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f62074x - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.f62075y;
            if (i10 != -1) {
                this.f62073w.remove(i10);
                this.f62074x = this.f62075y;
                this.f62075y = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            int i10 = this.f62075y;
            if (i10 != -1) {
                this.f62073w.set(i10, e10);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    public a(E[] eArr, int i10, int i11, boolean z10, a<E> aVar, a<E> aVar2) {
        this.f62069w = eArr;
        this.f62070x = i10;
        this.f62071y = i11;
        this.f62072z = z10;
        this.A = aVar;
        this.B = aVar2;
    }

    public final E A(int i10) {
        a<E> aVar = this.A;
        if (aVar != null) {
            this.f62071y--;
            return aVar.A(i10);
        }
        E[] eArr = this.f62069w;
        E e10 = eArr[i10];
        n.i(eArr, eArr, i10, i10 + 1, this.f62070x + this.f62071y);
        b.f(this.f62069w, (this.f62070x + this.f62071y) - 1);
        this.f62071y--;
        return e10;
    }

    public final void B(int i10, int i11) {
        a<E> aVar = this.A;
        if (aVar != null) {
            aVar.B(i10, i11);
        } else {
            E[] eArr = this.f62069w;
            n.i(eArr, eArr, i10, i10 + i11, this.f62071y);
            E[] eArr2 = this.f62069w;
            int i12 = this.f62071y;
            b.g(eArr2, i12 - i11, i12);
        }
        this.f62071y -= i11;
    }

    public final int D(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        a<E> aVar = this.A;
        if (aVar != null) {
            int D = aVar.D(i10, i11, collection, z10);
            this.f62071y -= D;
            return D;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f62069w[i14]) == z10) {
                E[] eArr = this.f62069w;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.f62069w;
        n.i(eArr2, eArr2, i10 + i13, i11 + i10, this.f62071y);
        E[] eArr3 = this.f62069w;
        int i16 = this.f62071y;
        b.g(eArr3, i16 - i15, i16);
        this.f62071y -= i15;
        return i15;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        s();
        p(this.f62070x + this.f62071y, e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        p.h(collection, "elements");
        s();
        int size = collection.size();
        m(this.f62070x + this.f62071y, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        s();
        B(this.f62070x, this.f62071y);
    }

    @Override // xn.f
    public int d() {
        return this.f62071y;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && t((List) obj));
    }

    @Override // xn.f
    public E f(int i10) {
        s();
        c.f60430w.b(i10, this.f62071y);
        return A(this.f62070x + i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        c.f60430w.b(i10, this.f62071y);
        return this.f62069w[this.f62070x + i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return b.b(this.f62069w, this.f62070x, this.f62071y);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f62071y; i10++) {
            if (p.c(this.f62069w[this.f62070x + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f62071y == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new C1063a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f62071y - 1; i10 >= 0; i10--) {
            if (p.c(this.f62069w[this.f62070x + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new C1063a(this, 0);
    }

    public final void m(int i10, Collection<? extends E> collection, int i11) {
        a<E> aVar = this.A;
        if (aVar != null) {
            aVar.m(i10, collection, i11);
            this.f62069w = this.A.f62069w;
            this.f62071y += i11;
            return;
        }
        x(i10, i11);
        Iterator<? extends E> it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f62069w[i10 + i12] = it.next();
        }
    }

    public final void p(int i10, E e10) {
        a<E> aVar = this.A;
        if (aVar != null) {
            aVar.p(i10, e10);
            this.f62069w = this.A.f62069w;
            this.f62071y++;
            return;
        }
        x(i10, 1);
        this.f62069w[i10] = e10;
    }

    public final List<E> r() {
        if (this.A == null) {
            s();
            this.f62072z = true;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        s();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        p.h(collection, "elements");
        s();
        return D(this.f62070x, this.f62071y, collection, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        p.h(collection, "elements");
        s();
        return D(this.f62070x, this.f62071y, collection, true) > 0;
    }

    public final void s() {
        if (y()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        s();
        c.f60430w.b(i10, this.f62071y);
        E[] eArr = this.f62069w;
        int i11 = this.f62070x;
        E e11 = eArr[i11 + i10];
        eArr[i11 + i10] = e10;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i10, int i11) {
        c.f60430w.d(i10, i11, this.f62071y);
        E[] eArr = this.f62069w;
        int i12 = this.f62070x + i10;
        int i13 = i11 - i10;
        boolean z10 = this.f62072z;
        a<E> aVar = this.B;
        return new a(eArr, i12, i13, z10, this, aVar == null ? this : aVar);
    }

    public final boolean t(List<?> list) {
        return b.a(this.f62069w, this.f62070x, this.f62071y, list);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        p.h(tArr, "destination");
        int length = tArr.length;
        int i10 = this.f62071y;
        if (length < i10) {
            E[] eArr = this.f62069w;
            int i11 = this.f62070x;
            T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, i11, i10 + i11, tArr.getClass());
            p.g(tArr2, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr2;
        }
        E[] eArr2 = this.f62069w;
        p.f(eArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilder.toArray>");
        int i12 = this.f62070x;
        n.i(eArr2, tArr, 0, i12, this.f62071y + i12);
        int length2 = tArr.length;
        int i13 = this.f62071y;
        if (length2 > i13) {
            tArr[i13] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return b.c(this.f62069w, this.f62070x, this.f62071y);
    }

    public final void u(int i10) {
        if (this.A != null) {
            throw new IllegalStateException();
        }
        if (i10 >= 0) {
            E[] eArr = this.f62069w;
            if (i10 > eArr.length) {
                this.f62069w = (E[]) b.e(this.f62069w, k.f60450z.a(eArr.length, i10));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    public final void w(int i10) {
        u(this.f62071y + i10);
    }

    public final void x(int i10, int i11) {
        w(i11);
        E[] eArr = this.f62069w;
        n.i(eArr, eArr, i10 + i11, i10, this.f62070x + this.f62071y);
        this.f62071y += i11;
    }

    public final boolean y() {
        a<E> aVar;
        return this.f62072z || ((aVar = this.B) != null && aVar.f62072z);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i10) {
        c.f60430w.c(i10, this.f62071y);
        return new C1063a(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        s();
        c.f60430w.c(i10, this.f62071y);
        p(this.f62070x + i10, e10);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        p.h(collection, "elements");
        s();
        c.f60430w.c(i10, this.f62071y);
        int size = collection.size();
        m(this.f62070x + i10, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        E[] eArr = this.f62069w;
        int i10 = this.f62070x;
        Object[] p10 = n.p(eArr, i10, this.f62071y + i10);
        p.f(p10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return p10;
    }

    public a() {
        this(10);
    }

    public a(int i10) {
        this(b.d(i10), 0, 0, false, null, null);
    }
}
