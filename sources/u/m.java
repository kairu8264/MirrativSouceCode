package u;

/* loaded from: classes.dex */
public final class m extends p {

    /* renamed from: a  reason: collision with root package name */
    public float f54069a;

    /* renamed from: b  reason: collision with root package name */
    public final int f54070b;

    public m(float f10) {
        super(null);
        this.f54069a = f10;
        this.f54070b = 1;
    }

    @Override // u.p
    public float a(int i10) {
        if (i10 == 0) {
            return this.f54069a;
        }
        return 0.0f;
    }

    @Override // u.p
    public int b() {
        return this.f54070b;
    }

    @Override // u.p
    public void d() {
        this.f54069a = 0.0f;
    }

    @Override // u.p
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f54069a = f10;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            if (((m) obj).f54069a == this.f54069a) {
                return true;
            }
        }
        return false;
    }

    public final float f() {
        return this.f54069a;
    }

    @Override // u.p
    /* renamed from: g */
    public m c() {
        return new m(0.0f);
    }

    public int hashCode() {
        return Float.hashCode(this.f54069a);
    }

    public String toString() {
        return jo.p.o("AnimationVector1D: value = ", Float.valueOf(this.f54069a));
    }
}
