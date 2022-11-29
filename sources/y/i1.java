package y;

import y.d;

/* loaded from: classes.dex */
public final class i1 implements u.e0 {

    /* renamed from: a  reason: collision with root package name */
    public final float f60811a;

    public i1(m2.d dVar) {
        jo.p.h(dVar, "density");
        this.f60811a = dVar.getDensity() * 386.0878f * 160.0f * 0.84f;
    }

    @Override // u.e0
    public float a() {
        return 0.0f;
    }

    @Override // u.e0
    public float b(long j10, float f10, float f11) {
        long c10 = c(0.0f, f11);
        return ((d.a.c(d.f60693a.b(c10 > 0 ? ((float) j10) / ((float) c10) : 1.0f)) * f(f11)) / ((float) c10)) * 1.0E9f;
    }

    @Override // u.e0
    public long c(float f10, float f11) {
        double d10;
        double g10 = g(f11);
        d10 = o1.f60869c;
        return (long) (Math.exp(g10 / d10) * 1.0E9d);
    }

    @Override // u.e0
    public float d(float f10, float f11) {
        return f10 + f(f11);
    }

    @Override // u.e0
    public float e(long j10, float f10, float f11) {
        long c10 = c(0.0f, f11);
        return f10 + (f(f11) * d.a.b(d.f60693a.b(c10 > 0 ? ((float) j10) / ((float) c10) : 1.0f)));
    }

    public final float f(float f10) {
        float f11;
        double d10;
        double d11;
        double g10 = g(f10);
        f11 = o1.f60867a;
        d10 = o1.f60868b;
        d11 = o1.f60869c;
        return ((float) (f11 * this.f60811a * Math.exp((d10 / d11) * g10))) * Math.signum(f10);
    }

    public final double g(float f10) {
        float f11;
        d dVar = d.f60693a;
        f11 = o1.f60867a;
        return dVar.a(f10, f11 * this.f60811a);
    }
}
