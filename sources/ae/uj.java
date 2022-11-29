package ae;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class uj extends ViewDataBinding {
    public final ConstraintLayout B;
    public final RecyclerView C;
    public final View D;
    public ud.o1 E;

    public uj(Object obj, View view, int i10, ConstraintLayout constraintLayout, RecyclerView recyclerView, View view2) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = recyclerView;
        this.D = view2;
    }

    public abstract void T(ud.o1 o1Var);
}
