package t;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f52834a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f52835b;

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f52836c;

    /* renamed from: t.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0808a {

        /* renamed from: a  reason: collision with root package name */
        public final float f52837a;

        /* renamed from: b  reason: collision with root package name */
        public final float f52838b;

        public C0808a(float f10, float f11) {
            this.f52837a = f10;
            this.f52838b = f11;
        }

        public final float a() {
            return this.f52837a;
        }

        public final float b() {
            return this.f52838b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0808a) {
                C0808a c0808a = (C0808a) obj;
                return jo.p.c(Float.valueOf(this.f52837a), Float.valueOf(c0808a.f52837a)) && jo.p.c(Float.valueOf(this.f52838b), Float.valueOf(c0808a.f52838b));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f52837a) * 31) + Float.hashCode(this.f52838b);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.f52837a + ", velocityCoefficient=" + this.f52838b + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        f52835b = fArr;
        float[] fArr2 = new float[101];
        f52836c = fArr2;
        b0.b(fArr, fArr2, 100);
    }

    public final double a(float f10, float f11) {
        return Math.log((Math.abs(f10) * 0.35f) / f11);
    }

    public final C0808a b(float f10) {
        float f11;
        float f12;
        float f13 = 100;
        int i10 = (int) (f13 * f10);
        if (i10 < 100) {
            float f14 = i10 / f13;
            int i11 = i10 + 1;
            float f15 = i11 / f13;
            float[] fArr = f52835b;
            float f16 = fArr[i10];
            f12 = (fArr[i11] - f16) / (f15 - f14);
            f11 = f16 + ((f10 - f14) * f12);
        } else {
            f11 = 1.0f;
            f12 = 0.0f;
        }
        return new C0808a(f11, f12);
    }
}
