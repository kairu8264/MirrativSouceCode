package t;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final float f52999a;

    /* renamed from: b  reason: collision with root package name */
    public final m2.d f53000b;

    /* renamed from: c  reason: collision with root package name */
    public final float f53001c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final float f53002a;

        /* renamed from: b  reason: collision with root package name */
        public final float f53003b;

        /* renamed from: c  reason: collision with root package name */
        public final long f53004c;

        public a(float f10, float f11, long j10) {
            this.f53002a = f10;
            this.f53003b = f11;
            this.f53004c = j10;
        }

        public final float a(long j10) {
            long j11 = this.f53004c;
            return this.f53003b * Math.signum(this.f53002a) * t.a.f52834a.b(j11 > 0 ? ((float) j10) / ((float) j11) : 1.0f).a();
        }

        public final float b(long j10) {
            long j11 = this.f53004c;
            return (((t.a.f52834a.b(j11 > 0 ? ((float) j10) / ((float) j11) : 1.0f).b() * Math.signum(this.f53002a)) * this.f53003b) / ((float) this.f53004c)) * 1000.0f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return jo.p.c(Float.valueOf(this.f53002a), Float.valueOf(aVar.f53002a)) && jo.p.c(Float.valueOf(this.f53003b), Float.valueOf(aVar.f53003b)) && this.f53004c == aVar.f53004c;
            }
            return false;
        }

        public int hashCode() {
            return (((Float.hashCode(this.f53002a) * 31) + Float.hashCode(this.f53003b)) * 31) + Long.hashCode(this.f53004c);
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.f53002a + ", distance=" + this.f53003b + ", duration=" + this.f53004c + ')';
        }
    }

    public t(float f10, m2.d dVar) {
        jo.p.h(dVar, "density");
        this.f52999a = f10;
        this.f53000b = dVar;
        this.f53001c = a(dVar);
    }

    public final float a(m2.d dVar) {
        float c10;
        c10 = u.c(0.84f, dVar.getDensity());
        return c10;
    }

    public final float b(float f10) {
        float f11;
        float f12;
        double e10 = e(f10);
        f11 = u.f53005a;
        double d10 = this.f52999a * this.f53001c;
        f12 = u.f53005a;
        return (float) (d10 * Math.exp((f12 / (f11 - 1.0d)) * e10));
    }

    public final long c(float f10) {
        float f11;
        double e10 = e(f10);
        f11 = u.f53005a;
        return (long) (Math.exp(e10 / (f11 - 1.0d)) * 1000.0d);
    }

    public final a d(float f10) {
        float f11;
        float f12;
        double e10 = e(f10);
        f11 = u.f53005a;
        double d10 = f11 - 1.0d;
        f12 = u.f53005a;
        return new a(f10, (float) (this.f52999a * this.f53001c * Math.exp((f12 / d10) * e10)), (long) (Math.exp(e10 / d10) * 1000.0d));
    }

    public final double e(float f10) {
        return t.a.f52834a.a(f10, this.f52999a * this.f53001c);
    }
}
