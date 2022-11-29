package ae;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.TriangleView;

/* loaded from: classes2.dex */
public abstract class q8 extends ViewDataBinding {
    public final View B;
    public final View C;
    public final AppCompatTextView D;
    public final View E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final AppCompatTextView H;
    public final LinearLayout I;
    public final AppCompatTextView J;
    public final View K;
    public final TriangleView L;
    public final TriangleView M;
    public ud.b4 N;

    public q8(Object obj, View view, int i10, View view2, View view3, AppCompatTextView appCompatTextView, View view4, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, LinearLayout linearLayout, AppCompatTextView appCompatTextView5, View view5, TriangleView triangleView, TriangleView triangleView2) {
        super(obj, view, i10);
        this.B = view2;
        this.C = view3;
        this.D = appCompatTextView;
        this.E = view4;
        this.F = appCompatTextView2;
        this.G = appCompatTextView3;
        this.H = appCompatTextView4;
        this.I = linearLayout;
        this.J = appCompatTextView5;
        this.K = view5;
        this.L = triangleView;
        this.M = triangleView2;
    }

    public abstract void T(ud.b4 b4Var);
}
