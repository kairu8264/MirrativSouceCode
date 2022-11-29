package ae;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.MultipleStarView;

/* loaded from: classes2.dex */
public abstract class of extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatImageView C;
    public final View D;
    public final AppCompatImageView E;
    public final AppCompatTextView F;
    public final ConstraintLayout G;
    public final Guideline H;
    public final Guideline I;
    public final Guideline J;
    public final Guideline K;
    public final AppCompatImageView L;
    public final Space M;
    public final AppCompatImageView N;
    public final MultipleStarView O;
    public final AppCompatTextView P;
    public final RecyclerView Q;
    public final AppCompatTextView R;
    public final ConstraintLayout S;
    public final AppCompatTextView T;
    public ud.v0 U;

    public of(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, View view2, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, AppCompatImageView appCompatImageView3, Space space, AppCompatImageView appCompatImageView4, MultipleStarView multipleStarView, AppCompatTextView appCompatTextView3, RecyclerView recyclerView, AppCompatTextView appCompatTextView4, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView5) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatImageView;
        this.D = view2;
        this.E = appCompatImageView2;
        this.F = appCompatTextView2;
        this.G = constraintLayout;
        this.H = guideline;
        this.I = guideline2;
        this.J = guideline3;
        this.K = guideline4;
        this.L = appCompatImageView3;
        this.M = space;
        this.N = appCompatImageView4;
        this.O = multipleStarView;
        this.P = appCompatTextView3;
        this.Q = recyclerView;
        this.R = appCompatTextView4;
        this.S = constraintLayout2;
        this.T = appCompatTextView5;
    }

    public abstract void T(ud.v0 v0Var);
}
