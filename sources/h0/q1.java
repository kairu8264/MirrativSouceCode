package h0;

/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    public final float f34134a;

    /* renamed from: b  reason: collision with root package name */
    public final float f34135b;

    public q1(float f10, float f11) {
        this.f34134a = f10;
        this.f34135b = f11;
    }

    public /* synthetic */ q1(float f10, float f11, jo.h hVar) {
        this(f10, f11);
    }

    public final float a() {
        return this.f34134a;
    }

    public final float b() {
        return m2.g.l(this.f34134a + this.f34135b);
    }

    public final float c() {
        return this.f34135b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q1) {
            q1 q1Var = (q1) obj;
            return m2.g.n(this.f34134a, q1Var.f34134a) && m2.g.n(this.f34135b, q1Var.f34135b);
        }
        return false;
    }

    public int hashCode() {
        return (m2.g.o(this.f34134a) * 31) + m2.g.o(this.f34135b);
    }

    public String toString() {
        return "TabPosition(left=" + ((Object) m2.g.p(this.f34134a)) + ", right=" + ((Object) m2.g.p(b())) + ", width=" + ((Object) m2.g.p(this.f34135b)) + ')';
    }
}
