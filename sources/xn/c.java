package xn;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public abstract class c<E> extends xn.a<E> implements List<E> {

    /* renamed from: w  reason: collision with root package name */
    public static final a f60430w = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final void a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("startIndex: " + i10 + ", endIndex: " + i11 + ", size: " + i12);
            } else if (i10 <= i11) {
            } else {
                throw new IllegalArgumentException("startIndex: " + i10 + " > endIndex: " + i11);
            }
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void c(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void d(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            } else if (i10 <= i11) {
            } else {
                throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
            }
        }

        public final boolean e(Collection<?> collection, Collection<?> collection2) {
            jo.p.h(collection, "c");
            jo.p.h(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!jo.p.c(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int f(Collection<?> collection) {
            jo.p.h(collection, "c");
            Iterator<?> it = collection.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i10 = (i10 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i10;
        }
    }

    /* loaded from: classes4.dex */
    public class b implements Iterator<E>, ko.a {

        /* renamed from: w  reason: collision with root package name */
        public int f60431w;

        public b() {
        }

        public final int b() {
            return this.f60431w;
        }

        public final void d(int i10) {
            this.f60431w = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f60431w < c.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                c<E> cVar = c.this;
                int i10 = this.f60431w;
                this.f60431w = i10 + 1;
                return cVar.get(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: xn.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C1013c extends c<E>.b implements ListIterator<E> {
        public C1013c(int i10) {
            super();
            c.f60430w.c(i10, c.this.size());
            d(i10);
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return b() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return b();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (hasPrevious()) {
                c<E> cVar = c.this;
                d(b() - 1);
                return cVar.get(b());
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return b() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* loaded from: classes4.dex */
    public static final class d<E> extends c<E> implements RandomAccess {

        /* renamed from: x  reason: collision with root package name */
        public final c<E> f60434x;

        /* renamed from: y  reason: collision with root package name */
        public final int f60435y;

        /* renamed from: z  reason: collision with root package name */
        public int f60436z;

        /* JADX WARN: Multi-variable type inference failed */
        public d(c<? extends E> cVar, int i10, int i11) {
            jo.p.h(cVar, "list");
            this.f60434x = cVar;
            this.f60435y = i10;
            c.f60430w.d(i10, i11, cVar.size());
            this.f60436z = i11 - i10;
        }

        @Override // xn.a
        public int d() {
            return this.f60436z;
        }

        @Override // xn.c, java.util.List
        public E get(int i10) {
            c.f60430w.b(i10, this.f60436z);
            return this.f60434x.get(this.f60435y + i10);
        }
    }

    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f60430w.e(this, (Collection) obj);
        }
        return false;
    }

    public abstract E get(int i10);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f60430w.f(this);
    }

    public int indexOf(E e10) {
        int i10 = 0;
        for (E e11 : this) {
            if (jo.p.c(e11, e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e10) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (jo.p.c(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C1013c(0);
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }

    public ListIterator<E> listIterator(int i10) {
        return new C1013c(i10);
    }
}
