package u;

/* loaded from: classes.dex */
public final class n extends p {

    /* renamed from: a  reason: collision with root package name */
    public float f54075a;

    /* renamed from: b  reason: collision with root package name */
    public float f54076b;

    /* renamed from: c  reason: collision with root package name */
    public final int f54077c;

    public n(float f10, float f11) {
        super(null);
        this.f54075a = f10;
        this.f54076b = f11;
        this.f54077c = 2;
    }

    @Override // u.p
    public float a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return 0.0f;
            }
            return this.f54076b;
        }
        return this.f54075a;
    }

    @Override // u.p
    public int b() {
        return this.f54077c;
    }

    @Override // u.p
    public void d() {
        this.f54075a = 0.0f;
        this.f54076b = 0.0f;
    }

    @Override // u.p
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f54075a = f10;
        } else if (i10 != 1) {
        } else {
            this.f54076b = f10;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (nVar.f54075a == this.f54075a) {
                if (nVar.f54076b == this.f54076b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f() {
        return this.f54075a;
    }

    public final float g() {
        return this.f54076b;
    }

    @Override // u.p
    /* renamed from: h */
    public n c() {
        return new n(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.hashCode(this.f54075a) * 31) + Float.hashCode(this.f54076b);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f54075a + ", v2 = " + this.f54076b;
    }
}
