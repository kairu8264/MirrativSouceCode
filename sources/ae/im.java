package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class im extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatImageView C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;

    public im(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatImageView;
        this.D = appCompatImageView2;
        this.E = appCompatTextView;
    }
}
