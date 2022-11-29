package ai;

/* loaded from: classes3.dex */
public final class gr3 implements Comparable<gr3> {

    /* renamed from: w  reason: collision with root package name */
    public final boolean f4552w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f4553x;

    public gr3(v4 v4Var, int i10) {
        this.f4552w = 1 == (v4Var.f10952d & 1);
        this.f4553x = or3.k(i10, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(gr3 gr3Var) {
        return nz2.i().d(this.f4553x, gr3Var.f4553x).d(this.f4552w, gr3Var.f4552w).e();
    }
}
