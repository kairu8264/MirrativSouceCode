package ai;

/* loaded from: classes3.dex */
public final class xq3 {

    /* renamed from: a  reason: collision with root package name */
    public final long f12079a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12080b;

    public xq3(long j10, long j11) {
        this.f12079a = j10;
        this.f12080b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xq3) {
            xq3 xq3Var = (xq3) obj;
            return this.f12079a == xq3Var.f12079a && this.f12080b == xq3Var.f12080b;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f12079a) * 31) + ((int) this.f12080b);
    }
}
