package q2;

import java.util.Arrays;
import q2.b;

/* loaded from: classes.dex */
public class j implements b.a {

    /* renamed from: n  reason: collision with root package name */
    public static float f48701n = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    public final int f48702a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f48703b = 16;

    /* renamed from: c  reason: collision with root package name */
    public int f48704c = 16;

    /* renamed from: d  reason: collision with root package name */
    public int[] f48705d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    public int[] f48706e = new int[16];

    /* renamed from: f  reason: collision with root package name */
    public int[] f48707f = new int[16];

    /* renamed from: g  reason: collision with root package name */
    public float[] f48708g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    public int[] f48709h = new int[16];

    /* renamed from: i  reason: collision with root package name */
    public int[] f48710i = new int[16];

    /* renamed from: j  reason: collision with root package name */
    public int f48711j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f48712k = -1;

    /* renamed from: l  reason: collision with root package name */
    public final b f48713l;

    /* renamed from: m  reason: collision with root package name */
    public final c f48714m;

    public j(b bVar, c cVar) {
        this.f48713l = bVar;
        this.f48714m = cVar;
        clear();
    }

    @Override // q2.b.a
    public void a(i iVar, float f10) {
        float f11 = f48701n;
        if (f10 > (-f11) && f10 < f11) {
            g(iVar, true);
            return;
        }
        if (this.f48711j == 0) {
            m(0, iVar, f10);
            l(iVar, 0);
            this.f48712k = 0;
            return;
        }
        int p10 = p(iVar);
        if (p10 != -1) {
            this.f48708g[p10] = f10;
            return;
        }
        if (this.f48711j + 1 >= this.f48703b) {
            o();
        }
        int i10 = this.f48711j;
        int i11 = this.f48712k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int[] iArr = this.f48707f;
            int i14 = iArr[i11];
            int i15 = iVar.f48699y;
            if (i14 == i15) {
                this.f48708g[i11] = f10;
                return;
            }
            if (iArr[i11] < i15) {
                i12 = i11;
            }
            i11 = this.f48710i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f10);
    }

    @Override // q2.b.a
    public i b(int i10) {
        int i11 = this.f48711j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f48712k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f48714m.f48657d[this.f48707f[i12]];
            }
            i12 = this.f48710i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // q2.b.a
    public boolean c(i iVar) {
        return p(iVar) != -1;
    }

    @Override // q2.b.a
    public void clear() {
        int i10 = this.f48711j;
        for (int i11 = 0; i11 < i10; i11++) {
            i b10 = b(i11);
            if (b10 != null) {
                b10.h(this.f48713l);
            }
        }
        for (int i12 = 0; i12 < this.f48703b; i12++) {
            this.f48707f[i12] = -1;
            this.f48706e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f48704c; i13++) {
            this.f48705d[i13] = -1;
        }
        this.f48711j = 0;
        this.f48712k = -1;
    }

    @Override // q2.b.a
    public void d() {
        int i10 = this.f48711j;
        int i11 = this.f48712k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f48708g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f48710i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // q2.b.a
    public float e(i iVar) {
        int p10 = p(iVar);
        if (p10 != -1) {
            return this.f48708g[p10];
        }
        return 0.0f;
    }

    @Override // q2.b.a
    public void f(i iVar, float f10, boolean z10) {
        float f11 = f48701n;
        if (f10 <= (-f11) || f10 >= f11) {
            int p10 = p(iVar);
            if (p10 == -1) {
                a(iVar, f10);
                return;
            }
            float[] fArr = this.f48708g;
            fArr[p10] = fArr[p10] + f10;
            float f12 = fArr[p10];
            float f13 = f48701n;
            if (f12 <= (-f13) || fArr[p10] >= f13) {
                return;
            }
            fArr[p10] = 0.0f;
            g(iVar, z10);
        }
    }

    @Override // q2.b.a
    public float g(i iVar, boolean z10) {
        int p10 = p(iVar);
        if (p10 == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f48708g[p10];
        if (this.f48712k == p10) {
            this.f48712k = this.f48710i[p10];
        }
        this.f48707f[p10] = -1;
        int[] iArr = this.f48709h;
        if (iArr[p10] != -1) {
            int[] iArr2 = this.f48710i;
            iArr2[iArr[p10]] = iArr2[p10];
        }
        int[] iArr3 = this.f48710i;
        if (iArr3[p10] != -1) {
            iArr[iArr3[p10]] = iArr[p10];
        }
        this.f48711j--;
        iVar.I--;
        if (z10) {
            iVar.h(this.f48713l);
        }
        return f10;
    }

    @Override // q2.b.a
    public int h() {
        return this.f48711j;
    }

    @Override // q2.b.a
    public float i(b bVar, boolean z10) {
        float e10 = e(bVar.f48648a);
        g(bVar.f48648a, z10);
        j jVar = (j) bVar.f48652e;
        int h10 = jVar.h();
        int i10 = 0;
        int i11 = 0;
        while (i10 < h10) {
            int[] iArr = jVar.f48707f;
            if (iArr[i11] != -1) {
                f(this.f48714m.f48657d[iArr[i11]], jVar.f48708g[i11] * e10, z10);
                i10++;
            }
            i11++;
        }
        return e10;
    }

    @Override // q2.b.a
    public float j(int i10) {
        int i11 = this.f48711j;
        int i12 = this.f48712k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f48708g[i12];
            }
            i12 = this.f48710i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // q2.b.a
    public void k(float f10) {
        int i10 = this.f48711j;
        int i11 = this.f48712k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f48708g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f48710i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    public final void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f48699y % this.f48704c;
        int[] iArr2 = this.f48705d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f48706e;
                if (iArr[i12] == -1) {
                    break;
                }
                i12 = iArr[i12];
            }
            iArr[i12] = i10;
        }
        this.f48706e[i10] = -1;
    }

    public final void m(int i10, i iVar, float f10) {
        this.f48707f[i10] = iVar.f48699y;
        this.f48708g[i10] = f10;
        this.f48709h[i10] = -1;
        this.f48710i[i10] = -1;
        iVar.a(this.f48713l);
        iVar.I++;
        this.f48711j++;
    }

    public final int n() {
        for (int i10 = 0; i10 < this.f48703b; i10++) {
            if (this.f48707f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    public final void o() {
        int i10 = this.f48703b * 2;
        this.f48707f = Arrays.copyOf(this.f48707f, i10);
        this.f48708g = Arrays.copyOf(this.f48708g, i10);
        this.f48709h = Arrays.copyOf(this.f48709h, i10);
        this.f48710i = Arrays.copyOf(this.f48710i, i10);
        this.f48706e = Arrays.copyOf(this.f48706e, i10);
        for (int i11 = this.f48703b; i11 < i10; i11++) {
            this.f48707f[i11] = -1;
            this.f48706e[i11] = -1;
        }
        this.f48703b = i10;
    }

    public int p(i iVar) {
        int[] iArr;
        if (this.f48711j != 0 && iVar != null) {
            int i10 = iVar.f48699y;
            int i11 = this.f48705d[i10 % this.f48704c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f48707f[i11] == i10) {
                return i11;
            }
            while (true) {
                iArr = this.f48706e;
                if (iArr[i11] == -1 || this.f48707f[iArr[i11]] == i10) {
                    break;
                }
                i11 = iArr[i11];
            }
            if (iArr[i11] != -1 && this.f48707f[iArr[i11]] == i10) {
                return iArr[i11];
            }
        }
        return -1;
    }

    public final void q(int i10, i iVar, float f10) {
        int n10 = n();
        m(n10, iVar, f10);
        if (i10 != -1) {
            this.f48709h[n10] = i10;
            int[] iArr = this.f48710i;
            iArr[n10] = iArr[i10];
            iArr[i10] = n10;
        } else {
            this.f48709h[n10] = -1;
            if (this.f48711j > 0) {
                this.f48710i[n10] = this.f48712k;
                this.f48712k = n10;
            } else {
                this.f48710i[n10] = -1;
            }
        }
        int[] iArr2 = this.f48710i;
        if (iArr2[n10] != -1) {
            this.f48709h[iArr2[n10]] = n10;
        }
        l(iVar, n10);
    }

    public final void r(i iVar) {
        int[] iArr;
        int i10 = iVar.f48699y;
        int i11 = i10 % this.f48704c;
        int[] iArr2 = this.f48705d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            return;
        }
        if (this.f48707f[i12] == i10) {
            int[] iArr3 = this.f48706e;
            iArr2[i11] = iArr3[i12];
            iArr3[i12] = -1;
            return;
        }
        while (true) {
            iArr = this.f48706e;
            if (iArr[i12] == -1 || this.f48707f[iArr[i12]] == i10) {
                break;
            }
            i12 = iArr[i12];
        }
        int i13 = iArr[i12];
        if (i13 == -1 || this.f48707f[i13] != i10) {
            return;
        }
        iArr[i12] = iArr[i13];
        iArr[i13] = -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f48711j;
        for (int i11 = 0; i11 < i10; i11++) {
            i b10 = b(i11);
            if (b10 != null) {
                String str2 = str + b10 + " = " + j(i11) + " ";
                int p10 = p(b10);
                String str3 = str2 + "[p: ";
                String str4 = (this.f48709h[p10] != -1 ? str3 + this.f48714m.f48657d[this.f48707f[this.f48709h[p10]]] : str3 + "none") + ", n: ";
                str = (this.f48710i[p10] != -1 ? str4 + this.f48714m.f48657d[this.f48707f[this.f48710i[p10]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
