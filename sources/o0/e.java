package o0;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.Objects;
import jo.p;
import po.n;

/* loaded from: classes.dex */
public final class e<E> extends b<E> {
    public final int A;

    /* renamed from: x  reason: collision with root package name */
    public final Object[] f43779x;

    /* renamed from: y  reason: collision with root package name */
    public final Object[] f43780y;

    /* renamed from: z  reason: collision with root package name */
    public final int f43781z;

    public e(Object[] objArr, Object[] objArr2, int i10, int i11) {
        p.h(objArr, "root");
        p.h(objArr2, "tail");
        this.f43779x = objArr;
        this.f43780y = objArr2;
        this.f43781z = i10;
        this.A = i11;
        if (size() > 32) {
            r0.a.a(size() - l.d(size()) <= n.i(objArr2.length, 32));
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
    }

    @Override // n0.e
    public n0.e<E> O(int i10) {
        r0.d.a(i10, size());
        int w10 = w();
        if (i10 >= w10) {
            return u(this.f43779x, w10, this.A, i10 - w10);
        }
        return u(t(this.f43779x, this.A, i10, new d(this.f43780y[0])), w10, this.A, 0);
    }

    @Override // xn.a, java.util.Collection, java.util.List, n0.e
    public n0.e<E> add(E e10) {
        int size = size() - w();
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(this.f43780y, 32);
            p.g(copyOf, "copyOf(this, newSize)");
            copyOf[size] = e10;
            return new e(this.f43779x, copyOf, size() + 1, this.A);
        }
        return r(this.f43779x, this.f43780y, l.c(e10));
    }

    @Override // xn.a
    public int d() {
        return this.f43781z;
    }

