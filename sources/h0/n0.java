package h0;

/* loaded from: classes.dex */
public final class n0 implements x1 {

    /* renamed from: a  reason: collision with root package name */
    public final float f34047a;

    public n0(float f10) {
        this.f34047a = f10;
    }

    @Override // h0.x1
    public float a(m2.d dVar, float f10, float f11) {
        jo.p.h(dVar, "<this>");
        return n2.a.a(f10, f11, this.f34047a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && jo.p.c(Float.valueOf(this.f34047a), Float.valueOf(((n0) obj).f34047a));
    }

    public int hashCode() {
        return Float.hashCode(this.f34047a);
    }

    public String toString() {
        return "FractionalThreshold(fraction=" + this.f34047a + ')';
    }
}
