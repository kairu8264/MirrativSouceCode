package u;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public double f54123a;

    /* renamed from: b  reason: collision with root package name */
    public double f54124b;

    public s(double d10, double d11) {
        this.f54123a = d10;
        this.f54124b = d11;
    }

    public final double e() {
        return this.f54124b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return jo.p.c(Double.valueOf(this.f54123a), Double.valueOf(sVar.f54123a)) && jo.p.c(Double.valueOf(this.f54124b), Double.valueOf(sVar.f54124b));
        }
        return false;
    }

    public final double f() {
        return this.f54123a;
    }

    public int hashCode() {
        return (Double.hashCode(this.f54123a) * 31) + Double.hashCode(this.f54124b);
    }

    public String toString() {
        return "ComplexDouble(_real=" + this.f54123a + ", _imaginary=" + this.f54124b + ')';
    }
}
