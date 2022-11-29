package g7;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public float f32822a;

    /* renamed from: b  reason: collision with root package name */
    public float f32823b;

    public d(float f10, float f11) {
        this.f32822a = f10;
        this.f32823b = f11;
    }

    public boolean a(float f10, float f11) {
        return this.f32822a == f10 && this.f32823b == f11;
    }

    public float b() {
        return this.f32822a;
    }

    public float c() {
        return this.f32823b;
    }

    public void d(float f10, float f11) {
        this.f32822a = f10;
        this.f32823b = f11;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public d() {
        this(1.0f, 1.0f);
    }
}
