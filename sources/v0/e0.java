package v0;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import xn.i0;

/* loaded from: classes.dex */
public final class e0<T> implements List<T>, ko.d {

    /* renamed from: w  reason: collision with root package name */
    public final s<T> f56465w;

    /* renamed from: x  reason: collision with root package name */
    public final int f56466x;

    /* renamed from: y  reason: collision with root package name */
    public int f56467y;

    /* renamed from: z  reason: collision with root package name */
    public int f56468z;

    /* loaded from: classes.dex */
    public static final class a implements ListIterator<T>, ko.a {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ jo.c0 f56469w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ e0<T> f56470x;

        public a(jo.c0 c0Var, e0<T> e0Var) {
            this.f56469w = c0Var;
            this.f56470x = e0Var;
        }

        @Override // java.util.ListIterator
        /* renamed from: b */
        public Void add(T t10) {
            t.d();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: d */
        public Void remove() {
            t.d();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator
        /* renamed from: e */
        public Void set(T t10) {
            t.d();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f56469w.f38129w < this.f56470x.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f56469w.f38129w >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            int i10 = this.f56469w.f38129w + 1;
            t.e(i10, this.f56470x.size());
            this.f56469w.f38129w = i10;
            return this.f56470x.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f56469w.f38129w + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i10 = this.f56469w.f38129w;
            t.e(i10, this.f56470x.size());
            this.f56469w.f38129w = i10 - 1;
            return this.f56470x.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f56469w.f38129w;
        }
    }

    public e0(s<T> sVar, int i10, int i11) {
        jo.p.h(sVar, "parentList");
        this.f56465w = sVar;
        this.f56466x = i10;
        this.f56467y = sVar.f();
        this.f56468z = i11 - i10;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        g();
        this.f56465w.add(this.f56466x + size(), t10);
        this.f56468z = size() + 1;
        this.f56467y = this.f56465w.f();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        jo.p.h(collection, "elements");
        g();
        boolean addAll = this.f56465w.addAll(i10 + this.f56466x, collection);
        if (addAll) {
            this.f56468z = size() + collection.size();
            this.f56467y = this.f56465w.f();
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            g();
            s<T> sVar = this.f56465w;
            int i10 = this.f56466x;
            sVar.s(i10, size() + i10);
            this.f56468z = 0;
            this.f56467y = this.f56465w.f();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        jo.p.h(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int d() {
        return this.f56468z;
    }

    public T f(int i10) {
        g();
        T remove = this.f56465w.remove(this.f56466x + i10);
        this.f56468z = size() - 1;
        this.f56467y = this.f56465w.f();
        return remove;
    }

    public final void g() {
        if (this.f56465w.f() != this.f56467y) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List
    public T get(int i10) {
        g();
        t.e(i10, size());
        return this.f56465w.get(this.f56466x + i10);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        g();
        int i10 = this.f56466x;
        Iterator<Integer> it = po.n.t(i10, size() + i10).iterator();
        while (it.hasNext()) {
            int b10 = ((i0) it).b();
            if (jo.p.c(obj, this.f56465w.get(b10))) {
                return b10 - this.f56466x;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        g();
        int size = this.f56466x + size();
        while (true) {
            size--;
            if (size < this.f56466x) {
                return -1;
            }
            if (jo.p.c(obj, this.f56465w.get(size))) {
                return size - this.f56466x;
            }
        }
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i10) {
        return f(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        boolean z10;
        jo.p.h(collection, "elements");
        while (true) {
            for (Object obj : collection) {
                z10 = remove(obj) || z10;
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        jo.p.h(collection, "elements");
        g();
        s<T> sVar = this.f56465w;
        int i10 = this.f56466x;
        int t10 = sVar.t(collection, i10, size() + i10);
        if (t10 > 0) {
            this.f56467y = this.f56465w.f();
            this.f56468z = size() - t10;
        }
        return t10 > 0;
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        t.e(i10, size());
        g();
        T t11 = this.f56465w.set(i10 + this.f56466x, t10);
        this.f56467y = this.f56465w.f();
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.List
    public List<T> subList(int i10, int i11) {
        boolean z10 = true;
        if (!(i10 >= 0 && i10 <= i11) || i11 > size()) {
            z10 = false;
        }
        if (z10) {
            g();
            s<T> sVar = this.f56465w;
            int i12 = this.f56466x;
            return new e0(sVar, i10 + i12, i11 + i12);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
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
        g();
        jo.c0 c0Var = new jo.c0();
        c0Var.f38129w = i10 - 1;
        return new a(c0Var, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public void add(int i10, T t10) {
        g();
        this.f56465w.add(this.f56466x + i10, t10);
        this.f56468z = size() + 1;
        this.f56467y = this.f56465w.f();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        jo.p.h(collection, "elements");
        return addAll(size(), collection);
    }
}
