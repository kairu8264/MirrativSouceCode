package aj;

import tj.f;
import tj.m;

/* loaded from: classes3.dex */
public class a extends f implements Cloneable {
    public float A;
    public float B;

    /* renamed from: w  reason: collision with root package name */
    public float f13294w;

    /* renamed from: x  reason: collision with root package name */
    public float f13295x;

    /* renamed from: y  reason: collision with root package name */
    public float f13296y;

    /* renamed from: z  reason: collision with root package name */
    public float f13297z;

    @Override // tj.f
    public void c(float f10, float f11, float f12, m mVar) {
        float f13;
        float f14;
        float f15 = this.f13296y;
        if (f15 == 0.0f) {
            mVar.m(f10, 0.0f);
            return;
        }
        float f16 = ((this.f13295x * 2.0f) + f15) / 2.0f;
        float f17 = f12 * this.f13294w;
        float f18 = f11 + this.A;
        float f19 = (this.f13297z * f12) + ((1.0f - f12) * f16);
        if (f19 / f16 >= 1.0f) {
            mVar.m(f10, 0.0f);
            return;
        }
        float f20 = this.B;
        float f21 = f20 * f12;
        boolean z10 = f20 == -1.0f || Math.abs((f20 * 2.0f) - f15) < 0.1f;
        if (z10) {
            f13 = f19;
            f14 = 0.0f;
        } else {
            f14 = 1.75f;
            f13 = 0.0f;
        }
        float f22 = f16 + f17;
        float f23 = f13 + f17;
        float sqrt = (float) Math.sqrt((f22 * f22) - (f23 * f23));
        float f24 = f18 - sqrt;
        float f25 = f18 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f23));
        float f26 = (90.0f - degrees) + f14;
        mVar.m(f24, 0.0f);
        float f27 = f17 * 2.0f;
        mVar.a(f24 - f17, 0.0f, f24 + f17, f27, 270.0f, degrees);
        if (z10) {
            mVar.a(f18 - f16, (-f16) - f13, f18 + f16, f16 - f13, 180.0f - f26, (f26 * 2.0f) - 180.0f);
        } else {
            float f28 = this.f13295x;
            float f29 = f21 * 2.0f;
            float f30 = f18 - f16;
            mVar.a(f30, -(f21 + f28), f30 + f28 + f29, f28 + f21, 180.0f - f26, ((f26 * 2.0f) - 180.0f) / 2.0f);
            float f31 = f18 + f16;
            float f32 = this.f13295x;
            mVar.m(f31 - ((f32 / 2.0f) + f21), f32 + f21);
            float f33 = this.f13295x;
            mVar.a(f31 - (f29 + f33), -(f21 + f33), f31, f33 + f21, 90.0f, f26 - 90.0f);
        }
        mVar.a(f25 - f17, 0.0f, f25 + f17, f27, 270.0f - degrees, degrees);
        mVar.m(f10, 0.0f);
    }

    public float e() {
        return this.f13297z;
    }

    public float f() {
        return this.B;
    }

    public float g() {
        return this.f13295x;
    }

    public float h() {
        return this.f13294w;
    }

    public float i() {
        return this.f13296y;
    }

    public void k(float f10) {
        if (f10 >= 0.0f) {
            this.f13297z = f10;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public void l(float f10) {
        this.B = f10;
    }

    public void m(float f10) {
        this.f13295x = f10;
    }

    public void n(float f10) {
        this.f13294w = f10;
    }

    public void o(float f10) {
        this.f13296y = f10;
    }

    public void q(float f10) {
        this.A = f10;
    }
}
