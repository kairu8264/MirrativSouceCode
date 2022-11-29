package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class l0 implements j0 {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f14495a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final int[] f14496b = new int[2];

    @Override // androidx.compose.ui.platform.j0
    public void a(View view, float[] fArr) {
        jo.p.h(view, "view");
        jo.p.h(fArr, "matrix");
        this.f14495a.reset();
        view.transformMatrixToGlobal(this.f14495a);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = (View) parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.f14496b);
        int[] iArr = this.f14496b;
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f14496b;
        this.f14495a.postTranslate(iArr2[0] - i10, iArr2[1] - i11);
        c1.g.b(fArr, this.f14495a);
    }
}
