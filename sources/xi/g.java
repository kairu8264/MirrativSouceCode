package xi;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* loaded from: classes3.dex */
public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f60307a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    public final float[] f60308b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f60309c = new Matrix();

    public Matrix a(float f10, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f60307a);
        matrix2.getValues(this.f60308b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f60308b;
            float f11 = fArr[i10];
            float[] fArr2 = this.f60307a;
            fArr[i10] = fArr2[i10] + ((f11 - fArr2[i10]) * f10);
        }
        this.f60309c.setValues(this.f60308b);
        return this.f60309c;
    }
}
