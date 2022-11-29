package ai;

/* loaded from: classes3.dex */
public final class q5 {

    /* renamed from: a  reason: collision with root package name */
    public final bp3 f8825a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8826b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8827c;

    /* renamed from: d  reason: collision with root package name */
    public final long f8828d;

    /* renamed from: e  reason: collision with root package name */
    public final long f8829e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8830f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8831g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f8832h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f8833i;

    public q5(bp3 bp3Var, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        u9.a(!z13 || z11);
        if (z12 && !z11) {
            z14 = false;
        }
        u9.a(z14);
        this.f8825a = bp3Var;
        this.f8826b = j10;
        this.f8827c = j11;
        this.f8828d = j12;
        this.f8829e = j13;
        this.f8830f = false;
        this.f8831g = z11;
        this.f8832h = z12;
        this.f8833i = z13;
    }

    public final q5 a(long j10) {
        return j10 == this.f8826b ? this : new q5(this.f8825a, j10, this.f8827c, this.f8828d, this.f8829e, false, this.f8831g, this.f8832h, this.f8833i);
    }

    public final q5 b(long j10) {
        return j10 == this.f8827c ? this : new q5(this.f8825a, this.f8826b, j10, this.f8828d, this.f8829e, false, this.f8831g, this.f8832h, this.f8833i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q5.class == obj.getClass()) {
            q5 q5Var = (q5) obj;
            if (this.f8826b == q5Var.f8826b && this.f8827c == q5Var.f8827c && this.f8828d == q5Var.f8828d && this.f8829e == q5Var.f8829e && this.f8831g == q5Var.f8831g && this.f8832h == q5Var.f8832h && this.f8833i == q5Var.f8833i && sb.H(this.f8825a, q5Var.f8825a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f8825a.hashCode() + 527) * 31) + ((int) this.f8826b)) * 31) + ((int) this.f8827c)) * 31) + ((int) this.f8828d)) * 31) + ((int) this.f8829e)) * 961) + (this.f8831g ? 1 : 0)) * 31) + (this.f8832h ? 1 : 0)) * 31) + (this.f8833i ? 1 : 0);
    }
}
