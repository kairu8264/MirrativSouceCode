package t;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final float f52997a;

    /* renamed from: b  reason: collision with root package name */
    public final u.c0<Float> f52998b;

    public s(float f10, u.c0<Float> c0Var) {
        jo.p.h(c0Var, "animationSpec");
        this.f52997a = f10;
        this.f52998b = c0Var;
    }

    public final float a() {
        return this.f52997a;
    }

    public final u.c0<Float> b() {
        return this.f52998b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return jo.p.c(Float.valueOf(this.f52997a), Float.valueOf(sVar.f52997a)) && jo.p.c(this.f52998b, sVar.f52998b);
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f52997a) * 31) + this.f52998b.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.f52997a + ", animationSpec=" + this.f52998b + ')';
    }
}
