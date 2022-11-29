package g5;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public class h0 extends g0 {
    @Override // g5.d0, g5.i0
    public float c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // g5.f0, g5.i0
    public void e(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // g5.d0, g5.i0
    public void f(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // g5.g0, g5.i0
    public void g(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // g5.e0, g5.i0
    public void h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // g5.e0, g5.i0
    public void i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
