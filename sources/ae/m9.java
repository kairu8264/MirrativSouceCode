package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class m9 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatTextView C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;

    public m9(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatTextView;
        this.D = appCompatImageView;
        this.E = appCompatTextView2;
    }
}
