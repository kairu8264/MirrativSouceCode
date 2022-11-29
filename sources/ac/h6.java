package ac;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public abstract class h6 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatImageView C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;
    public final Guideline F;
    public final Guideline G;
    public final Guideline H;
    public final Guideline I;
    public final AppCompatImageView J;
    public final AppCompatTextView K;
    public final AppCompatTextView L;
    public final LottieAnimationView M;
    public final ConstraintLayout N;
    public final AppCompatTextView O;
    public cc.t0 P;

    public h6(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, LottieAnimationView lottieAnimationView, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView4) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatImageView;
        this.D = appCompatImageView2;
        this.E = appCompatTextView;
        this.F = guideline;
        this.G = guideline2;
        this.H = guideline3;
        this.I = guideline4;
        this.J = appCompatImageView3;
        this.K = appCompatTextView2;
        this.L = appCompatTextView3;
        this.M = lottieAnimationView;
        this.N = constraintLayout2;
        this.O = appCompatTextView4;
    }

    public abstract void T(cc.t0 t0Var);
}
