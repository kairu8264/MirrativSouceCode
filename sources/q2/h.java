package q2;

import java.util.Arrays;
import java.util.Comparator;
import q2.b;

/* loaded from: classes.dex */
public class h extends q2.b {

    /* renamed from: g  reason: collision with root package name */
    public int f48687g;

    /* renamed from: h  reason: collision with root package name */
    public i[] f48688h;

    /* renamed from: i  reason: collision with root package name */
    public i[] f48689i;

    /* renamed from: j  reason: collision with root package name */
    public int f48690j;

    /* renamed from: k  reason: collision with root package name */
    public b f48691k;

    /* renamed from: l  reason: collision with root package name */
    public c f48692l;

    /* loaded from: classes.dex */
    public class a implements Comparator<i> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(i iVar, i iVar2) {
            return iVar.f48699y - iVar2.f48699y;
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public i f48694a;

        /* renamed from: b  reason: collision with root package name */
        public h f48695b;

        public b(h hVar) {
            this.f48695b = hVar;
        }

        public boolean a(i iVar, float f10) {
            boolean z10 = true;
            if (!this.f48694a.f48697w) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.E[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f48694a.E[i10] = f12;
                    } else {
                        this.f48694a.E[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f48694a.E;
                fArr[i11] = fArr[i11] + (iVar.E[i11] * f10);
                if (Math.abs(fArr[i11]) < 1.0E-4f) {
                    this.f48694a.E[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.G(this.f48694a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f48694a = iVar;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f48694a.E[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f10 = iVar.E[i10];
                float f11 = this.f48694a.E[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f48694a.E, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f48694a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f48694a.E[i10] + " ";
                }
            }
            return str + "] " + this.f48694a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f48687g = 128;
        this.f48688h = new i[128];
        this.f48689i = new i[128];
        this.f48690j = 0;
        this.f48691k = new b(this);
        this.f48692l = cVar;
    }

    @Override // q2.b
    public void B(d dVar, q2.b bVar, boolean z10) {
        i iVar = bVar.f48648a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f48652e;
        int h10 = aVar.h();
        for (int i10 = 0; i10 < h10; i10++) {
            i b10 = aVar.b(i10);
            float j10 = aVar.j(i10);
            this.f48691k.b(b10);
            if (this.f48691k.a(iVar, j10)) {
                F(b10);
            }
            this.f48649b += bVar.f48649b * j10;
        }
        G(iVar);
    }

    public final void F(i iVar) {
        int i10;
        int i11 = this.f48690j + 1;
        i[] iVarArr = this.f48688h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f48688h = iVarArr2;
            this.f48689i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f48688h;
        int i12 = this.f48690j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f48690j = i13;
        if (i13 > 1 && iVarArr3[i13 - 1].f48699y > iVar.f48699y) {
            int i14 = 0;
            while (true) {
                i10 = this.f48690j;
                if (i14 >= i10) {
                    break;
                }
                this.f48689i[i14] = this.f48688h[i14];
                i14++;
            }
            Arrays.sort(this.f48689i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f48690j; i15++) {
                this.f48688h[i15] = this.f48689i[i15];
            }
        }
        iVar.f48697w = true;
        iVar.a(this);
    }

    public final void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f48690j) {
            if (this.f48688h[i10] == iVar) {
                while (true) {
                    int i11 = this.f48690j;
                    if (i10 < i11 - 1) {
                        i[] iVarArr = this.f48688h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    } else {
                        this.f48690j = i11 - 1;
                        iVar.f48697w = false;
                        return;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // q2.b, q2.d.a
    public void b(i iVar) {
        this.f48691k.b(iVar);
        this.f48691k.e();
        iVar.E[iVar.A] = 1.0f;
        F(iVar);
    }

    @Override // q2.b, q2.d.a
    public i c(d dVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f48690j; i11++) {
            i iVar = this.f48688h[i11];
            if (!zArr[iVar.f48699y]) {
                this.f48691k.b(iVar);
                if (i10 == -1) {
                    if (!this.f48691k.c()) {
                    }
                    i10 = i11;
                } else {
                    if (!this.f48691k.d(this.f48688h[i10])) {
                    }
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f48688h[i10];
    }

    @Override // q2.b, q2.d.a
    public void clear() {
        this.f48690j = 0;
        this.f48649b = 0.0f;
    }

    @Override // q2.b, q2.d.a
    public boolean isEmpty() {
        return this.f48690j == 0;
    }

    @Override // q2.b
    public String toString() {
        String str = " goal -> (" + this.f48649b + ") : ";
        for (int i10 = 0; i10 < this.f48690j; i10++) {
            this.f48691k.b(this.f48688h[i10]);
            str = str + this.f48691k + " ";
        }
        return str;
    }
}
