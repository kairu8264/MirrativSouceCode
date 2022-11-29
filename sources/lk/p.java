package lk;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public abstract class p<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public static final Object[] f40340w = new Object[0];

    /* loaded from: classes3.dex */
    public static abstract class a<E> extends b<E> {

        /* renamed from: a  reason: collision with root package name */
        public Object[] f40341a;

        /* renamed from: b  reason: collision with root package name */
        public int f40342b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f40343c;

        public a(int i10) {
            i.b(i10, "initialCapacity");
            this.f40341a = new Object[i10];
            this.f40342b = 0;
        }

        @CanIgnoreReturnValue
        public a<E> b(E e10) {
            kk.j.i(e10);
            c(this.f40342b + 1);
            Object[] objArr = this.f40341a;
            int i10 = this.f40342b;
            this.f40342b = i10 + 1;
            objArr[i10] = e10;
            return this;
        }

        public final void c(int i10) {
            Object[] objArr = this.f40341a;
            if (objArr.length < i10) {
                this.f40341a = Arrays.copyOf(objArr, b.a(objArr.length, i10));
                this.f40343c = false;
            } else if (this.f40343c) {
                this.f40341a = (Object[]) objArr.clone();
                this.f40343c = false;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b<E> {
        public static int a(int i10, int i11) {
            if (i11 >= 0) {
                int i12 = i10 + (i10 >> 1) + 1;
                if (i12 < i11) {
                    i12 = Integer.highestOneBit(i11 - 1) << 1;
                }
                if (i12 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i12;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@NullableDecl Object obj);

    public r<E> d() {
        return isEmpty() ? r.A() : r.p(toArray());
    }

    @CanIgnoreReturnValue
    public int f(Object[] objArr, int i10) {
        v0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    public Object[] g() {
        return null;
    }

    public int j() {
        throw new UnsupportedOperationException();
    }

    public int k() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean l();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m */
    public abstract v0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f40340w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        kk.j.i(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] g10 = g();
            if (g10 != null) {
                return (T[]) l0.a(g10, k(), j(), tArr);
            }
            tArr = (T[]) j0.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        f(tArr, 0);
        return tArr;
    }
}
