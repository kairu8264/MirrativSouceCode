package m0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import jo.g;
import jo.p;
import xn.n;

/* loaded from: classes.dex */
public final class c<T> implements Set<T>, ko.a {

    /* renamed from: w  reason: collision with root package name */
    public int f40459w;

    /* renamed from: x  reason: collision with root package name */
    public Object[] f40460x = new Object[16];

    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, ko.a {

        /* renamed from: w  reason: collision with root package name */
        public int f40461w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c<T> f40462x;

        public a(c<T> cVar) {
            this.f40462x = cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f40461w < this.f40462x.size();
        }

        @Override // java.util.Iterator
        public T next() {
            Object[] j10 = this.f40462x.j();
            int i10 = this.f40461w;
            this.f40461w = i10 + 1;
            T t10 = (T) j10[i10];
            Objects.requireNonNull(t10, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t10) {
        int i10;
        p.h(t10, "value");
        if (size() > 0) {
            i10 = d(t10);
            if (i10 >= 0) {
                return false;
            }
        } else {
            i10 = -1;
        }
        int i11 = -(i10 + 1);
        int size = size();
        Object[] objArr = this.f40460x;
        if (size == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            n.i(objArr, objArr2, i11 + 1, i11, size());
            n.m(this.f40460x, objArr2, 0, 0, i11, 6, null);
            this.f40460x = objArr2;
        } else {
            n.i(objArr, objArr, i11 + 1, i11, size());
        }
        this.f40460x[i11] = t10;
        m(size() + 1);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f40460x[i10] = null;
        }
        m(0);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return obj != null && d(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        p.h(collection, "elements");
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

    public final int d(Object obj) {
        int size = size() - 1;
        int a10 = l0.c.a(obj);
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            T t10 = get(i11);
            int a11 = l0.c.a(t10);
            if (a11 < a10) {
                i10 = i11 + 1;
            } else if (a11 <= a10) {
                return t10 == obj ? i11 : f(i11, obj, a10);
            } else {
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public final int f(int i10, Object obj, int i11) {
        for (int i12 = i10 - 1; -1 < i12; i12--) {
            Object obj2 = this.f40460x[i12];
            if (obj2 == obj) {
                return i12;
            }
            if (l0.c.a(obj2) != i11) {
                break;
            }
        }
        int i13 = i10 + 1;
        int size = size();
        while (true) {
            if (i13 < size) {
                Object obj3 = this.f40460x[i13];
                if (obj3 == obj) {
                    return i13;
                }
                if (l0.c.a(obj3) != i11) {
                    break;
                }
                i13++;
            } else {
                i13 = size();
                break;
            }
        }
        return -(i13 + 1);
    }

    public int g() {
        return this.f40459w;
    }

    public final T get(int i10) {
        T t10 = (T) this.f40460x[i10];
        Objects.requireNonNull(t10, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return t10;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final Object[] j() {
        return this.f40460x;
    }

    public final boolean k() {
        return size() > 0;
    }

    public void m(int i10) {
        this.f40459w = i10;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(T t10) {
        int d10;
        if (t10 != null && (d10 = d(t10)) >= 0) {
            if (d10 < size() - 1) {
                Object[] objArr = this.f40460x;
                n.i(objArr, objArr, d10, d10 + 1, size());
            }
            m(size() - 1);
            this.f40460x[size()] = null;
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return g.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        p.h(tArr, "array");
        return (T[]) g.b(this, tArr);
    }
}
