package v0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public int f56494a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f56495b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    public int[] f56496c = new int[16];

    /* renamed from: d  reason: collision with root package name */
    public int[] f56497d;

    /* renamed from: e  reason: collision with root package name */
    public int f56498e;

    public j() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.f56497d = iArr;
    }

    public final int a(int i10) {
        c(this.f56494a + 1);
        int i11 = this.f56494a;
        this.f56494a = i11 + 1;
        int b10 = b();
        this.f56495b[i11] = i10;
        this.f56496c[i11] = b10;
        this.f56497d[b10] = i11;
        h(i11);
        return b10;
    }

    public final int b() {
        int length = this.f56497d.length;
        if (this.f56498e >= length) {
            int i10 = 0;
            int i11 = length * 2;
            int[] iArr = new int[i11];
            while (i10 < i11) {
                int i12 = i10 + 1;
                iArr[i10] = i12;
                i10 = i12;
            }
            xn.n.l(this.f56497d, iArr, 0, 0, 0, 14, null);
            this.f56497d = iArr;
        }
        int i13 = this.f56498e;
        this.f56498e = this.f56497d[i13];
        return i13;
    }

    public final void c(int i10) {
        int[] iArr = this.f56495b;
        int length = iArr.length;
        if (i10 <= length) {
            return;
        }
        int i11 = length * 2;
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        xn.n.l(iArr, iArr2, 0, 0, 0, 14, null);
        xn.n.l(this.f56496c, iArr3, 0, 0, 0, 14, null);
        this.f56495b = iArr2;
        this.f56496c = iArr3;
    }

    public final void d(int i10) {
        this.f56497d[i10] = this.f56498e;
        this.f56498e = i10;
    }

    public final int e(int i10) {
        return this.f56494a > 0 ? this.f56495b[0] : i10;
    }

    public final void f(int i10) {
        int i11 = this.f56497d[i10];
        i(i11, this.f56494a - 1);
        this.f56494a--;
        h(i11);
        g(i11);
        d(i10);
    }

    public final void g(int i10) {
        int[] iArr = this.f56495b;
        int i11 = this.f56494a >> 1;
        while (i10 < i11) {
            int i12 = (i10 + 1) << 1;
            int i13 = i12 - 1;
            if (i12 < this.f56494a && iArr[i12] < iArr[i13]) {
                if (iArr[i12] >= iArr[i10]) {
                    return;
                }
                i(i12, i10);
                i10 = i12;
            } else if (iArr[i13] >= iArr[i10]) {
                return;
            } else {
                i(i13, i10);
                i10 = i13;
            }
        }
    }

    public final void h(int i10) {
        int[] iArr = this.f56495b;
        int i11 = iArr[i10];
        while (i10 > 0) {
            int i12 = ((i10 + 1) >> 1) - 1;
            if (iArr[i12] <= i11) {
                return;
            }
            i(i12, i10);
            i10 = i12;
        }
    }

    public final void i(int i10, int i11) {
        int[] iArr = this.f56495b;
        int[] iArr2 = this.f56496c;
        int[] iArr3 = this.f56497d;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = iArr2[i10];
        iArr2[i10] = iArr2[i11];
        iArr2[i11] = i13;
        iArr3[iArr2[i10]] = i10;
        iArr3[iArr2[i11]] = i11;
    }
}
