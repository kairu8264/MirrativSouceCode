package h0;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    public final float f34234a;

    /* renamed from: b  reason: collision with root package name */
    public final float f34235b;

    /* renamed from: c  reason: collision with root package name */
    public final float f34236c;

    public u0(float f10, float f11, float f12) {
        this.f34234a = f10;
        this.f34235b = f11;
        this.f34236c = f12;
    }

    public final float a(float f10) {
        float f11 = f10 < 0.0f ? this.f34235b : this.f34236c;
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return (this.f34234a / f11) * ((float) Math.sin((po.n.l(f10 / this.f34234a, -1.0f, 1.0f) * 3.1415927f) / 2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            if (this.f34234a == u0Var.f34234a) {
                if (this.f34235b == u0Var.f34235b) {
                    return (this.f34236c > u0Var.f34236c ? 1 : (this.f34236c == u0Var.f34236c ? 0 : -1)) == 0;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f34234a) * 31) + Float.hashCode(this.f34235b)) * 31) + Float.hashCode(this.f34236c);
    }

    public String toString() {
        return "ResistanceConfig(basis=" + this.f34234a + ", factorAtMin=" + this.f34235b + ", factorAtMax=" + this.f34236c + ')';
    }
}
