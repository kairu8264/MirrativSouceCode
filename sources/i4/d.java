package i4;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f36323a;

    /* renamed from: b  reason: collision with root package name */
    public final float f36324b;

    public d(float[] fArr) {
        this.f36323a = fArr;
        this.f36324b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f36323a;
        int min = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f36324b;
        float f12 = (f10 - (min * f11)) / f11;
        float[] fArr2 = this.f36323a;
        return fArr2[min] + (f12 * (fArr2[min + 1] - fArr2[min]));
    }
}
