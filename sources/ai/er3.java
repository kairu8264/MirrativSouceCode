package ai;

/* loaded from: classes3.dex */
public final class er3 implements Comparable<er3> {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final boolean F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f3754w;

    /* renamed from: x  reason: collision with root package name */
    public final String f3755x;

    /* renamed from: y  reason: collision with root package name */
    public final ir3 f3756y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f3757z;

    public er3(v4 v4Var, ir3 ir3Var, int i10) {
        int i11;
        int i12;
        int i13;
        this.f3756y = ir3Var;
        this.f3755x = or3.l(v4Var.f10951c);
        int i14 = 0;
        this.f3757z = or3.k(i10, false);
        int i15 = 0;
        while (true) {
            i11 = Integer.MAX_VALUE;
            if (i15 >= ir3Var.f10108m.size()) {
                i12 = 0;
                i15 = Integer.MAX_VALUE;
                break;
            }
            i12 = or3.m(v4Var, ir3Var.f10108m.get(i15), false);
            if (i12 > 0) {
                break;
            }
            i15++;
        }
        this.B = i15;
        this.A = i12;
        this.C = Integer.bitCount(0);
        this.F = 1 == (v4Var.f10952d & 1);
        this.G = v4Var.f10973y;
        this.H = v4Var.f10974z;
        this.I = v4Var.f10956h;
        this.f3754w = true;
        String[] y10 = sb.y();
        int i16 = 0;
        while (true) {
            if (i16 >= y10.length) {
                i13 = 0;
                i16 = Integer.MAX_VALUE;
                break;
            }
            i13 = or3.m(v4Var, y10[i16], false);
            if (i13 > 0) {
                break;
            }
            i16++;
        }
        this.D = i16;
        this.E = i13;
        while (true) {
            if (i14 < ir3Var.f10112q.size()) {
                String str = v4Var.f10960l;
                if (str != null && str.equals(ir3Var.f10112q.get(i14))) {
                    i11 = i14;
                    break;
                }
                i14++;
            } else {
                break;
            }
        }
        this.J = i11;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(er3 er3Var) {
        l13 l13Var;
        l13 a10;
        l13 l13Var2;
        if (this.f3757z) {
            a10 = or3.f7891f;
        } else {
            l13Var = or3.f7891f;
            a10 = l13Var.a();
        }
        nz2 a11 = nz2.i().d(this.f3757z, er3Var.f3757z).a(Integer.valueOf(this.B), Integer.valueOf(er3Var.B), l13.b().a()).b(this.A, er3Var.A).b(this.C, er3Var.C).d(true, true).a(Integer.valueOf(this.J), Integer.valueOf(er3Var.J), l13.b().a());
        Integer valueOf = Integer.valueOf(this.I);
        Integer valueOf2 = Integer.valueOf(er3Var.I);
        boolean z10 = this.f3756y.f10116u;
        l13Var2 = or3.f7892g;
        nz2 a12 = a11.a(valueOf, valueOf2, l13Var2).d(this.F, er3Var.F).a(Integer.valueOf(this.D), Integer.valueOf(er3Var.D), l13.b().a()).b(this.E, er3Var.E).a(Integer.valueOf(this.G), Integer.valueOf(er3Var.G), a10).a(Integer.valueOf(this.H), Integer.valueOf(er3Var.H), a10);
        Integer valueOf3 = Integer.valueOf(this.I);
        Integer valueOf4 = Integer.valueOf(er3Var.I);
        if (!sb.H(this.f3755x, er3Var.f3755x)) {
            a10 = or3.f7892g;
        }
        return a12.a(valueOf3, valueOf4, a10).e();
    }
}
