package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {
    public static int A;
    public static Object[] B;
    public static int C;
    public static final Object D = new Object();
    public static final Object E = new Object();

    /* renamed from: z  reason: collision with root package name */
    public static Object[] f51760z;

    /* renamed from: w  reason: collision with root package name */
    public int[] f51761w;

    /* renamed from: x  reason: collision with root package name */
    public Object[] f51762x;

    /* renamed from: y  reason: collision with root package name */
    public int f51763y;

    /* loaded from: classes.dex */
    public class a extends d<E> {
        public a() {
            super(b.this.f51763y);
        }

        @Override // s.d
        public E a(int i10) {
            return (E) b.this.p(i10);
        }

        @Override // s.d
        public void b(int i10) {
            b.this.m(i10);
        }
    }

    public b() {
        this(0);
    }

    public static void j(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (E) {
                if (C < 10) {
                    objArr[0] = B;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    B = objArr;
                    C++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (D) {
                if (A < 10) {
                    objArr[0] = f51760z;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f51760z = objArr;
                    A++;
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int k10;
        int i11 = this.f51763y;
        if (e10 == null) {
            k10 = l();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            k10 = k(e10, hashCode);
        }
        if (k10 >= 0) {
            return false;
        }
        int i12 = ~k10;
        int[] iArr = this.f51761w;
        if (i11 >= iArr.length) {
            int i13 = 4;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 >= 4) {
                i13 = 8;
            }
            Object[] objArr = this.f51762x;
            d(i13);
            if (i11 == this.f51763y) {
                int[] iArr2 = this.f51761w;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f51762x, 0, objArr.length);
                }
                j(iArr, objArr, i11);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.f51761w;
            int i14 = i12 + 1;
            int i15 = i11 - i12;
            System.arraycopy(iArr3, i12, iArr3, i14, i15);
            Object[] objArr2 = this.f51762x;
            System.arraycopy(objArr2, i12, objArr2, i14, i15);
        }
        int i16 = this.f51763y;
        if (i11 == i16) {
            int[] iArr4 = this.f51761w;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.f51762x[i12] = e10;
                this.f51763y = i16 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        g(this.f51763y + collection.size());
        boolean z10 = false;
        for (E e10 : collection) {
            z10 |= add(e10);
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f51763y;
        if (i10 != 0) {
            int[] iArr = this.f51761w;
            Object[] objArr = this.f51762x;
            this.f51761w = c.f51765a;
            this.f51762x = c.f51767c;
            this.f51763y = 0;
            j(iArr, objArr, i10);
        }
        if (this.f51763y != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i10) {
        if (i10 == 8) {
            synchronized (E) {
                Object[] objArr = B;
                if (objArr != null) {
                    try {
                        this.f51762x = objArr;
                        B = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.f51761w = iArr;
                        if (iArr != null) {
                            objArr[1] = null;
                            objArr[0] = null;
                            C--;
                            return;
                        }
                    } catch (ClassCastException unused) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                    B = null;
                    C = 0;
                }
            }
        } else if (i10 == 4) {
            synchronized (D) {
                Object[] objArr2 = f51760z;
                if (objArr2 != null) {
                    try {
                        this.f51762x = objArr2;
                        f51760z = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.f51761w = iArr2;
                        if (iArr2 != null) {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            A--;
                            return;
                        }
                    } catch (ClassCastException unused2) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                    f51760z = null;
                    A = 0;
                }
            }
        }
        this.f51761w = new int[i10];
        this.f51762x = new Object[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f51763y; i10++) {
                try {
                    if (!set.contains(p(i10))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i10) {
        try {
            return c.a(this.f51761w, this.f51763y, i10);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public void g(int i10) {
        int i11 = this.f51763y;
        int[] iArr = this.f51761w;
        if (iArr.length < i10) {
            Object[] objArr = this.f51762x;
            d(i10);
            int i12 = this.f51763y;
            if (i12 > 0) {
                System.arraycopy(iArr, 0, this.f51761w, 0, i12);
                System.arraycopy(objArr, 0, this.f51762x, 0, this.f51763y);
            }
            j(iArr, objArr, this.f51763y);
        }
        if (this.f51763y != i11) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f51761w;
        int i10 = this.f51763y;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public int indexOf(Object obj) {
        return obj == null ? l() : k(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f51763y <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new a();
    }

    public final int k(Object obj, int i10) {
        int i11 = this.f51763y;
        if (i11 == 0) {
            return -1;
        }
        int f10 = f(i10);
        if (f10 >= 0 && !obj.equals(this.f51762x[f10])) {
            int i12 = f10 + 1;
            while (i12 < i11 && this.f51761w[i12] == i10) {
                if (obj.equals(this.f51762x[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = f10 - 1; i13 >= 0 && this.f51761w[i13] == i10; i13--) {
                if (obj.equals(this.f51762x[i13])) {
                    return i13;
                }
            }
            return ~i12;
        }
        return f10;
    }

    public final int l() {
        int i10 = this.f51763y;
        if (i10 == 0) {
            return -1;
        }
        int f10 = f(0);
        if (f10 >= 0 && this.f51762x[f10] != null) {
            int i11 = f10 + 1;
            while (i11 < i10 && this.f51761w[i11] == 0) {
                if (this.f51762x[i11] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = f10 - 1; i12 >= 0 && this.f51761w[i12] == 0; i12--) {
                if (this.f51762x[i12] == null) {
                    return i12;
                }
            }
            return ~i11;
        }
        return f10;
    }

    public E m(int i10) {
        int i11 = this.f51763y;
        Object[] objArr = this.f51762x;
        E e10 = (E) objArr[i10];
        if (i11 <= 1) {
            clear();
        } else {
            int i12 = i11 - 1;
            int[] iArr = this.f51761w;
            if (iArr.length > 8 && i11 < iArr.length / 3) {
                d(i11 > 8 ? i11 + (i11 >> 1) : 8);
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f51761w, 0, i10);
                    System.arraycopy(objArr, 0, this.f51762x, 0, i10);
                }
                if (i10 < i12) {
                    int i13 = i10 + 1;
                    int i14 = i12 - i10;
                    System.arraycopy(iArr, i13, this.f51761w, i10, i14);
                    System.arraycopy(objArr, i13, this.f51762x, i10, i14);
                }
            } else {
                if (i10 < i12) {
                    int i15 = i10 + 1;
                    int i16 = i12 - i10;
                    System.arraycopy(iArr, i15, iArr, i10, i16);
                    Object[] objArr2 = this.f51762x;
                    System.arraycopy(objArr2, i15, objArr2, i10, i16);
                }
                this.f51762x[i12] = null;
            }
            if (i11 == this.f51763y) {
                this.f51763y = i12;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return e10;
    }

    public E p(int i10) {
        return (E) this.f51762x[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            m(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f51763y - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f51762x[i10])) {
                m(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f51763y;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f51763y;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f51762x, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f51763y * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f51763y; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E p10 = p(i10);
            if (p10 != this) {
                sb2.append(p10);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public b(int i10) {
        if (i10 == 0) {
            this.f51761w = c.f51765a;
            this.f51762x = c.f51767c;
        } else {
            d(i10);
        }
        this.f51763y = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f51763y) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f51763y));
        }
        System.arraycopy(this.f51762x, 0, tArr, 0, this.f51763y);
        int length = tArr.length;
        int i10 = this.f51763y;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
