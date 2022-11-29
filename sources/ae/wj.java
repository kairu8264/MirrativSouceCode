package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class wj extends ViewDataBinding {
    public final ConstraintLayout B;
    public final ConstraintLayout C;
    public final ConstraintLayout D;
    public final AppCompatTextView E;
    public final ConstraintLayout F;
    public final ConstraintLayout G;
    public final RecyclerView H;
    public ud.p1 I;

    public wj(Object obj, View view, int i10, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = constraintLayout2;
        this.D = constraintLayout3;
        this.E = appCompatTextView;
        this.F = constraintLayout4;
        this.G = constraintLayout5;
        this.H = recyclerView;
    }

    public abstract void T(ud.p1 p1Var);
}
