package ae;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.TriangleView;

/* loaded from: classes2.dex */
public abstract class i9 extends ViewDataBinding {
    public final View B;
    public final View C;
    public final AppCompatTextView D;
    public final View E;
    public final AppCompatTextView F;
    public final LinearLayout G;
    public final AppCompatTextView H;
    public final View I;
    public final TriangleView J;
    public final TriangleView K;
    public ud.x L;

    public i9(Object obj, View view, int i10, View view2, View view3, AppCompatTextView appCompatTextView, View view4, AppCompatTextView appCompatTextView2, LinearLayout linearLayout, AppCompatTextView appCompatTextView3, View view5, TriangleView triangleView, TriangleView triangleView2) {
        super(obj, view, i10);
        this.B = view2;
        this.C = view3;
        this.D = appCompatTextView;
        this.E = view4;
        this.F = appCompatTextView2;
        this.G = linearLayout;
        this.H = appCompatTextView3;
        this.I = view5;
        this.J = triangleView;
        this.K = triangleView2;
    }

    public abstract void T(ud.x xVar);
}
