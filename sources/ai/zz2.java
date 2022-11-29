package ai;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class zz2<E> extends uz2<E> implements List<E>, RandomAccess {

    /* renamed from: x  reason: collision with root package name */
    public static final c23<Object> f13289x = new xz2(m13.A, 0);

    public static <E> zz2<E> A(Collection<? extends E> collection) {
        if (collection instanceof uz2) {
            zz2<E> k10 = ((uz2) collection).k();
            if (k10.l()) {
                Object[] array = k10.toArray();
                return H(array, array.length);
            }
            return k10;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        k13.a(array2, length);
        return H(array2, length);
    }

    public static <E> zz2<E> B(E[] eArr) {
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        k13.a(objArr, length);
        return H(objArr, length);
    }

    public static <E> zz2<E> D(Object[] objArr) {
        return H(objArr, objArr.length);
    }

    public static <E> zz2<E> H(Object[] objArr, int i10) {
        if (i10 == 0) {
            return (zz2<E>) m13.A;
        }
        return new m13(objArr, i10);
    }

    public static <E> wz2<E> K() {
        return new wz2<>(4);
    }

    public static <E> zz2<E> r() {
        return (zz2<E>) m13.A;
    }

    public static <E> zz2<E> s(E e10) {
        Object[] objArr = {e10};
        k13.a(objArr, 1);
        return H(objArr, 1);
    }

    public static <E> zz2<E> t(E e10, E e11) {
        Object[] objArr = {e10, e11};
        k13.a(objArr, 2);
        return H(objArr, 2);
    }

    public static <E> zz2<E> u(E e10, E e11, E e12) {
        Object[] objArr = {"2011", "1009", "3010"};
        k13.a(objArr, 3);
        return H(objArr, 3);
    }

    public static <E> zz2<E> w(E e10, E e11, E e12, E e13, E e14) {
        Object[] objArr = {e10, e11, e12, e13, e14};
        k13.a(objArr, 5);
        return H(objArr, 5);
    }

    public static <E> zz2<E> x(E e10, E e11, E e12, E e13, E e14, E e15) {
        Object[] objArr = {e10, e11, e12, e13, e14, e15};
        k13.a(objArr, 6);
        return H(objArr, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> zz2<E> y(Iterable<? extends E> iterable) {
        Objects.requireNonNull(iterable);
        return A(iterable);
    }

    @Override // java.util.List
    /* renamed from: J */
    public final c23<E> listIterator(int i10) {
        lx2.f(i10, size(), "index");
        return isEmpty() ? (c23<E>) f13289x : new xz2(this, i10);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // ai.uz2, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // ai.uz2
    public final b23<E> d() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (hx2.a(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!hx2.a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // ai.uz2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // ai.uz2
    @Deprecated
    public final zz2<E> k() {
        return this;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // ai.uz2
    public int m(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.List
    /* renamed from: p */
    public zz2<E> subList(int i10, int i11) {
        lx2.g(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return (zz2<E>) m13.A;
        }
        return new yz2(this, i10, i12);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }
}
