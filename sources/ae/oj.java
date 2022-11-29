package ae;

import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class oj extends ViewDataBinding {
    public final ConstraintLayout B;
    public final Space C;

    public oj(Object obj, View view, int i10, ConstraintLayout constraintLayout, Space space) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = space;
    }
}
