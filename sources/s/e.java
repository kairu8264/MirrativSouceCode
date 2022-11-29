package s;

/* loaded from: classes.dex */
public class e<E> implements Cloneable {
    public static final Object A = new Object();

    /* renamed from: w  reason: collision with root package name */
    public boolean f51771w;

    /* renamed from: x  reason: collision with root package name */
    public long[] f51772x;

    /* renamed from: y  reason: collision with root package name */
    public Object[] f51773y;

    /* renamed from: z  reason: collision with root package name */
    public int f51774z;

    public e() {
        this(10);
    }

    public void b(long j10, E e10) {
        int i10 = this.f51774z;
        if (i10 != 0 && j10 <= this.f51772x[i10 - 1]) {
            m(j10, e10);
            return;
        }
        if (this.f51771w && i10 >= this.f51772x.length) {
            g();
        }
        int i11 = this.f51774z;
        if (i11 >= this.f51772x.length) {
            int f10 = c.f(i11 + 1);
            long[] jArr = new long[f10];
            Object[] objArr = new Object[f10];
            long[] jArr2 = this.f51772x;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f51773y;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f51772x = jArr;
            this.f51773y = objArr;
        }
        this.f51772x[i11] = j10;
        this.f51773y[i11] = e10;
        this.f51774z = i11 + 1;
    }

    public void c() {
        int i10 = this.f51774z;
        Object[] objArr = this.f51773y;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f51774z = 0;
        this.f51771w = false;
    }

    /* renamed from: e */
    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f51772x = (long[]) this.f51772x.clone();
            eVar.f51773y = (Object[]) this.f51773y.clone();
            return eVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean f(long j10) {
        return k(j10) >= 0;
    }

    public final void g() {
        int i10 = this.f51774z;
        long[] jArr = this.f51772x;
        Object[] objArr = this.f51773y;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != A) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f51771w = false;
        this.f51774z = i11;
    }

    public E h(long j10) {
        return i(j10, null);
    }

    public E i(long j10, E e10) {
        int b10 = c.b(this.f51772x, this.f51774z, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f51773y;
            if (objArr[b10] != A) {
                return (E) objArr[b10];
            }
        }
        return e10;
    }

    public int k(long j10) {
        if (this.f51771w) {
            g();
        }
        return c.b(this.f51772x, this.f51774z, j10);
    }

    public long l(int i10) {
        if (this.f51771w) {
            g();
        }
        return this.f51772x[i10];
    }

    public void m(long j10, E e10) {
        int b10 = c.b(this.f51772x, this.f51774z, j10);
        if (b10 >= 0) {
            this.f51773y[b10] = e10;
            return;
        }
        int i10 = ~b10;
        int i11 = this.f51774z;
        if (i10 < i11) {
            Object[] objArr = this.f51773y;
            if (objArr[i10] == A) {
                this.f51772x[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f51771w && i11 >= this.f51772x.length) {
            g();
            i10 = ~c.b(this.f51772x, this.f51774z, j10);
        }
        int i12 = this.f51774z;
        if (i12 >= this.f51772x.length) {
            int f10 = c.f(i12 + 1);
            long[] jArr = new long[f10];
            Object[] objArr2 = new Object[f10];
            long[] jArr2 = this.f51772x;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f51773y;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f51772x = jArr;
            this.f51773y = objArr2;
        }
        int i13 = this.f51774z;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f51772x;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f51773y;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f51774z - i10);
        }
        this.f51772x[i10] = j10;
        this.f51773y[i10] = e10;
        this.f51774z++;
    }

    public void n(long j10) {
        int b10 = c.b(this.f51772x, this.f51774z, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f51773y;
            Object obj = objArr[b10];
            Object obj2 = A;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.f51771w = true;
            }
        }
    }

    public void o(int i10) {
        Object[] objArr = this.f51773y;
        Object obj = objArr[i10];
        Object obj2 = A;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f51771w = true;
        }
    }

    public int q() {
        if (this.f51771w) {
            g();
        }
        return this.f51774z;
    }

    public E r(int i10) {
        if (this.f51771w) {
            g();
        }
        return (E) this.f51773y[i10];
    }

    public String toString() {
        if (q() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f51774z * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f51774z; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(l(i10));
            sb2.append('=');
            E r10 = r(i10);
            if (r10 != this) {
                sb2.append(r10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public e(int i10) {
        this.f51771w = false;
        if (i10 == 0) {
            this.f51772x = c.f51766b;
            this.f51773y = c.f51767c;
            return;
        }
        int f10 = c.f(i10);
        this.f51772x = new long[f10];
        this.f51773y = new Object[f10];
    }
}
