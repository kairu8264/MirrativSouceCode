package xn;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class k<E> extends f<E> {

    /* renamed from: w  reason: collision with root package name */
    public int f60451w;

    /* renamed from: x  reason: collision with root package name */
    public Object[] f60452x = A;

    /* renamed from: y  reason: collision with root package name */
    public int f60453y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f60450z = new a(null);
    public static final Object[] A = new Object[0];

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            return i12 - 2147483639 > 0 ? i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i12;
        }
    }

    public final E A() {
        if (!isEmpty()) {
            int w10 = w(this.f60451w + s.l(this));
            Object[] objArr = this.f60452x;
            E e10 = (E) objArr[w10];
            objArr[w10] = null;
            this.f60453y = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        j(e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        jo.p.h(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        r(size() + collection.size());
        k(w(this.f60451w + size()), collection);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int w10 = w(this.f60451w + size());
        int i10 = this.f60451w;
        if (i10 < w10) {
            n.r(this.f60452x, null, i10, w10);
        } else if (!isEmpty()) {
            Object[] objArr = this.f60452x;
            n.r(objArr, null, this.f60451w, objArr.length);
            n.r(this.f60452x, null, 0, w10);
        }
        this.f60451w = 0;
        this.f60453y = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // xn.f
    public int d() {
        return this.f60453y;
    }

    @Override // xn.f
    public E f(int i10) {
        c.f60430w.b(i10, size());
        if (i10 == s.l(this)) {
            return A();
        }
        if (i10 == 0) {
            return x();
        }
        int w10 = w(this.f60451w + i10);
        E e10 = (E) this.f60452x[w10];
        if (i10 < (size() >> 1)) {
            int i11 = this.f60451w;
            if (w10 >= i11) {
                Object[] objArr = this.f60452x;
                n.i(objArr, objArr, i11 + 1, i11, w10);
            } else {
                Object[] objArr2 = this.f60452x;
                n.i(objArr2, objArr2, 1, 0, w10);
                Object[] objArr3 = this.f60452x;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f60451w;
                n.i(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f60452x;
            int i13 = this.f60451w;
            objArr4[i13] = null;
            this.f60451w = t(i13);
        } else {
            int w11 = w(this.f60451w + s.l(this));
            if (w10 <= w11) {
                Object[] objArr5 = this.f60452x;
                n.i(objArr5, objArr5, w10, w10 + 1, w11 + 1);
            } else {
                Object[] objArr6 = this.f60452x;
                n.i(objArr6, objArr6, w10, w10 + 1, objArr6.length);
                Object[] objArr7 = this.f60452x;
                objArr7[objArr7.length - 1] = objArr7[0];
                n.i(objArr7, objArr7, 0, 1, w11 + 1);
            }
            this.f60452x[w11] = null;
        }
        this.f60453y = size() - 1;
        return e10;
    }

    public final void g(E e10) {
        r(size() + 1);
        int p10 = p(this.f60451w);
        this.f60451w = p10;
        this.f60452x[p10] = e10;
        this.f60453y = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        c.f60430w.b(i10, size());
        return (E) this.f60452x[w(this.f60451w + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int w10 = w(this.f60451w + size());
        int i11 = this.f60451w;
        if (i11 < w10) {
            while (i11 < w10) {
                if (jo.p.c(obj, this.f60452x[i11])) {
                    i10 = this.f60451w;
                } else {
                    i11++;
                }
            }
            return -1;
        } else if (i11 < w10) {
            return -1;
        } else {
            int length = this.f60452x.length;
            while (true) {
                if (i11 >= length) {
                    for (int i12 = 0; i12 < w10; i12++) {
                        if (jo.p.c(obj, this.f60452x[i12])) {
                            i11 = i12 + this.f60452x.length;
                            i10 = this.f60451w;
                        }
                    }
                    return -1;
                } else if (jo.p.c(obj, this.f60452x[i11])) {
                    i10 = this.f60451w;
                    break;
                } else {
                    i11++;
                }
            }
        }
        return i11 - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final void j(E e10) {
        r(size() + 1);
        this.f60452x[w(this.f60451w + size())] = e10;
        this.f60453y = size() + 1;
    }

    public final void k(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f60452x.length;
        while (i10 < length && it.hasNext()) {
            this.f60452x[i10] = it.next();
            i10++;
        }
        int i11 = this.f60451w;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f60452x[i12] = it.next();
        }
        this.f60453y = size() + collection.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int L;
        int i10;
        int w10 = w(this.f60451w + size());
        int i11 = this.f60451w;
        if (i11 < w10) {
            L = w10 - 1;
            if (i11 <= L) {
                while (!jo.p.c(obj, this.f60452x[L])) {
                    if (L != i11) {
                        L--;
                    }
                }
                i10 = this.f60451w;
                return L - i10;
            }
            return -1;
        }
        if (i11 > w10) {
            int i12 = w10 - 1;
            while (true) {
                if (-1 < i12) {
                    if (jo.p.c(obj, this.f60452x[i12])) {
                        L = i12 + this.f60452x.length;
                        i10 = this.f60451w;
                        break;
                    }
                    i12--;
                } else {
                    L = o.L(this.f60452x);
                    int i13 = this.f60451w;
                    if (i13 <= L) {
                        while (!jo.p.c(obj, this.f60452x[L])) {
                            if (L != i13) {
                                L--;
                            }
                        }
                        i10 = this.f60451w;
                    }
                }
            }
        }
        return -1;
    }

    public final void m(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f60452x;
        n.i(objArr2, objArr, 0, this.f60451w, objArr2.length);
        Object[] objArr3 = this.f60452x;
        int length = objArr3.length;
        int i11 = this.f60451w;
        n.i(objArr3, objArr, length - i11, 0, i11);
        this.f60451w = 0;
        this.f60452x = objArr;
    }

    public final int p(int i10) {
        return i10 == 0 ? o.L(this.f60452x) : i10 - 1;
    }

    public final void r(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.f60452x;
            if (i10 <= objArr.length) {
                return;
            }
            if (objArr == A) {
                this.f60452x = new Object[po.n.d(i10, 10)];
                return;
            } else {
                m(f60450z.a(objArr.length, i10));
                return;
            }
        }
        throw new IllegalStateException("Deque is too big.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        int w10;
        jo.p.h(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f60452x.length == 0 ? (byte) 1 : (byte) 0) == 0) {
                int w11 = w(this.f60451w + size());
                int i10 = this.f60451w;
                if (i10 < w11) {
                    w10 = i10;
                    while (i10 < w11) {
                        Object obj = this.f60452x[i10];
                        if (!collection.contains(obj)) {
                            this.f60452x[w10] = obj;
                            w10++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    n.r(this.f60452x, null, w10, w11);
                } else {
                    int length = this.f60452x.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f60452x;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (!collection.contains(obj2)) {
                            this.f60452x[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    w10 = w(i11);
                    for (int i12 = 0; i12 < w11; i12++) {
                        Object[] objArr2 = this.f60452x;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (!collection.contains(obj3)) {
                            this.f60452x[w10] = obj3;
                            w10 = t(w10);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f60453y = u(w10 - this.f60451w);
                }
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        int w10;
        jo.p.h(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f60452x.length == 0 ? (byte) 1 : (byte) 0) == 0) {
                int w11 = w(this.f60451w + size());
                int i10 = this.f60451w;
                if (i10 < w11) {
                    w10 = i10;
                    while (i10 < w11) {
                        Object obj = this.f60452x[i10];
                        if (collection.contains(obj)) {
                            this.f60452x[w10] = obj;
                            w10++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    n.r(this.f60452x, null, w10, w11);
                } else {
                    int length = this.f60452x.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f60452x;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (collection.contains(obj2)) {
                            this.f60452x[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    w10 = w(i11);
                    for (int i12 = 0; i12 < w11; i12++) {
                        Object[] objArr2 = this.f60452x;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (collection.contains(obj3)) {
                            this.f60452x[w10] = obj3;
                            w10 = t(w10);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f60453y = u(w10 - this.f60451w);
                }
            }
        }
        return z10;
    }

    public final E s() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f60452x[this.f60451w];
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        c.f60430w.b(i10, size());
        int w10 = w(this.f60451w + i10);
        Object[] objArr = this.f60452x;
        E e11 = (E) objArr[w10];
        objArr[w10] = e10;
        return e11;
    }

    public final int t(int i10) {
        if (i10 == o.L(this.f60452x)) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        jo.p.h(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) l.a(tArr, size());
        }
        jo.p.f(tArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        int w10 = w(this.f60451w + size());
        int i10 = this.f60451w;
        if (i10 < w10) {
            n.m(this.f60452x, tArr, 0, i10, w10, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f60452x;
            n.i(objArr, tArr, 0, this.f60451w, objArr.length);
            Object[] objArr2 = this.f60452x;
            n.i(objArr2, tArr, objArr2.length - this.f60451w, 0, w10);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    public final int u(int i10) {
        return i10 < 0 ? i10 + this.f60452x.length : i10;
    }

    public final int w(int i10) {
        Object[] objArr = this.f60452x;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public final E x() {
        if (!isEmpty()) {
            Object[] objArr = this.f60452x;
            int i10 = this.f60451w;
            E e10 = (E) objArr[i10];
            objArr[i10] = null;
            this.f60451w = t(i10);
            this.f60453y = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E y() {
        if (isEmpty()) {
            return null;
        }
        return x();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        c.f60430w.c(i10, size());
        if (i10 == size()) {
            j(e10);
        } else if (i10 == 0) {
            g(e10);
        } else {
            r(size() + 1);
            int w10 = w(this.f60451w + i10);
            if (i10 < ((size() + 1) >> 1)) {
                int p10 = p(w10);
                int p11 = p(this.f60451w);
                int i11 = this.f60451w;
                if (p10 >= i11) {
                    Object[] objArr = this.f60452x;
                    objArr[p11] = objArr[i11];
                    n.i(objArr, objArr, i11, i11 + 1, p10 + 1);
                } else {
                    Object[] objArr2 = this.f60452x;
                    n.i(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                    Object[] objArr3 = this.f60452x;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    n.i(objArr3, objArr3, 0, 1, p10 + 1);
                }
                this.f60452x[p10] = e10;
                this.f60451w = p11;
            } else {
                int w11 = w(this.f60451w + size());
                if (w10 < w11) {
                    Object[] objArr4 = this.f60452x;
                    n.i(objArr4, objArr4, w10 + 1, w10, w11);
                } else {
                    Object[] objArr5 = this.f60452x;
                    n.i(objArr5, objArr5, 1, 0, w11);
                    Object[] objArr6 = this.f60452x;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    n.i(objArr6, objArr6, w10 + 1, w10, objArr6.length - 1);
                }
                this.f60452x[w10] = e10;
            }
            this.f60453y = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        jo.p.h(collection, "elements");
        c.f60430w.c(i10, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(collection);
        }
        r(size() + collection.size());
        int w10 = w(this.f60451w + size());
        int w11 = w(this.f60451w + i10);
        int size = collection.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f60451w;
            int i12 = i11 - size;
            if (w11 < i11) {
                Object[] objArr = this.f60452x;
                n.i(objArr, objArr, i12, i11, objArr.length);
                if (size >= w11) {
                    Object[] objArr2 = this.f60452x;
                    n.i(objArr2, objArr2, objArr2.length - size, 0, w11);
                } else {
                    Object[] objArr3 = this.f60452x;
                    n.i(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f60452x;
                    n.i(objArr4, objArr4, 0, size, w11);
                }
            } else if (i12 >= 0) {
                Object[] objArr5 = this.f60452x;
                n.i(objArr5, objArr5, i12, i11, w11);
            } else {
                Object[] objArr6 = this.f60452x;
                i12 += objArr6.length;
                int i13 = w11 - i11;
                int length = objArr6.length - i12;
                if (length >= i13) {
                    n.i(objArr6, objArr6, i12, i11, w11);
                } else {
                    n.i(objArr6, objArr6, i12, i11, i11 + length);
                    Object[] objArr7 = this.f60452x;
                    n.i(objArr7, objArr7, 0, this.f60451w + length, w11);
                }
            }
            this.f60451w = i12;
            k(u(w11 - size), collection);
        } else {
            int i14 = w11 + size;
            if (w11 < w10) {
                int i15 = size + w10;
                Object[] objArr8 = this.f60452x;
                if (i15 <= objArr8.length) {
                    n.i(objArr8, objArr8, i14, w11, w10);
                } else if (i14 >= objArr8.length) {
                    n.i(objArr8, objArr8, i14 - objArr8.length, w11, w10);
                } else {
                    int length2 = w10 - (i15 - objArr8.length);
                    n.i(objArr8, objArr8, 0, length2, w10);
                    Object[] objArr9 = this.f60452x;
                    n.i(objArr9, objArr9, i14, w11, length2);
                }
            } else {
                Object[] objArr10 = this.f60452x;
                n.i(objArr10, objArr10, size, 0, w10);
                Object[] objArr11 = this.f60452x;
                if (i14 >= objArr11.length) {
                    n.i(objArr11, objArr11, i14 - objArr11.length, w11, objArr11.length);
                } else {
                    n.i(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f60452x;
                    n.i(objArr12, objArr12, i14, w11, objArr12.length - size);
                }
            }
            k(w11, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
