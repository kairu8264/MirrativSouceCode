package u;

/* loaded from: classes.dex */
public final class u implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final float f54133a;

    /* renamed from: b  reason: collision with root package name */
    public final float f54134b;

    /* renamed from: c  reason: collision with root package name */
    public final float f54135c;

    /* renamed from: d  reason: collision with root package name */
    public final float f54136d;

    public u(float f10, float f11, float f12, float f13) {
        this.f54133a = f10;
        this.f54134b = f11;
        this.f54135c = f12;
        this.f54136d = f13;
    }

    @Override // u.a0
    public float a(float f10) {
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            float f12 = 1.0f;
            if (f10 < 1.0f) {
                while (true) {
                    float f13 = (f11 + f12) / 2;
                    float b10 = b(this.f54133a, this.f54135c, f13);
                    if (Math.abs(f10 - b10) < 0.001f) {
                        return b(this.f54134b, this.f54136d, f13);
                    }
                    if (b10 < f10) {
                        f11 = f13;
                    } else {
                        f12 = f13;
                    }
                }
            }
        }
        return f10;
    }

    public final float b(float f10, float f11, float f12) {
        float f13 = 3;
        float f14 = 1 - f12;
        return (f10 * f13 * f14 * f14 * f12) + (f13 * f11 * f14 * f12 * f12) + (f12 * f12 * f12);
    }

    public boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f54133a == uVar.f54133a) {
                if (this.f54134b == uVar.f54134b) {
                    if (this.f54135c == uVar.f54135c) {
                        if (this.f54136d == uVar.f54136d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f54133a) * 31) + Float.hashCode(this.f54134b)) * 31) + Float.hashCode(this.f54135c)) * 31) + Float.hashCode(this.f54136d);
    }
}