    public final Object[] f(int i10) {
        if (w() <= i10) {
            return this.f43780y;
        }
        Object[] objArr = this.f43779x;
        for (int i11 = this.A; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[l.a(i10, i11)];
            Objects.requireNonNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // n0.e
    /* renamed from: g */
    public f<E> n() {
        return new f<>(this, this.f43779x, this.f43780y, this.A);
    }

    @Override // xn.c, java.util.List
    public E get(int i10) {
        r0.d.a(i10, size());
        return (E) f(i10)[i10 & 31];
    }

    public final Object[] j(Object[] objArr, int i10, int i11, Object obj, d dVar) {
        Object[] copyOf;
        int a10 = l.a(i11, i10);
        if (i10 == 0) {
            if (a10 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                p.g(copyOf, "copyOf(this, newSize)");
            }
            xn.n.i(objArr, copyOf, a10 + 1, a10, 31);
            dVar.b(objArr[31]);
            copyOf[a10] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        p.g(copyOf2, "copyOf(this, newSize)");
        int i12 = i10 - 5;
        Object obj2 = objArr[a10];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[a10] = j((Object[]) obj2, i12, i11, obj, dVar);
        int i13 = a10 + 1;
        while (i13 < 32 && copyOf2[i13] != null) {
            Object obj3 = objArr[i13];
            Objects.requireNonNull(obj3, str);
            Object[] objArr2 = copyOf2;
            objArr2[i13] = j((Object[]) obj3, i12, 0, dVar.a(), dVar);
            i13++;
            copyOf2 = objArr2;
            str = str;
        }
        return copyOf2;
    }

    public final e<E> k(Object[] objArr, int i10, Object obj) {
        int size = size() - w();
        Object[] copyOf = Arrays.copyOf(this.f43780y, 32);
        p.g(copyOf, "copyOf(this, newSize)");
        if (size < 32) {
            xn.n.i(this.f43780y, copyOf, i10 + 1, i10, size);
            copyOf[i10] = obj;
            return new e<>(objArr, copyOf, size() + 1, this.A);
        }
        Object[] objArr2 = this.f43780y;
        Object obj2 = objArr2[31];
        xn.n.i(objArr2, copyOf, i10 + 1, i10, size - 1);
        copyOf[i10] = obj;
        return r(objArr, copyOf, l.c(obj2));
    }

    @Override // xn.c, java.util.List
    public ListIterator<E> listIterator(int i10) {
        r0.d.b(i10, size());
        return new g(this.f43779x, this.f43780y, i10, size(), (this.A / 5) + 1);
    }

    public final Object[] m(Object[] objArr, int i10, int i11, d dVar) {
        Object[] m10;
        int a10 = l.a(i11, i10);
        if (i10 == 5) {
            dVar.b(objArr[a10]);
            m10 = null;
        } else {
            Object obj = objArr[a10];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            m10 = m((Object[]) obj, i10 - 5, i11, dVar);
        }
        if (m10 == null && a10 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        p.g(copyOf, "copyOf(this, newSize)");
        copyOf[a10] = m10;
        return copyOf;
    }

    public final n0.e<E> p(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                p.g(objArr, "copyOf(this, newSize)");
            }
            return new j(objArr);
        }
        d dVar = new d(null);
        Object[] m10 = m(objArr, i11, i10 - 1, dVar);
        p.e(m10);
        Object a10 = dVar.a();
        Objects.requireNonNull(a10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) a10;
        if (m10[1] == null) {
            Object obj = m10[0];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            return new e((Object[]) obj, objArr2, i10, i11 - 5);
        }
        return new e(m10, objArr2, i10, i11);
    }

    public final e<E> r(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.A;
        if (size > (1 << i10)) {
            Object[] c10 = l.c(objArr);
            int i11 = this.A + 5;
            return new e<>(s(c10, i11, objArr2), objArr3, size() + 1, i11);
        }
        return new e<>(s(objArr, i10, objArr2), objArr3, size() + 1, this.A);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r4 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object[] s(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r0 = o0.l.a(r0, r5)
            r1 = 32
            if (r4 == 0) goto L19
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(this, newSize)"
            jo.p.g(r4, r2)
            if (r4 != 0) goto L1b
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r5 != r1) goto L21
            r4[r0] = r6
            goto L2c
        L21:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.s(r2, r5, r6)
            r4[r0] = r5
        L2c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.e.s(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    @Override // xn.c, java.util.List, n0.e
    public n0.e<E> set(int i10, E e10) {
        r0.d.a(i10, size());
        if (w() <= i10) {
            Object[] copyOf = Arrays.copyOf(this.f43780y, 32);
            p.g(copyOf, "copyOf(this, newSize)");
            copyOf[i10 & 31] = e10;
            return new e(this.f43779x, copyOf, size(), this.A);
        }
        return new e(x(this.f43779x, this.A, i10, e10), this.f43780y, size(), this.A);
    }

    public final Object[] t(Object[] objArr, int i10, int i11, d dVar) {
        Object[] copyOf;
        int a10 = l.a(i11, i10);
        if (i10 == 0) {
            if (a10 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                p.g(copyOf, "copyOf(this, newSize)");
            }
            xn.n.i(objArr, copyOf, a10, a10 + 1, 32);
            copyOf[31] = dVar.a();
            dVar.b(objArr[a10]);
            return copyOf;
        }
        int a11 = objArr[31] == null ? l.a(w() - 1, i10) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        p.g(copyOf2, "copyOf(this, newSize)");
        int i12 = i10 - 5;
        int i13 = a10 + 1;
        if (i13 <= a11) {
            while (true) {
                Object obj = copyOf2[a11];
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[a11] = t((Object[]) obj, i12, 0, dVar);
                if (a11 == i13) {
                    break;
                }
                a11--;
            }
        }
        Object obj2 = copyOf2[a10];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[a10] = t((Object[]) obj2, i12, i11, dVar);
        return copyOf2;
    }

    public final n0.e<E> u(Object[] objArr, int i10, int i11, int i12) {
        int size = size() - i10;
        r0.a.a(i12 < size);
        if (size == 1) {
            return p(objArr, i10, i11);
        }
        Object[] copyOf = Arrays.copyOf(this.f43780y, 32);
        p.g(copyOf, "copyOf(this, newSize)");
        int i13 = size - 1;
        if (i12 < i13) {
            xn.n.i(this.f43780y, copyOf, i12, i12 + 1, size);
        }
        copyOf[i13] = null;
        return new e(objArr, copyOf, (i10 + size) - 1, i11);
    }

    @Override // n0.e
    public n0.e<E> u1(io.l<? super E, Boolean> lVar) {
        p.h(lVar, "predicate");
        f<E> n10 = n();
        n10.U(lVar);
        return n10.a();
    }

    public final int w() {
        return l.d(size());
    }

    public final Object[] x(Object[] objArr, int i10, int i11, Object obj) {
        int a10 = l.a(i11, i10);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        p.g(copyOf, "copyOf(this, newSize)");
        if (i10 == 0) {
            copyOf[a10] = obj;
        } else {
            Object obj2 = copyOf[a10];
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[a10] = x((Object[]) obj2, i10 - 5, i11, obj);
        }
        return copyOf;
    }

    @Override // xn.c, java.util.List, n0.e
    public n0.e<E> add(int i10, E e10) {
        r0.d.b(i10, size());
        if (i10 == size()) {
            return add((e<E>) e10);
        }
        int w10 = w();
        if (i10 >= w10) {
            return k(this.f43779x, i10 - w10, e10);
        }
        d dVar = new d(null);
        return k(j(this.f43779x, this.A, i10, e10, dVar), 0, dVar.a());
    }
}
