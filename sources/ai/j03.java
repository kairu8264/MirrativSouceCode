package ai;

import java.util.Arrays;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class j03<E> extends uz2<E> implements Set<E> {

    /* renamed from: x  reason: collision with root package name */
    public transient zz2<E> f5575x;

    public static <E> j03<E> A(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 != 1) {
                int u10 = u(i10);
                Object[] objArr2 = new Object[u10];
                int i11 = u10 - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object obj = objArr[i14];
                    k13.b(obj, i14);
                    int hashCode = obj.hashCode();
                    int a10 = rz2.a(hashCode);
                    while (true) {
                        int i15 = a10 & i11;
                        Object obj2 = objArr2[i15];
                        if (obj2 == null) {
                            objArr[i13] = obj;
                            objArr2[i15] = obj;
                            i12 += hashCode;
                            i13++;
                            break;
                        } else if (obj2.equals(obj)) {
                            break;
                        } else {
                            a10++;
                        }
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new y13(obj3, i12);
                } else if (u(i13) < u10 / 2) {
                    return A(i13, objArr);
                } else {
                    if (B(i13, objArr.length)) {
                        objArr = Arrays.copyOf(objArr, i13);
                    }
                    return new t13(objArr, i12, objArr2, i11, i13);
                }
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new y13(obj4);
        }
        return t13.E;
    }

    public static boolean B(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    public static <E> j03<E> p() {
        return t13.E;
    }

    @SafeVarargs
    public static <E> j03<E> r(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        Object[] objArr = new Object[11];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, 5);
        return A(11, objArr);
    }

    public static int u(int i10) {
        int max = Math.max(i10, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        lx2.a(max < 1073741824, "collection too large");
        return 1073741824;
    }

    public static <E> i03<E> y(int i10) {
        return new i03<>(i10);
    }

    @Override // ai.uz2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: d */
    public abstract b23<E> iterator();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof j03) && w() && ((j03) obj).w() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return x13.a(this);
    }

    @Override // ai.uz2
    public zz2<E> k() {
        zz2<E> zz2Var = this.f5575x;
        if (zz2Var == null) {
            zz2<E> x10 = x();
            this.f5575x = x10;
            return x10;
        }
        return zz2Var;
    }

    public boolean w() {
        return false;
    }

    public zz2<E> x() {
        return zz2.D(toArray());
    }
}
