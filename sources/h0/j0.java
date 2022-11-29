package h0;

/* loaded from: classes.dex */
public final class j0 implements x1 {

    /* renamed from: a  reason: collision with root package name */
    public final float f33923a;

    public j0(float f10) {
        this.f33923a = f10;
    }

    public /* synthetic */ j0(float f10, jo.h hVar) {
        this(f10);
    }

    @Override // h0.x1
    public float a(m2.d dVar, float f10, float f11) {
        jo.p.h(dVar, "<this>");
        return f10 + (dVar.I0(this.f33923a) * Math.signum(f11 - f10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && m2.g.n(this.f33923a, ((j0) obj).f33923a);
    }

    public int hashCode() {
        return m2.g.o(this.f33923a);
    }

    public String toString() {
        return "FixedThreshold(offset=" + ((Object) m2.g.p(this.f33923a)) + ')';
    }
}
