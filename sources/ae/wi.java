package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class wi extends ViewDataBinding {
    public final ConstraintLayout B;
    public final View C;
    public final AppCompatImageView D;
    public ud.a4 E;

    public wi(Object obj, View view, int i10, ConstraintLayout constraintLayout, View view2, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = view2;
        this.D = appCompatImageView;
    }

    public abstract void T(ud.a4 a4Var);
}
