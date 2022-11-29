package k0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final float f38292a;

    /* renamed from: b  reason: collision with root package name */
    public final float f38293b;

    /* renamed from: c  reason: collision with root package name */
    public final float f38294c;

    /* renamed from: d  reason: collision with root package name */
    public final float f38295d;

    public f(float f10, float f11, float f12, float f13) {
        this.f38292a = f10;
        this.f38293b = f11;
        this.f38294c = f12;
        this.f38295d = f13;
    }

    public final float a() {
        return this.f38292a;
    }

    public final float b() {
        return this.f38293b;
    }

    public final float c() {
        return this.f38294c;
    }

    public final float d() {
        return this.f38295d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f38292a == fVar.f38292a) {
                if (this.f38293b == fVar.f38293b) {
                    if (this.f38294c == fVar.f38294c) {
                        return (this.f38295d > fVar.f38295d ? 1 : (this.f38295d == fVar.f38295d ? 0 : -1)) == 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f38292a) * 31) + Float.hashCode(this.f38293b)) * 31) + Float.hashCode(this.f38294c)) * 31) + Float.hashCode(this.f38295d);
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f38292a + ", focusedAlpha=" + this.f38293b + ", hoveredAlpha=" + this.f38294c + ", pressedAlpha=" + this.f38295d + ')';
    }
}
