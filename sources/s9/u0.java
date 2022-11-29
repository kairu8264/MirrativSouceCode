package s9;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class u0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final View C;
    public final AppCompatTextView D;
    public final ConstraintLayout E;
    public final AppCompatImageView F;
    public z9.u G;

    public u0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, View view2, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = view2;
        this.D = appCompatTextView;
        this.E = constraintLayout;
        this.F = appCompatImageView2;
    }

    public abstract void T(z9.u uVar);
}
