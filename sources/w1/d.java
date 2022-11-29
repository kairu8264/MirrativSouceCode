package w1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f57878a;

    /* renamed from: b  reason: collision with root package name */
    public final io.a<Boolean> f57879b;

    public final io.a<Boolean> a() {
        return this.f57879b;
    }

    public final String b() {
        return this.f57878a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return jo.p.c(this.f57878a, dVar.f57878a) && jo.p.c(this.f57879b, dVar.f57879b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f57878a.hashCode() * 31) + this.f57879b.hashCode();
    }

    public String toString() {
        return "CustomAccessibilityAction(label=" + this.f57878a + ", action=" + this.f57879b + ')';
    }
}
