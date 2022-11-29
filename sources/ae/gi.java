package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.GaugeView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.customview.ShooterVictoryCountView;

/* loaded from: classes2.dex */
public abstract class gi extends ViewDataBinding {
    public final AppCompatImageView B;
    public final RoundedButtonView C;
    public final View D;
    public final AppCompatImageView E;
    public final AppCompatTextView F;
    public final ConstraintLayout G;
    public final AppCompatImageView H;
    public final AppCompatTextView I;
    public final GaugeView J;
    public final AppCompatTextView K;
    public final View L;
    public final AppCompatImageView M;
    public final AppCompatImageView N;
    public final AppCompatTextView O;
    public final ConstraintLayout P;
    public final AppCompatTextView Q;
    public final ShooterVictoryCountView R;
    public final AppCompatImageView S;
    public ud.l3 T;

    public gi(Object obj, View view, int i10, AppCompatImageView appCompatImageView, RoundedButtonView roundedButtonView, View view2, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView2, GaugeView gaugeView, AppCompatTextView appCompatTextView3, View view3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, AppCompatTextView appCompatTextView4, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView5, ShooterVictoryCountView shooterVictoryCountView, AppCompatImageView appCompatImageView6) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = roundedButtonView;
        this.D = view2;
        this.E = appCompatImageView2;
        this.F = appCompatTextView;
        this.G = constraintLayout;
        this.H = appCompatImageView3;
        this.I = appCompatTextView2;
        this.J = gaugeView;
        this.K = appCompatTextView3;
        this.L = view3;
        this.M = appCompatImageView4;
        this.N = appCompatImageView5;
        this.O = appCompatTextView4;
        this.P = constraintLayout2;
        this.Q = appCompatTextView5;
        this.R = shooterVictoryCountView;
        this.S = appCompatImageView6;
    }

    public abstract void T(ud.l3 l3Var);
}
