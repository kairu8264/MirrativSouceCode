package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.ShooterVictoryCountView;

/* loaded from: classes2.dex */
public abstract class km extends ViewDataBinding {
    public final View B;
    public final ConstraintLayout C;
    public final AppCompatImageView D;
    public final AppCompatImageView E;
    public final AppCompatTextView F;
    public final ConstraintLayout G;
    public final AppCompatTextView H;
    public final AppCompatImageView I;
    public final AppCompatTextView J;
    public final AppCompatTextView K;
    public final ConstraintLayout L;
    public final View M;
    public final AppCompatTextView N;
    public final AppCompatTextView O;
    public final ShooterVictoryCountView P;
    public final AppCompatImageView Q;
    public ud.m3 R;

    public km(Object obj, View view, int i10, View view2, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, ConstraintLayout constraintLayout3, View view3, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, ShooterVictoryCountView shooterVictoryCountView, AppCompatImageView appCompatImageView4) {
        super(obj, view, i10);
        this.B = view2;
        this.C = constraintLayout;
        this.D = appCompatImageView;
        this.E = appCompatImageView2;
        this.F = appCompatTextView;
        this.G = constraintLayout2;
        this.H = appCompatTextView2;
        this.I = appCompatImageView3;
        this.J = appCompatTextView3;
        this.K = appCompatTextView4;
        this.L = constraintLayout3;
        this.M = view3;
        this.N = appCompatTextView5;
        this.O = appCompatTextView6;
        this.P = shooterVictoryCountView;
        this.Q = appCompatImageView4;
    }

    public abstract void T(ud.m3 m3Var);
}
