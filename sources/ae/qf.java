package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.GaugeView;

/* loaded from: classes2.dex */
public abstract class qf extends ViewDataBinding {
    public final Guideline B;
    public final Guideline C;
    public final Guideline D;
    public final Guideline E;
    public final ConstraintLayout F;
    public final GaugeView G;
    public final AppCompatTextView H;
    public final View I;
    public final AppCompatImageView J;
    public final AppCompatImageView K;
    public final ConstraintLayout L;
    public final AppCompatTextView M;
    public ud.c1 N;

    public qf(Object obj, View view, int i10, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, ConstraintLayout constraintLayout, GaugeView gaugeView, AppCompatTextView appCompatTextView, View view2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = guideline;
        this.C = guideline2;
        this.D = guideline3;
        this.E = guideline4;
        this.F = constraintLayout;
        this.G = gaugeView;
        this.H = appCompatTextView;
        this.I = view2;
        this.J = appCompatImageView;
        this.K = appCompatImageView2;
        this.L = constraintLayout2;
        this.M = appCompatTextView2;
    }

    public abstract void T(ud.c1 c1Var);
}
