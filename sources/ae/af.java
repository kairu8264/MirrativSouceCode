package ae;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class af extends ViewDataBinding {
    public final ConstraintLayout B;
    public final RecyclerView C;
    public final ConstraintLayout D;

    public af(Object obj, View view, int i10, ConstraintLayout constraintLayout, RecyclerView recyclerView, ConstraintLayout constraintLayout2) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = recyclerView;
        this.D = constraintLayout2;
    }
}
