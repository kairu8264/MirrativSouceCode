package s9;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class c extends ViewDataBinding {
    public final FrameLayout B;
    public final ConstraintLayout C;
    public final FrameLayout D;
    public final ConstraintLayout E;
    public final View F;
    public final ConstraintLayout G;

    public c(Object obj, View view, int i10, FrameLayout frameLayout, ConstraintLayout constraintLayout, FrameLayout frameLayout2, ConstraintLayout constraintLayout2, View view2, ConstraintLayout constraintLayout3) {
        super(obj, view, i10);
        this.B = frameLayout;
        this.C = constraintLayout;
        this.D = frameLayout2;
        this.E = constraintLayout2;
        this.F = view2;
        this.G = constraintLayout3;
    }
}
