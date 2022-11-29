package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class yj extends ViewDataBinding {
    public final ConstraintLayout B;
    public final ConstraintLayout C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public ud.t1 G;

    public yj(Object obj, View view, int i10, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = constraintLayout2;
        this.D = appCompatTextView;
        this.E = appCompatTextView2;
        this.F = appCompatTextView3;
    }

    public abstract void T(ud.t1 t1Var);
}
