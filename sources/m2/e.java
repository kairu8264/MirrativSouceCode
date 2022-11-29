package m2;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: w  reason: collision with root package name */
    public final float f40514w;

    /* renamed from: x  reason: collision with root package name */
    public final float f40515x;

    public e(float f10, float f11) {
        this.f40514w = f10;
        this.f40515x = f11;
    }

    @Override // m2.d
    public float G0() {
        return this.f40515x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return jo.p.c(Float.valueOf(getDensity()), Float.valueOf(eVar.getDensity())) && jo.p.c(Float.valueOf(G0()), Float.valueOf(eVar.G0()));
        }
        return false;
    }

    @Override // m2.d
    public float getDensity() {
        return this.f40514w;
    }

    public int hashCode() {
        return (Float.hashCode(getDensity()) * 31) + Float.hashCode(G0());
    }

    public String toString() {
        return "DensityImpl(density=" + getDensity() + ", fontScale=" + G0() + ')';
    }
}
