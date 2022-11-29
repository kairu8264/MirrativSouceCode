package po;

/* loaded from: classes4.dex */
public final class d implements e<Float> {

    /* renamed from: w  reason: collision with root package name */
    public final float f48465w;

    /* renamed from: x  reason: collision with root package name */
    public final float f48466x;

    public d(float f10, float f11) {
        this.f48465w = f10;
        this.f48466x = f11;
    }

    public boolean a(float f10) {
        return f10 >= this.f48465w && f10 <= this.f48466x;
    }

    @Override // po.f
    /* renamed from: b */
    public Float j() {
        return Float.valueOf(this.f48466x);
    }

    @Override // po.f
    /* renamed from: c */
    public Float d() {
        return Float.valueOf(this.f48465w);
    }

    public boolean e(float f10, float f11) {
        return f10 <= f11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (isEmpty() && ((d) obj).isEmpty()) {
                return true;
            }
            d dVar = (d) obj;
            if (this.f48465w == dVar.f48465w) {
                if (this.f48466x == dVar.f48466x) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // po.e
    public /* bridge */ /* synthetic */ boolean f(Float f10, Float f11) {
        return e(f10.floatValue(), f11.floatValue());
    }

    @Override // po.e
    public /* bridge */ /* synthetic */ boolean g(Float f10) {
        return a(f10.floatValue());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.valueOf(this.f48465w).hashCode() * 31) + Float.valueOf(this.f48466x).hashCode();
    }

    @Override // po.e, po.f
    public boolean isEmpty() {
        return this.f48465w > this.f48466x;
    }

    public String toString() {
        return this.f48465w + ".." + this.f48466x;
    }
}
