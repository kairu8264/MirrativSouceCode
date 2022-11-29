package q2;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class i implements Comparable<i> {
    public static int N = 1;
    public float B;
    public a F;

    /* renamed from: w  reason: collision with root package name */
    public boolean f48697w;

    /* renamed from: x  reason: collision with root package name */
    public String f48698x;

    /* renamed from: y  reason: collision with root package name */
    public int f48699y = -1;

    /* renamed from: z  reason: collision with root package name */
    public int f48700z = -1;
    public int A = 0;
    public boolean C = false;
    public float[] D = new float[9];
    public float[] E = new float[9];
    public b[] G = new b[16];
    public int H = 0;
    public int I = 0;
    public boolean J = false;
    public int K = -1;
    public float L = 0.0f;
    public HashSet<b> M = null;

    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.F = aVar;
    }

    public static void e() {
        N++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.H;
            if (i10 < i11) {
                if (this.G[i10] == bVar) {
                    return;
                }
                i10++;
            } else {
                b[] bVarArr = this.G;
                if (i11 >= bVarArr.length) {
                    this.G = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.G;
                int i12 = this.H;
                bVarArr2[i12] = bVar;
                this.H = i12 + 1;
                return;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(i iVar) {
        return this.f48699y - iVar.f48699y;
    }

    public final void h(b bVar) {
        int i10 = this.H;
        int i11 = 0;
        while (i11 < i10) {
            if (this.G[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.G;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.H--;
                return;
            }
            i11++;
        }
    }

    public void i() {
        this.f48698x = null;
        this.F = a.UNKNOWN;
        this.A = 0;
        this.f48699y = -1;
        this.f48700z = -1;
        this.B = 0.0f;
        this.C = false;
        this.J = false;
        this.K = -1;
        this.L = 0.0f;
        int i10 = this.H;
        for (int i11 = 0; i11 < i10; i11++) {
            this.G[i11] = null;
        }
        this.H = 0;
        this.I = 0;
        this.f48697w = false;
        Arrays.fill(this.E, 0.0f);
    }

    public void l(d dVar, float f10) {
        this.B = f10;
        this.C = true;
        this.J = false;
        this.K = -1;
        this.L = 0.0f;
        int i10 = this.H;
        this.f48700z = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.G[i11].A(dVar, this, false);
        }
        this.H = 0;
    }

    public void m(a aVar, String str) {
        this.F = aVar;
    }

    public final void n(d dVar, b bVar) {
        int i10 = this.H;
        for (int i11 = 0; i11 < i10; i11++) {
            this.G[i11].B(dVar, bVar, false);
        }
        this.H = 0;
    }

    public String toString() {
        if (this.f48698x != null) {
            return "" + this.f48698x;
        }
        return "" + this.f48699y;
    }
}
