package ae;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.ShooterVictoryCountView;

/* loaded from: classes2.dex */
public abstract class oi extends ViewDataBinding {
    public final Guideline B;
    public final Guideline C;
    public final Guideline D;
    public final Guideline E;
    public final RecyclerView F;
    public final AppCompatImageView G;
    public final AppCompatImageView H;
    public final ConstraintLayout I;
    public final Space J;
    public final AppCompatImageView K;
    public final ConstraintLayout L;
    public final ConstraintLayout M;
    public final AppCompatImageView N;
    public final AppCompatTextView O;
    public final AppCompatTextView P;
    public final AppCompatImageView Q;
    public final AppCompatTextView R;
    public final AppCompatTextView S;
    public final ConstraintLayout T;
    public final View U;
    public final AppCompatTextView V;
    public final AppCompatTextView W;
    public final ShooterVictoryCountView X;
    public final AppCompatImageView Y;
    public ud.x3 Z;

    public oi(Object obj, View view, int i10, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, RecyclerView recyclerView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, Space space, AppCompatImageView appCompatImageView3, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView5, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, ConstraintLayout constraintLayout4, View view2, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, ShooterVictoryCountView shooterVictoryCountView, AppCompatImageView appCompatImageView6) {
        super(obj, view, i10);
        this.B = guideline;
        this.C = guideline2;
        this.D = guideline3;
        this.E = guideline4;
        this.F = recyclerView;
        this.G = appCompatImageView;
        this.H = appCompatImageView2;
        this.I = constraintLayout;
        this.J = space;
        this.K = appCompatImageView3;
        this.L = constraintLayout2;
        this.M = constraintLayout3;
        this.N = appCompatImageView4;
        this.O = appCompatTextView;
        this.P = appCompatTextView2;
        this.Q = appCompatImageView5;
        this.R = appCompatTextView3;
        this.S = appCompatTextView4;
        this.T = constraintLayout4;
        this.U = view2;
        this.V = appCompatTextView5;
        this.W = appCompatTextView6;
        this.X = shooterVictoryCountView;
        this.Y = appCompatImageView6;
    }

    public abstract void T(ud.x3 x3Var);
}
