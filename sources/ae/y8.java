package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.TriangleView;

/* loaded from: classes2.dex */
public abstract class y8 extends ViewDataBinding {
    public final View B;
    public final ConstraintLayout C;
    public final View D;
    public final View E;
    public final AppCompatTextView F;
    public final TriangleView G;
    public final TriangleView H;

    public y8(Object obj, View view, int i10, View view2, ConstraintLayout constraintLayout, View view3, View view4, AppCompatTextView appCompatTextView, TriangleView triangleView, TriangleView triangleView2) {
        super(obj, view, i10);
        this.B = view2;
        this.C = constraintLayout;
        this.D = view3;
        this.E = view4;
        this.F = appCompatTextView;
        this.G = triangleView;
        this.H = triangleView2;
    }
}
