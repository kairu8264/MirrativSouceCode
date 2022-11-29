package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class k0 implements j0 {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f14491a = new int[2];

    /* renamed from: b  reason: collision with root package name */
    public final float[] f14492b = c1.o0.c(null, 1, null);

    @Override // androidx.compose.ui.platform.j0
    public void a(View view, float[] fArr) {
        jo.p.h(view, "view");
        jo.p.h(fArr, "matrix");
        c1.o0.h(fArr);
        d(view, fArr);
    }

    public final void b(float[] fArr, Matrix matrix) {
        c1.g.b(this.f14492b, matrix);
        y.g(fArr, this.f14492b);
    }

    public final void c(float[] fArr, float f10, float f11) {
        c1.o0.h(this.f14492b);
        c1.o0.m(this.f14492b, f10, f11, 0.0f, 4, null);
        y.g(fArr, this.f14492b);
    }

    public final void d(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, fArr);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.f14491a;
            view.getLocationInWindow(iArr);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, iArr[0], iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        jo.p.g(matrix, "viewMatrix");
        b(fArr, matrix);
    }
}
