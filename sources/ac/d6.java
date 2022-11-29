package ac;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class d6 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatTextView C;

    public d6(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatTextView;
    }
}
