package t8;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class i extends ViewDataBinding {
    public final ConstraintLayout B;

    public i(Object obj, View view, int i10, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.B = constraintLayout;
    }
}
