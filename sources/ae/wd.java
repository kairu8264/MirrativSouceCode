package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.MultipleStarView;

/* loaded from: classes2.dex */
public abstract class wd extends ViewDataBinding {
    public final AppCompatImageView B;
    public final MultipleStarView C;
    public final View D;
    public final ConstraintLayout E;
    public final AppCompatTextView F;
    public final ConstraintLayout G;
    public final AppCompatImageView H;
    public ud.d0 I;

    public wd(Object obj, View view, int i10, AppCompatImageView appCompatImageView, MultipleStarView multipleStarView, View view2, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = multipleStarView;
        this.D = view2;
        this.E = constraintLayout;
        this.F = appCompatTextView;
        this.G = constraintLayout2;
        this.H = appCompatImageView2;
    }

    public abstract void T(ud.d0 d0Var);
}
