package ac;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class r5 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatTextView C;
    public final View D;
    public final AppCompatTextView E;
    public final ConstraintLayout F;
    public final AppCompatImageView G;
    public final AppCompatTextView H;
    public final ConstraintLayout I;
    public final AppCompatImageView J;
    public final AppCompatTextView K;
    public lc.b L;

    public r5(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, View view2, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView3, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView4) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatTextView;
        this.D = view2;
        this.E = appCompatTextView2;
        this.F = constraintLayout;
        this.G = appCompatImageView2;
        this.H = appCompatTextView3;
        this.I = constraintLayout2;
        this.J = appCompatImageView3;
        this.K = appCompatTextView4;
    }

    public abstract void T(lc.b bVar);
}
