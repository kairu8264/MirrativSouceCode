package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.TriangleView;

/* loaded from: classes2.dex */
public abstract class sl extends ViewDataBinding {
    public final View B;
    public final View C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;
    public final View F;
    public final AppCompatTextView G;
    public final TriangleView H;
    public final TriangleView I;

    public sl(Object obj, View view, int i10, View view2, View view3, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, View view4, AppCompatTextView appCompatTextView2, TriangleView triangleView, TriangleView triangleView2) {
        super(obj, view, i10);
        this.B = view2;
        this.C = view3;
        this.D = appCompatImageView;
        this.E = appCompatTextView;
        this.F = view4;
        this.G = appCompatTextView2;
        this.H = triangleView;
        this.I = triangleView2;
    }
}
