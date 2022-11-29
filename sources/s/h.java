package s;

/* loaded from: classes.dex */
public class h<E> implements Cloneable {
    public static final Object A = new Object();

    /* renamed from: w  reason: collision with root package name */
    public boolean f51779w;

    /* renamed from: x  reason: collision with root package name */
    public int[] f51780x;

    /* renamed from: y  reason: collision with root package name */
    public Object[] f51781y;

    /* renamed from: z  reason: collision with root package name */
    public int f51782z;

    public h() {
        this(10);
    }

    public void b(int i10, E e10) {
        int i11 = this.f51782z;
        if (i11 != 0 && i10 <= this.f51780x[i11 - 1]) {
            n(i10, e10);
            return;
        }
        if (this.f51779w && i11 >= this.f51780x.length) {
            g();
        }
        int i12 = this.f51782z;
        if (i12 >= this.f51780x.length) {
            int e11 = c.e(i12 + 1);
            int[] iArr = new int[e11];
            Object[] objArr = new Object[e11];
            int[] iArr2 = this.f51780x;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f51781y;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f51780x = iArr;
            this.f51781y = objArr;
        }
        this.f51780x[i12] = i10;
        this.f51781y[i12] = e10;
        this.f51782z = i12 + 1;
    }

    public void c() {
        int i10 = this.f51782z;
        Object[] objArr = this.f51781y;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f51782z = 0;
        this.f51779w = false;
    }

    /* renamed from: e */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f51780x = (int[]) this.f51780x.clone();
            hVar.f51781y = (Object[]) this.f51781y.clone();
            return hVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean f(int i10) {
        return k(i10) >= 0;
    }

    public final void g() {
        int i10 = this.f51782z;
        int[] iArr = this.f51780x;
        Object[] objArr = this.f51781y;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != A) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f51779w = false;
        this.f51782z = i11;
    }

    public E h(int i10) {
        return i(i10, null);
    }

    public E i(int i10, E e10) {
        int a10 = c.a(this.f51780x, this.f51782z, i10);
        if (a10 >= 0) {
            Object[] objArr = this.f51781y;
            if (objArr[a10] != A) {
                return (E) objArr[a10];
            }
        }
        return e10;
    }

    public int k(int i10) {
        if (this.f51779w) {
            g();
        }
        return c.a(this.f51780x, this.f51782z, i10);
    }

    public int l(E e10) {
        if (this.f51779w) {
            g();
        }
        for (int i10 = 0; i10 < this.f51782z; i10++) {
            if (this.f51781y[i10] == e10) {
                return i10;
            }
        }
        return -1;
    }

    public int m(int i10) {
        if (this.f51779w) {
            g();
        }
        return this.f51780x[i10];
    }

    public void n(int i10, E e10) {
        int a10 = c.a(this.f51780x, this.f51782z, i10);
        if (a10 >= 0) {
            this.f51781y[a10] = e10;
            return;
        }
        int i11 = ~a10;
        int i12 = this.f51782z;
        if (i11 < i12) {
            Object[] objArr = this.f51781y;
            if (objArr[i11] == A) {
                this.f51780x[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f51779w && i12 >= this.f51780x.length) {
            g();
            i11 = ~c.a(this.f51780x, this.f51782z, i10);
        }
        int i13 = this.f51782z;
        if (i13 >= this.f51780x.length) {
            int e11 = c.e(i13 + 1);
            int[] iArr = new int[e11];
            Object[] objArr2 = new Object[e11];
            int[] iArr2 = this.f51780x;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f51781y;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f51780x = iArr;
            this.f51781y = objArr2;
        }
        int i14 = this.f51782z;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f51780x;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f51781y;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f51782z - i11);
        }
        this.f51780x[i11] = i10;
        this.f51781y[i11] = e10;
        this.f51782z++;
    }

    public void o(int i10) {
        int a10 = c.a(this.f51780x, this.f51782z, i10);
        if (a10 >= 0) {
            Object[] objArr = this.f51781y;
            Object obj = objArr[a10];
            Object obj2 = A;
            if (obj != obj2) {
                objArr[a10] = obj2;
                this.f51779w = true;
            }
        }
    }

    public void q(int i10) {
        Object[] objArr = this.f51781y;
        Object obj = objArr[i10];
        Object obj2 = A;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f51779w = true;
        }
    }

    public int r() {
        if (this.f51779w) {
            g();
        }
        return this.f51782z;
    }

    public E s(int i10) {
        if (this.f51779w) {
            g();
        }
        return (E) this.f51781y[i10];
    }

    public String toString() {
        if (r() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f51782z * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f51782z; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(m(i10));
            sb2.append('=');
            E s10 = s(i10);
            if (s10 != this) {
                sb2.append(s10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public h(int i10) {
        this.f51779w = false;
        if (i10 == 0) {
            this.f51780x = c.f51765a;
            this.f51781y = c.f51767c;
            return;
        }
        int e10 = c.e(i10);
        this.f51780x = new int[e10];
        this.f51781y = new Object[e10];
    }
}
