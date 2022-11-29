package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.TriangleView;
import com.dena.mirrorman.widget.OutlineTextView;

/* loaded from: classes2.dex */
public abstract class g8 extends ViewDataBinding {
    public final View B;
    public final View C;
    public final OutlineTextView D;
    public final AppCompatTextView E;
    public final OutlineTextView F;
    public final AppCompatImageView G;
    public final OutlineTextView H;
    public final TriangleView I;
    public final TriangleView J;
    public final OutlineTextView K;

    public g8(Object obj, View view, int i10, View view2, View view3, OutlineTextView outlineTextView, AppCompatTextView appCompatTextView, OutlineTextView outlineTextView2, AppCompatImageView appCompatImageView, OutlineTextView outlineTextView3, TriangleView triangleView, TriangleView triangleView2, OutlineTextView outlineTextView4) {
        super(obj, view, i10);
        this.B = view2;
        this.C = view3;
        this.D = outlineTextView;
        this.E = appCompatTextView;
        this.F = outlineTextView2;
        this.G = appCompatImageView;
        this.H = outlineTextView3;
        this.I = triangleView;
        this.J = triangleView2;
        this.K = outlineTextView4;
    }
}
