package u;

/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: a  reason: collision with root package name */
    public float f54086a;

    /* renamed from: b  reason: collision with root package name */
    public float f54087b;

    /* renamed from: c  reason: collision with root package name */
    public float f54088c;

    /* renamed from: d  reason: collision with root package name */
    public float f54089d;

    /* renamed from: e  reason: collision with root package name */
    public final int f54090e;

    public o(float f10, float f11, float f12, float f13) {
        super(null);
        this.f54086a = f10;
        this.f54087b = f11;
        this.f54088c = f12;
        this.f54089d = f13;
        this.f54090e = 4;
    }

    @Override // u.p
    public float a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return 0.0f;
                    }
                    return this.f54089d;
                }
                return this.f54088c;
            }
            return this.f54087b;
        }
        return this.f54086a;
    }

    @Override // u.p
    public int b() {
        return this.f54090e;
    }

    @Override // u.p
    public void d() {
        this.f54086a = 0.0f;
        this.f54087b = 0.0f;
        this.f54088c = 0.0f;
        this.f54089d = 0.0f;
    }

    @Override // u.p
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f54086a = f10;
        } else if (i10 == 1) {
            this.f54087b = f10;
        } else if (i10 == 2) {
            this.f54088c = f10;
        } else if (i10 != 3) {
        } else {
            this.f54089d = f10;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (oVar.f54086a == this.f54086a) {
                if (oVar.f54087b == this.f54087b) {
                    if (oVar.f54088c == this.f54088c) {
                        if (oVar.f54089d == this.f54089d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final float f() {
        return this.f54086a;
    }

    public final float g() {
        return this.f54087b;
    }

    public final float h() {
        return this.f54088c;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f54086a) * 31) + Float.hashCode(this.f54087b)) * 31) + Float.hashCode(this.f54088c)) * 31) + Float.hashCode(this.f54089d);
    }

    public final float i() {
        return this.f54089d;
    }

    @Override // u.p
    /* renamed from: j */
    public o c() {
        return new o(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f54086a + ", v2 = " + this.f54087b + ", v3 = " + this.f54088c + ", v4 = " + this.f54089d;
    }
}
