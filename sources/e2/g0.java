package e2;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final y1.a f30102a;

    /* renamed from: b  reason: collision with root package name */
    public final t f30103b;

    public g0(y1.a aVar, t tVar) {
        jo.p.h(aVar, "text");
        jo.p.h(tVar, "offsetMapping");
        this.f30102a = aVar;
        this.f30103b = tVar;
    }

    public final t a() {
        return this.f30103b;
    }

    public final y1.a b() {
        return this.f30102a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            return jo.p.c(this.f30102a, g0Var.f30102a) && jo.p.c(this.f30103b, g0Var.f30103b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f30102a.hashCode() * 31) + this.f30103b.hashCode();
    }

    public String toString() {
        return "TransformedText(text=" + ((Object) this.f30102a) + ", offsetMapping=" + this.f30103b + ')';
    }
}
