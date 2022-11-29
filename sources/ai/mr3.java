package ai;

/* loaded from: classes3.dex */
public final class mr3 implements Comparable<mr3> {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final boolean E;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f7016w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f7017x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f7018y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f7019z;

    public mr3(v4 v4Var, ir3 ir3Var, int i10, String str) {
        zz2<String> zz2Var;
        int i11;
        boolean z10 = false;
        this.f7017x = or3.k(i10, false);
        int i12 = v4Var.f10952d;
        int i13 = ir3Var.A;
        this.f7018y = 1 == (i12 & 1);
        this.f7019z = (i12 & 2) != 0;
        if (ir3Var.f10113r.isEmpty()) {
            zz2Var = zz2.s("");
        } else {
            zz2Var = ir3Var.f10113r;
        }
        int i14 = 0;
        while (true) {
            if (i14 >= zz2Var.size()) {
                i14 = Integer.MAX_VALUE;
                i11 = 0;
                break;
            }
            i11 = or3.m(v4Var, zz2Var.get(i14), false);
            if (i11 > 0) {
                break;
            }
            i14++;
        }
        this.A = i14;
        this.B = i11;
        int bitCount = Integer.bitCount(0);
        this.C = bitCount;
        this.E = false;
        int m10 = or3.m(v4Var, str, or3.l(str) == null);
        this.D = m10;
        if (i11 > 0 || ((ir3Var.f10113r.isEmpty() && bitCount > 0) || this.f7018y || (this.f7019z && m10 > 0))) {
            z10 = true;
        }
        this.f7016w = z10;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(mr3 mr3Var) {
        nz2 b10 = nz2.i().d(this.f7017x, mr3Var.f7017x).a(Integer.valueOf(this.A), Integer.valueOf(mr3Var.A), l13.b().a()).b(this.B, mr3Var.B).b(this.C, mr3Var.C).d(this.f7018y, mr3Var.f7018y).a(Boolean.valueOf(this.f7019z), Boolean.valueOf(mr3Var.f7019z), this.B == 0 ? l13.b() : l13.b().a()).b(this.D, mr3Var.D);
        if (this.C == 0) {
            b10 = b10.c(false, false);
        }
        return b10.e();
    }
}
