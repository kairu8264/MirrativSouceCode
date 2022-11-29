package q2;

import java.util.Arrays;
import q2.b;

/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: l  reason: collision with root package name */
    public static float f48636l = 0.001f;

    /* renamed from: b  reason: collision with root package name */
    public final b f48638b;

    /* renamed from: c  reason: collision with root package name */
    public final c f48639c;

    /* renamed from: a  reason: collision with root package name */
    public int f48637a = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f48640d = 8;

    /* renamed from: e  reason: collision with root package name */
    public i f48641e = null;

    /* renamed from: f  reason: collision with root package name */
    public int[] f48642f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public int[] f48643g = new int[8];

    /* renamed from: h  reason: collision with root package name */
    public float[] f48644h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    public int f48645i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f48646j = -1;

    /* renamed from: k  reason: collision with root package name */
    public boolean f48647k = false;

    public a(b bVar, c cVar) {
        this.f48638b = bVar;
        this.f48639c = cVar;
    }

    @Override // q2.b.a
    public final void a(i iVar, float f10) {
        if (f10 == 0.0f) {
            g(iVar, true);
            return;
        }
        int i10 = this.f48645i;
        if (i10 == -1) {
            this.f48645i = 0;
            this.f48644h[0] = f10;
            this.f48642f[0] = iVar.f48699y;
            this.f48643g[0] = -1;
            iVar.I++;
            iVar.a(this.f48638b);
            this.f48637a++;
            if (this.f48647k) {
                return;
            }
            int i11 = this.f48646j + 1;
            this.f48646j = i11;
            int[] iArr = this.f48642f;
            if (i11 >= iArr.length) {
                this.f48647k = true;
                this.f48646j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f48637a; i13++) {
            int[] iArr2 = this.f48642f;
            int i14 = iArr2[i10];
            int i15 = iVar.f48699y;
            if (i14 == i15) {
                this.f48644h[i10] = f10;
                return;
            }
            if (iArr2[i10] < i15) {
                i12 = i10;
            }
            i10 = this.f48643g[i10];
        }
        int i16 = this.f48646j;
        int i17 = i16 + 1;
        if (this.f48647k) {
            int[] iArr3 = this.f48642f;
            if (iArr3[i16] != -1) {
                i16 = iArr3.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr4 = this.f48642f;
        if (i16 >= iArr4.length && this.f48637a < iArr4.length) {
            int i18 = 0;
            while (true) {
                int[] iArr5 = this.f48642f;
                if (i18 >= iArr5.length) {
                    break;
                } else if (iArr5[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr6 = this.f48642f;
        if (i16 >= iArr6.length) {
            i16 = iArr6.length;
            int i19 = this.f48640d * 2;
            this.f48640d = i19;
            this.f48647k = false;
            this.f48646j = i16 - 1;
            this.f48644h = Arrays.copyOf(this.f48644h, i19);
            this.f48642f = Arrays.copyOf(this.f48642f, this.f48640d);
            this.f48643g = Arrays.copyOf(this.f48643g, this.f48640d);
        }
        this.f48642f[i16] = iVar.f48699y;
        this.f48644h[i16] = f10;
        if (i12 != -1) {
            int[] iArr7 = this.f48643g;
            iArr7[i16] = iArr7[i12];
            iArr7[i12] = i16;
        } else {
            this.f48643g[i16] = this.f48645i;
            this.f48645i = i16;
        }
        iVar.I++;
        iVar.a(this.f48638b);
        int i20 = this.f48637a + 1;
        this.f48637a = i20;
        if (!this.f48647k) {
            this.f48646j++;
        }
        int[] iArr8 = this.f48642f;
        if (i20 >= iArr8.length) {
            this.f48647k = true;
        }
        if (this.f48646j >= iArr8.length) {
            this.f48647k = true;
            this.f48646j = iArr8.length - 1;
        }
    }

    @Override // q2.b.a
    public i b(int i10) {
        int i11 = this.f48645i;
        for (int i12 = 0; i11 != -1 && i12 < this.f48637a; i12++) {
            if (i12 == i10) {
                return this.f48639c.f48657d[this.f48642f[i11]];
            }
            i11 = this.f48643g[i11];
        }
        return null;
    }

    @Override // q2.b.a
    public boolean c(i iVar) {
        int i10 = this.f48645i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f48637a; i11++) {
            if (this.f48642f[i10] == iVar.f48699y) {
                return true;
            }
            i10 = this.f48643g[i10];
        }
        return false;
    }

    @Override // q2.b.a
    public final void clear() {
        int i10 = this.f48645i;
        for (int i11 = 0; i10 != -1 && i11 < this.f48637a; i11++) {
            i iVar = this.f48639c.f48657d[this.f48642f[i10]];
            if (iVar != null) {
                iVar.h(this.f48638b);
            }
            i10 = this.f48643g[i10];
        }
        this.f48645i = -1;
        this.f48646j = -1;
        this.f48647k = false;
        this.f48637a = 0;
    }

    @Override // q2.b.a
    public void d() {
        int i10 = this.f48645i;
        for (int i11 = 0; i10 != -1 && i11 < this.f48637a; i11++) {
            float[] fArr = this.f48644h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f48643g[i10];
        }
    }

    @Override // q2.b.a
    public final float e(i iVar) {
        int i10 = this.f48645i;
        for (int i11 = 0; i10 != -1 && i11 < this.f48637a; i11++) {
            if (this.f48642f[i10] == iVar.f48699y) {
                return this.f48644h[i10];
            }
            i10 = this.f48643g[i10];
        }
        return 0.0f;
    }

    @Override // q2.b.a
    public void f(i iVar, float f10, boolean z10) {
        float f11 = f48636l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f48645i;
            if (i10 == -1) {
                this.f48645i = 0;
                this.f48644h[0] = f10;
                this.f48642f[0] = iVar.f48699y;
                this.f48643g[0] = -1;
                iVar.I++;
                iVar.a(this.f48638b);
                this.f48637a++;
                if (this.f48647k) {
                    return;
                }
                int i11 = this.f48646j + 1;
                this.f48646j = i11;
                int[] iArr = this.f48642f;
                if (i11 >= iArr.length) {
                    this.f48647k = true;
                    this.f48646j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f48637a; i13++) {
                int[] iArr2 = this.f48642f;
                int i14 = iArr2[i10];
                int i15 = iVar.f48699y;
                if (i14 == i15) {
                    float[] fArr = this.f48644h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f48636l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f48645i) {
                            this.f48645i = this.f48643g[i10];
                        } else {
                            int[] iArr3 = this.f48643g;
                            iArr3[i12] = iArr3[i10];
                        }
                        if (z10) {
                            iVar.h(this.f48638b);
                        }
                        if (this.f48647k) {
                            this.f48646j = i10;
                        }
                        iVar.I--;
                        this.f48637a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i10] < i15) {
                    i12 = i10;
                }
                i10 = this.f48643g[i10];
            }
            int i16 = this.f48646j;
            int i17 = i16 + 1;
            if (this.f48647k) {
                int[] iArr4 = this.f48642f;
                if (iArr4[i16] != -1) {
                    i16 = iArr4.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr5 = this.f48642f;
            if (i16 >= iArr5.length && this.f48637a < iArr5.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr6 = this.f48642f;
                    if (i18 >= iArr6.length) {
                        break;
                    } else if (iArr6[i18] == -1) {
                        i16 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int[] iArr7 = this.f48642f;
            if (i16 >= iArr7.length) {
                i16 = iArr7.length;
                int i19 = this.f48640d * 2;
                this.f48640d = i19;
                this.f48647k = false;
                this.f48646j = i16 - 1;
                this.f48644h = Arrays.copyOf(this.f48644h, i19);
                this.f48642f = Arrays.copyOf(this.f48642f, this.f48640d);
                this.f48643g = Arrays.copyOf(this.f48643g, this.f48640d);
            }
            this.f48642f[i16] = iVar.f48699y;
            this.f48644h[i16] = f10;
            if (i12 != -1) {
                int[] iArr8 = this.f48643g;
                iArr8[i16] = iArr8[i12];
                iArr8[i12] = i16;
            } else {
                this.f48643g[i16] = this.f48645i;
                this.f48645i = i16;
            }
            iVar.I++;
            iVar.a(this.f48638b);
            this.f48637a++;
            if (!this.f48647k) {
                this.f48646j++;
            }
            int i20 = this.f48646j;
            int[] iArr9 = this.f48642f;
            if (i20 >= iArr9.length) {
                this.f48647k = true;
                this.f48646j = iArr9.length - 1;
            }
        }
    }

    @Override // q2.b.a
    public final float g(i iVar, boolean z10) {
        if (this.f48641e == iVar) {
            this.f48641e = null;
        }
        int i10 = this.f48645i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f48637a) {
            if (this.f48642f[i10] == iVar.f48699y) {
                if (i10 == this.f48645i) {
                    this.f48645i = this.f48643g[i10];
                } else {
                    int[] iArr = this.f48643g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.h(this.f48638b);
                }
                iVar.I--;
                this.f48637a--;
                this.f48642f[i10] = -1;
                if (this.f48647k) {
                    this.f48646j = i10;
                }
                return this.f48644h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f48643g[i10];
        }
        return 0.0f;
    }

    @Override // q2.b.a
    public int h() {
        return this.f48637a;
    }

    @Override // q2.b.a
    public float i(b bVar, boolean z10) {
        float e10 = e(bVar.f48648a);
        g(bVar.f48648a, z10);
        b.a aVar = bVar.f48652e;
        int h10 = aVar.h();
        for (int i10 = 0; i10 < h10; i10++) {
            i b10 = aVar.b(i10);
            f(b10, aVar.e(b10) * e10, z10);
        }
        return e10;
    }

    @Override // q2.b.a
    public float j(int i10) {
        int i11 = this.f48645i;
        for (int i12 = 0; i11 != -1 && i12 < this.f48637a; i12++) {
            if (i12 == i10) {
                return this.f48644h[i11];
            }
            i11 = this.f48643g[i11];
        }
        return 0.0f;
    }

    @Override // q2.b.a
    public void k(float f10) {
        int i10 = this.f48645i;
        for (int i11 = 0; i10 != -1 && i11 < this.f48637a; i11++) {
            float[] fArr = this.f48644h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f48643g[i10];
        }
    }

    public String toString() {
        int i10 = this.f48645i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f48637a; i11++) {
            str = ((str + " -> ") + this.f48644h[i10] + " : ") + this.f48639c.f48657d[this.f48642f[i10]];
            i10 = this.f48643g[i10];
        }
        return str;
    }
}
