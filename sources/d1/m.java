package d1;

import jo.p;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final float f29052a;

    /* renamed from: b  reason: collision with root package name */
    public final float f29053b;

    public m(float f10, float f11) {
        this.f29052a = f10;
        this.f29053b = f11;
    }

    public final float a() {
        return this.f29052a;
    }

    public final float b() {
        return this.f29053b;
    }

    public final float[] c() {
        float f10 = this.f29052a;
        float f11 = this.f29053b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return p.c(Float.valueOf(this.f29052a), Float.valueOf(mVar.f29052a)) && p.c(Float.valueOf(this.f29053b), Float.valueOf(mVar.f29053b));
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f29052a) * 31) + Float.hashCode(this.f29053b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f29052a + ", y=" + this.f29053b + ')';
    }
}
