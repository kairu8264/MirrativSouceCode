package u;

/* loaded from: classes.dex */
public final class u0<T> implements c0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final float f54137a;

    /* renamed from: b  reason: collision with root package name */
    public final float f54138b;

    /* renamed from: c  reason: collision with root package name */
    public final T f54139c;

    public u0() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public u0(float f10, float f11, T t10) {
        this.f54137a = f10;
        this.f54138b = f11;
        this.f54139c = t10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            if (u0Var.f54137a == this.f54137a) {
                if ((u0Var.f54138b == this.f54138b) && jo.p.c(u0Var.f54139c, this.f54139c)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // u.i
    /* renamed from: f */
    public <V extends p> o1<V> a(c1<T, V> c1Var) {
        p b10;
        jo.p.h(c1Var, "converter");
        float f10 = this.f54137a;
        float f11 = this.f54138b;
        b10 = j.b(c1Var, this.f54139c);
        return new o1<>(f10, f11, b10);
    }

    public int hashCode() {
        T t10 = this.f54139c;
        return ((((t10 == null ? 0 : t10.hashCode()) * 31) + Float.hashCode(this.f54137a)) * 31) + Float.hashCode(this.f54138b);
    }

    public /* synthetic */ u0(float f10, float f11, Object obj, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? null : obj);
    }
}
