package d2;

/* loaded from: classes.dex */
public final class h0 implements k {

    /* renamed from: a  reason: collision with root package name */
    public final int f29095a;

    /* renamed from: b  reason: collision with root package name */
    public final x f29096b;

    /* renamed from: c  reason: collision with root package name */
    public final int f29097c;

    /* renamed from: d  reason: collision with root package name */
    public final int f29098d;

    @Override // d2.k
    public int a() {
        return this.f29098d;
    }

    @Override // d2.k
    public x b() {
        return this.f29096b;
    }

    @Override // d2.k
    public int c() {
        return this.f29097c;
    }

    public final int d() {
        return this.f29095a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            return this.f29095a == h0Var.f29095a && jo.p.c(b(), h0Var.b()) && u.f(c(), h0Var.c()) && s.e(a(), h0Var.a());
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f29095a * 31) + b().hashCode()) * 31) + u.g(c())) * 31) + s.f(a());
    }

    public String toString() {
        return "ResourceFont(resId=" + this.f29095a + ", weight=" + b() + ", style=" + ((Object) u.h(c())) + ", loadingStrategy=" + ((Object) s.g(a())) + ')';
    }
}
