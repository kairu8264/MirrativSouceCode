package ai;

/* loaded from: classes3.dex */
public final class s54 {

    /* renamed from: e  reason: collision with root package name */
    public static final s54 f9735e = new s54(0, 0, 0, 1.0f);

    /* renamed from: f  reason: collision with root package name */
    public static final x2<s54> f9736f = r44.f9341a;

    /* renamed from: a  reason: collision with root package name */
    public final int f9737a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9738b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9739c;

    /* renamed from: d  reason: collision with root package name */
    public final float f9740d;

    public s54(int i10, int i11, int i12, float f10) {
        this.f9737a = i10;
        this.f9738b = i11;
        this.f9739c = i12;
        this.f9740d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s54) {
            s54 s54Var = (s54) obj;
            if (this.f9737a == s54Var.f9737a && this.f9738b == s54Var.f9738b && this.f9739c == s54Var.f9739c && this.f9740d == s54Var.f9740d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f9737a + 217) * 31) + this.f9738b) * 31) + this.f9739c) * 31) + Float.floatToRawIntBits(this.f9740d);
    }
}
