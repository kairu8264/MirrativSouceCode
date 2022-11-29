package u;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    public float f54125a;

    /* renamed from: c  reason: collision with root package name */
    public boolean f54127c;

    /* renamed from: d  reason: collision with root package name */
    public double f54128d;

    /* renamed from: e  reason: collision with root package name */
    public double f54129e;

    /* renamed from: f  reason: collision with root package name */
    public double f54130f;

    /* renamed from: b  reason: collision with root package name */
    public double f54126b = Math.sqrt(50.0d);

    /* renamed from: g  reason: collision with root package name */
    public float f54131g = 1.0f;

    public s0(float f10) {
        this.f54125a = f10;
    }

    public final float a() {
        return this.f54131g;
    }

    public final float b() {
        double d10 = this.f54126b;
        return (float) (d10 * d10);
    }

    public final void c() {
        if (this.f54127c) {
            return;
        }
        if (!(this.f54125a == t0.b())) {
            float f10 = this.f54131g;
            double d10 = f10 * f10;
            if (f10 > 1.0f) {
                double d11 = this.f54126b;
                double d12 = d10 - 1;
                this.f54128d = ((-f10) * d11) + (d11 * Math.sqrt(d12));
                double d13 = this.f54126b;
                this.f54129e = ((-this.f54131g) * d13) - (d13 * Math.sqrt(d12));
            } else if (f10 >= 0.0f && f10 < 1.0f) {
                this.f54130f = this.f54126b * Math.sqrt(1 - d10);
            }
            this.f54127c = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    public final void d(float f10) {
        if (f10 >= 0.0f) {
            this.f54131g = f10;
            this.f54127c = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void e(float f10) {
        this.f54125a = f10;
    }

    public final void f(float f10) {
        if (b() > 0.0f) {
            this.f54126b = Math.sqrt(f10);
            this.f54127c = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final long g(float f10, float f11, long j10) {
        float f12;
        double cos;
        double d10;
        c();
        float f13 = f10 - this.f54125a;
        double d11 = j10 / 1000.0d;
        float f14 = this.f54131g;
        if (f14 > 1.0f) {
            double d12 = f13;
            double d13 = this.f54129e;
            double d14 = f11;
            double d15 = this.f54128d;
            double d16 = d12 - (((d13 * d12) - d14) / (d13 - d15));
            double d17 = ((d12 * d13) - d14) / (d13 - d15);
            d10 = (Math.exp(d13 * d11) * d16) + (Math.exp(this.f54128d * d11) * d17);
            double d18 = this.f54129e;
            double exp = d16 * d18 * Math.exp(d18 * d11);
            double d19 = this.f54128d;
            cos = exp + (d17 * d19 * Math.exp(d19 * d11));
        } else {
            if (f14 == 1.0f) {
                double d20 = this.f54126b;
                double d21 = f13;
                double d22 = f11 + (d20 * d21);
                double d23 = d21 + (d22 * d11);
                double exp2 = Math.exp((-d20) * d11) * d23;
                double exp3 = d23 * Math.exp((-this.f54126b) * d11);
                double d24 = this.f54126b;
                cos = (exp3 * (-d24)) + (d22 * Math.exp((-d24) * d11));
                d10 = exp2;
            } else {
                double d25 = this.f54126b;
                double d26 = f13;
                double d27 = (1 / this.f54130f) * ((f14 * d25 * d26) + f11);
                double exp4 = Math.exp((-f14) * d25 * d11) * ((Math.cos(this.f54130f * d11) * d26) + (Math.sin(this.f54130f * d11) * d27));
                double d28 = this.f54126b;
                double d29 = (-d28) * exp4 * this.f54131g;
                double exp5 = Math.exp((-f12) * d28 * d11);
                double d30 = this.f54130f;
                double sin = (-d30) * d26 * Math.sin(d30 * d11);
                double d31 = this.f54130f;
                cos = d29 + (exp5 * (sin + (d27 * d31 * Math.cos(d31 * d11))));
                d10 = exp4;
            }
        }
        return t0.a((float) (d10 + this.f54125a), (float) cos);
    }
}
