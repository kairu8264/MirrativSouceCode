package ae;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class wf extends ViewDataBinding {
    public final View B;
    public final ConstraintLayout C;
    public final ConstraintLayout D;
    public final RecyclerView E;
    public ud.q1 F;

    public wf(Object obj, View view, int i10, View view2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.B = view2;
        this.C = constraintLayout;
        this.D = constraintLayout2;
        this.E = recyclerView;
    }

    public abstract void T(ud.q1 q1Var);
}
