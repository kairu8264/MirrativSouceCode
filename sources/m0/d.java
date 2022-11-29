package m0;

import java.util.Arrays;
import jo.p;
import xn.n;

/* loaded from: classes.dex */
public final class d<T> {

    /* renamed from: a  reason: collision with root package name */
    public int[] f40463a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f40464b;

    /* renamed from: c  reason: collision with root package name */
    public c<T>[] f40465c;

    /* renamed from: d  reason: collision with root package name */
    public int f40466d;

    public d() {
        int[] iArr = new int[50];
        for (int i10 = 0; i10 < 50; i10++) {
            iArr[i10] = i10;
        }
        this.f40463a = iArr;
        this.f40464b = new Object[50];
        this.f40465c = new c[50];
    }

    public final boolean c(Object obj, T t10) {
        p.h(obj, "value");
        p.h(t10, "scope");
        return h(obj).add(t10);
    }

    public final void d() {
        int length = this.f40465c.length;
        for (int i10 = 0; i10 < length; i10++) {
            c<T> cVar = this.f40465c[i10];
            if (cVar != null) {
                cVar.clear();
            }
            this.f40463a[i10] = i10;
            this.f40464b[i10] = null;
        }
        this.f40466d = 0;
    }

    public final boolean e(Object obj) {
        p.h(obj, "element");
        return f(obj) >= 0;
    }

    public final int f(Object obj) {
        int a10 = l0.c.a(obj);
        int i10 = this.f40466d - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj2 = this.f40464b[this.f40463a[i12]];
            p.e(obj2);
            int a11 = l0.c.a(obj2);
            if (a11 < a10) {
                i11 = i12 + 1;
            } else if (a11 <= a10) {
                return obj == obj2 ? i12 : g(i12, obj, a10);
            } else {
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        return -(r4 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(int r4, java.lang.Object r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = -1
            if (r1 >= r0) goto L1d
            java.lang.Object[] r1 = r3.f40464b
            int[] r2 = r3.f40463a
            r2 = r2[r0]
            r1 = r1[r2]
            jo.p.e(r1)
            if (r1 != r5) goto L13
            return r0
        L13:
            int r1 = l0.c.a(r1)
            if (r1 == r6) goto L1a
            goto L1d
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.f40466d
        L21:
            if (r4 >= r0) goto L3e
            java.lang.Object[] r1 = r3.f40464b
            int[] r2 = r3.f40463a
            r2 = r2[r4]
            r1 = r1[r2]
            jo.p.e(r1)
            if (r1 != r5) goto L31
            return r4
        L31:
            int r1 = l0.c.a(r1)
            if (r1 == r6) goto L3b
        L37:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L3b:
            int r4 = r4 + 1
            goto L21
        L3e:
            int r4 = r3.f40466d
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.d.g(int, java.lang.Object, int):int");
    }

    public final c<T> h(Object obj) {
        int i10;
        if (this.f40466d > 0) {
            i10 = f(obj);
            if (i10 >= 0) {
                return o(i10);
            }
        } else {
            i10 = -1;
        }
        int i11 = -(i10 + 1);
        int i12 = this.f40466d;
        int[] iArr = this.f40463a;
        if (i12 < iArr.length) {
            int i13 = iArr[i12];
            this.f40464b[i13] = obj;
            c<T> cVar = this.f40465c[i13];
            if (cVar == null) {
                cVar = new c<>();
                this.f40465c[i13] = cVar;
            }
            int i14 = this.f40466d;
            if (i11 < i14) {
                int[] iArr2 = this.f40463a;
                n.g(iArr2, iArr2, i11 + 1, i11, i14);
            }
            this.f40463a[i11] = i13;
            this.f40466d++;
            return cVar;
        }
        int length = iArr.length * 2;
        Object[] copyOf = Arrays.copyOf(this.f40465c, length);
        p.g(copyOf, "copyOf(this, newSize)");
        this.f40465c = (c[]) copyOf;
        c<T> cVar2 = new c<>();
        this.f40465c[i12] = cVar2;
        Object[] copyOf2 = Arrays.copyOf(this.f40464b, length);
        p.g(copyOf2, "copyOf(this, newSize)");
        this.f40464b = copyOf2;
        copyOf2[i12] = obj;
        int[] iArr3 = new int[length];
        int i15 = this.f40466d;
        while (true) {
            i15++;
            if (i15 >= length) {
                break;
            }
            iArr3[i15] = i15;
        }
        int i16 = this.f40466d;
        if (i11 < i16) {
            n.g(this.f40463a, iArr3, i11 + 1, i11, i16);
        }
        iArr3[i11] = i12;
        if (i11 > 0) {
            n.l(this.f40463a, iArr3, 0, 0, i11, 6, null);
        }
        this.f40463a = iArr3;
        this.f40466d++;
        return cVar2;
    }

    public final c<T>[] i() {
        return this.f40465c;
    }

    public final int j() {
        return this.f40466d;
    }

    public final int[] k() {
        return this.f40463a;
    }

    public final Object[] l() {
        return this.f40464b;
    }

    public final boolean m(Object obj, T t10) {
        int i10;
        c<T> cVar;
        p.h(obj, "value");
        p.h(t10, "scope");
        int f10 = f(obj);
        if (f10 < 0 || (cVar = this.f40465c[(i10 = this.f40463a[f10])]) == null) {
            return false;
        }
        boolean remove = cVar.remove(t10);
        if (cVar.size() == 0) {
            int i11 = f10 + 1;
            int i12 = this.f40466d;
            if (i11 < i12) {
                int[] iArr = this.f40463a;
                n.g(iArr, iArr, f10, i11, i12);
            }
            int[] iArr2 = this.f40463a;
            int i13 = this.f40466d;
            iArr2[i13 - 1] = i10;
            this.f40464b[i10] = null;
            this.f40466d = i13 - 1;
        }
        return remove;
    }

    public final void n(T t10) {
        p.h(t10, "scope");
        int j10 = j();
        int i10 = 0;
        for (int i11 = 0; i11 < j10; i11++) {
            int i12 = k()[i11];
            c<T> cVar = i()[i12];
            p.e(cVar);
            cVar.remove(t10);
            if (cVar.size() > 0) {
                if (i10 != i11) {
                    int i13 = k()[i10];
                    k()[i10] = i12;
                    k()[i11] = i13;
                }
                i10++;
            }
        }
        int j11 = j();
        for (int i14 = i10; i14 < j11; i14++) {
            l()[k()[i14]] = null;
        }
        p(i10);
    }

    public final c<T> o(int i10) {
        c<T> cVar = this.f40465c[this.f40463a[i10]];
        p.e(cVar);
        return cVar;
    }

    public final void p(int i10) {
        this.f40466d = i10;
    }
}
