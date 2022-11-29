package u;

/* loaded from: classes.dex */
public final class r0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<Double, Double> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ double f54108w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ double f54109x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ double f54110y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ double f54111z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(double d10, double d11, double d12, double d13) {
            super(1);
            this.f54108w = d10;
            this.f54109x = d11;
            this.f54110y = d12;
            this.f54111z = d13;
        }

        public final Double a(double d10) {
            return Double.valueOf(((this.f54108w + (this.f54109x * d10)) * Math.exp(this.f54110y * d10)) + this.f54111z);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<Double, Double> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ double f54112w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ double f54113x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ double f54114y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(double d10, double d11, double d12) {
            super(1);
            this.f54112w = d10;
            this.f54113x = d11;
            this.f54114y = d12;
        }

        public final Double a(double d10) {
            double d11 = this.f54112w;
            double d12 = this.f54113x;
            return Double.valueOf(((d11 * ((d12 * d10) + 1)) + (this.f54114y * d12)) * Math.exp(d12 * d10));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<Double, Double> {
        public final /* synthetic */ double A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ double f54115w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ double f54116x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ double f54117y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ double f54118z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(double d10, double d11, double d12, double d13, double d14) {
            super(1);
            this.f54115w = d10;
            this.f54116x = d11;
            this.f54117y = d12;
            this.f54118z = d13;
            this.A = d14;
        }

        public final Double a(double d10) {
            return Double.valueOf((this.f54115w * Math.exp(this.f54116x * d10)) + (this.f54117y * Math.exp(this.f54118z * d10)) + this.A);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<Double, Double> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ double f54119w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ double f54120x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ double f54121y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ double f54122z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(double d10, double d11, double d12, double d13) {
            super(1);
            this.f54119w = d10;
            this.f54120x = d11;
            this.f54121y = d12;
            this.f54122z = d13;
        }

        public final Double a(double d10) {
            double d11 = this.f54119w;
            double d12 = this.f54120x;
            double exp = d11 * d12 * Math.exp(d12 * d10);
            double d13 = this.f54121y;
            double d14 = this.f54122z;
            return Double.valueOf(exp + (d13 * d14 * Math.exp(d14 * d10)));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    public static final long a(double d10, double d11, double d12, double d13, double d14) {
        return f(t.a(1.0d, 2.0d * d11 * Math.sqrt(d10), d10), d11, d12, d13, d14);
    }

    public static final long b(float f10, float f11, float f12, float f13, float f14) {
        return a(f10, f11, f12, f13, f14);
    }

    public static final double c(wn.k<s, s> kVar, double d10, double d11, double d12) {
        double d13;
        double d14;
        a aVar;
        b bVar;
        double d15;
        double f10 = kVar.c().f();
        double d16 = f10 * d10;
        double d17 = d11 - d16;
        double log = Math.log(Math.abs(d12 / d10)) / f10;
        double d18 = d(Math.log(Math.abs(d12 / d17)), f10) / f10;
        int i10 = 0;
        if (!((Double.isInfinite(log) || Double.isNaN(log)) ? false : true)) {
            d13 = d18;
        } else {
            if (!(!((Double.isInfinite(d18) || Double.isNaN(d18)) ? false : true))) {
                log = Math.max(log, d18);
            }
            d13 = log;
        }
        double d19 = (-(d16 + d17)) / (f10 * d17);
        if (!Double.isNaN(d19) && d19 > 0.0d) {
            if (d19 <= 0.0d || (-e(d10, f10, d19, d17)) >= d12) {
                d13 = (-(2.0d / f10)) - (d10 / d17);
                d14 = d12;
                aVar = new a(d10, d17, f10, d14);
                bVar = new b(d17, f10, d10);
                d15 = Double.MAX_VALUE;
                while (d15 > 0.001d && i10 < 100) {
                    i10++;
                    double doubleValue = d13 - (aVar.invoke(Double.valueOf(d13)).doubleValue() / bVar.invoke(Double.valueOf(d13)).doubleValue());
                    double abs = Math.abs(d13 - doubleValue);
                    d13 = doubleValue;
                    d15 = abs;
                }
                return d13;
            } else if (d17 < 0.0d && d10 > 0.0d) {
                d13 = 0.0d;
            }
        }
        d14 = -d12;
        aVar = new a(d10, d17, f10, d14);
        bVar = new b(d17, f10, d10);
        d15 = Double.MAX_VALUE;
        while (d15 > 0.001d) {
            i10++;
            double doubleValue2 = d13 - (aVar.invoke(Double.valueOf(d13)).doubleValue() / bVar.invoke(Double.valueOf(d13)).doubleValue());
            double abs2 = Math.abs(d13 - doubleValue2);
            d13 = doubleValue2;
            d15 = abs2;
        }
        return d13;
    }

    public static final double d(double d10, double d11) {
        int i10 = 0;
        double d12 = d10;
        while (i10 < 6) {
            i10++;
            d12 = d10 - Math.log(Math.abs(d12 / d11));
        }
        return d12;
    }

    public static final double e(double d10, double d11, double d12, double d13) {
        double d14 = d11 * d12;
        return (d10 * Math.exp(d14)) + (d13 * d12 * Math.exp(d14));
    }

    public static final long f(wn.k<s, s> kVar, double d10, double d11, double d12, double d13) {
        double c10;
        int i10 = (d12 > 0.0d ? 1 : (d12 == 0.0d ? 0 : -1));
        if (i10 == 0) {
            if (d11 == 0.0d) {
                return 0L;
            }
        }
        if (i10 < 0) {
            d11 = -d11;
        }
        double d14 = d11;
        double abs = Math.abs(d12);
        if (d10 > 1.0d) {
            c10 = g(kVar, abs, d14, d13);
        } else if (d10 < 1.0d) {
            c10 = i(kVar, abs, d14, d13);
        } else {
            c10 = c(kVar, abs, d14, d13);
        }
        return (long) (c10 * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final double g(wn.k<u.s, u.s> r31, double r32, double r34, double r36) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.r0.g(wn.k, double, double, double):double");
    }

    public static final double h(double d10, double d11, double d12, double d13, double d14) {
        return (d10 * Math.exp(d11 * d12)) + (d13 * Math.exp(d14 * d12));
    }

    public static final double i(wn.k<s, s> kVar, double d10, double d11, double d12) {
        double f10 = kVar.c().f();
        double e10 = (d11 - (f10 * d10)) / kVar.c().e();
        return Math.log(d12 / Math.sqrt((d10 * d10) + (e10 * e10))) / f10;
    }
}
