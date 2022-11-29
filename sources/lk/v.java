package lk;

import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public abstract class v<E> extends p<E> implements Set<E> {
    @RetainedWith
    @NullableDecl
    @LazyInit

    /* renamed from: x  reason: collision with root package name */
    public transient r<E> f40379x;

    public static <E> v<E> A(E e10, E e11) {
        return r(2, e10, e11);
    }

    public static <E> v<E> B(E e10, E e11, E e12) {
        return r(3, e10, e11, e12);
    }

    public static boolean D(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    public static int p(int i10) {
        int max = Math.max(i10, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        kk.j.e(max < 1073741824, "collection too large");
        return 1073741824;
    }

    public static <E> v<E> r(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 != 1) {
                int p10 = p(i10);
                Object[] objArr2 = new Object[p10];
                int i11 = p10 - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object a10 = j0.a(objArr[i14], i14);
                    int hashCode = a10.hashCode();
                    int b10 = o.b(hashCode);
                    while (true) {
                        int i15 = b10 & i11;
                        Object obj = objArr2[i15];
                        if (obj == null) {
                            objArr[i13] = a10;
                            objArr2[i15] = a10;
                            i12 += hashCode;
                            i13++;
                            break;
                        } else if (obj.equals(a10)) {
                            break;
                        } else {
                            b10++;
                        }
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    return new t0(objArr[0], i12);
                }
                if (p(i13) < p10 / 2) {
                    return r(i13, objArr);
                }
                if (D(i13, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new o0(objArr, i12, objArr2, i11, i13);
            }
            return y(objArr[0]);
        }
        return x();
    }

    public static <E> v<E> s(Collection<? extends E> collection) {
        if ((collection instanceof v) && !(collection instanceof SortedSet)) {
            v<E> vVar = (v) collection;
            if (!vVar.l()) {
                return vVar;
            }
        }
        Object[] array = collection.toArray();
        return r(array.length, array);
    }

    public static <E> v<E> t(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            if (length != 1) {
                return r(eArr.length, (Object[]) eArr.clone());
            }
            return y(eArr[0]);
        }
        return x();
    }

    public static <E> v<E> x() {
        return o0.D;
    }

    public static <E> v<E> y(E e10) {
        return new t0(e10);
    }

    @Override // lk.p
    public r<E> d() {
        r<E> rVar = this.f40379x;
        if (rVar == null) {
            r<E> u10 = u();
            this.f40379x = u10;
            return u10;
        }
        return rVar;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v) && w() && ((v) obj).w() && hashCode() != obj.hashCode()) {
            return false;
        }
        return s0.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return s0.b(this);
    }

    @Override // lk.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m */
    public abstract v0<E> iterator();

    public r<E> u() {
        return r.p(toArray());
    }

    public boolean w() {
        return false;
    }
}
