package pc;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class u0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final ConstraintLayout C;
    public final AppCompatTextView D;
    public final AppCompatImageView E;
    public final AppCompatButton F;
    public final AppCompatTextView G;
    public final View H;

    public u0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, AppCompatButton appCompatButton, AppCompatTextView appCompatTextView2, View view2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = constraintLayout;
        this.D = appCompatTextView;
        this.E = appCompatImageView2;
        this.F = appCompatButton;
        this.G = appCompatTextView2;
        this.H = view2;
    }
}
