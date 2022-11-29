package o1;

import java.util.List;
import jo.p;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<Float> f43804a;

    /* renamed from: b  reason: collision with root package name */
    public final float f43805b;

    public d(List<Float> list, float f10) {
        p.h(list, "coefficients");
        this.f43804a = list;
        this.f43805b = f10;
    }

    public final List<Float> a() {
        return this.f43804a;
    }

    public final float b() {
        return this.f43805b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return p.c(this.f43804a, dVar.f43804a) && p.c(Float.valueOf(this.f43805b), Float.valueOf(dVar.f43805b));
        }
        return false;
    }

    public int hashCode() {
        return (this.f43804a.hashCode() * 31) + Float.hashCode(this.f43805b);
    }

    public String toString() {
        return "PolynomialFit(coefficients=" + this.f43804a + ", confidence=" + this.f43805b + ')';
    }
}
