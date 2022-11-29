package sa;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class o extends ViewDataBinding {
    public final View B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;
    public final AppCompatImageView E;
    public final AppCompatTextView F;
    public final ConstraintLayout G;
    public final View H;

    public o(Object obj, View view, int i10, View view2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout, View view3) {
        super(obj, view, i10);
        this.B = view2;
        this.C = appCompatImageView;
        this.D = appCompatTextView;
        this.E = appCompatImageView2;
        this.F = appCompatTextView2;
        this.G = constraintLayout;
        this.H = view3;
    }
}
