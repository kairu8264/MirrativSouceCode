package s9;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class y0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final ConstraintLayout D;
    public final AppCompatImageView E;
    public final ConstraintLayout F;
    public final ConstraintLayout G;
    public final AppCompatImageView H;
    public final AppCompatTextView I;
    public final AppCompatImageView J;
    public final AppCompatTextView K;
    public final ConstraintLayout L;
    public final AppCompatTextView M;
    public z9.c0 N;

    public y0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView3, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView5, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout4, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = constraintLayout;
        this.E = appCompatImageView3;
        this.F = constraintLayout2;
        this.G = constraintLayout3;
        this.H = appCompatImageView4;
        this.I = appCompatTextView;
        this.J = appCompatImageView5;
        this.K = appCompatTextView2;
        this.L = constraintLayout4;
        this.M = appCompatTextView3;
    }

    public abstract void T(z9.c0 c0Var);
}
