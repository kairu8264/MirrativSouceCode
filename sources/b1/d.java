package b1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public float f16717a;

    /* renamed from: b  reason: collision with root package name */
    public float f16718b;

    /* renamed from: c  reason: collision with root package name */
    public float f16719c;

    /* renamed from: d  reason: collision with root package name */
    public float f16720d;

    public d(float f10, float f11, float f12, float f13) {
        this.f16717a = f10;
        this.f16718b = f11;
        this.f16719c = f12;
        this.f16720d = f13;
    }

    public final float a() {
        return this.f16720d;
    }

    public final float b() {
        return this.f16717a;
    }

    public final float c() {
        return this.f16719c;
    }

    public final float d() {
        return this.f16718b;
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f16717a = Math.max(f10, this.f16717a);
        this.f16718b = Math.max(f11, this.f16718b);
        this.f16719c = Math.min(f12, this.f16719c);
        this.f16720d = Math.min(f13, this.f16720d);
    }

    public final boolean f() {
        return this.f16717a >= this.f16719c || this.f16718b >= this.f16720d;
    }

    public final void g(float f10, float f11, float f12, float f13) {
        this.f16717a = f10;
        this.f16718b = f11;
        this.f16719c = f12;
        this.f16720d = f13;
    }

    public final void h(float f10) {
        this.f16720d = f10;
    }

    public final void i(float f10) {
        this.f16717a = f10;
    }

    public final void j(float f10) {
        this.f16719c = f10;
    }

    public final void k(float f10) {
        this.f16718b = f10;
    }

    public String toString() {
        return "MutableRect(" + c.a(this.f16717a, 1) + ", " + c.a(this.f16718b, 1) + ", " + c.a(this.f16719c, 1) + ", " + c.a(this.f16720d, 1) + ')';
    }
}
