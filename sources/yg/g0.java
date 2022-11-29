package yg;

/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f61885a;

    /* renamed from: b  reason: collision with root package name */
    public final double f61886b;

    /* renamed from: c  reason: collision with root package name */
    public final double f61887c;

    /* renamed from: d  reason: collision with root package name */
    public final double f61888d;

    /* renamed from: e  reason: collision with root package name */
    public final int f61889e;

    public g0(String str, double d10, double d11, double d12, int i10) {
        this.f61885a = str;
        this.f61887c = d10;
        this.f61886b = d11;
        this.f61888d = d12;
        this.f61889e = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            return rh.n.a(this.f61885a, g0Var.f61885a) && this.f61886b == g0Var.f61886b && this.f61887c == g0Var.f61887c && this.f61889e == g0Var.f61889e && Double.compare(this.f61888d, g0Var.f61888d) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return rh.n.b(this.f61885a, Double.valueOf(this.f61886b), Double.valueOf(this.f61887c), Double.valueOf(this.f61888d), Integer.valueOf(this.f61889e));
    }

    public final String toString() {
        return rh.n.c(this).a("name", this.f61885a).a("minBound", Double.valueOf(this.f61887c)).a("maxBound", Double.valueOf(this.f61886b)).a("percent", Double.valueOf(this.f61888d)).a("count", Integer.valueOf(this.f61889e)).toString();
    }
}
