package d1;

import jo.p;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final double f29045a;

    /* renamed from: b  reason: collision with root package name */
    public final double f29046b;

    /* renamed from: c  reason: collision with root package name */
    public final double f29047c;

    /* renamed from: d  reason: collision with root package name */
    public final double f29048d;

    /* renamed from: e  reason: collision with root package name */
    public final double f29049e;

    /* renamed from: f  reason: collision with root package name */
    public final double f29050f;

    /* renamed from: g  reason: collision with root package name */
    public final double f29051g;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        if ((r2 == 0.0d) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0093, code lost:
        if ((r2 == 0.0d) != false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(double r2, double r4, double r6, double r8, double r10, double r12, double r14) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.l.<init>(double, double, double, double, double, double, double):void");
    }

    public final double a() {
        return this.f29046b;
    }

    public final double b() {
        return this.f29047c;
    }

    public final double c() {
        return this.f29048d;
    }

    public final double d() {
        return this.f29049e;
    }

    public final double e() {
        return this.f29050f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return p.c(Double.valueOf(this.f29045a), Double.valueOf(lVar.f29045a)) && p.c(Double.valueOf(this.f29046b), Double.valueOf(lVar.f29046b)) && p.c(Double.valueOf(this.f29047c), Double.valueOf(lVar.f29047c)) && p.c(Double.valueOf(this.f29048d), Double.valueOf(lVar.f29048d)) && p.c(Double.valueOf(this.f29049e), Double.valueOf(lVar.f29049e)) && p.c(Double.valueOf(this.f29050f), Double.valueOf(lVar.f29050f)) && p.c(Double.valueOf(this.f29051g), Double.valueOf(lVar.f29051g));
        }
        return false;
    }

    public final double f() {
        return this.f29051g;
    }

    public final double g() {
        return this.f29045a;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f29045a) * 31) + Double.hashCode(this.f29046b)) * 31) + Double.hashCode(this.f29047c)) * 31) + Double.hashCode(this.f29048d)) * 31) + Double.hashCode(this.f29049e)) * 31) + Double.hashCode(this.f29050f)) * 31) + Double.hashCode(this.f29051g);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f29045a + ", a=" + this.f29046b + ", b=" + this.f29047c + ", c=" + this.f29048d + ", d=" + this.f29049e + ", e=" + this.f29050f + ", f=" + this.f29051g + ')';
    }

    public /* synthetic */ l(double d10, double d11, double d12, double d13, double d14, double d15, double d16, int i10, jo.h hVar) {
        this(d10, d11, d12, d13, d14, (i10 & 32) != 0 ? 0.0d : d15, (i10 & 64) != 0 ? 0.0d : d16);
    }
}
