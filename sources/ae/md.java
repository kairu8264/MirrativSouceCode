package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class md extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final ConstraintLayout D;
    public final ConstraintLayout E;
    public final AppCompatTextView F;
    public final AppCompatImageView G;

    public md(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView3) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = constraintLayout;
        this.E = constraintLayout2;
        this.F = appCompatTextView;
        this.G = appCompatImageView3;
    }
}
