package s1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final class f<T> implements List<T>, ko.a {

    /* renamed from: w  reason: collision with root package name */
    public Object[] f51841w = new Object[16];

    /* renamed from: x  reason: collision with root package name */
    public long[] f51842x = new long[16];

    /* renamed from: y  reason: collision with root package name */
    public int f51843y = -1;

    /* renamed from: z  reason: collision with root package name */
    public int f51844z;

    /* loaded from: classes.dex */
    public final class b implements List<T>, ko.a {

        /* renamed from: w  reason: collision with root package name */
        public final int f51849w;

        /* renamed from: x  reason: collision with root package name */
        public final int f51850x;

        public b(int i10, int i11) {
            this.f51849w = i10;
            this.f51850x = i11;
        }

        @Override // java.util.List
        public void add(int i10, T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return indexOf(obj) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            jo.p.h(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int d() {
            return this.f51850x - this.f51849w;
        }

        @Override // java.util.List
        public T get(int i10) {
            return (T) f.this.f51841w[i10 + this.f51849w];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i10 = this.f51849w;
            int i11 = this.f51850x;
            if (i10 <= i11) {
                while (!jo.p.c(f.this.f51841w[i10], obj)) {
                    if (i10 == i11) {
                        return -1;
                    }
                    i10++;
                }
                return i10 - this.f51849w;
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            f<T> fVar = f.this;
            int i10 = this.f51849w;
            return new a(i10, i10, this.f51850x);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i10 = this.f51850x;
            int i11 = this.f51849w;
            if (i11 <= i10) {
                while (!jo.p.c(f.this.f51841w[i10], obj)) {
                    if (i10 == i11) {
                        return -1;
                    }
                    i10--;
                }
                return i10 - this.f51849w;
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            f<T> fVar = f.this;
            int i10 = this.f51849w;
            return new a(i10, i10, this.f51850x);
        }

        @Override // java.util.List
        public T remove(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<T> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public T set(int i10, T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return d();
        }

        @Override // java.util.List
        public void sort(Comparator<? super T> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List<T> subList(int i10, int i11) {
            f<T> fVar = f.this;
            int i12 = this.f51849w;
            return new b(i10 + i12, i12 + i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return jo.g.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            jo.p.h(tArr, "array");
            return (T[]) jo.g.b(this, tArr);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i10) {
            f<T> fVar = f.this;
            int i11 = this.f51849w;
            return new a(i10 + i11, i11, this.f51850x);
        }
    }

    @Override // java.util.List
    public void add(int i10, T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f51843y = -1;
        w();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        jo.p.h(collection, "elements");
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        this.f51843y = size() - 1;
    }

    @Override // java.util.List
    public T get(int i10) {
        return (T) this.f51841w[i10];
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int l10 = xn.s.l(this);
        if (l10 >= 0) {
            int i10 = 0;
            while (!jo.p.c(this.f51841w[i10], obj)) {
                if (i10 == l10) {
                    return -1;
                }
                i10++;
            }
            return i10;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    public final void k() {
        int i10 = this.f51843y;
        Object[] objArr = this.f51841w;
        if (i10 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            jo.p.g(copyOf, "copyOf(this, newSize)");
            this.f51841w = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f51842x, length);
            jo.p.g(copyOf2, "copyOf(this, newSize)");
            this.f51842x = copyOf2;
        }
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        for (int l10 = xn.s.l(this); -1 < l10; l10--) {
            if (jo.p.c(this.f51841w[l10], obj)) {
                return l10;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    public final long m() {
        long a10;
        a10 = g.a(Float.POSITIVE_INFINITY, false);
        int i10 = this.f51843y + 1;
        int l10 = xn.s.l(this);
        if (i10 <= l10) {
            while (true) {
                long b10 = c.b(this.f51842x[i10]);
                if (c.a(b10, a10) < 0) {
                    a10 = b10;
                }
                if (c.c(a10) < 0.0f && c.d(a10)) {
                    return a10;
                }
                if (i10 == l10) {
                    break;
                }
                i10++;
            }
        }
        return a10;
    }

    public int p() {
        return this.f51844z;
    }

    public final boolean r() {
        long m10 = m();
        return c.c(m10) < 0.0f && c.d(m10);
    }

    @Override // java.util.List
    public T remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void s(T t10, boolean z10, io.a<wn.v> aVar) {
        jo.p.h(aVar, "childHitTest");
        t(t10, -1.0f, z10, aVar);
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return p();
    }

    @Override // java.util.List
    public void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<T> subList(int i10, int i11) {
        return new b(i10, i11);
    }

    public final void t(T t10, float f10, boolean z10, io.a<wn.v> aVar) {
        long a10;
        jo.p.h(aVar, "childHitTest");
        int i10 = this.f51843y;
        this.f51843y = i10 + 1;
        k();
        Object[] objArr = this.f51841w;
        int i11 = this.f51843y;
        objArr[i11] = t10;
        long[] jArr = this.f51842x;
        a10 = g.a(f10, z10);
        jArr[i11] = a10;
        w();
        aVar.invoke();
        this.f51843y = i10;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return jo.g.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        jo.p.h(tArr, "array");
        return (T[]) jo.g.b(this, tArr);
    }

    public final boolean u(float f10, boolean z10) {
        long a10;
        if (this.f51843y == xn.s.l(this)) {
            return true;
        }
        a10 = g.a(f10, z10);
        return c.a(m(), a10) > 0;
    }

    public final void w() {
        int i10 = this.f51843y + 1;
        int l10 = xn.s.l(this);
        if (i10 <= l10) {
            while (true) {
                this.f51841w[i10] = null;
                if (i10 == l10) {
                    break;
                }
                i10++;
            }
        }
        this.f51844z = this.f51843y + 1;
    }

    public final void x(T t10, float f10, boolean z10, io.a<wn.v> aVar) {
        jo.p.h(aVar, "childHitTest");
        if (this.f51843y == xn.s.l(this)) {
            t(t10, f10, z10, aVar);
            if (this.f51843y + 1 == xn.s.l(this)) {
                w();
                return;
            }
            return;
        }
        long m10 = m();
        int i10 = this.f51843y;
        this.f51843y = xn.s.l(this);
        t(t10, f10, z10, aVar);
        if (this.f51843y + 1 < xn.s.l(this) && c.a(m10, m()) > 0) {
            int i11 = this.f51843y + 1;
            int i12 = i10 + 1;
            Object[] objArr = this.f51841w;
            xn.n.i(objArr, objArr, i12, i11, size());
            long[] jArr = this.f51842x;
            xn.n.h(jArr, jArr, i12, i11, size());
            this.f51843y = ((size() + i10) - this.f51843y) - 1;
        }
        w();
        this.f51843y = i10;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i10) {
        return new a(this, i10, 0, 0, 6, null);
    }

    /* loaded from: classes.dex */
    public final class a implements ListIterator<T>, ko.a {

        /* renamed from: w  reason: collision with root package name */
        public int f51845w;

        /* renamed from: x  reason: collision with root package name */
        public final int f51846x;

        /* renamed from: y  reason: collision with root package name */
        public final int f51847y;

        public a(int i10, int i11, int i12) {
            this.f51845w = i10;
            this.f51846x = i11;
            this.f51847y = i12;
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f51845w < this.f51847y;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f51845w > this.f51846x;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            Object[] objArr = f.this.f51841w;
            int i10 = this.f51845w;
            this.f51845w = i10 + 1;
            return (T) objArr[i10];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f51845w - this.f51846x;
        }

        @Override // java.util.ListIterator
        public T previous() {
            Object[] objArr = f.this.f51841w;
            int i10 = this.f51845w - 1;
            this.f51845w = i10;
            return (T) objArr[i10];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.f51845w - this.f51846x) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ a(f fVar, int i10, int i11, int i12, int i13, jo.h hVar) {
            this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? fVar.size() : i12);
        }
    }
}
