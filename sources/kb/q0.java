package kb;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class q0 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;
    public final ImageView E;
    public final ConstraintLayout F;
    public final AppCompatImageView G;
    public final View H;

    public q0(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, ImageView imageView, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView2, View view2) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatImageView;
        this.D = appCompatTextView;
        this.E = imageView;
        this.F = constraintLayout2;
        this.G = appCompatImageView2;
        this.H = view2;
    }
}
