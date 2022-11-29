package s9;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes.dex */
public abstract class c1 extends ViewDataBinding {
    public final Barrier B;
    public final Space C;
    public final AppCompatImageView D;
    public final ConstraintLayout E;
    public final AppCompatTextView F;
    public final View G;
    public final ConstraintLayout H;
    public final View I;
    public final View J;
    public final View K;
    public final View L;
    public final AppCompatImageView M;
    public final ConstraintLayout N;
    public final AppCompatTextView O;
    public final AppCompatImageView P;
    public final AppCompatTextView Q;
    public final View R;
    public final AppCompatImageView S;
    public final RoundedButtonView T;
    public ud.q U;

    public c1(Object obj, View view, int i10, Barrier barrier, Space space, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, View view2, ConstraintLayout constraintLayout2, View view3, View view4, View view5, View view6, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout3, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView3, View view7, AppCompatImageView appCompatImageView4, RoundedButtonView roundedButtonView) {
        super(obj, view, i10);
        this.B = barrier;
        this.C = space;
        this.D = appCompatImageView;
        this.E = constraintLayout;
        this.F = appCompatTextView;
        this.G = view2;
        this.H = constraintLayout2;
        this.I = view3;
        this.J = view4;
        this.K = view5;
        this.L = view6;
        this.M = appCompatImageView2;
        this.N = constraintLayout3;
        this.O = appCompatTextView2;
        this.P = appCompatImageView3;
        this.Q = appCompatTextView3;
        this.R = view7;
        this.S = appCompatImageView4;
        this.T = roundedButtonView;
    }

    public abstract void T(ud.q qVar);
}
