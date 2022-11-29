package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class kb extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;

    public kb(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatImageView;
        this.D = appCompatTextView;
    }
}
