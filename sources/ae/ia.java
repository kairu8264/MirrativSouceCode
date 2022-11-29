package ae;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class ia extends ViewDataBinding {
    public final ConstraintLayout B;
    public final Guideline C;
    public final Guideline D;
    public final Guideline E;
    public final Guideline F;
    public final ConstraintLayout G;

    public ia(Object obj, View view, int i10, ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, ConstraintLayout constraintLayout2) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = guideline;
        this.D = guideline2;
        this.E = guideline3;
        this.F = guideline4;
        this.G = constraintLayout2;
    }
}
