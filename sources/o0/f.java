package o0;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import jo.p;
import jo.q;
import n0.e;
import xn.n;

/* loaded from: classes.dex */
public final class f<E> extends xn.f<E> implements e.a<E> {
    public r0.e A;
    public Object[] B;
    public Object[] C;
    public int D;

    /* renamed from: w  reason: collision with root package name */
    public n0.e<? extends E> f43782w;

    /* renamed from: x  reason: collision with root package name */
    public Object[] f43783x;

    /* renamed from: y  reason: collision with root package name */
    public Object[] f43784y;

    /* renamed from: z  reason: collision with root package name */
    public int f43785z;

    /* loaded from: classes.dex */
    public static final class a extends q implements io.l<E, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Collection<E> f43786w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Collection<? extends E> collection) {
            super(1);
            this.f43786w = collection;
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(E e10) {
            return Boolean.valueOf(this.f43786w.contains(e10));
        }
    }

    public f(n0.e<? extends E> eVar, Object[] objArr, Object[] objArr2, int i10) {
        p.h(eVar, "vector");
        p.h(objArr2, "vectorTail");
        this.f43782w = eVar;
        this.f43783x = objArr;
        this.f43784y = objArr2;
        this.f43785z = i10;
        this.A = new r0.e();
        this.B = this.f43783x;
        this.C = this.f43784y;
        this.D = this.f43782w.size();
    }

    public final Object[] A(Object[] objArr, int i10) {
        if (w(objArr)) {
            return n.i(objArr, objArr, i10, 0, 32 - i10);
        }
        return n.i(objArr, B(), i10, 0, 32 - i10);
    }

    public final Object[] B() {
        Object[] objArr = new Object[33];
        objArr[32] = this.A;
        return objArr;
    }

    public final Object[] D(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.A;
        return objArr;
    }

    public final Object[] H(Object[] objArr, int i10, int i11) {
        if (i11 >= 0) {
            if (i11 == 0) {
                return objArr;
            }
            int a10 = l.a(i10, i11);
            Object obj = objArr[a10];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object H = H((Object[]) obj, i10, i11 - 5);
            if (a10 < 31) {
                int i12 = a10 + 1;
                if (objArr[i12] != null) {
                    if (w(objArr)) {
                        n.r(objArr, null, i12, 32);
                    }
                    objArr = n.i(objArr, B(), 0, 0, i12);
                }
            }
            if (H != objArr[a10]) {
                Object[] y10 = y(objArr);
                y10[a10] = H;
                return y10;
            }
            return objArr;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final Object[] J(Object[] objArr, int i10, int i11, d dVar) {
        Object[] J;
        int a10 = l.a(i11 - 1, i10);
        if (i10 == 5) {
            dVar.b(objArr[a10]);
            J = null;
        } else {
            Object obj = objArr[a10];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            J = J((Object[]) obj, i10 - 5, i11, dVar);
        }
        if (J == null && a10 == 0) {
            return null;
        }
        Object[] y10 = y(objArr);
        y10[a10] = J;
        return y10;
    }

    public final void K(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            this.B = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.C = objArr;
            this.D = i10;
            this.f43785z = i11;
            return;
        }
        d dVar = new d(null);
        p.e(objArr);
        Object[] J = J(objArr, i11, i10, dVar);
        p.e(J);
        Object a10 = dVar.a();
        Objects.requireNonNull(a10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.C = (Object[]) a10;
        this.D = i10;
        if (J[1] == null) {
            this.B = (Object[]) J[0];
            this.f43785z = i11 - 5;
            return;
        }
        this.B = J;
        this.f43785z = i11;
    }

    public final Object[] L(Object[] objArr, int i10, int i11, Iterator<Object[]> it) {
        if (it.hasNext()) {
            if (i11 >= 0) {
                if (i11 == 0) {
                    return it.next();
                }
                Object[] y10 = y(objArr);
                int a10 = l.a(i10, i11);
                int i12 = i11 - 5;
                y10[a10] = L((Object[]) y10[a10], i10, i12, it);
                while (true) {
                    a10++;
                    if (a10 >= 32 || !it.hasNext()) {
                        break;
                    }
                    y10[a10] = L((Object[]) y10[a10], 0, i12, it);
                }
                return y10;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final Object[] M(Object[] objArr, int i10, Object[][] objArr2) {
        Object[] y10;
        Iterator<Object[]> a10 = jo.c.a(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f43785z;
        if (i11 < (1 << i12)) {
            y10 = L(objArr, i10, i12, a10);
        } else {
            y10 = y(objArr);
        }
        while (a10.hasNext()) {
            this.f43785z += 5;
            y10 = D(y10);
            int i13 = this.f43785z;
            L(y10, 1 << i13, i13, a10);
        }
        return y10;
    }

    public final void N(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f43785z;
        if (size > (1 << i10)) {
            this.B = P(D(objArr), objArr2, this.f43785z + 5);
            this.C = objArr3;
            this.f43785z += 5;
            this.D = size() + 1;
        } else if (objArr == null) {
            this.B = objArr2;
            this.C = objArr3;
            this.D = size() + 1;
        } else {
            this.B = P(objArr, objArr2, i10);
            this.C = objArr3;
            this.D = size() + 1;
        }
    }

    public final Object[] P(Object[] objArr, Object[] objArr2, int i10) {
        int a10 = l.a(size() - 1, i10);
        Object[] y10 = y(objArr);
        if (i10 == 5) {
            y10[a10] = objArr2;
        } else {
            y10[a10] = P((Object[]) y10[a10], objArr2, i10 - 5);
        }
        return y10;
    }

    public final int Q(io.l<? super E, Boolean> lVar, Object[] objArr, int i10, int i11, d dVar, List<Object[]> list, List<Object[]> list2) {
        Object[] B;
        if (w(objArr)) {
            list.add(objArr);
        }
        Object a10 = dVar.a();
        Objects.requireNonNull(a10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) a10;
        Object[] objArr3 = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (!lVar.invoke(obj).booleanValue()) {
                if (i11 == 32) {
                    if (!list.isEmpty()) {
                        B = list.remove(list.size() - 1);
                    } else {
                        B = B();
                    }
                    objArr3 = B;
                    i11 = 0;
                }
                objArr3[i11] = obj;
                i11++;
            }
        }
        dVar.b(objArr3);
        if (objArr2 != dVar.a()) {
            list2.add(objArr2);
        }
        return i11;
    }

    public final int R(io.l<? super E, Boolean> lVar, Object[] objArr, int i10, d dVar) {
        Object[] objArr2 = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z10) {
                    objArr2 = y(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArr2[i11] = obj;
                i11++;
            }
        }
        dVar.b(objArr2);
        return i11;
    }

    public final boolean S(io.l<? super E, Boolean> lVar) {
        Object[] L;
        int f02 = f0();
        d dVar = new d(null);
        if (this.B == null) {
            return T(lVar, f02, dVar) != f02;
        }
        ListIterator<Object[]> x10 = x(0);
        int i10 = 32;
        while (i10 == 32 && x10.hasNext()) {
            i10 = R(lVar, x10.next(), 32, dVar);
        }
        if (i10 == 32) {
            r0.a.a(!x10.hasNext());
            int T = T(lVar, f02, dVar);
            if (T == 0) {
                K(this.B, size(), this.f43785z);
            }
            return T != f02;
        }
        int previousIndex = x10.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = i10;
        while (x10.hasNext()) {
            i11 = Q(lVar, x10.next(), 32, i11, dVar, arrayList2, arrayList);
            previousIndex = previousIndex;
        }
        int i12 = previousIndex;
        int Q = Q(lVar, this.C, f02, i11, dVar, arrayList2, arrayList);
        Object a10 = dVar.a();
        Objects.requireNonNull(a10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) a10;
        n.r(objArr, null, Q, 32);
        if (arrayList.isEmpty()) {
            L = this.B;
            p.e(L);
        } else {
            L = L(this.B, i12, this.f43785z, arrayList.iterator());
        }
        int size = i12 + (arrayList.size() << 5);
        this.B = Z(L, size);
        this.C = objArr;
        this.D = size + Q;
        return true;
    }

    public final int T(io.l<? super E, Boolean> lVar, int i10, d dVar) {
        int R = R(lVar, this.C, i10, dVar);
        if (R == i10) {
            r0.a.a(dVar.a() == this.C);
            return i10;
        }
        Object a10 = dVar.a();
        Objects.requireNonNull(a10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) a10;
        n.r(objArr, null, R, i10);
        this.C = objArr;
        this.D = size() - (i10 - R);
        return R;
    }

    public final boolean U(io.l<? super E, Boolean> lVar) {
        p.h(lVar, "predicate");
        boolean S = S(lVar);
        if (S) {
            ((AbstractList) this).modCount++;
        }
        return S;
    }

    public final Object[] V(Object[] objArr, int i10, int i11, d dVar) {
        int a10 = l.a(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[a10];
            Object[] i12 = n.i(objArr, y(objArr), a10, a10 + 1, 32);
            i12[31] = dVar.a();
            dVar.b(obj);
            return i12;
        }
        int a11 = objArr[31] == null ? l.a(a0() - 1, i10) : 31;
        Object[] y10 = y(objArr);
        int i13 = i10 - 5;
        int i14 = a10 + 1;
        if (i14 <= a11) {
            while (true) {
                Object obj2 = y10[a11];
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                y10[a11] = V((Object[]) obj2, i13, 0, dVar);
                if (a11 == i14) {
                    break;
                }
                a11--;
            }
        }
        Object obj3 = y10[a10];
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        y10[a10] = V((Object[]) obj3, i13, i11, dVar);
        return y10;
    }

    public final Object W(Object[] objArr, int i10, int i11, int i12) {
        int size = size() - i10;
        r0.a.a(i12 < size);
        if (size == 1) {
            Object obj = this.C[0];
            K(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.C;
        Object obj2 = objArr2[i12];
        Object[] i13 = n.i(objArr2, y(objArr2), i12, i12 + 1, size);
        i13[size - 1] = null;
        this.B = objArr;
        this.C = i13;
        this.D = (i10 + size) - 1;
        this.f43785z = i11;
        return obj2;
    }

    public final Object[] Z(Object[] objArr, int i10) {
        if (!((i10 & 31) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i10 == 0) {
            this.f43785z = 0;
            return null;
        }
        int i11 = i10 - 1;
        while (true) {
            int i12 = this.f43785z;
            if ((i11 >> i12) == 0) {
                this.f43785z = i12 - 5;
                Object[] objArr2 = objArr[0];
                Objects.requireNonNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = objArr2;
            } else {
                return H(objArr, i11, i12);
            }
        }
    }

    @Override // n0.e.a
    public n0.e<E> a() {
        e eVar;
        if (this.B == this.f43783x && this.C == this.f43784y) {
            eVar = this.f43782w;
        } else {
            this.A = new r0.e();
            Object[] objArr = this.B;
            this.f43783x = objArr;
            Object[] objArr2 = this.C;
            this.f43784y = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    eVar = l.b();
                } else {
                    Object[] copyOf = Arrays.copyOf(this.C, size());
                    p.g(copyOf, "copyOf(this, newSize)");
                    eVar = new j(copyOf);
                }
            } else {
                Object[] objArr3 = this.B;
                p.e(objArr3);
                eVar = new e(objArr3, this.C, size(), this.f43785z);
            }
        }
        this.f43782w = eVar;
        return (n0.e<E>) eVar;
    }

    public final int a0() {
        if (size() <= 32) {
            return 0;
        }
        return l.d(size());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        ((AbstractList) this).modCount++;
        int f02 = f0();
        if (f02 < 32) {
            Object[] y10 = y(this.C);
            y10[f02] = e10;
            this.C = y10;
            this.D = size() + 1;
        } else {
            N(this.B, this.C, D(e10));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        p.h(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int f02 = f0();
        Iterator<? extends E> it = collection.iterator();
        if (32 - f02 >= collection.size()) {
            this.C = j(y(this.C), f02, it);
            this.D = size() + collection.size();
        } else {
            int size = ((collection.size() + f02) - 1) / 32;
            Object[][] objArr = new Object[size];
            objArr[0] = j(y(this.C), f02, it);
            for (int i10 = 1; i10 < size; i10++) {
                objArr[i10] = j(B(), 0, it);
            }
            this.B = M(this.B, a0(), objArr);
            this.C = j(B(), 0, it);
            this.D = size() + collection.size();
        }
        return true;
    }

    public final Object[] b0(Object[] objArr, int i10, int i11, E e10, d dVar) {
        int a10 = l.a(i11, i10);
        Object[] y10 = y(objArr);
        if (i10 == 0) {
            if (y10 != objArr) {
                ((AbstractList) this).modCount++;
            }
            dVar.b(y10[a10]);
            y10[a10] = e10;
            return y10;
        }
        Object obj = y10[a10];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        y10[a10] = b0((Object[]) obj, i10 - 5, i11, e10, dVar);
        return y10;
    }

    @Override // xn.f
    public int d() {
        return this.D;
    }

    public final Object[] d0(int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.B != null) {
            ListIterator<Object[]> x10 = x(a0() >> 5);
            while (x10.previousIndex() != i10) {
                Object[] previous = x10.previous();
                n.i(previous, objArr2, 0, 32 - i11, 32);
                objArr2 = A(previous, i11);
                i12--;
                objArr[i12] = objArr2;
            }
            return x10.previous();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void e0(Collection<? extends E> collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] B;
        if (i12 >= 1) {
            Object[] y10 = y(objArr);
            objArr2[0] = y10;
            int i13 = i10 & 31;
            int size = ((i10 + collection.size()) - 1) & 31;
            int i14 = (i11 - i13) + size;
            if (i14 < 32) {
                n.i(y10, objArr3, size + 1, i13, i11);
            } else {
                int i15 = (i14 - 32) + 1;
                if (i12 == 1) {
                    B = y10;
                } else {
                    B = B();
                    i12--;
                    objArr2[i12] = B;
                }
                int i16 = i11 - i15;
                n.i(y10, objArr3, 0, i16, i11);
                n.i(y10, B, size + 1, i13, i16);
                objArr3 = B;
            }
            Iterator<? extends E> it = collection.iterator();
            j(y10, i13, it);
            for (int i17 = 1; i17 < i12; i17++) {
                objArr2[i17] = j(B(), 0, it);
            }
            j(objArr3, 0, it);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // xn.f
    public E f(int i10) {
        r0.d.a(i10, size());
        ((AbstractList) this).modCount++;
        int a02 = a0();
        if (i10 >= a02) {
            return (E) W(this.B, a02, this.f43785z, i10 - a02);
        }
        d dVar = new d(this.C[0]);
        Object[] objArr = this.B;
        p.e(objArr);
        W(V(objArr, this.f43785z, i10, dVar), a02, this.f43785z, 0);
        return (E) dVar.a();
    }

    public final int f0() {
        return g0(size());
    }

    public final Object[] g(int i10) {
        if (a0() <= i10) {
            return this.C;
        }
        Object[] objArr = this.B;
        p.e(objArr);
        for (int i11 = this.f43785z; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[l.a(i10, i11)];
            Objects.requireNonNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    public final int g0(int i10) {
        return i10 <= 32 ? i10 : i10 - l.d(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        r0.d.a(i10, size());
        return (E) g(i10)[i10 & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    public final Object[] j(Object[] objArr, int i10, Iterator<? extends Object> it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    public final int k() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public final Object[] m() {
        return this.B;
    }

    public final int p() {
        return this.f43785z;
    }

    public final Object[] r() {
        return this.C;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        p.h(collection, "elements");
        return U(new a(collection));
    }

    public final void s(Collection<? extends E> collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.B != null) {
            int i13 = i10 >> 5;
            Object[] d02 = d0(i13, i11, objArr, i12, objArr2);
            int a02 = i12 - (((a0() >> 5) - 1) - i13);
            if (a02 < i12) {
                objArr2 = objArr[a02];
                p.e(objArr2);
            }
            e0(collection, i10, d02, 32, objArr, a02, objArr2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        r0.d.a(i10, size());
        if (a0() <= i10) {
            Object[] y10 = y(this.C);
            if (y10 != this.C) {
                ((AbstractList) this).modCount++;
            }
            int i11 = i10 & 31;
            E e11 = (E) y10[i11];
            y10[i11] = e10;
            this.C = y10;
            return e11;
        }
        d dVar = new d(null);
        Object[] objArr = this.B;
        p.e(objArr);
        this.B = b0(objArr, this.f43785z, i10, e10, dVar);
        return (E) dVar.a();
    }

    public final Object[] t(Object[] objArr, int i10, int i11, Object obj, d dVar) {
        int a10 = l.a(i11, i10);
        if (i10 == 0) {
            dVar.b(objArr[31]);
            Object[] i12 = n.i(objArr, y(objArr), a10 + 1, a10, 31);
            i12[a10] = obj;
            return i12;
        }
        Object[] y10 = y(objArr);
        int i13 = i10 - 5;
        Object obj2 = y10[a10];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        y10[a10] = t((Object[]) obj2, i13, i11, obj, dVar);
        while (true) {
            a10++;
            if (a10 >= 32 || y10[a10] == null) {
                break;
            }
            Object obj3 = y10[a10];
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            y10[a10] = t((Object[]) obj3, i13, 0, dVar.a(), dVar);
        }
        return y10;
    }

    public final void u(Object[] objArr, int i10, E e10) {
        int f02 = f0();
        Object[] y10 = y(this.C);
        if (f02 < 32) {
            n.i(this.C, y10, i10 + 1, i10, f02);
            y10[i10] = e10;
            this.B = objArr;
            this.C = y10;
            this.D = size() + 1;
            return;
        }
        Object[] objArr2 = this.C;
        Object obj = objArr2[31];
        n.i(objArr2, y10, i10 + 1, i10, 31);
        y10[i10] = e10;
        N(objArr, y10, D(obj));
    }

    public final boolean w(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.A;
    }

    public final ListIterator<Object[]> x(int i10) {
        if (this.B != null) {
            int a02 = a0() >> 5;
            r0.d.b(i10, a02);
            int i11 = this.f43785z;
            if (i11 == 0) {
                Object[] objArr = this.B;
                p.e(objArr);
                return new i(objArr, i10);
            }
            Object[] objArr2 = this.B;
            p.e(objArr2);
            return new k(objArr2, i10, a02, i11 / 5);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final Object[] y(Object[] objArr) {
        if (objArr == null) {
            return B();
        }
        return w(objArr) ? objArr : n.m(objArr, B(), 0, 0, po.n.i(objArr.length, 32), 6, null);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i10) {
        r0.d.b(i10, size());
        return new h(this, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        r0.d.b(i10, size());
        if (i10 == size()) {
            add(e10);
            return;
        }
        ((AbstractList) this).modCount++;
        int a02 = a0();
        if (i10 >= a02) {
            u(this.B, i10 - a02, e10);
            return;
        }
        d dVar = new d(null);
        Object[] objArr = this.B;
        p.e(objArr);
        u(t(objArr, this.f43785z, i10, e10, dVar), 0, dVar.a());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        Object[] i11;
        p.h(collection, "elements");
        r0.d.b(i10, size());
        if (i10 == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i12 = (i10 >> 5) << 5;
        int size = (((size() - i12) + collection.size()) - 1) / 32;
        if (size == 0) {
            r0.a.a(i10 >= a0());
            int i13 = i10 & 31;
            Object[] objArr = this.C;
            Object[] i14 = n.i(objArr, y(objArr), (((i10 + collection.size()) - 1) & 31) + 1, i13, f0());
            j(i14, i13, collection.iterator());
            this.C = i14;
            this.D = size() + collection.size();
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int f02 = f0();
        int g02 = g0(size() + collection.size());
        if (i10 >= a0()) {
            i11 = B();
            e0(collection, i10, this.C, f02, objArr2, size, i11);
        } else if (g02 > f02) {
            int i15 = g02 - f02;
            i11 = A(this.C, i15);
            s(collection, i10, i15, objArr2, size, i11);
        } else {
            int i16 = f02 - g02;
            i11 = n.i(this.C, B(), 0, i16, f02);
            int i17 = 32 - i16;
            Object[] A = A(this.C, i17);
            int i18 = size - 1;
            objArr2[i18] = A;
            s(collection, i10, i17, objArr2, i18, A);
        }
        this.B = M(this.B, i12, objArr2);
        this.C = i11;
        this.D = size() + collection.size();
        return true;
    }
}
