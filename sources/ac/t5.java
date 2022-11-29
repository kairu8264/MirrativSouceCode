package ac;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class t5 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final RoundedButtonView C;
    public final ae.m0 D;
    public final LinearLayout E;
    public final RoundedButtonView F;

    public t5(Object obj, View view, int i10, ConstraintLayout constraintLayout, RoundedButtonView roundedButtonView, ae.m0 m0Var, LinearLayout linearLayout, RoundedButtonView roundedButtonView2) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = roundedButtonView;
        this.D = m0Var;
        this.E = linearLayout;
        this.F = roundedButtonView2;
    }
}
