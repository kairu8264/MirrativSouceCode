package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.YellRankIconView;

/* loaded from: classes2.dex */
public abstract class kg extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatImageView C;
    public final View D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final AppCompatImageView G;
    public final Guideline H;
    public final AppCompatImageView I;
    public final AppCompatTextView J;
    public final AppCompatTextView K;
    public final Guideline L;
    public final Guideline M;
    public final YellRankIconView N;
    public ud.y1 O;

    public kg(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, View view2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView2, Guideline guideline, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, Guideline guideline2, Guideline guideline3, YellRankIconView yellRankIconView) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatImageView;
        this.D = view2;
        this.E = appCompatTextView;
        this.F = appCompatTextView2;
        this.G = appCompatImageView2;
        this.H = guideline;
        this.I = appCompatImageView3;
        this.J = appCompatTextView3;
        this.K = appCompatTextView4;
        this.L = guideline2;
        this.M = guideline3;
        this.N = yellRankIconView;
    }

    public abstract void T(ud.y1 y1Var);
}
