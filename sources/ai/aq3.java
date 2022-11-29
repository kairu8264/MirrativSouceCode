package ai;

/* loaded from: classes3.dex */
public final class aq3 {

    /* renamed from: a  reason: collision with root package name */
    public final int f1976a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1977b;

    public aq3(int i10, boolean z10) {
        this.f1976a = i10;
        this.f1977b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aq3.class == obj.getClass()) {
            aq3 aq3Var = (aq3) obj;
            if (this.f1976a == aq3Var.f1976a && this.f1977b == aq3Var.f1977b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f1976a * 31) + (this.f1977b ? 1 : 0);
    }
}
