package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class i7 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatImageView C;

    public i7(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatImageView;
    }
}
