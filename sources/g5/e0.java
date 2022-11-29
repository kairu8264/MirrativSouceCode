package g5;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public class e0 extends d0 {

    /* renamed from: f  reason: collision with root package name */
    public static boolean f32700f = true;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f32701g = true;

    @Override // g5.i0
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f32700f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f32700f = false;
            }
        }
    }

    @Override // g5.i0
    @SuppressLint({"NewApi"})
    public void i(View view, Matrix matrix) {
        if (f32701g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f32701g = false;
            }
        }
    }
}
