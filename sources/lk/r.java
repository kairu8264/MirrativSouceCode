package lk;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import lk.p;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public abstract class r<E> extends p<E> implements List<E>, RandomAccess {

    /* renamed from: x  reason: collision with root package name */
    public static final w0<Object> f40348x = new b(m0.A, 0);

    /* loaded from: classes3.dex */
    public static final class a<E> extends p.a<E> {
        public a() {
            this(4);
        }

        @CanIgnoreReturnValue
        public a<E> d(E e10) {
            super.b(e10);
            return this;
        }

        public r<E> e() {
            this.f40343c = true;
            return r.r(this.f40341a, this.f40342b);
        }

        public a(int i10) {
            super(i10);
        }
    }

    /* loaded from: classes3.dex */
    public static class b<E> extends lk.a<E> {

        /* renamed from: y  reason: collision with root package name */
        public final r<E> f40349y;

        public b(r<E> rVar, int i10) {
            super(rVar.size(), i10);
            this.f40349y = rVar;
        }

        @Override // lk.a
        public E a(int i10) {
            return this.f40349y.get(i10);
        }
    }

    /* loaded from: classes3.dex */
    public class c extends r<E> {

        /* renamed from: y  reason: collision with root package name */
        public final transient int f40350y;

        /* renamed from: z  reason: collision with root package name */
        public final transient int f40351z;

        public c(int i10, int i11) {
            this.f40350y = i10;
            this.f40351z = i11;
        }

        @Override // lk.r, java.util.List
        /* renamed from: K */
        public r<E> subList(int i10, int i11) {
            kk.j.m(i10, i11, this.f40351z);
            r rVar = r.this;
            int i12 = this.f40350y;
            return rVar.subList(i10 + i12, i11 + i12);
        }

        @Override // lk.p
        public Object[] g() {
            return r.this.g();
        }

        @Override // java.util.List
        public E get(int i10) {
            kk.j.g(i10, this.f40351z);
            return r.this.get(i10 + this.f40350y);
        }

        @Override // lk.r, lk.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // lk.p
        public int j() {
            return r.this.k() + this.f40350y + this.f40351z;
        }

        @Override // lk.p
        public int k() {
            return r.this.k() + this.f40350y;
        }

        @Override // lk.p
        public boolean l() {
            return true;
        }

        @Override // lk.r, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f40351z;
        }

        @Override // lk.r, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    public static <E> r<E> A() {
        return (r<E>) m0.A;
    }

    public static <E> r<E> B(E e10) {
        return t(e10);
    }

    public static <E> r<E> D(E e10, E e11) {
        return t(e10, e11);
    }

    public static <E> r<E> H(E e10, E e11, E e12, E e13, E e14) {
        return t(e10, e11, e12, e13, e14);
    }

    public static <E> r<E> J(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        kk.j.i(comparator);
        Object[] e10 = w.e(iterable);
        j0.b(e10);
        Arrays.sort(e10, comparator);
        return p(e10);
    }

    public static <E> r<E> p(Object[] objArr) {
        return r(objArr, objArr.length);
    }

    public static <E> r<E> r(Object[] objArr, int i10) {
        if (i10 == 0) {
            return A();
        }
        return new m0(objArr, i10);
    }

    public static <E> a<E> s() {
        return new a<>();
    }

    public static <E> r<E> t(Object... objArr) {
        return p(j0.b(objArr));
    }

    public static <E> r<E> u(Collection<? extends E> collection) {
        if (collection instanceof p) {
            r<E> d10 = ((p) collection).d();
            return d10.l() ? p(d10.toArray()) : d10;
        }
        return t(collection.toArray());
    }

    public static <E> r<E> w(E[] eArr) {
        if (eArr.length == 0) {
            return A();
        }
        return t((Object[]) eArr.clone());
    }

    @Override // java.util.List
    /* renamed from: K */
    public r<E> subList(int i10, int i11) {
        kk.j.m(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return A();
        }
        return L(i10, i11);
    }

    public r<E> L(int i10, int i11) {
        return new c(i10, i11 - i10);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // lk.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // lk.p
    public final r<E> d() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@NullableDecl Object obj) {
        return z.a(this, obj);
    }

    @Override // lk.p
    public int f(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        return z.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        return z.d(this, obj);
    }

    @Override // lk.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m */
    public v0<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: x */
    public w0<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: y */
    public w0<E> listIterator(int i10) {
        kk.j.k(i10, size());
        if (isEmpty()) {
            return (w0<E>) f40348x;
        }
        return new b(this, i10);
    }
}
