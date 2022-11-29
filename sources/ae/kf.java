package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class kf extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;
    public final Guideline E;
    public final Guideline F;
    public final Guideline G;
    public final Guideline H;
    public final AppCompatImageView I;
    public final AppCompatTextView J;
    public final AppCompatTextView K;
    public ud.t0 L;

    public kf(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatImageView;
        this.D = appCompatTextView;
        this.E = guideline;
        this.F = guideline2;
        this.G = guideline3;
        this.H = guideline4;
        this.I = appCompatImageView2;
        this.J = appCompatTextView2;
        this.K = appCompatTextView3;
    }

    public abstract void T(ud.t0 t0Var);
}
